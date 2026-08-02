package defpackage;

import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import android.webkit.WebView;
import com.appsflyer.internal.AFa1zSDK;
import com.appsflyer.internal.AFc1dSDK;
import com.appsflyer.internal.AFi1iSDK;
import com.appsflyer.internal.AFj1zSDK;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.passport.R;
import com.yandex.passport.api.m;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.analytics.w;
import com.yandex.passport.internal.core.accounts.c;
import com.yandex.passport.internal.core.accounts.e;
import com.yandex.passport.internal.core.announcing.AccountsChangedReceiver;
import com.yandex.passport.internal.credentials.f;
import com.yandex.passport.internal.d;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.entities.j;
import com.yandex.passport.internal.flags.experiments.o;
import com.yandex.passport.internal.flags.experiments.q;
import com.yandex.passport.internal.p;
import com.yandex.passport.internal.properties.x;
import com.yandex.passport.internal.provider.InternalProvider;
import com.yandex.passport.internal.v;
import com.yandex.passport.sloth.ui.webview.i;
import com.yandex.plus.home.plaque.animator.internal.utils.a;
import com.yandex.plus.pay.ui.core.mobile.view.confetti.PlusPayConfettiView;
import com.yandex.plus.pay.ui.core.mobile.view.confetti.b;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.idsync.impl.D;
import io.appmetrica.analytics.idsync.impl.n;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import io.appmetrica.analytics.impl.C0102a1;
import io.appmetrica.analytics.impl.C0245f0;
import io.appmetrica.analytics.impl.H6;
import io.appmetrica.analytics.impl.S8;
import io.appmetrica.analytics.impl.Xk;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlin.KotlinVersion;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.YMApplication;

/* loaded from: classes.dex */
public final /* synthetic */ class gtm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gtm(AccountsChangedReceiver accountsChangedReceiver, Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        this.a = 16;
        this.b = context;
        this.c = intent;
        this.d = pendingResult;
    }

    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v26, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, java.util.List] */
    private final void a() {
        j jVar = (j) this.b;
        PlusPayConfettiView plusPayConfettiView = (PlusPayConfettiView) this.c;
        b bVar = (b) this.d;
        int i = bVar.d;
        jVar.getClass();
        ArrayList arrayList = new ArrayList(80);
        for (int i2 = 0; i2 < 80; i2++) {
            arrayList.add(new PointF(0.0f, 0.0f));
        }
        plusPayConfettiView.c = arrayList;
        ArrayList arrayList2 = new ArrayList(80);
        for (int i3 = 0; i3 < 80; i3++) {
            arrayList2.add(new Point(0, 0));
        }
        jVar.d = arrayList2;
        int size = arrayList2.size();
        for (int i4 = 0; i4 < size; i4++) {
            ohn ohnVar = phn.a;
            int A = ldg.A(ohnVar, bVar.b);
            int A2 = ldg.A(ohnVar, bVar.c);
            ((PointF) plusPayConfettiView.c.get(i4)).y = -i;
            ((Point) jVar.d.get(i4)).y = A2;
            int i5 = i4 % 3;
            ?? r13 = plusPayConfettiView.c;
            if (i5 == 0) {
                ((PointF) r13.get(i4)).x = 0.0f;
                ((Point) jVar.d.get(i4)).x = A;
            } else if (i5 != 1) {
                ((PointF) r13.get(i4)).x = ohnVar.h() * plusPayConfettiView.getWidth();
                ((Point) jVar.d.get(i4)).x = (phn.b.b() ? 1 : -1) * A;
            } else {
                ((PointF) r13.get(i4)).x = plusPayConfettiView.getWidth();
                ((Point) jVar.d.get(i4)).x = -A;
            }
        }
        int[] iArr = new int[80];
        for (int i6 = 0; i6 < 80; i6++) {
            iArr[i6] = ((Number) CollectionsKt.i0(bVar.a, phn.a)).intValue();
        }
        plusPayConfettiView.b = iArr;
        ArrayList arrayList3 = new ArrayList(80);
        for (int i7 = 0; i7 < 80; i7++) {
            ((a) jVar.b).getClass();
            float f = i;
            float h = phn.a.h() * 0.8f * f;
            Path path = new Path();
            path.moveTo(h, 0.0f);
            path.lineTo(0.0f, 0.0f);
            path.cubicTo(0.0f, 0.0f, 0.0f, f, f, f);
            path.cubicTo(f, f, h, 0.5f * f, h, 0.0f);
            arrayList3.add(path);
        }
        plusPayConfettiView.f = arrayList3;
        int[] iArr2 = new int[80];
        for (int i8 = 0; i8 < 80; i8++) {
            phn.a.getClass();
            iArr2[i8] = phn.b.e(0, 361);
        }
        plusPayConfettiView.d = iArr2;
        plusPayConfettiView.e = KotlinVersion.MAX_COMPONENT_VALUE;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(8000L);
        jVar.e = duration;
        duration.addUpdateListener(new up0(jVar, plusPayConfettiView, bVar));
        duration.addListener(new com.yandex.plus.acquisition.sdk.button.section.ui.impl.utils.a(4, jVar));
        duration.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b1, code lost:
    
        if (r0.get("android.provider.CONTACTS_STRUCTURE") != null) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0280 A[Catch: Exception -> 0x02c8, TryCatch #13 {Exception -> 0x02c8, blocks: (B:76:0x0247, B:78:0x0280, B:79:0x02ca), top: B:75:0x0247 }] */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.lang.Throwable, kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, pm6] */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        boolean z2;
        ArrayList arrayList;
        Object obj;
        ArrayList arrayList2;
        Continuation continuation;
        int i;
        w analyticsTrackerWrapper;
        PassportProcessGlobalComponent a;
        Continuation continuation2 = null;
        switch (this.a) {
            case 0:
                htm htmVar = (htm) this.b;
                ys3 ys3Var = (ys3) this.c;
                n5w n5wVar = (n5w) this.d;
                htmVar.getClass();
                try {
                    z = ((Boolean) ys3Var.b.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                    z = true;
                }
                synchronized (htmVar.k) {
                    try {
                        a4w A = bzf.A(n5wVar.a);
                        String str = A.a;
                        if (htmVar.c(str) == n5wVar) {
                            htmVar.b(str);
                        }
                        jsg.j().e(htm.l, htm.class.getSimpleName() + StringUtil.SPACE + str + " executed; reschedule = " + z);
                        Iterator it = htmVar.j.iterator();
                        while (it.hasNext()) {
                            ((rob) it.next()).a(A, z);
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                cio cioVar = (cio) this.b;
                String str2 = (String) this.c;
                bio bioVar = (bio) this.d;
                uio uioVar = (uio) cioVar.c.b;
                wio wioVar = uioVar.d;
                uioVar.c = str2;
                v6t t = bioVar.t();
                if (t != null) {
                    wioVar.d.i.c.put(Integer.valueOf(bioVar.h()), t);
                    wioVar.v = true;
                }
                wioVar.o();
                return;
            case 2:
                S8.a((S8) this.b, (Bundle) this.c, (H6) this.d);
                return;
            case 3:
                lcg lcgVar = (lcg) this.b;
                xop xopVar = (xop) this.c;
                try {
                    try {
                        xopVar.n(((jr1) this.d).mo34apply(leu.O(lcgVar)));
                        return;
                    } catch (Throwable th) {
                        xopVar.m(th);
                        return;
                    }
                } catch (Error e) {
                    e = e;
                    xopVar.m(e);
                    return;
                } catch (CancellationException unused2) {
                    xopVar.cancel(false);
                    return;
                } catch (RuntimeException e2) {
                    e = e2;
                    xopVar.m(e);
                    return;
                } catch (ExecutionException e3) {
                    e = e3;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    xopVar.m(e);
                    return;
                }
            case 4:
                xop xopVar2 = (xop) this.b;
                juc jucVar = (juc) this.c;
                ump umpVar = (ump) this.d;
                try {
                    if (xopVar2.a instanceof g6) {
                        return;
                    }
                    jucVar.run();
                    xopVar2.l(umpVar);
                    return;
                } catch (Throwable th2) {
                    xopVar2.m(th2);
                    return;
                }
            case 5:
                dxr dxrVar = (dxr) this.b;
                dsc dscVar = (dsc) this.c;
                tg7 tg7Var = (tg7) this.d;
                ccu ccuVar = (ccu) dxrVar.b;
                int i2 = dvt.a;
                ccuVar.I(dscVar, tg7Var);
                return;
            case 6:
                final Handler handler = (Handler) this.b;
                final HandlerThread handlerThread = (HandlerThread) this.c;
                final suh suhVar = (suh) this.d;
                CookieManager.getInstance().removeAllCookies(new ValueCallback() { // from class: mgv
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj2) {
                        CookieManager.getInstance().flush();
                        WebStorage.getInstance().deleteAllData();
                        handler.post(new xlr(21, handlerThread, suhVar));
                    }
                });
                return;
            case 7:
                cnv cnvVar = (cnv) this.b;
                lcg lcgVar2 = (lcg) this.c;
                Function1 function1 = (Function1) this.d;
                cnvVar.getClass();
                kkh c = cnv.c(lcgVar2);
                if (c != null) {
                    function1.invoke(c);
                    return;
                }
                return;
            case 8:
                y8p y8pVar = (y8p) this.b;
                ucr ucrVar = (ucr) this.c;
                htm htmVar2 = (htm) y8pVar.b;
                htmVar2.getClass();
                a4w a4wVar = ucrVar.a;
                String str3 = a4wVar.a;
                ArrayList arrayList3 = new ArrayList();
                t4w t4wVar = (t4w) htmVar2.e.s(new b6n(24, new jw7(1, htmVar2, arrayList3, str3)));
                int i3 = 16;
                if (t4wVar == null) {
                    jsg.j().o(htm.l, "Didn't find WorkSpec for id " + a4wVar);
                    htmVar2.d.d.execute(new zvh(i3, htmVar2, a4wVar));
                    return;
                }
                synchronized (htmVar2.k) {
                    try {
                        synchronized (htmVar2.k) {
                            z2 = htmVar2.c(str3) != null;
                        }
                        if (z2) {
                            Set set = (Set) htmVar2.h.get(str3);
                            if (((ucr) set.iterator().next()).a.b == a4wVar.b) {
                                set.add(ucrVar);
                                jsg.j().e(htm.l, "Work " + a4wVar + " is already enqueued for processing");
                            } else {
                                htmVar2.d.d.execute(new zvh(i3, htmVar2, a4wVar));
                            }
                            return;
                        }
                        if (t4wVar.t != a4wVar.b) {
                            htmVar2.d.d.execute(new zvh(i3, htmVar2, a4wVar));
                            return;
                        }
                        n5w n5wVar2 = new n5w(new rn5(htmVar2.b, htmVar2.c, htmVar2.d, htmVar2, htmVar2.e, t4wVar, arrayList3));
                        ys3 x = ocg.x(n5wVar2.d.b.plus(saf.p()), new l5w(n5wVar2, continuation2, 1));
                        x.b.a(new gtm(0, htmVar2, x, n5wVar2), htmVar2.d.d);
                        htmVar2.g.put(str3, n5wVar2);
                        HashSet hashSet = new HashSet();
                        hashSet.add(ucrVar);
                        htmVar2.h.put(str3, hashSet);
                        jsg.j().e(htm.l, htm.class.getSimpleName() + ": processing " + a4wVar);
                        return;
                    } finally {
                    }
                }
            case 9:
                Xk.a((Xk) this.b, (String) this.c, (Throwable) this.d);
                return;
            case 10:
                Xk.a((Xk) this.b, (String) this.c, (String) this.d);
                return;
            case 11:
                C0102a1.a((C0102a1) this.b, (PluginErrorDetails) this.c, (String) this.d);
                return;
            case 12:
                ((AFa1zSDK) this.b).d_((Context) this.c, (Intent) this.d);
                return;
            case 13:
                AFc1dSDK.getMonetizationNetwork((AFc1dSDK) this.b, (Throwable) this.c, (String) this.d);
                return;
            case 14:
                ((AFj1zSDK) this.b).AFAdRevenueData((AFi1iSDK) this.c, (Runnable) this.d);
                return;
            case 15:
                x xVar = (x) this.b;
                YMApplication yMApplication = (YMApplication) this.c;
                IReporterYandex iReporterYandex = (IReporterYandex) this.d;
                cmd cmdVar = cmd.a;
                com.yandex.passport.internal.x xVar2 = new com.yandex.passport.internal.x(yMApplication, iReporterYandex, (f) xVar.a.get(m.a));
                PackageManager packageManager = xVar2.b;
                Context context = xVar2.a;
                String str4 = xVar2.c;
                com.yandex.passport.legacy.a.e(3, "validateAndThrow: start", null);
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                try {
                    xVar2.i(arrayList4);
                    if (!(context.getString(R.string.passport_sync_adapter_prefix) + str4).equals(context.getString(R.string.passport_sync_adapter_content_authority))) {
                        com.yandex.passport.internal.x.a("Invalid value in passport_sync_adapter_content_authority", arrayList4);
                    }
                    xVar2.l(arrayList4);
                    if ((packageManager.getApplicationInfo(str4, 0).flags & SQLiteDatabase.OPEN_NOMUTEX) == 32768) {
                        com.yandex.passport.internal.x.a("allowBackup='true' is not allowed", arrayList4);
                    }
                    arrayList2 = arrayList5;
                    arrayList = arrayList4;
                    obj = null;
                    try {
                        xVar2.b(arrayList2, "com.yandex.passport.internal.core.announcing.AccountsChangedReceiver", "reaction to system events", 3, true);
                        xVar2.c(arrayList2, "com.yandex.passport.internal.core.announcing.AccountsChangedReceiver", xVar2.g("android.accounts.LOGIN_ACCOUNTS_CHANGED", null, null), 3);
                        xVar2.c(arrayList2, "com.yandex.passport.internal.core.announcing.AccountsChangedReceiver", xVar2.g("com.yandex.accounts.LOGIN_ACCOUNTS_CHANGED", null, null), 3);
                        xVar2.m(arrayList2);
                        xVar2.k(arrayList2);
                        try {
                            ServiceInfo serviceInfo = packageManager.getServiceInfo(xVar2.b(arrayList2, "com.yandex.passport.internal.core.sync.SyncService", "accounts backup", 2, false), 128);
                            xVar2.e(arrayList2, serviceInfo);
                            Bundle bundle = serviceInfo.metaData;
                            if (bundle != null) {
                                break;
                            }
                        } catch (PackageManager.NameNotFoundException unused3) {
                        }
                        com.yandex.passport.internal.x.a("Passport library verification error: There is no contacts metadata in BackupAccountsService declaration please copy \n<meta-data\nandroid:name=\"android.provider.CONTACTS_STRUCTURE\"\nandroid:resource=\"@xml/contacts\" />\nto declaration of com.yandex.auth.sync.BackupAccountsService in AndroidManifest.xml", arrayList2);
                        xVar2.j(arrayList2);
                        xVar2.d(arrayList2);
                        if (com.yandex.passport.internal.x.i.contains(str4)) {
                            continuation = obj;
                        } else {
                            continuation = obj;
                            if (com.yandex.passport.internal.x.h.equals(xVar2.e)) {
                                arrayList2.add(new IllegalStateException("Don't use credentials from the sample in your application"));
                                continuation = obj;
                            }
                        }
                    } catch (Exception e4) {
                        e = e4;
                        arrayList2.add(new IllegalStateException("Passport library verification error", e));
                        continuation = obj;
                        xVar2.h(arrayList2);
                        xVar2.h(arrayList);
                        i = 2;
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                        }
                        com.yandex.passport.legacy.a.e(3, "validateAndThrow: end: errorList.size()=" + arrayList2.size() + " fatalErrorList.size()=" + arrayList.size(), continuation);
                        if (arrayList.size() > 0) {
                        }
                        a = com.yandex.passport.internal.di.a.a();
                        e accountsRetriever = a.getAccountsRetriever();
                        c0 currentAccountAnalyticsHelper = a.getCurrentAccountAnalyticsHelper();
                        d a2 = accountsRetriever.a();
                        q experimentsUpdater = a.getExperimentsUpdater();
                        o oVar = o.a;
                        int i4 = q.h;
                        com.yandex.passport.common.core.a aVar = com.yandex.passport.common.core.b.b;
                        experimentsUpdater.a(oVar);
                        a.getFlagRepository().a();
                        currentAccountAnalyticsHelper.a(a2);
                        if (!((Boolean) a.getFlagRepository().b(com.yandex.passport.internal.flags.o.q)).booleanValue()) {
                        }
                        a.getCoroutineScopes().getClass();
                        x97.y(cmdVar, continuation, continuation, new wzv(a, yMApplication, continuation, 17), 3);
                        a.getCoroutineScopes().getClass();
                        x97.y(cmdVar, ((com.yandex.passport.common.coroutine.b) a.getCoroutineDispatchers()).c, continuation, new com.yandex.passport.internal.o(a, continuation, i), 2);
                        return;
                    }
                } catch (Exception e5) {
                    e = e5;
                    arrayList = arrayList4;
                    obj = null;
                    arrayList2 = arrayList5;
                }
                xVar2.h(arrayList2);
                xVar2.h(arrayList);
                i = 2;
                if ((context.getApplicationInfo().flags & 2) != 0) {
                    arrayList.addAll(arrayList2);
                }
                com.yandex.passport.legacy.a.e(3, "validateAndThrow: end: errorList.size()=" + arrayList2.size() + " fatalErrorList.size()=" + arrayList.size(), continuation);
                if (arrayList.size() > 0) {
                    Log.e("PassportRuntime", ((IllegalStateException) arrayList.get(0)).getMessage().toString());
                    System.exit(0);
                }
                try {
                    a = com.yandex.passport.internal.di.a.a();
                    e accountsRetriever2 = a.getAccountsRetriever();
                    c0 currentAccountAnalyticsHelper2 = a.getCurrentAccountAnalyticsHelper();
                    d a22 = accountsRetriever2.a();
                    q experimentsUpdater2 = a.getExperimentsUpdater();
                    o oVar2 = o.a;
                    int i42 = q.h;
                    com.yandex.passport.common.core.a aVar2 = com.yandex.passport.common.core.b.b;
                    experimentsUpdater2.a(oVar2);
                    a.getFlagRepository().a();
                    currentAccountAnalyticsHelper2.a(a22);
                    if (!((Boolean) a.getFlagRepository().b(com.yandex.passport.internal.flags.o.q)).booleanValue()) {
                        v.e(a, a22);
                        v.a(a);
                        a.getCoroutineScopes().getClass();
                        x97.y(cmdVar, continuation, continuation, new p(a, continuation, 1), 3);
                        a.getCoroutineScopes().getClass();
                        x97.y(cmdVar, continuation, continuation, new p(a, continuation, i), 3);
                        a.getCoroutineScopes().getClass();
                        x97.y(cmdVar, continuation, continuation, new p(a, continuation, 0), 3);
                        a.getCoroutineScopes().getClass();
                        x97.y(cmdVar, continuation, continuation, new ocu(a, xVar, yMApplication, continuation, 16), 3);
                    }
                    a.getCoroutineScopes().getClass();
                    x97.y(cmdVar, continuation, continuation, new wzv(a, yMApplication, continuation, 17), 3);
                    a.getCoroutineScopes().getClass();
                    x97.y(cmdVar, ((com.yandex.passport.common.coroutine.b) a.getCoroutineDispatchers()).c, continuation, new com.yandex.passport.internal.o(a, continuation, i), 2);
                    return;
                } catch (Exception e6) {
                    boolean z3 = InternalProvider.d;
                    Log.e("throwIfDebug", "throwIfDebug: isInPassportProcess=" + InternalProvider.d, e6);
                    if (InternalProvider.d) {
                        try {
                            PassportProcessGlobalComponent passportProcessGlobalComponent = com.yandex.passport.internal.di.a.a;
                            if (passportProcessGlobalComponent == null || (analyticsTrackerWrapper = passportProcessGlobalComponent.getAnalyticsTrackerWrapper()) == null) {
                                Log.e("throwIfDebug", "throwIfDebug: something very wrong just happened");
                            } else {
                                analyticsTrackerWrapper.d(com.yandex.passport.internal.analytics.v.a, e6);
                            }
                            return;
                        } catch (Exception e7) {
                            Log.e("throwIfDebug", "throwIfDebug: something very wrong just happened", e7);
                            return;
                        }
                    }
                    return;
                }
            case 16:
                Context context2 = (Context) this.b;
                Intent intent = (Intent) this.c;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.d;
                int i5 = AccountsChangedReceiver.a;
                try {
                    try {
                        PassportProcessGlobalComponent a3 = com.yandex.passport.internal.di.a.a();
                        com.yandex.passport.internal.core.announcing.e announcingHelper = a3.getAnnouncingHelper();
                        com.yandex.passport.internal.report.reporters.f announcementReporter = a3.getAnnouncementReporter();
                        c accountsBackuper = a3.getAccountsBackuper();
                        com.yandex.passport.internal.core.announcing.b accountsChangesAnnouncer = a3.getAccountsChangesAnnouncer();
                        if (AccountsChangedReceiver.a(context2, a3.getAccountSharingConfigStorage())) {
                            com.yandex.passport.internal.core.announcing.d a4 = announcingHelper.a(intent);
                            if (a4 != null) {
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onReceive: received " + a4, 8);
                                }
                                announcementReporter.u(a4);
                                if (!TextUtils.equals(a4.c, context2.getPackageName())) {
                                    accountsBackuper.d("android.accounts.LOGIN_ACCOUNTS_CHANGED");
                                    accountsChangesAnnouncer.getClass();
                                    accountsChangesAnnouncer.a(true);
                                } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onReceive: ignored because sent by me", 8);
                                }
                            } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onReceive: can't get announcement from intent", 8);
                            }
                        } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onReceive: ignored because is not trusted application", 8);
                        }
                    } catch (Exception e8) {
                        com.yandex.passport.legacy.a.d(e8);
                    }
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 17:
                i iVar = (i) this.b;
                Function1 function12 = (Function1) this.c;
                WebView webView = (WebView) this.d;
                if (iVar.b.b() != lyf.a) {
                    function12.invoke(webView);
                    return;
                }
                return;
            case 18:
                a();
                return;
            case 19:
                C0245f0.a((C0245f0) this.b, (Context) this.c, (AppMetricaLibraryAdapterConfig) this.d);
                return;
            default:
                n.a((D) this.b, (n) this.c, (RequestConfig) this.d);
                return;
        }
    }

    public /* synthetic */ gtm(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
