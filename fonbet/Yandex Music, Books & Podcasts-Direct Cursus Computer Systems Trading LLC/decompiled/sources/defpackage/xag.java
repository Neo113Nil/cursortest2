package defpackage;

import ru.yandex.video.m3.list_player_manager.impl.telemetry.InitMediaItemData;

/* loaded from: classes6.dex */
public final /* synthetic */ class xag extends opi {
    public static final xag b = new xag(InitMediaItemData.class, "imageDelta", "getImageDelta()Ljava/lang/Long;", 0);

    @Override // defpackage.opi, defpackage.q9f
    public final Object get(Object obj) {
        return ((InitMediaItemData) obj).getImageDelta();
    }

    @Override // defpackage.opi
    public final void k(InitMediaItemData initMediaItemData, Object obj) {
        initMediaItemData.setImageDelta((Long) obj);
    }
}
