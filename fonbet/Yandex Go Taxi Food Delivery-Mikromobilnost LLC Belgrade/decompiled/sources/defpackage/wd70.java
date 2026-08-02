package defpackage;

import ru.yandex.video.m3.player.impl.OptimizedYandexPlayerImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class wd70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ OptimizedYandexPlayerImpl b;

    public /* synthetic */ wd70(OptimizedYandexPlayerImpl optimizedYandexPlayerImpl, int i) {
        this.a = i;
        this.b = optimizedYandexPlayerImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        OptimizedYandexPlayerImpl optimizedYandexPlayerImpl = this.b;
        switch (i) {
            case 0:
                OptimizedYandexPlayerImpl.release$lambda$41(optimizedYandexPlayerImpl);
                break;
            case 1:
                optimizedYandexPlayerImpl.internalPlay();
                break;
            default:
                optimizedYandexPlayerImpl.internalPause();
                break;
        }
    }
}
