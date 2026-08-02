package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class nr implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tvd b;

    public /* synthetic */ nr(tvd tvdVar, int i) {
        this.a = i;
        this.b = tvdVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Float.valueOf(this.b.c());
            case 1:
                return Boolean.valueOf(this.b.a() < 0.8f);
            case 2:
                return Boolean.valueOf(this.b.a() == 1.0f);
            case 3:
                return Float.valueOf(this.b.c());
            case 4:
                return Float.valueOf(this.b.d());
            case 5:
                return Boolean.valueOf(this.b.b() < 1.0f);
            case 6:
                return Float.valueOf(this.b.d());
            case 7:
                return Integer.valueOf(ivf.B(this.b.a));
            case 8:
                return Float.valueOf(this.b.c());
            case 9:
                return Float.valueOf(this.b.c());
            case 10:
                return Float.valueOf(this.b.c());
            case 11:
                return Boolean.valueOf(!(this.b.c() == 0.0f));
            case 12:
                return Float.valueOf(this.b.d());
            case 13:
                tvd tvdVar = this.b;
                return Integer.valueOf(tvdVar.d() > 0.0f ? ivf.B(tvdVar.a) : 0);
            case 14:
                return Float.valueOf(this.b.d());
            case 15:
                return Boolean.valueOf(this.b.b() < 1.0f);
            case 16:
                return Integer.valueOf(ivf.B(this.b.a));
            case 17:
                return Float.valueOf(this.b.d());
            case 18:
                return Float.valueOf(1.0f - this.b.a());
            case 19:
                return Float.valueOf(this.b.d());
            case 20:
                tvd tvdVar2 = this.b;
                return Integer.valueOf(tvdVar2.d() > 0.0f ? ivf.B(tvdVar2.a) : 0);
            case 21:
                return Float.valueOf(this.b.d());
            case 22:
                return Boolean.valueOf(this.b.a() == 1.0f);
            case 23:
                return Float.valueOf(this.b.c());
            case 24:
                return Boolean.valueOf(this.b.a() < 0.8f);
            case 25:
                return Boolean.valueOf(this.b.b() < 1.0f);
            case 26:
                return Float.valueOf(this.b.c());
            case 27:
                return Boolean.valueOf(this.b.a() >= 0.8f);
            default:
                return Boolean.valueOf(this.b.a() == 1.0f);
        }
    }
}
