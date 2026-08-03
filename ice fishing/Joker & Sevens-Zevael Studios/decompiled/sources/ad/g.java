package ad;

import dd.w;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final m f304a = new m(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f305b = dd.a.j("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f306c = dd.a.j("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final w f307d = new w("BUFFERED", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final w f308e = new w("SHOULD_BUFFER", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final w f309f = new w("S_RESUMING_BY_RCV", 0);

    /* renamed from: g, reason: collision with root package name */
    public static final w f310g = new w("RESUMING_BY_EB", 0);

    /* renamed from: h, reason: collision with root package name */
    public static final w f311h = new w("POISONED", 0);

    /* renamed from: i, reason: collision with root package name */
    public static final w f312i = new w("DONE_RCV", 0);

    /* renamed from: j, reason: collision with root package name */
    public static final w f313j = new w("INTERRUPTED_SEND", 0);

    /* renamed from: k, reason: collision with root package name */
    public static final w f314k = new w("INTERRUPTED_RCV", 0);

    /* renamed from: l, reason: collision with root package name */
    public static final w f315l = new w("CHANNEL_CLOSED", 0);

    /* renamed from: m, reason: collision with root package name */
    public static final w f316m = new w("SUSPEND", 0);

    /* renamed from: n, reason: collision with root package name */
    public static final w f317n = new w("SUSPEND_NO_WAITER", 0);

    /* renamed from: o, reason: collision with root package name */
    public static final w f318o = new w("FAILED", 0);

    /* renamed from: p, reason: collision with root package name */
    public static final w f319p = new w("NO_RECEIVE_RESULT", 0);

    /* renamed from: q, reason: collision with root package name */
    public static final w f320q = new w("CLOSE_HANDLER_CLOSED", 0);

    /* renamed from: r, reason: collision with root package name */
    public static final w f321r = new w("CLOSE_HANDLER_INVOKED", 0);

    /* renamed from: s, reason: collision with root package name */
    public static final w f322s = new w("NO_CLOSE_CAUSE", 0);

    public static final boolean a(yc.f fVar, Object obj, dd.p pVar) {
        w e10 = fVar.e(obj, pVar);
        if (e10 == null) {
            return false;
        }
        fVar.y(e10);
        return true;
    }
}
