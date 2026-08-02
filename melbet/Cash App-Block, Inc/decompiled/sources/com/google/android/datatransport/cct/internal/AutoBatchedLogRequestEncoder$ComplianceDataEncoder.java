package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class AutoBatchedLogRequestEncoder$ComplianceDataEncoder implements ObjectEncoder {
    public static final AutoBatchedLogRequestEncoder$ComplianceDataEncoder INSTANCE = new AutoBatchedLogRequestEncoder$ComplianceDataEncoder();
    public static final FieldDescriptor PRIVACYCONTEXT_DESCRIPTOR = FieldDescriptor.of("privacyContext");
    public static final FieldDescriptor PRODUCTIDORIGIN_DESCRIPTOR = FieldDescriptor.of("productIdOrigin");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(PRIVACYCONTEXT_DESCRIPTOR, ((AutoValue_ComplianceData) ((ComplianceData) obj)).privacyContext);
        objectEncoderContext.add(PRODUCTIDORIGIN_DESCRIPTOR, ComplianceData.ProductIdOrigin.EVENT_OVERRIDE);
    }
}
