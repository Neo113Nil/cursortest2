package com.gamericefishpro.space.u5;

import com.gamericefishpro.space.d4.z;
import com.gamericefishpro.space.ph.w;
import com.gamericefishpro.space.pi.a0;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final int a;
    public final Function0 b;
    public final ReentrantLock c;
    public int d;
    public boolean e;
    public final f[] f;
    public final com.gamericefishpro.space.xi.h g;
    public final z h;

    public i(int i, Function0 connectionFactory) {
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        this.a = i;
        this.b = connectionFactory;
        this.c = new ReentrantLock();
        this.f = new f[i];
        int i2 = com.gamericefishpro.space.xi.i.a;
        this.g = new com.gamericefishpro.space.xi.h(i);
        z zVar = new z();
        if (i < 1) {
            com.gamericefishpro.space.u.a.c("capacity must be >= 1");
            throw null;
        }
        if (i > 1073741824) {
            com.gamericefishpro.space.u.a.c("capacity must be <= 2^30");
            throw null;
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        zVar.c = i - 1;
        zVar.d = new Object[i];
        this.h = zVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(com.gamericefishpro.space.vh.c cVar) {
        h frame;
        int andDecrement;
        Object objR;
        i iVar;
        if (cVar instanceof h) {
            frame = (h) cVar;
            int i = frame.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                frame.v = i - Integer.MIN_VALUE;
            } else {
                frame = new h(this, cVar);
            }
        } else {
            frame = new h(this, cVar);
        }
        Object obj = frame.e;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = frame.v;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            frame.d = this;
            frame.v = 1;
            com.gamericefishpro.space.xi.h hVar = this.g;
            hVar.getClass();
            int i3 = hVar.d;
            do {
                andDecrement = com.gamericefishpro.space.xi.g.z.getAndDecrement(hVar);
            } while (andDecrement > i3);
            if (andDecrement > 0) {
                objR = Unit.a;
            } else {
                com.gamericefishpro.space.pi.h hVarO = a0.o(com.gamericefishpro.space.uh.f.b(frame));
                try {
                    if (!hVar.a(hVarO)) {
                        while (true) {
                            int andDecrement2 = com.gamericefishpro.space.xi.g.z.getAndDecrement(hVar);
                            if (andDecrement2 <= i3) {
                                if (andDecrement2 > 0) {
                                    hVarO.h(Unit.a, hVar.e);
                                    break;
                                }
                                if (hVar.a(hVarO)) {
                                    break;
                                }
                            }
                        }
                    }
                    objR = hVarO.r();
                    if (objR == aVar) {
                        Intrinsics.checkNotNullParameter(frame, "frame");
                    }
                    if (objR != aVar) {
                        objR = Unit.a;
                    }
                    if (objR != aVar) {
                        objR = Unit.a;
                    }
                } catch (Throwable th) {
                    hVarO.A();
                    throw th;
                }
            }
            if (objR == aVar) {
                return aVar;
            }
            iVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = frame.d;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        try {
            ReentrantLock reentrantLock = iVar.c;
            z zVar = iVar.h;
            reentrantLock.lock();
            try {
                if (iVar.e) {
                    com.gamericefishpro.space.i.a.Q(21, "Connection pool is closed");
                    throw null;
                }
                if (zVar.a == zVar.b && iVar.d < iVar.a) {
                    f fVar = new f((com.gamericefishpro.space.c6.a) iVar.b.invoke());
                    f[] fVarArr = iVar.f;
                    int i4 = iVar.d;
                    iVar.d = i4 + 1;
                    fVarArr[i4] = fVar;
                    zVar.a(fVar);
                }
                int i5 = zVar.a;
                if (i5 == zVar.b) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                Object[] objArr = (Object[]) zVar.d;
                Object obj2 = objArr[i5];
                objArr[i5] = null;
                zVar.a = (i5 + 1) & zVar.c;
                f fVar2 = (f) obj2;
                reentrantLock.unlock();
                return fVar2;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            iVar.g.d();
            throw th3;
        }
    }

    public final void b() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (f fVar : this.f) {
                if (fVar != null) {
                    fVar.close();
                }
            }
            Unit unit = Unit.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void c(StringBuilder builder) {
        z zVar = this.h;
        Intrinsics.checkNotNullParameter(builder, "builder");
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.gamericefishpro.space.qh.d dVarB = w.b();
            int i = (zVar.b - zVar.a) & zVar.c;
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 >= 0) {
                    int i3 = zVar.b;
                    int i4 = zVar.a;
                    int i5 = zVar.c;
                    if (i2 < ((i3 - i4) & i5)) {
                        Object obj = ((Object[]) zVar.d)[(i4 + i2) & i5];
                        Intrinsics.b(obj);
                        dVarB.add(obj);
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            com.gamericefishpro.space.qh.d dVarA = w.a(dVarB);
            builder.append('\t' + toString() + " (");
            builder.append("capacity=" + this.a + ", ");
            StringBuilder sb = new StringBuilder();
            sb.append("permits=");
            com.gamericefishpro.space.xi.h hVar = this.g;
            hVar.getClass();
            sb.append(Math.max(com.gamericefishpro.space.xi.g.z.get(hVar), 0));
            sb.append(", ");
            builder.append(sb.toString());
            builder.append("queue=(size=" + dVarA.b() + ")[" + CollectionsKt.A(dVarA, null, null, null, null, 63) + "], ");
            builder.append(")");
            builder.append('\n');
            f[] fVarArr = this.f;
            int length = fVarArr.length;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                f fVar = fVarArr[i7];
                i6++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i6);
                sb2.append("] - ");
                sb2.append(fVar != null ? fVar.d.toString() : null);
                builder.append(sb2.toString());
                builder.append('\n');
                if (fVar != null) {
                    fVar.j(builder);
                }
            }
            Unit unit = Unit.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(f connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.a(connection);
            Unit unit = Unit.a;
            reentrantLock.unlock();
            this.g.d();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
