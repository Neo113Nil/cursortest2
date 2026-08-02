package com.anythink.core.common.h;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private String f14755a;

    /* renamed from: b, reason: collision with root package name */
    private String f14756b;

    /* renamed from: c, reason: collision with root package name */
    private int f14757c;

    public i(String str, String str2, int i) {
        this.f14755a = str;
        this.f14756b = str2;
        this.f14757c = i;
    }

    private String b() {
        return this.f14755a;
    }

    private int c() {
        return this.f14757c;
    }

    public final String a() {
        return this.f14756b;
    }

    public final boolean a(bv bvVar) {
        if (bvVar != null) {
            int i = bvVar.f14588a;
            return i != 2 ? i == 3 && bvVar.g() == this.f14757c : bvVar.z().equals(this.f14755a);
        }
        return false;
    }
}
