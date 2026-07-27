package com.anythink.basead.exoplayer.h;

import android.os.Handler;
import com.anythink.basead.exoplayer.h.s;
import com.anythink.basead.exoplayer.h.t;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class f<T> extends c {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<T, b> f7622a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.basead.exoplayer.h f7623b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f7624c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final s f7630a;

        /* renamed from: b, reason: collision with root package name */
        public final s.b f7631b;

        /* renamed from: c, reason: collision with root package name */
        public final t f7632c;

        public b(s sVar, s.b bVar, t tVar) {
            this.f7630a = sVar;
            this.f7631b = bVar;
            this.f7632c = tVar;
        }
    }

    public int a(T t6, int i) {
        return i;
    }

    public abstract void a(T t6, s sVar, com.anythink.basead.exoplayer.ae aeVar, Object obj);

    @Override // com.anythink.basead.exoplayer.h.s
    public void b() {
        Iterator<b> it = this.f7622a.values().iterator();
        while (it.hasNext()) {
            it.next().f7630a.b();
        }
    }

    public final class a implements t {

        /* renamed from: b, reason: collision with root package name */
        private final T f7628b;

        /* renamed from: c, reason: collision with root package name */
        private t.a f7629c;

        public a(T t6) {
            this.f7629c = f.this.a((s.a) null);
            this.f7628b = t6;
        }

        private boolean d(int i, s.a aVar) {
            s.a aVar2;
            if (aVar != null) {
                aVar2 = f.this.a((f) this.f7628b, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int a9 = f.this.a((f) this.f7628b, i);
            t.a aVar3 = this.f7629c;
            if (aVar3.f7771a == a9 && com.anythink.basead.exoplayer.k.af.a(aVar3.f7772b, aVar2)) {
                return true;
            }
            this.f7629c = f.this.a(a9, aVar2);
            return true;
        }

        @Override // com.anythink.basead.exoplayer.h.t
        public final void a(int i, s.a aVar) {
            if (d(i, aVar)) {
                this.f7629c.a();
            }
        }

        @Override // com.anythink.basead.exoplayer.h.t
        public final void b(int i, s.a aVar) {
            if (d(i, aVar)) {
                this.f7629c.b();
            }
        }

        @Override // com.anythink.basead.exoplayer.h.t
        public final void c(int i, s.a aVar, t.b bVar, t.c cVar) {
            if (d(i, aVar)) {
                this.f7629c.c(bVar, a(cVar));
            }
        }

        @Override // com.anythink.basead.exoplayer.h.t
        public final void a(int i, s.a aVar, t.b bVar, t.c cVar) {
            if (d(i, aVar)) {
                this.f7629c.a(bVar, a(cVar));
            }
        }

        @Override // com.anythink.basead.exoplayer.h.t
        public final void b(int i, s.a aVar, t.b bVar, t.c cVar) {
            if (d(i, aVar)) {
                this.f7629c.b(bVar, a(cVar));
            }
        }

        @Override // com.anythink.basead.exoplayer.h.t
        public final void c(int i, s.a aVar) {
            if (d(i, aVar)) {
                this.f7629c.c();
            }
        }

        @Override // com.anythink.basead.exoplayer.h.t
        public final void a(int i, s.a aVar, t.b bVar, t.c cVar, IOException iOException, boolean z3) {
            if (d(i, aVar)) {
                this.f7629c.a(bVar, a(cVar), iOException, z3);
            }
        }

        @Override // com.anythink.basead.exoplayer.h.t
        public final void b(int i, s.a aVar, t.c cVar) {
            if (d(i, aVar)) {
                this.f7629c.b(a(cVar));
            }
        }

        @Override // com.anythink.basead.exoplayer.h.t
        public final void a(int i, s.a aVar, t.c cVar) {
            if (d(i, aVar)) {
                this.f7629c.a(a(cVar));
            }
        }

        private t.c a(t.c cVar) {
            long a9 = f.this.a(cVar.f7816f);
            long a10 = f.this.a(cVar.f7817g);
            return (a9 == cVar.f7816f && a10 == cVar.f7817g) ? cVar : new t.c(cVar.f7811a, cVar.f7812b, cVar.f7813c, cVar.f7814d, cVar.f7815e, a9, a10);
        }
    }

    public long a(long j6) {
        return j6;
    }

    public s.a a(T t6, s.a aVar) {
        return aVar;
    }

    @Override // com.anythink.basead.exoplayer.h.c
    public void a(com.anythink.basead.exoplayer.h hVar, boolean z3) {
        this.f7623b = hVar;
        this.f7624c = new Handler();
    }

    @Override // com.anythink.basead.exoplayer.h.c
    public void a() {
        for (b bVar : this.f7622a.values()) {
            bVar.f7630a.a(bVar.f7631b);
            bVar.f7630a.a(bVar.f7632c);
        }
        this.f7622a.clear();
        this.f7623b = null;
    }

    public final void a(final T t6, s sVar) {
        com.anythink.basead.exoplayer.k.a.a(!this.f7622a.containsKey(t6));
        s.b bVar = new s.b() { // from class: com.anythink.basead.exoplayer.h.f.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.anythink.basead.exoplayer.h.s.b
            public final void a(s sVar2, com.anythink.basead.exoplayer.ae aeVar, Object obj) {
                f.this.a(t6, sVar2, aeVar, obj);
            }
        };
        a aVar = new a(t6);
        this.f7622a.put(t6, new b(sVar, bVar, aVar));
        sVar.a(this.f7624c, aVar);
        sVar.a(this.f7623b, false, bVar);
    }

    public final void a(T t6) {
        b remove = this.f7622a.remove(t6);
        remove.f7630a.a(remove.f7631b);
        remove.f7630a.a(remove.f7632c);
    }
}
