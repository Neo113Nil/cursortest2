package com.plaid.internal.core.protos.link.workflow.primitives;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes5.dex */
public enum f implements Internal.EnumLite {
    ANDROID_SMS_VERIFICATION_API_TYPE_UNKNOWN(0),
    ANDROID_SMS_VERIFICATION_API_TYPE_SMS_RETRIEVER(2),
    UNRECOGNIZED(-1);

    public static final int ANDROID_SMS_VERIFICATION_API_TYPE_SMS_RETRIEVER_VALUE = 2;
    public static final int ANDROID_SMS_VERIFICATION_API_TYPE_UNKNOWN_VALUE = 0;
    public static final a b = new a();
    public final int a;

    public class a implements Internal.EnumLiteMap<f> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final f findValueByNumber(int i) {
            return f.forNumber(i);
        }
    }

    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return f.forNumber(i) != null;
        }
    }

    f(int i) {
        this.a = i;
    }

    public static f forNumber(int i) {
        if (i == 0) {
            return ANDROID_SMS_VERIFICATION_API_TYPE_UNKNOWN;
        }
        if (i != 2) {
            return null;
        }
        return ANDROID_SMS_VERIFICATION_API_TYPE_SMS_RETRIEVER;
    }

    public static Internal.EnumLiteMap<f> internalGetValueMap() {
        return b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static f valueOf(int i) {
        return forNumber(i);
    }
}
