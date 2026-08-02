package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey$KeyScheme;
import com.google.common.collect.ImmutableMap;
import com.yandex.feedsdk.di.FeedSdkComponent;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.go.address.position_confirmation.k;
import com.yandex.go.places.experiments.map.j;
import com.yandex.go.places.impl.data.repositories.map.PlacesCategoryFiltersStateRepository;
import com.yandex.go.places.map.data.repositories.i;
import com.ybsdk.common.e;
import com.ybsdk.common.repositiories.auth.g;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.pdf.internal.ui.PdfLoaderFragment;
import com.ybsdk.feature.pfm.internal.ui.PfmFragment;
import com.ybsdk.feature.pin.api.PinRemoteConfigStatus;
import com.ybsdk.feature.pin.internal.repositories.a;
import com.ybsdk.feature.pin.internal.screens.biometry.BiometricFragment;
import com.ybsdk.feature.pin.internal.screens.checkpin.CheckPinFragment;
import com.ybsdk.feature.pin.internal.screens.checkpin.c;
import com.ybsdk.feature.pin.internal.screens.checkpin.d;
import com.ybsdk.feature.pin.internal.screens.createpin.CreatePinFragment;
import com.ybsdk.rconfig.PinConfig;
import com.ybsdk.rconfig.b;
import java.util.LinkedHashMap;
import ru.yandex.taxi.summary.personalaction.notification.PersonalActionNotificationComponent;

/* loaded from: classes3.dex */
public final class vqa0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public vqa0(s8c0 s8c0Var, xvf0 xvf0Var) {
        this.a = 16;
        this.b = xvf0Var;
    }

    public static vqa0 a(eqh eqhVar) {
        return new vqa0(eqhVar, 26);
    }

    public static vqa0 b(eqh eqhVar) {
        return new vqa0(eqhVar, 27);
    }

    public static vqa0 c(eqh eqhVar) {
        return new vqa0(eqhVar, 28);
    }

    public static vqa0 d(eqh eqhVar) {
        return new vqa0(eqhVar, 29);
    }

    public static tc9 e(tw51 tw51Var) {
        j3g j3gVar = new j3g(tw51Var, 27);
        l5g l5gVar = new l5g(tw51Var, 3);
        xvf0 b = i5m.b(new f380(new l5g(tw51Var, 2), 18));
        int i = 1;
        l5g l5gVar2 = new l5g(tw51Var, i);
        int i2 = 0;
        g42 g42Var = new g42(l5gVar2, i2);
        int i3 = 26;
        return new tc9(new hra0(), ImmutableMap.g(PdfLoaderFragment.class, new aos(n3w.a(new ara0(new xv10(j3gVar, l5gVar, new zi60(new e840(j3gVar, b, g42Var, new g42(l5gVar2, i), new j3g(tw51Var, 29), 29), g42Var, new l5g(tw51Var, i2), i3), new j3g(tw51Var, 28), g42Var))), i3)));
    }

    public static z9b0 f(tw51 tw51Var) {
        l5g l5gVar = new l5g(tw51Var, 5);
        int i = 4;
        l5g l5gVar2 = new l5g(tw51Var, i);
        l5g l5gVar3 = new l5g(tw51Var, 9);
        f380 f380Var = new f380(new l5g(tw51Var, 6), 25);
        ph70 ph70Var = new ph70((xvf0) l5gVar, (xvf0) l5gVar2, (xvf0) l5gVar3, (xvf0) new s9b0(f380Var, 2), (xvf0) new s9b0(f380Var, 1), (xvf0) new s9b0(f380Var, 0), 7);
        f380 f380Var2 = new f380(new f380(new l5g(tw51Var, 12), 23), 24);
        l5g l5gVar4 = new l5g(tw51Var, 11);
        f380 f380Var3 = new f380(l5gVar4, 22);
        l5g l5gVar5 = new l5g(tw51Var, 14);
        l5g l5gVar6 = new l5g(tw51Var, 10);
        l5g l5gVar7 = new l5g(tw51Var, 7);
        f380 f380Var4 = new f380(new l5g(tw51Var, 8), 21);
        xab0 xab0Var = wab0.a;
        aos aosVar = new aos(n3w.a(new xdb0(new fn6(ph70Var, l5gVar3, f380Var2, f380Var3, l5gVar4, l5gVar5, l5gVar6, l5gVar7, xab0Var, f380Var4, new g680((Object) l5gVar4, (xvf0) xab0Var, 16), new l5g(tw51Var, 13)))), 27);
        LinkedHashMap A = gtq0.A(1);
        A.put(PfmFragment.class, aosVar);
        z9b0 z9b0Var = (z9b0) i5m.b(new dsl(pcb0.a, new br00(A), i)).get();
        q5z.i(z9b0Var);
        return z9b0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 1;
        int i3 = 2;
        int i4 = 0;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return e((tw51) xvf0Var.get());
            case 1:
                return new u8w((pho) xvf0Var.get());
            case 2:
                return new ol3((Activity) xvf0Var.get());
            case 3:
                yyq0 yyq0Var = (yyq0) xvf0Var.get();
                aq80 aq80Var = new aq80();
                Object a = yyq0Var.a(PersonalActionNotificationComponent.NOTIFICATION_ID, new ydf(9));
                if (!(a instanceof v3b0)) {
                    xby.t(jst.e, "SESSION_STORAGE:FEATURE_DATA_TYPE_INCONSISTENCY", null, "Feature storage with id=PersonalStateNotificationComponent is expected to has type " + qoi0.e(v3b0.class) + " but get " + (a != null ? a.getClass() : null), 6);
                    a = new v3b0();
                }
                aq80Var.a = (v3b0) a;
                return aq80Var;
            case 4:
                Context context = (Context) xvf0Var.get();
                l8b0 l8b0Var = new l8b0();
                try {
                    nfh nfhVar = new nfh(context);
                    nfhVar.C(MasterKey$KeyScheme.AES256_GCM);
                    EncryptedSharedPreferences.create(context, "PayEncryptedPreferences", nfhVar.i(), EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
                } catch (Exception unused) {
                }
                return l8b0Var;
            case 5:
                return f((tw51) xvf0Var.get());
            case 6:
                return new abe((Context) xvf0Var.get(), false, false);
            case 7:
                return new tpb0((pho) xvf0Var.get());
            case 8:
                return new u8w((pho) xvf0Var.get());
            case 9:
                return new x770((pho) xvf0Var.get());
            case 10:
                return new bvb0((k020) xvf0Var.get());
            case 11:
                tw51 tw51Var = (tw51) xvf0Var.get();
                l5g l5gVar = new l5g(tw51Var, 17);
                int i5 = 19;
                l5g l5gVar2 = new l5g(tw51Var, i5);
                l5g l5gVar3 = new l5g(tw51Var, 15);
                xvf0 b = i5m.b(new tgb0(l5gVar, l5gVar2, l5gVar3, i3));
                xvf0 b2 = i5m.b(new g680(i5m.b(new kxb0(new p5g(tw51Var, i2), i4)), (xvf0) new l5g(tw51Var, 24), i5));
                l5g l5gVar4 = new l5g(tw51Var, 28);
                int i6 = 29;
                f380 f380Var = new f380(l5gVar4, i6);
                p5g p5gVar = new p5g(tw51Var, 5);
                l5g l5gVar5 = new l5g(tw51Var, 26);
                fy30 fy30Var = new fy30(hdf.a, l5gVar4, p5gVar, b2, f380Var, b, l5gVar5, l5gVar3, 10);
                p5g p5gVar2 = new p5g(tw51Var, i3);
                qx5 qx5Var = new qx5(n3w.a(new sy5(new bc(l5gVar3, b, f380Var, fy30Var, p5gVar2))), b, i4);
                p5g p5gVar3 = new p5g(tw51Var, 4);
                l5g l5gVar6 = new l5g(tw51Var, 20);
                l5g l5gVar7 = new l5g(tw51Var, i6);
                l5g l5gVar8 = new l5g(tw51Var, 27);
                l5g l5gVar9 = new l5g(tw51Var, 22);
                p5g p5gVar4 = new p5g(tw51Var, i4);
                l5g l5gVar10 = new l5g(tw51Var, 18);
                l5g l5gVar11 = new l5g(tw51Var, 21);
                l5g l5gVar12 = new l5g(tw51Var, 23);
                n3w a2 = n3w.a(new ehb(new io9(l5gVar3)));
                ndp0 ndp0Var = gdp0.a;
                n3w a3 = n3w.a(new d(new c(b, f380Var, fy30Var, ndp0Var, l5gVar4, p5gVar3, l5gVar6, l5gVar7, l5gVar8, l5gVar9, l5gVar5, p5gVar4, p5gVar2, l5gVar10, l5gVar11, l5gVar12, a2)));
                nwf nwfVar = new nwf(14, tw51Var);
                l5g l5gVar13 = new l5g(tw51Var, 16);
                int i7 = 27;
                xea xeaVar = new xea((xvf0) a3, (xvf0) nwfVar, b, (xvf0) l5gVar13, 15, (byte) 0);
                xea xeaVar2 = new xea(n3w.a(new f7f(new st0(fy30Var, (xvf0) ndp0Var, b, l5gVar6, p5gVar3, l5gVar4, l5gVar8, p5gVar2, l5gVar5, l5gVar13, n3w.a(new t6f(new gyc(l5gVar3)))))), new p5g(tw51Var, 3), new l5g(tw51Var, 25), l5gVar13, 28);
                ycp0 ycp0Var = new ycp0();
                x8g x8gVar = ((h9g) tw51Var).v;
                com.ybsdk.feature.pinstorage.internal.data.c cVar = (com.ybsdk.feature.pinstorage.internal.data.c) x8gVar.E.get();
                q5z.h(cVar);
                b bVar = (b) x8gVar.A.get();
                PinRemoteConfigStatus pinRemoteConfigStatus = ((PinConfig) bVar.d(bVar.i.c).getData()).isEnabled() ? PinRemoteConfigStatus.ENABLE : PinRemoteConfigStatus.DISABLE;
                q5z.i(pinRemoteConfigStatus);
                ux5 ux5Var = (ux5) b.get();
                yj70 yj70Var = new yj70((g) x8gVar.V.get());
                lz70 lz70Var = new lz70(i7, (di51) x8gVar.l.get());
                AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) x8gVar.q.get();
                q5z.h(appAnalyticsReporter);
                gdf gdfVar = new gdf();
                com.ybsdk.feature.pinstorage.internal.data.c cVar2 = (com.ybsdk.feature.pinstorage.internal.data.c) x8gVar.E.get();
                q5z.h(cVar2);
                com.ybsdk.di.modules.features.pin.b bVar2 = new com.ybsdk.di.modules.features.pin.b((e) x8gVar.T.get());
                a aVar = (a) b2.get();
                com.ybsdk.feature.pinstorage.internal.data.c cVar3 = (com.ybsdk.feature.pinstorage.internal.data.c) x8gVar.E.get();
                q5z.h(cVar3);
                com.ybsdk.feature.pin.internal.domain.a aVar2 = new com.ybsdk.feature.pin.internal.domain.a(cVar3);
                ux5 ux5Var2 = (ux5) b.get();
                bwb0 bwb0Var = new bwb0((b) x8gVar.A.get());
                AppAnalyticsReporter appAnalyticsReporter2 = (AppAnalyticsReporter) x8gVar.q.get();
                q5z.h(appAnalyticsReporter2);
                return new com.ybsdk.feature.pin.internal.a(ycp0Var, cVar, pinRemoteConfigStatus, ux5Var, yj70Var, lz70Var, appAnalyticsReporter, new com.ybsdk.feature.pin.internal.domain.b(gdfVar, cVar2, bVar2, aVar, aVar2, ux5Var2, bwb0Var, appAnalyticsReporter2), ImmutableMap.i(BiometricFragment.class, qx5Var, CheckPinFragment.class, xeaVar, CreatePinFragment.class, xeaVar2));
            case 12:
                return new com.yandex.go.places.impl.data.repositories.a((j) xvf0Var.get());
            case 13:
                return new jyb0((Context) xvf0Var.get());
            case 14:
                return new lyb0((Context) xvf0Var.get());
            case 15:
                return new k((kr0) xvf0Var.get());
            case 16:
                flex.engine.a engine = ((FeedSdkComponent) xvf0Var.get()).getEngine();
                q5z.i(engine);
                return engine;
            case 17:
                return new vac0((PlacesCategoryFiltersStateRepository) xvf0Var.get());
            case 18:
                return new v5c0(i2, (i) xvf0Var.get());
            case 19:
                return new com.yandex.go.places.impl.data.repositories.payments.process.a((bl80) xvf0Var.get());
            case 20:
                return new com.yandex.go.places.impl.data.repositories.payments.status.a((bl80) xvf0Var.get());
            case 21:
                return new w2h((wnt) xvf0Var.get());
            case 22:
                return null;
            case 23:
                if (((t70) xvf0Var.get()).a(s0d0.class, "com.yandex.fintechsdk.adapters.plus.sdk.impl.PlusAdapterFactory") != null) {
                    ny61.u();
                }
                return null;
            case 24:
                return new bo5(i5m.a(xvf0Var));
            case 25:
                return new agt((FlexAdapter) xvf0Var.get(), i3);
            case 26:
                return new ede0((pho) xvf0Var.get());
            case 27:
                return new fde0((pho) xvf0Var.get());
            case 28:
                return new gde0((pho) xvf0Var.get());
            default:
                return new hde0((pho) xvf0Var.get());
        }
    }

    public /* synthetic */ vqa0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
