package J2;

import E2.I;
import R2.w;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC2704Na;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C4190xf;
import m2.g;
import m2.q;
import s2.r;
import x2.AbstractC5190b;

/* loaded from: classes.dex */
public abstract class a {
    public static void a(Context context, String str, g gVar, b bVar) {
        w.i(context, "Context cannot be null.");
        w.i(str, "AdUnitId cannot be null.");
        w.i(gVar, "AdRequest cannot be null.");
        w.i(bVar, "LoadCallback cannot be null.");
        w.d("#008 Must be called on the main UI thread.");
        AbstractC3592ma.a(context);
        if (((Boolean) AbstractC2704Na.f27285k.r()).booleanValue()) {
            if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.Cc)).booleanValue()) {
                AbstractC5190b.f41851b.execute(new I(context, str, gVar, bVar, 4));
                return;
            }
        }
        new C4190xf(context, str).c(gVar.f39373a, bVar);
    }

    public abstract void b(Activity activity, q qVar);
}
