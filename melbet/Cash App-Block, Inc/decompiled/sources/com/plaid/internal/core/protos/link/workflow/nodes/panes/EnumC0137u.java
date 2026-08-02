package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC0137u implements Internal.EnumLite {
    FLEX_DIRECTION_ROW(0),
    FLEX_DIRECTION_COLUMN(1),
    FLEX_DIRECTION_ROW_REVERSE(2),
    FLEX_DIRECTION_COLUMN_REVERSE(3),
    UNRECOGNIZED(-1);

    public static final int FLEX_DIRECTION_COLUMN_REVERSE_VALUE = 3;
    public static final int FLEX_DIRECTION_COLUMN_VALUE = 1;
    public static final int FLEX_DIRECTION_ROW_REVERSE_VALUE = 2;
    public static final int FLEX_DIRECTION_ROW_VALUE = 0;
    public static final a b = new a();
    public final int a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.u$a */
    public class a implements Internal.EnumLiteMap<EnumC0137u> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final EnumC0137u findValueByNumber(int i) {
            return EnumC0137u.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.u$b */
    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC0137u.forNumber(i) != null;
        }
    }

    EnumC0137u(int i) {
        this.a = i;
    }

    public static EnumC0137u forNumber(int i) {
        if (i == 0) {
            return FLEX_DIRECTION_ROW;
        }
        if (i == 1) {
            return FLEX_DIRECTION_COLUMN;
        }
        if (i == 2) {
            return FLEX_DIRECTION_ROW_REVERSE;
        }
        if (i != 3) {
            return null;
        }
        return FLEX_DIRECTION_COLUMN_REVERSE;
    }

    public static Internal.EnumLiteMap<EnumC0137u> internalGetValueMap() {
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
    public static EnumC0137u valueOf(int i) {
        return forNumber(i);
    }
}
