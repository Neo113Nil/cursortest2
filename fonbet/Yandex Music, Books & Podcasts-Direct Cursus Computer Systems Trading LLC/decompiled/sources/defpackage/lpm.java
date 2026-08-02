package defpackage;

import android.os.Handler;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class lpm extends bfu {
    public final sdk k;
    public final hek l;
    public final n7b m;
    public final boolean n;
    public final Handler o;
    public final bml p;
    public final j8o q;
    public final voi r;
    public final voi s;
    public final voi t;
    public ffk u;
    public String v;
    public ix3 w;
    public jw3 x;
    public oom y;

    public lpm(sdk sdkVar, hek hekVar, n7b n7bVar, boolean z, Handler handler, bml bmlVar, j8o j8oVar) {
        sdkVar.getClass();
        hekVar.getClass();
        n7bVar.getClass();
        j8oVar.getClass();
        this.k = sdkVar;
        this.l = hekVar;
        this.m = n7bVar;
        this.n = z;
        this.o = handler;
        this.p = bmlVar;
        this.q = j8oVar;
        this.r = new voi();
        this.s = new voi();
        this.t = new voi();
        this.w = ix3.m;
        this.x = jw3.a;
    }

    public final void G() {
        xom xomVar;
        int ordinal = this.x.ordinal();
        voi voiVar = this.s;
        if (ordinal == 0) {
            voiVar.l(new xom(R.string.paymentsdk_bind_card_next_button, null, null));
            return;
        }
        if (ordinal == 1) {
            voiVar.l(new yom(R.string.paymentsdk_bind_card_next_button, null, null));
            return;
        }
        boolean z = this.n;
        if (ordinal == 2) {
            if (z) {
                oom oomVar = this.y;
                Double valueOf = oomVar != null ? Double.valueOf(oomVar.b) : null;
                oom oomVar2 = this.y;
                xomVar = new xom(R.string.paymentsdk_pay_title, valueOf, oomVar2 != null ? oomVar2.c : null);
            } else {
                xomVar = new xom(R.string.paymentsdk_bind_card_button, null, null);
            }
            voiVar.l(xomVar);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        if (!z) {
            voiVar.l(new yom(R.string.paymentsdk_bind_card_button, null, null));
            return;
        }
        oom oomVar3 = this.y;
        if (oomVar3 == null) {
            voiVar.l(new yom(R.string.paymentsdk_pay_title, null, null));
            return;
        }
        Double d = oomVar3.c;
        boolean z2 = oomVar3.a;
        double d2 = oomVar3.b;
        voiVar.l(z2 ? new yom(R.string.paymentsdk_pay_title, Double.valueOf(d2), d) : new xom(R.string.paymentsdk_pay_title, Double.valueOf(d2), d));
    }
}
