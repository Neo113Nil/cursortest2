package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class wpf extends jpf {
    public final /* synthetic */ zpf b;
    public final /* synthetic */ Function2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpf(zpf zpfVar, Function2 function2, String str) {
        super(str);
        this.b = zpfVar;
        this.c = function2;
    }

    @Override // defpackage.kfh
    public final lfh b(mfh mfhVar, List list, long j) {
        zpf zpfVar = this.b;
        upf upfVar = zpfVar.h;
        upfVar.a = mfhVar.getLayoutDirection();
        upfVar.b = mfhVar.getDensity();
        upfVar.c = mfhVar.i0();
        boolean F = mfhVar.F();
        Function2 function2 = this.c;
        if (F || zpfVar.a.h == null) {
            zpfVar.d = 0;
            lfh lfhVar = (lfh) function2.invoke(upfVar, new ga6(j));
            return new vpf(lfhVar, zpfVar, zpfVar.d, lfhVar, 1);
        }
        zpfVar.e = 0;
        lfh lfhVar2 = (lfh) function2.invoke(zpfVar.i, new ga6(j));
        return new vpf(lfhVar2, zpfVar, zpfVar.e, lfhVar2, 0);
    }
}
