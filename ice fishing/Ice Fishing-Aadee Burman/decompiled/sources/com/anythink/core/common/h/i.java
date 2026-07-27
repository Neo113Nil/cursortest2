package com.anythink.core.common.h;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private String f13969a;

    /* renamed from: b, reason: collision with root package name */
    private String f13970b;

    /* renamed from: c, reason: collision with root package name */
    private int f13971c;

    public i(String str, String str2, int i) {
        this.f13969a = str;
        this.f13970b = str2;
        this.f13971c = i;
    }

    private String b() {
        return this.f13969a;
    }

    private int c() {
        return this.f13971c;
    }

    public final String a() {
        return this.f13970b;
    }

    public final boolean a(bv bvVar) {
        if (bvVar != null) {
            int i = bvVar.f13802a;
            return i != 2 ? i == 3 && bvVar.g() == this.f13971c : bvVar.z().equals(this.f13969a);
        }
        return false;
    }
}
