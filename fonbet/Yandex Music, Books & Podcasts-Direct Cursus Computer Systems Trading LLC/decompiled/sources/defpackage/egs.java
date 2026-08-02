package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class egs implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ yci d;
    public final /* synthetic */ int e;

    public /* synthetic */ egs(Function0 function0, yci yciVar, boolean z, int i) {
        this.c = function0;
        this.d = yciVar;
        this.b = z;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                neg.d(rvf.R(this.e | 1), hq5Var, this.d, this.c, this.b);
                break;
            default:
                u1g.b(rvf.R(this.e | 1), hq5Var, this.d, this.c, this.b);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ egs(boolean z, Function0 function0, yci yciVar, int i) {
        this.b = z;
        this.c = function0;
        this.d = yciVar;
        this.e = i;
    }
}
