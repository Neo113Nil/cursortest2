package ru.yandex.taxi.requirements.models.net;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.kz60;
import defpackage.uf70;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/requirements/models/net/OptionViewStyleDto;", "", "Companion", "uf70", "CHECK", "SPINNER", "UNKNOWN", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OptionViewStyleDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OptionViewStyleDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final OptionViewStyleDto CHECK;
    public static final uf70 Companion;
    public static final OptionViewStyleDto SPINNER;
    public static final OptionViewStyleDto UNKNOWN;

    static {
        OptionViewStyleDto optionViewStyleDto = new OptionViewStyleDto("CHECK", 0);
        CHECK = optionViewStyleDto;
        OptionViewStyleDto optionViewStyleDto2 = new OptionViewStyleDto("SPINNER", 1);
        SPINNER = optionViewStyleDto2;
        OptionViewStyleDto optionViewStyleDto3 = new OptionViewStyleDto("UNKNOWN", 2);
        UNKNOWN = optionViewStyleDto3;
        OptionViewStyleDto[] optionViewStyleDtoArr = {optionViewStyleDto, optionViewStyleDto2, optionViewStyleDto3};
        $VALUES = optionViewStyleDtoArr;
        $ENTRIES = kotlin.enums.a.a(optionViewStyleDtoArr);
        Companion = new uf70();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kz60(11));
    }

    public static OptionViewStyleDto valueOf(String str) {
        return (OptionViewStyleDto) Enum.valueOf(OptionViewStyleDto.class, str);
    }

    public static OptionViewStyleDto[] values() {
        return (OptionViewStyleDto[]) $VALUES.clone();
    }
}
