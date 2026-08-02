package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes5.dex */
public enum n0 implements Internal.EnumLite {
    BACK_STACK_BEHAVIOR_UNKNOWN(0),
    BACK_STACK_BEHAVIOR_PERSISTENT(1),
    BACK_STACK_BEHAVIOR_TRANSIENT(2),
    UNRECOGNIZED(-1);

    public static final int BACK_STACK_BEHAVIOR_PERSISTENT_VALUE = 1;
    public static final int BACK_STACK_BEHAVIOR_TRANSIENT_VALUE = 2;
    public static final int BACK_STACK_BEHAVIOR_UNKNOWN_VALUE = 0;
    public static final a b = new a();
    public final int a;

    public class a implements Internal.EnumLiteMap<n0> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final n0 findValueByNumber(int i) {
            return n0.forNumber(i);
        }
    }

    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return n0.forNumber(i) != null;
        }
    }

    n0(int i) {
        this.a = i;
    }

    public static n0 forNumber(int i) {
        if (i == 0) {
            return BACK_STACK_BEHAVIOR_UNKNOWN;
        }
        if (i == 1) {
            return BACK_STACK_BEHAVIOR_PERSISTENT;
        }
        if (i != 2) {
            return null;
        }
        return BACK_STACK_BEHAVIOR_TRANSIENT;
    }

    public static Internal.EnumLiteMap<n0> internalGetValueMap() {
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
    public static n0 valueOf(int i) {
        return forNumber(i);
    }
}
