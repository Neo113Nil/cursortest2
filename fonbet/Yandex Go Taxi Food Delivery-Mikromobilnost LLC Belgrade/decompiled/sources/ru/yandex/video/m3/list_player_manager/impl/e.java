package ru.yandex.video.m3.list_player_manager.impl;

import ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerImpl;
import ru.yandex.video.m3.player.YandexPlayer;

/* loaded from: classes7.dex */
public final /* synthetic */ class e implements ListYandexPlayerImpl.PostponedOperation {
    @Override // ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerImpl.PostponedOperation
    public final void invoke(YandexPlayer yandexPlayer) {
        yandexPlayer.stopKeepingDecoders();
    }
}
