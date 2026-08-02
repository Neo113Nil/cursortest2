package com.plaid.internal.core.protos.link.workflow.primitives;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes5.dex */
public enum n implements Internal.EnumLite {
    IOS_SDK_POPUP_BEHAVIOR_UNKNOWN(0),
    IOS_SDK_POPUP_BEHAVIOR_DEFAULT_BROWSER(1),
    IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL(2),
    IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT(3),
    IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK(4),
    IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK(5),
    UNRECOGNIZED(-1);

    public static final int IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK_VALUE = 4;
    public static final int IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_VALUE = 2;
    public static final int IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK_VALUE = 5;
    public static final int IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_VALUE = 3;
    public static final int IOS_SDK_POPUP_BEHAVIOR_DEFAULT_BROWSER_VALUE = 1;
    public static final int IOS_SDK_POPUP_BEHAVIOR_UNKNOWN_VALUE = 0;
    public static final a b = new a();
    public final int a;

    public class a implements Internal.EnumLiteMap<n> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final n findValueByNumber(int i) {
            return n.forNumber(i);
        }
    }

    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return n.forNumber(i) != null;
        }
    }

    n(int i) {
        this.a = i;
    }

    public static n forNumber(int i) {
        if (i == 0) {
            return IOS_SDK_POPUP_BEHAVIOR_UNKNOWN;
        }
        if (i == 1) {
            return IOS_SDK_POPUP_BEHAVIOR_DEFAULT_BROWSER;
        }
        if (i == 2) {
            return IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL;
        }
        if (i == 3) {
            return IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT;
        }
        if (i == 4) {
            return IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK;
        }
        if (i != 5) {
            return null;
        }
        return IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK;
    }

    public static Internal.EnumLiteMap<n> internalGetValueMap() {
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
    public static n valueOf(int i) {
        return forNumber(i);
    }
}
