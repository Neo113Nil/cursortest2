package ru.yandex.video.m3.list_player_manager.impl;

import ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ListYandexPlayerImpl.EngineObserver b;
    public final /* synthetic */ long c;

    public /* synthetic */ h(ListYandexPlayerImpl.EngineObserver engineObserver, long j, int i) {
        this.a = i;
        this.b = engineObserver;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.c;
        ListYandexPlayerImpl.EngineObserver engineObserver = this.b;
        switch (i) {
            case 0:
                ListYandexPlayerImpl.EngineObserver.onBufferSizeChanged$lambda$26(engineObserver, j);
                break;
            default:
                ListYandexPlayerImpl.EngineObserver.onPlaybackProgress$lambda$24(engineObserver, j);
                break;
        }
    }
}
