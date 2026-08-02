package ru.yandex.taxi.logistics.sdk.photocomments;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/logistics/sdk/photocomments/PhotocommentsMode;", "", "IMMUTABLE", "MUTABLE", "sdk-photocomments"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PhotocommentsMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PhotocommentsMode[] $VALUES;
    public static final PhotocommentsMode IMMUTABLE;
    public static final PhotocommentsMode MUTABLE;

    static {
        PhotocommentsMode photocommentsMode = new PhotocommentsMode("IMMUTABLE", 0);
        IMMUTABLE = photocommentsMode;
        PhotocommentsMode photocommentsMode2 = new PhotocommentsMode("MUTABLE", 1);
        MUTABLE = photocommentsMode2;
        PhotocommentsMode[] photocommentsModeArr = {photocommentsMode, photocommentsMode2};
        $VALUES = photocommentsModeArr;
        $ENTRIES = kotlin.enums.a.a(photocommentsModeArr);
    }

    public static PhotocommentsMode valueOf(String str) {
        return (PhotocommentsMode) Enum.valueOf(PhotocommentsMode.class, str);
    }

    public static PhotocommentsMode[] values() {
        return (PhotocommentsMode[]) $VALUES.clone();
    }
}
