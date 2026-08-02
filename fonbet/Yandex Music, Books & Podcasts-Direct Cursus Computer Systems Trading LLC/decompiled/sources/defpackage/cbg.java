package defpackage;

import ru.yandex.video.m3.list_player_manager.impl.telemetry.InitMediaItemData;

/* loaded from: classes6.dex */
public final /* synthetic */ class cbg extends opi {
    public static final cbg b = new cbg(InitMediaItemData.class, "notStartPlaybackReason", "getNotStartPlaybackReason()Ljava/lang/String;", 0);

    @Override // defpackage.opi, defpackage.q9f
    public final Object get(Object obj) {
        return ((InitMediaItemData) obj).getNotStartPlaybackReason();
    }

    @Override // defpackage.opi
    public final void k(InitMediaItemData initMediaItemData, Object obj) {
        initMediaItemData.setNotStartPlaybackReason((String) obj);
    }
}
