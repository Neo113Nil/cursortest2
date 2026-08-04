package com.gamericefishpro.space.m0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final String a;
    public static final String b;

    static {
        String str;
        Intrinsics.checkNotNullParameter("H", "<this>");
        int length = "H".length();
        if (length != 0) {
            int i = 1;
            if (length != 1) {
                StringBuilder sb = new StringBuilder("H".length() * 10);
                while (true) {
                    sb.append((CharSequence) "H");
                    if (i == 10) {
                        break;
                    } else {
                        i++;
                    }
                }
                str = sb.toString();
                Intrinsics.b(str);
            } else {
                char cCharAt = "H".charAt(0);
                char[] cArr = new char[10];
                for (int i2 = 0; i2 < 10; i2++) {
                    cArr[i2] = cCharAt;
                }
                str = new String(cArr);
            }
        } else {
            str = "";
        }
        a = str;
        b = str + '\n' + str;
    }
}
