package N1;

import L1.AbstractC0018t;
import L1.C0003d;
import L1.C0008i;
import L1.InterfaceC0002c;
import L1.W;
import Q1.u;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final h f721a = new h(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f722b = Q1.a.j("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f723c = Q1.a.j("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final u f724d = new u("BUFFERED", 0);
    public static final u e = new u("SHOULD_BUFFER", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final u f725f = new u("S_RESUMING_BY_RCV", 0);

    /* renamed from: g, reason: collision with root package name */
    public static final u f726g = new u("RESUMING_BY_EB", 0);

    /* renamed from: h, reason: collision with root package name */
    public static final u f727h = new u("POISONED", 0);
    public static final u i = new u("DONE_RCV", 0);
    public static final u j = new u("INTERRUPTED_SEND", 0);

    /* renamed from: k, reason: collision with root package name */
    public static final u f728k = new u("INTERRUPTED_RCV", 0);

    /* renamed from: l, reason: collision with root package name */
    public static final u f729l = new u("CHANNEL_CLOSED", 0);

    /* renamed from: m, reason: collision with root package name */
    public static final u f730m = new u("SUSPEND", 0);

    /* renamed from: n, reason: collision with root package name */
    public static final u f731n = new u("SUSPEND_NO_WAITER", 0);

    /* renamed from: o, reason: collision with root package name */
    public static final u f732o = new u("FAILED", 0);

    /* renamed from: p, reason: collision with root package name */
    public static final u f733p = new u("NO_RECEIVE_RESULT", 0);

    /* renamed from: q, reason: collision with root package name */
    public static final u f734q = new u("NO_CLOSE_CAUSE", 0);

    public static final boolean a(InterfaceC0002c interfaceC0002c, Object obj, C1.l lVar) {
        u uVar;
        C0003d c0003d = (C0003d) interfaceC0002c;
        c0003d.getClass();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0003d.f556g;
            Object obj2 = atomicReferenceFieldUpdater.get(c0003d);
            boolean z2 = obj2 instanceof W;
            uVar = AbstractC0018t.f577a;
            if (!z2) {
                boolean z3 = obj2 instanceof C0008i;
                uVar = null;
                break;
            }
            Object y2 = C0003d.y((W) obj2, obj, c0003d.f585c, lVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(c0003d, obj2, y2)) {
                if (atomicReferenceFieldUpdater.get(c0003d) != obj2) {
                    break;
                }
            }
            if (!c0003d.u()) {
                c0003d.o();
            }
        }
        if (uVar == null) {
            return false;
        }
        c0003d.p(c0003d.f585c);
        return true;
    }
}
