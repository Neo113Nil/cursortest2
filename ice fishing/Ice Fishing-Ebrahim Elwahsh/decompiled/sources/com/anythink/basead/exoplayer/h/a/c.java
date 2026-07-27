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
import com.anythink.basead.exoplayer.k.C0544a;
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
    private static final String f7575a = "AdsMediaSource";

    /* renamed from: b, reason: collision with root package name */
    private final s f7576b;

    /* renamed from: c, reason: collision with root package name */
    private final e f7577c;

    /* renamed from: d, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.h.a.b f7578d;

    /* renamed from: e, reason: collision with root package name */
    private final ViewGroup f7579e;

    /* renamed from: f, reason: collision with root package name */
    private final Handler f7580f;

    /* renamed from: g, reason: collision with root package name */
    private final d f7581g;

    /* renamed from: h, reason: collision with root package name */
    private final Handler f7582h;
    private final Map<s, List<l>> i;

    /* renamed from: j, reason: collision with root package name */
    private final ae.a f7583j;

    /* renamed from: k, reason: collision with root package name */
    private C0027c f7584k;

    /* renamed from: l, reason: collision with root package name */
    private ae f7585l;

    /* renamed from: m, reason: collision with root package name */
    private Object f7586m;

    /* renamed from: n, reason: collision with root package name */
    private com.anythink.basead.exoplayer.h.a.a f7587n;

    /* renamed from: o, reason: collision with root package name */
    private s[][] f7588o;

    /* renamed from: p, reason: collision with root package name */
    private long[][] f7589p;

    public static final class a extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public static final int f7594a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f7595b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f7596c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f7597d = 3;

        /* renamed from: e, reason: collision with root package name */
        public final int f7598e;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.anythink.basead.exoplayer.h.a.c$a$a, reason: collision with other inner class name */
        public @interface InterfaceC0026a {
        }

        private a(int i, Exception exc) {
            super(exc);
            this.f7598e = i;
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
            C0544a.b(this.f7598e == 3);
            return (RuntimeException) getCause();
        }
    }

    public final class b implements l.a {

        /* renamed from: b, reason: collision with root package name */
        private final Uri f7600b;

        /* renamed from: c, reason: collision with root package name */
        private final int f7601c;

        /* renamed from: d, reason: collision with root package name */
        private final int f7602d;

        public b(Uri uri, int i, int i4) {
            this.f7600b = uri;
            this.f7601c = i;
            this.f7602d = i4;
        }

        @Override // com.anythink.basead.exoplayer.h.l.a
        public final void a(s.a aVar, final IOException iOException) {
            c.this.a(aVar).a(new k(this.f7600b), a.a(iOException));
            c.this.f7582h.post(new Runnable() { // from class: com.anythink.basead.exoplayer.h.a.c.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.anythink.basead.exoplayer.h.a.b unused = c.this.f7578d;
                    int unused2 = b.this.f7601c;
                    int unused3 = b.this.f7602d;
                }
            });
        }
    }

    /* renamed from: com.anythink.basead.exoplayer.h.a.c$c, reason: collision with other inner class name */
    public final class C0027c implements b.a {

        /* renamed from: b, reason: collision with root package name */
        private final Handler f7606b = new Handler();

        /* renamed from: c, reason: collision with root package name */
        private volatile boolean f7607c;

        public C0027c() {
        }

        @Override // com.anythink.basead.exoplayer.h.a.b.a
        public final void b() {
            if (this.f7607c || c.this.f7580f == null || c.this.f7581g == null) {
                return;
            }
            c.this.f7580f.post(new Runnable() { // from class: com.anythink.basead.exoplayer.h.a.c.c.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (C0027c.this.f7607c) {
                        return;
                    }
                    d unused = c.this.f7581g;
                }
            });
        }

        public final void c() {
            this.f7607c = true;
            this.f7606b.removeCallbacksAndMessages(null);
        }

        @Override // com.anythink.basead.exoplayer.h.a.b.a
        public final void a(final com.anythink.basead.exoplayer.h.a.a aVar) {
            if (this.f7607c) {
                return;
            }
            this.f7606b.post(new Runnable() { // from class: com.anythink.basead.exoplayer.h.a.c.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (C0027c.this.f7607c) {
                        return;
                    }
                    c.a(c.this, aVar);
                }
            });
        }

        @Override // com.anythink.basead.exoplayer.h.a.b.a
        public final void a() {
            if (this.f7607c || c.this.f7580f == null || c.this.f7581g == null) {
                return;
            }
            c.this.f7580f.post(new Runnable() { // from class: com.anythink.basead.exoplayer.h.a.c.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (C0027c.this.f7607c) {
                        return;
                    }
                    d unused = c.this.f7581g;
                }
            });
        }

        @Override // com.anythink.basead.exoplayer.h.a.b.a
        public final void a(final a aVar, k kVar) {
            if (this.f7607c) {
                return;
            }
            c.this.a((s.a) null).a(kVar, aVar);
            if (c.this.f7580f == null || c.this.f7581g == null) {
                return;
            }
            c.this.f7580f.post(new Runnable() { // from class: com.anythink.basead.exoplayer.h.a.c.c.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (C0027c.this.f7607c) {
                        return;
                    }
                    if (aVar.f7598e != 3) {
                        d unused = c.this.f7581g;
                        return;
                    }
                    d unused2 = c.this.f7581g;
                    a aVar2 = aVar;
                    C0544a.b(aVar2.f7598e == 3);
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
        com.anythink.basead.exoplayer.h.a.a aVar = this.f7587n;
        if (aVar == null || this.f7585l == null) {
            return;
        }
        com.anythink.basead.exoplayer.h.a.a a9 = aVar.a(this.f7589p);
        this.f7587n = a9;
        a(a9.f7567g == 0 ? this.f7585l : new com.anythink.basead.exoplayer.h.a.d(this.f7585l, this.f7587n), this.f7586m);
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
        this.f7585l = aeVar;
        this.f7586m = obj;
        c();
    }

    @Deprecated
    private c(s sVar, e eVar, com.anythink.basead.exoplayer.h.a.b bVar, ViewGroup viewGroup, Handler handler, d dVar) {
        this.f7576b = sVar;
        this.f7577c = eVar;
        this.f7578d = bVar;
        this.f7579e = viewGroup;
        this.f7580f = handler;
        this.f7581g = dVar;
        this.f7582h = new Handler(Looper.getMainLooper());
        this.i = new HashMap();
        this.f7583j = new ae.a();
        this.f7588o = new s[0][];
        this.f7589p = new long[0][];
    }

    @Override // com.anythink.basead.exoplayer.h.f
    public final /* synthetic */ void a(s.a aVar, s sVar, ae aeVar, Object obj) {
        s.a aVar2 = aVar;
        if (aVar2.a()) {
            int i = aVar2.f7925b;
            int i4 = aVar2.f7926c;
            C0544a.a(aeVar.c() == 1);
            this.f7589p[i][i4] = aeVar.a(0, this.f7583j, false).f6502d;
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
        this.f7585l = aeVar;
        this.f7586m = obj;
        c();
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a(final com.anythink.basead.exoplayer.h hVar, boolean z8) {
        super.a(hVar, z8);
        C0544a.a(z8);
        final C0027c c0027c = new C0027c();
        this.f7584k = c0027c;
        a((c) new s.a(0), this.f7576b);
        this.f7582h.post(new Runnable() { // from class: com.anythink.basead.exoplayer.h.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.basead.exoplayer.h.a.b unused = c.this.f7578d;
                ViewGroup unused2 = c.this.f7579e;
            }
        });
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final r a(s.a aVar, com.anythink.basead.exoplayer.j.b bVar) {
        if (this.f7587n.f7567g > 0 && aVar.a()) {
            int i = aVar.f7925b;
            int i4 = aVar.f7926c;
            Uri uri = this.f7587n.i[i].f7572b[i4];
            if (this.f7588o[i].length <= i4) {
                s b9 = this.f7577c.b(uri);
                s[][] sVarArr = this.f7588o;
                s[] sVarArr2 = sVarArr[i];
                int length = sVarArr2.length;
                if (i4 >= length) {
                    int i9 = i4 + 1;
                    sVarArr[i] = (s[]) Arrays.copyOf(sVarArr2, i9);
                    long[][] jArr = this.f7589p;
                    jArr[i] = Arrays.copyOf(jArr[i], i9);
                    Arrays.fill(this.f7589p[i], length, i9, com.anythink.basead.exoplayer.b.f6539b);
                }
                this.f7588o[i][i4] = b9;
                this.i.put(b9, new ArrayList());
                a((c) aVar, b9);
            }
            s sVar = this.f7588o[i][i4];
            l lVar = new l(sVar, new s.a(0, aVar.f7927d), bVar);
            lVar.a(new b(uri, i, i4));
            List<l> list = this.i.get(sVar);
            if (list == null) {
                lVar.f();
                return lVar;
            }
            list.add(lVar);
            return lVar;
        }
        l lVar2 = new l(this.f7576b, aVar, bVar);
        lVar2.f();
        return lVar2;
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(r rVar) {
        l lVar = (l) rVar;
        List<l> list = this.i.get(lVar.f7833a);
        if (list != null) {
            list.remove(lVar);
        }
        lVar.g();
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a() {
        super.a();
        this.f7584k.c();
        this.f7584k = null;
        this.i.clear();
        this.f7585l = null;
        this.f7586m = null;
        this.f7587n = null;
        this.f7588o = new s[0][];
        this.f7589p = new long[0][];
        this.f7582h.post(new Runnable() { // from class: com.anythink.basead.exoplayer.h.a.c.2
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.basead.exoplayer.h.a.b unused = c.this.f7578d;
            }
        });
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(s.a aVar, s sVar, ae aeVar, Object obj) {
        if (aVar.a()) {
            int i = aVar.f7925b;
            int i4 = aVar.f7926c;
            C0544a.a(aeVar.c() == 1);
            this.f7589p[i][i4] = aeVar.a(0, this.f7583j, false).f6502d;
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
        this.f7585l = aeVar;
        this.f7586m = obj;
        c();
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static s.a a2(s.a aVar, s.a aVar2) {
        return aVar.a() ? aVar : aVar2;
    }

    private void a(com.anythink.basead.exoplayer.h.a.a aVar) {
        if (this.f7587n == null) {
            s[][] sVarArr = new s[aVar.f7567g][];
            this.f7588o = sVarArr;
            Arrays.fill(sVarArr, new s[0]);
            long[][] jArr = new long[aVar.f7567g][];
            this.f7589p = jArr;
            Arrays.fill(jArr, new long[0]);
        }
        this.f7587n = aVar;
        c();
    }

    private void a(s sVar, int i, int i4, ae aeVar) {
        C0544a.a(aeVar.c() == 1);
        this.f7589p[i][i4] = aeVar.a(0, this.f7583j, false).f6502d;
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
        if (cVar.f7587n == null) {
            s[][] sVarArr = new s[aVar.f7567g][];
            cVar.f7588o = sVarArr;
            Arrays.fill(sVarArr, new s[0]);
            long[][] jArr = new long[aVar.f7567g][];
            cVar.f7589p = jArr;
            Arrays.fill(jArr, new long[0]);
        }
        cVar.f7587n = aVar;
        cVar.c();
    }
}
