package defpackage;

import android.content.Context;
import com.yandex.go.shortcuts.impl.dto.ShortcutsApi;
import com.yandex.go.shortcuts.impl.interactors.e;
import com.yandex.go.zone.repository.o;
import ru.yandex.taxi.h;
import ru.yandex.taxi.layers.presentation.optimalview.MapObservationView;
import ru.yandex.taxi.map_common.map.r;
import ru.yandex.taxi.map_common.style.domain.a;
import ru.yandex.taxi.masstransit.datasource.schedule.b;
import ru.yandex.taxi.masstransit.deeplink.f;

/* loaded from: classes9.dex */
public final class sp00 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ sp00(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new rp00((rqo) xvf0Var.get());
            case 1:
                return new MapObservationView((Context) xvf0Var.get());
            case 2:
                return new fr00((ah00) xvf0Var.get());
            case 3:
                return new td7((ct00) xvf0Var.get());
            case 4:
                return new a((bt00) xvf0Var.get());
            case 5:
                return new vs00((pwy0) xvf0Var.get());
            case 6:
                return new et00((ah00) xvf0Var.get());
            case 7:
                return new ft00((kf00) xvf0Var.get());
            case 8:
                return new kt00((as21) xvf0Var.get());
            case 9:
                return new wt00((ah00) xvf0Var.get());
            case 10:
                return new s66((rqo) xvf0Var.get(), 7);
            case 11:
                return new e((ShortcutsApi) xvf0Var.get());
            case 12:
                return new com.yandex.go.messenger_native.marketplace.repositories.a((rqo) xvf0Var.get());
            case 13:
                return com.yandex.messaging.markwon.a.b((i8g) xvf0Var.get());
            case 14:
                return new vy00((kf00) xvf0Var.get());
            case 15:
                return new dz00((rqo) xvf0Var.get());
            case 16:
                return new r110((s111) xvf0Var.get());
            case 17:
                return new q210((o) xvf0Var.get());
            case 18:
                return new x210((r) xvf0Var.get());
            case 19:
                return new u8w((pho) xvf0Var.get());
            case 20:
                return new f410((r) xvf0Var.get());
            case 21:
                return new f((b) xvf0Var.get());
            case 22:
                return new g610((rqo) xvf0Var.get());
            case 23:
                return new y810((h) xvf0Var.get());
            case 24:
                return new a910((com.ybsdk.rconfig.b) xvf0Var.get());
            case 25:
                return new ra10((ju6) xvf0Var.get());
            case 26:
                return new s400();
            case 27:
                return new jj10((pho) xvf0Var.get());
            case 28:
                return new u8w((pho) xvf0Var.get());
            default:
                return new kj10((pho) xvf0Var.get());
        }
    }
}
