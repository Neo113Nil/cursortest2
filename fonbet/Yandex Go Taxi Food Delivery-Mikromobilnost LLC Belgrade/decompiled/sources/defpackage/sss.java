package defpackage;

import com.google.android.gms.internal.mlkit_vision_subject_segmentation.k;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zznz;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzoa;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzob;
import com.google.mlkit.common.sdkinternal.a;
import com.yandex.go.panorama.impl.GoPanoramaView;
import com.yandex.go.payments.shared.data.model.Currency$$serializer;
import com.yandex.go.payments.shared.data.model.GetCurrenciesResponse;
import com.yandex.go.payments.shared.data.model.h;
import com.yandex.go.proxyprovision.GoEndpointDescriptionResult;
import com.yandex.go.proxyprovision.GoEndpointDescriptionResultHeader$$serializer;
import com.yandex.go.proxyprovision.GoEndpointDescriptionResultQuery$$serializer;
import com.yandex.go.proxyprovision.e;
import com.yandex.go.superapp.impl.signals.GetPermissionsSignalFactory$Params;
import com.yandex.go.superapp.impl.signals.GetPermissionsSignalFactory$Result;
import com.yandex.go.superapp.impl.signals.c;
import com.yandex.go.superapp.impl.signals.d;
import com.yandex.mapkit.directions.DirectionsFactory;
import com.yandex.mapkit.directions.driving.DrivingRouterType;
import com.yandex.mapkit.places.panorama.PanoramaService;
import com.yandex.mapkit.transport.TransportFactory;
import com.yandex.urbanads.gamecenter.GameCenterFragment;
import defpackage.rct;
import flex.animation.player.interpolator.InterpolationType;
import java.lang.annotation.Annotation;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.Executor;
import kotlin.collections.builders.ListBuilder;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.eatskit.dto.GeoPointSource;
import ru.yandex.taxi.eatskit.dto.GrantResult;

/* loaded from: classes11.dex */
public final /* synthetic */ class sss implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ sss(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        pss dependencies_delegate$lambda$1;
        zy11 zy11Var;
        PanoramaService panoramaService_delegate$lambda$0;
        switch (this.a) {
            case 0:
                dependencies_delegate$lambda$1 = GameCenterFragment.dependencies_delegate$lambda$1();
                return dependencies_delegate$lambda$1;
            case 1:
                return InterpolationType.Companion.serializer();
            case 2:
                return new oke(qoi0.a(tg2.class), null, new KSerializer[0]);
            case 3:
                return vez0.g("ru.yandex.taxi.eatskit.dto.GeoPointSource", GeoPointSource.values(), new String[]{"FROM_GEO", "FROM_MODAL", "GEO_REQUEST", "MODAL_REQUEST", "FORCE_FROM_GEO"}, new Annotation[][]{null, null, null, null, null});
            case 4:
                return GeoPointSource.Companion.serializer();
            case 5:
                u0t u0tVar = v0t.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 6:
                h hVar = GetCurrenciesResponse.Companion;
                return new p53(Currency$$serializer.INSTANCE, 0);
            case 7:
                return new p53(skp.a, 0);
            case 8:
                dbt dbtVar = ebt.Companion;
                return new p53(auu0.a, 0);
            case 9:
                return new k8u(auu0.a, GrantResult.Companion.serializer(), 1);
            case 10:
                c cVar = GetPermissionsSignalFactory$Params.Companion;
                return new p53(auu0.a, 0);
            case 11:
                d dVar = GetPermissionsSignalFactory$Result.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 12:
                vct vctVar = rct.c.Companion;
                return new p53(wct.a, 0);
            case 13:
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 14:
                zy11Var = zy11.a;
                return zy11Var;
            case 15:
                new q7p();
                r7p r7pVar = new r7p(2);
                qc91 qc91Var = (qc91) qk20.c().a(qc91.class);
                qc91Var.getClass();
                return new p7p((j3a1) qc91Var.a.b(r7pVar), qc91Var.b, r7pVar);
            case 16:
                tv4 tv4Var = new tv4();
                tv4Var.a(256, new int[0]);
                return r4b1.a(new uv4(tv4Var.a, tv4Var.b));
            case 17:
                tv4 tv4Var2 = new tv4();
                tv4Var2.a(256, new int[0]);
                return r4b1.a(new uv4(tv4Var2.a, tv4Var2.b));
            case 18:
                czu0 czu0Var = new czu0();
                new dzu0();
                czu0Var.a = true;
                ezu0 ezu0Var = new ezu0(czu0Var);
                rc91 rc91Var = (rc91) qk20.c().a(rc91.class);
                bga1 bga1Var = (bga1) rc91Var.a.b(ezu0Var);
                Executor executor = (Executor) rc91Var.b.a.get();
                k h = ksb1.h();
                vg91 vg91Var = new vg91(bga1Var, executor);
                l8b1 l8b1Var = new l8b1();
                l8b1Var.c = zznz.TYPE_THIN;
                fjb1 fjb1Var = new fjb1();
                fjb1Var.b = ezu0Var.a();
                fjb1Var.a = zzoa.NO_ERROR;
                l8b1Var.d = new ljb1(fjb1Var);
                a.c().execute(new kz(h, new o3(l8b1Var, 1), zzob.ON_DEVICE_SUBJECT_SEGMENTATION_CREATE, h.c(), 16));
                return vg91Var;
            case 19:
                ListBuilder a = rcc.a();
                Locale locale = Locale.US;
                a.add(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", locale));
                if (!jl40.l(Locale.getDefault(), locale)) {
                    a.add(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ"));
                }
                return a.j();
            case 20:
                e eVar = GoEndpointDescriptionResult.Companion;
                return new p53(GoEndpointDescriptionResultHeader$$serializer.INSTANCE, 0);
            case 21:
                e eVar2 = GoEndpointDescriptionResult.Companion;
                return new p53(GoEndpointDescriptionResultQuery$$serializer.INSTANCE, 0);
            case 22:
                panoramaService_delegate$lambda$0 = GoPanoramaView.panoramaService_delegate$lambda$0();
                return panoramaService_delegate$lambda$0;
            case 23:
                return DirectionsFactory.getInstance().createDrivingRouter(DrivingRouterType.COMBINED);
            case 24:
                return TransportFactory.getInstance().createPedestrianRouter();
            case 25:
                return lmt.a(uh6.E(16), uh6.E(17), lzr.y, lmt.j, uh6.w(-0.005d));
            case 26:
                return com.google.android.gms.common.a.d;
            case 27:
                return new oke(qoi0.a(vm50.class), new v5e0(qoi0.a(vm50.class), new Annotation[0]), new KSerializer[0]);
            case 28:
                return new oke(qoi0.a(vm50.class), new v5e0(qoi0.a(vm50.class), new Annotation[0]), new KSerializer[0]);
            default:
                return new oke(qoi0.a(vm50.class), new v5e0(qoi0.a(vm50.class), new Annotation[0]), new KSerializer[0]);
        }
    }
}
