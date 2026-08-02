package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes5.dex */
public enum O implements Internal.EnumLite {
    SELECTION_LIST_BEHAVIOR_UNKNOWN(0),
    SELECTION_LIST_BEHAVIOR_SINGLE_SELECT(1),
    SELECTION_LIST_BEHAVIOR_SINGLE_SELECT_IMMEDIATE(2),
    SELECTION_LIST_BEHAVIOR_MULTI_SELECT(3),
    SELECTION_LIST_BEHAVIOR_MULTI_SELECT_NO_RESPONSES_REQUIRED(4),
    SELECTION_LIST_BEHAVIOR_NO_SELECTION(5),
    UNRECOGNIZED(-1);

    public static final int SELECTION_LIST_BEHAVIOR_MULTI_SELECT_NO_RESPONSES_REQUIRED_VALUE = 4;
    public static final int SELECTION_LIST_BEHAVIOR_MULTI_SELECT_VALUE = 3;
    public static final int SELECTION_LIST_BEHAVIOR_NO_SELECTION_VALUE = 5;
    public static final int SELECTION_LIST_BEHAVIOR_SINGLE_SELECT_IMMEDIATE_VALUE = 2;
    public static final int SELECTION_LIST_BEHAVIOR_SINGLE_SELECT_VALUE = 1;
    public static final int SELECTION_LIST_BEHAVIOR_UNKNOWN_VALUE = 0;
    public static final a b = new a();
    public final int a;

    public class a implements Internal.EnumLiteMap<O> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final O findValueByNumber(int i) {
            return O.forNumber(i);
        }
    }

    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return O.forNumber(i) != null;
        }
    }

    O(int i) {
        this.a = i;
    }

    public static O forNumber(int i) {
        if (i == 0) {
            return SELECTION_LIST_BEHAVIOR_UNKNOWN;
        }
        if (i == 1) {
            return SELECTION_LIST_BEHAVIOR_SINGLE_SELECT;
        }
        if (i == 2) {
            return SELECTION_LIST_BEHAVIOR_SINGLE_SELECT_IMMEDIATE;
        }
        if (i == 3) {
            return SELECTION_LIST_BEHAVIOR_MULTI_SELECT;
        }
        if (i == 4) {
            return SELECTION_LIST_BEHAVIOR_MULTI_SELECT_NO_RESPONSES_REQUIRED;
        }
        if (i != 5) {
            return null;
        }
        return SELECTION_LIST_BEHAVIOR_NO_SELECTION;
    }

    public static Internal.EnumLiteMap<O> internalGetValueMap() {
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
    public static O valueOf(int i) {
        return forNumber(i);
    }
}
