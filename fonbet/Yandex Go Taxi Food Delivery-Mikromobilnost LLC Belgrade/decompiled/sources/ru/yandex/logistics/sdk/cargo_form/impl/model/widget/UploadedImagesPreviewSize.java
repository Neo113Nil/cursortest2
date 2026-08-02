package ru.yandex.logistics.sdk.cargo_form.impl.model.widget;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/impl/model/widget/UploadedImagesPreviewSize;", "", "M", "L", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UploadedImagesPreviewSize {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UploadedImagesPreviewSize[] $VALUES;
    public static final UploadedImagesPreviewSize L;
    public static final UploadedImagesPreviewSize M;

    static {
        UploadedImagesPreviewSize uploadedImagesPreviewSize = new UploadedImagesPreviewSize("M", 0);
        M = uploadedImagesPreviewSize;
        UploadedImagesPreviewSize uploadedImagesPreviewSize2 = new UploadedImagesPreviewSize("L", 1);
        L = uploadedImagesPreviewSize2;
        UploadedImagesPreviewSize[] uploadedImagesPreviewSizeArr = {uploadedImagesPreviewSize, uploadedImagesPreviewSize2};
        $VALUES = uploadedImagesPreviewSizeArr;
        $ENTRIES = a.a(uploadedImagesPreviewSizeArr);
    }

    public static UploadedImagesPreviewSize valueOf(String str) {
        return (UploadedImagesPreviewSize) Enum.valueOf(UploadedImagesPreviewSize.class, str);
    }

    public static UploadedImagesPreviewSize[] values() {
        return (UploadedImagesPreviewSize[]) $VALUES.clone();
    }
}
