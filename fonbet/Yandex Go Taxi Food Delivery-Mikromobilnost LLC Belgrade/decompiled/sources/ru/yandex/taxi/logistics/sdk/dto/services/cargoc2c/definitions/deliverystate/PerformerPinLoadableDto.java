package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.oo31;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPinLoadableDto;", "", "imageTag", "", "rotatable", "", "anchor", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPinLoadableDto$AnchorDto;", "<init>", "(Ljava/lang/String;ZLru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPinLoadableDto$AnchorDto;)V", "getImageTag", "()Ljava/lang/String;", "getRotatable", "()Z", "getAnchor", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPinLoadableDto$AnchorDto;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "AnchorDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PerformerPinLoadableDto {
    private final AnchorDto anchor;
    private final String imageTag;
    private final boolean rotatable;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPinLoadableDto$AnchorDto;", "", RemoteBioParameters.X, "", RemoteBioParameters.Y, "<init>", "(DD)V", "getX", "()D", "getY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AnchorDto {
        private final double x;
        private final double y;

        public AnchorDto(@Json(name = "x") double d, @Json(name = "y") double d2) {
            this.x = d;
            this.y = d2;
        }

        public static /* synthetic */ AnchorDto copy$default(AnchorDto anchorDto, double d, double d2, int i, Object obj) {
            if ((i & 1) != 0) {
                d = anchorDto.x;
            }
            if ((i & 2) != 0) {
                d2 = anchorDto.y;
            }
            return anchorDto.copy(d, d2);
        }

        /* renamed from: component1, reason: from getter */
        public final double getX() {
            return this.x;
        }

        /* renamed from: component2, reason: from getter */
        public final double getY() {
            return this.y;
        }

        public final AnchorDto copy(@Json(name = "x") double x, @Json(name = "y") double y) {
            return new AnchorDto(x, y);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnchorDto)) {
                return false;
            }
            AnchorDto anchorDto = (AnchorDto) other;
            return Double.compare(this.x, anchorDto.x) == 0 && Double.compare(this.y, anchorDto.y) == 0;
        }

        public final double getX() {
            return this.x;
        }

        public final double getY() {
            return this.y;
        }

        public int hashCode() {
            return Double.hashCode(this.y) + (Double.hashCode(this.x) * 31);
        }

        public String toString() {
            double d = this.x;
            return nzs.c(oyr.u(d, "AnchorDto(x=", ", y="), this.y, Extension.C_BRAKE);
        }
    }

    public PerformerPinLoadableDto(@Json(name = "image_tag") String str, @Json(name = "rotatable") boolean z, @Json(name = "anchor") AnchorDto anchorDto) {
        this.imageTag = str;
        this.rotatable = z;
        this.anchor = anchorDto;
    }

    public static /* synthetic */ PerformerPinLoadableDto copy$default(PerformerPinLoadableDto performerPinLoadableDto, String str, boolean z, AnchorDto anchorDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = performerPinLoadableDto.imageTag;
        }
        if ((i & 2) != 0) {
            z = performerPinLoadableDto.rotatable;
        }
        if ((i & 4) != 0) {
            anchorDto = performerPinLoadableDto.anchor;
        }
        return performerPinLoadableDto.copy(str, z, anchorDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getImageTag() {
        return this.imageTag;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getRotatable() {
        return this.rotatable;
    }

    /* renamed from: component3, reason: from getter */
    public final AnchorDto getAnchor() {
        return this.anchor;
    }

    public final PerformerPinLoadableDto copy(@Json(name = "image_tag") String imageTag, @Json(name = "rotatable") boolean rotatable, @Json(name = "anchor") AnchorDto anchor) {
        return new PerformerPinLoadableDto(imageTag, rotatable, anchor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PerformerPinLoadableDto)) {
            return false;
        }
        PerformerPinLoadableDto performerPinLoadableDto = (PerformerPinLoadableDto) other;
        return jl40.l(this.imageTag, performerPinLoadableDto.imageTag) && this.rotatable == performerPinLoadableDto.rotatable && jl40.l(this.anchor, performerPinLoadableDto.anchor);
    }

    public final AnchorDto getAnchor() {
        return this.anchor;
    }

    public final String getImageTag() {
        return this.imageTag;
    }

    public final boolean getRotatable() {
        return this.rotatable;
    }

    public int hashCode() {
        return this.anchor.hashCode() + unr0.e(this.imageTag.hashCode() * 31, 31, this.rotatable);
    }

    public String toString() {
        String str = this.imageTag;
        boolean z = this.rotatable;
        AnchorDto anchorDto = this.anchor;
        StringBuilder l = oo31.l("PerformerPinLoadableDto(imageTag=", str, ", rotatable=", ", anchor=", z);
        l.append(anchorDto);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
