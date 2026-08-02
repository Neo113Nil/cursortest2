package defpackage;

import android.content.Context;
import android.os.Build;
import com.yandex.plus.core.config.Environment;
import com.yandex.plus.core.graphql.type.THEME;
import com.yandex.plus.home.datasource.openapi.apis.PlusStateControllerApi;
import com.yandex.plus.home.datasource.openapi.apis.SdkConfigurationControllerApi;
import com.yandex.plus.home.graphql.plusstate.c;
import com.yandex.plus.home.internal.di.d;
import com.yandex.plus.pay.adapter.internal.q;
import com.yandex.plus.resources.core.a;
import com.yandex.plus.ui.core.theme.PlusTheme;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.b;

/* loaded from: classes8.dex */
public final /* synthetic */ class qog implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ wog b;

    public /* synthetic */ qog(wog wogVar, int i) {
        this.a = i;
        this.b = wogVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        wog wogVar = this.b;
        switch (i) {
            case 0:
                return new d5d0(wogVar.b());
            case 1:
                final m6d0[] m6d0VarArr = {new chz(), new lcj(wogVar.c.b(), (o1k0) wogVar.e.p.getValue())};
                return new m6d0() { // from class: k6d0
                    @Override // defpackage.m6d0
                    public final void a(e6d0 e6d0Var) {
                        for (m6d0 m6d0Var : m6d0VarArr) {
                            m6d0Var.a(e6d0Var);
                        }
                    }
                };
            case 2:
                return new w1d0((sbx) wogVar.e.i.getValue());
            case 3:
                qo2 b = wogVar.e.b();
                omy0 omy0Var = new omy0(wogVar);
                cop0 cop0Var = wogVar.b;
                return new b0u(b, omy0Var, new uog(cop0Var.o), cop0Var.z, wogVar.h, cop0Var.A);
            case 4:
                cop0 cop0Var2 = wogVar.b;
                return new a(cop0Var2.a, ((q) cop0Var2.a()).b());
            case 5:
                return new lzs(wogVar.b.j);
            case 6:
                wogVar.e.b();
                return new a0u();
            case 7:
                wogVar.e.b();
                return new zzt();
            case 8:
                return new kzs((lzs) wogVar.m.getValue());
            case 9:
                Pair pair = new Pair("platform", ConstantDeviceInfo.APP_PLATFORM);
                Pair pair2 = new Pair("platform_version", Build.VERSION.RELEASE);
                cop0 cop0Var3 = wogVar.b;
                return b.i(pair, pair2, new Pair("service_name", cop0Var3.c), new Pair("plus_sdk_version", "110.0.2"), new Pair("client_app_version", cop0Var3.v));
            case 10:
                return ((lj) wogVar.g.h.getValue()).getId();
            case 11:
                Object h = wogVar.a().h();
                if (h instanceof Result.Failure) {
                    h = null;
                }
                k2d0 k2d0Var = (k2d0) h;
                if (k2d0Var != null) {
                    return k2d0Var.c;
                }
                return null;
            case 12:
                Object h2 = wogVar.a().h();
                if (h2 instanceof Result.Failure) {
                    h2 = null;
                }
                k2d0 k2d0Var2 = (k2d0) h2;
                if (k2d0Var2 != null) {
                    return k2d0Var2.d;
                }
                return null;
            case 13:
                cop0 cop0Var4 = wogVar.b;
                PlusTheme plusTheme = (PlusTheme) cop0Var4.e.getValue();
                Context context = cop0Var4.a;
                int i2 = tog.a[plusTheme.ordinal()];
                if (i2 == 1) {
                    return THEME.DARK;
                }
                if (i2 == 2) {
                    return THEME.LIGHT;
                }
                if (i2 == 3) {
                    return vng.y(context) ? THEME.DARK : THEME.LIGHT;
                }
                w511.b();
                return null;
            case 14:
                cop0 cop0Var5 = wogVar.b;
                Environment environment = cop0Var5.b;
                ike ikeVar = wogVar.h;
                ((wyj) cop0Var5.z).getClass();
                mdh mdhVar = wyj.e;
                zhf.a.getClass();
                return new wqo(new m2d0(environment, ikeVar, mdhVar, yhf.b, (com.yandex.plus.core.graphql.internal.b) wogVar.e.k.getValue(), (kzs) wogVar.p.getValue(), new qog(wogVar, 10), (Map) wogVar.s.getValue(), cop0Var5.A, cop0Var5.x));
            case 15:
                ome0 ome0Var = (ome0) ((i3y) wogVar.f.c).getValue();
                cop0 cop0Var6 = wogVar.b;
                Environment environment2 = cop0Var6.b;
                SdkConfigurationControllerApi sdkConfigurationControllerApi = (SdkConfigurationControllerApi) wogVar.e.f.getValue();
                m6d0 m6d0Var = (m6d0) wogVar.B.getValue();
                ((wyj) cop0Var6.z).getClass();
                mdh mdhVar2 = wyj.e;
                zhf.a.getClass();
                return new com.yandex.plus.home.graphql.configuration.a(ome0Var, environment2, sdkConfigurationControllerApi, m6d0Var, yhf.b, cop0Var6.w, wogVar.h, mdhVar2, cop0Var6.A);
            case 16:
                m6d0 m6d0Var2 = (m6d0) wogVar.B.getValue();
                PlusStateControllerApi plusStateControllerApi = (PlusStateControllerApi) wogVar.e.g.getValue();
                lzs lzsVar = (lzs) wogVar.m.getValue();
                d dVar = new d(wogVar);
                cop0 cop0Var7 = wogVar.b;
                return new c(plusStateControllerApi, m6d0Var2, lzsVar, dVar, cop0Var7.z, wogVar.h, cop0Var7.A);
            case 17:
                return new com.yandex.plus.home.graphql.subscription.a(wogVar.e.b(), (com.yandex.plus.core.graphql.target.a) wogVar.q.getValue(), (w1d0) wogVar.C.getValue());
            case 18:
                cop0 cop0Var8 = wogVar.b;
                kqd0 kqd0Var = cop0Var8.r;
                if (kqd0Var == null) {
                    return null;
                }
                ((wyj) cop0Var8.z).getClass();
                return new com.yandex.plus.home.ybsdk.a(kqd0Var, wyj.e, cop0Var8.A);
            default:
                return new com.yandex.plus.home.payment.google.a(wogVar.b.a(), (com.yandex.plus.home.payment.google.b) wogVar.z.getValue());
        }
    }
}
