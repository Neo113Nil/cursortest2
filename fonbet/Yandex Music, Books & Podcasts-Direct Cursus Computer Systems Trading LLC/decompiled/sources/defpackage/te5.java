package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class te5 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ te5(int i, int i2, long j, yci yciVar) {
        this.e = yciVar;
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                zc4.m(this.b, (wn5) this.e, (hq5) obj, rvf.R(this.c | 1), this.d);
                break;
            default:
                yci yciVar = (yci) this.e;
                ((Integer) obj2).getClass();
                c3x.m(rvf.R(this.c | 1), this.d, this.b, (hq5) obj, yciVar);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ te5(long j, wn5 wn5Var, int i, int i2) {
        this.b = j;
        this.e = wn5Var;
        this.c = i;
        this.d = i2;
    }
}
