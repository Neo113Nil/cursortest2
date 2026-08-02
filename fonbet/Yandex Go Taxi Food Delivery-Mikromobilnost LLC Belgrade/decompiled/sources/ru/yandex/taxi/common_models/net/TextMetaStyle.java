package ru.yandex.taxi.common_models.net;

import defpackage.gjx0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.mry0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/common_models/net/TextMetaStyle;", "", "Companion", "mry0", "HeadlineHeader", "HeadlineTitle1", "HeadlineTitle2", "HeadlineTitle3", "HeadlineTitle4", "HeadlineTitle5", "CondensedHeader", "CondensedTitle1", "CondensedTitle2", "CondensedTitle3", "CondensedTitle4", "CondensedTitle5", "go-client-android.libs.formatted_text:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TextMetaStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TextMetaStyle[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final mry0 Companion;
    public static final TextMetaStyle CondensedHeader;
    public static final TextMetaStyle CondensedTitle1;
    public static final TextMetaStyle CondensedTitle2;
    public static final TextMetaStyle CondensedTitle3;
    public static final TextMetaStyle CondensedTitle4;
    public static final TextMetaStyle CondensedTitle5;
    public static final TextMetaStyle HeadlineHeader;
    public static final TextMetaStyle HeadlineTitle1;
    public static final TextMetaStyle HeadlineTitle2;
    public static final TextMetaStyle HeadlineTitle3;
    public static final TextMetaStyle HeadlineTitle4;
    public static final TextMetaStyle HeadlineTitle5;

    static {
        TextMetaStyle textMetaStyle = new TextMetaStyle("HeadlineHeader", 0);
        HeadlineHeader = textMetaStyle;
        TextMetaStyle textMetaStyle2 = new TextMetaStyle("HeadlineTitle1", 1);
        HeadlineTitle1 = textMetaStyle2;
        TextMetaStyle textMetaStyle3 = new TextMetaStyle("HeadlineTitle2", 2);
        HeadlineTitle2 = textMetaStyle3;
        TextMetaStyle textMetaStyle4 = new TextMetaStyle("HeadlineTitle3", 3);
        HeadlineTitle3 = textMetaStyle4;
        TextMetaStyle textMetaStyle5 = new TextMetaStyle("HeadlineTitle4", 4);
        HeadlineTitle4 = textMetaStyle5;
        TextMetaStyle textMetaStyle6 = new TextMetaStyle("HeadlineTitle5", 5);
        HeadlineTitle5 = textMetaStyle6;
        TextMetaStyle textMetaStyle7 = new TextMetaStyle("CondensedHeader", 6);
        CondensedHeader = textMetaStyle7;
        TextMetaStyle textMetaStyle8 = new TextMetaStyle("CondensedTitle1", 7);
        CondensedTitle1 = textMetaStyle8;
        TextMetaStyle textMetaStyle9 = new TextMetaStyle("CondensedTitle2", 8);
        CondensedTitle2 = textMetaStyle9;
        TextMetaStyle textMetaStyle10 = new TextMetaStyle("CondensedTitle3", 9);
        CondensedTitle3 = textMetaStyle10;
        TextMetaStyle textMetaStyle11 = new TextMetaStyle("CondensedTitle4", 10);
        CondensedTitle4 = textMetaStyle11;
        TextMetaStyle textMetaStyle12 = new TextMetaStyle("CondensedTitle5", 11);
        CondensedTitle5 = textMetaStyle12;
        TextMetaStyle[] textMetaStyleArr = {textMetaStyle, textMetaStyle2, textMetaStyle3, textMetaStyle4, textMetaStyle5, textMetaStyle6, textMetaStyle7, textMetaStyle8, textMetaStyle9, textMetaStyle10, textMetaStyle11, textMetaStyle12};
        $VALUES = textMetaStyleArr;
        $ENTRIES = kotlin.enums.a.a(textMetaStyleArr);
        Companion = new mry0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gjx0(21));
    }

    public static TextMetaStyle valueOf(String str) {
        return (TextMetaStyle) Enum.valueOf(TextMetaStyle.class, str);
    }

    public static TextMetaStyle[] values() {
        return (TextMetaStyle[]) $VALUES.clone();
    }
}
