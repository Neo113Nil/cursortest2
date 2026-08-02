package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class fh6 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fh6(kh6 kh6Var, zg6 zg6Var, float f, int i) {
        this.d = kh6Var;
        this.e = zg6Var;
        this.b = f;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(this.c | 1);
                gh6.b((kh6) this.d, (zg6) this.e, this.b, (hq5) obj, R);
                break;
            default:
                ((Integer) obj2).intValue();
                int R2 = rvf.R(this.c | 1);
                qgg.o((ugs) this.d, this.b, (pyc) this.e, (hq5) obj, R2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ fh6(ugs ugsVar, float f, pyc pycVar, int i) {
        this.d = ugsVar;
        this.b = f;
        this.e = pycVar;
        this.c = i;
    }
}
