package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class fsl implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ fsl(qzl qzlVar, tvd tvdVar, boolean z, boolean z2, boolean z3, nab nabVar, thj thjVar, Function0 function0, yci yciVar, int i) {
        this.g = qzlVar;
        this.h = tvdVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.i = nabVar;
        this.j = thjVar;
        this.e = function0;
        this.k = yciVar;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                wdg.d((qzl) this.g, (tvd) this.h, this.b, this.c, this.d, (nab) this.i, (thj) this.j, this.e, (yci) this.k, (hq5) obj, rvf.R(this.f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                w8u.a(this.b, this.c, this.d, (m6u) this.g, this.e, (Function0) this.h, (Function1) this.i, (Function0) this.j, (Function0) this.k, (hq5) obj, rvf.R(this.f | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ fsl(boolean z, boolean z2, boolean z3, m6u m6uVar, Function0 function0, Function0 function02, Function1 function1, Function0 function03, Function0 function04, int i) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.g = m6uVar;
        this.e = function0;
        this.h = function02;
        this.i = function1;
        this.j = function03;
        this.k = function04;
        this.f = i;
    }
}
