package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class uka implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vka b;
    public final /* synthetic */ jur c;

    public /* synthetic */ uka(jur jurVar, vka vkaVar) {
        this.a = 2;
        this.c = jurVar;
        this.b = vkaVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                vka vkaVar = this.b;
                return new pi4((raa) vkaVar.k.getValue(), (yx4) vkaVar.o.getValue(), (wca) vkaVar.g.getValue(), (sga) vkaVar.h.getValue(), this.c);
            case 1:
                vka vkaVar2 = this.b;
                taa taaVar = (taa) vkaVar2.k.getValue();
                e6q e6qVar = (e6q) vkaVar2.d.getValue();
                xka xkaVar = (xka) ((yka) vkaVar2.a).j.getValue();
                return new crt(this.c, taaVar, e6qVar, new tka(0, vkaVar2), xkaVar);
            default:
                return new e6q(this.c, this.b.a);
        }
    }

    public /* synthetic */ uka(vka vkaVar, jur jurVar, int i) {
        this.a = i;
        this.b = vkaVar;
        this.c = jurVar;
    }
}
