package ru.yandex.taxi.logistics.sdk.dashboard.model.common;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dashboard/model/common/ImagePositionModel;", "", "TOP", "TRAIL", "base"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ImagePositionModel {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ImagePositionModel[] $VALUES;
    public static final ImagePositionModel TOP;
    public static final ImagePositionModel TRAIL;

    static {
        ImagePositionModel imagePositionModel = new ImagePositionModel("TOP", 0);
        TOP = imagePositionModel;
        ImagePositionModel imagePositionModel2 = new ImagePositionModel("TRAIL", 1);
        TRAIL = imagePositionModel2;
        ImagePositionModel[] imagePositionModelArr = {imagePositionModel, imagePositionModel2};
        $VALUES = imagePositionModelArr;
        $ENTRIES = a.a(imagePositionModelArr);
    }

    public static ImagePositionModel valueOf(String str) {
        return (ImagePositionModel) Enum.valueOf(ImagePositionModel.class, str);
    }

    public static ImagePositionModel[] values() {
        return (ImagePositionModel[]) $VALUES.clone();
    }
}
