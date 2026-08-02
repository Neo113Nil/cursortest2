package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class Wq {

    /* renamed from: a, reason: collision with root package name */
    public final String f29190a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29191b;

    /* renamed from: c, reason: collision with root package name */
    public int f29192c;

    /* renamed from: d, reason: collision with root package name */
    public long f29193d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f29194e;

    public Wq(String str, String str2, int i, long j6, Integer num) {
        this.f29190a = str;
        this.f29191b = str2;
        this.f29192c = i;
        this.f29193d = j6;
        this.f29194e = num;
    }

    public final String toString() {
        Integer num;
        int i = this.f29192c;
        long j6 = this.f29193d;
        String str = this.f29190a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(i).length() + 1 + String.valueOf(j6).length());
        sb.append(str);
        sb.append(com.anythink.core.common.d.j.f13164z);
        sb.append(i);
        sb.append(com.anythink.core.common.d.j.f13164z);
        sb.append(j6);
        String sb2 = sb.toString();
        String str2 = this.f29191b;
        if (!TextUtils.isEmpty(str2)) {
            sb2 = D.x.p(new StringBuilder(sb2.length() + 1 + String.valueOf(str2).length()), sb2, com.anythink.core.common.d.j.f13164z, str2);
        }
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33059j2)).booleanValue() || (num = this.f29194e) == null || TextUtils.isEmpty(str2)) {
            return sb2;
        }
        StringBuilder sb3 = new StringBuilder(sb2.length() + 1 + num.toString().length());
        sb3.append(sb2);
        sb3.append(com.anythink.core.common.d.j.f13164z);
        sb3.append(num);
        return sb3.toString();
    }
}
