package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC0131n implements Internal.EnumLite {
    BANNER_APPEARANCE_NEUTRAL(0),
    BANNER_APPEARANCE_ROUNDED(1),
    UNRECOGNIZED(-1);

    public static final int BANNER_APPEARANCE_NEUTRAL_VALUE = 0;
    public static final int BANNER_APPEARANCE_ROUNDED_VALUE = 1;
    public static final a b = new a();
    public final int a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.n$a */
    public class a implements Internal.EnumLiteMap<EnumC0131n> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final EnumC0131n findValueByNumber(int i) {
            return EnumC0131n.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.n$b */
    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC0131n.forNumber(i) != null;
        }
    }

    EnumC0131n(int i) {
        this.a = i;
    }

    public static EnumC0131n forNumber(int i) {
        if (i == 0) {
            return BANNER_APPEARANCE_NEUTRAL;
        }
        if (i != 1) {
            return null;
        }
        return BANNER_APPEARANCE_ROUNDED;
    }

    public static Internal.EnumLiteMap<EnumC0131n> internalGetValueMap() {
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
    public static EnumC0131n valueOf(int i) {
        return forNumber(i);
    }
}
