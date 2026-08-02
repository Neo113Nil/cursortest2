package ru.yandex.video.m3.player.ui.debug.compose;

import defpackage.bts;
import defpackage.fid;
import kotlin.Metadata;
import ru.yandex.video.m3.player.ui.debug.model.PlayerDebugViewFlags;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/compose/Flags;", "", "<init>", "()V", "Lru/yandex/video/m3/player/ui/debug/model/PlayerDebugViewFlags;", "getPlayerDebugViewFlags", "(Lfid;I)Lru/yandex/video/m3/player/ui/debug/model/PlayerDebugViewFlags;", "playerDebugViewFlags", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Flags {
    public static final int $stable = 0;
    public static final Flags INSTANCE = new Flags();

    private Flags() {
    }

    public final PlayerDebugViewFlags getPlayerDebugViewFlags(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.f0(1222878633);
        PlayerDebugViewFlags playerDebugViewFlags = (PlayerDebugViewFlags) btsVar.m(DebugViewKt.getLocalPlayerDebugViewFlags());
        btsVar.t(false);
        return playerDebugViewFlags;
    }
}
