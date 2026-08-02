package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class knw extends aur implements Function2 {
    public int j;
    public int k;
    public long l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ mnw o;
    public final /* synthetic */ rs p;
    public final /* synthetic */ Function0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public knw(mnw mnwVar, rs rsVar, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.o = mnwVar;
        this.p = rsVar;
        this.q = function0;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        knw knwVar = new knw(this.o, this.p, this.q, continuation);
        knwVar.n = obj;
        return knwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((knw) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d1, code lost:
    
        if (r3 != r2) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00d1 -> B:6:0x00d4). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        long j;
        int i3;
        Object invoke;
        AtomicBoolean atomicBoolean;
        List list;
        Long l;
        mm6 mm6Var = (mm6) this.n;
        nm6 nm6Var = nm6.a;
        int i4 = this.m;
        mnw mnwVar = this.o;
        if (i4 == 0) {
            qgg.h0(obj);
            i = 0;
            atomicBoolean = mnwVar.g;
            String str = mnwVar.a;
            if (atomicBoolean.compareAndSet(true, false)) {
            }
            list = (List) mnwVar.f.get();
            if (list != null) {
            }
            l = null;
            if (l == null) {
            }
        } else if (i4 == 1) {
            i3 = this.k;
            j = this.l;
            i2 = this.j;
            qgg.h0(obj);
            Integer num = new Integer(i3);
            this.n = mm6Var;
            this.j = i2;
            this.l = j;
            this.k = i3;
            this.m = 2;
            invoke = this.p.invoke(num, this);
        } else {
            if (i4 != 2) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i5 = this.j;
            qgg.h0(obj);
            i2 = i5;
            invoke = obj;
            if (((Boolean) invoke).booleanValue()) {
                ReentrantLock reentrantLock = mnwVar.d;
                reentrantLock.lock();
                try {
                    rar rarVar = mnwVar.e;
                    if (rarVar != null) {
                        rarVar.g(null);
                    }
                    reentrantLock.unlock();
                    return Unit.a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            i = i2 + 1;
            atomicBoolean = mnwVar.g;
            String str2 = mnwVar.a;
            if (atomicBoolean.compareAndSet(true, false)) {
                i = 0;
            }
            list = (List) mnwVar.f.get();
            if (list != null) {
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    l = ((Boolean) mnwVar.c.invoke()).booleanValue() ? (Long) CollectionsKt.S(list, i) : (Long) list.get(yhn.e(i, u75.f(list)));
                    if (l == null) {
                        ssg.a(4, str2, "RetryManager: backoff array exhausted, disconnecting until next external trigger", null);
                        this.q.invoke();
                        return Unit.a;
                    }
                    long longValue = l.longValue();
                    int i6 = i + 1;
                    StringBuilder sb = new StringBuilder("RetryManager: attempt ");
                    sb.append(i6);
                    sb.append(", wait ");
                    sb.append(longValue);
                    v3w.m(sb, "ms", 4, str2, null);
                    msa msaVar = nsa.b;
                    long N = yd5.N(longValue, ssa.MILLISECONDS);
                    this.n = mm6Var;
                    this.j = i;
                    this.l = longValue;
                    this.k = i6;
                    this.m = 1;
                    if (y2x.p(N, this) != nm6Var) {
                        i2 = i;
                        i3 = i6;
                        j = longValue;
                        Integer num2 = new Integer(i3);
                        this.n = mm6Var;
                        this.j = i2;
                        this.l = j;
                        this.k = i3;
                        this.m = 2;
                        invoke = this.p.invoke(num2, this);
                    }
                    return nm6Var;
                }
            }
            l = null;
            if (l == null) {
            }
        }
    }
}
