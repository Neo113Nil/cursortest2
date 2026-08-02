package defpackage;

import com.yandex.go.shortcuts.impl.interactors.FallbackShortcutModelFactory$FallbackType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class t9p {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FallbackShortcutModelFactory$FallbackType.values().length];
        try {
            iArr[FallbackShortcutModelFactory$FallbackType.ROUTE_ONLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FallbackShortcutModelFactory$FallbackType.ROUTE_WITH_SKELETON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
