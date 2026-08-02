package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes5.dex */
public enum N implements Internal.EnumLite {
    SEARCH_BEHAVIOR_UNKNOWN(0),
    SEARCH_BEHAVIOR_FILTER_INITIAL_ITEMS(1),
    SEARCH_BEHAVIOR_PANE_SEARCH_API(2),
    SEARCH_BEHAVIOR_WORKFLOW_SEARCH_ENDPOINT(3),
    UNRECOGNIZED(-1);

    public static final int SEARCH_BEHAVIOR_FILTER_INITIAL_ITEMS_VALUE = 1;
    public static final int SEARCH_BEHAVIOR_PANE_SEARCH_API_VALUE = 2;
    public static final int SEARCH_BEHAVIOR_UNKNOWN_VALUE = 0;
    public static final int SEARCH_BEHAVIOR_WORKFLOW_SEARCH_ENDPOINT_VALUE = 3;
    public static final a b = new a();
    public final int a;

    public class a implements Internal.EnumLiteMap<N> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final N findValueByNumber(int i) {
            return N.forNumber(i);
        }
    }

    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return N.forNumber(i) != null;
        }
    }

    N(int i) {
        this.a = i;
    }

    public static N forNumber(int i) {
        if (i == 0) {
            return SEARCH_BEHAVIOR_UNKNOWN;
        }
        if (i == 1) {
            return SEARCH_BEHAVIOR_FILTER_INITIAL_ITEMS;
        }
        if (i == 2) {
            return SEARCH_BEHAVIOR_PANE_SEARCH_API;
        }
        if (i != 3) {
            return null;
        }
        return SEARCH_BEHAVIOR_WORKFLOW_SEARCH_ENDPOINT;
    }

    public static Internal.EnumLiteMap<N> internalGetValueMap() {
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
    public static N valueOf(int i) {
        return forNumber(i);
    }
}
