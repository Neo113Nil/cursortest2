package defpackage;

import ru.yandex.video.m3.list_player_manager.impl.telemetry.InitMediaItemData;

/* loaded from: classes6.dex */
public final /* synthetic */ class ibg extends opi {
    public static final ibg b = new ibg(InitMediaItemData.class, "sourceIndex", "getSourceIndex()Ljava/lang/Integer;", 0);

    @Override // defpackage.opi, defpackage.q9f
    public final Object get(Object obj) {
        return ((InitMediaItemData) obj).getSourceIndex();
    }

    @Override // defpackage.opi
    public final void k(InitMediaItemData initMediaItemData, Object obj) {
        initMediaItemData.setSourceIndex((Integer) obj);
    }
}
