package H2;

import C2.J;
import P2.w;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC2684Na;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C4167xf;
import k2.g;
import k2.q;
import q2.r;
import v2.AbstractC5111b;

/* loaded from: classes.dex */
public abstract class a {
    public static void a(Context context, String str, g gVar, b bVar) {
        w.i(context, "Context cannot be null.");
        w.i(str, "AdUnitId cannot be null.");
        w.i(gVar, "AdRequest cannot be null.");
        w.i(bVar, "LoadCallback cannot be null.");
        w.d("#008 Must be called on the main UI thread.");
        AbstractC3569ma.a(context);
        if (((Boolean) AbstractC2684Na.f26502k.r()).booleanValue()) {
            if (((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.Cc)).booleanValue()) {
                AbstractC5111b.f41397b.execute(new J(context, str, gVar, bVar, 4));
                return;
            }
        }
        new C4167xf(context, str).c(gVar.f38584a, bVar);
    }

    public abstract void b(Activity activity, q qVar);
}
