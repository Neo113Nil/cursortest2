package defpackage;

import com.yandex.passport.common.ui.progress.g;
import com.yandex.passport.internal.ui.a;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class qu implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ qu(int i, ukd ukdVar, plv plvVar, boolean z, int i2, int i3) {
        this.a = 9;
        this.c = i;
        this.e = ukdVar;
        this.f = plvVar;
        this.b = z;
        this.d = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                ghh.b(this.b, (yci) this.e, (e9g) this.f, (hq5) obj, rvf.R(this.c | 1), this.d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                pd.b((qzm[]) this.e, this.b, (Function2) this.f, (hq5) obj, rvf.R(this.c | 1), this.d);
                break;
            case 2:
                ((Integer) obj2).getClass();
                p9b.a((wn5) this.f, (yci) this.e, this.b, (hq5) obj, rvf.R(this.c | 1), this.d);
                break;
            case 3:
                ((Integer) obj2).getClass();
                v3g.d((w3g) this.f, (yci) this.e, this.b, (hq5) obj, rvf.R(this.c | 1), this.d);
                break;
            case 4:
                ((Integer) obj2).getClass();
                t7g.i((String) this.e, this.b, (ges) this.f, (hq5) obj, rvf.R(this.c | 1), this.d);
                break;
            case 5:
                ((Integer) obj2).getClass();
                qgg.b(this.b, (zpd) this.f, (yci) this.e, (hq5) obj, rvf.R(this.c | 1), this.d);
                break;
            case 6:
                ((Integer) obj2).getClass();
                ivf.l(this.b, (yci) this.e, (ges) this.f, (hq5) obj, rvf.R(this.c | 1), this.d);
                break;
            case 7:
                ((Integer) obj2).getClass();
                a0g.c(this.b, (yci) this.e, (Integer) this.f, (hq5) obj, rvf.R(this.c | 1), this.d);
                break;
            case 8:
                ((Integer) obj2).getClass();
                f8g.f(this.c, this.b, (Function0) this.f, (yci) this.e, (hq5) obj, rvf.R(this.d | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                int R = rvf.R(1);
                p1g.v(this.c, (ukd) this.e, (plv) this.f, this.b, (hq5) obj, R, this.d);
                break;
            case 10:
                ((Integer) obj2).getClass();
                gdg.p((cvv) this.f, (yci) this.e, this.b, (hq5) obj, rvf.R(this.c | 1), this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                a.i((yci) this.e, (g) this.f, this.b, (hq5) obj, rvf.R(this.c | 1), this.d);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ qu(yci yciVar, g gVar, boolean z, int i, int i2) {
        this.a = 11;
        this.e = yciVar;
        this.f = gVar;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ qu(Serializable serializable, boolean z, Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.e = serializable;
        this.b = z;
        this.f = obj;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ qu(Object obj, yci yciVar, boolean z, int i, int i2, int i3) {
        this.a = i3;
        this.f = obj;
        this.e = yciVar;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ qu(Function0 function0, boolean z, yci yciVar, int i, int i2) {
        this.a = 8;
        this.c = i;
        this.b = z;
        this.f = function0;
        this.e = yciVar;
        this.d = i2;
    }

    public /* synthetic */ qu(boolean z, zpd zpdVar, yci yciVar, int i, int i2) {
        this.a = 5;
        this.b = z;
        this.f = zpdVar;
        this.e = yciVar;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ qu(boolean z, yci yciVar, Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.b = z;
        this.e = yciVar;
        this.f = obj;
        this.c = i;
        this.d = i2;
    }
}
