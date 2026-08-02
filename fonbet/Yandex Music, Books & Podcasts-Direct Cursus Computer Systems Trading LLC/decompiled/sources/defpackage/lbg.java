package defpackage;

import ru.yandex.video.m3.list_player_manager.impl.telemetry.InitMediaItemData;

/* loaded from: classes6.dex */
public final /* synthetic */ class lbg extends opi {
    public static final lbg b = new lbg(InitMediaItemData.class, "videoDataFromCache", "getVideoDataFromCache()Ljava/lang/Boolean;", 0);

    @Override // defpackage.opi, defpackage.q9f
    public final Object get(Object obj) {
        return ((InitMediaItemData) obj).getVideoDataFromCache();
    }

    @Override // defpackage.opi
    public final void k(InitMediaItemData initMediaItemData, Object obj) {
        initMediaItemData.setVideoDataFromCache((Boolean) obj);
    }
}
