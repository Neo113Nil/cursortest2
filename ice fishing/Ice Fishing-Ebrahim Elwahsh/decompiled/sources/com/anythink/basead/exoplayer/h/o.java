package com.anythink.basead.exoplayer.h;

import android.net.Uri;
import android.os.Handler;
import com.anythink.basead.exoplayer.h.a.c;
import com.anythink.basead.exoplayer.h.n;
import com.anythink.basead.exoplayer.h.s;
import com.anythink.basead.exoplayer.h.t;
import com.anythink.basead.exoplayer.j.h;
import com.anythink.basead.exoplayer.k.C0544a;
import java.io.IOException;

/* loaded from: classes.dex */
public final class o extends com.anythink.basead.exoplayer.h.c implements n.c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7896a = 3;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7897b = 6;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7898c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7899d = 1048576;

    /* renamed from: e, reason: collision with root package name */
    private final Uri f7900e;

    /* renamed from: f, reason: collision with root package name */
    private final h.a f7901f;

    /* renamed from: g, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.e.h f7902g;

    /* renamed from: h, reason: collision with root package name */
    private final int f7903h;
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    private final int f7904j;

    /* renamed from: k, reason: collision with root package name */
    private final Object f7905k;

    /* renamed from: l, reason: collision with root package name */
    private long f7906l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f7907m;

    @Deprecated
    public interface a {
        void a();
    }

    public static final class b extends k {

        /* renamed from: a, reason: collision with root package name */
        private final a f7908a;

        public b(a aVar) {
            this.f7908a = (a) C0544a.a(aVar);
        }

        @Override // com.anythink.basead.exoplayer.h.k, com.anythink.basead.exoplayer.h.t
        public final void a(int i, s.a aVar, t.b bVar, t.c cVar, IOException iOException, boolean z8) {
        }
    }

    public static final class c implements c.e {

        /* renamed from: a, reason: collision with root package name */
        private final h.a f7909a;

        /* renamed from: b, reason: collision with root package name */
        private com.anythink.basead.exoplayer.e.h f7910b;

        /* renamed from: c, reason: collision with root package name */
        private String f7911c;

        /* renamed from: d, reason: collision with root package name */
        private Object f7912d;

        /* renamed from: e, reason: collision with root package name */
        private int f7913e = -1;

        /* renamed from: f, reason: collision with root package name */
        private int f7914f = o.f7899d;

        /* renamed from: g, reason: collision with root package name */
        private boolean f7915g;

        public c(h.a aVar) {
            this.f7909a = aVar;
        }

        private c a(com.anythink.basead.exoplayer.e.h hVar) {
            C0544a.b(!this.f7915g);
            this.f7910b = hVar;
            return this;
        }

        private c b(int i) {
            C0544a.b(!this.f7915g);
            this.f7914f = i;
            return this;
        }

        private c a(String str) {
            C0544a.b(!this.f7915g);
            this.f7911c = str;
            return this;
        }

        private c a(Object obj) {
            C0544a.b(!this.f7915g);
            this.f7912d = obj;
            return this;
        }

        private c a(int i) {
            C0544a.b(!this.f7915g);
            this.f7913e = i;
            return this;
        }

        @Override // com.anythink.basead.exoplayer.h.a.c.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o b(Uri uri) {
            this.f7915g = true;
            if (this.f7910b == null) {
                this.f7910b = new com.anythink.basead.exoplayer.e.c();
            }
            return new o(uri, this.f7909a, this.f7910b, this.f7913e, this.f7911c, this.f7914f, this.f7912d, (byte) 0);
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

    private void b(long j9, boolean z8) {
        this.f7906l = j9;
        this.f7907m = z8;
        a(new ab(this.f7906l, this.f7907m, false, this.f7905k), (Object) null);
    }

    @Override // com.anythink.basead.exoplayer.h.c
    public final void a(com.anythink.basead.exoplayer.h hVar, boolean z8) {
        b(this.f7906l, false);
    }

    @Deprecated
    private o(Uri uri, h.a aVar, com.anythink.basead.exoplayer.e.h hVar, Handler handler, a aVar2, String str) {
        this(uri, aVar, hVar, handler, aVar2, str, (byte) 0);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final r a(s.a aVar, com.anythink.basead.exoplayer.j.b bVar) {
        C0544a.a(aVar.f7924a == 0);
        return new n(this.f7900e, this.f7901f.a(), this.f7902g.a(), this.f7903h, a(aVar), this, bVar, this.i, this.f7904j);
    }

    @Deprecated
    private o(Uri uri, h.a aVar, com.anythink.basead.exoplayer.e.h hVar, Handler handler, a aVar2, String str, byte b9) {
        this(uri, aVar, hVar, -1, str, f7899d, (Object) null);
        if (aVar2 == null || handler == null) {
            return;
        }
        a(handler, new b(aVar2));
    }

    private o(Uri uri, h.a aVar, com.anythink.basead.exoplayer.e.h hVar, int i, String str, int i4, Object obj) {
        this.f7900e = uri;
        this.f7901f = aVar;
        this.f7902g = hVar;
        this.f7903h = i;
        this.i = str;
        this.f7904j = i4;
        this.f7906l = com.anythink.basead.exoplayer.b.f6539b;
        this.f7905k = obj;
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(r rVar) {
        ((n) rVar).f();
    }

    @Override // com.anythink.basead.exoplayer.h.n.c
    public final void a(long j9, boolean z8) {
        if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
            j9 = this.f7906l;
        }
        if (this.f7906l == j9 && this.f7907m == z8) {
            return;
        }
        b(j9, z8);
    }
}
