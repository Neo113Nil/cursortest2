package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class td6 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ yci c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ td6(yci yciVar, boolean z, long j, Function0 function0, Function0 function02, wn5 wn5Var, int i, int i2) {
        this.c = yciVar;
        this.d = z;
        this.b = j;
        this.g = function0;
        this.h = function02;
        this.i = wn5Var;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                ltg.i(this.c, this.d, this.b, (Function0) this.g, (Function0) this.h, (wn5) this.i, (hq5) obj, rvf.R(this.e | 1), this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                wxf.g((String) this.g, this.b, (udv) this.h, (yfv) this.i, this.c, this.d, (hq5) obj, rvf.R(this.e | 1), this.f);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ td6(String str, long j, udv udvVar, yfv yfvVar, yci yciVar, boolean z, int i, int i2) {
        this.g = str;
        this.b = j;
        this.h = udvVar;
        this.i = yfvVar;
        this.c = yciVar;
        this.d = z;
        this.e = i;
        this.f = i2;
    }
}
