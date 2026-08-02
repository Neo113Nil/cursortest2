package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class km0 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;

    public /* synthetic */ km0(long j, long j2, yci yciVar, int i) {
        this.b = j;
        this.c = j2;
        this.d = yciVar;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                yci yciVar = (yci) this.d;
                ((Integer) obj2).getClass();
                pm0.e(rvf.R(this.e | 1), this.b, this.c, (hq5) obj, yciVar);
                break;
            case 1:
                yci yciVar2 = (yci) this.d;
                ((Integer) obj2).getClass();
                sk3.m(rvf.R(this.e | 1), this.b, this.c, (hq5) obj, yciVar2);
                break;
            default:
                ((Integer) obj2).intValue();
                hyf.a((dh3) this.d, this.b, this.c, (hq5) obj, rvf.R(this.e | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ km0(long j, yci yciVar, long j2, int i) {
        this.b = j;
        this.d = yciVar;
        this.c = j2;
        this.e = i;
    }

    public /* synthetic */ km0(dh3 dh3Var, long j, long j2, int i) {
        this.d = dh3Var;
        this.b = j;
        this.c = j2;
        this.e = i;
    }
}
