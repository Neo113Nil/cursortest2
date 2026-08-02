package defpackage;

import ru.yandex.video.m3.ott.ott.LicenseCheckerManager;

/* loaded from: classes7.dex */
public final /* synthetic */ class ycy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LicenseCheckerManager.PlayerObserverImpl b;

    public /* synthetic */ ycy(LicenseCheckerManager.PlayerObserverImpl playerObserverImpl, int i) {
        this.a = i;
        this.b = playerObserverImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        LicenseCheckerManager.PlayerObserverImpl playerObserverImpl = this.b;
        switch (i) {
            case 0:
                LicenseCheckerManager.PlayerObserverImpl.onResumePlayback$lambda$4(playerObserverImpl);
                break;
            default:
                LicenseCheckerManager.PlayerObserverImpl.onResumePlayback$lambda$4$lambda$3(playerObserverImpl);
                break;
        }
    }
}
