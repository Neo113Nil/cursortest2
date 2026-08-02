package ru.yandex.video.m3.player.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.media3.ui.PlayerView;
import defpackage.bo31;
import defpackage.zxc0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.PlayerObserver;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/player/ui/YandexPlayerView;", "Landroidx/media3/ui/PlayerView;", "Lru/yandex/video/m3/player/PlayerObserver;", "Lzxc0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "hidedPlayer", "Lzy11;", "onHidedPlayerReady", "(Lzxc0;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class YandexPlayerView extends PlayerView implements PlayerObserver<zxc0> {
    public static final int $stable = 0;

    public /* synthetic */ YandexPlayerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onHidedPlayerReady(zxc0 hidedPlayer) {
        post(new bo31(13, this, hidedPlayer));
    }

    public YandexPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public YandexPlayerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public YandexPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
