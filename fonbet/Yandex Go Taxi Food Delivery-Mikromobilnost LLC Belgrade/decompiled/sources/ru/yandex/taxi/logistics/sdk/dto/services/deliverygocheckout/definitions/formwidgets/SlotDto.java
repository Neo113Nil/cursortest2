package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.smw0;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.SlotLeadDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002=>B\u008b\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0003\u0010\r\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0001\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u00102\u001a\u00020\u000eHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\t\u00105\u001a\u00020\u0015HÆ\u0003J\u008d\u0001\u00106\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0003\u0010\r\u001a\u00020\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\b\b\u0003\u0010\u0014\u001a\u00020\u0015HÆ\u0001J\u0013\u00107\u001a\u00020\u000e2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020<HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006?"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotDto;", "", "lead", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;", "body1", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotBodyDto;", "body2", "body3", "trail1", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;", "trail2", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", BackendConfig.Restrictions.ENABLED, "", "style", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotStyleDto;", "stateDependedStyles", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotDto$StateDependedStylesDto;", "size", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotDto$SizeDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotBodyDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotBodyDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotBodyDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;ZLru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotStyleDto;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotDto$SizeDto;)V", "getLead", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;", "getBody1", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotBodyDto;", "getBody2", "getBody3", "getTrail1", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;", "getTrail2", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "getEnabled", "()Z", "getStyle", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotStyleDto;", "getStateDependedStyles", "()Ljava/util/List;", "getSize", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotDto$SizeDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "", "StateDependedStylesDto", "SizeDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SlotDto {
    private final TapActionDto action;
    private final SlotBodyDto body1;
    private final SlotBodyDto body2;
    private final SlotBodyDto body3;
    private final boolean enabled;
    private final SlotLeadDto lead;
    private final SizeDto size;
    private final List<StateDependedStylesDto> stateDependedStyles;
    private final SlotStyleDto style;
    private final SlotTrailDto trail1;
    private final SlotTrailDto trail2;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotDto$SizeDto;", "", "<init>", "(Ljava/lang/String;I)V", "XS", "S", "M", "L", "XL", "XXL", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SizeDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ SizeDto[] $VALUES;

        @Json(name = "xs")
        public static final SizeDto XS = new SizeDto("XS", 0);

        @Json(name = "s")
        public static final SizeDto S = new SizeDto("S", 1);

        @Json(name = "m")
        public static final SizeDto M = new SizeDto("M", 2);

        @Json(name = "l")
        public static final SizeDto L = new SizeDto("L", 3);

        @Json(name = "xl")
        public static final SizeDto XL = new SizeDto("XL", 4);

        @Json(name = "xxl")
        public static final SizeDto XXL = new SizeDto("XXL", 5);

        private static final /* synthetic */ SizeDto[] $values() {
            return new SizeDto[]{XS, S, M, L, XL, XXL};
        }

        static {
            SizeDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private SizeDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static SizeDto valueOf(String str) {
            return (SizeDto) Enum.valueOf(SizeDto.class, str);
        }

        public static SizeDto[] values() {
            return (SizeDto[]) $VALUES.clone();
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\f\b\u0001\u0010\u0004\u001a\u00060\u0001j\u0002`\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\r\u0010\u0011\u001a\u00060\u0001j\u0002`\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\f\b\u0003\u0010\u0004\u001a\u00060\u0001j\u0002`\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u00060\u0001j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotDto$StateDependedStylesDto;", "", "formStateKey", "", "formStateValue", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormStateValueDto;", "style", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotStyleDto;", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotStyleDto;)V", "getFormStateKey", "()Ljava/lang/String;", "getFormStateValue", "()Ljava/lang/Object;", "getStyle", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotStyleDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StateDependedStylesDto {
        private final String formStateKey;
        private final Object formStateValue;
        private final SlotStyleDto style;

        public StateDependedStylesDto(@Json(name = "form_state_key") String str, @Json(name = "form_state_value") Object obj, @Json(name = "style") SlotStyleDto slotStyleDto) {
            this.formStateKey = str;
            this.formStateValue = obj;
            this.style = slotStyleDto;
        }

        public static /* synthetic */ StateDependedStylesDto copy$default(StateDependedStylesDto stateDependedStylesDto, String str, Object obj, SlotStyleDto slotStyleDto, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = stateDependedStylesDto.formStateKey;
            }
            if ((i & 2) != 0) {
                obj = stateDependedStylesDto.formStateValue;
            }
            if ((i & 4) != 0) {
                slotStyleDto = stateDependedStylesDto.style;
            }
            return stateDependedStylesDto.copy(str, obj, slotStyleDto);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFormStateKey() {
            return this.formStateKey;
        }

        /* renamed from: component2, reason: from getter */
        public final Object getFormStateValue() {
            return this.formStateValue;
        }

        /* renamed from: component3, reason: from getter */
        public final SlotStyleDto getStyle() {
            return this.style;
        }

        public final StateDependedStylesDto copy(@Json(name = "form_state_key") String formStateKey, @Json(name = "form_state_value") Object formStateValue, @Json(name = "style") SlotStyleDto style) {
            return new StateDependedStylesDto(formStateKey, formStateValue, style);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StateDependedStylesDto)) {
                return false;
            }
            StateDependedStylesDto stateDependedStylesDto = (StateDependedStylesDto) other;
            return jl40.l(this.formStateKey, stateDependedStylesDto.formStateKey) && jl40.l(this.formStateValue, stateDependedStylesDto.formStateValue) && jl40.l(this.style, stateDependedStylesDto.style);
        }

        public final String getFormStateKey() {
            return this.formStateKey;
        }

        public final Object getFormStateValue() {
            return this.formStateValue;
        }

        public final SlotStyleDto getStyle() {
            return this.style;
        }

        public int hashCode() {
            return this.style.hashCode() + smw0.c(this.formStateKey.hashCode() * 31, 31, this.formStateValue);
        }

        public String toString() {
            return "StateDependedStylesDto(formStateKey=" + this.formStateKey + ", formStateValue=" + this.formStateValue + ", style=" + this.style + Extension.C_BRAKE;
        }
    }

    public /* synthetic */ SlotDto(SlotLeadDto slotLeadDto, SlotBodyDto slotBodyDto, SlotBodyDto slotBodyDto2, SlotBodyDto slotBodyDto3, SlotTrailDto slotTrailDto, SlotTrailDto slotTrailDto2, TapActionDto tapActionDto, boolean z, SlotStyleDto slotStyleDto, List list, SizeDto sizeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(slotLeadDto, slotBodyDto, slotBodyDto2, slotBodyDto3, slotTrailDto, slotTrailDto2, tapActionDto, (i & 128) != 0 ? true : z, slotStyleDto, list, (i & 1024) != 0 ? SizeDto.L : sizeDto);
    }

    public static /* synthetic */ SlotDto copy$default(SlotDto slotDto, SlotLeadDto slotLeadDto, SlotBodyDto slotBodyDto, SlotBodyDto slotBodyDto2, SlotBodyDto slotBodyDto3, SlotTrailDto slotTrailDto, SlotTrailDto slotTrailDto2, TapActionDto tapActionDto, boolean z, SlotStyleDto slotStyleDto, List list, SizeDto sizeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            slotLeadDto = slotDto.lead;
        }
        if ((i & 2) != 0) {
            slotBodyDto = slotDto.body1;
        }
        if ((i & 4) != 0) {
            slotBodyDto2 = slotDto.body2;
        }
        if ((i & 8) != 0) {
            slotBodyDto3 = slotDto.body3;
        }
        if ((i & 16) != 0) {
            slotTrailDto = slotDto.trail1;
        }
        if ((i & 32) != 0) {
            slotTrailDto2 = slotDto.trail2;
        }
        if ((i & 64) != 0) {
            tapActionDto = slotDto.action;
        }
        if ((i & 128) != 0) {
            z = slotDto.enabled;
        }
        if ((i & 256) != 0) {
            slotStyleDto = slotDto.style;
        }
        if ((i & 512) != 0) {
            list = slotDto.stateDependedStyles;
        }
        if ((i & 1024) != 0) {
            sizeDto = slotDto.size;
        }
        List list2 = list;
        SizeDto sizeDto2 = sizeDto;
        boolean z2 = z;
        SlotStyleDto slotStyleDto2 = slotStyleDto;
        SlotTrailDto slotTrailDto3 = slotTrailDto2;
        TapActionDto tapActionDto2 = tapActionDto;
        SlotTrailDto slotTrailDto4 = slotTrailDto;
        SlotBodyDto slotBodyDto4 = slotBodyDto2;
        return slotDto.copy(slotLeadDto, slotBodyDto, slotBodyDto4, slotBodyDto3, slotTrailDto4, slotTrailDto3, tapActionDto2, z2, slotStyleDto2, list2, sizeDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final SlotLeadDto getLead() {
        return this.lead;
    }

    public final List<StateDependedStylesDto> component10() {
        return this.stateDependedStyles;
    }

    /* renamed from: component11, reason: from getter */
    public final SizeDto getSize() {
        return this.size;
    }

    /* renamed from: component2, reason: from getter */
    public final SlotBodyDto getBody1() {
        return this.body1;
    }

    /* renamed from: component3, reason: from getter */
    public final SlotBodyDto getBody2() {
        return this.body2;
    }

    /* renamed from: component4, reason: from getter */
    public final SlotBodyDto getBody3() {
        return this.body3;
    }

    /* renamed from: component5, reason: from getter */
    public final SlotTrailDto getTrail1() {
        return this.trail1;
    }

    /* renamed from: component6, reason: from getter */
    public final SlotTrailDto getTrail2() {
        return this.trail2;
    }

    /* renamed from: component7, reason: from getter */
    public final TapActionDto getAction() {
        return this.action;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component9, reason: from getter */
    public final SlotStyleDto getStyle() {
        return this.style;
    }

    public final SlotDto copy(@Json(name = "lead") SlotLeadDto lead, @Json(name = "body1") SlotBodyDto body1, @Json(name = "body2") SlotBodyDto body2, @Json(name = "body3") SlotBodyDto body3, @Json(name = "trail1") SlotTrailDto trail1, @Json(name = "trail2") SlotTrailDto trail2, @Json(name = "action") TapActionDto action, @Json(name = "enabled") boolean enabled, @Json(name = "style") SlotStyleDto style, @Json(name = "state_depended_styles") List<StateDependedStylesDto> stateDependedStyles, @Json(name = "size") SizeDto size) {
        return new SlotDto(lead, body1, body2, body3, trail1, trail2, action, enabled, style, stateDependedStyles, size);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlotDto)) {
            return false;
        }
        SlotDto slotDto = (SlotDto) other;
        return jl40.l(this.lead, slotDto.lead) && jl40.l(this.body1, slotDto.body1) && jl40.l(this.body2, slotDto.body2) && jl40.l(this.body3, slotDto.body3) && jl40.l(this.trail1, slotDto.trail1) && jl40.l(this.trail2, slotDto.trail2) && jl40.l(this.action, slotDto.action) && this.enabled == slotDto.enabled && jl40.l(this.style, slotDto.style) && jl40.l(this.stateDependedStyles, slotDto.stateDependedStyles) && this.size == slotDto.size;
    }

    public final TapActionDto getAction() {
        return this.action;
    }

    public final SlotBodyDto getBody1() {
        return this.body1;
    }

    public final SlotBodyDto getBody2() {
        return this.body2;
    }

    public final SlotBodyDto getBody3() {
        return this.body3;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final SlotLeadDto getLead() {
        return this.lead;
    }

    public final SizeDto getSize() {
        return this.size;
    }

    public final List<StateDependedStylesDto> getStateDependedStyles() {
        return this.stateDependedStyles;
    }

    public final SlotStyleDto getStyle() {
        return this.style;
    }

    public final SlotTrailDto getTrail1() {
        return this.trail1;
    }

    public final SlotTrailDto getTrail2() {
        return this.trail2;
    }

    public int hashCode() {
        SlotLeadDto slotLeadDto = this.lead;
        int hashCode = (this.body1.hashCode() + ((slotLeadDto == null ? 0 : slotLeadDto.hashCode()) * 31)) * 31;
        SlotBodyDto slotBodyDto = this.body2;
        int hashCode2 = (hashCode + (slotBodyDto == null ? 0 : slotBodyDto.hashCode())) * 31;
        SlotBodyDto slotBodyDto2 = this.body3;
        int hashCode3 = (hashCode2 + (slotBodyDto2 == null ? 0 : slotBodyDto2.hashCode())) * 31;
        SlotTrailDto slotTrailDto = this.trail1;
        int hashCode4 = (hashCode3 + (slotTrailDto == null ? 0 : slotTrailDto.hashCode())) * 31;
        SlotTrailDto slotTrailDto2 = this.trail2;
        int hashCode5 = (hashCode4 + (slotTrailDto2 == null ? 0 : slotTrailDto2.hashCode())) * 31;
        TapActionDto tapActionDto = this.action;
        int e = unr0.e((hashCode5 + (tapActionDto == null ? 0 : tapActionDto.hashCode())) * 31, 31, this.enabled);
        SlotStyleDto slotStyleDto = this.style;
        int hashCode6 = (e + (slotStyleDto == null ? 0 : slotStyleDto.hashCode())) * 31;
        List<StateDependedStylesDto> list = this.stateDependedStyles;
        return this.size.hashCode() + ((hashCode6 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "SlotDto(lead=" + this.lead + ", body1=" + this.body1 + ", body2=" + this.body2 + ", body3=" + this.body3 + ", trail1=" + this.trail1 + ", trail2=" + this.trail2 + ", action=" + this.action + ", enabled=" + this.enabled + ", style=" + this.style + ", stateDependedStyles=" + this.stateDependedStyles + ", size=" + this.size + Extension.C_BRAKE;
    }

    public SlotDto(@Json(name = "lead") SlotLeadDto slotLeadDto, @Json(name = "body1") SlotBodyDto slotBodyDto, @Json(name = "body2") SlotBodyDto slotBodyDto2, @Json(name = "body3") SlotBodyDto slotBodyDto3, @Json(name = "trail1") SlotTrailDto slotTrailDto, @Json(name = "trail2") SlotTrailDto slotTrailDto2, @Json(name = "action") TapActionDto tapActionDto, @Json(name = "enabled") boolean z, @Json(name = "style") SlotStyleDto slotStyleDto, @Json(name = "state_depended_styles") List<StateDependedStylesDto> list, @Json(name = "size") SizeDto sizeDto) {
        this.lead = slotLeadDto;
        this.body1 = slotBodyDto;
        this.body2 = slotBodyDto2;
        this.body3 = slotBodyDto3;
        this.trail1 = slotTrailDto;
        this.trail2 = slotTrailDto2;
        this.action = tapActionDto;
        this.enabled = z;
        this.style = slotStyleDto;
        this.stateDependedStyles = list;
        this.size = sizeDto;
    }
}
