package ru.yandex.video.m3.player.ui.debug.internal.model;

import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.ui.debug.model.DrmMode;
import ru.yandex.video.m3.player.ui.debug.model.Size;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lru/yandex/video/m3/player/ui/debug/internal/model/OtherData;", "", "viewPortSize", "Lru/yandex/video/m3/player/ui/debug/model/Size;", "drmMode", "Lru/yandex/video/m3/player/ui/debug/model/DrmMode;", "droppedFrames", "", "networkTypeName", "", "lastError", "(Lru/yandex/video/m3/player/ui/debug/model/Size;Lru/yandex/video/m3/player/ui/debug/model/DrmMode;ILjava/lang/String;Ljava/lang/String;)V", "getDrmMode", "()Lru/yandex/video/m3/player/ui/debug/model/DrmMode;", "getDroppedFrames", "()I", "getLastError", "()Ljava/lang/String;", "getNetworkTypeName", "getViewPortSize", "()Lru/yandex/video/m3/player/ui/debug/model/Size;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class OtherData {
    public static final int $stable = 0;
    private final DrmMode drmMode;
    private final int droppedFrames;
    private final String lastError;
    private final String networkTypeName;
    private final Size viewPortSize;

    public /* synthetic */ OtherData(Size size, DrmMode drmMode, int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : size, (i2 & 2) != 0 ? null : drmMode, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2);
    }

    public static /* synthetic */ OtherData copy$default(OtherData otherData, Size size, DrmMode drmMode, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            size = otherData.viewPortSize;
        }
        if ((i2 & 2) != 0) {
            drmMode = otherData.drmMode;
        }
        if ((i2 & 4) != 0) {
            i = otherData.droppedFrames;
        }
        if ((i2 & 8) != 0) {
            str = otherData.networkTypeName;
        }
        if ((i2 & 16) != 0) {
            str2 = otherData.lastError;
        }
        String str3 = str2;
        int i3 = i;
        return otherData.copy(size, drmMode, i3, str, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final Size getViewPortSize() {
        return this.viewPortSize;
    }

    /* renamed from: component2, reason: from getter */
    public final DrmMode getDrmMode() {
        return this.drmMode;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDroppedFrames() {
        return this.droppedFrames;
    }

    /* renamed from: component4, reason: from getter */
    public final String getNetworkTypeName() {
        return this.networkTypeName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLastError() {
        return this.lastError;
    }

    public final OtherData copy(Size viewPortSize, DrmMode drmMode, int droppedFrames, String networkTypeName, String lastError) {
        return new OtherData(viewPortSize, drmMode, droppedFrames, networkTypeName, lastError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtherData)) {
            return false;
        }
        OtherData otherData = (OtherData) other;
        return jl40.l(this.viewPortSize, otherData.viewPortSize) && this.drmMode == otherData.drmMode && this.droppedFrames == otherData.droppedFrames && jl40.l(this.networkTypeName, otherData.networkTypeName) && jl40.l(this.lastError, otherData.lastError);
    }

    public final DrmMode getDrmMode() {
        return this.drmMode;
    }

    public final int getDroppedFrames() {
        return this.droppedFrames;
    }

    public final String getLastError() {
        return this.lastError;
    }

    public final String getNetworkTypeName() {
        return this.networkTypeName;
    }

    public final Size getViewPortSize() {
        return this.viewPortSize;
    }

    public int hashCode() {
        Size size = this.viewPortSize;
        int hashCode = (size == null ? 0 : size.hashCode()) * 31;
        DrmMode drmMode = this.drmMode;
        int b = oyr.b(this.droppedFrames, (hashCode + (drmMode == null ? 0 : drmMode.hashCode())) * 31, 31);
        String str = this.networkTypeName;
        int hashCode2 = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastError;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OtherData(viewPortSize=");
        sb.append(this.viewPortSize);
        sb.append(", drmMode=");
        sb.append(this.drmMode);
        sb.append(", droppedFrames=");
        sb.append(this.droppedFrames);
        sb.append(", networkTypeName=");
        sb.append(this.networkTypeName);
        sb.append(", lastError=");
        return b64.p(sb, this.lastError, ')');
    }

    public OtherData(Size size, DrmMode drmMode, int i, String str, String str2) {
        this.viewPortSize = size;
        this.drmMode = drmMode;
        this.droppedFrames = i;
        this.networkTypeName = str;
        this.lastError = str2;
    }

    public OtherData() {
        this(null, null, 0, null, null, 31, null);
    }
}
