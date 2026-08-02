package defpackage;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class cqv extends bqv {
    public zne n;

    public cqv(kqv kqvVar, cqv cqvVar) {
        super(kqvVar, cqvVar);
        this.n = null;
        this.n = cqvVar.n;
    }

    @Override // defpackage.hqv
    public kqv b() {
        return kqv.h(null, this.c.consumeStableInsets());
    }

    @Override // defpackage.hqv
    public kqv c() {
        return kqv.h(null, this.c.consumeSystemWindowInsets());
    }

    @Override // defpackage.hqv
    public final zne j() {
        if (this.n == null) {
            WindowInsets windowInsets = this.c;
            this.n = zne.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.n;
    }

    @Override // defpackage.hqv
    public boolean o() {
        return this.c.isConsumed();
    }

    @Override // defpackage.hqv
    public void u(zne zneVar) {
        this.n = zneVar;
    }

    public cqv(kqv kqvVar, WindowInsets windowInsets) {
        super(kqvVar, windowInsets);
        this.n = null;
    }
}
