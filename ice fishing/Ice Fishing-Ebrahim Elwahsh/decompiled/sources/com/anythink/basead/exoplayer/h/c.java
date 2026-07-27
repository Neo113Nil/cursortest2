package com.anythink.basead.exoplayer.h;

import android.os.Handler;
import com.anythink.basead.exoplayer.h.s;
import com.anythink.basead.exoplayer.h.t;
import com.anythink.basead.exoplayer.k.C0544a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class c implements s {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<s.b> f7745a = new ArrayList<>(1);

    /* renamed from: b, reason: collision with root package name */
    private final t.a f7746b = new t.a();

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.basead.exoplayer.h f7747c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.basead.exoplayer.ae f7748d;

    /* renamed from: e, reason: collision with root package name */
    private Object f7749e;

    public abstract void a();

    public final void a(com.anythink.basead.exoplayer.ae aeVar, Object obj) {
        this.f7748d = aeVar;
        this.f7749e = obj;
        Iterator<s.b> it = this.f7745a.iterator();
        while (it.hasNext()) {
            it.next().a(this, aeVar, obj);
        }
    }

    public abstract void a(com.anythink.basead.exoplayer.h hVar, boolean z8);

    public final t.a a(s.a aVar) {
        return this.f7746b.a(0, aVar, 0L);
    }

    private t.a a(s.a aVar, long j9) {
        C0544a.a(aVar != null);
        return this.f7746b.a(0, aVar, j9);
    }

    public final t.a a(int i, s.a aVar) {
        return this.f7746b.a(i, aVar, 0L);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(Handler handler, t tVar) {
        this.f7746b.a(handler, tVar);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(t tVar) {
        this.f7746b.a(tVar);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(com.anythink.basead.exoplayer.h hVar, boolean z8, s.b bVar) {
        com.anythink.basead.exoplayer.h hVar2 = this.f7747c;
        C0544a.a(hVar2 == null || hVar2 == hVar);
        this.f7745a.add(bVar);
        if (this.f7747c == null) {
            this.f7747c = hVar;
            a(hVar, z8);
        } else {
            com.anythink.basead.exoplayer.ae aeVar = this.f7748d;
            if (aeVar != null) {
                bVar.a(this, aeVar, this.f7749e);
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(s.b bVar) {
        this.f7745a.remove(bVar);
        if (this.f7745a.isEmpty()) {
            this.f7747c = null;
            this.f7748d = null;
            this.f7749e = null;
            a();
        }
    }
}
