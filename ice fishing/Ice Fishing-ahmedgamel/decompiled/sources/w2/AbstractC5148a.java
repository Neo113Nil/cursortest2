package w2;

import C2.J;
import P2.w;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC2684Na;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C2635Kc;
import k2.g;
import k2.m;
import k2.s;
import q2.r;
import v2.AbstractC5111b;

/* renamed from: w2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5148a {
    public static void b(Context context, String str, g gVar, AbstractC5149b abstractC5149b) {
        w.i(context, "Context cannot be null.");
        w.i(str, "AdUnitId cannot be null.");
        w.i(gVar, "AdRequest cannot be null.");
        w.i(abstractC5149b, "LoadCallback cannot be null.");
        w.d("#008 Must be called on the main UI thread.");
        AbstractC3569ma.a(context);
        if (((Boolean) AbstractC2684Na.i.r()).booleanValue()) {
            if (((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.Cc)).booleanValue()) {
                AbstractC5111b.f41397b.execute(new J(context, str, gVar, abstractC5149b, 10));
                return;
            }
        }
        new C2635Kc(context, str).e(gVar.f38584a, abstractC5149b);
    }

    public abstract s a();

    public abstract void c(m mVar);

    public abstract void d(Activity activity);
}
