package defpackage;

import com.yandex.go.design.compose.slot.body.BodyAlign;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class x76 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BodyAlign.values().length];
        try {
            iArr[BodyAlign.Start.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BodyAlign.Center.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BodyAlign.End.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
