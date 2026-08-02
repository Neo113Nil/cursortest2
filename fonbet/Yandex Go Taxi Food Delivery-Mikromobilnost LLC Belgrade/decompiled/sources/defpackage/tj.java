package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.selection.j;
import com.yandex.go.drive.sdkintegration.domain.DriveSdkHttpException;
import com.yandex.go.drive.sdkintegration.domain.session.DriveSessionStateRepository$fetchStateInSdk$lambda$0$$inlined$suspendCallbackApi$2;
import com.yandex.go.drive.sdkintegration.domain.session.DriveSessionStateRepository$fetchStateInSdk$lambda$0$$inlined$suspendCallbackApi$3;
import com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.presentation.SuperAppMainOnboardingView$getPixelCopyBitmap$$inlined$suspendCallbackApi$2;
import com.yandex.go.overdraft.data.model.DebtPaymentMethodDto;
import com.yandex.go.overdraft.e;
import com.yandex.go.scooters.domain.z;
import com.yandex.go.tariffcard.ui.TariffOptionsCardView;
import com.yandex.go.tariffcard.ui.model.CarouselWithPosition$Position;
import com.yandex.mapkit.navigation.transport.Navigation;
import com.yandex.messaging.internal.net.RetryManager$awaitConnectionEstablished$2$invokeSuspend$$inlined$disposableCoroutineWrapper$1$1$1;
import com.yandex.mobile.drive.view.AlertView;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.promo.PlusPanelPromoView;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import kotlin.Result;
import kotlin.jvm.internal.Ref$BooleanRef;
import retrofit2.Response;
import ru.yandex.taxi.am.AccountAuthorizationHandler$startLogingIAlus$$inlined$suspendCallbackApi$2;
import ru.yandex.taxi.logistics.care.impl.auth.CareAuthInteractor$ensureAuthorizedAndInject$2$invokeSuspend$$inlined$suspendCallbackApi$2;
import ru.yandex.taxi.logistics.care.impl.auth.CareAuthInteractor$ensureAuthorizedAndInject$2$invokeSuspend$$inlined$suspendCallbackApi$3;
import ru.yandex.taxi.scooters.presentation.detailed_order.show_navigation.ScootersShowNavigationBubbleModalView;
import ru.yandex.taxi.scooters.presentation.detailed_order.show_navigation.ScootersShowNavigationBubbleView;
import ru.yandex.taxi.startup.launch.a;
import ru.yandex.taxi.summary.solid.modal_on_order.domain.SuspendableChainProcessor$startChainProcessing$$inlined$suspendCallbackApi$2;

/* loaded from: classes13.dex */
public final class tj implements tls, al7 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ tj(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ScootersShowNavigationBubbleView scootersShowNavigationBubbleView;
        qhx0 qhx0Var;
        boolean z = false;
        switch (this.a) {
            case 0:
                Object value = ((Result) obj).getValue();
                boolean z2 = value instanceof Result.Failure;
                um3 um3Var = (um3) this.b;
                if (z2) {
                    um3Var.b.b(Result.a(value));
                } else {
                    um3Var.b.onSuccess();
                }
                ((AccountAuthorizationHandler$startLogingIAlus$$inlined$suspendCallbackApi$2) this.c).invoke(new Result(value));
                return zy11.a;
            case 1:
                return ((p0) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 2:
                int intValue = ((Number) obj).intValue();
                return ((zbd) this.b).invoke(Integer.valueOf(intValue), ((List) this.c).get(intValue));
            case 3:
                ((AlertView) this.b).getLifecycle().d((ur1) this.c);
                return zy11.a;
            case 4:
                ((a) this.b).c.e.remove((si3) this.c);
                return zy11.a;
            case 5:
                ((a) this.b).c.d.remove((si3) this.c);
                return zy11.a;
            case 6:
                return ((wls) this.b).invoke((Response) this.c, obj);
            case 7:
                Object value2 = ((Result) obj).getValue();
                CareAuthInteractor$ensureAuthorizedAndInject$2$invokeSuspend$$inlined$suspendCallbackApi$2 careAuthInteractor$ensureAuthorizedAndInject$2$invokeSuspend$$inlined$suspendCallbackApi$2 = (CareAuthInteractor$ensureAuthorizedAndInject$2$invokeSuspend$$inlined$suspendCallbackApi$2) this.b;
                CareAuthInteractor$ensureAuthorizedAndInject$2$invokeSuspend$$inlined$suspendCallbackApi$3 careAuthInteractor$ensureAuthorizedAndInject$2$invokeSuspend$$inlined$suspendCallbackApi$3 = (CareAuthInteractor$ensureAuthorizedAndInject$2$invokeSuspend$$inlined$suspendCallbackApi$3) this.c;
                Throwable a = Result.a(value2);
                if (a == null) {
                    careAuthInteractor$ensureAuthorizedAndInject$2$invokeSuspend$$inlined$suspendCallbackApi$2.invoke(value2);
                } else {
                    careAuthInteractor$ensureAuthorizedAndInject$2$invokeSuspend$$inlined$suspendCallbackApi$3.invoke(a);
                }
                return zy11.a;
            case 8:
                int intValue2 = ((Number) obj).intValue();
                return ((tbb) this.b).invoke(Integer.valueOf(intValue2), ((List) this.c).get(intValue2));
            case 9:
                try {
                    ((yf7) this.b).cancel();
                } catch (Throwable unused) {
                }
                return zy11.a;
            case 10:
                KeyEvent keyEvent = ((eix) obj).a;
                if (((oay) this.b).a() == HandleState.Selection && keyEvent.getKeyCode() == 4 && c9y.f(keyEvent) == 1) {
                    ((j) this.c).g(null);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 11:
                int intValue3 = ((Number) obj).intValue();
                return ((txk) this.b).invoke(Integer.valueOf(intValue3), ((List) this.c).get(intValue3));
            case 12:
                shf shfVar = (shf) obj;
                DriveSessionStateRepository$fetchStateInSdk$lambda$0$$inlined$suspendCallbackApi$2 driveSessionStateRepository$fetchStateInSdk$lambda$0$$inlined$suspendCallbackApi$2 = (DriveSessionStateRepository$fetchStateInSdk$lambda$0$$inlined$suspendCallbackApi$2) this.c;
                if (shfVar instanceof thf) {
                    DriveSessionStateRepository$fetchStateInSdk$lambda$0$$inlined$suspendCallbackApi$3 driveSessionStateRepository$fetchStateInSdk$lambda$0$$inlined$suspendCallbackApi$3 = (DriveSessionStateRepository$fetchStateInSdk$lambda$0$$inlined$suspendCallbackApi$3) this.b;
                    thf thfVar = (thf) shfVar;
                    int i = thfVar.c;
                    Exception exc = thfVar.b;
                    if (200 <= i && i < 600) {
                        exc = new DriveSdkHttpException(i, exc);
                    }
                    driveSessionStateRepository$fetchStateInSdk$lambda$0$$inlined$suspendCallbackApi$3.invoke(exc);
                } else if (shfVar instanceof vhf) {
                    driveSessionStateRepository$fetchStateInSdk$lambda$0$$inlined$suspendCallbackApi$2.invoke(new jqn((vhf) shfVar));
                } else {
                    if (!(shfVar instanceof uhf)) {
                        w511.b();
                        return null;
                    }
                    driveSessionStateRepository$fetchStateInSdk$lambda$0$$inlined$suspendCallbackApi$2.invoke(new hqn((uhf) shfVar));
                }
                return zy11.a;
            case 13:
                tls tlsVar = (tls) this.b;
                tlsVar.invoke(new ce31((vzu) this.c));
                tlsVar.invoke(new od31((pzu) obj));
                return zy11.a;
            case 14:
                int intValue4 = ((Number) obj).intValue();
                return ((bns) this.b).invoke(Integer.valueOf(intValue4), ((List) this.c).get(intValue4));
            case 15:
                gux guxVar = (gux) this.b;
                Object obj2 = guxVar.a;
                j18 j18Var = (j18) this.c;
                synchronized (obj2) {
                    guxVar.b.remove(j18Var);
                }
                return zy11.a;
            case 16:
                e eVar = (e) this.b;
                List list = (List) this.c;
                eVar.getClass();
                u0k u0kVar = ((nea0) obj).a;
                if (!(u0kVar instanceof ogz0)) {
                    if ((u0kVar instanceof lea0) && list != null) {
                        lea0 lea0Var = (lea0) u0kVar;
                        String code = lea0Var.c().getCode();
                        String id = lea0Var.getId();
                        List<DebtPaymentMethodDto> list2 = list;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            for (DebtPaymentMethodDto debtPaymentMethodDto : list2) {
                                if (!jl40.l(debtPaymentMethodDto.a, code) || (id != null && !id.equals(debtPaymentMethodDto.b))) {
                                }
                            }
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 17:
                int intValue5 = ((Number) obj).intValue();
                return ((g990) this.b).invoke(Integer.valueOf(intValue5), ((List) this.c).get(intValue5));
            case 18:
                ColorStateList valueOf = ColorStateList.valueOf(((Number) obj).intValue());
                ((TextView) this.b).setCompoundDrawableTintList(valueOf);
                ImageView imageView = ((PlusPanelPromoView) this.c).arrowForwardImageView;
                if (imageView != null) {
                    imageView.setImageTintList(valueOf);
                }
                return zy11.a;
            case 19:
                return ((vld0) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 20:
                tje.N((tse) this.b, ie60.a, null, new RetryManager$awaitConnectionEstablished$2$invokeSuspend$$inlined$disposableCoroutineWrapper$1$1$1((y1k0) this.c, null), 2);
                return zy11.a;
            case 21:
                return ((umm0) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 22:
                ((com.yandex.go.scooters.utils.data.a) this.b).c.remove(this.c);
                return zy11.a;
            case 23:
                ((z) this.b).a.a.remove((xlo0) this.c);
                return zy11.a;
            case 24:
                ((Navigation) this.b).removeListener((vto0) this.c);
                return zy11.a;
            case 25:
                scootersShowNavigationBubbleView = ((ScootersShowNavigationBubbleModalView) this.b).bubble;
                Handler handler = scootersShowNavigationBubbleView.getHandler();
                if (handler != null) {
                    handler.removeCallbacks((r6b) this.c);
                }
                return zy11.a;
            case 26:
                int intValue6 = ((Number) obj).intValue();
                SuperAppMainOnboardingView$getPixelCopyBitmap$$inlined$suspendCallbackApi$2 superAppMainOnboardingView$getPixelCopyBitmap$$inlined$suspendCallbackApi$2 = (SuperAppMainOnboardingView$getPixelCopyBitmap$$inlined$suspendCallbackApi$2) this.b;
                if (intValue6 == 0) {
                    superAppMainOnboardingView$getPixelCopyBitmap$$inlined$suspendCallbackApi$2.invoke((Bitmap) this.c);
                } else {
                    superAppMainOnboardingView$getPixelCopyBitmap$$inlined$suspendCallbackApi$2.invoke(null);
                }
                return zy11.a;
            case 27:
                ((Ref$BooleanRef) this.b).element = ((Boolean) obj).booleanValue();
                SuspendableChainProcessor$startChainProcessing$$inlined$suspendCallbackApi$2 suspendableChainProcessor$startChainProcessing$$inlined$suspendCallbackApi$2 = (SuspendableChainProcessor$startChainProcessing$$inlined$suspendCallbackApi$2) this.c;
                zy11 zy11Var = zy11.a;
                suspendableChainProcessor$startChainProcessing$$inlined$suspendCallbackApi$2.invoke(zy11Var);
                return zy11Var;
            case 28:
                bix0 bix0Var = (bix0) obj;
                oz8 oz8Var = (oz8) this.b;
                if ((oz8Var != null ? oz8Var.b : null) == CarouselWithPosition$Position.ABOVE_REQUIREMENTS) {
                    bix0Var.a((kix0) this.c, "CAROUSEL_SECTION_NAME");
                }
                return zy11.a;
            default:
                List list3 = (List) obj;
                TariffOptionsCardView tariffOptionsCardView = (TariffOptionsCardView) this.b;
                qhx0Var = tariffOptionsCardView.cardAdapter;
                if (qhx0Var != null) {
                    qhx0Var.submitList(list3, new uqs(16, tariffOptionsCardView, (uix0) this.c));
                }
                return zy11.a;
        }
    }

    @Override // defpackage.al7
    public void onFailure(yf7 yf7Var, IOException iOException) {
        if (yf7Var.n()) {
            return;
        }
        ((j18) this.c).resumeWith(new Result.Failure(iOException));
    }

    @Override // defpackage.al7
    public void onResponse(yf7 yf7Var, kvj0 kvj0Var) {
        ((j18) this.c).resumeWith(kvj0Var);
    }
}
