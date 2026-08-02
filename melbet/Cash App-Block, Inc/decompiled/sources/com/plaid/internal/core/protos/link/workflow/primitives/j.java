package com.plaid.internal.core.protos.link.workflow.primitives;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes5.dex */
public enum j implements Internal.EnumLite {
    NULLABLE_BOOL_UNKNOWN(0),
    NULLABLE_BOOL_UNDEFINED(1),
    NULLABLE_BOOL_TRUE(2),
    NULLABLE_BOOL_FALSE(3),
    UNRECOGNIZED(-1);

    public static final int NULLABLE_BOOL_FALSE_VALUE = 3;
    public static final int NULLABLE_BOOL_TRUE_VALUE = 2;
    public static final int NULLABLE_BOOL_UNDEFINED_VALUE = 1;
    public static final int NULLABLE_BOOL_UNKNOWN_VALUE = 0;
    public static final a b = new a();
    public final int a;

    public class a implements Internal.EnumLiteMap<j> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final j findValueByNumber(int i) {
            return j.forNumber(i);
        }
    }

    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return j.forNumber(i) != null;
        }
    }

    j(int i) {
        this.a = i;
    }

    public static j forNumber(int i) {
        if (i == 0) {
            return NULLABLE_BOOL_UNKNOWN;
        }
        if (i == 1) {
            return NULLABLE_BOOL_UNDEFINED;
        }
        if (i == 2) {
            return NULLABLE_BOOL_TRUE;
        }
        if (i != 3) {
            return null;
        }
        return NULLABLE_BOOL_FALSE;
    }

    public static Internal.EnumLiteMap<j> internalGetValueMap() {
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
    public static j valueOf(int i) {
        return forNumber(i);
    }
}
