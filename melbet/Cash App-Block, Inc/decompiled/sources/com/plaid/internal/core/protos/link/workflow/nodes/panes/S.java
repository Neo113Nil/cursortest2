package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes5.dex */
public enum S implements Internal.EnumLite {
    TABLE_ROW_STYLE_UNKNOWN(0),
    TABLE_ROW_STYLE_LEADING_LABEL(1),
    TABLE_ROW_STYLE_TRAILING_LABEL(2),
    UNRECOGNIZED(-1);

    public static final int TABLE_ROW_STYLE_LEADING_LABEL_VALUE = 1;
    public static final int TABLE_ROW_STYLE_TRAILING_LABEL_VALUE = 2;
    public static final int TABLE_ROW_STYLE_UNKNOWN_VALUE = 0;
    public static final a b = new a();
    public final int a;

    public class a implements Internal.EnumLiteMap<S> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final S findValueByNumber(int i) {
            return S.forNumber(i);
        }
    }

    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return S.forNumber(i) != null;
        }
    }

    S(int i) {
        this.a = i;
    }

    public static S forNumber(int i) {
        if (i == 0) {
            return TABLE_ROW_STYLE_UNKNOWN;
        }
        if (i == 1) {
            return TABLE_ROW_STYLE_LEADING_LABEL;
        }
        if (i != 2) {
            return null;
        }
        return TABLE_ROW_STYLE_TRAILING_LABEL;
    }

    public static Internal.EnumLiteMap<S> internalGetValueMap() {
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
    public static S valueOf(int i) {
        return forNumber(i);
    }
}
