package defpackage;

import android.R;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.Surface;
import android.widget.FrameLayout;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.video.i;
import androidx.camera.video.k;
import com.yandex.go.taxi.order.details.v1.elements.upsell.UpsellView;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.VerticalHubV1ModalView;
import com.yandex.go.transfer_requirement.mvp.TransferRequirementModalView;
import com.yandex.go.transfer_requirement.ui.date_selector.TransferDateSelectorView;
import com.yandex.go.trusted_contacts.ui.error.TrustedContactsErrorModalView;
import com.yandex.go.ui.UserPhotoUploadingModalView;
import com.yandex.messaging.core.net.entities.ContactsUploadParam;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import com.ybsdk.feature.transfer.internal.screens.targets.presentation.TransferTargetsFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneInputFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.b;
import ru.yandex.taxi.communications.model.widgets.ActionButton;
import ru.yandex.taxi.orderforanother.repository.a;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.video.m3.list_player_manager.impl.preload.VideoDataPreloadManagerImpl;
import ru.yandex.video.m3.player.impl.tracking.StalledState;
import ru.yandex.video.m3.player.impl.tracking.TrackingObserver;

/* loaded from: classes15.dex */
public final /* synthetic */ class t601 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t601(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ContextThemeWrapper contextThemeWrapper;
        ContextThemeWrapper contextThemeWrapper2;
        op01 op01Var;
        ContextThemeWrapper contextThemeWrapper3;
        boolean z;
        switch (this.a) {
            case 0:
                TrackingObserver.startStalled$lambda$53$lambda$52((TrackingObserver) this.b, (StalledState) this.c);
                return;
            case 1:
                Runnable runnable = (Runnable) this.b;
                dsq0 dsq0Var = (dsq0) this.c;
                try {
                    runnable.run();
                    return;
                } finally {
                    dsq0Var.a();
                }
            case 2:
                TransferDateSelectorView.setSelectorItems$lambda$0((List) this.b, (TransferDateSelectorView) this.c);
                return;
            case 3:
                kcz0 kcz0Var = (kcz0) this.b;
                jl01 jl01Var = (jl01) this.c;
                pv70 g = ((a) kcz0Var.a).g();
                jl01Var.invoke(g != null ? g.a() : null);
                return;
            case 4:
                TransferPhoneInputFragment.render$lambda$22((on01) this.b, (TransferPhoneInputFragment) this.c);
                return;
            case 5:
                TransferRequirementModalView.setupListeners$lambda$0$1((kp01) this.b, (TransferRequirementModalView) this.c);
                return;
            case 6:
                TransferRequirementModalView transferRequirementModalView = (TransferRequirementModalView) this.b;
                tzz tzzVar = (tzz) this.c;
                contextThemeWrapper = transferRequirementModalView.contextWrapper;
                int u = qje.u(contextThemeWrapper.getTheme(), xng0.controlMain);
                contextThemeWrapper2 = transferRequirementModalView.contextWrapper;
                int u2 = qje.u(contextThemeWrapper2.getTheme(), xng0.textOnControl);
                String format = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(u)}, 1));
                String format2 = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(u2)}, 1));
                op01Var = transferRequirementModalView.presenter;
                contextThemeWrapper3 = transferRequirementModalView.contextWrapper;
                op01Var.getClass();
                CharSequence charSequence = tzzVar.a;
                CharSequence charSequence2 = tzzVar.b;
                CharSequence charSequence3 = tzzVar.c;
                if ((charSequence == null || charSequence.length() == 0) && ((charSequence2 == null || charSequence2.length() == 0) && (charSequence3 == null || charSequence3.length() == 0))) {
                    return;
                }
                CharSequence charSequence4 = tzzVar.a;
                String obj = charSequence4 != null ? charSequence4.toString() : null;
                if (obj == null) {
                    obj = "";
                }
                b bVar = FormattedText.Companion;
                String obj2 = charSequence2 != null ? charSequence2.toString() : null;
                ((uu) op01Var.C).a(new ActionButton.h(obj, bVar.c(obj2 != null ? obj2 : ""), new ActionButton.e((charSequence3 == null || charSequence3.length() == 0) ? contextThemeWrapper3.getString(R.string.ok) : charSequence3.toString(), format, format2), 4));
                return;
            case 7:
                TransferTargetsFragment.render$lambda$13$lambda$11$lambda$10((au01) this.b, (TransferTargetsFragment) this.c);
                return;
            case 8:
                com.yandex.payment.sdk.transportcards.nfc.a aVar = (com.yandex.payment.sdk.transportcards.nfc.a) this.b;
                jgr jgrVar = (jgr) this.c;
                aVar.h = null;
                jgrVar.c.invoke();
                return;
            case 9:
                TrustedContactsErrorModalView.renderScreen$lambda$0$2$0((TrustedContactsErrorModalView) this.b, (wg11) this.c);
                return;
            case 10:
                aq11 aq11Var = (aq11) this.b;
                String str = (String) this.c;
                z83.g(null, aq11Var.d.getLooper(), Looper.myLooper());
                aq11Var.b.remove(str);
                aq11Var.a();
                return;
            case 11:
                pw11 pw11Var = (pw11) this.b;
                nd ndVar = (nd) this.c;
                pw11Var.d.b.a("positive");
                ndVar.run();
                return;
            case 12:
                ((t221) this.b).b.invoke((w221) this.c);
                return;
            case 13:
                ((t221) this.b).a.invoke((CancellationException) this.c);
                return;
            case 14:
                gd21 gd21Var = (gd21) this.b;
                if (((bd21) this.c).b) {
                    gd21Var.b(5, 6);
                    return;
                } else {
                    gd21Var.b(5, 7);
                    return;
                }
            case 15:
                gd21 gd21Var2 = (gd21) this.b;
                Pair pair = ((ed21) this.c).b;
                if (gd21Var2.n.get() || pair == null) {
                    gd21Var2.b(2, 7);
                    return;
                }
                ContactsUploadParam.Record[] recordArr = (ContactsUploadParam.Record[]) pair.getFirst();
                String[] strArr = (String[]) pair.getSecond();
                gd21Var2.q = recordArr.length + strArr.length;
                if (recordArr.length == 0 && strArr.length == 0) {
                    gd21Var2.b(2, 6);
                    return;
                } else if (!gd21Var2.k.a(tz10.A)) {
                    gd21Var2.b(2, 6);
                    return;
                } else {
                    if (gd21Var2.b(2, 4)) {
                        gd21Var2.d(recordArr, strArr, null);
                        return;
                    }
                    return;
                }
            case 16:
                UpsellView.render$lambda$0$0((UpsellView) this.b, (b8j) this.c);
                return;
            case 17:
                UrbanAdsBottomSheetFragment.onViewCreated$lambda$5((UrbanAdsBottomSheetFragment) this.b, (FrameLayout) this.c);
                return;
            case 18:
                el21 el21Var = (el21) this.b;
                sk7 sk7Var = (sk7) this.c;
                zq60 zq60Var = el21Var.d;
                z83.g(null, el21Var.b.getLooper(), Looper.myLooper());
                el21Var.e = sk7Var;
                d9g d9gVar = el21Var.f;
                if (d9gVar != null) {
                    if (((String) sk7Var.b).equals(d9gVar.a.a)) {
                        el21.a(el21Var.f, sk7Var);
                        return;
                    } else {
                        ny61.r("Check failed.");
                        return;
                    }
                }
                el21Var.f = el21Var.b(sk7Var);
                zq60Var.getClass();
                ArrayList arrayList = zq60Var.a;
                zq60Var.b++;
                int size = arrayList.size();
                int i = 0;
                boolean z2 = false;
                while (true) {
                    int i2 = i;
                    while (i2 < size && arrayList.get(i2) == null) {
                        i2++;
                    }
                    if (i2 < size) {
                        z = true;
                    } else {
                        if (!z2) {
                            zq60.a(zq60Var);
                            z2 = true;
                        }
                        z = false;
                    }
                    if (!z) {
                        zq60Var.clear();
                        return;
                    }
                    while (i < size && arrayList.get(i) == null) {
                        i++;
                    }
                    if (i >= size) {
                        if (!z2) {
                            zq60.a(zq60Var);
                        }
                        ny61.p();
                        return;
                    }
                    ((dl21) arrayList.get(i)).e(el21Var.f);
                    i++;
                }
            case 19:
                UserPhotoUploadingModalView.setTextAnimated$lambda$0((RobotoTextView) this.b, (CharSequence) this.c);
                return;
            case 20:
                VerticalHubV1ModalView.renderHubItems$lambda$1((VerticalHubV1ModalView) this.b, (sls) this.c);
                return;
            case 21:
                VerticalHubV1ModalView.renderErrorState$lambda$0((VerticalHubV1ModalView) this.b, (z9o) this.c);
                return;
            case 22:
                i iVar = (i) this.b;
                if (((DeferrableSurface) this.c) == iVar.q) {
                    iVar.K();
                    return;
                }
                return;
            case 23:
                zk31 zk31Var = (zk31) this.b;
                dyq0 dyq0Var = (dyq0) this.c;
                dyq0Var.b.e.remove(zk31Var);
                dyq0Var.e.remove(zk31Var);
                return;
            case 24:
                VideoDataPreloadManagerImpl.startPreload$lambda$4((ArrayList) this.b, (VideoDataPreloadManagerImpl) this.c);
                return;
            case 25:
                ((k) this.b).h.a((Surface) this.c);
                return;
            case 26:
                ((VideoFileRenderer) this.b).lambda$onFrame$0((VideoFrame) this.c);
                return;
            case 27:
                ((VideoFileRenderer) this.b).lambda$release$2((CountDownLatch) this.c);
                return;
            case 28:
                a201 a201Var = (a201) this.b;
                do31 do31Var = (do31) this.c;
                co31 co31Var = (co31) a201Var.c;
                int i3 = tw21.a;
                co31Var.onVideoSizeChanged(do31Var);
                return;
            default:
                a201 a201Var2 = (a201) this.b;
                Exception exc = (Exception) this.c;
                co31 co31Var2 = (co31) a201Var2.c;
                int i4 = tw21.a;
                co31Var2.onVideoCodecError(exc);
                return;
        }
    }
}
