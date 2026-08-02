package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC0132o implements Internal.EnumLite {
    BANNER_TYPE_DEFAULT(0),
    BANNER_TYPE_NEUTRAL(1),
    BANNER_TYPE_POSITIVE(2),
    BANNER_TYPE_WARNING(3),
    BANNER_TYPE_NEGATIVE(4),
    BANNER_TYPE_INFO(5),
    BANNER_TYPE_PROMINENT(6),
    UNRECOGNIZED(-1);

    public static final int BANNER_TYPE_DEFAULT_VALUE = 0;
    public static final int BANNER_TYPE_INFO_VALUE = 5;
    public static final int BANNER_TYPE_NEGATIVE_VALUE = 4;
    public static final int BANNER_TYPE_NEUTRAL_VALUE = 1;
    public static final int BANNER_TYPE_POSITIVE_VALUE = 2;
    public static final int BANNER_TYPE_PROMINENT_VALUE = 6;
    public static final int BANNER_TYPE_WARNING_VALUE = 3;
    public static final a b = new a();
    public final int a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.o$a */
    public class a implements Internal.EnumLiteMap<EnumC0132o> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final EnumC0132o findValueByNumber(int i) {
            return EnumC0132o.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.o$b */
    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC0132o.forNumber(i) != null;
        }
    }

    EnumC0132o(int i) {
        this.a = i;
    }

    public static EnumC0132o forNumber(int i) {
        switch (i) {
            case 0:
                return BANNER_TYPE_DEFAULT;
            case 1:
                return BANNER_TYPE_NEUTRAL;
            case 2:
                return BANNER_TYPE_POSITIVE;
            case 3:
                return BANNER_TYPE_WARNING;
            case 4:
                return BANNER_TYPE_NEGATIVE;
            case 5:
                return BANNER_TYPE_INFO;
            case 6:
                return BANNER_TYPE_PROMINENT;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<EnumC0132o> internalGetValueMap() {
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
    public static EnumC0132o valueOf(int i) {
        return forNumber(i);
    }
}
