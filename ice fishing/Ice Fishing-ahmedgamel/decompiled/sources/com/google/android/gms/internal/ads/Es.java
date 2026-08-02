package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class Es implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final String f25421a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f25422b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25423c;

    /* renamed from: d, reason: collision with root package name */
    public final String f25424d;

    /* renamed from: e, reason: collision with root package name */
    public final String f25425e;

    /* renamed from: f, reason: collision with root package name */
    public final String f25426f;

    public Es(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.f25421a = str;
        this.f25422b = num;
        this.f25423c = str2;
        this.f25424d = str3;
        this.f25425e = str4;
        this.f25426f = str5;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        MA.M("pn", bundle, this.f25421a);
        Integer num = this.f25422b;
        if (num != null) {
            bundle.putInt(com.anythink.expressad.foundation.g.a.f19852M, num.intValue());
        }
        MA.M("vnm", bundle, this.f25423c);
        MA.M("dl", bundle, this.f25424d);
        MA.M("ins_pn", bundle, this.f25425e);
        MA.M("ini_pn", bundle, this.f25426f);
    }
}
