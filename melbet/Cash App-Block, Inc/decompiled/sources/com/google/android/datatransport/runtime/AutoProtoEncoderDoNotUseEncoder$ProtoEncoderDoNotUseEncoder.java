package com.google.android.datatransport.runtime;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;

/* loaded from: classes4.dex */
public final class AutoProtoEncoderDoNotUseEncoder$ProtoEncoderDoNotUseEncoder implements ObjectEncoder {
    public static final AutoProtoEncoderDoNotUseEncoder$ProtoEncoderDoNotUseEncoder INSTANCE = new AutoProtoEncoderDoNotUseEncoder$ProtoEncoderDoNotUseEncoder();

    static {
        FieldDescriptor.of("clientMetrics");
    }

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        if (obj != null) {
            throw new ClassCastException();
        }
        throw null;
    }
}
