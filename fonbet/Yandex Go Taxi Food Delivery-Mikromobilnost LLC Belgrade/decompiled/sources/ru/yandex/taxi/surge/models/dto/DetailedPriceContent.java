package ru.yandex.taxi.surge.models.dto;

import com.yandex.go.slot.dto.SlotItemDto;
import defpackage.dii;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.s2j;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/surge/models/dto/DetailedPriceContent;", "", "Companion", "DetailedPriceItem", "a", "r2j", "s2j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DetailedPriceContent {
    public static final s2j Companion = new s2j();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dii(14)), null};
    public final List a;
    public final String b;

    public /* synthetic */ DetailedPriceContent(int i, List list, String str) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/surge/models/dto/DetailedPriceContent$a;", "", "Companion", "ru/yandex/taxi/surge/models/dto/d", "ru/yandex/taxi/surge/models/dto/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final e Companion = new e();
        public final String a;

        public /* synthetic */ a(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public a(int i) {
            this.a = "";
        }

        public a() {
            this(0);
        }
    }

    public DetailedPriceContent(int i) {
        this.a = EmptyList.a;
        this.b = "";
    }

    public DetailedPriceContent() {
        this(0);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/surge/models/dto/DetailedPriceContent$DetailedPriceItem;", "", "Companion", "DividerType", "ru/yandex/taxi/surge/models/dto/a", "ru/yandex/taxi/surge/models/dto/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class DetailedPriceItem {
        public static final b Companion = new b();
        public static final i3y[] g = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dii(15)), null, null};
        public final SlotItemDto a;
        public final double b;
        public final double c;
        public final DividerType d;
        public final a e;
        public final boolean f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/surge/models/dto/DetailedPriceContent$DetailedPriceItem$DividerType;", "", "Companion", "ru/yandex/taxi/surge/models/dto/c", "LINE", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class DividerType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ DividerType[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final c Companion;
            public static final DividerType LINE;
            public static final DividerType UNKNOWN;

            static {
                DividerType dividerType = new DividerType("LINE", 0);
                LINE = dividerType;
                DividerType dividerType2 = new DividerType("UNKNOWN", 1);
                UNKNOWN = dividerType2;
                DividerType[] dividerTypeArr = {dividerType, dividerType2};
                $VALUES = dividerTypeArr;
                $ENTRIES = kotlin.enums.a.a(dividerTypeArr);
                Companion = new c();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dii(16));
            }

            public static DividerType valueOf(String str) {
                return (DividerType) Enum.valueOf(DividerType.class, str);
            }

            public static DividerType[] values() {
                return (DividerType[]) $VALUES.clone();
            }
        }

        public /* synthetic */ DetailedPriceItem(int i, SlotItemDto slotItemDto, double d, double d2, DividerType dividerType, a aVar, boolean z) {
            this.a = (i & 1) == 0 ? new SlotItemDto(0) : slotItemDto;
            if ((i & 2) == 0) {
                this.b = 0.0d;
            } else {
                this.b = d;
            }
            if ((i & 4) == 0) {
                this.c = 0.0d;
            } else {
                this.c = d2;
            }
            if ((i & 8) == 0) {
                this.d = DividerType.UNKNOWN;
            } else {
                this.d = dividerType;
            }
            if ((i & 16) == 0) {
                this.e = new a(0);
            } else {
                this.e = aVar;
            }
            if ((i & 32) == 0) {
                this.f = false;
            } else {
                this.f = z;
            }
        }

        public DetailedPriceItem() {
            SlotItemDto slotItemDto = new SlotItemDto(0);
            DividerType dividerType = DividerType.UNKNOWN;
            a aVar = new a(0);
            this.a = slotItemDto;
            this.b = 0.0d;
            this.c = 0.0d;
            this.d = dividerType;
            this.e = aVar;
            this.f = false;
        }
    }
}
