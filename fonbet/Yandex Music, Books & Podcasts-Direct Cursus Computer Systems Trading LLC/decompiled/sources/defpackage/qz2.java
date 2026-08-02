package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.BuildConfig;
import com.android.billingclient.api.ProxyBillingActivity;
import com.yandex.plus.pay.inapp.google.internal.a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public class qz2 extends pz2 {
    public final Object a;
    public volatile int b;
    public final String c;
    public final Handler d;
    public volatile evj e;
    public final Context f;
    public final atn g;
    public volatile q1x h;
    public volatile rlh i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public final gos v;
    public final boolean w;
    public ExecutorService x;
    public volatile c9x y;
    public final Long z;

    public qz2(gos gosVar, Context context) {
        this.a = new Object();
        this.b = 0;
        this.d = new Handler(Looper.getMainLooper());
        this.k = 0;
        long nextLong = new Random().nextLong();
        this.z = Long.valueOf(nextLong);
        this.c = l();
        this.f = context.getApplicationContext();
        rfx r = sfx.r();
        String l = l();
        r.d();
        sfx.q((sfx) r.b, l);
        String packageName = this.f.getPackageName();
        r.d();
        sfx.p((sfx) r.b, packageName);
        r.d();
        sfx.o((sfx) r.b, nextLong);
        this.g = new atn(this.f, (sfx) r.c());
        l8x.g("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.e = new evj(this.f, (n4n) null, this.g);
        this.v = gosVar;
        this.f.getPackageName();
    }

    public static Future i(Callable callable, long j, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new rxw(submit, runnable, false, 3), (long) (j * 0.95d));
            return submit;
        } catch (Exception e) {
            l8x.h("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public static String l() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return BuildConfig.VERSION_NAME;
        }
    }

    public final void A(uz2 uz2Var) {
        if (Thread.interrupted()) {
            return;
        }
        this.d.post(new rxw(this, uz2Var, false, 18));
    }

    @Override // defpackage.pz2
    public void a(fd fdVar, a aVar) {
        if (!d()) {
            uz2 uz2Var = b6x.k;
            y(2, 3, uz2Var);
            aVar.a(uz2Var);
            return;
        }
        if (TextUtils.isEmpty(fdVar.a)) {
            l8x.g("BillingClient", "Please provide a valid purchase token.");
            uz2 uz2Var2 = b6x.h;
            y(26, 3, uz2Var2);
            aVar.a(uz2Var2);
            return;
        }
        if (!this.m) {
            uz2 uz2Var3 = b6x.b;
            y(27, 3, uz2Var3);
            aVar.a(uz2Var3);
            return;
        }
        if (i(new tzw(9, this, aVar, fdVar), 30000L, new rxw(this, aVar, false, 21), v(), m()) == null) {
            uz2 j = j();
            y(25, 3, j);
            aVar.a(j);
        }
    }

    @Override // defpackage.pz2
    public void b(psd psdVar, a aVar) {
        if (!d()) {
            uz2 uz2Var = b6x.k;
            y(2, 4, uz2Var);
            aVar.c(uz2Var, psdVar.b);
        } else {
            if (i(new tzw(1, this, psdVar, aVar), 30000L, new nud(this, aVar, psdVar, false, 21), v(), m()) == null) {
                uz2 j = j();
                y(25, 4, j);
                aVar.c(j, psdVar.b);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(3:(3:6|7|(1:9))|14|4a)|11|12|13|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0041, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0042, code lost:
    
        defpackage.l8x.h("BillingClient", "There was an exception while unbinding from the service while ending connection!", r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.pz2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c() {
        try {
            n(v5x.d(12));
        } catch (Throwable th) {
            l8x.h("BillingClient", "Unable to log.", th);
        }
        synchronized (this.a) {
            try {
                try {
                    if (this.e != null) {
                        evj evjVar = this.e;
                        qgx qgxVar = (qgx) evjVar.e;
                        Context context = (Context) evjVar.c;
                        qgxVar.c(context);
                        ((qgx) evjVar.f).c(context);
                    }
                } finally {
                    l8x.f("BillingClient", "Unbinding from service.");
                    p();
                    synchronized (this) {
                    }
                }
                synchronized (this) {
                    ExecutorService executorService = this.x;
                    if (executorService != null) {
                        executorService.shutdownNow();
                        this.x = null;
                        this.y = null;
                    }
                }
            } finally {
                try {
                } finally {
                }
            }
            l8x.f("BillingClient", "Unbinding from service.");
            p();
        }
    }

    @Override // defpackage.pz2
    public final boolean d() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.b == 2 && this.h != null && this.i != null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
    
        if (r28.b == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x060a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0538  */
    @Override // defpackage.pz2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public uz2 e(Activity activity, final z0j z0jVar) {
        String str;
        String str2;
        String str3;
        String str4;
        uz2 a;
        String str5;
        String str6;
        Future i;
        Object obj;
        int Y;
        String string;
        String str7;
        boolean z;
        String str8;
        String str9;
        tz2 tz2Var;
        String str10;
        boolean z2;
        String str11;
        int i2;
        final int i3;
        final qz2 qz2Var = this;
        if (qz2Var.e == null || ((n4n) qz2Var.e.d) == null) {
            uz2 uz2Var = b6x.t;
            qz2Var.y(12, 2, uz2Var);
            return uz2Var;
        }
        if (!qz2Var.d()) {
            uz2 uz2Var2 = b6x.k;
            qz2Var.y(2, 2, uz2Var2);
            qz2Var.A(uz2Var2);
            return uz2Var2;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList) z0jVar.e);
        i6x i6xVar = (i6x) z0jVar.d;
        Iterator it = arrayList.iterator();
        if ((it.hasNext() ? it.next() : null) != null) {
            l1j.f();
            return null;
        }
        e6x e6xVar = (e6x) i6xVar.iterator();
        tz2 tz2Var2 = (tz2) (e6xVar.hasNext() ? e6xVar.next() : null);
        ptm ptmVar = tz2Var2.a;
        String str12 = ptmVar.c;
        String str13 = ptmVar.d;
        if (str13.equals("subs") && !qz2Var.j) {
            l8x.g("BillingClient", "Current client doesn't support subscriptions.");
            uz2 uz2Var3 = b6x.m;
            qz2Var.y(9, 2, uz2Var3);
            qz2Var.A(uz2Var3);
            return uz2Var3;
        }
        tzb tzbVar = (tzb) z0jVar.c;
        tzbVar.getClass();
        if (tzbVar.b == 0) {
            final int i4 = 2;
            if (!((i6x) z0jVar.d).stream().anyMatch(new Predicate() { // from class: wzw
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    switch (i4) {
                        case 0:
                            int i5 = l8x.a;
                            break;
                        case 1:
                            int i6 = l8x.a;
                            break;
                        default:
                            break;
                    }
                    return false;
                }
            })) {
            }
        }
        if (!qz2Var.l) {
            l8x.g("BillingClient", "Current client doesn't support extra params for buy intent.");
            uz2 uz2Var4 = b6x.g;
            qz2Var.y(18, 2, uz2Var4);
            qz2Var.A(uz2Var4);
            return uz2Var4;
        }
        if (arrayList.size() > 1 && !qz2Var.p) {
            l8x.g("BillingClient", "Current client doesn't support multi-item purchases.");
            uz2 uz2Var5 = b6x.o;
            qz2Var.y(19, 2, uz2Var5);
            qz2Var.A(uz2Var5);
            return uz2Var5;
        }
        if (!i6xVar.isEmpty() && !qz2Var.q) {
            l8x.g("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            uz2 uz2Var6 = b6x.q;
            qz2Var.y(20, 2, uz2Var6);
            qz2Var.A(uz2Var6);
            return uz2Var6;
        }
        if (((i6x) z0jVar.d).isEmpty()) {
            a = b6x.j;
            str2 = str13;
            str4 = "BUY_INTENT";
            str3 = str12;
            str = null;
        } else {
            tz2 tz2Var3 = (tz2) ((i6x) z0jVar.d).get(0);
            int i5 = 1;
            while (true) {
                str = null;
                if (i5 < ((i6x) z0jVar.d).size()) {
                    tz2 tz2Var4 = (tz2) ((i6x) z0jVar.d).get(i5);
                    str2 = str13;
                    if (!tz2Var4.a.d.equals(tz2Var3.a.d) && !tz2Var4.a.d.equals("play_pass_subs")) {
                        a = b6x.a(5, "All products should have same ProductType.");
                        str4 = "BUY_INTENT";
                        str3 = str12;
                        break;
                    }
                    i5++;
                    str13 = str2;
                } else {
                    str2 = str13;
                    ptm ptmVar2 = tz2Var3.a;
                    String optString = ptmVar2.b.optString("packageName");
                    HashSet hashSet = new HashSet();
                    HashSet hashSet2 = new HashSet();
                    str3 = str12;
                    i6x i6xVar2 = (i6x) z0jVar.d;
                    int size = i6xVar2.size();
                    str4 = "BUY_INTENT";
                    int i6 = 0;
                    while (true) {
                        if (i6 < size) {
                            int i7 = i6;
                            ptm ptmVar3 = ((tz2) i6xVar2.get(i6)).a;
                            i6x i6xVar3 = i6xVar2;
                            int i8 = size;
                            ptmVar3.d.equals("subs");
                            boolean contains = hashSet.contains(ptmVar3.c);
                            String str14 = ptmVar3.c;
                            if (!contains) {
                                hashSet.add(str14);
                                if (!ptmVar2.d.equals("play_pass_subs") && !ptmVar3.d.equals("play_pass_subs") && !optString.equals(ptmVar3.b.optString("packageName"))) {
                                    a = b6x.a(5, "All products must have the same package name.");
                                    break;
                                }
                                i6 = i7 + 1;
                                i6xVar2 = i6xVar3;
                                size = i8;
                            } else {
                                a = b6x.a(5, "ProductId can not be duplicated. Invalid product id: " + str14 + ".");
                                break;
                            }
                        } else {
                            Iterator it2 = hashSet2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    String str15 = (String) it2.next();
                                    if (hashSet.contains(str15)) {
                                        a = b6x.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str15 + ".");
                                        break;
                                    }
                                } else {
                                    mtm a2 = ptmVar2.a();
                                    a = (a2 == null || a2.e == null) ? b6x.j : b6x.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                }
                            }
                        }
                    }
                }
            }
        }
        if (a != b6x.j) {
            qz2Var.y(120, 2, a);
            qz2Var.A(a);
            return a;
        }
        if (qz2Var.l) {
            boolean z3 = qz2Var.m;
            qz2Var.v.getClass();
            qz2Var.v.getClass();
            boolean z4 = qz2Var.w;
            String str16 = qz2Var.c;
            long longValue = qz2Var.z.longValue();
            final String packageName = qz2Var.f.getPackageName();
            final Bundle bundle = new Bundle();
            l8x.b(bundle, str16, longValue);
            int i9 = ((tzb) z0jVar.c).b;
            if (i9 != 0) {
                bundle.putInt("prorationMode", i9);
            }
            if (TextUtils.isEmpty(str)) {
                str7 = str;
            } else {
                str7 = str;
                bundle.putString("accountId", str7);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("obfuscatedProfileId", str7);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(str7)));
            }
            if (!TextUtils.isEmpty(((tzb) z0jVar.c).a)) {
                bundle.putString("oldSkuPurchaseToken", ((tzb) z0jVar.c).a);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("oldSkuPurchaseId", null);
            }
            ((tzb) z0jVar.c).getClass();
            if (!TextUtils.isEmpty(null)) {
                ((tzb) z0jVar.c).getClass();
                bundle.putString("originalExternalTransactionId", null);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("paymentsPurchaseParams", null);
            }
            if (z3) {
                z = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                z = true;
            }
            if (z4) {
                bundle.putBoolean("enableAlternativeBilling", z);
            }
            final int i10 = 0;
            if (((i6x) z0jVar.d).stream().anyMatch(new Predicate() { // from class: wzw
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    switch (i10) {
                        case 0:
                            int i52 = l8x.a;
                            break;
                        case 1:
                            int i62 = l8x.a;
                            break;
                        default:
                            break;
                    }
                    return false;
                }
            })) {
                cax n = dax.n();
                final int i11 = 1;
                Iterable iterable = (Iterable) ((i6x) z0jVar.d).stream().filter(new Predicate() { // from class: wzw
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        switch (i11) {
                            case 0:
                                int i52 = l8x.a;
                                break;
                            case 1:
                                int i62 = l8x.a;
                                break;
                            default:
                                break;
                        }
                        return false;
                    }
                }).map(new Function() { // from class: c5x
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        int i12 = l8x.a;
                        String str17 = ((tz2) obj2).a.c;
                        y9x n2 = aax.n();
                        eax n3 = fax.n();
                        String str18 = "subs:" + packageName + StringUtils.PROCESS_POSTFIX_DELIMITER + str17;
                        n3.d();
                        fax.o((fax) n3.b, str18);
                        n2.d();
                        aax.o((aax) n2.b, (fax) n3.c());
                        fax.n();
                        throw null;
                    }
                }).collect(l4x.a);
                n.d();
                dax.o((dax) n.b, iterable);
                bundle.putByteArray("subscriptionProductReplacementParamsList", ((dax) n.c()).b());
            }
            if (arrayList.isEmpty()) {
                ArrayList<String> arrayList2 = new ArrayList<>(i6xVar.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>(i6xVar.size() - 1);
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                ArrayList<String> arrayList6 = new ArrayList<>();
                ArrayList<Integer> arrayList7 = new ArrayList<>();
                str8 = "proxyPackageVersion";
                str9 = "BillingClient";
                int i12 = 0;
                while (i12 < i6xVar.size()) {
                    tz2 tz2Var5 = (tz2) i6xVar.get(i12);
                    tz2 tz2Var6 = tz2Var2;
                    ptm ptmVar4 = tz2Var5.a;
                    if (!ptmVar4.f.isEmpty()) {
                        arrayList4.add(ptmVar4.f);
                    }
                    arrayList5.add(tz2Var5.b);
                    String str17 = ptmVar4.g;
                    ArrayList arrayList8 = ptmVar4.i;
                    if (arrayList8 != null && !arrayList8.isEmpty()) {
                        Iterator it3 = ptmVar4.i.iterator();
                        while (it3.hasNext()) {
                            mtm mtmVar = (mtm) it3.next();
                            String str18 = str17;
                            if (!TextUtils.isEmpty(mtmVar.d)) {
                                str10 = mtmVar.d;
                                break;
                            }
                            str17 = str18;
                        }
                    }
                    str10 = str17;
                    if (!TextUtils.isEmpty(str10)) {
                        arrayList6.add(str10);
                    }
                    if (i12 > 0) {
                        arrayList2.add(((tz2) i6xVar.get(i12)).a.c);
                        arrayList3.add(((tz2) i6xVar.get(i12)).a.d);
                    }
                    i12++;
                    tz2Var2 = tz2Var6;
                }
                tz2Var = tz2Var2;
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList5);
                bundle.putIntegerArrayList("AUTO_PAY_BALANCE_THRESHOLD_LIST", arrayList7);
                if (!arrayList4.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList4);
                }
                if (!arrayList6.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList6);
                }
                if (!arrayList2.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList2);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList3);
                }
            } else {
                ArrayList<String> arrayList9 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it4 = arrayList.iterator();
                if (it4.hasNext()) {
                    throw hrg.j(it4);
                }
                if (!arrayList9.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList9);
                }
                if (arrayList.size() > 1) {
                    ArrayList<String> arrayList10 = new ArrayList<>(arrayList.size() - 1);
                    ArrayList<String> arrayList11 = new ArrayList<>(arrayList.size() - 1);
                    if (1 < arrayList.size()) {
                        arrayList.get(1).getClass();
                        l1j.f();
                        return null;
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList10);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList11);
                }
                str8 = "proxyPackageVersion";
                tz2Var = tz2Var2;
                str9 = "BillingClient";
            }
            qz2Var = this;
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !qz2Var.n) {
                uz2 uz2Var7 = b6x.p;
                qz2Var.y(21, 2, uz2Var7);
                qz2Var.A(uz2Var7);
                return uz2Var7;
            }
            tz2 tz2Var7 = tz2Var;
            if (TextUtils.isEmpty(tz2Var7.a.b.optString("packageName"))) {
                z2 = false;
            } else {
                bundle.putString("skuPackageName", tz2Var7.a.b.optString("packageName"));
                z2 = true;
            }
            str6 = null;
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("accountName", null);
            }
            Intent intent = activity.getIntent();
            if (intent == null) {
                str5 = str9;
                l8x.g(str5, "Activity's intent is null.");
            } else {
                str5 = str9;
                if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                    String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                    bundle.putString("proxyPackage", stringExtra);
                    try {
                        str11 = str8;
                        try {
                            bundle.putString(str11, qz2Var.f.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                        } catch (PackageManager.NameNotFoundException unused) {
                            bundle.putString(str11, "package not found");
                            if (!qz2Var.q) {
                            }
                            if (!qz2Var.o) {
                            }
                            if (qz2Var.m) {
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                        str11 = str8;
                    }
                }
            }
            if (!qz2Var.q && !i6xVar.isEmpty()) {
                i2 = 17;
            } else if (!qz2Var.o && z2) {
                i2 = 15;
            } else if (qz2Var.m) {
                i2 = 6;
            } else {
                i3 = 9;
                final String str19 = str2;
                final String str20 = str3;
                i = i(new Callable(i3, str20, str19, z0jVar, bundle) { // from class: x1x
                    public final /* synthetic */ int b;
                    public final /* synthetic */ String c;
                    public final /* synthetic */ String d;
                    public final /* synthetic */ Bundle e;

                    {
                        this.e = bundle;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Bundle i13;
                        q1x q1xVar;
                        qz2 qz2Var2 = qz2.this;
                        int i14 = this.b;
                        String str21 = this.c;
                        String str22 = this.d;
                        Bundle bundle2 = this.e;
                        try {
                            synchronized (qz2Var2.a) {
                                q1xVar = qz2Var2.h;
                            }
                            if (q1xVar == null) {
                                return l8x.i(b6x.k, 119);
                            }
                            return ((l1x) q1xVar).W0(i14, qz2Var2.f.getPackageName(), str21, str22, bundle2);
                        } catch (DeadObjectException e) {
                            uz2 uz2Var8 = b6x.k;
                            String a3 = v5x.a(e);
                            i13 = l8x.i(uz2Var8, 5);
                            if (a3 != null) {
                                i13.putString("ADDITIONAL_LOG_DETAILS", a3);
                            }
                            return i13;
                        } catch (Exception e2) {
                            uz2 uz2Var9 = b6x.i;
                            String a4 = v5x.a(e2);
                            i13 = l8x.i(uz2Var9, 5);
                            if (a4 != null) {
                                i13.putString("ADDITIONAL_LOG_DETAILS", a4);
                            }
                            return i13;
                        }
                    }
                }, 5000L, null, qz2Var.d, qz2Var.m());
            }
            i3 = i2;
            final String str192 = str2;
            final String str202 = str3;
            i = i(new Callable(i3, str202, str192, z0jVar, bundle) { // from class: x1x
                public final /* synthetic */ int b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ Bundle e;

                {
                    this.e = bundle;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle i13;
                    q1x q1xVar;
                    qz2 qz2Var2 = qz2.this;
                    int i14 = this.b;
                    String str21 = this.c;
                    String str22 = this.d;
                    Bundle bundle2 = this.e;
                    try {
                        synchronized (qz2Var2.a) {
                            q1xVar = qz2Var2.h;
                        }
                        if (q1xVar == null) {
                            return l8x.i(b6x.k, 119);
                        }
                        return ((l1x) q1xVar).W0(i14, qz2Var2.f.getPackageName(), str21, str22, bundle2);
                    } catch (DeadObjectException e) {
                        uz2 uz2Var8 = b6x.k;
                        String a3 = v5x.a(e);
                        i13 = l8x.i(uz2Var8, 5);
                        if (a3 != null) {
                            i13.putString("ADDITIONAL_LOG_DETAILS", a3);
                        }
                        return i13;
                    } catch (Exception e2) {
                        uz2 uz2Var9 = b6x.i;
                        String a4 = v5x.a(e2);
                        i13 = l8x.i(uz2Var9, 5);
                        if (a4 != null) {
                            i13.putString("ADDITIONAL_LOG_DETAILS", a4);
                        }
                        return i13;
                    }
                }
            }, 5000L, null, qz2Var.d, qz2Var.m());
        } else {
            str5 = "BillingClient";
            str6 = str;
            i = i(new tzw(8, qz2Var, str3, str2), 5000L, null, qz2Var.d, qz2Var.m());
        }
        try {
            if (i == null) {
                uz2 uz2Var8 = b6x.d;
                qz2Var.y(25, 2, uz2Var8);
                qz2Var.A(uz2Var8);
                return uz2Var8;
            }
            Bundle bundle2 = (Bundle) i.get(5000L, TimeUnit.MILLISECONDS);
            int a3 = l8x.a(bundle2, str5);
            String e = l8x.e(bundle2, str5);
            if (a3 == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                String str21 = str4;
                intent2.putExtra(str21, (PendingIntent) bundle2.getParcelable(str21));
                activity.startActivity(intent2);
                return b6x.j;
            }
            l8x.g(str5, "Unable to buy item, Error response code: " + a3);
            uz2 a4 = b6x.a(a3, e);
            if (bundle2 != null) {
                try {
                    obj = bundle2.get("LOG_REASON");
                } catch (Throwable th) {
                    l8x.g(str5, "Failed to get log reason from bundle: ".concat(String.valueOf(th.getMessage())));
                }
                if (obj != null) {
                    if (obj instanceof Integer) {
                        Y = u1g.Y(((Integer) obj).intValue());
                        if (Y == 1) {
                            Y = 23;
                        }
                        if (bundle2 != null) {
                            try {
                                string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                            } catch (Throwable th2) {
                                l8x.g(str5, "Failed to get additional log details from bundle: ".concat(String.valueOf(th2.getMessage())));
                            }
                            qz2Var.z(Y, 2, a4, string);
                            qz2Var.A(a4);
                            return a4;
                        }
                        string = str6;
                        qz2Var.z(Y, 2, a4, string);
                        qz2Var.A(a4);
                        return a4;
                    }
                    l8x.g(str5, "Unexpected type for bundle log reason: " + obj.getClass().getName());
                }
            }
            Y = 1;
            if (Y == 1) {
            }
            if (bundle2 != null) {
            }
            string = str6;
            qz2Var.z(Y, 2, a4, string);
            qz2Var.A(a4);
            return a4;
        } catch (CancellationException e2) {
            e = e2;
            l8x.h(str5, "Time out while launching billing flow. Try to reconnect", e);
            uz2 uz2Var9 = b6x.l;
            qz2Var.z(4, 2, uz2Var9, v5x.a(e));
            qz2Var.A(uz2Var9);
            return uz2Var9;
        } catch (TimeoutException e3) {
            e = e3;
            l8x.h(str5, "Time out while launching billing flow. Try to reconnect", e);
            uz2 uz2Var92 = b6x.l;
            qz2Var.z(4, 2, uz2Var92, v5x.a(e));
            qz2Var.A(uz2Var92);
            return uz2Var92;
        } catch (Exception e4) {
            l8x.h(str5, "Exception while launching billing flow. Try to reconnect", e4);
            uz2 uz2Var10 = b6x.k;
            qz2Var.z(5, 2, uz2Var10, v5x.a(e4));
            qz2Var.A(uz2Var10);
            return uz2Var10;
        }
    }

    @Override // defpackage.pz2
    public void f(z6n z6nVar, qtm qtmVar) {
        if (!d()) {
            uz2 uz2Var = b6x.k;
            y(2, 7, uz2Var);
            qtmVar.onProductDetailsResponse(uz2Var, new ArrayList());
        } else {
            if (!this.q) {
                l8x.g("BillingClient", "Querying product details is not supported.");
                uz2 uz2Var2 = b6x.q;
                y(20, 7, uz2Var2);
                qtmVar.onProductDetailsResponse(uz2Var2, new ArrayList());
                return;
            }
            if (i(new tzw(2, this, z6nVar, qtmVar), 30000L, new rxw(this, qtmVar, false, 5), v(), m()) == null) {
                uz2 j = j();
                y(25, 7, j);
                qtmVar.onProductDetailsResponse(j, new ArrayList());
            }
        }
    }

    @Override // defpackage.pz2
    public final void g(ipc ipcVar, m4n m4nVar) {
        String str = ipcVar.b;
        int i = 2;
        if (!d()) {
            uz2 uz2Var = b6x.k;
            y(2, 9, uz2Var);
            e6x e6xVar = i6x.b;
            m4nVar.onQueryPurchasesResponse(uz2Var, p7x.e);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            l8x.g("BillingClient", "Please provide a valid product type.");
            uz2 uz2Var2 = b6x.f;
            y(50, 9, uz2Var2);
            e6x e6xVar2 = i6x.b;
            m4nVar.onQueryPurchasesResponse(uz2Var2, p7x.e);
            return;
        }
        if (i(new tzw(this, str, m4nVar, 3), 30000L, new rxw(this, m4nVar, false, i), v(), m()) == null) {
            uz2 j = j();
            y(25, 9, j);
            e6x e6xVar3 = i6x.b;
            m4nVar.onQueryPurchasesResponse(j, p7x.e);
        }
    }

    @Override // defpackage.pz2
    public void h(rz2 rz2Var) {
        uz2 uz2Var;
        synchronized (this.a) {
            try {
                if (d()) {
                    uz2Var = w();
                } else if (this.b == 1) {
                    l8x.g("BillingClient", "Client is already in the process of connecting to billing service.");
                    uz2Var = b6x.e;
                    y(37, 6, uz2Var);
                } else if (this.b == 3) {
                    l8x.g("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    uz2Var = b6x.k;
                    y(38, 6, uz2Var);
                } else {
                    o(1);
                    p();
                    l8x.f("BillingClient", "Starting in-app billing setup.");
                    this.i = new rlh(1, this, rz2Var);
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> queryIntentServices = this.f.getPackageManager().queryIntentServices(intent, 0);
                    int i = 41;
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        i = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                l8x.g("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.c);
                                synchronized (this.a) {
                                    try {
                                        if (this.b == 2) {
                                            uz2Var = w();
                                        } else if (this.b != 1) {
                                            l8x.g("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            uz2Var = b6x.k;
                                            y(117, 6, uz2Var);
                                        } else {
                                            rlh rlhVar = this.i;
                                            if (this.f.bindService(intent2, rlhVar, 1)) {
                                                l8x.f("BillingClient", "Service was bonded successfully.");
                                                uz2Var = null;
                                            } else {
                                                l8x.g("BillingClient", "Connection to Billing service is blocked.");
                                                i = 39;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            l8x.g("BillingClient", "The device doesn't have valid Play Store.");
                        }
                    }
                    o(0);
                    l8x.f("BillingClient", "Billing service unavailable on device.");
                    uz2Var = b6x.c;
                    y(i, 6, uz2Var);
                }
            } finally {
            }
        }
        if (uz2Var != null) {
            rz2Var.onBillingSetupFinished(uz2Var);
        }
    }

    public final uz2 j() {
        int[] iArr = {0, 3};
        synchronized (this.a) {
            for (int i = 0; i < 2; i++) {
                if (this.b == iArr[i]) {
                    return b6x.k;
                }
            }
            return b6x.i;
        }
    }

    public final void k() {
        if (TextUtils.isEmpty(null)) {
            this.f.getPackageName();
        }
    }

    public final synchronized ExecutorService m() {
        try {
            if (this.x == null) {
                this.x = Executors.newFixedThreadPool(l8x.a, new swi());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.x;
    }

    public final void n(kfx kfxVar) {
        try {
            atn atnVar = this.g;
            int i = this.k;
            atnVar.getClass();
            try {
                rfx rfxVar = (rfx) ((sfx) atnVar.b).g();
                rfxVar.d();
                sfx.n((sfx) rfxVar.b, i);
                atnVar.b = (sfx) rfxVar.c();
                atnVar.X(kfxVar);
            } catch (Throwable th) {
                l8x.h("BillingLogger", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            l8x.h("BillingClient", "Unable to log.", th2);
        }
    }

    public final void o(int i) {
        synchronized (this.a) {
            try {
                if (this.b == 3) {
                    return;
                }
                int i2 = this.b;
                l8x.f("BillingClient", "Setting clientState from " + (i2 != 0 ? i2 != 1 ? i2 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED") + " to " + (i != 0 ? i != 1 ? i != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED"));
                this.b = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p() {
        synchronized (this.a) {
            if (this.i != null) {
                try {
                    this.f.unbindService(this.i);
                } catch (Throwable th) {
                    try {
                        l8x.h("BillingClient", "There was an exception while unbinding service!", th);
                        this.h = null;
                        this.i = null;
                    } finally {
                        this.h = null;
                        this.i = null;
                    }
                }
            }
        }
    }

    public final w2r q(uz2 uz2Var, int i, String str, Exception exc) {
        l8x.h("BillingClient", str, exc);
        z(i, 7, uz2Var, v5x.a(exc));
        return new w2r(uz2Var.a, uz2Var.b, new ArrayList());
    }

    public final rjp r(uz2 uz2Var, int i, String str, Exception exc) {
        l8x.h("BillingClient", str, exc);
        z(i, 11, uz2Var, v5x.a(exc));
        return new rjp(uz2Var, null, false);
    }

    public final apo s(uz2 uz2Var, int i, String str, Exception exc) {
        z(i, 9, uz2Var, v5x.a(exc));
        l8x.h("BillingClient", str, exc);
        return new apo(uz2Var, null, false, 21);
    }

    public final void t(a aVar, uz2 uz2Var, int i, Exception exc) {
        l8x.h("BillingClient", "Error in acknowledge purchase!", exc);
        z(i, 3, uz2Var, v5x.a(exc));
        aVar.a(uz2Var);
    }

    public final void u(a aVar, String str, uz2 uz2Var, int i, String str2, Exception exc) {
        l8x.h("BillingClient", str2, exc);
        z(i, 4, uz2Var, v5x.a(exc));
        aVar.c(uz2Var, str);
    }

    public final Handler v() {
        return Looper.myLooper() == null ? this.d : new Handler(Looper.myLooper());
    }

    public final uz2 w() {
        l8x.f("BillingClient", "Service connection is valid. No need to re-initialize.");
        jfx p = kfx.p();
        p.d();
        kfx.o((kfx) p.b, 6);
        kgx o = lgx.o();
        o.d();
        lgx.n((lgx) o.b);
        p.d();
        kfx.n((kfx) p.b, (lgx) o.c());
        n((kfx) p.c());
        return b6x.j;
    }

    public final void x(a aVar, uz2 uz2Var, int i, Exception exc) {
        l8x.h("BillingClient", "getBillingConfig got an exception.", exc);
        z(i, 13, uz2Var, v5x.a(exc));
        aVar.b(uz2Var, null);
    }

    public final void y(int i, int i2, uz2 uz2Var) {
        try {
            try {
                this.g.W(v5x.b(i, i2, uz2Var), this.k);
            } catch (Throwable th) {
                l8x.h("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            l8x.h("BillingClient", "Unable to log.", th2);
        }
    }

    public final void z(int i, int i2, uz2 uz2Var, String str) {
        try {
            try {
                this.g.W(v5x.c(i, i2, uz2Var, str), this.k);
            } catch (Throwable th) {
                l8x.h("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            l8x.h("BillingClient", "Unable to log.", th2);
        }
    }

    public qz2(gos gosVar, Context context, n4n n4nVar) {
        String l = l();
        this.a = new Object();
        this.b = 0;
        this.d = new Handler(Looper.getMainLooper());
        this.k = 0;
        long nextLong = new Random().nextLong();
        this.z = Long.valueOf(nextLong);
        this.c = l;
        this.f = context.getApplicationContext();
        rfx r = sfx.r();
        r.d();
        sfx.q((sfx) r.b, l);
        String packageName = this.f.getPackageName();
        r.d();
        sfx.p((sfx) r.b, packageName);
        r.d();
        sfx.o((sfx) r.b, nextLong);
        this.g = new atn(this.f, (sfx) r.c());
        if (n4nVar == null) {
            l8x.g("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.e = new evj(this.f, n4nVar, this.g);
        this.v = gosVar;
        this.w = false;
        this.f.getPackageName();
    }
}
