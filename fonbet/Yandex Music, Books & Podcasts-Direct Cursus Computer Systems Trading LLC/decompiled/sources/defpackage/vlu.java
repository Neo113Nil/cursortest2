package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class vlu implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ yci c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ vlu(boolean z, yci yciVar, int i, boolean z2, int i2, int i3, int i4) {
        this.a = i4;
        this.b = z;
        this.c = yciVar;
        this.d = i;
        this.e = z2;
        this.f = i2;
        this.g = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                o2g.t(this.b, this.c, this.d, this.e, (hq5) obj, rvf.R(this.f | 1), this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                qgg.w(this.b, this.c, this.d, this.e, (hq5) obj, rvf.R(this.f | 1), this.g);
                break;
        }
        return Unit.a;
    }
}
