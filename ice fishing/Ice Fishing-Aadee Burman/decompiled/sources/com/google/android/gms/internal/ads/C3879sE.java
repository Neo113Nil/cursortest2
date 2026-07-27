package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3879sE {

    /* renamed from: c, reason: collision with root package name */
    public static final C3879sE f33909c;

    /* renamed from: d, reason: collision with root package name */
    public static final C3879sE f33910d;

    /* renamed from: e, reason: collision with root package name */
    public static final C3879sE f33911e;

    /* renamed from: f, reason: collision with root package name */
    public static final C3879sE f33912f;

    /* renamed from: g, reason: collision with root package name */
    public static final C3879sE f33913g;

    /* renamed from: h, reason: collision with root package name */
    public static final C3879sE f33914h;
    public static final C3879sE i;

    /* renamed from: j, reason: collision with root package name */
    public static final C3879sE f33915j;

    /* renamed from: k, reason: collision with root package name */
    public static final C3879sE f33916k;

    /* renamed from: l, reason: collision with root package name */
    public static final C3879sE f33917l;

    /* renamed from: m, reason: collision with root package name */
    public static final C3879sE f33918m;

    /* renamed from: n, reason: collision with root package name */
    public static final C3879sE f33919n;

    /* renamed from: o, reason: collision with root package name */
    public static final C3879sE f33920o;

    /* renamed from: p, reason: collision with root package name */
    public static final C3879sE f33921p;

    /* renamed from: q, reason: collision with root package name */
    public static final C3879sE f33922q;

    /* renamed from: r, reason: collision with root package name */
    public static final C3879sE f33923r;

    /* renamed from: s, reason: collision with root package name */
    public static final C3879sE f33924s;

    /* renamed from: t, reason: collision with root package name */
    public static final C3879sE f33925t;

    /* renamed from: u, reason: collision with root package name */
    public static final C3879sE f33926u;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33927a;

    /* renamed from: b, reason: collision with root package name */
    public String f33928b;

    static {
        int i6 = 0;
        f33909c = new C3879sE("UNKNOWN_KEYMATERIAL", i6);
        f33910d = new C3879sE("SYMMETRIC", i6);
        f33911e = new C3879sE("ASYMMETRIC_PRIVATE", i6);
        f33912f = new C3879sE("ASYMMETRIC_PUBLIC", i6);
        f33913g = new C3879sE("REMOTE", i6);
        int i9 = 1;
        f33914h = new C3879sE("TINK", i9);
        i = new C3879sE("CRUNCHY", i9);
        f33915j = new C3879sE("NO_PREFIX", i9);
        int i10 = 2;
        f33916k = new C3879sE("TINK", i10);
        f33917l = new C3879sE("NO_PREFIX", i10);
        int i11 = 3;
        f33918m = new C3879sE("TINK", i11);
        f33919n = new C3879sE("CRUNCHY", i11);
        f33920o = new C3879sE("NO_PREFIX", i11);
        int i12 = 4;
        f33921p = new C3879sE("IEEE_P1363", i12);
        f33922q = new C3879sE("DER", i12);
        int i13 = 5;
        f33923r = new C3879sE("TINK", i13);
        f33924s = new C3879sE("CRUNCHY", i13);
        f33925t = new C3879sE("LEGACY", i13);
        f33926u = new C3879sE("NO_PREFIX", i13);
    }

    public static C3879sE a(Cr cr) {
        String str;
        cr.G(2);
        int K7 = cr.K();
        int i6 = K7 >> 1;
        int i9 = K7 & 1;
        int K8 = cr.K() >> 3;
        if (i6 == 4 || i6 == 5 || i6 == 7 || i6 == 8) {
            str = "dvhe";
        } else if (i6 == 9) {
            str = "dvav";
        } else {
            if (i6 != 10) {
                return null;
            }
            str = "dav1";
        }
        int i10 = K8 | (i9 << 5);
        String str2 = com.anythink.core.common.d.j.f12378z;
        String str3 = i6 < 10 ? ".0" : com.anythink.core.common.d.j.f12378z;
        int length = str3.length() + 4;
        int length2 = String.valueOf(i6).length();
        int length3 = String.valueOf(i10).length();
        if (i10 < 10) {
            str2 = ".0";
        }
        StringBuilder sb = new StringBuilder(u1.h.a(length + length2, length3, str2));
        sb.append(str);
        sb.append(str3);
        sb.append(i6);
        sb.append(str2);
        sb.append(i10);
        return new C3879sE(sb.toString(), 7);
    }

    public String toString() {
        switch (this.f33927a) {
            case 0:
                return this.f33928b;
            case 1:
                return this.f33928b;
            case 2:
                return this.f33928b;
            case 3:
                return this.f33928b;
            case 4:
                return this.f33928b;
            case 5:
                return this.f33928b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C3879sE(String str, int i6) {
        this.f33927a = i6;
        this.f33928b = str;
    }
}
