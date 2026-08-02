package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.concurrent.futures.b;
import com.google.android.flexbox.FlexboxLayout;
import com.yandex.go.account.api.family.SharedPaymentContext;
import com.yandex.go.mainscreen.superapp.impl.header.presentation.logo.HeaderLogoView;
import com.yandex.go.navigator.gas_stations.filters.GasStationsFiltersModalView;
import com.yandex.go.navigator.gas_stations.overview.GasStationsOverviewView;
import com.yandex.go.shortcuts.impl.view.adapter.g;
import com.yandex.go.taxi.order.comment.FeedbackCommentModalView;
import com.yandex.go.taxi.order.feedback.ui.FeedbackQuestionView;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.footer.HubFooterView;
import com.yandex.messaging.internal.entities.feedback.CallFeedbackReason;
import com.yandex.messaging.internal.entities.feedback.FeedbackReasonsData;
import com.yandex.messaging.internal.net.file.FileProgressObservable$Listener$Status;
import com.ybsdk.core.analytics.performance.FirstDrawListener$drawListener$1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.a;
import ru.yandex.taxi.banners.presentation.fullscreen.FullScreenBannerModalView;
import ru.yandex.taxi.banners.presentation.fullscreen.FullScreenBannerPage;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.order.view.HorizontalButtonsView;
import ru.yandex.taxi.requirements.ui.ExpandingView;
import ru.yandex.taxi.sharedpayments.c;

/* loaded from: classes15.dex */
public final /* synthetic */ class qpo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qpo(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        rus rusVar;
        int i = this.a;
        int i2 = 9;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ExpandingView.bind$lambda$0$2((yot0) obj2, (zot0) obj);
                break;
            case 1:
                ((c) ((h3y) ((qw1) obj2).e).get()).b(((snr0) obj).a, SharedPaymentContext.ORDER);
                break;
            case 2:
                ((n1c) obj2).onPickedAddress(((o2x) obj).d);
                break;
            case 3:
                FeedbackCommentModalView.lambda$0$0((FeedbackCommentModalView) obj2, (hsq) obj);
                break;
            case 4:
                FeedbackCommentModalView.lambda$0$1$0((FeedbackCommentModalView) obj2, (bsq) obj);
                break;
            case 5:
                ((FeedbackQuestionView) obj2).onAnswerConfirm((ButtonComponent) obj);
                break;
            case 6:
                FeedbackReasonsData feedbackReasonsData = (FeedbackReasonsData) obj;
                gym gymVar = (gym) ((v1b) obj2).b;
                if (gymVar != null) {
                    euq euqVar = (euq) gymVar.a;
                    ArrayList arrayList = euqVar.y;
                    ArrayList arrayList2 = euqVar.C;
                    ArrayList arrayList3 = euqVar.z;
                    arrayList.clear();
                    arrayList.addAll(feedbackReasonsData.audioReasons);
                    arrayList3.clear();
                    arrayList3.addAll(feedbackReasonsData.videoReasons);
                    if (euqVar.x) {
                        arrayList2.addAll(a.A0(arrayList, 3));
                        arrayList2.addAll(a.A0(arrayList3, 3));
                    } else {
                        arrayList2.addAll(a.A0(arrayList, 6));
                    }
                    FlexboxLayout flexboxLayout = euqVar.w;
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        CallFeedbackReason callFeedbackReason = (CallFeedbackReason) it.next();
                        Activity activity = euqVar.a;
                        TextView textView = new TextView(new ContextThemeWrapper(activity, w0i0.Messaging_Calls_FeedbackCommonReason));
                        FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(-2, -2);
                        int i3 = (int) (6.0f * activity.getResources().getDisplayMetrics().density);
                        layoutParams.setMargins(i3, i3, i3, i3);
                        textView.setLayoutParams(layoutParams);
                        textView.setText(callFeedbackReason.description);
                        textView.setOnClickListener(new vsn(7, euqVar, callFeedbackReason));
                        flexboxLayout.addView(textView);
                        euqVar.D.put(callFeedbackReason, textView);
                    }
                    flexboxLayout.addView(euqVar.E);
                    break;
                }
                break;
            case 7:
                z0r z0rVar = (z0r) obj2;
                String str = (String) obj;
                a1r a1rVar = z0rVar.x;
                z83.g(null, a1rVar.e, Looper.myLooper());
                w53 w53Var = a1rVar.a;
                zq60 zq60Var = (zq60) w53Var.get(str);
                if (zq60Var == null) {
                    zq60Var = new zq60();
                    w53Var.put(str, zq60Var);
                }
                zq60Var.b(z0rVar);
                Exception exc = (Exception) a1rVar.c.get(str);
                x0r x0rVar = (x0r) a1rVar.b.get(str);
                if (exc == null) {
                    if (x0rVar == null) {
                        if (!a1rVar.f.a(str)) {
                            z0rVar.a(FileProgressObservable$Listener$Status.UNKNOWN);
                            break;
                        } else {
                            z0rVar.a(FileProgressObservable$Listener$Status.FINISHED);
                            break;
                        }
                    } else {
                        long j = x0rVar.a;
                        if (j >= 0) {
                            long j2 = x0rVar.b;
                            if (j2 >= 0) {
                                z0rVar.c.post(new y0r(z0rVar, j, j2));
                                break;
                            }
                        }
                        z0rVar.a(FileProgressObservable$Listener$Status.STARTED);
                        break;
                    }
                } else {
                    z0rVar.a(FileProgressObservable$Listener$Status.ERROR);
                    break;
                }
            case 8:
                FileProgressObservable$Listener$Status fileProgressObservable$Listener$Status = (FileProgressObservable$Listener$Status) obj;
                w0r w0rVar = ((z0r) obj2).w;
                if (w0rVar != null) {
                    w0rVar.q(fileProgressObservable$Listener$Status);
                    break;
                }
                break;
            case 9:
                t2r t2rVar = (t2r) obj2;
                Handler handler = t2rVar.g;
                q2r q2rVar = (q2r) obj;
                g2r g2rVar = q2rVar.a;
                try {
                    handler.post(new qpo(10, q2rVar, t2rVar.d.a(g2rVar.a(), g2rVar.b(), EmptySet.a)));
                    break;
                } catch (IOException e) {
                    handler.post(new qpo(11, q2rVar, e));
                    return;
                }
            case 10:
                q2r q2rVar2 = (q2r) obj2;
                izq izqVar = (izq) obj;
                t2r t2rVar2 = q2rVar2.z;
                z83.g(null, t2rVar2.c, Looper.myLooper());
                q2rVar2.x = izqVar;
                if (!q2rVar2.c) {
                    x08 x08Var = (x08) q2rVar2.a.c(new jdj(25, t2rVar2, q2rVar2, izqVar));
                    op3 op3Var = q2rVar2.w;
                    kgx kgxVar = q2r.A[0];
                    op3Var.b(x08Var);
                    break;
                }
                break;
            case 11:
                q2r q2rVar3 = (q2r) obj2;
                IOException iOException = (IOException) obj;
                zq60 zq60Var2 = q2rVar3.b;
                t2r t2rVar3 = q2rVar3.z;
                z83.g(null, t2rVar3.c, Looper.myLooper());
                if (ydz.a.a()) {
                    String message = iOException.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    ydz.c("FileUploader", message, iOException);
                }
                String key = q2rVar3.a.getKey();
                if (key != null) {
                    t2rVar3.e.a(key, iOException);
                }
                zq60Var2.getClass();
                ArrayList arrayList4 = zq60Var2.a;
                zq60Var2.b++;
                int size = arrayList4.size();
                int i4 = 0;
                boolean z2 = false;
                while (true) {
                    int i5 = i4;
                    while (i5 < size && arrayList4.get(i5) == null) {
                        i5++;
                    }
                    if (i5 < size) {
                        z = true;
                    } else {
                        if (!z2) {
                            zq60.a(zq60Var2);
                            z2 = true;
                        }
                        z = false;
                    }
                    if (!z) {
                        zq60Var2.clear();
                        q2rVar3.a();
                        break;
                    } else {
                        while (i4 < size && arrayList4.get(i4) == null) {
                            i4++;
                        }
                        if (i4 >= size) {
                            if (!z2) {
                                zq60.a(zq60Var2);
                            }
                            ny61.p();
                            break;
                        } else {
                            ((o2r) arrayList4.get(i4)).b(new j2r());
                            i4++;
                        }
                    }
                }
            case 12:
                FirstDrawListener$drawListener$1.onDraw$lambda$1((adr) obj2, (FirstDrawListener$drawListener$1) obj);
                break;
            case 13:
                fkr fkrVar = (fkr) obj2;
                cgl0 cgl0Var = (cgl0) obj;
                if (fkrVar.u()) {
                    fkrVar.r(new qu(i2));
                }
                cgl0Var.invoke();
                break;
            case 14:
                FullScreenBannerModalView.setupPlayer$lambda$1((FullScreenBannerModalView) obj2, (adv) obj);
                break;
            case 15:
                FullScreenBannerPage.setData$lambda$2$0((FullScreenBannerPage) obj2, (BannerWidgets.f) obj);
                break;
            case 16:
                FullScreenBannerPage.setData$lambda$3((FullScreenBannerPage) obj2, (BannerWidgets.b) obj);
                break;
            case 17:
                ((b) obj2).b(null);
                ((gl7) obj).cancel(true);
                break;
            case 18:
                GasStationsFiltersModalView gasStationsFiltersModalView = (GasStationsFiltersModalView) obj;
                String str2 = !((zus) obj2).c ? "done" : "show_result";
                rusVar = gasStationsFiltersModalView.presenter;
                rusVar.Mg(str2);
                ((da0) rusVar.A.b).r(new qu(i2));
                break;
            case 19:
                GasStationsOverviewView.renderCardList$lambda$0((GasStationsOverviewView) obj2, (ovs) obj);
                break;
            case 20:
                ((r3z) obj2).b((com.yandex.messaging.internal.view.input.a) obj);
                break;
            case 21:
                ((lit) ((pit) obj2).g.b).openOrderPaymentMethods((o2y0) obj);
                break;
            case 22:
                WebView webView = (WebView) obj;
                ((com.yandex.go.platform.web_view_client.a) obj2).a.removeView(webView);
                webView.destroy();
                break;
            case 23:
                com.yandex.go.platform.web_view_client.a aVar = (com.yandex.go.platform.web_view_client.a) obj2;
                tt41 tt41Var = (tt41) obj;
                WebView webView2 = tt41Var.a;
                Set set = com.yandex.go.platform.web_view_client.a.o;
                aVar.d(webView2);
                aVar.k(tt41Var);
                break;
            case 24:
                HeaderLogoView.setLogoBitmap$lambda$0((HeaderLogoView) obj2, (Bitmap) obj);
                break;
            case 25:
                pcu pcuVar = (pcu) obj2;
                g gVar = (g) obj;
                if (pcuVar != null) {
                    gVar.b0.a(pcuVar);
                    break;
                }
                break;
            case 26:
                ((androidx.media3.exoplayer.hls.playlist.a) ((mnu) ((hou) obj2).c.a).b.w.get(((lnu) obj).F)).c(true);
                break;
            case 27:
                HorizontalButtonsView.renderRideSupportState$lambda$0((HorizontalButtonsView) obj2, (oqk0) obj);
                break;
            case 28:
                awu awuVar = (awu) obj2;
                meu meuVar = ((kvj0) obj).y;
                z83.g(null, awuVar.a.getLooper(), Looper.myLooper());
                if (!awuVar.D) {
                    awuVar.A.f(meuVar);
                    break;
                }
                break;
            default:
                HubFooterView.render$lambda$0((HubFooterView) obj2, (gyu) obj);
                break;
        }
    }
}
