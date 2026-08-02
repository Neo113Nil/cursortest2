package defpackage;

import ru.yandex.video.m3.ott.impl.ConcurrencyArbiterManagerImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class wwd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConcurrencyArbiterManagerImpl.PlayerObserverImpl b;

    public /* synthetic */ wwd(ConcurrencyArbiterManagerImpl.PlayerObserverImpl playerObserverImpl, int i) {
        this.a = i;
        this.b = playerObserverImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ConcurrencyArbiterManagerImpl.PlayerObserverImpl playerObserverImpl = this.b;
        switch (i) {
            case 0:
                ConcurrencyArbiterManagerImpl.PlayerObserverImpl.release$lambda$9(playerObserverImpl);
                break;
            default:
                ConcurrencyArbiterManagerImpl.PlayerObserverImpl.ensureStarted$lambda$5(playerObserverImpl);
                break;
        }
    }
}
