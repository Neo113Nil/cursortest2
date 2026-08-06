package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class qe0 implements pe0 {
    public final bo0 AvO7iQsrTN = new bo0(1.0f);
    public ug EljAMC1QTz;
    public final Context OOA6hdeuvCS;
    public f51 encWxUiV2;

    public qe0(Context context) {
        this.OOA6hdeuvCS = context;
    }

    @Override // defpackage.gh
    public final eh E7jCp8Ls(fh fhVar) {
        return n30.arNh8D4Z5gB(this, fhVar);
    }

    @Override // defpackage.gh
    public final Object WIEu4Ya2g8(lv lvVar, Object obj) {
        return lvVar.EljAMC1QTz(obj, this);
    }

    @Override // defpackage.pe0
    public final float Y6hRI1cF8() {
        vg vgVar;
        n51 n51Var;
        if (this.encWxUiV2 == null) {
            Context context = this.OOA6hdeuvCS;
            hg0 hg0Var = sh1.GWasM1elztuh;
            synchronized (hg0Var) {
                try {
                    Object AvO7iQsrTN = hg0Var.AvO7iQsrTN(context);
                    vgVar = null;
                    if (AvO7iQsrTN == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        n8 Yi7zF1RB1 = fb1.Yi7zF1RB1(-1, null, 6);
                        si siVar = new si(2, new qh1(contentResolver, uriFor, new rh1(Yi7zF1RB1, qj.iwATDS1i01k(Looper.getMainLooper())), Yi7zF1RB1, context, null));
                        u61 u61Var = new u61(null);
                        pk pkVar = mm.GWasM1elztuh;
                        AvO7iQsrTN = rj0.MZhzXH72(siVar, new ug(n30.HFYAaqMd6(u61Var, cc0.GWasM1elztuh)), new k51(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        hg0Var.XnEVoBF0td1l(context, AvO7iQsrTN);
                    }
                    n51Var = (n51) AvO7iQsrTN;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.AvO7iQsrTN.encWxUiV2(((Number) n51Var.getValue()).floatValue());
            ug ugVar = this.EljAMC1QTz;
            if (ugVar == null) {
                o4.jivtDDk9H("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.encWxUiV2 = fb1.MZhzXH72(ugVar, null, new xqGvceK5x(n51Var, this, vgVar, 14), 3);
        }
        return this.AvO7iQsrTN.AvO7iQsrTN();
    }

    @Override // defpackage.gh
    public final gh jivtDDk9H(fh fhVar) {
        return n30.DmJncFq5(this, fhVar);
    }

    @Override // defpackage.gh
    public final gh mOu10nynGul(gh ghVar) {
        return n30.HFYAaqMd6(this, ghVar);
    }
}
