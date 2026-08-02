package defpackage;

import com.yandex.passport.internal.ui.common.component.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class n10 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ yci d;
    public final /* synthetic */ int e;

    public /* synthetic */ n10(int i, boolean z, yci yciVar, int i2) {
        this.a = 1;
        this.b = i;
        this.c = z;
        this.d = yciVar;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ksw.d(rvf.R(this.b | 1), this.e, hq5Var, this.d, this.c);
                break;
            case 1:
                n7w.i(this.b, rvf.R(this.e | 1), hq5Var, this.d, this.c);
                break;
            case 2:
                vut.k(rvf.R(this.b | 1), this.e, hq5Var, this.d, this.c);
                break;
            case 3:
                qld.j(rvf.R(this.b | 1), this.e, hq5Var, this.d, this.c);
                break;
            case 4:
                gdg.i(rvf.R(this.b | 1), this.e, hq5Var, this.d, this.c);
                break;
            case 5:
                hdg.j(rvf.R(this.b | 1), this.e, hq5Var, this.d, this.c);
                break;
            case 6:
                ivf.k(rvf.R(this.b | 1), this.e, hq5Var, this.d, this.c);
                break;
            case 7:
                fxf.j(this.b, rvf.R(this.e | 1), hq5Var, this.d, this.c);
                break;
            case 8:
                wdg.k(rvf.R(this.b | 1), this.e, hq5Var, this.d, this.c);
                break;
            default:
                a.a(rvf.R(this.b | 1), this.e, hq5Var, this.d, this.c);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ n10(yci yciVar, boolean z, int i, int i2, int i3) {
        this.a = i3;
        this.d = yciVar;
        this.c = z;
        this.b = i;
        this.e = i2;
    }

    public /* synthetic */ n10(boolean z, yci yciVar, int i, int i2, int i3) {
        this.a = i3;
        this.c = z;
        this.d = yciVar;
        this.b = i;
        this.e = i2;
    }
}
