package defpackage;

import android.app.Activity;

/* loaded from: classes8.dex */
public final class vse {
    public final kse a;

    public vse(kse kseVar) {
        this.a = kseVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ike a(Activity activity) {
        pey peyVar = activity instanceof pey ? (pey) activity : null;
        if (peyVar != null) {
            return asb1.d(eja1.s(peyVar));
        }
        ike c = c(false);
        z83.i();
        return c;
    }

    public final ike b() {
        return g8e.f(this.a.e);
    }

    public final ike c(boolean z) {
        kse kseVar = this.a;
        return g8e.f(z ? kseVar.b : kseVar.a);
    }
}
