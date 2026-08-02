package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC0136t implements Internal.EnumLite {
    DISCLAIMER_TEXT_PLACEMENT_UNKNOWN(0),
    DISCLAIMER_TEXT_PLACEMENT_ABOVE_ACTION_BUTTONS(1),
    DISCLAIMER_TEXT_PLACEMENT_BELOW_ACTION_BUTTONS(2),
    UNRECOGNIZED(-1);

    public static final int DISCLAIMER_TEXT_PLACEMENT_ABOVE_ACTION_BUTTONS_VALUE = 1;
    public static final int DISCLAIMER_TEXT_PLACEMENT_BELOW_ACTION_BUTTONS_VALUE = 2;
    public static final int DISCLAIMER_TEXT_PLACEMENT_UNKNOWN_VALUE = 0;
    public static final a b = new a();
    public final int a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.t$a */
    public class a implements Internal.EnumLiteMap<EnumC0136t> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final EnumC0136t findValueByNumber(int i) {
            return EnumC0136t.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.t$b */
    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC0136t.forNumber(i) != null;
        }
    }

    EnumC0136t(int i) {
        this.a = i;
    }

    public static EnumC0136t forNumber(int i) {
        if (i == 0) {
            return DISCLAIMER_TEXT_PLACEMENT_UNKNOWN;
        }
        if (i == 1) {
            return DISCLAIMER_TEXT_PLACEMENT_ABOVE_ACTION_BUTTONS;
        }
        if (i != 2) {
            return null;
        }
        return DISCLAIMER_TEXT_PLACEMENT_BELOW_ACTION_BUTTONS;
    }

    public static Internal.EnumLiteMap<EnumC0136t> internalGetValueMap() {
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
    public static EnumC0136t valueOf(int i) {
        return forNumber(i);
    }
}
