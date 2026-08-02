package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00018B\u008f\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u000b\u001a\u00020\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0091\u0001\u00102\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u000b\u001a\u00020\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u00103\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00069"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenFormDto;", "", "mode", "", "scenario", "cardMode", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CardModeDto;", "topButton", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenFormDto$TopButtonDto;", "clientState", "asyncTaskId", "isCacheState", "", "title", "imageTag", "badgeText", "metricaLabel", "actionGuardPolicy", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionGuardPolicyDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CardModeDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenFormDto$TopButtonDto;Ljava/lang/Object;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionGuardPolicyDto;)V", "getMode", "()Ljava/lang/String;", "getScenario", "getCardMode", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CardModeDto;", "getTopButton", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenFormDto$TopButtonDto;", "getClientState", "()Ljava/lang/Object;", "getAsyncTaskId", "()Z", "getTitle", "getImageTag", "getBadgeText", "getMetricaLabel", "getActionGuardPolicy", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionGuardPolicyDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "TopButtonDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ActionOpenFormDto {
    private final ActionGuardPolicyDto actionGuardPolicy;
    private final String asyncTaskId;
    private final String badgeText;
    private final CardModeDto cardMode;
    private final Object clientState;
    private final String imageTag;
    private final boolean isCacheState;
    private final String metricaLabel;
    private final String mode;
    private final String scenario;
    private final String title;
    private final TopButtonDto topButton;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenFormDto$TopButtonDto;", "", "<init>", "(Ljava/lang/String;I)V", JCP.RAW_PREFIX, "BACK", "CLOSE", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TopButtonDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TopButtonDto[] $VALUES;

        @Json(name = "none")
        public static final TopButtonDto NONE = new TopButtonDto(JCP.RAW_PREFIX, 0);

        @Json(name = "back")
        public static final TopButtonDto BACK = new TopButtonDto("BACK", 1);

        @Json(name = "close")
        public static final TopButtonDto CLOSE = new TopButtonDto("CLOSE", 2);

        private static final /* synthetic */ TopButtonDto[] $values() {
            return new TopButtonDto[]{NONE, BACK, CLOSE};
        }

        static {
            TopButtonDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private TopButtonDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static TopButtonDto valueOf(String str) {
            return (TopButtonDto) Enum.valueOf(TopButtonDto.class, str);
        }

        public static TopButtonDto[] values() {
            return (TopButtonDto[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ActionOpenFormDto(String str, String str2, CardModeDto cardModeDto, TopButtonDto topButtonDto, Object obj, String str3, boolean z, String str4, String str5, String str6, String str7, ActionGuardPolicyDto actionGuardPolicyDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, cardModeDto, (i & 8) != 0 ? TopButtonDto.NONE : topButtonDto, obj, str3, (i & 64) != 0 ? false : z, str4, str5, str6, str7, actionGuardPolicyDto);
    }

    public static /* synthetic */ ActionOpenFormDto copy$default(ActionOpenFormDto actionOpenFormDto, String str, String str2, CardModeDto cardModeDto, TopButtonDto topButtonDto, Object obj, String str3, boolean z, String str4, String str5, String str6, String str7, ActionGuardPolicyDto actionGuardPolicyDto, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = actionOpenFormDto.mode;
        }
        if ((i & 2) != 0) {
            str2 = actionOpenFormDto.scenario;
        }
        if ((i & 4) != 0) {
            cardModeDto = actionOpenFormDto.cardMode;
        }
        if ((i & 8) != 0) {
            topButtonDto = actionOpenFormDto.topButton;
        }
        if ((i & 16) != 0) {
            obj = actionOpenFormDto.clientState;
        }
        if ((i & 32) != 0) {
            str3 = actionOpenFormDto.asyncTaskId;
        }
        if ((i & 64) != 0) {
            z = actionOpenFormDto.isCacheState;
        }
        if ((i & 128) != 0) {
            str4 = actionOpenFormDto.title;
        }
        if ((i & 256) != 0) {
            str5 = actionOpenFormDto.imageTag;
        }
        if ((i & 512) != 0) {
            str6 = actionOpenFormDto.badgeText;
        }
        if ((i & 1024) != 0) {
            str7 = actionOpenFormDto.metricaLabel;
        }
        if ((i & 2048) != 0) {
            actionGuardPolicyDto = actionOpenFormDto.actionGuardPolicy;
        }
        String str8 = str7;
        ActionGuardPolicyDto actionGuardPolicyDto2 = actionGuardPolicyDto;
        String str9 = str5;
        String str10 = str6;
        boolean z2 = z;
        String str11 = str4;
        Object obj3 = obj;
        String str12 = str3;
        return actionOpenFormDto.copy(str, str2, cardModeDto, topButtonDto, obj3, str12, z2, str11, str9, str10, str8, actionGuardPolicyDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    /* renamed from: component10, reason: from getter */
    public final String getBadgeText() {
        return this.badgeText;
    }

    /* renamed from: component11, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component12, reason: from getter */
    public final ActionGuardPolicyDto getActionGuardPolicy() {
        return this.actionGuardPolicy;
    }

    /* renamed from: component2, reason: from getter */
    public final String getScenario() {
        return this.scenario;
    }

    /* renamed from: component3, reason: from getter */
    public final CardModeDto getCardMode() {
        return this.cardMode;
    }

    /* renamed from: component4, reason: from getter */
    public final TopButtonDto getTopButton() {
        return this.topButton;
    }

    /* renamed from: component5, reason: from getter */
    public final Object getClientState() {
        return this.clientState;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAsyncTaskId() {
        return this.asyncTaskId;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsCacheState() {
        return this.isCacheState;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component9, reason: from getter */
    public final String getImageTag() {
        return this.imageTag;
    }

    public final ActionOpenFormDto copy(@Json(name = "mode") String mode, @Json(name = "scenario") String scenario, @Json(name = "card_mode") CardModeDto cardMode, @Json(name = "top_button") TopButtonDto topButton, @Json(name = "client_state") Object clientState, @Json(name = "async_task_id") String asyncTaskId, @Json(name = "is_cache_state") boolean isCacheState, @Json(name = "title") String title, @Json(name = "image_tag") String imageTag, @Json(name = "badge_text") String badgeText, @Json(name = "metrica_label") String metricaLabel, @Json(name = "action_guard_policy") ActionGuardPolicyDto actionGuardPolicy) {
        return new ActionOpenFormDto(mode, scenario, cardMode, topButton, clientState, asyncTaskId, isCacheState, title, imageTag, badgeText, metricaLabel, actionGuardPolicy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionOpenFormDto)) {
            return false;
        }
        ActionOpenFormDto actionOpenFormDto = (ActionOpenFormDto) other;
        return jl40.l(this.mode, actionOpenFormDto.mode) && jl40.l(this.scenario, actionOpenFormDto.scenario) && jl40.l(this.cardMode, actionOpenFormDto.cardMode) && this.topButton == actionOpenFormDto.topButton && jl40.l(this.clientState, actionOpenFormDto.clientState) && jl40.l(this.asyncTaskId, actionOpenFormDto.asyncTaskId) && this.isCacheState == actionOpenFormDto.isCacheState && jl40.l(this.title, actionOpenFormDto.title) && jl40.l(this.imageTag, actionOpenFormDto.imageTag) && jl40.l(this.badgeText, actionOpenFormDto.badgeText) && jl40.l(this.metricaLabel, actionOpenFormDto.metricaLabel) && jl40.l(this.actionGuardPolicy, actionOpenFormDto.actionGuardPolicy);
    }

    public final ActionGuardPolicyDto getActionGuardPolicy() {
        return this.actionGuardPolicy;
    }

    public final String getAsyncTaskId() {
        return this.asyncTaskId;
    }

    public final String getBadgeText() {
        return this.badgeText;
    }

    public final CardModeDto getCardMode() {
        return this.cardMode;
    }

    public final Object getClientState() {
        return this.clientState;
    }

    public final String getImageTag() {
        return this.imageTag;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final String getMode() {
        return this.mode;
    }

    public final String getScenario() {
        return this.scenario;
    }

    public final String getTitle() {
        return this.title;
    }

    public final TopButtonDto getTopButton() {
        return this.topButton;
    }

    public int hashCode() {
        int hashCode = this.mode.hashCode() * 31;
        String str = this.scenario;
        int hashCode2 = (this.topButton.hashCode() + ((this.cardMode.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        Object obj = this.clientState;
        int hashCode3 = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str2 = this.asyncTaskId;
        int e = unr0.e((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isCacheState);
        String str3 = this.title;
        int hashCode4 = (e + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.imageTag;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.badgeText;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.metricaLabel;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ActionGuardPolicyDto actionGuardPolicyDto = this.actionGuardPolicy;
        return hashCode7 + (actionGuardPolicyDto != null ? actionGuardPolicyDto.hashCode() : 0);
    }

    public final boolean isCacheState() {
        return this.isCacheState;
    }

    public String toString() {
        String str = this.mode;
        String str2 = this.scenario;
        CardModeDto cardModeDto = this.cardMode;
        TopButtonDto topButtonDto = this.topButton;
        Object obj = this.clientState;
        String str3 = this.asyncTaskId;
        boolean z = this.isCacheState;
        String str4 = this.title;
        String str5 = this.imageTag;
        String str6 = this.badgeText;
        String str7 = this.metricaLabel;
        ActionGuardPolicyDto actionGuardPolicyDto = this.actionGuardPolicy;
        StringBuilder v = b64.v("ActionOpenFormDto(mode=", str, ", scenario=", str2, ", cardMode=");
        v.append(cardModeDto);
        v.append(", topButton=");
        v.append(topButtonDto);
        v.append(", clientState=");
        v.append(obj);
        v.append(", asyncTaskId=");
        v.append(str3);
        v.append(", isCacheState=");
        unr0.A(", title=", str4, ", imageTag=", v, z);
        g8e.D(v, str5, ", badgeText=", str6, ", metricaLabel=");
        v.append(str7);
        v.append(", actionGuardPolicy=");
        v.append(actionGuardPolicyDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public ActionOpenFormDto(@Json(name = "mode") String str, @Json(name = "scenario") String str2, @Json(name = "card_mode") CardModeDto cardModeDto, @Json(name = "top_button") TopButtonDto topButtonDto, @Json(name = "client_state") Object obj, @Json(name = "async_task_id") String str3, @Json(name = "is_cache_state") boolean z, @Json(name = "title") String str4, @Json(name = "image_tag") String str5, @Json(name = "badge_text") String str6, @Json(name = "metrica_label") String str7, @Json(name = "action_guard_policy") ActionGuardPolicyDto actionGuardPolicyDto) {
        this.mode = str;
        this.scenario = str2;
        this.cardMode = cardModeDto;
        this.topButton = topButtonDto;
        this.clientState = obj;
        this.asyncTaskId = str3;
        this.isCacheState = z;
        this.title = str4;
        this.imageTag = str5;
        this.badgeText = str6;
        this.metricaLabel = str7;
        this.actionGuardPolicy = actionGuardPolicyDto;
    }
}
