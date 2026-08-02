package ru.yandex.taxi.web.view;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/web/view/WebProgressViewHolder$LayoutType", "", "Lru/yandex/taxi/web/view/WebProgressViewHolder$LayoutType;", "WRAP_CONTENT", "FULLSCREEN", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WebProgressViewHolder$LayoutType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WebProgressViewHolder$LayoutType[] $VALUES;
    public static final WebProgressViewHolder$LayoutType FULLSCREEN;
    public static final WebProgressViewHolder$LayoutType WRAP_CONTENT;

    static {
        WebProgressViewHolder$LayoutType webProgressViewHolder$LayoutType = new WebProgressViewHolder$LayoutType("WRAP_CONTENT", 0);
        WRAP_CONTENT = webProgressViewHolder$LayoutType;
        WebProgressViewHolder$LayoutType webProgressViewHolder$LayoutType2 = new WebProgressViewHolder$LayoutType("FULLSCREEN", 1);
        FULLSCREEN = webProgressViewHolder$LayoutType2;
        WebProgressViewHolder$LayoutType[] webProgressViewHolder$LayoutTypeArr = {webProgressViewHolder$LayoutType, webProgressViewHolder$LayoutType2};
        $VALUES = webProgressViewHolder$LayoutTypeArr;
        $ENTRIES = kotlin.enums.a.a(webProgressViewHolder$LayoutTypeArr);
    }

    public static WebProgressViewHolder$LayoutType valueOf(String str) {
        return (WebProgressViewHolder$LayoutType) Enum.valueOf(WebProgressViewHolder$LayoutType.class, str);
    }

    public static WebProgressViewHolder$LayoutType[] values() {
        return (WebProgressViewHolder$LayoutType[]) $VALUES.clone();
    }
}
