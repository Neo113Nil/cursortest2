package l8;

import D.y;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.h;
import m8.r;
import m8.s;

/* loaded from: classes2.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38938e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f38939f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(s sVar, String str) {
        super(str);
        this.f38939f = sVar;
    }

    @Override // l8.a
    public final long a() {
        r rVar;
        long j6;
        switch (this.f38938e) {
            case 0:
                ((I7.a) this.f38939f).invoke();
                return -1L;
            default:
                s sVar = (s) this.f38939f;
                long nanoTime = System.nanoTime();
                Map map = sVar.f39413c;
                Iterator it = map.values().iterator();
                if (it.hasNext()) {
                    throw y.j(it);
                }
                Iterator it2 = sVar.f39416f.iterator();
                h.d(it2, "iterator(...)");
                while (it2.hasNext()) {
                    if (map.get(((r) it2.next()).f39396d.f38262a) != null) {
                        throw new ClassCastException();
                    }
                }
                long j9 = (nanoTime - sVar.f39412b) + 1;
                Iterator it3 = sVar.f39416f.iterator();
                h.d(it3, "iterator(...)");
                int i = 0;
                long j10 = Long.MAX_VALUE;
                r rVar2 = null;
                r rVar3 = null;
                int i6 = 0;
                while (it3.hasNext()) {
                    r rVar4 = (r) it3.next();
                    h.b(rVar4);
                    synchronized (rVar4) {
                        if (sVar.a(rVar4, nanoTime) > 0) {
                            i6++;
                            j6 = nanoTime;
                        } else {
                            int i9 = i;
                            long j11 = rVar4.f39410s;
                            if (j11 < j9) {
                                j9 = j11;
                                rVar2 = rVar4;
                            }
                            j6 = nanoTime;
                            if (map.get(rVar4.f39396d.f38262a) != null) {
                                throw new ClassCastException();
                            }
                            int i10 = i9 + 1;
                            if (j11 < j10) {
                                j10 = j11;
                                rVar3 = rVar4;
                            }
                            i = i10;
                        }
                    }
                    nanoTime = j6;
                }
                long j12 = nanoTime;
                int i11 = i;
                if (rVar2 != null) {
                    rVar = rVar2;
                } else if (i11 > 5) {
                    j9 = j10;
                    rVar = rVar3;
                } else {
                    j9 = -1;
                    rVar = null;
                }
                if (rVar == null) {
                    if (rVar3 != null) {
                        return (j10 + sVar.f39412b) - j12;
                    }
                    if (i6 > 0) {
                        return sVar.f39412b;
                    }
                    return -1L;
                }
                synchronized (rVar) {
                    if (rVar.f39409r.isEmpty() && rVar.f39410s == j9) {
                        rVar.f39403l = true;
                        sVar.f39416f.remove(rVar);
                        if (map.get(rVar.f39396d.f38262a) != null) {
                            throw new ClassCastException();
                        }
                        j8.d.c(rVar.f39398f);
                        if (sVar.f39416f.isEmpty()) {
                            sVar.f39414d.a();
                        }
                    }
                }
                return 0L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, I7.a aVar) {
        super(str);
        this.f38939f = aVar;
    }
}
