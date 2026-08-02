package defpackage;

import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData$UgcLiveStatus;

/* loaded from: classes4.dex */
public final class jzn extends pxm {
    public final long c;
    public final boolean d;

    public jzn(long j, String str, String str2, boolean z) {
        super(str, str2);
        this.c = j;
        this.d = z;
    }

    @Override // defpackage.pxm
    public final void d(p3i p3iVar) {
        super.d(p3iVar);
        p3iVar.c(Long.valueOf(this.c), "elapsedTime");
        p3iVar.e(UgcLiveVideoData$UgcLiveStatus.READY, this.d);
    }
}
