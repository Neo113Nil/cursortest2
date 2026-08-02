package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.squareup.moshi.Moshi;
import com.yandex.go.delivery.tracking.map_overlay.l;
import com.yandex.go.inapp_calls.experiment.q;
import com.yandex.go.payments.shared.business.accountcreation.corp.CitySuggestApi;
import com.yandex.go.payments.shared.business.accountcreation.corp.d;
import com.yandex.go.rida.header.data.c;
import com.yandex.messaging.internal.storage.experiments.ExperimentsDatabaseRoom;
import com.ybsdk.common.repositiories.auth.f;
import com.ybsdk.rconfig.b;
import ru.yandex.taxi.logistics.sdk.management.localstate.a;
import ru.yandex.taxi.themes.experiments.e;

/* loaded from: classes8.dex */
public final class vve implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ vve(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 15;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new uve((tve) xvf0Var2.get(), xvf0Var);
            case 1:
                return new c1f((d1f) xvf0Var2.get(), (b1f) xvf0Var.get());
            case 2:
                return new d((CitySuggestApi) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 3:
                return new lbf();
            case 4:
                return new q501(i2);
            case 5:
                return new r501(15);
            case 6:
                return new ref((y9y0) xvf0Var2.get(), (tjt0) xvf0Var.get());
            case 7:
                return new vef((zuj0) xvf0Var2.get(), (ber) xvf0Var.get());
            case 8:
                return new k66((Context) xvf0Var2.get(), 1, (ng60) xvf0Var.get());
            case 9:
                return new f((zmp0) xvf0Var2.get(), (nbp0) xvf0Var.get());
            case 10:
                return new bjf((Context) xvf0Var2.get(), (ei11) xvf0Var.get());
            case 11:
                return new plf((Context) xvf0Var2.get(), (pwy0) xvf0Var.get());
            case 12:
                return new e((rqo) xvf0Var2.get(), (gu11) xvf0Var.get());
            case 13:
                return new wkg((b) xvf0Var2.get(), (Moshi) xvf0Var.get());
            case 14:
                return new mqg((at2) xvf0Var2.get(), (ExperimentsDatabaseRoom) xvf0Var.get());
            case 15:
                return new usg((x22) xvf0Var2.get(), (SharedPreferences) xvf0Var.get());
            case 16:
                return new qug((pdc) xvf0Var2.get(), (xdf) xvf0Var.get());
            case 17:
                return new z9h((yuj0) xvf0Var2.get(), (com.yandex.delivery.utils.dialogmanager.impl.b) xvf0Var.get());
            case 18:
                return new lgh((dne0) xvf0Var2.get(), (hit) xvf0Var.get());
            case 19:
                return new pgh((lgh) xvf0Var2.get(), (q) xvf0Var.get());
            case 20:
                return new xih((zuj0) xvf0Var2.get(), (za90) xvf0Var.get());
            case 21:
                return new c((tt2) xvf0Var2.get(), (com.yandex.go.navigation.screen.c) xvf0Var.get());
            case 22:
                return new hjh((yuj0) xvf0Var2.get(), (com.yandex.delivery.utils.dialogmanager.impl.b) xvf0Var.get());
            case 23:
                return new brh((n20) xvf0Var2.get(), (qyw) xvf0Var.get());
            case 24:
                return new a((ru.yandex.taxi.logistics.sdk.management.localstate.e) xvf0Var2.get(), (osh) xvf0Var.get());
            case 25:
                return new com.yandex.go.delivery.tracking.map_overlay.a((ah00) xvf0Var2.get(), (l) xvf0Var.get());
            case 26:
                return new dwh((jei) xvf0Var2.get(), (com.yandex.go.route.interactor.b) xvf0Var.get());
            case 27:
                return new ru.yandex.taxi.logistics.sdk.delivery.state.b((Context) xvf0Var2.get(), (kej) xvf0Var.get());
            case 28:
                return new yuf0((zuj0) xvf0Var2.get(), i5m.a(xvf0Var));
            default:
                return new yxh(xvf0Var2, (s6s) xvf0Var.get());
        }
    }
}
