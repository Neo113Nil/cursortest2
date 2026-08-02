package ru.yandex.video.m3.player.impl;

import android.util.Log;
import defpackage.iq60;
import defpackage.kgx;
import defpackage.oyr;
import defpackage.qoi0;
import defpackage.unr0;
import defpackage.xbi0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.provider.Consumer;
import ru.yandex.video.m3.player.provider.model.SurfaceSize;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b,\b\u0081\b\u0018\u0000 L2\u00020\u0001:\u0001LB#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ.\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u001a\u0010&\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\tH\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0016H\u0002¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b,\u0010-R\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001b\"\u0004\b0\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010.\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00103R\"\u00104\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00103\u001a\u0004\b5\u0010-\"\u0004\b6\u0010\u0014R\"\u00107\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00103\u001a\u0004\b8\u0010-\"\u0004\b9\u0010\u0014R\u0018\u0010:\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010.R\u0016\u0010<\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00103R\u001e\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R+\u0010E\u001a\u00020\u00162\u0006\u0010?\u001a\u00020\u00168B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010+\"\u0004\bC\u0010DR\u0011\u0010G\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bF\u0010\u001bR\u0011\u0010I\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bH\u0010\u001bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lru/yandex/video/m3/player/impl/SurfaceSizeHolderInternal;", "", "", "surfaceWidth", "surfaceHeight", "", "experimentalShouldConsiderUserQuality", "<init>", "(IIZ)V", "Lzy11;", "setSize", "(II)V", "serviceQuality", "setServiceQuality", "(I)V", "userQuality", "setUserQuality", "(Ljava/lang/Integer;)V", "prefer", "setPreferHD", "(Z)V", "Lru/yandex/video/m3/player/provider/Consumer;", "Lru/yandex/video/m3/player/provider/model/SurfaceSize;", "consumer", "setSurfaceSizeConsumer", "(Lru/yandex/video/m3/player/provider/Consumer;)V", "component1$video_player_internalRelease", "()I", "component1", "component2$video_player_internalRelease", "component2", "copy", "(IIZ)Lru/yandex/video/m3/player/impl/SurfaceSizeHolderInternal;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "updateCappingParams", "()V", "calculateCappingParams", "()Lru/yandex/video/m3/player/provider/model/SurfaceSize;", "component3", "()Z", CA20Status.STATUS_USER_I, "getSurfaceWidth$video_player_internalRelease", "setSurfaceWidth$video_player_internalRelease", "getSurfaceHeight$video_player_internalRelease", "setSurfaceHeight$video_player_internalRelease", "Z", "getterWasUsed", "getGetterWasUsed", "setGetterWasUsed", "setSizeWasInvoked", "getSetSizeWasInvoked", "setSetSizeWasInvoked", "_userQuality", "Ljava/lang/Integer;", "preferHD", "surfaceSizeConsumer", "Lru/yandex/video/m3/player/provider/Consumer;", "<set-?>", "cappingSize$delegate", "Lxbi0;", "getCappingSize", "setCappingSize", "(Lru/yandex/video/m3/player/provider/model/SurfaceSize;)V", "cappingSize", "getCappingWidth", "cappingWidth", "getCappingHeight", "cappingHeight", "getUserQuality", "()Ljava/lang/Integer;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SurfaceSizeHolderInternal {
    static final /* synthetic */ kgx[] $$delegatedProperties;
    public static final int $stable;
    private static final Companion Companion;
    private static final String LOG_TAG = "YP:Capping";
    private Integer _userQuality;

    /* renamed from: cappingSize$delegate, reason: from kotlin metadata */
    private final xbi0 cappingSize;
    private final boolean experimentalShouldConsiderUserQuality;
    private boolean getterWasUsed;
    private boolean preferHD;
    private int serviceQuality;
    private boolean setSizeWasInvoked;
    private int surfaceHeight;
    private Consumer<SurfaceSize> surfaceSizeConsumer;
    private int surfaceWidth;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("cappingSize", 0, "getCappingSize()Lru/yandex/video/m3/player/provider/model/SurfaceSize;", SurfaceSizeHolderInternal.class);
        qoi0.a.getClass();
        $$delegatedProperties = new kgx[]{mutablePropertyReference1Impl};
        Companion = new Companion(null);
        $stable = 8;
    }

    public SurfaceSizeHolderInternal(int i, int i2, boolean z) {
        this.surfaceWidth = i;
        this.surfaceHeight = i2;
        this.experimentalShouldConsiderUserQuality = z;
        this.serviceQuality = Integer.MAX_VALUE;
        final SurfaceSize calculateCappingParams = calculateCappingParams();
        this.cappingSize = new iq60(calculateCappingParams) { // from class: ru.yandex.video.m3.player.impl.SurfaceSizeHolderInternal$special$$inlined$observable$1
            @Override // defpackage.iq60
            public void afterChange(kgx property, SurfaceSize oldValue, SurfaceSize newValue) {
                Consumer consumer;
                SurfaceSize surfaceSize = newValue;
                Log.i("YP:Capping", "Capping adjusted: " + oldValue + " -> " + surfaceSize);
                consumer = this.surfaceSizeConsumer;
                if (consumer != null) {
                    consumer.accept(surfaceSize);
                }
            }
        };
    }

    private final SurfaceSize calculateCappingParams() {
        int i;
        int i2 = getUserQuality() != null ? Integer.MAX_VALUE : this.surfaceWidth;
        if (this.experimentalShouldConsiderUserQuality) {
            Integer userQuality = getUserQuality();
            i = userQuality != null ? userQuality.intValue() : Math.min(this.serviceQuality, this.surfaceHeight);
        } else {
            i = this.preferHD ? this.surfaceHeight : this.serviceQuality;
        }
        return new SurfaceSize(i2, i);
    }

    /* renamed from: component3, reason: from getter */
    private final boolean getExperimentalShouldConsiderUserQuality() {
        return this.experimentalShouldConsiderUserQuality;
    }

    public static /* synthetic */ SurfaceSizeHolderInternal copy$default(SurfaceSizeHolderInternal surfaceSizeHolderInternal, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = surfaceSizeHolderInternal.surfaceWidth;
        }
        if ((i3 & 2) != 0) {
            i2 = surfaceSizeHolderInternal.surfaceHeight;
        }
        if ((i3 & 4) != 0) {
            z = surfaceSizeHolderInternal.experimentalShouldConsiderUserQuality;
        }
        return surfaceSizeHolderInternal.copy(i, i2, z);
    }

    private final SurfaceSize getCappingSize() {
        return (SurfaceSize) this.cappingSize.getValue(this, $$delegatedProperties[0]);
    }

    private final Integer getUserQuality() {
        if (this.experimentalShouldConsiderUserQuality) {
            return this._userQuality;
        }
        return null;
    }

    private final void setCappingSize(SurfaceSize surfaceSize) {
        this.cappingSize.setValue(this, $$delegatedProperties[0], surfaceSize);
    }

    private final void updateCappingParams() {
        setCappingSize(calculateCappingParams());
    }

    /* renamed from: component1$video_player_internalRelease, reason: from getter */
    public final int getSurfaceWidth() {
        return this.surfaceWidth;
    }

    /* renamed from: component2$video_player_internalRelease, reason: from getter */
    public final int getSurfaceHeight() {
        return this.surfaceHeight;
    }

    public final SurfaceSizeHolderInternal copy(int surfaceWidth, int surfaceHeight, boolean experimentalShouldConsiderUserQuality) {
        return new SurfaceSizeHolderInternal(surfaceWidth, surfaceHeight, experimentalShouldConsiderUserQuality);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurfaceSizeHolderInternal)) {
            return false;
        }
        SurfaceSizeHolderInternal surfaceSizeHolderInternal = (SurfaceSizeHolderInternal) other;
        return this.surfaceWidth == surfaceSizeHolderInternal.surfaceWidth && this.surfaceHeight == surfaceSizeHolderInternal.surfaceHeight && this.experimentalShouldConsiderUserQuality == surfaceSizeHolderInternal.experimentalShouldConsiderUserQuality;
    }

    public final int getCappingHeight() {
        this.getterWasUsed = true;
        return getCappingSize().getHeight();
    }

    public final int getCappingWidth() {
        this.getterWasUsed = true;
        return getCappingSize().getWidth();
    }

    public final boolean getGetterWasUsed() {
        return this.getterWasUsed;
    }

    public final boolean getSetSizeWasInvoked() {
        return this.setSizeWasInvoked;
    }

    public final int getSurfaceHeight$video_player_internalRelease() {
        return this.surfaceHeight;
    }

    public final int getSurfaceWidth$video_player_internalRelease() {
        return this.surfaceWidth;
    }

    public int hashCode() {
        return Boolean.hashCode(this.experimentalShouldConsiderUserQuality) + oyr.b(this.surfaceHeight, Integer.hashCode(this.surfaceWidth) * 31, 31);
    }

    public final void setGetterWasUsed(boolean z) {
        this.getterWasUsed = z;
    }

    public final void setPreferHD(boolean prefer) {
        this.preferHD = prefer;
        updateCappingParams();
    }

    public final void setServiceQuality(int serviceQuality) {
        this.serviceQuality = serviceQuality;
        updateCappingParams();
    }

    public final void setSetSizeWasInvoked(boolean z) {
        this.setSizeWasInvoked = z;
    }

    public final void setSize(int surfaceWidth, int surfaceHeight) {
        this.setSizeWasInvoked = true;
        this.surfaceWidth = surfaceWidth;
        this.surfaceHeight = surfaceHeight;
        updateCappingParams();
    }

    public final void setSurfaceHeight$video_player_internalRelease(int i) {
        this.surfaceHeight = i;
    }

    public final void setSurfaceSizeConsumer(Consumer<SurfaceSize> consumer) {
        this.surfaceSizeConsumer = consumer;
        updateCappingParams();
    }

    public final void setSurfaceWidth$video_player_internalRelease(int i) {
        this.surfaceWidth = i;
    }

    public final void setUserQuality(Integer userQuality) {
        this._userQuality = userQuality;
        updateCappingParams();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SurfaceSizeHolderInternal(surfaceWidth=");
        sb.append(this.surfaceWidth);
        sb.append(", surfaceHeight=");
        sb.append(this.surfaceHeight);
        sb.append(", experimentalShouldConsiderUserQuality=");
        return unr0.u(sb, this.experimentalShouldConsiderUserQuality, ')');
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/impl/SurfaceSizeHolderInternal$Companion;", "", "()V", "LOG_TAG", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ SurfaceSizeHolderInternal(int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? Integer.MAX_VALUE : i, (i3 & 2) != 0 ? Integer.MAX_VALUE : i2, z);
    }
}
