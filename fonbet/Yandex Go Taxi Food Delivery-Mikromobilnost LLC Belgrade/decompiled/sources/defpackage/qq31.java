package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import androidx.fragment.app.Fragment;
import androidx.work.WorkInfo$State;
import com.yandex.messaging.core.net.entities.FileUploadResponseData;
import com.yandex.messaging.core.net.entities.YaDiskUploadedFileInfo;
import com.yandex.payment.sdk.ui.common.WebViewFragment;
import com.yandex.payment.sdk.ui.view.Card3DSWebView;
import com.yandex.plus.home.feature.webviews.internal.stories.WebStoriesView;
import com.yandex.quark.js.QuarkJsState;
import com.yandex.quark.js.implementation.webView.internal.c;
import com.ybsdk.common.InternalSdkState;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.screens.notice.presentation.TopupNoticeDeprecatedFragment;
import com.ybsdk.screens.notice.presentation.TopupNoticeFragment;
import com.ybsdk.widgets.common.Tooltip$DismissReason;
import com.ybsdk.widgets.common.WidgetWithButtonView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.YbCardIconView;
import defpackage.gx41;
import defpackage.px41;
import defpackage.r141;
import defpackage.tje;
import defpackage.v141;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Result;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;
import ru.yandex.taxi.logistics.sdk.webview.impl.ui.a;
import ru.yandex.taxi.web.deeplink.m;
import ru.yandex.taxi.zalogin.d;

/* loaded from: classes15.dex */
public final /* synthetic */ class qq31 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qq31(Fragment fragment, Fragment fragment2) {
        this.a = 26;
        this.b = fragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        if (r9 != null) goto L31;
     */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        WebResourceResponse webViewController_delegate$lambda$2$lambda$1;
        zy11 onCreateView$lambda$0;
        stz0 render$lambda$23$lambda$19;
        YbButtonView.a render$lambda$2$lambda$1;
        zy11 render$lambda$13$lambda$12$lambda$11;
        zy11 showTooltip$lambda$0;
        InternalSdkState internalSdkState;
        int i = this.a;
        int i2 = 14;
        int i3 = 9;
        int i4 = 2;
        int i5 = 21;
        int i6 = 1;
        boolean z = true;
        String str = null;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                WeakHashMap weakHashMap = b.a;
                ViewCompat$Api21Impl.o((View) obj, (bx60) obj2);
                return zy11Var;
            case 1:
                return new w50(22, (tcp0) obj2);
            case 2:
                sh3 sh3Var = (sh3) obj2;
                Uri uri = (Uri) obj;
                if (!jl40.l(sh3Var.d, uri)) {
                    sh3Var.d = uri;
                    sh3Var.e.invoke(uri);
                }
                return zy11Var;
            case 3:
                final r141 r141Var = (r141) obj2;
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).c = new g92(i4, zy11Var);
                agd agdVar = (agd) yfdVar;
                agdVar.e = new tls() { // from class: com.yandex.go.walking.navigation.impl.guidance.exit_options.b
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        r141 r141Var2 = r141.this;
                        tje.N(r141Var2.o(), null, null, new WalkNavGuidanceExitOptionsRouter$content$1$1$1(r141Var2, (v141) obj3, null), 3);
                        return zy11.a;
                    }
                };
                jfd.a.getClass();
                agdVar.g = jfd.b;
                return zy11Var;
            case 4:
                pbj pbjVar = (pbj) obj2;
                Throwable th = (Throwable) obj;
                ye0 ye0Var = (ye0) pbjVar.B;
                fa41 fa41Var = ye0Var instanceof fa41 ? (fa41) ye0Var : null;
                if (fa41Var != null) {
                    pbjVar.B = new da41(fa41Var.b, th);
                    tls tlsVar = (tls) pbjVar.a;
                    if (tlsVar != null) {
                        tlsVar.invoke(th);
                    }
                }
                return zy11Var;
            case 5:
                hlx0 hlx0Var = (hlx0) obj2;
                rv41 rv41Var = (rv41) hlx0Var.b;
                String str2 = (String) obj;
                hlx0Var.x = str2;
                zdb zdbVar = (zdb) hlx0Var.w;
                if (zdbVar != null) {
                    hlx0Var.w = null;
                    rv41Var.clearHistory();
                    zdbVar.invoke();
                }
                if (str2.equals("/")) {
                    rv41Var.clearHistory();
                }
                return zy11Var;
            case 6:
                ((g4d0) obj).i = new ec31(i2, (x2d0) obj2);
                return zy11Var;
            case 7:
                webViewController_delegate$lambda$2$lambda$1 = WebStoriesView.webViewController_delegate$lambda$2$lambda$1((WebStoriesView) obj2, (WebResourceRequest) obj);
                return webViewController_delegate$lambda$2$lambda$1;
            case 8:
                WebView webView = ((a) obj2).b;
                webView.setOnTouchListener(new cz2(15));
                return webView;
            case 9:
                qn41 qn41Var = (qn41) obj;
                Iterator it = adc.D(((swh) obj2).a, x3x.class).iterator();
                while (it.hasNext()) {
                    qn41Var.a((x3x) it.next());
                }
                return zy11Var;
            case 10:
                ((odf0) obj2).invoke(new x3x0(1, (tls) obj));
                return zy11Var;
            case 11:
                onCreateView$lambda$0 = WebViewFragment.onCreateView$lambda$0((WebViewFragment) obj2, (Card3DSWebView) obj);
                return onCreateView$lambda$0;
            case 12:
                render$lambda$23$lambda$19 = com.ybsdk.feature.webview.internal.presentation.WebViewFragment.render$lambda$23$lambda$19((ov41) obj2, (stz0) obj);
                return render$lambda$23$lambda$19;
            case 13:
                ((m) obj2).r(new qu(i3));
                return zy11Var;
            case 14:
                ((c) obj2).b.d(QuarkJsState.CONNECTED);
                return zy11Var;
            case 15:
                final px41 px41Var = (px41) obj2;
                yfd yfdVar2 = (yfd) obj;
                ((agd) yfdVar2).e = new tls() { // from class: com.yandex.go.masstransit.sdk.trains.impl.datepicker.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        px41 px41Var2 = px41.this;
                        tje.N(px41Var2.o(), null, null, new WheelDatePickerRouterImpl$content$1$1$1(px41Var2, (gx41) obj3, null), 3);
                        return zy11.a;
                    }
                };
                ofd.a.getClass();
                ((agd) yfdVar2).g = ofd.b;
                return zy11Var;
            case 16:
                ((ez41) obj2).invoke((pv0) obj);
                return zy11Var;
            case 17:
                render$lambda$2$lambda$1 = WidgetWithButtonView.render$lambda$2$lambda$1((r451) obj2, (YbButtonView.a) obj);
                return render$lambda$2$lambda$1;
            case 18:
                return new w50(23, (o851) obj2);
            case 19:
                ia51 ia51Var = (ia51) obj2;
                oll0 oll0Var = (oll0) obj;
                ull0 T0 = oll0Var.T0("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    T0.g1(1, "abandoned_cart_notification");
                    w53 w53Var = new w53();
                    w53 w53Var2 = new w53();
                    while (T0.q()) {
                        String Y1 = T0.Y1(0);
                        if (!w53Var.containsKey(Y1)) {
                            w53Var.put(Y1, new ArrayList());
                        }
                        String Y12 = T0.Y1(0);
                        if (!w53Var2.containsKey(Y12)) {
                            w53Var2.put(Y12, new ArrayList());
                        }
                    }
                    T0.reset();
                    ia51Var.b(oll0Var, w53Var);
                    ia51Var.a(oll0Var, w53Var2);
                    ArrayList arrayList = new ArrayList();
                    while (T0.q()) {
                        String Y13 = T0.Y1(0);
                        WorkInfo$State s = gtq0.s((int) T0.getLong(i6));
                        byte[] blob = T0.getBlob(2);
                        ong ongVar = ong.b;
                        arrayList.add(new ea51(Y13, s, bb1.l(blob), T0.getLong(14), T0.getLong(15), T0.getLong(16), new k8e(gtq0.U(T0.getBlob(6)), gtq0.q((int) T0.getLong(5)), ((int) T0.getLong(7)) != 0, ((int) T0.getLong(8)) != 0, ((int) T0.getLong(9)) != 0, ((int) T0.getLong(10)) != 0, T0.getLong(11), T0.getLong(12), gtq0.d(T0.getBlob(13))), (int) T0.getLong(3), gtq0.p((int) T0.getLong(17)), T0.getLong(18), T0.getLong(19), (int) T0.getLong(20), (int) T0.getLong(4), T0.getLong(i5), (int) T0.getLong(22), (List) kotlin.collections.b.g(T0.Y1(0), w53Var), (List) kotlin.collections.b.g(T0.Y1(0), w53Var2)));
                        i5 = 21;
                        i6 = 1;
                    }
                    T0.close();
                    return arrayList;
                } catch (Throwable th2) {
                    T0.close();
                    throw th2;
                }
            case 20:
                return ((Context) ((mj31) obj2).b).getSharedPreferences((String) obj, 0);
            case 21:
                ((fj51) obj2).b.finish();
                return zy11Var;
            case 22:
                gk51 gk51Var = (gk51) obj2;
                YaDiskUploadedFileInfo yaDiskUploadedFileInfo = (YaDiskUploadedFileInfo) obj;
                long j = yaDiskUploadedFileInfo.c;
                gk51Var.E = null;
                gl glVar = gk51Var.A;
                x22 x22Var = (x22) glVar.c;
                op3 op3Var = gk51Var.F;
                kgx kgxVar = gk51.K[0];
                x08 a = op3Var.a();
                if (a != null) {
                    a.cancel();
                }
                long j2 = gk51Var.a.e.b.b.b;
                if ((yaDiskUploadedFileInfo.a && j == 0) || j >= j2) {
                    String str3 = (String) glVar.b;
                    x22Var.reportEvent("yadisk_upload_file_anomaly", kotlin.collections.b.i(new Pair("uploadId", str3), new Pair("uploadedBytes", Long.valueOf(j))));
                    String str4 = yaDiskUploadedFileInfo.b;
                    if (str4 != null) {
                        gk51Var.J.D(new FileUploadResponseData(str4));
                        return zy11Var;
                    }
                    Long l = (Long) ((HashMap) glVar.x).get(str3);
                    x22Var.reportEvent("yadisk_upload_file_error", kotlin.collections.b.i(new Pair("uploadId", str3), new Pair("httpCode", 200), new Pair("msg", "no location in head query"), new Pair(RemoteBioParameters.TIME, l != null ? Long.valueOf(SystemClock.elapsedRealtime() - l.longValue()) : null)));
                }
                gk51Var.d(j);
                return zy11Var;
            case 23:
                com.yandex.go.account.deeplink.b bVar = (com.yandex.go.account.deeplink.b) obj2;
                Result result = (Result) obj;
                if (Result.a(result.getValue()) != null) {
                    bVar.e.i("failFetchingSession");
                }
                Object value = result.getValue();
                if (!(value instanceof Result.Failure)) {
                    if (bVar.b.a.Mg()) {
                        eky ekyVar = (eky) bVar.f.get();
                        if (!((cne0) ekyVar.b).f(ekyVar.w)) {
                            d dVar = (d) bVar.c.get();
                            dVar.q = false;
                            dVar.b(Events$Zalogin$LinkageContext.DEEPLINK, qeb1.b(dVar.e), new zi(i5), new zi(i5));
                        }
                    }
                }
                return zy11Var;
            case 24:
                render$lambda$13$lambda$12$lambda$11 = YbButtonViewGroup.render$lambda$13$lambda$12$lambda$11((YbButtonViewGroup) obj2, (String) obj);
                return render$lambda$13$lambda$12$lambda$11;
            case 25:
                showTooltip$lambda$0 = YbCardIconView.showTooltip$lambda$0((YbCardIconView) obj2, (Tooltip$DismissReason) obj);
                return showTooltip$lambda$0;
            case 26:
                Fragment fragment = (Fragment) obj2;
                TransitionPolicyType transitionPolicyType = TransitionPolicyType.BOTTOM_UP;
                if ((fragment instanceof TopupNoticeDeprecatedFragment) || (fragment instanceof TopupNoticeFragment)) {
                    return transitionPolicyType;
                }
                return null;
            case 27:
                lu51 lu51Var = (lu51) obj2;
                np51 np51Var = lu51Var.a;
                OpenScreenRequirement openScreenRequirement = (OpenScreenRequirement) obj;
                lu51Var.e.getClass();
                boolean z2 = (com.ybsdk.core.navigation.cicerone.a.b(openScreenRequirement) && lu51Var.d.m().getValue() == null) ? false : true;
                if (com.ybsdk.core.navigation.cicerone.a.c(openScreenRequirement)) {
                    z2 = z2 && (internalSdkState = np51Var.b) != null && com.ybsdk.common.c.a(internalSdkState);
                }
                if (com.ybsdk.core.navigation.cicerone.a.a(openScreenRequirement)) {
                    if (z2 && np51Var.a()) {
                        InternalSdkState internalSdkState2 = np51Var.b;
                        if (internalSdkState2 != null) {
                            str = com.ybsdk.common.c.c(internalSdkState2);
                            break;
                        }
                    }
                    z = false;
                } else {
                    z = z2;
                }
                return Boolean.valueOf(z);
            default:
                w3j0 w3j0Var = (w3j0) obj;
                w3j0Var.a.put("source", ((ew51) obj2).a().getOpenReason());
                return w3j0Var;
        }
    }

    public /* synthetic */ qq31(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
