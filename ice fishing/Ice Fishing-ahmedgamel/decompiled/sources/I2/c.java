package I2;

import E2.I;
import R2.w;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC2704Na;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C3920sf;
import m2.g;
import m2.q;
import m2.s;
import n2.C4767b;
import s2.r;
import x2.AbstractC5190b;
import x2.i;

/* loaded from: classes.dex */
public abstract class c {
    public static void b(Context context, String str, g gVar, d dVar) {
        w.i(context, "Context cannot be null.");
        w.i(str, "AdUnitId cannot be null.");
        w.i(gVar, "AdRequest cannot be null.");
        w.i(dVar, "LoadCallback cannot be null.");
        w.d("#008 Must be called on the main UI thread.");
        AbstractC3592ma.a(context);
        if (((Boolean) AbstractC2704Na.f27285k.r()).booleanValue()) {
            if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.Cc)).booleanValue()) {
                AbstractC5190b.f41851b.execute(new I(context, str, gVar, dVar, 3));
                return;
            }
        }
        i.a("Loading on UI thread");
        new C3920sf(context, str).e(gVar.f39373a, dVar);
    }

    public static void c(Context context, String str, C4767b c4767b, d dVar) {
        w.i(context, "Context cannot be null.");
        w.i(str, "AdUnitId cannot be null.");
        w.i(c4767b, "AdManagerAdRequest cannot be null.");
        w.i(dVar, "LoadCallback cannot be null.");
        w.d("#008 Must be called on the main UI thread.");
        AbstractC3592ma.a(context);
        if (((Boolean) AbstractC2704Na.f27285k.r()).booleanValue()) {
            if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.Cc)).booleanValue()) {
                i.a("Loading on background thread");
                AbstractC5190b.f41851b.execute(new I(context, str, c4767b, dVar, 2));
                return;
            }
        }
        i.a("Loading on UI thread");
        new C3920sf(context, str).e(c4767b.f39373a, dVar);
    }

    public abstract s a();

    public abstract void d(Activity activity, q qVar);
}
