package com.google.android.datatransport.runtime;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.proto.AtProtobuf$ProtobufImpl;
import com.google.firebase.encoders.proto.Protobuf;

/* loaded from: classes4.dex */
public final class AutoProtoEncoderDoNotUseEncoder$GlobalMetricsEncoder implements ObjectEncoder {
    public static final AutoProtoEncoderDoNotUseEncoder$GlobalMetricsEncoder INSTANCE = new AutoProtoEncoderDoNotUseEncoder$GlobalMetricsEncoder();
    public static final FieldDescriptor STORAGEMETRICS_DESCRIPTOR = new FieldDescriptor("storageMetrics", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(1))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        ((ObjectEncoderContext) obj2).add(STORAGEMETRICS_DESCRIPTOR, ((GlobalMetrics) obj).storage_metrics_);
    }
}
