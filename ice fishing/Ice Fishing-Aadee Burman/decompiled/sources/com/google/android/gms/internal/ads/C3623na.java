package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.na, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3623na {

    /* renamed from: b, reason: collision with root package name */
    public static final C3623na f32733b = new C3623na(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C3623na f32734c = new C3623na(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C3623na f32735d = new C3623na(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32736a;

    public /* synthetic */ C3623na(int i) {
        this.f32736a = i;
    }

    public static final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 0;
        int i6 = 0;
        while (i6 < str.length() && str.charAt(i6) == ',') {
            i6++;
        }
        while (length > 0) {
            int i9 = length - 1;
            if (str.charAt(i9) != ',') {
                break;
            }
            length = i9;
        }
        if (length < i6) {
            return null;
        }
        if (i6 != 0) {
            i = i6;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i, length);
    }

    public final String a(String str, String str2) {
        switch (this.f32736a) {
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
                return D.y.s(new StringBuilder(String.valueOf(b9).length() + 1 + String.valueOf(b10).length()), b9, ",", b10);
        }
    }
}
