package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class sv2 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ gds s;
    public final /* synthetic */ Function1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sv2(gds gdsVar, Function1 function1, int i) {
        super(1);
        this.r = i;
        this.s = gdsVar;
        this.t = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                cds cdsVar = (cds) obj;
                gds gdsVar = this.s;
                if (gdsVar != null) {
                    gdsVar.a.setValue(cdsVar);
                }
                Function1 function1 = this.t;
                if (function1 != null) {
                    function1.invoke(cdsVar);
                }
                return Unit.a;
            default:
                gds gdsVar2 = this.s;
                s2r s2rVar = gdsVar2.c;
                Function1 function12 = this.t;
                s2rVar.add(function12);
                return new mf0(12, gdsVar2, function12);
        }
    }
}
