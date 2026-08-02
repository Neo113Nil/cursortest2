package ru.yandex.taxi.logistics.sdk.photocomments.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/logistics/sdk/photocomments/api/PhotocommentsSource;", "", "CAMERA", "GALLERY", "SOURCE_CHOOSER", "sdk-photocomments"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PhotocommentsSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PhotocommentsSource[] $VALUES;
    public static final PhotocommentsSource CAMERA;
    public static final PhotocommentsSource GALLERY;
    public static final PhotocommentsSource SOURCE_CHOOSER;

    static {
        PhotocommentsSource photocommentsSource = new PhotocommentsSource("CAMERA", 0);
        CAMERA = photocommentsSource;
        PhotocommentsSource photocommentsSource2 = new PhotocommentsSource("GALLERY", 1);
        GALLERY = photocommentsSource2;
        PhotocommentsSource photocommentsSource3 = new PhotocommentsSource("SOURCE_CHOOSER", 2);
        SOURCE_CHOOSER = photocommentsSource3;
        PhotocommentsSource[] photocommentsSourceArr = {photocommentsSource, photocommentsSource2, photocommentsSource3};
        $VALUES = photocommentsSourceArr;
        $ENTRIES = a.a(photocommentsSourceArr);
    }

    public static PhotocommentsSource valueOf(String str) {
        return (PhotocommentsSource) Enum.valueOf(PhotocommentsSource.class, str);
    }

    public static PhotocommentsSource[] values() {
        return (PhotocommentsSource[]) $VALUES.clone();
    }
}
