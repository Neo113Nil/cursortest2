package defpackage;

import android.content.Context;
import com.yandex.delivery.utils.dialogmanager.impl.b;
import com.yandex.go.route.interactor.c;
import ru.yandex.taxi.delivery.preorder.a;
import ru.yandex.taxi.logistics.address.g;
import ru.yandex.taxi.logistics.experiments.k;
import ru.yandex.taxi.logistics.sdk.management.storage.e;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes9.dex */
public final class qii implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ qii(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        switch (this.a) {
            case 0:
                return new pii((h) this.b.get());
            case 1:
                return new aji((rqo) this.b.get());
            case 2:
                return new a((eex) this.b.get());
            case 3:
                return new wki((y5i) this.b.get());
            case 4:
                return new eo5((rqo) this.b.get(), 1);
            case 5:
                return new k((rqo) this.b.get());
            case 6:
                return new bni((rqo) this.b.get());
            case 7:
                return new tni((rqo) this.b.get());
            case 8:
                return new ru.yandex.taxi.logistics.payment.a(i5m.a(this.b));
            case 9:
                return new jsi((Context) this.b.get());
            case 10:
                return new cti((jgv) this.b.get());
            case 11:
                return new xui(this.b);
            case 12:
                return new zch((c) this.b.get());
            case 13:
                return new g((po21) this.b.get());
            case 14:
                return new cwi((fif) this.b.get());
            case 15:
                return new g0j((i6r) this.b.get());
            case 16:
                return new b1((pho) this.b.get());
            case 17:
                return new e((Context) this.b.get());
            case 18:
                return new yaj((pho) this.b.get());
            case 19:
                return new zch((kb20) this.b.get());
            case 20:
                return new mbj((com.yandex.go.performance_class.a) this.b.get());
            case 21:
                return new obj((dne0) this.b.get());
            case 22:
                return new b((st2) this.b.get());
            case 23:
                return new ru.yandex.taxi.map_common.map.c((el00) this.b.get());
            case 24:
                return new lnj((rqo) this.b.get());
            case 25:
                return new yvi0((rqo) this.b.get());
            case 26:
                return new dy6((rqo) this.b.get(), 2);
            case 27:
                return new tnj((eq51) this.b.get());
            case 28:
                return new b1((pho) this.b.get());
            default:
                return new a22((zuj0) this.b.get());
        }
    }
}
