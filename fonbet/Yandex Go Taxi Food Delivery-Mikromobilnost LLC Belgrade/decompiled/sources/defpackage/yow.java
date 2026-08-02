package defpackage;

import android.content.res.Configuration;
import android.text.SpannedString;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import androidx.compose.foundation.lazy.layout.c;
import com.adjust.sdk.AdjustConfig;
import com.yandex.go.design.compose.images.b;
import com.yandex.go.due_timetable.experiment.IntercityTimetableConfigExperiment;
import com.yandex.go.image.api.domain.models.ImageModel$Tag$Theme;
import com.yandex.go.lootbox.impl.presentation.modal.LootBoxModalView;
import com.yandex.go.permission.location_with_agreement.ui.LocationPermissionWithAgreementModalView;
import com.yandex.go.taxi.order.info.ui.ListDriverComponent;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import com.yandex.messaging.isolated.IsolatedFragment;
import com.yandex.quark.utils.jni.IoCleaner;
import com.ybsdk.feature.kyc.internal.screens.photo.views.MainPageGuideView;
import com.ybsdk.feature.kyc.internal.screens.photo.views.SelfieGuideView;
import com.ybsdk.feature.kyc.internal.screens.photov2.KycPhotoV2Fragment;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.presentation.InternetPaymentFormInputScreenParams;
import java.net.URL;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;
import ru.yandex.taxi.modal.LoadingModalView;
import ru.yandex.taxi.preorder.source.userposition.repository.e;
import ru.yandex.taxi.zalogin.LinkAccountsFullscreen;

/* loaded from: classes12.dex */
public final /* synthetic */ class yow implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yow(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 ensureWorking$lambda$0;
        enp0 sdkComponent_delegate$lambda$1;
        View showBottomSheet$lambda$19;
        View showBottomSheet$lambda$21;
        String str;
        String str2;
        zy11 _init_$lambda$2;
        zy11 showPhoto$lambda$0;
        Object qbvVar;
        View insetsType$lambda$0;
        View insetsType$lambda$02;
        zy11 onAttachedToWindow$lambda$0;
        zy11 animateGifts$lambda$0$1;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (dw) ((how) obj).b.get();
            case 1:
                return (dw) ((epf) ((bpw) obj).b).get();
            case 2:
                return (dw) ((how) obj).b.get();
            case 3:
                IntercityTimetableConfigExperiment.TimeslotConfiguration timeslotConfiguration = (IntercityTimetableConfigExperiment.TimeslotConfiguration) obj;
                Integer num = timeslotConfiguration.a;
                Integer num2 = timeslotConfiguration.b;
                if (num == null || num2 == null) {
                    return null;
                }
                return y6i0.n(num.intValue(), num2.intValue());
            case 4:
                InternetPaymentFormInputScreenParams internetPaymentFormInputScreenParams = (InternetPaymentFormInputScreenParams) obj;
                t8j0 t8j0Var = new t8j0();
                String personalAccount = internetPaymentFormInputScreenParams.getPersonalAccount();
                if (personalAccount == null) {
                    personalAccount = "";
                }
                return new etw(t8j0Var, personalAccount, internetPaymentFormInputScreenParams.getProviderId(), true, internetPaymentFormInputScreenParams.getWithResult());
            case 5:
                ensureWorking$lambda$0 = IoCleaner.ensureWorking$lambda$0((IoCleaner) obj);
                return ensureWorking$lambda$0;
            case 6:
                return new ScreenRect(new ScreenPoint(0.0f, 0.0f), new ScreenPoint(ofp0.b, ofp0.c - tje.w(68, ((avj0) ((tyw) obj).b).a)));
            case 7:
                sdkComponent_delegate$lambda$1 = IsolatedFragment.sdkComponent_delegate$lambda$1((IsolatedFragment) obj);
                return sdkComponent_delegate$lambda$1;
            case 8:
                showBottomSheet$lambda$19 = KycPhotoV2Fragment.showBottomSheet$lambda$19((MainPageGuideView) obj);
                return showBottomSheet$lambda$19;
            case 9:
                showBottomSheet$lambda$21 = KycPhotoV2Fragment.showBottomSheet$lambda$21((SelfieGuideView) obj);
                return showBottomSheet$lambda$21;
            case 10:
                return Integer.valueOf(((Configuration) obj).orientation);
            case 11:
                t2y t2yVar = (t2y) obj;
                View b = t2yVar.b(t2yVar);
                t2yVar.a(b);
                return b;
            case 12:
                l5y l5yVar = ((c) obj).j;
                if (l5yVar != null) {
                    rzo.D(l5yVar);
                }
                return zy11Var;
            case 13:
                return new BaseInputConnection(((pay) obj).a, false);
            case 14:
                pcy pcyVar = (pcy) obj;
                int i2 = ocy.a[pcyVar.a.ordinal()];
                String str3 = "https://pci-tf.fin.yandex.ru/api/";
                if (i2 == 1) {
                    q7w q7wVar = pcyVar.b;
                    if (q7wVar != null && (str = q7wVar.b) != null) {
                        str3 = str;
                    }
                    return new URL(str3);
                }
                if (i2 == 2) {
                    return new URL("http://127.0.0.1:8080/diehard/api/");
                }
                if (i2 == 3) {
                    return new URL("https://pci-front-test.crowdtest.yandex.ru/api/");
                }
                if (i2 == 4) {
                    return new URL("https://pci-tf.fin.yandex.ru/api/");
                }
                if (i2 != 5) {
                    w511.b();
                    return null;
                }
                if (bg11.a.equals(AdjustConfig.ENVIRONMENT_SANDBOX)) {
                    return new URL("https://diehard-mock-test.paysys.yandex.net:8043/api/");
                }
                q7w q7wVar2 = pcyVar.b;
                if (q7wVar2 == null || (str2 = q7wVar2.b) == null) {
                    str2 = "https://diehard.yandex.ru/api/";
                }
                return new URL(str2);
            case 15:
                _init_$lambda$2 = LinkAccountsFullscreen._init_$lambda$2((LinkAccountsFullscreen) obj);
                return _init_$lambda$2;
            case 16:
                showPhoto$lambda$0 = ListDriverComponent.showPhoto$lambda$0((ListDriverComponent) obj);
                return showPhoto$lambda$0;
            case 17:
                b bVar = (b) obj;
                tbv tbvVar = bVar.a;
                boolean booleanValue = ((Boolean) bVar.w.getValue()).booleanValue();
                mgd mgdVar = new mgd(tbvVar, booleanValue);
                Object obj2 = bVar.a;
                if (obj2 instanceof obv) {
                    obv obvVar = (obv) obj2;
                    if (obvVar.c == null) {
                        obj2 = obv.a(obvVar, booleanValue ? ImageModel$Tag$Theme.Dark : ImageModel$Tag$Theme.Light, 0, 5);
                    }
                }
                return new Pair(obj2, mgdVar);
            case 18:
                com.yandex.go.design.compose.images.c cVar = (com.yandex.go.design.compose.images.c) obj;
                nvi0 nvi0Var = cVar.a;
                boolean booleanValue2 = ((Boolean) cVar.w.getValue()).booleanValue();
                mgd mgdVar2 = new mgd(nvi0Var, booleanValue2);
                nvi0 nvi0Var2 = cVar.a;
                oz40 oz40Var = lgd.a;
                if (nvi0Var2 instanceof ovi0) {
                    qbvVar = booleanValue2 ? new obv(((ovi0) nvi0Var2).b, ImageModel$Tag$Theme.Dark, 4, 0) : new obv(((ovi0) nvi0Var2).a, ImageModel$Tag$Theme.Light, 4, 0);
                } else {
                    if (!(nvi0Var2 instanceof pvi0)) {
                        w511.b();
                        return null;
                    }
                    qbvVar = booleanValue2 ? new qbv(((pvi0) nvi0Var2).b) : new qbv(((pvi0) nvi0Var2).a);
                }
                return new Pair(qbvVar, mgdVar2);
            case 19:
                insetsType$lambda$0 = LoadingModalView.insetsType$lambda$0((LoadingModalView) obj);
                return insetsType$lambda$0;
            case 20:
                return ((z5z) obj).a.s();
            case 21:
                return new vaz((waz) obj);
            case 22:
                insetsType$lambda$02 = LocationPermissionWithAgreementModalView.insetsType$lambda$0((LocationPermissionWithAgreementModalView) obj);
                return insetsType$lambda$02;
            case 23:
                Boolean bool = (Boolean) ((jbh) ((e) obj).e.a).f(SimplePersistentBooleanExperiment.SETUP_INITIAL_GEO_LOCATION).c();
                bool.booleanValue();
                return bool;
            case 24:
                return Boolean.valueOf(((kbn) obj).a);
            case 25:
                return new jzj("empty_id", new SpannedString(((kez) obj).a.a.getString(uyh0.plus_sdk_debug_panel_logs_not_found)));
            case 26:
                ((iej) obj).c(vej.a);
                return zy11Var;
            case 27:
                return ((gh00) ((ynz) obj).A).i.p();
            case 28:
                onAttachedToWindow$lambda$0 = LootBoxModalView.onAttachedToWindow$lambda$0((LootBoxModalView) obj);
                return onAttachedToWindow$lambda$0;
            default:
                animateGifts$lambda$0$1 = LootBoxModalView.animateGifts$lambda$0$1((Ref$BooleanRef) obj);
                return animateGifts$lambda$0$1;
        }
    }
}
