package com.anythink.basead.exoplayer.h;

import android.net.Uri;
import android.os.Handler;
import com.anythink.basead.exoplayer.h.a.c;
import com.anythink.basead.exoplayer.h.n;
import com.anythink.basead.exoplayer.h.s;
import com.anythink.basead.exoplayer.h.t;
import com.anythink.basead.exoplayer.j.h;
import java.io.IOException;

/* loaded from: classes.dex */
public final class o extends com.anythink.basead.exoplayer.h.c implements n.c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7739a = 3;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7740b = 6;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7741c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7742d = 1048576;

    /* renamed from: e, reason: collision with root package name */
    private final Uri f7743e;

    /* renamed from: f, reason: collision with root package name */
    private final h.a f7744f;

    /* renamed from: g, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.e.h f7745g;

    /* renamed from: h, reason: collision with root package name */
    private final int f7746h;
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    private final int f7747j;

    /* renamed from: k, reason: collision with root package name */
    private final Object f7748k;

    /* renamed from: l, reason: collision with root package name */
    private long f7749l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f7750m;

    @Deprecated
    public interface a {
        void a();
    }

    public static final class b extends k {

        /* renamed from: a, reason: collision with root package name */
        private final a f7751a;

        public b(a aVar) {
            this.f7751a = (a) com.anythink.basead.exoplayer.k.a.a(aVar);
        }

        @Override // com.anythink.basead.exoplayer.h.k, com.anythink.basead.exoplayer.h.t
        public final void a(int i, s.a aVar, t.b bVar, t.c cVar, IOException iOException, boolean z3) {
        }
    }

    public static final class c implements c.e {

        /* renamed from: a, reason: collision with root package name */
        private final h.a f7752a;

        /* renamed from: b, reason: collision with root package name */
        private com.anythink.basead.exoplayer.e.h f7753b;

        /* renamed from: c, reason: collision with root package name */
        private String f7754c;

        /* renamed from: d, reason: collision with root package name */
        private Object f7755d;

        /* renamed from: e, reason: collision with root package name */
        private int f7756e = -1;

        /* renamed from: f, reason: collision with root package name */
        private int f7757f = o.f7742d;

        /* renamed from: g, reason: collision with root package name */
        private boolean f7758g;

        public c(h.a aVar) {
            this.f7752a = aVar;
        }

        private c a(com.anythink.basead.exoplayer.e.h hVar) {
            com.anythink.basead.exoplayer.k.a.b(!this.f7758g);
            this.f7753b = hVar;
            return this;
        }

        private c b(int i) {
            com.anythink.basead.exoplayer.k.a.b(!this.f7758g);
            this.f7757f = i;
            return this;
        }

        private c a(String str) {
            com.anythink.basead.exoplayer.k.a.b(!this.f7758g);
            this.f7754c = str;
            return this;
        }

        private c a(Object obj) {
            com.anythink.basead.exoplayer.k.a.b(!this.f7758g);
            this.f7755d = obj;
            return this;
        }

        private c a(int i) {
            com.anythink.basead.exoplayer.k.a.b(!this.f7758g);
            this.f7756e = i;
            return this;
        }

        @Override // com.anythink.basead.exoplayer.h.a.c.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o b(Uri uri) {
            this.f7758g = true;
            if (this.f7753b == null) {
                this.f7753b = new com.anythink.basead.exoplayer.e.c();
            }
            return new o(uri, this.f7752a, this.f7753b, this.f7756e, this.f7754c, this.f7757f, this.f7755d, (byte) 0);
        }

        @Deprecated
        private o a(Uri uri, Handler handler, t tVar) {
            o b9 = b(uri);
            if (handler != null && tVar != null) {
                b9.a(handler, tVar);
            }
            return b9;
        }

        @Override // com.anythink.basead.exoplayer.h.a.c.e
        public final int[] a() {
            return new int[]{3};
        }
    }

    public /* synthetic */ o(Uri uri, h.a aVar, com.anythink.basead.exoplayer.e.h hVar, int i, String str, int i6, Object obj, byte b9) {
        this(uri, aVar, hVar, i, str, i6, obj);
    }

    @Override // com.anythink.basead.exoplayer.h.c
    public final void a() {
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void b() {
    }

    @Deprecated
    private o(Uri uri, h.a aVar, com.anythink.basead.exoplayer.e.h hVar, Handler handler, a aVar2) {
        this(uri, aVar, hVar, handler, aVar2, null);
    }

    private void b(long j6, boolean z3) {
        this.f7749l = j6;
        this.f7750m = z3;
        a(new ab(this.f7749l, this.f7750m, false, this.f7748k), (Object) null);
    }

    @Override // com.anythink.basead.exoplayer.h.c
    public final void a(com.anythink.basead.exoplayer.h hVar, boolean z3) {
        b(this.f7749l, false);
    }

    @Deprecated
    private o(Uri uri, h.a aVar, com.anythink.basead.exoplayer.e.h hVar, Handler handler, a aVar2, String str) {
        this(uri, aVar, hVar, handler, aVar2, str, (byte) 0);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final r a(s.a aVar, com.anythink.basead.exoplayer.j.b bVar) {
        com.anythink.basead.exoplayer.k.a.a(aVar.f7767a == 0);
        return new n(this.f7743e, this.f7744f.a(), this.f7745g.a(), this.f7746h, a(aVar), this, bVar, this.i, this.f7747j);
    }

    @Deprecated
    private o(Uri uri, h.a aVar, com.anythink.basead.exoplayer.e.h hVar, Handler handler, a aVar2, String str, byte b9) {
        this(uri, aVar, hVar, -1, str, f7742d, (Object) null);
        if (aVar2 == null || handler == null) {
            return;
        }
        a(handler, new b(aVar2));
    }

    private o(Uri uri, h.a aVar, com.anythink.basead.exoplayer.e.h hVar, int i, String str, int i6, Object obj) {
        this.f7743e = uri;
        this.f7744f = aVar;
        this.f7745g = hVar;
        this.f7746h = i;
        this.i = str;
        this.f7747j = i6;
        this.f7749l = com.anythink.basead.exoplayer.b.f6382b;
        this.f7748k = obj;
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(r rVar) {
        ((n) rVar).f();
    }

    @Override // com.anythink.basead.exoplayer.h.n.c
    public final void a(long j6, boolean z3) {
        if (j6 == com.anythink.basead.exoplayer.b.f6382b) {
            j6 = this.f7749l;
        }
        if (this.f7749l == j6 && this.f7750m == z3) {
            return;
        }
        b(j6, z3);
    }
}
