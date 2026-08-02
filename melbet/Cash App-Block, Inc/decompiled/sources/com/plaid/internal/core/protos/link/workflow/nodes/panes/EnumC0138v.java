package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC0138v implements Internal.EnumLite {
    NONE(0),
    BUTTON_ONE_TAP(1),
    BUTTON_TWO_TAP(2),
    BUTTON_THREE_TAP(3),
    UNRECOGNIZED(-1);

    public static final int BUTTON_ONE_TAP_VALUE = 1;
    public static final int BUTTON_THREE_TAP_VALUE = 3;
    public static final int BUTTON_TWO_TAP_VALUE = 2;
    public static final int NONE_VALUE = 0;
    public static final a b = new a();
    public final int a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.v$a */
    public class a implements Internal.EnumLiteMap<EnumC0138v> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final EnumC0138v findValueByNumber(int i) {
            return EnumC0138v.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.v$b */
    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC0138v.forNumber(i) != null;
        }
    }

    EnumC0138v(int i) {
        this.a = i;
    }

    public static EnumC0138v forNumber(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return BUTTON_ONE_TAP;
        }
        if (i == 2) {
            return BUTTON_TWO_TAP;
        }
        if (i != 3) {
            return null;
        }
        return BUTTON_THREE_TAP;
    }

    public static Internal.EnumLiteMap<EnumC0138v> internalGetValueMap() {
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
    public static EnumC0138v valueOf(int i) {
        return forNumber(i);
    }
}
