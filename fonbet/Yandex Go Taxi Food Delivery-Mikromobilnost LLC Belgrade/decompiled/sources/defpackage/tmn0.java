package defpackage;

import ru.yandex.taxi.scooters.experiments.FinishCard;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class tmn0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FinishCard.Section.values().length];
        try {
            iArr[FinishCard.Section.FEEDBACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FinishCard.Section.INFO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FinishCard.Section.SHORTCUTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FinishCard.Section.STATISTICS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
