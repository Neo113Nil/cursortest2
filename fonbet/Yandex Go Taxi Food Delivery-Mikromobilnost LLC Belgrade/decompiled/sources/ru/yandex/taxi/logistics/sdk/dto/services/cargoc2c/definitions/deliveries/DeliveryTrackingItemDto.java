package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliveries;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.DeliveryIconStrategyDto;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u00102\u001a\u00020\u0011HÆ\u0003J\t\u00103\u001a\u00020\u0013HÆ\u0003J\t\u00104\u001a\u00020\u0001HÆ\u0003J\u0083\u0001\u00105\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\u00112\b\b\u0003\u0010\u0012\u001a\u00020\u00132\b\b\u0003\u0010\u0014\u001a\u00020\u0001HÆ\u0001J\u0013\u00106\u001a\u00020\u00112\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u0013HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010%R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0014\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006:"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveries/DeliveryTrackingItemDto;", "", "deliveryId", "", "summary", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "icon", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/DeliveryIconStrategyDto;", "performer", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveries/DeliveryTrackingPerformerInfoDto;", "paidWaitingInfo", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveries/DeliveryTrackingPaidWaitingInfoDto;", "performerSearch", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveries/DeliveryTrackingPerformerSearchInfoDto;", "mapInfo", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveries/DeliveryTrackingMapInfoDto;", "isCompleted", "", "commitRevision", "", Constants.REFERRER_API_META, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/DeliveryIconStrategyDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveries/DeliveryTrackingPerformerInfoDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveries/DeliveryTrackingPaidWaitingInfoDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveries/DeliveryTrackingPerformerSearchInfoDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveries/DeliveryTrackingMapInfoDto;ZILjava/lang/Object;)V", "getDeliveryId", "()Ljava/lang/String;", "getSummary", "getDescription", "getIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/DeliveryIconStrategyDto;", "getPerformer", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveries/DeliveryTrackingPerformerInfoDto;", "getPaidWaitingInfo", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveries/DeliveryTrackingPaidWaitingInfoDto;", "getPerformerSearch", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveries/DeliveryTrackingPerformerSearchInfoDto;", "getMapInfo", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveries/DeliveryTrackingMapInfoDto;", "()Z", "getCommitRevision", "()I", "getMeta", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeliveryTrackingItemDto {
    private final int commitRevision;
    private final String deliveryId;
    private final String description;
    private final DeliveryIconStrategyDto icon;
    private final boolean isCompleted;
    private final DeliveryTrackingMapInfoDto mapInfo;
    private final Object meta;
    private final DeliveryTrackingPaidWaitingInfoDto paidWaitingInfo;
    private final DeliveryTrackingPerformerInfoDto performer;
    private final DeliveryTrackingPerformerSearchInfoDto performerSearch;
    private final String summary;

    public DeliveryTrackingItemDto(@Json(name = "delivery_id") String str, @Json(name = "summary") String str2, @Json(name = "description") String str3, @Json(name = "icon") DeliveryIconStrategyDto deliveryIconStrategyDto, @Json(name = "performer") DeliveryTrackingPerformerInfoDto deliveryTrackingPerformerInfoDto, @Json(name = "paid_waiting_info") DeliveryTrackingPaidWaitingInfoDto deliveryTrackingPaidWaitingInfoDto, @Json(name = "performer_search") DeliveryTrackingPerformerSearchInfoDto deliveryTrackingPerformerSearchInfoDto, @Json(name = "map_info") DeliveryTrackingMapInfoDto deliveryTrackingMapInfoDto, @Json(name = "is_completed") boolean z, @Json(name = "commit_revision") int i, @Json(name = "meta") Object obj) {
        this.deliveryId = str;
        this.summary = str2;
        this.description = str3;
        this.icon = deliveryIconStrategyDto;
        this.performer = deliveryTrackingPerformerInfoDto;
        this.paidWaitingInfo = deliveryTrackingPaidWaitingInfoDto;
        this.performerSearch = deliveryTrackingPerformerSearchInfoDto;
        this.mapInfo = deliveryTrackingMapInfoDto;
        this.isCompleted = z;
        this.commitRevision = i;
        this.meta = obj;
    }

    public static /* synthetic */ DeliveryTrackingItemDto copy$default(DeliveryTrackingItemDto deliveryTrackingItemDto, String str, String str2, String str3, DeliveryIconStrategyDto deliveryIconStrategyDto, DeliveryTrackingPerformerInfoDto deliveryTrackingPerformerInfoDto, DeliveryTrackingPaidWaitingInfoDto deliveryTrackingPaidWaitingInfoDto, DeliveryTrackingPerformerSearchInfoDto deliveryTrackingPerformerSearchInfoDto, DeliveryTrackingMapInfoDto deliveryTrackingMapInfoDto, boolean z, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            str = deliveryTrackingItemDto.deliveryId;
        }
        if ((i2 & 2) != 0) {
            str2 = deliveryTrackingItemDto.summary;
        }
        if ((i2 & 4) != 0) {
            str3 = deliveryTrackingItemDto.description;
        }
        if ((i2 & 8) != 0) {
            deliveryIconStrategyDto = deliveryTrackingItemDto.icon;
        }
        if ((i2 & 16) != 0) {
            deliveryTrackingPerformerInfoDto = deliveryTrackingItemDto.performer;
        }
        if ((i2 & 32) != 0) {
            deliveryTrackingPaidWaitingInfoDto = deliveryTrackingItemDto.paidWaitingInfo;
        }
        if ((i2 & 64) != 0) {
            deliveryTrackingPerformerSearchInfoDto = deliveryTrackingItemDto.performerSearch;
        }
        if ((i2 & 128) != 0) {
            deliveryTrackingMapInfoDto = deliveryTrackingItemDto.mapInfo;
        }
        if ((i2 & 256) != 0) {
            z = deliveryTrackingItemDto.isCompleted;
        }
        if ((i2 & 512) != 0) {
            i = deliveryTrackingItemDto.commitRevision;
        }
        if ((i2 & 1024) != 0) {
            obj = deliveryTrackingItemDto.meta;
        }
        int i3 = i;
        Object obj3 = obj;
        DeliveryTrackingMapInfoDto deliveryTrackingMapInfoDto2 = deliveryTrackingMapInfoDto;
        boolean z2 = z;
        DeliveryTrackingPaidWaitingInfoDto deliveryTrackingPaidWaitingInfoDto2 = deliveryTrackingPaidWaitingInfoDto;
        DeliveryTrackingPerformerSearchInfoDto deliveryTrackingPerformerSearchInfoDto2 = deliveryTrackingPerformerSearchInfoDto;
        DeliveryTrackingPerformerInfoDto deliveryTrackingPerformerInfoDto2 = deliveryTrackingPerformerInfoDto;
        String str4 = str3;
        return deliveryTrackingItemDto.copy(str, str2, str4, deliveryIconStrategyDto, deliveryTrackingPerformerInfoDto2, deliveryTrackingPaidWaitingInfoDto2, deliveryTrackingPerformerSearchInfoDto2, deliveryTrackingMapInfoDto2, z2, i3, obj3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeliveryId() {
        return this.deliveryId;
    }

    /* renamed from: component10, reason: from getter */
    public final int getCommitRevision() {
        return this.commitRevision;
    }

    /* renamed from: component11, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final DeliveryIconStrategyDto getIcon() {
        return this.icon;
    }

    /* renamed from: component5, reason: from getter */
    public final DeliveryTrackingPerformerInfoDto getPerformer() {
        return this.performer;
    }

    /* renamed from: component6, reason: from getter */
    public final DeliveryTrackingPaidWaitingInfoDto getPaidWaitingInfo() {
        return this.paidWaitingInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final DeliveryTrackingPerformerSearchInfoDto getPerformerSearch() {
        return this.performerSearch;
    }

    /* renamed from: component8, reason: from getter */
    public final DeliveryTrackingMapInfoDto getMapInfo() {
        return this.mapInfo;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsCompleted() {
        return this.isCompleted;
    }

    public final DeliveryTrackingItemDto copy(@Json(name = "delivery_id") String deliveryId, @Json(name = "summary") String summary, @Json(name = "description") String description, @Json(name = "icon") DeliveryIconStrategyDto icon, @Json(name = "performer") DeliveryTrackingPerformerInfoDto performer, @Json(name = "paid_waiting_info") DeliveryTrackingPaidWaitingInfoDto paidWaitingInfo, @Json(name = "performer_search") DeliveryTrackingPerformerSearchInfoDto performerSearch, @Json(name = "map_info") DeliveryTrackingMapInfoDto mapInfo, @Json(name = "is_completed") boolean isCompleted, @Json(name = "commit_revision") int commitRevision, @Json(name = "meta") Object meta) {
        return new DeliveryTrackingItemDto(deliveryId, summary, description, icon, performer, paidWaitingInfo, performerSearch, mapInfo, isCompleted, commitRevision, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryTrackingItemDto)) {
            return false;
        }
        DeliveryTrackingItemDto deliveryTrackingItemDto = (DeliveryTrackingItemDto) other;
        return jl40.l(this.deliveryId, deliveryTrackingItemDto.deliveryId) && jl40.l(this.summary, deliveryTrackingItemDto.summary) && jl40.l(this.description, deliveryTrackingItemDto.description) && jl40.l(this.icon, deliveryTrackingItemDto.icon) && jl40.l(this.performer, deliveryTrackingItemDto.performer) && jl40.l(this.paidWaitingInfo, deliveryTrackingItemDto.paidWaitingInfo) && jl40.l(this.performerSearch, deliveryTrackingItemDto.performerSearch) && jl40.l(this.mapInfo, deliveryTrackingItemDto.mapInfo) && this.isCompleted == deliveryTrackingItemDto.isCompleted && this.commitRevision == deliveryTrackingItemDto.commitRevision && jl40.l(this.meta, deliveryTrackingItemDto.meta);
    }

    public final int getCommitRevision() {
        return this.commitRevision;
    }

    public final String getDeliveryId() {
        return this.deliveryId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final DeliveryIconStrategyDto getIcon() {
        return this.icon;
    }

    public final DeliveryTrackingMapInfoDto getMapInfo() {
        return this.mapInfo;
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final DeliveryTrackingPaidWaitingInfoDto getPaidWaitingInfo() {
        return this.paidWaitingInfo;
    }

    public final DeliveryTrackingPerformerInfoDto getPerformer() {
        return this.performer;
    }

    public final DeliveryTrackingPerformerSearchInfoDto getPerformerSearch() {
        return this.performerSearch;
    }

    public final String getSummary() {
        return this.summary;
    }

    public int hashCode() {
        int b = unr0.b(this.deliveryId.hashCode() * 31, 31, this.summary);
        String str = this.description;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        DeliveryIconStrategyDto deliveryIconStrategyDto = this.icon;
        int hashCode2 = (hashCode + (deliveryIconStrategyDto == null ? 0 : deliveryIconStrategyDto.hashCode())) * 31;
        DeliveryTrackingPerformerInfoDto deliveryTrackingPerformerInfoDto = this.performer;
        int hashCode3 = (hashCode2 + (deliveryTrackingPerformerInfoDto == null ? 0 : deliveryTrackingPerformerInfoDto.hashCode())) * 31;
        DeliveryTrackingPaidWaitingInfoDto deliveryTrackingPaidWaitingInfoDto = this.paidWaitingInfo;
        int hashCode4 = (hashCode3 + (deliveryTrackingPaidWaitingInfoDto == null ? 0 : deliveryTrackingPaidWaitingInfoDto.hashCode())) * 31;
        DeliveryTrackingPerformerSearchInfoDto deliveryTrackingPerformerSearchInfoDto = this.performerSearch;
        int hashCode5 = (hashCode4 + (deliveryTrackingPerformerSearchInfoDto == null ? 0 : deliveryTrackingPerformerSearchInfoDto.hashCode())) * 31;
        DeliveryTrackingMapInfoDto deliveryTrackingMapInfoDto = this.mapInfo;
        return this.meta.hashCode() + oyr.b(this.commitRevision, unr0.e((hashCode5 + (deliveryTrackingMapInfoDto != null ? deliveryTrackingMapInfoDto.hashCode() : 0)) * 31, 31, this.isCompleted), 31);
    }

    public final boolean isCompleted() {
        return this.isCompleted;
    }

    public String toString() {
        String str = this.deliveryId;
        String str2 = this.summary;
        String str3 = this.description;
        DeliveryIconStrategyDto deliveryIconStrategyDto = this.icon;
        DeliveryTrackingPerformerInfoDto deliveryTrackingPerformerInfoDto = this.performer;
        DeliveryTrackingPaidWaitingInfoDto deliveryTrackingPaidWaitingInfoDto = this.paidWaitingInfo;
        DeliveryTrackingPerformerSearchInfoDto deliveryTrackingPerformerSearchInfoDto = this.performerSearch;
        DeliveryTrackingMapInfoDto deliveryTrackingMapInfoDto = this.mapInfo;
        boolean z = this.isCompleted;
        int i = this.commitRevision;
        Object obj = this.meta;
        StringBuilder v = b64.v("DeliveryTrackingItemDto(deliveryId=", str, ", summary=", str2, ", description=");
        v.append(str3);
        v.append(", icon=");
        v.append(deliveryIconStrategyDto);
        v.append(", performer=");
        v.append(deliveryTrackingPerformerInfoDto);
        v.append(", paidWaitingInfo=");
        v.append(deliveryTrackingPaidWaitingInfoDto);
        v.append(", performerSearch=");
        v.append(deliveryTrackingPerformerSearchInfoDto);
        v.append(", mapInfo=");
        v.append(deliveryTrackingMapInfoDto);
        v.append(", isCompleted=");
        v.append(z);
        v.append(", commitRevision=");
        v.append(i);
        v.append(", meta=");
        return x4e.h(v, obj, Extension.C_BRAKE);
    }

    public /* synthetic */ DeliveryTrackingItemDto(String str, String str2, String str3, DeliveryIconStrategyDto deliveryIconStrategyDto, DeliveryTrackingPerformerInfoDto deliveryTrackingPerformerInfoDto, DeliveryTrackingPaidWaitingInfoDto deliveryTrackingPaidWaitingInfoDto, DeliveryTrackingPerformerSearchInfoDto deliveryTrackingPerformerSearchInfoDto, DeliveryTrackingMapInfoDto deliveryTrackingMapInfoDto, boolean z, int i, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, deliveryIconStrategyDto, deliveryTrackingPerformerInfoDto, deliveryTrackingPaidWaitingInfoDto, deliveryTrackingPerformerSearchInfoDto, deliveryTrackingMapInfoDto, (i2 & 256) != 0 ? false : z, (i2 & 512) != 0 ? 0 : i, obj);
    }
}
