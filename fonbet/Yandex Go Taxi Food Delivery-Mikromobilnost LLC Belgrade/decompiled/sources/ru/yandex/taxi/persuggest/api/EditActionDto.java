package ru.yandex.taxi.persuggest.api;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.tvl;
import defpackage.vkn;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/persuggest/api/EditActionDto;", "", "Companion", "vkn", "EDIT", "CLEAR", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class EditActionDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EditActionDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final EditActionDto CLEAR;
    public static final vkn Companion;
    public static final EditActionDto EDIT;

    static {
        EditActionDto editActionDto = new EditActionDto("EDIT", 0);
        EDIT = editActionDto;
        EditActionDto editActionDto2 = new EditActionDto("CLEAR", 1);
        CLEAR = editActionDto2;
        EditActionDto[] editActionDtoArr = {editActionDto, editActionDto2};
        $VALUES = editActionDtoArr;
        $ENTRIES = kotlin.enums.a.a(editActionDtoArr);
        Companion = new vkn();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tvl(28));
    }

    public static EditActionDto valueOf(String str) {
        return (EditActionDto) Enum.valueOf(EditActionDto.class, str);
    }

    public static EditActionDto[] values() {
        return (EditActionDto[]) $VALUES.clone();
    }
}
