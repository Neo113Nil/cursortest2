package defpackage;

import ru.yandex.video.m3.ott.impl.ConcurrencyArbiterManagerImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class xwd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConcurrencyArbiterManagerImpl.PlayerObserverImpl b;
    public final /* synthetic */ long c;

    public /* synthetic */ xwd(ConcurrencyArbiterManagerImpl.PlayerObserverImpl playerObserverImpl, long j, int i) {
        this.a = i;
        this.b = playerObserverImpl;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.c;
        ConcurrencyArbiterManagerImpl.PlayerObserverImpl playerObserverImpl = this.b;
        switch (i) {
            case 0:
                ConcurrencyArbiterManagerImpl.PlayerObserverImpl.startScheduledWorkHeartbeat$lambda$12$lambda$11(playerObserverImpl, j);
                break;
            default:
                ConcurrencyArbiterManagerImpl.PlayerObserverImpl.startScheduledWorkHeartbeat$lambda$12(playerObserverImpl, j);
                break;
        }
    }
}
