package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.nnm;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formaddressdetails.AddressDetailsLayoutDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formaddressdetails.PartialAddressDetailsLayoutDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formlayoutmodifiers.FormOverrideModifierDescriptorDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001DB³\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0011\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0010\b\u0001\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005HÆ\u0003J\u0011\u00106\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0011\u00108\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0011HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0005HÆ\u0003Jµ\u0001\u0010=\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00052\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00052\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0003\u0010\u0010\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0010\b\u0003\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0005HÆ\u0001J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020BHÖ\u0001J\t\u0010C\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0019\u0010\u0010\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001f¨\u0006E"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormOverrideDto;", "", "offer", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/OfferDto;", "offers", "", "layout", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormLayoutOverrideDto;", "addressDetailsLayout", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/AddressDetailsLayoutDto;", "partialAddressDetailsLayouts", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/PartialAddressDetailsLayoutDto;", "modals", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormModalViewDto;", "formTheme", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormOverrideDto$FormThemeDto;", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/MetadataDto;", "sendEventPayload", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/SendEventPayloadDto;", "metricaLabel", "", "defaults", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormDefaultsDto;", "modifiers", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formlayoutmodifiers/FormOverrideModifierDescriptorDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/OfferDto;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormLayoutOverrideDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/AddressDetailsLayoutDto;Ljava/util/List;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormOverrideDto$FormThemeDto;Ljava/lang/Object;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/SendEventPayloadDto;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormDefaultsDto;Ljava/util/List;)V", "getOffer", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/OfferDto;", "getOffers", "()Ljava/util/List;", "getLayout", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormLayoutOverrideDto;", "getAddressDetailsLayout", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/AddressDetailsLayoutDto;", "getPartialAddressDetailsLayouts", "getModals", "getFormTheme", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormOverrideDto$FormThemeDto;", "getMeta", "()Ljava/lang/Object;", "getSendEventPayload", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/SendEventPayloadDto;", "getMetricaLabel", "()Ljava/lang/String;", "getDefaults", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormDefaultsDto;", "getModifiers", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "", "toString", "FormThemeDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FormOverrideDto {
    private final AddressDetailsLayoutDto addressDetailsLayout;
    private final FormDefaultsDto defaults;
    private final FormThemeDto formTheme;
    private final FormLayoutOverrideDto layout;
    private final Object meta;
    private final String metricaLabel;
    private final List<FormModalViewDto> modals;
    private final List<FormOverrideModifierDescriptorDto> modifiers;
    private final OfferDto offer;
    private final List<OfferDto> offers;
    private final List<PartialAddressDetailsLayoutDto> partialAddressDetailsLayouts;
    private final SendEventPayloadDto sendEventPayload;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormOverrideDto$FormThemeDto;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "ULTIMA", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FormThemeDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ FormThemeDto[] $VALUES;

        @Json(name = "default")
        public static final FormThemeDto DEFAULT = new FormThemeDto("DEFAULT", 0);

        @Json(name = "ultima")
        public static final FormThemeDto ULTIMA = new FormThemeDto("ULTIMA", 1);

        private static final /* synthetic */ FormThemeDto[] $values() {
            return new FormThemeDto[]{DEFAULT, ULTIMA};
        }

        static {
            FormThemeDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private FormThemeDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static FormThemeDto valueOf(String str) {
            return (FormThemeDto) Enum.valueOf(FormThemeDto.class, str);
        }

        public static FormThemeDto[] values() {
            return (FormThemeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FormOverrideDto(@Json(name = "offer") OfferDto offerDto, @Json(name = "offers") List<OfferDto> list, @Json(name = "layout") FormLayoutOverrideDto formLayoutOverrideDto, @Json(name = "address_details_layout") AddressDetailsLayoutDto addressDetailsLayoutDto, @Json(name = "partial_address_details_layouts") List<PartialAddressDetailsLayoutDto> list2, @Json(name = "modals") List<? extends FormModalViewDto> list3, @Json(name = "form_theme") FormThemeDto formThemeDto, @Json(name = "meta") Object obj, @Json(name = "send_event_payload") SendEventPayloadDto sendEventPayloadDto, @Json(name = "metrica_label") String str, @Json(name = "defaults") FormDefaultsDto formDefaultsDto, @Json(name = "modifiers") List<FormOverrideModifierDescriptorDto> list4) {
        this.offer = offerDto;
        this.offers = list;
        this.layout = formLayoutOverrideDto;
        this.addressDetailsLayout = addressDetailsLayoutDto;
        this.partialAddressDetailsLayouts = list2;
        this.modals = list3;
        this.formTheme = formThemeDto;
        this.meta = obj;
        this.sendEventPayload = sendEventPayloadDto;
        this.metricaLabel = str;
        this.defaults = formDefaultsDto;
        this.modifiers = list4;
    }

    public static /* synthetic */ FormOverrideDto copy$default(FormOverrideDto formOverrideDto, OfferDto offerDto, List list, FormLayoutOverrideDto formLayoutOverrideDto, AddressDetailsLayoutDto addressDetailsLayoutDto, List list2, List list3, FormThemeDto formThemeDto, Object obj, SendEventPayloadDto sendEventPayloadDto, String str, FormDefaultsDto formDefaultsDto, List list4, int i, Object obj2) {
        if ((i & 1) != 0) {
            offerDto = formOverrideDto.offer;
        }
        if ((i & 2) != 0) {
            list = formOverrideDto.offers;
        }
        if ((i & 4) != 0) {
            formLayoutOverrideDto = formOverrideDto.layout;
        }
        if ((i & 8) != 0) {
            addressDetailsLayoutDto = formOverrideDto.addressDetailsLayout;
        }
        if ((i & 16) != 0) {
            list2 = formOverrideDto.partialAddressDetailsLayouts;
        }
        if ((i & 32) != 0) {
            list3 = formOverrideDto.modals;
        }
        if ((i & 64) != 0) {
            formThemeDto = formOverrideDto.formTheme;
        }
        if ((i & 128) != 0) {
            obj = formOverrideDto.meta;
        }
        if ((i & 256) != 0) {
            sendEventPayloadDto = formOverrideDto.sendEventPayload;
        }
        if ((i & 512) != 0) {
            str = formOverrideDto.metricaLabel;
        }
        if ((i & 1024) != 0) {
            formDefaultsDto = formOverrideDto.defaults;
        }
        if ((i & 2048) != 0) {
            list4 = formOverrideDto.modifiers;
        }
        FormDefaultsDto formDefaultsDto2 = formDefaultsDto;
        List list5 = list4;
        SendEventPayloadDto sendEventPayloadDto2 = sendEventPayloadDto;
        String str2 = str;
        FormThemeDto formThemeDto2 = formThemeDto;
        Object obj3 = obj;
        List list6 = list2;
        List list7 = list3;
        return formOverrideDto.copy(offerDto, list, formLayoutOverrideDto, addressDetailsLayoutDto, list6, list7, formThemeDto2, obj3, sendEventPayloadDto2, str2, formDefaultsDto2, list5);
    }

    /* renamed from: component1, reason: from getter */
    public final OfferDto getOffer() {
        return this.offer;
    }

    /* renamed from: component10, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component11, reason: from getter */
    public final FormDefaultsDto getDefaults() {
        return this.defaults;
    }

    public final List<FormOverrideModifierDescriptorDto> component12() {
        return this.modifiers;
    }

    public final List<OfferDto> component2() {
        return this.offers;
    }

    /* renamed from: component3, reason: from getter */
    public final FormLayoutOverrideDto getLayout() {
        return this.layout;
    }

    /* renamed from: component4, reason: from getter */
    public final AddressDetailsLayoutDto getAddressDetailsLayout() {
        return this.addressDetailsLayout;
    }

    public final List<PartialAddressDetailsLayoutDto> component5() {
        return this.partialAddressDetailsLayouts;
    }

    public final List<FormModalViewDto> component6() {
        return this.modals;
    }

    /* renamed from: component7, reason: from getter */
    public final FormThemeDto getFormTheme() {
        return this.formTheme;
    }

    /* renamed from: component8, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    /* renamed from: component9, reason: from getter */
    public final SendEventPayloadDto getSendEventPayload() {
        return this.sendEventPayload;
    }

    public final FormOverrideDto copy(@Json(name = "offer") OfferDto offer, @Json(name = "offers") List<OfferDto> offers, @Json(name = "layout") FormLayoutOverrideDto layout, @Json(name = "address_details_layout") AddressDetailsLayoutDto addressDetailsLayout, @Json(name = "partial_address_details_layouts") List<PartialAddressDetailsLayoutDto> partialAddressDetailsLayouts, @Json(name = "modals") List<? extends FormModalViewDto> modals, @Json(name = "form_theme") FormThemeDto formTheme, @Json(name = "meta") Object meta, @Json(name = "send_event_payload") SendEventPayloadDto sendEventPayload, @Json(name = "metrica_label") String metricaLabel, @Json(name = "defaults") FormDefaultsDto defaults, @Json(name = "modifiers") List<FormOverrideModifierDescriptorDto> modifiers) {
        return new FormOverrideDto(offer, offers, layout, addressDetailsLayout, partialAddressDetailsLayouts, modals, formTheme, meta, sendEventPayload, metricaLabel, defaults, modifiers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormOverrideDto)) {
            return false;
        }
        FormOverrideDto formOverrideDto = (FormOverrideDto) other;
        return jl40.l(this.offer, formOverrideDto.offer) && jl40.l(this.offers, formOverrideDto.offers) && jl40.l(this.layout, formOverrideDto.layout) && jl40.l(this.addressDetailsLayout, formOverrideDto.addressDetailsLayout) && jl40.l(this.partialAddressDetailsLayouts, formOverrideDto.partialAddressDetailsLayouts) && jl40.l(this.modals, formOverrideDto.modals) && this.formTheme == formOverrideDto.formTheme && jl40.l(this.meta, formOverrideDto.meta) && jl40.l(this.sendEventPayload, formOverrideDto.sendEventPayload) && jl40.l(this.metricaLabel, formOverrideDto.metricaLabel) && jl40.l(this.defaults, formOverrideDto.defaults) && jl40.l(this.modifiers, formOverrideDto.modifiers);
    }

    public final AddressDetailsLayoutDto getAddressDetailsLayout() {
        return this.addressDetailsLayout;
    }

    public final FormDefaultsDto getDefaults() {
        return this.defaults;
    }

    public final FormThemeDto getFormTheme() {
        return this.formTheme;
    }

    public final FormLayoutOverrideDto getLayout() {
        return this.layout;
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final List<FormModalViewDto> getModals() {
        return this.modals;
    }

    public final List<FormOverrideModifierDescriptorDto> getModifiers() {
        return this.modifiers;
    }

    public final OfferDto getOffer() {
        return this.offer;
    }

    public final List<OfferDto> getOffers() {
        return this.offers;
    }

    public final List<PartialAddressDetailsLayoutDto> getPartialAddressDetailsLayouts() {
        return this.partialAddressDetailsLayouts;
    }

    public final SendEventPayloadDto getSendEventPayload() {
        return this.sendEventPayload;
    }

    public int hashCode() {
        OfferDto offerDto = this.offer;
        int hashCode = (offerDto == null ? 0 : offerDto.hashCode()) * 31;
        List<OfferDto> list = this.offers;
        int hashCode2 = (this.layout.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        AddressDetailsLayoutDto addressDetailsLayoutDto = this.addressDetailsLayout;
        int hashCode3 = (hashCode2 + (addressDetailsLayoutDto == null ? 0 : addressDetailsLayoutDto.hashCode())) * 31;
        List<PartialAddressDetailsLayoutDto> list2 = this.partialAddressDetailsLayouts;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<FormModalViewDto> list3 = this.modals;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        FormThemeDto formThemeDto = this.formTheme;
        int hashCode6 = (hashCode5 + (formThemeDto == null ? 0 : formThemeDto.hashCode())) * 31;
        Object obj = this.meta;
        int hashCode7 = (hashCode6 + (obj == null ? 0 : obj.hashCode())) * 31;
        SendEventPayloadDto sendEventPayloadDto = this.sendEventPayload;
        int hashCode8 = (hashCode7 + (sendEventPayloadDto == null ? 0 : sendEventPayloadDto.hashCode())) * 31;
        String str = this.metricaLabel;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        FormDefaultsDto formDefaultsDto = this.defaults;
        int hashCode10 = (hashCode9 + (formDefaultsDto == null ? 0 : formDefaultsDto.hashCode())) * 31;
        List<FormOverrideModifierDescriptorDto> list4 = this.modifiers;
        return hashCode10 + (list4 != null ? list4.hashCode() : 0);
    }

    public String toString() {
        OfferDto offerDto = this.offer;
        List<OfferDto> list = this.offers;
        FormLayoutOverrideDto formLayoutOverrideDto = this.layout;
        AddressDetailsLayoutDto addressDetailsLayoutDto = this.addressDetailsLayout;
        List<PartialAddressDetailsLayoutDto> list2 = this.partialAddressDetailsLayouts;
        List<FormModalViewDto> list3 = this.modals;
        FormThemeDto formThemeDto = this.formTheme;
        Object obj = this.meta;
        SendEventPayloadDto sendEventPayloadDto = this.sendEventPayload;
        String str = this.metricaLabel;
        FormDefaultsDto formDefaultsDto = this.defaults;
        List<FormOverrideModifierDescriptorDto> list4 = this.modifiers;
        StringBuilder sb = new StringBuilder("FormOverrideDto(offer=");
        sb.append(offerDto);
        sb.append(", offers=");
        sb.append(list);
        sb.append(", layout=");
        sb.append(formLayoutOverrideDto);
        sb.append(", addressDetailsLayout=");
        sb.append(addressDetailsLayoutDto);
        sb.append(", partialAddressDetailsLayouts=");
        nnm.w(sb, list2, ", modals=", list3, ", formTheme=");
        sb.append(formThemeDto);
        sb.append(", meta=");
        sb.append(obj);
        sb.append(", sendEventPayload=");
        sb.append(sendEventPayloadDto);
        sb.append(", metricaLabel=");
        sb.append(str);
        sb.append(", defaults=");
        sb.append(formDefaultsDto);
        sb.append(", modifiers=");
        sb.append(list4);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
