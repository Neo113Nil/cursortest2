package defpackage;

import androidx.compose.foundation.a;

/* loaded from: classes10.dex */
public final /* synthetic */ class y6 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ y6(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        cqh cqhVar;
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                jrv jrvVar = (jrv) npb1.c(aVar, lrv.a);
                if (!(jrvVar instanceof prv)) {
                    lxv.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + jrvVar);
                }
                prv prvVar = aVar.D;
                prv prvVar2 = (prv) jrvVar;
                aVar.D = prvVar2;
                if (prvVar != null && !jl40.l(prvVar2, prvVar) && ((cqhVar = aVar.F) != null || !aVar.M)) {
                    if (cqhVar != null) {
                        aVar.F0(cqhVar);
                    }
                    aVar.F = null;
                    aVar.O0();
                }
                return zy11.a;
            default:
                aVar.B.invoke();
                return Boolean.TRUE;
        }
    }
}
