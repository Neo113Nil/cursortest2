package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class hlv implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ ukd d;
    public final /* synthetic */ plv e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;

    public /* synthetic */ hlv(boolean z, float f, ukd ukdVar, plv plvVar, boolean z2, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = f;
        this.d = ukdVar;
        this.e = plvVar;
        this.f = z2;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                szf.C(this.b, this.c, this.d, this.e, this.f, (hq5) obj, rvf.R(this.g | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                szf.A(this.b, this.c, this.d, this.e, this.f, (hq5) obj, rvf.R(this.g | 1));
                break;
        }
        return Unit.a;
    }
}
