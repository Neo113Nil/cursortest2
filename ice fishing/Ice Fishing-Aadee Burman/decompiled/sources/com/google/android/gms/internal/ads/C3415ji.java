package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ji, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3415ji {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31297a;

    /* renamed from: b, reason: collision with root package name */
    public final C3309hi f31298b;

    /* renamed from: c, reason: collision with root package name */
    public Bt f31299c;

    /* renamed from: d, reason: collision with root package name */
    public C3857rt f31300d;

    /* renamed from: e, reason: collision with root package name */
    public C3849rl f31301e;

    /* renamed from: f, reason: collision with root package name */
    public C3687ok f31302f;

    public /* synthetic */ C3415ji(C3309hi c3309hi, int i) {
        this.f31297a = i;
        this.f31298b = c3309hi;
    }

    public C3469ki a() {
        AbstractC3341iD.l(C3849rl.class, this.f31301e);
        AbstractC3341iD.l(C3687ok.class, this.f31302f);
        return new C3469ki(this.f31298b, new C3472kl(23), this.f31301e, this.f31302f, new C3657o7(27), this.f31299c, this.f31300d);
    }

    public C3900si b() {
        AbstractC3341iD.l(C3849rl.class, this.f31301e);
        AbstractC3341iD.l(C3687ok.class, this.f31302f);
        return new C3900si(this.f31298b, new C3472kl(23), this.f31301e, this.f31302f, new C3657o7(27), this.f31299c, this.f31300d);
    }

    public final /* bridge */ Object c() {
        switch (this.f31297a) {
            case 0:
                return a();
            default:
                return b();
        }
    }
}
