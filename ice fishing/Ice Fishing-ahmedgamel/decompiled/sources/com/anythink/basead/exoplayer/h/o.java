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
    public static final int f8525a = 3;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8526b = 6;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8527c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8528d = 1048576;

    /* renamed from: e, reason: collision with root package name */
    private final Uri f8529e;

    /* renamed from: f, reason: collision with root package name */
    private final h.a f8530f;

    /* renamed from: g, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.e.h f8531g;

    /* renamed from: h, reason: collision with root package name */
    private final int f8532h;
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    private final int f8533j;

    /* renamed from: k, reason: collision with root package name */
    private final Object f8534k;

    /* renamed from: l, reason: collision with root package name */
    private long f8535l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f8536m;

    @Deprecated
    public interface a {
        void a();
    }

    public static final class b extends k {

        /* renamed from: a, reason: collision with root package name */
        private final a f8537a;

        public b(a aVar) {
            this.f8537a = (a) com.anythink.basead.exoplayer.k.a.a(aVar);
        }

        @Override // com.anythink.basead.exoplayer.h.k, com.anythink.basead.exoplayer.h.t
        public final void a(int i, s.a aVar, t.b bVar, t.c cVar, IOException iOException, boolean z6) {
        }
    }

    public static final class c implements c.e {

        /* renamed from: a, reason: collision with root package name */
        private final h.a f8538a;

        /* renamed from: b, reason: collision with root package name */
        private com.anythink.basead.exoplayer.e.h f8539b;

        /* renamed from: c, reason: collision with root package name */
        private String f8540c;

        /* renamed from: d, reason: collision with root package name */
        private Object f8541d;

        /* renamed from: e, reason: collision with root package name */
        private int f8542e = -1;

        /* renamed from: f, reason: collision with root package name */
        private int f8543f = o.f8528d;

        /* renamed from: g, reason: collision with root package name */
        private boolean f8544g;

        public c(h.a aVar) {
            this.f8538a = aVar;
        }

        private c a(com.anythink.basead.exoplayer.e.h hVar) {
            com.anythink.basead.exoplayer.k.a.b(!this.f8544g);
            this.f8539b = hVar;
            return this;
        }

        private c b(int i) {
            com.anythink.basead.exoplayer.k.a.b(!this.f8544g);
            this.f8543f = i;
            return this;
        }

        private c a(String str) {
            com.anythink.basead.exoplayer.k.a.b(!this.f8544g);
            this.f8540c = str;
            return this;
        }

        private c a(Object obj) {
            com.anythink.basead.exoplayer.k.a.b(!this.f8544g);
            this.f8541d = obj;
            return this;
        }

        private c a(int i) {
            com.anythink.basead.exoplayer.k.a.b(!this.f8544g);
            this.f8542e = i;
            return this;
        }

        @Override // com.anythink.basead.exoplayer.h.a.c.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o b(Uri uri) {
            this.f8544g = true;
            if (this.f8539b == null) {
                this.f8539b = new com.anythink.basead.exoplayer.e.c();
            }
            return new o(uri, this.f8538a, this.f8539b, this.f8542e, this.f8540c, this.f8543f, this.f8541d, (byte) 0);
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

    public /* synthetic */ o(Uri uri, h.a aVar, com.anythink.basead.exoplayer.e.h hVar, int i, String str, int i4, Object obj, byte b9) {
        this(uri, aVar, hVar, i, str, i4, obj);
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

    private void b(long j6, boolean z6) {
        this.f8535l = j6;
        this.f8536m = z6;
        a(new ab(this.f8535l, this.f8536m, false, this.f8534k), (Object) null);
    }

    @Override // com.anythink.basead.exoplayer.h.c
    public final void a(com.anythink.basead.exoplayer.h hVar, boolean z6) {
        b(this.f8535l, false);
    }

    @Deprecated
    private o(Uri uri, h.a aVar, com.anythink.basead.exoplayer.e.h hVar, Handler handler, a aVar2, String str) {
        this(uri, aVar, hVar, handler, aVar2, str, (byte) 0);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final r a(s.a aVar, com.anythink.basead.exoplayer.j.b bVar) {
        com.anythink.basead.exoplayer.k.a.a(aVar.f8553a == 0);
        return new n(this.f8529e, this.f8530f.a(), this.f8531g.a(), this.f8532h, a(aVar), this, bVar, this.i, this.f8533j);
    }

    @Deprecated
    private o(Uri uri, h.a aVar, com.anythink.basead.exoplayer.e.h hVar, Handler handler, a aVar2, String str, byte b9) {
        this(uri, aVar, hVar, -1, str, f8528d, (Object) null);
        if (aVar2 == null || handler == null) {
            return;
        }
        a(handler, new b(aVar2));
    }

    private o(Uri uri, h.a aVar, com.anythink.basead.exoplayer.e.h hVar, int i, String str, int i4, Object obj) {
        this.f8529e = uri;
        this.f8530f = aVar;
        this.f8531g = hVar;
        this.f8532h = i;
        this.i = str;
        this.f8533j = i4;
        this.f8535l = com.anythink.basead.exoplayer.b.f7168b;
        this.f8534k = obj;
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(r rVar) {
        ((n) rVar).f();
    }

    @Override // com.anythink.basead.exoplayer.h.n.c
    public final void a(long j6, boolean z6) {
        if (j6 == com.anythink.basead.exoplayer.b.f7168b) {
            j6 = this.f8535l;
        }
        if (this.f8535l == j6 && this.f8536m == z6) {
            return;
        }
        b(j6, z6);
    }
}
