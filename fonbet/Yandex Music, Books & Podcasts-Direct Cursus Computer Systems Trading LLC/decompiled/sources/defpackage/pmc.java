package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class pmc extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ eqi s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pmc(int i, eqi eqiVar) {
        super(1);
        this.r = i;
        this.s = eqiVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                eqi eqiVar = this.s;
                Object[] objArr = eqiVar.a;
                int i = eqiVar.c;
                for (int i2 = 0; i2 < i; i2++) {
                    ((lfh) objArr[i2]).d();
                }
                return Unit.a;
            default:
                this.s.d((wci) obj);
                return Boolean.TRUE;
        }
    }
}
