package defpackage;

import com.yandex.pulse.metrics.o;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class xpp implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xpp(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((ypp) this.b).getViewModelStore();
            case 1:
                return new pem(2, (qkp) this.b);
            case 2:
                return new d85(((imu) ((jmu) this.b)).a);
            case 3:
                return ((mgq) this.b).getViewModelStore();
            case 4:
                return new a6p(5, (jgq) this.b);
            case 5:
                return new d85(((d85) this.b).a);
            case 6:
                return new a6p(6, (jpq) this.b);
            case 7:
                return ((nqq) this.b).getViewModelStore();
            case 8:
                return new a6p(7, (lqq) this.b);
            case 9:
                return ((uvq) this.b).getViewModelStore();
            case 10:
                return new a6p(8, (rln) this.b);
            case 11:
                return ((hn5) this.b).getViewModelStore();
            case 12:
                return new a6p(9, (b7r) this.b);
            case 13:
                return ((lxr) this.b).getViewModelStore();
            case 14:
                return new pem(3, (nrq) this.b);
            case 15:
                return ((l3s) this.b).getViewModelStore();
            case 16:
                return new a6p(10, (j3s) this.b);
            case 17:
                return ((h7s) this.b).getViewModelStore();
            case 18:
                return new a6p(11, (g7s) this.b);
            case 19:
                return new d85(((sg2) this.b).a());
            case 20:
                return ((g5t) this.b).getViewModelStore();
            case 21:
                return new a6p(12, (c5t) this.b);
            case 22:
                return ((l8u) this.b).getViewModelStore();
            case 23:
                return new a6p(14, (i8u) this.b);
            case 24:
                return new a6p(17, (btu) this.b);
            case 25:
                return new a6p(18, (btu) this.b);
            case 26:
                return new a6p(19, (btu) this.b);
            case 27:
                return new d85(((ylu) ((aqi) this.b).getValue()).e);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new pem(4, (wuu) this.b);
            default:
                return ((dfv) this.b).getViewModelStore();
        }
    }
}
