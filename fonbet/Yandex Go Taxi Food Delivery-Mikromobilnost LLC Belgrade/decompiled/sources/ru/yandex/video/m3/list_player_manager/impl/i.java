package ru.yandex.video.m3.list_player_manager.impl;

import ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ListYandexPlayerImpl.EngineObserver b;

    public /* synthetic */ i(ListYandexPlayerImpl.EngineObserver engineObserver, int i) {
        this.a = i;
        this.b = engineObserver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ListYandexPlayerImpl.EngineObserver engineObserver = this.b;
        switch (i) {
            case 0:
                ListYandexPlayerImpl.EngineObserver.onRepeat$lambda$28(engineObserver);
                break;
            case 1:
                ListYandexPlayerImpl.EngineObserver.onLoadingStart$lambda$3(engineObserver);
                break;
            case 2:
                ListYandexPlayerImpl.EngineObserver.onLoadingFinished$lambda$5(engineObserver);
                break;
            case 3:
                ListYandexPlayerImpl.EngineObserver.onPlaybackEnded$lambda$18(engineObserver);
                break;
            case 4:
                ListYandexPlayerImpl.EngineObserver.onPausePlayback$lambda$15(engineObserver);
                break;
            case 5:
                ListYandexPlayerImpl.EngineObserver.onReadyForFirstPlayback$lambda$22(engineObserver);
                break;
            default:
                ListYandexPlayerImpl.EngineObserver.onResumePlayback$lambda$12(engineObserver);
                break;
        }
    }
}
