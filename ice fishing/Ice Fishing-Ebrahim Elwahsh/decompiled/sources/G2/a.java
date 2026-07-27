package G2;

import B2.J;
import O2.w;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC2598Ia;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C4018uf;
import k2.C4636g;
import k2.q;
import q2.r;
import u2.AbstractC5108b;

/* loaded from: classes.dex */
public abstract class a {
    public static void a(Context context, String str, C4636g c4636g, b bVar) {
        w.i(context, "Context cannot be null.");
        w.i(str, "AdUnitId cannot be null.");
        w.i(c4636g, "AdRequest cannot be null.");
        w.i(bVar, "LoadCallback cannot be null.");
        w.d("#008 Must be called on the main UI thread.");
        AbstractC3368ia.a(context);
        if (((Boolean) AbstractC2598Ia.f25575k.r()).booleanValue()) {
            if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.Cc)).booleanValue()) {
                AbstractC5108b.f41223b.execute(new J(context, str, c4636g, bVar, 4));
                return;
            }
        }
        new C4018uf(context, str).c(c4636g.f38704a, bVar);
    }

    public abstract void b(Activity activity, q qVar);
}
