package com.anythink.basead.exoplayer.h;

import android.os.Handler;
import com.anythink.basead.exoplayer.h.s;
import com.anythink.basead.exoplayer.h.t;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class c implements s {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<s.b> f7588a = new ArrayList<>(1);

    /* renamed from: b, reason: collision with root package name */
    private final t.a f7589b = new t.a();

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.basead.exoplayer.h f7590c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.basead.exoplayer.ae f7591d;

    /* renamed from: e, reason: collision with root package name */
    private Object f7592e;

    public abstract void a();

    public final void a(com.anythink.basead.exoplayer.ae aeVar, Object obj) {
        this.f7591d = aeVar;
        this.f7592e = obj;
        Iterator<s.b> it = this.f7588a.iterator();
        while (it.hasNext()) {
            it.next().a(this, aeVar, obj);
        }
    }

    public abstract void a(com.anythink.basead.exoplayer.h hVar, boolean z3);

    public final t.a a(s.a aVar) {
        return this.f7589b.a(0, aVar, 0L);
    }

    private t.a a(s.a aVar, long j6) {
        com.anythink.basead.exoplayer.k.a.a(aVar != null);
        return this.f7589b.a(0, aVar, j6);
    }

    public final t.a a(int i, s.a aVar) {
        return this.f7589b.a(i, aVar, 0L);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(Handler handler, t tVar) {
        this.f7589b.a(handler, tVar);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(t tVar) {
        this.f7589b.a(tVar);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(com.anythink.basead.exoplayer.h hVar, boolean z3, s.b bVar) {
        com.anythink.basead.exoplayer.h hVar2 = this.f7590c;
        com.anythink.basead.exoplayer.k.a.a(hVar2 == null || hVar2 == hVar);
        this.f7588a.add(bVar);
        if (this.f7590c == null) {
            this.f7590c = hVar;
            a(hVar, z3);
        } else {
            com.anythink.basead.exoplayer.ae aeVar = this.f7591d;
            if (aeVar != null) {
                bVar.a(this, aeVar, this.f7592e);
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(s.b bVar) {
        this.f7588a.remove(bVar);
        if (this.f7588a.isEmpty()) {
            this.f7590c = null;
            this.f7591d = null;
            this.f7592e = null;
            a();
        }
    }
}
