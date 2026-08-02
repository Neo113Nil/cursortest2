package com.anythink.basead.d;

import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    protected String f6930a;

    /* renamed from: b, reason: collision with root package name */
    protected String f6931b;

    public f(String str, String str2) {
        this.f6930a = str;
        this.f6931b = str2;
    }

    public final String a() {
        return this.f6930a;
    }

    public final String b() {
        return this.f6931b;
    }

    public final String c() {
        StringBuilder sb = new StringBuilder("code[ ");
        sb.append(this.f6930a);
        sb.append(" ],desc[ ");
        return Wv.i(sb, this.f6931b, " ]");
    }
}
