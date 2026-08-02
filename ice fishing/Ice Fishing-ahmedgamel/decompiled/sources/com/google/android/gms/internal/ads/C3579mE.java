package com.google.android.gms.internal.ads;

import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.mE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3579mE implements KD, InterfaceC3765pl {

    /* renamed from: A, reason: collision with root package name */
    public static final C3579mE f32693A;

    /* renamed from: B, reason: collision with root package name */
    public static final C3579mE f32694B;

    /* renamed from: C, reason: collision with root package name */
    public static final C3579mE f32695C;

    /* renamed from: D, reason: collision with root package name */
    public static final C3579mE f32696D;

    /* renamed from: E, reason: collision with root package name */
    public static final C3579mE f32697E;

    /* renamed from: F, reason: collision with root package name */
    public static final C3579mE f32698F;

    /* renamed from: G, reason: collision with root package name */
    public static final C3579mE f32699G;

    /* renamed from: H, reason: collision with root package name */
    public static final C3579mE f32700H;

    /* renamed from: I, reason: collision with root package name */
    public static final C3579mE f32701I;
    public static final C3579mE J;

    /* renamed from: K, reason: collision with root package name */
    public static final C3579mE f32702K;

    /* renamed from: L, reason: collision with root package name */
    public static final C3579mE f32703L;

    /* renamed from: M, reason: collision with root package name */
    public static final C3579mE f32704M;

    /* renamed from: v, reason: collision with root package name */
    public static final C3579mE f32705v;

    /* renamed from: w, reason: collision with root package name */
    public static final C3579mE f32706w;

    /* renamed from: x, reason: collision with root package name */
    public static final C3579mE f32707x;

    /* renamed from: y, reason: collision with root package name */
    public static final C3579mE f32708y;

    /* renamed from: z, reason: collision with root package name */
    public static final C3579mE f32709z;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32710n;

    /* renamed from: u, reason: collision with root package name */
    public final String f32711u;

    static {
        int i = 0;
        f32705v = new C3579mE("ENABLED", i);
        f32706w = new C3579mE("DISABLED", i);
        f32707x = new C3579mE("DESTROYED", i);
        int i4 = 1;
        f32708y = new C3579mE("TINK", i4);
        f32709z = new C3579mE("CRUNCHY", i4);
        f32693A = new C3579mE("NO_PREFIX", i4);
        int i6 = 2;
        f32694B = new C3579mE("TINK", i6);
        f32695C = new C3579mE("CRUNCHY", i6);
        f32696D = new C3579mE("NO_PREFIX", i6);
        int i9 = 3;
        f32697E = new C3579mE("TINK", i9);
        f32698F = new C3579mE("NO_PREFIX", i9);
        int i10 = 4;
        f32699G = new C3579mE("SHA256", i10);
        f32700H = new C3579mE("SHA384", i10);
        f32701I = new C3579mE("SHA512", i10);
        int i11 = 5;
        J = new C3579mE("TINK", i11);
        f32702K = new C3579mE("CRUNCHY", i11);
        f32703L = new C3579mE("LEGACY", i11);
        f32704M = new C3579mE("NO_PREFIX", i11);
    }

    public /* synthetic */ C3579mE(String str, int i) {
        this.f32710n = i;
        this.f32711u = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3765pl, com.google.android.gms.internal.ads.InterfaceC3606mo
    /* renamed from: a */
    public /* synthetic */ void mo5a(Object obj) {
        ((InterfaceC4088vl) obj).b(this.f32711u);
    }

    public String toString() {
        switch (this.f32710n) {
            case 0:
                return this.f32711u;
            case 1:
                return this.f32711u;
            case 2:
                return this.f32711u;
            case 3:
                return this.f32711u;
            case 4:
                return this.f32711u;
            case 5:
                return this.f32711u;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        C4906k.f40186C.f40196h.e(this.f32711u, th);
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo10n(Object obj) {
    }
}
