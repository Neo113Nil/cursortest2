package ru.yandex.taxi.common_models.net.map_object;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.pn0;
import defpackage.sr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/AddressConfirmationButton;", "", "Companion", "ButtonStyle", "ru/yandex/taxi/common_models/net/map_object/e", "sr0", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddressConfirmationButton {
    public static final sr0 Companion = new sr0();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pn0(3))};
    public final FormattedText a;
    public final ButtonStyle b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/AddressConfirmationButton$ButtonStyle;", "", "Companion", "ru/yandex/taxi/common_models/net/map_object/f", "MAIN", "MINOR", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ButtonStyle {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ButtonStyle[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final f Companion;
        public static final ButtonStyle MAIN;
        public static final ButtonStyle MINOR;

        static {
            ButtonStyle buttonStyle = new ButtonStyle("MAIN", 0);
            MAIN = buttonStyle;
            ButtonStyle buttonStyle2 = new ButtonStyle("MINOR", 1);
            MINOR = buttonStyle2;
            ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2};
            $VALUES = buttonStyleArr;
            $ENTRIES = kotlin.enums.a.a(buttonStyleArr);
            Companion = new f();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pn0(4));
        }

        public static ButtonStyle valueOf(String str) {
            return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
        }

        public static ButtonStyle[] values() {
            return (ButtonStyle[]) $VALUES.clone();
        }
    }

    public /* synthetic */ AddressConfirmationButton(int i, FormattedText formattedText, ButtonStyle buttonStyle) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = ButtonStyle.MAIN;
        } else {
            this.b = buttonStyle;
        }
    }

    public AddressConfirmationButton() {
        this(0);
    }

    public AddressConfirmationButton(int i) {
        FormattedText formattedText = FormattedText.c;
        ButtonStyle buttonStyle = ButtonStyle.MAIN;
        this.a = formattedText;
        this.b = buttonStyle;
    }
}
