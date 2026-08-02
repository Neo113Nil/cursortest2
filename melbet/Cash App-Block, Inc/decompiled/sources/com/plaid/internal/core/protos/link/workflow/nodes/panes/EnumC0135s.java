package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC0135s implements Internal.EnumLite {
    CONTENT_JUSTIFY_UNKNOWN(0),
    CONTENT_JUSTIFY_CENTER(1),
    CONTENT_JUSTIFY_SPACE_BETWEEN(2),
    CONTENT_JUSTIFY_SPACE_AROUND(3),
    CONTENT_JUSTIFY_SPACE_EVENLY(4),
    CONTENT_JUSTIFY_START(5),
    UNRECOGNIZED(-1);

    public static final int CONTENT_JUSTIFY_CENTER_VALUE = 1;
    public static final int CONTENT_JUSTIFY_SPACE_AROUND_VALUE = 3;
    public static final int CONTENT_JUSTIFY_SPACE_BETWEEN_VALUE = 2;
    public static final int CONTENT_JUSTIFY_SPACE_EVENLY_VALUE = 4;
    public static final int CONTENT_JUSTIFY_START_VALUE = 5;
    public static final int CONTENT_JUSTIFY_UNKNOWN_VALUE = 0;
    public static final a b = new a();
    public final int a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.s$a */
    public class a implements Internal.EnumLiteMap<EnumC0135s> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final EnumC0135s findValueByNumber(int i) {
            return EnumC0135s.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.s$b */
    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC0135s.forNumber(i) != null;
        }
    }

    EnumC0135s(int i) {
        this.a = i;
    }

    public static EnumC0135s forNumber(int i) {
        if (i == 0) {
            return CONTENT_JUSTIFY_UNKNOWN;
        }
        if (i == 1) {
            return CONTENT_JUSTIFY_CENTER;
        }
        if (i == 2) {
            return CONTENT_JUSTIFY_SPACE_BETWEEN;
        }
        if (i == 3) {
            return CONTENT_JUSTIFY_SPACE_AROUND;
        }
        if (i == 4) {
            return CONTENT_JUSTIFY_SPACE_EVENLY;
        }
        if (i != 5) {
            return null;
        }
        return CONTENT_JUSTIFY_START;
    }

    public static Internal.EnumLiteMap<EnumC0135s> internalGetValueMap() {
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
    public static EnumC0135s valueOf(int i) {
        return forNumber(i);
    }
}
