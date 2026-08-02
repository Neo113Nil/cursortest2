package defpackage;

import ru.yandex.video.m3.list_player_manager.impl.telemetry.InitMediaItemData;

/* loaded from: classes6.dex */
public final /* synthetic */ class uag extends opi {
    public static final uag b = new uag(InitMediaItemData.class, "blurDelta", "getBlurDelta()Ljava/lang/Long;", 0);

    @Override // defpackage.opi, defpackage.q9f
    public final Object get(Object obj) {
        return ((InitMediaItemData) obj).getBlurDelta();
    }

    @Override // defpackage.opi
    public final void k(InitMediaItemData initMediaItemData, Object obj) {
        initMediaItemData.setBlurDelta((Long) obj);
    }
}
