package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.RemoteException;
import q2.InterfaceC4884d0;

/* renamed from: com.google.android.gms.internal.ads.Yh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2877Yh implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28845a;

    /* renamed from: b, reason: collision with root package name */
    public final C2860Xh f28846b;

    public /* synthetic */ C2877Yh(C2860Xh c2860Xh, int i) {
        this.f28845a = i;
        this.f28846b = c2860Xh;
    }

    public C4190xp a() {
        Context a9 = this.f28846b.a();
        C4190xp c4190xp = new C4190xp();
        c4190xp.f35253A = 1;
        c4190xp.f34869y = new T8(a9, p2.j.f39798C.f39819t.b(), c4190xp, c4190xp, 2);
        return c4190xp;
    }

    public C3169es b() {
        C3157eg c3157eg = AbstractC3212fg.f30738a;
        AbstractC3137eE.h(c3157eg);
        return new C3169es(c3157eg, this.f28846b.a(), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String c() {
        q2.M0 liteSdkVersion;
        InterfaceC4884d0 interfaceC4884d0 = (InterfaceC4884d0) C3602mu.e(this.f28846b.a()).f32775v;
        if (interfaceC4884d0 != null) {
            try {
                liteSdkVersion = interfaceC4884d0.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
            if (liteSdkVersion == null) {
                return liteSdkVersion.f39974v;
            }
            return null;
        }
        liteSdkVersion = null;
        if (liteSdkVersion == null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f28845a) {
            case 0:
                ApplicationInfo applicationInfo = this.f28846b.a().getApplicationInfo();
                AbstractC3137eE.h(applicationInfo);
                return applicationInfo;
            case 1:
                return c();
            case 2:
                Context a9 = this.f28846b.a();
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Rc)).booleanValue()) {
                    return u2.d.j(a9);
                }
                return null;
            case 3:
                C2518Df p6 = C2518Df.p(this.f28846b.a());
                return new C2881Yl(18, (S2.a) p6.f24453u, (C2467Af) ((C4009uN) p6.f24455w).d());
            case 4:
                return new Iw(this.f28846b.a(), p2.j.f39798C.f39819t.b());
            case 5:
                return new t2.s(this.f28846b.a());
            case 6:
                return C3602mu.e(this.f28846b.a());
            case 7:
                return new C2606Ii(this.f28846b.a());
            case 8:
                return new C2578Go(this.f28846b.a());
            case 9:
                return new C3057cp(this.f28846b.a());
            case 10:
                return new C3111dp(this.f28846b.a());
            case 11:
                String packageName = this.f28846b.a().getPackageName();
                AbstractC3137eE.h(packageName);
                return packageName;
            case 12:
                Context a10 = this.f28846b.a();
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                return new C3866rp(a10, c3157eg, 1);
            case 13:
                return a();
            case 14:
                return new C2715Op(this.f28846b.a());
            case 15:
                Context a11 = this.f28846b.a();
                C3157eg c3157eg2 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg2);
                return new C2834Vp(a11, c3157eg2);
            case 16:
                return new C3383iq(this.f28846b.a());
            case 17:
                return new C3550lw(this.f28846b.a());
            case 18:
                return new Or(0, this.f28846b.a());
            case 19:
                C3157eg c3157eg3 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg3);
                return new C3169es(c3157eg3, this.f28846b.a(), 0);
            case 20:
                return b();
            case 21:
                C3157eg c3157eg4 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg4);
                return new C3169es(c3157eg4, this.f28846b.a(), 2);
            case 22:
                Context a12 = this.f28846b.a();
                C3157eg c3157eg5 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg5);
                return new C3169es(a12, c3157eg5, 3);
            case 23:
                C3157eg c3157eg6 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg6);
                return new C3169es(c3157eg6, this.f28846b.a(), 4);
            case 24:
                C3157eg c3157eg7 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg7);
                return new C3923ss(this.f28846b.a(), c3157eg7);
            case 25:
                C3157eg c3157eg8 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg8);
                return new C3169es(c3157eg8, this.f28846b.a(), 5);
            case 26:
                Context a13 = this.f28846b.a();
                C3157eg c3157eg9 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg9);
                return new C3169es(a13, c3157eg9, 6);
            case 27:
                return e();
            case 28:
                C3157eg c3157eg10 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg10);
                this.f28846b.a();
                return new C3923ss(c3157eg10, 4);
            default:
                return new C3007bt(this.f28846b.a());
        }
    }

    public C3169es e() {
        C3157eg c3157eg = AbstractC3212fg.f30738a;
        AbstractC3137eE.h(c3157eg);
        return new C3169es(c3157eg, this.f28846b.a(), 7);
    }
}
