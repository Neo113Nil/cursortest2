package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_order_form_address_details;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0019JP\u0010!\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\t\u001a\u00020\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010\"J\u0014\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010%\u001a\u00020&HÖ\u0081\u0004J\n\u0010'\u001a\u00020\nHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/AddressDetailsConfigDto;", "", "source", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/PointConfigDto;", "destination", "photocomments", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/PhotocommentsConfigDto;", "commentPopup", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/CommentPopupDto;", "buttonTextKey", "", "enableDeleteDestination", "", "<init>", "(Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/PointConfigDto;Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/PointConfigDto;Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/PhotocommentsConfigDto;Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/CommentPopupDto;Ljava/lang/String;Ljava/lang/Boolean;)V", "getSource", "()Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/PointConfigDto;", "getDestination", "getPhotocomments", "()Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/PhotocommentsConfigDto;", "getCommentPopup", "()Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/CommentPopupDto;", "getButtonTextKey", "()Ljava/lang/String;", "getEnableDeleteDestination", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/PointConfigDto;Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/PointConfigDto;Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/PhotocommentsConfigDto;Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/CommentPopupDto;Ljava/lang/String;Ljava/lang/Boolean;)Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/AddressDetailsConfigDto;", "equals", "other", "hashCode", "", "toString", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AddressDetailsConfigDto {
    private final String buttonTextKey;
    private final CommentPopupDto commentPopup;
    private final PointConfigDto destination;
    private final Boolean enableDeleteDestination;
    private final PhotocommentsConfigDto photocomments;
    private final PointConfigDto source;

    public AddressDetailsConfigDto(@Json(name = "source") PointConfigDto pointConfigDto, @Json(name = "destination") PointConfigDto pointConfigDto2, @Json(name = "photocomments") PhotocommentsConfigDto photocommentsConfigDto, @Json(name = "comment_popup") CommentPopupDto commentPopupDto, @Json(name = "button_text_key") String str, @Json(name = "enable_delete_destination") Boolean bool) {
        this.source = pointConfigDto;
        this.destination = pointConfigDto2;
        this.photocomments = photocommentsConfigDto;
        this.commentPopup = commentPopupDto;
        this.buttonTextKey = str;
        this.enableDeleteDestination = bool;
    }

    public static /* synthetic */ AddressDetailsConfigDto copy$default(AddressDetailsConfigDto addressDetailsConfigDto, PointConfigDto pointConfigDto, PointConfigDto pointConfigDto2, PhotocommentsConfigDto photocommentsConfigDto, CommentPopupDto commentPopupDto, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            pointConfigDto = addressDetailsConfigDto.source;
        }
        if ((i & 2) != 0) {
            pointConfigDto2 = addressDetailsConfigDto.destination;
        }
        if ((i & 4) != 0) {
            photocommentsConfigDto = addressDetailsConfigDto.photocomments;
        }
        if ((i & 8) != 0) {
            commentPopupDto = addressDetailsConfigDto.commentPopup;
        }
        if ((i & 16) != 0) {
            str = addressDetailsConfigDto.buttonTextKey;
        }
        if ((i & 32) != 0) {
            bool = addressDetailsConfigDto.enableDeleteDestination;
        }
        String str2 = str;
        Boolean bool2 = bool;
        return addressDetailsConfigDto.copy(pointConfigDto, pointConfigDto2, photocommentsConfigDto, commentPopupDto, str2, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final PointConfigDto getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final PointConfigDto getDestination() {
        return this.destination;
    }

    /* renamed from: component3, reason: from getter */
    public final PhotocommentsConfigDto getPhotocomments() {
        return this.photocomments;
    }

    /* renamed from: component4, reason: from getter */
    public final CommentPopupDto getCommentPopup() {
        return this.commentPopup;
    }

    /* renamed from: component5, reason: from getter */
    public final String getButtonTextKey() {
        return this.buttonTextKey;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getEnableDeleteDestination() {
        return this.enableDeleteDestination;
    }

    public final AddressDetailsConfigDto copy(@Json(name = "source") PointConfigDto source, @Json(name = "destination") PointConfigDto destination, @Json(name = "photocomments") PhotocommentsConfigDto photocomments, @Json(name = "comment_popup") CommentPopupDto commentPopup, @Json(name = "button_text_key") String buttonTextKey, @Json(name = "enable_delete_destination") Boolean enableDeleteDestination) {
        return new AddressDetailsConfigDto(source, destination, photocomments, commentPopup, buttonTextKey, enableDeleteDestination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressDetailsConfigDto)) {
            return false;
        }
        AddressDetailsConfigDto addressDetailsConfigDto = (AddressDetailsConfigDto) other;
        return jl40.l(this.source, addressDetailsConfigDto.source) && jl40.l(this.destination, addressDetailsConfigDto.destination) && jl40.l(this.photocomments, addressDetailsConfigDto.photocomments) && jl40.l(this.commentPopup, addressDetailsConfigDto.commentPopup) && jl40.l(this.buttonTextKey, addressDetailsConfigDto.buttonTextKey) && jl40.l(this.enableDeleteDestination, addressDetailsConfigDto.enableDeleteDestination);
    }

    public final String getButtonTextKey() {
        return this.buttonTextKey;
    }

    public final CommentPopupDto getCommentPopup() {
        return this.commentPopup;
    }

    public final PointConfigDto getDestination() {
        return this.destination;
    }

    public final Boolean getEnableDeleteDestination() {
        return this.enableDeleteDestination;
    }

    public final PhotocommentsConfigDto getPhotocomments() {
        return this.photocomments;
    }

    public final PointConfigDto getSource() {
        return this.source;
    }

    public int hashCode() {
        int hashCode = (this.destination.hashCode() + (this.source.hashCode() * 31)) * 31;
        PhotocommentsConfigDto photocommentsConfigDto = this.photocomments;
        int hashCode2 = (hashCode + (photocommentsConfigDto == null ? 0 : photocommentsConfigDto.hashCode())) * 31;
        CommentPopupDto commentPopupDto = this.commentPopup;
        int b = unr0.b((hashCode2 + (commentPopupDto == null ? 0 : commentPopupDto.hashCode())) * 31, 31, this.buttonTextKey);
        Boolean bool = this.enableDeleteDestination;
        return b + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "AddressDetailsConfigDto(source=" + this.source + ", destination=" + this.destination + ", photocomments=" + this.photocomments + ", commentPopup=" + this.commentPopup + ", buttonTextKey=" + this.buttonTextKey + ", enableDeleteDestination=" + this.enableDeleteDestination + Extension.C_BRAKE;
    }
}
