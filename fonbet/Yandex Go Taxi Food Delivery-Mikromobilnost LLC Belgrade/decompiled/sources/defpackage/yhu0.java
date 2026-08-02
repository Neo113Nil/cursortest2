package defpackage;

import ru.yandex.sdk.common.StopWordRule$RuleType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class yhu0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[StopWordRule$RuleType.values().length];
        try {
            iArr[StopWordRule$RuleType.PREFIX.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StopWordRule$RuleType.SUBSTRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StopWordRule$RuleType.WORD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
