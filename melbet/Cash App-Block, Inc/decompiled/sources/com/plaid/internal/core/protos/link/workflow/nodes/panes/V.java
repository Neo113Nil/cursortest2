package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes5.dex */
public enum V implements Internal.EnumLite {
    TEXT_INPUT_TYPE_UNKNOWN(0),
    TEXT_INPUT_TYPE_TEXT(1),
    TEXT_INPUT_TYPE_NUMERIC(2),
    TEXT_INPUT_TYPE_CURRENCY(3),
    TEXT_INPUT_TYPE_MICRODEPOSIT(4),
    TEXT_INPUT_TYPE_EMAIL(5),
    TEXT_INPUT_TYPE_DATE(6),
    TEXT_INPUT_TYPE_TELEPHONE(7),
    UNRECOGNIZED(-1);

    public static final int TEXT_INPUT_TYPE_CURRENCY_VALUE = 3;
    public static final int TEXT_INPUT_TYPE_DATE_VALUE = 6;
    public static final int TEXT_INPUT_TYPE_EMAIL_VALUE = 5;
    public static final int TEXT_INPUT_TYPE_MICRODEPOSIT_VALUE = 4;
    public static final int TEXT_INPUT_TYPE_NUMERIC_VALUE = 2;
    public static final int TEXT_INPUT_TYPE_TELEPHONE_VALUE = 7;
    public static final int TEXT_INPUT_TYPE_TEXT_VALUE = 1;
    public static final int TEXT_INPUT_TYPE_UNKNOWN_VALUE = 0;
    public static final a b = new a();
    public final int a;

    public class a implements Internal.EnumLiteMap<V> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final V findValueByNumber(int i) {
            return V.forNumber(i);
        }
    }

    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return V.forNumber(i) != null;
        }
    }

    V(int i) {
        this.a = i;
    }

    public static V forNumber(int i) {
        switch (i) {
            case 0:
                return TEXT_INPUT_TYPE_UNKNOWN;
            case 1:
                return TEXT_INPUT_TYPE_TEXT;
            case 2:
                return TEXT_INPUT_TYPE_NUMERIC;
            case 3:
                return TEXT_INPUT_TYPE_CURRENCY;
            case 4:
                return TEXT_INPUT_TYPE_MICRODEPOSIT;
            case 5:
                return TEXT_INPUT_TYPE_EMAIL;
            case 6:
                return TEXT_INPUT_TYPE_DATE;
            case 7:
                return TEXT_INPUT_TYPE_TELEPHONE;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<V> internalGetValueMap() {
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
    public static V valueOf(int i) {
        return forNumber(i);
    }
}
