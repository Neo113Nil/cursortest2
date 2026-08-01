package m2;

import C2.J;
import P2.w;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC2684Na;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C3;
import k2.g;
import k2.s;
import q2.r;
import v2.AbstractC5111b;

/* renamed from: m2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4731b {
    public static void b(Context context, String str, g gVar, AbstractC4730a abstractC4730a) {
        w.i(context, "Context cannot be null.");
        w.i(str, "adUnitId cannot be null.");
        w.i(gVar, "AdRequest cannot be null.");
        w.d("#008 Must be called on the main UI thread.");
        AbstractC3569ma.a(context);
        if (((Boolean) AbstractC2684Na.f26496d.r()).booleanValue()) {
            if (((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.Cc)).booleanValue()) {
                AbstractC5111b.f41397b.execute(new J(context, str, gVar, abstractC4730a, 9));
                return;
            }
        }
        new C3(context, str, gVar.f38584a, abstractC4730a).b();
    }

    public abstract s a();

    public abstract void c(Activity activity);
}
