package defpackage;

import com.yandex.passport.internal.credentials.f;
import com.yandex.passport.internal.methods.m4;
import com.yandex.passport.internal.methods.p5;
import com.yandex.passport.internal.properties.g;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import com.yandex.passport.internal.ui.router.LoginRouterActivity;
import com.yandex.passport.internal.ui.router.q;
import com.yandex.plus.experiments.impl.providers.h;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.m;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.family.a;
import com.yandex.plus.home.feature.webviews.internal.smart.e;
import com.yandex.plus.home.feature.webviews.internal.stories.k;
import com.yandex.plus.home.internal.di.d;
import com.yandex.plus.pay.common.internal.featureflags.b;
import com.yandex.plus.pay.common.internal.featureflags.c;
import com.yandex.plus.pay.internal.di.l;
import com.yandex.plus.pay.internal.di.n;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i;
import com.yandex.pulse.metrics.o;
import okhttp3.OkHttpClient;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class jk6 extends wxm {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jk6(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.b = i2;
    }

    @Override // defpackage.p9f
    public final Object get() {
        switch (this.b) {
            case 0:
                return ((sdr) this.receiver).getValue();
            case 1:
                return ((uoc) this.receiver).f.U0();
            case 2:
                return ((sdr) this.receiver).getValue();
            case 3:
                return ((sdr) this.receiver).getValue();
            case 4:
                return ((sdr) this.receiver).getValue();
            case 5:
                return this.receiver.getClass().getSimpleName();
            case 6:
                return (g) ((p5) this.receiver).c.c;
            case 7:
                return (f) ((m4) this.receiver).d.c;
            case 8:
                GlobalRouterActivity globalRouterActivity = (GlobalRouterActivity) this.receiver;
                int i = GlobalRouterActivity.i;
                return (q) globalRouterActivity.a.getValue();
            case 9:
                LoginRouterActivity loginRouterActivity = (LoginRouterActivity) this.receiver;
                int i2 = LoginRouterActivity.l;
                return loginRouterActivity.k();
            case 10:
                return ((a) this.receiver).getThemedContext();
            case 11:
                return Integer.valueOf(com.yandex.plus.home.common.utils.a.b(((m) this.receiver).p, R.attr.plus_sdk_panelDefaultRippleColor));
            case 12:
                return ((com.yandex.plus.home.feature.webviews.internal.home.g) this.receiver).l();
            case 13:
                return ((k) this.receiver).l();
            case 14:
                return ((com.yandex.plus.home.feature.webviews.internal.home.g) this.receiver).l();
            case 15:
                return ((e) this.receiver).l();
            case 16:
                return ((k) this.receiver).l();
            case 17:
                return ((d) this.receiver).c();
            case 18:
                return ((d) this.receiver).c();
            case 19:
                return ((d) this.receiver).c();
            case 20:
                return ((d) this.receiver).c();
            case 21:
                ((b) this.receiver).getClass();
                return (c) b.c.getValue();
            case 22:
                return (h) ((com.yandex.plus.pay.internal.g) this.receiver).a.getValue();
            case 23:
                return (OkHttpClient) ((l) this.receiver).i.getValue();
            case 24:
                return ((l) this.receiver).b();
            case 25:
                return (com.yandex.plus.analytics.dwh.a) ((com.yandex.plus.pay.internal.di.e) this.receiver).c.getValue();
            case 26:
                return (com.yandex.plus.pay.internal.analytics.h) ((com.yandex.plus.pay.internal.di.e) this.receiver).k.getValue();
            case 27:
                return ((n) this.receiver).c();
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return (com.yandex.plus.pay.internal.benchmark.a) ((i) this.receiver).x.getValue();
            default:
                return (com.yandex.plus.pay.ui.webview.family.ui.c) ((i) this.receiver).D.getValue();
        }
    }
}
