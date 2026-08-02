package com.bugsnag.android;

import android.os.Handler;
import android.os.Looper;
import com.appsflyer.AFLogger$$ExternalSyntheticLambda0;
import com.google.mlkit.common.sdkinternal.zzn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\u000b\u001a\u00020\fH\u0082 J\t\u0010\r\u001a\u00020\fH\u0082 J\b\u0010\u000e\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0016\u0010\u0014\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0011\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0082 J\b\u0010\u001c\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/bugsnag/android/AnrPlugin;", "Lcom/bugsnag/android/Plugin;", "()V", "client", "Lcom/bugsnag/android/Client;", "collector", "Lcom/bugsnag/android/AnrDetailsCollector;", "libraryLoader", "Lcom/bugsnag/android/LibraryLoader;", "oneTimeSetupPerformed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "disableAnrReporting", "", "enableAnrReporting", "initNativePlugin", "load", "loadClass", "Ljava/lang/Class;", "clz", "", "notifyAnrDetected", "nativeTrace", "", "Lcom/bugsnag/android/NativeStackframe;", "performOneTimeSetup", "setUnwindFunction", "unwindFunction", "", "unload", "Companion", "bugsnag-plugin-android-anr_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnrPlugin implements Plugin {
    private static final String ANR_ERROR_CLASS = "ANR";
    private static final String ANR_ERROR_MSG = "Application did not respond to UI input";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final String LOAD_ERR_MSG = "Native library could not be linked. Bugsnag will not report ANRs. See https://docs.bugsnag.com/platforms/android/anr-link-errors";
    private Client client;
    private final LibraryLoader libraryLoader = new LibraryLoader();
    private final AtomicBoolean oneTimeSetupPerformed = new AtomicBoolean(false);
    private final AnrDetailsCollector collector = new AnrDetailsCollector();

    public final class Companion {
    }

    private final native void disableAnrReporting();

    private final native void enableAnrReporting();

    /* JADX INFO: Access modifiers changed from: private */
    public final void initNativePlugin() {
        enableAnrReporting();
        Client client = this.client;
        if (client != null) {
            client.logger.i("Initialised ANR Plugin");
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("client");
            throw null;
        }
    }

    private final Class<?> loadClass(String clz) {
        try {
            return Class.forName(clz);
        } catch (Throwable unused) {
            return null;
        }
    }

    private final void notifyAnrDetected(List<NativeStackframe> nativeTrace) {
        Object obj;
        ArrayList arrayList;
        try {
            Client client = this.client;
            if (client == null) {
                Intrinsics.throwUninitializedPropertyAccessException("client");
                throw null;
            }
            if (client.immutableConfig.shouldDiscardByErrorClass$bugsnag_android_core_release(ANR_ERROR_CLASS)) {
                return;
            }
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            INSTANCE.getClass();
            boolean isNativeMethod = stackTrace.length == 0 ? false : ((StackTraceElement) ArraysKt___ArraysKt.first(stackTrace)).isNativeMethod();
            RuntimeException runtimeException = new RuntimeException();
            runtimeException.setStackTrace(stackTrace);
            Client client2 = this.client;
            if (client2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("client");
                throw null;
            }
            Event createEvent = NativeInterface.createEvent(runtimeException, client2, SeverityReason.newInstance(null, "anrError", null));
            Error error = (Error) createEvent.impl.errors.get(0);
            error.setErrorClass(ANR_ERROR_CLASS);
            ErrorInternal errorInternal = error.impl;
            errorInternal.errorMessage = ANR_ERROR_MSG;
            if (isNativeMethod) {
                List<NativeStackframe> list = nativeTrace;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new Stackframe((NativeStackframe) it.next()));
                }
                errorInternal.stacktrace.addAll(0, arrayList2);
                Iterator it2 = createEvent.impl.threads.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it2.next();
                        if (((Thread) obj).impl.isErrorReportingThread) {
                            break;
                        }
                    }
                }
                Thread thread = (Thread) obj;
                if (thread != null && (arrayList = thread.impl.stacktrace) != null) {
                    arrayList.addAll(0, arrayList2);
                }
            }
            AnrDetailsCollector anrDetailsCollector = this.collector;
            Client client3 = this.client;
            if (client3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("client");
                throw null;
            }
            anrDetailsCollector.getClass();
            Handler handler = new Handler(anrDetailsCollector.handlerThread.getLooper());
            handler.post(new zzn(anrDetailsCollector, client3, new AtomicInteger(), handler, createEvent, 1));
        } catch (Exception e) {
            Client client4 = this.client;
            if (client4 != null) {
                client4.logger.e("Internal error reporting ANR", e);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("client");
                throw null;
            }
        }
    }

    private final void performOneTimeSetup(Client client) {
        Class<?> loadClass;
        Object obj;
        if (!this.libraryLoader.loadLibrary("bugsnag-plugin-android-anr", client, new AnrPlugin$$ExternalSyntheticLambda0(0)) || (loadClass = loadClass("com.bugsnag.android.NdkPlugin")) == null) {
            return;
        }
        Iterator it = ((Set) client.pluginClient.keyers).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Plugin) obj).getClass().equals(loadClass)) {
                    break;
                }
            }
        }
        Plugin plugin = (Plugin) obj;
        if (plugin != null) {
            Object invoke = plugin.getClass().getMethod("getSignalUnwindStackFunction", null).invoke(plugin, null);
            invoke.getClass();
            setUnwindFunction(((Long) invoke).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean performOneTimeSetup$lambda$1(Event event) {
        Error error = (Error) event.impl.errors.get(0);
        event.addMetadata("LinkError", "errorClass", error.impl.errorClass);
        ErrorInternal errorInternal = error.impl;
        event.addMetadata("LinkError", "errorMessage", errorInternal.errorMessage);
        error.setErrorClass("AnrLinkError");
        errorInternal.errorMessage = LOAD_ERR_MSG;
        return true;
    }

    private final native void setUnwindFunction(long unwindFunction);

    @Override // com.bugsnag.android.Plugin
    public void load(Client client) {
        this.client = client;
        if (!this.oneTimeSetupPerformed.getAndSet(true)) {
            performOneTimeSetup(client);
        }
        if (!this.libraryLoader.loaded) {
            client.logger.e(LOAD_ERR_MSG);
            return;
        }
        Looper mainLooper = Looper.getMainLooper();
        if (Intrinsics.areEqual(Looper.myLooper(), mainLooper)) {
            initNativePlugin();
        } else {
            new Handler(mainLooper).postAtFrontOfQueue(new AFLogger$$ExternalSyntheticLambda0(this, 11));
        }
    }

    @Override // com.bugsnag.android.Plugin
    public void unload() {
        if (this.libraryLoader.loaded) {
            disableAnrReporting();
        }
    }
}
