package defpackage;

import com.yandex.go.flex.common.api.actions.CloseFlexScreenAction;
import com.yandex.go.loyalty.api.data.model.common.ColorSettings;
import com.yandex.go.loyalty.api.data.model.common.b;
import com.yandex.go.multimodal_route.network.models.CommentFieldDto;
import com.yandex.go.multimodal_route.network.models.CommitFeedbackDtoRequest;
import com.yandex.go.payments.shared.business.accountcreation.corp.ClientTrialBodyParam;
import com.yandex.go.payments.shared.business.accountcreation.corp.a;
import com.yandex.go.support.web.CommonSupportCallJsInterfaceFactory$ConfigResult;
import com.yandex.go.zone.dto.objects.ComboExtra;
import com.yandex.go.zone.dto.objects.b0;
import defpackage.utc;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.masstransit.promo.CommunicationType;
import ru.yandex.taxi.promotions.model.Promotion;

/* loaded from: classes12.dex */
public final /* synthetic */ class z2c implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ z2c(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                a aVar = ClientTrialBodyParam.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 1:
                return CloseFlexScreenAction.Companion.serializer();
            case 2:
                return new p53(n6c.a, 0);
            case 3:
                return new p53(auu0.a, 0);
            case 4:
                c8c c8cVar = d8c.Companion;
                return new p53(jj4.a, 0);
            case 5:
                i8c i8cVar = j8c.Companion;
                return new p53(b8c.a, 0);
            case 6:
                b bVar = ColorSettings.Companion;
                return ColorSettings.Type.Companion.serializer();
            case 7:
                return vez0.g("com.yandex.go.loyalty.api.data.model.common.ColorSettings.Type", ColorSettings.Type.values(), new String[]{"LINEAR", "RADIAL", "TRANSPARENT"}, new Annotation[][]{null, null, null});
            case 8:
                return new p53(fgc.a, 0);
            case 9:
                return new p53(fgc.a, 0);
            case 10:
                long f = rzo.f(4284612846L);
                long f2 = rzo.f(4281794739L);
                long f3 = rzo.f(4278442694L);
                long f4 = rzo.f(4278290310L);
                long j = ldc.f;
                long f5 = rzo.f(4289724448L);
                long j2 = ldc.b;
                return new lic(f, f2, f3, f4, j, j, f5, j, j2, j2, j2, j);
            case 11:
                b0 b0Var = ComboExtra.Companion;
                return ComboExtra.RouteDisplayType.Companion.serializer();
            case 12:
                return vez0.g("com.yandex.go.zone.dto.objects.ComboExtra.RouteDisplayType", ComboExtra.RouteDisplayType.values(), new String[]{"default", "curve"}, new Annotation[][]{null, null});
            case 13:
                return new oke(qoi0.a(png.class), new v5e0(qoi0.a(png.class), new Annotation[0]), new KSerializer[0]);
            case 14:
                return new oke(qoi0.a(png.class), new v5e0(qoi0.a(png.class), new Annotation[0]), new KSerializer[0]);
            case 15:
                return new p53(auu0.a, 0);
            case 16:
                return new p53(auu0.a, 0);
            case 17:
                return new oke(qoi0.a(png.class), new v5e0(qoi0.a(png.class), new Annotation[0]), new KSerializer[0]);
            case 18:
                return new oke(qoi0.a(png.class), new v5e0(qoi0.a(png.class), new Annotation[0]), new KSerializer[0]);
            case 19:
                return new oke(qoi0.a(png.class), new v5e0(qoi0.a(png.class), new Annotation[0]), new KSerializer[0]);
            case 20:
                com.yandex.go.multimodal_route.network.models.a aVar2 = CommentFieldDto.Companion;
                return new p53(h6w.a, 0);
            case 21:
                com.yandex.go.multimodal_route.network.models.b bVar2 = CommitFeedbackDtoRequest.Companion;
                return new p53(auu0.a, 0);
            case 22:
                com.yandex.go.support.web.a aVar3 = CommonSupportCallJsInterfaceFactory$ConfigResult.Companion;
                return new p53(auu0.a, 0);
            case 23:
                brc brcVar = crc.Companion;
                return new p53(ru.yandex.taxi.communications.model.a.a, 0);
            case 24:
                return Promotion.Type.Companion.serializer();
            case 25:
                return vez0.g("ru.yandex.taxi.masstransit.promo.CommunicationType", CommunicationType.values(), new String[]{"promoblock", "object_over_map"}, new Annotation[][]{null, null});
            case 26:
                auc aucVar = utc.Companion;
                return new p53(auu0.a, 0);
            case 27:
                auc aucVar2 = utc.Companion;
                return new p53(auu0.a, 0);
            case 28:
                auc aucVar3 = utc.Companion;
                return new p53(auu0.a, 0);
            default:
                vtc vtcVar = utc.a.Companion;
                return new p53(stc.a, 0);
        }
    }
}
