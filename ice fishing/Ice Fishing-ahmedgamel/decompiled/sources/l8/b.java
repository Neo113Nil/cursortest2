package l8;

import D.x;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.h;
import m8.q;
import m8.r;

/* loaded from: classes2.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f39006e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f39007f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(r rVar, String str) {
        super(str);
        this.f39007f = rVar;
    }

    @Override // l8.a
    public final long a() {
        q qVar;
        long j6;
        switch (this.f39006e) {
            case 0:
                ((I7.a) this.f39007f).invoke();
                return -1L;
            default:
                r rVar = (r) this.f39007f;
                long nanoTime = System.nanoTime();
                Map map = rVar.f39570c;
                Iterator it = map.values().iterator();
                if (it.hasNext()) {
                    throw x.i(it);
                }
                Iterator it2 = rVar.f39573f.iterator();
                h.d(it2, "iterator(...)");
                while (it2.hasNext()) {
                    if (map.get(((q) it2.next()).f39553d.f38381a) != null) {
                        throw new ClassCastException();
                    }
                }
                long j9 = (nanoTime - rVar.f39569b) + 1;
                Iterator it3 = rVar.f39573f.iterator();
                h.d(it3, "iterator(...)");
                int i = 0;
                long j10 = Long.MAX_VALUE;
                q qVar2 = null;
                q qVar3 = null;
                int i4 = 0;
                while (it3.hasNext()) {
                    q qVar4 = (q) it3.next();
                    h.b(qVar4);
                    synchronized (qVar4) {
                        if (rVar.a(qVar4, nanoTime) > 0) {
                            i4++;
                            j6 = nanoTime;
                        } else {
                            int i6 = i;
                            long j11 = qVar4.f39567s;
                            if (j11 < j9) {
                                j9 = j11;
                                qVar2 = qVar4;
                            }
                            j6 = nanoTime;
                            if (map.get(qVar4.f39553d.f38381a) != null) {
                                throw new ClassCastException();
                            }
                            int i9 = i6 + 1;
                            if (j11 < j10) {
                                j10 = j11;
                                qVar3 = qVar4;
                            }
                            i = i9;
                        }
                    }
                    nanoTime = j6;
                }
                long j12 = nanoTime;
                int i10 = i;
                if (qVar2 != null) {
                    qVar = qVar2;
                } else if (i10 > 5) {
                    j9 = j10;
                    qVar = qVar3;
                } else {
                    j9 = -1;
                    qVar = null;
                }
                if (qVar == null) {
                    if (qVar3 != null) {
                        return (j10 + rVar.f39569b) - j12;
                    }
                    if (i4 > 0) {
                        return rVar.f39569b;
                    }
                    return -1L;
                }
                synchronized (qVar) {
                    if (qVar.f39566r.isEmpty() && qVar.f39567s == j9) {
                        qVar.f39560l = true;
                        rVar.f39573f.remove(qVar);
                        if (map.get(qVar.f39553d.f38381a) != null) {
                            throw new ClassCastException();
                        }
                        j8.d.c(qVar.f39555f);
                        if (rVar.f39573f.isEmpty()) {
                            rVar.f39571d.a();
                        }
                    }
                }
                return 0L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, I7.a aVar) {
        super(str);
        this.f39007f = aVar;
    }
}
