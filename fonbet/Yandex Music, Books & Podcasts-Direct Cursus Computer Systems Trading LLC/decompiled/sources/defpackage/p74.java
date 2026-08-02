package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class p74 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ yci c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ p74(int i, long j, Function0 function0, yci yciVar, int i2) {
        this.a = 0;
        this.e = i;
        this.d = j;
        this.b = function0;
        this.c = yciVar;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Function0 function0 = (Function0) this.b;
                ((Integer) obj2).getClass();
                int R = rvf.R(this.f | 1);
                hld.h(this.e, R, this.d, (hq5) obj, this.c, function0);
                break;
            case 1:
                Function0 function02 = (Function0) this.b;
                ((Integer) obj2).getClass();
                zdg.g(rvf.R(this.e | 1), this.f, this.d, (hq5) obj, this.c, function02);
                break;
            case 2:
                Function0 function03 = (Function0) this.b;
                ((Integer) obj2).getClass();
                a0g.o(rvf.R(this.e | 1), this.f, this.d, (hq5) obj, this.c, function03);
                break;
            default:
                ((Integer) obj2).getClass();
                lg3.q((jzb) this.b, this.c, this.d, (hq5) obj, rvf.R(this.e | 1), this.f);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ p74(Object obj, yci yciVar, long j, int i, int i2, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = yciVar;
        this.d = j;
        this.e = i;
        this.f = i2;
    }
}
