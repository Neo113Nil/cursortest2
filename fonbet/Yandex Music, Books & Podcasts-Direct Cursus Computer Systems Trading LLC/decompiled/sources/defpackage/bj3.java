package defpackage;

/* loaded from: classes5.dex */
public abstract class bj3 {
    public static final hd4 a = new hd4(-1, null, null, 0);
    public static final int b = hag.A(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");
    public static final int c = hag.A(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");
    public static final js3 d = new js3("BUFFERED", 2);
    public static final js3 e = new js3("SHOULD_BUFFER", 2);
    public static final js3 f = new js3("S_RESUMING_BY_RCV", 2);
    public static final js3 g = new js3("RESUMING_BY_EB", 2);
    public static final js3 h = new js3("POISONED", 2);
    public static final js3 i = new js3("DONE_RCV", 2);
    public static final js3 j = new js3("INTERRUPTED_SEND", 2);
    public static final js3 k = new js3("INTERRUPTED_RCV", 2);
    public static final js3 l = new js3("CHANNEL_CLOSED", 2);
    public static final js3 m = new js3("SUSPEND", 2);
    public static final js3 n = new js3("SUSPEND_NO_WAITER", 2);
    public static final js3 o = new js3("FAILED", 2);
    public static final js3 p = new js3("NO_RECEIVE_RESULT", 2);
    public static final js3 q = new js3("CLOSE_HANDLER_CLOSED", 2);
    public static final js3 r = new js3("CLOSE_HANDLER_INVOKED", 2);
    public static final js3 s = new js3("NO_CLOSE_CAUSE", 2);

    public static final boolean a(yt3 yt3Var, Object obj, pyc pycVar) {
        js3 d2 = yt3Var.d(obj, pycVar);
        if (d2 == null) {
            return false;
        }
        yt3Var.r(d2);
        return true;
    }
}
