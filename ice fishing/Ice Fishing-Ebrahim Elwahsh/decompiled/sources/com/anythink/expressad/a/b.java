package com.anythink.expressad.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.anythink.basead.d.g;
import com.anythink.basead.f.c.c;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.bl;
import com.anythink.core.common.h.r;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.d.e;
import com.anythink.expressad.foundation.h.l;
import com.anythink.expressad.out.TemplateBannerView;
import com.anythink.expressad.out.h;
import com.anythink.expressad.out.i;
import com.anythink.expressad.out.p;
import com.anythink.expressad.videocommon.b.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class b extends com.anythink.basead.f.c.b {

    /* renamed from: c, reason: collision with root package name */
    private static volatile b f17840c;

    /* renamed from: b, reason: collision with root package name */
    private final String f17842b = getClass().getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    ConcurrentHashMap<String, c> f17841a = new ConcurrentHashMap<>(2);

    /* renamed from: com.anythink.expressad.a.b$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f17843a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f17844b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f17845c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.anythink.basead.f.c.e f17846d;

        public AnonymousClass1(r rVar, x xVar, e eVar, com.anythink.basead.f.c.e eVar2) {
            this.f17843a = rVar;
            this.f17844b = xVar;
            this.f17845c = eVar;
            this.f17846d = eVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.expressad.splash.d.c cVar = new com.anythink.expressad.splash.d.c(t.b().g(), "", TextUtils.isEmpty(this.f17843a.aC()) ? this.f17844b.f14314c : this.f17843a.aC());
            cVar.b(this.f17844b.f14325o.B() == 0);
            int x3 = ((int) this.f17844b.f14325o.x()) / 1000;
            if (x3 <= 2) {
                cVar.b(2);
            } else if (x3 >= 10) {
                cVar.b(10);
            } else {
                cVar.b(x3);
            }
            cVar.c(this.f17844b.f14325o.bJ());
            cVar.a(this.f17844b.f14325o.J() == 0);
            cVar.a(this.f17844b.f14325o.C());
            cVar.f();
            ArrayList<d> arrayList = this.f17845c.f18838K;
            if (arrayList != null && arrayList.size() > 0) {
                for (d dVar : arrayList) {
                    if (dVar != null) {
                        String b9 = dVar.b();
                        if (!TextUtils.isEmpty(b9)) {
                            boolean z8 = this.f17844b.f14325o.J() == 0;
                            boolean a9 = com.anythink.basead.b.e.a(this.f17844b);
                            b9 = b.b(b.c(b9, z8), a9, this.f17844b.f14325o.X(), this.f17844b.f14325o.Y());
                            if (!a9 && !z8) {
                                b9 = b.d(b9, true);
                            } else if (a9) {
                                b9 = b.d(b9, false);
                            }
                        }
                        dVar.a(b9);
                    }
                }
            }
            cVar.a(new com.anythink.expressad.out.d() { // from class: com.anythink.expressad.a.b.1.1
                @Override // com.anythink.expressad.out.d
                public final void a() {
                    com.anythink.expressad.splash.d.c cVar2 = (com.anythink.expressad.splash.d.c) b.this.f17841a.remove(AnonymousClass1.this.f17844b.f14313b + AnonymousClass1.this.f17844b.f14312a);
                    if (cVar2 != null) {
                        com.anythink.basead.f.c.e eVar = AnonymousClass1.this.f17846d;
                        if (eVar != null) {
                            eVar.b(cVar2);
                            return;
                        }
                        return;
                    }
                    if (AnonymousClass1.this.f17846d != null) {
                        AnonymousClass1.this.f17846d.a(g.a(g.f6338m, "Resource download fail."));
                    }
                }

                @Override // com.anythink.expressad.out.d
                public final void b() {
                }

                @Override // com.anythink.expressad.out.d
                public final void a(String str) {
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    b.a(b.this, str, anonymousClass1.f17844b, anonymousClass1.f17846d);
                }
            });
            com.anythink.basead.f.c.e eVar = this.f17846d;
            if (eVar != null) {
                eVar.a(cVar);
            }
            b.this.f17841a.put(this.f17844b.f14313b + this.f17844b.f14312a, cVar);
            cVar.a(this.f17845c);
        }
    }

    /* renamed from: com.anythink.expressad.a.b$2, reason: invalid class name */
    public class AnonymousClass2 implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f17849a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.anythink.basead.f.c.e f17850b;

        public AnonymousClass2(x xVar, com.anythink.basead.f.c.e eVar) {
            this.f17849a = xVar;
            this.f17850b = eVar;
        }

        @Override // com.anythink.expressad.out.h
        public final void a(d dVar) {
        }

        @Override // com.anythink.expressad.out.h
        public final void b() {
        }

        @Override // com.anythink.expressad.out.h
        public final void c() {
        }

        @Override // com.anythink.expressad.out.h
        public final void d() {
        }

        @Override // com.anythink.expressad.out.h
        public final void e() {
        }

        @Override // com.anythink.expressad.out.h
        public final void f() {
        }

        @Override // com.anythink.expressad.out.h
        public final void a(String str) {
            b.a(b.this, str, this.f17849a, this.f17850b);
        }

        @Override // com.anythink.expressad.out.h
        public final void a() {
            TemplateBannerView templateBannerView = (TemplateBannerView) b.this.f17841a.remove(this.f17849a.f14313b + this.f17849a.f14312a);
            if (templateBannerView != null) {
                com.anythink.basead.f.c.e eVar = this.f17850b;
                if (eVar != null) {
                    eVar.b(templateBannerView);
                    return;
                }
                return;
            }
            if (this.f17850b != null) {
                this.f17850b.a(g.a(g.f6338m, "Resource download fail."));
            }
        }
    }

    /* renamed from: com.anythink.expressad.a.b$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f17855a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f17856b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.anythink.basead.f.c.e f17857c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f17858d;

        public AnonymousClass4(r rVar, x xVar, com.anythink.basead.f.c.e eVar, e eVar2) {
            this.f17855a = rVar;
            this.f17856b = xVar;
            this.f17857c = eVar;
            this.f17858d = eVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.expressad.advanced.d.c cVar = new com.anythink.expressad.advanced.d.c("", TextUtils.isEmpty(this.f17855a.aC()) ? this.f17856b.f14314c : this.f17855a.aC(), t.b().g());
            cVar.a(new p() { // from class: com.anythink.expressad.a.b.4.1
                @Override // com.anythink.expressad.out.p
                public final void a(d dVar) {
                }

                @Override // com.anythink.expressad.out.p
                public final void b() {
                }

                @Override // com.anythink.expressad.out.p
                public final void c() {
                }

                @Override // com.anythink.expressad.out.p
                public final void d() {
                }

                @Override // com.anythink.expressad.out.p
                public final void e() {
                }

                @Override // com.anythink.expressad.out.p
                public final void f() {
                }

                @Override // com.anythink.expressad.out.p
                public final void a(String str) {
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    b.a(b.this, str, anonymousClass4.f17856b, anonymousClass4.f17857c);
                }

                @Override // com.anythink.expressad.out.p
                public final void a() {
                    com.anythink.expressad.advanced.d.c cVar2 = (com.anythink.expressad.advanced.d.c) b.this.f17841a.remove(AnonymousClass4.this.f17856b.f14313b + AnonymousClass4.this.f17856b.f14312a);
                    if (cVar2 != null) {
                        com.anythink.basead.f.c.e eVar = AnonymousClass4.this.f17857c;
                        if (eVar != null) {
                            eVar.b(cVar2);
                            return;
                        }
                        return;
                    }
                    if (AnonymousClass4.this.f17857c != null) {
                        AnonymousClass4.this.f17857c.a(g.a(g.f6339n, g.f6315N));
                    }
                }
            });
            com.anythink.basead.f.c.e eVar = this.f17857c;
            if (eVar != null) {
                eVar.a(cVar);
            }
            b.this.f17841a.put(this.f17856b.f14313b + this.f17856b.f14312a, cVar);
            cVar.a(this.f17858d);
        }
    }

    private b() {
    }

    private void c(r rVar, final x xVar, e eVar, final com.anythink.basead.f.c.e eVar2) {
        com.anythink.expressad.reward.b.a aVar = new com.anythink.expressad.reward.b.a();
        String aC = TextUtils.isEmpty(rVar.aC()) ? xVar.f14314c : rVar.aC();
        int i = xVar.f14320j;
        int i4 = xVar.f14321k;
        if (i4 >= 0) {
            i = i4;
        }
        if (i == 1) {
            com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), aC, false);
            aVar.a(false);
        } else if (i == 3) {
            com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), aC, true);
            aVar.a(true);
        }
        aVar.a(xVar.f14325o.K() == 0 ? 1 : 2);
        aVar.a("", aC);
        com.anythink.expressad.videocommon.e.d a9 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), aC, false);
        if (xVar.f14325o.L() >= 0) {
            a9.a(xVar.f14325o.L());
        }
        if (i == 1) {
            a9.l();
        }
        ArrayList<d> arrayList = eVar.f18838K;
        if (arrayList != null && arrayList.size() > 0) {
            for (d dVar : arrayList) {
                if (dVar != null) {
                    boolean a10 = com.anythink.basead.b.e.a(xVar);
                    boolean z8 = xVar.f14325o.J() == 0;
                    String J = dVar.J();
                    if (!TextUtils.isEmpty(J)) {
                        dVar.k(b(c(J, z8), a10, xVar.f14325o.X(), xVar.f14325o.Y()));
                    }
                    String Q3 = dVar.Q();
                    if (!TextUtils.isEmpty(Q3)) {
                        dVar.n(b(c(Q3, z8), a10, xVar.f14325o.X(), xVar.f14325o.Y()));
                    }
                    d.c N8 = dVar.N();
                    boolean z9 = xVar.f14325o.G() == 1;
                    if (N8 != null) {
                        String e6 = N8.e();
                        if (!TextUtils.isEmpty(e6)) {
                            N8.a(c(e6, z9));
                        }
                    }
                }
            }
        }
        aVar.a(new com.anythink.expressad.videocommon.d.a() { // from class: com.anythink.expressad.a.b.3
            @Override // com.anythink.expressad.videocommon.d.a
            public final void a() {
            }

            @Override // com.anythink.expressad.videocommon.d.a
            public final void b(String str) {
            }

            @Override // com.anythink.expressad.videocommon.d.a
            public final void c() {
            }

            @Override // com.anythink.expressad.videocommon.d.a
            public final void d() {
            }

            @Override // com.anythink.expressad.videocommon.d.a
            public final void e() {
            }

            @Override // com.anythink.expressad.videocommon.d.a
            public final void f() {
            }

            @Override // com.anythink.expressad.videocommon.d.a
            public final void a(d dVar2) {
            }

            @Override // com.anythink.expressad.videocommon.d.a
            public final void b() {
                com.anythink.expressad.reward.b.a aVar2 = (com.anythink.expressad.reward.b.a) b.this.f17841a.remove(xVar.f14313b + xVar.f14312a);
                if (aVar2 == null || !aVar2.isReady()) {
                    if (eVar2 != null) {
                        eVar2.a(g.a(g.f6338m, "Resource download fail."));
                        return;
                    }
                    return;
                }
                com.anythink.basead.f.c.e eVar3 = eVar2;
                if (eVar3 != null) {
                    eVar3.b(aVar2);
                }
            }

            @Override // com.anythink.expressad.videocommon.d.a
            public final void a(boolean z10, String str, float f6) {
            }

            @Override // com.anythink.expressad.videocommon.d.a
            public final void a(String str) {
                b.a(b.this, str, xVar, eVar2);
            }
        });
        if (eVar2 != null) {
            eVar2.a(aVar);
        }
        this.f17841a.put(xVar.f14313b + xVar.f14312a, aVar);
        aVar.a(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, boolean z8) {
        HashMap hashMap = new HashMap();
        if (z8) {
            hashMap.put("hdbtn", "0");
        } else {
            hashMap.put("hdbtn", "1");
        }
        try {
            return l.a(str, hashMap);
        } catch (Throwable unused) {
            return str;
        }
    }

    private synchronized e b(r rVar, x xVar) {
        y yVar;
        try {
            if (TextUtils.isEmpty(rVar.d())) {
                return null;
            }
            e a9 = e.a(rVar.d());
            ArrayList<d> arrayList = a9.f18838K;
            a(rVar, arrayList.get(0));
            if (arrayList.size() > 0) {
                Iterator<d> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().u(rVar.C());
                }
            }
            int i = xVar.f14320j;
            int i4 = xVar.f14321k;
            if (i4 >= 0) {
                i = i4;
            }
            d dVar = arrayList.get(0);
            if ((i == 1 || i == 3) && dVar != null) {
                dVar.c(xVar.f14325o.L());
            }
            if (dVar != null && (yVar = xVar.f14325o) != null) {
                dVar.q(yVar.bq());
            }
            return a9;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static b a() {
        if (f17840c == null) {
            synchronized (b.class) {
                try {
                    if (f17840c == null) {
                        f17840c = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17840c;
    }

    private void d(r rVar, x xVar, e eVar, com.anythink.basead.f.c.e eVar2) {
        t.b().b(new AnonymousClass4(rVar, xVar, eVar2, eVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.anythink.basead.f.c.b
    public final void a(r rVar, x xVar, com.anythink.basead.f.c.e eVar) {
        boolean z8;
        int i = 2;
        e b9 = b(rVar, xVar);
        a(rVar);
        int i4 = xVar.f14320j;
        int i9 = xVar.f14321k;
        if (i9 >= 0) {
            i4 = i9;
        }
        if (String.valueOf(i4).equals("0")) {
            t.b().b(new AnonymousClass4(rVar, xVar, eVar, b9));
            return;
        }
        if (String.valueOf(i4).equals("2")) {
            y yVar = xVar.f14325o;
            int a9 = q.a(t.b().g(), 50.0f);
            if (yVar.l() > 0) {
                a9 = yVar.l();
                i = 5;
            } else {
                String D8 = yVar.D();
                D8.getClass();
                switch (D8.hashCode()) {
                    case -559799608:
                        if (D8.equals(y.f14336c)) {
                            z8 = false;
                            break;
                        }
                        z8 = -1;
                        break;
                    case 1507809854:
                        if (D8.equals(y.f14335b)) {
                            z8 = true;
                            break;
                        }
                        z8 = -1;
                        break;
                    case 1622564786:
                        if (D8.equals(y.f14337d)) {
                            z8 = 2;
                            break;
                        }
                        z8 = -1;
                        break;
                    default:
                        z8 = -1;
                        break;
                }
                switch (z8) {
                    case false:
                        a9 = q.a(t.b().g(), 250.0f);
                        break;
                    case true:
                    case true:
                        a9 = q.a(t.b().g(), 90.0f);
                        i = 1;
                        break;
                    default:
                        i = 4;
                        break;
                }
            }
            TemplateBannerView templateBannerView = new TemplateBannerView(t.b().g());
            templateBannerView.init(new i(i, yVar.l()), "", TextUtils.isEmpty(rVar.aC()) ? xVar.f14314c : rVar.aC());
            templateBannerView.setAllowShowCloseBtn(yVar.E() == 0);
            if (a9 > 0) {
                templateBannerView.setLayoutParams(new ViewGroup.LayoutParams(-1, a9));
            }
            templateBannerView.setBannerAdListener(new AnonymousClass2(xVar, eVar));
            eVar.a(templateBannerView);
            this.f17841a.put(xVar.f14313b + xVar.f14312a, templateBannerView);
            templateBannerView.load(b9);
            return;
        }
        if (String.valueOf(i4).equals("4")) {
            t.b().b(new AnonymousClass1(rVar, xVar, b9, eVar));
        } else {
            c(rVar, xVar, b9, eVar);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void b(r rVar, x xVar, e eVar, com.anythink.basead.f.c.e eVar2) {
        boolean z8;
        int i = 2;
        y yVar = xVar.f14325o;
        int a9 = q.a(t.b().g(), 50.0f);
        if (yVar.l() > 0) {
            a9 = yVar.l();
            i = 5;
        } else {
            String D8 = yVar.D();
            D8.getClass();
            switch (D8.hashCode()) {
                case -559799608:
                    if (D8.equals(y.f14336c)) {
                        z8 = false;
                        break;
                    }
                    z8 = -1;
                    break;
                case 1507809854:
                    if (D8.equals(y.f14335b)) {
                        z8 = true;
                        break;
                    }
                    z8 = -1;
                    break;
                case 1622564786:
                    if (D8.equals(y.f14337d)) {
                        z8 = 2;
                        break;
                    }
                    z8 = -1;
                    break;
                default:
                    z8 = -1;
                    break;
            }
            switch (z8) {
                case false:
                    a9 = q.a(t.b().g(), 250.0f);
                    break;
                case true:
                case true:
                    a9 = q.a(t.b().g(), 90.0f);
                    i = 1;
                    break;
                default:
                    i = 4;
                    break;
            }
        }
        TemplateBannerView templateBannerView = new TemplateBannerView(t.b().g());
        templateBannerView.init(new i(i, yVar.l()), "", TextUtils.isEmpty(rVar.aC()) ? xVar.f14314c : rVar.aC());
        templateBannerView.setAllowShowCloseBtn(yVar.E() == 0);
        if (a9 > 0) {
            templateBannerView.setLayoutParams(new ViewGroup.LayoutParams(-1, a9));
        }
        templateBannerView.setBannerAdListener(new AnonymousClass2(xVar, eVar2));
        if (eVar2 != null) {
            eVar2.a(templateBannerView);
        }
        this.f17841a.put(xVar.f14313b + xVar.f14312a, templateBannerView);
        templateBannerView.load(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str, boolean z8, int i, long j9) {
        HashMap hashMap = new HashMap();
        if (z8) {
            hashMap.put("shake_show", "1");
        } else {
            hashMap.put("shake_show", "0");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j9 / 1000);
        hashMap.put("shake_time", sb.toString());
        hashMap.put("shake_strength", String.valueOf(i));
        try {
            return l.a(str, hashMap);
        } catch (Throwable unused) {
            return str;
        }
    }

    @Override // com.anythink.basead.f.c.b
    public final void a(r rVar) {
        if (!TextUtils.isEmpty(rVar.s())) {
            com.anythink.expressad.out.b.f20180a = rVar.s();
        }
        if (com.anythink.expressad.foundation.b.a.c().e() == null) {
            com.anythink.expressad.foundation.b.a.c().a(t.b().g());
            com.anythink.expressad.foundation.b.a.c().a(t.b().U());
            com.anythink.expressad.g.a a9 = com.anythink.expressad.out.g.a();
            HashMap hashMap = new HashMap(3);
            hashMap.put(com.anythink.expressad.a.f17779d, rVar.aA());
            hashMap.put(com.anythink.expressad.a.f17780e, rVar.aB());
            a9.a(hashMap, t.b().g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(String str, boolean z8) {
        HashMap hashMap = new HashMap();
        if (z8) {
            hashMap.put("alecfc", "1");
        } else {
            hashMap.put("alecfc", "0");
        }
        try {
            return l.a(str, hashMap);
        } catch (Throwable unused) {
            return str;
        }
    }

    @Override // com.anythink.basead.f.c.b
    public final com.anythink.basead.f.c.d a(Context context, x xVar, w wVar, c cVar) {
        return new a(context, xVar, wVar, cVar);
    }

    @Override // com.anythink.basead.f.c.b
    public final boolean a(r rVar, x xVar) {
        ArrayList<d> arrayList;
        ArrayList<d> arrayList2;
        e b9 = b(rVar, xVar);
        int i = xVar.f14320j;
        int i4 = xVar.f14321k;
        if (i4 >= 0) {
            i = i4;
        }
        if (String.valueOf(i).equals("0") || String.valueOf(i).equals("2")) {
            return true;
        }
        if (String.valueOf(i).equals("4")) {
            if (b9 != null && (arrayList2 = b9.f18838K) != null && arrayList2.size() > 0) {
                return com.anythink.expressad.splash.c.d.a(b9.f18838K.get(0));
            }
        } else if (b9 != null && (arrayList = b9.f18838K) != null && arrayList.size() > 0) {
            return o.b(b9.f18838K);
        }
        return false;
    }

    private void a(r rVar, x xVar, e eVar, com.anythink.basead.f.c.e eVar2) {
        t.b().b(new AnonymousClass1(rVar, xVar, eVar, eVar2));
    }

    private void a(String str, x xVar, com.anythink.basead.f.c.e eVar) {
        this.f17841a.remove(xVar.f14313b + xVar.f14312a);
        if (eVar != null) {
            eVar.a(g.a(g.f6338m, str));
        }
    }

    private static void a(r rVar, d dVar) {
        rVar.x(dVar.bi());
        rVar.o(dVar.bl());
        rVar.m(dVar.bj());
        rVar.n(dVar.bk());
        rVar.w(dVar.af());
        rVar.v(dVar.ah());
        bl aH = rVar.aH();
        if (aH == null) {
            aH = new bl();
            rVar.a(aH);
        }
        com.anythink.expressad.foundation.d.p M8 = dVar.M();
        if (M8 != null) {
            aH.b(M8.a());
            aH.c(M8.b());
            aH.d(M8.c());
        }
        a((w) rVar, dVar);
    }

    private static void a(r rVar, List<d> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<d> it = list.iterator();
        while (it.hasNext()) {
            it.next().u(rVar.C());
        }
    }

    private static void a(x xVar, List<d> list) {
        y yVar;
        int i = xVar.f14320j;
        int i4 = xVar.f14321k;
        if (i4 >= 0) {
            i = i4;
        }
        d dVar = list.get(0);
        if ((i == 1 || i == 3) && dVar != null) {
            dVar.c(xVar.f14325o.L());
        }
        if (dVar == null || (yVar = xVar.f14325o) == null) {
            return;
        }
        dVar.q(yVar.bq());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.anythink.basead.b.c a(com.anythink.basead.b.c cVar, d dVar) {
        com.anythink.expressad.foundation.d.b aO;
        y r9 = cVar.b().r();
        if (cVar.b().v().equals(dVar.bh())) {
            a(cVar.b(), dVar);
            return cVar;
        }
        r rVar = new r();
        a(rVar, dVar);
        rVar.k(dVar.bh());
        int R8 = dVar.R();
        if (R8 != 0) {
            if (R8 == 1 || R8 == 2) {
                rVar.h(1);
            } else if (R8 != 3) {
                if (R8 != 4) {
                    if (R8 != 5) {
                        if (R8 != 8) {
                            if (R8 != 9) {
                                if (R8 == 12) {
                                    rVar.h(6);
                                }
                            }
                        }
                    }
                }
                rVar.h(3);
            } else {
                rVar.h(4);
            }
            aO = dVar.aO();
            if (aO != null) {
                rVar.ag(aO.b());
                rVar.z(aO.f());
                rVar.A(aO.e());
                rVar.B(aO.c());
                rVar.C(aO.a());
            }
            com.anythink.basead.b.c cVar2 = new com.anythink.basead.b.c(t.b().g(), cVar.c(), rVar, null);
            rVar.c(r9);
            return cVar2;
        }
        rVar.h(2);
        aO = dVar.aO();
        if (aO != null) {
        }
        com.anythink.basead.b.c cVar22 = new com.anythink.basead.b.c(t.b().g(), cVar.c(), rVar, null);
        rVar.c(r9);
        return cVar22;
    }

    private static void a(w wVar, d dVar) {
        String[] l9;
        r rVar = wVar instanceof r ? (r) wVar : null;
        if (wVar == null || dVar == null) {
            return;
        }
        wVar.v(dVar.ah());
        wVar.w(dVar.af());
        wVar.e(dVar.aW());
        wVar.d(dVar.aV());
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.aj() + "&opdptype={opdptype}&apk_ptype={apk_ptype}");
        com.anythink.expressad.foundation.d.p M8 = dVar.M();
        if (M8 != null && (l9 = M8.l()) != null) {
            for (String str : l9) {
                arrayList.add(str);
            }
        }
        bl aH = rVar.aH();
        if (aH == null) {
            aH = new bl();
            rVar.a(aH);
        }
        aH.a((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public static /* synthetic */ void a(b bVar, String str, x xVar, com.anythink.basead.f.c.e eVar) {
        bVar.f17841a.remove(xVar.f14313b + xVar.f14312a);
        if (eVar != null) {
            eVar.a(g.a(g.f6338m, str));
        }
    }
}
