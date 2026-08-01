package f0;

import android.os.Bundle;

/* renamed from: f0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0149n extends D1.j implements C1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D1.l f2953b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f2954c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f2955d;
    public final /* synthetic */ Bundle e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0149n(D1.l lVar, z zVar, w wVar, Bundle bundle) {
        super(1);
        this.f2953b = lVar;
        this.f2954c = zVar;
        this.f2955d = wVar;
        this.e = bundle;
    }

    @Override // C1.l
    public final Object g(Object obj) {
        C0141f c0141f = (C0141f) obj;
        D1.i.e(c0141f, "it");
        this.f2953b.f167a = true;
        u1.o oVar = u1.o.f4473a;
        this.f2954c.a(this.f2955d, this.e, c0141f, oVar);
        return t1.i.f4388c;
    }
}
