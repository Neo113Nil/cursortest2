package com.google.firebase.messaging;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.room.Room;
import coil3.ComponentRegistry;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda1;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class TopicsSubscriber {
    public final Context context;
    public final FirebaseMessaging firebaseMessaging;
    public final Metadata metadata;
    public final GmsRpc rpc;
    public final TopicsStore store;
    public final ScheduledThreadPoolExecutor syncExecutor;
    public final ArrayMap pendingOperations = new ArrayMap(0);
    public boolean syncScheduledOrRunning = false;

    public TopicsSubscriber(FirebaseMessaging firebaseMessaging, Metadata metadata, TopicsStore topicsStore, GmsRpc gmsRpc, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.firebaseMessaging = firebaseMessaging;
        this.metadata = metadata;
        this.store = topicsStore;
        this.rpc = gmsRpc;
        this.context = context;
        this.syncExecutor = scheduledThreadPoolExecutor;
    }

    public static void awaitTask(Task task) {
        try {
            Room.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void blockingSubscribeToTopic(String str) {
        String blockingGetToken = this.firebaseMessaging.blockingGetToken();
        GmsRpc gmsRpc = this.rpc;
        gmsRpc.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        awaitTask(gmsRpc.extractResponseWhenComplete(gmsRpc.startRpc(blockingGetToken, "/topics/" + str, bundle)));
    }

    public final void blockingUnsubscribeFromTopic(String str) {
        String blockingGetToken = this.firebaseMessaging.blockingGetToken();
        GmsRpc gmsRpc = this.rpc;
        gmsRpc.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        awaitTask(gmsRpc.extractResponseWhenComplete(gmsRpc.startRpc(blockingGetToken, "/topics/" + str, bundle)));
    }

    public final zzw scheduleTopicOperation(TopicOperation topicOperation) {
        ArrayDeque arrayDeque;
        TopicsStore topicsStore = this.store;
        synchronized (topicsStore) {
            ComponentRegistry.Builder builder = topicsStore.topicOperationsQueue;
            String serialize = topicOperation.serialize();
            builder.getClass();
            if (!TextUtils.isEmpty(serialize) && !serialize.contains((String) builder.keyers)) {
                synchronized (((ArrayDeque) builder.lazyFetcherFactories)) {
                    if (((ArrayDeque) builder.lazyFetcherFactories).add(serialize)) {
                        ((ScheduledThreadPoolExecutor) builder.lazyDecoderFactories).execute(new KnotView$$ExternalSyntheticLambda1(builder, 11));
                    }
                }
            }
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.pendingOperations) {
            try {
                String serialize2 = topicOperation.serialize();
                if (this.pendingOperations.containsKey(serialize2)) {
                    arrayDeque = (ArrayDeque) this.pendingOperations.get(serialize2);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.pendingOperations.put(serialize2, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(taskCompletionSource);
            } catch (Throwable th) {
                throw th;
            }
        }
        return taskCompletionSource.zza;
    }

    public final synchronized void setSyncScheduledOrRunning(boolean z) {
        this.syncScheduledOrRunning = z;
    }

    public final void startTopicsSyncIfNecessary() {
        boolean z;
        if (this.store.getNextTopicOperation() != null) {
            synchronized (this) {
                z = this.syncScheduledOrRunning;
            }
            if (z) {
                return;
            }
            syncWithDelaySecondsInternal(0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a4 A[Catch: IOException -> 0x006b, TRY_LEAVE, TryCatch #4 {IOException -> 0x006b, blocks: (B:8:0x002c, B:13:0x009c, B:15:0x00a4, B:61:0x003d, B:63:0x0045, B:65:0x0054, B:66:0x006e, B:68:0x0076, B:70:0x0085), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean syncTopics() {
        TopicOperation nextTopicOperation;
        TopicsStore topicsStore;
        while (true) {
            synchronized (this) {
                try {
                    nextTopicOperation = this.store.getNextTopicOperation();
                    if (nextTopicOperation == null) {
                        break;
                    }
                } finally {
                }
            }
            try {
                String operation2 = nextTopicOperation.getOperation();
                int hashCode = operation2.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && operation2.equals("U")) {
                        blockingUnsubscribeFromTopic(nextTopicOperation.getTopic());
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Unsubscribe from topic: " + nextTopicOperation.getTopic() + " succeeded.");
                        }
                        topicsStore = this.store;
                        synchronized (topicsStore) {
                            ComponentRegistry.Builder builder = topicsStore.topicOperationsQueue;
                            String serialize = nextTopicOperation.serialize();
                            synchronized (((ArrayDeque) builder.lazyFetcherFactories)) {
                                if (((ArrayDeque) builder.lazyFetcherFactories).remove(serialize)) {
                                    ((ScheduledThreadPoolExecutor) builder.lazyDecoderFactories).execute(new KnotView$$ExternalSyntheticLambda1(builder, 11));
                                }
                            }
                        }
                        synchronized (this.pendingOperations) {
                            try {
                                String serialize2 = nextTopicOperation.serialize();
                                if (this.pendingOperations.containsKey(serialize2)) {
                                    ArrayDeque arrayDeque = (ArrayDeque) this.pendingOperations.get(serialize2);
                                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                                    if (taskCompletionSource != null) {
                                        taskCompletionSource.setResult(null);
                                    }
                                    if (arrayDeque.isEmpty()) {
                                        this.pendingOperations.remove(serialize2);
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Unknown topic operation" + nextTopicOperation + ".");
                    }
                    topicsStore = this.store;
                    synchronized (topicsStore) {
                    }
                } else {
                    if (operation2.equals("S")) {
                        blockingSubscribeToTopic(nextTopicOperation.getTopic());
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Subscribe to topic: " + nextTopicOperation.getTopic() + " succeeded.");
                        }
                        topicsStore = this.store;
                        synchronized (topicsStore) {
                        }
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                    }
                    topicsStore = this.store;
                    synchronized (topicsStore) {
                    }
                }
            } catch (IOException e) {
                if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e.getMessage())) {
                    if (e.getMessage() != null) {
                        throw e;
                    }
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    return false;
                }
                Log.e("FirebaseMessaging", "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
                return false;
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "topic sync succeeded");
        }
        return true;
    }

    public final void syncWithDelaySecondsInternal(long j) {
        this.syncExecutor.schedule(new TopicsSyncTask(this, this.context, this.metadata, Math.min(Math.max(30L, 2 * j), 28800L)), j, TimeUnit.SECONDS);
        setSyncScheduledOrRunning(true);
    }
}
