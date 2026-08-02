package defpackage;

import com.yandex.go.agreement.api.trackable.network.TrackableAcceptanceActionParam;
import com.yandex.go.loyalty.api.data.model.common.ColorDto$$serializer;
import com.yandex.go.loyalty.api.data.model.common.LinearColorSettings;
import com.yandex.go.loyalty.api.data.model.common.d;
import com.yandex.go.shortcuts.dto.request.KnownOrderInfo;
import com.yandex.go.shortcuts.dto.request.WayPoint$$serializer;
import com.yandex.go.shortcuts.dto.request.b;
import com.yandex.go.taxi.order.chat.api.data.model.LanguageHint;
import com.yandex.go.taxi.order.chat.api.data.model.a;
import com.yandex.go.taxi.order.models.api.objects.LackOfMoneyNotificationDto;
import com.yandex.go.taxi.order.models.api.objects.r;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.kyc.internal.screens.photo.KycPhotoFragment;
import defpackage.owx;
import flex.theme.ThemedColor;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.client.response.LaunchAcceptance;
import ru.yandex.taxi.common_models.net.map_object.LabelType;
import ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderStatusDto;
import ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderTypeDto;
import ru.yandex.taxi.masstransit.geopayment.linkcard.network.model.LinkCardStatusResponse$LinkCardStatus;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes5.dex */
public final /* synthetic */ class vix implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ vix(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        ColorModel.Raw navBarColorTransparent_delegate$lambda$1;
        ColorModel.Attr navBarDefaultBackgroundColor_delegate$lambda$2;
        int i = 0;
        switch (this.a) {
            case 0:
                xix xixVar = yix.Companion;
                return new k8u(auu0.a, pnz.a, 1);
            case 1:
                zy11Var = zy11.a;
                return zy11Var;
            case 2:
                b bVar = KnownOrderInfo.Companion;
                return new p53(WayPoint$$serializer.INSTANCE, 0);
            case 3:
                b bVar2 = KnownOrderInfo.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 4:
                navBarColorTransparent_delegate$lambda$1 = KycPhotoFragment.navBarColorTransparent_delegate$lambda$1();
                return navBarColorTransparent_delegate$lambda$1;
            case 5:
                navBarDefaultBackgroundColor_delegate$lambda$2 = KycPhotoFragment.navBarDefaultBackgroundColor_delegate$lambda$2();
                return navBarDefaultBackgroundColor_delegate$lambda$2;
            case 6:
                return new gox(i);
            case 7:
                return new onx(i);
            case 8:
                cqx cqxVar = hqx.Companion;
                return LabelType.Companion.serializer();
            case 9:
                cqx cqxVar2 = hqx.Companion;
                return new eni0(qoi0.a(Float.class), nor.a);
            case 10:
                return vez0.g("ru.yandex.taxi.common_models.net.map_object.LabelType", LabelType.values(), new String[]{"last", "default", "zone_point"}, new Annotation[][]{null, null, null});
            case 11:
                r rVar = LackOfMoneyNotificationDto.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 12:
                grx grxVar = hrx.Companion;
                return ThemedColor.Companion.serializer();
            case 13:
                a aVar = LanguageHint.Companion;
                return new p53(auu0.a, 1);
            case 14:
                a aVar2 = LanguageHint.Companion;
                return new p53(auu0.a, 1);
            case 15:
                kux kuxVar = LaunchAcceptance.Companion;
                return LaunchAcceptance.IconStyle.Companion.serializer();
            case 16:
                return vez0.g("ru.yandex.taxi.client.response.LaunchAcceptance.IconStyle", LaunchAcceptance.IconStyle.values(), new String[]{"icon_left", "icon_central"}, new Annotation[][]{null, null});
            case 17:
                gvx gvxVar = hvx.Companion;
                return LinkedOrderStatusDto.Companion.serializer();
            case 18:
                gvx gvxVar2 = hvx.Companion;
                return LinkedOrderTypeDto.Companion.serializer();
            case 19:
                qvx qvxVar = rvx.Companion;
                return DriveState.Companion.serializer();
            case 20:
                return TrackableAcceptanceActionParam.Status.Companion.serializer();
            case 21:
                bxx bxxVar = owx.g.Companion;
                return new p53(mdx.a, 0);
            case 22:
                return new p53(new oke(qoi0.a(pyp0.class), null, new KSerializer[0]), 0);
            case 23:
                return new androidx.compose.foundation.lazy.grid.b(0, 0);
            case 24:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 25:
                d dVar = LinearColorSettings.Companion;
                return new p53(ColorDto$$serializer.INSTANCE, 0);
            case 26:
                d dVar2 = LinearColorSettings.Companion;
                return new p53(nor.a, 0);
            case 27:
                d dVar3 = LinearColorSettings.Companion;
                return new p53(nor.a, 0);
            case 28:
                ljy ljyVar = mjy.Companion;
                return new p53(qke.n(p9v0.e), 0);
            default:
                return LinkCardStatusResponse$LinkCardStatus.Companion.serializer();
        }
    }
}
