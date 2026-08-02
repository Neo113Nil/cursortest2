package defpackage;

import com.yandex.pulse.metrics.o;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class vz implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vz(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((xz) this.b).getViewModelStore();
            case 1:
                return new wz(0, (tz) this.b);
            case 2:
                return ((t40) this.b).getViewModelStore();
            case 3:
                return new s40(0, (s2) this.b);
            case 4:
                return ((s50) this.b).getViewModelStore();
            case 5:
                return new s40(1, (s2) this.b);
            case 6:
                return ((y01) this.b).getViewModelStore();
            case 7:
                return new wz(1, (x01) this.b);
            case 8:
                return ((c41) this.b).getViewModelStore();
            case 9:
                return new wz(2, (a41) this.b);
            case 10:
                return new wz(3, (z3) this.b);
            case 11:
                return new wz(4, (hb) this.b);
            case 12:
                return ((fl1) this.b).getViewModelStore();
            case 13:
                return new wz(6, (dl1) this.b);
            case 14:
                return ((bz1) this.b).getViewModelStore();
            case 15:
                return new s40(2, (uu1) this.b);
            case 16:
                return ((h32) this.b).getViewModelStore();
            case 17:
                return new wz(7, (g32) this.b);
            case 18:
                return new wz(9, (ri1) this.b);
            case 19:
                return ((s83) this.b).getViewModelStore();
            case 20:
                return new s40(3, (uu1) this.b);
            case 21:
                return ((ja3) this.b).getViewModelStore();
            case 22:
                return new wz(10, (ia3) this.b);
            case 23:
                return new d85(((gvd) this.b).a());
            case 24:
                return ((my3) this.b).getViewModelStore();
            case 25:
                return new wz(12, (ky3) this.b);
            case 26:
                return new wz(13, (zu4) this.b);
            case 27:
                return new wz(14, (ov4) this.b);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new s40(4, (ym4) this.b);
            default:
                return ((hz4) this.b).getViewModelStore();
        }
    }
}
