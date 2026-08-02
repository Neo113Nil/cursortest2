package defpackage;

import com.yandex.pulse.metrics.o;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class pva implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pva(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((qva) this.b).getViewModelStore();
            case 1:
                return new wz(27, (mva) this.b);
            case 2:
                return ((wcb) this.b).getViewModelStore();
            case 3:
                return new wz(28, (vcb) this.b);
            case 4:
                return ((feb) this.b).getViewModelStore();
            case 5:
                return new s40(13, (tka) this.b);
            case 6:
                return ((h1e) this.b).getViewModelStore();
            case 7:
                return new f2d(1, (e1e) this.b);
            case 8:
                return new f2d(2, (ita) this.b);
            case 9:
                return new f2d(3, (v1e) this.b);
            case 10:
                return ((h2e) this.b).getViewModelStore();
            case 11:
                return new f2d(4, (e2e) this.b);
            case 12:
                return ((sfe) this.b).getViewModelStore();
            case 13:
                return new f2d(5, (qfe) this.b);
            case 14:
                return ((xcf) this.b).getViewModelStore();
            case 15:
                return ((ycf) this.b).getViewModelStore();
            case 16:
                return new s40(15, (sxd) this.b);
            case 17:
                return new s40(16, (sxd) this.b);
            case 18:
                return ((gef) this.b).getViewModelStore();
            case 19:
                return new f2d(6, (eef) this.b);
            case 20:
                return ((uef) this.b).getViewModelStore();
            case 21:
                return ((vef) this.b).getViewModelStore();
            case 22:
                return new s40(17, (sxd) this.b);
            case 23:
                return new s40(18, (sxd) this.b);
            case 24:
                return ((vgf) this.b).getViewModelStore();
            case 25:
                return ((wgf) this.b).getViewModelStore();
            case 26:
                return new s40(19, (bff) this.b);
            case 27:
                return new s40(20, (bff) this.b);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new s40(21, (bff) this.b);
            default:
                return new f2d(7, (sjf) this.b);
        }
    }
}
