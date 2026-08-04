package com.gamericefishpro.space.va;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.work.Worker;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.b9.c;
import com.gamericefishpro.space.cb.j;
import com.gamericefishpro.space.h0.z0;
import com.gamericefishpro.space.i9.b0;
import com.gamericefishpro.space.i9.l0;
import com.gamericefishpro.space.i9.r8;
import com.gamericefishpro.space.i9.t0;
import com.gamericefishpro.space.i9.y;
import com.gamericefishpro.space.i9.z;
import com.gamericefishpro.space.l6.q;
import com.gamericefishpro.space.lb.e;
import com.gamericefishpro.space.m.d;
import com.gamericefishpro.space.n.f;
import com.gamericefishpro.space.n.z1;
import com.gamericefishpro.space.n9.a2;
import com.gamericefishpro.space.n9.a4;
import com.gamericefishpro.space.n9.b2;
import com.gamericefishpro.space.n9.b3;
import com.gamericefishpro.space.n9.d1;
import com.gamericefishpro.space.n9.d2;
import com.gamericefishpro.space.n9.e0;
import com.gamericefishpro.space.n9.e1;
import com.gamericefishpro.space.n9.e2;
import com.gamericefishpro.space.n9.f1;
import com.gamericefishpro.space.n9.f2;
import com.gamericefishpro.space.n9.g;
import com.gamericefishpro.space.n9.g1;
import com.gamericefishpro.space.n9.g2;
import com.gamericefishpro.space.n9.h0;
import com.gamericefishpro.space.n9.h1;
import com.gamericefishpro.space.n9.i2;
import com.gamericefishpro.space.n9.j3;
import com.gamericefishpro.space.n9.m0;
import com.gamericefishpro.space.n9.m3;
import com.gamericefishpro.space.n9.m4;
import com.gamericefishpro.space.n9.n3;
import com.gamericefishpro.space.n9.o;
import com.gamericefishpro.space.n9.o0;
import com.gamericefishpro.space.n9.o3;
import com.gamericefishpro.space.n9.p;
import com.gamericefishpro.space.n9.p1;
import com.gamericefishpro.space.n9.r1;
import com.gamericefishpro.space.n9.r3;
import com.gamericefishpro.space.n9.r4;
import com.gamericefishpro.space.n9.t2;
import com.gamericefishpro.space.n9.t4;
import com.gamericefishpro.space.n9.u4;
import com.gamericefishpro.space.n9.v0;
import com.gamericefishpro.space.n9.w3;
import com.gamericefishpro.space.n9.y1;
import com.gamericefishpro.space.n9.y2;
import com.gamericefishpro.space.o4.i;
import com.gamericefishpro.space.oh.n;
import com.gamericefishpro.space.pi.h;
import com.gamericefishpro.space.pi.w0;
import com.gamericefishpro.space.r9.k;
import com.gamericefishpro.space.u6.l;
import com.gamericefishpro.space.u6.s;
import com.gamericefishpro.space.v8.c0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ int d;
    public Object e;
    public final Object i;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.i = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:102:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:105:0x02de  */
    /* JADX WARN: Code duplicated, block: B:108:0x02f2 A[EDGE_INSN: B:108:0x02f2->B:109:0x02f4 BREAK  A[LOOP:1: B:103:0x02d8->B:316:?]] */
    /* JADX WARN: Code duplicated, block: B:110:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:111:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:114:0x031a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0364  */
    /* JADX WARN: Code duplicated, block: B:117:0x036d  */
    /* JADX WARN: Code duplicated, block: B:120:0x038f  */
    /* JADX WARN: Code duplicated, block: B:123:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:124:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:127:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:130:0x03df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:132:0x03e2 A[PHI: r13
      0x03e2: PHI (r13v11 boolean) = (r13v8 boolean), (r13v7 boolean) binds: [B:131:0x03e1, B:128:0x03dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:134:0x040b  */
    /* JADX WARN: Code duplicated, block: B:135:0x0413  */
    /* JADX WARN: Code duplicated, block: B:138:0x0428  */
    /* JADX WARN: Code duplicated, block: B:141:0x0468 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x0470  */
    /* JADX WARN: Code duplicated, block: B:146:0x0488  */
    /* JADX WARN: Code duplicated, block: B:148:0x049d A[PHI: r32 r33
      0x049d: PHI (r32v3 com.gamericefishpro.space.n9.t0) = (r32v0 com.gamericefishpro.space.n9.t0), (r32v4 com.gamericefishpro.space.n9.t0) binds: [B:145:0x0486, B:143:0x046b] A[DONT_GENERATE, DONT_INLINE]
      0x049d: PHI (r33v3 com.gamericefishpro.space.n9.r4) = (r33v0 com.gamericefishpro.space.n9.r4), (r33v4 com.gamericefishpro.space.n9.r4) binds: [B:145:0x0486, B:143:0x046b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:150:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:151:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:161:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:163:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:164:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:167:0x0502  */
    /* JADX WARN: Code duplicated, block: B:170:0x0512  */
    /* JADX WARN: Code duplicated, block: B:173:0x0531  */
    /* JADX WARN: Code duplicated, block: B:175:0x053f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:179:0x0555  */
    /* JADX WARN: Code duplicated, block: B:181:0x0563 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:189:0x0587  */
    /* JADX WARN: Code duplicated, block: B:194:0x059e  */
    /* JADX WARN: Code duplicated, block: B:196:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:198:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:202:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:205:0x0609  */
    /* JADX WARN: Code duplicated, block: B:210:0x0622  */
    /* JADX WARN: Code duplicated, block: B:212:0x0628  */
    /* JADX WARN: Code duplicated, block: B:214:0x0632  */
    /* JADX WARN: Code duplicated, block: B:215:0x063d  */
    /* JADX WARN: Code duplicated, block: B:218:0x0647  */
    /* JADX WARN: Code duplicated, block: B:221:0x065d  */
    /* JADX WARN: Code duplicated, block: B:225:0x0669  */
    /* JADX WARN: Code duplicated, block: B:228:0x0677  */
    /* JADX WARN: Code duplicated, block: B:231:0x068b  */
    /* JADX WARN: Code duplicated, block: B:232:0x0690  */
    /* JADX WARN: Code duplicated, block: B:234:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:236:0x06c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:247:0x0738  */
    /* JADX WARN: Code duplicated, block: B:249:0x0754  */
    /* JADX WARN: Code duplicated, block: B:252:0x0760  */
    /* JADX WARN: Code duplicated, block: B:261:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:263:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:264:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:266:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:270:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:274:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:276:0x0809  */
    /* JADX WARN: Code duplicated, block: B:277:0x080b  */
    /* JADX WARN: Code duplicated, block: B:279:0x080e  */
    /* JADX WARN: Code duplicated, block: B:281:0x083f  */
    /* JADX WARN: Code duplicated, block: B:284:0x0855  */
    /* JADX WARN: Code duplicated, block: B:288:0x0869  */
    /* JADX WARN: Code duplicated, block: B:309:0x029d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x058f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:? A[LOOP:0: B:187:0x0581->B:313:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x02f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x017b A[Catch: NameNotFoundException -> 0x0198, TryCatch #1 {NameNotFoundException -> 0x0198, blocks: (B:35:0x0170, B:37:0x017b, B:39:0x0187), top: B:299:0x0170 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0187 A[Catch: NameNotFoundException -> 0x0198, TRY_LEAVE, TryCatch #1 {NameNotFoundException -> 0x0198, blocks: (B:35:0x0170, B:37:0x017b, B:39:0x0187), top: B:299:0x0170 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x018c  */
    /* JADX WARN: Code duplicated, block: B:50:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:52:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:54:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:56:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:58:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:60:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:65:0x0202  */
    /* JADX WARN: Code duplicated, block: B:66:0x020d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0218  */
    /* JADX WARN: Code duplicated, block: B:68:0x0223  */
    /* JADX WARN: Code duplicated, block: B:69:0x022e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0246  */
    /* JADX WARN: Code duplicated, block: B:74:0x0247  */
    /* JADX WARN: Code duplicated, block: B:77:0x024c A[Catch: IllegalStateException -> 0x025b, TRY_LEAVE, TryCatch #5 {IllegalStateException -> 0x025b, blocks: (B:71:0x023a, B:75:0x0248, B:77:0x024c), top: B:307:0x023a }] */
    /* JADX WARN: Code duplicated, block: B:83:0x027e  */
    /* JADX WARN: Code duplicated, block: B:85:0x028c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0293  */
    /* JADX WARN: Code duplicated, block: B:92:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:93:0x02ae A[Catch: NotFoundException -> 0x02b3, TRY_LEAVE, TryCatch #6 {NotFoundException -> 0x02b3, blocks: (B:90:0x029d, B:93:0x02ae), top: B:309:0x029d }] */
    /* JADX WARN: Code duplicated, block: B:99:0x02c3  */
    /* JADX WARN: Type inference failed for: r0v48, types: [com.gamericefishpro.space.n9.s2] */
    private final void a() throws Throwable {
        String str;
        t0 t0Var;
        String string;
        int i;
        String str2;
        PackageInfo packageInfo;
        CharSequence applicationLabel;
        int iG;
        List listAsList;
        r1 r1Var;
        Bundle bundleC;
        Integer numValueOf;
        String[] stringArray;
        y2 y2Var;
        com.gamericefishpro.space.n9.t0 t0Var2;
        com.gamericefishpro.space.n9.t0 t0Var3;
        com.gamericefishpro.space.n9.t0 t0Var4;
        com.gamericefishpro.space.n9.t0 t0Var5;
        String strX;
        int i2;
        AtomicInteger atomicInteger;
        long j;
        final t2 t2Var;
        int iW;
        boolean zB;
        boolean z;
        z0 z0Var;
        e2 e2VarY;
        int i3;
        b2 b2VarG;
        b2 b2VarG2;
        b2 b2Var;
        d2 d2Var;
        com.gamericefishpro.space.n9.t0 t0Var6;
        r4 r4Var;
        e2 e2Var;
        boolean z2;
        e2 e2Var2;
        r1 r1Var2;
        b2 b2VarG3;
        b2 b2VarG4;
        Bundle bundle;
        o oVarC;
        Iterator it;
        Boolean boolD;
        d1 d1Var;
        h1 h1Var;
        r1 r1Var3;
        r4 r4Var2;
        z0 z0Var2;
        v0 v0Var;
        boolean zB2;
        SharedPreferences sharedPreferences;
        boolean zContains;
        boolean zIsEmpty;
        boolean z3;
        long jMax;
        com.gamericefishpro.space.n9.t0 t0Var7;
        Context context;
        IntentFilter intentFilter;
        u4 u4Var;
        boolean z4;
        Context context2;
        Iterator it2;
        String str3;
        r4 r4Var3;
        String strB;
        r1 r1Var4 = (r1) this.i;
        g2 g2Var = (g2) this.e;
        p1 p1Var = r1Var4.z;
        v0 v0Var2 = r1Var4.y;
        f1 f1Var = r1Var4.w;
        r4 r4Var4 = r1Var4.B;
        r1.l(p1Var);
        p1Var.r();
        g gVar = r1Var4.v;
        ((r1) gVar.d).getClass();
        p pVar = new p(r1Var4);
        pVar.u();
        r1Var4.L = pVar;
        t0 t0Var8 = g2Var.d;
        m0 m0Var = new m0(r1Var4, g2Var.c, t0Var8 == null ? 0L : t0Var8.d);
        m0Var.t();
        r1Var4.M = m0Var;
        o0 o0Var = new o0(r1Var4);
        o0Var.t();
        r1Var4.J = o0Var;
        o3 o3Var = new o3(r1Var4);
        o3Var.t();
        r1Var4.K = o3Var;
        boolean z5 = r4Var4.e;
        r1 r1Var5 = (r1) r4Var4.d;
        if (z5) {
            throw new IllegalStateException("Can't initialize twice");
        }
        r4Var4.r();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                v0 v0Var3 = ((r1) r4Var4.d).y;
                r1.l(v0Var3);
                v0Var3.B.a("Utils falling back to Random for random id");
            }
        }
        r4Var4.v.set(jNextLong);
        r1Var5.V.incrementAndGet();
        r4Var4.e = true;
        if (f1Var.e) {
            throw new IllegalStateException("Can't initialize twice");
        }
        SharedPreferences sharedPreferences2 = ((r1) f1Var.d).d.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        f1Var.i = sharedPreferences2;
        boolean z6 = sharedPreferences2.getBoolean("has_been_opened", false);
        f1Var.K = z6;
        if (!z6) {
            SharedPreferences.Editor editorEdit = f1Var.i.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        f1Var.w = new e1(f1Var, Math.max(0L, ((Long) e0.d.a(null)).longValue()));
        ((r1) f1Var.d).V.incrementAndGet();
        f1Var.e = true;
        m0 m0Var2 = r1Var4.M;
        if (m0Var2.e) {
            throw new IllegalStateException("Can't initialize twice");
        }
        r1 r1Var6 = (r1) m0Var2.d;
        v0 v0Var4 = r1Var6.y;
        v0 v0Var5 = r1Var6.y;
        r1.l(v0Var4);
        v0Var4.G.c("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(m0Var2.C), Long.valueOf(m0Var2.B));
        Context context3 = r1Var6.d;
        String packageName = context3.getPackageName();
        PackageManager packageManager = context3.getPackageManager();
        String str4 = "";
        String str5 = "Unknown";
        String installerPackageName = "unknown";
        try {
            if (packageManager != null) {
                str = "Can't initialize twice";
                t0Var = t0Var8;
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    r1.l(v0Var5);
                    v0Var5.y.b(v0.z(packageName), "Error retrieving app installer package name. appId");
                }
                String str6 = installerPackageName;
                try {
                    if (str6 != null) {
                        if ("com.android.vending".equals(str6)) {
                            installerPackageName = "";
                        }
                        packageInfo = packageManager.getPackageInfo(context3.getPackageName(), 0);
                        if (packageInfo != null) {
                            applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (TextUtils.isEmpty(applicationLabel)) {
                                string = "Unknown";
                            } else {
                                string = applicationLabel.toString();
                            }
                            try {
                                str2 = packageInfo.versionName;
                                try {
                                    i = packageInfo.versionCode;
                                } catch (PackageManager.NameNotFoundException unused2) {
                                    str5 = str2;
                                    r1.l(v0Var5);
                                    v0Var5.y.c("Error retrieving package info. appId, appName", v0.z(packageName), string);
                                    i = Integer.MIN_VALUE;
                                    str2 = str5;
                                }
                            } catch (PackageManager.NameNotFoundException unused3) {
                            }
                        }
                        String str7 = installerPackageName;
                        m0Var2.i = packageName;
                        m0Var2.y = str7;
                        m0Var2.v = str2;
                        m0Var2.w = i;
                        m0Var2.z = string;
                        m0Var2.A = 0L;
                        iG = r1Var6.g();
                        if (iG == 0) {
                            r1.l(v0Var5);
                            v0Var5.G.a("App measurement collection enabled");
                        } else if (iG == 1) {
                            r1.l(v0Var5);
                            v0Var5.E.a("App measurement deactivated via the manifest");
                        } else if (iG == 3) {
                            r1.l(v0Var5);
                            v0Var5.E.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        } else if (iG == 4) {
                            r1.l(v0Var5);
                            v0Var5.E.a("App measurement disabled via the manifest");
                        } else if (iG == 6) {
                            r1.l(v0Var5);
                            v0Var5.D.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        } else if (iG == 7) {
                            r1.l(v0Var5);
                            v0Var5.E.a("App measurement disabled via the global data collection setting");
                        } else if (iG != 8) {
                            r1.l(v0Var5);
                            v0Var5.E.a("App measurement disabled");
                            r1.l(v0Var5);
                            v0Var5.z.a("Invalid scion state in identity");
                        } else {
                            r1.l(v0Var5);
                            v0Var5.E.a("App measurement disabled due to denied storage consent");
                        }
                        m0Var2.G = "";
                        strB = f2.b(context3, r1Var6.I);
                        if (!TextUtils.isEmpty(strB)) {
                            str4 = strB;
                        }
                        m0Var2.G = str4;
                        if (iG == 0) {
                            r1.l(v0Var5);
                            v0Var5.G.c("App measurement enabled for app package, google app id", m0Var2.i, m0Var2.G);
                        }
                        listAsList = null;
                        m0Var2.D = null;
                        g gVar2 = r1Var6.v;
                        r1Var = (r1) gVar2.d;
                        c0.d("analytics.safelisted_events");
                        bundleC = gVar2.C();
                        if (bundleC != null) {
                            if (bundleC.containsKey("analytics.safelisted_events")) {
                                numValueOf = Integer.valueOf(bundleC.getInt("analytics.safelisted_events"));
                            }
                            if (numValueOf != null) {
                                try {
                                    stringArray = r1Var.d.getResources().getStringArray(numValueOf.intValue());
                                    if (stringArray == null) {
                                        listAsList = Arrays.asList(stringArray);
                                    }
                                } catch (Resources.NotFoundException e) {
                                    v0 v0Var6 = r1Var.y;
                                    r1.l(v0Var6);
                                    v0Var6.y.b(e, "Failed to load string array from metadata: resource not found");
                                }
                            }
                            if (listAsList != null) {
                                m0Var2.D = listAsList;
                                break;
                            }
                            if (listAsList.isEmpty()) {
                                it2 = listAsList.iterator();
                                do {
                                    if (it2.hasNext()) {
                                        m0Var2.D = listAsList;
                                        break;
                                    } else {
                                        str3 = (String) it2.next();
                                        r4Var3 = r1Var6.B;
                                        r1.j(r4Var3);
                                    }
                                } while (r4Var3.s0("safelisted event", str3));
                            } else {
                                r1.l(v0Var5);
                                v0Var5.D.a("Safelisted event list is empty. Ignoring");
                            }
                            if (packageManager != null) {
                                m0Var2.F = com.gamericefishpro.space.b9.a.y(context3) ? 1 : 0;
                            } else {
                                m0Var2.F = 0;
                            }
                            ((r1) m0Var2.d).V.incrementAndGet();
                            m0Var2.e = true;
                            y2Var = new y2(r1Var4);
                            y2Var.t();
                            r1Var4.N = y2Var;
                            if (!y2Var.e) {
                                throw new IllegalStateException(str);
                            }
                            y2Var.i = (JobScheduler) ((r1) y2Var.d).d.getSystemService("jobscheduler");
                            ((r1) y2Var.d).V.incrementAndGet();
                            y2Var.e = true;
                            r1.l(v0Var2);
                            t0Var2 = v0Var2.F;
                            t0Var3 = v0Var2.E;
                            t0Var4 = v0Var2.G;
                            t0Var5 = v0Var2.y;
                            gVar.w();
                            t0Var3.b(133005L, "App measurement initialized, version");
                            r1.l(v0Var2);
                            t0Var3.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                            strX = m0Var.x();
                            if (r4Var4.R(strX, gVar.i)) {
                                r1.l(v0Var2);
                                t0Var3.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                            } else {
                                r1.l(v0Var2);
                                t0Var3.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strX)));
                            }
                            r1.l(v0Var2);
                            t0Var2.a("Debug-level message logging enabled");
                            i2 = r1Var4.T;
                            atomicInteger = r1Var4.V;
                            if (i2 != atomicInteger.get()) {
                                r1.l(v0Var2);
                                t0Var5.c("Not all components initialized", Integer.valueOf(r1Var4.T), Integer.valueOf(atomicInteger.get()));
                            }
                            r1Var4.O = true;
                            j = r1Var4.W;
                            t2Var = r1Var4.F;
                            p1 p1Var2 = r1Var4.z;
                            r1.l(p1Var2);
                            p1Var2.r();
                            r1.i(r1Var4.N);
                            iW = r1Var4.N.w();
                            r8.a();
                            zB = gVar.B(null, e0.Q0);
                            if (iW == 2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (zB) {
                                r4Var4.r();
                                if (r4Var4.M() == 1) {
                                    r4Var4.r();
                                    intentFilter = new IntentFilter();
                                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    u4Var = new u4(r1Var5);
                                    z4 = z;
                                    context2 = r1Var5.d;
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        context2.registerReceiver(u4Var, intentFilter, null, null, 2);
                                    } else {
                                        context2.registerReceiver(u4Var, intentFilter, null, null, 0);
                                    }
                                    v0 v0Var7 = r1Var5.y;
                                    r1.l(v0Var7);
                                    v0Var7.F.a("Registered app receiver");
                                    if (z4) {
                                        r1.i(r1Var4.N);
                                        r1Var4.N.v(((Long) e0.C.a(null)).longValue());
                                    }
                                } else if (z) {
                                    z = true;
                                    r4Var4.r();
                                    intentFilter = new IntentFilter();
                                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    u4Var = new u4(r1Var5);
                                    z4 = z;
                                    context2 = r1Var5.d;
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        context2.registerReceiver(u4Var, intentFilter, null, null, 2);
                                    } else {
                                        context2.registerReceiver(u4Var, intentFilter, null, null, 0);
                                    }
                                    v0 v0Var8 = r1Var5.y;
                                    r1.l(v0Var8);
                                    v0Var8.F.a("Registered app receiver");
                                    if (z4) {
                                        r1.i(r1Var4.N);
                                        r1Var4.N.v(((Long) e0.C.a(null)).longValue());
                                    }
                                }
                            } else if (z) {
                                z = true;
                                r4Var4.r();
                                intentFilter = new IntentFilter();
                                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                u4Var = new u4(r1Var5);
                                z4 = z;
                                context2 = r1Var5.d;
                                if (Build.VERSION.SDK_INT >= 33) {
                                    context2.registerReceiver(u4Var, intentFilter, null, null, 2);
                                } else {
                                    context2.registerReceiver(u4Var, intentFilter, null, null, 0);
                                }
                                v0 v0Var9 = r1Var5.y;
                                r1.l(v0Var9);
                                v0Var9.F.a("Registered app receiver");
                                if (z4) {
                                    r1.i(r1Var4.N);
                                    r1Var4.N.v(((Long) e0.C.a(null)).longValue());
                                }
                            }
                            z0Var = f1Var.z;
                            e2VarY = f1Var.y();
                            i3 = e2VarY.b;
                            b2VarG = gVar.G("google_analytics_default_allow_ad_storage", false);
                            b2VarG2 = gVar.G("google_analytics_default_allow_analytics_storage", false);
                            b2Var = b2.UNINITIALIZED;
                            d2Var = d2.ANALYTICS_STORAGE;
                            if (b2VarG == b2Var || b2VarG2 != b2Var) {
                                t0Var6 = t0Var5;
                                r4Var = r4Var4;
                                if (e2.l(-10, f1Var.v().getInt("consent_source", 100))) {
                                    EnumMap enumMap = new EnumMap(d2.class);
                                    enumMap.put(d2.AD_STORAGE, b2VarG);
                                    enumMap.put(d2Var, b2VarG2);
                                    e2Var = new e2(enumMap, -10);
                                }
                                z2 = false;
                                if (e2Var != null) {
                                    r1.k(t2Var);
                                    t2Var.N(e2Var, true);
                                    e2Var2 = e2Var;
                                } else {
                                    e2Var2 = e2VarY;
                                }
                                r1.k(t2Var);
                                r1Var2 = (r1) t2Var.d;
                                t2Var.v(e2Var2);
                                f1Var.r();
                                int i4 = o.b(f1Var.v().getString("dma_consent_settings", null)).a;
                                b2VarG3 = gVar.G("google_analytics_default_allow_ad_personalization_signals", true);
                                if (b2VarG3 != b2Var) {
                                    r1.l(v0Var2);
                                    t0Var4.b(b2VarG3, "Default ad personalization consent from Manifest");
                                }
                                b2VarG4 = gVar.G("google_analytics_default_allow_ad_user_data", true);
                                if (b2VarG4 == b2Var && e2.l(-10, i4)) {
                                    r1.k(t2Var);
                                    EnumMap enumMap2 = new EnumMap(d2.class);
                                    enumMap2.put(d2.AD_USER_DATA, b2VarG4);
                                    t2Var.M(new o(enumMap2, -10, (Boolean) null, (String) null), true);
                                } else if (TextUtils.isEmpty(r1Var4.q().y()) && (i4 == 0 || i4 == 30)) {
                                    r1.k(t2Var);
                                    t2Var.M(new o((Boolean) null, -10, (Boolean) null, (String) null), true);
                                } else if (TextUtils.isEmpty(r1Var4.q().y()) && t0Var != null && (bundle = t0Var.v) != null && e2.l(30, i4)) {
                                    oVarC = o.c(bundle, 30);
                                    it = oVarC.e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((b2) it.next()) != b2Var) {
                                            r1.k(t2Var);
                                            t2Var.M(oVarC, true);
                                            break;
                                        }
                                    }
                                }
                                boolD = gVar.D("google_analytics_tcf_data_enabled");
                                if (boolD != null || boolD.booleanValue()) {
                                    r1.l(v0Var2);
                                    t0Var2.a("TCF client enabled.");
                                    r1.k(t2Var);
                                    t2Var.r();
                                    v0 v0Var10 = r1Var2.y;
                                    r1.l(v0Var10);
                                    v0Var10.F.a("Register tcfPrefChangeListener.");
                                    if (t2Var.N == null) {
                                        t2Var.O = new i2(t2Var, r1Var2, 2);
                                        t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                                t2 t2Var2 = t2Var;
                                                r1 r1Var7 = (r1) t2Var2.d;
                                                g gVar3 = r1Var7.v;
                                                v0 v0Var11 = r1Var7.y;
                                                if (!gVar3.B(null, e0.Z0)) {
                                                    if (Objects.equals(str8, "IABTCF_TCString")) {
                                                        r1.l(v0Var11);
                                                        v0Var11.G.a("IABTCF_TCString change picked up in listener.");
                                                        i2 i2Var = t2Var2.O;
                                                        com.gamericefishpro.space.v8.c0.g(i2Var);
                                                        i2Var.b(500L);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                    r1.l(v0Var11);
                                                    v0Var11.G.a("IABTCF_TCString change picked up in listener.");
                                                    i2 i2Var2 = t2Var2.O;
                                                    com.gamericefishpro.space.v8.c0.g(i2Var2);
                                                    i2Var2.b(500L);
                                                }
                                            }
                                        };
                                    }
                                    f1 f1Var2 = r1Var2.w;
                                    r1.j(f1Var2);
                                    f1Var2.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                                    r1.k(t2Var);
                                    t2Var.x();
                                }
                                d1Var = f1Var.y;
                                if (d1Var.a() == 0) {
                                    r1.l(v0Var2);
                                    t0Var4.b(Long.valueOf(j), "Persisting first open");
                                    d1Var.b(j);
                                }
                                r1.k(t2Var);
                                h1Var = t2Var.K;
                                if (h1Var.e() && h1Var.d()) {
                                    f1 f1Var3 = h1Var.e.w;
                                    r1.j(f1Var3);
                                    f1Var3.P.e(null);
                                }
                                if (r1Var4.h()) {
                                    r1Var3 = r1Var4;
                                    r4Var2 = r4Var;
                                    if (TextUtils.isEmpty(r1Var3.q().y())) {
                                        z0Var2 = z0Var;
                                    } else {
                                        String strY = r1Var3.q().y();
                                        f1Var.r();
                                        String string2 = f1Var.v().getString("gmp_app_id", null);
                                        zIsEmpty = TextUtils.isEmpty(strY);
                                        boolean zIsEmpty2 = TextUtils.isEmpty(string2);
                                        if (!zIsEmpty || zIsEmpty2) {
                                            z0Var2 = z0Var;
                                        } else {
                                            c0.g(strY);
                                            if (strY.equals(string2)) {
                                                z0Var2 = z0Var;
                                            } else {
                                                r1.l(v0Var2);
                                                t0Var3.a("Rechecking which service to use due to a GMP App Id change");
                                                f1Var.r();
                                                f1Var.r();
                                                Boolean boolValueOf = f1Var.v().contains("measurement_enabled") ? Boolean.valueOf(f1Var.v().getBoolean("measurement_enabled", true)) : null;
                                                SharedPreferences.Editor editorEdit2 = f1Var.v().edit();
                                                editorEdit2.clear();
                                                editorEdit2.apply();
                                                if (boolValueOf != null) {
                                                    f1Var.r();
                                                    SharedPreferences.Editor editorEdit3 = f1Var.v().edit();
                                                    editorEdit3.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                                    editorEdit3.apply();
                                                }
                                                r1Var3.n().v();
                                                r1Var3.K.z();
                                                r1Var3.K.x();
                                                d1Var.b(j);
                                                z0Var2 = z0Var;
                                                z0Var2.e(null);
                                            }
                                        }
                                        String strY2 = r1Var3.q().y();
                                        f1Var.r();
                                        SharedPreferences.Editor editorEdit4 = f1Var.v().edit();
                                        editorEdit4.putString("gmp_app_id", strY2);
                                        editorEdit4.apply();
                                    }
                                    if (!f1Var.y().i(d2Var)) {
                                        z0Var2.e(null);
                                    }
                                    r1.k(t2Var);
                                    t2Var.z.set(z0Var2.d());
                                    try {
                                        r1Var5.d.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                    } catch (ClassNotFoundException unused4) {
                                        z0 z0Var3 = f1Var.O;
                                        if (!TextUtils.isEmpty(z0Var3.d())) {
                                            r1.l(v0Var2);
                                            v0Var = v0Var2;
                                            v0Var.B.a("Remote config removed with active feature rollouts");
                                            z0Var3.e(null);
                                        }
                                        if (!TextUtils.isEmpty(r1Var3.q().y())) {
                                            zB2 = r1Var3.b();
                                            sharedPreferences = f1Var.i;
                                            if (sharedPreferences == null) {
                                                zContains = z2;
                                            } else {
                                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                                            }
                                            if (!zContains) {
                                                f1Var.A(!zB2);
                                            }
                                            if (zB2) {
                                                r1.k(t2Var);
                                                t2Var.D();
                                            }
                                            w3 w3Var = r1Var3.A;
                                            r1.k(w3Var);
                                            w3Var.w.D();
                                            r1Var3.o().v(new AtomicReference());
                                            r1Var3.o().w(f1Var.R.k());
                                        }
                                        r8.a();
                                        if (gVar.B(null, e0.Q0)) {
                                            r4Var2.r();
                                            if (r4Var2.M() == 1) {
                                                z3 = true;
                                            } else {
                                                z3 = z2;
                                            }
                                            if (z3) {
                                                long jIntValue = ((Integer) e0.x0.a(null)).intValue();
                                                long jNextInt = new Random().nextInt(5000);
                                                r1Var3.D.getClass();
                                                jMax = Math.max(500L, ((jIntValue * 1000) + jNextInt) - SystemClock.elapsedRealtime());
                                                if (jMax > 500) {
                                                    r1.l(v0Var);
                                                    t0Var4.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                }
                                                r1.k(t2Var);
                                                t2Var.r();
                                                if (t2Var.E == null) {
                                                    t2Var.E = new i2(t2Var, r1Var2, 0);
                                                }
                                                t2Var.E.b(jMax);
                                            }
                                        }
                                        f1Var.H.b(true);
                                    }
                                    v0Var = v0Var2;
                                    if (!TextUtils.isEmpty(r1Var3.q().y())) {
                                        zB2 = r1Var3.b();
                                        sharedPreferences = f1Var.i;
                                        if (sharedPreferences == null) {
                                            zContains = z2;
                                        } else {
                                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                                        }
                                        if (!zContains && !gVar.E()) {
                                            f1Var.A(!zB2);
                                        }
                                        if (zB2) {
                                            r1.k(t2Var);
                                            t2Var.D();
                                        }
                                        w3 w3Var2 = r1Var3.A;
                                        r1.k(w3Var2);
                                        w3Var2.w.D();
                                        r1Var3.o().v(new AtomicReference());
                                        r1Var3.o().w(f1Var.R.k());
                                    }
                                } else {
                                    if (r1Var4.b()) {
                                        r4Var2 = r4Var;
                                        if (r4Var2.O("android.permission.INTERNET")) {
                                            t0Var7 = t0Var6;
                                        } else {
                                            r1.l(v0Var2);
                                            t0Var7 = t0Var6;
                                            t0Var7.a("App is missing INTERNET permission");
                                        }
                                        if (!r4Var2.O("android.permission.ACCESS_NETWORK_STATE")) {
                                            r1.l(v0Var2);
                                            t0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                                        }
                                        r1Var3 = r1Var4;
                                        context = r1Var3.d;
                                        if (!c.a(context).f() && !gVar.u()) {
                                            if (!r4.h0(context)) {
                                                r1.l(v0Var2);
                                                t0Var7.a("AppMeasurementReceiver not registered/enabled");
                                            }
                                            if (!r4.K(context)) {
                                                r1.l(v0Var2);
                                                t0Var7.a("AppMeasurementService not registered/enabled");
                                            }
                                        }
                                        r1.l(v0Var2);
                                        t0Var7.a("Uploading is not possible. App measurement disabled");
                                    } else {
                                        r1Var3 = r1Var4;
                                        r4Var2 = r4Var;
                                    }
                                    v0Var = v0Var2;
                                }
                                r8.a();
                                if (gVar.B(null, e0.Q0)) {
                                    r4Var2.r();
                                    if (r4Var2.M() == 1) {
                                        z3 = true;
                                    } else {
                                        z3 = z2;
                                    }
                                    if (z3) {
                                        long jIntValue2 = ((Integer) e0.x0.a(null)).intValue();
                                        long jNextInt2 = new Random().nextInt(5000);
                                        r1Var3.D.getClass();
                                        jMax = Math.max(500L, ((jIntValue2 * 1000) + jNextInt2) - SystemClock.elapsedRealtime());
                                        if (jMax > 500) {
                                            r1.l(v0Var);
                                            t0Var4.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                        }
                                        r1.k(t2Var);
                                        t2Var.r();
                                        if (t2Var.E == null) {
                                            t2Var.E = new i2(t2Var, r1Var2, 0);
                                        }
                                        t2Var.E.b(jMax);
                                    }
                                }
                                f1Var.H.b(true);
                            }
                            t0Var6 = t0Var5;
                            r4Var = r4Var4;
                            if (TextUtils.isEmpty(r1Var4.q().y())) {
                                z2 = false;
                            } else {
                                if (i3 == 0 && i3 != 30 && i3 != 10 && i3 != 40) {
                                    e2Var = null;
                                    z2 = false;
                                    if (e2Var != null) {
                                        r1.k(t2Var);
                                        t2Var.N(e2Var, true);
                                        e2Var2 = e2Var;
                                    } else {
                                        e2Var2 = e2VarY;
                                    }
                                    r1.k(t2Var);
                                    r1Var2 = (r1) t2Var.d;
                                    t2Var.v(e2Var2);
                                    f1Var.r();
                                    int i5 = o.b(f1Var.v().getString("dma_consent_settings", null)).a;
                                    b2VarG3 = gVar.G("google_analytics_default_allow_ad_personalization_signals", true);
                                    if (b2VarG3 != b2Var) {
                                        r1.l(v0Var2);
                                        t0Var4.b(b2VarG3, "Default ad personalization consent from Manifest");
                                    }
                                    b2VarG4 = gVar.G("google_analytics_default_allow_ad_user_data", true);
                                    if (b2VarG4 == b2Var) {
                                        if (TextUtils.isEmpty(r1Var4.q().y())) {
                                            if (TextUtils.isEmpty(r1Var4.q().y())) {
                                                oVarC = o.c(bundle, 30);
                                                it = oVarC.e.values().iterator();
                                                while (it.hasNext()) {
                                                    if (((b2) it.next()) != b2Var) {
                                                        r1.k(t2Var);
                                                        t2Var.M(oVarC, true);
                                                        break;
                                                    }
                                                }
                                            }
                                        } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                                            oVarC = o.c(bundle, 30);
                                            it = oVarC.e.values().iterator();
                                            while (it.hasNext()) {
                                                if (((b2) it.next()) != b2Var) {
                                                    r1.k(t2Var);
                                                    t2Var.M(oVarC, true);
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                                        if (TextUtils.isEmpty(r1Var4.q().y())) {
                                            oVarC = o.c(bundle, 30);
                                            it = oVarC.e.values().iterator();
                                            while (it.hasNext()) {
                                                if (((b2) it.next()) != b2Var) {
                                                    r1.k(t2Var);
                                                    t2Var.M(oVarC, true);
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                                        oVarC = o.c(bundle, 30);
                                        it = oVarC.e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((b2) it.next()) != b2Var) {
                                                r1.k(t2Var);
                                                t2Var.M(oVarC, true);
                                                break;
                                            }
                                        }
                                    }
                                    boolD = gVar.D("google_analytics_tcf_data_enabled");
                                    if (boolD != null) {
                                        r1.l(v0Var2);
                                        t0Var2.a("TCF client enabled.");
                                        r1.k(t2Var);
                                        t2Var.r();
                                        v0 v0Var11 = r1Var2.y;
                                        r1.l(v0Var11);
                                        v0Var11.F.a("Register tcfPrefChangeListener.");
                                        if (t2Var.N == null) {
                                            t2Var.O = new i2(t2Var, r1Var2, 2);
                                            t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                                    t2 t2Var2 = t2Var;
                                                    r1 r1Var7 = (r1) t2Var2.d;
                                                    g gVar3 = r1Var7.v;
                                                    v0 v0Var12 = r1Var7.y;
                                                    if (!gVar3.B(null, e0.Z0)) {
                                                        if (Objects.equals(str8, "IABTCF_TCString")) {
                                                            r1.l(v0Var12);
                                                            v0Var12.G.a("IABTCF_TCString change picked up in listener.");
                                                            i2 i2Var = t2Var2.O;
                                                            com.gamericefishpro.space.v8.c0.g(i2Var);
                                                            i2Var.b(500L);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                        r1.l(v0Var12);
                                                        v0Var12.G.a("IABTCF_TCString change picked up in listener.");
                                                        i2 i2Var2 = t2Var2.O;
                                                        com.gamericefishpro.space.v8.c0.g(i2Var2);
                                                        i2Var2.b(500L);
                                                    }
                                                }
                                            };
                                        }
                                        f1 f1Var4 = r1Var2.w;
                                        r1.j(f1Var4);
                                        f1Var4.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                                        r1.k(t2Var);
                                        t2Var.x();
                                    } else {
                                        r1.l(v0Var2);
                                        t0Var2.a("TCF client enabled.");
                                        r1.k(t2Var);
                                        t2Var.r();
                                        v0 v0Var12 = r1Var2.y;
                                        r1.l(v0Var12);
                                        v0Var12.F.a("Register tcfPrefChangeListener.");
                                        if (t2Var.N == null) {
                                            t2Var.O = new i2(t2Var, r1Var2, 2);
                                            t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                                    t2 t2Var2 = t2Var;
                                                    r1 r1Var7 = (r1) t2Var2.d;
                                                    g gVar3 = r1Var7.v;
                                                    v0 v0Var13 = r1Var7.y;
                                                    if (!gVar3.B(null, e0.Z0)) {
                                                        if (Objects.equals(str8, "IABTCF_TCString")) {
                                                            r1.l(v0Var13);
                                                            v0Var13.G.a("IABTCF_TCString change picked up in listener.");
                                                            i2 i2Var = t2Var2.O;
                                                            com.gamericefishpro.space.v8.c0.g(i2Var);
                                                            i2Var.b(500L);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                        r1.l(v0Var13);
                                                        v0Var13.G.a("IABTCF_TCString change picked up in listener.");
                                                        i2 i2Var2 = t2Var2.O;
                                                        com.gamericefishpro.space.v8.c0.g(i2Var2);
                                                        i2Var2.b(500L);
                                                    }
                                                }
                                            };
                                        }
                                        f1 f1Var5 = r1Var2.w;
                                        r1.j(f1Var5);
                                        f1Var5.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                                        r1.k(t2Var);
                                        t2Var.x();
                                    }
                                    d1Var = f1Var.y;
                                    if (d1Var.a() == 0) {
                                        r1.l(v0Var2);
                                        t0Var4.b(Long.valueOf(j), "Persisting first open");
                                        d1Var.b(j);
                                    }
                                    r1.k(t2Var);
                                    h1Var = t2Var.K;
                                    if (h1Var.e()) {
                                        f1 f1Var6 = h1Var.e.w;
                                        r1.j(f1Var6);
                                        f1Var6.P.e(null);
                                    }
                                    if (r1Var4.h()) {
                                        if (r1Var4.b()) {
                                            r4Var2 = r4Var;
                                            if (r4Var2.O("android.permission.INTERNET")) {
                                                r1.l(v0Var2);
                                                t0Var7 = t0Var6;
                                                t0Var7.a("App is missing INTERNET permission");
                                            } else {
                                                t0Var7 = t0Var6;
                                            }
                                            if (!r4Var2.O("android.permission.ACCESS_NETWORK_STATE")) {
                                                r1.l(v0Var2);
                                                t0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                                            }
                                            r1Var3 = r1Var4;
                                            context = r1Var3.d;
                                            if (!c.a(context).f()) {
                                                if (!r4.h0(context)) {
                                                    r1.l(v0Var2);
                                                    t0Var7.a("AppMeasurementReceiver not registered/enabled");
                                                }
                                                if (!r4.K(context)) {
                                                    r1.l(v0Var2);
                                                    t0Var7.a("AppMeasurementService not registered/enabled");
                                                }
                                            }
                                            r1.l(v0Var2);
                                            t0Var7.a("Uploading is not possible. App measurement disabled");
                                        } else {
                                            r1Var3 = r1Var4;
                                            r4Var2 = r4Var;
                                        }
                                        v0Var = v0Var2;
                                    } else {
                                        r1Var3 = r1Var4;
                                        r4Var2 = r4Var;
                                        if (TextUtils.isEmpty(r1Var3.q().y())) {
                                            String strY3 = r1Var3.q().y();
                                            f1Var.r();
                                            String string3 = f1Var.v().getString("gmp_app_id", null);
                                            zIsEmpty = TextUtils.isEmpty(strY3);
                                            boolean zIsEmpty3 = TextUtils.isEmpty(string3);
                                            if (zIsEmpty) {
                                                z0Var2 = z0Var;
                                            } else {
                                                z0Var2 = z0Var;
                                            }
                                            String strY4 = r1Var3.q().y();
                                            f1Var.r();
                                            SharedPreferences.Editor editorEdit5 = f1Var.v().edit();
                                            editorEdit5.putString("gmp_app_id", strY4);
                                            editorEdit5.apply();
                                        } else {
                                            z0Var2 = z0Var;
                                        }
                                        if (!f1Var.y().i(d2Var)) {
                                            z0Var2.e(null);
                                        }
                                        r1.k(t2Var);
                                        t2Var.z.set(z0Var2.d());
                                        r1Var5.d.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                        v0Var = v0Var2;
                                        if (!TextUtils.isEmpty(r1Var3.q().y())) {
                                            zB2 = r1Var3.b();
                                            sharedPreferences = f1Var.i;
                                            if (sharedPreferences == null) {
                                                zContains = z2;
                                            } else {
                                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                                            }
                                            if (!zContains) {
                                                f1Var.A(!zB2);
                                            }
                                            if (zB2) {
                                                r1.k(t2Var);
                                                t2Var.D();
                                            }
                                            w3 w3Var3 = r1Var3.A;
                                            r1.k(w3Var3);
                                            w3Var3.w.D();
                                            r1Var3.o().v(new AtomicReference());
                                            r1Var3.o().w(f1Var.R.k());
                                        }
                                    }
                                    r8.a();
                                    if (gVar.B(null, e0.Q0)) {
                                        r4Var2.r();
                                        if (r4Var2.M() == 1) {
                                            z3 = true;
                                        } else {
                                            z3 = z2;
                                        }
                                        if (z3) {
                                            long jIntValue3 = ((Integer) e0.x0.a(null)).intValue();
                                            long jNextInt3 = new Random().nextInt(5000);
                                            r1Var3.D.getClass();
                                            jMax = Math.max(500L, ((jIntValue3 * 1000) + jNextInt3) - SystemClock.elapsedRealtime());
                                            if (jMax > 500) {
                                                r1.l(v0Var);
                                                t0Var4.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                            }
                                            r1.k(t2Var);
                                            t2Var.r();
                                            if (t2Var.E == null) {
                                                t2Var.E = new i2(t2Var, r1Var2, 0);
                                            }
                                            t2Var.E.b(jMax);
                                        }
                                    }
                                    f1Var.H.b(true);
                                }
                                r1.k(t2Var);
                                z2 = false;
                                t2Var.N(new e2(-10), false);
                            }
                            e2Var = null;
                            if (e2Var != null) {
                                r1.k(t2Var);
                                t2Var.N(e2Var, true);
                                e2Var2 = e2Var;
                            } else {
                                e2Var2 = e2VarY;
                            }
                            r1.k(t2Var);
                            r1Var2 = (r1) t2Var.d;
                            t2Var.v(e2Var2);
                            f1Var.r();
                            int i6 = o.b(f1Var.v().getString("dma_consent_settings", null)).a;
                            b2VarG3 = gVar.G("google_analytics_default_allow_ad_personalization_signals", true);
                            if (b2VarG3 != b2Var) {
                                r1.l(v0Var2);
                                t0Var4.b(b2VarG3, "Default ad personalization consent from Manifest");
                            }
                            b2VarG4 = gVar.G("google_analytics_default_allow_ad_user_data", true);
                            if (b2VarG4 == b2Var) {
                                if (TextUtils.isEmpty(r1Var4.q().y())) {
                                    if (TextUtils.isEmpty(r1Var4.q().y())) {
                                        oVarC = o.c(bundle, 30);
                                        it = oVarC.e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((b2) it.next()) != b2Var) {
                                                r1.k(t2Var);
                                                t2Var.M(oVarC, true);
                                                break;
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                                    oVarC = o.c(bundle, 30);
                                    it = oVarC.e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((b2) it.next()) != b2Var) {
                                            r1.k(t2Var);
                                            t2Var.M(oVarC, true);
                                            break;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                                if (TextUtils.isEmpty(r1Var4.q().y())) {
                                    oVarC = o.c(bundle, 30);
                                    it = oVarC.e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((b2) it.next()) != b2Var) {
                                            r1.k(t2Var);
                                            t2Var.M(oVarC, true);
                                            break;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                                oVarC = o.c(bundle, 30);
                                it = oVarC.e.values().iterator();
                                while (it.hasNext()) {
                                    if (((b2) it.next()) != b2Var) {
                                        r1.k(t2Var);
                                        t2Var.M(oVarC, true);
                                        break;
                                    }
                                }
                            }
                            boolD = gVar.D("google_analytics_tcf_data_enabled");
                            if (boolD != null) {
                                r1.l(v0Var2);
                                t0Var2.a("TCF client enabled.");
                                r1.k(t2Var);
                                t2Var.r();
                                v0 v0Var13 = r1Var2.y;
                                r1.l(v0Var13);
                                v0Var13.F.a("Register tcfPrefChangeListener.");
                                if (t2Var.N == null) {
                                    t2Var.O = new i2(t2Var, r1Var2, 2);
                                    t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                            t2 t2Var2 = t2Var;
                                            r1 r1Var7 = (r1) t2Var2.d;
                                            g gVar3 = r1Var7.v;
                                            v0 v0Var14 = r1Var7.y;
                                            if (!gVar3.B(null, e0.Z0)) {
                                                if (Objects.equals(str8, "IABTCF_TCString")) {
                                                    r1.l(v0Var14);
                                                    v0Var14.G.a("IABTCF_TCString change picked up in listener.");
                                                    i2 i2Var = t2Var2.O;
                                                    com.gamericefishpro.space.v8.c0.g(i2Var);
                                                    i2Var.b(500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                r1.l(v0Var14);
                                                v0Var14.G.a("IABTCF_TCString change picked up in listener.");
                                                i2 i2Var2 = t2Var2.O;
                                                com.gamericefishpro.space.v8.c0.g(i2Var2);
                                                i2Var2.b(500L);
                                            }
                                        }
                                    };
                                }
                                f1 f1Var7 = r1Var2.w;
                                r1.j(f1Var7);
                                f1Var7.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                                r1.k(t2Var);
                                t2Var.x();
                            } else {
                                r1.l(v0Var2);
                                t0Var2.a("TCF client enabled.");
                                r1.k(t2Var);
                                t2Var.r();
                                v0 v0Var14 = r1Var2.y;
                                r1.l(v0Var14);
                                v0Var14.F.a("Register tcfPrefChangeListener.");
                                if (t2Var.N == null) {
                                    t2Var.O = new i2(t2Var, r1Var2, 2);
                                    t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                            t2 t2Var2 = t2Var;
                                            r1 r1Var7 = (r1) t2Var2.d;
                                            g gVar3 = r1Var7.v;
                                            v0 v0Var15 = r1Var7.y;
                                            if (!gVar3.B(null, e0.Z0)) {
                                                if (Objects.equals(str8, "IABTCF_TCString")) {
                                                    r1.l(v0Var15);
                                                    v0Var15.G.a("IABTCF_TCString change picked up in listener.");
                                                    i2 i2Var = t2Var2.O;
                                                    com.gamericefishpro.space.v8.c0.g(i2Var);
                                                    i2Var.b(500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                r1.l(v0Var15);
                                                v0Var15.G.a("IABTCF_TCString change picked up in listener.");
                                                i2 i2Var2 = t2Var2.O;
                                                com.gamericefishpro.space.v8.c0.g(i2Var2);
                                                i2Var2.b(500L);
                                            }
                                        }
                                    };
                                }
                                f1 f1Var8 = r1Var2.w;
                                r1.j(f1Var8);
                                f1Var8.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                                r1.k(t2Var);
                                t2Var.x();
                            }
                            d1Var = f1Var.y;
                            if (d1Var.a() == 0) {
                                r1.l(v0Var2);
                                t0Var4.b(Long.valueOf(j), "Persisting first open");
                                d1Var.b(j);
                            }
                            r1.k(t2Var);
                            h1Var = t2Var.K;
                            if (h1Var.e()) {
                                f1 f1Var9 = h1Var.e.w;
                                r1.j(f1Var9);
                                f1Var9.P.e(null);
                            }
                            if (r1Var4.h()) {
                                if (r1Var4.b()) {
                                    r4Var2 = r4Var;
                                    if (r4Var2.O("android.permission.INTERNET")) {
                                        r1.l(v0Var2);
                                        t0Var7 = t0Var6;
                                        t0Var7.a("App is missing INTERNET permission");
                                    } else {
                                        t0Var7 = t0Var6;
                                    }
                                    if (!r4Var2.O("android.permission.ACCESS_NETWORK_STATE")) {
                                        r1.l(v0Var2);
                                        t0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                                    }
                                    r1Var3 = r1Var4;
                                    context = r1Var3.d;
                                    if (!c.a(context).f()) {
                                        if (!r4.h0(context)) {
                                            r1.l(v0Var2);
                                            t0Var7.a("AppMeasurementReceiver not registered/enabled");
                                        }
                                        if (!r4.K(context)) {
                                            r1.l(v0Var2);
                                            t0Var7.a("AppMeasurementService not registered/enabled");
                                        }
                                    }
                                    r1.l(v0Var2);
                                    t0Var7.a("Uploading is not possible. App measurement disabled");
                                } else {
                                    r1Var3 = r1Var4;
                                    r4Var2 = r4Var;
                                }
                                v0Var = v0Var2;
                            } else {
                                r1Var3 = r1Var4;
                                r4Var2 = r4Var;
                                if (TextUtils.isEmpty(r1Var3.q().y())) {
                                    String strY5 = r1Var3.q().y();
                                    f1Var.r();
                                    String string4 = f1Var.v().getString("gmp_app_id", null);
                                    zIsEmpty = TextUtils.isEmpty(strY5);
                                    boolean zIsEmpty4 = TextUtils.isEmpty(string4);
                                    if (zIsEmpty) {
                                        z0Var2 = z0Var;
                                    } else {
                                        z0Var2 = z0Var;
                                    }
                                    String strY6 = r1Var3.q().y();
                                    f1Var.r();
                                    SharedPreferences.Editor editorEdit6 = f1Var.v().edit();
                                    editorEdit6.putString("gmp_app_id", strY6);
                                    editorEdit6.apply();
                                } else {
                                    z0Var2 = z0Var;
                                }
                                if (!f1Var.y().i(d2Var)) {
                                    z0Var2.e(null);
                                }
                                r1.k(t2Var);
                                t2Var.z.set(z0Var2.d());
                                r1Var5.d.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                v0Var = v0Var2;
                                if (!TextUtils.isEmpty(r1Var3.q().y())) {
                                    zB2 = r1Var3.b();
                                    sharedPreferences = f1Var.i;
                                    if (sharedPreferences == null) {
                                        zContains = z2;
                                    } else {
                                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                                    }
                                    if (!zContains) {
                                        f1Var.A(!zB2);
                                    }
                                    if (zB2) {
                                        r1.k(t2Var);
                                        t2Var.D();
                                    }
                                    w3 w3Var4 = r1Var3.A;
                                    r1.k(w3Var4);
                                    w3Var4.w.D();
                                    r1Var3.o().v(new AtomicReference());
                                    r1Var3.o().w(f1Var.R.k());
                                }
                            }
                            r8.a();
                            if (gVar.B(null, e0.Q0)) {
                                r4Var2.r();
                                if (r4Var2.M() == 1) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if (z3) {
                                    long jIntValue4 = ((Integer) e0.x0.a(null)).intValue();
                                    long jNextInt4 = new Random().nextInt(5000);
                                    r1Var3.D.getClass();
                                    jMax = Math.max(500L, ((jIntValue4 * 1000) + jNextInt4) - SystemClock.elapsedRealtime());
                                    if (jMax > 500) {
                                        r1.l(v0Var);
                                        t0Var4.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                    }
                                    r1.k(t2Var);
                                    t2Var.r();
                                    if (t2Var.E == null) {
                                        t2Var.E = new i2(t2Var, r1Var2, 0);
                                    }
                                    t2Var.E.b(jMax);
                                }
                            }
                            f1Var.H.b(true);
                        }
                        v0 v0Var15 = r1Var.y;
                        r1.l(v0Var15);
                        v0Var15.y.a("Failed to load metadata: Metadata bundle is null");
                        numValueOf = null;
                        if (numValueOf != null) {
                            stringArray = r1Var.d.getResources().getStringArray(numValueOf.intValue());
                            if (stringArray == null) {
                                listAsList = Arrays.asList(stringArray);
                            }
                        }
                        if (listAsList != null) {
                            m0Var2.D = listAsList;
                            break;
                        }
                        if (listAsList.isEmpty()) {
                            it2 = listAsList.iterator();
                            do {
                                if (it2.hasNext()) {
                                    m0Var2.D = listAsList;
                                    break;
                                } else {
                                    str3 = (String) it2.next();
                                    r4Var3 = r1Var6.B;
                                    r1.j(r4Var3);
                                }
                            } while (r4Var3.s0("safelisted event", str3));
                        } else {
                            r1.l(v0Var5);
                            v0Var5.D.a("Safelisted event list is empty. Ignoring");
                        }
                        if (packageManager != null) {
                            m0Var2.F = com.gamericefishpro.space.b9.a.y(context3) ? 1 : 0;
                        } else {
                            m0Var2.F = 0;
                        }
                        ((r1) m0Var2.d).V.incrementAndGet();
                        m0Var2.e = true;
                        y2Var = new y2(r1Var4);
                        y2Var.t();
                        r1Var4.N = y2Var;
                        if (!y2Var.e) {
                            throw new IllegalStateException(str);
                        }
                        y2Var.i = (JobScheduler) ((r1) y2Var.d).d.getSystemService("jobscheduler");
                        ((r1) y2Var.d).V.incrementAndGet();
                        y2Var.e = true;
                        r1.l(v0Var2);
                        t0Var2 = v0Var2.F;
                        t0Var3 = v0Var2.E;
                        t0Var4 = v0Var2.G;
                        t0Var5 = v0Var2.y;
                        gVar.w();
                        t0Var3.b(133005L, "App measurement initialized, version");
                        r1.l(v0Var2);
                        t0Var3.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                        strX = m0Var.x();
                        if (r4Var4.R(strX, gVar.i)) {
                            r1.l(v0Var2);
                            t0Var3.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                        } else {
                            r1.l(v0Var2);
                            t0Var3.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strX)));
                        }
                        r1.l(v0Var2);
                        t0Var2.a("Debug-level message logging enabled");
                        i2 = r1Var4.T;
                        atomicInteger = r1Var4.V;
                        if (i2 != atomicInteger.get()) {
                            r1.l(v0Var2);
                            t0Var5.c("Not all components initialized", Integer.valueOf(r1Var4.T), Integer.valueOf(atomicInteger.get()));
                        }
                        r1Var4.O = true;
                        j = r1Var4.W;
                        t2Var = r1Var4.F;
                        p1 p1Var3 = r1Var4.z;
                        r1.l(p1Var3);
                        p1Var3.r();
                        r1.i(r1Var4.N);
                        iW = r1Var4.N.w();
                        r8.a();
                        zB = gVar.B(null, e0.Q0);
                        if (iW == 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (zB) {
                            r4Var4.r();
                            if (r4Var4.M() == 1) {
                                r4Var4.r();
                                intentFilter = new IntentFilter();
                                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                u4Var = new u4(r1Var5);
                                z4 = z;
                                context2 = r1Var5.d;
                                if (Build.VERSION.SDK_INT >= 33) {
                                    context2.registerReceiver(u4Var, intentFilter, null, null, 2);
                                } else {
                                    context2.registerReceiver(u4Var, intentFilter, null, null, 0);
                                }
                                v0 v0Var16 = r1Var5.y;
                                r1.l(v0Var16);
                                v0Var16.F.a("Registered app receiver");
                                if (z4) {
                                    r1.i(r1Var4.N);
                                    r1Var4.N.v(((Long) e0.C.a(null)).longValue());
                                }
                            } else if (z) {
                                z = true;
                                r4Var4.r();
                                intentFilter = new IntentFilter();
                                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                u4Var = new u4(r1Var5);
                                z4 = z;
                                context2 = r1Var5.d;
                                if (Build.VERSION.SDK_INT >= 33) {
                                    context2.registerReceiver(u4Var, intentFilter, null, null, 2);
                                } else {
                                    context2.registerReceiver(u4Var, intentFilter, null, null, 0);
                                }
                                v0 v0Var17 = r1Var5.y;
                                r1.l(v0Var17);
                                v0Var17.F.a("Registered app receiver");
                                if (z4) {
                                    r1.i(r1Var4.N);
                                    r1Var4.N.v(((Long) e0.C.a(null)).longValue());
                                }
                            }
                        } else if (z) {
                            z = true;
                            r4Var4.r();
                            intentFilter = new IntentFilter();
                            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            u4Var = new u4(r1Var5);
                            z4 = z;
                            context2 = r1Var5.d;
                            if (Build.VERSION.SDK_INT >= 33) {
                                context2.registerReceiver(u4Var, intentFilter, null, null, 2);
                            } else {
                                context2.registerReceiver(u4Var, intentFilter, null, null, 0);
                            }
                            v0 v0Var18 = r1Var5.y;
                            r1.l(v0Var18);
                            v0Var18.F.a("Registered app receiver");
                            if (z4) {
                                r1.i(r1Var4.N);
                                r1Var4.N.v(((Long) e0.C.a(null)).longValue());
                            }
                        }
                        z0Var = f1Var.z;
                        e2VarY = f1Var.y();
                        i3 = e2VarY.b;
                        b2VarG = gVar.G("google_analytics_default_allow_ad_storage", false);
                        b2VarG2 = gVar.G("google_analytics_default_allow_analytics_storage", false);
                        b2Var = b2.UNINITIALIZED;
                        d2Var = d2.ANALYTICS_STORAGE;
                        if (b2VarG == b2Var) {
                            t0Var6 = t0Var5;
                            r4Var = r4Var4;
                            if (e2.l(-10, f1Var.v().getInt("consent_source", 100))) {
                                if (TextUtils.isEmpty(r1Var4.q().y())) {
                                    if (i3 == 0) {
                                    }
                                    r1.k(t2Var);
                                    z2 = false;
                                    t2Var.N(new e2(-10), false);
                                } else {
                                    z2 = false;
                                }
                                e2Var = null;
                                if (e2Var != null) {
                                    r1.k(t2Var);
                                    t2Var.N(e2Var, true);
                                    e2Var2 = e2Var;
                                } else {
                                    e2Var2 = e2VarY;
                                }
                                r1.k(t2Var);
                                r1Var2 = (r1) t2Var.d;
                                t2Var.v(e2Var2);
                                f1Var.r();
                                int i7 = o.b(f1Var.v().getString("dma_consent_settings", null)).a;
                                b2VarG3 = gVar.G("google_analytics_default_allow_ad_personalization_signals", true);
                                if (b2VarG3 != b2Var) {
                                    r1.l(v0Var2);
                                    t0Var4.b(b2VarG3, "Default ad personalization consent from Manifest");
                                }
                                b2VarG4 = gVar.G("google_analytics_default_allow_ad_user_data", true);
                                if (b2VarG4 == b2Var) {
                                    if (TextUtils.isEmpty(r1Var4.q().y())) {
                                        if (TextUtils.isEmpty(r1Var4.q().y())) {
                                            oVarC = o.c(bundle, 30);
                                            it = oVarC.e.values().iterator();
                                            while (it.hasNext()) {
                                                if (((b2) it.next()) != b2Var) {
                                                    r1.k(t2Var);
                                                    t2Var.M(oVarC, true);
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                                        oVarC = o.c(bundle, 30);
                                        it = oVarC.e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((b2) it.next()) != b2Var) {
                                                r1.k(t2Var);
                                                t2Var.M(oVarC, true);
                                                break;
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                                    if (TextUtils.isEmpty(r1Var4.q().y())) {
                                        oVarC = o.c(bundle, 30);
                                        it = oVarC.e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((b2) it.next()) != b2Var) {
                                                r1.k(t2Var);
                                                t2Var.M(oVarC, true);
                                                break;
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                                    oVarC = o.c(bundle, 30);
                                    it = oVarC.e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((b2) it.next()) != b2Var) {
                                            r1.k(t2Var);
                                            t2Var.M(oVarC, true);
                                            break;
                                        }
                                    }
                                }
                                boolD = gVar.D("google_analytics_tcf_data_enabled");
                                if (boolD != null) {
                                    r1.l(v0Var2);
                                    t0Var2.a("TCF client enabled.");
                                    r1.k(t2Var);
                                    t2Var.r();
                                    v0 v0Var19 = r1Var2.y;
                                    r1.l(v0Var19);
                                    v0Var19.F.a("Register tcfPrefChangeListener.");
                                    if (t2Var.N == null) {
                                        t2Var.O = new i2(t2Var, r1Var2, 2);
                                        t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                                t2 t2Var2 = t2Var;
                                                r1 r1Var7 = (r1) t2Var2.d;
                                                g gVar3 = r1Var7.v;
                                                v0 v0Var110 = r1Var7.y;
                                                if (!gVar3.B(null, e0.Z0)) {
                                                    if (Objects.equals(str8, "IABTCF_TCString")) {
                                                        r1.l(v0Var110);
                                                        v0Var110.G.a("IABTCF_TCString change picked up in listener.");
                                                        i2 i2Var = t2Var2.O;
                                                        com.gamericefishpro.space.v8.c0.g(i2Var);
                                                        i2Var.b(500L);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                    r1.l(v0Var110);
                                                    v0Var110.G.a("IABTCF_TCString change picked up in listener.");
                                                    i2 i2Var2 = t2Var2.O;
                                                    com.gamericefishpro.space.v8.c0.g(i2Var2);
                                                    i2Var2.b(500L);
                                                }
                                            }
                                        };
                                    }
                                    f1 f1Var10 = r1Var2.w;
                                    r1.j(f1Var10);
                                    f1Var10.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                                    r1.k(t2Var);
                                    t2Var.x();
                                } else {
                                    r1.l(v0Var2);
                                    t0Var2.a("TCF client enabled.");
                                    r1.k(t2Var);
                                    t2Var.r();
                                    v0 v0Var110 = r1Var2.y;
                                    r1.l(v0Var110);
                                    v0Var110.F.a("Register tcfPrefChangeListener.");
                                    if (t2Var.N == null) {
                                        t2Var.O = new i2(t2Var, r1Var2, 2);
                                        t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                                t2 t2Var2 = t2Var;
                                                r1 r1Var7 = (r1) t2Var2.d;
                                                g gVar3 = r1Var7.v;
                                                v0 v0Var111 = r1Var7.y;
                                                if (!gVar3.B(null, e0.Z0)) {
                                                    if (Objects.equals(str8, "IABTCF_TCString")) {
                                                        r1.l(v0Var111);
                                                        v0Var111.G.a("IABTCF_TCString change picked up in listener.");
                                                        i2 i2Var = t2Var2.O;
                                                        com.gamericefishpro.space.v8.c0.g(i2Var);
                                                        i2Var.b(500L);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                    r1.l(v0Var111);
                                                    v0Var111.G.a("IABTCF_TCString change picked up in listener.");
                                                    i2 i2Var2 = t2Var2.O;
                                                    com.gamericefishpro.space.v8.c0.g(i2Var2);
                                                    i2Var2.b(500L);
                                                }
                                            }
                                        };
                                    }
                                    f1 f1Var11 = r1Var2.w;
                                    r1.j(f1Var11);
                                    f1Var11.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                                    r1.k(t2Var);
                                    t2Var.x();
                                }
                                d1Var = f1Var.y;
                                if (d1Var.a() == 0) {
                                    r1.l(v0Var2);
                                    t0Var4.b(Long.valueOf(j), "Persisting first open");
                                    d1Var.b(j);
                                }
                                r1.k(t2Var);
                                h1Var = t2Var.K;
                                if (h1Var.e()) {
                                    f1 f1Var12 = h1Var.e.w;
                                    r1.j(f1Var12);
                                    f1Var12.P.e(null);
                                }
                                if (r1Var4.h()) {
                                    if (r1Var4.b()) {
                                        r4Var2 = r4Var;
                                        if (r4Var2.O("android.permission.INTERNET")) {
                                            r1.l(v0Var2);
                                            t0Var7 = t0Var6;
                                            t0Var7.a("App is missing INTERNET permission");
                                        } else {
                                            t0Var7 = t0Var6;
                                        }
                                        if (!r4Var2.O("android.permission.ACCESS_NETWORK_STATE")) {
                                            r1.l(v0Var2);
                                            t0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                                        }
                                        r1Var3 = r1Var4;
                                        context = r1Var3.d;
                                        if (!c.a(context).f()) {
                                            if (!r4.h0(context)) {
                                                r1.l(v0Var2);
                                                t0Var7.a("AppMeasurementReceiver not registered/enabled");
                                            }
                                            if (!r4.K(context)) {
                                                r1.l(v0Var2);
                                                t0Var7.a("AppMeasurementService not registered/enabled");
                                            }
                                        }
                                        r1.l(v0Var2);
                                        t0Var7.a("Uploading is not possible. App measurement disabled");
                                    } else {
                                        r1Var3 = r1Var4;
                                        r4Var2 = r4Var;
                                    }
                                    v0Var = v0Var2;
                                } else {
                                    r1Var3 = r1Var4;
                                    r4Var2 = r4Var;
                                    if (TextUtils.isEmpty(r1Var3.q().y())) {
                                        String strY7 = r1Var3.q().y();
                                        f1Var.r();
                                        String string5 = f1Var.v().getString("gmp_app_id", null);
                                        zIsEmpty = TextUtils.isEmpty(strY7);
                                        boolean zIsEmpty5 = TextUtils.isEmpty(string5);
                                        if (zIsEmpty) {
                                            z0Var2 = z0Var;
                                        } else {
                                            z0Var2 = z0Var;
                                        }
                                        String strY8 = r1Var3.q().y();
                                        f1Var.r();
                                        SharedPreferences.Editor editorEdit7 = f1Var.v().edit();
                                        editorEdit7.putString("gmp_app_id", strY8);
                                        editorEdit7.apply();
                                    } else {
                                        z0Var2 = z0Var;
                                    }
                                    if (!f1Var.y().i(d2Var)) {
                                        z0Var2.e(null);
                                    }
                                    r1.k(t2Var);
                                    t2Var.z.set(z0Var2.d());
                                    r1Var5.d.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                    v0Var = v0Var2;
                                    if (!TextUtils.isEmpty(r1Var3.q().y())) {
                                        zB2 = r1Var3.b();
                                        sharedPreferences = f1Var.i;
                                        if (sharedPreferences == null) {
                                            zContains = z2;
                                        } else {
                                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                                        }
                                        if (!zContains) {
                                            f1Var.A(!zB2);
                                        }
                                        if (zB2) {
                                            r1.k(t2Var);
                                            t2Var.D();
                                        }
                                        w3 w3Var5 = r1Var3.A;
                                        r1.k(w3Var5);
                                        w3Var5.w.D();
                                        r1Var3.o().v(new AtomicReference());
                                        r1Var3.o().w(f1Var.R.k());
                                    }
                                }
                                r8.a();
                                if (gVar.B(null, e0.Q0)) {
                                    r4Var2.r();
                                    if (r4Var2.M() == 1) {
                                        z3 = true;
                                    } else {
                                        z3 = z2;
                                    }
                                    if (z3) {
                                        long jIntValue5 = ((Integer) e0.x0.a(null)).intValue();
                                        long jNextInt5 = new Random().nextInt(5000);
                                        r1Var3.D.getClass();
                                        jMax = Math.max(500L, ((jIntValue5 * 1000) + jNextInt5) - SystemClock.elapsedRealtime());
                                        if (jMax > 500) {
                                            r1.l(v0Var);
                                            t0Var4.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                        }
                                        r1.k(t2Var);
                                        t2Var.r();
                                        if (t2Var.E == null) {
                                            t2Var.E = new i2(t2Var, r1Var2, 0);
                                        }
                                        t2Var.E.b(jMax);
                                    }
                                }
                                f1Var.H.b(true);
                            }
                            EnumMap enumMap3 = new EnumMap(d2.class);
                            enumMap3.put(d2.AD_STORAGE, b2VarG);
                            enumMap3.put(d2Var, b2VarG2);
                            e2Var = new e2(enumMap3, -10);
                        } else {
                            t0Var6 = t0Var5;
                            r4Var = r4Var4;
                            if (e2.l(-10, f1Var.v().getInt("consent_source", 100))) {
                                if (TextUtils.isEmpty(r1Var4.q().y())) {
                                    if (i3 == 0) {
                                    }
                                    r1.k(t2Var);
                                    z2 = false;
                                    t2Var.N(new e2(-10), false);
                                } else {
                                    z2 = false;
                                }
                                e2Var = null;
                                if (e2Var != null) {
                                    r1.k(t2Var);
                                    t2Var.N(e2Var, true);
                                    e2Var2 = e2Var;
                                } else {
                                    e2Var2 = e2VarY;
                                }
                                r1.k(t2Var);
                                r1Var2 = (r1) t2Var.d;
                                t2Var.v(e2Var2);
                                f1Var.r();
                                int i8 = o.b(f1Var.v().getString("dma_consent_settings", null)).a;
                                b2VarG3 = gVar.G("google_analytics_default_allow_ad_personalization_signals", true);
                                if (b2VarG3 != b2Var) {
                                    r1.l(v0Var2);
                                    t0Var4.b(b2VarG3, "Default ad personalization consent from Manifest");
                                }
                                b2VarG4 = gVar.G("google_analytics_default_allow_ad_user_data", true);
                                if (b2VarG4 == b2Var) {
                                    if (TextUtils.isEmpty(r1Var4.q().y())) {
                                        if (TextUtils.isEmpty(r1Var4.q().y())) {
                                            oVarC = o.c(bundle, 30);
                                            it = oVarC.e.values().iterator();
                                            while (it.hasNext()) {
                                                if (((b2) it.next()) != b2Var) {
                                                    r1.k(t2Var);
                                                    t2Var.M(oVarC, true);
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                                        oVarC = o.c(bundle, 30);
                                        it = oVarC.e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((b2) it.next()) != b2Var) {
                                                r1.k(t2Var);
                                                t2Var.M(oVarC, true);
                                                break;
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                                    if (TextUtils.isEmpty(r1Var4.q().y())) {
                                        oVarC = o.c(bundle, 30);
                                        it = oVarC.e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((b2) it.next()) != b2Var) {
                                                r1.k(t2Var);
                                                t2Var.M(oVarC, true);
                                                break;
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                                    oVarC = o.c(bundle, 30);
                                    it = oVarC.e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((b2) it.next()) != b2Var) {
                                            r1.k(t2Var);
                                            t2Var.M(oVarC, true);
                                            break;
                                        }
                                    }
                                }
                                boolD = gVar.D("google_analytics_tcf_data_enabled");
                                if (boolD != null) {
                                    r1.l(v0Var2);
                                    t0Var2.a("TCF client enabled.");
                                    r1.k(t2Var);
                                    t2Var.r();
                                    v0 v0Var111 = r1Var2.y;
                                    r1.l(v0Var111);
                                    v0Var111.F.a("Register tcfPrefChangeListener.");
                                    if (t2Var.N == null) {
                                        t2Var.O = new i2(t2Var, r1Var2, 2);
                                        t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                                t2 t2Var2 = t2Var;
                                                r1 r1Var7 = (r1) t2Var2.d;
                                                g gVar3 = r1Var7.v;
                                                v0 v0Var112 = r1Var7.y;
                                                if (!gVar3.B(null, e0.Z0)) {
                                                    if (Objects.equals(str8, "IABTCF_TCString")) {
                                                        r1.l(v0Var112);
                                                        v0Var112.G.a("IABTCF_TCString change picked up in listener.");
                                                        i2 i2Var = t2Var2.O;
                                                        com.gamericefishpro.space.v8.c0.g(i2Var);
                                                        i2Var.b(500L);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                    r1.l(v0Var112);
                                                    v0Var112.G.a("IABTCF_TCString change picked up in listener.");
                                                    i2 i2Var2 = t2Var2.O;
                                                    com.gamericefishpro.space.v8.c0.g(i2Var2);
                                                    i2Var2.b(500L);
                                                }
                                            }
                                        };
                                    }
                                    f1 f1Var13 = r1Var2.w;
                                    r1.j(f1Var13);
                                    f1Var13.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                                    r1.k(t2Var);
                                    t2Var.x();
                                } else {
                                    r1.l(v0Var2);
                                    t0Var2.a("TCF client enabled.");
                                    r1.k(t2Var);
                                    t2Var.r();
                                    v0 v0Var112 = r1Var2.y;
                                    r1.l(v0Var112);
                                    v0Var112.F.a("Register tcfPrefChangeListener.");
                                    if (t2Var.N == null) {
                                        t2Var.O = new i2(t2Var, r1Var2, 2);
                                        t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                                t2 t2Var2 = t2Var;
                                                r1 r1Var7 = (r1) t2Var2.d;
                                                g gVar3 = r1Var7.v;
                                                v0 v0Var113 = r1Var7.y;
                                                if (!gVar3.B(null, e0.Z0)) {
                                                    if (Objects.equals(str8, "IABTCF_TCString")) {
                                                        r1.l(v0Var113);
                                                        v0Var113.G.a("IABTCF_TCString change picked up in listener.");
                                                        i2 i2Var = t2Var2.O;
                                                        com.gamericefishpro.space.v8.c0.g(i2Var);
                                                        i2Var.b(500L);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                    r1.l(v0Var113);
                                                    v0Var113.G.a("IABTCF_TCString change picked up in listener.");
                                                    i2 i2Var2 = t2Var2.O;
                                                    com.gamericefishpro.space.v8.c0.g(i2Var2);
                                                    i2Var2.b(500L);
                                                }
                                            }
                                        };
                                    }
                                    f1 f1Var14 = r1Var2.w;
                                    r1.j(f1Var14);
                                    f1Var14.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                                    r1.k(t2Var);
                                    t2Var.x();
                                }
                                d1Var = f1Var.y;
                                if (d1Var.a() == 0) {
                                    r1.l(v0Var2);
                                    t0Var4.b(Long.valueOf(j), "Persisting first open");
                                    d1Var.b(j);
                                }
                                r1.k(t2Var);
                                h1Var = t2Var.K;
                                if (h1Var.e()) {
                                    f1 f1Var15 = h1Var.e.w;
                                    r1.j(f1Var15);
                                    f1Var15.P.e(null);
                                }
                                if (r1Var4.h()) {
                                    if (r1Var4.b()) {
                                        r4Var2 = r4Var;
                                        if (r4Var2.O("android.permission.INTERNET")) {
                                            r1.l(v0Var2);
                                            t0Var7 = t0Var6;
                                            t0Var7.a("App is missing INTERNET permission");
                                        } else {
                                            t0Var7 = t0Var6;
                                        }
                                        if (!r4Var2.O("android.permission.ACCESS_NETWORK_STATE")) {
                                            r1.l(v0Var2);
                                            t0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                                        }
                                        r1Var3 = r1Var4;
                                        context = r1Var3.d;
                                        if (!c.a(context).f()) {
                                            if (!r4.h0(context)) {
                                                r1.l(v0Var2);
                                                t0Var7.a("AppMeasurementReceiver not registered/enabled");
                                            }
                                            if (!r4.K(context)) {
                                                r1.l(v0Var2);
                                                t0Var7.a("AppMeasurementService not registered/enabled");
                                            }
                                        }
                                        r1.l(v0Var2);
                                        t0Var7.a("Uploading is not possible. App measurement disabled");
                                    } else {
                                        r1Var3 = r1Var4;
                                        r4Var2 = r4Var;
                                    }
                                    v0Var = v0Var2;
                                } else {
                                    r1Var3 = r1Var4;
                                    r4Var2 = r4Var;
                                    if (TextUtils.isEmpty(r1Var3.q().y())) {
                                        String strY9 = r1Var3.q().y();
                                        f1Var.r();
                                        String string6 = f1Var.v().getString("gmp_app_id", null);
                                        zIsEmpty = TextUtils.isEmpty(strY9);
                                        boolean zIsEmpty6 = TextUtils.isEmpty(string6);
                                        if (zIsEmpty) {
                                            z0Var2 = z0Var;
                                        } else {
                                            z0Var2 = z0Var;
                                        }
                                        String strY10 = r1Var3.q().y();
                                        f1Var.r();
                                        SharedPreferences.Editor editorEdit8 = f1Var.v().edit();
                                        editorEdit8.putString("gmp_app_id", strY10);
                                        editorEdit8.apply();
                                    } else {
                                        z0Var2 = z0Var;
                                    }
                                    if (!f1Var.y().i(d2Var)) {
                                        z0Var2.e(null);
                                    }
                                    r1.k(t2Var);
                                    t2Var.z.set(z0Var2.d());
                                    r1Var5.d.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                    v0Var = v0Var2;
                                    if (!TextUtils.isEmpty(r1Var3.q().y())) {
                                        zB2 = r1Var3.b();
                                        sharedPreferences = f1Var.i;
                                        if (sharedPreferences == null) {
                                            zContains = z2;
                                        } else {
                                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                                        }
                                        if (!zContains) {
                                            f1Var.A(!zB2);
                                        }
                                        if (zB2) {
                                            r1.k(t2Var);
                                            t2Var.D();
                                        }
                                        w3 w3Var6 = r1Var3.A;
                                        r1.k(w3Var6);
                                        w3Var6.w.D();
                                        r1Var3.o().v(new AtomicReference());
                                        r1Var3.o().w(f1Var.R.k());
                                    }
                                }
                                r8.a();
                                if (gVar.B(null, e0.Q0)) {
                                    r4Var2.r();
                                    if (r4Var2.M() == 1) {
                                        z3 = true;
                                    } else {
                                        z3 = z2;
                                    }
                                    if (z3) {
                                        long jIntValue6 = ((Integer) e0.x0.a(null)).intValue();
                                        long jNextInt6 = new Random().nextInt(5000);
                                        r1Var3.D.getClass();
                                        jMax = Math.max(500L, ((jIntValue6 * 1000) + jNextInt6) - SystemClock.elapsedRealtime());
                                        if (jMax > 500) {
                                            r1.l(v0Var);
                                            t0Var4.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                        }
                                        r1.k(t2Var);
                                        t2Var.r();
                                        if (t2Var.E == null) {
                                            t2Var.E = new i2(t2Var, r1Var2, 0);
                                        }
                                        t2Var.E.b(jMax);
                                    }
                                }
                                f1Var.H.b(true);
                            }
                            EnumMap enumMap4 = new EnumMap(d2.class);
                            enumMap4.put(d2.AD_STORAGE, b2VarG);
                            enumMap4.put(d2Var, b2VarG2);
                            e2Var = new e2(enumMap4, -10);
                        }
                        z2 = false;
                        if (e2Var != null) {
                            r1.k(t2Var);
                            t2Var.N(e2Var, true);
                            e2Var2 = e2Var;
                        } else {
                            e2Var2 = e2VarY;
                        }
                        r1.k(t2Var);
                        r1Var2 = (r1) t2Var.d;
                        t2Var.v(e2Var2);
                        f1Var.r();
                        int i9 = o.b(f1Var.v().getString("dma_consent_settings", null)).a;
                        b2VarG3 = gVar.G("google_analytics_default_allow_ad_personalization_signals", true);
                        if (b2VarG3 != b2Var) {
                            r1.l(v0Var2);
                            t0Var4.b(b2VarG3, "Default ad personalization consent from Manifest");
                        }
                        b2VarG4 = gVar.G("google_analytics_default_allow_ad_user_data", true);
                        if (b2VarG4 == b2Var) {
                            if (TextUtils.isEmpty(r1Var4.q().y())) {
                                if (TextUtils.isEmpty(r1Var4.q().y())) {
                                    oVarC = o.c(bundle, 30);
                                    it = oVarC.e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((b2) it.next()) != b2Var) {
                                            r1.k(t2Var);
                                            t2Var.M(oVarC, true);
                                            break;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                                oVarC = o.c(bundle, 30);
                                it = oVarC.e.values().iterator();
                                while (it.hasNext()) {
                                    if (((b2) it.next()) != b2Var) {
                                        r1.k(t2Var);
                                        t2Var.M(oVarC, true);
                                        break;
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                            if (TextUtils.isEmpty(r1Var4.q().y())) {
                                oVarC = o.c(bundle, 30);
                                it = oVarC.e.values().iterator();
                                while (it.hasNext()) {
                                    if (((b2) it.next()) != b2Var) {
                                        r1.k(t2Var);
                                        t2Var.M(oVarC, true);
                                        break;
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                            oVarC = o.c(bundle, 30);
                            it = oVarC.e.values().iterator();
                            while (it.hasNext()) {
                                if (((b2) it.next()) != b2Var) {
                                    r1.k(t2Var);
                                    t2Var.M(oVarC, true);
                                    break;
                                }
                            }
                        }
                        boolD = gVar.D("google_analytics_tcf_data_enabled");
                        if (boolD != null) {
                            r1.l(v0Var2);
                            t0Var2.a("TCF client enabled.");
                            r1.k(t2Var);
                            t2Var.r();
                            v0 v0Var113 = r1Var2.y;
                            r1.l(v0Var113);
                            v0Var113.F.a("Register tcfPrefChangeListener.");
                            if (t2Var.N == null) {
                                t2Var.O = new i2(t2Var, r1Var2, 2);
                                t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                        t2 t2Var2 = t2Var;
                                        r1 r1Var7 = (r1) t2Var2.d;
                                        g gVar3 = r1Var7.v;
                                        v0 v0Var114 = r1Var7.y;
                                        if (!gVar3.B(null, e0.Z0)) {
                                            if (Objects.equals(str8, "IABTCF_TCString")) {
                                                r1.l(v0Var114);
                                                v0Var114.G.a("IABTCF_TCString change picked up in listener.");
                                                i2 i2Var = t2Var2.O;
                                                com.gamericefishpro.space.v8.c0.g(i2Var);
                                                i2Var.b(500L);
                                                return;
                                            }
                                            return;
                                        }
                                        if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                            r1.l(v0Var114);
                                            v0Var114.G.a("IABTCF_TCString change picked up in listener.");
                                            i2 i2Var2 = t2Var2.O;
                                            com.gamericefishpro.space.v8.c0.g(i2Var2);
                                            i2Var2.b(500L);
                                        }
                                    }
                                };
                            }
                            f1 f1Var16 = r1Var2.w;
                            r1.j(f1Var16);
                            f1Var16.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                            r1.k(t2Var);
                            t2Var.x();
                        } else {
                            r1.l(v0Var2);
                            t0Var2.a("TCF client enabled.");
                            r1.k(t2Var);
                            t2Var.r();
                            v0 v0Var114 = r1Var2.y;
                            r1.l(v0Var114);
                            v0Var114.F.a("Register tcfPrefChangeListener.");
                            if (t2Var.N == null) {
                                t2Var.O = new i2(t2Var, r1Var2, 2);
                                t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                        t2 t2Var2 = t2Var;
                                        r1 r1Var7 = (r1) t2Var2.d;
                                        g gVar3 = r1Var7.v;
                                        v0 v0Var115 = r1Var7.y;
                                        if (!gVar3.B(null, e0.Z0)) {
                                            if (Objects.equals(str8, "IABTCF_TCString")) {
                                                r1.l(v0Var115);
                                                v0Var115.G.a("IABTCF_TCString change picked up in listener.");
                                                i2 i2Var = t2Var2.O;
                                                com.gamericefishpro.space.v8.c0.g(i2Var);
                                                i2Var.b(500L);
                                                return;
                                            }
                                            return;
                                        }
                                        if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                            r1.l(v0Var115);
                                            v0Var115.G.a("IABTCF_TCString change picked up in listener.");
                                            i2 i2Var2 = t2Var2.O;
                                            com.gamericefishpro.space.v8.c0.g(i2Var2);
                                            i2Var2.b(500L);
                                        }
                                    }
                                };
                            }
                            f1 f1Var17 = r1Var2.w;
                            r1.j(f1Var17);
                            f1Var17.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                            r1.k(t2Var);
                            t2Var.x();
                        }
                        d1Var = f1Var.y;
                        if (d1Var.a() == 0) {
                            r1.l(v0Var2);
                            t0Var4.b(Long.valueOf(j), "Persisting first open");
                            d1Var.b(j);
                        }
                        r1.k(t2Var);
                        h1Var = t2Var.K;
                        if (h1Var.e()) {
                            f1 f1Var18 = h1Var.e.w;
                            r1.j(f1Var18);
                            f1Var18.P.e(null);
                        }
                        if (r1Var4.h()) {
                            if (r1Var4.b()) {
                                r4Var2 = r4Var;
                                if (r4Var2.O("android.permission.INTERNET")) {
                                    r1.l(v0Var2);
                                    t0Var7 = t0Var6;
                                    t0Var7.a("App is missing INTERNET permission");
                                } else {
                                    t0Var7 = t0Var6;
                                }
                                if (!r4Var2.O("android.permission.ACCESS_NETWORK_STATE")) {
                                    r1.l(v0Var2);
                                    t0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                                }
                                r1Var3 = r1Var4;
                                context = r1Var3.d;
                                if (!c.a(context).f()) {
                                    if (!r4.h0(context)) {
                                        r1.l(v0Var2);
                                        t0Var7.a("AppMeasurementReceiver not registered/enabled");
                                    }
                                    if (!r4.K(context)) {
                                        r1.l(v0Var2);
                                        t0Var7.a("AppMeasurementService not registered/enabled");
                                    }
                                }
                                r1.l(v0Var2);
                                t0Var7.a("Uploading is not possible. App measurement disabled");
                            } else {
                                r1Var3 = r1Var4;
                                r4Var2 = r4Var;
                            }
                            v0Var = v0Var2;
                        } else {
                            r1Var3 = r1Var4;
                            r4Var2 = r4Var;
                            if (TextUtils.isEmpty(r1Var3.q().y())) {
                                String strY11 = r1Var3.q().y();
                                f1Var.r();
                                String string7 = f1Var.v().getString("gmp_app_id", null);
                                zIsEmpty = TextUtils.isEmpty(strY11);
                                boolean zIsEmpty7 = TextUtils.isEmpty(string7);
                                if (zIsEmpty) {
                                    z0Var2 = z0Var;
                                } else {
                                    z0Var2 = z0Var;
                                }
                                String strY12 = r1Var3.q().y();
                                f1Var.r();
                                SharedPreferences.Editor editorEdit9 = f1Var.v().edit();
                                editorEdit9.putString("gmp_app_id", strY12);
                                editorEdit9.apply();
                            } else {
                                z0Var2 = z0Var;
                            }
                            if (!f1Var.y().i(d2Var)) {
                                z0Var2.e(null);
                            }
                            r1.k(t2Var);
                            t2Var.z.set(z0Var2.d());
                            r1Var5.d.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                            v0Var = v0Var2;
                            if (!TextUtils.isEmpty(r1Var3.q().y())) {
                                zB2 = r1Var3.b();
                                sharedPreferences = f1Var.i;
                                if (sharedPreferences == null) {
                                    zContains = z2;
                                } else {
                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                }
                                if (!zContains) {
                                    f1Var.A(!zB2);
                                }
                                if (zB2) {
                                    r1.k(t2Var);
                                    t2Var.D();
                                }
                                w3 w3Var7 = r1Var3.A;
                                r1.k(w3Var7);
                                w3Var7.w.D();
                                r1Var3.o().v(new AtomicReference());
                                r1Var3.o().w(f1Var.R.k());
                            }
                        }
                        r8.a();
                        if (gVar.B(null, e0.Q0)) {
                            r4Var2.r();
                            if (r4Var2.M() == 1) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (z3) {
                                long jIntValue7 = ((Integer) e0.x0.a(null)).intValue();
                                long jNextInt7 = new Random().nextInt(5000);
                                r1Var3.D.getClass();
                                jMax = Math.max(500L, ((jIntValue7 * 1000) + jNextInt7) - SystemClock.elapsedRealtime());
                                if (jMax > 500) {
                                    r1.l(v0Var);
                                    t0Var4.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                }
                                r1.k(t2Var);
                                t2Var.r();
                                if (t2Var.E == null) {
                                    t2Var.E = new i2(t2Var, r1Var2, 0);
                                }
                                t2Var.E.b(jMax);
                            }
                        }
                        f1Var.H.b(true);
                    }
                    str6 = "manual_install";
                    packageInfo = packageManager.getPackageInfo(context3.getPackageName(), 0);
                    if (packageInfo != null) {
                        applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        if (TextUtils.isEmpty(applicationLabel)) {
                            string = applicationLabel.toString();
                        } else {
                            string = "Unknown";
                        }
                        str2 = packageInfo.versionName;
                        i = packageInfo.versionCode;
                    }
                } catch (PackageManager.NameNotFoundException unused5) {
                    string = "Unknown";
                }
                installerPackageName = str6;
                String str8 = installerPackageName;
                m0Var2.i = packageName;
                m0Var2.y = str8;
                m0Var2.v = str2;
                m0Var2.w = i;
                m0Var2.z = string;
                m0Var2.A = 0L;
                iG = r1Var6.g();
                if (iG == 0) {
                    r1.l(v0Var5);
                    v0Var5.G.a("App measurement collection enabled");
                } else if (iG == 1) {
                    r1.l(v0Var5);
                    v0Var5.E.a("App measurement deactivated via the manifest");
                } else if (iG == 3) {
                    r1.l(v0Var5);
                    v0Var5.E.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iG == 4) {
                    r1.l(v0Var5);
                    v0Var5.E.a("App measurement disabled via the manifest");
                } else if (iG == 6) {
                    r1.l(v0Var5);
                    v0Var5.D.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iG == 7) {
                    r1.l(v0Var5);
                    v0Var5.E.a("App measurement disabled via the global data collection setting");
                } else if (iG != 8) {
                    r1.l(v0Var5);
                    v0Var5.E.a("App measurement disabled");
                    r1.l(v0Var5);
                    v0Var5.z.a("Invalid scion state in identity");
                } else {
                    r1.l(v0Var5);
                    v0Var5.E.a("App measurement disabled due to denied storage consent");
                }
                m0Var2.G = "";
                strB = f2.b(context3, r1Var6.I);
                if (!TextUtils.isEmpty(strB)) {
                    str4 = strB;
                }
                m0Var2.G = str4;
                if (iG == 0) {
                    r1.l(v0Var5);
                    v0Var5.G.c("App measurement enabled for app package, google app id", m0Var2.i, m0Var2.G);
                }
                listAsList = null;
                m0Var2.D = null;
                g gVar3 = r1Var6.v;
                r1Var = (r1) gVar3.d;
                c0.d("analytics.safelisted_events");
                bundleC = gVar3.C();
                if (bundleC != null) {
                    if (bundleC.containsKey("analytics.safelisted_events")) {
                        numValueOf = Integer.valueOf(bundleC.getInt("analytics.safelisted_events"));
                    }
                    if (numValueOf != null) {
                        stringArray = r1Var.d.getResources().getStringArray(numValueOf.intValue());
                        if (stringArray == null) {
                            listAsList = Arrays.asList(stringArray);
                        }
                    }
                    if (listAsList != null) {
                        m0Var2.D = listAsList;
                        break;
                    }
                    if (listAsList.isEmpty()) {
                        it2 = listAsList.iterator();
                        do {
                            if (it2.hasNext()) {
                                m0Var2.D = listAsList;
                                break;
                            } else {
                                str3 = (String) it2.next();
                                r4Var3 = r1Var6.B;
                                r1.j(r4Var3);
                            }
                        } while (r4Var3.s0("safelisted event", str3));
                    } else {
                        r1.l(v0Var5);
                        v0Var5.D.a("Safelisted event list is empty. Ignoring");
                    }
                    if (packageManager != null) {
                        m0Var2.F = com.gamericefishpro.space.b9.a.y(context3) ? 1 : 0;
                    } else {
                        m0Var2.F = 0;
                    }
                    ((r1) m0Var2.d).V.incrementAndGet();
                    m0Var2.e = true;
                    y2Var = new y2(r1Var4);
                    y2Var.t();
                    r1Var4.N = y2Var;
                    if (!y2Var.e) {
                        throw new IllegalStateException(str);
                    }
                    y2Var.i = (JobScheduler) ((r1) y2Var.d).d.getSystemService("jobscheduler");
                    ((r1) y2Var.d).V.incrementAndGet();
                    y2Var.e = true;
                    r1.l(v0Var2);
                    t0Var2 = v0Var2.F;
                    t0Var3 = v0Var2.E;
                    t0Var4 = v0Var2.G;
                    t0Var5 = v0Var2.y;
                    gVar.w();
                    t0Var3.b(133005L, "App measurement initialized, version");
                    r1.l(v0Var2);
                    t0Var3.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                    strX = m0Var.x();
                    if (r4Var4.R(strX, gVar.i)) {
                        r1.l(v0Var2);
                        t0Var3.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                    } else {
                        r1.l(v0Var2);
                        t0Var3.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strX)));
                    }
                    r1.l(v0Var2);
                    t0Var2.a("Debug-level message logging enabled");
                    i2 = r1Var4.T;
                    atomicInteger = r1Var4.V;
                    if (i2 != atomicInteger.get()) {
                        r1.l(v0Var2);
                        t0Var5.c("Not all components initialized", Integer.valueOf(r1Var4.T), Integer.valueOf(atomicInteger.get()));
                    }
                    r1Var4.O = true;
                    j = r1Var4.W;
                    t2Var = r1Var4.F;
                    p1 p1Var4 = r1Var4.z;
                    r1.l(p1Var4);
                    p1Var4.r();
                    r1.i(r1Var4.N);
                    iW = r1Var4.N.w();
                    r8.a();
                    zB = gVar.B(null, e0.Q0);
                    if (iW == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (zB) {
                        r4Var4.r();
                        if (r4Var4.M() == 1) {
                            r4Var4.r();
                            intentFilter = new IntentFilter();
                            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            u4Var = new u4(r1Var5);
                            z4 = z;
                            context2 = r1Var5.d;
                            if (Build.VERSION.SDK_INT >= 33) {
                                context2.registerReceiver(u4Var, intentFilter, null, null, 2);
                            } else {
                                context2.registerReceiver(u4Var, intentFilter, null, null, 0);
                            }
                            v0 v0Var115 = r1Var5.y;
                            r1.l(v0Var115);
                            v0Var115.F.a("Registered app receiver");
                            if (z4) {
                                r1.i(r1Var4.N);
                                r1Var4.N.v(((Long) e0.C.a(null)).longValue());
                            }
                        } else if (z) {
                            z = true;
                            r4Var4.r();
                            intentFilter = new IntentFilter();
                            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            u4Var = new u4(r1Var5);
                            z4 = z;
                            context2 = r1Var5.d;
                            if (Build.VERSION.SDK_INT >= 33) {
                                context2.registerReceiver(u4Var, intentFilter, null, null, 2);
                            } else {
                                context2.registerReceiver(u4Var, intentFilter, null, null, 0);
                            }
                            v0 v0Var116 = r1Var5.y;
                            r1.l(v0Var116);
                            v0Var116.F.a("Registered app receiver");
                            if (z4) {
                                r1.i(r1Var4.N);
                                r1Var4.N.v(((Long) e0.C.a(null)).longValue());
                            }
                        }
                    } else if (z) {
                        z = true;
                        r4Var4.r();
                        intentFilter = new IntentFilter();
                        intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        u4Var = new u4(r1Var5);
                        z4 = z;
                        context2 = r1Var5.d;
                        if (Build.VERSION.SDK_INT >= 33) {
                            context2.registerReceiver(u4Var, intentFilter, null, null, 2);
                        } else {
                            context2.registerReceiver(u4Var, intentFilter, null, null, 0);
                        }
                        v0 v0Var117 = r1Var5.y;
                        r1.l(v0Var117);
                        v0Var117.F.a("Registered app receiver");
                        if (z4) {
                            r1.i(r1Var4.N);
                            r1Var4.N.v(((Long) e0.C.a(null)).longValue());
                        }
                    }
                    z0Var = f1Var.z;
                    e2VarY = f1Var.y();
                    i3 = e2VarY.b;
                    b2VarG = gVar.G("google_analytics_default_allow_ad_storage", false);
                    b2VarG2 = gVar.G("google_analytics_default_allow_analytics_storage", false);
                    b2Var = b2.UNINITIALIZED;
                    d2Var = d2.ANALYTICS_STORAGE;
                    if (b2VarG == b2Var) {
                        t0Var6 = t0Var5;
                        r4Var = r4Var4;
                        if (e2.l(-10, f1Var.v().getInt("consent_source", 100))) {
                            if (TextUtils.isEmpty(r1Var4.q().y())) {
                                if (i3 == 0) {
                                }
                                r1.k(t2Var);
                                z2 = false;
                                t2Var.N(new e2(-10), false);
                            } else {
                                z2 = false;
                            }
                            e2Var = null;
                            if (e2Var != null) {
                                r1.k(t2Var);
                                t2Var.N(e2Var, true);
                                e2Var2 = e2Var;
                            } else {
                                e2Var2 = e2VarY;
                            }
                            r1.k(t2Var);
                            r1Var2 = (r1) t2Var.d;
                            t2Var.v(e2Var2);
                            f1Var.r();
                            int i10 = o.b(f1Var.v().getString("dma_consent_settings", null)).a;
                            b2VarG3 = gVar.G("google_analytics_default_allow_ad_personalization_signals", true);
                            if (b2VarG3 != b2Var) {
                                r1.l(v0Var2);
                                t0Var4.b(b2VarG3, "Default ad personalization consent from Manifest");
                            }
                            b2VarG4 = gVar.G("google_analytics_default_allow_ad_user_data", true);
                            if (b2VarG4 == b2Var) {
                                if (TextUtils.isEmpty(r1Var4.q().y())) {
                                    if (TextUtils.isEmpty(r1Var4.q().y())) {
                                        oVarC = o.c(bundle, 30);
                                        it = oVarC.e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((b2) it.next()) != b2Var) {
                                                r1.k(t2Var);
                                                t2Var.M(oVarC, true);
                                                break;
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                                    oVarC = o.c(bundle, 30);
                                    it = oVarC.e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((b2) it.next()) != b2Var) {
                                            r1.k(t2Var);
                                            t2Var.M(oVarC, true);
                                            break;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                                if (TextUtils.isEmpty(r1Var4.q().y())) {
                                    oVarC = o.c(bundle, 30);
                                    it = oVarC.e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((b2) it.next()) != b2Var) {
                                            r1.k(t2Var);
                                            t2Var.M(oVarC, true);
                                            break;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                                oVarC = o.c(bundle, 30);
                                it = oVarC.e.values().iterator();
                                while (it.hasNext()) {
                                    if (((b2) it.next()) != b2Var) {
                                        r1.k(t2Var);
                                        t2Var.M(oVarC, true);
                                        break;
                                    }
                                }
                            }
                            boolD = gVar.D("google_analytics_tcf_data_enabled");
                            if (boolD != null) {
                                r1.l(v0Var2);
                                t0Var2.a("TCF client enabled.");
                                r1.k(t2Var);
                                t2Var.r();
                                v0 v0Var118 = r1Var2.y;
                                r1.l(v0Var118);
                                v0Var118.F.a("Register tcfPrefChangeListener.");
                                if (t2Var.N == null) {
                                    t2Var.O = new i2(t2Var, r1Var2, 2);
                                    t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                            t2 t2Var2 = t2Var;
                                            r1 r1Var7 = (r1) t2Var2.d;
                                            g gVar4 = r1Var7.v;
                                            v0 v0Var119 = r1Var7.y;
                                            if (!gVar4.B(null, e0.Z0)) {
                                                if (Objects.equals(str9, "IABTCF_TCString")) {
                                                    r1.l(v0Var119);
                                                    v0Var119.G.a("IABTCF_TCString change picked up in listener.");
                                                    i2 i2Var = t2Var2.O;
                                                    com.gamericefishpro.space.v8.c0.g(i2Var);
                                                    i2Var.b(500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                r1.l(v0Var119);
                                                v0Var119.G.a("IABTCF_TCString change picked up in listener.");
                                                i2 i2Var2 = t2Var2.O;
                                                com.gamericefishpro.space.v8.c0.g(i2Var2);
                                                i2Var2.b(500L);
                                            }
                                        }
                                    };
                                }
                                f1 f1Var19 = r1Var2.w;
                                r1.j(f1Var19);
                                f1Var19.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                                r1.k(t2Var);
                                t2Var.x();
                            } else {
                                r1.l(v0Var2);
                                t0Var2.a("TCF client enabled.");
                                r1.k(t2Var);
                                t2Var.r();
                                v0 v0Var119 = r1Var2.y;
                                r1.l(v0Var119);
                                v0Var119.F.a("Register tcfPrefChangeListener.");
                                if (t2Var.N == null) {
                                    t2Var.O = new i2(t2Var, r1Var2, 2);
                                    t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                            t2 t2Var2 = t2Var;
                                            r1 r1Var7 = (r1) t2Var2.d;
                                            g gVar4 = r1Var7.v;
                                            v0 v0Var1110 = r1Var7.y;
                                            if (!gVar4.B(null, e0.Z0)) {
                                                if (Objects.equals(str9, "IABTCF_TCString")) {
                                                    r1.l(v0Var1110);
                                                    v0Var1110.G.a("IABTCF_TCString change picked up in listener.");
                                                    i2 i2Var = t2Var2.O;
                                                    com.gamericefishpro.space.v8.c0.g(i2Var);
                                                    i2Var.b(500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                r1.l(v0Var1110);
                                                v0Var1110.G.a("IABTCF_TCString change picked up in listener.");
                                                i2 i2Var2 = t2Var2.O;
                                                com.gamericefishpro.space.v8.c0.g(i2Var2);
                                                i2Var2.b(500L);
                                            }
                                        }
                                    };
                                }
                                f1 f1Var110 = r1Var2.w;
                                r1.j(f1Var110);
                                f1Var110.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                                r1.k(t2Var);
                                t2Var.x();
                            }
                            d1Var = f1Var.y;
                            if (d1Var.a() == 0) {
                                r1.l(v0Var2);
                                t0Var4.b(Long.valueOf(j), "Persisting first open");
                                d1Var.b(j);
                            }
                            r1.k(t2Var);
                            h1Var = t2Var.K;
                            if (h1Var.e()) {
                                f1 f1Var111 = h1Var.e.w;
                                r1.j(f1Var111);
                                f1Var111.P.e(null);
                            }
                            if (r1Var4.h()) {
                                if (r1Var4.b()) {
                                    r4Var2 = r4Var;
                                    if (r4Var2.O("android.permission.INTERNET")) {
                                        r1.l(v0Var2);
                                        t0Var7 = t0Var6;
                                        t0Var7.a("App is missing INTERNET permission");
                                    } else {
                                        t0Var7 = t0Var6;
                                    }
                                    if (!r4Var2.O("android.permission.ACCESS_NETWORK_STATE")) {
                                        r1.l(v0Var2);
                                        t0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                                    }
                                    r1Var3 = r1Var4;
                                    context = r1Var3.d;
                                    if (!c.a(context).f()) {
                                        if (!r4.h0(context)) {
                                            r1.l(v0Var2);
                                            t0Var7.a("AppMeasurementReceiver not registered/enabled");
                                        }
                                        if (!r4.K(context)) {
                                            r1.l(v0Var2);
                                            t0Var7.a("AppMeasurementService not registered/enabled");
                                        }
                                    }
                                    r1.l(v0Var2);
                                    t0Var7.a("Uploading is not possible. App measurement disabled");
                                } else {
                                    r1Var3 = r1Var4;
                                    r4Var2 = r4Var;
                                }
                                v0Var = v0Var2;
                            } else {
                                r1Var3 = r1Var4;
                                r4Var2 = r4Var;
                                if (TextUtils.isEmpty(r1Var3.q().y())) {
                                    String strY13 = r1Var3.q().y();
                                    f1Var.r();
                                    String string8 = f1Var.v().getString("gmp_app_id", null);
                                    zIsEmpty = TextUtils.isEmpty(strY13);
                                    boolean zIsEmpty8 = TextUtils.isEmpty(string8);
                                    if (zIsEmpty) {
                                        z0Var2 = z0Var;
                                    } else {
                                        z0Var2 = z0Var;
                                    }
                                    String strY14 = r1Var3.q().y();
                                    f1Var.r();
                                    SharedPreferences.Editor editorEdit10 = f1Var.v().edit();
                                    editorEdit10.putString("gmp_app_id", strY14);
                                    editorEdit10.apply();
                                } else {
                                    z0Var2 = z0Var;
                                }
                                if (!f1Var.y().i(d2Var)) {
                                    z0Var2.e(null);
                                }
                                r1.k(t2Var);
                                t2Var.z.set(z0Var2.d());
                                r1Var5.d.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                v0Var = v0Var2;
                                if (!TextUtils.isEmpty(r1Var3.q().y())) {
                                    zB2 = r1Var3.b();
                                    sharedPreferences = f1Var.i;
                                    if (sharedPreferences == null) {
                                        zContains = z2;
                                    } else {
                                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                                    }
                                    if (!zContains) {
                                        f1Var.A(!zB2);
                                    }
                                    if (zB2) {
                                        r1.k(t2Var);
                                        t2Var.D();
                                    }
                                    w3 w3Var8 = r1Var3.A;
                                    r1.k(w3Var8);
                                    w3Var8.w.D();
                                    r1Var3.o().v(new AtomicReference());
                                    r1Var3.o().w(f1Var.R.k());
                                }
                            }
                            r8.a();
                            if (gVar.B(null, e0.Q0)) {
                                r4Var2.r();
                                if (r4Var2.M() == 1) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if (z3) {
                                    long jIntValue8 = ((Integer) e0.x0.a(null)).intValue();
                                    long jNextInt8 = new Random().nextInt(5000);
                                    r1Var3.D.getClass();
                                    jMax = Math.max(500L, ((jIntValue8 * 1000) + jNextInt8) - SystemClock.elapsedRealtime());
                                    if (jMax > 500) {
                                        r1.l(v0Var);
                                        t0Var4.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                    }
                                    r1.k(t2Var);
                                    t2Var.r();
                                    if (t2Var.E == null) {
                                        t2Var.E = new i2(t2Var, r1Var2, 0);
                                    }
                                    t2Var.E.b(jMax);
                                }
                            }
                            f1Var.H.b(true);
                        }
                        EnumMap enumMap5 = new EnumMap(d2.class);
                        enumMap5.put(d2.AD_STORAGE, b2VarG);
                        enumMap5.put(d2Var, b2VarG2);
                        e2Var = new e2(enumMap5, -10);
                    } else {
                        t0Var6 = t0Var5;
                        r4Var = r4Var4;
                        if (e2.l(-10, f1Var.v().getInt("consent_source", 100))) {
                            if (TextUtils.isEmpty(r1Var4.q().y())) {
                                if (i3 == 0) {
                                }
                                r1.k(t2Var);
                                z2 = false;
                                t2Var.N(new e2(-10), false);
                            } else {
                                z2 = false;
                            }
                            e2Var = null;
                            if (e2Var != null) {
                                r1.k(t2Var);
                                t2Var.N(e2Var, true);
                                e2Var2 = e2Var;
                            } else {
                                e2Var2 = e2VarY;
                            }
                            r1.k(t2Var);
                            r1Var2 = (r1) t2Var.d;
                            t2Var.v(e2Var2);
                            f1Var.r();
                            int i11 = o.b(f1Var.v().getString("dma_consent_settings", null)).a;
                            b2VarG3 = gVar.G("google_analytics_default_allow_ad_personalization_signals", true);
                            if (b2VarG3 != b2Var) {
                                r1.l(v0Var2);
                                t0Var4.b(b2VarG3, "Default ad personalization consent from Manifest");
                            }
                            b2VarG4 = gVar.G("google_analytics_default_allow_ad_user_data", true);
                            if (b2VarG4 == b2Var) {
                                if (TextUtils.isEmpty(r1Var4.q().y())) {
                                    if (TextUtils.isEmpty(r1Var4.q().y())) {
                                        oVarC = o.c(bundle, 30);
                                        it = oVarC.e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((b2) it.next()) != b2Var) {
                                                r1.k(t2Var);
                                                t2Var.M(oVarC, true);
                                                break;
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                                    oVarC = o.c(bundle, 30);
                                    it = oVarC.e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((b2) it.next()) != b2Var) {
                                            r1.k(t2Var);
                                            t2Var.M(oVarC, true);
                                            break;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                                if (TextUtils.isEmpty(r1Var4.q().y())) {
                                    oVarC = o.c(bundle, 30);
                                    it = oVarC.e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((b2) it.next()) != b2Var) {
                                            r1.k(t2Var);
                                            t2Var.M(oVarC, true);
                                            break;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                                oVarC = o.c(bundle, 30);
                                it = oVarC.e.values().iterator();
                                while (it.hasNext()) {
                                    if (((b2) it.next()) != b2Var) {
                                        r1.k(t2Var);
                                        t2Var.M(oVarC, true);
                                        break;
                                    }
                                }
                            }
                            boolD = gVar.D("google_analytics_tcf_data_enabled");
                            if (boolD != null) {
                                r1.l(v0Var2);
                                t0Var2.a("TCF client enabled.");
                                r1.k(t2Var);
                                t2Var.r();
                                v0 v0Var1110 = r1Var2.y;
                                r1.l(v0Var1110);
                                v0Var1110.F.a("Register tcfPrefChangeListener.");
                                if (t2Var.N == null) {
                                    t2Var.O = new i2(t2Var, r1Var2, 2);
                                    t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                            t2 t2Var2 = t2Var;
                                            r1 r1Var7 = (r1) t2Var2.d;
                                            g gVar4 = r1Var7.v;
                                            v0 v0Var1111 = r1Var7.y;
                                            if (!gVar4.B(null, e0.Z0)) {
                                                if (Objects.equals(str9, "IABTCF_TCString")) {
                                                    r1.l(v0Var1111);
                                                    v0Var1111.G.a("IABTCF_TCString change picked up in listener.");
                                                    i2 i2Var = t2Var2.O;
                                                    com.gamericefishpro.space.v8.c0.g(i2Var);
                                                    i2Var.b(500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                r1.l(v0Var1111);
                                                v0Var1111.G.a("IABTCF_TCString change picked up in listener.");
                                                i2 i2Var2 = t2Var2.O;
                                                com.gamericefishpro.space.v8.c0.g(i2Var2);
                                                i2Var2.b(500L);
                                            }
                                        }
                                    };
                                }
                                f1 f1Var112 = r1Var2.w;
                                r1.j(f1Var112);
                                f1Var112.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                                r1.k(t2Var);
                                t2Var.x();
                            } else {
                                r1.l(v0Var2);
                                t0Var2.a("TCF client enabled.");
                                r1.k(t2Var);
                                t2Var.r();
                                v0 v0Var1111 = r1Var2.y;
                                r1.l(v0Var1111);
                                v0Var1111.F.a("Register tcfPrefChangeListener.");
                                if (t2Var.N == null) {
                                    t2Var.O = new i2(t2Var, r1Var2, 2);
                                    t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                            t2 t2Var2 = t2Var;
                                            r1 r1Var7 = (r1) t2Var2.d;
                                            g gVar4 = r1Var7.v;
                                            v0 v0Var1112 = r1Var7.y;
                                            if (!gVar4.B(null, e0.Z0)) {
                                                if (Objects.equals(str9, "IABTCF_TCString")) {
                                                    r1.l(v0Var1112);
                                                    v0Var1112.G.a("IABTCF_TCString change picked up in listener.");
                                                    i2 i2Var = t2Var2.O;
                                                    com.gamericefishpro.space.v8.c0.g(i2Var);
                                                    i2Var.b(500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                r1.l(v0Var1112);
                                                v0Var1112.G.a("IABTCF_TCString change picked up in listener.");
                                                i2 i2Var2 = t2Var2.O;
                                                com.gamericefishpro.space.v8.c0.g(i2Var2);
                                                i2Var2.b(500L);
                                            }
                                        }
                                    };
                                }
                                f1 f1Var113 = r1Var2.w;
                                r1.j(f1Var113);
                                f1Var113.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                                r1.k(t2Var);
                                t2Var.x();
                            }
                            d1Var = f1Var.y;
                            if (d1Var.a() == 0) {
                                r1.l(v0Var2);
                                t0Var4.b(Long.valueOf(j), "Persisting first open");
                                d1Var.b(j);
                            }
                            r1.k(t2Var);
                            h1Var = t2Var.K;
                            if (h1Var.e()) {
                                f1 f1Var114 = h1Var.e.w;
                                r1.j(f1Var114);
                                f1Var114.P.e(null);
                            }
                            if (r1Var4.h()) {
                                if (r1Var4.b()) {
                                    r4Var2 = r4Var;
                                    if (r4Var2.O("android.permission.INTERNET")) {
                                        r1.l(v0Var2);
                                        t0Var7 = t0Var6;
                                        t0Var7.a("App is missing INTERNET permission");
                                    } else {
                                        t0Var7 = t0Var6;
                                    }
                                    if (!r4Var2.O("android.permission.ACCESS_NETWORK_STATE")) {
                                        r1.l(v0Var2);
                                        t0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                                    }
                                    r1Var3 = r1Var4;
                                    context = r1Var3.d;
                                    if (!c.a(context).f()) {
                                        if (!r4.h0(context)) {
                                            r1.l(v0Var2);
                                            t0Var7.a("AppMeasurementReceiver not registered/enabled");
                                        }
                                        if (!r4.K(context)) {
                                            r1.l(v0Var2);
                                            t0Var7.a("AppMeasurementService not registered/enabled");
                                        }
                                    }
                                    r1.l(v0Var2);
                                    t0Var7.a("Uploading is not possible. App measurement disabled");
                                } else {
                                    r1Var3 = r1Var4;
                                    r4Var2 = r4Var;
                                }
                                v0Var = v0Var2;
                            } else {
                                r1Var3 = r1Var4;
                                r4Var2 = r4Var;
                                if (TextUtils.isEmpty(r1Var3.q().y())) {
                                    String strY15 = r1Var3.q().y();
                                    f1Var.r();
                                    String string9 = f1Var.v().getString("gmp_app_id", null);
                                    zIsEmpty = TextUtils.isEmpty(strY15);
                                    boolean zIsEmpty9 = TextUtils.isEmpty(string9);
                                    if (zIsEmpty) {
                                        z0Var2 = z0Var;
                                    } else {
                                        z0Var2 = z0Var;
                                    }
                                    String strY16 = r1Var3.q().y();
                                    f1Var.r();
                                    SharedPreferences.Editor editorEdit11 = f1Var.v().edit();
                                    editorEdit11.putString("gmp_app_id", strY16);
                                    editorEdit11.apply();
                                } else {
                                    z0Var2 = z0Var;
                                }
                                if (!f1Var.y().i(d2Var)) {
                                    z0Var2.e(null);
                                }
                                r1.k(t2Var);
                                t2Var.z.set(z0Var2.d());
                                r1Var5.d.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                v0Var = v0Var2;
                                if (!TextUtils.isEmpty(r1Var3.q().y())) {
                                    zB2 = r1Var3.b();
                                    sharedPreferences = f1Var.i;
                                    if (sharedPreferences == null) {
                                        zContains = z2;
                                    } else {
                                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                                    }
                                    if (!zContains) {
                                        f1Var.A(!zB2);
                                    }
                                    if (zB2) {
                                        r1.k(t2Var);
                                        t2Var.D();
                                    }
                                    w3 w3Var9 = r1Var3.A;
                                    r1.k(w3Var9);
                                    w3Var9.w.D();
                                    r1Var3.o().v(new AtomicReference());
                                    r1Var3.o().w(f1Var.R.k());
                                }
                            }
                            r8.a();
                            if (gVar.B(null, e0.Q0)) {
                                r4Var2.r();
                                if (r4Var2.M() == 1) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if (z3) {
                                    long jIntValue9 = ((Integer) e0.x0.a(null)).intValue();
                                    long jNextInt9 = new Random().nextInt(5000);
                                    r1Var3.D.getClass();
                                    jMax = Math.max(500L, ((jIntValue9 * 1000) + jNextInt9) - SystemClock.elapsedRealtime());
                                    if (jMax > 500) {
                                        r1.l(v0Var);
                                        t0Var4.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                    }
                                    r1.k(t2Var);
                                    t2Var.r();
                                    if (t2Var.E == null) {
                                        t2Var.E = new i2(t2Var, r1Var2, 0);
                                    }
                                    t2Var.E.b(jMax);
                                }
                            }
                            f1Var.H.b(true);
                        }
                        EnumMap enumMap6 = new EnumMap(d2.class);
                        enumMap6.put(d2.AD_STORAGE, b2VarG);
                        enumMap6.put(d2Var, b2VarG2);
                        e2Var = new e2(enumMap6, -10);
                    }
                    z2 = false;
                    if (e2Var != null) {
                        r1.k(t2Var);
                        t2Var.N(e2Var, true);
                        e2Var2 = e2Var;
                    } else {
                        e2Var2 = e2VarY;
                    }
                    r1.k(t2Var);
                    r1Var2 = (r1) t2Var.d;
                    t2Var.v(e2Var2);
                    f1Var.r();
                    int i12 = o.b(f1Var.v().getString("dma_consent_settings", null)).a;
                    b2VarG3 = gVar.G("google_analytics_default_allow_ad_personalization_signals", true);
                    if (b2VarG3 != b2Var) {
                        r1.l(v0Var2);
                        t0Var4.b(b2VarG3, "Default ad personalization consent from Manifest");
                    }
                    b2VarG4 = gVar.G("google_analytics_default_allow_ad_user_data", true);
                    if (b2VarG4 == b2Var) {
                        if (TextUtils.isEmpty(r1Var4.q().y())) {
                            if (TextUtils.isEmpty(r1Var4.q().y())) {
                                oVarC = o.c(bundle, 30);
                                it = oVarC.e.values().iterator();
                                while (it.hasNext()) {
                                    if (((b2) it.next()) != b2Var) {
                                        r1.k(t2Var);
                                        t2Var.M(oVarC, true);
                                        break;
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                            oVarC = o.c(bundle, 30);
                            it = oVarC.e.values().iterator();
                            while (it.hasNext()) {
                                if (((b2) it.next()) != b2Var) {
                                    r1.k(t2Var);
                                    t2Var.M(oVarC, true);
                                    break;
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                        if (TextUtils.isEmpty(r1Var4.q().y())) {
                            oVarC = o.c(bundle, 30);
                            it = oVarC.e.values().iterator();
                            while (it.hasNext()) {
                                if (((b2) it.next()) != b2Var) {
                                    r1.k(t2Var);
                                    t2Var.M(oVarC, true);
                                    break;
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                        oVarC = o.c(bundle, 30);
                        it = oVarC.e.values().iterator();
                        while (it.hasNext()) {
                            if (((b2) it.next()) != b2Var) {
                                r1.k(t2Var);
                                t2Var.M(oVarC, true);
                                break;
                            }
                        }
                    }
                    boolD = gVar.D("google_analytics_tcf_data_enabled");
                    if (boolD != null) {
                        r1.l(v0Var2);
                        t0Var2.a("TCF client enabled.");
                        r1.k(t2Var);
                        t2Var.r();
                        v0 v0Var1112 = r1Var2.y;
                        r1.l(v0Var1112);
                        v0Var1112.F.a("Register tcfPrefChangeListener.");
                        if (t2Var.N == null) {
                            t2Var.O = new i2(t2Var, r1Var2, 2);
                            t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                    t2 t2Var2 = t2Var;
                                    r1 r1Var7 = (r1) t2Var2.d;
                                    g gVar4 = r1Var7.v;
                                    v0 v0Var1113 = r1Var7.y;
                                    if (!gVar4.B(null, e0.Z0)) {
                                        if (Objects.equals(str9, "IABTCF_TCString")) {
                                            r1.l(v0Var1113);
                                            v0Var1113.G.a("IABTCF_TCString change picked up in listener.");
                                            i2 i2Var = t2Var2.O;
                                            com.gamericefishpro.space.v8.c0.g(i2Var);
                                            i2Var.b(500L);
                                            return;
                                        }
                                        return;
                                    }
                                    if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                        r1.l(v0Var1113);
                                        v0Var1113.G.a("IABTCF_TCString change picked up in listener.");
                                        i2 i2Var2 = t2Var2.O;
                                        com.gamericefishpro.space.v8.c0.g(i2Var2);
                                        i2Var2.b(500L);
                                    }
                                }
                            };
                        }
                        f1 f1Var115 = r1Var2.w;
                        r1.j(f1Var115);
                        f1Var115.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                        r1.k(t2Var);
                        t2Var.x();
                    } else {
                        r1.l(v0Var2);
                        t0Var2.a("TCF client enabled.");
                        r1.k(t2Var);
                        t2Var.r();
                        v0 v0Var1113 = r1Var2.y;
                        r1.l(v0Var1113);
                        v0Var1113.F.a("Register tcfPrefChangeListener.");
                        if (t2Var.N == null) {
                            t2Var.O = new i2(t2Var, r1Var2, 2);
                            t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                    t2 t2Var2 = t2Var;
                                    r1 r1Var7 = (r1) t2Var2.d;
                                    g gVar4 = r1Var7.v;
                                    v0 v0Var1114 = r1Var7.y;
                                    if (!gVar4.B(null, e0.Z0)) {
                                        if (Objects.equals(str9, "IABTCF_TCString")) {
                                            r1.l(v0Var1114);
                                            v0Var1114.G.a("IABTCF_TCString change picked up in listener.");
                                            i2 i2Var = t2Var2.O;
                                            com.gamericefishpro.space.v8.c0.g(i2Var);
                                            i2Var.b(500L);
                                            return;
                                        }
                                        return;
                                    }
                                    if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                        r1.l(v0Var1114);
                                        v0Var1114.G.a("IABTCF_TCString change picked up in listener.");
                                        i2 i2Var2 = t2Var2.O;
                                        com.gamericefishpro.space.v8.c0.g(i2Var2);
                                        i2Var2.b(500L);
                                    }
                                }
                            };
                        }
                        f1 f1Var116 = r1Var2.w;
                        r1.j(f1Var116);
                        f1Var116.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                        r1.k(t2Var);
                        t2Var.x();
                    }
                    d1Var = f1Var.y;
                    if (d1Var.a() == 0) {
                        r1.l(v0Var2);
                        t0Var4.b(Long.valueOf(j), "Persisting first open");
                        d1Var.b(j);
                    }
                    r1.k(t2Var);
                    h1Var = t2Var.K;
                    if (h1Var.e()) {
                        f1 f1Var117 = h1Var.e.w;
                        r1.j(f1Var117);
                        f1Var117.P.e(null);
                    }
                    if (r1Var4.h()) {
                        if (r1Var4.b()) {
                            r4Var2 = r4Var;
                            if (r4Var2.O("android.permission.INTERNET")) {
                                r1.l(v0Var2);
                                t0Var7 = t0Var6;
                                t0Var7.a("App is missing INTERNET permission");
                            } else {
                                t0Var7 = t0Var6;
                            }
                            if (!r4Var2.O("android.permission.ACCESS_NETWORK_STATE")) {
                                r1.l(v0Var2);
                                t0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                            }
                            r1Var3 = r1Var4;
                            context = r1Var3.d;
                            if (!c.a(context).f()) {
                                if (!r4.h0(context)) {
                                    r1.l(v0Var2);
                                    t0Var7.a("AppMeasurementReceiver not registered/enabled");
                                }
                                if (!r4.K(context)) {
                                    r1.l(v0Var2);
                                    t0Var7.a("AppMeasurementService not registered/enabled");
                                }
                            }
                            r1.l(v0Var2);
                            t0Var7.a("Uploading is not possible. App measurement disabled");
                        } else {
                            r1Var3 = r1Var4;
                            r4Var2 = r4Var;
                        }
                        v0Var = v0Var2;
                    } else {
                        r1Var3 = r1Var4;
                        r4Var2 = r4Var;
                        if (TextUtils.isEmpty(r1Var3.q().y())) {
                            String strY17 = r1Var3.q().y();
                            f1Var.r();
                            String string10 = f1Var.v().getString("gmp_app_id", null);
                            zIsEmpty = TextUtils.isEmpty(strY17);
                            boolean zIsEmpty10 = TextUtils.isEmpty(string10);
                            if (zIsEmpty) {
                                z0Var2 = z0Var;
                            } else {
                                z0Var2 = z0Var;
                            }
                            String strY18 = r1Var3.q().y();
                            f1Var.r();
                            SharedPreferences.Editor editorEdit12 = f1Var.v().edit();
                            editorEdit12.putString("gmp_app_id", strY18);
                            editorEdit12.apply();
                        } else {
                            z0Var2 = z0Var;
                        }
                        if (!f1Var.y().i(d2Var)) {
                            z0Var2.e(null);
                        }
                        r1.k(t2Var);
                        t2Var.z.set(z0Var2.d());
                        r1Var5.d.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                        v0Var = v0Var2;
                        if (!TextUtils.isEmpty(r1Var3.q().y())) {
                            zB2 = r1Var3.b();
                            sharedPreferences = f1Var.i;
                            if (sharedPreferences == null) {
                                zContains = z2;
                            } else {
                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                            }
                            if (!zContains) {
                                f1Var.A(!zB2);
                            }
                            if (zB2) {
                                r1.k(t2Var);
                                t2Var.D();
                            }
                            w3 w3Var10 = r1Var3.A;
                            r1.k(w3Var10);
                            w3Var10.w.D();
                            r1Var3.o().v(new AtomicReference());
                            r1Var3.o().w(f1Var.R.k());
                        }
                    }
                    r8.a();
                    if (gVar.B(null, e0.Q0)) {
                        r4Var2.r();
                        if (r4Var2.M() == 1) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (z3) {
                            long jIntValue10 = ((Integer) e0.x0.a(null)).intValue();
                            long jNextInt10 = new Random().nextInt(5000);
                            r1Var3.D.getClass();
                            jMax = Math.max(500L, ((jIntValue10 * 1000) + jNextInt10) - SystemClock.elapsedRealtime());
                            if (jMax > 500) {
                                r1.l(v0Var);
                                t0Var4.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                            }
                            r1.k(t2Var);
                            t2Var.r();
                            if (t2Var.E == null) {
                                t2Var.E = new i2(t2Var, r1Var2, 0);
                            }
                            t2Var.E.b(jMax);
                        }
                    }
                    f1Var.H.b(true);
                }
                v0 v0Var120 = r1Var.y;
                r1.l(v0Var120);
                v0Var120.y.a("Failed to load metadata: Metadata bundle is null");
                numValueOf = null;
                if (numValueOf != null) {
                    stringArray = r1Var.d.getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        listAsList = Arrays.asList(stringArray);
                    }
                }
                if (listAsList != null) {
                    m0Var2.D = listAsList;
                    break;
                }
                if (listAsList.isEmpty()) {
                    it2 = listAsList.iterator();
                    do {
                        if (it2.hasNext()) {
                            m0Var2.D = listAsList;
                            break;
                        } else {
                            str3 = (String) it2.next();
                            r4Var3 = r1Var6.B;
                            r1.j(r4Var3);
                        }
                    } while (r4Var3.s0("safelisted event", str3));
                } else {
                    r1.l(v0Var5);
                    v0Var5.D.a("Safelisted event list is empty. Ignoring");
                }
                if (packageManager != null) {
                    m0Var2.F = com.gamericefishpro.space.b9.a.y(context3) ? 1 : 0;
                } else {
                    m0Var2.F = 0;
                }
                ((r1) m0Var2.d).V.incrementAndGet();
                m0Var2.e = true;
                y2Var = new y2(r1Var4);
                y2Var.t();
                r1Var4.N = y2Var;
                if (!y2Var.e) {
                    throw new IllegalStateException(str);
                }
                y2Var.i = (JobScheduler) ((r1) y2Var.d).d.getSystemService("jobscheduler");
                ((r1) y2Var.d).V.incrementAndGet();
                y2Var.e = true;
                r1.l(v0Var2);
                t0Var2 = v0Var2.F;
                t0Var3 = v0Var2.E;
                t0Var4 = v0Var2.G;
                t0Var5 = v0Var2.y;
                gVar.w();
                t0Var3.b(133005L, "App measurement initialized, version");
                r1.l(v0Var2);
                t0Var3.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                strX = m0Var.x();
                if (r4Var4.R(strX, gVar.i)) {
                    r1.l(v0Var2);
                    t0Var3.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                } else {
                    r1.l(v0Var2);
                    t0Var3.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strX)));
                }
                r1.l(v0Var2);
                t0Var2.a("Debug-level message logging enabled");
                i2 = r1Var4.T;
                atomicInteger = r1Var4.V;
                if (i2 != atomicInteger.get()) {
                    r1.l(v0Var2);
                    t0Var5.c("Not all components initialized", Integer.valueOf(r1Var4.T), Integer.valueOf(atomicInteger.get()));
                }
                r1Var4.O = true;
                j = r1Var4.W;
                t2Var = r1Var4.F;
                p1 p1Var5 = r1Var4.z;
                r1.l(p1Var5);
                p1Var5.r();
                r1.i(r1Var4.N);
                iW = r1Var4.N.w();
                r8.a();
                zB = gVar.B(null, e0.Q0);
                if (iW == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (zB) {
                    r4Var4.r();
                    if (r4Var4.M() == 1) {
                        r4Var4.r();
                        intentFilter = new IntentFilter();
                        intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        u4Var = new u4(r1Var5);
                        z4 = z;
                        context2 = r1Var5.d;
                        if (Build.VERSION.SDK_INT >= 33) {
                            context2.registerReceiver(u4Var, intentFilter, null, null, 2);
                        } else {
                            context2.registerReceiver(u4Var, intentFilter, null, null, 0);
                        }
                        v0 v0Var1114 = r1Var5.y;
                        r1.l(v0Var1114);
                        v0Var1114.F.a("Registered app receiver");
                        if (z4) {
                            r1.i(r1Var4.N);
                            r1Var4.N.v(((Long) e0.C.a(null)).longValue());
                        }
                    } else if (z) {
                        z = true;
                        r4Var4.r();
                        intentFilter = new IntentFilter();
                        intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        u4Var = new u4(r1Var5);
                        z4 = z;
                        context2 = r1Var5.d;
                        if (Build.VERSION.SDK_INT >= 33) {
                            context2.registerReceiver(u4Var, intentFilter, null, null, 2);
                        } else {
                            context2.registerReceiver(u4Var, intentFilter, null, null, 0);
                        }
                        v0 v0Var1115 = r1Var5.y;
                        r1.l(v0Var1115);
                        v0Var1115.F.a("Registered app receiver");
                        if (z4) {
                            r1.i(r1Var4.N);
                            r1Var4.N.v(((Long) e0.C.a(null)).longValue());
                        }
                    }
                } else if (z) {
                    z = true;
                    r4Var4.r();
                    intentFilter = new IntentFilter();
                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    u4Var = new u4(r1Var5);
                    z4 = z;
                    context2 = r1Var5.d;
                    if (Build.VERSION.SDK_INT >= 33) {
                        context2.registerReceiver(u4Var, intentFilter, null, null, 2);
                    } else {
                        context2.registerReceiver(u4Var, intentFilter, null, null, 0);
                    }
                    v0 v0Var1116 = r1Var5.y;
                    r1.l(v0Var1116);
                    v0Var1116.F.a("Registered app receiver");
                    if (z4) {
                        r1.i(r1Var4.N);
                        r1Var4.N.v(((Long) e0.C.a(null)).longValue());
                    }
                }
                z0Var = f1Var.z;
                e2VarY = f1Var.y();
                i3 = e2VarY.b;
                b2VarG = gVar.G("google_analytics_default_allow_ad_storage", false);
                b2VarG2 = gVar.G("google_analytics_default_allow_analytics_storage", false);
                b2Var = b2.UNINITIALIZED;
                d2Var = d2.ANALYTICS_STORAGE;
                if (b2VarG == b2Var) {
                    t0Var6 = t0Var5;
                    r4Var = r4Var4;
                    if (e2.l(-10, f1Var.v().getInt("consent_source", 100))) {
                        if (TextUtils.isEmpty(r1Var4.q().y())) {
                            if (i3 == 0) {
                            }
                            r1.k(t2Var);
                            z2 = false;
                            t2Var.N(new e2(-10), false);
                        } else {
                            z2 = false;
                        }
                        e2Var = null;
                        if (e2Var != null) {
                            r1.k(t2Var);
                            t2Var.N(e2Var, true);
                            e2Var2 = e2Var;
                        } else {
                            e2Var2 = e2VarY;
                        }
                        r1.k(t2Var);
                        r1Var2 = (r1) t2Var.d;
                        t2Var.v(e2Var2);
                        f1Var.r();
                        int i13 = o.b(f1Var.v().getString("dma_consent_settings", null)).a;
                        b2VarG3 = gVar.G("google_analytics_default_allow_ad_personalization_signals", true);
                        if (b2VarG3 != b2Var) {
                            r1.l(v0Var2);
                            t0Var4.b(b2VarG3, "Default ad personalization consent from Manifest");
                        }
                        b2VarG4 = gVar.G("google_analytics_default_allow_ad_user_data", true);
                        if (b2VarG4 == b2Var) {
                            if (TextUtils.isEmpty(r1Var4.q().y())) {
                                if (TextUtils.isEmpty(r1Var4.q().y())) {
                                    oVarC = o.c(bundle, 30);
                                    it = oVarC.e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((b2) it.next()) != b2Var) {
                                            r1.k(t2Var);
                                            t2Var.M(oVarC, true);
                                            break;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                                oVarC = o.c(bundle, 30);
                                it = oVarC.e.values().iterator();
                                while (it.hasNext()) {
                                    if (((b2) it.next()) != b2Var) {
                                        r1.k(t2Var);
                                        t2Var.M(oVarC, true);
                                        break;
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                            if (TextUtils.isEmpty(r1Var4.q().y())) {
                                oVarC = o.c(bundle, 30);
                                it = oVarC.e.values().iterator();
                                while (it.hasNext()) {
                                    if (((b2) it.next()) != b2Var) {
                                        r1.k(t2Var);
                                        t2Var.M(oVarC, true);
                                        break;
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                            oVarC = o.c(bundle, 30);
                            it = oVarC.e.values().iterator();
                            while (it.hasNext()) {
                                if (((b2) it.next()) != b2Var) {
                                    r1.k(t2Var);
                                    t2Var.M(oVarC, true);
                                    break;
                                }
                            }
                        }
                        boolD = gVar.D("google_analytics_tcf_data_enabled");
                        if (boolD != null) {
                            r1.l(v0Var2);
                            t0Var2.a("TCF client enabled.");
                            r1.k(t2Var);
                            t2Var.r();
                            v0 v0Var1117 = r1Var2.y;
                            r1.l(v0Var1117);
                            v0Var1117.F.a("Register tcfPrefChangeListener.");
                            if (t2Var.N == null) {
                                t2Var.O = new i2(t2Var, r1Var2, 2);
                                t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                        t2 t2Var2 = t2Var;
                                        r1 r1Var7 = (r1) t2Var2.d;
                                        g gVar4 = r1Var7.v;
                                        v0 v0Var1118 = r1Var7.y;
                                        if (!gVar4.B(null, e0.Z0)) {
                                            if (Objects.equals(str9, "IABTCF_TCString")) {
                                                r1.l(v0Var1118);
                                                v0Var1118.G.a("IABTCF_TCString change picked up in listener.");
                                                i2 i2Var = t2Var2.O;
                                                com.gamericefishpro.space.v8.c0.g(i2Var);
                                                i2Var.b(500L);
                                                return;
                                            }
                                            return;
                                        }
                                        if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                            r1.l(v0Var1118);
                                            v0Var1118.G.a("IABTCF_TCString change picked up in listener.");
                                            i2 i2Var2 = t2Var2.O;
                                            com.gamericefishpro.space.v8.c0.g(i2Var2);
                                            i2Var2.b(500L);
                                        }
                                    }
                                };
                            }
                            f1 f1Var118 = r1Var2.w;
                            r1.j(f1Var118);
                            f1Var118.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                            r1.k(t2Var);
                            t2Var.x();
                        } else {
                            r1.l(v0Var2);
                            t0Var2.a("TCF client enabled.");
                            r1.k(t2Var);
                            t2Var.r();
                            v0 v0Var1118 = r1Var2.y;
                            r1.l(v0Var1118);
                            v0Var1118.F.a("Register tcfPrefChangeListener.");
                            if (t2Var.N == null) {
                                t2Var.O = new i2(t2Var, r1Var2, 2);
                                t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                        t2 t2Var2 = t2Var;
                                        r1 r1Var7 = (r1) t2Var2.d;
                                        g gVar4 = r1Var7.v;
                                        v0 v0Var1119 = r1Var7.y;
                                        if (!gVar4.B(null, e0.Z0)) {
                                            if (Objects.equals(str9, "IABTCF_TCString")) {
                                                r1.l(v0Var1119);
                                                v0Var1119.G.a("IABTCF_TCString change picked up in listener.");
                                                i2 i2Var = t2Var2.O;
                                                com.gamericefishpro.space.v8.c0.g(i2Var);
                                                i2Var.b(500L);
                                                return;
                                            }
                                            return;
                                        }
                                        if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                            r1.l(v0Var1119);
                                            v0Var1119.G.a("IABTCF_TCString change picked up in listener.");
                                            i2 i2Var2 = t2Var2.O;
                                            com.gamericefishpro.space.v8.c0.g(i2Var2);
                                            i2Var2.b(500L);
                                        }
                                    }
                                };
                            }
                            f1 f1Var119 = r1Var2.w;
                            r1.j(f1Var119);
                            f1Var119.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                            r1.k(t2Var);
                            t2Var.x();
                        }
                        d1Var = f1Var.y;
                        if (d1Var.a() == 0) {
                            r1.l(v0Var2);
                            t0Var4.b(Long.valueOf(j), "Persisting first open");
                            d1Var.b(j);
                        }
                        r1.k(t2Var);
                        h1Var = t2Var.K;
                        if (h1Var.e()) {
                            f1 f1Var1110 = h1Var.e.w;
                            r1.j(f1Var1110);
                            f1Var1110.P.e(null);
                        }
                        if (r1Var4.h()) {
                            if (r1Var4.b()) {
                                r4Var2 = r4Var;
                                if (r4Var2.O("android.permission.INTERNET")) {
                                    r1.l(v0Var2);
                                    t0Var7 = t0Var6;
                                    t0Var7.a("App is missing INTERNET permission");
                                } else {
                                    t0Var7 = t0Var6;
                                }
                                if (!r4Var2.O("android.permission.ACCESS_NETWORK_STATE")) {
                                    r1.l(v0Var2);
                                    t0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                                }
                                r1Var3 = r1Var4;
                                context = r1Var3.d;
                                if (!c.a(context).f()) {
                                    if (!r4.h0(context)) {
                                        r1.l(v0Var2);
                                        t0Var7.a("AppMeasurementReceiver not registered/enabled");
                                    }
                                    if (!r4.K(context)) {
                                        r1.l(v0Var2);
                                        t0Var7.a("AppMeasurementService not registered/enabled");
                                    }
                                }
                                r1.l(v0Var2);
                                t0Var7.a("Uploading is not possible. App measurement disabled");
                            } else {
                                r1Var3 = r1Var4;
                                r4Var2 = r4Var;
                            }
                            v0Var = v0Var2;
                        } else {
                            r1Var3 = r1Var4;
                            r4Var2 = r4Var;
                            if (TextUtils.isEmpty(r1Var3.q().y())) {
                                String strY19 = r1Var3.q().y();
                                f1Var.r();
                                String string11 = f1Var.v().getString("gmp_app_id", null);
                                zIsEmpty = TextUtils.isEmpty(strY19);
                                boolean zIsEmpty11 = TextUtils.isEmpty(string11);
                                if (zIsEmpty) {
                                    z0Var2 = z0Var;
                                } else {
                                    z0Var2 = z0Var;
                                }
                                String strY110 = r1Var3.q().y();
                                f1Var.r();
                                SharedPreferences.Editor editorEdit13 = f1Var.v().edit();
                                editorEdit13.putString("gmp_app_id", strY110);
                                editorEdit13.apply();
                            } else {
                                z0Var2 = z0Var;
                            }
                            if (!f1Var.y().i(d2Var)) {
                                z0Var2.e(null);
                            }
                            r1.k(t2Var);
                            t2Var.z.set(z0Var2.d());
                            r1Var5.d.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                            v0Var = v0Var2;
                            if (!TextUtils.isEmpty(r1Var3.q().y())) {
                                zB2 = r1Var3.b();
                                sharedPreferences = f1Var.i;
                                if (sharedPreferences == null) {
                                    zContains = z2;
                                } else {
                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                }
                                if (!zContains) {
                                    f1Var.A(!zB2);
                                }
                                if (zB2) {
                                    r1.k(t2Var);
                                    t2Var.D();
                                }
                                w3 w3Var11 = r1Var3.A;
                                r1.k(w3Var11);
                                w3Var11.w.D();
                                r1Var3.o().v(new AtomicReference());
                                r1Var3.o().w(f1Var.R.k());
                            }
                        }
                        r8.a();
                        if (gVar.B(null, e0.Q0)) {
                            r4Var2.r();
                            if (r4Var2.M() == 1) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (z3) {
                                long jIntValue11 = ((Integer) e0.x0.a(null)).intValue();
                                long jNextInt11 = new Random().nextInt(5000);
                                r1Var3.D.getClass();
                                jMax = Math.max(500L, ((jIntValue11 * 1000) + jNextInt11) - SystemClock.elapsedRealtime());
                                if (jMax > 500) {
                                    r1.l(v0Var);
                                    t0Var4.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                }
                                r1.k(t2Var);
                                t2Var.r();
                                if (t2Var.E == null) {
                                    t2Var.E = new i2(t2Var, r1Var2, 0);
                                }
                                t2Var.E.b(jMax);
                            }
                        }
                        f1Var.H.b(true);
                    }
                    EnumMap enumMap7 = new EnumMap(d2.class);
                    enumMap7.put(d2.AD_STORAGE, b2VarG);
                    enumMap7.put(d2Var, b2VarG2);
                    e2Var = new e2(enumMap7, -10);
                } else {
                    t0Var6 = t0Var5;
                    r4Var = r4Var4;
                    if (e2.l(-10, f1Var.v().getInt("consent_source", 100))) {
                        if (TextUtils.isEmpty(r1Var4.q().y())) {
                            if (i3 == 0) {
                            }
                            r1.k(t2Var);
                            z2 = false;
                            t2Var.N(new e2(-10), false);
                        } else {
                            z2 = false;
                        }
                        e2Var = null;
                        if (e2Var != null) {
                            r1.k(t2Var);
                            t2Var.N(e2Var, true);
                            e2Var2 = e2Var;
                        } else {
                            e2Var2 = e2VarY;
                        }
                        r1.k(t2Var);
                        r1Var2 = (r1) t2Var.d;
                        t2Var.v(e2Var2);
                        f1Var.r();
                        int i14 = o.b(f1Var.v().getString("dma_consent_settings", null)).a;
                        b2VarG3 = gVar.G("google_analytics_default_allow_ad_personalization_signals", true);
                        if (b2VarG3 != b2Var) {
                            r1.l(v0Var2);
                            t0Var4.b(b2VarG3, "Default ad personalization consent from Manifest");
                        }
                        b2VarG4 = gVar.G("google_analytics_default_allow_ad_user_data", true);
                        if (b2VarG4 == b2Var) {
                            if (TextUtils.isEmpty(r1Var4.q().y())) {
                                if (TextUtils.isEmpty(r1Var4.q().y())) {
                                    oVarC = o.c(bundle, 30);
                                    it = oVarC.e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((b2) it.next()) != b2Var) {
                                            r1.k(t2Var);
                                            t2Var.M(oVarC, true);
                                            break;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                                oVarC = o.c(bundle, 30);
                                it = oVarC.e.values().iterator();
                                while (it.hasNext()) {
                                    if (((b2) it.next()) != b2Var) {
                                        r1.k(t2Var);
                                        t2Var.M(oVarC, true);
                                        break;
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                            if (TextUtils.isEmpty(r1Var4.q().y())) {
                                oVarC = o.c(bundle, 30);
                                it = oVarC.e.values().iterator();
                                while (it.hasNext()) {
                                    if (((b2) it.next()) != b2Var) {
                                        r1.k(t2Var);
                                        t2Var.M(oVarC, true);
                                        break;
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                            oVarC = o.c(bundle, 30);
                            it = oVarC.e.values().iterator();
                            while (it.hasNext()) {
                                if (((b2) it.next()) != b2Var) {
                                    r1.k(t2Var);
                                    t2Var.M(oVarC, true);
                                    break;
                                }
                            }
                        }
                        boolD = gVar.D("google_analytics_tcf_data_enabled");
                        if (boolD != null) {
                            r1.l(v0Var2);
                            t0Var2.a("TCF client enabled.");
                            r1.k(t2Var);
                            t2Var.r();
                            v0 v0Var1119 = r1Var2.y;
                            r1.l(v0Var1119);
                            v0Var1119.F.a("Register tcfPrefChangeListener.");
                            if (t2Var.N == null) {
                                t2Var.O = new i2(t2Var, r1Var2, 2);
                                t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                        t2 t2Var2 = t2Var;
                                        r1 r1Var7 = (r1) t2Var2.d;
                                        g gVar4 = r1Var7.v;
                                        v0 v0Var11110 = r1Var7.y;
                                        if (!gVar4.B(null, e0.Z0)) {
                                            if (Objects.equals(str9, "IABTCF_TCString")) {
                                                r1.l(v0Var11110);
                                                v0Var11110.G.a("IABTCF_TCString change picked up in listener.");
                                                i2 i2Var = t2Var2.O;
                                                com.gamericefishpro.space.v8.c0.g(i2Var);
                                                i2Var.b(500L);
                                                return;
                                            }
                                            return;
                                        }
                                        if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                            r1.l(v0Var11110);
                                            v0Var11110.G.a("IABTCF_TCString change picked up in listener.");
                                            i2 i2Var2 = t2Var2.O;
                                            com.gamericefishpro.space.v8.c0.g(i2Var2);
                                            i2Var2.b(500L);
                                        }
                                    }
                                };
                            }
                            f1 f1Var1111 = r1Var2.w;
                            r1.j(f1Var1111);
                            f1Var1111.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                            r1.k(t2Var);
                            t2Var.x();
                        } else {
                            r1.l(v0Var2);
                            t0Var2.a("TCF client enabled.");
                            r1.k(t2Var);
                            t2Var.r();
                            v0 v0Var11110 = r1Var2.y;
                            r1.l(v0Var11110);
                            v0Var11110.F.a("Register tcfPrefChangeListener.");
                            if (t2Var.N == null) {
                                t2Var.O = new i2(t2Var, r1Var2, 2);
                                t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                        t2 t2Var2 = t2Var;
                                        r1 r1Var7 = (r1) t2Var2.d;
                                        g gVar4 = r1Var7.v;
                                        v0 v0Var11111 = r1Var7.y;
                                        if (!gVar4.B(null, e0.Z0)) {
                                            if (Objects.equals(str9, "IABTCF_TCString")) {
                                                r1.l(v0Var11111);
                                                v0Var11111.G.a("IABTCF_TCString change picked up in listener.");
                                                i2 i2Var = t2Var2.O;
                                                com.gamericefishpro.space.v8.c0.g(i2Var);
                                                i2Var.b(500L);
                                                return;
                                            }
                                            return;
                                        }
                                        if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                            r1.l(v0Var11111);
                                            v0Var11111.G.a("IABTCF_TCString change picked up in listener.");
                                            i2 i2Var2 = t2Var2.O;
                                            com.gamericefishpro.space.v8.c0.g(i2Var2);
                                            i2Var2.b(500L);
                                        }
                                    }
                                };
                            }
                            f1 f1Var1112 = r1Var2.w;
                            r1.j(f1Var1112);
                            f1Var1112.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                            r1.k(t2Var);
                            t2Var.x();
                        }
                        d1Var = f1Var.y;
                        if (d1Var.a() == 0) {
                            r1.l(v0Var2);
                            t0Var4.b(Long.valueOf(j), "Persisting first open");
                            d1Var.b(j);
                        }
                        r1.k(t2Var);
                        h1Var = t2Var.K;
                        if (h1Var.e()) {
                            f1 f1Var1113 = h1Var.e.w;
                            r1.j(f1Var1113);
                            f1Var1113.P.e(null);
                        }
                        if (r1Var4.h()) {
                            if (r1Var4.b()) {
                                r4Var2 = r4Var;
                                if (r4Var2.O("android.permission.INTERNET")) {
                                    r1.l(v0Var2);
                                    t0Var7 = t0Var6;
                                    t0Var7.a("App is missing INTERNET permission");
                                } else {
                                    t0Var7 = t0Var6;
                                }
                                if (!r4Var2.O("android.permission.ACCESS_NETWORK_STATE")) {
                                    r1.l(v0Var2);
                                    t0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                                }
                                r1Var3 = r1Var4;
                                context = r1Var3.d;
                                if (!c.a(context).f()) {
                                    if (!r4.h0(context)) {
                                        r1.l(v0Var2);
                                        t0Var7.a("AppMeasurementReceiver not registered/enabled");
                                    }
                                    if (!r4.K(context)) {
                                        r1.l(v0Var2);
                                        t0Var7.a("AppMeasurementService not registered/enabled");
                                    }
                                }
                                r1.l(v0Var2);
                                t0Var7.a("Uploading is not possible. App measurement disabled");
                            } else {
                                r1Var3 = r1Var4;
                                r4Var2 = r4Var;
                            }
                            v0Var = v0Var2;
                        } else {
                            r1Var3 = r1Var4;
                            r4Var2 = r4Var;
                            if (TextUtils.isEmpty(r1Var3.q().y())) {
                                String strY111 = r1Var3.q().y();
                                f1Var.r();
                                String string12 = f1Var.v().getString("gmp_app_id", null);
                                zIsEmpty = TextUtils.isEmpty(strY111);
                                boolean zIsEmpty12 = TextUtils.isEmpty(string12);
                                if (zIsEmpty) {
                                    z0Var2 = z0Var;
                                } else {
                                    z0Var2 = z0Var;
                                }
                                String strY112 = r1Var3.q().y();
                                f1Var.r();
                                SharedPreferences.Editor editorEdit14 = f1Var.v().edit();
                                editorEdit14.putString("gmp_app_id", strY112);
                                editorEdit14.apply();
                            } else {
                                z0Var2 = z0Var;
                            }
                            if (!f1Var.y().i(d2Var)) {
                                z0Var2.e(null);
                            }
                            r1.k(t2Var);
                            t2Var.z.set(z0Var2.d());
                            r1Var5.d.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                            v0Var = v0Var2;
                            if (!TextUtils.isEmpty(r1Var3.q().y())) {
                                zB2 = r1Var3.b();
                                sharedPreferences = f1Var.i;
                                if (sharedPreferences == null) {
                                    zContains = z2;
                                } else {
                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                }
                                if (!zContains) {
                                    f1Var.A(!zB2);
                                }
                                if (zB2) {
                                    r1.k(t2Var);
                                    t2Var.D();
                                }
                                w3 w3Var12 = r1Var3.A;
                                r1.k(w3Var12);
                                w3Var12.w.D();
                                r1Var3.o().v(new AtomicReference());
                                r1Var3.o().w(f1Var.R.k());
                            }
                        }
                        r8.a();
                        if (gVar.B(null, e0.Q0)) {
                            r4Var2.r();
                            if (r4Var2.M() == 1) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (z3) {
                                long jIntValue12 = ((Integer) e0.x0.a(null)).intValue();
                                long jNextInt12 = new Random().nextInt(5000);
                                r1Var3.D.getClass();
                                jMax = Math.max(500L, ((jIntValue12 * 1000) + jNextInt12) - SystemClock.elapsedRealtime());
                                if (jMax > 500) {
                                    r1.l(v0Var);
                                    t0Var4.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                }
                                r1.k(t2Var);
                                t2Var.r();
                                if (t2Var.E == null) {
                                    t2Var.E = new i2(t2Var, r1Var2, 0);
                                }
                                t2Var.E.b(jMax);
                            }
                        }
                        f1Var.H.b(true);
                    }
                    EnumMap enumMap8 = new EnumMap(d2.class);
                    enumMap8.put(d2.AD_STORAGE, b2VarG);
                    enumMap8.put(d2Var, b2VarG2);
                    e2Var = new e2(enumMap8, -10);
                }
                z2 = false;
                if (e2Var != null) {
                    r1.k(t2Var);
                    t2Var.N(e2Var, true);
                    e2Var2 = e2Var;
                } else {
                    e2Var2 = e2VarY;
                }
                r1.k(t2Var);
                r1Var2 = (r1) t2Var.d;
                t2Var.v(e2Var2);
                f1Var.r();
                int i15 = o.b(f1Var.v().getString("dma_consent_settings", null)).a;
                b2VarG3 = gVar.G("google_analytics_default_allow_ad_personalization_signals", true);
                if (b2VarG3 != b2Var) {
                    r1.l(v0Var2);
                    t0Var4.b(b2VarG3, "Default ad personalization consent from Manifest");
                }
                b2VarG4 = gVar.G("google_analytics_default_allow_ad_user_data", true);
                if (b2VarG4 == b2Var) {
                    if (TextUtils.isEmpty(r1Var4.q().y())) {
                        if (TextUtils.isEmpty(r1Var4.q().y())) {
                            oVarC = o.c(bundle, 30);
                            it = oVarC.e.values().iterator();
                            while (it.hasNext()) {
                                if (((b2) it.next()) != b2Var) {
                                    r1.k(t2Var);
                                    t2Var.M(oVarC, true);
                                    break;
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                        oVarC = o.c(bundle, 30);
                        it = oVarC.e.values().iterator();
                        while (it.hasNext()) {
                            if (((b2) it.next()) != b2Var) {
                                r1.k(t2Var);
                                t2Var.M(oVarC, true);
                                break;
                            }
                        }
                    }
                } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                    if (TextUtils.isEmpty(r1Var4.q().y())) {
                        oVarC = o.c(bundle, 30);
                        it = oVarC.e.values().iterator();
                        while (it.hasNext()) {
                            if (((b2) it.next()) != b2Var) {
                                r1.k(t2Var);
                                t2Var.M(oVarC, true);
                                break;
                            }
                        }
                    }
                } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                    oVarC = o.c(bundle, 30);
                    it = oVarC.e.values().iterator();
                    while (it.hasNext()) {
                        if (((b2) it.next()) != b2Var) {
                            r1.k(t2Var);
                            t2Var.M(oVarC, true);
                            break;
                        }
                    }
                }
                boolD = gVar.D("google_analytics_tcf_data_enabled");
                if (boolD != null) {
                    r1.l(v0Var2);
                    t0Var2.a("TCF client enabled.");
                    r1.k(t2Var);
                    t2Var.r();
                    v0 v0Var11111 = r1Var2.y;
                    r1.l(v0Var11111);
                    v0Var11111.F.a("Register tcfPrefChangeListener.");
                    if (t2Var.N == null) {
                        t2Var.O = new i2(t2Var, r1Var2, 2);
                        t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                t2 t2Var2 = t2Var;
                                r1 r1Var7 = (r1) t2Var2.d;
                                g gVar4 = r1Var7.v;
                                v0 v0Var11112 = r1Var7.y;
                                if (!gVar4.B(null, e0.Z0)) {
                                    if (Objects.equals(str9, "IABTCF_TCString")) {
                                        r1.l(v0Var11112);
                                        v0Var11112.G.a("IABTCF_TCString change picked up in listener.");
                                        i2 i2Var = t2Var2.O;
                                        com.gamericefishpro.space.v8.c0.g(i2Var);
                                        i2Var.b(500L);
                                        return;
                                    }
                                    return;
                                }
                                if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                    r1.l(v0Var11112);
                                    v0Var11112.G.a("IABTCF_TCString change picked up in listener.");
                                    i2 i2Var2 = t2Var2.O;
                                    com.gamericefishpro.space.v8.c0.g(i2Var2);
                                    i2Var2.b(500L);
                                }
                            }
                        };
                    }
                    f1 f1Var1114 = r1Var2.w;
                    r1.j(f1Var1114);
                    f1Var1114.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                    r1.k(t2Var);
                    t2Var.x();
                } else {
                    r1.l(v0Var2);
                    t0Var2.a("TCF client enabled.");
                    r1.k(t2Var);
                    t2Var.r();
                    v0 v0Var11112 = r1Var2.y;
                    r1.l(v0Var11112);
                    v0Var11112.F.a("Register tcfPrefChangeListener.");
                    if (t2Var.N == null) {
                        t2Var.O = new i2(t2Var, r1Var2, 2);
                        t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                t2 t2Var2 = t2Var;
                                r1 r1Var7 = (r1) t2Var2.d;
                                g gVar4 = r1Var7.v;
                                v0 v0Var11113 = r1Var7.y;
                                if (!gVar4.B(null, e0.Z0)) {
                                    if (Objects.equals(str9, "IABTCF_TCString")) {
                                        r1.l(v0Var11113);
                                        v0Var11113.G.a("IABTCF_TCString change picked up in listener.");
                                        i2 i2Var = t2Var2.O;
                                        com.gamericefishpro.space.v8.c0.g(i2Var);
                                        i2Var.b(500L);
                                        return;
                                    }
                                    return;
                                }
                                if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                    r1.l(v0Var11113);
                                    v0Var11113.G.a("IABTCF_TCString change picked up in listener.");
                                    i2 i2Var2 = t2Var2.O;
                                    com.gamericefishpro.space.v8.c0.g(i2Var2);
                                    i2Var2.b(500L);
                                }
                            }
                        };
                    }
                    f1 f1Var1115 = r1Var2.w;
                    r1.j(f1Var1115);
                    f1Var1115.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                    r1.k(t2Var);
                    t2Var.x();
                }
                d1Var = f1Var.y;
                if (d1Var.a() == 0) {
                    r1.l(v0Var2);
                    t0Var4.b(Long.valueOf(j), "Persisting first open");
                    d1Var.b(j);
                }
                r1.k(t2Var);
                h1Var = t2Var.K;
                if (h1Var.e()) {
                    f1 f1Var1116 = h1Var.e.w;
                    r1.j(f1Var1116);
                    f1Var1116.P.e(null);
                }
                if (r1Var4.h()) {
                    if (r1Var4.b()) {
                        r4Var2 = r4Var;
                        if (r4Var2.O("android.permission.INTERNET")) {
                            r1.l(v0Var2);
                            t0Var7 = t0Var6;
                            t0Var7.a("App is missing INTERNET permission");
                        } else {
                            t0Var7 = t0Var6;
                        }
                        if (!r4Var2.O("android.permission.ACCESS_NETWORK_STATE")) {
                            r1.l(v0Var2);
                            t0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                        }
                        r1Var3 = r1Var4;
                        context = r1Var3.d;
                        if (!c.a(context).f()) {
                            if (!r4.h0(context)) {
                                r1.l(v0Var2);
                                t0Var7.a("AppMeasurementReceiver not registered/enabled");
                            }
                            if (!r4.K(context)) {
                                r1.l(v0Var2);
                                t0Var7.a("AppMeasurementService not registered/enabled");
                            }
                        }
                        r1.l(v0Var2);
                        t0Var7.a("Uploading is not possible. App measurement disabled");
                    } else {
                        r1Var3 = r1Var4;
                        r4Var2 = r4Var;
                    }
                    v0Var = v0Var2;
                } else {
                    r1Var3 = r1Var4;
                    r4Var2 = r4Var;
                    if (TextUtils.isEmpty(r1Var3.q().y())) {
                        String strY113 = r1Var3.q().y();
                        f1Var.r();
                        String string13 = f1Var.v().getString("gmp_app_id", null);
                        zIsEmpty = TextUtils.isEmpty(strY113);
                        boolean zIsEmpty13 = TextUtils.isEmpty(string13);
                        if (zIsEmpty) {
                            z0Var2 = z0Var;
                        } else {
                            z0Var2 = z0Var;
                        }
                        String strY114 = r1Var3.q().y();
                        f1Var.r();
                        SharedPreferences.Editor editorEdit15 = f1Var.v().edit();
                        editorEdit15.putString("gmp_app_id", strY114);
                        editorEdit15.apply();
                    } else {
                        z0Var2 = z0Var;
                    }
                    if (!f1Var.y().i(d2Var)) {
                        z0Var2.e(null);
                    }
                    r1.k(t2Var);
                    t2Var.z.set(z0Var2.d());
                    r1Var5.d.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                    v0Var = v0Var2;
                    if (!TextUtils.isEmpty(r1Var3.q().y())) {
                        zB2 = r1Var3.b();
                        sharedPreferences = f1Var.i;
                        if (sharedPreferences == null) {
                            zContains = z2;
                        } else {
                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                        }
                        if (!zContains) {
                            f1Var.A(!zB2);
                        }
                        if (zB2) {
                            r1.k(t2Var);
                            t2Var.D();
                        }
                        w3 w3Var13 = r1Var3.A;
                        r1.k(w3Var13);
                        w3Var13.w.D();
                        r1Var3.o().v(new AtomicReference());
                        r1Var3.o().w(f1Var.R.k());
                    }
                }
                r8.a();
                if (gVar.B(null, e0.Q0)) {
                    r4Var2.r();
                    if (r4Var2.M() == 1) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (z3) {
                        long jIntValue13 = ((Integer) e0.x0.a(null)).intValue();
                        long jNextInt13 = new Random().nextInt(5000);
                        r1Var3.D.getClass();
                        jMax = Math.max(500L, ((jIntValue13 * 1000) + jNextInt13) - SystemClock.elapsedRealtime());
                        if (jMax > 500) {
                            r1.l(v0Var);
                            t0Var4.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                        }
                        r1.k(t2Var);
                        t2Var.r();
                        if (t2Var.E == null) {
                            t2Var.E = new i2(t2Var, r1Var2, 0);
                        }
                        t2Var.E.b(jMax);
                    }
                }
                f1Var.H.b(true);
            }
            r1.l(v0Var5);
            str = "Can't initialize twice";
            t0Var = t0Var8;
            v0Var5.y.b(v0.z(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
            strB = f2.b(context3, r1Var6.I);
            if (!TextUtils.isEmpty(strB)) {
                str4 = strB;
            }
            m0Var2.G = str4;
            if (iG == 0) {
                r1.l(v0Var5);
                v0Var5.G.c("App measurement enabled for app package, google app id", m0Var2.i, m0Var2.G);
            }
        } catch (IllegalStateException e2) {
            r1.l(v0Var5);
            v0Var5.y.c("Fetching Google App Id failed with exception. appId", v0.z(packageName), e2);
        }
        i = Integer.MIN_VALUE;
        string = "Unknown";
        str2 = string;
        String str9 = installerPackageName;
        m0Var2.i = packageName;
        m0Var2.y = str9;
        m0Var2.v = str2;
        m0Var2.w = i;
        m0Var2.z = string;
        m0Var2.A = 0L;
        iG = r1Var6.g();
        if (iG == 0) {
            r1.l(v0Var5);
            v0Var5.G.a("App measurement collection enabled");
        } else if (iG == 1) {
            r1.l(v0Var5);
            v0Var5.E.a("App measurement deactivated via the manifest");
        } else if (iG == 3) {
            r1.l(v0Var5);
            v0Var5.E.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
        } else if (iG == 4) {
            r1.l(v0Var5);
            v0Var5.E.a("App measurement disabled via the manifest");
        } else if (iG == 6) {
            r1.l(v0Var5);
            v0Var5.D.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
        } else if (iG == 7) {
            r1.l(v0Var5);
            v0Var5.E.a("App measurement disabled via the global data collection setting");
        } else if (iG != 8) {
            r1.l(v0Var5);
            v0Var5.E.a("App measurement disabled");
            r1.l(v0Var5);
            v0Var5.z.a("Invalid scion state in identity");
        } else {
            r1.l(v0Var5);
            v0Var5.E.a("App measurement disabled due to denied storage consent");
        }
        m0Var2.G = "";
        listAsList = null;
        m0Var2.D = null;
        g gVar4 = r1Var6.v;
        r1Var = (r1) gVar4.d;
        c0.d("analytics.safelisted_events");
        bundleC = gVar4.C();
        if (bundleC != null) {
            if (bundleC.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleC.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                stringArray = r1Var.d.getResources().getStringArray(numValueOf.intValue());
                if (stringArray == null) {
                    listAsList = Arrays.asList(stringArray);
                }
            }
            if (listAsList != null) {
                m0Var2.D = listAsList;
                break;
            }
            if (listAsList.isEmpty()) {
                it2 = listAsList.iterator();
                do {
                    if (it2.hasNext()) {
                        m0Var2.D = listAsList;
                        break;
                    } else {
                        str3 = (String) it2.next();
                        r4Var3 = r1Var6.B;
                        r1.j(r4Var3);
                    }
                } while (r4Var3.s0("safelisted event", str3));
            } else {
                r1.l(v0Var5);
                v0Var5.D.a("Safelisted event list is empty. Ignoring");
            }
            if (packageManager != null) {
                m0Var2.F = com.gamericefishpro.space.b9.a.y(context3) ? 1 : 0;
            } else {
                m0Var2.F = 0;
            }
            ((r1) m0Var2.d).V.incrementAndGet();
            m0Var2.e = true;
            y2Var = new y2(r1Var4);
            y2Var.t();
            r1Var4.N = y2Var;
            if (!y2Var.e) {
                throw new IllegalStateException(str);
            }
            y2Var.i = (JobScheduler) ((r1) y2Var.d).d.getSystemService("jobscheduler");
            ((r1) y2Var.d).V.incrementAndGet();
            y2Var.e = true;
            r1.l(v0Var2);
            t0Var2 = v0Var2.F;
            t0Var3 = v0Var2.E;
            t0Var4 = v0Var2.G;
            t0Var5 = v0Var2.y;
            gVar.w();
            t0Var3.b(133005L, "App measurement initialized, version");
            r1.l(v0Var2);
            t0Var3.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
            strX = m0Var.x();
            if (r4Var4.R(strX, gVar.i)) {
                r1.l(v0Var2);
                t0Var3.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                r1.l(v0Var2);
                t0Var3.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strX)));
            }
            r1.l(v0Var2);
            t0Var2.a("Debug-level message logging enabled");
            i2 = r1Var4.T;
            atomicInteger = r1Var4.V;
            if (i2 != atomicInteger.get()) {
                r1.l(v0Var2);
                t0Var5.c("Not all components initialized", Integer.valueOf(r1Var4.T), Integer.valueOf(atomicInteger.get()));
            }
            r1Var4.O = true;
            j = r1Var4.W;
            t2Var = r1Var4.F;
            p1 p1Var6 = r1Var4.z;
            r1.l(p1Var6);
            p1Var6.r();
            r1.i(r1Var4.N);
            iW = r1Var4.N.w();
            r8.a();
            zB = gVar.B(null, e0.Q0);
            if (iW == 2) {
                z = true;
            } else {
                z = false;
            }
            if (zB) {
                r4Var4.r();
                if (r4Var4.M() == 1) {
                    r4Var4.r();
                    intentFilter = new IntentFilter();
                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    u4Var = new u4(r1Var5);
                    z4 = z;
                    context2 = r1Var5.d;
                    if (Build.VERSION.SDK_INT >= 33) {
                        context2.registerReceiver(u4Var, intentFilter, null, null, 2);
                    } else {
                        context2.registerReceiver(u4Var, intentFilter, null, null, 0);
                    }
                    v0 v0Var11113 = r1Var5.y;
                    r1.l(v0Var11113);
                    v0Var11113.F.a("Registered app receiver");
                    if (z4) {
                        r1.i(r1Var4.N);
                        r1Var4.N.v(((Long) e0.C.a(null)).longValue());
                    }
                } else if (z) {
                    z = true;
                    r4Var4.r();
                    intentFilter = new IntentFilter();
                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    u4Var = new u4(r1Var5);
                    z4 = z;
                    context2 = r1Var5.d;
                    if (Build.VERSION.SDK_INT >= 33) {
                        context2.registerReceiver(u4Var, intentFilter, null, null, 2);
                    } else {
                        context2.registerReceiver(u4Var, intentFilter, null, null, 0);
                    }
                    v0 v0Var11114 = r1Var5.y;
                    r1.l(v0Var11114);
                    v0Var11114.F.a("Registered app receiver");
                    if (z4) {
                        r1.i(r1Var4.N);
                        r1Var4.N.v(((Long) e0.C.a(null)).longValue());
                    }
                }
            } else if (z) {
                z = true;
                r4Var4.r();
                intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                u4Var = new u4(r1Var5);
                z4 = z;
                context2 = r1Var5.d;
                if (Build.VERSION.SDK_INT >= 33) {
                    context2.registerReceiver(u4Var, intentFilter, null, null, 2);
                } else {
                    context2.registerReceiver(u4Var, intentFilter, null, null, 0);
                }
                v0 v0Var11115 = r1Var5.y;
                r1.l(v0Var11115);
                v0Var11115.F.a("Registered app receiver");
                if (z4) {
                    r1.i(r1Var4.N);
                    r1Var4.N.v(((Long) e0.C.a(null)).longValue());
                }
            }
            z0Var = f1Var.z;
            e2VarY = f1Var.y();
            i3 = e2VarY.b;
            b2VarG = gVar.G("google_analytics_default_allow_ad_storage", false);
            b2VarG2 = gVar.G("google_analytics_default_allow_analytics_storage", false);
            b2Var = b2.UNINITIALIZED;
            d2Var = d2.ANALYTICS_STORAGE;
            if (b2VarG == b2Var) {
                t0Var6 = t0Var5;
                r4Var = r4Var4;
                if (e2.l(-10, f1Var.v().getInt("consent_source", 100))) {
                    if (TextUtils.isEmpty(r1Var4.q().y())) {
                        if (i3 == 0) {
                        }
                        r1.k(t2Var);
                        z2 = false;
                        t2Var.N(new e2(-10), false);
                    } else {
                        z2 = false;
                    }
                    e2Var = null;
                    if (e2Var != null) {
                        r1.k(t2Var);
                        t2Var.N(e2Var, true);
                        e2Var2 = e2Var;
                    } else {
                        e2Var2 = e2VarY;
                    }
                    r1.k(t2Var);
                    r1Var2 = (r1) t2Var.d;
                    t2Var.v(e2Var2);
                    f1Var.r();
                    int i16 = o.b(f1Var.v().getString("dma_consent_settings", null)).a;
                    b2VarG3 = gVar.G("google_analytics_default_allow_ad_personalization_signals", true);
                    if (b2VarG3 != b2Var) {
                        r1.l(v0Var2);
                        t0Var4.b(b2VarG3, "Default ad personalization consent from Manifest");
                    }
                    b2VarG4 = gVar.G("google_analytics_default_allow_ad_user_data", true);
                    if (b2VarG4 == b2Var) {
                        if (TextUtils.isEmpty(r1Var4.q().y())) {
                            if (TextUtils.isEmpty(r1Var4.q().y())) {
                                oVarC = o.c(bundle, 30);
                                it = oVarC.e.values().iterator();
                                while (it.hasNext()) {
                                    if (((b2) it.next()) != b2Var) {
                                        r1.k(t2Var);
                                        t2Var.M(oVarC, true);
                                        break;
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                            oVarC = o.c(bundle, 30);
                            it = oVarC.e.values().iterator();
                            while (it.hasNext()) {
                                if (((b2) it.next()) != b2Var) {
                                    r1.k(t2Var);
                                    t2Var.M(oVarC, true);
                                    break;
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                        if (TextUtils.isEmpty(r1Var4.q().y())) {
                            oVarC = o.c(bundle, 30);
                            it = oVarC.e.values().iterator();
                            while (it.hasNext()) {
                                if (((b2) it.next()) != b2Var) {
                                    r1.k(t2Var);
                                    t2Var.M(oVarC, true);
                                    break;
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                        oVarC = o.c(bundle, 30);
                        it = oVarC.e.values().iterator();
                        while (it.hasNext()) {
                            if (((b2) it.next()) != b2Var) {
                                r1.k(t2Var);
                                t2Var.M(oVarC, true);
                                break;
                            }
                        }
                    }
                    boolD = gVar.D("google_analytics_tcf_data_enabled");
                    if (boolD != null) {
                        r1.l(v0Var2);
                        t0Var2.a("TCF client enabled.");
                        r1.k(t2Var);
                        t2Var.r();
                        v0 v0Var11116 = r1Var2.y;
                        r1.l(v0Var11116);
                        v0Var11116.F.a("Register tcfPrefChangeListener.");
                        if (t2Var.N == null) {
                            t2Var.O = new i2(t2Var, r1Var2, 2);
                            t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                                    t2 t2Var2 = t2Var;
                                    r1 r1Var7 = (r1) t2Var2.d;
                                    g gVar5 = r1Var7.v;
                                    v0 v0Var11117 = r1Var7.y;
                                    if (!gVar5.B(null, e0.Z0)) {
                                        if (Objects.equals(str10, "IABTCF_TCString")) {
                                            r1.l(v0Var11117);
                                            v0Var11117.G.a("IABTCF_TCString change picked up in listener.");
                                            i2 i2Var = t2Var2.O;
                                            com.gamericefishpro.space.v8.c0.g(i2Var);
                                            i2Var.b(500L);
                                            return;
                                        }
                                        return;
                                    }
                                    if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                                        r1.l(v0Var11117);
                                        v0Var11117.G.a("IABTCF_TCString change picked up in listener.");
                                        i2 i2Var2 = t2Var2.O;
                                        com.gamericefishpro.space.v8.c0.g(i2Var2);
                                        i2Var2.b(500L);
                                    }
                                }
                            };
                        }
                        f1 f1Var1117 = r1Var2.w;
                        r1.j(f1Var1117);
                        f1Var1117.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                        r1.k(t2Var);
                        t2Var.x();
                    } else {
                        r1.l(v0Var2);
                        t0Var2.a("TCF client enabled.");
                        r1.k(t2Var);
                        t2Var.r();
                        v0 v0Var11117 = r1Var2.y;
                        r1.l(v0Var11117);
                        v0Var11117.F.a("Register tcfPrefChangeListener.");
                        if (t2Var.N == null) {
                            t2Var.O = new i2(t2Var, r1Var2, 2);
                            t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                                    t2 t2Var2 = t2Var;
                                    r1 r1Var7 = (r1) t2Var2.d;
                                    g gVar5 = r1Var7.v;
                                    v0 v0Var11118 = r1Var7.y;
                                    if (!gVar5.B(null, e0.Z0)) {
                                        if (Objects.equals(str10, "IABTCF_TCString")) {
                                            r1.l(v0Var11118);
                                            v0Var11118.G.a("IABTCF_TCString change picked up in listener.");
                                            i2 i2Var = t2Var2.O;
                                            com.gamericefishpro.space.v8.c0.g(i2Var);
                                            i2Var.b(500L);
                                            return;
                                        }
                                        return;
                                    }
                                    if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                                        r1.l(v0Var11118);
                                        v0Var11118.G.a("IABTCF_TCString change picked up in listener.");
                                        i2 i2Var2 = t2Var2.O;
                                        com.gamericefishpro.space.v8.c0.g(i2Var2);
                                        i2Var2.b(500L);
                                    }
                                }
                            };
                        }
                        f1 f1Var1118 = r1Var2.w;
                        r1.j(f1Var1118);
                        f1Var1118.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                        r1.k(t2Var);
                        t2Var.x();
                    }
                    d1Var = f1Var.y;
                    if (d1Var.a() == 0) {
                        r1.l(v0Var2);
                        t0Var4.b(Long.valueOf(j), "Persisting first open");
                        d1Var.b(j);
                    }
                    r1.k(t2Var);
                    h1Var = t2Var.K;
                    if (h1Var.e()) {
                        f1 f1Var1119 = h1Var.e.w;
                        r1.j(f1Var1119);
                        f1Var1119.P.e(null);
                    }
                    if (r1Var4.h()) {
                        if (r1Var4.b()) {
                            r4Var2 = r4Var;
                            if (r4Var2.O("android.permission.INTERNET")) {
                                r1.l(v0Var2);
                                t0Var7 = t0Var6;
                                t0Var7.a("App is missing INTERNET permission");
                            } else {
                                t0Var7 = t0Var6;
                            }
                            if (!r4Var2.O("android.permission.ACCESS_NETWORK_STATE")) {
                                r1.l(v0Var2);
                                t0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                            }
                            r1Var3 = r1Var4;
                            context = r1Var3.d;
                            if (!c.a(context).f()) {
                                if (!r4.h0(context)) {
                                    r1.l(v0Var2);
                                    t0Var7.a("AppMeasurementReceiver not registered/enabled");
                                }
                                if (!r4.K(context)) {
                                    r1.l(v0Var2);
                                    t0Var7.a("AppMeasurementService not registered/enabled");
                                }
                            }
                            r1.l(v0Var2);
                            t0Var7.a("Uploading is not possible. App measurement disabled");
                        } else {
                            r1Var3 = r1Var4;
                            r4Var2 = r4Var;
                        }
                        v0Var = v0Var2;
                    } else {
                        r1Var3 = r1Var4;
                        r4Var2 = r4Var;
                        if (TextUtils.isEmpty(r1Var3.q().y())) {
                            String strY115 = r1Var3.q().y();
                            f1Var.r();
                            String string14 = f1Var.v().getString("gmp_app_id", null);
                            zIsEmpty = TextUtils.isEmpty(strY115);
                            boolean zIsEmpty14 = TextUtils.isEmpty(string14);
                            if (zIsEmpty) {
                                z0Var2 = z0Var;
                            } else {
                                z0Var2 = z0Var;
                            }
                            String strY116 = r1Var3.q().y();
                            f1Var.r();
                            SharedPreferences.Editor editorEdit16 = f1Var.v().edit();
                            editorEdit16.putString("gmp_app_id", strY116);
                            editorEdit16.apply();
                        } else {
                            z0Var2 = z0Var;
                        }
                        if (!f1Var.y().i(d2Var)) {
                            z0Var2.e(null);
                        }
                        r1.k(t2Var);
                        t2Var.z.set(z0Var2.d());
                        r1Var5.d.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                        v0Var = v0Var2;
                        if (!TextUtils.isEmpty(r1Var3.q().y())) {
                            zB2 = r1Var3.b();
                            sharedPreferences = f1Var.i;
                            if (sharedPreferences == null) {
                                zContains = z2;
                            } else {
                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                            }
                            if (!zContains) {
                                f1Var.A(!zB2);
                            }
                            if (zB2) {
                                r1.k(t2Var);
                                t2Var.D();
                            }
                            w3 w3Var14 = r1Var3.A;
                            r1.k(w3Var14);
                            w3Var14.w.D();
                            r1Var3.o().v(new AtomicReference());
                            r1Var3.o().w(f1Var.R.k());
                        }
                    }
                    r8.a();
                    if (gVar.B(null, e0.Q0)) {
                        r4Var2.r();
                        if (r4Var2.M() == 1) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (z3) {
                            long jIntValue14 = ((Integer) e0.x0.a(null)).intValue();
                            long jNextInt14 = new Random().nextInt(5000);
                            r1Var3.D.getClass();
                            jMax = Math.max(500L, ((jIntValue14 * 1000) + jNextInt14) - SystemClock.elapsedRealtime());
                            if (jMax > 500) {
                                r1.l(v0Var);
                                t0Var4.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                            }
                            r1.k(t2Var);
                            t2Var.r();
                            if (t2Var.E == null) {
                                t2Var.E = new i2(t2Var, r1Var2, 0);
                            }
                            t2Var.E.b(jMax);
                        }
                    }
                    f1Var.H.b(true);
                }
                EnumMap enumMap9 = new EnumMap(d2.class);
                enumMap9.put(d2.AD_STORAGE, b2VarG);
                enumMap9.put(d2Var, b2VarG2);
                e2Var = new e2(enumMap9, -10);
            } else {
                t0Var6 = t0Var5;
                r4Var = r4Var4;
                if (e2.l(-10, f1Var.v().getInt("consent_source", 100))) {
                    if (TextUtils.isEmpty(r1Var4.q().y())) {
                        if (i3 == 0) {
                        }
                        r1.k(t2Var);
                        z2 = false;
                        t2Var.N(new e2(-10), false);
                    } else {
                        z2 = false;
                    }
                    e2Var = null;
                    if (e2Var != null) {
                        r1.k(t2Var);
                        t2Var.N(e2Var, true);
                        e2Var2 = e2Var;
                    } else {
                        e2Var2 = e2VarY;
                    }
                    r1.k(t2Var);
                    r1Var2 = (r1) t2Var.d;
                    t2Var.v(e2Var2);
                    f1Var.r();
                    int i17 = o.b(f1Var.v().getString("dma_consent_settings", null)).a;
                    b2VarG3 = gVar.G("google_analytics_default_allow_ad_personalization_signals", true);
                    if (b2VarG3 != b2Var) {
                        r1.l(v0Var2);
                        t0Var4.b(b2VarG3, "Default ad personalization consent from Manifest");
                    }
                    b2VarG4 = gVar.G("google_analytics_default_allow_ad_user_data", true);
                    if (b2VarG4 == b2Var) {
                        if (TextUtils.isEmpty(r1Var4.q().y())) {
                            if (TextUtils.isEmpty(r1Var4.q().y())) {
                                oVarC = o.c(bundle, 30);
                                it = oVarC.e.values().iterator();
                                while (it.hasNext()) {
                                    if (((b2) it.next()) != b2Var) {
                                        r1.k(t2Var);
                                        t2Var.M(oVarC, true);
                                        break;
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                            oVarC = o.c(bundle, 30);
                            it = oVarC.e.values().iterator();
                            while (it.hasNext()) {
                                if (((b2) it.next()) != b2Var) {
                                    r1.k(t2Var);
                                    t2Var.M(oVarC, true);
                                    break;
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                        if (TextUtils.isEmpty(r1Var4.q().y())) {
                            oVarC = o.c(bundle, 30);
                            it = oVarC.e.values().iterator();
                            while (it.hasNext()) {
                                if (((b2) it.next()) != b2Var) {
                                    r1.k(t2Var);
                                    t2Var.M(oVarC, true);
                                    break;
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                        oVarC = o.c(bundle, 30);
                        it = oVarC.e.values().iterator();
                        while (it.hasNext()) {
                            if (((b2) it.next()) != b2Var) {
                                r1.k(t2Var);
                                t2Var.M(oVarC, true);
                                break;
                            }
                        }
                    }
                    boolD = gVar.D("google_analytics_tcf_data_enabled");
                    if (boolD != null) {
                        r1.l(v0Var2);
                        t0Var2.a("TCF client enabled.");
                        r1.k(t2Var);
                        t2Var.r();
                        v0 v0Var11118 = r1Var2.y;
                        r1.l(v0Var11118);
                        v0Var11118.F.a("Register tcfPrefChangeListener.");
                        if (t2Var.N == null) {
                            t2Var.O = new i2(t2Var, r1Var2, 2);
                            t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                                    t2 t2Var2 = t2Var;
                                    r1 r1Var7 = (r1) t2Var2.d;
                                    g gVar5 = r1Var7.v;
                                    v0 v0Var11119 = r1Var7.y;
                                    if (!gVar5.B(null, e0.Z0)) {
                                        if (Objects.equals(str10, "IABTCF_TCString")) {
                                            r1.l(v0Var11119);
                                            v0Var11119.G.a("IABTCF_TCString change picked up in listener.");
                                            i2 i2Var = t2Var2.O;
                                            com.gamericefishpro.space.v8.c0.g(i2Var);
                                            i2Var.b(500L);
                                            return;
                                        }
                                        return;
                                    }
                                    if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                                        r1.l(v0Var11119);
                                        v0Var11119.G.a("IABTCF_TCString change picked up in listener.");
                                        i2 i2Var2 = t2Var2.O;
                                        com.gamericefishpro.space.v8.c0.g(i2Var2);
                                        i2Var2.b(500L);
                                    }
                                }
                            };
                        }
                        f1 f1Var11110 = r1Var2.w;
                        r1.j(f1Var11110);
                        f1Var11110.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                        r1.k(t2Var);
                        t2Var.x();
                    } else {
                        r1.l(v0Var2);
                        t0Var2.a("TCF client enabled.");
                        r1.k(t2Var);
                        t2Var.r();
                        v0 v0Var11119 = r1Var2.y;
                        r1.l(v0Var11119);
                        v0Var11119.F.a("Register tcfPrefChangeListener.");
                        if (t2Var.N == null) {
                            t2Var.O = new i2(t2Var, r1Var2, 2);
                            t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                                    t2 t2Var2 = t2Var;
                                    r1 r1Var7 = (r1) t2Var2.d;
                                    g gVar5 = r1Var7.v;
                                    v0 v0Var111110 = r1Var7.y;
                                    if (!gVar5.B(null, e0.Z0)) {
                                        if (Objects.equals(str10, "IABTCF_TCString")) {
                                            r1.l(v0Var111110);
                                            v0Var111110.G.a("IABTCF_TCString change picked up in listener.");
                                            i2 i2Var = t2Var2.O;
                                            com.gamericefishpro.space.v8.c0.g(i2Var);
                                            i2Var.b(500L);
                                            return;
                                        }
                                        return;
                                    }
                                    if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                                        r1.l(v0Var111110);
                                        v0Var111110.G.a("IABTCF_TCString change picked up in listener.");
                                        i2 i2Var2 = t2Var2.O;
                                        com.gamericefishpro.space.v8.c0.g(i2Var2);
                                        i2Var2.b(500L);
                                    }
                                }
                            };
                        }
                        f1 f1Var11111 = r1Var2.w;
                        r1.j(f1Var11111);
                        f1Var11111.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                        r1.k(t2Var);
                        t2Var.x();
                    }
                    d1Var = f1Var.y;
                    if (d1Var.a() == 0) {
                        r1.l(v0Var2);
                        t0Var4.b(Long.valueOf(j), "Persisting first open");
                        d1Var.b(j);
                    }
                    r1.k(t2Var);
                    h1Var = t2Var.K;
                    if (h1Var.e()) {
                        f1 f1Var11112 = h1Var.e.w;
                        r1.j(f1Var11112);
                        f1Var11112.P.e(null);
                    }
                    if (r1Var4.h()) {
                        if (r1Var4.b()) {
                            r4Var2 = r4Var;
                            if (r4Var2.O("android.permission.INTERNET")) {
                                r1.l(v0Var2);
                                t0Var7 = t0Var6;
                                t0Var7.a("App is missing INTERNET permission");
                            } else {
                                t0Var7 = t0Var6;
                            }
                            if (!r4Var2.O("android.permission.ACCESS_NETWORK_STATE")) {
                                r1.l(v0Var2);
                                t0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                            }
                            r1Var3 = r1Var4;
                            context = r1Var3.d;
                            if (!c.a(context).f()) {
                                if (!r4.h0(context)) {
                                    r1.l(v0Var2);
                                    t0Var7.a("AppMeasurementReceiver not registered/enabled");
                                }
                                if (!r4.K(context)) {
                                    r1.l(v0Var2);
                                    t0Var7.a("AppMeasurementService not registered/enabled");
                                }
                            }
                            r1.l(v0Var2);
                            t0Var7.a("Uploading is not possible. App measurement disabled");
                        } else {
                            r1Var3 = r1Var4;
                            r4Var2 = r4Var;
                        }
                        v0Var = v0Var2;
                    } else {
                        r1Var3 = r1Var4;
                        r4Var2 = r4Var;
                        if (TextUtils.isEmpty(r1Var3.q().y())) {
                            String strY117 = r1Var3.q().y();
                            f1Var.r();
                            String string15 = f1Var.v().getString("gmp_app_id", null);
                            zIsEmpty = TextUtils.isEmpty(strY117);
                            boolean zIsEmpty15 = TextUtils.isEmpty(string15);
                            if (zIsEmpty) {
                                z0Var2 = z0Var;
                            } else {
                                z0Var2 = z0Var;
                            }
                            String strY118 = r1Var3.q().y();
                            f1Var.r();
                            SharedPreferences.Editor editorEdit17 = f1Var.v().edit();
                            editorEdit17.putString("gmp_app_id", strY118);
                            editorEdit17.apply();
                        } else {
                            z0Var2 = z0Var;
                        }
                        if (!f1Var.y().i(d2Var)) {
                            z0Var2.e(null);
                        }
                        r1.k(t2Var);
                        t2Var.z.set(z0Var2.d());
                        r1Var5.d.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                        v0Var = v0Var2;
                        if (!TextUtils.isEmpty(r1Var3.q().y())) {
                            zB2 = r1Var3.b();
                            sharedPreferences = f1Var.i;
                            if (sharedPreferences == null) {
                                zContains = z2;
                            } else {
                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                            }
                            if (!zContains) {
                                f1Var.A(!zB2);
                            }
                            if (zB2) {
                                r1.k(t2Var);
                                t2Var.D();
                            }
                            w3 w3Var15 = r1Var3.A;
                            r1.k(w3Var15);
                            w3Var15.w.D();
                            r1Var3.o().v(new AtomicReference());
                            r1Var3.o().w(f1Var.R.k());
                        }
                    }
                    r8.a();
                    if (gVar.B(null, e0.Q0)) {
                        r4Var2.r();
                        if (r4Var2.M() == 1) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (z3) {
                            long jIntValue15 = ((Integer) e0.x0.a(null)).intValue();
                            long jNextInt15 = new Random().nextInt(5000);
                            r1Var3.D.getClass();
                            jMax = Math.max(500L, ((jIntValue15 * 1000) + jNextInt15) - SystemClock.elapsedRealtime());
                            if (jMax > 500) {
                                r1.l(v0Var);
                                t0Var4.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                            }
                            r1.k(t2Var);
                            t2Var.r();
                            if (t2Var.E == null) {
                                t2Var.E = new i2(t2Var, r1Var2, 0);
                            }
                            t2Var.E.b(jMax);
                        }
                    }
                    f1Var.H.b(true);
                }
                EnumMap enumMap10 = new EnumMap(d2.class);
                enumMap10.put(d2.AD_STORAGE, b2VarG);
                enumMap10.put(d2Var, b2VarG2);
                e2Var = new e2(enumMap10, -10);
            }
            z2 = false;
            if (e2Var != null) {
                r1.k(t2Var);
                t2Var.N(e2Var, true);
                e2Var2 = e2Var;
            } else {
                e2Var2 = e2VarY;
            }
            r1.k(t2Var);
            r1Var2 = (r1) t2Var.d;
            t2Var.v(e2Var2);
            f1Var.r();
            int i18 = o.b(f1Var.v().getString("dma_consent_settings", null)).a;
            b2VarG3 = gVar.G("google_analytics_default_allow_ad_personalization_signals", true);
            if (b2VarG3 != b2Var) {
                r1.l(v0Var2);
                t0Var4.b(b2VarG3, "Default ad personalization consent from Manifest");
            }
            b2VarG4 = gVar.G("google_analytics_default_allow_ad_user_data", true);
            if (b2VarG4 == b2Var) {
                if (TextUtils.isEmpty(r1Var4.q().y())) {
                    if (TextUtils.isEmpty(r1Var4.q().y())) {
                        oVarC = o.c(bundle, 30);
                        it = oVarC.e.values().iterator();
                        while (it.hasNext()) {
                            if (((b2) it.next()) != b2Var) {
                                r1.k(t2Var);
                                t2Var.M(oVarC, true);
                                break;
                            }
                        }
                    }
                } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                    oVarC = o.c(bundle, 30);
                    it = oVarC.e.values().iterator();
                    while (it.hasNext()) {
                        if (((b2) it.next()) != b2Var) {
                            r1.k(t2Var);
                            t2Var.M(oVarC, true);
                            break;
                        }
                    }
                }
            } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                if (TextUtils.isEmpty(r1Var4.q().y())) {
                    oVarC = o.c(bundle, 30);
                    it = oVarC.e.values().iterator();
                    while (it.hasNext()) {
                        if (((b2) it.next()) != b2Var) {
                            r1.k(t2Var);
                            t2Var.M(oVarC, true);
                            break;
                        }
                    }
                }
            } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                oVarC = o.c(bundle, 30);
                it = oVarC.e.values().iterator();
                while (it.hasNext()) {
                    if (((b2) it.next()) != b2Var) {
                        r1.k(t2Var);
                        t2Var.M(oVarC, true);
                        break;
                    }
                }
            }
            boolD = gVar.D("google_analytics_tcf_data_enabled");
            if (boolD != null) {
                r1.l(v0Var2);
                t0Var2.a("TCF client enabled.");
                r1.k(t2Var);
                t2Var.r();
                v0 v0Var111110 = r1Var2.y;
                r1.l(v0Var111110);
                v0Var111110.F.a("Register tcfPrefChangeListener.");
                if (t2Var.N == null) {
                    t2Var.O = new i2(t2Var, r1Var2, 2);
                    t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                            t2 t2Var2 = t2Var;
                            r1 r1Var7 = (r1) t2Var2.d;
                            g gVar5 = r1Var7.v;
                            v0 v0Var111111 = r1Var7.y;
                            if (!gVar5.B(null, e0.Z0)) {
                                if (Objects.equals(str10, "IABTCF_TCString")) {
                                    r1.l(v0Var111111);
                                    v0Var111111.G.a("IABTCF_TCString change picked up in listener.");
                                    i2 i2Var = t2Var2.O;
                                    com.gamericefishpro.space.v8.c0.g(i2Var);
                                    i2Var.b(500L);
                                    return;
                                }
                                return;
                            }
                            if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                                r1.l(v0Var111111);
                                v0Var111111.G.a("IABTCF_TCString change picked up in listener.");
                                i2 i2Var2 = t2Var2.O;
                                com.gamericefishpro.space.v8.c0.g(i2Var2);
                                i2Var2.b(500L);
                            }
                        }
                    };
                }
                f1 f1Var11113 = r1Var2.w;
                r1.j(f1Var11113);
                f1Var11113.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                r1.k(t2Var);
                t2Var.x();
            } else {
                r1.l(v0Var2);
                t0Var2.a("TCF client enabled.");
                r1.k(t2Var);
                t2Var.r();
                v0 v0Var111111 = r1Var2.y;
                r1.l(v0Var111111);
                v0Var111111.F.a("Register tcfPrefChangeListener.");
                if (t2Var.N == null) {
                    t2Var.O = new i2(t2Var, r1Var2, 2);
                    t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                            t2 t2Var2 = t2Var;
                            r1 r1Var7 = (r1) t2Var2.d;
                            g gVar5 = r1Var7.v;
                            v0 v0Var111112 = r1Var7.y;
                            if (!gVar5.B(null, e0.Z0)) {
                                if (Objects.equals(str10, "IABTCF_TCString")) {
                                    r1.l(v0Var111112);
                                    v0Var111112.G.a("IABTCF_TCString change picked up in listener.");
                                    i2 i2Var = t2Var2.O;
                                    com.gamericefishpro.space.v8.c0.g(i2Var);
                                    i2Var.b(500L);
                                    return;
                                }
                                return;
                            }
                            if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                                r1.l(v0Var111112);
                                v0Var111112.G.a("IABTCF_TCString change picked up in listener.");
                                i2 i2Var2 = t2Var2.O;
                                com.gamericefishpro.space.v8.c0.g(i2Var2);
                                i2Var2.b(500L);
                            }
                        }
                    };
                }
                f1 f1Var11114 = r1Var2.w;
                r1.j(f1Var11114);
                f1Var11114.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                r1.k(t2Var);
                t2Var.x();
            }
            d1Var = f1Var.y;
            if (d1Var.a() == 0) {
                r1.l(v0Var2);
                t0Var4.b(Long.valueOf(j), "Persisting first open");
                d1Var.b(j);
            }
            r1.k(t2Var);
            h1Var = t2Var.K;
            if (h1Var.e()) {
                f1 f1Var11115 = h1Var.e.w;
                r1.j(f1Var11115);
                f1Var11115.P.e(null);
            }
            if (r1Var4.h()) {
                if (r1Var4.b()) {
                    r4Var2 = r4Var;
                    if (r4Var2.O("android.permission.INTERNET")) {
                        r1.l(v0Var2);
                        t0Var7 = t0Var6;
                        t0Var7.a("App is missing INTERNET permission");
                    } else {
                        t0Var7 = t0Var6;
                    }
                    if (!r4Var2.O("android.permission.ACCESS_NETWORK_STATE")) {
                        r1.l(v0Var2);
                        t0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                    }
                    r1Var3 = r1Var4;
                    context = r1Var3.d;
                    if (!c.a(context).f()) {
                        if (!r4.h0(context)) {
                            r1.l(v0Var2);
                            t0Var7.a("AppMeasurementReceiver not registered/enabled");
                        }
                        if (!r4.K(context)) {
                            r1.l(v0Var2);
                            t0Var7.a("AppMeasurementService not registered/enabled");
                        }
                    }
                    r1.l(v0Var2);
                    t0Var7.a("Uploading is not possible. App measurement disabled");
                } else {
                    r1Var3 = r1Var4;
                    r4Var2 = r4Var;
                }
                v0Var = v0Var2;
            } else {
                r1Var3 = r1Var4;
                r4Var2 = r4Var;
                if (TextUtils.isEmpty(r1Var3.q().y())) {
                    String strY119 = r1Var3.q().y();
                    f1Var.r();
                    String string16 = f1Var.v().getString("gmp_app_id", null);
                    zIsEmpty = TextUtils.isEmpty(strY119);
                    boolean zIsEmpty16 = TextUtils.isEmpty(string16);
                    if (zIsEmpty) {
                        z0Var2 = z0Var;
                    } else {
                        z0Var2 = z0Var;
                    }
                    String strY1110 = r1Var3.q().y();
                    f1Var.r();
                    SharedPreferences.Editor editorEdit18 = f1Var.v().edit();
                    editorEdit18.putString("gmp_app_id", strY1110);
                    editorEdit18.apply();
                } else {
                    z0Var2 = z0Var;
                }
                if (!f1Var.y().i(d2Var)) {
                    z0Var2.e(null);
                }
                r1.k(t2Var);
                t2Var.z.set(z0Var2.d());
                r1Var5.d.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                v0Var = v0Var2;
                if (!TextUtils.isEmpty(r1Var3.q().y())) {
                    zB2 = r1Var3.b();
                    sharedPreferences = f1Var.i;
                    if (sharedPreferences == null) {
                        zContains = z2;
                    } else {
                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                    }
                    if (!zContains) {
                        f1Var.A(!zB2);
                    }
                    if (zB2) {
                        r1.k(t2Var);
                        t2Var.D();
                    }
                    w3 w3Var16 = r1Var3.A;
                    r1.k(w3Var16);
                    w3Var16.w.D();
                    r1Var3.o().v(new AtomicReference());
                    r1Var3.o().w(f1Var.R.k());
                }
            }
            r8.a();
            if (gVar.B(null, e0.Q0)) {
                r4Var2.r();
                if (r4Var2.M() == 1) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (z3) {
                    long jIntValue16 = ((Integer) e0.x0.a(null)).intValue();
                    long jNextInt16 = new Random().nextInt(5000);
                    r1Var3.D.getClass();
                    jMax = Math.max(500L, ((jIntValue16 * 1000) + jNextInt16) - SystemClock.elapsedRealtime());
                    if (jMax > 500) {
                        r1.l(v0Var);
                        t0Var4.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                    }
                    r1.k(t2Var);
                    t2Var.r();
                    if (t2Var.E == null) {
                        t2Var.E = new i2(t2Var, r1Var2, 0);
                    }
                    t2Var.E.b(jMax);
                }
            }
            f1Var.H.b(true);
        }
        v0 v0Var121 = r1Var.y;
        r1.l(v0Var121);
        v0Var121.y.a("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = r1Var.d.getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                listAsList = Arrays.asList(stringArray);
            }
        }
        if (listAsList != null) {
            m0Var2.D = listAsList;
            break;
        }
        if (listAsList.isEmpty()) {
            it2 = listAsList.iterator();
            do {
                if (it2.hasNext()) {
                    m0Var2.D = listAsList;
                    break;
                } else {
                    str3 = (String) it2.next();
                    r4Var3 = r1Var6.B;
                    r1.j(r4Var3);
                }
            } while (r4Var3.s0("safelisted event", str3));
        } else {
            r1.l(v0Var5);
            v0Var5.D.a("Safelisted event list is empty. Ignoring");
        }
        if (packageManager != null) {
            m0Var2.F = com.gamericefishpro.space.b9.a.y(context3) ? 1 : 0;
        } else {
            m0Var2.F = 0;
        }
        ((r1) m0Var2.d).V.incrementAndGet();
        m0Var2.e = true;
        y2Var = new y2(r1Var4);
        y2Var.t();
        r1Var4.N = y2Var;
        if (!y2Var.e) {
            throw new IllegalStateException(str);
        }
        y2Var.i = (JobScheduler) ((r1) y2Var.d).d.getSystemService("jobscheduler");
        ((r1) y2Var.d).V.incrementAndGet();
        y2Var.e = true;
        r1.l(v0Var2);
        t0Var2 = v0Var2.F;
        t0Var3 = v0Var2.E;
        t0Var4 = v0Var2.G;
        t0Var5 = v0Var2.y;
        gVar.w();
        t0Var3.b(133005L, "App measurement initialized, version");
        r1.l(v0Var2);
        t0Var3.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        strX = m0Var.x();
        if (r4Var4.R(strX, gVar.i)) {
            r1.l(v0Var2);
            t0Var3.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            r1.l(v0Var2);
            t0Var3.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strX)));
        }
        r1.l(v0Var2);
        t0Var2.a("Debug-level message logging enabled");
        i2 = r1Var4.T;
        atomicInteger = r1Var4.V;
        if (i2 != atomicInteger.get()) {
            r1.l(v0Var2);
            t0Var5.c("Not all components initialized", Integer.valueOf(r1Var4.T), Integer.valueOf(atomicInteger.get()));
        }
        r1Var4.O = true;
        j = r1Var4.W;
        t2Var = r1Var4.F;
        p1 p1Var7 = r1Var4.z;
        r1.l(p1Var7);
        p1Var7.r();
        r1.i(r1Var4.N);
        iW = r1Var4.N.w();
        r8.a();
        zB = gVar.B(null, e0.Q0);
        if (iW == 2) {
            z = true;
        } else {
            z = false;
        }
        if (zB) {
            r4Var4.r();
            if (r4Var4.M() == 1) {
                r4Var4.r();
                intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                u4Var = new u4(r1Var5);
                z4 = z;
                context2 = r1Var5.d;
                if (Build.VERSION.SDK_INT >= 33) {
                    context2.registerReceiver(u4Var, intentFilter, null, null, 2);
                } else {
                    context2.registerReceiver(u4Var, intentFilter, null, null, 0);
                }
                v0 v0Var111112 = r1Var5.y;
                r1.l(v0Var111112);
                v0Var111112.F.a("Registered app receiver");
                if (z4) {
                    r1.i(r1Var4.N);
                    r1Var4.N.v(((Long) e0.C.a(null)).longValue());
                }
            } else if (z) {
                z = true;
                r4Var4.r();
                intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                u4Var = new u4(r1Var5);
                z4 = z;
                context2 = r1Var5.d;
                if (Build.VERSION.SDK_INT >= 33) {
                    context2.registerReceiver(u4Var, intentFilter, null, null, 2);
                } else {
                    context2.registerReceiver(u4Var, intentFilter, null, null, 0);
                }
                v0 v0Var111113 = r1Var5.y;
                r1.l(v0Var111113);
                v0Var111113.F.a("Registered app receiver");
                if (z4) {
                    r1.i(r1Var4.N);
                    r1Var4.N.v(((Long) e0.C.a(null)).longValue());
                }
            }
        } else if (z) {
            z = true;
            r4Var4.r();
            intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
            u4Var = new u4(r1Var5);
            z4 = z;
            context2 = r1Var5.d;
            if (Build.VERSION.SDK_INT >= 33) {
                context2.registerReceiver(u4Var, intentFilter, null, null, 2);
            } else {
                context2.registerReceiver(u4Var, intentFilter, null, null, 0);
            }
            v0 v0Var111114 = r1Var5.y;
            r1.l(v0Var111114);
            v0Var111114.F.a("Registered app receiver");
            if (z4) {
                r1.i(r1Var4.N);
                r1Var4.N.v(((Long) e0.C.a(null)).longValue());
            }
        }
        z0Var = f1Var.z;
        e2VarY = f1Var.y();
        i3 = e2VarY.b;
        b2VarG = gVar.G("google_analytics_default_allow_ad_storage", false);
        b2VarG2 = gVar.G("google_analytics_default_allow_analytics_storage", false);
        b2Var = b2.UNINITIALIZED;
        d2Var = d2.ANALYTICS_STORAGE;
        if (b2VarG == b2Var) {
            t0Var6 = t0Var5;
            r4Var = r4Var4;
            if (e2.l(-10, f1Var.v().getInt("consent_source", 100))) {
                if (TextUtils.isEmpty(r1Var4.q().y())) {
                    if (i3 == 0) {
                    }
                    r1.k(t2Var);
                    z2 = false;
                    t2Var.N(new e2(-10), false);
                } else {
                    z2 = false;
                }
                e2Var = null;
                if (e2Var != null) {
                    r1.k(t2Var);
                    t2Var.N(e2Var, true);
                    e2Var2 = e2Var;
                } else {
                    e2Var2 = e2VarY;
                }
                r1.k(t2Var);
                r1Var2 = (r1) t2Var.d;
                t2Var.v(e2Var2);
                f1Var.r();
                int i19 = o.b(f1Var.v().getString("dma_consent_settings", null)).a;
                b2VarG3 = gVar.G("google_analytics_default_allow_ad_personalization_signals", true);
                if (b2VarG3 != b2Var) {
                    r1.l(v0Var2);
                    t0Var4.b(b2VarG3, "Default ad personalization consent from Manifest");
                }
                b2VarG4 = gVar.G("google_analytics_default_allow_ad_user_data", true);
                if (b2VarG4 == b2Var) {
                    if (TextUtils.isEmpty(r1Var4.q().y())) {
                        if (TextUtils.isEmpty(r1Var4.q().y())) {
                            oVarC = o.c(bundle, 30);
                            it = oVarC.e.values().iterator();
                            while (it.hasNext()) {
                                if (((b2) it.next()) != b2Var) {
                                    r1.k(t2Var);
                                    t2Var.M(oVarC, true);
                                    break;
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                        oVarC = o.c(bundle, 30);
                        it = oVarC.e.values().iterator();
                        while (it.hasNext()) {
                            if (((b2) it.next()) != b2Var) {
                                r1.k(t2Var);
                                t2Var.M(oVarC, true);
                                break;
                            }
                        }
                    }
                } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                    if (TextUtils.isEmpty(r1Var4.q().y())) {
                        oVarC = o.c(bundle, 30);
                        it = oVarC.e.values().iterator();
                        while (it.hasNext()) {
                            if (((b2) it.next()) != b2Var) {
                                r1.k(t2Var);
                                t2Var.M(oVarC, true);
                                break;
                            }
                        }
                    }
                } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                    oVarC = o.c(bundle, 30);
                    it = oVarC.e.values().iterator();
                    while (it.hasNext()) {
                        if (((b2) it.next()) != b2Var) {
                            r1.k(t2Var);
                            t2Var.M(oVarC, true);
                            break;
                        }
                    }
                }
                boolD = gVar.D("google_analytics_tcf_data_enabled");
                if (boolD != null) {
                    r1.l(v0Var2);
                    t0Var2.a("TCF client enabled.");
                    r1.k(t2Var);
                    t2Var.r();
                    v0 v0Var111115 = r1Var2.y;
                    r1.l(v0Var111115);
                    v0Var111115.F.a("Register tcfPrefChangeListener.");
                    if (t2Var.N == null) {
                        t2Var.O = new i2(t2Var, r1Var2, 2);
                        t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                                t2 t2Var2 = t2Var;
                                r1 r1Var7 = (r1) t2Var2.d;
                                g gVar5 = r1Var7.v;
                                v0 v0Var111116 = r1Var7.y;
                                if (!gVar5.B(null, e0.Z0)) {
                                    if (Objects.equals(str10, "IABTCF_TCString")) {
                                        r1.l(v0Var111116);
                                        v0Var111116.G.a("IABTCF_TCString change picked up in listener.");
                                        i2 i2Var = t2Var2.O;
                                        com.gamericefishpro.space.v8.c0.g(i2Var);
                                        i2Var.b(500L);
                                        return;
                                    }
                                    return;
                                }
                                if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                                    r1.l(v0Var111116);
                                    v0Var111116.G.a("IABTCF_TCString change picked up in listener.");
                                    i2 i2Var2 = t2Var2.O;
                                    com.gamericefishpro.space.v8.c0.g(i2Var2);
                                    i2Var2.b(500L);
                                }
                            }
                        };
                    }
                    f1 f1Var11116 = r1Var2.w;
                    r1.j(f1Var11116);
                    f1Var11116.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                    r1.k(t2Var);
                    t2Var.x();
                } else {
                    r1.l(v0Var2);
                    t0Var2.a("TCF client enabled.");
                    r1.k(t2Var);
                    t2Var.r();
                    v0 v0Var111116 = r1Var2.y;
                    r1.l(v0Var111116);
                    v0Var111116.F.a("Register tcfPrefChangeListener.");
                    if (t2Var.N == null) {
                        t2Var.O = new i2(t2Var, r1Var2, 2);
                        t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                                t2 t2Var2 = t2Var;
                                r1 r1Var7 = (r1) t2Var2.d;
                                g gVar5 = r1Var7.v;
                                v0 v0Var111117 = r1Var7.y;
                                if (!gVar5.B(null, e0.Z0)) {
                                    if (Objects.equals(str10, "IABTCF_TCString")) {
                                        r1.l(v0Var111117);
                                        v0Var111117.G.a("IABTCF_TCString change picked up in listener.");
                                        i2 i2Var = t2Var2.O;
                                        com.gamericefishpro.space.v8.c0.g(i2Var);
                                        i2Var.b(500L);
                                        return;
                                    }
                                    return;
                                }
                                if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                                    r1.l(v0Var111117);
                                    v0Var111117.G.a("IABTCF_TCString change picked up in listener.");
                                    i2 i2Var2 = t2Var2.O;
                                    com.gamericefishpro.space.v8.c0.g(i2Var2);
                                    i2Var2.b(500L);
                                }
                            }
                        };
                    }
                    f1 f1Var11117 = r1Var2.w;
                    r1.j(f1Var11117);
                    f1Var11117.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                    r1.k(t2Var);
                    t2Var.x();
                }
                d1Var = f1Var.y;
                if (d1Var.a() == 0) {
                    r1.l(v0Var2);
                    t0Var4.b(Long.valueOf(j), "Persisting first open");
                    d1Var.b(j);
                }
                r1.k(t2Var);
                h1Var = t2Var.K;
                if (h1Var.e()) {
                    f1 f1Var11118 = h1Var.e.w;
                    r1.j(f1Var11118);
                    f1Var11118.P.e(null);
                }
                if (r1Var4.h()) {
                    if (r1Var4.b()) {
                        r4Var2 = r4Var;
                        if (r4Var2.O("android.permission.INTERNET")) {
                            r1.l(v0Var2);
                            t0Var7 = t0Var6;
                            t0Var7.a("App is missing INTERNET permission");
                        } else {
                            t0Var7 = t0Var6;
                        }
                        if (!r4Var2.O("android.permission.ACCESS_NETWORK_STATE")) {
                            r1.l(v0Var2);
                            t0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                        }
                        r1Var3 = r1Var4;
                        context = r1Var3.d;
                        if (!c.a(context).f()) {
                            if (!r4.h0(context)) {
                                r1.l(v0Var2);
                                t0Var7.a("AppMeasurementReceiver not registered/enabled");
                            }
                            if (!r4.K(context)) {
                                r1.l(v0Var2);
                                t0Var7.a("AppMeasurementService not registered/enabled");
                            }
                        }
                        r1.l(v0Var2);
                        t0Var7.a("Uploading is not possible. App measurement disabled");
                    } else {
                        r1Var3 = r1Var4;
                        r4Var2 = r4Var;
                    }
                    v0Var = v0Var2;
                } else {
                    r1Var3 = r1Var4;
                    r4Var2 = r4Var;
                    if (TextUtils.isEmpty(r1Var3.q().y())) {
                        String strY1111 = r1Var3.q().y();
                        f1Var.r();
                        String string17 = f1Var.v().getString("gmp_app_id", null);
                        zIsEmpty = TextUtils.isEmpty(strY1111);
                        boolean zIsEmpty17 = TextUtils.isEmpty(string17);
                        if (zIsEmpty) {
                            z0Var2 = z0Var;
                        } else {
                            z0Var2 = z0Var;
                        }
                        String strY1112 = r1Var3.q().y();
                        f1Var.r();
                        SharedPreferences.Editor editorEdit19 = f1Var.v().edit();
                        editorEdit19.putString("gmp_app_id", strY1112);
                        editorEdit19.apply();
                    } else {
                        z0Var2 = z0Var;
                    }
                    if (!f1Var.y().i(d2Var)) {
                        z0Var2.e(null);
                    }
                    r1.k(t2Var);
                    t2Var.z.set(z0Var2.d());
                    r1Var5.d.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                    v0Var = v0Var2;
                    if (!TextUtils.isEmpty(r1Var3.q().y())) {
                        zB2 = r1Var3.b();
                        sharedPreferences = f1Var.i;
                        if (sharedPreferences == null) {
                            zContains = z2;
                        } else {
                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                        }
                        if (!zContains) {
                            f1Var.A(!zB2);
                        }
                        if (zB2) {
                            r1.k(t2Var);
                            t2Var.D();
                        }
                        w3 w3Var17 = r1Var3.A;
                        r1.k(w3Var17);
                        w3Var17.w.D();
                        r1Var3.o().v(new AtomicReference());
                        r1Var3.o().w(f1Var.R.k());
                    }
                }
                r8.a();
                if (gVar.B(null, e0.Q0)) {
                    r4Var2.r();
                    if (r4Var2.M() == 1) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (z3) {
                        long jIntValue17 = ((Integer) e0.x0.a(null)).intValue();
                        long jNextInt17 = new Random().nextInt(5000);
                        r1Var3.D.getClass();
                        jMax = Math.max(500L, ((jIntValue17 * 1000) + jNextInt17) - SystemClock.elapsedRealtime());
                        if (jMax > 500) {
                            r1.l(v0Var);
                            t0Var4.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                        }
                        r1.k(t2Var);
                        t2Var.r();
                        if (t2Var.E == null) {
                            t2Var.E = new i2(t2Var, r1Var2, 0);
                        }
                        t2Var.E.b(jMax);
                    }
                }
                f1Var.H.b(true);
            }
            EnumMap enumMap11 = new EnumMap(d2.class);
            enumMap11.put(d2.AD_STORAGE, b2VarG);
            enumMap11.put(d2Var, b2VarG2);
            e2Var = new e2(enumMap11, -10);
        } else {
            t0Var6 = t0Var5;
            r4Var = r4Var4;
            if (e2.l(-10, f1Var.v().getInt("consent_source", 100))) {
                if (TextUtils.isEmpty(r1Var4.q().y())) {
                    if (i3 == 0) {
                    }
                    r1.k(t2Var);
                    z2 = false;
                    t2Var.N(new e2(-10), false);
                } else {
                    z2 = false;
                }
                e2Var = null;
                if (e2Var != null) {
                    r1.k(t2Var);
                    t2Var.N(e2Var, true);
                    e2Var2 = e2Var;
                } else {
                    e2Var2 = e2VarY;
                }
                r1.k(t2Var);
                r1Var2 = (r1) t2Var.d;
                t2Var.v(e2Var2);
                f1Var.r();
                int i110 = o.b(f1Var.v().getString("dma_consent_settings", null)).a;
                b2VarG3 = gVar.G("google_analytics_default_allow_ad_personalization_signals", true);
                if (b2VarG3 != b2Var) {
                    r1.l(v0Var2);
                    t0Var4.b(b2VarG3, "Default ad personalization consent from Manifest");
                }
                b2VarG4 = gVar.G("google_analytics_default_allow_ad_user_data", true);
                if (b2VarG4 == b2Var) {
                    if (TextUtils.isEmpty(r1Var4.q().y())) {
                        if (TextUtils.isEmpty(r1Var4.q().y())) {
                            oVarC = o.c(bundle, 30);
                            it = oVarC.e.values().iterator();
                            while (it.hasNext()) {
                                if (((b2) it.next()) != b2Var) {
                                    r1.k(t2Var);
                                    t2Var.M(oVarC, true);
                                    break;
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                        oVarC = o.c(bundle, 30);
                        it = oVarC.e.values().iterator();
                        while (it.hasNext()) {
                            if (((b2) it.next()) != b2Var) {
                                r1.k(t2Var);
                                t2Var.M(oVarC, true);
                                break;
                            }
                        }
                    }
                } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                    if (TextUtils.isEmpty(r1Var4.q().y())) {
                        oVarC = o.c(bundle, 30);
                        it = oVarC.e.values().iterator();
                        while (it.hasNext()) {
                            if (((b2) it.next()) != b2Var) {
                                r1.k(t2Var);
                                t2Var.M(oVarC, true);
                                break;
                            }
                        }
                    }
                } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                    oVarC = o.c(bundle, 30);
                    it = oVarC.e.values().iterator();
                    while (it.hasNext()) {
                        if (((b2) it.next()) != b2Var) {
                            r1.k(t2Var);
                            t2Var.M(oVarC, true);
                            break;
                        }
                    }
                }
                boolD = gVar.D("google_analytics_tcf_data_enabled");
                if (boolD != null) {
                    r1.l(v0Var2);
                    t0Var2.a("TCF client enabled.");
                    r1.k(t2Var);
                    t2Var.r();
                    v0 v0Var111117 = r1Var2.y;
                    r1.l(v0Var111117);
                    v0Var111117.F.a("Register tcfPrefChangeListener.");
                    if (t2Var.N == null) {
                        t2Var.O = new i2(t2Var, r1Var2, 2);
                        t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                                t2 t2Var2 = t2Var;
                                r1 r1Var7 = (r1) t2Var2.d;
                                g gVar5 = r1Var7.v;
                                v0 v0Var111118 = r1Var7.y;
                                if (!gVar5.B(null, e0.Z0)) {
                                    if (Objects.equals(str10, "IABTCF_TCString")) {
                                        r1.l(v0Var111118);
                                        v0Var111118.G.a("IABTCF_TCString change picked up in listener.");
                                        i2 i2Var = t2Var2.O;
                                        com.gamericefishpro.space.v8.c0.g(i2Var);
                                        i2Var.b(500L);
                                        return;
                                    }
                                    return;
                                }
                                if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                                    r1.l(v0Var111118);
                                    v0Var111118.G.a("IABTCF_TCString change picked up in listener.");
                                    i2 i2Var2 = t2Var2.O;
                                    com.gamericefishpro.space.v8.c0.g(i2Var2);
                                    i2Var2.b(500L);
                                }
                            }
                        };
                    }
                    f1 f1Var11119 = r1Var2.w;
                    r1.j(f1Var11119);
                    f1Var11119.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                    r1.k(t2Var);
                    t2Var.x();
                } else {
                    r1.l(v0Var2);
                    t0Var2.a("TCF client enabled.");
                    r1.k(t2Var);
                    t2Var.r();
                    v0 v0Var111118 = r1Var2.y;
                    r1.l(v0Var111118);
                    v0Var111118.F.a("Register tcfPrefChangeListener.");
                    if (t2Var.N == null) {
                        t2Var.O = new i2(t2Var, r1Var2, 2);
                        t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                                t2 t2Var2 = t2Var;
                                r1 r1Var7 = (r1) t2Var2.d;
                                g gVar5 = r1Var7.v;
                                v0 v0Var111119 = r1Var7.y;
                                if (!gVar5.B(null, e0.Z0)) {
                                    if (Objects.equals(str10, "IABTCF_TCString")) {
                                        r1.l(v0Var111119);
                                        v0Var111119.G.a("IABTCF_TCString change picked up in listener.");
                                        i2 i2Var = t2Var2.O;
                                        com.gamericefishpro.space.v8.c0.g(i2Var);
                                        i2Var.b(500L);
                                        return;
                                    }
                                    return;
                                }
                                if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                                    r1.l(v0Var111119);
                                    v0Var111119.G.a("IABTCF_TCString change picked up in listener.");
                                    i2 i2Var2 = t2Var2.O;
                                    com.gamericefishpro.space.v8.c0.g(i2Var2);
                                    i2Var2.b(500L);
                                }
                            }
                        };
                    }
                    f1 f1Var111110 = r1Var2.w;
                    r1.j(f1Var111110);
                    f1Var111110.w().registerOnSharedPreferenceChangeListener(t2Var.N);
                    r1.k(t2Var);
                    t2Var.x();
                }
                d1Var = f1Var.y;
                if (d1Var.a() == 0) {
                    r1.l(v0Var2);
                    t0Var4.b(Long.valueOf(j), "Persisting first open");
                    d1Var.b(j);
                }
                r1.k(t2Var);
                h1Var = t2Var.K;
                if (h1Var.e()) {
                    f1 f1Var111111 = h1Var.e.w;
                    r1.j(f1Var111111);
                    f1Var111111.P.e(null);
                }
                if (r1Var4.h()) {
                    if (r1Var4.b()) {
                        r4Var2 = r4Var;
                        if (r4Var2.O("android.permission.INTERNET")) {
                            r1.l(v0Var2);
                            t0Var7 = t0Var6;
                            t0Var7.a("App is missing INTERNET permission");
                        } else {
                            t0Var7 = t0Var6;
                        }
                        if (!r4Var2.O("android.permission.ACCESS_NETWORK_STATE")) {
                            r1.l(v0Var2);
                            t0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                        }
                        r1Var3 = r1Var4;
                        context = r1Var3.d;
                        if (!c.a(context).f()) {
                            if (!r4.h0(context)) {
                                r1.l(v0Var2);
                                t0Var7.a("AppMeasurementReceiver not registered/enabled");
                            }
                            if (!r4.K(context)) {
                                r1.l(v0Var2);
                                t0Var7.a("AppMeasurementService not registered/enabled");
                            }
                        }
                        r1.l(v0Var2);
                        t0Var7.a("Uploading is not possible. App measurement disabled");
                    } else {
                        r1Var3 = r1Var4;
                        r4Var2 = r4Var;
                    }
                    v0Var = v0Var2;
                } else {
                    r1Var3 = r1Var4;
                    r4Var2 = r4Var;
                    if (TextUtils.isEmpty(r1Var3.q().y())) {
                        String strY1113 = r1Var3.q().y();
                        f1Var.r();
                        String string18 = f1Var.v().getString("gmp_app_id", null);
                        zIsEmpty = TextUtils.isEmpty(strY1113);
                        boolean zIsEmpty18 = TextUtils.isEmpty(string18);
                        if (zIsEmpty) {
                            z0Var2 = z0Var;
                        } else {
                            z0Var2 = z0Var;
                        }
                        String strY1114 = r1Var3.q().y();
                        f1Var.r();
                        SharedPreferences.Editor editorEdit110 = f1Var.v().edit();
                        editorEdit110.putString("gmp_app_id", strY1114);
                        editorEdit110.apply();
                    } else {
                        z0Var2 = z0Var;
                    }
                    if (!f1Var.y().i(d2Var)) {
                        z0Var2.e(null);
                    }
                    r1.k(t2Var);
                    t2Var.z.set(z0Var2.d());
                    r1Var5.d.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                    v0Var = v0Var2;
                    if (!TextUtils.isEmpty(r1Var3.q().y())) {
                        zB2 = r1Var3.b();
                        sharedPreferences = f1Var.i;
                        if (sharedPreferences == null) {
                            zContains = z2;
                        } else {
                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                        }
                        if (!zContains) {
                            f1Var.A(!zB2);
                        }
                        if (zB2) {
                            r1.k(t2Var);
                            t2Var.D();
                        }
                        w3 w3Var18 = r1Var3.A;
                        r1.k(w3Var18);
                        w3Var18.w.D();
                        r1Var3.o().v(new AtomicReference());
                        r1Var3.o().w(f1Var.R.k());
                    }
                }
                r8.a();
                if (gVar.B(null, e0.Q0)) {
                    r4Var2.r();
                    if (r4Var2.M() == 1) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (z3) {
                        long jIntValue18 = ((Integer) e0.x0.a(null)).intValue();
                        long jNextInt18 = new Random().nextInt(5000);
                        r1Var3.D.getClass();
                        jMax = Math.max(500L, ((jIntValue18 * 1000) + jNextInt18) - SystemClock.elapsedRealtime());
                        if (jMax > 500) {
                            r1.l(v0Var);
                            t0Var4.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                        }
                        r1.k(t2Var);
                        t2Var.r();
                        if (t2Var.E == null) {
                            t2Var.E = new i2(t2Var, r1Var2, 0);
                        }
                        t2Var.E.b(jMax);
                    }
                }
                f1Var.H.b(true);
            }
            EnumMap enumMap12 = new EnumMap(d2.class);
            enumMap12.put(d2.AD_STORAGE, b2VarG);
            enumMap12.put(d2Var, b2VarG2);
            e2Var = new e2(enumMap12, -10);
        }
        z2 = false;
        if (e2Var != null) {
            r1.k(t2Var);
            t2Var.N(e2Var, true);
            e2Var2 = e2Var;
        } else {
            e2Var2 = e2VarY;
        }
        r1.k(t2Var);
        r1Var2 = (r1) t2Var.d;
        t2Var.v(e2Var2);
        f1Var.r();
        int i111 = o.b(f1Var.v().getString("dma_consent_settings", null)).a;
        b2VarG3 = gVar.G("google_analytics_default_allow_ad_personalization_signals", true);
        if (b2VarG3 != b2Var) {
            r1.l(v0Var2);
            t0Var4.b(b2VarG3, "Default ad personalization consent from Manifest");
        }
        b2VarG4 = gVar.G("google_analytics_default_allow_ad_user_data", true);
        if (b2VarG4 == b2Var) {
            if (TextUtils.isEmpty(r1Var4.q().y())) {
                if (TextUtils.isEmpty(r1Var4.q().y())) {
                    oVarC = o.c(bundle, 30);
                    it = oVarC.e.values().iterator();
                    while (it.hasNext()) {
                        if (((b2) it.next()) != b2Var) {
                            r1.k(t2Var);
                            t2Var.M(oVarC, true);
                            break;
                        }
                    }
                }
            } else if (TextUtils.isEmpty(r1Var4.q().y())) {
                oVarC = o.c(bundle, 30);
                it = oVarC.e.values().iterator();
                while (it.hasNext()) {
                    if (((b2) it.next()) != b2Var) {
                        r1.k(t2Var);
                        t2Var.M(oVarC, true);
                        break;
                    }
                }
            }
        } else if (TextUtils.isEmpty(r1Var4.q().y())) {
            if (TextUtils.isEmpty(r1Var4.q().y())) {
                oVarC = o.c(bundle, 30);
                it = oVarC.e.values().iterator();
                while (it.hasNext()) {
                    if (((b2) it.next()) != b2Var) {
                        r1.k(t2Var);
                        t2Var.M(oVarC, true);
                        break;
                    }
                }
            }
        } else if (TextUtils.isEmpty(r1Var4.q().y())) {
            oVarC = o.c(bundle, 30);
            it = oVarC.e.values().iterator();
            while (it.hasNext()) {
                if (((b2) it.next()) != b2Var) {
                    r1.k(t2Var);
                    t2Var.M(oVarC, true);
                    break;
                }
            }
        }
        boolD = gVar.D("google_analytics_tcf_data_enabled");
        if (boolD != null) {
            r1.l(v0Var2);
            t0Var2.a("TCF client enabled.");
            r1.k(t2Var);
            t2Var.r();
            v0 v0Var111119 = r1Var2.y;
            r1.l(v0Var111119);
            v0Var111119.F.a("Register tcfPrefChangeListener.");
            if (t2Var.N == null) {
                t2Var.O = new i2(t2Var, r1Var2, 2);
                t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                        t2 t2Var2 = t2Var;
                        r1 r1Var7 = (r1) t2Var2.d;
                        g gVar5 = r1Var7.v;
                        v0 v0Var1111110 = r1Var7.y;
                        if (!gVar5.B(null, e0.Z0)) {
                            if (Objects.equals(str10, "IABTCF_TCString")) {
                                r1.l(v0Var1111110);
                                v0Var1111110.G.a("IABTCF_TCString change picked up in listener.");
                                i2 i2Var = t2Var2.O;
                                com.gamericefishpro.space.v8.c0.g(i2Var);
                                i2Var.b(500L);
                                return;
                            }
                            return;
                        }
                        if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                            r1.l(v0Var1111110);
                            v0Var1111110.G.a("IABTCF_TCString change picked up in listener.");
                            i2 i2Var2 = t2Var2.O;
                            com.gamericefishpro.space.v8.c0.g(i2Var2);
                            i2Var2.b(500L);
                        }
                    }
                };
            }
            f1 f1Var111112 = r1Var2.w;
            r1.j(f1Var111112);
            f1Var111112.w().registerOnSharedPreferenceChangeListener(t2Var.N);
            r1.k(t2Var);
            t2Var.x();
        } else {
            r1.l(v0Var2);
            t0Var2.a("TCF client enabled.");
            r1.k(t2Var);
            t2Var.r();
            v0 v0Var1111110 = r1Var2.y;
            r1.l(v0Var1111110);
            v0Var1111110.F.a("Register tcfPrefChangeListener.");
            if (t2Var.N == null) {
                t2Var.O = new i2(t2Var, r1Var2, 2);
                t2Var.N = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.gamericefishpro.space.n9.s2
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                        t2 t2Var2 = t2Var;
                        r1 r1Var7 = (r1) t2Var2.d;
                        g gVar5 = r1Var7.v;
                        v0 v0Var1111111 = r1Var7.y;
                        if (!gVar5.B(null, e0.Z0)) {
                            if (Objects.equals(str10, "IABTCF_TCString")) {
                                r1.l(v0Var1111111);
                                v0Var1111111.G.a("IABTCF_TCString change picked up in listener.");
                                i2 i2Var = t2Var2.O;
                                com.gamericefishpro.space.v8.c0.g(i2Var);
                                i2Var.b(500L);
                                return;
                            }
                            return;
                        }
                        if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                            r1.l(v0Var1111111);
                            v0Var1111111.G.a("IABTCF_TCString change picked up in listener.");
                            i2 i2Var2 = t2Var2.O;
                            com.gamericefishpro.space.v8.c0.g(i2Var2);
                            i2Var2.b(500L);
                        }
                    }
                };
            }
            f1 f1Var111113 = r1Var2.w;
            r1.j(f1Var111113);
            f1Var111113.w().registerOnSharedPreferenceChangeListener(t2Var.N);
            r1.k(t2Var);
            t2Var.x();
        }
        d1Var = f1Var.y;
        if (d1Var.a() == 0) {
            r1.l(v0Var2);
            t0Var4.b(Long.valueOf(j), "Persisting first open");
            d1Var.b(j);
        }
        r1.k(t2Var);
        h1Var = t2Var.K;
        if (h1Var.e()) {
            f1 f1Var111114 = h1Var.e.w;
            r1.j(f1Var111114);
            f1Var111114.P.e(null);
        }
        if (r1Var4.h()) {
            if (r1Var4.b()) {
                r4Var2 = r4Var;
                if (r4Var2.O("android.permission.INTERNET")) {
                    r1.l(v0Var2);
                    t0Var7 = t0Var6;
                    t0Var7.a("App is missing INTERNET permission");
                } else {
                    t0Var7 = t0Var6;
                }
                if (!r4Var2.O("android.permission.ACCESS_NETWORK_STATE")) {
                    r1.l(v0Var2);
                    t0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                }
                r1Var3 = r1Var4;
                context = r1Var3.d;
                if (!c.a(context).f()) {
                    if (!r4.h0(context)) {
                        r1.l(v0Var2);
                        t0Var7.a("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!r4.K(context)) {
                        r1.l(v0Var2);
                        t0Var7.a("AppMeasurementService not registered/enabled");
                    }
                }
                r1.l(v0Var2);
                t0Var7.a("Uploading is not possible. App measurement disabled");
            } else {
                r1Var3 = r1Var4;
                r4Var2 = r4Var;
            }
            v0Var = v0Var2;
        } else {
            r1Var3 = r1Var4;
            r4Var2 = r4Var;
            if (TextUtils.isEmpty(r1Var3.q().y())) {
                String strY1115 = r1Var3.q().y();
                f1Var.r();
                String string19 = f1Var.v().getString("gmp_app_id", null);
                zIsEmpty = TextUtils.isEmpty(strY1115);
                boolean zIsEmpty19 = TextUtils.isEmpty(string19);
                if (zIsEmpty) {
                    z0Var2 = z0Var;
                } else {
                    z0Var2 = z0Var;
                }
                String strY1116 = r1Var3.q().y();
                f1Var.r();
                SharedPreferences.Editor editorEdit111 = f1Var.v().edit();
                editorEdit111.putString("gmp_app_id", strY1116);
                editorEdit111.apply();
            } else {
                z0Var2 = z0Var;
            }
            if (!f1Var.y().i(d2Var)) {
                z0Var2.e(null);
            }
            r1.k(t2Var);
            t2Var.z.set(z0Var2.d());
            r1Var5.d.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            v0Var = v0Var2;
            if (!TextUtils.isEmpty(r1Var3.q().y())) {
                zB2 = r1Var3.b();
                sharedPreferences = f1Var.i;
                if (sharedPreferences == null) {
                    zContains = z2;
                } else {
                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                }
                if (!zContains) {
                    f1Var.A(!zB2);
                }
                if (zB2) {
                    r1.k(t2Var);
                    t2Var.D();
                }
                w3 w3Var19 = r1Var3.A;
                r1.k(w3Var19);
                w3Var19.w.D();
                r1Var3.o().v(new AtomicReference());
                r1Var3.o().w(f1Var.R.k());
            }
        }
        r8.a();
        if (gVar.B(null, e0.Q0)) {
            r4Var2.r();
            if (r4Var2.M() == 1) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (z3) {
                long jIntValue19 = ((Integer) e0.x0.a(null)).intValue();
                long jNextInt19 = new Random().nextInt(5000);
                r1Var3.D.getClass();
                jMax = Math.max(500L, ((jIntValue19 * 1000) + jNextInt19) - SystemClock.elapsedRealtime());
                if (jMax > 500) {
                    r1.l(v0Var);
                    t0Var4.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                }
                r1.k(t2Var);
                t2Var.r();
                if (t2Var.E == null) {
                    t2Var.E = new i2(t2Var, r1Var2, 0);
                }
                t2Var.E.b(jMax);
            }
        }
        f1Var.H.b(true);
    }

    private final void b() {
        synchronized (((k) this.i).i) {
            try {
                OnCompleteListener onCompleteListener = (OnCompleteListener) ((k) this.i).v;
                if (onCompleteListener != null) {
                    onCompleteListener.onComplete((Task) this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        ((java.lang.Runnable) r10.e).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        com.gamericefishpro.space.cb.j.y.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.e), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r10.e = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c() {
        Runnable runnable;
        boolean z = false;
        boolean zInterrupted = false;
        while (true) {
            try {
                synchronized (((j) this.i).e) {
                    if (z) {
                        runnable = (Runnable) ((j) this.i).e.poll();
                        this.e = runnable;
                        if (runnable == null) {
                            ((j) this.i).i = 1;
                        }
                    } else {
                        j jVar = (j) this.i;
                        if (jVar.i != 4) {
                            jVar.v++;
                            jVar.i = 4;
                            z = true;
                            runnable = (Runnable) ((j) this.i).e.poll();
                            this.e = runnable;
                            if (runnable == null) {
                                ((j) this.i).i = 1;
                            }
                        }
                    }
                }
                if (zInterrupted) {
                    break;
                } else {
                    return;
                }
                this.e = null;
            } catch (Throwable th) {
                if (zInterrupted) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        Thread.currentThread().interrupt();
    }

    /* JADX WARN: Code duplicated, block: B:159:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:306:0x03c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        d dVar;
        z1 z1Var;
        f fVar;
        Long lValueOf;
        int i = 0;
        objArr = 0;
        Object[] objArr = 0;
        int i2 = 1;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                l lVar = (l) this.i;
                try {
                    com.gamericefishpro.space.u6.f.w((b) this.e);
                    t2 t2Var = (t2) lVar.e;
                    t2Var.r();
                    lVar.r();
                    t2Var.B = false;
                    t2Var.C = 1;
                    v0 v0Var = ((r1) t2Var.d).y;
                    r1.l(v0Var);
                    v0Var.F.b(((a4) lVar.d).d, "Successfully registered trigger URI");
                    t2Var.Q();
                    return;
                } catch (Error e) {
                    e = e;
                    lVar.l(e);
                    return;
                } catch (RuntimeException e2) {
                    e = e2;
                    lVar.l(e);
                    return;
                } catch (ExecutionException e3) {
                    lVar.l(e3.getCause());
                    return;
                }
            case 1:
                try {
                    c();
                    return;
                } catch (Error e4) {
                    synchronized (((j) this.i).e) {
                        ((j) this.i).i = 1;
                        throw e4;
                    }
                }
            case 2:
                h hVar = (h) this.i;
                try {
                    n nVar = com.gamericefishpro.space.oh.p.d;
                    hVar.resumeWith(((b) this.e).get());
                    return;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        cause = th;
                    }
                    if (th instanceof CancellationException) {
                        hVar.i(cause);
                        return;
                    } else {
                        n nVar2 = com.gamericefishpro.space.oh.p.d;
                        hVar.resumeWith(com.gamericefishpro.space.wa.b.q(cause));
                        return;
                    }
                }
            case 3:
                try {
                    ((Worker) this.i).getClass();
                    throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
                } catch (Throwable th2) {
                    ((com.gamericefishpro.space.w6.j) this.e).j(th2);
                    return;
                }
            case 4:
                if (((com.gamericefishpro.space.m6.p) this.i).J.d instanceof com.gamericefishpro.space.w6.a) {
                    return;
                }
                try {
                    ((b) this.e).get();
                    q qVarC = q.c();
                    String str = com.gamericefishpro.space.m6.p.L;
                    String str2 = ((com.gamericefishpro.space.m6.p) this.i).w.c;
                    qVarC.getClass();
                    com.gamericefishpro.space.m6.p pVar = (com.gamericefishpro.space.m6.p) this.i;
                    pVar.J.k(pVar.y.startWork());
                    return;
                } catch (Throwable th3) {
                    ((com.gamericefishpro.space.m6.p) this.i).J.j(th3);
                    return;
                }
            case i.STRING_FIELD_NUMBER /* 5 */:
                com.gamericefishpro.space.m6.p pVar2 = (com.gamericefishpro.space.m6.p) this.i;
                try {
                    try {
                        com.gamericefishpro.space.l6.o oVar = (com.gamericefishpro.space.l6.o) pVar2.J.get();
                        if (oVar == null) {
                            q.c().a(com.gamericefishpro.space.m6.p.L, pVar2.w.c + " returned a null result. Treating it as a failure.");
                        } else {
                            q qVarC2 = q.c();
                            String str3 = com.gamericefishpro.space.m6.p.L;
                            String str4 = pVar2.w.c;
                            oVar.toString();
                            qVarC2.getClass();
                            pVar2.A = oVar;
                        }
                    } catch (Throwable th4) {
                        pVar2.b();
                        throw th4;
                    }
                    break;
                } catch (InterruptedException e5) {
                    e = e5;
                    q.c().b(com.gamericefishpro.space.m6.p.L, ((String) this.e) + " failed because it threw an exception/error", e);
                } catch (CancellationException unused) {
                    q qVarC3 = q.c();
                    String str5 = com.gamericefishpro.space.m6.p.L;
                    qVarC3.getClass();
                } catch (ExecutionException e6) {
                    e = e6;
                    q.c().b(com.gamericefishpro.space.m6.p.L, ((String) this.e) + " failed because it threw an exception/error", e);
                }
                pVar2.b();
                return;
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                f fVar2 = (f) this.e;
                com.gamericefishpro.space.n.i iVar = (com.gamericefishpro.space.n.i) this.i;
                com.gamericefishpro.space.m.i iVar2 = iVar.i;
                if (iVar2 != null && (dVar = iVar2.e) != null && (z1Var = ((ActionMenuView) dVar.e).M) != null) {
                    Toolbar toolbar = z1Var.a;
                    com.gamericefishpro.space.n.i iVar3 = toolbar.d.L;
                    if (iVar3 == null || (fVar = iVar3.K) == null || !fVar.b()) {
                        Iterator it = ((CopyOnWriteArrayList) toolbar.c0.e).iterator();
                        if (it.hasNext()) {
                            ((com.gamericefishpro.space.w4.i) it.next()).getClass();
                            throw null;
                        }
                    }
                }
                ActionMenuView actionMenuView = iVar.z;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    if (fVar2.b()) {
                        iVar.K = fVar2;
                    } else if (fVar2.e != null) {
                        fVar2.d(0, 0, false, false);
                        iVar.K = fVar2;
                    }
                }
                iVar.M = null;
                return;
            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                q qVarC4 = q.c();
                int i3 = com.gamericefishpro.space.n6.a.d;
                com.gamericefishpro.space.u6.p pVar3 = (com.gamericefishpro.space.u6.p) this.e;
                qVarC4.getClass();
                ((com.gamericefishpro.space.n6.a) this.i).a.a(pVar3);
                return;
            case i.BYTES_FIELD_NUMBER /* 8 */:
                a2 a2Var = (a2) this.e;
                a2Var.f();
                if (e.g()) {
                    a2Var.c().A(this);
                    return;
                }
                com.gamericefishpro.space.n9.n nVar3 = (com.gamericefishpro.space.n9.n) this.i;
                i = nVar3.c != 0 ? 1 : 0;
                nVar3.c = 0L;
                if (i != 0) {
                    nVar3.a();
                    return;
                }
                return;
            case 9:
                g1 g1Var = (g1) this.i;
                r1 r1Var = g1Var.e.e;
                p1 p1Var = r1Var.z;
                r1.l(p1Var);
                p1Var.r();
                Bundle bundle = new Bundle();
                bundle.putString("package_name", g1Var.d);
                try {
                    z zVar = (z) ((b0) this.e);
                    Parcel parcelH = zVar.H();
                    y.b(parcelH, bundle);
                    Parcel parcelG = zVar.G(parcelH, 1);
                    Bundle bundle2 = (Bundle) y.a(parcelG, Bundle.CREATOR);
                    parcelG.recycle();
                    if (bundle2 == null) {
                        v0 v0Var2 = r1Var.y;
                        r1.l(v0Var2);
                        v0Var2.y.a("Install Referrer Service returned a null response");
                    }
                    break;
                } catch (Exception e7) {
                    v0 v0Var3 = r1Var.y;
                    r1.l(v0Var3);
                    v0Var3.y.b(e7.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                p1 p1Var2 = r1Var.z;
                r1.l(p1Var2);
                p1Var2.r();
                throw new IllegalStateException("Unexpected call on client side");
            case 10:
                a();
                return;
            case RequestError.STOP_TRACKING /* 11 */:
                m4 m4Var = ((y1) this.i).d;
                m4Var.B();
                com.gamericefishpro.space.n9.e eVar = (com.gamericefishpro.space.n9.e) this.e;
                if (eVar.i.b() == null) {
                    m4Var.getClass();
                    String str6 = eVar.d;
                    c0.g(str6);
                    t4 t4VarQ = m4Var.Q(str6);
                    if (t4VarQ != null) {
                        m4Var.Z(eVar, t4VarQ);
                        return;
                    }
                    return;
                }
                m4Var.getClass();
                String str7 = eVar.d;
                c0.g(str7);
                t4 t4VarQ2 = m4Var.Q(str7);
                if (t4VarQ2 != null) {
                    m4Var.Y(eVar, t4VarQ2);
                    return;
                }
                return;
            case 12:
                l0 l0Var = (l0) this.e;
                t2 t2Var2 = (t2) this.i;
                r1 r1Var2 = (r1) t2Var2.d;
                r1 r1Var3 = (r1) t2Var2.d;
                w3 w3Var = r1Var2.A;
                r1.k(w3Var);
                r1 r1Var4 = (r1) w3Var.d;
                f1 f1Var = r1Var4.w;
                r1.j(f1Var);
                if (f1Var.y().i(d2.ANALYTICS_STORAGE)) {
                    r1.j(f1Var);
                    d1 d1Var = f1Var.J;
                    r1Var4.D.getClass();
                    if (!f1Var.B(System.currentTimeMillis()) && d1Var.a() != 0) {
                        lValueOf = Long.valueOf(d1Var.a());
                    }
                    if (lValueOf == null) {
                        r4 r4Var = r1Var3.B;
                        r1.j(r4Var);
                        r4Var.a0(l0Var, lValueOf.longValue());
                        return;
                    } else {
                        try {
                            l0Var.h(null);
                            return;
                        } catch (RemoteException e8) {
                            v0 v0Var4 = r1Var3.y;
                            r1.l(v0Var4);
                            v0Var4.y.b(e8, "getSessionId failed with exception");
                            return;
                        }
                    }
                }
                v0 v0Var5 = r1Var4.y;
                r1.l(v0Var5);
                v0Var5.D.a("Analytics storage consent denied; will not get session id");
                lValueOf = null;
                if (lValueOf == null) {
                    l0Var.h(null);
                    return;
                }
                r4 r4Var2 = r1Var3.B;
                r1.j(r4Var2);
                r4Var2.a0(l0Var, lValueOf.longValue());
                return;
            case 13:
                ((t2) this.i).I((Boolean) this.e, true);
                return;
            case 14:
                t2 t2Var3 = (t2) this.i;
                r1 r1Var5 = (r1) t2Var3.d;
                f1 f1Var2 = r1Var5.w;
                v0 v0Var6 = r1Var5.y;
                r1.j(f1Var2);
                f1Var2.r();
                f1Var2.r();
                o oVarB = o.b(f1Var2.v().getString("dma_consent_settings", null));
                o oVar2 = (o) this.e;
                int i4 = oVar2.a;
                if (!e2.l(i4, oVarB.a)) {
                    r1.l(v0Var6);
                    v0Var6.E.b(Integer.valueOf(i4), "Lower precedence consent source ignored, proposed source");
                    return;
                }
                SharedPreferences.Editor editorEdit = f1Var2.v().edit();
                editorEdit.putString("dma_consent_settings", oVar2.b);
                editorEdit.apply();
                r1.l(v0Var6);
                v0Var6.G.b(oVar2, "Setting DMA consent(FE)");
                r1 r1Var6 = (r1) t2Var3.d;
                if (r1Var6.o().B()) {
                    o3 o3VarO = r1Var6.o();
                    o3VarO.r();
                    o3VarO.s();
                    o3VarO.F(new m3(o3VarO, i2));
                    return;
                }
                o3 o3VarO2 = r1Var6.o();
                o3VarO2.r();
                o3VarO2.s();
                if (o3VarO2.A()) {
                    o3VarO2.F(new j3(o3VarO2, o3VarO2.H(false)));
                    return;
                }
                return;
            case 15:
                t2 t2Var4 = ((AppMeasurementDynamiteService) this.i).d.F;
                r1.k(t2Var4);
                com.gamericefishpro.space.u6.c cVar = (com.gamericefishpro.space.u6.c) this.e;
                t2Var4.r();
                t2Var4.s();
                com.gamericefishpro.space.u6.c cVar2 = t2Var4.v;
                if (cVar != cVar2) {
                    c0.i("EventInterceptor already set.", cVar2 == null);
                }
                t2Var4.v = cVar;
                return;
            case 16:
                t2 t2Var5 = (t2) this.e;
                t2Var5.r();
                if (Build.VERSION.SDK_INT < 30) {
                    return;
                }
                List<a4> list = (List) this.i;
                f1 f1Var3 = ((r1) t2Var5.d).w;
                r1.j(f1Var3);
                SparseArray sparseArrayX = f1Var3.x();
                for (a4 a4Var : list) {
                    int i5 = a4Var.i;
                    if (!sparseArrayX.contains(i5) || ((Long) sparseArrayX.get(i5)).longValue() < a4Var.e) {
                        t2Var5.P().add(a4Var);
                    }
                }
                t2Var5.Q();
                return;
            case 17:
                r1 r1Var7 = (r1) ((t2) this.e).d;
                m0 m0VarQ = r1Var7.q();
                String str8 = (String) this.i;
                String str9 = m0VarQ.J;
                if (str9 != null && !str9.equals(str8)) {
                    objArr = 1;
                }
                m0VarQ.J = str8;
                if (objArr != 0) {
                    r1Var7.q().w();
                    return;
                }
                return;
            case 18:
                o3 o3Var = (o3) this.i;
                h0 h0Var = o3Var.v;
                r1 r1Var8 = (r1) o3Var.d;
                if (h0Var == null) {
                    v0 v0Var7 = r1Var8.y;
                    r1.l(v0Var7);
                    v0Var7.y.a("Failed to send current screen to service");
                    return;
                }
                try {
                    b3 b3Var = (b3) this.e;
                    if (b3Var == null) {
                        h0Var.m(0L, null, null, r1Var8.d.getPackageName());
                    } else {
                        h0Var.m(b3Var.c, b3Var.a, b3Var.b, r1Var8.d.getPackageName());
                    }
                    o3Var.E();
                    return;
                } catch (RemoteException e9) {
                    v0 v0Var8 = r1Var8.y;
                    r1.l(v0Var8);
                    v0Var8.y.b(e9, "Failed to send current screen to the service");
                    return;
                }
            case 19:
                ((n3) this.i).i.C((ComponentName) this.e);
                return;
            case 20:
                o3 o3Var2 = ((n3) this.i).i;
                o3Var2.v = null;
                if (((com.gamericefishpro.space.s8.b) this.e).e != 7777) {
                    o3Var2.G();
                    return;
                }
                if (o3Var2.z == null) {
                    o3Var2.z = Executors.newScheduledThreadPool(1);
                }
                o3Var2.z.schedule(new com.gamericefishpro.space.h4.b(9, this), ((Long) e0.Z.a(null)).longValue(), TimeUnit.MILLISECONDS);
                return;
            case 21:
                m4 m4Var2 = (m4) this.e;
                m4Var2.B();
                Runnable runnable = (Runnable) this.i;
                m4Var2.c().r();
                if (m4Var2.I == null) {
                    m4Var2.I = new ArrayList();
                }
                m4Var2.I.add(runnable);
                m4Var2.q();
                return;
            case 22:
                ((r3) ((Service) ((d) this.e).e)).c((JobParameters) this.i);
                return;
            case 23:
                ((h) this.i).C((w0) this.e, Unit.a);
                return;
            case 24:
                com.gamericefishpro.space.r8.k kVar = (com.gamericefishpro.space.r8.k) this.e;
                IBinder iBinder = (IBinder) this.i;
                synchronized (kVar) {
                    if (iBinder == null) {
                        kVar.a("Null service connection");
                    } else {
                        try {
                            kVar.i = new s(iBinder);
                            kVar.d = 2;
                            ((ScheduledExecutorService) kVar.y.c).execute(new com.gamericefishpro.space.r8.j(kVar, i));
                        } catch (RemoteException e10) {
                            kVar.a(e10.getMessage());
                        }
                    }
                }
                return;
            case 25:
                com.gamericefishpro.space.r8.k kVar2 = (com.gamericefishpro.space.r8.k) this.e;
                int i6 = ((com.gamericefishpro.space.r8.l) this.i).a;
                synchronized (kVar2) {
                    com.gamericefishpro.space.r8.l lVar2 = (com.gamericefishpro.space.r8.l) kVar2.w.get(i6);
                    if (lVar2 != null) {
                        Log.w("MessengerIpcClient", "Timing out request: " + i6);
                        kVar2.w.remove(i6);
                        lVar2.b(new com.gamericefishpro.space.f1.h("Timed out waiting for response", null));
                        kVar2.c();
                    }
                    break;
                }
                return;
            case 26:
                com.gamericefishpro.space.r9.j jVar = (com.gamericefishpro.space.r9.j) this.i;
                com.gamericefishpro.space.r9.o oVar3 = jVar.v;
                Task task = (Task) this.e;
                if (task.i()) {
                    oVar3.n();
                    return;
                }
                try {
                    oVar3.m(jVar.i.e(task));
                    return;
                } catch (com.gamericefishpro.space.r9.f e11) {
                    if (e11.getCause() instanceof Exception) {
                        oVar3.l((Exception) e11.getCause());
                        return;
                    } else {
                        oVar3.l(e11);
                        return;
                    }
                } catch (Exception e12) {
                    oVar3.l(e12);
                    return;
                }
            case 27:
                com.gamericefishpro.space.r9.j jVar2 = (com.gamericefishpro.space.r9.j) this.i;
                com.gamericefishpro.space.r9.o oVar4 = jVar2.v;
                try {
                    Task task2 = (Task) jVar2.i.e((Task) this.e);
                    if (task2 == null) {
                        jVar2.d(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    com.gamericefishpro.space.r9.n nVar4 = com.gamericefishpro.space.r9.i.b;
                    task2.e(nVar4, jVar2);
                    task2.c(nVar4, jVar2);
                    task2.a(nVar4, jVar2);
                    return;
                } catch (com.gamericefishpro.space.r9.f e13) {
                    if (e13.getCause() instanceof Exception) {
                        oVar4.l((Exception) e13.getCause());
                        return;
                    } else {
                        oVar4.l(e13);
                        return;
                    }
                } catch (Exception e14) {
                    oVar4.l(e14);
                    return;
                }
            case 28:
                b();
                return;
            default:
                synchronized (((k) this.i).i) {
                    com.gamericefishpro.space.r9.d dVar2 = (com.gamericefishpro.space.r9.d) ((k) this.i).v;
                    Exception exception = ((Task) this.e).getException();
                    c0.g(exception);
                    dVar2.d(exception);
                    break;
                }
                return;
        }
    }

    public String toString() {
        String str;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.r5.b bVar = new com.gamericefishpro.space.r5.b(a.class.getSimpleName());
                l lVar = (l) this.i;
                s sVar = new s(13, false);
                ((s) bVar.v).i = sVar;
                bVar.v = sVar;
                sVar.e = lVar;
                return bVar.toString();
            case 1:
                Runnable runnable = (Runnable) this.e;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((j) this.i).i;
                if (i == 1) {
                    str = "IDLE";
                } else if (i == 2) {
                    str = "QUEUING";
                } else if (i != 3) {
                    str = i != 4 ? "null" : "RUNNING";
                } else {
                    str = "QUEUED";
                }
                sb.append(str);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(int i, Object obj, Object obj2, boolean z) {
        this.d = i;
        this.i = obj;
        this.e = obj2;
    }

    public a(d dVar, m4 m4Var, Runnable runnable) {
        this.d = 21;
        this.e = m4Var;
        this.i = runnable;
    }

    public a(g1 g1Var, b0 b0Var, g1 g1Var2) {
        this.d = 9;
        this.e = b0Var;
        this.i = g1Var;
    }

    public a(t2 t2Var, l0 l0Var) {
        this.d = 12;
        this.e = l0Var;
        Objects.requireNonNull(t2Var);
        this.i = t2Var;
    }

    public a(o3 o3Var, b3 b3Var) {
        this.d = 18;
        this.e = b3Var;
        Objects.requireNonNull(o3Var);
        this.i = o3Var;
    }

    public a(j jVar) {
        this.d = 1;
        this.i = jVar;
    }
}
