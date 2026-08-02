package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems;

import com.squareup.moshi.Json;
import com.yandex.go.user_profile.fullscreen.presentation.UserProfileJsNativeApi;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentFontWeightDto;", "", "<init>", "(Ljava/lang/String;I)V", "LIGHT", "REGULAR", "MEDIUM", "BOLD", "HEAVY", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ContentFontWeightDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ContentFontWeightDto[] $VALUES;

    @Json(name = "light")
    public static final ContentFontWeightDto LIGHT = new ContentFontWeightDto("LIGHT", 0);

    @Json(name = "regular")
    public static final ContentFontWeightDto REGULAR = new ContentFontWeightDto("REGULAR", 1);

    @Json(name = "medium")
    public static final ContentFontWeightDto MEDIUM = new ContentFontWeightDto("MEDIUM", 2);

    @Json(name = "bold")
    public static final ContentFontWeightDto BOLD = new ContentFontWeightDto("BOLD", 3);

    @Json(name = UserProfileJsNativeApi.HAPTIC_HEAVY_INTENSITY)
    public static final ContentFontWeightDto HEAVY = new ContentFontWeightDto("HEAVY", 4);

    private static final /* synthetic */ ContentFontWeightDto[] $values() {
        return new ContentFontWeightDto[]{LIGHT, REGULAR, MEDIUM, BOLD, HEAVY};
    }

    static {
        ContentFontWeightDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ContentFontWeightDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ContentFontWeightDto valueOf(String str) {
        return (ContentFontWeightDto) Enum.valueOf(ContentFontWeightDto.class, str);
    }

    public static ContentFontWeightDto[] values() {
        return (ContentFontWeightDto[]) $VALUES.clone();
    }
}
