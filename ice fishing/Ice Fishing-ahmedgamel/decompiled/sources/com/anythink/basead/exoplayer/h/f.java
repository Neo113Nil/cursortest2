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
    private final HashMap<T, b> f8408a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.basead.exoplayer.h f8409b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f8410c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final s f8416a;

        /* renamed from: b, reason: collision with root package name */
        public final s.b f8417b;

        /* renamed from: c, reason: collision with root package name */
        public final t f8418c;

        public b(s sVar, s.b bVar, t tVar) {
            this.f8416a = sVar;
            this.f8417b = bVar;
            this.f8418c = tVar;
        }
    }

    public int a(T t6, int i) {
        return i;
    }

    public abstract void a(T t6, s sVar, com.anythink.basead.exoplayer.ae aeVar, Object obj);

    @Override // com.anythink.basead.exoplayer.h.s
    public void b() {
        Iterator<b> it = this.f8408a.values().iterator();
        while (it.hasNext()) {
            it.next().f8416a.b();
        }
    }

    public final class a implements t {

        /* renamed from: b, reason: collision with root package name */
        private final T f8414b;

        /* renamed from: c, reason: collision with root package name */
        private t.a f8415c;

        public a(T t6) {
            this.f8415c = f.this.a((s.a) null);
            this.f8414b = t6;
        }

        private boolean d(int i, s.a aVar) {
            s.a aVar2;
            if (aVar != null) {
                aVar2 = f.this.a((f) this.f8414b, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int a9 = f.this.a((f) this.f8414b, i);
            t.a aVar3 = this.f8415c;
            if (aVar3.f8557a == a9 && com.anythink.basead.exoplayer.k.af.a(aVar3.f8558b, aVar2)) {
                return true;
            }
            this.f8415c = f.this.a(a9, aVar2);
            return true;
        }

        @Override // com.anythink.basead.exoplayer.h.t
        public final void a(int i, s.a aVar) {
            if (d(i, aVar)) {
                this.f8415c.a();
            }
        }

        @Override // com.anythink.basead.exoplayer.h.t
        public final void b(int i, s.a aVar) {
            if (d(i, aVar)) {
                this.f8415c.b();
            }
        }

        @Override // com.anythink.basead.exoplayer.h.t
        public final void c(int i, s.a aVar, t.b bVar, t.c cVar) {
            if (d(i, aVar)) {
                this.f8415c.c(bVar, a(cVar));
            }
        }

        @Override // com.anythink.basead.exoplayer.h.t
        public final void a(int i, s.a aVar, t.b bVar, t.c cVar) {
            if (d(i, aVar)) {
                this.f8415c.a(bVar, a(cVar));
            }
        }

        @Override // com.anythink.basead.exoplayer.h.t
        public final void b(int i, s.a aVar, t.b bVar, t.c cVar) {
            if (d(i, aVar)) {
                this.f8415c.b(bVar, a(cVar));
            }
        }

        @Override // com.anythink.basead.exoplayer.h.t
        public final void c(int i, s.a aVar) {
            if (d(i, aVar)) {
                this.f8415c.c();
            }
        }

        @Override // com.anythink.basead.exoplayer.h.t
        public final void a(int i, s.a aVar, t.b bVar, t.c cVar, IOException iOException, boolean z6) {
            if (d(i, aVar)) {
                this.f8415c.a(bVar, a(cVar), iOException, z6);
            }
        }

        @Override // com.anythink.basead.exoplayer.h.t
        public final void b(int i, s.a aVar, t.c cVar) {
            if (d(i, aVar)) {
                this.f8415c.b(a(cVar));
            }
        }

        @Override // com.anythink.basead.exoplayer.h.t
        public final void a(int i, s.a aVar, t.c cVar) {
            if (d(i, aVar)) {
                this.f8415c.a(a(cVar));
            }
        }

        private t.c a(t.c cVar) {
            long a9 = f.this.a(cVar.f8602f);
            long a10 = f.this.a(cVar.f8603g);
            return (a9 == cVar.f8602f && a10 == cVar.f8603g) ? cVar : new t.c(cVar.f8597a, cVar.f8598b, cVar.f8599c, cVar.f8600d, cVar.f8601e, a9, a10);
        }
    }

    public long a(long j6) {
        return j6;
    }

    public s.a a(T t6, s.a aVar) {
        return aVar;
    }

    @Override // com.anythink.basead.exoplayer.h.c
    public void a(com.anythink.basead.exoplayer.h hVar, boolean z6) {
        this.f8409b = hVar;
        this.f8410c = new Handler();
    }

    @Override // com.anythink.basead.exoplayer.h.c
    public void a() {
        for (b bVar : this.f8408a.values()) {
            bVar.f8416a.a(bVar.f8417b);
            bVar.f8416a.a(bVar.f8418c);
        }
        this.f8408a.clear();
        this.f8409b = null;
    }

    public final void a(final T t6, s sVar) {
        com.anythink.basead.exoplayer.k.a.a(!this.f8408a.containsKey(t6));
        s.b bVar = new s.b() { // from class: com.anythink.basead.exoplayer.h.f.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.anythink.basead.exoplayer.h.s.b
            public final void a(s sVar2, com.anythink.basead.exoplayer.ae aeVar, Object obj) {
                f.this.a(t6, sVar2, aeVar, obj);
            }
        };
        a aVar = new a(t6);
        this.f8408a.put(t6, new b(sVar, bVar, aVar));
        sVar.a(this.f8410c, aVar);
        sVar.a(this.f8409b, false, bVar);
    }

    public final void a(T t6) {
        b remove = this.f8408a.remove(t6);
        remove.f8416a.a(remove.f8417b);
        remove.f8416a.a(remove.f8418c);
    }
}
