package com.google.android.gms.internal.ads;

import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.mE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3556mE implements KD, InterfaceC3742pl {

    /* renamed from: A, reason: collision with root package name */
    public static final C3556mE f31913A;

    /* renamed from: B, reason: collision with root package name */
    public static final C3556mE f31914B;

    /* renamed from: C, reason: collision with root package name */
    public static final C3556mE f31915C;

    /* renamed from: D, reason: collision with root package name */
    public static final C3556mE f31916D;

    /* renamed from: E, reason: collision with root package name */
    public static final C3556mE f31917E;

    /* renamed from: F, reason: collision with root package name */
    public static final C3556mE f31918F;

    /* renamed from: G, reason: collision with root package name */
    public static final C3556mE f31919G;

    /* renamed from: H, reason: collision with root package name */
    public static final C3556mE f31920H;

    /* renamed from: I, reason: collision with root package name */
    public static final C3556mE f31921I;
    public static final C3556mE J;

    /* renamed from: K, reason: collision with root package name */
    public static final C3556mE f31922K;

    /* renamed from: L, reason: collision with root package name */
    public static final C3556mE f31923L;

    /* renamed from: M, reason: collision with root package name */
    public static final C3556mE f31924M;

    /* renamed from: v, reason: collision with root package name */
    public static final C3556mE f31925v;

    /* renamed from: w, reason: collision with root package name */
    public static final C3556mE f31926w;

    /* renamed from: x, reason: collision with root package name */
    public static final C3556mE f31927x;

    /* renamed from: y, reason: collision with root package name */
    public static final C3556mE f31928y;

    /* renamed from: z, reason: collision with root package name */
    public static final C3556mE f31929z;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f31930n;

    /* renamed from: u, reason: collision with root package name */
    public final String f31931u;

    static {
        int i = 0;
        f31925v = new C3556mE("ENABLED", i);
        f31926w = new C3556mE("DISABLED", i);
        f31927x = new C3556mE("DESTROYED", i);
        int i6 = 1;
        f31928y = new C3556mE("TINK", i6);
        f31929z = new C3556mE("CRUNCHY", i6);
        f31913A = new C3556mE("NO_PREFIX", i6);
        int i9 = 2;
        f31914B = new C3556mE("TINK", i9);
        f31915C = new C3556mE("CRUNCHY", i9);
        f31916D = new C3556mE("NO_PREFIX", i9);
        int i10 = 3;
        f31917E = new C3556mE("TINK", i10);
        f31918F = new C3556mE("NO_PREFIX", i10);
        int i11 = 4;
        f31919G = new C3556mE("SHA256", i11);
        f31920H = new C3556mE("SHA384", i11);
        f31921I = new C3556mE("SHA512", i11);
        int i12 = 5;
        J = new C3556mE("TINK", i12);
        f31922K = new C3556mE("CRUNCHY", i12);
        f31923L = new C3556mE("LEGACY", i12);
        f31924M = new C3556mE("NO_PREFIX", i12);
    }

    public /* synthetic */ C3556mE(String str, int i) {
        this.f31930n = i;
        this.f31931u = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3742pl, com.google.android.gms.internal.ads.InterfaceC3529lo
    /* renamed from: a */
    public /* synthetic */ void mo1a(Object obj) {
        ((InterfaceC4011ul) obj).b(this.f31931u);
    }

    public String toString() {
        switch (this.f31930n) {
            case 0:
                return this.f31931u;
            case 1:
                return this.f31931u;
            case 2:
                return this.f31931u;
            case 3:
                return this.f31931u;
            case 4:
                return this.f31931u;
            case 5:
                return this.f31931u;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        C4835j.f39733C.f39743h.e(this.f31931u, th);
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo11n(Object obj) {
    }
}
