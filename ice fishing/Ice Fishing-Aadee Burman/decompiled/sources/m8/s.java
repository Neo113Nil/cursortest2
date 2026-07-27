package m8;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final f f39411a;

    /* renamed from: b, reason: collision with root package name */
    public final long f39412b;

    /* renamed from: d, reason: collision with root package name */
    public final l8.c f39414d;

    /* renamed from: c, reason: collision with root package name */
    public volatile Map f39413c = v7.q.f41440n;

    /* renamed from: e, reason: collision with root package name */
    public final l8.b f39415e = new l8.b(this, u1.h.g(new StringBuilder(), j8.d.f38484b, " ConnectionPool connection closer"));

    /* renamed from: f, reason: collision with root package name */
    public final ConcurrentLinkedQueue f39416f = new ConcurrentLinkedQueue();

    static {
        AtomicReferenceFieldUpdater.newUpdater(s.class, Map.class, "c");
    }

    public s(l8.d dVar, TimeUnit timeUnit, f fVar, i8.g gVar) {
        this.f39411a = fVar;
        this.f39412b = timeUnit.toNanos(5L);
        this.f39414d = dVar.d();
    }

    public final int a(r rVar, long j6) {
        TimeZone timeZone = j8.d.f38483a;
        ArrayList arrayList = rVar.f39409r;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + rVar.f39396d.f38262a.f38074h + " was leaked. Did you forget to close a response body?";
                s8.f fVar = s8.f.f40497a;
                s8.f.f40497a.k(((o) reference).f39376a, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    rVar.f39410s = j6 - this.f39412b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
