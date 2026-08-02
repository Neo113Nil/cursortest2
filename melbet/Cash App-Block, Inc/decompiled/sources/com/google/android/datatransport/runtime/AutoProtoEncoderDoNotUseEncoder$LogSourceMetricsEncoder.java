package com.google.android.datatransport.runtime;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.proto.AtProtobuf$ProtobufImpl;
import com.google.firebase.encoders.proto.Protobuf;

/* loaded from: classes4.dex */
public final class AutoProtoEncoderDoNotUseEncoder$LogSourceMetricsEncoder implements ObjectEncoder {
    public static final AutoProtoEncoderDoNotUseEncoder$LogSourceMetricsEncoder INSTANCE = new AutoProtoEncoderDoNotUseEncoder$LogSourceMetricsEncoder();
    public static final FieldDescriptor LOGSOURCE_DESCRIPTOR = new FieldDescriptor("logSource", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(1))));
    public static final FieldDescriptor LOGEVENTDROPPED_DESCRIPTOR = new FieldDescriptor("logEventDropped", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(2))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        LogSourceMetrics logSourceMetrics = (LogSourceMetrics) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(LOGSOURCE_DESCRIPTOR, logSourceMetrics.log_source_);
        objectEncoderContext.add(LOGEVENTDROPPED_DESCRIPTOR, logSourceMetrics.log_event_dropped_);
    }
}
