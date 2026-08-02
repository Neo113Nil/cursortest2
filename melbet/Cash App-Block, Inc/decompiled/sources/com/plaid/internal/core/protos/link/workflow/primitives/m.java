package com.plaid.internal.core.protos.link.workflow.primitives;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes5.dex */
public enum m implements Internal.EnumLite {
    ANDROID_URL_OPEN_BEHAVIOR_UNKNOWN(0),
    ANDROID_URL_OPEN_BEHAVIOR_PARTIAL_CUSTOM_TAB(1),
    ANDROID_URL_OPEN_BEHAVIOR_CUSTOM_TAB(2),
    ANDROID_URL_OPEN_BEHAVIOR_EXTERNAL_BROWSER(3),
    UNRECOGNIZED(-1);

    public static final int ANDROID_URL_OPEN_BEHAVIOR_CUSTOM_TAB_VALUE = 2;
    public static final int ANDROID_URL_OPEN_BEHAVIOR_EXTERNAL_BROWSER_VALUE = 3;
    public static final int ANDROID_URL_OPEN_BEHAVIOR_PARTIAL_CUSTOM_TAB_VALUE = 1;
    public static final int ANDROID_URL_OPEN_BEHAVIOR_UNKNOWN_VALUE = 0;
    public static final a b = new a();
    public final int a;

    public class a implements Internal.EnumLiteMap<m> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final m findValueByNumber(int i) {
            return m.forNumber(i);
        }
    }

    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return m.forNumber(i) != null;
        }
    }

    m(int i) {
        this.a = i;
    }

    public static m forNumber(int i) {
        if (i == 0) {
            return ANDROID_URL_OPEN_BEHAVIOR_UNKNOWN;
        }
        if (i == 1) {
            return ANDROID_URL_OPEN_BEHAVIOR_PARTIAL_CUSTOM_TAB;
        }
        if (i == 2) {
            return ANDROID_URL_OPEN_BEHAVIOR_CUSTOM_TAB;
        }
        if (i != 3) {
            return null;
        }
        return ANDROID_URL_OPEN_BEHAVIOR_EXTERNAL_BROWSER;
    }

    public static Internal.EnumLiteMap<m> internalGetValueMap() {
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
    public static m valueOf(int i) {
        return forNumber(i);
    }
}
