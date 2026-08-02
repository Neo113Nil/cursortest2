package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.na, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3646na {

    /* renamed from: b, reason: collision with root package name */
    public static final C3646na f33520b = new C3646na(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C3646na f33521c = new C3646na(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C3646na f33522d = new C3646na(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33523a;

    public /* synthetic */ C3646na(int i) {
        this.f33523a = i;
    }

    public static final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 0;
        int i4 = 0;
        while (i4 < str.length() && str.charAt(i4) == ',') {
            i4++;
        }
        while (length > 0) {
            int i6 = length - 1;
            if (str.charAt(i6) != ',') {
                break;
            }
            length = i6;
        }
        if (length < i4) {
            return null;
        }
        if (i4 != 0) {
            i = i4;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i, length);
    }

    public final String a(String str, String str2) {
        switch (this.f33523a) {
            case 0:
                return str2;
            case 1:
                return str != null ? str : str2;
            default:
                String b9 = b(str);
                String b10 = b(str2);
                if (TextUtils.isEmpty(b9)) {
                    return b10;
                }
                if (TextUtils.isEmpty(b10)) {
                    return b9;
                }
                return D.x.p(new StringBuilder(String.valueOf(b9).length() + 1 + String.valueOf(b10).length()), b9, ",", b10);
        }
    }
}
