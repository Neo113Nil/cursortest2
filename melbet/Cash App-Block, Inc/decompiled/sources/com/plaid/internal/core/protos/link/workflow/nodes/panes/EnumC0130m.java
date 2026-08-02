package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC0130m implements Internal.EnumLite {
    BACKGROUND_DISPLAY_MODE_UNKNOWN(0),
    BACKGROUND_DISPLAY_MODE_SHIMMER(1),
    UNRECOGNIZED(-1);

    public static final int BACKGROUND_DISPLAY_MODE_SHIMMER_VALUE = 1;
    public static final int BACKGROUND_DISPLAY_MODE_UNKNOWN_VALUE = 0;
    public static final a b = new a();
    public final int a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.m$a */
    public class a implements Internal.EnumLiteMap<EnumC0130m> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final EnumC0130m findValueByNumber(int i) {
            return EnumC0130m.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.m$b */
    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC0130m.forNumber(i) != null;
        }
    }

    EnumC0130m(int i) {
        this.a = i;
    }

    public static EnumC0130m forNumber(int i) {
        if (i == 0) {
            return BACKGROUND_DISPLAY_MODE_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return BACKGROUND_DISPLAY_MODE_SHIMMER;
    }

    public static Internal.EnumLiteMap<EnumC0130m> internalGetValueMap() {
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
    public static EnumC0130m valueOf(int i) {
        return forNumber(i);
    }
}
