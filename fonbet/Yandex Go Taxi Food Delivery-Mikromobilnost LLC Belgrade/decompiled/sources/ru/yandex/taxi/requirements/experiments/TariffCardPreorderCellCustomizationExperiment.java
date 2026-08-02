package ru.yandex.taxi.requirements.experiments;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.xlw0;
import defpackage.xn11;
import defpackage.ycx0;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/requirements/experiments/TariffCardPreorderCellCustomizationExperiment;", "Lxn11;", "Lc6z;", "Companion", "PreorderCardTariffParametersDto", "ycx0", "xcx0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TariffCardPreorderCellCustomizationExperiment implements xn11, c6z {
    public static final ycx0 Companion = new ycx0();
    public static final i3y[] d;
    public final Map b;
    public final Map c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new xlw0(19)), kotlin.a.b(lazyThreadSafetyMode, new xlw0(20))};
    }

    public /* synthetic */ TariffCardPreorderCellCustomizationExperiment(int i, Map map, Map map2) {
        this.b = (i & 1) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map2;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/requirements/experiments/TariffCardPreorderCellCustomizationExperiment$PreorderCardTariffParametersDto;", "", "Companion", "PreorderCardPosition", "ru/yandex/taxi/requirements/experiments/a", "ru/yandex/taxi/requirements/experiments/b", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PreorderCardTariffParametersDto {
        public static final b Companion = new b();
        public final String a;
        public final String b;
        public final String c;
        public final PreorderCardPosition d;

        public /* synthetic */ PreorderCardTariffParametersDto(int i, String str, String str2, String str3, PreorderCardPosition preorderCardPosition) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = preorderCardPosition;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/requirements/experiments/TariffCardPreorderCellCustomizationExperiment$PreorderCardTariffParametersDto$PreorderCardPosition;", "", "Companion", "CardPositionSection", "ru/yandex/taxi/requirements/experiments/c", "ru/yandex/taxi/requirements/experiments/e", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class PreorderCardPosition {
            public static final e Companion = new e();
            public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlw0(21))};
            public final CardPositionSection a;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/requirements/experiments/TariffCardPreorderCellCustomizationExperiment$PreorderCardTariffParametersDto$PreorderCardPosition$CardPositionSection;", "", "Companion", "ru/yandex/taxi/requirements/experiments/d", "DEFAULT", "GLUED", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final class CardPositionSection {
                private static final /* synthetic */ k4o $ENTRIES;
                private static final /* synthetic */ CardPositionSection[] $VALUES;
                private static final i3y $cachedSerializer$delegate;
                public static final d Companion;
                public static final CardPositionSection DEFAULT;
                public static final CardPositionSection GLUED;

                static {
                    CardPositionSection cardPositionSection = new CardPositionSection("DEFAULT", 0);
                    DEFAULT = cardPositionSection;
                    CardPositionSection cardPositionSection2 = new CardPositionSection("GLUED", 1);
                    GLUED = cardPositionSection2;
                    CardPositionSection[] cardPositionSectionArr = {cardPositionSection, cardPositionSection2};
                    $VALUES = cardPositionSectionArr;
                    $ENTRIES = kotlin.enums.a.a(cardPositionSectionArr);
                    Companion = new d();
                    $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlw0(22));
                }

                public static CardPositionSection valueOf(String str) {
                    return (CardPositionSection) Enum.valueOf(CardPositionSection.class, str);
                }

                public static CardPositionSection[] values() {
                    return (CardPositionSection[]) $VALUES.clone();
                }
            }

            public /* synthetic */ PreorderCardPosition(int i, CardPositionSection cardPositionSection) {
                if ((i & 1) == 0) {
                    this.a = CardPositionSection.DEFAULT;
                } else {
                    this.a = cardPositionSection;
                }
            }

            public PreorderCardPosition() {
                this.a = CardPositionSection.DEFAULT;
            }
        }

        public PreorderCardTariffParametersDto() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }
    }

    public TariffCardPreorderCellCustomizationExperiment() {
        this(0);
    }

    public TariffCardPreorderCellCustomizationExperiment(int i) {
        Map f = kotlin.collections.b.f();
        Map f2 = kotlin.collections.b.f();
        this.b = f;
        this.c = f2;
    }
}
