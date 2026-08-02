package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes5.dex */
public enum U implements Internal.EnumLite {
    TEXT_ALIGNMENT_UNKNOWN(0),
    TEXT_ALIGNMENT_LEFT(1),
    TEXT_ALIGNMENT_CENTER(2),
    TEXT_ALIGNMENT_RIGHT(3),
    TEXT_ALIGNMENT_JUSTIFIED(4),
    UNRECOGNIZED(-1);

    public static final int TEXT_ALIGNMENT_CENTER_VALUE = 2;
    public static final int TEXT_ALIGNMENT_JUSTIFIED_VALUE = 4;
    public static final int TEXT_ALIGNMENT_LEFT_VALUE = 1;
    public static final int TEXT_ALIGNMENT_RIGHT_VALUE = 3;
    public static final int TEXT_ALIGNMENT_UNKNOWN_VALUE = 0;
    public static final a b = new a();
    public final int a;

    public class a implements Internal.EnumLiteMap<U> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final U findValueByNumber(int i) {
            return U.forNumber(i);
        }
    }

    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return U.forNumber(i) != null;
        }
    }

    U(int i) {
        this.a = i;
    }

    public static U forNumber(int i) {
        if (i == 0) {
            return TEXT_ALIGNMENT_UNKNOWN;
        }
        if (i == 1) {
            return TEXT_ALIGNMENT_LEFT;
        }
        if (i == 2) {
            return TEXT_ALIGNMENT_CENTER;
        }
        if (i == 3) {
            return TEXT_ALIGNMENT_RIGHT;
        }
        if (i != 4) {
            return null;
        }
        return TEXT_ALIGNMENT_JUSTIFIED;
    }

    public static Internal.EnumLiteMap<U> internalGetValueMap() {
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
    public static U valueOf(int i) {
        return forNumber(i);
    }
}
