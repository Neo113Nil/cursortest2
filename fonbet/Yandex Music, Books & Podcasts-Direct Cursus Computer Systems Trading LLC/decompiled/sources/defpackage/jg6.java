package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class jg6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ float c;
    public final /* synthetic */ yci d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ jg6(String str, Function0 function0, yci yciVar, float f, int i, int i2) {
        this.a = 2;
        this.b = str;
        this.g = function0;
        this.d = yciVar;
        this.c = f;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                leu.s((zg6) this.b, (qh6) this.g, this.c, this.d, (hq5) obj, rvf.R(this.e | 1), this.f);
                break;
            case 1:
                ((Integer) obj2).getClass();
                leu.v((zg6) this.b, (o3j) this.g, this.c, this.d, (hq5) obj, rvf.R(this.e | 1), this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                hdg.o((String) this.b, (Function0) this.g, this.d, this.c, (hq5) obj, rvf.R(this.e | 1), this.f);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ jg6(zg6 zg6Var, Object obj, float f, yci yciVar, int i, int i2, int i3) {
        this.a = i3;
        this.b = zg6Var;
        this.g = obj;
        this.c = f;
        this.d = yciVar;
        this.e = i;
        this.f = i2;
    }
}
