package defpackage;

import com.yandex.mapkit.navigation.balloons.HorizontalPosition;
import com.yandex.mapkit.navigation.balloons.VerticalPosition;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class wo4 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[HorizontalPosition.values().length];
        try {
            iArr[HorizontalPosition.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HorizontalPosition.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[HorizontalPosition.RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[VerticalPosition.values().length];
        try {
            iArr2[VerticalPosition.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[VerticalPosition.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[VerticalPosition.BOTTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
