package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class AutoBatchedLogRequestEncoder$ExternalPrivacyContextEncoder implements ObjectEncoder {
    public static final AutoBatchedLogRequestEncoder$ExternalPrivacyContextEncoder INSTANCE = new AutoBatchedLogRequestEncoder$ExternalPrivacyContextEncoder();
    public static final FieldDescriptor PREQUEST_DESCRIPTOR = FieldDescriptor.of("prequest");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        ((ObjectEncoderContext) obj2).add(PREQUEST_DESCRIPTOR, ((AutoValue_ExternalPrivacyContext) ((ExternalPrivacyContext) obj)).prequest);
    }
}
