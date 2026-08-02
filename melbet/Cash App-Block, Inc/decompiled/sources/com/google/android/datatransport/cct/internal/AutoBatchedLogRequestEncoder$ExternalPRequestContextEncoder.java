package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class AutoBatchedLogRequestEncoder$ExternalPRequestContextEncoder implements ObjectEncoder {
    public static final AutoBatchedLogRequestEncoder$ExternalPRequestContextEncoder INSTANCE = new AutoBatchedLogRequestEncoder$ExternalPRequestContextEncoder();
    public static final FieldDescriptor ORIGINASSOCIATEDPRODUCTID_DESCRIPTOR = FieldDescriptor.of("originAssociatedProductId");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        ((ObjectEncoderContext) obj2).add(ORIGINASSOCIATEDPRODUCTID_DESCRIPTOR, ((AutoValue_ExternalPRequestContext) ((ExternalPRequestContext) obj)).originAssociatedProductId);
    }
}
