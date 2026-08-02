package o2;

import E2.I;
import R2.w;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC2704Na;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C3;
import m2.g;
import m2.s;
import s2.r;
import x2.AbstractC5190b;

/* renamed from: o2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4802b {
    public static void b(Context context, String str, g gVar, AbstractC4801a abstractC4801a) {
        w.i(context, "Context cannot be null.");
        w.i(str, "adUnitId cannot be null.");
        w.i(gVar, "AdRequest cannot be null.");
        w.d("#008 Must be called on the main UI thread.");
        AbstractC3592ma.a(context);
        if (((Boolean) AbstractC2704Na.f27279d.r()).booleanValue()) {
            if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.Cc)).booleanValue()) {
                AbstractC5190b.f41851b.execute(new I(context, str, gVar, abstractC4801a, 9));
                return;
            }
        }
        new C3(context, str, gVar.f39373a, abstractC4801a).b();
    }

    public abstract s a();

    public abstract void c(Activity activity);
}
