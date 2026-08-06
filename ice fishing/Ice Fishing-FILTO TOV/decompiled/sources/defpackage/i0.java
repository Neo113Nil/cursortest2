package defpackage;

import android.view.DragEvent;
import android.view.View;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class i0 implements View.OnDragListener, fn {
    public final gn GWasM1elztuh;
    public final h0 X1lG3V04pd;
    public final c5 Yi7zF1RB1;

    public i0() {
        gn gnVar = new gn();
        gnVar.Y6hRI1cF8 = 0L;
        this.GWasM1elztuh = gnVar;
        this.Yi7zF1RB1 = new c5();
        this.X1lG3V04pd = new h0(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        j6IIN2O8eOU j6iin2o8eou = new j6IIN2O8eOU(12, dragEvent);
        int action = dragEvent.getAction();
        ua1 ua1Var = ua1.OOA6hdeuvCS;
        c5 c5Var = this.Yi7zF1RB1;
        gn gnVar = this.GWasM1elztuh;
        switch (action) {
            case 1:
                nt0 nt0Var = new nt0();
                NWXxPwoOUSX9 nWXxPwoOUSX9 = new NWXxPwoOUSX9(j6iin2o8eou, gnVar, nt0Var);
                if (nWXxPwoOUSX9.mOu10nynGul(gnVar) == ua1Var) {
                    w60.M3K9sHhK(gnVar, nWXxPwoOUSX9);
                }
                boolean z = nt0Var.OOA6hdeuvCS;
                c5Var.getClass();
                x4 x4Var = new x4(c5Var);
                while (x4Var.hasNext()) {
                    ((gn) x4Var.next()).OGdJP42E();
                }
                break;
            case 2:
                gnVar.Hc2GqxcqBiX(j6iin2o8eou);
                break;
            case 4:
                NWXxPwoOUSX9 nWXxPwoOUSX92 = new NWXxPwoOUSX9(10, j6iin2o8eou);
                if (nWXxPwoOUSX92.mOu10nynGul(gnVar) == ua1Var) {
                    w60.M3K9sHhK(gnVar, nWXxPwoOUSX92);
                }
                c5Var.clear();
                break;
            case 5:
                gnVar.sb9fmtV8A();
                break;
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                gnVar.XmVeRDAr();
                break;
        }
        return false;
    }
}
