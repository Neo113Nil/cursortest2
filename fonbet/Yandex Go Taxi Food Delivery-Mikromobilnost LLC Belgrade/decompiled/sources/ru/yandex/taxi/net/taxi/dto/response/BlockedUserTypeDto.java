package ru.yandex.taxi.net.taxi.dto.response;

import defpackage.av5;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.j46;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/net/taxi/dto/response/BlockedUserTypeDto;", "", "Companion", "j46", "ID", "PHONE", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BlockedUserTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BlockedUserTypeDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final j46 Companion;
    public static final BlockedUserTypeDto ID;
    public static final BlockedUserTypeDto PHONE;

    static {
        BlockedUserTypeDto blockedUserTypeDto = new BlockedUserTypeDto("ID", 0);
        ID = blockedUserTypeDto;
        BlockedUserTypeDto blockedUserTypeDto2 = new BlockedUserTypeDto("PHONE", 1);
        PHONE = blockedUserTypeDto2;
        BlockedUserTypeDto[] blockedUserTypeDtoArr = {blockedUserTypeDto, blockedUserTypeDto2};
        $VALUES = blockedUserTypeDtoArr;
        $ENTRIES = a.a(blockedUserTypeDtoArr);
        Companion = new j46();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new av5(7));
    }

    public static BlockedUserTypeDto valueOf(String str) {
        return (BlockedUserTypeDto) Enum.valueOf(BlockedUserTypeDto.class, str);
    }

    public static BlockedUserTypeDto[] values() {
        return (BlockedUserTypeDto[]) $VALUES.clone();
    }
}
