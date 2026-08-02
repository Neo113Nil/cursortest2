package ru.yandex.taxi.logistics.sdk.photocomments.data;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/logistics/sdk/photocomments/data/PhotoModel$Type", "", "Lru/yandex/taxi/logistics/sdk/photocomments/data/PhotoModel$Type;", "REMOTE", "LOCAL", "sdk-photocomments"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PhotoModel$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PhotoModel$Type[] $VALUES;
    public static final PhotoModel$Type LOCAL;
    public static final PhotoModel$Type REMOTE;

    static {
        PhotoModel$Type photoModel$Type = new PhotoModel$Type("REMOTE", 0);
        REMOTE = photoModel$Type;
        PhotoModel$Type photoModel$Type2 = new PhotoModel$Type("LOCAL", 1);
        LOCAL = photoModel$Type2;
        PhotoModel$Type[] photoModel$TypeArr = {photoModel$Type, photoModel$Type2};
        $VALUES = photoModel$TypeArr;
        $ENTRIES = a.a(photoModel$TypeArr);
    }

    public static PhotoModel$Type valueOf(String str) {
        return (PhotoModel$Type) Enum.valueOf(PhotoModel$Type.class, str);
    }

    public static PhotoModel$Type[] values() {
        return (PhotoModel$Type[]) $VALUES.clone();
    }
}
