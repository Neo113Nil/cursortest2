package defpackage;

import android.view.Surface;
import android.view.View;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.camera.video.internal.BufferProvider$State;
import androidx.camera.video.internal.encoder.j;
import androidx.emoji2.emojipicker.EmojiView;
import androidx.media3.exoplayer.f;
import androidx.media3.exoplayer.offline.DownloadRequest;
import androidx.media3.exoplayer.offline.DownloadService;
import androidx.media3.exoplayer.offline.b;
import com.yandex.go.due.api.analytics.model.DueAnalyticViewType;
import com.yandex.go.due_timetable.presentation.DueTimetableModalView;
import com.yandex.go.navigator.driving.DrivingModalView;
import com.yandex.go.navigator.driving.DrivingModeNotification;
import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.details.DiscountsPromoCodeDetailsModalView;
import com.yandex.go.settings.email.EmailRequireExperiment;
import com.yandex.go.settings.email.EmailRequiredModalView;
import com.yandex.go.taxi.order.driver.profile.view.profile.DriverProfileModalView;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.trusted_contacts.share_settings.edit.EditContactNameModalView;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import com.ybsdk.feature.transactions.impl.ui.screens.transaction.divkit.DivTransactionInfoFragment;
import com.ybsdk.screens.divbottomsheet.DivBottomSheetView;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglRenderer;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.due_selector.impl.presentation.ui.DueSelectorView;
import ru.yandex.taxi.due_selector.impl.presentation.ui.a;
import ru.yandex.video.m3.offline.ExoDownloadActionHelper;
import ru.yandex.video.m3.offline.ExoDownloadManager$prepareTrackVariants$1;

/* loaded from: classes12.dex */
public final /* synthetic */ class wqj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wqj(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rxm rxmVar;
        a aVar;
        rxm rxmVar2;
        a aVar2;
        rxm rxmVar3;
        kxm kxmVar;
        long j;
        boolean z;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                DiscountsPromoCodeDetailsModalView.bindAdditionalButton$lambda$0((DiscountsPromoCodeDetailsModalView) this.b, (irj) this.c);
                break;
            case 1:
                ((yrj) this.b).P.invoke(((iqj) this.c).c);
                break;
            case 2:
                oyj oyjVar = (oyj) this.b;
                if (oyjVar.d.offer((Runnable) this.c)) {
                    oyjVar.a();
                    break;
                } else {
                    ny61.r("cannot enqueue any more runnables");
                    break;
                }
            case 3:
                ((DivBottomSheetView) this.b).setAccessibilityFocus((phk) this.c);
                break;
            case 4:
                DivTransactionInfoFragment.render$lambda$1$lambda$0((qjl) this.b, (w661) this.c);
                break;
            case 5:
                b bVar = (b) this.b;
                IOException iOException = (IOException) this.c;
                ExoDownloadManager$prepareTrackVariants$1.AnonymousClass1 anonymousClass1 = bVar.g;
                anonymousClass1.getClass();
                anonymousClass1.onPrepareError(bVar, iOException);
                break;
            case 6:
                ((ExoDownloadManager$prepareTrackVariants$1.AnonymousClass1) this.c).onPrepared((b) this.b);
                break;
            case 7:
                ((DownloadService) this.c).notifyDownloads(((p7m) this.b).b.m);
                break;
            case 8:
                eim eimVar = (eim) this.b;
                sls slsVar = (sls) this.c;
                View view = (View) eimVar.d.get();
                if (view != null) {
                    if (view.hasTransientState()) {
                        view.postDelayed(new h60(25, slsVar), 200L);
                        break;
                    } else {
                        slsVar.invoke();
                        break;
                    }
                }
                break;
            case 9:
                DriverProfileModalView.setupFullNameComponent$lambda$0$0((DriverProfileModalView) this.b, (String) this.c);
                break;
            case 10:
                DrivingModalView.renderHorizontalButtons$lambda$0$1$1((DrivingModalView) this.b, (dme) this.c);
                break;
            case 11:
                DrivingModalView drivingModalView = (DrivingModalView) this.b;
                drivingModalView.setControlsBottomMargin(tje.u(8, drivingModalView.getContext()) + ((DrivingModeNotification) this.c).getHeight());
                break;
            case 12:
                ((DualSurfaceProcessor) this.b).lambda$onInputSurface$1((znw0) this.c);
                break;
            case 13:
                ((DualSurfaceProcessor) this.b).lambda$onOutputSurface$3((qnw0) this.c);
                break;
            case 14:
                xvm xvmVar = (xvm) this.b;
                DueSelectorView dueSelectorView = (DueSelectorView) this.c;
                int i = eym.a[xvmVar.a.ordinal()];
                int i2 = 9;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                jst.e.x(new IllegalStateException("Unprocessed state!"), "Unprocessed state in due selector");
                                kxmVar = dueSelectorView.backPressedDelegate;
                                kxmVar.a(dueSelectorView);
                                break;
                            } else {
                                rxmVar3 = dueSelectorView.presenter;
                                ((kk5) rxmVar3.x.a).r(new qu(i2));
                                break;
                            }
                        } else {
                            aVar2 = dueSelectorView.currentState;
                            if (aVar2 != null) {
                                aVar2.retryButtonClicked();
                                break;
                            }
                        }
                    } else {
                        aVar = dueSelectorView.currentState;
                        if (aVar != null) {
                            aVar.doneButtonClicked();
                        }
                        rxmVar2 = dueSelectorView.presenter;
                        ((kk5) rxmVar2.x.a).r(new qu(i2));
                        break;
                    }
                } else {
                    rxmVar = dueSelectorView.presenter;
                    dvm dvmVar = rxmVar.z;
                    DueAnalyticViewType dueAnalyticViewType = DueAnalyticViewType.DEFAULT;
                    x770 x770Var = dvmVar.b;
                    String value = dueAnalyticViewType.getValue();
                    pex0 m = ((k) dvmVar.a).m();
                    String str = m != null ? m.b : null;
                    HashMap hashMap = new HashMap();
                    if (str != null) {
                        hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str);
                    }
                    x770Var.a.a("Preorder.DropToOnDemandButtonTapped", hashMap, 1, x4e.q(hashMap, "action", "select_time", "view_type", value));
                    v920 v920Var = rxmVar.y;
                    ((y1s) v920Var.c).b(true);
                    ((axm) v920Var.w).a(msb1.F);
                    ((kk5) rxmVar.x.a).r(new qu(i2));
                    break;
                }
                break;
            case 15:
                DueTimetableModalView._init_$lambda$2((ButtonComponent) this.b, (DueTimetableModalView) this.c);
                break;
            case 16:
                EditContactNameModalView.onAttachedToWindow$lambda$0$1((EditContactNameModalView) this.b, (mln) this.c);
                break;
            case 17:
                ((EglRenderer) this.b).lambda$releaseEglSurface$3((Runnable) this.c);
                break;
            case 18:
                ((EglRenderer) this.b).lambda$release$0((CountDownLatch) this.c);
                break;
            case 19:
                EmailRequiredModalView._init_$lambda$1((gsn) this.b, (EmailRequireExperiment) this.c);
                break;
            case 20:
                ((ctn) this.b).a.a((Throwable) this.c);
                break;
            case 21:
                EmojiView._set_emoji_$lambda$3((CharSequence) this.b, (EmojiView) this.c);
                break;
            case 22:
                ((j) this.b).m.remove((androidx.concurrent.futures.b) this.c);
                break;
            case 23:
                ((j) this.b).n.remove((czn) this.c);
                break;
            case 24:
                ((dq60) ((Map.Entry) this.b).getKey()).a((BufferProvider$State) this.c);
                break;
            case 25:
                ((dq60) this.b).a((BufferProvider$State) this.c);
                break;
            case 26:
                fzn fznVar = (fzn) this.b;
                dq60 dq60Var = (dq60) this.c;
                LinkedHashMap linkedHashMap = fznVar.a;
                dq60Var.getClass();
                linkedHashMap.remove(dq60Var);
                break;
            case 27:
                ((tyn) this.b).a((Surface) this.c);
                break;
            case 28:
                ExoDownloadActionHelper.start$lambda$0((ExoDownloadActionHelper) this.b, (DownloadRequest) this.c);
                break;
            default:
                f fVar = (f) this.b;
                eoo eooVar = (eoo) this.c;
                int i3 = fVar.I - eooVar.c;
                fVar.I = i3;
                if (eooVar.d) {
                    fVar.J = eooVar.e;
                    fVar.K = true;
                }
                if (i3 == 0) {
                    a9z0 a9z0Var = eooVar.b.a;
                    if (!fVar.v0.a.q() && a9z0Var.q()) {
                        fVar.w0 = -1;
                        fVar.x0 = 0L;
                    }
                    if (!a9z0Var.q()) {
                        List asList = Arrays.asList(((kzc0) a9z0Var).h);
                        d6z.x(asList.size() == fVar.p.size());
                        for (int i4 = 0; i4 < asList.size(); i4++) {
                            ((aoo) fVar.p.get(i4)).c = (a9z0) asList.get(i4);
                        }
                    }
                    long j2 = -9223372036854775807L;
                    if (fVar.K) {
                        if (eooVar.b.b.equals(fVar.v0.b) && eooVar.b.d == fVar.v0.s) {
                            z2 = false;
                        }
                        if (z2) {
                            if (a9z0Var.q() || eooVar.b.b.b()) {
                                j2 = eooVar.b.d;
                            } else {
                                jxc0 jxc0Var = eooVar.b;
                                sf10 sf10Var = jxc0Var.b;
                                long j3 = jxc0Var.d;
                                Object obj = sf10Var.a;
                                y8z0 y8z0Var = fVar.o;
                                a9z0Var.h(obj, y8z0Var);
                                j2 = j3 + y8z0Var.e;
                            }
                        }
                        j = j2;
                        z = z2;
                    } else {
                        j = -9223372036854775807L;
                        z = false;
                    }
                    fVar.K = false;
                    fVar.D(eooVar.b, 1, z, fVar.J, j, -1, false);
                    break;
                }
                break;
        }
    }
}
