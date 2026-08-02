package ru.yandex.video.m3.player.ui.debug.model;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/model/SessionColor;", "", "", "a", "I", "getColor", "()I", "color", "GREEN", "YELLOW", "RED", "NONE", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public enum SessionColor {
    GREEN(-16711936),
    YELLOW(-256),
    RED(-65536),
    NONE(0);


    /* renamed from: a, reason: from kotlin metadata */
    public final int color;

    SessionColor(int i) {
        this.color = i;
    }

    public final int getColor() {
        return this.color;
    }
}
