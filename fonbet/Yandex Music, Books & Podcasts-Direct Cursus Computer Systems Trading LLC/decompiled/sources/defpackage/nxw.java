package defpackage;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class nxw extends uyw {
    public i8s f;

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f() {
        this.f.c(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    @Override // defpackage.uyw
    public final void k(h66 h66Var, int i) {
        String str = h66Var.d;
        if (str == null) {
            str = "Error connecting to Google Play services";
        }
        this.f.a(new qo0(new Status(h66Var.b, str, h66Var.c, h66Var)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, vyf] */
    @Override // defpackage.uyw
    public final void l() {
        Activity l = this.a.l();
        if (l == null) {
            this.f.c(new qo0(new Status(8, null, null, null)));
            return;
        }
        int b = this.e.b(l, qmd.a);
        i8s i8sVar = this.f;
        if (b == 0) {
            i8sVar.d(null);
        } else {
            if (i8sVar.a.k()) {
                return;
            }
            m(new h66(b, null), 0);
        }
    }
}
