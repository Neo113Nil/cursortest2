package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes5.dex */
public enum b0 implements Internal.EnumLite {
    WEBVIEW_FALLBACK_MODE_UNKNOWN(0),
    WEBVIEW_FALLBACK_MODE_IN_PROCESS(1),
    WEBVIEW_FALLBACK_MODE_OUT_OF_PROCESS(2),
    UNRECOGNIZED(-1);

    public static final int WEBVIEW_FALLBACK_MODE_IN_PROCESS_VALUE = 1;
    public static final int WEBVIEW_FALLBACK_MODE_OUT_OF_PROCESS_VALUE = 2;
    public static final int WEBVIEW_FALLBACK_MODE_UNKNOWN_VALUE = 0;
    public static final a b = new a();
    public final int a;

    public class a implements Internal.EnumLiteMap<b0> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final b0 findValueByNumber(int i) {
            return b0.forNumber(i);
        }
    }

    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return b0.forNumber(i) != null;
        }
    }

    b0(int i) {
        this.a = i;
    }

    public static b0 forNumber(int i) {
        if (i == 0) {
            return WEBVIEW_FALLBACK_MODE_UNKNOWN;
        }
        if (i == 1) {
            return WEBVIEW_FALLBACK_MODE_IN_PROCESS;
        }
        if (i != 2) {
            return null;
        }
        return WEBVIEW_FALLBACK_MODE_OUT_OF_PROCESS;
    }

    public static Internal.EnumLiteMap<b0> internalGetValueMap() {
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
    public static b0 valueOf(int i) {
        return forNumber(i);
    }
}
