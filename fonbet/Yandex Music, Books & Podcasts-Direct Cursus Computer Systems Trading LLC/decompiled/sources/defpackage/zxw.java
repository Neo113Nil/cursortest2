package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes.dex */
public final class zxw extends jyw {
    public final gr2 b;

    public zxw(gr2 gr2Var) {
        super(1);
        this.b = gr2Var;
    }

    @Override // defpackage.jyw
    public final void a(Status status) {
        try {
            this.b.m(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.jyw
    public final void b(Exception exc) {
        try {
            this.b.m(new Status(10, ouj.o(exc.getClass().getSimpleName(), ": ", exc.getLocalizedMessage()), null, null));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.jyw
    public final void c(axw axwVar) {
        try {
            gr2 gr2Var = this.b;
            fo0 fo0Var = axwVar.h;
            gr2Var.getClass();
            try {
                gr2Var.l(fo0Var);
            } catch (DeadObjectException e) {
                gr2Var.m(new Status(8, e.getLocalizedMessage(), null, null));
                throw e;
            } catch (RemoteException e2) {
                gr2Var.m(new Status(8, e2.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e3) {
            b(e3);
        }
    }

    @Override // defpackage.jyw
    public final void d(apo apoVar, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Map map = (Map) apoVar.b;
        gr2 gr2Var = this.b;
        map.put(gr2Var, valueOf);
        gr2Var.a(new eww(apoVar, gr2Var));
    }
}
