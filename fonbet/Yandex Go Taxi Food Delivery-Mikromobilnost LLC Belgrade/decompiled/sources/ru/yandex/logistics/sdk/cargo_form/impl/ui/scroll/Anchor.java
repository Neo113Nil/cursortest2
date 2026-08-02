package ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/impl/ui/scroll/Anchor;", "", "TOP", "BOTTOM", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Anchor {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Anchor[] $VALUES;
    public static final Anchor BOTTOM;
    public static final Anchor TOP;

    static {
        Anchor anchor = new Anchor("TOP", 0);
        TOP = anchor;
        Anchor anchor2 = new Anchor("BOTTOM", 1);
        BOTTOM = anchor2;
        Anchor[] anchorArr = {anchor, anchor2};
        $VALUES = anchorArr;
        $ENTRIES = kotlin.enums.a.a(anchorArr);
    }

    public static Anchor valueOf(String str) {
        return (Anchor) Enum.valueOf(Anchor.class, str);
    }

    public static Anchor[] values() {
        return (Anchor[]) $VALUES.clone();
    }
}
