package F2;

import B2.J;
import O2.w;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC2598Ia;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C3695of;
import k2.C4636g;
import k2.q;
import k2.s;
import l2.C4687b;
import q2.r;
import u2.AbstractC5108b;
import u2.i;

/* loaded from: classes.dex */
public abstract class c {
    public static void b(Context context, String str, C4636g c4636g, d dVar) {
        w.i(context, "Context cannot be null.");
        w.i(str, "AdUnitId cannot be null.");
        w.i(c4636g, "AdRequest cannot be null.");
        w.i(dVar, "LoadCallback cannot be null.");
        w.d("#008 Must be called on the main UI thread.");
        AbstractC3368ia.a(context);
        if (((Boolean) AbstractC2598Ia.f25575k.r()).booleanValue()) {
            if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.Cc)).booleanValue()) {
                AbstractC5108b.f41223b.execute(new J(context, str, c4636g, dVar, 3));
                return;
            }
        }
        i.a("Loading on UI thread");
        new C3695of(context, str).e(c4636g.f38704a, dVar);
    }

    public static void c(Context context, String str, C4687b c4687b, d dVar) {
        w.i(context, "Context cannot be null.");
        w.i(str, "AdUnitId cannot be null.");
        w.i(c4687b, "AdManagerAdRequest cannot be null.");
        w.i(dVar, "LoadCallback cannot be null.");
        w.d("#008 Must be called on the main UI thread.");
        AbstractC3368ia.a(context);
        if (((Boolean) AbstractC2598Ia.f25575k.r()).booleanValue()) {
            if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.Cc)).booleanValue()) {
                i.a("Loading on background thread");
                AbstractC5108b.f41223b.execute(new J(context, str, c4687b, dVar, 2));
                return;
            }
        }
        i.a("Loading on UI thread");
        new C3695of(context, str).e(c4687b.f38704a, dVar);
    }

    public abstract s a();

    public abstract void d(Activity activity, q qVar);
}
