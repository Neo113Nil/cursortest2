package com.bugsnag.android;

import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ComponentRegistry;
import com.bugsnag.android.StateEvent;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.JsonCollectionParser;
import com.bugsnag.android.internal.StateObserver;
import com.bugsnag.android.internal.dag.Provider;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import kotlin.text.Charsets;
import okio.Utf8;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public class NativeInterface {
    private static Charset UTF8Charset = Charset.defaultCharset();
    private static Client client;

    public static void addMetadata(String str, Map<String, ?> map) {
        Client client2 = getClient();
        client2.getClass();
        if (str == null || map == null) {
            client2.logNull("addMetadata");
            return;
        }
        MetadataState metadataState = client2.metadataState;
        Metadata metadata = metadataState.metadata;
        metadata.addMetadata(str, map);
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!metadataState.getObservers$bugsnag_android_core_release().isEmpty()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getKey();
                Map map2 = (Map) metadata.store.get(str);
                StateEvent.AddMetadata addMetadata = new StateEvent.AddMetadata(str, str2, map2 != null ? map2.get(str3) : null);
                Iterator<T> it2 = metadataState.getObservers$bugsnag_android_core_release().iterator();
                while (it2.hasNext()) {
                    ((StateObserver) it2.next()).onStateChange(addMetadata);
                }
            }
        }
    }

    public static void clearMetadata(String str, String str2) {
        if (str2 == null) {
            Client client2 = getClient();
            if (str == null) {
                client2.logNull("clearMetadata");
                return;
            }
            MetadataState metadataState = client2.metadataState;
            metadataState.metadata.store.remove(str);
            metadataState.notifyClear(str, null);
            return;
        }
        Client client3 = getClient();
        client3.getClass();
        if (str == null) {
            client3.logNull("clearMetadata");
            return;
        }
        MetadataState metadataState2 = client3.metadataState;
        Map map = metadataState2.metadata.store;
        Map map2 = (Map) map.get(str);
        if (map2 != null) {
            map2.remove(str2);
        }
        if (map2 == null || map2.isEmpty()) {
            map.remove(str);
        }
        metadataState2.notifyClear(str, str2);
    }

    public static Event createEmptyEvent() {
        Client client2 = getClient();
        return new Event(new EventInternal(null, client2.immutableConfig, SeverityReason.newInstance(null, "handledException", null), client2.metadataState.metadata.copy(), null, 112), client2.logger);
    }

    public static Event createEvent(Throwable th, Client client2, SeverityReason severityReason) {
        return new Event(th, client2.immutableConfig, severityReason, client2.metadataState.metadata, client2.featureFlagState.featureFlags, client2.logger);
    }

    private static void deepMerge(Map<String, Object> map, Map<String, Object> map2) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            Object obj = map2.get(key);
            if ((value instanceof Map) && (obj instanceof Map)) {
                deepMerge((Map) value, (Map) obj);
            } else if ((value instanceof Collection) && (obj instanceof Collection)) {
                ((Collection) obj).addAll((Collection) value);
            } else {
                map2.put(key, value);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void deliverReport(byte[] bArr, byte[] bArr2, byte[] bArr3, String str, boolean z) {
        BufferedWriter bufferedWriter;
        Exception e;
        StringBuilder sb;
        InternalReportDelegate internalReportDelegate;
        if (bArr3 != null) {
            Serializable parse = new JsonCollectionParser(new ByteArrayInputStream(bArr2)).parse();
            if (!(parse instanceof Map)) {
                a$$ExternalSyntheticBUOutline0.m$3("Expected JSON object at root level");
                return;
            }
            Map map = (Map) parse;
            Serializable parse2 = new JsonCollectionParser(new ByteArrayInputStream(bArr3)).parse();
            if (!(parse2 instanceof Map)) {
                a$$ExternalSyntheticBUOutline0.m$3("Expected JSON object at root level");
                return;
            }
            deepMerge((Map) parse2, map);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, Charsets.UTF_8), PKIFailureInfo.certRevoked);
            try {
                JsonStream jsonStream = new JsonStream(bufferedWriter2);
                try {
                    jsonStream.value(map);
                    jsonStream.close();
                    bufferedWriter2.close();
                    bArr2 = byteArrayOutputStream.toByteArray();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    Utf8.closeFinally(bufferedWriter2, th);
                    throw th2;
                }
            }
        }
        String str2 = new String(bArr2, UTF8Charset);
        BufferedWriter bufferedWriter3 = null;
        String str3 = bArr == null ? null : new String(bArr, UTF8Charset);
        Client client2 = getClient();
        ImmutableConfig immutableConfig = client2.immutableConfig;
        if (str3 != null && str3.length() != 0) {
            immutableConfig.getClass();
        }
        EventStore eventStore = (EventStore) client2.eventStore.get();
        ImmutableConfig immutableConfig2 = eventStore.config;
        Logger logger = eventStore.logger;
        String encode = UnknownConnectivity.fromEvent$default(str2, str, immutableConfig2).encode();
        if (z) {
            encode = encode.replace(".json", "startupcrash.json");
        }
        ReentrantLock reentrantLock = eventStore.lock;
        File file = eventStore.storageDir;
        if (eventStore.isStorageDirValid(file)) {
            eventStore.discardOldestFileIfNeeded();
            reentrantLock.lock();
            String absolutePath = new File(file, encode).getAbsolutePath();
            try {
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(absolutePath), "UTF-8"));
                try {
                    try {
                        bufferedWriter.write(str2);
                    } catch (Exception e2) {
                        e = e2;
                        File file2 = new File(absolutePath);
                        Provider provider = eventStore.delegate;
                        if (provider != null && (internalReportDelegate = (InternalReportDelegate) provider.getOrNull()) != null) {
                            internalReportDelegate.onErrorIOFailure(e, file2, "NDK Crash report copy");
                        }
                        IOUtils.deleteFile(file2, logger);
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                            } catch (Exception e3) {
                                e = e3;
                                sb = new StringBuilder("Failed to close unsent payload writer: ");
                                sb.append(encode);
                                logger.w(sb.toString(), e);
                                reentrantLock.unlock();
                            }
                        }
                        reentrantLock.unlock();
                    }
                    try {
                        bufferedWriter.close();
                    } catch (Exception e4) {
                        e = e4;
                        sb = new StringBuilder("Failed to close unsent payload writer: ");
                        sb.append(encode);
                        logger.w(sb.toString(), e);
                        reentrantLock.unlock();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedWriter3 = bufferedWriter;
                    if (bufferedWriter3 != null) {
                        try {
                            bufferedWriter3.close();
                        } catch (Exception e5) {
                            logger.w("Failed to close unsent payload writer: " + encode, e5);
                        }
                    }
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (Exception e6) {
                bufferedWriter = null;
                e = e6;
            } catch (Throwable th4) {
                th = th4;
                if (bufferedWriter3 != null) {
                }
                reentrantLock.unlock();
                throw th;
            }
            reentrantLock.unlock();
        }
    }

    public static Map<String, Object> getApp() {
        AppDataCollector appDataCollector = getClient().appDataCollector;
        AppWithState generateAppWithState = appDataCollector.generateAppWithState();
        Provider provider = generateAppWithState.buildUuidProvider;
        String str = (provider == null || !provider.isComplete()) ? null : (String) provider.getOrNull();
        HashMap hashMap = new HashMap();
        hashMap.put("version", generateAppWithState.version);
        hashMap.put("releaseStage", generateAppWithState.releaseStage);
        hashMap.put("id", generateAppWithState.id);
        hashMap.put("type", generateAppWithState.f936type);
        hashMap.put("buildUUID", str);
        hashMap.put("duration", generateAppWithState.duration);
        hashMap.put("durationInForeground", generateAppWithState.durationInForeground);
        hashMap.put("versionCode", generateAppWithState.versionCode);
        hashMap.put("inForeground", generateAppWithState.inForeground);
        hashMap.put("isLaunching", generateAppWithState.isLaunching);
        hashMap.put("binaryArch", generateAppWithState.binaryArch);
        hashMap.putAll(appDataCollector.getAppDataMetadata());
        return hashMap;
    }

    public static String getAppVersion() {
        getClient().immutableConfig.getClass();
        return null;
    }

    public static List<Breadcrumb> getBreadcrumbs() {
        return getClient().breadcrumbState.copy();
    }

    private static Client getClient() {
        Client client2 = client;
        return client2 != null ? client2 : Bugsnag.getClient();
    }

    public static String getContext() {
        ContextState contextState = getClient().contextState;
        String str = contextState.automaticContext;
        if (str == "__BUGSNAG_MANUAL_CONTEXT__") {
            str = null;
        }
        return str == null ? contextState.manualContext : str;
    }

    public static String[] getCpuAbi() {
        String[] strArr = (String[]) getClient().deviceDataCollector.buildInfo.cpuAbis;
        return strArr == null ? new String[0] : strArr;
    }

    public static Session getCurrentSession() {
        Session session = getClient().sessionTracker.currentSession;
        if (session == null || session.isPaused.get()) {
            return null;
        }
        return session;
    }

    public static Map<String, Object> getDevice() {
        DeviceDataCollector deviceDataCollector = getClient().deviceDataCollector;
        HashMap hashMap = new HashMap(deviceDataCollector.getDeviceMetadata());
        DeviceWithState generateDeviceWithState = deviceDataCollector.generateDeviceWithState(new Date().getTime());
        hashMap.put("freeDisk", generateDeviceWithState.freeDisk);
        hashMap.put("freeMemory", generateDeviceWithState.freeMemory);
        hashMap.put("orientation", generateDeviceWithState.orientation);
        hashMap.put("time", generateDeviceWithState.time);
        hashMap.put("cpuAbi", generateDeviceWithState.cpuAbi);
        hashMap.put("jailbroken", generateDeviceWithState.jailbroken);
        hashMap.put("id", generateDeviceWithState.id);
        hashMap.put("locale", generateDeviceWithState.locale);
        hashMap.put("manufacturer", generateDeviceWithState.manufacturer);
        hashMap.put("model", generateDeviceWithState.model);
        hashMap.put("osName", "android");
        hashMap.put("osVersion", generateDeviceWithState.osVersion);
        hashMap.put("runtimeVersions", generateDeviceWithState.runtimeVersions);
        hashMap.put("totalMemory", generateDeviceWithState.totalMemory);
        return hashMap;
    }

    public static Collection<String> getEnabledReleaseStages() {
        getClient().immutableConfig.getClass();
        return null;
    }

    public static String getEndpoint() {
        return getClient().immutableConfig.endpoints.notify;
    }

    public static LastRunInfo getLastRunInfo() {
        return getClient().lastRunInfo;
    }

    public static Logger getLogger() {
        return getClient().immutableConfig.logger;
    }

    public static Map<String, Object> getMetadata() {
        return getClient().metadataState.metadata.toMap();
    }

    public static File getNativeReportPath() {
        return getNativeReportPath(getPersistenceDirectory());
    }

    private static File getPersistenceDirectory() {
        return (File) getClient().immutableConfig.persistenceDirectory.getValue();
    }

    public static String getReleaseStage() {
        return getClient().immutableConfig.releaseStage;
    }

    public static String getSessionEndpoint() {
        return getClient().immutableConfig.endpoints.sessions;
    }

    public static Map<String, String> getUser() {
        HashMap hashMap = new HashMap();
        User user = ((UserState) getClient().userState.get()).user;
        hashMap.put("id", user.id);
        hashMap.put("name", user.name);
        hashMap.put("email", user.email);
        return hashMap;
    }

    public static boolean isDiscardErrorClass(String str) {
        Collection collection = getClient().immutableConfig.discardClasses;
        if (collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((Pattern) it.next()).matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    public static void leaveBreadcrumb(byte[] bArr, BreadcrumbType breadcrumbType) {
        if (bArr == null) {
            return;
        }
        getClient().leaveBreadcrumb(breadcrumbType, new String(bArr, UTF8Charset), new HashMap());
    }

    public static void markLaunchCompleted() {
        getClient().launchCrashTracker.markLaunchCompleted();
    }

    public static void notify(String str, String str2, Severity severity, NativeStackframe[] nativeStackframeArr) {
        Client client2 = getClient();
        if (client2.immutableConfig.shouldDiscardByErrorClass$bugsnag_android_core_release(str)) {
            return;
        }
        Event createEmptyEvent = createEmptyEvent();
        EventInternal eventInternal = createEmptyEvent.impl;
        SeverityReason severityReason = eventInternal.severityReason;
        String str3 = severityReason.severityReasonType;
        boolean z = severityReason.unhandled;
        eventInternal.severityReason = new SeverityReason(str3, severity, z, z != severityReason.originalUnhandled, severityReason.attributeValue, severityReason.attributeKey);
        ArrayList arrayList = new ArrayList(nativeStackframeArr.length);
        for (NativeStackframe nativeStackframe : nativeStackframeArr) {
            arrayList.add(new Stackframe(nativeStackframe));
        }
        createEmptyEvent.impl.errors.add(new Error(new ErrorInternal(str, str2, new Stacktrace(arrayList), ErrorType.C), client2.logger));
        getClient().populateAndNotifyAndroidEvent(createEmptyEvent, null);
    }

    public static void pauseSession() {
        SessionTracker sessionTracker = getClient().sessionTracker;
        Session session = sessionTracker.currentSession;
        if (session != null) {
            session.isPaused.set(true);
            sessionTracker.updateState(StateEvent.PauseSession.INSTANCE);
        }
    }

    public static void registerSession(long j, String str, int i, int i2) {
        Client client2 = getClient();
        User user = ((UserState) client2.userState.get()).user;
        Session session = null;
        Date date = j > 0 ? new Date(j) : null;
        SessionTracker sessionTracker = client2.sessionTracker;
        sessionTracker.client.immutableConfig.getClass();
        if (date == null || str == null) {
            sessionTracker.updateState(StateEvent.PauseSession.INSTANCE);
        } else {
            session = new Session(str, date, user, i, i2, sessionTracker.client.notifier, sessionTracker.logger, sessionTracker.configuration.apiKey);
            sessionTracker.notifySessionStartObserver(session);
        }
        sessionTracker.currentSession = session;
    }

    public static boolean resumeSession() {
        SessionTracker sessionTracker = getClient().sessionTracker;
        Session session = sessionTracker.currentSession;
        boolean z = false;
        if (session == null) {
            session = sessionTracker.shouldDiscardSession(false) ? null : sessionTracker.startNewSession(new Date(), ((UserState) sessionTracker.client.userState.get()).user, false);
        } else {
            z = session.isPaused.compareAndSet(true, false);
        }
        if (session != null) {
            sessionTracker.notifySessionStartObserver(session);
        }
        return z;
    }

    public static void setAutoDetectAnrs(boolean z) {
        Client client2 = getClient();
        Plugin plugin = (Plugin) client2.pluginClient.lazyDecoderFactories;
        if (z) {
            if (plugin != null) {
                plugin.load(client2);
            }
        } else if (plugin != null) {
            plugin.unload();
        }
    }

    public static void setAutoNotify(boolean z) {
        Client client2 = getClient();
        ComponentRegistry.Builder builder = client2.pluginClient;
        Plugin plugin = (Plugin) builder.lazyDecoderFactories;
        if (z) {
            if (plugin != null) {
                plugin.load(client2);
            }
        } else if (plugin != null) {
            plugin.unload();
        }
        Plugin plugin2 = (Plugin) builder.lazyFetcherFactories;
        if (z) {
            if (plugin2 != null) {
                plugin2.load(client2);
            }
        } else if (plugin2 != null) {
            plugin2.unload();
        }
        ExceptionHandler exceptionHandler = client2.exceptionHandler;
        if (z) {
            exceptionHandler.enabled = true;
            java.lang.Thread.setDefaultUncaughtExceptionHandler(exceptionHandler);
        } else {
            exceptionHandler.enabled = false;
            java.lang.Thread.setDefaultUncaughtExceptionHandler(exceptionHandler.originalHandler);
        }
    }

    public static void setBinaryArch(String str) {
        getClient().appDataCollector.binaryArch = str;
    }

    public static void setClient(Client client2) {
        client = client2;
    }

    public static void setContext(String str) {
        ContextState contextState = getClient().contextState;
        contextState.manualContext = str;
        contextState.automaticContext = "__BUGSNAG_MANUAL_CONTEXT__";
        contextState.emitObservableEvent();
    }

    public static String setGroupingDiscriminator(String str) {
        return getClient().setGroupingDiscriminator(str);
    }

    public static void setUser(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        setUser(bArr == null ? null : new String(bArr, UTF8Charset), bArr2 == null ? null : new String(bArr2, UTF8Charset), bArr3 != null ? new String(bArr3, UTF8Charset) : null);
    }

    public static void startSession() {
        SessionTracker sessionTracker = getClient().sessionTracker;
        if (sessionTracker.shouldDiscardSession(false)) {
            return;
        }
        sessionTracker.startNewSession(new Date(), ((UserState) sessionTracker.client.userState.get()).user, false);
    }

    private static File getNativeReportPath(File file) {
        return new File(file, "bugsnag/native");
    }

    public static void leaveBreadcrumb(String str, BreadcrumbType breadcrumbType) {
        if (str == null) {
            return;
        }
        getClient().leaveBreadcrumb(breadcrumbType, str, new HashMap());
    }

    public static void leaveBreadcrumb(String str, String str2, Map<String, Object> map) {
        getClient().leaveBreadcrumb(BreadcrumbType.valueOf(str2.toUpperCase(Locale.US)), str, map);
    }

    public static void setUser(String str, String str2, String str3) {
        UserState userState = (UserState) getClient().userState.get();
        userState.user = new User(str, str2, str3);
        userState.emitObservableEvent();
    }

    public static void notify(final String str, final String str2, final Severity severity, StackTraceElement[] stackTraceElementArr) {
        if (getClient().immutableConfig.shouldDiscardByErrorClass$bugsnag_android_core_release(str)) {
            return;
        }
        RuntimeException runtimeException = new RuntimeException();
        runtimeException.setStackTrace(stackTraceElementArr);
        getClient().notify(runtimeException, new OnErrorCallback() { // from class: com.bugsnag.android.NativeInterface.1
            @Override // com.bugsnag.android.OnErrorCallback
            public final boolean onError(Event event) {
                EventInternal eventInternal = event.impl;
                SeverityReason severityReason = eventInternal.severityReason;
                String str3 = severityReason.severityReasonType;
                boolean z = severityReason.unhandled;
                eventInternal.severityReason = new SeverityReason(str3, Severity.this, z, z != severityReason.originalUnhandled, severityReason.attributeValue, severityReason.attributeKey);
                ArrayList<Error> arrayList = eventInternal.errors;
                Error error = (Error) arrayList.get(0);
                if (!arrayList.isEmpty()) {
                    error.setErrorClass(str);
                    error.impl.errorMessage = str2;
                    for (Error error2 : arrayList) {
                        ErrorType errorType = ErrorType.C;
                        if (errorType != null) {
                            error2.impl.f939type = errorType;
                        } else {
                            error2.logger.e("Invalid null value supplied to error.type, ignoring");
                        }
                    }
                }
                return true;
            }
        });
    }

    public static void notify(byte[] bArr, byte[] bArr2, Severity severity, NativeStackframe[] nativeStackframeArr) {
        if (bArr == null || bArr2 == null || nativeStackframeArr == null) {
            return;
        }
        notify(new String(bArr, UTF8Charset), new String(bArr2, UTF8Charset), severity, nativeStackframeArr);
    }

    public static void notify(byte[] bArr, byte[] bArr2, Severity severity, StackTraceElement[] stackTraceElementArr) {
        if (bArr == null || bArr2 == null || stackTraceElementArr == null) {
            return;
        }
        notify(new String(bArr, UTF8Charset), new String(bArr2, UTF8Charset), severity, stackTraceElementArr);
    }

    public static void addMetadata(String str, String str2, Object obj) {
        Client client2 = getClient();
        client2.getClass();
        if (str != null && str2 != null) {
            MetadataState metadataState = client2.metadataState;
            metadataState.metadata.addMetadata(str, str2, obj);
            metadataState.notifyMetadataAdded(str, str2, obj);
            return;
        }
        client2.logNull("addMetadata");
    }

    public static void deliverReport(File file) {
        EventStore eventStore = (EventStore) getClient().eventStore.get();
        if (file.renameTo(new File(eventStore.storageDir, file.getName()))) {
            eventStore.flushAsync();
        } else {
            file.delete();
        }
    }
}
