package B2;

import android.os.Binder;
import com.google.android.gms.internal.ads.AbstractC2819Va;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C2494Bp;
import com.google.android.gms.internal.ads.C2687Ne;
import com.google.android.gms.internal.ads.C3157eg;
import com.google.android.gms.internal.ads.C3435jp;
import com.google.android.gms.internal.ads.C3686oN;
import com.google.android.gms.internal.ads.C3866rp;
import com.google.android.gms.internal.ads.CD;
import com.google.android.gms.internal.ads.JD;
import com.google.android.gms.internal.ads.SD;
import com.google.android.gms.internal.ads.T6;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class t implements CD {

    /* renamed from: a, reason: collision with root package name */
    public final SD f301a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.r f302b;

    public t(SD sd, com.google.android.gms.internal.ads.r rVar) {
        this.f301a = sd;
        this.f302b = rVar;
    }

    @Override // com.google.android.gms.internal.ads.CD
    public final J3.a b(Object obj) {
        J3.a b9;
        C2687Ne c2687Ne = (C2687Ne) obj;
        com.google.android.gms.internal.ads.r rVar = this.f302b;
        String str = c2687Ne.f26582w;
        t2.G g9 = p2.j.f39798C.f39803c;
        if (t2.G.e(str)) {
            b9 = C3686oN.l(new C2494Bp(1));
        } else {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31805u8)).booleanValue() || ((Boolean) AbstractC2819Va.f28261a.r()).booleanValue()) {
                b9 = ((C3157eg) rVar.f33921w).b(new T6(6, rVar, c2687Ne));
            } else {
                b9 = ((C3866rp) rVar.f33922x).c(c2687Ne);
            }
        }
        return C3686oN.y(C3686oN.v((JD) C3686oN.w(JD.s(b9), ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31398A6)).intValue(), TimeUnit.SECONDS, (ScheduledExecutorService) rVar.f33919u), Throwable.class, new C3435jp(rVar, c2687Ne, Binder.getCallingUid(), 1), (C3157eg) rVar.f33920v), new C0273g(2, c2687Ne), this.f301a);
    }
}
