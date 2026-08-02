package ru.yandex.video.m3.ui;

import android.view.View;
import defpackage.zxc0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0006¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/ui/PlayerView;", "", "", "color", "Lzy11;", "setShutterBackgroundColor", "(I)V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Lzxc0;", "getPlayer", "()Lzxc0;", "setPlayer", "(Lzxc0;)V", "player", "getResizeMode", "()I", "setResizeMode", "resizeMode", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface PlayerView {
    zxc0 getPlayer();

    int getResizeMode();

    View getView();

    void setPlayer(zxc0 zxc0Var);

    void setResizeMode(int i);

    void setShutterBackgroundColor(int color);
}
