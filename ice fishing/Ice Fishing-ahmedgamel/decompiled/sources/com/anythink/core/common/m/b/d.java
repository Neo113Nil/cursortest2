package com.anythink.core.common.m.b;

import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private String f15294a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f15295b = "";

    private d() {
    }

    public static d a(String str) {
        d dVar = new d();
        dVar.f15294a = str;
        return dVar;
    }

    private static d c() {
        return new d();
    }

    public final String b() {
        return this.f15294a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpReqEntity{urlType='");
        sb.append(this.f15294a);
        sb.append("', interceptKey='");
        return Wv.i(sb, this.f15295b, "'}");
    }

    private void b(String str) {
        this.f15295b = str;
    }

    public static d a(String str, String str2) {
        d dVar = new d();
        dVar.f15294a = str;
        dVar.f15295b = str2;
        return dVar;
    }

    public final String a() {
        return this.f15295b;
    }
}
