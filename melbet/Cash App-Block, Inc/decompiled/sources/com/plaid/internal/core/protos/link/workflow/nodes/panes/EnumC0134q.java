package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC0134q implements Internal.EnumLite {
    BUTTON_WEIGHT_UNKNOWN(0),
    BUTTON_WEIGHT_PRIMARY(1),
    BUTTON_WEIGHT_SECONDARY(2),
    BUTTON_WEIGHT_TERTIARY(3),
    UNRECOGNIZED(-1);

    public static final int BUTTON_WEIGHT_PRIMARY_VALUE = 1;
    public static final int BUTTON_WEIGHT_SECONDARY_VALUE = 2;
    public static final int BUTTON_WEIGHT_TERTIARY_VALUE = 3;
    public static final int BUTTON_WEIGHT_UNKNOWN_VALUE = 0;
    public static final a b = new a();
    public final int a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.q$a */
    public class a implements Internal.EnumLiteMap<EnumC0134q> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final EnumC0134q findValueByNumber(int i) {
            return EnumC0134q.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.q$b */
    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC0134q.forNumber(i) != null;
        }
    }

    EnumC0134q(int i) {
        this.a = i;
    }

    public static EnumC0134q forNumber(int i) {
        if (i == 0) {
            return BUTTON_WEIGHT_UNKNOWN;
        }
        if (i == 1) {
            return BUTTON_WEIGHT_PRIMARY;
        }
        if (i == 2) {
            return BUTTON_WEIGHT_SECONDARY;
        }
        if (i != 3) {
            return null;
        }
        return BUTTON_WEIGHT_TERTIARY;
    }

    public static Internal.EnumLiteMap<EnumC0134q> internalGetValueMap() {
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
    public static EnumC0134q valueOf(int i) {
        return forNumber(i);
    }
}
