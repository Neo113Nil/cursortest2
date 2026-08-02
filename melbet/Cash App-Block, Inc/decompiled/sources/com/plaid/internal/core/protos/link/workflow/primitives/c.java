package com.plaid.internal.core.protos.link.workflow.primitives;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes5.dex */
public enum c implements Internal.EnumLite {
    CARD_COLLECT_NO_ERROR(0),
    CARD_COLLECT_INTERNAL_SERVICE_ERROR(1),
    CARD_COLLECT_INVALID_CARD_DETAILS(2),
    UNRECOGNIZED(-1);

    public static final int CARD_COLLECT_INTERNAL_SERVICE_ERROR_VALUE = 1;
    public static final int CARD_COLLECT_INVALID_CARD_DETAILS_VALUE = 2;
    public static final int CARD_COLLECT_NO_ERROR_VALUE = 0;
    public static final a b = new a();
    public final int a;

    public class a implements Internal.EnumLiteMap<c> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final c findValueByNumber(int i) {
            return c.forNumber(i);
        }
    }

    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return c.forNumber(i) != null;
        }
    }

    c(int i) {
        this.a = i;
    }

    public static c forNumber(int i) {
        if (i == 0) {
            return CARD_COLLECT_NO_ERROR;
        }
        if (i == 1) {
            return CARD_COLLECT_INTERNAL_SERVICE_ERROR;
        }
        if (i != 2) {
            return null;
        }
        return CARD_COLLECT_INVALID_CARD_DETAILS;
    }

    public static Internal.EnumLiteMap<c> internalGetValueMap() {
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
    public static c valueOf(int i) {
        return forNumber(i);
    }
}
