package com.anythink.basead.exoplayer.h.a;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.anythink.basead.exoplayer.ae;
import com.anythink.basead.exoplayer.h.a.b;
import com.anythink.basead.exoplayer.h.f;
import com.anythink.basead.exoplayer.h.l;
import com.anythink.basead.exoplayer.h.o;
import com.anythink.basead.exoplayer.h.r;
import com.anythink.basead.exoplayer.h.s;
import com.anythink.basead.exoplayer.j.h;
import com.anythink.basead.exoplayer.j.k;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class c extends f<s.a> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7418a = "AdsMediaSource";

    /* renamed from: b, reason: collision with root package name */
    private final s f7419b;

    /* renamed from: c, reason: collision with root package name */
    private final e f7420c;

    /* renamed from: d, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.h.a.b f7421d;

    /* renamed from: e, reason: collision with root package name */
    private final ViewGroup f7422e;

    /* renamed from: f, reason: collision with root package name */
    private final Handler f7423f;

    /* renamed from: g, reason: collision with root package name */
    private final d f7424g;

    /* renamed from: h, reason: collision with root package name */
    private final Handler f7425h;
    private final Map<s, List<l>> i;

    /* renamed from: j, reason: collision with root package name */
    private final ae.a f7426j;

    /* renamed from: k, reason: collision with root package name */
    private C0028c f7427k;

    /* renamed from: l, reason: collision with root package name */
    private ae f7428l;

    /* renamed from: m, reason: collision with root package name */
    private Object f7429m;

    /* renamed from: n, reason: collision with root package name */
    private com.anythink.basead.exoplayer.h.a.a f7430n;

    /* renamed from: o, reason: collision with root package name */
    private s[][] f7431o;

    /* renamed from: p, reason: collision with root package name */
    private long[][] f7432p;

    public static final class a extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public static final int f7437a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f7438b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f7439c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f7440d = 3;

        /* renamed from: e, reason: collision with root package name */
        public final int f7441e;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.anythink.basead.exoplayer.h.a.c$a$a, reason: collision with other inner class name */
        public @interface InterfaceC0027a {
        }

        private a(int i, Exception exc) {
            super(exc);
            this.f7441e = i;
        }

        public static a a(Exception exc) {
            return new a(0, exc);
        }

        private static a b(Exception exc) {
            return new a(2, exc);
        }

        private static a a(Exception exc, int i) {
            return new a(1, new IOException("Failed to load ad group ".concat(String.valueOf(i)), exc));
        }

        private static a a(RuntimeException runtimeException) {
            return new a(3, runtimeException);
        }

        private RuntimeException a() {
            com.anythink.basead.exoplayer.k.a.b(this.f7441e == 3);
            return (RuntimeException) getCause();
        }
    }

    public final class b implements l.a {

        /* renamed from: b, reason: collision with root package name */
        private final Uri f7443b;

        /* renamed from: c, reason: collision with root package name */
        private final int f7444c;

        /* renamed from: d, reason: collision with root package name */
        private final int f7445d;

        public b(Uri uri, int i, int i6) {
            this.f7443b = uri;
            this.f7444c = i;
            this.f7445d = i6;
        }

        @Override // com.anythink.basead.exoplayer.h.l.a
        public final void a(s.a aVar, final IOException iOException) {
            c.this.a(aVar).a(new k(this.f7443b), a.a(iOException));
            c.this.f7425h.post(new Runnable() { // from class: com.anythink.basead.exoplayer.h.a.c.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.anythink.basead.exoplayer.h.a.b unused = c.this.f7421d;
                    int unused2 = b.this.f7444c;
                    int unused3 = b.this.f7445d;
                }
            });
        }
    }

    /* renamed from: com.anythink.basead.exoplayer.h.a.c$c, reason: collision with other inner class name */
    public final class C0028c implements b.a {

        /* renamed from: b, reason: collision with root package name */
        private final Handler f7449b = new Handler();

        /* renamed from: c, reason: collision with root package name */
        private volatile boolean f7450c;

        public C0028c() {
        }

        @Override // com.anythink.basead.exoplayer.h.a.b.a
        public final void b() {
            if (this.f7450c || c.this.f7423f == null || c.this.f7424g == null) {
                return;
            }
            c.this.f7423f.post(new Runnable() { // from class: com.anythink.basead.exoplayer.h.a.c.c.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (C0028c.this.f7450c) {
                        return;
                    }
                    d unused = c.this.f7424g;
                }
            });
        }

        public final void c() {
            this.f7450c = true;
            this.f7449b.removeCallbacksAndMessages(null);
        }

        @Override // com.anythink.basead.exoplayer.h.a.b.a
        public final void a(final com.anythink.basead.exoplayer.h.a.a aVar) {
            if (this.f7450c) {
                return;
            }
            this.f7449b.post(new Runnable() { // from class: com.anythink.basead.exoplayer.h.a.c.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (C0028c.this.f7450c) {
                        return;
                    }
                    c.a(c.this, aVar);
                }
            });
        }

        @Override // com.anythink.basead.exoplayer.h.a.b.a
        public final void a() {
            if (this.f7450c || c.this.f7423f == null || c.this.f7424g == null) {
                return;
            }
            c.this.f7423f.post(new Runnable() { // from class: com.anythink.basead.exoplayer.h.a.c.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (C0028c.this.f7450c) {
                        return;
                    }
                    d unused = c.this.f7424g;
                }
            });
        }

        @Override // com.anythink.basead.exoplayer.h.a.b.a
        public final void a(final a aVar, k kVar) {
            if (this.f7450c) {
                return;
            }
            c.this.a((s.a) null).a(kVar, aVar);
            if (c.this.f7423f == null || c.this.f7424g == null) {
                return;
            }
            c.this.f7423f.post(new Runnable() { // from class: com.anythink.basead.exoplayer.h.a.c.c.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (C0028c.this.f7450c) {
                        return;
                    }
                    if (aVar.f7441e != 3) {
                        d unused = c.this.f7424g;
                        return;
                    }
                    d unused2 = c.this.f7424g;
                    a aVar2 = aVar;
                    com.anythink.basead.exoplayer.k.a.b(aVar2.f7441e == 3);
                    aVar2.getCause();
                }
            });
        }
    }

    @Deprecated
    public interface d {
        void a();

        void b();

        void c();

        void d();
    }

    public interface e {
        int[] a();

        s b(Uri uri);
    }

    private c(s sVar, h.a aVar, com.anythink.basead.exoplayer.h.a.b bVar, ViewGroup viewGroup) {
        this(sVar, new o.c(aVar), bVar, viewGroup, (Handler) null, (d) null);
    }

    private c(s sVar, e eVar, com.anythink.basead.exoplayer.h.a.b bVar, ViewGroup viewGroup) {
        this(sVar, eVar, bVar, viewGroup, (Handler) null, (d) null);
    }

    private void c() {
        com.anythink.basead.exoplayer.h.a.a aVar = this.f7430n;
        if (aVar == null || this.f7428l == null) {
            return;
        }
        com.anythink.basead.exoplayer.h.a.a a9 = aVar.a(this.f7432p);
        this.f7430n = a9;
        a(a9.f7410g == 0 ? this.f7428l : new com.anythink.basead.exoplayer.h.a.d(this.f7428l, this.f7430n), this.f7429m);
    }

    @Override // com.anythink.basead.exoplayer.h.f
    public final /* bridge */ /* synthetic */ s.a a(s.a aVar, s.a aVar2) {
        s.a aVar3 = aVar;
        return aVar3.a() ? aVar3 : aVar2;
    }

    @Deprecated
    private c(s sVar, h.a aVar, com.anythink.basead.exoplayer.h.a.b bVar, ViewGroup viewGroup, Handler handler, d dVar) {
        this(sVar, new o.c(aVar), bVar, viewGroup, handler, dVar);
    }

    private void b(ae aeVar, Object obj) {
        this.f7428l = aeVar;
        this.f7429m = obj;
        c();
    }

    @Deprecated
    private c(s sVar, e eVar, com.anythink.basead.exoplayer.h.a.b bVar, ViewGroup viewGroup, Handler handler, d dVar) {
        this.f7419b = sVar;
        this.f7420c = eVar;
        this.f7421d = bVar;
        this.f7422e = viewGroup;
        this.f7423f = handler;
        this.f7424g = dVar;
        this.f7425h = new Handler(Looper.getMainLooper());
        this.i = new HashMap();
        this.f7426j = new ae.a();
        this.f7431o = new s[0][];
        this.f7432p = new long[0][];
    }

    @Override // com.anythink.basead.exoplayer.h.f
    public final /* synthetic */ void a(s.a aVar, s sVar, ae aeVar, Object obj) {
        s.a aVar2 = aVar;
        if (aVar2.a()) {
            int i = aVar2.f7768b;
            int i6 = aVar2.f7769c;
            com.anythink.basead.exoplayer.k.a.a(aeVar.c() == 1);
            this.f7432p[i][i6] = aeVar.a(0, this.f7426j, false).f6345d;
            if (this.i.containsKey(sVar)) {
                List<l> list = this.i.get(sVar);
                for (int i9 = 0; i9 < list.size(); i9++) {
                    list.get(i9).f();
                }
                this.i.remove(sVar);
            }
            c();
            return;
        }
        this.f7428l = aeVar;
        this.f7429m = obj;
        c();
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a(final com.anythink.basead.exoplayer.h hVar, boolean z3) {
        super.a(hVar, z3);
        com.anythink.basead.exoplayer.k.a.a(z3);
        final C0028c c0028c = new C0028c();
        this.f7427k = c0028c;
        a((c) new s.a(0), this.f7419b);
        this.f7425h.post(new Runnable() { // from class: com.anythink.basead.exoplayer.h.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.basead.exoplayer.h.a.b unused = c.this.f7421d;
                ViewGroup unused2 = c.this.f7422e;
            }
        });
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final r a(s.a aVar, com.anythink.basead.exoplayer.j.b bVar) {
        if (this.f7430n.f7410g > 0 && aVar.a()) {
            int i = aVar.f7768b;
            int i6 = aVar.f7769c;
            Uri uri = this.f7430n.i[i].f7415b[i6];
            if (this.f7431o[i].length <= i6) {
                s b9 = this.f7420c.b(uri);
                s[][] sVarArr = this.f7431o;
                s[] sVarArr2 = sVarArr[i];
                int length = sVarArr2.length;
                if (i6 >= length) {
                    int i9 = i6 + 1;
                    sVarArr[i] = (s[]) Arrays.copyOf(sVarArr2, i9);
                    long[][] jArr = this.f7432p;
                    jArr[i] = Arrays.copyOf(jArr[i], i9);
                    Arrays.fill(this.f7432p[i], length, i9, com.anythink.basead.exoplayer.b.f6382b);
                }
                this.f7431o[i][i6] = b9;
                this.i.put(b9, new ArrayList());
                a((c) aVar, b9);
            }
            s sVar = this.f7431o[i][i6];
            l lVar = new l(sVar, new s.a(0, aVar.f7770d), bVar);
            lVar.a(new b(uri, i, i6));
            List<l> list = this.i.get(sVar);
            if (list == null) {
                lVar.f();
                return lVar;
            }
            list.add(lVar);
            return lVar;
        }
        l lVar2 = new l(this.f7419b, aVar, bVar);
        lVar2.f();
        return lVar2;
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(r rVar) {
        l lVar = (l) rVar;
        List<l> list = this.i.get(lVar.f7676a);
        if (list != null) {
            list.remove(lVar);
        }
        lVar.g();
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a() {
        super.a();
        this.f7427k.c();
        this.f7427k = null;
        this.i.clear();
        this.f7428l = null;
        this.f7429m = null;
        this.f7430n = null;
        this.f7431o = new s[0][];
        this.f7432p = new long[0][];
        this.f7425h.post(new Runnable() { // from class: com.anythink.basead.exoplayer.h.a.c.2
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.basead.exoplayer.h.a.b unused = c.this.f7421d;
            }
        });
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(s.a aVar, s sVar, ae aeVar, Object obj) {
        if (aVar.a()) {
            int i = aVar.f7768b;
            int i6 = aVar.f7769c;
            com.anythink.basead.exoplayer.k.a.a(aeVar.c() == 1);
            this.f7432p[i][i6] = aeVar.a(0, this.f7426j, false).f6345d;
            if (this.i.containsKey(sVar)) {
                List<l> list = this.i.get(sVar);
                for (int i9 = 0; i9 < list.size(); i9++) {
                    list.get(i9).f();
                }
                this.i.remove(sVar);
            }
            c();
            return;
        }
        this.f7428l = aeVar;
        this.f7429m = obj;
        c();
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static s.a a2(s.a aVar, s.a aVar2) {
        return aVar.a() ? aVar : aVar2;
    }

    private void a(com.anythink.basead.exoplayer.h.a.a aVar) {
        if (this.f7430n == null) {
            s[][] sVarArr = new s[aVar.f7410g][];
            this.f7431o = sVarArr;
            Arrays.fill(sVarArr, new s[0]);
            long[][] jArr = new long[aVar.f7410g][];
            this.f7432p = jArr;
            Arrays.fill(jArr, new long[0]);
        }
        this.f7430n = aVar;
        c();
    }

    private void a(s sVar, int i, int i6, ae aeVar) {
        com.anythink.basead.exoplayer.k.a.a(aeVar.c() == 1);
        this.f7432p[i][i6] = aeVar.a(0, this.f7426j, false).f6345d;
        if (this.i.containsKey(sVar)) {
            List<l> list = this.i.get(sVar);
            for (int i9 = 0; i9 < list.size(); i9++) {
                list.get(i9).f();
            }
            this.i.remove(sVar);
        }
        c();
    }

    public static /* synthetic */ void a(c cVar, com.anythink.basead.exoplayer.h.a.a aVar) {
        if (cVar.f7430n == null) {
            s[][] sVarArr = new s[aVar.f7410g][];
            cVar.f7431o = sVarArr;
            Arrays.fill(sVarArr, new s[0]);
            long[][] jArr = new long[aVar.f7410g][];
            cVar.f7432p = jArr;
            Arrays.fill(jArr, new long[0]);
        }
        cVar.f7430n = aVar;
        cVar.c();
    }
}
