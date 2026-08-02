package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.firebase.encoders.proto.ProtobufEncoder$Builder;
import com.miteksystems.misnap.camera.a.n;
import java.util.HashMap;

/* loaded from: classes4.dex */
public abstract class ProtoEncoderDoNotUse {
    public static final n ENCODER;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put(ProtoEncoderDoNotUse.class, AutoProtoEncoderDoNotUseEncoder$ProtoEncoderDoNotUseEncoder.INSTANCE);
        hashMap2.remove(ProtoEncoderDoNotUse.class);
        hashMap.put(ClientMetrics.class, AutoProtoEncoderDoNotUseEncoder$ClientMetricsEncoder.INSTANCE);
        hashMap2.remove(ClientMetrics.class);
        hashMap.put(TimeWindow.class, AutoProtoEncoderDoNotUseEncoder$TimeWindowEncoder.INSTANCE);
        hashMap2.remove(TimeWindow.class);
        hashMap.put(LogSourceMetrics.class, AutoProtoEncoderDoNotUseEncoder$LogSourceMetricsEncoder.INSTANCE);
        hashMap2.remove(LogSourceMetrics.class);
        hashMap.put(LogEventDropped.class, AutoProtoEncoderDoNotUseEncoder$LogEventDroppedEncoder.INSTANCE);
        hashMap2.remove(LogEventDropped.class);
        hashMap.put(GlobalMetrics.class, AutoProtoEncoderDoNotUseEncoder$GlobalMetricsEncoder.INSTANCE);
        hashMap2.remove(GlobalMetrics.class);
        hashMap.put(StorageMetrics.class, AutoProtoEncoderDoNotUseEncoder$StorageMetricsEncoder.INSTANCE);
        hashMap2.remove(StorageMetrics.class);
        ENCODER = new n(12, new HashMap(hashMap), new HashMap(hashMap2), ProtobufEncoder$Builder.DEFAULT_FALLBACK_ENCODER);
    }
}
