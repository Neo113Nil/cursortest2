package ru.yandex.video.m3.list_player_manager.impl;

import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerImpl;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PreparingParams;

/* loaded from: classes7.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ListYandexPlayerImpl.EngineAnalyticsObserver.onPreparingStarted$lambda$2((ListYandexPlayerImpl.EngineAnalyticsObserver) obj2, (PreparingParams) obj);
                break;
            case 1:
                ListYandexPlayerImpl.EngineObserver.onPlaybackError$lambda$7((ListYandexPlayerImpl.EngineObserver) obj2, (PlaybackException) obj);
                break;
            default:
                ListYandexPlayerImpl.EngineObserver.onVideoDataPrepared$lambda$9((ListYandexPlayerImpl.EngineObserver) obj2, (VideoData) obj);
                break;
        }
    }
}
