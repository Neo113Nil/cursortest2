package com.google.firebase.messaging;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.proto.AtProtobuf$ProtobufImpl;
import com.google.firebase.encoders.proto.Protobuf;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.knotapi.knot.utilities.BreadcrumbHelper;

/* loaded from: classes4.dex */
public final class AutoProtoEncoderDoNotUseEncoder$MessagingClientEventEncoder implements ObjectEncoder {
    public static final AutoProtoEncoderDoNotUseEncoder$MessagingClientEventEncoder INSTANCE = new AutoProtoEncoderDoNotUseEncoder$MessagingClientEventEncoder();
    public static final FieldDescriptor PROJECTNUMBER_DESCRIPTOR = new FieldDescriptor("projectNumber", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(1))));
    public static final FieldDescriptor MESSAGEID_DESCRIPTOR = new FieldDescriptor("messageId", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(2))));
    public static final FieldDescriptor INSTANCEID_DESCRIPTOR = new FieldDescriptor("instanceId", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(3))));
    public static final FieldDescriptor MESSAGETYPE_DESCRIPTOR = new FieldDescriptor("messageType", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(4))));
    public static final FieldDescriptor SDKPLATFORM_DESCRIPTOR = new FieldDescriptor("sdkPlatform", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(5))));
    public static final FieldDescriptor PACKAGENAME_DESCRIPTOR = new FieldDescriptor("packageName", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(6))));
    public static final FieldDescriptor COLLAPSEKEY_DESCRIPTOR = new FieldDescriptor("collapseKey", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(7))));
    public static final FieldDescriptor PRIORITY_DESCRIPTOR = new FieldDescriptor("priority", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(8))));
    public static final FieldDescriptor TTL_DESCRIPTOR = new FieldDescriptor("ttl", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(9))));
    public static final FieldDescriptor TOPIC_DESCRIPTOR = new FieldDescriptor("topic", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(10))));
    public static final FieldDescriptor BULKID_DESCRIPTOR = new FieldDescriptor("bulkId", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(11))));
    public static final FieldDescriptor EVENT_DESCRIPTOR = new FieldDescriptor(BreadcrumbHelper.Category.EVENT, FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(12))));
    public static final FieldDescriptor ANALYTICSLABEL_DESCRIPTOR = new FieldDescriptor("analyticsLabel", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(13))));
    public static final FieldDescriptor CAMPAIGNID_DESCRIPTOR = new FieldDescriptor("campaignId", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(14))));
    public static final FieldDescriptor COMPOSERLABEL_DESCRIPTOR = new FieldDescriptor("composerLabel", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(15))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        MessagingClientEvent messagingClientEvent = (MessagingClientEvent) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(PROJECTNUMBER_DESCRIPTOR, messagingClientEvent.project_number_);
        objectEncoderContext.add(MESSAGEID_DESCRIPTOR, messagingClientEvent.message_id_);
        objectEncoderContext.add(INSTANCEID_DESCRIPTOR, messagingClientEvent.instance_id_);
        objectEncoderContext.add(MESSAGETYPE_DESCRIPTOR, messagingClientEvent.message_type_);
        objectEncoderContext.add(SDKPLATFORM_DESCRIPTOR, messagingClientEvent.sdk_platform_);
        objectEncoderContext.add(PACKAGENAME_DESCRIPTOR, messagingClientEvent.package_name_);
        objectEncoderContext.add(COLLAPSEKEY_DESCRIPTOR, messagingClientEvent.collapse_key_);
        objectEncoderContext.add(PRIORITY_DESCRIPTOR, messagingClientEvent.priority_);
        objectEncoderContext.add(TTL_DESCRIPTOR, messagingClientEvent.ttl_);
        objectEncoderContext.add(TOPIC_DESCRIPTOR, messagingClientEvent.topic_);
        objectEncoderContext.add(BULKID_DESCRIPTOR, 0L);
        objectEncoderContext.add(EVENT_DESCRIPTOR, messagingClientEvent.event_);
        objectEncoderContext.add(ANALYTICSLABEL_DESCRIPTOR, messagingClientEvent.analytics_label_);
        objectEncoderContext.add(CAMPAIGNID_DESCRIPTOR, 0L);
        objectEncoderContext.add(COMPOSERLABEL_DESCRIPTOR, messagingClientEvent.composer_label_);
    }
}
