package defpackage;

import com.yandex.go.preorder.source.altpins.Alternatives;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class xax0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Alternatives.OptionTypeLegacy.values().length];
        try {
            iArr[Alternatives.OptionTypeLegacy.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Alternatives.OptionTypeLegacy.MULTICLASS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Alternatives.OptionTypeLegacy.MULTIMODAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Alternatives.OptionTypeLegacy.ALTPIN_B.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Alternatives.OptionTypeLegacy.PLUS_PROMO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Alternatives.OptionTypeLegacy.REQUIREMENT_OPTION.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[Alternatives.OptionTypeLegacy.ANTISURGE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[Alternatives.OptionTypeLegacy.PERFECT_CHAIN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[Alternatives.OptionTypeLegacy.COMBO_INNER.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[Alternatives.OptionTypeLegacy.COMBO_OUTER.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        a = iArr;
    }
}
