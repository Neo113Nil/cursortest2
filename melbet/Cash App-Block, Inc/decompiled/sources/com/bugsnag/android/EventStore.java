package com.bugsnag.android;

import com.bugsnag.android.DeviceIdStore;
import com.bugsnag.android.JsonStream;
import com.bugsnag.android.internal.BackgroundTaskService;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.TaskType;
import java.io.File;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class EventStore extends FileStore {
    public final BackgroundTaskService bgTaskService;
    public final CallbackState callbackState;
    public final ImmutableConfig config;
    public boolean isEmptyEventCallbackCalled;
    public final Logger logger;
    public final Notifier notifier;
    public Function1 onDiscardEventCallback;
    public Function0 onEventStoreEmptyCallback;

    public EventStore(ImmutableConfig immutableConfig, Logger logger, Notifier notifier, BackgroundTaskService backgroundTaskService, EventStorageModule$special$$inlined$provider$1 eventStorageModule$special$$inlined$provider$1, CallbackState callbackState) {
        super(new File((File) immutableConfig.persistenceDirectory.getValue(), "bugsnag/errors"), immutableConfig.maxPersistedEvents, logger, eventStorageModule$special$$inlined$provider$1);
        this.config = immutableConfig;
        this.onEventStoreEmptyCallback = DeviceIdStore.AnonymousClass1.INSTANCE$2;
        this.onDiscardEventCallback = EventStore$onDiscardEventCallback$1.INSTANCE;
        this.logger = logger;
        this.notifier = notifier;
        this.bgTaskService = backgroundTaskService;
        this.callbackState = callbackState;
    }

    public final EventPayload createEventPayload(File file, String str) {
        str.getClass();
        Logger logger = this.logger;
        MarshalledEventSource marshalledEventSource = new MarshalledEventSource(file, str, logger);
        try {
            CallbackState callbackState = this.callbackState;
            if (!callbackState.onSendTasks.isEmpty()) {
                callbackState.runOnSendTasks((Event) marshalledEventSource.invoke(), logger);
            }
        } catch (Exception e) {
            logger.w("could not parse event payload", e);
            marshalledEventSource.clear();
        }
        Event event = marshalledEventSource.getEvent();
        return event != null ? new EventPayload(event.impl.apiKey, event, null, this.notifier, this.config) : new EventPayload(str, null, file, this.notifier, this.config);
    }

    public final void deliverEventPayload(File file, EventPayload eventPayload) {
        ImmutableConfig immutableConfig = this.config;
        int ordinal = immutableConfig.delivery.deliver(eventPayload, immutableConfig.getErrorApiDeliveryParams(eventPayload)).ordinal();
        Logger logger = this.logger;
        if (ordinal == 0) {
            deleteStoredFiles(SetsKt__SetsJVMKt.setOf(file));
            logger.i("Deleting sent error file " + file + ".name");
            return;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            RuntimeException runtimeException = new RuntimeException("Failed to deliver event payload");
            String message = runtimeException.getMessage();
            if (message == null) {
                message = "Failed to send event";
            }
            logger.e(message, runtimeException);
            deleteStoredFiles(SetsKt__SetsJVMKt.setOf(file));
            return;
        }
        if (file.length() > 1048576) {
            logger.w("Discarding over-sized event (" + file.length() + ") after failed delivery");
            this.onDiscardEventCallback.invoke(new EventPayload(UnknownConnectivity.fromFile(file, immutableConfig).getApiKey(), null, file, this.notifier, this.config));
            deleteStoredFiles(SetsKt__SetsJVMKt.setOf(file));
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -60);
        if (UnknownConnectivity.findTimestampInFilename(file) >= calendar.getTimeInMillis()) {
            cancelQueuedFiles(SetsKt__SetsJVMKt.setOf(file));
            logger.w("Could not send previously saved error(s) to Bugsnag, will try again later");
            return;
        }
        logger.w("Discarding historical event (from " + new Date(UnknownConnectivity.findTimestampInFilename(file)) + ") after failed delivery");
        this.onDiscardEventCallback.invoke(new EventPayload(UnknownConnectivity.fromFile(file, immutableConfig).getApiKey(), null, file, this.notifier, this.config));
        deleteStoredFiles(SetsKt__SetsJVMKt.setOf(file));
    }

    public final void flushAsync() {
        try {
            this.bgTaskService.submitTask(TaskType.ERROR_REQUEST, new EventStore$$ExternalSyntheticLambda2(this, 1));
        } catch (RejectedExecutionException unused) {
            this.logger.w("Failed to flush all on-disk errors, retaining unsent errors for later.");
        }
    }

    public final void flushEventFile(File file) {
        try {
            deliverEventPayload(file, createEventPayload(file, UnknownConnectivity.fromFile(file, this.config).component1()));
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Failed to send event";
            }
            this.logger.e(message, e);
            deleteStoredFiles(SetsKt__SetsJVMKt.setOf(file));
        }
    }

    public final void flushReports(Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        this.logger.i("Sending " + collection.size() + " saved error(s) to Bugsnag");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            flushEventFile((File) it.next());
        }
    }

    @Override // com.bugsnag.android.FileStore
    public final String getFilename(JsonStream.Streamable streamable) {
        return UnknownConnectivity.fromEvent$default(streamable, null, this.config).encode();
    }

    @Override // com.bugsnag.android.FileStore
    public final Logger getLogger() {
        return this.logger;
    }

    public final void notifyEventQueueEmpty() {
        if (this.queuedFiles.isEmpty()) {
            String[] list = this.storageDir.list();
            if ((list == null || list.length == 0) && !this.isEmptyEventCallbackCalled) {
                this.onEventStoreEmptyCallback.invoke();
                this.isEmptyEventCallbackCalled = true;
            }
        }
    }
}
