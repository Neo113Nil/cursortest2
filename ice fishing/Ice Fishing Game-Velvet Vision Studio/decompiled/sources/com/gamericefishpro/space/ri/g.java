package com.gamericefishpro.space.ri;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final m a = new m(-1, null, null, 0);
    public static final int b = com.gamericefishpro.space.ui.a.k("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 12);
    public static final int c = com.gamericefishpro.space.ui.a.k("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 12);
    public static final com.gamericefishpro.space.d6.a d = new com.gamericefishpro.space.d6.a("BUFFERED", 2);
    public static final com.gamericefishpro.space.d6.a e = new com.gamericefishpro.space.d6.a("SHOULD_BUFFER", 2);
    public static final com.gamericefishpro.space.d6.a f = new com.gamericefishpro.space.d6.a("S_RESUMING_BY_RCV", 2);
    public static final com.gamericefishpro.space.d6.a g = new com.gamericefishpro.space.d6.a("RESUMING_BY_EB", 2);
    public static final com.gamericefishpro.space.d6.a h = new com.gamericefishpro.space.d6.a("POISONED", 2);
    public static final com.gamericefishpro.space.d6.a i = new com.gamericefishpro.space.d6.a("DONE_RCV", 2);
    public static final com.gamericefishpro.space.d6.a j = new com.gamericefishpro.space.d6.a("INTERRUPTED_SEND", 2);
    public static final com.gamericefishpro.space.d6.a k = new com.gamericefishpro.space.d6.a("INTERRUPTED_RCV", 2);
    public static final com.gamericefishpro.space.d6.a l = new com.gamericefishpro.space.d6.a("CHANNEL_CLOSED", 2);
    public static final com.gamericefishpro.space.d6.a m = new com.gamericefishpro.space.d6.a("SUSPEND", 2);
    public static final com.gamericefishpro.space.d6.a n = new com.gamericefishpro.space.d6.a("SUSPEND_NO_WAITER", 2);
    public static final com.gamericefishpro.space.d6.a o = new com.gamericefishpro.space.d6.a("FAILED", 2);
    public static final com.gamericefishpro.space.d6.a p = new com.gamericefishpro.space.d6.a("NO_RECEIVE_RESULT", 2);
    public static final com.gamericefishpro.space.d6.a q = new com.gamericefishpro.space.d6.a("CLOSE_HANDLER_CLOSED", 2);
    public static final com.gamericefishpro.space.d6.a r = new com.gamericefishpro.space.d6.a("CLOSE_HANDLER_INVOKED", 2);
    public static final com.gamericefishpro.space.d6.a s = new com.gamericefishpro.space.d6.a("NO_CLOSE_CAUSE", 2);

    public static final boolean a(com.gamericefishpro.space.pi.f fVar, Object obj, com.gamericefishpro.space.di.c cVar) {
        com.gamericefishpro.space.d6.a aVarF = fVar.f(obj, cVar);
        if (aVarF == null) {
            return false;
        }
        fVar.p(aVarF);
        return true;
    }
}
