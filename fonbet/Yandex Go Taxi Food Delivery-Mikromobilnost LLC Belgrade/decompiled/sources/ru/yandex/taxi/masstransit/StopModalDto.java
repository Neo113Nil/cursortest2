package ru.yandex.taxi.masstransit;

import defpackage.c3u0;
import defpackage.gsq0;
import defpackage.hgu0;
import defpackage.i3y;
import defpackage.k4o;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/masstransit/StopModalDto;", "", "Companion", "a", "ButtonType", "ggu0", "hgu0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StopModalDto {
    public static final hgu0 Companion = new hgu0();
    public static final i3y[] e = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c3u0(11)), null, null, null};
    public final List a;
    public final String b;
    public final String c;
    public final Integer d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/masstransit/StopModalDto$ButtonType;", "", "Companion", "ru/yandex/taxi/masstransit/g", "ROUTE_FROM", "ROUTE_TO", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ButtonType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ButtonType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final g Companion;
        public static final ButtonType ROUTE_FROM;
        public static final ButtonType ROUTE_TO;
        public static final ButtonType UNKNOWN;

        static {
            ButtonType buttonType = new ButtonType("ROUTE_FROM", 0);
            ROUTE_FROM = buttonType;
            ButtonType buttonType2 = new ButtonType("ROUTE_TO", 1);
            ROUTE_TO = buttonType2;
            ButtonType buttonType3 = new ButtonType("UNKNOWN", 2);
            UNKNOWN = buttonType3;
            ButtonType[] buttonTypeArr = {buttonType, buttonType2, buttonType3};
            $VALUES = buttonTypeArr;
            $ENTRIES = kotlin.enums.a.a(buttonTypeArr);
            Companion = new g();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c3u0(13));
        }

        public static ButtonType valueOf(String str) {
            return (ButtonType) Enum.valueOf(ButtonType.class, str);
        }

        public static ButtonType[] values() {
            return (ButtonType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ StopModalDto(int i, Integer num, String str, String str2, List list) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/StopModalDto$a;", "", "Companion", "ru/yandex/taxi/masstransit/e", "ru/yandex/taxi/masstransit/f", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final f Companion = new f();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c3u0(12)), null};
        public final ButtonType a;
        public final String b;

        public /* synthetic */ a(int i, ButtonType buttonType, String str) {
            this.a = (i & 1) == 0 ? ButtonType.UNKNOWN : buttonType;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
        }

        public a() {
            this.a = ButtonType.UNKNOWN;
            this.b = "";
        }
    }

    public StopModalDto() {
        this.a = EmptyList.a;
        this.b = "";
        this.c = "";
        this.d = null;
    }
}
