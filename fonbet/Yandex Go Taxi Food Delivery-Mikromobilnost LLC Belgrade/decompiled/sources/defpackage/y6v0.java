package defpackage;

import ru.yandex.taxi.analytics.Events$SuggestMenu$ActionType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class y6v0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Events$SuggestMenu$ActionType.values().length];
        try {
            iArr[Events$SuggestMenu$ActionType.SAVE_TO_FAVORITES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Events$SuggestMenu$ActionType.SELECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Events$SuggestMenu$ActionType.SELECT_ON_MAP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Events$SuggestMenu$ActionType.CHANGE_ADDRESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Events$SuggestMenu$ActionType.SHARE_ADDRESS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
