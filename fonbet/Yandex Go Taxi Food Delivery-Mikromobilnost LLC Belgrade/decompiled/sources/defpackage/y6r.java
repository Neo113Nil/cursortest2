package defpackage;

import ru.yandex.taxi.persuggest.repository.models.FinalSuggestScreen;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class y6r {
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
        try {
            iArr[FinalSuggestScreen.DEEPLINK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FinalSuggestScreen.UNSUPPORTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
