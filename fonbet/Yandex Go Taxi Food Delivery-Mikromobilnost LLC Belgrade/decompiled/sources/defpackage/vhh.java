package defpackage;

import com.yandex.plus.plaquesdk.plaque.api.models.FormattedText$FontStyle;
import com.yandex.plus.plaquesdk.plaque.api.models.FormattedText$FontWeight;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class vhh {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[FormattedText$FontStyle.values().length];
        try {
            iArr[FormattedText$FontStyle.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FormattedText$FontStyle.ITALIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[FormattedText$FontWeight.values().length];
        try {
            iArr2[FormattedText$FontWeight.THIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[FormattedText$FontWeight.EXTRA_LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[FormattedText$FontWeight.LIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[FormattedText$FontWeight.REGULAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[FormattedText$FontWeight.MEDIUM.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[FormattedText$FontWeight.BOLD.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[FormattedText$FontWeight.SEMI_BOLD.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[FormattedText$FontWeight.EXTRA_BOLD.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[FormattedText$FontWeight.HEAVY.ordinal()] = 9;
        } catch (NoSuchFieldError unused11) {
        }
        b = iArr2;
    }
}
