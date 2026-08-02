package ru.yandex.taxi.stories.presentation.preview;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/stories/presentation/preview/StoriesPreviewsListViewType;", "", "LINEAR", "GRID_TWO_COLUMN", "stories"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StoriesPreviewsListViewType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StoriesPreviewsListViewType[] $VALUES;
    public static final StoriesPreviewsListViewType GRID_TWO_COLUMN;
    public static final StoriesPreviewsListViewType LINEAR;

    static {
        StoriesPreviewsListViewType storiesPreviewsListViewType = new StoriesPreviewsListViewType("LINEAR", 0);
        LINEAR = storiesPreviewsListViewType;
        StoriesPreviewsListViewType storiesPreviewsListViewType2 = new StoriesPreviewsListViewType("GRID_TWO_COLUMN", 1);
        GRID_TWO_COLUMN = storiesPreviewsListViewType2;
        StoriesPreviewsListViewType[] storiesPreviewsListViewTypeArr = {storiesPreviewsListViewType, storiesPreviewsListViewType2};
        $VALUES = storiesPreviewsListViewTypeArr;
        $ENTRIES = kotlin.enums.a.a(storiesPreviewsListViewTypeArr);
    }

    public static StoriesPreviewsListViewType valueOf(String str) {
        return (StoriesPreviewsListViewType) Enum.valueOf(StoriesPreviewsListViewType.class, str);
    }

    public static StoriesPreviewsListViewType[] values() {
        return (StoriesPreviewsListViewType[]) $VALUES.clone();
    }
}
