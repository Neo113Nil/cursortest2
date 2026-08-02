package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC0140x implements Internal.EnumLite {
    GRID_SELECTION_BEHAVIOR_UNKNOWN(0),
    GRID_SELECTION_BEHAVIOR_SINGLE_SELECT(1),
    UNRECOGNIZED(-1);

    public static final int GRID_SELECTION_BEHAVIOR_SINGLE_SELECT_VALUE = 1;
    public static final int GRID_SELECTION_BEHAVIOR_UNKNOWN_VALUE = 0;
    public static final a b = new a();
    public final int a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.x$a */
    public class a implements Internal.EnumLiteMap<EnumC0140x> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final EnumC0140x findValueByNumber(int i) {
            return EnumC0140x.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.x$b */
    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC0140x.forNumber(i) != null;
        }
    }

    EnumC0140x(int i) {
        this.a = i;
    }

    public static EnumC0140x forNumber(int i) {
        if (i == 0) {
            return GRID_SELECTION_BEHAVIOR_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return GRID_SELECTION_BEHAVIOR_SINGLE_SELECT;
    }

    public static Internal.EnumLiteMap<EnumC0140x> internalGetValueMap() {
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
    public static EnumC0140x valueOf(int i) {
        return forNumber(i);
    }
}
