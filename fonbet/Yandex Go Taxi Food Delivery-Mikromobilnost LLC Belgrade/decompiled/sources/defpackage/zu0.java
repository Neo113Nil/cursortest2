package defpackage;

import com.yandex.mapkit.search.SuggestItem;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class zu0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SuggestItem.Action.values().length];
        try {
            iArr[SuggestItem.Action.SEARCH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SuggestItem.Action.SUBSTITUTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
