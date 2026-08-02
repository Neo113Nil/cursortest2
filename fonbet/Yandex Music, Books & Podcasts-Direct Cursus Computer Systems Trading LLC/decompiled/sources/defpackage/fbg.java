package defpackage;

import ru.yandex.video.m3.list_player_manager.impl.telemetry.InitMediaItemData;

/* loaded from: classes6.dex */
public final /* synthetic */ class fbg extends opi {
    public static final fbg b = new fbg(InitMediaItemData.class, "playerVsid", "getPlayerVsid()Ljava/lang/String;", 0);

    @Override // defpackage.opi, defpackage.q9f
    public final Object get(Object obj) {
        return ((InitMediaItemData) obj).getPlayerVsid();
    }

    @Override // defpackage.opi
    public final void k(InitMediaItemData initMediaItemData, Object obj) {
        initMediaItemData.setPlayerVsid((String) obj);
    }
}
