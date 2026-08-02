package defpackage;

import ru.yandex.video.m3.list_player_manager.impl.telemetry.InitMediaItemData;

/* loaded from: classes6.dex */
public final /* synthetic */ class gbg extends opi {
    public static final gbg b = new gbg(InitMediaItemData.class, "positionInItemsList", "getPositionInItemsList()Ljava/lang/Integer;", 0);

    @Override // defpackage.opi, defpackage.q9f
    public final Object get(Object obj) {
        return ((InitMediaItemData) obj).getPositionInItemsList();
    }

    @Override // defpackage.opi
    public final void k(InitMediaItemData initMediaItemData, Object obj) {
        initMediaItemData.setPositionInItemsList((Integer) obj);
    }
}
