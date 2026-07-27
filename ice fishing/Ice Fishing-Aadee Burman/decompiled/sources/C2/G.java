package C2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.ads.AbstractC3043cl;
import com.google.android.gms.internal.ads.AbstractC3341iD;
import com.google.android.gms.internal.ads.AbstractC3413jg;
import com.google.android.gms.internal.ads.C2621Jf;
import com.google.android.gms.internal.ads.C2857Xi;
import com.google.android.gms.internal.ads.C2866Yb;
import com.google.android.gms.internal.ads.C2987bi;
import com.google.android.gms.internal.ads.C3;
import com.google.android.gms.internal.ads.C3089dd;
import com.google.android.gms.internal.ads.C3153eo;
import com.google.android.gms.internal.ads.C3157es;
import com.google.android.gms.internal.ads.C3243gN;
import com.google.android.gms.internal.ads.C3262gp;
import com.google.android.gms.internal.ads.C3315ho;
import com.google.android.gms.internal.ads.C3360ig;
import com.google.android.gms.internal.ads.C3534lt;
import com.google.android.gms.internal.ads.C3819r8;
import com.google.android.gms.internal.ads.C4069vp;
import com.google.android.gms.internal.ads.InterfaceC3297hN;
import com.google.android.gms.internal.ads.Lr;
import com.google.android.gms.internal.ads.Nu;
import com.google.android.gms.internal.ads.Ur;
import com.google.android.gms.internal.ads.Vu;
import com.google.android.gms.internal.ads.Wu;
import java.util.concurrent.ScheduledExecutorService;
import p2.C4835j;
import v2.C5110a;

/* loaded from: classes.dex */
public final class G implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f274a;

    /* renamed from: b, reason: collision with root package name */
    public final C2987bi f275b;

    /* renamed from: c, reason: collision with root package name */
    public final C3243gN f276c;

    public /* synthetic */ G(C2987bi c2987bi, C3243gN c3243gN, int i) {
        this.f274a = i;
        this.f275b = c2987bi;
        this.f276c = c3243gN;
    }

    public C3 a() {
        Context a9 = this.f275b.a();
        Wu wu = (Wu) this.f276c.f();
        C3360ig c3360ig = AbstractC3413jg.f31268a;
        AbstractC3341iD.j(c3360ig);
        C4835j c4835j = C4835j.f39730C;
        C3089dd c9 = c4835j.f39749r.c(a9, C5110a.a(), wu);
        C2866Yb c2866Yb = AbstractC3043cl.f29559C;
        c9.getClass();
        return new C3(a9, c4835j.f39749r.c(a9, C5110a.a(), wu).a("google.afma.sdkConstants.getSdkConstants", c2866Yb, c2866Yb), C5110a.a(), c3360ig);
    }

    public C3157es b() {
        return new C3157es(2, this.f275b.a(), (Intent) this.f276c.f());
    }

    public C3534lt c() {
        C3153eo c3153eo = (C3153eo) this.f276c.f();
        this.f275b.a();
        return new C3534lt(4, c3153eo);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f274a) {
            case 0:
                Context a9 = this.f275b.a();
                C3315ho c3315ho = (C3315ho) this.f276c.f();
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                return new D(a9, c3315ho, c3360ig);
            case 1:
                try {
                    return V2.c.a(this.f275b.a()).c(0, ((ApplicationInfo) this.f276c.f()).packageName);
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            case 2:
                return a();
            case 3:
                return new v2.l(this.f275b.a(), (String) this.f276c.f());
            case 4:
                return new C2857Xi(this.f275b.a(), (C3819r8) this.f276c.f());
            case 5:
                return new C3262gp(this.f275b.a(), (C3153eo) this.f276c.f());
            case 6:
                return new C4069vp(this.f275b.a(), (C2621Jf) this.f276c.f());
            case 7:
                return b();
            case 8:
                C2621Jf c2621Jf = (C2621Jf) this.f276c.f();
                C3360ig c3360ig2 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig2);
                return new Ur(3, c2621Jf, c3360ig2, this.f275b.a());
            case 9:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f276c.f();
                this.f275b.a();
                return new Lr(7, scheduledExecutorService);
            case 10:
                return new Nu(this.f275b.a(), (Vu) this.f276c.f());
            default:
                return c();
        }
    }

    public /* synthetic */ G(C3243gN c3243gN, C2987bi c2987bi, int i) {
        this.f274a = i;
        this.f276c = c3243gN;
        this.f275b = c2987bi;
    }
}
