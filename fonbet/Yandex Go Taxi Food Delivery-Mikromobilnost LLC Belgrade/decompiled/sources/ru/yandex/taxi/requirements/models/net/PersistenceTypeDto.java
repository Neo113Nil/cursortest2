package ru.yandex.taxi.requirements.models.net;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.l1b0;
import defpackage.m1b0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/requirements/models/net/PersistenceTypeDto;", "", "Companion", "m1b0", "LOCAL", "UNKNOWN", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PersistenceTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PersistenceTypeDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final m1b0 Companion;
    public static final PersistenceTypeDto LOCAL;
    public static final PersistenceTypeDto UNKNOWN;

    static {
        PersistenceTypeDto persistenceTypeDto = new PersistenceTypeDto("LOCAL", 0);
        LOCAL = persistenceTypeDto;
        PersistenceTypeDto persistenceTypeDto2 = new PersistenceTypeDto("UNKNOWN", 1);
        UNKNOWN = persistenceTypeDto2;
        PersistenceTypeDto[] persistenceTypeDtoArr = {persistenceTypeDto, persistenceTypeDto2};
        $VALUES = persistenceTypeDtoArr;
        $ENTRIES = kotlin.enums.a.a(persistenceTypeDtoArr);
        Companion = new m1b0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new l1b0(0));
    }

    public static PersistenceTypeDto valueOf(String str) {
        return (PersistenceTypeDto) Enum.valueOf(PersistenceTypeDto.class, str);
    }

    public static PersistenceTypeDto[] values() {
        return (PersistenceTypeDto[]) $VALUES.clone();
    }
}
