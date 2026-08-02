package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes5.dex */
public enum I implements Internal.EnumLite {
    PANE_BRANDING_UNKNOWN(0),
    PANE_BRANDING_DEFAULT(1),
    PANE_BRANDING_PLAID_AS_FIRST_PARTY(2),
    UNRECOGNIZED(-1);

    public static final int PANE_BRANDING_DEFAULT_VALUE = 1;
    public static final int PANE_BRANDING_PLAID_AS_FIRST_PARTY_VALUE = 2;
    public static final int PANE_BRANDING_UNKNOWN_VALUE = 0;
    public static final a b = new a();
    public final int a;

    public class a implements Internal.EnumLiteMap<I> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final I findValueByNumber(int i) {
            return I.forNumber(i);
        }
    }

    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return I.forNumber(i) != null;
        }
    }

    I(int i) {
        this.a = i;
    }

    public static I forNumber(int i) {
        if (i == 0) {
            return PANE_BRANDING_UNKNOWN;
        }
        if (i == 1) {
            return PANE_BRANDING_DEFAULT;
        }
        if (i != 2) {
            return null;
        }
        return PANE_BRANDING_PLAID_AS_FIRST_PARTY;
    }

    public static Internal.EnumLiteMap<I> internalGetValueMap() {
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
    public static I valueOf(int i) {
        return forNumber(i);
    }
}
