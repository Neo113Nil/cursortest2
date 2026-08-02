package defpackage;

import android.os.CancellationSignal;

/* loaded from: classes.dex */
public final /* synthetic */ class tp5 implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tp5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.a) {
            case 0:
                ((rar) this.b).g(null);
                break;
            default:
                qbs qbsVar = (qbs) this.b;
                if (qbsVar != null) {
                    axf axfVar = qbsVar.d;
                    if (axfVar != null) {
                        axfVar.e(rds.b);
                    }
                    axf axfVar2 = qbsVar.d;
                    if (axfVar2 != null) {
                        axfVar2.f(rds.b);
                        break;
                    }
                }
                break;
        }
    }
}
