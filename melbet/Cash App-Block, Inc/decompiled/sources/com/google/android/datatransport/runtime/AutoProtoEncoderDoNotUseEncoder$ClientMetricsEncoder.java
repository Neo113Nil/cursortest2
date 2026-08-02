package com.google.android.datatransport.runtime;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.proto.AtProtobuf$ProtobufImpl;
import com.google.firebase.encoders.proto.Protobuf;

/* loaded from: classes4.dex */
public final class AutoProtoEncoderDoNotUseEncoder$ClientMetricsEncoder implements ObjectEncoder {
    public static final AutoProtoEncoderDoNotUseEncoder$ClientMetricsEncoder INSTANCE = new AutoProtoEncoderDoNotUseEncoder$ClientMetricsEncoder();
    public static final FieldDescriptor WINDOW_DESCRIPTOR = new FieldDescriptor("window", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(1))));
    public static final FieldDescriptor LOGSOURCEMETRICS_DESCRIPTOR = new FieldDescriptor("logSourceMetrics", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(2))));
    public static final FieldDescriptor GLOBALMETRICS_DESCRIPTOR = new FieldDescriptor("globalMetrics", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(3))));
    public static final FieldDescriptor APPNAMESPACE_DESCRIPTOR = new FieldDescriptor("appNamespace", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(4))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        ClientMetrics clientMetrics = (ClientMetrics) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(WINDOW_DESCRIPTOR, clientMetrics.window_);
        objectEncoderContext.add(LOGSOURCEMETRICS_DESCRIPTOR, clientMetrics.log_source_metrics_);
        objectEncoderContext.add(GLOBALMETRICS_DESCRIPTOR, clientMetrics.global_metrics_);
        objectEncoderContext.add(APPNAMESPACE_DESCRIPTOR, clientMetrics.app_namespace_);
    }
}
