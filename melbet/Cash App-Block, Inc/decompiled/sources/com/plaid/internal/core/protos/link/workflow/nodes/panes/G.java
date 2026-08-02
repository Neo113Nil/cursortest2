package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes5.dex */
public enum G implements Internal.EnumLite {
    UI_EXPERIENCE_DEFAULT(0),
    UI_EXPERIENCE_SPINNER_ONLY(1),
    UNRECOGNIZED(-1);

    public static final int UI_EXPERIENCE_DEFAULT_VALUE = 0;
    public static final int UI_EXPERIENCE_SPINNER_ONLY_VALUE = 1;
    public static final a b = new a();
    public final int a;

    public class a implements Internal.EnumLiteMap<G> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final G findValueByNumber(int i) {
            return G.forNumber(i);
        }
    }

    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return G.forNumber(i) != null;
        }
    }

    G(int i) {
        this.a = i;
    }

    public static G forNumber(int i) {
        if (i == 0) {
            return UI_EXPERIENCE_DEFAULT;
        }
        if (i != 1) {
            return null;
        }
        return UI_EXPERIENCE_SPINNER_ONLY;
    }

    public static Internal.EnumLiteMap<G> internalGetValueMap() {
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
    public static G valueOf(int i) {
        return forNumber(i);
    }
}
