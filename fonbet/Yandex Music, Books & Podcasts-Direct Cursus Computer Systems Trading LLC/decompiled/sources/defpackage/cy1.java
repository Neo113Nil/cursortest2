package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.LruCache;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.c;
import androidx.fragment.app.f0;
import androidx.fragment.app.g;
import androidx.fragment.app.o;
import androidx.media3.session.i;
import androidx.work.impl.WorkDatabase;
import com.connectsdk.service.webos.lgcast.common.connection.ConnectionManager;
import com.connectsdk.service.webos.lgcast.common.connection.ConnectionManagerError;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraService;
import com.connectsdk.service.webos.lgcast.screenmirroring.service.MirroringService;
import com.yandex.payment.divkit.bind.view.DKCardNumberInput;
import com.yandex.payment.divkit.bind.view.DKExpirationDateInput;
import com.yandex.payment.sdk.ui.view.card.CardNumberInput;
import com.yandex.payment.sdk.ui.view.card.ExpirationDateInput;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.impl.J1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import retrofit2.Response;
import ru.yandex.video.m3.preload_manager.k;
import timber.log.Timber;

/* loaded from: classes.dex */
public final /* synthetic */ class cy1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cy1(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Type inference failed for: r1v42, types: [dra, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        wxt N;
        int i = 6;
        int i2 = 0;
        switch (this.a) {
            case 0:
                xiu xiuVar = (xiu) this.b;
                dsc dscVar = (dsc) this.c;
                tg7 tg7Var = (tg7) this.d;
                fy1 fy1Var = (fy1) xiuVar.c;
                int i3 = dvt.a;
                fy1Var.y(dscVar, tg7Var);
                return;
            case 1:
                y13 y13Var = (y13) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                sgr sgrVar = (sgr) this.d;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    uhe uheVar = (uhe) it.next();
                    synchronized (uheVar) {
                        uheVar.b(sgrVar, sgrVar, false);
                    }
                }
                y13Var.k();
                y13Var.a.K(y13Var.b);
                return;
            case 2:
                ((CameraService) this.b).lambda$onStartCommand$0((String) this.c, (Intent) this.d);
                return;
            case 3:
                WorkDatabase workDatabase = (WorkDatabase) this.b;
                String str = (String) this.c;
                g4w g4wVar = (g4w) this.d;
                x4w A = workDatabase.A();
                A.getClass();
                str.getClass();
                Iterator it2 = ((List) up6.F(A.a, true, false, new v4w(str, i2))).iterator();
                while (it2.hasNext()) {
                    leu.G(g4wVar, (String) it2.next());
                }
                return;
            case 4:
                vw3 vw3Var = (vw3) this.b;
                String str2 = (String) this.c;
                String str3 = (String) this.d;
                vw3Var.getClass();
                str2.getClass();
                str3.getClass();
                vw3Var.c.setExternalPreparedNumber(str2);
                vw3Var.d.setExternalDate(str3);
                return;
            case 5:
                AtomicReference atomicReference = (AtomicReference) this.b;
                Function0 function0 = (Function0) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                atomicReference.set(function0.invoke());
                countDownLatch.countDown();
                return;
            case 6:
                ((ConnectionManager) this.b).lambda$setSourceDeviceCapability$1((JSONObject) this.c, (JSONObject) this.d);
                return;
            case 7:
                ((ConnectionManager) this.b).lambda$callOnError$17((ConnectionManagerError) this.c, (String) this.d);
                return;
            case 8:
                kp6 kp6Var = (kp6) this.b;
                String str4 = (String) this.c;
                String str5 = (String) this.d;
                gp6 gp6Var = kp6Var.g;
                gp6Var.getClass();
                try {
                    ((z0j) gp6Var.d.e).h0(str4, str5);
                    return;
                } catch (IllegalArgumentException e) {
                    Context context = gp6Var.a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                    return;
                }
            case 9:
                u07 u07Var = (u07) this.b;
                String str6 = (String) this.c;
                String str7 = (String) this.d;
                str6.getClass();
                str7.getClass();
                k17 k17Var = u07Var.h;
                if (k17Var != null) {
                    k17Var.getClass();
                    str6.getClass();
                    str7.getClass();
                    j17 j17Var = k17Var.b;
                    if (j17Var == null) {
                        Intrinsics.j("controller");
                        throw null;
                    }
                    DKExpirationDateInput dKExpirationDateInput = j17Var.e;
                    DKCardNumberInput dKCardNumberInput = j17Var.d;
                    jw3 jw3Var = j17Var.c;
                    if (jw3Var != jw3.c && jw3Var != jw3.d) {
                        dKCardNumberInput.setExternalPreparedNumber(str6);
                        dKExpirationDateInput.setDate(str7);
                        return;
                    }
                    dKExpirationDateInput.a.b.setText((CharSequence) null);
                    ((EditText) j17Var.f.a.b).setText((CharSequence) null);
                    dKCardNumberInput.getClass();
                    dKCardNumberInput.setState(l17.a);
                    dKCardNumberInput.m = null;
                    ((EditText) dKCardNumberInput.a.g).setText((CharSequence) null);
                    dKCardNumberInput.o = false;
                    j17Var.f(jw3.a);
                    new Handler(Looper.getMainLooper()).postDelayed(new cy1(10, j17Var, str6, str7), j17Var.i);
                    return;
                }
                return;
            case 10:
                j17 j17Var2 = (j17) this.b;
                String str8 = (String) this.c;
                String str9 = (String) this.d;
                j17Var2.getClass();
                str8.getClass();
                str9.getClass();
                j17Var2.d.setExternalPreparedNumber(str8);
                j17Var2.e.setDate(str9);
                return;
            case 11:
                yfx yfxVar = (yfx) this.b;
                os3 os3Var = (os3) this.c;
                Response response = (Response) this.d;
                mk7 mk7Var = (mk7) yfxVar.c;
                if (mk7Var.b.o()) {
                    os3Var.A(mk7Var, new IOException("Canceled"));
                    return;
                } else {
                    os3Var.D(mk7Var, response);
                    return;
                }
            case 12:
                ((os3) this.c).A((mk7) ((yfx) this.b).c, (Throwable) this.d);
                return;
            case 13:
                ViewGroup viewGroup = (ViewGroup) this.b;
                View view = (View) this.c;
                c cVar = (c) this.d;
                viewGroup.getClass();
                viewGroup.endViewTransition(view);
                cVar.c.a.c(cVar);
                return;
            case 14:
                f0 f0Var = (f0) this.b;
                f0 f0Var2 = (f0) this.c;
                g gVar = (g) this.d;
                o oVar = f0Var.c;
                o oVar2 = f0Var2.c;
                boolean z = gVar.o;
                avc avcVar = vuc.a;
                oVar.getClass();
                oVar2.getClass();
                if (z) {
                    oVar2.getEnterTransitionCallback();
                    return;
                } else {
                    oVar.getEnterTransitionCallback();
                    return;
                }
            case 15:
                ((ub6) this.b).G(new aw5(21, (o3a) this.c, (l6a) this.d));
                return;
            case 16:
                cra craVar = (cra) this.b;
                this.c.d(craVar.a, craVar.b, (Exception) this.d);
                return;
            case 17:
                sg1 sg1Var = (sg1) this.b;
                men menVar = (men) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                try {
                    cqc o = weo.o(sg1Var.a);
                    if (o == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    bqc bqcVar = (bqc) ((q3b) o.b);
                    synchronized (bqcVar.d) {
                        bqcVar.f = threadPoolExecutor;
                    }
                    ((q3b) o.b).a(new t3b(menVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    menVar.C(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 18:
                m8b m8bVar = (m8b) this.b;
                Intent intent = (Intent) this.c;
                i8s i8sVar = (i8s) this.d;
                try {
                    m8bVar.handleIntent(intent);
                    return;
                } finally {
                    i8sVar.b(null);
                }
            case 19:
                ((J1) this.b).b((Context) this.c, (AppMetricaConfig) this.d);
                return;
            case 20:
                zoh zohVar = (zoh) this.b;
                tde tdeVar = (tde) this.c;
                uvh uvhVar = (uvh) this.d;
                uj7 uj7Var = zohVar.c;
                qsn f = tdeVar.f();
                mmo mmoVar = uj7Var.d;
                i8l i8lVar = uj7Var.g;
                i8lVar.getClass();
                mmoVar.getClass();
                mmoVar.c = yde.v(f);
                if (!f.isEmpty()) {
                    mmoVar.f = (uvh) f.get(0);
                    uvhVar.getClass();
                    mmoVar.g = uvhVar;
                }
                if (((uvh) mmoVar.e) == null) {
                    mmoVar.e = mmo.W(i8lVar, (yde) mmoVar.c, (uvh) mmoVar.f, (ois) mmoVar.b);
                }
                mmoVar.Y0(i8lVar.V());
                return;
            case 21:
                ahh ahhVar = (ahh) this.b;
                wrh wrhVar = (wrh) this.c;
                KeyEvent keyEvent = (KeyEvent) this.d;
                i iVar = (i) ahhVar.c;
                if (iVar.j(wrhVar)) {
                    iVar.a(keyEvent, false, false);
                } else {
                    sth sthVar = iVar.h;
                    xth xthVar = wrhVar.a;
                    xthVar.getClass();
                    sthVar.getClass();
                    sthVar.l0(1, new nth(sthVar, i), xthVar, true);
                }
                ahhVar.b = null;
                return;
            case 22:
                i iVar2 = (i) this.b;
                tuh tuhVar = (tuh) this.c;
                xrh xrhVar = (xrh) this.d;
                if (iVar2.k()) {
                    return;
                }
                lrl lrlVar = iVar2.t;
                tuhVar.getClass();
                vwh.f(lrlVar, xrhVar);
                return;
            case 23:
                kwh kwhVar = (kwh) this.b;
                Pair pair = (Pair) this.c;
                ((uj7) kwhVar.b.i).d(((Integer) pair.first).intValue(), (uvh) pair.second, (Exception) this.d);
                return;
            case 24:
                ((MirroringService) this.b).lambda$onStartCommand$0((String) this.c, (Intent) this.d);
                return;
            case 25:
                xw3 xw3Var = (xw3) this.b;
                String str10 = (String) this.c;
                String str11 = (String) this.d;
                str10.getClass();
                str11.getClass();
                xw3Var.getClass();
                str10.getClass();
                str11.getClass();
                vw3 vw3Var2 = xw3Var.b;
                if (vw3Var2 == null) {
                    Intrinsics.j("controller");
                    throw null;
                }
                ExpirationDateInput expirationDateInput = vw3Var2.d;
                CardNumberInput cardNumberInput = vw3Var2.c;
                jw3 jw3Var2 = vw3Var2.b;
                if (jw3Var2 != jw3.c && jw3Var2 != jw3.d) {
                    cardNumberInput.setExternalPreparedNumber(str10);
                    expirationDateInput.setExternalDate(str11);
                    return;
                }
                ((EditText) expirationDateInput.a.b).setText((CharSequence) null);
                vw3Var2.e.a.b.setText((CharSequence) null);
                cardNumberInput.getClass();
                cardNumberInput.setState(fx3.a);
                cardNumberInput.l = null;
                cardNumberInput.n = false;
                vw3Var2.e(jw3.a);
                new Handler(Looper.getMainLooper()).postDelayed(new cy1(4, vw3Var2, str10, str11), vw3Var2.j);
                return;
            case 26:
                String str12 = (String) this.b;
                gc8 gc8Var = (gc8) this.c;
                String str13 = (String) this.d;
                if (str12 != null && (N = gc8Var.N("legal_notes_a11y", str12)) != null) {
                    ssg.a(6, null, "problem with legal_notes_a11y in div json", N);
                }
                if (str13 == null) {
                    str13 = "";
                }
                wxt N2 = gc8Var.N("legal_notes", str13);
                if (N2 != null) {
                    ssg.a(6, null, "problem with legal_notes in div json", N2);
                    return;
                }
                return;
            case 27:
                fql.a((fql) this.b, (SurfaceView) this.c, (dyg) this.d);
                return;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                String str14 = (String) this.b;
                lf0 lf0Var = (lf0) this.c;
                k kVar = (k) this.d;
                Timber.INSTANCE.d("Running cancel(), uri = " + str14 + ", callback = " + lf0Var, new Object[0]);
                snm snmVar = (snm) kVar.h.get(str14);
                if (snmVar != null) {
                    Set set = snmVar.b;
                    set.remove(lf0Var);
                    if (set.isEmpty()) {
                        snmVar.c.c();
                        k kVar2 = snmVar.f;
                        String str15 = snmVar.e;
                        kVar2.getClass();
                        Intrinsics.d(Looper.myLooper(), kVar2.f.getLooper());
                        kVar2.h.remove(str15);
                        return;
                    }
                    return;
                }
                return;
            default:
                nnm nnmVar = (nnm) this.b;
                k kVar3 = (k) this.c;
                lf0 lf0Var2 = (lf0) this.d;
                Timber.Companion companion = Timber.INSTANCE;
                companion.d("Running getTracks(), preloadRequest = " + nnmVar, new Object[0]);
                LruCache lruCache = kVar3.g;
                HashMap hashMap = kVar3.h;
                String str16 = nnmVar.l;
                List list = (List) lruCache.get(str16);
                if (list != null) {
                    companion.d("getTracks() cache hit,preloadRequest = " + nnmVar, new Object[0]);
                    lf0Var2.invoke(list, null);
                    return;
                }
                snm snmVar2 = (snm) hashMap.get(str16);
                if (snmVar2 != null) {
                    companion.d("getTracks() merge to existing request, preloadRequest = " + nnmVar, new Object[0]);
                    snmVar2.b.add(lf0Var2);
                    return;
                }
                companion.d("getTracks() new request, preloadRequest = " + nnmVar, new Object[0]);
                snm snmVar3 = new snm(kVar3, nnmVar, kVar3.c, lf0Var2);
                String str17 = snmVar3.e;
                Intrinsics.d(Looper.myLooper(), kVar3.f.getLooper());
                hashMap.put(str17, snmVar3);
                nnmVar.b.getClass();
                b9w b9wVar = snmVar3.c;
                rnm rnmVar = new rnm(kVar3, snmVar3);
                vq1.A(b9wVar.h == null);
                b9wVar.h = rnmVar;
                wvh wvhVar = b9wVar.b;
                if (wvhVar != null) {
                    b9wVar.i = new a9w(wvhVar, b9wVar);
                    return;
                } else {
                    b9wVar.e.post(new xlr(26, b9wVar, rnmVar));
                    return;
                }
        }
    }
}
