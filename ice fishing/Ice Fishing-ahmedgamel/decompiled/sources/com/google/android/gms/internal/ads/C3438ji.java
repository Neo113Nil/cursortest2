package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ji, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3438ji {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32084a;

    /* renamed from: b, reason: collision with root package name */
    public final C3332hi f32085b;

    /* renamed from: c, reason: collision with root package name */
    public Bt f32086c;

    /* renamed from: d, reason: collision with root package name */
    public C3880rt f32087d;

    /* renamed from: e, reason: collision with root package name */
    public C3872rl f32088e;

    /* renamed from: f, reason: collision with root package name */
    public C3710ok f32089f;

    public /* synthetic */ C3438ji(C3332hi c3332hi, int i) {
        this.f32084a = i;
        this.f32085b = c3332hi;
    }

    public C3492ki a() {
        AbstractC3364iD.l(C3872rl.class, this.f32088e);
        AbstractC3364iD.l(C3710ok.class, this.f32089f);
        return new C3492ki(this.f32085b, new C3495kl(23), this.f32088e, this.f32089f, new C3680o7(27), this.f32086c, this.f32087d);
    }

    public C3923si b() {
        AbstractC3364iD.l(C3872rl.class, this.f32088e);
        AbstractC3364iD.l(C3710ok.class, this.f32089f);
        return new C3923si(this.f32085b, new C3495kl(23), this.f32088e, this.f32089f, new C3680o7(27), this.f32086c, this.f32087d);
    }

    public final /* bridge */ Object c() {
        switch (this.f32084a) {
            case 0:
                return a();
            default:
                return b();
        }
    }
}
