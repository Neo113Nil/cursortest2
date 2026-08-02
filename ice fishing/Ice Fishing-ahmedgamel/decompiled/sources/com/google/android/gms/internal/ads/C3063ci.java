package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.RemoteException;
import r2.C4906k;
import s2.InterfaceC4926d0;

/* renamed from: com.google.android.gms.internal.ads.ci, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3063ci implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30320a;

    /* renamed from: b, reason: collision with root package name */
    public final C3010bi f30321b;

    public /* synthetic */ C3063ci(C3010bi c3010bi, int i) {
        this.f30320a = i;
        this.f30321b = c3010bi;
    }

    public C4038up a() {
        Context a9 = this.f30321b.a();
        C4038up c4038up = new C4038up();
        c4038up.f35354A = 1;
        c4038up.f34937y = new W8(a9, C4906k.f40186C.f40207t.b(), c4038up, c4038up, 2);
        return c4038up;
    }

    public C3073cs b() {
        C3383ig c3383ig = AbstractC3436jg.f32055a;
        AbstractC3364iD.j(c3383ig);
        return new C3073cs(c3383ig, this.f30321b.a(), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String c() {
        s2.M0 liteSdkVersion;
        InterfaceC4926d0 interfaceC4926d0 = (InterfaceC4926d0) C3504ku.d(this.f30321b.a()).f32446v;
        if (interfaceC4926d0 != null) {
            try {
                liteSdkVersion = interfaceC4926d0.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
            if (liteSdkVersion == null) {
                return liteSdkVersion.f40366v;
            }
            return null;
        }
        liteSdkVersion = null;
        if (liteSdkVersion == null) {
        }
    }

    public C3073cs d() {
        C3383ig c3383ig = AbstractC3436jg.f32055a;
        AbstractC3364iD.j(c3383ig);
        return new C3073cs(c3383ig, this.f30321b.a(), 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f30320a) {
            case 0:
                ApplicationInfo applicationInfo = this.f30321b.a().getApplicationInfo();
                AbstractC3364iD.j(applicationInfo);
                return applicationInfo;
            case 1:
                return c();
            case 2:
                Context a9 = this.f30321b.a();
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Rc)).booleanValue()) {
                    return x2.d.j(a9);
                }
                return null;
            case 3:
                C2590Gf m9 = C2590Gf.m(this.f30321b.a());
                return new C3067cm(14, (V2.a) m9.f25830u, (C2539Df) ((C3266gN) m9.f25832w).f());
            case 4:
                return new Gw(this.f30321b.a(), C4906k.f40186C.f40207t.b());
            case 5:
                return new w2.r(this.f30321b.a());
            case 6:
                return C3504ku.d(this.f30321b.a());
            case 7:
                return new C2644Ji(this.f30321b.a());
            case 8:
                return new C2616Ho(this.f30321b.a());
            case 9:
                return new C2963ap(this.f30321b.a());
            case 10:
                return new C3017bp(this.f30321b.a());
            case 11:
                String packageName = this.f30321b.a().getPackageName();
                AbstractC3364iD.j(packageName);
                return packageName;
            case 12:
                Context a10 = this.f30321b.a();
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                return new C3715op(a10, c3383ig, 1);
            case 13:
                return a();
            case 14:
                return new C2685Lp(this.f30321b.a());
            case 15:
                Context a11 = this.f30321b.a();
                C3383ig c3383ig2 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig2);
                return new C2821Tp(a11, c3383ig2);
            case 16:
                return new C3286gq(this.f30321b.a());
            case 17:
                return new C3506kw(this.f30321b.a());
            case 18:
                return new Lr(0, this.f30321b.a());
            case 19:
                C3383ig c3383ig3 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig3);
                return new C3073cs(c3383ig3, this.f30321b.a(), 0);
            case 20:
                return b();
            case 21:
                C3383ig c3383ig4 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig4);
                return new C3073cs(c3383ig4, this.f30321b.a(), 2);
            case 22:
                Context a12 = this.f30321b.a();
                C3383ig c3383ig5 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig5);
                return new C3073cs(a12, c3383ig5, 3);
            case 23:
                C3383ig c3383ig6 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig6);
                return new C3073cs(c3383ig6, this.f30321b.a(), 4);
            case 24:
                C3383ig c3383ig7 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig7);
                return new C3772ps(this.f30321b.a(), c3383ig7);
            case 25:
                C3383ig c3383ig8 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig8);
                return new C3073cs(c3383ig8, this.f30321b.a(), 5);
            case 26:
                Context a13 = this.f30321b.a();
                C3383ig c3383ig9 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig9);
                return new C3073cs(a13, c3383ig9, 6);
            case 27:
                return d();
            case 28:
                C3383ig c3383ig10 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig10);
                this.f30321b.a();
                return new C3772ps(c3383ig10, 4);
            default:
                return new Zs(this.f30321b.a());
        }
    }
}
