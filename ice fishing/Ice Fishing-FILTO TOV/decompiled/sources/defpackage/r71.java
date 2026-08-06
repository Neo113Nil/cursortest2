package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class r71 implements v01 {
    public final /* synthetic */ int GWasM1elztuh;
    public final hv X1lG3V04pd;
    public final v01 Yi7zF1RB1;

    public /* synthetic */ r71(v01 v01Var, hv hvVar, int i) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = v01Var;
        this.X1lG3V04pd = hvVar;
    }

    @Override // defpackage.v01
    public final Iterator iterator() {
        switch (this.GWasM1elztuh) {
            case 0:
                return new vr(this);
            default:
                return new ia1(this);
        }
    }
}
