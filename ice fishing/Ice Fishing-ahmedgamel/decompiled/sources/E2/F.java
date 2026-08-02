package E2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.ads.AbstractC3066cl;
import com.google.android.gms.internal.ads.AbstractC3364iD;
import com.google.android.gms.internal.ads.AbstractC3436jg;
import com.google.android.gms.internal.ads.C2641Jf;
import com.google.android.gms.internal.ads.C2880Xi;
import com.google.android.gms.internal.ads.C2889Yb;
import com.google.android.gms.internal.ads.C3;
import com.google.android.gms.internal.ads.C3010bi;
import com.google.android.gms.internal.ads.C3112dd;
import com.google.android.gms.internal.ads.C3180es;
import com.google.android.gms.internal.ads.C3230fo;
import com.google.android.gms.internal.ads.C3266gN;
import com.google.android.gms.internal.ads.C3285gp;
import com.google.android.gms.internal.ads.C3383ig;
import com.google.android.gms.internal.ads.C3391io;
import com.google.android.gms.internal.ads.C3557lt;
import com.google.android.gms.internal.ads.C3842r8;
import com.google.android.gms.internal.ads.C4092vp;
import com.google.android.gms.internal.ads.InterfaceC3320hN;
import com.google.android.gms.internal.ads.Lr;
import com.google.android.gms.internal.ads.Nu;
import com.google.android.gms.internal.ads.Ur;
import com.google.android.gms.internal.ads.Vu;
import com.google.android.gms.internal.ads.Wu;
import java.util.concurrent.ScheduledExecutorService;
import r2.C4906k;
import x2.C5189a;

/* loaded from: classes.dex */
public final class F implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f734a;

    /* renamed from: b, reason: collision with root package name */
    public final C3010bi f735b;

    /* renamed from: c, reason: collision with root package name */
    public final C3266gN f736c;

    public /* synthetic */ F(C3010bi c3010bi, C3266gN c3266gN, int i) {
        this.f734a = i;
        this.f735b = c3010bi;
        this.f736c = c3266gN;
    }

    public C3 a() {
        Context a9 = this.f735b.a();
        Wu wu = (Wu) this.f736c.f();
        C3383ig c3383ig = AbstractC3436jg.f32055a;
        AbstractC3364iD.j(c3383ig);
        C4906k c4906k = C4906k.f40186C;
        C3112dd c9 = c4906k.f40205r.c(a9, C5189a.a(), wu);
        C2889Yb c2889Yb = AbstractC3066cl.f30344C;
        c9.getClass();
        return new C3(a9, c4906k.f40205r.c(a9, C5189a.a(), wu).a("google.afma.sdkConstants.getSdkConstants", c2889Yb, c2889Yb), C5189a.a(), c3383ig);
    }

    public C3180es b() {
        return new C3180es(2, this.f735b.a(), (Intent) this.f736c.f());
    }

    public C3557lt c() {
        C3230fo c3230fo = (C3230fo) this.f736c.f();
        this.f735b.a();
        return new C3557lt(4, c3230fo);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f734a) {
            case 0:
                Context a9 = this.f735b.a();
                C3391io c3391io = (C3391io) this.f736c.f();
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                return new C(a9, c3391io, c3383ig);
            case 1:
                try {
                    return X2.b.a(this.f735b.a()).g(0, ((ApplicationInfo) this.f736c.f()).packageName);
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            case 2:
                return a();
            case 3:
                return new x2.l(this.f735b.a(), (String) this.f736c.f());
            case 4:
                return new C2880Xi(this.f735b.a(), (C3842r8) this.f736c.f());
            case 5:
                return new C3285gp(this.f735b.a(), (C3230fo) this.f736c.f());
            case 6:
                return new C4092vp(this.f735b.a(), (C2641Jf) this.f736c.f());
            case 7:
                return b();
            case 8:
                C2641Jf c2641Jf = (C2641Jf) this.f736c.f();
                C3383ig c3383ig2 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig2);
                return new Ur(3, c2641Jf, c3383ig2, this.f735b.a());
            case 9:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f736c.f();
                this.f735b.a();
                return new Lr(7, scheduledExecutorService);
            case 10:
                return new Nu(this.f735b.a(), (Vu) this.f736c.f());
            default:
                return c();
        }
    }

    public /* synthetic */ F(C3266gN c3266gN, C3010bi c3010bi, int i) {
        this.f734a = i;
        this.f736c = c3266gN;
        this.f735b = c3010bi;
    }
}
