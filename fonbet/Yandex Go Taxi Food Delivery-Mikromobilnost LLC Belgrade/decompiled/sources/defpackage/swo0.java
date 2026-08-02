package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.go.inapp_calls.experiment.q;
import com.yandex.go.payments.data.p;
import com.yandex.go.payments.paymentlist.domain.i;
import com.yandex.go.payments.paymentlist.domain.n;
import com.yandex.go.scooters.zones.data.a;
import com.yandex.go.scooters.zones.info.ui.c;
import com.yandex.go.taxi.order.domain.repositories.f;
import com.yandex.go.taxi.order.state.search.b;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.messaging.profile.h;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.di.modules.g;
import java.util.Locale;
import ru.yandex.taxi.experiments.superapp.j;
import ru.yandex.taxi.settings.main.l;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes8.dex */
public final class swo0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ swo0(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        String string;
        int i = this.a;
        int i2 = 0;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new rwo0(i2, xvf0Var2, (fva0) xvf0Var.get());
            case 1:
                return new c((k7x0) xvf0Var2.get(), (e) xvf0Var.get());
            case 2:
                return new com.yandex.go.scooters.zones.legend.domain.c((a) xvf0Var2.get(), (uap0) xvf0Var.get());
            case 3:
                return new tmp0((wiq0) xvf0Var2.get(), (qlp0) xvf0Var.get());
            case 4:
                return new h((Context) xvf0Var2.get(), (rz10) xvf0Var.get());
            case 5:
                return gfb1.a(new cjm0(19, xvf0Var, xvf0Var2));
            case 6:
                return new q120((lqo) xvf0Var2.get(), (x22) xvf0Var.get());
            case 7:
                return new g((ppp0) xvf0Var2.get(), (di51) xvf0Var.get());
            case 8:
                AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) xvf0Var2.get();
                return new awa0(appAnalyticsReporter, Application.getProcessName());
            case 9:
                qwu0 qwu0Var = (qwu0) ((kg51) xvf0Var2.get()).x.invoke((b8b0) xvf0Var.get());
                q5z.i(qwu0Var);
                return qwu0Var;
            case 10:
                return new hyb0((awa0) xvf0Var2.get(), (AppAnalyticsReporter) xvf0Var.get());
            case 11:
                twu0 twu0Var = (twu0) ((kg51) xvf0Var2.get()).y.invoke((elg0) xvf0Var.get());
                q5z.i(twu0Var);
                return twu0Var;
            case 12:
                Context context = (Context) xvf0Var2.get();
                SharedPreferences sharedPreferences = (SharedPreferences) xvf0Var.get();
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("sdk_view_preferences", 0);
                if (sharedPreferences2.getAll().isEmpty() && (string = sharedPreferences.getString("profile_default_id", null)) != null) {
                    Locale locale = Locale.US;
                    SharedPreferences sharedPreferences3 = context.getSharedPreferences("messenger_ui_".concat(string), 0);
                    SharedPreferences.Editor edit = sharedPreferences3.edit();
                    SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                    qke.t(edit, edit2, sharedPreferences3, "keyboard_height_land");
                    qke.t(edit, edit2, sharedPreferences3, "keyboard_height_port");
                    qke.s(edit, edit2, sharedPreferences3, "disable_all_notifications");
                    qke.s(edit, edit2, sharedPreferences3, "enable_all_notifications_sound");
                    qke.s(edit, edit2, sharedPreferences3, "enable_all_notifications_vibrate");
                    qke.s(edit, edit2, sharedPreferences3, "enable_discovery");
                    qke.s(edit, edit2, sharedPreferences3, "enable_users_suggest");
                    qke.t(edit, edit2, sharedPreferences3, "contacts_requested_count");
                    qke.t(edit, edit2, sharedPreferences3, "emoji_sticker_current_position");
                    edit.apply();
                    edit2.apply();
                }
                return sharedPreferences2;
            case 13:
                return new sw51((hh51) xvf0Var2.get(), (Context) xvf0Var.get());
            case 14:
                return new lnm0(i5m.a(xvf0Var2), i5m.a(xvf0Var));
            case 15:
                return new f((dne0) xvf0Var2.get(), (n20) xvf0Var.get());
            case 16:
                return new b((wnt) xvf0Var.get(), (dne0) xvf0Var2.get());
            case 17:
                return new com.yandex.go.taxi.order.experiments.h((rqo) xvf0Var2.get(), (com.yandex.go.taxi.order.repositories.c) xvf0Var.get());
            case 18:
                return new paq0((wiq0) xvf0Var2.get(), (c4r0) xvf0Var.get());
            case 19:
                return new p((fga0) xvf0Var2.get(), (ru.yandex.taxi.preorder.repositories.g) xvf0Var.get());
            case 20:
                return new com.yandex.messaging.domain.botrequest.e((kse) xvf0Var2.get(), (com.yandex.messaging.internal.authorized.chat.b) xvf0Var.get());
            case 21:
                return new apq0((o5e) xvf0Var2.get(), (w3c) xvf0Var.get());
            case 22:
                return new ru.yandex.taxi.statebar.router.a((uq1) xvf0Var2.get(), (c9p) xvf0Var.get());
            case 23:
                return new cjm0(23, (zuj0) xvf0Var2.get(), (j) xvf0Var.get());
            case 24:
                return new com.yandex.go.inapp_calls.repository.defaultoutgoingcall.g((lgh) xvf0Var2.get(), (q) xvf0Var.get());
            case 25:
                return new n((n20) xvf0Var2.get(), (i) xvf0Var.get());
            case 26:
                return new c4r0((b8r) xvf0Var.get(), (k) xvf0Var2.get());
            case 27:
                return new l(xvf0Var, (com.yandex.go.lifecycle.a) xvf0Var2.get());
            case 28:
                return new cbr0((y4g0) xvf0Var2.get(), (k7x0) xvf0Var.get());
            default:
                return new tcr0((ru.yandex.taxi.am.g) xvf0Var2.get(), (zuj0) xvf0Var.get());
        }
    }

    public /* synthetic */ swo0(epp0 epp0Var, xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }
}
