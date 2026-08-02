package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes5.dex */
public enum a0 implements Internal.EnumLite {
    WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_UNKNOWN(0),
    WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_DEFAULT_BROWSER(1),
    WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL(2),
    WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT(3),
    WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK(4),
    WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK(5),
    UNRECOGNIZED(-1);

    public static final int WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK_VALUE = 4;
    public static final int WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_VALUE = 2;
    public static final int WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK_VALUE = 5;
    public static final int WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_VALUE = 3;
    public static final int WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_DEFAULT_BROWSER_VALUE = 1;
    public static final int WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_UNKNOWN_VALUE = 0;
    public static final a b = new a();
    public final int a;

    public class a implements Internal.EnumLiteMap<a0> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final a0 findValueByNumber(int i) {
            return a0.forNumber(i);
        }
    }

    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return a0.forNumber(i) != null;
        }
    }

    a0(int i) {
        this.a = i;
    }

    public static a0 forNumber(int i) {
        if (i == 0) {
            return WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_UNKNOWN;
        }
        if (i == 1) {
            return WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_DEFAULT_BROWSER;
        }
        if (i == 2) {
            return WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL;
        }
        if (i == 3) {
            return WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT;
        }
        if (i == 4) {
            return WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK;
        }
        if (i != 5) {
            return null;
        }
        return WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK;
    }

    public static Internal.EnumLiteMap<a0> internalGetValueMap() {
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
    public static a0 valueOf(int i) {
        return forNumber(i);
    }
}
