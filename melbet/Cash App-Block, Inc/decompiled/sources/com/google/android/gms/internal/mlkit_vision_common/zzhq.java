package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import androidx.room.util.DBUtil;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.NetworkRequestCompat;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.UploadWorker;
import com.datadog.android.core.internal.utils.ByteArrayExtKt$copyTo$1;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.util.Strings;
import com.squareup.wire.GrpcMethod;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes8.dex */
public abstract class zzhq {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewLocalHome.deepLinkSpecs;
    }

    public static final void triggerUploadWorker(Context context, String str, InternalLogger internalLogger) {
        InternalLogger.Target target = InternalLogger.Target.MAINTAINER;
        str.getClass();
        internalLogger.getClass();
        try {
            WorkManagerImpl instance$1 = WorkManagerImpl.getInstance$1(context);
            NetworkType networkType = NetworkType.NOT_REQUIRED;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Constraints constraints = new Constraints(new NetworkRequestCompat(null), NetworkType.NOT_ROAMING, false, false, false, false, -1L, -1L, CollectionsKt.toSet(linkedHashSet));
            GrpcMethod grpcMethod = new GrpcMethod(UploadWorker.class);
            ((WorkSpec) grpcMethod.requestAdapter).constraints = constraints;
            ((Set) grpcMethod.responseAdapter).add("DatadogBackgroundUpload/".concat(str));
            grpcMethod.setInitialDelay(5000L, TimeUnit.MILLISECONDS);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("_dd.sdk.instanceName", str);
            Data data = new Data(linkedHashMap);
            Strings.toByteArrayInternalV1(data);
            ((WorkSpec) grpcMethod.requestAdapter).input = data;
            instance$1.enqueueUniqueWork("DatadogUploadWorker", ExistingWorkPolicy.REPLACE, grpcMethod.build());
            DBUtil.log$default(internalLogger, 3, target, ByteArrayExtKt$copyTo$1.INSTANCE$4, null, false, 56);
        } catch (Exception e) {
            DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target, InternalLogger.Target.TELEMETRY}), ByteArrayExtKt$copyTo$1.INSTANCE$5, e, 48);
        }
    }
}
