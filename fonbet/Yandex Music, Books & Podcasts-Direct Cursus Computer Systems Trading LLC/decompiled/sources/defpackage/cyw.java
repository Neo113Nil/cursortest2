package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class cyw extends hxw {
    public final i8s b;
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cyw(vcg vcgVar, i8s i8sVar) {
        this(4, i8sVar);
        this.c = 1;
        this.d = vcgVar;
    }

    @Override // defpackage.jyw
    public final void a(Status status) {
        this.b.c(new qo0(status));
    }

    @Override // defpackage.jyw
    public final void b(Exception exc) {
        this.b.c(exc);
    }

    @Override // defpackage.jyw
    public final void c(axw axwVar) {
        try {
            h(axwVar);
        } catch (DeadObjectException e) {
            a(jyw.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(jyw.e(e2));
        } catch (RuntimeException e3) {
            this.b.c(e3);
        }
    }

    @Override // defpackage.jyw
    public final /* bridge */ /* synthetic */ void d(apo apoVar, boolean z) {
        int i = this.c;
    }

    @Override // defpackage.hxw
    public final boolean f(axw axwVar) {
        switch (this.c) {
            case 0:
                return true;
            default:
                return ((qxw) axwVar.l.get((vcg) this.d)) != null;
        }
    }

    @Override // defpackage.hxw
    public final i6c[] g(axw axwVar) {
        switch (this.c) {
            case 0:
                return (i6c[]) ((qxw) this.d).a.c;
            default:
                qxw qxwVar = (qxw) axwVar.l.get((vcg) this.d);
                if (qxwVar == null) {
                    return null;
                }
                return (i6c[]) qxwVar.a.c;
        }
    }

    public final void h(axw axwVar) {
        switch (this.c) {
            case 0:
                yks yksVar = ((qxw) this.d).a;
                ((uiq) ((c1t) yksVar.d).c).accept(axwVar.h, this.b);
                vcg vcgVar = ((wcg) ((qxw) this.d).a.b).a;
                if (vcgVar != null) {
                    axwVar.l.put(vcgVar, (qxw) this.d);
                    break;
                }
                break;
            default:
                qxw qxwVar = (qxw) axwVar.l.remove((vcg) this.d);
                if (qxwVar == null) {
                    this.b.d(Boolean.FALSE);
                    break;
                } else {
                    ((hil) ((c1t) qxwVar.b.b).d).accept(axwVar.h, this.b);
                    ((wcg) qxwVar.a.b).a = null;
                    break;
                }
        }
    }

    public cyw(int i, i8s i8sVar) {
        super(i);
        this.b = i8sVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cyw(qxw qxwVar, i8s i8sVar) {
        this(3, i8sVar);
        this.c = 0;
        this.d = qxwVar;
    }

    private final /* bridge */ /* synthetic */ void i(apo apoVar, boolean z) {
    }

    private final /* bridge */ /* synthetic */ void j(apo apoVar, boolean z) {
    }
}
