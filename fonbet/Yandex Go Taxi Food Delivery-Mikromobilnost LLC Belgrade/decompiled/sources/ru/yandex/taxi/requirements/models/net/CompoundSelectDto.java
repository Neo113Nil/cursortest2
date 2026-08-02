package ru.yandex.taxi.requirements.models.net;

import defpackage.bgc;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.pvd;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/requirements/models/net/CompoundSelectDto;", "", "Companion", "CompoundSelectItemTypeDto", "ru/yandex/taxi/requirements/models/net/a", "pvd", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CompoundSelectDto {
    public static final pvd Companion = new pvd();
    public static final i3y[] c;
    public final List a;
    public final CompoundSelectItemTypeDto b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/requirements/models/net/CompoundSelectDto$CompoundSelectItemTypeDto;", "", "Companion", "ru/yandex/taxi/requirements/models/net/b", "DEFAULT", "CHILD_SEATS", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class CompoundSelectItemTypeDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ CompoundSelectItemTypeDto[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final CompoundSelectItemTypeDto CHILD_SEATS;
        public static final b Companion;
        public static final CompoundSelectItemTypeDto DEFAULT;

        static {
            CompoundSelectItemTypeDto compoundSelectItemTypeDto = new CompoundSelectItemTypeDto("DEFAULT", 0);
            DEFAULT = compoundSelectItemTypeDto;
            CompoundSelectItemTypeDto compoundSelectItemTypeDto2 = new CompoundSelectItemTypeDto("CHILD_SEATS", 1);
            CHILD_SEATS = compoundSelectItemTypeDto2;
            CompoundSelectItemTypeDto[] compoundSelectItemTypeDtoArr = {compoundSelectItemTypeDto, compoundSelectItemTypeDto2};
            $VALUES = compoundSelectItemTypeDtoArr;
            $ENTRIES = kotlin.enums.a.a(compoundSelectItemTypeDtoArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bgc(17));
        }

        public static CompoundSelectItemTypeDto valueOf(String str) {
            return (CompoundSelectItemTypeDto) Enum.valueOf(CompoundSelectItemTypeDto.class, str);
        }

        public static CompoundSelectItemTypeDto[] values() {
            return (CompoundSelectItemTypeDto[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new bgc(15)), kotlin.a.b(lazyThreadSafetyMode, new bgc(16))};
    }

    public /* synthetic */ CompoundSelectDto(int i, List list, CompoundSelectItemTypeDto compoundSelectItemTypeDto) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = CompoundSelectItemTypeDto.DEFAULT;
        } else {
            this.b = compoundSelectItemTypeDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompoundSelectDto)) {
            return false;
        }
        CompoundSelectDto compoundSelectDto = (CompoundSelectDto) obj;
        return jl40.l(this.a, compoundSelectDto.a) && this.b == compoundSelectDto.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CompoundSelectDto(items=" + this.a + ", type=" + this.b + Extension.C_BRAKE;
    }

    public CompoundSelectDto() {
        this(0);
    }

    public CompoundSelectDto(int i) {
        CompoundSelectItemTypeDto compoundSelectItemTypeDto = CompoundSelectItemTypeDto.DEFAULT;
        this.a = EmptyList.a;
        this.b = compoundSelectItemTypeDto;
    }
}
