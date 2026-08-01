package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class Es implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final String f24665a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f24666b;

    /* renamed from: c, reason: collision with root package name */
    public final String f24667c;

    /* renamed from: d, reason: collision with root package name */
    public final String f24668d;

    /* renamed from: e, reason: collision with root package name */
    public final String f24669e;

    /* renamed from: f, reason: collision with root package name */
    public final String f24670f;

    public Es(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.f24665a = str;
        this.f24666b = num;
        this.f24667c = str2;
        this.f24668d = str3;
        this.f24669e = str4;
        this.f24670f = str5;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        MA.M("pn", bundle, this.f24665a);
        Integer num = this.f24666b;
        if (num != null) {
            bundle.putInt(com.anythink.expressad.foundation.g.a.f19065M, num.intValue());
        }
        MA.M("vnm", bundle, this.f24667c);
        MA.M("dl", bundle, this.f24668d);
        MA.M("ins_pn", bundle, this.f24669e);
        MA.M("ini_pn", bundle, this.f24670f);
    }
}
