package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveryfeedback;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.FeedbackReasonsItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handlersdefinitions.TipsInfoDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*BW\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0001\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003J^\u0010#\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\u0016\b\u0003\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0007HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryfeedback/DeliveryFeedbackRequestDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryfeedback/DeliveryFeedbackRequestDto$TypeDto;", "deliveryId", "", "score", "", "comment", IssuingDistributionPointExtension.REASONS, "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/FeedbackReasonsItemDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/FeedbackReasonsDto;", "tips", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/TipsInfoDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryfeedback/DeliveryFeedbackRequestDto$TypeDto;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/TipsInfoDto;)V", "getType", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryfeedback/DeliveryFeedbackRequestDto$TypeDto;", "getDeliveryId", "()Ljava/lang/String;", "getScore", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getComment", "getReasons", "()Ljava/util/List;", "getTips", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/TipsInfoDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryfeedback/DeliveryFeedbackRequestDto$TypeDto;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/TipsInfoDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryfeedback/DeliveryFeedbackRequestDto;", "equals", "", "other", "hashCode", "toString", "TypeDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeliveryFeedbackRequestDto {
    private final String comment;
    private final String deliveryId;
    private final List<FeedbackReasonsItemDto> reasons;
    private final Integer score;
    private final TipsInfoDto tips;
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryfeedback/DeliveryFeedbackRequestDto$TypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "ORDER_FEEDBACK", "REGULAR_ORDER_FEEDBACK", "FINAL_ORDER_FEEDBACK", "CANCEL_FEEDBACK", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TypeDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @Json(name = "order_feedback")
        public static final TypeDto ORDER_FEEDBACK = new TypeDto("ORDER_FEEDBACK", 0);

        @Json(name = "regular_order_feedback")
        public static final TypeDto REGULAR_ORDER_FEEDBACK = new TypeDto("REGULAR_ORDER_FEEDBACK", 1);

        @Json(name = "final_order_feedback")
        public static final TypeDto FINAL_ORDER_FEEDBACK = new TypeDto("FINAL_ORDER_FEEDBACK", 2);

        @Json(name = "cancel_feedback")
        public static final TypeDto CANCEL_FEEDBACK = new TypeDto("CANCEL_FEEDBACK", 3);

        private static final /* synthetic */ TypeDto[] $values() {
            return new TypeDto[]{ORDER_FEEDBACK, REGULAR_ORDER_FEEDBACK, FINAL_ORDER_FEEDBACK, CANCEL_FEEDBACK};
        }

        static {
            TypeDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private TypeDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
        }
    }

    public /* synthetic */ DeliveryFeedbackRequestDto(TypeDto typeDto, String str, Integer num, String str2, List list, TipsInfoDto tipsInfoDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TypeDto.ORDER_FEEDBACK : typeDto, str, num, str2, list, tipsInfoDto);
    }

    public static /* synthetic */ DeliveryFeedbackRequestDto copy$default(DeliveryFeedbackRequestDto deliveryFeedbackRequestDto, TypeDto typeDto, String str, Integer num, String str2, List list, TipsInfoDto tipsInfoDto, int i, Object obj) {
        if ((i & 1) != 0) {
            typeDto = deliveryFeedbackRequestDto.type;
        }
        if ((i & 2) != 0) {
            str = deliveryFeedbackRequestDto.deliveryId;
        }
        if ((i & 4) != 0) {
            num = deliveryFeedbackRequestDto.score;
        }
        if ((i & 8) != 0) {
            str2 = deliveryFeedbackRequestDto.comment;
        }
        if ((i & 16) != 0) {
            list = deliveryFeedbackRequestDto.reasons;
        }
        if ((i & 32) != 0) {
            tipsInfoDto = deliveryFeedbackRequestDto.tips;
        }
        List list2 = list;
        TipsInfoDto tipsInfoDto2 = tipsInfoDto;
        return deliveryFeedbackRequestDto.copy(typeDto, str, num, str2, list2, tipsInfoDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final TypeDto getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeliveryId() {
        return this.deliveryId;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getScore() {
        return this.score;
    }

    /* renamed from: component4, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    public final List<FeedbackReasonsItemDto> component5() {
        return this.reasons;
    }

    /* renamed from: component6, reason: from getter */
    public final TipsInfoDto getTips() {
        return this.tips;
    }

    public final DeliveryFeedbackRequestDto copy(@Json(name = "type") TypeDto type, @Json(name = "delivery_id") String deliveryId, @Json(name = "score") Integer score, @Json(name = "comment") String comment, @Json(name = "reasons") List<FeedbackReasonsItemDto> reasons, @Json(name = "tips") TipsInfoDto tips) {
        return new DeliveryFeedbackRequestDto(type, deliveryId, score, comment, reasons, tips);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryFeedbackRequestDto)) {
            return false;
        }
        DeliveryFeedbackRequestDto deliveryFeedbackRequestDto = (DeliveryFeedbackRequestDto) other;
        return this.type == deliveryFeedbackRequestDto.type && jl40.l(this.deliveryId, deliveryFeedbackRequestDto.deliveryId) && jl40.l(this.score, deliveryFeedbackRequestDto.score) && jl40.l(this.comment, deliveryFeedbackRequestDto.comment) && jl40.l(this.reasons, deliveryFeedbackRequestDto.reasons) && jl40.l(this.tips, deliveryFeedbackRequestDto.tips);
    }

    public final String getComment() {
        return this.comment;
    }

    public final String getDeliveryId() {
        return this.deliveryId;
    }

    public final List<FeedbackReasonsItemDto> getReasons() {
        return this.reasons;
    }

    public final Integer getScore() {
        return this.score;
    }

    public final TipsInfoDto getTips() {
        return this.tips;
    }

    public final TypeDto getType() {
        return this.type;
    }

    public int hashCode() {
        int b = unr0.b(this.type.hashCode() * 31, 31, this.deliveryId);
        Integer num = this.score;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.comment;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<FeedbackReasonsItemDto> list = this.reasons;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        TipsInfoDto tipsInfoDto = this.tips;
        return hashCode3 + (tipsInfoDto != null ? tipsInfoDto.hashCode() : 0);
    }

    public String toString() {
        TypeDto typeDto = this.type;
        String str = this.deliveryId;
        Integer num = this.score;
        String str2 = this.comment;
        List<FeedbackReasonsItemDto> list = this.reasons;
        TipsInfoDto tipsInfoDto = this.tips;
        StringBuilder sb = new StringBuilder("DeliveryFeedbackRequestDto(type=");
        sb.append(typeDto);
        sb.append(", deliveryId=");
        sb.append(str);
        sb.append(", score=");
        tse0.w(num, ", comment=", str2, ", reasons=", sb);
        sb.append(list);
        sb.append(", tips=");
        sb.append(tipsInfoDto);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public DeliveryFeedbackRequestDto(@Json(name = "type") TypeDto typeDto, @Json(name = "delivery_id") String str, @Json(name = "score") Integer num, @Json(name = "comment") String str2, @Json(name = "reasons") List<FeedbackReasonsItemDto> list, @Json(name = "tips") TipsInfoDto tipsInfoDto) {
        this.type = typeDto;
        this.deliveryId = str;
        this.score = num;
        this.comment = str2;
        this.reasons = list;
        this.tips = tipsInfoDto;
    }
}
