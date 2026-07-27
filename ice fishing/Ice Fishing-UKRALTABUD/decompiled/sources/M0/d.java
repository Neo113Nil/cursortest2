package M0;

import K0.InterfaceC0029e;
import P0.AbstractC0068a;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final j f711a = new j(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f712b = AbstractC0068a.l("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f713c = AbstractC0068a.l("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final A.j f714d;

    /* renamed from: e, reason: collision with root package name */
    public static final A.j f715e;

    /* renamed from: f, reason: collision with root package name */
    public static final A.j f716f;

    /* renamed from: g, reason: collision with root package name */
    public static final A.j f717g;

    /* renamed from: h, reason: collision with root package name */
    public static final A.j f718h;

    /* renamed from: i, reason: collision with root package name */
    public static final A.j f719i;

    /* renamed from: j, reason: collision with root package name */
    public static final A.j f720j;

    /* renamed from: k, reason: collision with root package name */
    public static final A.j f721k;

    /* renamed from: l, reason: collision with root package name */
    public static final A.j f722l;

    /* renamed from: m, reason: collision with root package name */
    public static final A.j f723m;

    /* renamed from: n, reason: collision with root package name */
    public static final A.j f724n;

    /* renamed from: o, reason: collision with root package name */
    public static final A.j f725o;

    /* renamed from: p, reason: collision with root package name */
    public static final A.j f726p;

    /* renamed from: q, reason: collision with root package name */
    public static final A.j f727q;
    public static final A.j r;

    /* renamed from: s, reason: collision with root package name */
    public static final A.j f728s;

    static {
        int i2 = 11;
        f714d = new A.j(i2, "BUFFERED");
        f715e = new A.j(i2, "SHOULD_BUFFER");
        f716f = new A.j(i2, "S_RESUMING_BY_RCV");
        f717g = new A.j(i2, "RESUMING_BY_EB");
        f718h = new A.j(i2, "POISONED");
        f719i = new A.j(i2, "DONE_RCV");
        f720j = new A.j(i2, "INTERRUPTED_SEND");
        f721k = new A.j(i2, "INTERRUPTED_RCV");
        f722l = new A.j(i2, "CHANNEL_CLOSED");
        f723m = new A.j(i2, "SUSPEND");
        f724n = new A.j(i2, "SUSPEND_NO_WAITER");
        f725o = new A.j(i2, "FAILED");
        f726p = new A.j(i2, "NO_RECEIVE_RESULT");
        f727q = new A.j(i2, "CLOSE_HANDLER_CLOSED");
        r = new A.j(i2, "CLOSE_HANDLER_INVOKED");
        f728s = new A.j(i2, "NO_CLOSE_CAUSE");
    }

    public static final boolean a(InterfaceC0029e interfaceC0029e, Object obj, D0.l lVar) {
        A.j d2 = interfaceC0029e.d(obj, lVar);
        if (d2 == null) {
            return false;
        }
        interfaceC0029e.k(d2);
        return true;
    }
}
