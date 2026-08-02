package defpackage;

import ru.yandex.video.m3.list_player_manager.impl.telemetry.InitMediaItemData;

/* loaded from: classes6.dex */
public final /* synthetic */ class abg extends opi {
    public static final abg b = new abg(InitMediaItemData.class, "loadVideoDataDelta", "getLoadVideoDataDelta()Ljava/lang/Long;", 0);

    @Override // defpackage.opi, defpackage.q9f
    public final Object get(Object obj) {
        return ((InitMediaItemData) obj).getLoadVideoDataDelta();
    }

    @Override // defpackage.opi
    public final void k(InitMediaItemData initMediaItemData, Object obj) {
        initMediaItemData.setLoadVideoDataDelta((Long) obj);
    }
}
