package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class Wq {

    /* renamed from: a, reason: collision with root package name */
    public final String f28408a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28409b;

    /* renamed from: c, reason: collision with root package name */
    public int f28410c;

    /* renamed from: d, reason: collision with root package name */
    public long f28411d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f28412e;

    public Wq(String str, String str2, int i, long j6, Integer num) {
        this.f28408a = str;
        this.f28409b = str2;
        this.f28410c = i;
        this.f28411d = j6;
        this.f28412e = num;
    }

    public final String toString() {
        Integer num;
        int i = this.f28410c;
        long j6 = this.f28411d;
        String str = this.f28408a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(i).length() + 1 + String.valueOf(j6).length());
        sb.append(str);
        sb.append(com.anythink.core.common.d.j.f12378z);
        sb.append(i);
        sb.append(com.anythink.core.common.d.j.f12378z);
        sb.append(j6);
        String sb2 = sb.toString();
        String str2 = this.f28409b;
        if (!TextUtils.isEmpty(str2)) {
            sb2 = D.y.s(new StringBuilder(sb2.length() + 1 + String.valueOf(str2).length()), sb2, com.anythink.core.common.d.j.f12378z, str2);
        }
        if (!((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32280j2)).booleanValue() || (num = this.f28412e) == null || TextUtils.isEmpty(str2)) {
            return sb2;
        }
        StringBuilder sb3 = new StringBuilder(sb2.length() + 1 + num.toString().length());
        sb3.append(sb2);
        sb3.append(com.anythink.core.common.d.j.f12378z);
        sb3.append(num);
        return sb3.toString();
    }
}
