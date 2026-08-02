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
    private static final String f8204a = "AdsMediaSource";

    /* renamed from: b, reason: collision with root package name */
    private final s f8205b;

    /* renamed from: c, reason: collision with root package name */
    private final e f8206c;

    /* renamed from: d, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.h.a.b f8207d;

    /* renamed from: e, reason: collision with root package name */
    private final ViewGroup f8208e;

    /* renamed from: f, reason: collision with root package name */
    private final Handler f8209f;

    /* renamed from: g, reason: collision with root package name */
    private final d f8210g;

    /* renamed from: h, reason: collision with root package name */
    private final Handler f8211h;
    private final Map<s, List<l>> i;

    /* renamed from: j, reason: collision with root package name */
    private final ae.a f8212j;

    /* renamed from: k, reason: collision with root package name */
    private C0028c f8213k;

    /* renamed from: l, reason: collision with root package name */
    private ae f8214l;

    /* renamed from: m, reason: collision with root package name */
    private Object f8215m;

    /* renamed from: n, reason: collision with root package name */
    private com.anythink.basead.exoplayer.h.a.a f8216n;

    /* renamed from: o, reason: collision with root package name */
    private s[][] f8217o;

    /* renamed from: p, reason: collision with root package name */
    private long[][] f8218p;

    public static final class a extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public static final int f8223a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f8224b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f8225c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f8226d = 3;

        /* renamed from: e, reason: collision with root package name */
        public final int f8227e;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.anythink.basead.exoplayer.h.a.c$a$a, reason: collision with other inner class name */
        public @interface InterfaceC0027a {
        }

        private a(int i, Exception exc) {
            super(exc);
            this.f8227e = i;
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
            com.anythink.basead.exoplayer.k.a.b(this.f8227e == 3);
            return (RuntimeException) getCause();
        }
    }

    public final class b implements l.a {

        /* renamed from: b, reason: collision with root package name */
        private final Uri f8229b;

        /* renamed from: c, reason: collision with root package name */
        private final int f8230c;

        /* renamed from: d, reason: collision with root package name */
        private final int f8231d;

        public b(Uri uri, int i, int i4) {
            this.f8229b = uri;
            this.f8230c = i;
            this.f8231d = i4;
        }

        @Override // com.anythink.basead.exoplayer.h.l.a
        public final void a(s.a aVar, final IOException iOException) {
            c.this.a(aVar).a(new k(this.f8229b), a.a(iOException));
            c.this.f8211h.post(new Runnable() { // from class: com.anythink.basead.exoplayer.h.a.c.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.anythink.basead.exoplayer.h.a.b unused = c.this.f8207d;
                    int unused2 = b.this.f8230c;
                    int unused3 = b.this.f8231d;
                }
            });
        }
    }

    /* renamed from: com.anythink.basead.exoplayer.h.a.c$c, reason: collision with other inner class name */
    public final class C0028c implements b.a {

        /* renamed from: b, reason: collision with root package name */
        private final Handler f8235b = new Handler();

        /* renamed from: c, reason: collision with root package name */
        private volatile boolean f8236c;

        public C0028c() {
        }

        @Override // com.anythink.basead.exoplayer.h.a.b.a
        public final void b() {
            if (this.f8236c || c.this.f8209f == null || c.this.f8210g == null) {
                return;
            }
            c.this.f8209f.post(new Runnable() { // from class: com.anythink.basead.exoplayer.h.a.c.c.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (C0028c.this.f8236c) {
                        return;
                    }
                    d unused = c.this.f8210g;
                }
            });
        }

        public final void c() {
            this.f8236c = true;
            this.f8235b.removeCallbacksAndMessages(null);
        }

        @Override // com.anythink.basead.exoplayer.h.a.b.a
        public final void a(final com.anythink.basead.exoplayer.h.a.a aVar) {
            if (this.f8236c) {
                return;
            }
            this.f8235b.post(new Runnable() { // from class: com.anythink.basead.exoplayer.h.a.c.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (C0028c.this.f8236c) {
                        return;
                    }
                    c.a(c.this, aVar);
                }
            });
        }

        @Override // com.anythink.basead.exoplayer.h.a.b.a
        public final void a() {
            if (this.f8236c || c.this.f8209f == null || c.this.f8210g == null) {
                return;
            }
            c.this.f8209f.post(new Runnable() { // from class: com.anythink.basead.exoplayer.h.a.c.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (C0028c.this.f8236c) {
                        return;
                    }
                    d unused = c.this.f8210g;
                }
            });
        }

        @Override // com.anythink.basead.exoplayer.h.a.b.a
        public final void a(final a aVar, k kVar) {
            if (this.f8236c) {
                return;
            }
            c.this.a((s.a) null).a(kVar, aVar);
            if (c.this.f8209f == null || c.this.f8210g == null) {
                return;
            }
            c.this.f8209f.post(new Runnable() { // from class: com.anythink.basead.exoplayer.h.a.c.c.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (C0028c.this.f8236c) {
                        return;
                    }
                    if (aVar.f8227e != 3) {
                        d unused = c.this.f8210g;
                        return;
                    }
                    d unused2 = c.this.f8210g;
                    a aVar2 = aVar;
                    com.anythink.basead.exoplayer.k.a.b(aVar2.f8227e == 3);
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
        com.anythink.basead.exoplayer.h.a.a aVar = this.f8216n;
        if (aVar == null || this.f8214l == null) {
            return;
        }
        com.anythink.basead.exoplayer.h.a.a a9 = aVar.a(this.f8218p);
        this.f8216n = a9;
        a(a9.f8196g == 0 ? this.f8214l : new com.anythink.basead.exoplayer.h.a.d(this.f8214l, this.f8216n), this.f8215m);
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
        this.f8214l = aeVar;
        this.f8215m = obj;
        c();
    }

    @Deprecated
    private c(s sVar, e eVar, com.anythink.basead.exoplayer.h.a.b bVar, ViewGroup viewGroup, Handler handler, d dVar) {
        this.f8205b = sVar;
        this.f8206c = eVar;
        this.f8207d = bVar;
        this.f8208e = viewGroup;
        this.f8209f = handler;
        this.f8210g = dVar;
        this.f8211h = new Handler(Looper.getMainLooper());
        this.i = new HashMap();
        this.f8212j = new ae.a();
        this.f8217o = new s[0][];
        this.f8218p = new long[0][];
    }

    @Override // com.anythink.basead.exoplayer.h.f
    public final /* synthetic */ void a(s.a aVar, s sVar, ae aeVar, Object obj) {
        s.a aVar2 = aVar;
        if (aVar2.a()) {
            int i = aVar2.f8554b;
            int i4 = aVar2.f8555c;
            com.anythink.basead.exoplayer.k.a.a(aeVar.c() == 1);
            this.f8218p[i][i4] = aeVar.a(0, this.f8212j, false).f7131d;
            if (this.i.containsKey(sVar)) {
                List<l> list = this.i.get(sVar);
                for (int i6 = 0; i6 < list.size(); i6++) {
                    list.get(i6).f();
                }
                this.i.remove(sVar);
            }
            c();
            return;
        }
        this.f8214l = aeVar;
        this.f8215m = obj;
        c();
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a(final com.anythink.basead.exoplayer.h hVar, boolean z6) {
        super.a(hVar, z6);
        com.anythink.basead.exoplayer.k.a.a(z6);
        final C0028c c0028c = new C0028c();
        this.f8213k = c0028c;
        a((c) new s.a(0), this.f8205b);
        this.f8211h.post(new Runnable() { // from class: com.anythink.basead.exoplayer.h.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.basead.exoplayer.h.a.b unused = c.this.f8207d;
                ViewGroup unused2 = c.this.f8208e;
            }
        });
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final r a(s.a aVar, com.anythink.basead.exoplayer.j.b bVar) {
        if (this.f8216n.f8196g > 0 && aVar.a()) {
            int i = aVar.f8554b;
            int i4 = aVar.f8555c;
            Uri uri = this.f8216n.i[i].f8201b[i4];
            if (this.f8217o[i].length <= i4) {
                s b9 = this.f8206c.b(uri);
                s[][] sVarArr = this.f8217o;
                s[] sVarArr2 = sVarArr[i];
                int length = sVarArr2.length;
                if (i4 >= length) {
                    int i6 = i4 + 1;
                    sVarArr[i] = (s[]) Arrays.copyOf(sVarArr2, i6);
                    long[][] jArr = this.f8218p;
                    jArr[i] = Arrays.copyOf(jArr[i], i6);
                    Arrays.fill(this.f8218p[i], length, i6, com.anythink.basead.exoplayer.b.f7168b);
                }
                this.f8217o[i][i4] = b9;
                this.i.put(b9, new ArrayList());
                a((c) aVar, b9);
            }
            s sVar = this.f8217o[i][i4];
            l lVar = new l(sVar, new s.a(0, aVar.f8556d), bVar);
            lVar.a(new b(uri, i, i4));
            List<l> list = this.i.get(sVar);
            if (list == null) {
                lVar.f();
                return lVar;
            }
            list.add(lVar);
            return lVar;
        }
        l lVar2 = new l(this.f8205b, aVar, bVar);
        lVar2.f();
        return lVar2;
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(r rVar) {
        l lVar = (l) rVar;
        List<l> list = this.i.get(lVar.f8462a);
        if (list != null) {
            list.remove(lVar);
        }
        lVar.g();
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a() {
        super.a();
        this.f8213k.c();
        this.f8213k = null;
        this.i.clear();
        this.f8214l = null;
        this.f8215m = null;
        this.f8216n = null;
        this.f8217o = new s[0][];
        this.f8218p = new long[0][];
        this.f8211h.post(new Runnable() { // from class: com.anythink.basead.exoplayer.h.a.c.2
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.basead.exoplayer.h.a.b unused = c.this.f8207d;
            }
        });
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(s.a aVar, s sVar, ae aeVar, Object obj) {
        if (aVar.a()) {
            int i = aVar.f8554b;
            int i4 = aVar.f8555c;
            com.anythink.basead.exoplayer.k.a.a(aeVar.c() == 1);
            this.f8218p[i][i4] = aeVar.a(0, this.f8212j, false).f7131d;
            if (this.i.containsKey(sVar)) {
                List<l> list = this.i.get(sVar);
                for (int i6 = 0; i6 < list.size(); i6++) {
                    list.get(i6).f();
                }
                this.i.remove(sVar);
            }
            c();
            return;
        }
        this.f8214l = aeVar;
        this.f8215m = obj;
        c();
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static s.a a2(s.a aVar, s.a aVar2) {
        return aVar.a() ? aVar : aVar2;
    }

    private void a(com.anythink.basead.exoplayer.h.a.a aVar) {
        if (this.f8216n == null) {
            s[][] sVarArr = new s[aVar.f8196g][];
            this.f8217o = sVarArr;
            Arrays.fill(sVarArr, new s[0]);
            long[][] jArr = new long[aVar.f8196g][];
            this.f8218p = jArr;
            Arrays.fill(jArr, new long[0]);
        }
        this.f8216n = aVar;
        c();
    }

    private void a(s sVar, int i, int i4, ae aeVar) {
        com.anythink.basead.exoplayer.k.a.a(aeVar.c() == 1);
        this.f8218p[i][i4] = aeVar.a(0, this.f8212j, false).f7131d;
        if (this.i.containsKey(sVar)) {
            List<l> list = this.i.get(sVar);
            for (int i6 = 0; i6 < list.size(); i6++) {
                list.get(i6).f();
            }
            this.i.remove(sVar);
        }
        c();
    }

    public static /* synthetic */ void a(c cVar, com.anythink.basead.exoplayer.h.a.a aVar) {
        if (cVar.f8216n == null) {
            s[][] sVarArr = new s[aVar.f8196g][];
            cVar.f8217o = sVarArr;
            Arrays.fill(sVarArr, new s[0]);
            long[][] jArr = new long[aVar.f8196g][];
            cVar.f8218p = jArr;
            Arrays.fill(jArr, new long[0]);
        }
        cVar.f8216n = aVar;
        cVar.c();
    }
}
