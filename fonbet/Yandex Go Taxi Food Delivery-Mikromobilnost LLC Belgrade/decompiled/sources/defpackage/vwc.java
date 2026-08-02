package defpackage;

import android.os.Looper;
import android.text.TextUtils;
import com.yandex.messaging.internal.BackendCompatibilityStatus;

/* loaded from: classes15.dex */
public final class vwc extends iqh implements o8j0, of4 {
    public final String b;
    public final hfy c;
    public wwc w;
    public awu x;
    public pf4 y;
    public final /* synthetic */ xwc z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwc(xwc xwcVar, String str, w920 w920Var, hfy hfyVar) {
        super(w920Var);
        this.z = xwcVar;
        this.w = new io9(this);
        this.b = str;
        this.c = hfyVar;
        qf4 qf4Var = xwcVar.c;
        z83.g(null, qf4Var.a, Looper.myLooper());
        this.y = new pf4(qf4Var, this);
    }

    @Override // defpackage.of4
    public final void a(BackendCompatibilityStatus backendCompatibilityStatus) {
        int i = uwc.a[backendCompatibilityStatus.ordinal()];
        boolean z = true;
        if (i != 1 && i != 2) {
            if (i != 3) {
                ny61.k();
                return;
            }
            z = false;
        }
        this.w = this.w.i(z);
    }

    @Override // defpackage.x08
    public final void cancel() {
        z83.g(null, this.z.a, Looper.myLooper());
        o();
        awu awuVar = this.x;
        if (awuVar != null) {
            awuVar.cancel();
            this.x = null;
        }
    }

    @Override // defpackage.iqh, defpackage.w920
    public final boolean e(ngz ngzVar) {
        if (ngzVar.b != 400 || !"outdated_api".equals(ngzVar.c)) {
            if (!this.a.e(ngzVar)) {
                return false;
            }
            o();
            return true;
        }
        cancel();
        qf4 qf4Var = this.z.c;
        z83.g(null, qf4Var.a, Looper.myLooper());
        BackendCompatibilityStatus backendCompatibilityStatus = qf4Var.f;
        BackendCompatibilityStatus backendCompatibilityStatus2 = BackendCompatibilityStatus.FULL_OUTDATED;
        if (backendCompatibilityStatus != backendCompatibilityStatus2) {
            qf4Var.f = backendCompatibilityStatus2;
            qf4Var.a();
        }
        return true;
    }

    @Override // defpackage.iqh, defpackage.w920
    public final void f(meu meuVar) {
        Integer num;
        xwc xwcVar = this.z;
        String a = meuVar.a("X-Version");
        if (!TextUtils.isEmpty(a)) {
            try {
                num = Integer.valueOf(Integer.parseInt(a));
            } catch (NumberFormatException e) {
                xwcVar.d.reportError("backend version isn't integer", e);
                num = null;
            }
            if (num != null && 5 < num.intValue()) {
                qf4 qf4Var = xwcVar.c;
                z83.g(null, qf4Var.a, Looper.myLooper());
                qf4Var.d = true;
                if (qf4Var.f == BackendCompatibilityStatus.OK && qf4Var.e) {
                    qf4Var.f = BackendCompatibilityStatus.PARTIALLY_OUTDATED;
                    qf4Var.a();
                }
            }
        }
        super.f(meuVar);
    }

    @Override // defpackage.iqh, defpackage.w920
    public final void g(Object obj) {
        o();
        super.g(obj);
    }

    public final void o() {
        pf4 pf4Var = this.y;
        if (pf4Var != null) {
            pf4Var.close();
            this.y = null;
        }
    }
}
