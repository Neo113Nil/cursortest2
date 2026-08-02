package ru.yandex.taxi.common_models.net.map_object;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.rm6;
import defpackage.sm6;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/BubbleFontStyle;", "", "", "value", CA20Status.STATUS_USER_I, "b", "()I", "Companion", "sm6", "NORMAL", "BOLD", "ITALIC", "DEFAULT", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BubbleFontStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BubbleFontStyle[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final BubbleFontStyle BOLD;
    public static final sm6 Companion;
    public static final BubbleFontStyle DEFAULT;
    public static final BubbleFontStyle ITALIC;
    public static final BubbleFontStyle NORMAL;
    private final int value;

    static {
        BubbleFontStyle bubbleFontStyle = new BubbleFontStyle("NORMAL", 0, 0);
        NORMAL = bubbleFontStyle;
        BubbleFontStyle bubbleFontStyle2 = new BubbleFontStyle("BOLD", 1, 1);
        BOLD = bubbleFontStyle2;
        BubbleFontStyle bubbleFontStyle3 = new BubbleFontStyle("ITALIC", 2, 2);
        ITALIC = bubbleFontStyle3;
        BubbleFontStyle bubbleFontStyle4 = new BubbleFontStyle("DEFAULT", 3, 0);
        DEFAULT = bubbleFontStyle4;
        BubbleFontStyle[] bubbleFontStyleArr = {bubbleFontStyle, bubbleFontStyle2, bubbleFontStyle3, bubbleFontStyle4};
        $VALUES = bubbleFontStyleArr;
        $ENTRIES = kotlin.enums.a.a(bubbleFontStyleArr);
        Companion = new sm6();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rm6(0));
    }

    public BubbleFontStyle(String str, int i, int i2) {
        this.value = i2;
    }

    public static BubbleFontStyle valueOf(String str) {
        return (BubbleFontStyle) Enum.valueOf(BubbleFontStyle.class, str);
    }

    public static BubbleFontStyle[] values() {
        return (BubbleFontStyle[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
