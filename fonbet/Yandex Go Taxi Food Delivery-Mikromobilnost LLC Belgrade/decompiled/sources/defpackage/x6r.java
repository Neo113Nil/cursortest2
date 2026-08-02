package defpackage;

import ru.yandex.taxi.persuggest.repository.models.FinalSuggestScreen;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class x6r {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FinalSuggestScreen.values().length];
        try {
            iArr[FinalSuggestScreen.ADDRESSES_EDIT_SUFFIX.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FinalSuggestScreen.ADDRESSES_SUFFIX.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
