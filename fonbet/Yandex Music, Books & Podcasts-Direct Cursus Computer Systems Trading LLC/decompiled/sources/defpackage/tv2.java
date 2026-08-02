package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tv2 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ gds s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tv2(gds gdsVar, int i) {
        super(0);
        this.r = i;
        this.s = gdsVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        bds bdsVar;
        switch (this.r) {
            case 0:
                gds gdsVar = this.s;
                return Boolean.valueOf(gdsVar != null ? ((Boolean) new tv2(gdsVar, 2).invoke()).booleanValue() : false);
            case 1:
                gds gdsVar2 = this.s;
                return Boolean.valueOf(gdsVar2 != null ? ((Boolean) new tv2(gdsVar2, 2).invoke()).booleanValue() : false);
            default:
                gds gdsVar3 = this.s;
                mn0 mn0Var = gdsVar3.b;
                cds cdsVar = (cds) gdsVar3.a.getValue();
                return Boolean.valueOf(Intrinsics.d(mn0Var, (cdsVar == null || (bdsVar = cdsVar.a) == null) ? null : bdsVar.a));
        }
    }
}
