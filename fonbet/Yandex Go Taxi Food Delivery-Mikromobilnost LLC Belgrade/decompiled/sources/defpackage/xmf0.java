package defpackage;

import android.app.Application;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.view.View;
import androidx.camera.video.VideoOutput$SourceState;
import androidx.camera.video.g;
import androidx.camera.video.internal.encoder.j;
import com.google.android.datatransport.Priority;
import com.yandex.go.navigator.rate_route.RateRouteModalView;
import com.yandex.go.promocodes.referral.api.net.dto.ReferralCode;
import com.yandex.go.requirements.comment.summary.ui.v1.RequirementsCommentView;
import com.yandex.go.rida.mainscreen.router.e;
import com.yandex.go.taxi.order.details.v2.ui.view.item.timeline.RideCardTimelineBannerView;
import com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.RideCardModalView;
import com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.d;
import com.yandex.go.taxi.order.queue.presentation.QueueView;
import com.yandex.go.taxi.order.rate.RateView;
import com.yandex.go.taxi.order.robotaxi.ui.RobotaxiModalView;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.function.Consumer;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.carplates.experiments.CarPlateAppearanceExperiment;
import ru.yandex.taxi.design.RatingBarComponent;
import ru.yandex.taxi.multiorder.i;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.preorder.summary.requirements.options.wrapper.RequirementOptionsHeaderWrappedView;
import ru.yandex.taxi.requirements.modal.RequirementInfoModalView;
import ru.yandex.taxi.settings.presentation.settings.PushSettingsView;
import ru.yandex.taxi.settings.presentation.settings.a;

/* loaded from: classes6.dex */
public final /* synthetic */ class xmf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xmf0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar;
        p7i0 p7i0Var;
        ScheduledFuture scheduledFuture;
        j jVar;
        d dVar;
        com.yandex.go.taxi.order.details.v2.analytics.perf.a aVar2;
        switch (this.a) {
            case 0:
                ymf0 ymf0Var = (ymf0) this.b;
                ReferralCode referralCode = (ReferralCode) this.c;
                ymf0Var.A.c(referralCode.i, referralCode.b, true);
                break;
            case 1:
                ((svp0) this.b).b9(((vxf0) this.c).I);
                break;
            case 2:
                PushSettingsView pushSettingsView = (PushSettingsView) this.b;
                String str = ((z0g0) this.c).a;
                aVar = pushSettingsView.presenter;
                o4g0 o4g0Var = aVar.D;
                u8w u8wVar = aVar.A.b.a;
                u8wVar.getClass();
                u8wVar.a.a("PushSettings.Tapped", new HashMap(), 1, new HashMap());
                if (aVar.y.b.b()) {
                    wh9 wh9Var = aVar.B;
                    yh9 yh9Var = wh9Var.a;
                    xh9 xh9Var = new xh9(str, wh9Var.b.a.a(str));
                    r0 r0Var = yh9Var.a;
                    r0Var.getClass();
                    r0Var.m(null, xh9Var);
                    o4g0Var.getClass();
                    Intent addFlags = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS").addFlags(SelfTester_JCP.IMITA);
                    Application application = o4g0Var.a;
                    application.startActivity(addFlags.putExtra("android.provider.extra.APP_PACKAGE", application.getPackageName()).putExtra("android.provider.extra.CHANNEL_ID", str));
                    break;
                } else {
                    o4g0Var.a();
                    break;
                }
            case 3:
                QueueView.renderButton$lambda$0$0((QueueView) this.b, (xkg0) this.c);
                break;
            case 4:
                RateRouteModalView rateRouteModalView = (RateRouteModalView) this.b;
                cvq cvqVar = (cvq) this.c;
                p7i0Var = rateRouteModalView.presenter;
                String str2 = cvqVar.a;
                r0 r0Var2 = p7i0Var.J;
                r0Var2.m(null, cm21.a((cm21) r0Var2.getValue(), str2, EmptySet.a, null, 4));
                break;
            case 5:
                RateView.renderRideSupportState$lambda$0((RateView) this.b, (mqk0) this.c);
                break;
            case 6:
                RateView.renderCompleteButton$lambda$0((RateView) this.b, (c5j) this.c);
                break;
            case 7:
                RateView.showSupportChatButton$lambda$0((RateView) this.b, (xkw0) this.c);
                break;
            case 8:
                RateView.showDriver$lambda$1((RateView) this.b, (qim) this.c);
                break;
            case 9:
                RatingBarComponent.startSelectionAnimation$lambda$0((RatingBarComponent) this.b, (View) this.c);
                break;
            case 10:
                sai0 sai0Var = (sai0) this.b;
                List list = (List) this.c;
                rai0 rai0Var = sai0Var.b;
                if (rai0Var != null) {
                    rai0Var.B = list;
                    rai0Var.s();
                    break;
                }
                break;
            case 11:
                g gVar = (g) this.b;
                VideoOutput$SourceState videoOutput$SourceState = (VideoOutput$SourceState) this.c;
                VideoOutput$SourceState videoOutput$SourceState2 = gVar.b0;
                gVar.b0 = videoOutput$SourceState;
                if (videoOutput$SourceState2 != videoOutput$SourceState) {
                    Objects.toString(videoOutput$SourceState);
                    sgb1.g(3, "Recorder");
                    if (videoOutput$SourceState == VideoOutput$SourceState.INACTIVE) {
                        if (gVar.C == null) {
                            oii0 oii0Var = gVar.j0;
                            if (oii0Var != null) {
                                if (!oii0Var.d) {
                                    oii0Var.d = true;
                                    ScheduledFuture scheduledFuture2 = oii0Var.f;
                                    if (scheduledFuture2 != null) {
                                        scheduledFuture2.cancel(false);
                                        oii0Var.f = null;
                                    }
                                }
                                gVar.j0 = null;
                            }
                            gVar.v(false);
                            break;
                        } else {
                            gVar.d0 = true;
                            b84 b84Var = gVar.r;
                            if (b84Var != null && !b84Var.E) {
                                gVar.s(b84Var, 4, null);
                                break;
                            }
                        }
                    } else if (videoOutput$SourceState == VideoOutput$SourceState.ACTIVE_NON_STREAMING && (scheduledFuture = gVar.c0) != null && scheduledFuture.cancel(false) && (jVar = gVar.G) != null) {
                        g.r(jVar);
                        break;
                    }
                } else {
                    Objects.toString(videoOutput$SourceState);
                    sgb1.g(3, "Recorder");
                    break;
                }
                break;
            case 12:
                ((Executor) this.b).execute((Runnable) this.c);
                break;
            case 13:
                ((b84) this.b).C.accept((in31) this.c);
                break;
            case 14:
                h3j0 h3j0Var = (h3j0) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                try {
                    z811.a().d.a(h3j0Var.h.a.e(Priority.HIGHEST), 1);
                } catch (Exception unused) {
                }
                countDownLatch.countDown();
                break;
            case 15:
                RequirementInfoModalView.dismissInternal$lambda$0((Runnable) this.b, (RequirementInfoModalView) this.c);
                break;
            case 16:
                hjj0 hjj0Var = (hjj0) this.b;
                String str3 = (String) this.c;
                p370 p370Var = hjj0Var.y;
                xcv0 xcv0Var = (xcv0) p370Var.c;
                String str4 = ((dqe0) p370Var.w).a.V;
                String str5 = ((dqe0) p370Var.w).a.O.a;
                HashMap u = g8e.u("vertical_id", str4, "requirement", str3);
                if (str5 != null) {
                    u.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str5);
                }
                xcv0Var.a.a("Summary.Requirement.Details.Information.CardClosed", u, 1, new HashMap());
                break;
            case 17:
                ((iqj0) this.b).a((RequirementOptionsHeaderWrappedView) this.c);
                break;
            case 18:
                RequirementsCommentView.initDoneButton$lambda$0((RequirementsCommentView) this.b, (iqj0) this.c);
                break;
            case 19:
                ((vuj0) this.b).c((Typeface) this.c);
                break;
            case 20:
                try {
                    ((ba20) this.b).success(this.c);
                    break;
                } catch (IllegalStateException unused2) {
                    return;
                }
            case 21:
                da20 da20Var = (da20) this.b;
                Object obj = this.c;
                if (da20Var != null) {
                    da20Var.success(obj);
                    break;
                }
                break;
            case 22:
                i iVar = (i) this.b;
                b980 b980Var = (b980) this.c;
                DriveState driveState = b980Var.f;
                String str6 = b980Var.a;
                int i = j2k0.a[driveState.ordinal()];
                if (i == 1 || i == 2) {
                    q48 q48Var = b980Var.e;
                    String str7 = q48Var != null ? q48Var.d : null;
                    if (str7 == null) {
                        str7 = "";
                    }
                    if (q48Var != null && str7.length() != 0) {
                        a78 a78Var = q48Var.f;
                        if (a78Var == null) {
                            a78Var = z68.a(0, 0, t7s.b(str7));
                        }
                        Map map = a78Var.c;
                        boolean contains = q48Var.g.contains(CarPlateAppearanceExperiment.CarPlateUsage.STATE_BAR);
                        StringBuilder sb = new StringBuilder(Extension.COLON_SPACE);
                        for (String str8 : map.keySet()) {
                            w68 w68Var = (w68) map.get(str8);
                            if (!contains || w68Var == null || !w68Var.d) {
                                sb.append(str8);
                                sb.append((char) 8201);
                            }
                        }
                        str6 = str6 + ((Object) sb);
                    }
                }
                iVar.z = str6;
                iVar.f();
                break;
            case 23:
                ((e) this.b).R((rre0) this.c);
                break;
            case 24:
                RideCardModalView rideCardModalView = (RideCardModalView) this.b;
                qnk0 qnk0Var = (qnk0) this.c;
                dVar = rideCardModalView.shadowListener;
                if (dVar != null) {
                    dVar.b();
                }
                aVar2 = rideCardModalView.perfAnalyticsTracer;
                aVar2.e(qnk0Var.b, qnk0Var.a.size());
                break;
            case 25:
                ((RideCardTimelineBannerView) this.b).updateSelectedOption((rok0) this.c);
                break;
            case 26:
                ((Consumer) this.b).accept((Throwable) this.c);
                break;
            case 27:
                ((otk0) this.b).b.invoke((ntk0) this.c);
                break;
            case 28:
                RobotaxiModalView.createButton$lambda$0$0$0((RobotaxiModalView) this.b, (fvk0) this.c);
                break;
            default:
                super/*android.view.View*/.dispatchDraw((Canvas) this.c);
                break;
        }
    }
}
