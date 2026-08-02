package defpackage;

import com.yandex.pulse.metrics.o;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.search.SearchActivity;

/* loaded from: classes3.dex */
public final class lvj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lvj(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((mvj) this.b).getViewModelStore();
            case 1:
                return new f2d(20, (kvj) this.b);
            case 2:
                return ((jik) this.b).getViewModelStore();
            case 3:
                return new f2d(21, (y6g) this.b);
            case 4:
                return new s40(27, (aok) this.b);
            case 5:
                return new s40(28, (aok) this.b);
            case 6:
                return new f2d(22, (cdl) this.b);
            case 7:
                return new f2d(23, (aok) this.b);
            case 8:
                return ((gzl) this.b).getViewModelStore();
            case 9:
                return new f2d(24, (ezl) this.b);
            case 10:
                return ((lam) this.b).getViewModelStore();
            case 11:
                return new s40(29, (hvl) this.b);
            case 12:
                return ((qbm) this.b).getViewModelStore();
            case 13:
                return new f2d(25, (pbm) this.b);
            case 14:
                return ((ldm) this.b).getViewModelStore();
            case 15:
                return new f2d(26, (kdm) this.b);
            case 16:
                return ((qem) this.b).getViewModelStore();
            case 17:
                return new pem(0, (hvl) this.b);
            case 18:
                return ((exm) this.b).getViewModelStore();
            case 19:
                return new f2d(27, (hvl) this.b);
            case 20:
                return ((d6n) this.b).getViewModelStore();
            case 21:
                return new f2d(28, (b6n) this.b);
            case 22:
                return ((SearchActivity) this.b).getViewModelStore();
            case 23:
                return new f2d(29, (oxo) this.b);
            case 24:
                return new a6p(0, (r5p) this.b);
            case 25:
                return new a6p(1, (r5p) this.b);
            case 26:
                return new a6p(2, (r5p) this.b);
            case 27:
                return new a6p(3, (r5p) this.b);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return ((lpp) this.b).getViewModelStore();
            default:
                return new pem(1, (qkp) this.b);
        }
    }
}
