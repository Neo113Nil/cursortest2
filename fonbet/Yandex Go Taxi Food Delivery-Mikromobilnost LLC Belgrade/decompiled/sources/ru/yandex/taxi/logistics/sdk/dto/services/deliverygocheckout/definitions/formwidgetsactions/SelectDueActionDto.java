package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ImageDto;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002)*BY\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0001\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003J[\u0010\"\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0003\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006+"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectDueActionDto;", "", "formStateKey", "", "title", "subtitle", "metricaLabel", "buttonsConfig", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/DueButtonsConfigDto;", "slots", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectDueActionDto$SlotsDto;", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectDueActionDto$DescriptionDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/DueButtonsConfigDto;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectDueActionDto$DescriptionDto;)V", "getFormStateKey", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getMetricaLabel", "getButtonsConfig", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/DueButtonsConfigDto;", "getSlots", "()Ljava/util/List;", "getDescription", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectDueActionDto$DescriptionDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "SlotsDto", "DescriptionDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SelectDueActionDto {
    private final DueButtonsConfigDto buttonsConfig;
    private final DescriptionDto description;
    private final String formStateKey;
    private final String metricaLabel;
    private final List<SlotsDto> slots;
    private final String subtitle;
    private final String title;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectDueActionDto$DescriptionDto;", "", "icon", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "subtitle", "", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;Ljava/lang/String;)V", "getIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "getSubtitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DescriptionDto {
        private final ImageDto icon;
        private final String subtitle;

        public DescriptionDto(@Json(name = "icon") ImageDto imageDto, @Json(name = "subtitle") String str) {
            this.icon = imageDto;
            this.subtitle = str;
        }

        public static /* synthetic */ DescriptionDto copy$default(DescriptionDto descriptionDto, ImageDto imageDto, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                imageDto = descriptionDto.icon;
            }
            if ((i & 2) != 0) {
                str = descriptionDto.subtitle;
            }
            return descriptionDto.copy(imageDto, str);
        }

        /* renamed from: component1, reason: from getter */
        public final ImageDto getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final DescriptionDto copy(@Json(name = "icon") ImageDto icon, @Json(name = "subtitle") String subtitle) {
            return new DescriptionDto(icon, subtitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DescriptionDto)) {
                return false;
            }
            DescriptionDto descriptionDto = (DescriptionDto) other;
            return jl40.l(this.icon, descriptionDto.icon) && jl40.l(this.subtitle, descriptionDto.subtitle);
        }

        public final ImageDto getIcon() {
            return this.icon;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            String str = this.subtitle;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "DescriptionDto(icon=" + this.icon + ", subtitle=" + this.subtitle + Extension.C_BRAKE;
        }
    }

    public SelectDueActionDto(@Json(name = "form_state_key") String str, @Json(name = "title") String str2, @Json(name = "subtitle") String str3, @Json(name = "metrica_label") String str4, @Json(name = "buttons_config") DueButtonsConfigDto dueButtonsConfigDto, @Json(name = "slots") List<SlotsDto> list, @Json(name = "description") DescriptionDto descriptionDto) {
        this.formStateKey = str;
        this.title = str2;
        this.subtitle = str3;
        this.metricaLabel = str4;
        this.buttonsConfig = dueButtonsConfigDto;
        this.slots = list;
        this.description = descriptionDto;
    }

    public static /* synthetic */ SelectDueActionDto copy$default(SelectDueActionDto selectDueActionDto, String str, String str2, String str3, String str4, DueButtonsConfigDto dueButtonsConfigDto, List list, DescriptionDto descriptionDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectDueActionDto.formStateKey;
        }
        if ((i & 2) != 0) {
            str2 = selectDueActionDto.title;
        }
        if ((i & 4) != 0) {
            str3 = selectDueActionDto.subtitle;
        }
        if ((i & 8) != 0) {
            str4 = selectDueActionDto.metricaLabel;
        }
        if ((i & 16) != 0) {
            dueButtonsConfigDto = selectDueActionDto.buttonsConfig;
        }
        if ((i & 32) != 0) {
            list = selectDueActionDto.slots;
        }
        if ((i & 64) != 0) {
            descriptionDto = selectDueActionDto.description;
        }
        List list2 = list;
        DescriptionDto descriptionDto2 = descriptionDto;
        DueButtonsConfigDto dueButtonsConfigDto2 = dueButtonsConfigDto;
        String str5 = str3;
        return selectDueActionDto.copy(str, str2, str5, str4, dueButtonsConfigDto2, list2, descriptionDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFormStateKey() {
        return this.formStateKey;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component5, reason: from getter */
    public final DueButtonsConfigDto getButtonsConfig() {
        return this.buttonsConfig;
    }

    public final List<SlotsDto> component6() {
        return this.slots;
    }

    /* renamed from: component7, reason: from getter */
    public final DescriptionDto getDescription() {
        return this.description;
    }

    public final SelectDueActionDto copy(@Json(name = "form_state_key") String formStateKey, @Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "metrica_label") String metricaLabel, @Json(name = "buttons_config") DueButtonsConfigDto buttonsConfig, @Json(name = "slots") List<SlotsDto> slots, @Json(name = "description") DescriptionDto description) {
        return new SelectDueActionDto(formStateKey, title, subtitle, metricaLabel, buttonsConfig, slots, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectDueActionDto)) {
            return false;
        }
        SelectDueActionDto selectDueActionDto = (SelectDueActionDto) other;
        return jl40.l(this.formStateKey, selectDueActionDto.formStateKey) && jl40.l(this.title, selectDueActionDto.title) && jl40.l(this.subtitle, selectDueActionDto.subtitle) && jl40.l(this.metricaLabel, selectDueActionDto.metricaLabel) && jl40.l(this.buttonsConfig, selectDueActionDto.buttonsConfig) && jl40.l(this.slots, selectDueActionDto.slots) && jl40.l(this.description, selectDueActionDto.description);
    }

    public final DueButtonsConfigDto getButtonsConfig() {
        return this.buttonsConfig;
    }

    public final DescriptionDto getDescription() {
        return this.description;
    }

    public final String getFormStateKey() {
        return this.formStateKey;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final List<SlotsDto> getSlots() {
        return this.slots;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(this.formStateKey.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.metricaLabel;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        DueButtonsConfigDto dueButtonsConfigDto = this.buttonsConfig;
        return this.description.hashCode() + unr0.c((hashCode2 + (dueButtonsConfigDto != null ? dueButtonsConfigDto.hashCode() : 0)) * 31, 31, this.slots);
    }

    public String toString() {
        String str = this.formStateKey;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.metricaLabel;
        DueButtonsConfigDto dueButtonsConfigDto = this.buttonsConfig;
        List<SlotsDto> list = this.slots;
        DescriptionDto descriptionDto = this.description;
        StringBuilder v = b64.v("SelectDueActionDto(formStateKey=", str, ", title=", str2, ", subtitle=");
        g8e.D(v, str3, ", metricaLabel=", str4, ", buttonsConfig=");
        v.append(dueButtonsConfigDto);
        v.append(", slots=");
        v.append(list);
        v.append(", description=");
        v.append(descriptionDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectDueActionDto$SlotsDto;", "", "title", "", "descriptionTemplate", "options", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectDueActionDto$SlotsDto$OptionsDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectDueActionDto$SlotsDto$OptionsDto;)V", "getTitle", "()Ljava/lang/String;", "getDescriptionTemplate", "getOptions", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectDueActionDto$SlotsDto$OptionsDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "OptionsDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SlotsDto {
        private final String descriptionTemplate;
        private final OptionsDto options;
        private final String title;

        public SlotsDto(@Json(name = "title") String str, @Json(name = "description_template") String str2, @Json(name = "options") OptionsDto optionsDto) {
            this.title = str;
            this.descriptionTemplate = str2;
            this.options = optionsDto;
        }

        public static /* synthetic */ SlotsDto copy$default(SlotsDto slotsDto, String str, String str2, OptionsDto optionsDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = slotsDto.title;
            }
            if ((i & 2) != 0) {
                str2 = slotsDto.descriptionTemplate;
            }
            if ((i & 4) != 0) {
                optionsDto = slotsDto.options;
            }
            return slotsDto.copy(str, str2, optionsDto);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescriptionTemplate() {
            return this.descriptionTemplate;
        }

        /* renamed from: component3, reason: from getter */
        public final OptionsDto getOptions() {
            return this.options;
        }

        public final SlotsDto copy(@Json(name = "title") String title, @Json(name = "description_template") String descriptionTemplate, @Json(name = "options") OptionsDto options) {
            return new SlotsDto(title, descriptionTemplate, options);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SlotsDto)) {
                return false;
            }
            SlotsDto slotsDto = (SlotsDto) other;
            return jl40.l(this.title, slotsDto.title) && jl40.l(this.descriptionTemplate, slotsDto.descriptionTemplate) && jl40.l(this.options, slotsDto.options);
        }

        public final String getDescriptionTemplate() {
            return this.descriptionTemplate;
        }

        public final OptionsDto getOptions() {
            return this.options;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.options.hashCode() + unr0.b(this.title.hashCode() * 31, 31, this.descriptionTemplate);
        }

        public String toString() {
            String str = this.title;
            String str2 = this.descriptionTemplate;
            OptionsDto optionsDto = this.options;
            StringBuilder v = b64.v("SlotsDto(title=", str, ", descriptionTemplate=", str2, ", options=");
            v.append(optionsDto);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectDueActionDto$SlotsDto$OptionsDto;", "", "Options_TimePickerDto", "Options_TimeIntervalsDto", "Unknown_OptionsDto", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectDueActionDto$SlotsDto$OptionsDto$Options_TimeIntervalsDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectDueActionDto$SlotsDto$OptionsDto$Options_TimePickerDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectDueActionDto$SlotsDto$OptionsDto$Unknown_OptionsDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class OptionsDto {

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectDueActionDto$SlotsDto$OptionsDto$Options_TimeIntervalsDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectDueActionDto$SlotsDto$OptionsDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TimeIntervalsDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TimeIntervalsDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TimeIntervalsDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectDueActionDto$SlotsDto$OptionsDto$Options_TimeIntervalsDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Options_TimeIntervalsDto extends OptionsDto {
                public final String a;
                public final TimeIntervalsDto b;

                public Options_TimeIntervalsDto(@Json(name = "type") String str, TimeIntervalsDto timeIntervalsDto) {
                    this.a = str;
                    this.b = timeIntervalsDto;
                }

                public final Options_TimeIntervalsDto copy(@Json(name = "type") String type, TimeIntervalsDto value) {
                    return new Options_TimeIntervalsDto(type, value);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Options_TimeIntervalsDto)) {
                        return false;
                    }
                    Options_TimeIntervalsDto options_TimeIntervalsDto = (Options_TimeIntervalsDto) obj;
                    return this.a.equals(options_TimeIntervalsDto.a) && this.b.equals(options_TimeIntervalsDto.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    return "Options_TimeIntervalsDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
                }
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectDueActionDto$SlotsDto$OptionsDto$Options_TimePickerDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectDueActionDto$SlotsDto$OptionsDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TimePickerSlotsDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TimePickerSlotsDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TimePickerSlotsDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectDueActionDto$SlotsDto$OptionsDto$Options_TimePickerDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Options_TimePickerDto extends OptionsDto {
                public final String a;
                public final TimePickerSlotsDto b;

                public Options_TimePickerDto(@Json(name = "type") String str, TimePickerSlotsDto timePickerSlotsDto) {
                    this.a = str;
                    this.b = timePickerSlotsDto;
                }

                public final Options_TimePickerDto copy(@Json(name = "type") String type, TimePickerSlotsDto value) {
                    return new Options_TimePickerDto(type, value);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Options_TimePickerDto)) {
                        return false;
                    }
                    Options_TimePickerDto options_TimePickerDto = (Options_TimePickerDto) obj;
                    return this.a.equals(options_TimePickerDto.a) && this.b.equals(options_TimePickerDto.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    return "Options_TimePickerDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectDueActionDto$SlotsDto$OptionsDto$Unknown_OptionsDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectDueActionDto$SlotsDto$OptionsDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectDueActionDto$SlotsDto$OptionsDto$Unknown_OptionsDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Unknown_OptionsDto extends OptionsDto {
                public final String a;

                public Unknown_OptionsDto(@Json(name = "type") String str) {
                    this.a = str;
                }

                public final Unknown_OptionsDto copy(@Json(name = "type") String type) {
                    return new Unknown_OptionsDto(type);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Unknown_OptionsDto) && jl40.l(this.a, ((Unknown_OptionsDto) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return oyr.p("Unknown_OptionsDto(type=", this.a, Extension.C_BRAKE);
                }

                public Unknown_OptionsDto() {
                    this(0);
                }

                public /* synthetic */ Unknown_OptionsDto(int i) {
                    this("unknown");
                }
            }
        }
    }

    public /* synthetic */ SelectDueActionDto(String str, String str2, String str3, String str4, DueButtonsConfigDto dueButtonsConfigDto, List list, DescriptionDto descriptionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "due" : str, str2, str3, str4, dueButtonsConfigDto, list, descriptionDto);
    }
}
