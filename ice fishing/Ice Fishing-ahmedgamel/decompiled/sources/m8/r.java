package m8;

import com.google.android.gms.internal.ads.Wv;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final f f39568a;

    /* renamed from: b, reason: collision with root package name */
    public final long f39569b;

    /* renamed from: d, reason: collision with root package name */
    public final l8.c f39571d;

    /* renamed from: c, reason: collision with root package name */
    public volatile Map f39570c = v7.q.f41222n;

    /* renamed from: e, reason: collision with root package name */
    public final l8.b f39572e = new l8.b(this, Wv.i(new StringBuilder(), j8.d.f38496b, " ConnectionPool connection closer"));

    /* renamed from: f, reason: collision with root package name */
    public final ConcurrentLinkedQueue f39573f = new ConcurrentLinkedQueue();

    static {
        AtomicReferenceFieldUpdater.newUpdater(r.class, Map.class, "c");
    }

    public r(l8.d dVar, TimeUnit timeUnit, f fVar, i8.g gVar) {
        this.f39568a = fVar;
        this.f39569b = timeUnit.toNanos(5L);
        this.f39571d = dVar.d();
    }

    public final int a(q qVar, long j6) {
        TimeZone timeZone = j8.d.f38495a;
        ArrayList arrayList = qVar.f39566r;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + qVar.f39553d.f38381a.f38193h + " was leaked. Did you forget to close a response body?";
                s8.f fVar = s8.f.f40554a;
                s8.f.f40554a.k(((n) reference).f39533a, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    qVar.f39567s = j6 - this.f39569b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
