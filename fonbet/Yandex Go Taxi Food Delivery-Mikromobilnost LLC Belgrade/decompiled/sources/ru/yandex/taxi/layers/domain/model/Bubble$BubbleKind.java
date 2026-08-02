package ru.yandex.taxi.layers.domain.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/layers/domain/model/Bubble$BubbleKind", "", "Lru/yandex/taxi/layers/domain/model/Bubble$BubbleKind;", "ADVERT", "NORMAL", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Bubble$BubbleKind {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Bubble$BubbleKind[] $VALUES;
    public static final Bubble$BubbleKind ADVERT;
    public static final Bubble$BubbleKind NORMAL;

    static {
        Bubble$BubbleKind bubble$BubbleKind = new Bubble$BubbleKind("ADVERT", 0);
        ADVERT = bubble$BubbleKind;
        Bubble$BubbleKind bubble$BubbleKind2 = new Bubble$BubbleKind("NORMAL", 1);
        NORMAL = bubble$BubbleKind2;
        Bubble$BubbleKind[] bubble$BubbleKindArr = {bubble$BubbleKind, bubble$BubbleKind2};
        $VALUES = bubble$BubbleKindArr;
        $ENTRIES = kotlin.enums.a.a(bubble$BubbleKindArr);
    }

    public static Bubble$BubbleKind valueOf(String str) {
        return (Bubble$BubbleKind) Enum.valueOf(Bubble$BubbleKind.class, str);
    }

    public static Bubble$BubbleKind[] values() {
        return (Bubble$BubbleKind[]) $VALUES.clone();
    }
}
