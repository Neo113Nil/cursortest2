package defpackage;

import com.yandex.plus.home.plaque.plugin.api.typeface.PlusPlaqueFontStyle;
import com.yandex.plus.home.plaque.plugin.api.typeface.PlusPlaqueFontWeight;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class yhd0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PlusPlaqueFontWeight.values().length];
        try {
            iArr[PlusPlaqueFontWeight.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusPlaqueFontWeight.REGULAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlusPlaqueFontWeight.MEDIUM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PlusPlaqueFontWeight.BOLD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PlusPlaqueFontWeight.HEAVY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[PlusPlaqueFontStyle.values().length];
        try {
            iArr2[PlusPlaqueFontStyle.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[PlusPlaqueFontStyle.ITALIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
