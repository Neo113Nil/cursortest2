package com.google.firebase.messaging;

import com.google.firebase.encoders.proto.ProtobufEncoder$Builder;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
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
        hashMap.put(MessagingClientEventExtension.class, AutoProtoEncoderDoNotUseEncoder$MessagingClientEventExtensionEncoder.INSTANCE);
        hashMap2.remove(MessagingClientEventExtension.class);
        hashMap.put(MessagingClientEvent.class, AutoProtoEncoderDoNotUseEncoder$MessagingClientEventEncoder.INSTANCE);
        hashMap2.remove(MessagingClientEvent.class);
        ENCODER = new n(12, new HashMap(hashMap), new HashMap(hashMap2), ProtobufEncoder$Builder.DEFAULT_FALLBACK_ENCODER);
    }
}
