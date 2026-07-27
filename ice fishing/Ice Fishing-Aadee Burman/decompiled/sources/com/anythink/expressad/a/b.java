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
    private static volatile b f17682c;

    /* renamed from: b, reason: collision with root package name */
    private final String f17684b = getClass().getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    ConcurrentHashMap<String, c> f17683a = new ConcurrentHashMap<>(2);

    /* renamed from: com.anythink.expressad.a.b$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f17685a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f17686b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f17687c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.anythink.basead.f.c.e f17688d;

        public AnonymousClass1(r rVar, x xVar, e eVar, com.anythink.basead.f.c.e eVar2) {
            this.f17685a = rVar;
            this.f17686b = xVar;
            this.f17687c = eVar;
            this.f17688d = eVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.expressad.splash.d.c cVar = new com.anythink.expressad.splash.d.c(t.b().g(), "", TextUtils.isEmpty(this.f17685a.aC()) ? this.f17686b.f14157c : this.f17685a.aC());
            cVar.b(this.f17686b.f14168o.B() == 0);
            int x9 = ((int) this.f17686b.f14168o.x()) / 1000;
            if (x9 <= 2) {
                cVar.b(2);
            } else if (x9 >= 10) {
                cVar.b(10);
            } else {
                cVar.b(x9);
            }
            cVar.c(this.f17686b.f14168o.bJ());
            cVar.a(this.f17686b.f14168o.J() == 0);
            cVar.a(this.f17686b.f14168o.C());
            cVar.f();
            ArrayList<d> arrayList = this.f17687c.f18680K;
            if (arrayList != null && arrayList.size() > 0) {
                for (d dVar : arrayList) {
                    if (dVar != null) {
                        String b9 = dVar.b();
                        if (!TextUtils.isEmpty(b9)) {
                            boolean z3 = this.f17686b.f14168o.J() == 0;
                            boolean a9 = com.anythink.basead.b.e.a(this.f17686b);
                            b9 = b.b(b.c(b9, z3), a9, this.f17686b.f14168o.X(), this.f17686b.f14168o.Y());
                            if (!a9 && !z3) {
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
                    com.anythink.expressad.splash.d.c cVar2 = (com.anythink.expressad.splash.d.c) b.this.f17683a.remove(AnonymousClass1.this.f17686b.f14156b + AnonymousClass1.this.f17686b.f14155a);
                    if (cVar2 != null) {
                        com.anythink.basead.f.c.e eVar = AnonymousClass1.this.f17688d;
                        if (eVar != null) {
                            eVar.b(cVar2);
                            return;
                        }
                        return;
                    }
                    if (AnonymousClass1.this.f17688d != null) {
                        AnonymousClass1.this.f17688d.a(g.a(g.f6181m, "Resource download fail."));
                    }
                }

                @Override // com.anythink.expressad.out.d
                public final void b() {
                }

                @Override // com.anythink.expressad.out.d
                public final void a(String str) {
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    b.a(b.this, str, anonymousClass1.f17686b, anonymousClass1.f17688d);
                }
            });
            com.anythink.basead.f.c.e eVar = this.f17688d;
            if (eVar != null) {
                eVar.a(cVar);
            }
            b.this.f17683a.put(this.f17686b.f14156b + this.f17686b.f14155a, cVar);
            cVar.a(this.f17687c);
        }
    }

    /* renamed from: com.anythink.expressad.a.b$2, reason: invalid class name */
    public class AnonymousClass2 implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f17691a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.anythink.basead.f.c.e f17692b;

        public AnonymousClass2(x xVar, com.anythink.basead.f.c.e eVar) {
            this.f17691a = xVar;
            this.f17692b = eVar;
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
            b.a(b.this, str, this.f17691a, this.f17692b);
        }

        @Override // com.anythink.expressad.out.h
        public final void a() {
            TemplateBannerView templateBannerView = (TemplateBannerView) b.this.f17683a.remove(this.f17691a.f14156b + this.f17691a.f14155a);
            if (templateBannerView != null) {
                com.anythink.basead.f.c.e eVar = this.f17692b;
                if (eVar != null) {
                    eVar.b(templateBannerView);
                    return;
                }
                return;
            }
            if (this.f17692b != null) {
                this.f17692b.a(g.a(g.f6181m, "Resource download fail."));
            }
        }
    }

    /* renamed from: com.anythink.expressad.a.b$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f17697a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f17698b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.anythink.basead.f.c.e f17699c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f17700d;

        public AnonymousClass4(r rVar, x xVar, com.anythink.basead.f.c.e eVar, e eVar2) {
            this.f17697a = rVar;
            this.f17698b = xVar;
            this.f17699c = eVar;
            this.f17700d = eVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.expressad.advanced.d.c cVar = new com.anythink.expressad.advanced.d.c("", TextUtils.isEmpty(this.f17697a.aC()) ? this.f17698b.f14157c : this.f17697a.aC(), t.b().g());
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
                    b.a(b.this, str, anonymousClass4.f17698b, anonymousClass4.f17699c);
                }

                @Override // com.anythink.expressad.out.p
                public final void a() {
                    com.anythink.expressad.advanced.d.c cVar2 = (com.anythink.expressad.advanced.d.c) b.this.f17683a.remove(AnonymousClass4.this.f17698b.f14156b + AnonymousClass4.this.f17698b.f14155a);
                    if (cVar2 != null) {
                        com.anythink.basead.f.c.e eVar = AnonymousClass4.this.f17699c;
                        if (eVar != null) {
                            eVar.b(cVar2);
                            return;
                        }
                        return;
                    }
                    if (AnonymousClass4.this.f17699c != null) {
                        AnonymousClass4.this.f17699c.a(g.a(g.f6182n, g.f6158N));
                    }
                }
            });
            com.anythink.basead.f.c.e eVar = this.f17699c;
            if (eVar != null) {
                eVar.a(cVar);
            }
            b.this.f17683a.put(this.f17698b.f14156b + this.f17698b.f14155a, cVar);
            cVar.a(this.f17700d);
        }
    }

    private b() {
    }

    private void c(r rVar, final x xVar, e eVar, final com.anythink.basead.f.c.e eVar2) {
        com.anythink.expressad.reward.b.a aVar = new com.anythink.expressad.reward.b.a();
        String aC = TextUtils.isEmpty(rVar.aC()) ? xVar.f14157c : rVar.aC();
        int i = xVar.f14163j;
        int i6 = xVar.f14164k;
        if (i6 >= 0) {
            i = i6;
        }
        if (i == 1) {
            com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), aC, false);
            aVar.a(false);
        } else if (i == 3) {
            com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), aC, true);
            aVar.a(true);
        }
        aVar.a(xVar.f14168o.K() == 0 ? 1 : 2);
        aVar.a("", aC);
        com.anythink.expressad.videocommon.e.d a9 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), aC, false);
        if (xVar.f14168o.L() >= 0) {
            a9.a(xVar.f14168o.L());
        }
        if (i == 1) {
            a9.l();
        }
        ArrayList<d> arrayList = eVar.f18680K;
        if (arrayList != null && arrayList.size() > 0) {
            for (d dVar : arrayList) {
                if (dVar != null) {
                    boolean a10 = com.anythink.basead.b.e.a(xVar);
                    boolean z3 = xVar.f14168o.J() == 0;
                    String J = dVar.J();
                    if (!TextUtils.isEmpty(J)) {
                        dVar.k(b(c(J, z3), a10, xVar.f14168o.X(), xVar.f14168o.Y()));
                    }
                    String Q8 = dVar.Q();
                    if (!TextUtils.isEmpty(Q8)) {
                        dVar.n(b(c(Q8, z3), a10, xVar.f14168o.X(), xVar.f14168o.Y()));
                    }
                    d.c N8 = dVar.N();
                    boolean z6 = xVar.f14168o.G() == 1;
                    if (N8 != null) {
                        String e9 = N8.e();
                        if (!TextUtils.isEmpty(e9)) {
                            N8.a(c(e9, z6));
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
                com.anythink.expressad.reward.b.a aVar2 = (com.anythink.expressad.reward.b.a) b.this.f17683a.remove(xVar.f14156b + xVar.f14155a);
                if (aVar2 == null || !aVar2.isReady()) {
                    if (eVar2 != null) {
                        eVar2.a(g.a(g.f6181m, "Resource download fail."));
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
            public final void a(boolean z9, String str, float f3) {
            }

            @Override // com.anythink.expressad.videocommon.d.a
            public final void a(String str) {
                b.a(b.this, str, xVar, eVar2);
            }
        });
        if (eVar2 != null) {
            eVar2.a(aVar);
        }
        this.f17683a.put(xVar.f14156b + xVar.f14155a, aVar);
        aVar.a(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, boolean z3) {
        HashMap hashMap = new HashMap();
        if (z3) {
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
            ArrayList<d> arrayList = a9.f18680K;
            a(rVar, arrayList.get(0));
            if (arrayList.size() > 0) {
                Iterator<d> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().u(rVar.C());
                }
            }
            int i = xVar.f14163j;
            int i6 = xVar.f14164k;
            if (i6 >= 0) {
                i = i6;
            }
            d dVar = arrayList.get(0);
            if ((i == 1 || i == 3) && dVar != null) {
                dVar.c(xVar.f14168o.L());
            }
            if (dVar != null && (yVar = xVar.f14168o) != null) {
                dVar.q(yVar.bq());
            }
            return a9;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static b a() {
        if (f17682c == null) {
            synchronized (b.class) {
                try {
                    if (f17682c == null) {
                        f17682c = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17682c;
    }

    private void d(r rVar, x xVar, e eVar, com.anythink.basead.f.c.e eVar2) {
        t.b().b(new AnonymousClass4(rVar, xVar, eVar2, eVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.anythink.basead.f.c.b
    public final void a(r rVar, x xVar, com.anythink.basead.f.c.e eVar) {
        boolean z3;
        int i = 2;
        e b9 = b(rVar, xVar);
        a(rVar);
        int i6 = xVar.f14163j;
        int i9 = xVar.f14164k;
        if (i9 >= 0) {
            i6 = i9;
        }
        if (String.valueOf(i6).equals("0")) {
            t.b().b(new AnonymousClass4(rVar, xVar, eVar, b9));
            return;
        }
        if (String.valueOf(i6).equals("2")) {
            y yVar = xVar.f14168o;
            int a9 = q.a(t.b().g(), 50.0f);
            if (yVar.l() > 0) {
                a9 = yVar.l();
                i = 5;
            } else {
                String D8 = yVar.D();
                D8.getClass();
                switch (D8.hashCode()) {
                    case -559799608:
                        if (D8.equals(y.f14179c)) {
                            z3 = false;
                            break;
                        }
                        z3 = -1;
                        break;
                    case 1507809854:
                        if (D8.equals(y.f14178b)) {
                            z3 = true;
                            break;
                        }
                        z3 = -1;
                        break;
                    case 1622564786:
                        if (D8.equals(y.f14180d)) {
                            z3 = 2;
                            break;
                        }
                        z3 = -1;
                        break;
                    default:
                        z3 = -1;
                        break;
                }
                switch (z3) {
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
            templateBannerView.init(new i(i, yVar.l()), "", TextUtils.isEmpty(rVar.aC()) ? xVar.f14157c : rVar.aC());
            templateBannerView.setAllowShowCloseBtn(yVar.E() == 0);
            if (a9 > 0) {
                templateBannerView.setLayoutParams(new ViewGroup.LayoutParams(-1, a9));
            }
            templateBannerView.setBannerAdListener(new AnonymousClass2(xVar, eVar));
            eVar.a(templateBannerView);
            this.f17683a.put(xVar.f14156b + xVar.f14155a, templateBannerView);
            templateBannerView.load(b9);
            return;
        }
        if (String.valueOf(i6).equals("4")) {
            t.b().b(new AnonymousClass1(rVar, xVar, b9, eVar));
        } else {
            c(rVar, xVar, b9, eVar);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void b(r rVar, x xVar, e eVar, com.anythink.basead.f.c.e eVar2) {
        boolean z3;
        int i = 2;
        y yVar = xVar.f14168o;
        int a9 = q.a(t.b().g(), 50.0f);
        if (yVar.l() > 0) {
            a9 = yVar.l();
            i = 5;
        } else {
            String D8 = yVar.D();
            D8.getClass();
            switch (D8.hashCode()) {
                case -559799608:
                    if (D8.equals(y.f14179c)) {
                        z3 = false;
                        break;
                    }
                    z3 = -1;
                    break;
                case 1507809854:
                    if (D8.equals(y.f14178b)) {
                        z3 = true;
                        break;
                    }
                    z3 = -1;
                    break;
                case 1622564786:
                    if (D8.equals(y.f14180d)) {
                        z3 = 2;
                        break;
                    }
                    z3 = -1;
                    break;
                default:
                    z3 = -1;
                    break;
            }
            switch (z3) {
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
        templateBannerView.init(new i(i, yVar.l()), "", TextUtils.isEmpty(rVar.aC()) ? xVar.f14157c : rVar.aC());
        templateBannerView.setAllowShowCloseBtn(yVar.E() == 0);
        if (a9 > 0) {
            templateBannerView.setLayoutParams(new ViewGroup.LayoutParams(-1, a9));
        }
        templateBannerView.setBannerAdListener(new AnonymousClass2(xVar, eVar2));
        if (eVar2 != null) {
            eVar2.a(templateBannerView);
        }
        this.f17683a.put(xVar.f14156b + xVar.f14155a, templateBannerView);
        templateBannerView.load(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str, boolean z3, int i, long j6) {
        HashMap hashMap = new HashMap();
        if (z3) {
            hashMap.put("shake_show", "1");
        } else {
            hashMap.put("shake_show", "0");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j6 / 1000);
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
            com.anythink.expressad.out.b.f20022a = rVar.s();
        }
        if (com.anythink.expressad.foundation.b.a.c().e() == null) {
            com.anythink.expressad.foundation.b.a.c().a(t.b().g());
            com.anythink.expressad.foundation.b.a.c().a(t.b().U());
            com.anythink.expressad.g.a a9 = com.anythink.expressad.out.g.a();
            HashMap hashMap = new HashMap(3);
            hashMap.put(com.anythink.expressad.a.f17621d, rVar.aA());
            hashMap.put(com.anythink.expressad.a.f17622e, rVar.aB());
            a9.a(hashMap, t.b().g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(String str, boolean z3) {
        HashMap hashMap = new HashMap();
        if (z3) {
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
        int i = xVar.f14163j;
        int i6 = xVar.f14164k;
        if (i6 >= 0) {
            i = i6;
        }
        if (String.valueOf(i).equals("0") || String.valueOf(i).equals("2")) {
            return true;
        }
        if (String.valueOf(i).equals("4")) {
            if (b9 != null && (arrayList2 = b9.f18680K) != null && arrayList2.size() > 0) {
                return com.anythink.expressad.splash.c.d.a(b9.f18680K.get(0));
            }
        } else if (b9 != null && (arrayList = b9.f18680K) != null && arrayList.size() > 0) {
            return o.b(b9.f18680K);
        }
        return false;
    }

    private void a(r rVar, x xVar, e eVar, com.anythink.basead.f.c.e eVar2) {
        t.b().b(new AnonymousClass1(rVar, xVar, eVar, eVar2));
    }

    private void a(String str, x xVar, com.anythink.basead.f.c.e eVar) {
        this.f17683a.remove(xVar.f14156b + xVar.f14155a);
        if (eVar != null) {
            eVar.a(g.a(g.f6181m, str));
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
        int i = xVar.f14163j;
        int i6 = xVar.f14164k;
        if (i6 >= 0) {
            i = i6;
        }
        d dVar = list.get(0);
        if ((i == 1 || i == 3) && dVar != null) {
            dVar.c(xVar.f14168o.L());
        }
        if (dVar == null || (yVar = xVar.f14168o) == null) {
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
        bVar.f17683a.remove(xVar.f14156b + xVar.f14155a);
        if (eVar != null) {
            eVar.a(g.a(g.f6181m, str));
        }
    }
}
