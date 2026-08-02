package defpackage;

import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.favorites.router.a;

/* loaded from: classes12.dex */
public final class y01 implements ycp {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ y01(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    private final void n1() {
    }

    private final void o1() {
    }

    @Override // defpackage.ycp
    public final void F0(FavoriteAddress favoriteAddress) {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((c11) h55Var).r(new qu(9));
                break;
            case 1:
                ((d4) ((xx70) h55Var).F).invoke();
                break;
            case 2:
                ((a) h55Var).r(new fdp(0, favoriteAddress));
                break;
            default:
                ((eal0) ((uva) h55Var).F).invoke();
                break;
        }
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                ((xx70) h55Var).r(new qu(9));
                break;
            case 2:
                break;
            default:
                ((uva) h55Var).r(new qu(9));
                break;
        }
    }
}
