package com.anythink.basead.exoplayer.h;

import android.net.Uri;
import android.os.Handler;
import com.anythink.basead.exoplayer.h.s;
import com.anythink.basead.exoplayer.h.t;
import com.anythink.basead.exoplayer.j.h;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ad extends com.anythink.basead.exoplayer.h.c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7497a = 3;

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.k f7498b;

    /* renamed from: c, reason: collision with root package name */
    private final h.a f7499c;

    /* renamed from: d, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.m f7500d;

    /* renamed from: e, reason: collision with root package name */
    private final long f7501e;

    /* renamed from: f, reason: collision with root package name */
    private final int f7502f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f7503g;

    /* renamed from: h, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.ae f7504h;

    @Deprecated
    public interface a {
        void a();
    }

    public static final class b extends k {

        /* renamed from: a, reason: collision with root package name */
        private final a f7505a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7506b;

        public b(a aVar, int i) {
            this.f7505a = (a) com.anythink.basead.exoplayer.k.a.a(aVar);
            this.f7506b = i;
        }

        @Override // com.anythink.basead.exoplayer.h.k, com.anythink.basead.exoplayer.h.t
        public final void a(int i, s.a aVar, t.b bVar, t.c cVar, IOException iOException, boolean z3) {
        }
    }

    public /* synthetic */ ad(Uri uri, h.a aVar, com.anythink.basead.exoplayer.m mVar, long j6, int i, boolean z3, Object obj, byte b9) {
        this(uri, aVar, mVar, j6, i, z3, obj);
    }

    @Override // com.anythink.basead.exoplayer.h.c
    public final void a() {
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void b() {
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final h.a f7507a;

        /* renamed from: b, reason: collision with root package name */
        private int f7508b = 3;

        /* renamed from: c, reason: collision with root package name */
        private boolean f7509c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f7510d;

        /* renamed from: e, reason: collision with root package name */
        private Object f7511e;

        private c(h.a aVar) {
            this.f7507a = (h.a) com.anythink.basead.exoplayer.k.a.a(aVar);
        }

        private c a(Object obj) {
            com.anythink.basead.exoplayer.k.a.b(!this.f7510d);
            this.f7511e = obj;
            return this;
        }

        private c a(int i) {
            com.anythink.basead.exoplayer.k.a.b(!this.f7510d);
            this.f7508b = i;
            return this;
        }

        private c a(boolean z3) {
            com.anythink.basead.exoplayer.k.a.b(!this.f7510d);
            this.f7509c = z3;
            return this;
        }

        private ad a(Uri uri, com.anythink.basead.exoplayer.m mVar, long j6) {
            this.f7510d = true;
            return new ad(uri, this.f7507a, mVar, j6, this.f7508b, this.f7509c, this.f7511e, (byte) 0);
        }

        @Deprecated
        private ad a(Uri uri, com.anythink.basead.exoplayer.m mVar, long j6, Handler handler, t tVar) {
            this.f7510d = true;
            ad adVar = new ad(uri, this.f7507a, mVar, j6, this.f7508b, this.f7509c, this.f7511e, (byte) 0);
            if (handler != null && tVar != null) {
                adVar.a(handler, tVar);
            }
            return adVar;
        }
    }

    @Deprecated
    private ad(Uri uri, h.a aVar, com.anythink.basead.exoplayer.m mVar, long j6) {
        this(uri, aVar, mVar, j6, (byte) 0);
    }

    @Override // com.anythink.basead.exoplayer.h.c
    public final void a(com.anythink.basead.exoplayer.h hVar, boolean z3) {
        a(this.f7504h, (Object) null);
    }

    @Deprecated
    private ad(Uri uri, h.a aVar, com.anythink.basead.exoplayer.m mVar, long j6, byte b9) {
        this(uri, aVar, mVar, j6, 3, false, null);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final r a(s.a aVar, com.anythink.basead.exoplayer.j.b bVar) {
        com.anythink.basead.exoplayer.k.a.a(aVar.f7767a == 0);
        return new ac(this.f7498b, this.f7499c, this.f7500d, this.f7501e, this.f7502f, a(aVar), this.f7503g);
    }

    @Deprecated
    private ad(Uri uri, h.a aVar, com.anythink.basead.exoplayer.m mVar, long j6, int i, Handler handler, a aVar2, int i6, boolean z3) {
        this(uri, aVar, mVar, j6, i, z3, null);
        if (handler == null || aVar2 == null) {
            return;
        }
        a(handler, new b(aVar2, i6));
    }

    private ad(Uri uri, h.a aVar, com.anythink.basead.exoplayer.m mVar, long j6, int i, boolean z3, Object obj) {
        this.f7499c = aVar;
        this.f7500d = mVar;
        this.f7501e = j6;
        this.f7502f = i;
        this.f7503g = z3;
        this.f7498b = new com.anythink.basead.exoplayer.j.k(uri);
        this.f7504h = new ab(j6, true, false, obj);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(r rVar) {
        ((ac) rVar).f();
    }
}
