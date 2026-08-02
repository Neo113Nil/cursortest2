package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.yphone.service.settings.AppSettingsContract$Setting;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputStopWordRuleDto;", "", "ruleType", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputStopWordRuleDto$RuleTypeDto;", "value", "", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputStopWordRuleDto$RuleTypeDto;Ljava/lang/String;)V", "getRuleType", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputStopWordRuleDto$RuleTypeDto;", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "RuleTypeDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TextInputStopWordRuleDto {
    private final RuleTypeDto ruleType;
    private final String value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputStopWordRuleDto$RuleTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "PREFIX", "SUBSTRING", "WORD", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RuleTypeDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ RuleTypeDto[] $VALUES;

        @Json(name = AppSettingsContract$Setting.COLUMN_PREFIX)
        public static final RuleTypeDto PREFIX = new RuleTypeDto("PREFIX", 0);

        @Json(name = "substring")
        public static final RuleTypeDto SUBSTRING = new RuleTypeDto("SUBSTRING", 1);

        @Json(name = "word")
        public static final RuleTypeDto WORD = new RuleTypeDto("WORD", 2);

        private static final /* synthetic */ RuleTypeDto[] $values() {
            return new RuleTypeDto[]{PREFIX, SUBSTRING, WORD};
        }

        static {
            RuleTypeDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private RuleTypeDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static RuleTypeDto valueOf(String str) {
            return (RuleTypeDto) Enum.valueOf(RuleTypeDto.class, str);
        }

        public static RuleTypeDto[] values() {
            return (RuleTypeDto[]) $VALUES.clone();
        }
    }

    public TextInputStopWordRuleDto(@Json(name = "rule_type") RuleTypeDto ruleTypeDto, @Json(name = "value") String str) {
        this.ruleType = ruleTypeDto;
        this.value = str;
    }

    public static /* synthetic */ TextInputStopWordRuleDto copy$default(TextInputStopWordRuleDto textInputStopWordRuleDto, RuleTypeDto ruleTypeDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            ruleTypeDto = textInputStopWordRuleDto.ruleType;
        }
        if ((i & 2) != 0) {
            str = textInputStopWordRuleDto.value;
        }
        return textInputStopWordRuleDto.copy(ruleTypeDto, str);
    }

    /* renamed from: component1, reason: from getter */
    public final RuleTypeDto getRuleType() {
        return this.ruleType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final TextInputStopWordRuleDto copy(@Json(name = "rule_type") RuleTypeDto ruleType, @Json(name = "value") String value) {
        return new TextInputStopWordRuleDto(ruleType, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextInputStopWordRuleDto)) {
            return false;
        }
        TextInputStopWordRuleDto textInputStopWordRuleDto = (TextInputStopWordRuleDto) other;
        return this.ruleType == textInputStopWordRuleDto.ruleType && jl40.l(this.value, textInputStopWordRuleDto.value);
    }

    public final RuleTypeDto getRuleType() {
        return this.ruleType;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.ruleType.hashCode() * 31);
    }

    public String toString() {
        return "TextInputStopWordRuleDto(ruleType=" + this.ruleType + ", value=" + this.value + Extension.C_BRAKE;
    }
}
