package com.bugsnag.android;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.ContextProvider;
import com.datadog.android.core.internal.DatadogCore;
import com.datadog.android.core.internal.DatadogCore$safeWithLock$1;
import com.datadog.android.core.internal.NoOpContextProvider;
import com.datadog.android.core.internal.SdkFeature;
import com.datadog.android.core.internal.SdkFeature$sendEvent$1;
import com.fillr.featuretoggle.UnleashContext;
import com.google.firebase.messaging.ByteStreams;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyMap;

/* loaded from: classes4.dex */
public final /* synthetic */ class EventStore$$ExternalSyntheticLambda1 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ EventStore$$ExternalSyntheticLambda1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ServiceInfo serviceInfo;
        String str;
        int i;
        ComponentName startService;
        Object obj = null;
        r2 = null;
        String str2 = null;
        switch (this.$r8$classId) {
            case 0:
                EventStore eventStore = (EventStore) this.f$0;
                String str3 = (String) this.f$1;
                eventStore.flushEventFile(new File(str3));
                return str3;
            case 1:
                DatadogCore datadogCore = (DatadogCore) this.f$0;
                Set set = (Set) this.f$1;
                ContextProvider contextProvider = datadogCore.contextProvider;
                if (contextProvider instanceof NoOpContextProvider) {
                    return null;
                }
                return contextProvider.getContext(set);
            case 2:
                DatadogCore datadogCore2 = (DatadogCore) this.f$0;
                SdkFeature sdkFeature = (SdkFeature) datadogCore2.features.get((String) this.f$1);
                if (sdkFeature == null) {
                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                    emptyMap.getClass();
                    return emptyMap;
                }
                Lock readLock = sdkFeature.featureContextLock.readLock();
                readLock.getClass();
                SdkFeature$sendEvent$1 sdkFeature$sendEvent$1 = new SdkFeature$sendEvent$1(sdkFeature, 1);
                try {
                    readLock.lock();
                } catch (InterruptedException e) {
                    DBUtil.log$default(datadogCore2.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY}), new DatadogCore$safeWithLock$1(readLock, 0), e, 48);
                }
                try {
                    obj = sdkFeature$sendEvent$1.invoke();
                    Map map = (Map) obj;
                    if (map != null) {
                        return map;
                    }
                    EmptyMap emptyMap2 = EmptyMap.INSTANCE;
                    emptyMap2.getClass();
                    return emptyMap2;
                } finally {
                    readLock.unlock();
                }
            default:
                Context context = (Context) this.f$0;
                Intent intent = (Intent) this.f$1;
                UnleashContext unleashContext = UnleashContext.getInstance();
                unleashContext.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) unleashContext.properties).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (unleashContext) {
                    try {
                        String str4 = (String) unleashContext.userId;
                        if (str4 != null) {
                            str2 = str4;
                        } else {
                            ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                                    if (str.startsWith(".")) {
                                        unleashContext.userId = context.getPackageName() + serviceInfo.name;
                                    } else {
                                        unleashContext.userId = serviceInfo.name;
                                    }
                                    str2 = (String) unleashContext.userId;
                                }
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            }
                            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                        }
                    } finally {
                    }
                }
                if (str2 != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str2));
                    }
                    intent2.setClassName(context.getPackageName(), str2);
                }
                try {
                    if (unleashContext.hasWakeLockPermission(context)) {
                        startService = ByteStreams.startWakefulService(context, intent2);
                    } else {
                        startService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = HttpStatusCode.NOT_FOUND_404;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e2) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e2);
                    i = 402;
                } catch (SecurityException e3) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e3);
                    i = HttpStatusCode.UNAUTHORIZED_401;
                }
                return Integer.valueOf(i);
        }
    }
}
