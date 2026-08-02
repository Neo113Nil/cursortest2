package com.anythink.core.common.g;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATOsDmEntity;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.s;
import com.anythink.core.common.d.t;
import com.anythink.core.common.d.u;
import com.anythink.core.common.u.e;
import com.anythink.core.common.v.af;
import com.anythink.core.common.v.k;
import com.anythink.core.common.v.q;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final long f14050a = 86400000;

    /* renamed from: b, reason: collision with root package name */
    public static final long f14051b = 3600000;

    /* renamed from: c, reason: collision with root package name */
    private static final String f14052c = "DomainManager";

    /* renamed from: d, reason: collision with root package name */
    private static final String f14053d = "anythink_sdk";

    /* renamed from: e, reason: collision with root package name */
    private static final String f14054e = "ru";

    /* renamed from: f, reason: collision with root package name */
    private static final String f14055f = "api.";

    /* renamed from: g, reason: collision with root package name */
    private static final String f14056g = k.b(j.g.b.f13263e);

    /* renamed from: s, reason: collision with root package name */
    private static volatile c f14057s;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f14060k;

    /* renamed from: l, reason: collision with root package name */
    private volatile boolean f14061l;

    /* renamed from: m, reason: collision with root package name */
    private volatile long f14062m;

    /* renamed from: p, reason: collision with root package name */
    private volatile String f14065p;

    /* renamed from: q, reason: collision with root package name */
    private ArrayDeque<a> f14066q;

    /* renamed from: r, reason: collision with root package name */
    private ConcurrentHashMap<Long, String> f14067r;

    /* renamed from: h, reason: collision with root package name */
    private final Object f14058h = new Object();
    private final Object i = new Object();

    /* renamed from: j, reason: collision with root package name */
    private final List<String> f14059j = Collections.synchronizedList(new ArrayList());

    /* renamed from: n, reason: collision with root package name */
    private volatile String f14063n = "";

    /* renamed from: o, reason: collision with root package name */
    private volatile String f14064o = "";

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private d f14086a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f14087b;

        public a(d dVar, boolean z6) {
            this.f14086a = dVar;
            this.f14087b = z6;
        }

        public final d a() {
            return this.f14086a;
        }

        public final boolean b() {
            return this.f14087b;
        }
    }

    /* renamed from: com.anythink.core.common.g.c$c, reason: collision with other inner class name */
    public interface InterfaceC0079c {
        void a(int i, Object obj, long j6);

        void a(int i, String str, AdError adError, long j6);

        void a(String str);

        void b(String str);
    }

    private c() {
        String[] strArr;
        this.f14065p = "";
        if (ATSDK.isCnSDK() || (strArr = com.anythink.core.common.g.b.f14049a) == null || strArr.length <= 0) {
            return;
        }
        List asList = Arrays.asList(strArr);
        String country = Locale.getDefault().getCountry();
        if (asList.contains(country)) {
            this.f14065p = country;
        }
    }

    private static boolean c(String str, String str2) {
        com.anythink.core.d.b k9 = com.IceFishing.LiveIceFishing.k.k(com.IceFishing.LiveIceFishing.k.l());
        return ((k9 != null && !TextUtils.isEmpty(k9.aH())) || TextUtils.isEmpty(str) || str.equals(str2)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(String str) {
        Thread.currentThread().getId();
    }

    private static boolean g() {
        com.anythink.core.d.b k9 = com.IceFishing.LiveIceFishing.k.k(com.IceFishing.LiveIceFishing.k.l());
        return (k9 == null || TextUtils.isEmpty(k9.aH())) && q.a(t.b().g());
    }

    private static void h() {
        com.anythink.core.d.d.a(t.b().g()).c();
    }

    private static void i() {
    }

    private a j() {
        a removeFirst;
        ArrayDeque<a> arrayDeque = this.f14066q;
        if (arrayDeque == null || arrayDeque.isEmpty()) {
            return null;
        }
        synchronized (this.i) {
            removeFirst = this.f14066q.removeFirst();
        }
        e("getDomainRequest() >>> called");
        return removeFirst;
    }

    private synchronized ConcurrentHashMap<Long, String> k() {
        try {
            if (this.f14067r == null) {
                this.f14067r = new ConcurrentHashMap<>(1);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f14067r;
    }

    private static long l() {
        if (c()) {
            return f14051b;
        }
        return 86400000L;
    }

    private void m() {
        try {
            a j6 = j();
            if (j6 != null) {
                d a9 = j6.a();
                boolean b9 = j6.b();
                e("requestDomainNext() >>> next domainRequest: " + a9 + " awaitResponse: " + b9);
                if (a9 != null) {
                    a(a9, b9);
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public final void a(final String str, final int i, final String str2, final d dVar) {
        String str3;
        com.anythink.core.d.b k9 = com.IceFishing.LiveIceFishing.k.k(com.IceFishing.LiveIceFishing.k.l());
        if ((k9 != null && !TextUtils.isEmpty(k9.aH())) || !q.a(t.b().g())) {
            e("tryGetDomainFromCdn() >>> not allow switch domain.");
            return;
        }
        try {
            str3 = new URL(str).getHost();
        } catch (Exception e9) {
            e("tryGetDomainFromCdn() >>> failed: " + e9.getMessage());
            str3 = "";
        }
        final String str4 = str3;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final List<String> list = this.f14059j;
        e("tryGetDomainFromCdn() >>> start isTrying: " + this.f14061l + " url: " + str + " failedDomain: " + str4);
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        a(new InterfaceC0079c() { // from class: com.anythink.core.common.g.c.1
            @Override // com.anythink.core.common.g.c.InterfaceC0079c
            public final void a(String str5) {
                c.e("tryGetDomainFromCdn() >>> onCallback::domain = ".concat(String.valueOf(str5)));
                c.this.a(list, "", str4, str, i, str2, dVar, atomicBoolean);
            }

            @Override // com.anythink.core.common.g.c.InterfaceC0079c
            public final void b(String str5) {
                c.e("tryGetDomainFromCdn() >>> onCallbackCached::cacheDomain = ".concat(String.valueOf(str5)));
                c.this.a(list, str5, str4, str, i, str2, dVar, atomicBoolean);
            }

            @Override // com.anythink.core.common.g.c.InterfaceC0079c
            public final void a(int i4, String str5, AdError adError, long j6) {
                c.e("tryGetDomainFromCdn() >>> onCallbackFailed::msg = ".concat(String.valueOf(str5)));
                c.this.a(list, "", str4, str, i, str2, dVar, atomicBoolean);
            }

            @Override // com.anythink.core.common.g.c.InterfaceC0079c
            public final void a(int i4, Object obj, long j6) {
                c.e("tryGetDomainFromCdn() >>> onCallbackSucceed::result = ".concat(String.valueOf(obj)));
                if ((obj instanceof String) && !TextUtils.isEmpty(obj.toString())) {
                    Context g9 = t.b().g();
                    String obj2 = obj.toString();
                    c.a(c.this, list, obj2, g9);
                    c.this.a(list, obj2, str4, str, i, str2, dVar, atomicBoolean);
                    return;
                }
                c.this.a(list, "", str4, str, i, str2, dVar, atomicBoolean);
            }
        }, true);
    }

    private String d(String str) {
        ATOsDmEntity osDmEntity;
        if (TextUtils.isEmpty(str)) {
            return this.f14063n;
        }
        s c9 = t.b().c();
        if (c9 == null || c9.getOsDmEntity() == null) {
            return "";
        }
        osDmEntity = c9.getOsDmEntity();
        str.getClass();
        switch (str) {
            case "smart_wf":
                return osDmEntity.getSmartWFDm();
            case "bid":
                return osDmEntity.getBidDm();
            case "agent":
                return osDmEntity.getDaDm();
            case "tracking":
                return osDmEntity.getTkDm();
            default:
                return "";
        }
    }

    public static /* synthetic */ long e() {
        if (c()) {
            return f14051b;
        }
        return 86400000L;
    }

    private static String f() {
        t.b();
        return u.a.f13605G;
    }

    public static class b implements InterfaceC0079c, d {

        /* renamed from: a, reason: collision with root package name */
        private boolean f14088a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC0079c f14089b;

        public b(InterfaceC0079c interfaceC0079c) {
            this.f14089b = interfaceC0079c;
        }

        @Override // com.anythink.core.common.g.c.InterfaceC0079c
        public final void a(String str) {
            InterfaceC0079c interfaceC0079c;
            if (this.f14088a || (interfaceC0079c = this.f14089b) == null) {
                return;
            }
            this.f14088a = true;
            interfaceC0079c.a(str);
        }

        @Override // com.anythink.core.common.g.c.InterfaceC0079c
        public final void b(String str) {
            InterfaceC0079c interfaceC0079c = this.f14089b;
            if (interfaceC0079c != null) {
                interfaceC0079c.b(str);
            }
            a(str);
        }

        @Override // com.anythink.core.common.g.c.InterfaceC0079c
        public final void a(int i, String str, AdError adError, long j6) {
            InterfaceC0079c interfaceC0079c = this.f14089b;
            if (interfaceC0079c != null) {
                interfaceC0079c.a(i, str, adError, j6);
            }
            a("");
        }

        @Override // com.anythink.core.common.g.c.InterfaceC0079c
        public final void a(int i, Object obj, long j6) {
            InterfaceC0079c interfaceC0079c = this.f14089b;
            if (interfaceC0079c != null) {
                interfaceC0079c.a(i, obj, j6);
            }
            a(obj != null ? obj.toString() : "");
        }
    }

    public static /* synthetic */ void e(c cVar) {
        try {
            a j6 = cVar.j();
            if (j6 != null) {
                d a9 = j6.a();
                boolean b9 = j6.b();
                e("requestDomainNext() >>> next domainRequest: " + a9 + " awaitResponse: " + b9);
                if (a9 != null) {
                    cVar.a(a9, b9);
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public final String b() {
        return this.f14063n;
    }

    public static String b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        try {
            String host = new URL(str).getHost();
            if (str2.equals(host)) {
                return str;
            }
            e("replaceUrlDomainWithTarget() >>> start replace url, targetDomain: " + str2 + " url: " + str);
            return str.replace(host, str2);
        } catch (Throwable unused) {
            return str;
        }
    }

    private static void b(List<String> list, String str) {
        if (TextUtils.isEmpty(str) || list == null) {
            return;
        }
        try {
            int indexOf = list.indexOf(str);
            if (indexOf >= 0 && indexOf < list.size() - 1) {
                list.remove(str);
                list.add(str);
            } else if (indexOf < 0) {
                list.add(str);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        this.f14063n = str;
        Context g9 = t.b().g();
        t.b();
        af.b(g9, "anythink_sdk", u.a.f13605G, str);
        e("setCurrentDomain() >>> currentDomain = ".concat(String.valueOf(str)));
    }

    public static String d() {
        return f14056g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Long b(Context context) {
        long j6 = this.f14062m;
        if (j6 == 0) {
            j6 = af.b(context, "anythink_sdk", u.a.f13604F, 0L);
        }
        return Long.valueOf(j6);
    }

    public static boolean c() {
        String str;
        try {
            str = Locale.getDefault().getLanguage();
        } catch (Exception unused) {
            str = "";
        }
        return str.equalsIgnoreCase("ru");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(d dVar, boolean z6) {
        if (dVar == null) {
            return;
        }
        synchronized (this.i) {
            try {
                if (this.f14066q == null) {
                    this.f14066q = new ArrayDeque<>();
                }
                this.f14066q.addLast(new a(dVar, z6));
            } catch (Throwable th) {
                throw th;
            }
        }
        e("addDomainRequest() >>> called");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(Context context) {
        String str = this.f14062m > 0 ? k().get(Long.valueOf(this.f14062m)) : "";
        return TextUtils.isEmpty(str) ? af.c(context, "anythink_sdk", u.a.f13606H, "") : str;
    }

    public static c a() {
        if (f14057s == null) {
            synchronized (c.class) {
                f14057s = new c();
            }
        }
        return f14057s;
    }

    public final void a(Context context) {
        if (ATSDK.isCnSDK()) {
            return;
        }
        if (context instanceof Activity) {
            context = context.getApplicationContext();
        }
        if (this.f14060k) {
            return;
        }
        this.f14060k = true;
        List<String> list = this.f14059j;
        if (!c()) {
            list.add(j.g.a.f13254a);
        }
        list.add(f14056g);
        t.b();
        String c9 = af.c(context, "anythink_sdk", u.a.f13605G, "");
        if (!TextUtils.isEmpty(c9)) {
            a(list, c9);
        }
        s c10 = t.b().c();
        if (c10 != null && c10.getOsDmEntity() != null) {
            ATOsDmEntity osDmEntity = c10.getOsDmEntity();
            String mainDm = osDmEntity.getMainDm();
            if (!TextUtils.isEmpty(mainDm)) {
                list.clear();
                list.add(mainDm);
                String ruBpDm = osDmEntity.getRuBpDm();
                if (!TextUtils.isEmpty(ruBpDm)) {
                    list.add(ruBpDm);
                }
            }
        }
        e("initDomain() >>> curUseDomain = ".concat(String.valueOf(c9)));
        if (list.isEmpty()) {
            return;
        }
        this.f14064o = list.get(0);
        if (TextUtils.isEmpty(this.f14064o)) {
            return;
        }
        c(this.f14064o);
    }

    private static void a(List<String> list) {
        s c9 = t.b().c();
        if (c9 == null || c9.getOsDmEntity() == null) {
            return;
        }
        ATOsDmEntity osDmEntity = c9.getOsDmEntity();
        String mainDm = osDmEntity.getMainDm();
        if (TextUtils.isEmpty(mainDm)) {
            return;
        }
        list.clear();
        list.add(mainDm);
        String ruBpDm = osDmEntity.getRuBpDm();
        if (TextUtils.isEmpty(ruBpDm)) {
            return;
        }
        list.add(ruBpDm);
    }

    public final String a(String str) {
        return a(str, "");
    }

    public final String a(String str, String str2) {
        return ATSDK.isCnSDK() ? str : b(str, d(str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(List<String> list, String str, String str2, String str3, int i, String str4, d dVar, AtomicBoolean atomicBoolean) {
        try {
            if (atomicBoolean.get()) {
                e("handleSwitchDomain() >>> have switch domain.");
                return;
            }
            atomicBoolean.set(true);
            String a9 = a(list, str, str2);
            e("handleSwitchDomain() >>> targetDomain: " + a9 + " currentDomain: " + this.f14063n);
            if (!TextUtils.isEmpty(a9) && str2.equals(this.f14063n)) {
                c(a9);
                com.anythink.core.d.d.a(t.b().g()).c();
                e.a(this.f14064o, a9, str3, String.valueOf(b(t.b().g())), String.valueOf(i), str4, str2);
                a(dVar, a9, str2);
                return;
            }
            a(dVar, this.f14063n, str2);
        } catch (Throwable unused) {
        }
    }

    private void a(String str, String str2, String str3, int i, String str4) {
        c(str);
        com.anythink.core.d.d.a(t.b().g()).c();
        e.a(this.f14064o, str, str3, String.valueOf(b(t.b().g())), String.valueOf(i), str4, str2);
    }

    private static void a(d dVar, String str, String str2) {
        if (dVar != null && c(str, str2)) {
            dVar.a(str);
        }
    }

    private String a(List<String> list, String str, String str2) {
        String str3 = "";
        if (list == null) {
            return "";
        }
        try {
            a(list, str);
            Iterator<String> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (!TextUtils.isEmpty(next) && !next.equals(str2)) {
                    str3 = next;
                    break;
                }
            }
            a(list, str3);
            String c9 = c(t.b().g());
            if (c() && !TextUtils.isEmpty(c9) && !c9.equals(str2)) {
                list.remove(str2);
            } else if (!TextUtils.isEmpty(str2)) {
                try {
                    int indexOf = list.indexOf(str2);
                    if (indexOf >= 0 && indexOf < list.size() - 1) {
                        list.remove(str2);
                        list.add(str2);
                    } else if (indexOf < 0) {
                        list.add(str2);
                    }
                } catch (Throwable unused) {
                }
            }
            e("getNextDomain() >>> nextDomain = " + str3 + " failedDomain = " + str2);
        } catch (Throwable unused2) {
        }
        return str3;
    }

    private static void a(List<String> list, String str) {
        if (TextUtils.isEmpty(str) || list == null) {
            return;
        }
        try {
            int indexOf = list.indexOf(str);
            if (indexOf > 0) {
                list.remove(str);
                list.add(0, str);
            } else if (indexOf < 0) {
                list.add(0, str);
            }
        } catch (Throwable unused) {
        }
    }

    private void a(String str, String str2, int i, String str3, String str4) {
        e.a(this.f14064o, str, str2, String.valueOf(b(t.b().g())), String.valueOf(i), str3, str4);
    }

    private void a(List<String> list, String str, Context context) {
        if (list == null) {
            return;
        }
        try {
            list.remove(f14056g);
            String c9 = c(context);
            if (!TextUtils.isEmpty(c9) && !c9.equals(str)) {
                list.remove(c9);
            }
            a(list, str);
            e("replaceCdnDomainInList() >>>> cdnDomain: " + str + " lastCdnDomain: " + c9);
        } catch (Throwable unused) {
        }
    }

    private void a(boolean z6, String str, long j6, int i) {
        e.a(this.f14064o, this.f14063n, "", String.valueOf(this.f14062m), "", "", "", "1", z6 ? "1" : "0", str, String.valueOf(j6), i);
    }

    private void a(Context context, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f14062m = currentTimeMillis;
        af.a(context, "anythink_sdk", u.a.f13604F, currentTimeMillis);
        k().put(Long.valueOf(currentTimeMillis), str);
        af.b(context, "anythink_sdk", u.a.f13606H, str);
    }

    public final void a(d dVar) {
        a(dVar, true);
    }

    public final void a(final d dVar, boolean z6) {
        final boolean z9 = c() && z6;
        a(new InterfaceC0079c() { // from class: com.anythink.core.common.g.c.2
            @Override // com.anythink.core.common.g.c.InterfaceC0079c
            public final void a(int i, String str, AdError adError, long j6) {
            }

            @Override // com.anythink.core.common.g.c.InterfaceC0079c
            public final void b(String str) {
            }

            @Override // com.anythink.core.common.g.c.InterfaceC0079c
            public final void a(String str) {
                d dVar2 = dVar;
                if (dVar2 != null) {
                    dVar2.a(str);
                }
            }

            @Override // com.anythink.core.common.g.c.InterfaceC0079c
            public final void a(int i, Object obj, long j6) {
                if (!(obj instanceof String) || TextUtils.isEmpty(obj.toString())) {
                    return;
                }
                Context g9 = t.b().g();
                String obj2 = obj.toString();
                c cVar = c.this;
                c.a(cVar, cVar.f14059j, obj2, g9);
                if (z9) {
                    c.this.c(obj2);
                }
            }
        }, z9);
    }

    private void a(InterfaceC0079c interfaceC0079c, final boolean z6) {
        String str = this.f14063n;
        final Context g9 = t.b().g();
        if (g9 != null && !ATSDK.isCnSDK() && q.a(g9)) {
            final b bVar = new b(interfaceC0079c);
            if (!z6) {
                bVar.a(str);
            }
            if (this.f14061l) {
                b(bVar, z6);
                return;
            } else {
                com.anythink.core.common.v.b.b.a().c(new Runnable() { // from class: com.anythink.core.common.g.c.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        synchronized (c.this.f14058h) {
                            try {
                                if (c.this.f14061l) {
                                    c.this.b(bVar, z6);
                                    return;
                                }
                                c.this.f14061l = true;
                                c cVar = c.this;
                                cVar.f14062m = cVar.b(g9).longValue();
                                final long currentTimeMillis = System.currentTimeMillis();
                                long j6 = currentTimeMillis - c.this.f14062m;
                                long e9 = c.e();
                                if (c.this.f14062m > 0 && j6 < e9) {
                                    String c9 = c.this.c(g9);
                                    c.e("requestDomain() >>> cache valid. cdnDomain: ".concat(String.valueOf(c9)));
                                    if (!TextUtils.isEmpty(c9)) {
                                        c.this.f14061l = false;
                                        bVar.b(c9);
                                        c.e(c.this);
                                        return;
                                    }
                                }
                                c.e("requestDomain() >>> cache was expired. start request. currentDomain: " + c.this.f14063n);
                                com.anythink.core.d.a aVar = new com.anythink.core.d.a(com.anythink.core.d.d.a());
                                final int a9 = aVar.a();
                                aVar.a(new com.anythink.core.common.m.b() { // from class: com.anythink.core.common.g.c.3.1
                                    @Override // com.anythink.core.common.m.q
                                    public final void onLoadError(int i, String str2, AdError adError) {
                                        c.this.f14061l = false;
                                        c.a(c.this, false, str2, System.currentTimeMillis() - currentTimeMillis, a9);
                                        bVar.a(-1, str2, null, currentTimeMillis);
                                        c.e(c.this);
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
                                    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
                                    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
                                    @Override // com.anythink.core.common.m.q
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final void onLoadFinish(int i, Object obj) {
                                        String str2;
                                        String str3;
                                        String str4;
                                        c.this.f14061l = false;
                                        try {
                                        } catch (Throwable th) {
                                            str2 = "parse cdn domain error: " + th.getMessage();
                                        }
                                        if (!(obj instanceof String) || TextUtils.isEmpty(obj.toString())) {
                                            str2 = "";
                                        } else {
                                            JSONObject jSONObject = new JSONObject(obj.toString());
                                            int optInt = jSONObject.optInt("code", 0);
                                            if (optInt == 0) {
                                                str4 = "";
                                                str3 = jSONObject.optString("data");
                                                if (!TextUtils.isEmpty(str3)) {
                                                    AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                                    c.a(c.this, g9, str3);
                                                }
                                                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                                                String unused = c.this.f14063n;
                                                if (TextUtils.isEmpty(str4)) {
                                                    c.a(c.this, false, str4, currentTimeMillis2, a9);
                                                    bVar.a(0, str4, null, currentTimeMillis);
                                                } else {
                                                    c.a(c.this, true, str3, currentTimeMillis2, a9);
                                                    bVar.a(0, str3, currentTimeMillis);
                                                }
                                                c.e(c.this);
                                            }
                                            str2 = "request failed. error code: ".concat(String.valueOf(optInt));
                                        }
                                        str3 = "";
                                        str4 = str2;
                                        if (!TextUtils.isEmpty(str3)) {
                                        }
                                        long currentTimeMillis22 = System.currentTimeMillis() - currentTimeMillis;
                                        String unused2 = c.this.f14063n;
                                        if (TextUtils.isEmpty(str4)) {
                                        }
                                        c.e(c.this);
                                    }
                                });
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }, 13);
                return;
            }
        }
        interfaceC0079c.a(str);
    }

    public static /* synthetic */ void a(c cVar, List list, String str, Context context) {
        if (list != null) {
            try {
                list.remove(f14056g);
                String c9 = cVar.c(context);
                if (!TextUtils.isEmpty(c9) && !c9.equals(str)) {
                    list.remove(c9);
                }
                a((List<String>) list, str);
                e("replaceCdnDomainInList() >>>> cdnDomain: " + str + " lastCdnDomain: " + c9);
            } catch (Throwable unused) {
            }
        }
    }

    public static /* synthetic */ void a(c cVar, Context context, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        cVar.f14062m = currentTimeMillis;
        af.a(context, "anythink_sdk", u.a.f13604F, currentTimeMillis);
        cVar.k().put(Long.valueOf(currentTimeMillis), str);
        af.b(context, "anythink_sdk", u.a.f13606H, str);
    }

    public static /* synthetic */ void a(c cVar, boolean z6, String str, long j6, int i) {
        e.a(cVar.f14064o, cVar.f14063n, "", String.valueOf(cVar.f14062m), "", "", "", "1", z6 ? "1" : "0", str, String.valueOf(j6), i);
    }
}
