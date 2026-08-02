package com.google.firebase.messaging;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.proto.AtProtobuf$ProtobufImpl;
import com.google.firebase.encoders.proto.Protobuf;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;

/* loaded from: classes4.dex */
public final class AutoProtoEncoderDoNotUseEncoder$MessagingClientEventExtensionEncoder implements ObjectEncoder {
    public static final AutoProtoEncoderDoNotUseEncoder$MessagingClientEventExtensionEncoder INSTANCE = new AutoProtoEncoderDoNotUseEncoder$MessagingClientEventExtensionEncoder();
    public static final FieldDescriptor MESSAGINGCLIENTEVENT_DESCRIPTOR = new FieldDescriptor("messagingClientEvent", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(1))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        ((ObjectEncoderContext) obj2).add(MESSAGINGCLIENTEVENT_DESCRIPTOR, ((MessagingClientEventExtension) obj).messaging_client_event_);
    }
}
