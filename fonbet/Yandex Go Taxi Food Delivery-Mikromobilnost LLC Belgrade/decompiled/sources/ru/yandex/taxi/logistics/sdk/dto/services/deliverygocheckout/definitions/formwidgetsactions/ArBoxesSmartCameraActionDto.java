package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ArBoxesSmartCameraActionDto;", "", "intent", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ArBoxesSmartCameraActionDto$IntentDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ArBoxesSmartCameraActionDto$IntentDto;)V", "getIntent", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ArBoxesSmartCameraActionDto$IntentDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "IntentDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ArBoxesSmartCameraActionDto {
    private final IntentDto intent;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ArBoxesSmartCameraActionDto$IntentDto;", "", "<init>", "(Ljava/lang/String;I)V", "ROTATE", "RESET", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IntentDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ IntentDto[] $VALUES;

        @Json(name = "rotate")
        public static final IntentDto ROTATE = new IntentDto("ROTATE", 0);

        @Json(name = "reset")
        public static final IntentDto RESET = new IntentDto("RESET", 1);

        private static final /* synthetic */ IntentDto[] $values() {
            return new IntentDto[]{ROTATE, RESET};
        }

        static {
            IntentDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private IntentDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static IntentDto valueOf(String str) {
            return (IntentDto) Enum.valueOf(IntentDto.class, str);
        }

        public static IntentDto[] values() {
            return (IntentDto[]) $VALUES.clone();
        }
    }

    public ArBoxesSmartCameraActionDto(@Json(name = "intent") IntentDto intentDto) {
        this.intent = intentDto;
    }

    public static /* synthetic */ ArBoxesSmartCameraActionDto copy$default(ArBoxesSmartCameraActionDto arBoxesSmartCameraActionDto, IntentDto intentDto, int i, Object obj) {
        if ((i & 1) != 0) {
            intentDto = arBoxesSmartCameraActionDto.intent;
        }
        return arBoxesSmartCameraActionDto.copy(intentDto);
    }

    /* renamed from: component1, reason: from getter */
    public final IntentDto getIntent() {
        return this.intent;
    }

    public final ArBoxesSmartCameraActionDto copy(@Json(name = "intent") IntentDto intent) {
        return new ArBoxesSmartCameraActionDto(intent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ArBoxesSmartCameraActionDto) && this.intent == ((ArBoxesSmartCameraActionDto) other).intent;
    }

    public final IntentDto getIntent() {
        return this.intent;
    }

    public int hashCode() {
        return this.intent.hashCode();
    }

    public String toString() {
        return "ArBoxesSmartCameraActionDto(intent=" + this.intent + Extension.C_BRAKE;
    }
}
