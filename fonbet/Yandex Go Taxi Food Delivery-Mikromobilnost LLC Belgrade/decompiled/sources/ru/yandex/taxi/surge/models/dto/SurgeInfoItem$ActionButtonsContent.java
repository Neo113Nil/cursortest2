package ru.yandex.taxi.surge.models.dto;

import defpackage.arw0;
import defpackage.bhw0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/surge/models/dto/SurgeInfoItem$ActionButtonsContent", "", "Companion", "a", "ButtonsOrientation", "ru/yandex/taxi/surge/models/dto/t0", "arw0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SurgeInfoItem$ActionButtonsContent {
    public static final arw0 Companion = new arw0();
    public static final i3y[] c;
    public final ButtonsOrientation a;
    public final List b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/surge/models/dto/SurgeInfoItem$ActionButtonsContent$ButtonsOrientation;", "", "Companion", "ru/yandex/taxi/surge/models/dto/w0", "VERTICAL", "HORIZONTAL", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ButtonsOrientation {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ButtonsOrientation[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final w0 Companion;
        public static final ButtonsOrientation HORIZONTAL;
        public static final ButtonsOrientation VERTICAL;

        static {
            ButtonsOrientation buttonsOrientation = new ButtonsOrientation("VERTICAL", 0);
            VERTICAL = buttonsOrientation;
            ButtonsOrientation buttonsOrientation2 = new ButtonsOrientation("HORIZONTAL", 1);
            HORIZONTAL = buttonsOrientation2;
            ButtonsOrientation[] buttonsOrientationArr = {buttonsOrientation, buttonsOrientation2};
            $VALUES = buttonsOrientationArr;
            $ENTRIES = kotlin.enums.a.a(buttonsOrientationArr);
            Companion = new w0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bhw0(18));
        }

        public static ButtonsOrientation valueOf(String str) {
            return (ButtonsOrientation) Enum.valueOf(ButtonsOrientation.class, str);
        }

        public static ButtonsOrientation[] values() {
            return (ButtonsOrientation[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new bhw0(15)), kotlin.a.b(lazyThreadSafetyMode, new bhw0(16))};
    }

    public /* synthetic */ SurgeInfoItem$ActionButtonsContent(int i, ButtonsOrientation buttonsOrientation, List list) {
        this.a = (i & 1) == 0 ? ButtonsOrientation.VERTICAL : buttonsOrientation;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public SurgeInfoItem$ActionButtonsContent() {
        this(0);
    }

    public SurgeInfoItem$ActionButtonsContent(int i) {
        this.a = ButtonsOrientation.VERTICAL;
        this.b = EmptyList.a;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/surge/models/dto/SurgeInfoItem$ActionButtonsContent$a;", "", "Companion", "ru/yandex/taxi/surge/models/dto/u0", "ru/yandex/taxi/surge/models/dto/v0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final v0 Companion = new v0();
        public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bhw0(17)), null, null};
        public final String a;
        public final SurgeButtonActionDto$ActionButtonStyle b;
        public final h0 c;
        public final String d;

        public /* synthetic */ a(int i, String str, SurgeButtonActionDto$ActionButtonStyle surgeButtonActionDto$ActionButtonStyle, h0 h0Var, String str2) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = SurgeButtonActionDto$ActionButtonStyle.DEFAULT;
            } else {
                this.b = surgeButtonActionDto$ActionButtonStyle;
            }
            if ((i & 4) == 0) {
                this.c = g0.INSTANCE;
            } else {
                this.c = h0Var;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str2;
            }
        }

        public a() {
            SurgeButtonActionDto$ActionButtonStyle surgeButtonActionDto$ActionButtonStyle = SurgeButtonActionDto$ActionButtonStyle.DEFAULT;
            g0 g0Var = g0.INSTANCE;
            this.a = "";
            this.b = surgeButtonActionDto$ActionButtonStyle;
            this.c = g0Var;
            this.d = null;
        }
    }
}
