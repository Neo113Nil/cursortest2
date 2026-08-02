package defpackage;

import ru.yandex.video.m3.list_player_manager.impl.telemetry.InitMediaItemData;

/* loaded from: classes6.dex */
public final /* synthetic */ class vag extends opi {
    public static final vag b = new vag(InitMediaItemData.class, "connectPlaybackEngineDelta", "getConnectPlaybackEngineDelta()Ljava/lang/Long;", 0);

    @Override // defpackage.opi, defpackage.q9f
    public final Object get(Object obj) {
        return ((InitMediaItemData) obj).getConnectPlaybackEngineDelta();
    }

    @Override // defpackage.opi
    public final void k(InitMediaItemData initMediaItemData, Object obj) {
        initMediaItemData.setConnectPlaybackEngineDelta((Long) obj);
    }
}
