package defpackage;

import androidx.compose.foundation.lazy.a;
import com.yandex.passport.common.ui.progress.g;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class uf4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ uf4(int i, int i2, hdp hdpVar, Function0 function0, int i3) {
        this.a = 6;
        this.b = i;
        this.c = i2;
        this.d = hdpVar;
        this.e = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(this.c | 1);
                n7w.h(this.b, (wn5) this.d, (wn5) this.e, (hq5) obj, R);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int R2 = rvf.R(this.c | 1);
                irf.w((a) this.d, this.b, (tv4) this.e, (hq5) obj, R2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int R3 = rvf.R(this.c | 1);
                lg3.t((List) this.d, this.b, (yci) this.e, (hq5) obj, R3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int R4 = rvf.R(this.c | 1);
                xv7.d((CharSequence) this.e, this.b, (wn5) this.d, (hq5) obj, R4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                ivf.a((wn5) this.d, (Function0) this.e, (hq5) obj, rvf.R(this.b | 1), this.c);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int R5 = rvf.R(1);
                ldg.c((ixm) this.d, (yci) this.e, this.b, this.c, (hq5) obj, R5);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int R6 = rvf.R(1);
                hag.g(this.b, this.c, (hdp) this.d, (Function0) this.e, (hq5) obj, R6);
                break;
            default:
                ((Integer) obj2).getClass();
                com.yandex.passport.internal.ui.a.h((g) this.d, (yci) this.e, (hq5) obj, rvf.R(this.b | 1), this.c);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ uf4(int i, wn5 wn5Var, wn5 wn5Var2, int i2) {
        this.a = 0;
        this.b = i;
        this.d = wn5Var;
        this.e = wn5Var2;
        this.c = i2;
    }

    public /* synthetic */ uf4(ixm ixmVar, yci yciVar, int i, int i2, int i3) {
        this.a = 5;
        this.d = ixmVar;
        this.e = yciVar;
        this.b = i;
        this.c = i2;
    }

    public /* synthetic */ uf4(CharSequence charSequence, int i, wn5 wn5Var, int i2) {
        this.a = 3;
        this.e = charSequence;
        this.b = i;
        this.d = wn5Var;
        this.c = i2;
    }

    public /* synthetic */ uf4(Object obj, int i, Object obj2, int i2, int i3) {
        this.a = i3;
        this.d = obj;
        this.b = i;
        this.e = obj2;
        this.c = i2;
    }

    public /* synthetic */ uf4(Object obj, Object obj2, int i, int i2, int i3) {
        this.a = i3;
        this.d = obj;
        this.e = obj2;
        this.b = i;
        this.c = i2;
    }
}
