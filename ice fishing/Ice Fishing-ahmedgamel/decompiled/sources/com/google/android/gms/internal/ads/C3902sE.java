package com.google.android.gms.internal.ads;

import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.sE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3902sE {

    /* renamed from: c, reason: collision with root package name */
    public static final C3902sE f34677c;

    /* renamed from: d, reason: collision with root package name */
    public static final C3902sE f34678d;

    /* renamed from: e, reason: collision with root package name */
    public static final C3902sE f34679e;

    /* renamed from: f, reason: collision with root package name */
    public static final C3902sE f34680f;

    /* renamed from: g, reason: collision with root package name */
    public static final C3902sE f34681g;

    /* renamed from: h, reason: collision with root package name */
    public static final C3902sE f34682h;
    public static final C3902sE i;

    /* renamed from: j, reason: collision with root package name */
    public static final C3902sE f34683j;

    /* renamed from: k, reason: collision with root package name */
    public static final C3902sE f34684k;

    /* renamed from: l, reason: collision with root package name */
    public static final C3902sE f34685l;

    /* renamed from: m, reason: collision with root package name */
    public static final C3902sE f34686m;

    /* renamed from: n, reason: collision with root package name */
    public static final C3902sE f34687n;

    /* renamed from: o, reason: collision with root package name */
    public static final C3902sE f34688o;

    /* renamed from: p, reason: collision with root package name */
    public static final C3902sE f34689p;

    /* renamed from: q, reason: collision with root package name */
    public static final C3902sE f34690q;

    /* renamed from: r, reason: collision with root package name */
    public static final C3902sE f34691r;

    /* renamed from: s, reason: collision with root package name */
    public static final C3902sE f34692s;

    /* renamed from: t, reason: collision with root package name */
    public static final C3902sE f34693t;

    /* renamed from: u, reason: collision with root package name */
    public static final C3902sE f34694u;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34695a;

    /* renamed from: b, reason: collision with root package name */
    public String f34696b;

    static {
        int i4 = 0;
        f34677c = new C3902sE("UNKNOWN_KEYMATERIAL", i4);
        f34678d = new C3902sE("SYMMETRIC", i4);
        f34679e = new C3902sE("ASYMMETRIC_PRIVATE", i4);
        f34680f = new C3902sE("ASYMMETRIC_PUBLIC", i4);
        f34681g = new C3902sE("REMOTE", i4);
        int i6 = 1;
        f34682h = new C3902sE("TINK", i6);
        i = new C3902sE("CRUNCHY", i6);
        f34683j = new C3902sE("NO_PREFIX", i6);
        int i9 = 2;
        f34684k = new C3902sE("TINK", i9);
        f34685l = new C3902sE("NO_PREFIX", i9);
        int i10 = 3;
        f34686m = new C3902sE("TINK", i10);
        f34687n = new C3902sE("CRUNCHY", i10);
        f34688o = new C3902sE("NO_PREFIX", i10);
        int i11 = 4;
        f34689p = new C3902sE("IEEE_P1363", i11);
        f34690q = new C3902sE("DER", i11);
        int i12 = 5;
        f34691r = new C3902sE("TINK", i12);
        f34692s = new C3902sE("CRUNCHY", i12);
        f34693t = new C3902sE("LEGACY", i12);
        f34694u = new C3902sE("NO_PREFIX", i12);
    }

    public static C3902sE a(Cr cr) {
        String str;
        cr.G(2);
        int K7 = cr.K();
        int i4 = K7 >> 1;
        int i6 = K7 & 1;
        int K8 = cr.K() >> 3;
        if (i4 == 4 || i4 == 5 || i4 == 7 || i4 == 8) {
            str = "dvhe";
        } else if (i4 == 9) {
            str = "dvav";
        } else {
            if (i4 != 10) {
                return null;
            }
            str = "dav1";
        }
        int i9 = K8 | (i6 << 5);
        String str2 = com.anythink.core.common.d.j.f13164z;
        String str3 = i4 < 10 ? ".0" : com.anythink.core.common.d.j.f13164z;
        int length = str3.length() + 4;
        int length2 = String.valueOf(i4).length();
        int length3 = String.valueOf(i9).length();
        if (i9 < 10) {
            str2 = ".0";
        }
        StringBuilder sb = new StringBuilder(AbstractC5128c.j(length + length2, length3, str2));
        sb.append(str);
        sb.append(str3);
        sb.append(i4);
        sb.append(str2);
        sb.append(i9);
        return new C3902sE(sb.toString(), 7);
    }

    public String toString() {
        switch (this.f34695a) {
            case 0:
                return this.f34696b;
            case 1:
                return this.f34696b;
            case 2:
                return this.f34696b;
            case 3:
                return this.f34696b;
            case 4:
                return this.f34696b;
            case 5:
                return this.f34696b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C3902sE(String str, int i4) {
        this.f34695a = i4;
        this.f34696b = str;
    }
}
