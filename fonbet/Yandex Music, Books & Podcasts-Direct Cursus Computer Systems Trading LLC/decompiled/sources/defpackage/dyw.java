package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes.dex */
public final class dyw extends hxw {
    public final h8s b;
    public final i8s c;
    public final rwd d;

    public dyw(int i, h8s h8sVar, i8s i8sVar, rwd rwdVar) {
        super(i);
        this.c = i8sVar;
        this.b = h8sVar;
        this.d = rwdVar;
        if (i == 2 && h8sVar.b) {
            xq0.x("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // defpackage.jyw
    public final void a(Status status) {
        this.d.getClass();
        this.c.c(n7w.K(status));
    }

    @Override // defpackage.jyw
    public final void b(Exception exc) {
        this.c.c(exc);
    }

    @Override // defpackage.jyw
    public final void c(axw axwVar) {
        i8s i8sVar = this.c;
        try {
            this.b.b(axwVar.h, i8sVar);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(jyw.e(e2));
        } catch (RuntimeException e3) {
            i8sVar.c(e3);
        }
    }

    @Override // defpackage.jyw
    public final void d(apo apoVar, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Map map = (Map) apoVar.c;
        i8s i8sVar = this.c;
        map.put(i8sVar, valueOf);
        i8sVar.a.addOnCompleteListener(new atn(apoVar, i8sVar, false, 21));
    }

    @Override // defpackage.hxw
    public final boolean f(axw axwVar) {
        return this.b.b;
    }

    @Override // defpackage.hxw
    public final i6c[] g(axw axwVar) {
        return (i6c[]) this.b.c;
    }
}
