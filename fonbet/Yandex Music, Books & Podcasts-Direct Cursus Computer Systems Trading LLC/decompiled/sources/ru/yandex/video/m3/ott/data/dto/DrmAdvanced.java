package ru.yandex.video.m3.ott.data.dto;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/DrmAdvanced;", "", "widevine", "Lru/yandex/video/m3/ott/data/dto/DrmAdvancedWidevine;", "(Lru/yandex/video/m3/ott/data/dto/DrmAdvancedWidevine;)V", "getWidevine", "()Lru/yandex/video/m3/ott/data/dto/DrmAdvancedWidevine;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final /* data */ class DrmAdvanced {
    public static final int $stable = 0;

    @SerializedName("com.widevine.alpha")
    private final DrmAdvancedWidevine widevine;

    public DrmAdvanced(DrmAdvancedWidevine drmAdvancedWidevine) {
        this.widevine = drmAdvancedWidevine;
    }

    public static /* synthetic */ DrmAdvanced copy$default(DrmAdvanced drmAdvanced, DrmAdvancedWidevine drmAdvancedWidevine, int i, Object obj) {
        if ((i & 1) != 0) {
            drmAdvancedWidevine = drmAdvanced.widevine;
        }
        return drmAdvanced.copy(drmAdvancedWidevine);
    }

    /* renamed from: component1, reason: from getter */
    public final DrmAdvancedWidevine getWidevine() {
        return this.widevine;
    }

    @NotNull
    public final DrmAdvanced copy(DrmAdvancedWidevine widevine) {
        return new DrmAdvanced(widevine);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DrmAdvanced) && Intrinsics.d(this.widevine, ((DrmAdvanced) other).widevine);
    }

    public final DrmAdvancedWidevine getWidevine() {
        return this.widevine;
    }

    public int hashCode() {
        DrmAdvancedWidevine drmAdvancedWidevine = this.widevine;
        if (drmAdvancedWidevine == null) {
            return 0;
        }
        return drmAdvancedWidevine.hashCode();
    }

    @NotNull
    public String toString() {
        return "DrmAdvanced(widevine=" + this.widevine + ')';
    }
}
