package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.b64;
import defpackage.jl40;
import defpackage.x4e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ModalViewListItemDto;", "", "title", "", "subtitle", "leadIcon", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/RemoteIconDto;", "trailIcon", BackendConfig.Restrictions.ENABLED, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/RemoteIconDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/RemoteIconDto;Z)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getLeadIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/RemoteIconDto;", "getTrailIcon", "getEnabled", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ModalViewListItemDto {
    private final boolean enabled;
    private final RemoteIconDto leadIcon;
    private final String subtitle;
    private final String title;
    private final RemoteIconDto trailIcon;

    public /* synthetic */ ModalViewListItemDto(String str, String str2, RemoteIconDto remoteIconDto, RemoteIconDto remoteIconDto2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, remoteIconDto, remoteIconDto2, (i & 16) != 0 ? true : z);
    }

    public static /* synthetic */ ModalViewListItemDto copy$default(ModalViewListItemDto modalViewListItemDto, String str, String str2, RemoteIconDto remoteIconDto, RemoteIconDto remoteIconDto2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = modalViewListItemDto.title;
        }
        if ((i & 2) != 0) {
            str2 = modalViewListItemDto.subtitle;
        }
        if ((i & 4) != 0) {
            remoteIconDto = modalViewListItemDto.leadIcon;
        }
        if ((i & 8) != 0) {
            remoteIconDto2 = modalViewListItemDto.trailIcon;
        }
        if ((i & 16) != 0) {
            z = modalViewListItemDto.enabled;
        }
        boolean z2 = z;
        RemoteIconDto remoteIconDto3 = remoteIconDto;
        return modalViewListItemDto.copy(str, str2, remoteIconDto3, remoteIconDto2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final RemoteIconDto getLeadIcon() {
        return this.leadIcon;
    }

    /* renamed from: component4, reason: from getter */
    public final RemoteIconDto getTrailIcon() {
        return this.trailIcon;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final ModalViewListItemDto copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "lead_icon") RemoteIconDto leadIcon, @Json(name = "trail_icon") RemoteIconDto trailIcon, @Json(name = "enabled") boolean enabled) {
        return new ModalViewListItemDto(title, subtitle, leadIcon, trailIcon, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModalViewListItemDto)) {
            return false;
        }
        ModalViewListItemDto modalViewListItemDto = (ModalViewListItemDto) other;
        return jl40.l(this.title, modalViewListItemDto.title) && jl40.l(this.subtitle, modalViewListItemDto.subtitle) && jl40.l(this.leadIcon, modalViewListItemDto.leadIcon) && jl40.l(this.trailIcon, modalViewListItemDto.trailIcon) && this.enabled == modalViewListItemDto.enabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final RemoteIconDto getLeadIcon() {
        return this.leadIcon;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final RemoteIconDto getTrailIcon() {
        return this.trailIcon;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        RemoteIconDto remoteIconDto = this.leadIcon;
        int hashCode3 = (hashCode2 + (remoteIconDto == null ? 0 : remoteIconDto.hashCode())) * 31;
        RemoteIconDto remoteIconDto2 = this.trailIcon;
        return Boolean.hashCode(this.enabled) + ((hashCode3 + (remoteIconDto2 != null ? remoteIconDto2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        RemoteIconDto remoteIconDto = this.leadIcon;
        RemoteIconDto remoteIconDto2 = this.trailIcon;
        boolean z = this.enabled;
        StringBuilder v = b64.v("ModalViewListItemDto(title=", str, ", subtitle=", str2, ", leadIcon=");
        v.append(remoteIconDto);
        v.append(", trailIcon=");
        v.append(remoteIconDto2);
        v.append(", enabled=");
        return x4e.i(v, z, Extension.C_BRAKE);
    }

    public ModalViewListItemDto(@Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "lead_icon") RemoteIconDto remoteIconDto, @Json(name = "trail_icon") RemoteIconDto remoteIconDto2, @Json(name = "enabled") boolean z) {
        this.title = str;
        this.subtitle = str2;
        this.leadIcon = remoteIconDto;
        this.trailIcon = remoteIconDto2;
        this.enabled = z;
    }
}
