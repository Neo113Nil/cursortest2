package com.anythink.basead.exoplayer.h;

import android.os.Handler;
import com.anythink.basead.exoplayer.h.s;
import com.anythink.basead.exoplayer.h.t;
import com.anythink.basead.exoplayer.k.C0544a;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class f<T> extends c {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<T, b> f7779a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.basead.exoplayer.h f7780b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f7781c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final s f7787a;

        /* renamed from: b, reason: collision with root package name */
        public final s.b f7788b;

        /* renamed from: c, reason: collision with root package name */
        public final t f7789c;

        public b(s sVar, s.b bVar, t tVar) {
            this.f7787a = sVar;
            this.f7788b = bVar;
            this.f7789c = tVar;
        }
    }

    public int a(T t9, int i) {
        return i;
    }

    public abstract void a(T t9, s sVar, com.anythink.basead.exoplayer.ae aeVar, Object obj);

    @Override // com.anythink.basead.exoplayer.h.s
    public void b() {
        Iterator<b> it = this.f7779a.values().iterator();
        while (it.hasNext()) {
            it.next().f7787a.b();
        }
    }

    public final class a implements t {

        /* renamed from: b, reason: collision with root package name */
        private final T f7785b;

        /* renamed from: c, reason: collision with root package name */
        private t.a f7786c;

        public a(T t9) {
            this.f7786c = f.this.a((s.a) null);
            this.f7785b = t9;
        }

        private boolean d(int i, s.a aVar) {
            s.a aVar2;
            if (aVar != null) {
                aVar2 = f.this.a((f) this.f7785b, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int a9 = f.this.a((f) this.f7785b, i);
            t.a aVar3 = this.f7786c;
            if (aVar3.f7928a == a9 && com.anythink.basead.exoplayer.k.af.a(aVar3.f7929b, aVar2)) {
                return true;
            }
            this.f7786c = f.this.a(a9, aVar2);
            return true;
        }

        @Override // com.anythink.basead.exoplayer.h.t
        public final void a(int i, s.a aVar) {
            if (d(i, aVar)) {
                this.f7786c.a();
            }
        }

        @Override // com.anythink.basead.exoplayer.h.t
        public final void b(int i, s.a aVar) {
            if (d(i, aVar)) {
                this.f7786c.b();
            }
        }

        @Override // com.anythink.basead.exoplayer.h.t
        public final void c(int i, s.a aVar, t.b bVar, t.c cVar) {
            if (d(i, aVar)) {
                this.f7786c.c(bVar, a(cVar));
            }
        }

        @Override // com.anythink.basead.exoplayer.h.t
        public final void a(int i, s.a aVar, t.b bVar, t.c cVar) {
            if (d(i, aVar)) {
                this.f7786c.a(bVar, a(cVar));
            }
        }

        @Override // com.anythink.basead.exoplayer.h.t
        public final void b(int i, s.a aVar, t.b bVar, t.c cVar) {
            if (d(i, aVar)) {
                this.f7786c.b(bVar, a(cVar));
            }
        }

        @Override // com.anythink.basead.exoplayer.h.t
        public final void c(int i, s.a aVar) {
            if (d(i, aVar)) {
                this.f7786c.c();
            }
        }

        @Override // com.anythink.basead.exoplayer.h.t
        public final void a(int i, s.a aVar, t.b bVar, t.c cVar, IOException iOException, boolean z8) {
            if (d(i, aVar)) {
                this.f7786c.a(bVar, a(cVar), iOException, z8);
            }
        }

        @Override // com.anythink.basead.exoplayer.h.t
        public final void b(int i, s.a aVar, t.c cVar) {
            if (d(i, aVar)) {
                this.f7786c.b(a(cVar));
            }
        }

        @Override // com.anythink.basead.exoplayer.h.t
        public final void a(int i, s.a aVar, t.c cVar) {
            if (d(i, aVar)) {
                this.f7786c.a(a(cVar));
            }
        }

        private t.c a(t.c cVar) {
            long a9 = f.this.a(cVar.f7973f);
            long a10 = f.this.a(cVar.f7974g);
            return (a9 == cVar.f7973f && a10 == cVar.f7974g) ? cVar : new t.c(cVar.f7968a, cVar.f7969b, cVar.f7970c, cVar.f7971d, cVar.f7972e, a9, a10);
        }
    }

    public long a(long j9) {
        return j9;
    }

    public s.a a(T t9, s.a aVar) {
        return aVar;
    }

    @Override // com.anythink.basead.exoplayer.h.c
    public void a(com.anythink.basead.exoplayer.h hVar, boolean z8) {
        this.f7780b = hVar;
        this.f7781c = new Handler();
    }

    @Override // com.anythink.basead.exoplayer.h.c
    public void a() {
        for (b bVar : this.f7779a.values()) {
            bVar.f7787a.a(bVar.f7788b);
            bVar.f7787a.a(bVar.f7789c);
        }
        this.f7779a.clear();
        this.f7780b = null;
    }

    public final void a(final T t9, s sVar) {
        C0544a.a(!this.f7779a.containsKey(t9));
        s.b bVar = new s.b() { // from class: com.anythink.basead.exoplayer.h.f.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.anythink.basead.exoplayer.h.s.b
            public final void a(s sVar2, com.anythink.basead.exoplayer.ae aeVar, Object obj) {
                f.this.a(t9, sVar2, aeVar, obj);
            }
        };
        a aVar = new a(t9);
        this.f7779a.put(t9, new b(sVar, bVar, aVar));
        sVar.a(this.f7781c, aVar);
        sVar.a(this.f7780b, false, bVar);
    }

    public final void a(T t9) {
        b remove = this.f7779a.remove(t9);
        remove.f7787a.a(remove.f7788b);
        remove.f7787a.a(remove.f7789c);
    }
}
