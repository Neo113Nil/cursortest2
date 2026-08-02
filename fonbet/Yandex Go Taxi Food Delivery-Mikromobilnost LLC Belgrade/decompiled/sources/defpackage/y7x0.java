package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.view.e;
import androidx.camera.view.l;
import androidx.core.content.FileProvider;
import com.yandex.go.preorder.summary.tariff_details.analytics.TariffCardSource;
import com.yandex.go.taxi.order.infosharing.ui.TaxiOrderScreenshotSharingModalView;
import com.yandex.go.taxi.order.multi.feed.ui.TaxiOrderFeedScrollUpButton;
import com.yandex.go.taxi.order.multi.tracking.TaxiOrderTrackingView;
import com.yandex.go.taxi.order.superapp.orders.ui.b;
import com.yandex.go.taxi.order.ui.TaxiOrderTrackingBackButton;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.telemetry.ui.TelemetryReportModalView;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.VMInspector.Depends;
import ru.yandex.logistics.care.ui.h;
import ru.yandex.taxi.order.state.TaxiOnTheWayStateView;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.preorder.summary.tariffpage.TariffPagerView;
import ru.yandex.taxi.summary.topnotification.tariff_unavailable.ui.TariffUnavailableNotificationComponent;
import ru.yandex.taxi.surge.dialog.TextBlockView;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;
import ru.yandex.taxi.tariffs.model.a;
import ru.yandex.taxi.themes.TaxiThemeChangeInteractor$systemTimeChangedFlow$1$receiver$1;
import ru.yandex.taxi.themes.g;
import ru.yandex.video.m3.list_player_manager.impl.track.TrackManagerImpl;
import ru.yandex.video.m3.list_player_manager.impl.track.TrackVariant;
import ru.yandex.video.m3.ott.impl.TrackingManagerImpl;
import ru.yandex.video.m3.ott.ott.TrackSelectionManager;

/* loaded from: classes10.dex */
public final /* synthetic */ class y7x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y7x0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        lkx0 lkx0Var;
        sgx0 sgx0Var;
        hst hstVar;
        String str;
        a aVar;
        gfv0 gfv0Var;
        Object obj;
        ru.yandex.taxi.summary.topnotification.tariff_unavailable.presentation.a aVar2;
        udy0 udy0Var;
        switch (this.a) {
            case 0:
                ((z7x0) this.b).x.remove((n9j0) this.c);
                return;
            case 1:
                b8x0 b8x0Var = (b8x0) this.b;
                jdv jdvVar = (jdv) this.c;
                t8v d = b8x0Var.d();
                Objects.requireNonNull(d);
                Objects.requireNonNull(jdvVar);
                d.a(jdvVar);
                return;
            case 2:
                b8x0 b8x0Var2 = (b8x0) this.b;
                reu reuVar = (reu) this.c;
                u8v f = b8x0Var2.f();
                Objects.requireNonNull(f);
                Objects.requireNonNull(reuVar);
                f.k(reuVar);
                return;
            case 3:
                b8x0 b8x0Var3 = (b8x0) this.b;
                ImageCaptureException imageCaptureException = (ImageCaptureException) this.c;
                boolean z = b8x0Var3.d() != null;
                boolean z2 = b8x0Var3.f() != null;
                if (z && !z2) {
                    t8v d2 = b8x0Var3.d();
                    Objects.requireNonNull(d2);
                    d2.b();
                    return;
                } else {
                    if (!z2 || z) {
                        ny61.r("One and only one callback is allowed.");
                        return;
                    }
                    u8v f2 = b8x0Var3.f();
                    Objects.requireNonNull(f2);
                    f2.j(imageCaptureException);
                    return;
                }
            case 4:
                rkx0 rkx0Var = (rkx0) this.b;
                ikx0 ikx0Var = (ikx0) this.c;
                TariffPagerView tariffPagerView = rkx0Var.a;
                lkx0Var = tariffPagerView.presenter;
                nkx0 nkx0Var = (nkx0) lkx0Var.E.get();
                fva0 fva0Var = nkx0Var.d;
                c4r0 c4r0Var = nkx0Var.f;
                fva0.f(fva0Var, "TariffPagerPresenter.SelectTariff", PerformanceAnalytics$Type.Loading, 0L, 4);
                vex0 vex0Var = nkx0Var.e;
                kb5 kb5Var = ikx0Var.b;
                String str2 = kb5Var.a;
                fnx0 n = ((k) nkx0Var.b).n();
                if (str2.length() <= 0) {
                    String str3 = kb5Var.b;
                    wu1 wu1Var = kb5Var.c;
                    if (n == null || !jl40.l(n.c.b, str3)) {
                        mi31 d3 = b8r.d(nkx0Var.c, str3, str2, 4);
                        if (d3 == null) {
                            hstVar = jst.e;
                            str = "Try to select missing tariff";
                        } else {
                            pex0 pex0Var = d3.a;
                            if (wu1Var != null && !jl40.l(pex0Var.O, wu1Var)) {
                                pex0 b = pex0Var.b();
                                pex0Var = (b == null || (aVar = b.t0) == null) ? null : aVar.a(wu1Var);
                            }
                            if (pex0Var == null) {
                                hstVar = jst.e;
                                str = "Try to select missing tariff alternative";
                            } else {
                                sgx0Var = pex0Var.J0;
                                vex0Var.a = TariffCardSource.SOURCE_SWIPE_FROM_OTHER_CARD;
                                c4r0.g(c4r0Var, SelectionOrigin.USER, sgx0Var, str2, 8);
                                fva0.b(nkx0Var.d, "TariffPagerPresenter.SelectTariff", PerformanceAnalytics$Type.Loading, null, 4);
                                if (sgx0Var != null) {
                                }
                            }
                        }
                        g8e.A(hstVar, str);
                    }
                } else if (n == null || !jl40.l(n.d, str2)) {
                    Iterator it = ((k) nkx0Var.a).j().a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (jl40.l(((za31) obj).d, str2)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    za31 za31Var = (za31) obj;
                    if (za31Var == null) {
                        hstVar = jst.e;
                        str = "Try to select missing vertical";
                        g8e.A(hstVar, str);
                    } else {
                        mi31 mi31Var = za31Var.c;
                        vex0Var.a = TariffCardSource.SOURCE_SWIPE_FROM_OTHER_CARD;
                        if (mi31Var != null) {
                            c4r0Var.a(new gnx0(new fnx0(mi31Var, SelectionOrigin.USER), true));
                            pex0 pex0Var2 = mi31Var.a;
                            if (pex0Var2 != null) {
                                sgx0Var = pex0Var2.J0;
                                fva0.b(nkx0Var.d, "TariffPagerPresenter.SelectTariff", PerformanceAnalytics$Type.Loading, null, 4);
                                if (sgx0Var != null) {
                                    gfv0Var = tariffPagerView.listener;
                                    gfv0Var.g(sgx0Var);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
                sgx0Var = null;
                fva0.b(nkx0Var.d, "TariffPagerPresenter.SelectTariff", PerformanceAnalytics$Type.Loading, null, 4);
                if (sgx0Var != null) {
                }
                break;
            case 5:
                ilx0 ilx0Var = (ilx0) this.b;
                mlx0 mlx0Var = (mlx0) this.c;
                llx0 llx0Var = ilx0Var.b;
                String str4 = mlx0Var.c;
                llx0Var.a.a.i(null, null, str4, null, null);
                c4r0.e(llx0Var.c, SelectionOrigin.REDIRECT, str4, null, 12);
                return;
            case 6:
                TariffUnavailableNotificationComponent tariffUnavailableNotificationComponent = (TariffUnavailableNotificationComponent) this.b;
                String str5 = (String) this.c;
                aVar2 = tariffUnavailableNotificationComponent.presenter;
                ((a60) aVar2.z).c(str5, v770.C);
                return;
            case 7:
                ytx0 ytx0Var = (ytx0) this.b;
                String str6 = (String) this.c;
                dt8 dt8Var = ytx0Var.b.b.b;
                h hVar = ytx0Var.a;
                hVar.c.k(new rq8(str6));
                hVar.a.A.getClass();
                return;
            case 8:
                ytx0 ytx0Var2 = (ytx0) this.b;
                fc41 fc41Var = (fc41) this.c;
                dt8 dt8Var2 = ytx0Var2.b.b.b;
                ytx0Var2.a.d(fc41Var);
                return;
            case 9:
                ytx0 ytx0Var3 = (ytx0) this.b;
                a970 a970Var = (a970) this.c;
                ct8 ct8Var = ytx0Var3.b;
                a970Var.toString();
                dt8 dt8Var3 = ct8Var.b.b;
                h hVar2 = ytx0Var3.a;
                String str7 = a970Var.a;
                Context context = hVar2.a.x.a;
                Uri parse = Uri.parse(str7);
                if (parse == null) {
                    Log.e("ExternalRouter", "Failed to parse URI: ".concat(str7));
                    return;
                }
                try {
                    try {
                        new slf().a().a(context, parse);
                        return;
                    } catch (Exception unused) {
                        context.startActivity(new Intent("android.intent.action.VIEW", parse));
                        return;
                    }
                } catch (ActivityNotFoundException unused2) {
                    Log.e("ExternalRouter", "No application available to open URI: ".concat(str7));
                    return;
                }
            case 10:
                TaxiOnTheWayStateView.setupCancelButton$lambda$0((a5j) this.b, (TaxiOnTheWayStateView) this.c);
                return;
            case 11:
                ((com.yandex.go.taxi.order.chat.domain.a) this.b).c((String) this.c).t = EmptyList.a;
                return;
            case 12:
                TaxiOrderFeedScrollUpButton.addOnClickListener$lambda$0((TaxiOrderFeedScrollUpButton) this.b, (sls) this.c);
                return;
            case 13:
                TaxiOrderScreenshotSharingModalView.renderUiState$lambda$0$0((TaxiOrderScreenshotSharingModalView) this.b, (w5y0) this.c);
                return;
            case 14:
                TaxiOrderTrackingView.backNavigationButton_delegate$lambda$0$0$0((TaxiOrderTrackingView) this.b, (TaxiOrderTrackingBackButton) this.c);
                return;
            case 15:
                ((TextView) this.b).announceForAccessibility((String) this.c);
                return;
            case 16:
                ((b) this.b).k0.accept((n6y0) this.c);
                return;
            case 17:
                ((g) this.b).a.unregisterReceiver((TaxiThemeChangeInteractor$systemTimeChangedFlow$1$receiver$1) this.c);
                return;
            case 18:
                TelemetryReportModalView telemetryReportModalView = (TelemetryReportModalView) this.b;
                ydy0 ydy0Var = (ydy0) this.c;
                udy0Var = telemetryReportModalView.presenter;
                String str8 = ((xdy0) ydy0Var).a;
                Context context2 = udy0Var.A;
                String o = g8e.o("telemetry_report ", new SimpleDateFormat("yyyy-MM-dd 'at' HH.mm.ss", Locale.getDefault()).format(new Date()));
                Context context3 = udy0Var.A;
                if (!new File(context3.getCacheDir(), "telemetry_report").exists()) {
                    new File(context3.getCacheDir(), "telemetry_report").mkdirs();
                }
                File file = new File(new File(context3.getCacheDir(), "telemetry_report"), o.concat(Depends.TEXT_EXT));
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(str8.getBytes(uza.a));
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/*");
                    intent.putExtra("android.intent.extra.STREAM", FileProvider.getUriForFile(context2, "ru.yandex.taxi.utils.fileprovider." + context2.getPackageName(), file));
                    context2.startActivity(Intent.createChooser(intent, context2.getString(jyh0.telemetry_report_share_chooser_title)));
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ooc.g(fileOutputStream, th);
                        throw th2;
                    }
                }
            case 19:
                TextBlockView.renderSelectorTrail$lambda$0$0$0((TextBlockView) this.b, (nky0) this.c);
                return;
            case 20:
                TextBlockView.renderTextTrail$lambda$0$0((oky0) this.b, (TextBlockView) this.c);
                return;
            case 21:
                l lVar = (l) this.b;
                znw0 znw0Var = (znw0) this.c;
                znw0 znw0Var2 = lVar.h;
                if (znw0Var2 != null && znw0Var2 == znw0Var) {
                    lVar.h = null;
                    lVar.g = null;
                }
                e eVar = lVar.l;
                if (eVar != null) {
                    eVar.a();
                    lVar.l = null;
                    return;
                }
                return;
            case 22:
                gj5 gj5Var = (gj5) this.b;
                tls tlsVar = (tls) this.c;
                xyy0 xyy0Var = (xyy0) gj5Var.W;
                if (xyy0Var != null) {
                    tlsVar.invoke(xyy0Var.b);
                    return;
                }
                return;
            case 23:
                dhv dhvVar = (dhv) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                try {
                    dhvVar.run();
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 24:
                zgz0 zgz0Var = (zgz0) this.b;
                com.ybsdk.widgets.tooltip.a aVar3 = (com.ybsdk.widgets.tooltip.a) this.c;
                zgz0Var.invoke();
                aVar3.y = null;
                return;
            case 25:
                ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b;
                com.ybsdk.widgets.tooltip.a aVar4 = (com.ybsdk.widgets.tooltip.a) this.c;
                viewPropertyAnimator.start();
                aVar4.h.invoke();
                return;
            case 26:
                TrackManagerImpl.notifyCurrentTrackChanged$lambda$4$lambda$3((TrackManagerImpl) this.b, (TrackVariant) this.c);
                return;
            case 27:
                TrackSelectionManager.PlayerObserverImpl.delayTask$lambda$1((sls) this.b, (TrackSelectionManager.PlayerObserverImpl) this.c);
                return;
            case 28:
                TrackingManagerImpl.startScheduledWorkContentDurations$lambda$9$lambda$8((TrackingManagerImpl) this.b, (Pair) this.c);
                return;
            default:
                TrackingManagerImpl.startScheduledWorkHeartbeat30$lambda$6((TrackingManagerImpl) this.b, (AtomicLong) this.c);
                return;
        }
    }
}
