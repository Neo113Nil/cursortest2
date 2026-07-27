package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.RemoteException;
import p2.C4835j;
import q2.InterfaceC4877d0;

/* renamed from: com.google.android.gms.internal.ads.ci, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3040ci implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29535a;

    /* renamed from: b, reason: collision with root package name */
    public final C2987bi f29536b;

    public /* synthetic */ C3040ci(C2987bi c2987bi, int i) {
        this.f29535a = i;
        this.f29536b = c2987bi;
    }

    public C4015up a() {
        Context a9 = this.f29536b.a();
        C4015up c4015up = new C4015up();
        c4015up.f34591A = 1;
        c4015up.f34151y = new W8(a9, C4835j.f39730C.f39751t.b(), c4015up, c4015up, 2);
        return c4015up;
    }

    public C3050cs b() {
        C3360ig c3360ig = AbstractC3413jg.f31268a;
        AbstractC3341iD.j(c3360ig);
        return new C3050cs(c3360ig, this.f29536b.a(), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String c() {
        q2.M0 liteSdkVersion;
        InterfaceC4877d0 interfaceC4877d0 = (InterfaceC4877d0) C3481ku.d(this.f29536b.a()).f31664v;
        if (interfaceC4877d0 != null) {
            try {
                liteSdkVersion = interfaceC4877d0.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
            if (liteSdkVersion == null) {
                return liteSdkVersion.f40064v;
            }
            return null;
        }
        liteSdkVersion = null;
        if (liteSdkVersion == null) {
        }
    }

    public C3050cs d() {
        C3360ig c3360ig = AbstractC3413jg.f31268a;
        AbstractC3341iD.j(c3360ig);
        return new C3050cs(c3360ig, this.f29536b.a(), 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f29535a) {
            case 0:
                ApplicationInfo applicationInfo = this.f29536b.a().getApplicationInfo();
                AbstractC3341iD.j(applicationInfo);
                return applicationInfo;
            case 1:
                return c();
            case 2:
                Context a9 = this.f29536b.a();
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Rc)).booleanValue()) {
                    return v2.d.j(a9);
                }
                return null;
            case 3:
                C2570Gf o6 = C2570Gf.o(this.f29536b.a());
                return new C2991bm(12, (T2.a) o6.f25042u, (C2519Df) ((C3243gN) o6.f25044w).f());
            case 4:
                return new Gw(this.f29536b.a(), C4835j.f39730C.f39751t.b());
            case 5:
                return new u2.r(this.f29536b.a());
            case 6:
                return C3481ku.d(this.f29536b.a());
            case 7:
                return new C2624Ji(this.f29536b.a());
            case 8:
                return new C2579Go(this.f29536b.a());
            case 9:
                return new C2940ap(this.f29536b.a());
            case 10:
                return new C2994bp(this.f29536b.a());
            case 11:
                String packageName = this.f29536b.a().getPackageName();
                AbstractC3341iD.j(packageName);
                return packageName;
            case 12:
                Context a10 = this.f29536b.a();
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                return new C3692op(a10, c3360ig, 1);
            case 13:
                return a();
            case 14:
                return new C2665Lp(this.f29536b.a());
            case 15:
                Context a11 = this.f29536b.a();
                C3360ig c3360ig2 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig2);
                return new C2800Tp(a11, c3360ig2);
            case 16:
                return new C3263gq(this.f29536b.a());
            case 17:
                return new C3429jw(this.f29536b.a());
            case 18:
                return new Lr(0, this.f29536b.a());
            case 19:
                C3360ig c3360ig3 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig3);
                return new C3050cs(c3360ig3, this.f29536b.a(), 0);
            case 20:
                return b();
            case 21:
                C3360ig c3360ig4 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig4);
                return new C3050cs(c3360ig4, this.f29536b.a(), 2);
            case 22:
                Context a12 = this.f29536b.a();
                C3360ig c3360ig5 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig5);
                return new C3050cs(a12, c3360ig5, 3);
            case 23:
                C3360ig c3360ig6 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig6);
                return new C3050cs(c3360ig6, this.f29536b.a(), 4);
            case 24:
                C3360ig c3360ig7 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig7);
                return new C3749ps(this.f29536b.a(), c3360ig7);
            case 25:
                C3360ig c3360ig8 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig8);
                return new C3050cs(c3360ig8, this.f29536b.a(), 5);
            case 26:
                Context a13 = this.f29536b.a();
                C3360ig c3360ig9 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig9);
                return new C3050cs(a13, c3360ig9, 6);
            case 27:
                return d();
            case 28:
                C3360ig c3360ig10 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig10);
                this.f29536b.a();
                return new C3749ps(c3360ig10, 4);
            default:
                return new Zs(this.f29536b.a());
        }
    }
}
