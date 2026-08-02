package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.Lifecycle;
import com.yandex.delivery.utils.storage.impl.b;
import com.yandex.go.sharing_personal_goals.data.a;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.persistence.api.StorageType;
import java.util.Locale;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.activity.i;
import ru.yandex.taxi.widget.c;

/* loaded from: classes9.dex */
public final class wjr0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ wjr0(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new vjr0((Activity) xvf0Var2.get(), (g) xvf0Var.get());
            case 1:
                return new ror0((Lifecycle) xvf0Var2.get(), i5m.a(xvf0Var));
            case 2:
                return new zor0((zuj0) xvf0Var2.get(), (wnt) xvf0Var.get());
            case 3:
                Context context = (Context) xvf0Var2.get();
                String str = (String) xvf0Var.get();
                Locale locale = Locale.US;
                SharedPreferences sharedPreferences = context.getSharedPreferences("global_search_recent_results_" + str, 0);
                q5z.i(sharedPreferences);
                return sharedPreferences;
            case 4:
                Context context2 = (Context) xvf0Var2.get();
                String str2 = (String) xvf0Var.get();
                Locale locale2 = Locale.US;
                SharedPreferences sharedPreferences2 = context2.getSharedPreferences("reaction_usage_" + str2, 0);
                q5z.i(sharedPreferences2);
                return sharedPreferences2;
            case 5:
                return new a((on2) xvf0Var2.get(), (com.yandex.go.sharing_personal_goals.data.mapper.a) xvf0Var.get());
            case 6:
                return new x1s0((y1s0) xvf0Var2.get(), (w1s0) xvf0Var.get());
            case 7:
                return new a5s0((rqo) xvf0Var2.get(), (j2t) xvf0Var.get());
            case 8:
                return new b((com.yandex.delivery.utils.storage.impl.a) xvf0Var2.get(), (i6s0) xvf0Var.get());
            case 9:
                return new o2d0((wnt) xvf0Var2.get(), i5m.a(xvf0Var), 1);
            case 10:
                return new vuz(false);
            case 11:
                return new f0t0((as21) xvf0Var2.get(), i5m.a(xvf0Var));
            case 12:
                return new s8t0((com.yandex.go.something_wrong_screen.repository.b) xvf0Var2.get(), (l8t0) xvf0Var.get());
            case 13:
                return new agt0((ah00) xvf0Var2.get(), (fu00) xvf0Var.get());
            case 14:
                return new qot0((tt2) xvf0Var.get(), (c) xvf0Var2.get());
            case 15:
                return new prt0((oqt0) xvf0Var2.get(), (rrt0) xvf0Var.get());
            case 16:
                return new com.yandex.go.splash.domain.c((tse) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 17:
                return new com.yandex.delivery.utils.dialogmanager.b((yuj0) xvf0Var.get(), (com.yandex.delivery.utils.dialogmanager.impl.b) xvf0Var2.get());
            case 18:
                return new odu0((at2) xvf0Var2.get(), (Context) xvf0Var.get());
            case 19:
                c1b0 c1b0Var = (c1b0) ((a1b0) xvf0Var2.get());
                return new com.ybsdk.persistence.a(c1b0Var.a(StorageType.AUTH_ENCRYPTED), c1b0Var.a(StorageType.AUTH_COMMON), (AppAnalyticsReporter) xvf0Var.get());
            case 20:
                return new ru.yandex.taxi.experiments.storage.b(i5m.a(xvf0Var2), (tt2) xvf0Var.get());
            case 21:
                return new hpu0((mhf) xvf0Var2.get(), (i) xvf0Var.get());
            case 22:
                return new eyu0((exu0) xvf0Var2.get(), (pwy0) xvf0Var.get());
            case 23:
                return new a4v0((tj60) xvf0Var.get(), (Context) xvf0Var2.get());
            case 24:
                return new d8v0((ru.yandex.taxi.perf.screen.c) xvf0Var2.get(), (com.yandex.go.navigation.screen.c) xvf0Var.get());
            case 25:
                return new fev0((tt2) xvf0Var.get(), (dne0) xvf0Var2.get());
            case 26:
                return new ru.yandex.taxi.summary.solid.preview_card.data.a((fev0) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 27:
                return new jev0((urv0) xvf0Var2.get(), (kev0) xvf0Var.get());
            case 28:
                return new vfv0((rqo) xvf0Var.get(), (k7x0) xvf0Var2.get());
            default:
                return new ahv0((wiq0) xvf0Var2.get(), (com.yandex.go.payments.common.a) xvf0Var.get());
        }
    }
}
