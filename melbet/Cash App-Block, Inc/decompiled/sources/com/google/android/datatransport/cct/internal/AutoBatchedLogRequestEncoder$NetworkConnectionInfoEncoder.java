package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class AutoBatchedLogRequestEncoder$NetworkConnectionInfoEncoder implements ObjectEncoder {
    public static final AutoBatchedLogRequestEncoder$NetworkConnectionInfoEncoder INSTANCE = new AutoBatchedLogRequestEncoder$NetworkConnectionInfoEncoder();
    public static final FieldDescriptor NETWORKTYPE_DESCRIPTOR = FieldDescriptor.of("networkType");
    public static final FieldDescriptor MOBILESUBTYPE_DESCRIPTOR = FieldDescriptor.of("mobileSubtype");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(NETWORKTYPE_DESCRIPTOR, ((AutoValue_NetworkConnectionInfo) networkConnectionInfo).networkType);
        objectEncoderContext.add(MOBILESUBTYPE_DESCRIPTOR, ((AutoValue_NetworkConnectionInfo) networkConnectionInfo).mobileSubtype);
    }
}
