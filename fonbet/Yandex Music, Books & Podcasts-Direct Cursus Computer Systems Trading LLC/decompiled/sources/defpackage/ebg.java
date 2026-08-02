package defpackage;

import ru.yandex.video.m3.list_player_manager.impl.telemetry.InitMediaItemData;

/* loaded from: classes6.dex */
public final /* synthetic */ class ebg extends opi {
    public static final ebg b = new ebg(InitMediaItemData.class, "playerIndex", "getPlayerIndex()Ljava/lang/Integer;", 0);

    @Override // defpackage.opi, defpackage.q9f
    public final Object get(Object obj) {
        return ((InitMediaItemData) obj).getPlayerIndex();
    }

    @Override // defpackage.opi
    public final void k(InitMediaItemData initMediaItemData, Object obj) {
        initMediaItemData.setPlayerIndex((Integer) obj);
    }
}
