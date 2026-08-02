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
    public static final int f8283a = 3;

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.k f8284b;

    /* renamed from: c, reason: collision with root package name */
    private final h.a f8285c;

    /* renamed from: d, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.m f8286d;

    /* renamed from: e, reason: collision with root package name */
    private final long f8287e;

    /* renamed from: f, reason: collision with root package name */
    private final int f8288f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f8289g;

    /* renamed from: h, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.ae f8290h;

    @Deprecated
    public interface a {
        void a();
    }

    public static final class b extends k {

        /* renamed from: a, reason: collision with root package name */
        private final a f8291a;

        /* renamed from: b, reason: collision with root package name */
        private final int f8292b;

        public b(a aVar, int i) {
            this.f8291a = (a) com.anythink.basead.exoplayer.k.a.a(aVar);
            this.f8292b = i;
        }

        @Override // com.anythink.basead.exoplayer.h.k, com.anythink.basead.exoplayer.h.t
        public final void a(int i, s.a aVar, t.b bVar, t.c cVar, IOException iOException, boolean z6) {
        }
    }

    public /* synthetic */ ad(Uri uri, h.a aVar, com.anythink.basead.exoplayer.m mVar, long j6, int i, boolean z6, Object obj, byte b9) {
        this(uri, aVar, mVar, j6, i, z6, obj);
    }

    @Override // com.anythink.basead.exoplayer.h.c
    public final void a() {
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void b() {
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final h.a f8293a;

        /* renamed from: b, reason: collision with root package name */
        private int f8294b = 3;

        /* renamed from: c, reason: collision with root package name */
        private boolean f8295c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f8296d;

        /* renamed from: e, reason: collision with root package name */
        private Object f8297e;

        private c(h.a aVar) {
            this.f8293a = (h.a) com.anythink.basead.exoplayer.k.a.a(aVar);
        }

        private c a(Object obj) {
            com.anythink.basead.exoplayer.k.a.b(!this.f8296d);
            this.f8297e = obj;
            return this;
        }

        private c a(int i) {
            com.anythink.basead.exoplayer.k.a.b(!this.f8296d);
            this.f8294b = i;
            return this;
        }

        private c a(boolean z6) {
            com.anythink.basead.exoplayer.k.a.b(!this.f8296d);
            this.f8295c = z6;
            return this;
        }

        private ad a(Uri uri, com.anythink.basead.exoplayer.m mVar, long j6) {
            this.f8296d = true;
            return new ad(uri, this.f8293a, mVar, j6, this.f8294b, this.f8295c, this.f8297e, (byte) 0);
        }

        @Deprecated
        private ad a(Uri uri, com.anythink.basead.exoplayer.m mVar, long j6, Handler handler, t tVar) {
            this.f8296d = true;
            ad adVar = new ad(uri, this.f8293a, mVar, j6, this.f8294b, this.f8295c, this.f8297e, (byte) 0);
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
    public final void a(com.anythink.basead.exoplayer.h hVar, boolean z6) {
        a(this.f8290h, (Object) null);
    }

    @Deprecated
    private ad(Uri uri, h.a aVar, com.anythink.basead.exoplayer.m mVar, long j6, byte b9) {
        this(uri, aVar, mVar, j6, 3, false, null);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final r a(s.a aVar, com.anythink.basead.exoplayer.j.b bVar) {
        com.anythink.basead.exoplayer.k.a.a(aVar.f8553a == 0);
        return new ac(this.f8284b, this.f8285c, this.f8286d, this.f8287e, this.f8288f, a(aVar), this.f8289g);
    }

    @Deprecated
    private ad(Uri uri, h.a aVar, com.anythink.basead.exoplayer.m mVar, long j6, int i, Handler handler, a aVar2, int i4, boolean z6) {
        this(uri, aVar, mVar, j6, i, z6, null);
        if (handler == null || aVar2 == null) {
            return;
        }
        a(handler, new b(aVar2, i4));
    }

    private ad(Uri uri, h.a aVar, com.anythink.basead.exoplayer.m mVar, long j6, int i, boolean z6, Object obj) {
        this.f8285c = aVar;
        this.f8286d = mVar;
        this.f8287e = j6;
        this.f8288f = i;
        this.f8289g = z6;
        this.f8284b = new com.anythink.basead.exoplayer.j.k(uri);
        this.f8290h = new ab(j6, true, false, obj);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(r rVar) {
        ((ac) rVar).f();
    }
}
