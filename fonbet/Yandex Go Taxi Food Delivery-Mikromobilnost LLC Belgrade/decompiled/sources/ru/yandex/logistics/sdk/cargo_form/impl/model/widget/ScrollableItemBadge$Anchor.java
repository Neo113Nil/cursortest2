package ru.yandex.logistics.sdk.cargo_form.impl.model.widget;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/logistics/sdk/cargo_form/impl/model/widget/ScrollableItemBadge$Anchor", "", "Lru/yandex/logistics/sdk/cargo_form/impl/model/widget/ScrollableItemBadge$Anchor;", "TRAILING", "LEADING", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ScrollableItemBadge$Anchor {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScrollableItemBadge$Anchor[] $VALUES;
    public static final ScrollableItemBadge$Anchor LEADING;
    public static final ScrollableItemBadge$Anchor TRAILING;

    static {
        ScrollableItemBadge$Anchor scrollableItemBadge$Anchor = new ScrollableItemBadge$Anchor("TRAILING", 0);
        TRAILING = scrollableItemBadge$Anchor;
        ScrollableItemBadge$Anchor scrollableItemBadge$Anchor2 = new ScrollableItemBadge$Anchor("LEADING", 1);
        LEADING = scrollableItemBadge$Anchor2;
        ScrollableItemBadge$Anchor[] scrollableItemBadge$AnchorArr = {scrollableItemBadge$Anchor, scrollableItemBadge$Anchor2};
        $VALUES = scrollableItemBadge$AnchorArr;
        $ENTRIES = a.a(scrollableItemBadge$AnchorArr);
    }

    public static ScrollableItemBadge$Anchor valueOf(String str) {
        return (ScrollableItemBadge$Anchor) Enum.valueOf(ScrollableItemBadge$Anchor.class, str);
    }

    public static ScrollableItemBadge$Anchor[] values() {
        return (ScrollableItemBadge$Anchor[]) $VALUES.clone();
    }
}
