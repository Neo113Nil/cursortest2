package defpackage;

import ru.yandex.video.m3.list_player_manager.impl.telemetry.InitMediaItemData;

/* loaded from: classes6.dex */
public final /* synthetic */ class hbg extends opi {
    public static final hbg b = new hbg(InitMediaItemData.class, "setSourceDelta", "getSetSourceDelta()Ljava/lang/Long;", 0);

    @Override // defpackage.opi, defpackage.q9f
    public final Object get(Object obj) {
        return ((InitMediaItemData) obj).getSetSourceDelta();
    }

    @Override // defpackage.opi
    public final void k(InitMediaItemData initMediaItemData, Object obj) {
        initMediaItemData.setSetSourceDelta((Long) obj);
    }
}
