package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes5.dex */
public enum Y implements Internal.EnumLite {
    USER_INPUT_PROMPT_DISPLAY_MODE_UNKNOWN(0),
    USER_INPUT_PROMPT_DISPLAY_MODE_SINGLE_PROMPTS(1),
    USER_INPUT_PROMPT_DISPLAY_MODE_FORM_LIST(2),
    UNRECOGNIZED(-1);

    public static final int USER_INPUT_PROMPT_DISPLAY_MODE_FORM_LIST_VALUE = 2;
    public static final int USER_INPUT_PROMPT_DISPLAY_MODE_SINGLE_PROMPTS_VALUE = 1;
    public static final int USER_INPUT_PROMPT_DISPLAY_MODE_UNKNOWN_VALUE = 0;
    public static final a b = new a();
    public final int a;

    public class a implements Internal.EnumLiteMap<Y> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Y findValueByNumber(int i) {
            return Y.forNumber(i);
        }
    }

    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return Y.forNumber(i) != null;
        }
    }

    Y(int i) {
        this.a = i;
    }

    public static Y forNumber(int i) {
        if (i == 0) {
            return USER_INPUT_PROMPT_DISPLAY_MODE_UNKNOWN;
        }
        if (i == 1) {
            return USER_INPUT_PROMPT_DISPLAY_MODE_SINGLE_PROMPTS;
        }
        if (i != 2) {
            return null;
        }
        return USER_INPUT_PROMPT_DISPLAY_MODE_FORM_LIST;
    }

    public static Internal.EnumLiteMap<Y> internalGetValueMap() {
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
    public static Y valueOf(int i) {
        return forNumber(i);
    }
}
