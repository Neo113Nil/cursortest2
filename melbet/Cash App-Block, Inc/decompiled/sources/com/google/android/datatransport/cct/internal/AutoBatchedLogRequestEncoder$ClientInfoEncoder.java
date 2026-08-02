package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class AutoBatchedLogRequestEncoder$ClientInfoEncoder implements ObjectEncoder {
    public static final AutoBatchedLogRequestEncoder$ClientInfoEncoder INSTANCE = new AutoBatchedLogRequestEncoder$ClientInfoEncoder();
    public static final FieldDescriptor CLIENTTYPE_DESCRIPTOR = FieldDescriptor.of("clientType");
    public static final FieldDescriptor ANDROIDCLIENTINFO_DESCRIPTOR = FieldDescriptor.of("androidClientInfo");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        ClientInfo clientInfo = (ClientInfo) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        ((AutoValue_ClientInfo) clientInfo).getClass();
        objectEncoderContext.add(CLIENTTYPE_DESCRIPTOR, ClientInfo.ClientType.ANDROID_FIREBASE);
        objectEncoderContext.add(ANDROIDCLIENTINFO_DESCRIPTOR, ((AutoValue_ClientInfo) clientInfo).androidClientInfo);
    }
}
