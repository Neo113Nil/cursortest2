package com.datadog.trace.api.normalize;

import java.util.ArrayList;
import java.util.StringTokenizer;

/* loaded from: classes4.dex */
public final class AntPathMatcher {
    public static final String[] EMPTY_STRING_ARRAY = new String[0];

    /* JADX WARN: Code restructure failed: missing block: B:100:?, code lost:
    
        return r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0036, code lost:
    
        if (r7 <= r4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0038, code lost:
    
        if (r5 > r2) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003c, code lost:
    
        if (r0[r5] == '*') goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003f, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0042, code lost:
    
        r9 = r0[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0044, code lost:
    
        if (r9 == '*') goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0046, code lost:
    
        if (r7 > r4) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0048, code lost:
    
        if (r9 == '?') goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004c, code lost:
    
        if (r9 == r1[r4]) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x004f, code lost:
    
        r2 = r2 - 1;
        r4 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0054, code lost:
    
        if (r7 <= r4) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0056, code lost:
    
        if (r5 > r2) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x005a, code lost:
    
        if (r0[r5] == '*') goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x005d, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0060, code lost:
    
        if (r5 == r2) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0062, code lost:
    
        if (r7 > r4) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0064, code lost:
    
        r9 = r5 + 1;
        r11 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0068, code lost:
    
        if (r11 > r2) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x006c, code lost:
    
        if (r0[r11] != '*') goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006f, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0073, code lost:
    
        if (r11 != r9) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0077, code lost:
    
        r9 = (r11 - r5) - r3;
        r13 = (r4 - r7) + r3;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0080, code lost:
    
        if (r14 > (r13 - r9)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0083, code lost:
    
        if (r15 >= r9) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0085, code lost:
    
        r17 = r3;
        r3 = r0[(r5 + r15) + 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x008d, code lost:
    
        if (r3 == '?') goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0097, code lost:
    
        if (r3 == r1[(r7 + r14) + r15]) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0099, code lost:
    
        r14 = r14 + 1;
        r3 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00a0, code lost:
    
        r15 = r15 + 1;
        r3 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00a5, code lost:
    
        r17 = r3;
        r18 = false;
        r7 = r7 + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00b0, code lost:
    
        if (r7 != (-1)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00b3, code lost:
    
        r7 = r7 + r9;
        r3 = r17;
        r5 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:?, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00ab, code lost:
    
        r17 = r3;
        r18 = false;
        r7 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0075, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0072, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00b8, code lost:
    
        r17 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00bc, code lost:
    
        if (r5 > r2) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00c0, code lost:
    
        if (r0[r5] == '*') goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00c3, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:?, code lost:
    
        return false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean matchStrings(String str, String str2) {
        char[] charArray = str.toCharArray();
        char[] charArray2 = str2.toCharArray();
        int i = 1;
        int length = charArray.length - 1;
        int length2 = charArray2.length - 1;
        for (char c : charArray) {
            if (c == '*') {
                if (length != 0) {
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        char c2 = charArray[i2];
                        if (c2 == '*' || i3 > length2) {
                            break;
                        }
                        if (c2 != '?' && c2 != charArray2[i3]) {
                            break;
                        }
                        i2++;
                        i3++;
                    }
                    return false;
                }
                return true;
            }
        }
        if (length != length2) {
            return false;
        }
        for (int i4 = 0; i4 <= length; i4++) {
            char c3 = charArray[i4];
            if (c3 != '?' && c3 != charArray2[i4]) {
                return false;
            }
        }
        return true;
    }

    public static String[] tokenizeToStringArray(String str) {
        String[] strArr = EMPTY_STRING_ARRAY;
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, "/");
            ArrayList arrayList = new ArrayList();
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                if (nextToken.length() > 0) {
                    arrayList.add(nextToken);
                }
            }
            if (!arrayList.isEmpty()) {
                return (String[]) arrayList.toArray(strArr);
            }
        }
        return strArr;
    }
}
