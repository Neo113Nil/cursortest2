package com.instagram.common.viewpoint.core;

import android.graphics.PointF;
import com.anythink.core.common.s.a.c;
import com.anythink.expressad.video.module.a.a;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: assets/audience_network/classes2.dex */
public final class K9 {
    public static byte[] A02;
    public static String[] A03 = {"HuWf33fpJVnWiQs5jgU1coBxnkVs6NRv", "s99wI42TXu9zb6TF", "znB4eml4mMdVjhFim0h8Ic", "vwm3UU3z6IIrXLlJTF572ZAqfrELMHnc", "3Hoi8QCDYq5dLz7zrQI8B3P9CeceMza0", "88mhCIZfB8fBAcvooczZpqGcVMp3sArj", "twULWMK01HtAAxLhlSW3WXsxhxQi2bS3", "0mJGu"};
    public static final Pattern A04;
    public static final Pattern A05;
    public static final Pattern A06;
    public static final Pattern A07;
    public final int A00;
    public final PointF A01;

    public static String A03(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 13);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A02 = new byte[]{71, 124, 69, 86, 65, 65, 90, 87, 86, 19, 91, 82, c.f16317b, 19, 81, 92, 71, 91, 19, 111, 67, 92, c.f16317b, 27, 75, 31, 74, 26, 19, 82, 93, 87, 19, 111, 94, 92, 69, 86, 27, 75, 2, 31, 74, 2, 31, 75, 1, 31, 74, 1, 26, 8, 19, 70, c.f16317b, 90, 93, 84, 19, 111, 67, 92, c.f16317b, 19, 69, 82, 95, 70, 86, c.f16317b, 29, 19, 92, 69, 86, 65, 65, 90, 87, 86, 14, 20, 45, 13, 31, 45, 10, 7, 18, 27, 80, 49, 8, 27, 12, 12, 23, 26, 27, 13, 28, 28, 33, 46, 104, 28, 36, 107, 105, 15, 15, 62, 60, 37, 54, 15, 123, 118, 98, 119, 32, Byte.MAX_VALUE, 118, 98, 119, 32, Byte.MAX_VALUE, 123, 118, 98, 119, 32, 122, Byte.MAX_VALUE, 123, 118, 98, 119, 32, 122, 123, 108, 105, Byte.MAX_VALUE, 118, 98, 119, 32, Byte.MAX_VALUE, 118, 98, 119, 32, 122, 108, 15, 122, 65, 65, 109, 114, 110, 65, 53, 53, 56, 44, 57, 110, 52, 49, 53, 56, 44, 57, 110, 52, 65, 52, 56, 23, 78, 56, 0, 79, 76, 91, 94, 56, 74, 56, 0, 79, 77, 91, 56, 23, 78, 70, 97, 50, 65, 68, 103, 71, 48, 51, 70, 103};
    }

    static {
        A05();
        A05 = Pattern.compile(A03(198, 11, 23));
        String A032 = A03(179, 19, 105);
        A07 = Pattern.compile(C5C.A0n(A03(157, 22, 16), A032));
        A06 = Pattern.compile(C5C.A0n(A03(a.f21756z, 48, 94), A032));
        A04 = Pattern.compile(A03(100, 9, 77));
    }

    public K9(int i, PointF pointF) {
        this.A00 = i;
        this.A01 = pointF;
    }

    public static int A00(String str) {
        int A01;
        Matcher matcher = A04.matcher(str);
        if (!matcher.find()) {
            return -1;
        }
        if (A03[1].length() == 17) {
            throw new RuntimeException();
        }
        A03[2] = "vLvehkH4B3ak8JU9onbvIk";
        A01 = KC.A01((String) AbstractC06243y.A01(matcher.group(1)));
        return A01;
    }

    public static PointF A01(String str) {
        String group;
        String group2;
        Matcher matcher = A07.matcher(str);
        Matcher matcher2 = A06.matcher(str);
        boolean find = matcher.find();
        boolean find2 = matcher2.find();
        if (find) {
            if (find2) {
                AbstractC06324g.A06(A03(82, 18, 115), A03(1, 81, 62) + str + A03(0, 1, a.f21756z));
            }
            group = matcher.group(1);
            group2 = matcher.group(2);
        } else if (find2) {
            group = matcher2.group(1);
            group2 = matcher2.group(2);
        } else {
            return null;
        }
        return new PointF(Float.parseFloat(((String) AbstractC06243y.A01(group)).trim()), Float.parseFloat(((String) AbstractC06243y.A01(group2)).trim()));
    }

    public static K9 A02(String str) {
        int parsedAlignment = -1;
        PointF pointF = null;
        Matcher matcher = A05.matcher(str);
        while (true) {
            boolean find = matcher.find();
            if (A03[1].length() == 17) {
                break;
            }
            A03[2] = "4wlmcdEyXnPZaqMgrsXq3d";
            if (find) {
                String group = matcher.group(1);
                if (A03[1].length() == 17) {
                    break;
                }
                A03[2] = "M6jPqZAMoTJlOEJJxCI750";
                String str2 = (String) AbstractC06243y.A01(group);
                try {
                    PointF position = A01(str2);
                    if (position != null) {
                        pointF = position;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int A00 = A00(str2);
                    if (A00 != -1) {
                        parsedAlignment = A00;
                    }
                } catch (RuntimeException unused2) {
                }
            } else {
                return new K9(parsedAlignment, pointF);
            }
        }
        throw new RuntimeException();
    }

    public static String A04(String str) {
        return A05.matcher(str).replaceAll(A03(0, 0, 78));
    }
}
