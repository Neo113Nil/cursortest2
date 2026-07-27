package N0;

import L0.InterfaceC0047e;
import Q0.AbstractC0068a;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final j f719a = new j(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f720b = AbstractC0068a.l("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f721c = AbstractC0068a.l("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final A.j f722d;

    /* renamed from: e, reason: collision with root package name */
    public static final A.j f723e;

    /* renamed from: f, reason: collision with root package name */
    public static final A.j f724f;

    /* renamed from: g, reason: collision with root package name */
    public static final A.j f725g;

    /* renamed from: h, reason: collision with root package name */
    public static final A.j f726h;

    /* renamed from: i, reason: collision with root package name */
    public static final A.j f727i;

    /* renamed from: j, reason: collision with root package name */
    public static final A.j f728j;

    /* renamed from: k, reason: collision with root package name */
    public static final A.j f729k;

    /* renamed from: l, reason: collision with root package name */
    public static final A.j f730l;

    /* renamed from: m, reason: collision with root package name */
    public static final A.j f731m;

    /* renamed from: n, reason: collision with root package name */
    public static final A.j f732n;

    /* renamed from: o, reason: collision with root package name */
    public static final A.j f733o;

    /* renamed from: p, reason: collision with root package name */
    public static final A.j f734p;

    /* renamed from: q, reason: collision with root package name */
    public static final A.j f735q;
    public static final A.j r;

    /* renamed from: s, reason: collision with root package name */
    public static final A.j f736s;

    static {
        int i2 = 11;
        f722d = new A.j(i2, "BUFFERED");
        f723e = new A.j(i2, "SHOULD_BUFFER");
        f724f = new A.j(i2, "S_RESUMING_BY_RCV");
        f725g = new A.j(i2, "RESUMING_BY_EB");
        f726h = new A.j(i2, "POISONED");
        f727i = new A.j(i2, "DONE_RCV");
        f728j = new A.j(i2, "INTERRUPTED_SEND");
        f729k = new A.j(i2, "INTERRUPTED_RCV");
        f730l = new A.j(i2, "CHANNEL_CLOSED");
        f731m = new A.j(i2, "SUSPEND");
        f732n = new A.j(i2, "SUSPEND_NO_WAITER");
        f733o = new A.j(i2, "FAILED");
        f734p = new A.j(i2, "NO_RECEIVE_RESULT");
        f735q = new A.j(i2, "CLOSE_HANDLER_CLOSED");
        r = new A.j(i2, "CLOSE_HANDLER_INVOKED");
        f736s = new A.j(i2, "NO_CLOSE_CAUSE");
    }

    public static final boolean a(InterfaceC0047e interfaceC0047e, Object obj, D0.l lVar) {
        A.j d2 = interfaceC0047e.d(obj, lVar);
        if (d2 == null) {
            return false;
        }
        interfaceC0047e.k(d2);
        return true;
    }
}
