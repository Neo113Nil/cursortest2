package com.google.android.datatransport.runtime;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.proto.AtProtobuf$ProtobufImpl;
import com.google.firebase.encoders.proto.Protobuf;

/* loaded from: classes4.dex */
public final class AutoProtoEncoderDoNotUseEncoder$LogEventDroppedEncoder implements ObjectEncoder {
    public static final AutoProtoEncoderDoNotUseEncoder$LogEventDroppedEncoder INSTANCE = new AutoProtoEncoderDoNotUseEncoder$LogEventDroppedEncoder();
    public static final FieldDescriptor EVENTSDROPPEDCOUNT_DESCRIPTOR = new FieldDescriptor("eventsDroppedCount", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(1))));
    public static final FieldDescriptor REASON_DESCRIPTOR = new FieldDescriptor("reason", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(3))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        LogEventDropped logEventDropped = (LogEventDropped) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(EVENTSDROPPEDCOUNT_DESCRIPTOR, logEventDropped.events_dropped_count_);
        objectEncoderContext.add(REASON_DESCRIPTOR, logEventDropped.reason_);
    }
}
