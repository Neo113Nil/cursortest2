package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class yj implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yj(mfv mfvVar, xfv xfvVar, boolean z, int i) {
        this.a = 8;
        this.d = mfvVar;
        this.e = xfvVar;
        this.b = z;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        boolean z = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                xp3.b(z, (yci) obj4, (ges) obj3, (hq5) obj, rvf.R(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                rb.k((ayg) obj4, z, (Function1) obj3, (hq5) obj, rvf.R(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                y2h.a((yci) obj4, z, (c6h) obj3, (hq5) obj, rvf.R(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int i3 = kii.p;
                ((kii) obj4).r(z, (wn5) obj3, (hq5) obj, rvf.R(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                qgg.m(z, (zpd) obj3, (yci) obj4, (hq5) obj, rvf.R(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                u1g.j((uft) obj4, z, (Function1) obj3, (hq5) obj, rvf.R(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                int R = rvf.R(7);
                rvf.n(this.b, (yci) obj4, (bhs) obj3, (hq5) obj, R, this.c);
                break;
            case 7:
                ((Integer) obj2).getClass();
                fxf.q(z, (yci) obj4, (e9g) obj3, (hq5) obj, rvf.R(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                hyf.p((mfv) obj4, (xfv) obj3, z, (hq5) obj, rvf.R(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                wjv.c((kjv) obj3, z, (yci) obj4, (hq5) obj, rvf.R(i2 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                wdg.q(z, (lwv) obj4, (fvf) obj3, (hq5) obj, rvf.R(i2 | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ yj(kjv kjvVar, boolean z, yci yciVar, int i) {
        this.a = 9;
        this.e = kjvVar;
        this.b = z;
        this.d = yciVar;
        this.c = i;
    }

    public /* synthetic */ yj(Object obj, boolean z, Object obj2, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = z;
        this.e = obj2;
        this.c = i;
    }

    public /* synthetic */ yj(boolean z, zpd zpdVar, yci yciVar, int i) {
        this.a = 4;
        this.b = z;
        this.e = zpdVar;
        this.d = yciVar;
        this.c = i;
    }

    public /* synthetic */ yj(boolean z, yci yciVar, bhs bhsVar, int i, int i2) {
        this.a = 6;
        this.b = z;
        this.d = yciVar;
        this.e = bhsVar;
        this.c = i2;
    }

    public /* synthetic */ yj(boolean z, Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }
}
