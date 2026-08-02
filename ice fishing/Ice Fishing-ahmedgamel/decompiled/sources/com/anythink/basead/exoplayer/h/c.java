package com.anythink.basead.exoplayer.h;

import android.os.Handler;
import com.anythink.basead.exoplayer.h.s;
import com.anythink.basead.exoplayer.h.t;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class c implements s {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<s.b> f8374a = new ArrayList<>(1);

    /* renamed from: b, reason: collision with root package name */
    private final t.a f8375b = new t.a();

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.basead.exoplayer.h f8376c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.basead.exoplayer.ae f8377d;

    /* renamed from: e, reason: collision with root package name */
    private Object f8378e;

    public abstract void a();

    public final void a(com.anythink.basead.exoplayer.ae aeVar, Object obj) {
        this.f8377d = aeVar;
        this.f8378e = obj;
        Iterator<s.b> it = this.f8374a.iterator();
        while (it.hasNext()) {
            it.next().a(this, aeVar, obj);
        }
    }

    public abstract void a(com.anythink.basead.exoplayer.h hVar, boolean z6);

    public final t.a a(s.a aVar) {
        return this.f8375b.a(0, aVar, 0L);
    }

    private t.a a(s.a aVar, long j6) {
        com.anythink.basead.exoplayer.k.a.a(aVar != null);
        return this.f8375b.a(0, aVar, j6);
    }

    public final t.a a(int i, s.a aVar) {
        return this.f8375b.a(i, aVar, 0L);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(Handler handler, t tVar) {
        this.f8375b.a(handler, tVar);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(t tVar) {
        this.f8375b.a(tVar);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(com.anythink.basead.exoplayer.h hVar, boolean z6, s.b bVar) {
        com.anythink.basead.exoplayer.h hVar2 = this.f8376c;
        com.anythink.basead.exoplayer.k.a.a(hVar2 == null || hVar2 == hVar);
        this.f8374a.add(bVar);
        if (this.f8376c == null) {
            this.f8376c = hVar;
            a(hVar, z6);
        } else {
            com.anythink.basead.exoplayer.ae aeVar = this.f8377d;
            if (aeVar != null) {
                bVar.a(this, aeVar, this.f8378e);
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(s.b bVar) {
        this.f8374a.remove(bVar);
        if (this.f8374a.isEmpty()) {
            this.f8376c = null;
            this.f8377d = null;
            this.f8378e = null;
            a();
        }
    }
}
