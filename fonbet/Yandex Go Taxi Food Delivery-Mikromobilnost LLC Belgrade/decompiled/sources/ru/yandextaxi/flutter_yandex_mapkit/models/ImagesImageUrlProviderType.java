package ru.yandextaxi.flutter_yandex_mapkit.models;

import defpackage.k4o;
import defpackage.ysq0;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/models/ImagesImageUrlProviderType;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGES_DEFAULT_URL_PROVIDER", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImagesImageUrlProviderType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ImagesImageUrlProviderType[] $VALUES;

    @ysq0("imagesDefaultUrlProvider")
    public static final ImagesImageUrlProviderType IMAGES_DEFAULT_URL_PROVIDER;

    static {
        ImagesImageUrlProviderType imagesImageUrlProviderType = new ImagesImageUrlProviderType("IMAGES_DEFAULT_URL_PROVIDER", 0);
        IMAGES_DEFAULT_URL_PROVIDER = imagesImageUrlProviderType;
        ImagesImageUrlProviderType[] imagesImageUrlProviderTypeArr = {imagesImageUrlProviderType};
        $VALUES = imagesImageUrlProviderTypeArr;
        $ENTRIES = a.a(imagesImageUrlProviderTypeArr);
    }

    private ImagesImageUrlProviderType(String str, int i) {
    }

    public static ImagesImageUrlProviderType valueOf(String str) {
        return (ImagesImageUrlProviderType) Enum.valueOf(ImagesImageUrlProviderType.class, str);
    }

    public static ImagesImageUrlProviderType[] values() {
        return (ImagesImageUrlProviderType[]) $VALUES.clone();
    }
}
