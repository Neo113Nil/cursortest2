package E2;

import B2.J;
import B2.o;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC2598Ia;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C4017ue;
import k2.C4636g;
import k2.EnumC4631b;
import q2.r;
import u2.AbstractC5108b;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final o f810a;

    public a(o oVar) {
        this.f810a = oVar;
    }

    public static void a(Context context, EnumC4631b enumC4631b, C4636g c4636g, b bVar) {
        AbstractC3368ia.a(context);
        if (((Boolean) AbstractC2598Ia.f25574j.r()).booleanValue()) {
            if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.Cc)).booleanValue()) {
                AbstractC5108b.f41223b.execute(new J(context, enumC4631b, c4636g, bVar, 1));
                return;
            }
        }
        new C4017ue(context, enumC4631b, c4636g.f38704a, 0).p(bVar);
    }
}
