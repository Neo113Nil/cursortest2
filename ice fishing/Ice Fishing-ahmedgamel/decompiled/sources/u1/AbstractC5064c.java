package u1;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;

/* renamed from: u1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC5064c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f41004a;

    static {
        int[] iArr = new int[ImageHeaderParser$ImageType.values().length];
        f41004a = iArr;
        try {
            iArr[ImageHeaderParser$ImageType.WEBP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f41004a[ImageHeaderParser$ImageType.WEBP_A.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f41004a[ImageHeaderParser$ImageType.ANIMATED_WEBP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
