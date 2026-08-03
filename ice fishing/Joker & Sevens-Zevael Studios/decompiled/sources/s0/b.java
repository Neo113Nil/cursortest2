package s0;

import bc.i;
import java.util.Iterator;
import r0.c;
import s.e0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends i implements p0.b {

    /* renamed from: j, reason: collision with root package name */
    public static final b f6370j;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6371g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f6372h;

    /* renamed from: i, reason: collision with root package name */
    public final c f6373i;

    static {
        t0.b bVar = t0.b.f6511a;
        f6370j = new b(bVar, bVar, c.f5901i);
    }

    public b(Object obj, Object obj2, c cVar) {
        this.f6371g = obj;
        this.f6372h = obj2;
        this.f6373i = cVar;
    }

    @Override // bc.a
    public final int a() {
        c cVar = this.f6373i;
        cVar.getClass();
        return cVar.f5903h;
    }

    @Override // bc.a, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f6373i.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new e0(this.f6371g, this.f6373i);
    }
}
