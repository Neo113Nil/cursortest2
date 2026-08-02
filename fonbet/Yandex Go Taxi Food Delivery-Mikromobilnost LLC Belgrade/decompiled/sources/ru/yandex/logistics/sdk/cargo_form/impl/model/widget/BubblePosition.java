package ru.yandex.logistics.sdk.cargo_form.impl.model.widget;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/impl/model/widget/BubblePosition;", "", "TOP_LEFT", "TOP_RIGHT", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BubblePosition {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BubblePosition[] $VALUES;
    public static final BubblePosition TOP_LEFT;
    public static final BubblePosition TOP_RIGHT;

    static {
        BubblePosition bubblePosition = new BubblePosition("TOP_LEFT", 0);
        TOP_LEFT = bubblePosition;
        BubblePosition bubblePosition2 = new BubblePosition("TOP_RIGHT", 1);
        TOP_RIGHT = bubblePosition2;
        BubblePosition[] bubblePositionArr = {bubblePosition, bubblePosition2};
        $VALUES = bubblePositionArr;
        $ENTRIES = a.a(bubblePositionArr);
    }

    public static BubblePosition valueOf(String str) {
        return (BubblePosition) Enum.valueOf(BubblePosition.class, str);
    }

    public static BubblePosition[] values() {
        return (BubblePosition[]) $VALUES.clone();
    }
}
