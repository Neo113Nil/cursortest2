package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes5.dex */
public enum L implements Internal.EnumLite {
    SDK_ENCRYPTION_SCHEME_UNKNOWN(0),
    SDK_ENCRYPTION_SCHEME_RSA_PKCS1(1),
    SDK_ENCRYPTION_SCHEME_RSA_SHA256_MGF1(2),
    UNRECOGNIZED(-1);

    public static final int SDK_ENCRYPTION_SCHEME_RSA_PKCS1_VALUE = 1;
    public static final int SDK_ENCRYPTION_SCHEME_RSA_SHA256_MGF1_VALUE = 2;
    public static final int SDK_ENCRYPTION_SCHEME_UNKNOWN_VALUE = 0;
    public static final a b = new a();
    public final int a;

    public class a implements Internal.EnumLiteMap<L> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final L findValueByNumber(int i) {
            return L.forNumber(i);
        }
    }

    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return L.forNumber(i) != null;
        }
    }

    L(int i) {
        this.a = i;
    }

    public static L forNumber(int i) {
        if (i == 0) {
            return SDK_ENCRYPTION_SCHEME_UNKNOWN;
        }
        if (i == 1) {
            return SDK_ENCRYPTION_SCHEME_RSA_PKCS1;
        }
        if (i != 2) {
            return null;
        }
        return SDK_ENCRYPTION_SCHEME_RSA_SHA256_MGF1;
    }

    public static Internal.EnumLiteMap<L> internalGetValueMap() {
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
    public static L valueOf(int i) {
        return forNumber(i);
    }
}
