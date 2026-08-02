package com.anythink.basead.exoplayer.k;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    private static final int f9127a = 4;

    /* renamed from: b, reason: collision with root package name */
    private static final int f9128b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final int f9129c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f9130d = 2;

    /* renamed from: e, reason: collision with root package name */
    private static final int f9131e = 3;

    private ae() {
    }

    private static Uri a(Uri uri, String str) {
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.clearQuery();
        for (String str2 : uri.getQueryParameterNames()) {
            if (!str2.equals(str)) {
                Iterator<String> it = uri.getQueryParameters(str2).iterator();
                while (it.hasNext()) {
                    buildUpon.appendQueryParameter(str2, it.next());
                }
            }
        }
        return buildUpon.build();
    }

    private static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] a9 = a(str2);
        if (a9[0] != -1) {
            sb.append(str2);
            a(sb, a9[1], a9[2]);
            return sb.toString();
        }
        int[] a10 = a(str);
        if (a9[3] == 0) {
            sb.append((CharSequence) str, 0, a10[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (a9[2] == 0) {
            sb.append((CharSequence) str, 0, a10[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i = a9[1];
        if (i != 0) {
            int i4 = a10[0] + 1;
            sb.append((CharSequence) str, 0, i4);
            sb.append(str2);
            return a(sb, a9[1] + i4, i4 + a9[2]);
        }
        if (str2.charAt(i) == '/') {
            sb.append((CharSequence) str, 0, a10[1]);
            sb.append(str2);
            int i6 = a10[1];
            return a(sb, i6, a9[2] + i6);
        }
        int i9 = a10[0] + 2;
        int i10 = a10[1];
        if (i9 >= i10 || i10 != a10[2]) {
            int lastIndexOf = str.lastIndexOf(47, a10[2] - 1);
            int i11 = lastIndexOf == -1 ? a10[1] : lastIndexOf + 1;
            sb.append((CharSequence) str, 0, i11);
            sb.append(str2);
            return a(sb, a10[1], i11 + a9[2]);
        }
        sb.append((CharSequence) str, 0, i10);
        sb.append('/');
        sb.append(str2);
        int i12 = a10[1];
        return a(sb, i12, a9[2] + i12 + 1);
    }

    private static String a(StringBuilder sb, int i, int i4) {
        int i6;
        int i9;
        if (i >= i4) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i10 = i;
        int i11 = i10;
        while (i10 <= i4) {
            if (i10 == i4) {
                i6 = i10;
            } else if (sb.charAt(i10) == '/') {
                i6 = i10 + 1;
            } else {
                i10++;
            }
            int i12 = i11 + 1;
            if (i10 == i12 && sb.charAt(i11) == '.') {
                sb.delete(i11, i6);
                i9 = i6 - i11;
            } else if (i10 == i11 + 2 && sb.charAt(i11) == '.' && sb.charAt(i12) == '.') {
                i11 = sb.lastIndexOf("/", i11 - 2) + 1;
                int i13 = i11 > i ? i11 : i;
                sb.delete(i13, i6);
                i9 = i6 - i13;
            } else {
                i11 = i10 + 1;
                i10 = i11;
            }
            i4 -= i9;
            i10 = i11;
        }
        return sb.toString();
    }

    private static int[] a(String str) {
        int i;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i4 = indexOf4 + 2;
        if (i4 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i4) == '/') {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    private static Uri a(String str, String str2) {
        String a9;
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] a10 = a(str2);
        if (a10[0] != -1) {
            sb.append(str2);
            a(sb, a10[1], a10[2]);
            a9 = sb.toString();
        } else {
            int[] a11 = a(str);
            if (a10[3] == 0) {
                sb.append((CharSequence) str, 0, a11[3]);
                sb.append(str2);
                a9 = sb.toString();
            } else if (a10[2] == 0) {
                sb.append((CharSequence) str, 0, a11[2]);
                sb.append(str2);
                a9 = sb.toString();
            } else {
                int i = a10[1];
                if (i != 0) {
                    int i4 = a11[0] + 1;
                    sb.append((CharSequence) str, 0, i4);
                    sb.append(str2);
                    a9 = a(sb, a10[1] + i4, i4 + a10[2]);
                } else if (str2.charAt(i) == '/') {
                    sb.append((CharSequence) str, 0, a11[1]);
                    sb.append(str2);
                    int i6 = a11[1];
                    a9 = a(sb, i6, a10[2] + i6);
                } else {
                    int i9 = a11[0] + 2;
                    int i10 = a11[1];
                    if (i9 < i10 && i10 == a11[2]) {
                        sb.append((CharSequence) str, 0, i10);
                        sb.append('/');
                        sb.append(str2);
                        int i11 = a11[1];
                        a9 = a(sb, i11, a10[2] + i11 + 1);
                    } else {
                        int lastIndexOf = str.lastIndexOf(47, a11[2] - 1);
                        int i12 = lastIndexOf == -1 ? a11[1] : lastIndexOf + 1;
                        sb.append((CharSequence) str, 0, i12);
                        sb.append(str2);
                        a9 = a(sb, a11[1], i12 + a10[2]);
                    }
                }
            }
        }
        return Uri.parse(a9);
    }
}
