package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes5.dex */
public enum Z implements Internal.EnumLite {
    WEBVIEW_FALLBACK_BACKGROUND_DEFAULT(0),
    WEBVIEW_FALLBACK_BACKGROUND_LIGHT(1),
    WEBVIEW_FALLBACK_BACKGROUND_DARK(2),
    WEBVIEW_FALLBACK_BACKGROUND_TRANSPARENT(3),
    UNRECOGNIZED(-1);

    public static final int WEBVIEW_FALLBACK_BACKGROUND_DARK_VALUE = 2;
    public static final int WEBVIEW_FALLBACK_BACKGROUND_DEFAULT_VALUE = 0;
    public static final int WEBVIEW_FALLBACK_BACKGROUND_LIGHT_VALUE = 1;
    public static final int WEBVIEW_FALLBACK_BACKGROUND_TRANSPARENT_VALUE = 3;
    public static final a b = new a();
    public final int a;

    public class a implements Internal.EnumLiteMap<Z> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Z findValueByNumber(int i) {
            return Z.forNumber(i);
        }
    }

    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return Z.forNumber(i) != null;
        }
    }

    Z(int i) {
        this.a = i;
    }

    public static Z forNumber(int i) {
        if (i == 0) {
            return WEBVIEW_FALLBACK_BACKGROUND_DEFAULT;
        }
        if (i == 1) {
            return WEBVIEW_FALLBACK_BACKGROUND_LIGHT;
        }
        if (i == 2) {
            return WEBVIEW_FALLBACK_BACKGROUND_DARK;
        }
        if (i != 3) {
            return null;
        }
        return WEBVIEW_FALLBACK_BACKGROUND_TRANSPARENT;
    }

    public static Internal.EnumLiteMap<Z> internalGetValueMap() {
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
    public static Z valueOf(int i) {
        return forNumber(i);
    }
}
