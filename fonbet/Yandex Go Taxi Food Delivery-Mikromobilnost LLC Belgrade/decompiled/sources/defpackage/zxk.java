package defpackage;

import com.yandex.div.core.images.BitmapSource;
import com.yandex.images.ImageManager$From;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class zxk {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ImageManager$From.values().length];
        try {
            iArr[ImageManager$From.DISK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ImageManager$From.MEMORY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[BitmapSource.values().length];
        try {
            iArr2[BitmapSource.DISK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[BitmapSource.MEMORY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
