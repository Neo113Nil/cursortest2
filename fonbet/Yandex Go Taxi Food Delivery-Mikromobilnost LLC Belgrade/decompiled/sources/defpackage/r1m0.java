package defpackage;

import com.yandex.go.shortcuts.factory.SavedPlaceFactory$CreationCacheStrategy;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class r1m0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SavedPlaceFactory$CreationCacheStrategy.values().length];
        try {
            iArr[SavedPlaceFactory$CreationCacheStrategy.WITHOUT_CACHE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SavedPlaceFactory$CreationCacheStrategy.FROM_CACHE_IF_POSSIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SavedPlaceFactory$CreationCacheStrategy.ONLY_FROM_CACHE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
