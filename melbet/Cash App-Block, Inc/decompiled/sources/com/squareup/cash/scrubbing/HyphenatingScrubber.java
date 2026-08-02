package com.squareup.cash.scrubbing;

import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda1;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes7.dex */
public final class HyphenatingScrubber implements InsertingScrubber {
    public final Function1 hyphenateModeAtPosition = new CalloutKt$$ExternalSyntheticLambda1(12);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class HyphenateMode {
        public static final /* synthetic */ HyphenateMode[] $VALUES;
        public static final HyphenateMode POSTFIX;
        public static final HyphenateMode PREFIX;

        static {
            HyphenateMode hyphenateMode = new HyphenateMode("PREFIX", 0);
            PREFIX = hyphenateMode;
            HyphenateMode hyphenateMode2 = new HyphenateMode("POSTFIX", 1);
            POSTFIX = hyphenateMode2;
            $VALUES = new HyphenateMode[]{hyphenateMode, hyphenateMode2};
        }

        public static HyphenateMode valueOf(String str) {
            return (HyphenateMode) Enum.valueOf(HyphenateMode.class, str);
        }

        public static HyphenateMode[] values() {
            return (HyphenateMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r13.length() == (r12.length() - 1)) goto L8;
     */
    @Override // com.squareup.cash.scrubbing.InsertingScrubber
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String scrub(String str, String str2) {
        Function1 function1;
        int i;
        str.getClass();
        str2.getClass();
        int i2 = 0;
        boolean z = StringsKt__StringsJVMKt.startsWith(str, str2, false);
        StringBuilder sb = new StringBuilder();
        int length = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str2.charAt(i3);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        int length2 = sb2.length();
        int i4 = 0;
        while (true) {
            int length3 = sb2.length();
            function1 = this.hyphenateModeAtPosition;
            if (i2 >= length3) {
                break;
            }
            char charAt2 = sb2.charAt(i2);
            int i5 = i4 + 1;
            if (i4 == 0) {
                sb3.append(charAt2);
            } else {
                int i6 = i4 % 3;
                if (i6 == 0) {
                    if (function1.invoke(Integer.valueOf(i6 == 0 ? i4 / 3 : -1)) == HyphenateMode.PREFIX) {
                        sb3.append('-');
                    }
                }
                sb3.append(charAt2);
                int i7 = i5 % 3;
                if (i7 == 0) {
                    if (function1.invoke(Integer.valueOf(i7 == 0 ? i5 / 3 : -1)) == HyphenateMode.POSTFIX) {
                        sb3.append('-');
                    }
                }
            }
            i2++;
            i4 = i5;
        }
        if (z && sb3.length() > 0 && StringsKt___StringsKt.last(str2) != '-' && (i = length2 % 3) == 0) {
            if (function1.invoke(Integer.valueOf(i == 0 ? length2 / 3 : -1)) == HyphenateMode.POSTFIX) {
                sb3.delete(sb3.length() - 2, sb3.length());
            }
        }
        return sb3.toString();
    }
}
