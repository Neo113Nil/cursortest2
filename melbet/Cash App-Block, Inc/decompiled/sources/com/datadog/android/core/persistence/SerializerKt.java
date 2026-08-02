package com.datadog.android.core.persistence;

import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.rum.internal.RumFeature$onReceive$1;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public abstract class SerializerKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewLocalHomeForceRefresh.deepLinkSpecs;
    }

    public static final byte[] serializeToByteArray(Serializer serializer, Object obj, InternalLogger internalLogger) {
        obj.getClass();
        internalLogger.getClass();
        try {
            String serialize = serializer.serialize(obj);
            if (serialize == null) {
                return null;
            }
            byte[] bytes = serialize.getBytes(Charsets.UTF_8);
            bytes.getClass();
            return bytes;
        } catch (Throwable th) {
            DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY}), new RumFeature$onReceive$1(obj, 1), th, 48);
            return null;
        }
    }
}
