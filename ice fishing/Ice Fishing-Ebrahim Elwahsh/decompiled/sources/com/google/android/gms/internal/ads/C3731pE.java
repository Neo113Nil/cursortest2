package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3731pE implements LD, InterfaceC3701ol {

    /* renamed from: A, reason: collision with root package name */
    public static final C3731pE f33353A;

    /* renamed from: B, reason: collision with root package name */
    public static final C3731pE f33354B;

    /* renamed from: C, reason: collision with root package name */
    public static final C3731pE f33355C;

    /* renamed from: D, reason: collision with root package name */
    public static final C3731pE f33356D;

    /* renamed from: E, reason: collision with root package name */
    public static final C3731pE f33357E;

    /* renamed from: F, reason: collision with root package name */
    public static final C3731pE f33358F;

    /* renamed from: G, reason: collision with root package name */
    public static final C3731pE f33359G;

    /* renamed from: H, reason: collision with root package name */
    public static final C3731pE f33360H;

    /* renamed from: I, reason: collision with root package name */
    public static final C3731pE f33361I;
    public static final C3731pE J;

    /* renamed from: K, reason: collision with root package name */
    public static final C3731pE f33362K;

    /* renamed from: v, reason: collision with root package name */
    public static final C3731pE f33363v;

    /* renamed from: w, reason: collision with root package name */
    public static final C3731pE f33364w;

    /* renamed from: x, reason: collision with root package name */
    public static final C3731pE f33365x;

    /* renamed from: y, reason: collision with root package name */
    public static final C3731pE f33366y;

    /* renamed from: z, reason: collision with root package name */
    public static final C3731pE f33367z;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33368n;

    /* renamed from: u, reason: collision with root package name */
    public final String f33369u;

    static {
        int i = 0;
        f33363v = new C3731pE("ENABLED", i);
        f33364w = new C3731pE("DISABLED", i);
        f33365x = new C3731pE("DESTROYED", i);
        int i4 = 1;
        f33366y = new C3731pE("TINK", i4);
        f33367z = new C3731pE("CRUNCHY", i4);
        f33353A = new C3731pE("NO_PREFIX", i4);
        int i9 = 2;
        f33354B = new C3731pE("ASSUME_AES_GCM", i9);
        f33355C = new C3731pE("ASSUME_XCHACHA20POLY1305", i9);
        f33356D = new C3731pE("ASSUME_CHACHA20POLY1305", i9);
        f33357E = new C3731pE("ASSUME_AES_CTR_HMAC", i9);
        f33358F = new C3731pE("ASSUME_AES_EAX", i9);
        f33359G = new C3731pE("ASSUME_AES_GCM_SIV", i9);
        int i10 = 3;
        f33360H = new C3731pE("TINK", i10);
        f33361I = new C3731pE("CRUNCHY", i10);
        J = new C3731pE("LEGACY", i10);
        f33362K = new C3731pE("NO_PREFIX", i10);
    }

    public /* synthetic */ C3731pE(String str, int i) {
        this.f33368n = i;
        this.f33369u = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3701ol, com.google.android.gms.internal.ads.InterfaceC3865ro
    /* renamed from: b */
    public /* synthetic */ void mo2b(Object obj) {
        ((InterfaceC3970tl) obj).d(this.f33369u);
    }

    @Override // com.google.android.gms.internal.ads.LD
    public void q(Throwable th) {
        p2.j.f39798C.f39808h.e(this.f33369u, th);
    }

    public String toString() {
        switch (this.f33368n) {
            case 0:
                return this.f33369u;
            case 1:
                return this.f33369u;
            case 2:
                return this.f33369u;
            case 3:
                return this.f33369u;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.LD
    /* renamed from: l */
    public void mo7l(Object obj) {
    }
}
