package ru.yandex.video.m3.ab.internal;

import defpackage.eyc;
import defpackage.fyc;
import defpackage.gwk0;
import defpackage.noh;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/ab/internal/VpuidHolderImpl;", "Lru/yandex/video/m3/ab/internal/VpuidHolder;", "<init>", "()V", "", "vpuid", "Lzy11;", "onVpuidObtained$video_player_internalRelease", "(Ljava/lang/String;)V", "onVpuidObtained", "Leyc;", "_vpuid", "Leyc;", "Lnoh;", "getVpuid", "()Lnoh;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VpuidHolderImpl implements VpuidHolder {
    public static final int $stable = 8;
    private final eyc _vpuid = gwk0.b();

    @Override // ru.yandex.video.m3.ab.internal.VpuidHolder
    public noh getVpuid() {
        return this._vpuid;
    }

    public final void onVpuidObtained$video_player_internalRelease(String vpuid) {
        ((fyc) this._vpuid).T(vpuid);
    }
}
