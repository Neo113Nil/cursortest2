package G2;

import C2.J;
import P2.w;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC2684Na;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C3897sf;
import k2.g;
import k2.q;
import k2.s;
import l2.C4658b;
import q2.r;
import v2.AbstractC5111b;
import v2.i;

/* loaded from: classes.dex */
public abstract class c {
    public static void b(Context context, String str, g gVar, d dVar) {
        w.i(context, "Context cannot be null.");
        w.i(str, "AdUnitId cannot be null.");
        w.i(gVar, "AdRequest cannot be null.");
        w.i(dVar, "LoadCallback cannot be null.");
        w.d("#008 Must be called on the main UI thread.");
        AbstractC3569ma.a(context);
        if (((Boolean) AbstractC2684Na.f26502k.r()).booleanValue()) {
            if (((Boolean) r.f40204e.f40207c.a(AbstractC3569ma.Cc)).booleanValue()) {
                AbstractC5111b.f41394b.execute(new J(context, str, gVar, dVar, 3));
                return;
            }
        }
        i.a("Loading on UI thread");
        new C3897sf(context, str).e(gVar.f38584a, dVar);
    }

    public static void c(Context context, String str, C4658b c4658b, d dVar) {
        w.i(context, "Context cannot be null.");
        w.i(str, "AdUnitId cannot be null.");
        w.i(c4658b, "AdManagerAdRequest cannot be null.");
        w.i(dVar, "LoadCallback cannot be null.");
        w.d("#008 Must be called on the main UI thread.");
        AbstractC3569ma.a(context);
        if (((Boolean) AbstractC2684Na.f26502k.r()).booleanValue()) {
            if (((Boolean) r.f40204e.f40207c.a(AbstractC3569ma.Cc)).booleanValue()) {
                i.a("Loading on background thread");
                AbstractC5111b.f41394b.execute(new J(context, str, c4658b, dVar, 2));
                return;
            }
        }
        i.a("Loading on UI thread");
        new C3897sf(context, str).e(c4658b.f38584a, dVar);
    }

    public abstract s a();

    public abstract void d(Activity activity, q qVar);
}
