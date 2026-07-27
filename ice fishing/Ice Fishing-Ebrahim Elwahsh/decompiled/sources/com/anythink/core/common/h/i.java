package com.anythink.core.common.h;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private String f14126a;

    /* renamed from: b, reason: collision with root package name */
    private String f14127b;

    /* renamed from: c, reason: collision with root package name */
    private int f14128c;

    public i(String str, String str2, int i) {
        this.f14126a = str;
        this.f14127b = str2;
        this.f14128c = i;
    }

    private String b() {
        return this.f14126a;
    }

    private int c() {
        return this.f14128c;
    }

    public final String a() {
        return this.f14127b;
    }

    public final boolean a(bv bvVar) {
        if (bvVar != null) {
            int i = bvVar.f13959a;
            return i != 2 ? i == 3 && bvVar.g() == this.f14128c : bvVar.z().equals(this.f14126a);
        }
        return false;
    }
}
