package defpackage;

import android.net.Uri;

/* loaded from: classes13.dex */
public final class u5y0 implements k5y0 {
    public final /* synthetic */ rwo0 a;

    public u5y0(rwo0 rwo0Var) {
        this.a = rwo0Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.r(new qu(9));
    }

    @Override // defpackage.k5y0
    public final void h1(Uri uri) {
        qu quVar = new qu(9);
        rwo0 rwo0Var = this.a;
        rwo0Var.r(quVar);
        ((lzu0) rwo0Var.F).invoke(uri);
    }
}
