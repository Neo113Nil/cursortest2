package defpackage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class x6q extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ a7q k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x6q(a7q a7qVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = a7qVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new x6q(this.k, continuation, 0);
            case 1:
                return new x6q(this.k, continuation, 1);
            case 2:
                return new x6q(this.k, continuation, 2);
            case 3:
                return new x6q(this.k, continuation, 3);
            case 4:
                return new x6q(this.k, continuation, 4);
            case 5:
                return new x6q(this.k, continuation, 5);
            case 6:
                return new x6q(this.k, continuation, 6);
            case 7:
                return new x6q(this.k, continuation, 7);
            case 8:
                return new x6q(this.k, continuation, 8);
            case 9:
                return new x6q(this.k, continuation, 9);
            case 10:
                return new x6q(this.k, continuation, 10);
            default:
                return new x6q(this.k, continuation, 11);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((x6q) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                ncl nclVar = this.k.g;
                nclVar.getClass();
                mal.a();
                nclVar.m.e();
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return new Long(this.k.b(false));
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                return new Long(this.k.b(true));
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                return new Float(this.k.a.m().a);
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                return new Float(this.k.a.getVolume());
            case 5:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                a7q a7qVar = this.k;
                w1f w1fVar = a7qVar.b;
                kv6 kv6Var = a7qVar.a;
                w1fVar.b(kv6Var.getVolume());
                kv6Var.t(0.0f);
                return Unit.a;
            case 6:
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                ssg.a(3, "SharedPlayerImpl", "pause()", null);
                this.k.a.b();
                return Unit.a;
            case 7:
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                ssg.a(3, "SharedPlayerImpl", "play()", null);
                s70 s70Var = this.k.q;
                Long l = (Long) s70Var.a;
                if (l != null) {
                    long longValue = l.longValue();
                    Long l2 = (Long) s70Var.c;
                    if (l2 != null) {
                        if (System.currentTimeMillis() - l2.longValue() >= longValue) {
                            ssg.a(3, "SharedPlayerImpl", "seekToDefaultPosition()", null);
                            this.k.a.C();
                        }
                    }
                }
                this.k.a.d();
                return Unit.a;
            case 8:
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                return new Long(this.k.c());
            case 9:
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                a7q a7qVar2 = this.k;
                d18 d18Var = a7qVar2.s;
                d18Var.h = null;
                gld.L((tf6) d18Var.e, null);
                a7qVar2.t.V();
                ssg.a(3, "SharedPlayerImpl", "release()", null);
                ncl nclVar2 = a7qVar2.g;
                msa msaVar = nsa.b;
                ssa ssaVar = ssa.MILLISECONDS;
                nclVar2.q0(null, yd5.M(0, ssaVar), yd5.M(0, ssaVar));
                ncl nclVar3 = a7qVar2.g;
                nclVar3.getClass();
                mal.a();
                gw1 gw1Var = nclVar3.m;
                gw1Var.e();
                gw1Var.a();
                g7q g7qVar = a7qVar2.n;
                g7qVar.getClass();
                mal.a();
                g7qVar.a.x0(g7qVar.b);
                a7q.a(a7qVar2);
                s70 s70Var2 = a7qVar2.q;
                rar rarVar = (rar) s70Var2.b;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                s70Var2.b = null;
                s70Var2.a = null;
                s70Var2.c = null;
                a7qVar2.f.a();
                a7qVar2.a.a();
                rn5 rn5Var = a7qVar2.o;
                ReentrantLock reentrantLock = (ReentrantLock) rn5Var.g;
                reentrantLock.lock();
                try {
                    ((ArrayList) rn5Var.h).clear();
                    rn5Var.f = null;
                    reentrantLock.unlock();
                    AtomicReference atomicReference = a7qVar2.m;
                    EnumSet noneOf = EnumSet.noneOf(g5q.class);
                    noneOf.getClass();
                    atomicReference.set(noneOf);
                    Set set = ((zss) a7qVar2.l.getValue()).b;
                    set.getClass();
                    if (!set.isEmpty()) {
                        ssg.a(7, "TrackContentLocker", "trackIdLockSet is not empty: " + set, null);
                    }
                    xol xolVar = (xol) a7qVar2.j.getValue();
                    xolVar.n.set(true);
                    xolVar.b(null);
                    return Unit.a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 10:
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                a7q a7qVar3 = this.k;
                a7qVar3.s.h = null;
                ssg.a(3, "SharedPlayerImpl", "stop()", null);
                a7q.a(a7qVar3);
                kv6 kv6Var2 = a7qVar3.a;
                kv6Var2.stop();
                kv6Var2.y();
                return Unit.a;
            default:
                nm6 nm6Var12 = nm6.a;
                qgg.h0(obj);
                a7q a7qVar4 = this.k;
                a7qVar4.a.t(a7qVar4.b.c());
                return Unit.a;
        }
    }
}
