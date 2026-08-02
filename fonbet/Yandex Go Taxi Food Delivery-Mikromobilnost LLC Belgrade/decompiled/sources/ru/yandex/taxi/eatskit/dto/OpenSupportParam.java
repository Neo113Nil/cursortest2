package ru.yandex.taxi.eatskit.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.l870;
import defpackage.y570;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/eatskit/dto/OpenSupportParam;", "", "Companion", "ScreenType", "ru/yandex/taxi/eatskit/dto/c", "l870", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OpenSupportParam {
    public static final l870 Companion = new l870();
    public static final i3y[] e;
    public final String a;
    public final String b;
    public final Map c;
    public final ScreenType d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/eatskit/dto/OpenSupportParam$ScreenType;", "", "Companion", "ru/yandex/taxi/eatskit/dto/d", "CHAT_LIST", "DEFAULT", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class ScreenType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ScreenType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final ScreenType CHAT_LIST;
        public static final d Companion;
        public static final ScreenType DEFAULT;

        static {
            ScreenType screenType = new ScreenType("CHAT_LIST", 0);
            CHAT_LIST = screenType;
            ScreenType screenType2 = new ScreenType("DEFAULT", 1);
            DEFAULT = screenType2;
            ScreenType[] screenTypeArr = {screenType, screenType2};
            $VALUES = screenTypeArr;
            $ENTRIES = kotlin.enums.a.a(screenTypeArr);
            Companion = new d();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y570(16));
        }

        public static ScreenType valueOf(String str) {
            return (ScreenType) Enum.valueOf(ScreenType.class, str);
        }

        public static ScreenType[] values() {
            return (ScreenType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new y570(14)), kotlin.a.b(lazyThreadSafetyMode, new y570(15))};
    }

    public /* synthetic */ OpenSupportParam(int i, String str, String str2, Map map, ScreenType screenType) {
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
            this.c = map;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = screenType;
        }
    }

    public OpenSupportParam() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
