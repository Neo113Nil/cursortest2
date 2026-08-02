package defpackage;

import com.yandex.div.legacy.Alignment;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class t801 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Alignment.values().length];
        a = iArr;
        try {
            iArr[Alignment.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[Alignment.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[Alignment.RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
