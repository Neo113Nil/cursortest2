package com.google.android.datatransport.runtime;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.proto.AtProtobuf$ProtobufImpl;
import com.google.firebase.encoders.proto.Protobuf;

/* loaded from: classes4.dex */
public final class AutoProtoEncoderDoNotUseEncoder$TimeWindowEncoder implements ObjectEncoder {
    public static final AutoProtoEncoderDoNotUseEncoder$TimeWindowEncoder INSTANCE = new AutoProtoEncoderDoNotUseEncoder$TimeWindowEncoder();
    public static final FieldDescriptor STARTMS_DESCRIPTOR = new FieldDescriptor("startMs", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(1))));
    public static final FieldDescriptor ENDMS_DESCRIPTOR = new FieldDescriptor("endMs", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(2))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        TimeWindow timeWindow = (TimeWindow) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(STARTMS_DESCRIPTOR, timeWindow.start_ms_);
        objectEncoderContext.add(ENDMS_DESCRIPTOR, timeWindow.end_ms_);
    }
}
