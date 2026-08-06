package C1;

import A1.InterfaceC0004e;
import io.appmetrica.analytics.AppMetricaDefaultValues;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final k f162a = new k(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f163b = F1.a.k("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f164c = F1.a.k("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND, 0, 0, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final C.j f165d;

    /* renamed from: e, reason: collision with root package name */
    public static final C.j f166e;

    /* renamed from: f, reason: collision with root package name */
    public static final C.j f167f;

    /* renamed from: g, reason: collision with root package name */
    public static final C.j f168g;

    /* renamed from: h, reason: collision with root package name */
    public static final C.j f169h;

    /* renamed from: i, reason: collision with root package name */
    public static final C.j f170i;

    /* renamed from: j, reason: collision with root package name */
    public static final C.j f171j;

    /* renamed from: k, reason: collision with root package name */
    public static final C.j f172k;

    /* renamed from: l, reason: collision with root package name */
    public static final C.j f173l;

    /* renamed from: m, reason: collision with root package name */
    public static final C.j f174m;

    /* renamed from: n, reason: collision with root package name */
    public static final C.j f175n;

    /* renamed from: o, reason: collision with root package name */
    public static final C.j f176o;

    /* renamed from: p, reason: collision with root package name */
    public static final C.j f177p;

    /* renamed from: q, reason: collision with root package name */
    public static final C.j f178q;

    /* renamed from: r, reason: collision with root package name */
    public static final C.j f179r;

    /* renamed from: s, reason: collision with root package name */
    public static final C.j f180s;

    static {
        int i2 = 5;
        f165d = new C.j(i2, "BUFFERED");
        f166e = new C.j(i2, "SHOULD_BUFFER");
        f167f = new C.j(i2, "S_RESUMING_BY_RCV");
        f168g = new C.j(i2, "RESUMING_BY_EB");
        f169h = new C.j(i2, "POISONED");
        f170i = new C.j(i2, "DONE_RCV");
        f171j = new C.j(i2, "INTERRUPTED_SEND");
        f172k = new C.j(i2, "INTERRUPTED_RCV");
        f173l = new C.j(i2, "CHANNEL_CLOSED");
        f174m = new C.j(i2, "SUSPEND");
        f175n = new C.j(i2, "SUSPEND_NO_WAITER");
        f176o = new C.j(i2, "FAILED");
        f177p = new C.j(i2, "NO_RECEIVE_RESULT");
        f178q = new C.j(i2, "CLOSE_HANDLER_CLOSED");
        f179r = new C.j(i2, "CLOSE_HANDLER_INVOKED");
        f180s = new C.j(i2, "NO_CLOSE_CAUSE");
    }

    public static final boolean a(InterfaceC0004e interfaceC0004e, Object obj, t1.l lVar) {
        C.j d2 = interfaceC0004e.d(obj, lVar);
        if (d2 == null) {
            return false;
        }
        interfaceC0004e.n(d2);
        return true;
    }
}
