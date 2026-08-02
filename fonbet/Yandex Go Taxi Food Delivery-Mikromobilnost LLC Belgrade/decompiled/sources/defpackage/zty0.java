package defpackage;

import com.yandex.messaging.extension.view.IconDirection;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class zty0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[IconDirection.values().length];
        try {
            iArr[IconDirection.Start.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IconDirection.End.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
