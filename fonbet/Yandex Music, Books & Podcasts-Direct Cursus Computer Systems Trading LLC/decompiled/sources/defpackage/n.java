package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.a;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.etc.helper.HttpMessage;
import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.webos.lgcast.remotecamera.capture.CameraCapture;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraService;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.UnsafeAllocator;
import com.google.gson.internal.reflect.ReflectionHelper;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.impl.A6;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.Thread;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import ru.yandex.music.R;
import ru.yandex.music.support.complaint.ComplaintActivity;
import ru.yandex.music.utils.Assertions;
import ru.yandex.music.utils.Preconditions;

/* loaded from: classes5.dex */
public final /* synthetic */ class n implements ActivationBarrierCallback, yr6, z1s, gii, ic, CameraCapture.ErrorCallback, kd, dvr, aze, xz1, OnCompleteListener, fuc, nn5, ObjectConstructor, lu7, ag6, ra7, zs7, jpj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(37:3|(1:5)(1:164)|6|7|(1:9)|(1:11)(1:163)|12|(3:159|160|(44:162|28|(1:30)|31|(4:34|(3:36|37|38)(1:40)|39|32)|41|42|43|44|45|(1:47)|48|(1:50)|(1:52)(1:151)|53|(4:56|(2:58|59)(1:61)|60|54)|62|63|(2:66|64)|67|68|(1:70)(1:150)|(1:72)(1:149)|73|(5:136|(1:138)|139|400|144)(1:77)|78|(16:82|(1:84)(2:132|(1:134))|85|86|(2:88|(1:90))(2:128|(2:130|131))|91|92|93|94|95|96|97|(3:120|(1:122)|123)(3:105|(1:107)|108)|109|110|(2:112|(2:114|115)(1:117))(1:118))|135|86|(0)(0)|91|92|93|94|95|96|97|(2:99|101)|120|(0)|123|109|110|(0)(0)))(3:16|(3:155|156|(1:158))(4:20|(2:23|21)|24|25)|26)|27|28|(0)|31|(1:32)|41|42|43|44|45|(0)|48|(0)|(0)(0)|53|(1:54)|62|63|(1:64)|67|68|(0)(0)|(0)(0)|73|(1:75)|136|(0)|139|400) */
    /* JADX WARN: Can't wrap try/catch for region: R(44:162|28|(1:30)|31|(4:34|(3:36|37|38)(1:40)|39|32)|41|42|43|44|45|(1:47)|48|(1:50)|(1:52)(1:151)|53|(4:56|(2:58|59)(1:61)|60|54)|62|63|(2:66|64)|67|68|(1:70)(1:150)|(1:72)(1:149)|73|(5:136|(1:138)|139|400|144)(1:77)|78|(16:82|(1:84)(2:132|(1:134))|85|86|(2:88|(1:90))(2:128|(2:130|131))|91|92|93|94|95|96|97|(3:120|(1:122)|123)(3:105|(1:107)|108)|109|110|(2:112|(2:114|115)(1:117))(1:118))|135|86|(0)(0)|91|92|93|94|95|96|97|(2:99|101)|120|(0)|123|109|110|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x05b6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x05d3, code lost:
    
        android.util.Log.e(r10, "Crashlytics was not started due to an exception during initialization", r0);
        r6.g = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0634, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0635, code lost:
    
        r10 = "FirebaseCrashlytics";
        android.util.Log.e(r10, "Error retrieving app package info.", r0);
        r4 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0401 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0343 A[LOOP:3: B:64:0x033d->B:66:0x0343, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0460  */
    @Override // defpackage.nn5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object C(rdk rdkVar) {
        kp6 kp6Var;
        osh oshVar;
        int i;
        Throwable th;
        Iterator it;
        String str;
        long currentTimeMillis;
        int w;
        int i2;
        Iterator it2;
        hgp hgpVar;
        bpp i3;
        v97 v97Var;
        onx onxVar;
        Task m;
        xs0 xs0Var;
        boolean z;
        boolean exists;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        bpp i4;
        switch (this.a) {
            case 15:
                return this.b;
            default:
                CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.b;
                int i5 = CrashlyticsRegistrar.d;
                long currentTimeMillis2 = System.currentTimeMillis();
                aec aecVar = (aec) rdkVar.b(aec.class);
                iec iecVar = (iec) rdkVar.b(iec.class);
                owj C = rdkVar.C(op6.class);
                owj C2 = rdkVar.C(p70.class);
                owj C3 = rdkVar.C(rec.class);
                ExecutorService executorService = (ExecutorService) rdkVar.k(crashlyticsRegistrar.a);
                ExecutorService executorService2 = (ExecutorService) rdkVar.k(crashlyticsRegistrar.b);
                ExecutorService executorService3 = (ExecutorService) rdkVar.k(crashlyticsRegistrar.c);
                aecVar.a();
                Context context = aecVar.a;
                String packageName = context.getPackageName();
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 19.4.4 for " + packageName, null);
                executorService.getClass();
                executorService2.getClass();
                osh oshVar2 = new osh();
                oshVar2.a = new vq6(executorService);
                oshVar2.b = new vq6(executorService);
                ywf.w(null);
                oshVar2.c = new vq6(executorService2);
                jac jacVar = new jac(context);
                v97 v97Var2 = new v97(aecVar);
                uae uaeVar = new uae(context, packageName, iecVar, v97Var2);
                op6 op6Var = new op6(C);
                ehv ehvVar = new ehv(20);
                wul wulVar = new wul();
                s70 s70Var = new s70();
                s70Var.c = ehvVar;
                s70Var.b = new ArrayList();
                s70Var.a = wulVar;
                C2.a(new wb8());
                dp6 dp6Var = new dp6(v97Var2, jacVar);
                yec yecVar = yec.a;
                ymp ympVar = ymp.a;
                yec yecVar2 = yec.a;
                wec a = yec.a(ympVar);
                if (a.b != null) {
                    Log.d("SessionsDependencies", "Subscriber " + ympVar + " already registered.");
                } else {
                    a.b = dp6Var;
                    Log.d("SessionsDependencies", "Subscriber " + ympVar + " registered.");
                    a.a.b(null);
                }
                kp6 kp6Var2 = new kp6(aecVar, uaeVar, op6Var, v97Var2, new r70(s70Var), new r70(s70Var), jacVar, dp6Var, new f4m(4, C3), oshVar2);
                osh oshVar3 = kp6Var2.o;
                aecVar.a();
                String str2 = aecVar.c.b;
                int w2 = kg5.w(context, "com.google.firebase.crashlytics.mapping_file_id", PListParser.TAG_STRING);
                if (w2 == 0) {
                    w2 = kg5.w(context, "com.crashlytics.android.build_id", PListParser.TAG_STRING);
                }
                String string = w2 != 0 ? context.getResources().getString(w2) : null;
                ArrayList arrayList = new ArrayList();
                int w3 = kg5.w(context, "com.google.firebase.crashlytics.build_ids_lib", PListParser.TAG_ARRAY);
                int w4 = kg5.w(context, "com.google.firebase.crashlytics.build_ids_arch", PListParser.TAG_ARRAY);
                int w5 = kg5.w(context, "com.google.firebase.crashlytics.build_ids_build_id", PListParser.TAG_ARRAY);
                if (w3 == 0 || w4 == 0 || w5 == 0) {
                    kp6Var = kp6Var2;
                    oshVar = oshVar3;
                    String format = String.format("Could not find resources: %d %d %d", Integer.valueOf(w3), Integer.valueOf(w4), Integer.valueOf(w5));
                    i = 3;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        th = null;
                        Log.d("FirebaseCrashlytics", format, null);
                        String g = f1d.g("Mapping file ID is: ", string);
                        if (Log.isLoggable("FirebaseCrashlytics", i)) {
                            Log.d("FirebaseCrashlytics", g, th);
                        }
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            oj3 oj3Var = (oj3) it.next();
                            String str3 = oj3Var.a;
                            String str4 = oj3Var.b;
                            String str5 = oj3Var.c;
                            StringBuilder m2 = f1d.m("Build id for ", str3, " on ", str4, ": ");
                            m2.append(str5);
                            String sb = m2.toString();
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", sb, null);
                            }
                        }
                        xs0 a2 = xs0.a(context, uaeVar, str2, string, arrayList, new pt0(context, 22));
                        String str6 = "Installer package name is: " + a2.d;
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", str6, null);
                        }
                        b2c b2cVar = new b2c();
                        String str7 = a2.f;
                        String str8 = a2.g;
                        String d = uaeVar.d();
                        ddl ddlVar = new ddl();
                        c5p c5pVar = new c5p(1, ddlVar);
                        qr3 qr3Var = new qr3(jacVar);
                        Locale locale = Locale.US;
                        jpc jpcVar = new jpc(hrg.q("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str2, "/settings"), b2cVar);
                        String str9 = Build.MANUFACTURER;
                        String str10 = uae.h;
                        String o = ouj.o(str9.replaceAll(str10, ""), "/", Build.MODEL.replaceAll(str10, ""));
                        String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str10, "");
                        String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str10, "");
                        w = kg5.w(context, "com.google.firebase.crashlytics.mapping_file_id", PListParser.TAG_STRING);
                        if (w == 0) {
                            w = kg5.w(context, "com.crashlytics.android.build_id", PListParser.TAG_STRING);
                        }
                        String[] strArr = {w == 0 ? context.getResources().getString(w) : null, str2, str8, str7};
                        ArrayList arrayList2 = new ArrayList();
                        i2 = 0;
                        while (i2 < 4) {
                            String str11 = strArr[i2];
                            String[] strArr2 = strArr;
                            if (str11 != null) {
                                arrayList2.add(str11.replace("-", "").toLowerCase(Locale.US));
                            }
                            i2++;
                            strArr = strArr2;
                        }
                        Collections.sort(arrayList2);
                        StringBuilder sb2 = new StringBuilder();
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            sb2.append((String) it2.next());
                        }
                        String sb3 = sb2.toString();
                        fsp fspVar = new fsp(str2, o, replaceAll, replaceAll2, uaeVar, sb3.length() <= 0 ? kg5.J(sb3) : null, str8, str7, su4.c(d == null ? 4 : 1));
                        hgpVar = new hgp();
                        AtomicReference atomicReference = new AtomicReference();
                        hgpVar.h = atomicReference;
                        hgpVar.i = new AtomicReference(new i8s());
                        hgpVar.b = context;
                        hgpVar.c = fspVar;
                        hgpVar.e = ddlVar;
                        hgpVar.d = c5pVar;
                        hgpVar.f = qr3Var;
                        hgpVar.a = jpcVar;
                        hgpVar.g = v97Var2;
                        atomicReference.set(mvn.v(ddlVar));
                        AtomicReference atomicReference2 = (AtomicReference) hgpVar.i;
                        AtomicReference atomicReference3 = (AtomicReference) hgpVar.h;
                        if (((Context) hgpVar.b).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((fsp) hgpVar.c).f) || (i4 = hgpVar.i(1)) == null) {
                            i3 = hgpVar.i(3);
                            if (i3 != null) {
                                atomicReference3.set(i3);
                                ((i8s) atomicReference2.get()).d(i3);
                            }
                            v97Var = (v97) hgpVar.g;
                            onx onxVar2 = ((i8s) v97Var.h).a;
                            synchronized (v97Var.f) {
                                onxVar = ((i8s) v97Var.g).a;
                            }
                            m = y2x.F(onxVar2, onxVar).m((vq6) oshVar2.a, new y8p(1, hgpVar, oshVar2));
                        } else {
                            atomicReference3.set(i4);
                            ((i8s) atomicReference2.get()).d(i4);
                            m = ywf.w(null);
                        }
                        m.c(executorService3, new kac(5));
                        kp6 kp6Var3 = kp6Var;
                        jac jacVar2 = kp6Var3.i;
                        Context context2 = kp6Var3.a;
                        if (context2 != null && (resources = context2.getResources()) != null) {
                            int w6 = kg5.w(context2, "com.crashlytics.RequireBuildId", "bool");
                            if (w6 > 0) {
                                z = resources.getBoolean(w6);
                            } else {
                                int w7 = kg5.w(context2, "com.crashlytics.RequireBuildId", PListParser.TAG_STRING);
                                if (w7 > 0) {
                                    z = Boolean.parseBoolean(context2.getString(w7));
                                }
                            }
                            xs0Var = a2;
                            String str12 = xs0Var.b;
                            if (z) {
                                str = "FirebaseCrashlytics";
                                if (Log.isLoggable(str, 2)) {
                                    Log.v(str, "Configured not to require a build ID.", null);
                                }
                            } else {
                                str = "FirebaseCrashlytics";
                                if (TextUtils.isEmpty(str12)) {
                                    Log.e(str, ".");
                                    Log.e(str, ".     |  | ");
                                    Log.e(str, ".     |  |");
                                    Log.e(str, ".     |  |");
                                    Log.e(str, ".   \\ |  | /");
                                    Log.e(str, ".    \\    /");
                                    Log.e(str, ".     \\  /");
                                    Log.e(str, ".      \\/");
                                    Log.e(str, ".");
                                    Log.e(str, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                                    Log.e(str, ".");
                                    Log.e(str, ".      /\\");
                                    Log.e(str, ".     /  \\");
                                    Log.e(str, ".    /    \\");
                                    Log.e(str, ".   / |  | \\");
                                    Log.e(str, ".     |  |");
                                    Log.e(str, ".     |  |");
                                    Log.e(str, ".     |  |");
                                    Log.e(str, ".");
                                    xq0.q("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                                    return null;
                                }
                            }
                            String str13 = new wn3().a;
                            kp6Var3.f = new nnk("crash_marker", jacVar2);
                            kp6Var3.e = new nnk("initialization_marker", jacVar2);
                            osh oshVar4 = oshVar;
                            rn5 rn5Var = new rn5(str13, jacVar2, oshVar4);
                            yfx yfxVar = new yfx(jacVar2);
                            ear[] earVarArr = {new t7l(2)};
                            j6e j6eVar = new j6e();
                            j6eVar.a = earVarArr;
                            int i6 = 27;
                            j6eVar.b = new wvo(i6);
                            ((owj) kp6Var3.n.b).a(new l1j(i6));
                            xs0 xs0Var2 = xs0Var;
                            kp6Var3.g = new gp6(kp6Var3.a, kp6Var3.h, kp6Var3.b, kp6Var3.i, kp6Var3.f, xs0Var2, rn5Var, yfxVar, jac.f(kp6Var3.a, kp6Var3.h, kp6Var3.i, xs0Var2, yfxVar, rn5Var, j6eVar, hgpVar, kp6Var3.c, kp6Var3.l, kp6Var3.o), kp6Var3.m, kp6Var3.k, kp6Var3.l, kp6Var3.o);
                            nnk nnkVar = kp6Var3.e;
                            jac jacVar3 = (jac) nnkVar.b;
                            String str14 = (String) nnkVar.a;
                            jacVar3.getClass();
                            exists = new File((File) jacVar3.c, str14).exists();
                            Boolean.TRUE.equals((Boolean) ((ExecutorService) ((vq6) oshVar4.a).b).submit(new tn3(1, kp6Var3)).get(3L, TimeUnit.SECONDS));
                            gp6 gp6Var = kp6Var3.g;
                            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                            ((vq6) gp6Var.e.a).d(new qf0(19, gp6Var, str13));
                            uq6 uq6Var = new uq6(new efo(18, gp6Var), hgpVar, defaultUncaughtExceptionHandler, gp6Var.j);
                            gp6Var.n = uq6Var;
                            Thread.setDefaultUncaughtExceptionHandler(uq6Var);
                            if (exists || (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                                if (Log.isLoggable(str, 3)) {
                                    Log.d(str, "Successfully configured exception handler.", null);
                                }
                                ((vq6) oshVar4.a).d(new hp6(kp6Var3, hgpVar, 0));
                            } else {
                                if (Log.isLoggable(str, 3)) {
                                    Log.d(str, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                                }
                                kp6Var3.b(hgpVar);
                            }
                            bec becVar = new bec(kp6Var3);
                            currentTimeMillis = System.currentTimeMillis() - currentTimeMillis2;
                            if (currentTimeMillis > 16) {
                                return becVar;
                            }
                            String e = dfi.e(currentTimeMillis, "Initializing Crashlytics blocked main for ", " ms");
                            if (!Log.isLoggable(str, 3)) {
                                return becVar;
                            }
                            Log.d(str, e, null);
                            return becVar;
                        }
                        xs0Var = a2;
                        z = true;
                        String str122 = xs0Var.b;
                        if (z) {
                        }
                        String str132 = new wn3().a;
                        kp6Var3.f = new nnk("crash_marker", jacVar2);
                        kp6Var3.e = new nnk("initialization_marker", jacVar2);
                        osh oshVar42 = oshVar;
                        rn5 rn5Var2 = new rn5(str132, jacVar2, oshVar42);
                        yfx yfxVar2 = new yfx(jacVar2);
                        ear[] earVarArr2 = {new t7l(2)};
                        j6e j6eVar2 = new j6e();
                        j6eVar2.a = earVarArr2;
                        int i62 = 27;
                        j6eVar2.b = new wvo(i62);
                        ((owj) kp6Var3.n.b).a(new l1j(i62));
                        xs0 xs0Var22 = xs0Var;
                        kp6Var3.g = new gp6(kp6Var3.a, kp6Var3.h, kp6Var3.b, kp6Var3.i, kp6Var3.f, xs0Var22, rn5Var2, yfxVar2, jac.f(kp6Var3.a, kp6Var3.h, kp6Var3.i, xs0Var22, yfxVar2, rn5Var2, j6eVar2, hgpVar, kp6Var3.c, kp6Var3.l, kp6Var3.o), kp6Var3.m, kp6Var3.k, kp6Var3.l, kp6Var3.o);
                        nnk nnkVar2 = kp6Var3.e;
                        jac jacVar32 = (jac) nnkVar2.b;
                        String str142 = (String) nnkVar2.a;
                        jacVar32.getClass();
                        exists = new File((File) jacVar32.c, str142).exists();
                        Boolean.TRUE.equals((Boolean) ((ExecutorService) ((vq6) oshVar42.a).b).submit(new tn3(1, kp6Var3)).get(3L, TimeUnit.SECONDS));
                        gp6 gp6Var2 = kp6Var3.g;
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
                        ((vq6) gp6Var2.e.a).d(new qf0(19, gp6Var2, str132));
                        uq6 uq6Var2 = new uq6(new efo(18, gp6Var2), hgpVar, defaultUncaughtExceptionHandler2, gp6Var2.j);
                        gp6Var2.n = uq6Var2;
                        Thread.setDefaultUncaughtExceptionHandler(uq6Var2);
                        if (exists) {
                        }
                        if (Log.isLoggable(str, 3)) {
                        }
                        ((vq6) oshVar42.a).d(new hp6(kp6Var3, hgpVar, 0));
                        bec becVar2 = new bec(kp6Var3);
                        currentTimeMillis = System.currentTimeMillis() - currentTimeMillis2;
                        if (currentTimeMillis > 16) {
                        }
                    }
                } else {
                    String[] stringArray = context.getResources().getStringArray(w3);
                    String[] stringArray2 = context.getResources().getStringArray(w4);
                    String[] stringArray3 = context.getResources().getStringArray(w5);
                    if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                        int i7 = 0;
                        while (i7 < stringArray3.length) {
                            int i8 = i7;
                            arrayList.add(new oj3(stringArray[i8], stringArray2[i8], stringArray3[i8]));
                            i7 = i8 + 1;
                            oshVar3 = oshVar3;
                            kp6Var2 = kp6Var2;
                        }
                        kp6Var = kp6Var2;
                        oshVar = oshVar3;
                    } else {
                        kp6Var = kp6Var2;
                        oshVar = oshVar3;
                        String format2 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", format2, null);
                        }
                    }
                    i = 3;
                }
                th = null;
                String g2 = f1d.g("Mapping file ID is: ", string);
                if (Log.isLoggable("FirebaseCrashlytics", i)) {
                }
                it = arrayList.iterator();
                while (it.hasNext()) {
                }
                xs0 a22 = xs0.a(context, uaeVar, str2, string, arrayList, new pt0(context, 22));
                String str62 = "Installer package name is: " + a22.d;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                }
                b2c b2cVar2 = new b2c();
                String str72 = a22.f;
                String str82 = a22.g;
                String d2 = uaeVar.d();
                ddl ddlVar2 = new ddl();
                c5p c5pVar2 = new c5p(1, ddlVar2);
                qr3 qr3Var2 = new qr3(jacVar);
                Locale locale2 = Locale.US;
                jpc jpcVar2 = new jpc(hrg.q("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str2, "/settings"), b2cVar2);
                String str92 = Build.MANUFACTURER;
                String str102 = uae.h;
                String o2 = ouj.o(str92.replaceAll(str102, ""), "/", Build.MODEL.replaceAll(str102, ""));
                String replaceAll3 = Build.VERSION.INCREMENTAL.replaceAll(str102, "");
                String replaceAll22 = Build.VERSION.RELEASE.replaceAll(str102, "");
                w = kg5.w(context, "com.google.firebase.crashlytics.mapping_file_id", PListParser.TAG_STRING);
                if (w == 0) {
                }
                String[] strArr3 = {w == 0 ? context.getResources().getString(w) : null, str2, str82, str72};
                ArrayList arrayList22 = new ArrayList();
                i2 = 0;
                while (i2 < 4) {
                }
                Collections.sort(arrayList22);
                StringBuilder sb22 = new StringBuilder();
                it2 = arrayList22.iterator();
                while (it2.hasNext()) {
                }
                String sb32 = sb22.toString();
                fsp fspVar2 = new fsp(str2, o2, replaceAll3, replaceAll22, uaeVar, sb32.length() <= 0 ? kg5.J(sb32) : null, str82, str72, su4.c(d2 == null ? 4 : 1));
                hgpVar = new hgp();
                AtomicReference atomicReference4 = new AtomicReference();
                hgpVar.h = atomicReference4;
                hgpVar.i = new AtomicReference(new i8s());
                hgpVar.b = context;
                hgpVar.c = fspVar2;
                hgpVar.e = ddlVar2;
                hgpVar.d = c5pVar2;
                hgpVar.f = qr3Var2;
                hgpVar.a = jpcVar2;
                hgpVar.g = v97Var2;
                atomicReference4.set(mvn.v(ddlVar2));
                AtomicReference atomicReference22 = (AtomicReference) hgpVar.i;
                AtomicReference atomicReference32 = (AtomicReference) hgpVar.h;
                if (((Context) hgpVar.b).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((fsp) hgpVar.c).f)) {
                }
                i3 = hgpVar.i(3);
                if (i3 != null) {
                }
                v97Var = (v97) hgpVar.g;
                onx onxVar22 = ((i8s) v97Var.h).a;
                synchronized (v97Var.f) {
                }
                break;
        }
    }

    @Override // defpackage.jpj
    public kqv G(View view, kqv kqvVar) {
        gc8 gc8Var = (gc8) this.b;
        view.getClass();
        zne g = kqvVar.a.g(647);
        g.getClass();
        sk3.U(gc8Var, g);
        return kqvVar;
    }

    @Override // defpackage.dvr
    public void a() {
        sld sldVar = ((rg4) this.b).a;
        if (sldVar != null) {
            bw1 bw1Var = (bw1) sldVar.b;
            bw1Var.b = true;
            bw1Var.p(true);
        }
    }

    @Override // defpackage.kd
    /* renamed from: b */
    public void mo33b(Object obj) {
        t46 t46Var;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 9:
                kb4 kb4Var = (kb4) obj2;
                if (kb4Var.c) {
                    kb4Var.b.setClipBounds(null);
                    break;
                }
                break;
            default:
                x46 x46Var = (x46) obj2;
                w46 w46Var = (w46) obj;
                if (w46Var.ordinal() == 0) {
                    if (x46Var.f != null) {
                        c3x.B(x46Var.a);
                        u46 u46Var = (u46) x46Var.f.b;
                        Assertions.assertTrue(u46.a(u46Var), "onSendClick(): invalid input");
                        if (u46.a(u46Var) && (t46Var = u46Var.b) != null) {
                            x7c x7cVar = (x7c) Preconditions.nonNull(u46Var.c);
                            mrr mrrVar = (mrr) Preconditions.nonNull(u46Var.d);
                            String str = (String) Preconditions.nonNull(u46Var.e);
                            String str2 = u46Var.f;
                            String obj3 = u46Var.a.b.isChecked() ? u46Var.a.a.getText().toString() : null;
                            x7cVar.getClass();
                            mrrVar.getClass();
                            str.getClass();
                            if (str2 != null) {
                                str = ouj.o(str, "\n\n", str2);
                            }
                            ggp ggpVar = new ggp();
                            Bundle bundle = new Bundle();
                            bundle.putSerializable("arg_topic", x7cVar);
                            bundle.putSerializable("arg_source", mrrVar);
                            bundle.putString("arg_email", obj3);
                            bundle.putString("arg_message", str);
                            ggpVar.setArguments(bundle);
                            y supportFragmentManager = ((t) Preconditions.nonNull(t46Var.l())).getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            a aVar = new a(supportFragmentManager);
                            aVar.e(R.id.content_frame, ggpVar, null);
                            aVar.c(null);
                            aVar.j();
                            break;
                        }
                    }
                } else {
                    Assertions.fail("setOnItemClickListener(): unhandled item " + w46Var);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.xz1
    public String c() {
        return ((fi4) this.b).d.a();
    }

    @Override // defpackage.yr6
    public void d(cvl cvlVar) {
        el elVar = (el) this.b;
        cvlVar.getClass();
        elVar.b.invoke();
    }

    @Override // defpackage.ra7
    public ta7 e() {
        return (ta7) ((el7) this.b).invoke();
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object f() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 18:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e) {
                    ReflectionHelper.RecordHelper recordHelper = ReflectionHelper.a;
                    kac.k("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                    return null;
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.b(constructor) + "' with no args", e2);
                } catch (InvocationTargetException e3) {
                    kac.k("Failed to invoke constructor '" + ReflectionHelper.b(constructor) + "' with no args", e3.getCause());
                    return null;
                }
            default:
                Class cls = (Class) obj;
                try {
                    return UnsafeAllocator.a.a(cls);
                } catch (Exception e4) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e4);
                }
        }
    }

    @Override // defpackage.z1s
    public int g() {
        int tabMaxWidth;
        tabMaxWidth = ((qr2) this.b).getTabMaxWidth();
        return tabMaxWidth;
    }

    @Override // defpackage.zs7
    public qsn h(int i, xvs xvsVar, int[] iArr) {
        androidx.media3.exoplayer.trackselection.a aVar = (androidx.media3.exoplayer.trackselection.a) this.b;
        tde u = yde.u();
        for (int i2 = 0; i2 < xvsVar.a; i2++) {
            u.a(new ss7(i, xvsVar, i2, aVar, iArr[i2]));
        }
        return u.f();
    }

    @Override // defpackage.aze
    public void i(int i, Object obj) {
        q2 q2Var = (q2) this.b;
        obj.getClass();
        q2Var.invoke(obj, Integer.valueOf(i));
    }

    @Override // defpackage.lu7
    public void j(uzm uzmVar) {
        op6 op6Var = (op6) this.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        op6Var.b.set((op6) uzmVar.get());
    }

    @Override // defpackage.fuc
    public void k(Bundle bundle, String str) {
        ComplaintActivity complaintActivity = (ComplaintActivity) this.b;
        int i = ComplaintActivity.v;
        complaintActivity.finish();
    }

    public wx0 l(nsh nshVar) {
        p94 p94Var = (p94) this.b;
        URL url = (URL) nshVar.b;
        String z = tyf.z("CctTransportBackend");
        if (Log.isLoggable(z, 4)) {
            Log.i(z, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(p94Var.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(ServiceCommand.TYPE_POST);
        httpURLConnection.setRequestProperty(HttpMessage.USER_AGENT, "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty(HttpMessage.CONTENT_TYPE_HEADER, "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) nshVar.d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    cib cibVar = p94Var.a;
                    mb2 mb2Var = (mb2) nshVar.c;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    r4f r4fVar = (r4f) cibVar.b;
                    q7f q7fVar = new q7f(bufferedWriter, r4fVar.a, r4fVar.b, r4fVar.c, r4fVar.d);
                    q7fVar.h(mb2Var);
                    q7fVar.j();
                    q7fVar.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String z2 = tyf.z("CctTransportBackend");
                    if (Log.isLoggable(z2, 4)) {
                        Log.i(z2, String.format("Status Code: %d", valueOf));
                    }
                    tyf.q("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField(HttpMessage.CONTENT_TYPE_HEADER));
                    tyf.q("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new wx0(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new wx0(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            wx0 wx0Var = new wx0(responseCode, null, od2.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return wx0Var;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (ConnectException e) {
            e = e;
            tyf.s("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new wx0(500, null, 0L);
        } catch (UnknownHostException e2) {
            e = e2;
            tyf.s("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new wx0(500, null, 0L);
        } catch (IOException e3) {
            e = e3;
            tyf.s("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new wx0(400, null, 0L);
        } catch (r6b e4) {
            e = e4;
            tyf.s("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new wx0(400, null, 0L);
        }
    }

    public List m() {
        return (ArrayList) this.b;
    }

    public void n(long j, long j2) {
        hka hkaVar = ((dx6) this.b).d;
        if (hkaVar == null) {
            return;
        }
        hkaVar.c((j == -1 || j == 0) ? -1.0f : (j2 * 100.0f) / j, j2);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        dk4 dk4Var = (dk4) this.b;
        task.getClass();
        if (task.l()) {
            dk4Var.d();
        }
    }

    @Override // com.connectsdk.service.webos.lgcast.remotecamera.capture.CameraCapture.ErrorCallback
    public void onError(String str) {
        ((CameraService) this.b).lambda$startCameraPreview$1(str);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public void onWaitFinished() {
        A6.a((A6) this.b);
    }

    @Override // defpackage.ag6
    public Object p(Task task) {
        switch (this.a) {
            case 22:
                return (Task) ((ep6) this.b).call();
            default:
                ((Runnable) this.b).run();
                return ywf.w(null);
        }
    }

    @Override // defpackage.ic
    public boolean r(View view) {
        cf3 cf3Var = (cf3) this.b;
        int i = cf3.j;
        return cf3Var.c();
    }
}
