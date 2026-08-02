package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes5.dex */
public enum F implements Internal.EnumLite {
    OAUTH_SUBMISSION_METHOD_UNKNOWN(0),
    OAUTH_SUBMISSION_METHOD_POLLING(1),
    OAUTH_SUBMISSION_METHOD_REDIRECT(2),
    UNRECOGNIZED(-1);

    public static final int OAUTH_SUBMISSION_METHOD_POLLING_VALUE = 1;
    public static final int OAUTH_SUBMISSION_METHOD_REDIRECT_VALUE = 2;
    public static final int OAUTH_SUBMISSION_METHOD_UNKNOWN_VALUE = 0;
    public static final a b = new a();
    public final int a;

    public class a implements Internal.EnumLiteMap<F> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final F findValueByNumber(int i) {
            return F.forNumber(i);
        }
    }

    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return F.forNumber(i) != null;
        }
    }

    F(int i) {
        this.a = i;
    }

    public static F forNumber(int i) {
        if (i == 0) {
            return OAUTH_SUBMISSION_METHOD_UNKNOWN;
        }
        if (i == 1) {
            return OAUTH_SUBMISSION_METHOD_POLLING;
        }
        if (i != 2) {
            return null;
        }
        return OAUTH_SUBMISSION_METHOD_REDIRECT;
    }

    public static Internal.EnumLiteMap<F> internalGetValueMap() {
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
    public static F valueOf(int i) {
        return forNumber(i);
    }
}
