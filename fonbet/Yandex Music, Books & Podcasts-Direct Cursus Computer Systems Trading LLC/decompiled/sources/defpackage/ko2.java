package defpackage;

import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData$UgcLiveStatus;

/* loaded from: classes3.dex */
public interface ko2 extends mo2 {
    @Override // defpackage.mo2
    default String a() {
        return UgcLiveVideoData$UgcLiveStatus.OFFLINE;
    }

    boolean b();
}
