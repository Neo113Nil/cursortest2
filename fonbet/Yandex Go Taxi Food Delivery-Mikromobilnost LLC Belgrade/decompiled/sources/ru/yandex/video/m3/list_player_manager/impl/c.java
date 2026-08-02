package ru.yandex.video.m3.list_player_manager.impl;

import ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerImpl;
import ru.yandex.video.m3.player.YandexPlayer;

/* loaded from: classes7.dex */
public final /* synthetic */ class c implements ListYandexPlayerImpl.PostponedOperation {
    public final /* synthetic */ int a;
    public final /* synthetic */ ListYandexPlayerImpl b;

    public /* synthetic */ c(ListYandexPlayerImpl listYandexPlayerImpl, int i) {
        this.a = i;
        this.b = listYandexPlayerImpl;
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerImpl.PostponedOperation
    public final void invoke(YandexPlayer yandexPlayer) {
        int i = this.a;
        ListYandexPlayerImpl listYandexPlayerImpl = this.b;
        switch (i) {
            case 0:
                ListYandexPlayerImpl.pause$lambda$56$lambda$55(listYandexPlayerImpl, yandexPlayer);
                break;
            default:
                ListYandexPlayerImpl.play$lambda$51$lambda$50(listYandexPlayerImpl, yandexPlayer);
                break;
        }
    }
}
