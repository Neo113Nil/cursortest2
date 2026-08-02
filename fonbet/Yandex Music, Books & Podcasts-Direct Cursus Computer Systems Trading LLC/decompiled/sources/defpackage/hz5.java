package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class hz5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ yci f;

    public /* synthetic */ hz5(String str, long j, qmu qmuVar, yci yciVar, boolean z, int i) {
        this.a = 2;
        this.c = str;
        this.d = j;
        this.e = qmuVar;
        this.f = yciVar;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(65);
                xv.r(this.b, (wv5) this.c, this.d, (Function0) this.e, this.f, (hq5) obj, R);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int R2 = rvf.R(65);
                xv.r(this.b, (wv5) this.c, this.d, (Function0) this.e, this.f, (hq5) obj, R2);
                break;
            default:
                ((Integer) obj2).getClass();
                int R3 = rvf.R(1);
                fxf.o((String) this.c, this.d, (qmu) this.e, this.f, this.b, (hq5) obj, R3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ hz5(boolean z, wv5 wv5Var, long j, Function0 function0, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = wv5Var;
        this.d = j;
        this.e = function0;
        this.f = yciVar;
    }
}
