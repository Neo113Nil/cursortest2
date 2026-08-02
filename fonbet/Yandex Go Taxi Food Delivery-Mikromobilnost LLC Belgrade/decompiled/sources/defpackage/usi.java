package defpackage;

import com.yandex.delivery.mapper.model.Expansion;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class usi {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Expansion.values().length];
        try {
            iArr[Expansion.EXPANDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Expansion.ANCHORED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
