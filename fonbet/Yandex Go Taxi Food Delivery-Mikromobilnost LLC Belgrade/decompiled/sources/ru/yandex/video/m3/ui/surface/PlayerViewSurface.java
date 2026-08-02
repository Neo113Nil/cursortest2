package ru.yandex.video.m3.ui.surface;

import android.widget.ImageView;
import defpackage.sls;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B4\b\u0000\u0012\u000b\u0010\u0004\u001a\u00070\u0002¢\u0006\u0002\b\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R4\u0010\u0004\u001a\u00070\u0002¢\u0006\u0002\b\u00032\u000b\u0010\u0013\u001a\u00070\u0002¢\u0006\u0002\b\u00038\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00058\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u0006\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00058\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u0007\u0010\u001a\"\u0004\b\u001d\u0010\u001cR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/yandex/video/m3/ui/surface/PlayerViewSurface;", "", "", "Lru/yandex/video/m3/ui/surface/PlayerViewSurfaceType;", "type", "", "isActive", "isReadyForDisplay", "Lkotlin/Function0;", "Lzy11;", "onActivate", "<init>", "(IZZLsls;)V", "activate", "()V", "", "toString", "()Ljava/lang/String;", "Lsls;", "<set-?>", CA20Status.STATUS_USER_I, "getType", "()I", "setType$video_player_internalRelease", "(I)V", "Z", "()Z", "setActive$video_player_internalRelease", "(Z)V", "setReadyForDisplay$video_player_internalRelease", "Landroid/widget/ImageView$ScaleType;", "scaleType", "Landroid/widget/ImageView$ScaleType;", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "setScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PlayerViewSurface {
    public static final int $stable = 8;
    private boolean isActive;
    private boolean isReadyForDisplay;
    private final sls onActivate;
    private ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
    private int type;

    public PlayerViewSurface(int i, boolean z, boolean z2, sls slsVar) {
        this.onActivate = slsVar;
        this.type = i;
        this.isActive = z;
        this.isReadyForDisplay = z2;
    }

    public final void activate() {
        this.onActivate.invoke();
    }

    public final ImageView.ScaleType getScaleType() {
        return this.scaleType;
    }

    public final int getType() {
        return this.type;
    }

    /* renamed from: isActive, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* renamed from: isReadyForDisplay, reason: from getter */
    public final boolean getIsReadyForDisplay() {
        return this.isReadyForDisplay;
    }

    public final void setActive$video_player_internalRelease(boolean z) {
        this.isActive = z;
    }

    public final void setReadyForDisplay$video_player_internalRelease(boolean z) {
        this.isReadyForDisplay = z;
    }

    public final void setScaleType(ImageView.ScaleType scaleType) {
        this.scaleType = scaleType;
    }

    public final void setType$video_player_internalRelease(int i) {
        this.type = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlayerViewSurface(type=");
        sb.append(this.type);
        sb.append(", isReadyForDisplay=");
        sb.append(this.isReadyForDisplay);
        sb.append(", isActive=");
        return unr0.u(sb, this.isActive, ')');
    }
}
