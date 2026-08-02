package com.plaid.internal.core.protos.link.workflow.primitives;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes5.dex */
public enum d implements Internal.EnumLite {
    VAULT_NONE(0),
    VAULT_VGS(1),
    UNRECOGNIZED(-1);

    public static final int VAULT_NONE_VALUE = 0;
    public static final int VAULT_VGS_VALUE = 1;
    public static final a b = new a();
    public final int a;

    public class a implements Internal.EnumLiteMap<d> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final d findValueByNumber(int i) {
            return d.forNumber(i);
        }
    }

    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return d.forNumber(i) != null;
        }
    }

    d(int i) {
        this.a = i;
    }

    public static d forNumber(int i) {
        if (i == 0) {
            return VAULT_NONE;
        }
        if (i != 1) {
            return null;
        }
        return VAULT_VGS;
    }

    public static Internal.EnumLiteMap<d> internalGetValueMap() {
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
    public static d valueOf(int i) {
        return forNumber(i);
    }
}
