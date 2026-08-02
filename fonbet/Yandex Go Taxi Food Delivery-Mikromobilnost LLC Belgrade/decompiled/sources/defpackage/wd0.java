package defpackage;

import com.yandex.go.address.models.FavoriteAddress;
import ru.yandex.taxi.router.a;

/* loaded from: classes5.dex */
public final class wd0 implements ycp {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wd0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void n1() {
    }

    @Override // defpackage.ycp
    public final void F0(FavoriteAddress favoriteAddress) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((tls) obj2).invoke(favoriteAddress);
                ((a) obj).r(new qu(9));
                break;
            default:
                ((zat0) obj2).r(new t71((pv0) obj, 20));
                break;
        }
    }

    @Override // defpackage.sy60
    public final void a() {
        switch (this.a) {
            case 0:
                ((tls) this.b).invoke(null);
                ((a) this.c).r(new qu(9));
                break;
        }
    }
}
