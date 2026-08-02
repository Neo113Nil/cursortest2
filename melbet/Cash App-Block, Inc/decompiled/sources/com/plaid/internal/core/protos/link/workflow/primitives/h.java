package com.plaid.internal.core.protos.link.workflow.primitives;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes5.dex */
public enum h implements Internal.EnumLite {
    INCREMENTAL_CALLBACK_SUPPORT_NONE(0),
    INCREMENTAL_CALLBACK_SUPPORT_ADDITIVE_ON_RESULT(1),
    UNRECOGNIZED(-1);

    public static final int INCREMENTAL_CALLBACK_SUPPORT_ADDITIVE_ON_RESULT_VALUE = 1;
    public static final int INCREMENTAL_CALLBACK_SUPPORT_NONE_VALUE = 0;
    public static final a b = new a();
    public final int a;

    public class a implements Internal.EnumLiteMap<h> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final h findValueByNumber(int i) {
            return h.forNumber(i);
        }
    }

    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return h.forNumber(i) != null;
        }
    }

    h(int i) {
        this.a = i;
    }

    public static h forNumber(int i) {
        if (i == 0) {
            return INCREMENTAL_CALLBACK_SUPPORT_NONE;
        }
        if (i != 1) {
            return null;
        }
        return INCREMENTAL_CALLBACK_SUPPORT_ADDITIVE_ON_RESULT;
    }

    public static Internal.EnumLiteMap<h> internalGetValueMap() {
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
    public static h valueOf(int i) {
        return forNumber(i);
    }
}
