package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC0133p implements Internal.EnumLite {
    BUTTON_PLACEMENT_UNKNOWN(0),
    BUTTON_PLACEMENT_FOOTER(1),
    BUTTON_PLACEMENT_CONTENT_END(2),
    UNRECOGNIZED(-1);

    public static final int BUTTON_PLACEMENT_CONTENT_END_VALUE = 2;
    public static final int BUTTON_PLACEMENT_FOOTER_VALUE = 1;
    public static final int BUTTON_PLACEMENT_UNKNOWN_VALUE = 0;
    public static final a b = new a();
    public final int a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.p$a */
    public class a implements Internal.EnumLiteMap<EnumC0133p> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final EnumC0133p findValueByNumber(int i) {
            return EnumC0133p.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.p$b */
    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC0133p.forNumber(i) != null;
        }
    }

    EnumC0133p(int i) {
        this.a = i;
    }

    public static EnumC0133p forNumber(int i) {
        if (i == 0) {
            return BUTTON_PLACEMENT_UNKNOWN;
        }
        if (i == 1) {
            return BUTTON_PLACEMENT_FOOTER;
        }
        if (i != 2) {
            return null;
        }
        return BUTTON_PLACEMENT_CONTENT_END;
    }

    public static Internal.EnumLiteMap<EnumC0133p> internalGetValueMap() {
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
    public static EnumC0133p valueOf(int i) {
        return forNumber(i);
    }
}
