package defpackage;

import android.animation.ValueAnimator;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Binder;
import android.os.DeadSystemException;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.t;
import androidx.lifecycle.y;
import com.airbnb.lottie.LottieDrawable;
import com.yandex.div.core.view2.Div2View;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$PaymentMethodsScreen;
import com.yandex.go.payments.menu.domain.c;
import com.yandex.go.payments.paymentlist.ui.PaymentMethodChooserView;
import com.yandex.go.payments.summary.ui.PaymentMethodsListModalView;
import com.yandex.go.safety.center.lost_item.lcp.a;
import com.yandex.messenger.websdk.api.PushToken;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.pulse.metrics.MetricsService;
import com.yandex.pulse.processcpu.MeasurementTask;
import com.yandex.pulse.utils.WeakHandler;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.impl.Q2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Result;
import org.json.JSONObject;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.design.ListItemSideContainer;
import ru.yandex.taxi.design.NotificationStackComponent;
import ru.yandex.taxi.order.l;
import ru.yandex.taxi.settings.activity.MenuButtonAttachStateChangeListener;
import ru.yandex.taxi.viewholder.b;

/* loaded from: classes.dex */
public final /* synthetic */ class ssu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ssu(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.util.ArrayList] */
    @Override // java.lang.Runnable
    public final void run() {
        omk failure;
        long j;
        int i;
        ArrayList arrayList;
        int i2;
        ArrayList arrayList2;
        int i3;
        yk3 yk3Var;
        long j2 = 60000;
        long j3 = -1;
        int i4 = 0;
        switch (this.a) {
            case 0:
                tsu tsuVar = (tsu) this.b;
                if (tsuVar.i.get()) {
                    int i5 = wfx.a;
                    nvo nvoVar = new nvo(tsuVar.c, tsuVar.d);
                    tsuVar.b(usu.b);
                    Serializable a = nvoVar.a();
                    Throwable a2 = Result.a(a);
                    if (a2 != null) {
                        tsuVar.b(new vsu(a2));
                    }
                    if (!(a instanceof Result.Failure)) {
                        String str = (String) a;
                        AtomicReference atomicReference = tsuVar.j;
                        Div2View div2View = tsuVar.a;
                        ArrayList arrayList3 = new ArrayList();
                        int i6 = 1;
                        rmk rmkVar = new rmk(arrayList3, 1);
                        int hashCode = str.hashCode();
                        if (hashCode == tsuVar.g) {
                            div2View.postDelayed(new rsu(tsuVar, i6), 250L);
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(str);
                                u2l u2lVar = new u2l(rmkVar);
                                if (jSONObject.has("card") && jSONObject.has("templates")) {
                                    JSONObject jSONObject2 = jSONObject.getJSONObject("templates");
                                    JSONObject jSONObject3 = jSONObject.getJSONObject("card");
                                    u2lVar.e(jSONObject2);
                                    kvo kvoVar = omk.i;
                                    failure = gtq0.n(u2lVar, jSONObject3);
                                } else if (jSONObject.has("card")) {
                                    JSONObject jSONObject4 = jSONObject.getJSONObject("card");
                                    kvo kvoVar2 = omk.i;
                                    failure = gtq0.n(u2lVar, jSONObject4);
                                } else {
                                    kvo kvoVar3 = omk.i;
                                    failure = gtq0.n(u2lVar, jSONObject);
                                }
                            } catch (Throwable th) {
                                failure = new Result.Failure(th);
                            }
                            Throwable a3 = Result.a(failure);
                            if (a3 != null) {
                                int i7 = wfx.a;
                                tsuVar.b(new vsu(a3));
                            }
                            if (failure instanceof Result.Failure) {
                                failure = null;
                            }
                            omk omkVar = failure;
                            if (omkVar != null) {
                                omk omkVar2 = div2View.get_divData();
                                if (atomicReference.get() == null && omkVar2 != null) {
                                    int i8 = wfx.a;
                                    Object e = new nvo(tsuVar.c, tsuVar.e).e(omkVar2.r().toString());
                                    Throwable a4 = Result.a(e);
                                    if (a4 != null) {
                                        tsuVar.a(a4);
                                    }
                                    if (!(e instanceof Result.Failure)) {
                                    }
                                    atomicReference.set(omkVar2);
                                }
                                ngd0.G.p();
                                fu11 fu11Var = fu11.a;
                                if (fu11Var.a()) {
                                    div2View.clearSubscriptions();
                                    div2View.setData(omkVar, new zmk(UUID.randomUUID().toString()));
                                    l6o b = div2View.getViewComponent().a().b(omkVar, div2View.getDataTag());
                                    if (b != null) {
                                        b.d();
                                    }
                                    Iterator it = arrayList3.iterator();
                                    while (it.hasNext()) {
                                        tsuVar.a((Throwable) it.next());
                                    }
                                    tsuVar.g = hashCode;
                                    tsuVar.b(usu.a);
                                    int i9 = wfx.a;
                                } else {
                                    fu11Var.b(new wz(tsuVar, omkVar, arrayList3, hashCode, 2));
                                }
                            }
                        }
                    }
                    int i10 = wfx.a;
                    tsuVar.k = tsuVar.b.schedule(tsuVar.l, 2L, TimeUnit.SECONDS);
                    return;
                }
                return;
            case 1:
                z2x z2xVar = (z2x) this.b;
                wyi0 wyi0Var = z2xVar.a;
                z2xVar.g = false;
                LinkedHashMap linkedHashMap = z2xVar.f;
                if (linkedHashMap.isEmpty()) {
                    return;
                }
                String str2 = (String) z2xVar.c.invoke();
                if (str2 != null) {
                    for (tyi0 tyi0Var : linkedHashMap.values()) {
                        String str3 = tyi0Var.a;
                        if (str3 != null) {
                            wyi0Var.q(tyi0Var.d - tyi0Var.c, str3, str2);
                        }
                    }
                    Collection values = linkedHashMap.values();
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj : values) {
                        if (((tyi0) obj).b != null) {
                            arrayList4.add(obj);
                        }
                    }
                    ?? linkedHashMap2 = new LinkedHashMap();
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        String str4 = ((tyi0) next).b;
                        ?? r7 = linkedHashMap2.get(str4);
                        if (r7 == null) {
                            r7 = qv10.w(str4, linkedHashMap2);
                        }
                        ((List) r7).add(next);
                    }
                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                        String str5 = (String) entry.getKey();
                        List list = (List) entry.getValue();
                        Iterator it3 = list.iterator();
                        if (!it3.hasNext()) {
                            ny61.p();
                            return;
                        }
                        long j4 = ((tyi0) it3.next()).c;
                        while (it3.hasNext()) {
                            long j5 = ((tyi0) it3.next()).c;
                            if (j4 > j5) {
                                j4 = j5;
                            }
                        }
                        Iterator it4 = list.iterator();
                        if (!it4.hasNext()) {
                            ny61.p();
                            return;
                        }
                        long j6 = ((tyi0) it4.next()).d;
                        while (it4.hasNext()) {
                            long j7 = ((tyi0) it4.next()).d;
                            if (j6 < j7) {
                                j6 = j7;
                            }
                        }
                        wyi0Var.c(j6 - j4, str5, str2);
                    }
                }
                linkedHashMap.clear();
                return;
            case 2:
                ((ListItemSideContainer) this.b).invalidate();
                return;
            case 3:
                l8x l8xVar = (l8x) this.b;
                if (l8xVar != null) {
                    l8xVar.a(null);
                    return;
                }
                return;
            case 4:
                ((AtomicBoolean) this.b).set(true);
                return;
            case 5:
                a aVar = (a) this.b;
                com.yandex.go.safety.center.lost_item.data.a aVar2 = aVar.e;
                cne0 cne0Var = aVar2.b;
                cne0 cne0Var2 = aVar2.b;
                String str6 = (String) kotlin.collections.a.Q(cne0Var.e());
                if (str6 == null) {
                    return;
                }
                int i11 = cne0Var2.i(str6, 0);
                cne0Var2.w(str6);
                Uri parse = Uri.parse(str6);
                ((xk60) aVar.d.get()).i.a(i11, null);
                aVar.b.a(parse, DeeplinkSource.PUSH);
                return;
            case 6:
                ((LottieDrawable) this.b).lambda$new$2();
                return;
            case 7:
                ((nuz) this.b).c();
                return;
            case 8:
                ((b) this.b).h();
                return;
            case 9:
                oa10 oa10Var = (oa10) this.b;
                Iterator it5 = oa10Var.a.iterator();
                while (it5.hasNext()) {
                    k5f0 k5f0Var = (k5f0) it5.next();
                    pa10 pa10Var = new pa10(y5e.f0, y5e.g0);
                    switch (k5f0Var.a) {
                        case 0:
                            j = j2;
                            l5f0 l5f0Var = (l5f0) k5f0Var.b;
                            MeasurementTask measurementTask = l5f0Var.k;
                            if (measurementTask != null) {
                                measurementTask.h.set(true);
                                l5f0Var.k = null;
                            }
                            MeasurementTask measurementTask2 = new MeasurementTask(l5f0Var.a, l5f0Var, l5f0Var.l, l5f0Var.m, pa10Var);
                            l5f0Var.k = measurementTask2;
                            i = 10;
                            l5f0Var.b.execute(new ssu(i, measurementTask2));
                            break;
                        default:
                            t901 t901Var = (t901) ((am2) k5f0Var.b).a;
                            int i12 = t901Var.c;
                            if (t901Var.e != j3 && t901Var.f != j3) {
                                long uptimeMillis = SystemClock.uptimeMillis();
                                long j8 = uptimeMillis - t901Var.d;
                                if (j8 >= 59000) {
                                    float f = j8 / 60000.0f;
                                    if (f < 1.0f) {
                                        f = 1.0f;
                                    }
                                    int i13 = (int) f;
                                    j = j2;
                                    try {
                                        long uidRxBytes = TrafficStats.getUidRxBytes(i12);
                                        long uidTxBytes = TrafficStats.getUidTxBytes(i12);
                                        long j9 = ((uidRxBytes - t901Var.e) * j) / j8;
                                        long j10 = ((uidTxBytes - t901Var.f) * j) / j8;
                                        t901Var.a.a((int) j9, i13);
                                        t901Var.b.a((int) j10, i13);
                                        long j11 = i13;
                                        long j12 = (j9 * j11) + t901Var.e;
                                        t901Var.e = j12;
                                        long j13 = (j10 * j11) + t901Var.f;
                                        t901Var.f = j13;
                                        long j14 = (j11 * j) + t901Var.d;
                                        t901Var.d = j14;
                                        if (j12 > uidRxBytes) {
                                            t901Var.e = uidRxBytes;
                                        }
                                        if (j13 > uidTxBytes) {
                                            t901Var.f = uidTxBytes;
                                        }
                                        if (j14 > uptimeMillis) {
                                            t901Var.d = uptimeMillis;
                                        }
                                    } catch (RuntimeException e2) {
                                        if (!(e2.getCause() instanceof DeadSystemException)) {
                                            throw e2;
                                        }
                                    }
                                    i = 10;
                                    break;
                                }
                            }
                            j = j2;
                            i = 10;
                            break;
                    }
                    j2 = j;
                    j3 = -1;
                }
                oa10Var.b.taskDone(oa10Var.c);
                return;
            case 10:
                MeasurementTask measurementTask3 = (MeasurementTask) this.b;
                WeakHandler weakHandler = measurementTask3.d;
                if (measurementTask3.h.get()) {
                    return;
                }
                try {
                    Process.setThreadPriority(10);
                    measurementTask3.a();
                    Binder.flushPendingCommands();
                    return;
                } finally {
                    weakHandler.sendEmptyMessage(0);
                }
            case 11:
                MenuButtonAttachStateChangeListener.onViewAttachedToWindow$lambda$0((MenuButtonAttachStateChangeListener) this.b);
                return;
            case 12:
                g9a0 g9a0Var = ((c) this.b).a;
                PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen = PaymentMethodsAnalytics$PaymentMethodsScreen.Menu;
                g9a0Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put(MetaDataField.SCREEN_FIELD, paymentMethodsAnalytics$PaymentMethodsScreen.getEventValue());
                g9a0Var.a.a("PaymentMethods.Opened", hashMap, 1, new HashMap());
                return;
            case 13:
                dd20 dd20Var = (dd20) this.b;
                xc20 xc20Var = dd20Var.b;
                if (dd20Var.f != -1) {
                    dd20.g.b((int) ((SystemClock.elapsedRealtime() - dd20Var.f) / 60000));
                    dd20Var.f = -1L;
                }
                if (!dd20Var.c) {
                    vd20 vd20Var = dd20Var.e;
                    vd20Var.stop();
                    vd20Var.taskDone(3000L);
                    return;
                }
                boolean b2 = xc20Var.b();
                y0b0 y0b0Var = xc20Var.a;
                y0b0 y0b0Var2 = xc20Var.b;
                if (!b2) {
                    dd20Var.e.stop();
                    dd20Var.e.a(true);
                    return;
                }
                if (!xc20Var.a()) {
                    xc20Var.a();
                    if (y0b0Var.e.size() > 0) {
                        ArrayList arrayList5 = y0b0Var.e;
                        if (arrayList5.size() == 0) {
                            ny61.r("No logs to stage.");
                            return;
                        }
                        y0b0Var.f = arrayList5.size() - 1;
                    } else {
                        ArrayList arrayList6 = y0b0Var2.e;
                        if (arrayList6.size() == 0) {
                            ny61.r("No logs to stage.");
                            return;
                        }
                        y0b0Var2.f = arrayList6.size() - 1;
                    }
                }
                xc20Var.a();
                if (dd20Var.d == null) {
                    ad20 ad20Var = dd20Var.a;
                    dd20Var.d = ad20Var.createUploader(ad20Var.getUploadURL(), "application/vnd.chrome.uma", "X-Chrome-UMA-Log-SHA1", new cd20(dd20Var));
                }
                if (y0b0Var.a()) {
                    arrayList = y0b0Var.e;
                    i2 = y0b0Var.f;
                } else {
                    arrayList = y0b0Var2.e;
                    i2 = y0b0Var2.f;
                }
                byte[] p = ((od20) arrayList.get(i2)).getHash().p();
                char[] cArr = new char[p.length * 2];
                int length = p.length;
                while (i4 < length) {
                    byte b3 = p[i4];
                    int i14 = i4 * 2;
                    char[] cArr2 = s8o.b;
                    cArr[i14] = cArr2[(b3 >> 4) & 15];
                    cArr[i14 + 1] = cArr2[(b3 & PKIBody._CCP) == true ? 1 : 0];
                    i4++;
                }
                String str7 = new String(cArr);
                zc20 zc20Var = dd20Var.d;
                if (y0b0Var.a()) {
                    arrayList2 = y0b0Var.e;
                    i3 = y0b0Var.f;
                } else {
                    arrayList2 = y0b0Var2.e;
                    i3 = y0b0Var2.f;
                }
                zc20Var.a(str7, ((od20) arrayList2.get(i3)).getCompressedLogData().p());
                return;
            case 14:
                ((MetricsService) this.b).startScheduledUpload();
                return;
            case 15:
                vh60 vh60Var = (vh60) this.b;
                e5g0 e5g0Var = vh60Var.f;
                au50 au50Var = new au50(25, vh60Var);
                o6v o6vVar = e5g0Var.a;
                ew2 ew2Var = e5g0Var.b;
                PushToken pushToken = e5g0Var.f;
                if (pushToken == null) {
                    ew2Var.c("wm_push_set_token_to_backend_error", gw00.e(new Pair(CRLReasonCodeExtension.REASON, "empty push token")));
                    return;
                }
                String g = e5g0Var.c.g();
                if (g == null) {
                    ew2Var.c("wm_push_set_token_to_backend_error", gw00.e(new Pair(CRLReasonCodeExtension.REASON, "empty auth token")));
                    return;
                }
                String str8 = o6vVar.c;
                if (str8 == null || evu0.J(str8)) {
                    ew2Var.c("wm_push_set_token_to_backend_error", gw00.e(new Pair(CRLReasonCodeExtension.REASON, "empty deviceId")));
                    return;
                }
                ew2Var.b("wm_push_set_token_to_backend");
                r5j0 r5j0Var = e5g0Var.d;
                t4j0 a5 = r5j0Var.a();
                a5.h(r5j0Var.a.e.a());
                a5.c.a("Authorization", g);
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put(MetaDataField.DEVICE_MODEL_FIELD, drw.b);
                jSONObject5.put("platform", ConstantDeviceInfo.APP_PLATFORM);
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("token_type", pushToken.getB().getValue());
                jSONObject6.put(AuthSdkActivity.RESPONSE_TYPE_TOKEN, pushToken.getA());
                jSONObject6.put(MetaDataField.DEVICE_ID_FIELD, o6vVar.c);
                jSONObject6.put("package_name", e5g0Var.e);
                jSONObject6.put(WebViewActivity.KEY_ENVIRONMENT, jSONObject5);
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("method", "set_push_token");
                jSONObject7.put("params", jSONObject6);
                a5.e("POST", new zdx(jSONObject7));
                d5j0 d5j0Var = new d5j0(a5);
                nci0 nci0Var = e5g0Var.h;
                if (nci0Var != null) {
                    nci0Var.cancel();
                }
                nci0 nci0Var2 = (nci0) e5g0Var.g.newCall(d5j0Var);
                e5g0Var.h = nci0Var2;
                nci0Var2.I(au50Var);
                return;
            case 16:
                ((ValueAnimator) this.b).cancel();
                return;
            case 17:
                ((NotificationStackComponent) this.b).hideInternal();
                return;
            case 18:
                l lVar = (l) this.b;
                lVar.b = lVar.a.b() == Lifecycle.State.RESUMED;
                lVar.a();
                return;
            case 19:
                PaymentMethodChooserView.setUIState$lambda$0((PaymentMethodChooserView) this.b);
                return;
            case 20:
                PaymentMethodChooserView.setUIState$lambda$1((m4a0) this.b);
                return;
            case 21:
                e6a0 e6a0Var = (e6a0) this.b;
                e6a0Var.a.a(new com.yandex.go.payments.paymentlist.ui.a(e6a0Var));
                return;
            case 22:
                PaymentMethodsListModalView.configureChooserView$lambda$0((PaymentMethodsListModalView) this.b);
                return;
            case 23:
                ru.yandex.taxi.perf.screen.c cVar = ((ru.yandex.taxi.perf.screen.b) this.b).c;
                for (tn5 tn5Var : cVar.d.values()) {
                    cVar.b(tn5Var.c());
                    Iterator it6 = tn5.e(tn5Var, cVar.b.e()).iterator();
                    while (it6.hasNext()) {
                        cVar.c((ava0) it6.next());
                    }
                }
                Iterator it7 = cVar.e.entrySet().iterator();
                while (it7.hasNext()) {
                    cVar.d((cwa0) ((Map.Entry) it7.next()).getValue());
                }
                return;
            case 24:
                pmd0 pmd0Var = (pmd0) this.b;
                com.yandex.go.plus.notification.a aVar3 = pmd0Var.c;
                if (aVar3.d == pmd0Var.b) {
                    aVar3.c = null;
                    aVar3.d = null;
                    return;
                }
                return;
            case 25:
                y yVar = (y) this.b;
                t tVar = yVar.y;
                if (yVar.b == 0) {
                    yVar.c = true;
                    tVar.g(Lifecycle.Event.ON_PAUSE);
                }
                if (yVar.a == 0 && yVar.c) {
                    tVar.g(Lifecycle.Event.ON_STOP);
                    yVar.w = true;
                    return;
                }
                return;
            case 26:
                Q2.a((Q2) this.b);
                return;
            case 27:
                xqi0 xqi0Var = (xqi0) this.b;
                xqi0Var.j.reportEvent("tech_request_account");
                am2 am2Var = xqi0Var.n;
                y120 y120Var = (y120) am2Var.a;
                if (y120Var != null) {
                    ((ymp) am2Var.b).getClass();
                    ((com.yandex.go.messenger_native.interactors.a) ((zzf) y120Var.a.b()).xg.get()).b();
                    return;
                }
                xqi0 xqi0Var2 = (xqi0) am2Var.c;
                tje.e();
                xqi0Var2.a.removeCallbacksAndMessages(null);
                if (xqi0Var2.p == null) {
                    xqi0Var2.j(xqi0Var2.i());
                }
                if (!xqi0Var2.q || (yk3Var = xqi0Var2.p) == null) {
                    return;
                }
                yk3Var.b();
                return;
            case 28:
                uti0 uti0Var = (uti0) this.b;
                tig0 tig0Var = uti0Var.x;
                z83.g(null, (Looper) tig0Var.b, Looper.myLooper());
                z83.f(uti0Var.w, null);
                qti0 qti0Var = (qti0) ((h3y) tig0Var.a).get();
                z83.g(null, qti0Var.a, Looper.myLooper());
                uti0Var.w = new pti0(qti0Var, uti0Var);
                return;
            default:
                m950 m950Var = (m950) this.b;
                if (gtq0.u(m950Var)) {
                    ((h55) m950Var).i();
                    return;
                }
                return;
        }
    }
}
