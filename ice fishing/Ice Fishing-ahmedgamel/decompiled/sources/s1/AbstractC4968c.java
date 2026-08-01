package s1;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;

/* renamed from: s1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4968c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f40450a;

    static {
        int[] iArr = new int[ImageHeaderParser$ImageType.values().length];
        f40450a = iArr;
        try {
            iArr[ImageHeaderParser$ImageType.WEBP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f40450a[ImageHeaderParser$ImageType.WEBP_A.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f40450a[ImageHeaderParser$ImageType.ANIMATED_WEBP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
