package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.transition.Transition;
import com.adjust.sdk.Constants;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.sessions.api.SessionSubscriber$Name;
import com.yandex.plus.core.config.Environment;
import com.yandex.plus.experiments.impl.providers.a;
import com.yandex.plus.home.internal.di.g;
import com.yandex.plus.home.plaque.feature.api.anim.PlaqueAnimator$PlaqueType;
import com.yandex.plus.home.plaque.plugin.api.animator.PlusPlaqueAnimator$AnimatorParams$PlaqueType;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.internal.b;
import com.yandex.plus.plaquesdk.plaque.PlaqueView;
import com.yandex.plus.plaquesdk.plaque.api.models.PlaqueModel$Type;
import io.appmetrica.analytics.MviConfig;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.impl.C0658ql;
import io.appmetrica.analytics.impl.D6;
import io.appmetrica.analytics.impl.Kf;
import io.appmetrica.analytics.rtmwrapper.internal.RtmServiceReporter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.Thread;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.Result;
import kotlin.time.DurationUnit;
import ru.CryptoPro.JCP.ProviderParameters;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.network.Request;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class s59 implements moh, e1d, pke, ActivationBarrierCallback, pi, ww01, m40, ctl, t070, zfo, bx60, k4x, thw0, q3l0, uu60, twl, s2l, RtmServiceReporter, mic0, fy31, imc0, e5o, ulp {
    public final /* synthetic */ Object a;

    public /* synthetic */ s59(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.twl
    public List a(String str) {
        return ((oot) this.a).a(str);
    }

    @Override // defpackage.ww01, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* renamed from: apply */
    public Object mo489apply(Object obj) {
        jzq0 jzq0Var = (jzq0) obj;
        ((gfo) this.a).getClass();
        String k = kzq0.b.k(jzq0Var);
        jzq0Var.a.name();
        return k.getBytes(uza.a);
    }

    @Override // defpackage.k4x
    public void b(mes mesVar) {
        q4x q4xVar = (q4x) this.a;
        List list = mesVar.a;
        q4xVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ((q4u0) obj).getClass();
            arrayList.add(obj);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fva0.b(q4xVar.a, ((q4u0) it.next()).a(), PerformanceAnalytics$Type.Inflate, null, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.view.ViewGroup] */
    @Override // defpackage.mic0
    public void c(PlaqueView plaqueView, long j, PlaqueModel$Type plaqueModel$Type, Transition.TransitionListener transitionListener) {
        PlaqueAnimator$PlaqueType plaqueAnimator$PlaqueType;
        cxf0 cxf0Var = (cxf0) this.a;
        o430 o430Var = e3n.b;
        long V = kp50.V(j, DurationUnit.MILLISECONDS);
        int i = akc0.a[plaqueModel$Type.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            plaqueAnimator$PlaqueType = PlaqueAnimator$PlaqueType.DEFAULT;
        } else {
            if (i != 4) {
                w511.b();
                return;
            }
            plaqueAnimator$PlaqueType = PlaqueAnimator$PlaqueType.CONDITIONAL;
        }
        int i2 = bxf0.a[plaqueAnimator$PlaqueType.ordinal()];
        if (i2 == 1) {
            PlusPlaqueAnimator$AnimatorParams$PlaqueType plusPlaqueAnimator$AnimatorParams$PlaqueType = PlusPlaqueAnimator$AnimatorParams$PlaqueType.DEFAULT;
        } else {
            if (i2 != 2) {
                w511.b();
                return;
            }
            PlusPlaqueAnimator$AnimatorParams$PlaqueType plusPlaqueAnimator$AnimatorParams$PlaqueType2 = PlusPlaqueAnimator$AnimatorParams$PlaqueType.DEFAULT;
        }
        wrd0 wrd0Var = (wrd0) cxf0Var.a;
        lic0 lic0Var = wrd0Var.b;
        ?? r3 = wrd0Var.a;
        if (r3 != 0) {
            plaqueView = r3;
        }
        ((rhh) lic0Var).a(plaqueView, e3n.e(V), transitionListener);
    }

    @Override // defpackage.zfo
    public cgo create() {
        return (cgo) this.a;
    }

    @Override // defpackage.uu60
    public boolean d() {
        return ((Boolean) ((g) this.a).a.p.getValue()).booleanValue();
    }

    @Override // defpackage.q3l0
    public o3l0 e(ou ouVar) {
        return (egl0) this.a;
    }

    @Override // defpackage.moh
    public void f(zvf0 zvf0Var) {
        b3f b3fVar = (b3f) this.a;
        Log.isLoggable("FirebaseCrashlytics", 3);
        b3fVar.b.set((y2f) zvf0Var.get());
    }

    @Override // defpackage.ctl
    public ysl g(Context context) {
        return (ysl) this.a;
    }

    @Override // defpackage.thw0
    public tlp get() {
        Object h = ((a) ((b) this.a).a.getValue()).h();
        if (h instanceof Result.Failure) {
            h = null;
        }
        k2d0 k2d0Var = (k2d0) h;
        return new tlp(k2d0Var != null ? k2d0Var.d : null);
    }

    @Override // defpackage.e5o
    public Environment getEnvironment() {
        return ((c2d0) this.a).d == ru.yandex.taxi.plus.sdk.Environment.PRODUCTION ? Environment.PRODUCTION : Environment.TESTING;
    }

    @Override // defpackage.pke
    public Object h(Task task) {
        ((Runnable) this.a).run();
        return udq0.p(null);
    }

    @Override // defpackage.fy31
    public void i(int i, int i2) {
        dxf0 dxf0Var = (dxf0) this.a;
        dn60 dn60Var = new dn60(i, i2);
        lb7 lb7Var = ((yrd0) dxf0Var.a).a.g;
        ((nn4) lb7Var.b).a(dn60Var.C() - ((s49) lb7Var.c).e);
    }

    public t59 j(am2 am2Var) {
        u59 u59Var = (u59) this.a;
        URL url = (URL) am2Var.a;
        String concat = "TRuntime.".concat("CctTransportBackend");
        if (Log.isLoggable(concat, 4)) {
            Log.i(concat, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(u59Var.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty(ExtFunctionsKt.HEADER_USER_AGENT, "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", Request.PARAM_GZIP);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", Request.PARAM_GZIP);
        String str = (String) am2Var.c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    vit vitVar = u59Var.a;
                    s34 s34Var = (s34) am2Var.b;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    mcx mcxVar = (mcx) vitVar.b;
                    zex zexVar = new zex(bufferedWriter, mcxVar.a, mcxVar.b, mcxVar.c, mcxVar.d);
                    zexVar.g(s34Var);
                    zexVar.i();
                    zexVar.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String concat2 = "TRuntime.".concat("CctTransportBackend");
                    if (Log.isLoggable(concat2, 4)) {
                        Log.i(concat2, String.format("Status Code: %d", valueOf));
                    }
                    rzo.o("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    rzo.o("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new t59(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new t59(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = Request.PARAM_GZIP.equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            t59 t59Var = new t59(responseCode, null, jfz.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return t59Var;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (EncodingException | IOException e) {
            rzo.v(e, "CctTransportBackend", "Couldn't encode request, returning with 400");
            return new t59(Constants.MINIMAL_ERROR_STATUS_CODE, null, 0L);
        } catch (ConnectException | UnknownHostException e2) {
            rzo.v(e2, "CctTransportBackend", "Couldn't open connection, returning with 500");
            return new t59(500, null, 0L);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:0|1|(1:3)(1:117)|4|(1:6)|(1:8)(1:116)|9|(2:114|115)(2:13|(2:112|113)(4:17|(2:20|18)|21|22))|23|(2:26|24)|27|28|(17:29|30|(1:32)|33|34|(1:36)|(1:38)(1:108)|39|(4:42|(2:44|45)(1:47)|46|40)|48|49|(2:52|50)|53|54|(1:56)(1:107)|(1:58)(1:106)|59)|(16:63|(1:65)(2:102|(1:104))|66|(1:68)(2:98|(2:100|101))|69|70|71|72|73|74|75|(2:92|93)(2:83|84)|85|86|(1:88)|89)|105|66|(0)(0)|69|70|71|72|73|74|75|(2:77|79)|92|93|85|86|(0)|89) */
    /* JADX WARN: Can't wrap try/catch for region: R(47:0|1|(1:3)(1:117)|4|(1:6)|(1:8)(1:116)|9|(2:114|115)(2:13|(2:112|113)(4:17|(2:20|18)|21|22))|23|(2:26|24)|27|28|29|30|(1:32)|33|34|(1:36)|(1:38)(1:108)|39|(4:42|(2:44|45)(1:47)|46|40)|48|49|(2:52|50)|53|54|(1:56)(1:107)|(1:58)(1:106)|59|(16:63|(1:65)(2:102|(1:104))|66|(1:68)(2:98|(2:100|101))|69|70|71|72|73|74|75|(2:92|93)(2:83|84)|85|86|(1:88)|89)|105|66|(0)(0)|69|70|71|72|73|74|75|(2:77|79)|92|93|85|86|(0)|89) */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03ff, code lost:
    
        r4.g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0452, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0464, code lost:
    
        android.util.Log.e("FirebaseCrashlytics", "Crashlytics was not started due to an exception during initialization", r0);
        r4.h = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0320  */
    @Override // defpackage.e1d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object k(yuf0 yuf0Var) {
        String str;
        v2f v2fVar;
        com.google.firebase.crashlytics.internal.concurrency.a aVar;
        uo2 uo2Var;
        int i;
        FirebaseCrashlytics firebaseCrashlytics;
        yx1 yx1Var;
        com.google.firebase.crashlytics.internal.settings.a aVar2;
        v2f v2fVar2;
        q1r q1rVar;
        Context context;
        boolean z;
        boolean exists;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.a;
        int i2 = CrashlyticsRegistrar.d;
        long currentTimeMillis = System.currentTimeMillis();
        com.google.firebase.a aVar3 = (com.google.firebase.a) yuf0Var.a(com.google.firebase.a.class);
        hcr hcrVar = (hcr) yuf0Var.a(hcr.class);
        cg70 w = yuf0Var.w(y2f.class);
        cg70 w2 = yuf0Var.w(c32.class);
        cg70 w3 = yuf0Var.w(ncr.class);
        ExecutorService executorService = (ExecutorService) yuf0Var.c(crashlyticsRegistrar.a);
        ExecutorService executorService2 = (ExecutorService) yuf0Var.c(crashlyticsRegistrar.b);
        ExecutorService executorService3 = (ExecutorService) yuf0Var.c(crashlyticsRegistrar.c);
        aVar3.a();
        Context context2 = aVar3.a;
        String packageName = context2.getPackageName();
        Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 20.0.3 for " + packageName, null);
        com.google.firebase.crashlytics.internal.concurrency.a aVar4 = new com.google.firebase.crashlytics.internal.concurrency.a(executorService, executorService2);
        q1r q1rVar2 = new q1r(context2);
        uo2 uo2Var2 = new uo2(aVar3);
        c6v c6vVar = new c6v(context2, packageName, hcrVar, uo2Var2);
        b3f b3fVar = new b3f(w);
        h32 h32Var = new h32(w2);
        p2f p2fVar = new p2f(uo2Var2, q1rVar2);
        com.google.firebase.sessions.api.a aVar5 = com.google.firebase.sessions.api.a.a;
        SessionSubscriber$Name sessionSubscriber$Name = SessionSubscriber$Name.CRASHLYTICS;
        com.google.firebase.sessions.api.a aVar6 = com.google.firebase.sessions.api.a.a;
        vcr a = com.google.firebase.sessions.api.a.a(sessionSubscriber$Name);
        if (a.b != null) {
            Objects.toString(sessionSubscriber$Name);
            str = null;
        } else {
            a.b = p2fVar;
            Objects.toString(sessionSubscriber$Name);
            str = null;
            a.a.d(null);
        }
        v2f v2fVar3 = new v2f(aVar3, c6vVar, b3fVar, uo2Var2, new g32(h32Var), new g32(h32Var), q1rVar2, p2fVar, new o370(w3), aVar4);
        com.google.firebase.crashlytics.internal.concurrency.a aVar7 = v2fVar3.p;
        aVar3.a();
        String str2 = aVar3.c.b;
        int e = CommonUtils.e(context2, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (e == 0) {
            e = CommonUtils.e(context2, "com.crashlytics.android.build_id", "string");
        }
        String string = e != 0 ? context2.getResources().getString(e) : str;
        ArrayList arrayList = new ArrayList();
        int e2 = CommonUtils.e(context2, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int e3 = CommonUtils.e(context2, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int e4 = CommonUtils.e(context2, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (e2 == 0 || e3 == 0 || e4 == 0) {
            v2fVar = v2fVar3;
            aVar = aVar7;
            uo2Var = uo2Var2;
            i = 3;
            String.format("Could not find resources: %d %d %d", Integer.valueOf(e2), Integer.valueOf(e3), Integer.valueOf(e4));
            Log.isLoggable("FirebaseCrashlytics", 3);
        } else {
            String[] stringArray = context2.getResources().getStringArray(e2);
            String[] stringArray2 = context2.getResources().getStringArray(e3);
            String[] stringArray3 = context2.getResources().getStringArray(e4);
            uo2Var = uo2Var2;
            if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                int i3 = 0;
                while (i3 < stringArray3.length) {
                    int i4 = i3;
                    arrayList.add(new ds6(stringArray[i4], stringArray2[i4], stringArray3[i4]));
                    i3 = i4 + 1;
                    aVar7 = aVar7;
                    v2fVar3 = v2fVar3;
                }
                v2fVar = v2fVar3;
                aVar = aVar7;
                i = 3;
            } else {
                v2fVar = v2fVar3;
                aVar = aVar7;
                String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                i = 3;
                Log.isLoggable("FirebaseCrashlytics", 3);
            }
        }
        Log.isLoggable("FirebaseCrashlytics", i);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ds6) it.next()).getClass();
            Log.isLoggable("FirebaseCrashlytics", i);
        }
        lb7 lb7Var = new lb7(context2, 28);
        try {
            String packageName2 = context2.getPackageName();
            String d = c6vVar.d();
            PackageInfo packageInfo = context2.getPackageManager().getPackageInfo(packageName2, 0);
            String l = Long.toString(packageInfo.getLongVersionCode());
            String str3 = packageInfo.versionName;
            if (str3 == null) {
                str3 = ProviderParameters.DEFAULT_PRODUCT_VER;
            }
            String str4 = str3;
            yx1Var = new yx1(str2, string, arrayList, d, packageName2, l, str4, lb7Var);
            Log.isLoggable("FirebaseCrashlytics", 2);
            wvu wvuVar = new wvu();
            String d2 = c6vVar.d();
            t2x0 t2x0Var = new t2x0();
            qc20 qc20Var = new qc20(t2x0Var);
            gp50 gp50Var = new gp50(q1rVar2);
            Locale locale = Locale.US;
            cjx cjxVar = new cjx(oyr.p("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str2, "/settings"), wvuVar);
            String str5 = Build.MANUFACTURER;
            String str6 = c6v.h;
            String p = g8e.p(str5.replaceAll(str6, ""), "/", Build.MODEL.replaceAll(str6, ""));
            String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str6, "");
            String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str6, "");
            int e5 = CommonUtils.e(context2, "com.google.firebase.crashlytics.mapping_file_id", "string");
            if (e5 == 0) {
                e5 = CommonUtils.e(context2, "com.crashlytics.android.build_id", "string");
            }
            String[] strArr = {e5 != 0 ? context2.getResources().getString(e5) : null, str2, str4, l};
            ArrayList arrayList2 = new ArrayList();
            for (int i5 = 0; i5 < 4; i5++) {
                String str7 = strArr[i5];
                if (str7 != null) {
                    arrayList2.add(str7.replace("-", "").toLowerCase(Locale.US));
                }
            }
            Collections.sort(arrayList2);
            StringBuilder sb = new StringBuilder();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                sb.append((String) it2.next());
            }
            String sb2 = sb.toString();
            aVar2 = new com.google.firebase.crashlytics.internal.settings.a(context2, new ycr0(str2, p, replaceAll, replaceAll2, c6vVar, sb2.length() > 0 ? CommonUtils.i(sb2) : null, str4, l, (d2 != null ? DeliveryMechanism.APP_STORE : DeliveryMechanism.DEVELOPER).a()), t2x0Var, qc20Var, gp50Var, cjxVar, uo2Var);
            aVar2.c(aVar4).e(executorService3, new yhl(24));
            v2fVar2 = v2fVar;
            q1rVar = v2fVar2.j;
            context = v2fVar2.a;
        } catch (PackageManager.NameNotFoundException e6) {
            Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e6);
            firebaseCrashlytics = null;
        }
        if (context != null && (resources = context.getResources()) != null) {
            int e7 = CommonUtils.e(context, "com.crashlytics.RequireBuildId", "bool");
            if (e7 > 0) {
                z = resources.getBoolean(e7);
            } else {
                int e8 = CommonUtils.e(context, "com.crashlytics.RequireBuildId", "string");
                if (e8 > 0) {
                    z = Boolean.parseBoolean(context.getString(e8));
                }
            }
            String str8 = (String) yx1Var.b;
            if (z) {
                Log.isLoggable("FirebaseCrashlytics", 2);
            } else if (TextUtils.isEmpty(str8)) {
                Log.e("FirebaseCrashlytics", Extension.DOT_CHAR);
                Log.e("FirebaseCrashlytics", ".     |  | ");
                Log.e("FirebaseCrashlytics", ".     |  |");
                Log.e("FirebaseCrashlytics", ".     |  |");
                Log.e("FirebaseCrashlytics", ".   \\ |  | /");
                Log.e("FirebaseCrashlytics", ".    \\    /");
                Log.e("FirebaseCrashlytics", ".     \\  /");
                Log.e("FirebaseCrashlytics", ".      \\/");
                Log.e("FirebaseCrashlytics", Extension.DOT_CHAR);
                Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                Log.e("FirebaseCrashlytics", Extension.DOT_CHAR);
                Log.e("FirebaseCrashlytics", ".      /\\");
                Log.e("FirebaseCrashlytics", ".     /  \\");
                Log.e("FirebaseCrashlytics", ".    /    \\");
                Log.e("FirebaseCrashlytics", ".   / |  | \\");
                Log.e("FirebaseCrashlytics", ".     |  |");
                Log.e("FirebaseCrashlytics", ".     |  |");
                Log.e("FirebaseCrashlytics", ".     |  |");
                Log.e("FirebaseCrashlytics", Extension.DOT_CHAR);
                ny61.r("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                return null;
            }
            String str9 = new f87().a;
            v2fVar2.f = new lb7("crash_marker", q1rVar);
            v2fVar2.e = new lb7("initialization_marker", q1rVar);
            com.google.firebase.crashlytics.internal.concurrency.a aVar8 = aVar;
            jp21 jp21Var = new jp21(str9, q1rVar, aVar8);
            lb7 lb7Var2 = new lb7(q1rVar);
            kjz kjzVar = new kjz(new yyt0[]{new axi0(10)});
            ((cg70) v2fVar2.o.a).a(new yci0());
            v2fVar2.h = new com.google.firebase.crashlytics.internal.common.a(v2fVar2.a, v2fVar2.i, v2fVar2.b, v2fVar2.j, v2fVar2.f, yx1Var, jp21Var, lb7Var2, u0r0.d(v2fVar2.a, v2fVar2.i, v2fVar2.j, yx1Var, lb7Var2, jp21Var, kjzVar, aVar2, v2fVar2.c, v2fVar2.m, v2fVar2.p), v2fVar2.n, v2fVar2.l, v2fVar2.m, v2fVar2.p);
            lb7 lb7Var3 = v2fVar2.e;
            q1r q1rVar3 = (q1r) lb7Var3.b;
            String str10 = (String) lb7Var3.c;
            q1rVar3.getClass();
            exists = new File(q1rVar3.c, str10).exists();
            v2fVar2.g = Boolean.TRUE.equals((Boolean) ((ExecutorService) aVar8.a.b).submit(new s2f(0, v2fVar2)).get(3L, TimeUnit.SECONDS));
            com.google.firebase.crashlytics.internal.common.a aVar9 = v2fVar2.h;
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            aVar9.e.a.a(new iy2(8, aVar9, str9));
            j3f j3fVar = new j3f(new vit(14, aVar9), aVar2, defaultUncaughtExceptionHandler, aVar9.j);
            aVar9.n = j3fVar;
            Thread.setDefaultUncaughtExceptionHandler(j3fVar);
            if (exists || (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                Log.isLoggable("FirebaseCrashlytics", 3);
                aVar8.a.a(new iy2(9, v2fVar2, aVar2));
            } else {
                Log.isLoggable("FirebaseCrashlytics", 3);
                v2fVar2.b(aVar2);
            }
            firebaseCrashlytics = new FirebaseCrashlytics(v2fVar2);
            if (System.currentTimeMillis() - currentTimeMillis > 16) {
                Log.isLoggable("FirebaseCrashlytics", 3);
            }
            return firebaseCrashlytics;
        }
        z = true;
        String str82 = (String) yx1Var.b;
        if (z) {
        }
        String str92 = new f87().a;
        v2fVar2.f = new lb7("crash_marker", q1rVar);
        v2fVar2.e = new lb7("initialization_marker", q1rVar);
        com.google.firebase.crashlytics.internal.concurrency.a aVar82 = aVar;
        jp21 jp21Var2 = new jp21(str92, q1rVar, aVar82);
        lb7 lb7Var22 = new lb7(q1rVar);
        kjz kjzVar2 = new kjz(new yyt0[]{new axi0(10)});
        ((cg70) v2fVar2.o.a).a(new yci0());
        v2fVar2.h = new com.google.firebase.crashlytics.internal.common.a(v2fVar2.a, v2fVar2.i, v2fVar2.b, v2fVar2.j, v2fVar2.f, yx1Var, jp21Var2, lb7Var22, u0r0.d(v2fVar2.a, v2fVar2.i, v2fVar2.j, yx1Var, lb7Var22, jp21Var2, kjzVar2, aVar2, v2fVar2.c, v2fVar2.m, v2fVar2.p), v2fVar2.n, v2fVar2.l, v2fVar2.m, v2fVar2.p);
        lb7 lb7Var32 = v2fVar2.e;
        q1r q1rVar32 = (q1r) lb7Var32.b;
        String str102 = (String) lb7Var32.c;
        q1rVar32.getClass();
        exists = new File(q1rVar32.c, str102).exists();
        v2fVar2.g = Boolean.TRUE.equals((Boolean) ((ExecutorService) aVar82.a.b).submit(new s2f(0, v2fVar2)).get(3L, TimeUnit.SECONDS));
        com.google.firebase.crashlytics.internal.common.a aVar92 = v2fVar2.h;
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
        aVar92.e.a.a(new iy2(8, aVar92, str92));
        j3f j3fVar2 = new j3f(new vit(14, aVar92), aVar2, defaultUncaughtExceptionHandler2, aVar92.j);
        aVar92.n = j3fVar2;
        Thread.setDefaultUncaughtExceptionHandler(j3fVar2);
        if (exists) {
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
        aVar82.a.a(new iy2(9, v2fVar2, aVar2));
        firebaseCrashlytics = new FirebaseCrashlytics(v2fVar2);
        if (System.currentTimeMillis() - currentTimeMillis > 16) {
        }
        return firebaseCrashlytics;
    }

    public void l(String str) {
        pgz pgzVar = ((com.yandex.plus.home.plaque.feature.internal.presentation.a) this.a).b;
        LogPriority logPriority = LogPriority.ERROR;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "PlaqueViewControllerImpl", str);
        }
    }

    @Override // defpackage.pi
    public boolean o(View view, hi hiVar) {
        boolean lambda$new$0;
        lambda$new$0 = ((DrawerLayout) this.a).lambda$new$0(view, hiVar);
        return lambda$new$0;
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        tls tlsVar = (tls) this.a;
        k751 k751Var = n751Var.a;
        if (!k751Var.o()) {
            u1w g = k751Var.g(519);
            u1w g2 = k751Var.g(8);
            t1w t1wVar = (t1w) tlsVar.invoke(new t1w(g.a, g.b, g.c, g.d, k751Var.q(8) ? Integer.valueOf(g2.d) : null));
            if (t1wVar != null) {
                int i = t1wVar.a;
                int i2 = t1wVar.b;
                int i3 = t1wVar.c;
                Integer num = t1wVar.e;
                return k751Var.n(i, i2, i3, Math.max(num != null ? num.intValue() : 0, t1wVar.d));
            }
        }
        return n751Var;
    }

    @Override // defpackage.t070
    public void onSuccess(Object obj) {
        boolean z;
        dxz0 dxz0Var = (dxz0) obj;
        if (!((FirebaseMessaging) this.a).e.g() || dxz0Var.h.a() == null) {
            return;
        }
        synchronized (dxz0Var) {
            z = dxz0Var.g;
        }
        if (z) {
            return;
        }
        dxz0Var.f(0L);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public void onWaitFinished() {
        D6.a((D6) this.a);
    }

    @Override // defpackage.m40
    public Activity provide() {
        return (Activity) this.a;
    }

    @Override // io.appmetrica.analytics.rtmwrapper.internal.RtmServiceReporter
    public void reportData(int i, Bundle bundle) {
        ((C0658ql) this.a).reportData(i, bundle);
    }

    @Override // defpackage.thw0
    public Object get() {
        return Kf.a((MviConfig.OptionalMetricsProvider) this.a);
    }
}
