package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.tse0;
import defpackage.unr0;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.BackgroundDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.IconDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001@B\u0099\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0001\u0010\u0015\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u00105\u001a\u00020\u000eHÆ\u0003J\t\u00106\u001a\u00020\u0010HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0011\u00109\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0016HÆ\u0003J\u009b\u0001\u0010:\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0010\b\u0003\u0010\u0015\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0016HÆ\u0001J\u0013\u0010;\u001a\u00020\u00102\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0019\u0010\u0015\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0016¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006A"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/DiscountCouponDto;", "", "title", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/StyledTextDto;", "discount", "subtitle", "companyName", C0553n3.g, "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto;", "companyIcon", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "couponSize", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/DiscountCouponDto$CouponSizeDto;", "showWhenSectionCollapsed", "", "trailItem", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/DiscountCouponTrailItemDto;", "metricaLabel", "", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/MetadataDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/StyledTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/StyledTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/StyledTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/StyledTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/DiscountCouponDto$CouponSizeDto;ZLru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/DiscountCouponTrailItemDto;Ljava/lang/String;Ljava/lang/Object;)V", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/StyledTextDto;", "getDiscount", "getSubtitle", "getCompanyName", "getBackground", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto;", "getCompanyIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "getCouponSize", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/DiscountCouponDto$CouponSizeDto;", "getShowWhenSectionCollapsed", "()Z", "getTrailItem", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/DiscountCouponTrailItemDto;", "getMetricaLabel", "()Ljava/lang/String;", "getMeta", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "CouponSizeDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DiscountCouponDto {
    private final ActionDto action;
    private final BackgroundDto background;
    private final IconDto companyIcon;
    private final StyledTextDto companyName;
    private final CouponSizeDto couponSize;
    private final StyledTextDto discount;
    private final Object meta;
    private final String metricaLabel;
    private final boolean showWhenSectionCollapsed;
    private final StyledTextDto subtitle;
    private final StyledTextDto title;
    private final DiscountCouponTrailItemDto trailItem;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/DiscountCouponDto$CouponSizeDto;", "", "<init>", "(Ljava/lang/String;I)V", "SMALL", "MEDIUM", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CouponSizeDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ CouponSizeDto[] $VALUES;

        @Json(name = Constants.SMALL)
        public static final CouponSizeDto SMALL = new CouponSizeDto("SMALL", 0);

        @Json(name = "medium")
        public static final CouponSizeDto MEDIUM = new CouponSizeDto("MEDIUM", 1);

        private static final /* synthetic */ CouponSizeDto[] $values() {
            return new CouponSizeDto[]{SMALL, MEDIUM};
        }

        static {
            CouponSizeDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private CouponSizeDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static CouponSizeDto valueOf(String str) {
            return (CouponSizeDto) Enum.valueOf(CouponSizeDto.class, str);
        }

        public static CouponSizeDto[] values() {
            return (CouponSizeDto[]) $VALUES.clone();
        }
    }

    public /* synthetic */ DiscountCouponDto(StyledTextDto styledTextDto, StyledTextDto styledTextDto2, StyledTextDto styledTextDto3, StyledTextDto styledTextDto4, BackgroundDto backgroundDto, IconDto iconDto, ActionDto actionDto, CouponSizeDto couponSizeDto, boolean z, DiscountCouponTrailItemDto discountCouponTrailItemDto, String str, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(styledTextDto, styledTextDto2, styledTextDto3, styledTextDto4, backgroundDto, iconDto, actionDto, couponSizeDto, (i & 256) != 0 ? false : z, discountCouponTrailItemDto, str, obj);
    }

    public static /* synthetic */ DiscountCouponDto copy$default(DiscountCouponDto discountCouponDto, StyledTextDto styledTextDto, StyledTextDto styledTextDto2, StyledTextDto styledTextDto3, StyledTextDto styledTextDto4, BackgroundDto backgroundDto, IconDto iconDto, ActionDto actionDto, CouponSizeDto couponSizeDto, boolean z, DiscountCouponTrailItemDto discountCouponTrailItemDto, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            styledTextDto = discountCouponDto.title;
        }
        if ((i & 2) != 0) {
            styledTextDto2 = discountCouponDto.discount;
        }
        if ((i & 4) != 0) {
            styledTextDto3 = discountCouponDto.subtitle;
        }
        if ((i & 8) != 0) {
            styledTextDto4 = discountCouponDto.companyName;
        }
        if ((i & 16) != 0) {
            backgroundDto = discountCouponDto.background;
        }
        if ((i & 32) != 0) {
            iconDto = discountCouponDto.companyIcon;
        }
        if ((i & 64) != 0) {
            actionDto = discountCouponDto.action;
        }
        if ((i & 128) != 0) {
            couponSizeDto = discountCouponDto.couponSize;
        }
        if ((i & 256) != 0) {
            z = discountCouponDto.showWhenSectionCollapsed;
        }
        if ((i & 512) != 0) {
            discountCouponTrailItemDto = discountCouponDto.trailItem;
        }
        if ((i & 1024) != 0) {
            str = discountCouponDto.metricaLabel;
        }
        if ((i & 2048) != 0) {
            obj = discountCouponDto.meta;
        }
        String str2 = str;
        Object obj3 = obj;
        boolean z2 = z;
        DiscountCouponTrailItemDto discountCouponTrailItemDto2 = discountCouponTrailItemDto;
        ActionDto actionDto2 = actionDto;
        CouponSizeDto couponSizeDto2 = couponSizeDto;
        BackgroundDto backgroundDto2 = backgroundDto;
        IconDto iconDto2 = iconDto;
        return discountCouponDto.copy(styledTextDto, styledTextDto2, styledTextDto3, styledTextDto4, backgroundDto2, iconDto2, actionDto2, couponSizeDto2, z2, discountCouponTrailItemDto2, str2, obj3);
    }

    /* renamed from: component1, reason: from getter */
    public final StyledTextDto getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final DiscountCouponTrailItemDto getTrailItem() {
        return this.trailItem;
    }

    /* renamed from: component11, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component12, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    /* renamed from: component2, reason: from getter */
    public final StyledTextDto getDiscount() {
        return this.discount;
    }

    /* renamed from: component3, reason: from getter */
    public final StyledTextDto getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final StyledTextDto getCompanyName() {
        return this.companyName;
    }

    /* renamed from: component5, reason: from getter */
    public final BackgroundDto getBackground() {
        return this.background;
    }

    /* renamed from: component6, reason: from getter */
    public final IconDto getCompanyIcon() {
        return this.companyIcon;
    }

    /* renamed from: component7, reason: from getter */
    public final ActionDto getAction() {
        return this.action;
    }

    /* renamed from: component8, reason: from getter */
    public final CouponSizeDto getCouponSize() {
        return this.couponSize;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShowWhenSectionCollapsed() {
        return this.showWhenSectionCollapsed;
    }

    public final DiscountCouponDto copy(@Json(name = "title") StyledTextDto title, @Json(name = "discount") StyledTextDto discount, @Json(name = "subtitle") StyledTextDto subtitle, @Json(name = "company_name") StyledTextDto companyName, @Json(name = "background") BackgroundDto background, @Json(name = "company_icon") IconDto companyIcon, @Json(name = "action") ActionDto action, @Json(name = "coupon_size") CouponSizeDto couponSize, @Json(name = "show_when_section_collapsed") boolean showWhenSectionCollapsed, @Json(name = "trail_item") DiscountCouponTrailItemDto trailItem, @Json(name = "metrica_label") String metricaLabel, @Json(name = "meta") Object meta) {
        return new DiscountCouponDto(title, discount, subtitle, companyName, background, companyIcon, action, couponSize, showWhenSectionCollapsed, trailItem, metricaLabel, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiscountCouponDto)) {
            return false;
        }
        DiscountCouponDto discountCouponDto = (DiscountCouponDto) other;
        return jl40.l(this.title, discountCouponDto.title) && jl40.l(this.discount, discountCouponDto.discount) && jl40.l(this.subtitle, discountCouponDto.subtitle) && jl40.l(this.companyName, discountCouponDto.companyName) && jl40.l(this.background, discountCouponDto.background) && jl40.l(this.companyIcon, discountCouponDto.companyIcon) && jl40.l(this.action, discountCouponDto.action) && this.couponSize == discountCouponDto.couponSize && this.showWhenSectionCollapsed == discountCouponDto.showWhenSectionCollapsed && jl40.l(this.trailItem, discountCouponDto.trailItem) && jl40.l(this.metricaLabel, discountCouponDto.metricaLabel) && jl40.l(this.meta, discountCouponDto.meta);
    }

    public final ActionDto getAction() {
        return this.action;
    }

    public final BackgroundDto getBackground() {
        return this.background;
    }

    public final IconDto getCompanyIcon() {
        return this.companyIcon;
    }

    public final StyledTextDto getCompanyName() {
        return this.companyName;
    }

    public final CouponSizeDto getCouponSize() {
        return this.couponSize;
    }

    public final StyledTextDto getDiscount() {
        return this.discount;
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final boolean getShowWhenSectionCollapsed() {
        return this.showWhenSectionCollapsed;
    }

    public final StyledTextDto getSubtitle() {
        return this.subtitle;
    }

    public final StyledTextDto getTitle() {
        return this.title;
    }

    public final DiscountCouponTrailItemDto getTrailItem() {
        return this.trailItem;
    }

    public int hashCode() {
        StyledTextDto styledTextDto = this.title;
        int hashCode = (styledTextDto == null ? 0 : styledTextDto.hashCode()) * 31;
        StyledTextDto styledTextDto2 = this.discount;
        int hashCode2 = (hashCode + (styledTextDto2 == null ? 0 : styledTextDto2.hashCode())) * 31;
        StyledTextDto styledTextDto3 = this.subtitle;
        int hashCode3 = (hashCode2 + (styledTextDto3 == null ? 0 : styledTextDto3.hashCode())) * 31;
        StyledTextDto styledTextDto4 = this.companyName;
        int hashCode4 = (hashCode3 + (styledTextDto4 == null ? 0 : styledTextDto4.hashCode())) * 31;
        BackgroundDto backgroundDto = this.background;
        int hashCode5 = (hashCode4 + (backgroundDto == null ? 0 : backgroundDto.hashCode())) * 31;
        IconDto iconDto = this.companyIcon;
        int hashCode6 = (hashCode5 + (iconDto == null ? 0 : iconDto.hashCode())) * 31;
        ActionDto actionDto = this.action;
        int e = unr0.e((this.couponSize.hashCode() + ((hashCode6 + (actionDto == null ? 0 : actionDto.hashCode())) * 31)) * 31, 31, this.showWhenSectionCollapsed);
        DiscountCouponTrailItemDto discountCouponTrailItemDto = this.trailItem;
        int hashCode7 = (e + (discountCouponTrailItemDto == null ? 0 : discountCouponTrailItemDto.hashCode())) * 31;
        String str = this.metricaLabel;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.meta;
        return hashCode8 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        StyledTextDto styledTextDto = this.title;
        StyledTextDto styledTextDto2 = this.discount;
        StyledTextDto styledTextDto3 = this.subtitle;
        StyledTextDto styledTextDto4 = this.companyName;
        BackgroundDto backgroundDto = this.background;
        IconDto iconDto = this.companyIcon;
        ActionDto actionDto = this.action;
        CouponSizeDto couponSizeDto = this.couponSize;
        boolean z = this.showWhenSectionCollapsed;
        DiscountCouponTrailItemDto discountCouponTrailItemDto = this.trailItem;
        String str = this.metricaLabel;
        Object obj = this.meta;
        StringBuilder sb = new StringBuilder("DiscountCouponDto(title=");
        sb.append(styledTextDto);
        sb.append(", discount=");
        sb.append(styledTextDto2);
        sb.append(", subtitle=");
        sb.append(styledTextDto3);
        sb.append(", companyName=");
        sb.append(styledTextDto4);
        sb.append(", background=");
        sb.append(backgroundDto);
        sb.append(", companyIcon=");
        sb.append(iconDto);
        sb.append(", action=");
        sb.append(actionDto);
        sb.append(", couponSize=");
        sb.append(couponSizeDto);
        sb.append(", showWhenSectionCollapsed=");
        sb.append(z);
        sb.append(", trailItem=");
        sb.append(discountCouponTrailItemDto);
        sb.append(", metricaLabel=");
        return tse0.l(sb, str, ", meta=", obj, Extension.C_BRAKE);
    }

    public DiscountCouponDto(@Json(name = "title") StyledTextDto styledTextDto, @Json(name = "discount") StyledTextDto styledTextDto2, @Json(name = "subtitle") StyledTextDto styledTextDto3, @Json(name = "company_name") StyledTextDto styledTextDto4, @Json(name = "background") BackgroundDto backgroundDto, @Json(name = "company_icon") IconDto iconDto, @Json(name = "action") ActionDto actionDto, @Json(name = "coupon_size") CouponSizeDto couponSizeDto, @Json(name = "show_when_section_collapsed") boolean z, @Json(name = "trail_item") DiscountCouponTrailItemDto discountCouponTrailItemDto, @Json(name = "metrica_label") String str, @Json(name = "meta") Object obj) {
        this.title = styledTextDto;
        this.discount = styledTextDto2;
        this.subtitle = styledTextDto3;
        this.companyName = styledTextDto4;
        this.background = backgroundDto;
        this.companyIcon = iconDto;
        this.action = actionDto;
        this.couponSize = couponSizeDto;
        this.showWhenSectionCollapsed = z;
        this.trailItem = discountCouponTrailItemDto;
        this.metricaLabel = str;
        this.meta = obj;
    }
}
