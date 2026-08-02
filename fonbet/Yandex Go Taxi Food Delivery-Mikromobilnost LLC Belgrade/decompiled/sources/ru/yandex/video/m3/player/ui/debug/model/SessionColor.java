package ru.yandex.video.m3.player.ui.debug.model;

import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;
import ru.yandex.video.m3.player.ui.debug.view.graph.DebugGraphView;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/model/SessionColor;", "", "color", "", "(Ljava/lang/String;II)V", "getColor", "()I", "GREEN", "YELLOW", "RED", JCP.RAW_PREFIX, "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum SessionColor {
    GREEN(DebugGraphView.DEFAULT_GRAPH_COLOR),
    YELLOW(-256),
    RED(-65536),
    NONE(0);

    private final int color;

    SessionColor(int i) {
        this.color = i;
    }

    public final int getColor() {
        return this.color;
    }
}
