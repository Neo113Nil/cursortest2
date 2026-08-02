package defpackage;

import android.app.Application;
import android.graphics.Bitmap;
import android.media.Rating;
import android.media.browse.MediaBrowser;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.google.android.material.textfield.TextInputLayout;
import com.google.gson.Gson;
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;
import com.yandex.payment.sdk.ui.view.EmailView;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.AppMetricaYandexConfig;
import io.appmetrica.analytics.PulseConfig;
import io.appmetrica.analytics.RtmClientEvent;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class oxa implements adu, s4n, u97, InstallReferrerStateListener, rc, ups, j38, x7o, wa4, ppb {
    public final /* synthetic */ int a;
    public final Object b;

    public oxa(String str, String str2, String str3, String str4, String str5, int i, String str6, qnb qnbVar, String str7, String str8) {
        this.a = 1;
        String str9 = Build.MODEL;
        String str10 = Build.MANUFACTURER;
        eta.s(str9, str, str2, str7, str10);
        str8.getClass();
        this.b = uah.e(new Pair(CommonUrlParts.MODEL, str9), new Pair(CommonUrlParts.SCREEN_HEIGHT, str), new Pair(CommonUrlParts.SCREEN_WIDTH, str2), new Pair("appmetrica_uuid", str3), new Pair("appmetrica_device_id", str4), new Pair(CommonUrlParts.APP_VERSION, str5), new Pair("app_version_code", Integer.valueOf(i)), new Pair("sdk_version", "110.0.0"), new Pair(CommonUrlParts.APP_ID, str6), new Pair("integration", "PaySDK"), new Pair("platform", qnbVar.a), new Pair("api_level", str7), new Pair("manufacturer", str10), new Pair(CommonUrlParts.SCREEN_DPI, str8));
    }

    public static void p(LinkedHashMap linkedHashMap, List list, lm4 lm4Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wbn wbnVar = (wbn) it.next();
            Object obj = linkedHashMap.get(wbnVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(wbnVar, obj);
            }
            ((List) obj).add(lm4Var);
        }
    }

    public void A(String str, long j) {
        Integer num = (Integer) ioh.c.get(str);
        if (num == null || num.intValue() == 0) {
            ((Bundle) this.b).putLong(str, j);
        } else {
            xq0.x(hrg.q("The ", str, " key cannot be used to put a long"));
        }
    }

    public void C(String str, iin iinVar) {
        Object obj;
        float f = iinVar.b;
        Integer num = (Integer) ioh.c.get(str);
        if (num != null && num.intValue() != 3) {
            xq0.x(hrg.q("The ", str, " key cannot be used to put a Rating"));
            return;
        }
        Bundle bundle = (Bundle) this.b;
        if (iinVar.c == null) {
            boolean e = iinVar.e();
            int i = iinVar.a;
            if (e) {
                switch (i) {
                    case 1:
                        iinVar.c = Rating.newHeartRating(i == 1 && f == 1.0f);
                        break;
                    case 2:
                        iinVar.c = Rating.newThumbRating(i == 2 && f == 1.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        iinVar.c = Rating.newStarRating(i, iinVar.d());
                        break;
                    case 6:
                        if (i != 6 || !iinVar.e()) {
                            f = -1.0f;
                        }
                        iinVar.c = Rating.newPercentageRating(f);
                        break;
                    default:
                        obj = null;
                        break;
                }
                bundle.putParcelable(str, (Parcelable) obj);
            }
            iinVar.c = Rating.newUnratedRating(i);
        }
        obj = iinVar.c;
        bundle.putParcelable(str, (Parcelable) obj);
    }

    public void D(String str, String str2) {
        Integer num = (Integer) ioh.c.get(str);
        if (num == null || num.intValue() == 1) {
            ((Bundle) this.b).putCharSequence(str, str2);
        } else {
            xq0.x(hrg.q("The ", str, " key cannot be used to put a String"));
        }
    }

    public void E(CharSequence charSequence, String str) {
        Integer num = (Integer) ioh.c.get(str);
        if (num == null || num.intValue() == 1) {
            ((Bundle) this.b).putCharSequence(str, charSequence);
        } else {
            xq0.x(hrg.q("The ", str, " key cannot be used to put a CharSequence"));
        }
    }

    public void H(Object obj) {
        MediaBrowserService.Result result = (MediaBrowserService.Result) this.b;
        if (!(obj instanceof List)) {
            if (!(obj instanceof Parcel)) {
                result.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) obj;
            parcel.setDataPosition(0);
            result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
            return;
        }
        List<Parcel> list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        for (Parcel parcel2 : list) {
            parcel2.setDataPosition(0);
            arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
            parcel2.recycle();
        }
        result.sendResult(arrayList);
    }

    public void I(y70 y70Var, String str) {
        Map map = y70Var.b;
        String str2 = y70Var.a;
        if (str.equals("Player")) {
            Gson gson = who.a;
            RtmClientEvent build = RtmClientEvent.newBuilder(str2, who.b != null ? "YandexMusicAndroid" : null).withService(str).withRequestId(AppMetricaYandex.getUuid((Application) this.b)).withAdditional(who.a.j(map)).build();
            build.getClass();
            AppMetricaYandex.reportRtmEvent(build);
        }
        if (map == null) {
            map = e5b.a;
            map.getClass();
        }
        AppMetricaYandex.reportStatboxEvent(str2, (Map<String, Object>) map);
    }

    @Override // defpackage.u97
    public void Q(aa7 aa7Var, om3 om3Var) {
        scv scvVar = (scv) this.b;
        try {
            scv.a(scvVar, om3Var.d());
        } catch (e8e e) {
            pm5 pm5Var = (pm5) scvVar.u.f;
            if (pm5Var != null) {
                pm5Var.r(e);
            }
            e.printStackTrace();
        }
        scvVar.h();
    }

    @Override // defpackage.ppb
    public u8q a() {
        return ((PreselectActivity) this.b).C();
    }

    @Override // defpackage.ppb
    public Object b(o oVar, Class cls) {
        return ((rsd) qld.y(oVar)).a().b(s79.class);
    }

    @Override // defpackage.wa4
    public void c() {
        qdq.A(new ypb(29, this));
    }

    @Override // defpackage.s4n
    public void d(Object obj) {
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        short i = rzc.i((byte[]) obj);
        j2j j2jVar = (j2j) this.b;
        rzc rzcVar = (rzc) j2jVar.e;
        if (((short) rzcVar.i.getValue()) != i) {
            rzcVar.b(new IOException("CRC mismatch"));
            return;
        }
        rzcVar.i.reset();
        rzcVar.h = false;
        rzcVar.f((aa7) j2jVar.c);
    }

    @Override // defpackage.rc
    public String e() {
        return "";
    }

    @Override // defpackage.ups
    public void f(double d, Map map) {
        eai eaiVar = (eai) this.b;
        eaiVar.a.reportTotalScore(eaiVar.r, "V2", d, map);
    }

    @Override // defpackage.ups
    public void g(double d, Map map) {
        eai eaiVar = (eai) this.b;
        eaiVar.a.reportTotalScoreStartupSpecific(eaiVar.r, "V2", d, map, "warm");
    }

    @Override // defpackage.ups
    public void h(double d, Map map) {
        eai eaiVar = (eai) this.b;
        eaiVar.a.reportTotalScoreStartupSpecific(eaiVar.r, "V2", d, map, "hot");
    }

    @Override // defpackage.ppb
    public d51 i() {
        return new d51(22);
    }

    @Override // defpackage.rc
    public String j() {
        ((ule) this.b).getClass();
        return "";
    }

    @Override // defpackage.wa4
    public void k(iek iekVar) {
        iekVar.getClass();
    }

    @Override // defpackage.ups
    public void l(double d, Map map) {
        eai eaiVar = (eai) this.b;
        eaiVar.a.reportTotalScoreStartupSpecific(eaiVar.r, "V2", d, map, "cold");
    }

    @Override // defpackage.wa4
    public void m(ft7 ft7Var) {
        ft7Var.getClass();
        qdq.A(new ssb(23, this, ft7Var));
    }

    @Override // defpackage.j38
    public boolean n(float f) {
        if (f == 0.0f) {
            return false;
        }
        r();
        ((NestedScrollView) this.b).i((int) f);
        return true;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerSetupFinished(int i) {
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            if (i != 0) {
                if (i != 2) {
                    return;
                }
                j3c.b().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
                return;
            }
            try {
                InstallReferrerClient installReferrerClient = (InstallReferrerClient) this.b;
                installReferrerClient.getClass();
                ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                installReferrer.getClass();
                String installReferrer2 = installReferrer.getInstallReferrer();
                if (installReferrer2 != null) {
                    if (!StringsKt.M(installReferrer2, "fb", false)) {
                        if (StringsKt.M(installReferrer2, "facebook", false)) {
                        }
                    }
                    j3c.b().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("install_referrer", installReferrer2).apply();
                }
                j3c.b().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
            } catch (RemoteException unused) {
            }
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        ((ggk) obj).getClass();
        j3j j3jVar = (j3j) this.b;
        cdv cdvVar = (cdv) j3jVar.e;
        if (cdvVar != null) {
            cdvVar.C(ycv.a);
        }
        sx3 sx3Var = (sx3) j3jVar.f;
        if (sx3Var != null) {
            sx3Var.a(new qx3());
        }
    }

    @Override // defpackage.j38
    public float q() {
        return -((NestedScrollView) this.b).getVerticalScrollFactorCompat();
    }

    @Override // defpackage.j38
    public void r() {
        ((NestedScrollView) this.b).d.abortAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void s(pm pmVar, cg6 cg6Var) {
        ujj ujjVar;
        int i;
        if (cg6Var instanceof ujj) {
            ujjVar = (ujj) cg6Var;
            int i2 = ujjVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ujjVar.l = i2 - Integer.MIN_VALUE;
                Object obj = ujjVar.j;
                nm6 nm6Var = nm6.a;
                i = ujjVar.l;
                if (i == 0) {
                    if (i == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    qgg.h0(obj);
                    xdr xdrVar = (xdr) this.b;
                    ujjVar.l = 1;
                    xdrVar.collect(pmVar, ujjVar);
                    return;
                }
            }
        }
        ujjVar = new ujj(this, cg6Var);
        Object obj2 = ujjVar.j;
        nm6 nm6Var2 = nm6.a;
        i = ujjVar.l;
        if (i == 0) {
        }
    }

    public yop t(String str) {
        str.getClass();
        vx6 vx6Var = (vx6) this.b;
        return quj.C((hg3) vx6Var.c, (hg3) vx6Var.d, new cr4(vx6Var, str));
    }

    public String toString() {
        switch (this.a) {
            case 7:
                StringBuilder sb = new StringBuilder();
                String[] strArr = (String[]) this.b;
                int length = strArr.length / 2;
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    String str = null;
                    sb.append((i2 < 0 || i2 >= strArr.length) ? null : strArr[i2]);
                    sb.append(": ");
                    int i3 = i2 + 1;
                    if (i3 >= 0 && i3 < strArr.length) {
                        str = strArr[i3];
                    }
                    sb.append(str);
                    sb.append(StringUtil.LF);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(yqh yqhVar, dqh dqhVar, Collection collection) {
        yld yldVar = (yld) this.b;
        if (yqhVar != yldVar.y || dqhVar == null) {
            if (yqhVar == yldVar.e) {
                if (dqhVar != null) {
                    yldVar.n(yldVar.d, dqhVar);
                }
                yldVar.d.n(collection);
                return;
            }
            return;
        }
        hrh hrhVar = yldVar.x.a;
        String d = dqhVar.d();
        irh irhVar = new irh(hrhVar, d, yldVar.b(hrhVar, d), false);
        irhVar.i(dqhVar);
        if (yldVar.d == irhVar) {
            return;
        }
        yldVar.h(yldVar, irhVar, yldVar.y, 3, yldVar.x, collection);
        yldVar.x = null;
        yldVar.y = null;
    }

    public void v(float f, float f2, float f3) {
        trk trkVar = (trk) this.b;
        if (trkVar.d() < trkVar.e || f < 1.0f) {
            if (trkVar.d() > trkVar.c || f > 1.0f) {
                trkVar.m.postScale(f, f, f2, f3);
                trkVar.a();
            }
        }
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        bfk bfkVar = (bfk) obj;
        bfkVar.getClass();
        ((j3j) this.b).i(bfkVar);
    }

    public fmq y(aqd aqdVar, AndroidComposeView androidComposeView) {
        int i;
        long H;
        long j;
        boolean z;
        ovg ovgVar = (ovg) this.b;
        List list = (List) aqdVar.b;
        ovg ovgVar2 = new ovg(list.size());
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            nfm nfmVar = (nfm) list.get(i2);
            long j2 = nfmVar.a;
            mfm mfmVar = (mfm) ovgVar.c(j2);
            if (mfmVar == null) {
                i = i2;
                j = nfmVar.b;
                H = nfmVar.d;
                z = false;
            } else {
                long j3 = mfmVar.a;
                boolean z2 = mfmVar.c;
                i = i2;
                H = androidComposeView.H(mfmVar.b);
                j = j3;
                z = z2;
            }
            long j4 = nfmVar.a;
            List list2 = list;
            int i3 = size;
            ovgVar2.f(j4, new lfm(j4, nfmVar.b, nfmVar.d, nfmVar.e, nfmVar.f, j, H, z, nfmVar.g, nfmVar.i, nfmVar.j, nfmVar.k));
            boolean z3 = nfmVar.e;
            if (z3) {
                ovgVar.f(j2, new mfm(z3, nfmVar.b, nfmVar.c));
            } else {
                ovgVar.g(j2);
            }
            i2 = i + 1;
            list = list2;
            size = i3;
        }
        return new fmq(ovgVar2, aqdVar);
    }

    public void z(String str, Bitmap bitmap) {
        Integer num = (Integer) ioh.c.get(str);
        if (num == null || num.intValue() == 2) {
            ((Bundle) this.b).putParcelable(str, bitmap);
        } else {
            xq0.x(hrg.q("The ", str, " key cannot be used to put a Bitmap"));
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
    }

    public oxa(t tVar) {
        this.a = 0;
        tVar.getClass();
        this.b = tVar;
    }

    public oxa(vx6 vx6Var, js3 js3Var, vx6 vx6Var2) {
        this.a = 3;
        this.b = vx6Var2;
    }

    public oxa(Application application, vm7 vm7Var) {
        this.a = 16;
        this.b = application;
        synchronized (y3i.a) {
            try {
                if (y3i.b) {
                    return;
                }
                y3i.d = vm7Var;
                AppMetricaYandexConfig.Builder withRevenueAutoTrackingEnabled = AppMetricaYandexConfig.newBuilder((String) vm7Var.c).withDataSendingEnabled(vm7Var.b).withNativeCrashReporting(false).withSessionTimeout((int) 600).withLocationTracking(false).withAnrMonitoring(false).withAppOpenTrackingEnabled(false).withRevenueAutoTrackingEnabled(false);
                withRevenueAutoTrackingEnabled.getClass();
                PulseConfig pulseConfig = y3i.c;
                Continuation continuation = null;
                if (pulseConfig != null) {
                    withRevenueAutoTrackingEnabled.withPulseConfig(pulseConfig);
                    ssg.a(2, "MetricaInitializer", "Pulse activated", null);
                }
                if (vm7Var.a) {
                    withRevenueAutoTrackingEnabled.withLogs();
                }
                AppMetricaYandex.initialize(application, withRevenueAutoTrackingEnabled.build());
                x97.y(cmd.a, dm6.a(), null, new seg(vm7Var, continuation, continuation, 5), 2);
                y3i.b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public oxa(egl eglVar) {
        this.a = 26;
        eglVar.getClass();
        this.b = eglVar;
    }

    public oxa(EmailView emailView, TextInputLayout textInputLayout) {
        this.a = 24;
        this.b = textInputLayout;
    }

    public oxa(ik0 ik0Var) {
        this.a = 7;
        ArrayList arrayList = ik0Var.a;
        this.b = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public oxa(InstallReferrerClient installReferrerClient, i9w i9wVar) {
        this.a = 9;
        this.b = installReferrerClient;
    }

    public oxa(int i, byte b) {
        this.a = i;
        switch (i) {
            case 15:
                this.b = new Bundle();
                break;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                this.b = new ovg((Object) null);
                break;
            default:
                this.b = new eqi(new dtf[16]);
                break;
        }
    }

    public /* synthetic */ oxa(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public oxa(gek gekVar) {
        this.a = 23;
        gekVar.getClass();
        this.b = gekVar;
    }

    public oxa(int i) {
        this.a = 21;
        this.b = ydr.a(new int[i]);
    }
}
