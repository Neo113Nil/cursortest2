package y2;

import E2.I;
import R2.w;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC2704Na;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C2655Kc;
import m2.g;
import m2.m;
import m2.s;
import s2.r;
import x2.AbstractC5190b;

/* renamed from: y2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5205a {
    public static void b(Context context, String str, g gVar, AbstractC5206b abstractC5206b) {
        w.i(context, "Context cannot be null.");
        w.i(str, "AdUnitId cannot be null.");
        w.i(gVar, "AdRequest cannot be null.");
        w.i(abstractC5206b, "LoadCallback cannot be null.");
        w.d("#008 Must be called on the main UI thread.");
        AbstractC3592ma.a(context);
        if (((Boolean) AbstractC2704Na.i.r()).booleanValue()) {
            if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.Cc)).booleanValue()) {
                AbstractC5190b.f41851b.execute(new I(context, str, gVar, abstractC5206b, 10));
                return;
            }
        }
        new C2655Kc(context, str).e(gVar.f39373a, abstractC5206b);
    }

    public abstract s a();

    public abstract void c(m mVar);

    public abstract void d(Activity activity);
}
