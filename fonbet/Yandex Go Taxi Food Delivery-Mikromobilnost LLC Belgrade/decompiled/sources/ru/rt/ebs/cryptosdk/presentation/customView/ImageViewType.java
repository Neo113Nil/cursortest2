package ru.rt.ebs.cryptosdk.presentation.customView;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002¨\u0006\u0003"}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/customView/ImageViewType;", "", "SUCCESSFUL_VERIFICATION_WIDGET", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class ImageViewType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ImageViewType[] $VALUES;
    public static final ImageViewType SUCCESSFUL_VERIFICATION_WIDGET;

    static {
        ImageViewType imageViewType = new ImageViewType("SUCCESSFUL_VERIFICATION_WIDGET", 0);
        SUCCESSFUL_VERIFICATION_WIDGET = imageViewType;
        ImageViewType[] imageViewTypeArr = {imageViewType};
        $VALUES = imageViewTypeArr;
        $ENTRIES = kotlin.enums.a.a(imageViewTypeArr);
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static ImageViewType valueOf(String str) {
        return (ImageViewType) Enum.valueOf(ImageViewType.class, str);
    }

    public static ImageViewType[] values() {
        return (ImageViewType[]) $VALUES.clone();
    }
}
