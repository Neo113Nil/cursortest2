package defpackage;

import ru.yandex.taxi.shortcuts.dto.response.superapp.ShimmeringStyle;
import ru.yandex.taxi.shortcuts.dto.response.superapp.StickersStyle;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class vwq0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ShimmeringStyle.values().length];
        try {
            iArr[ShimmeringStyle.Eats.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ShimmeringStyle.Market.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ShimmeringStyle.Grocery.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ShimmeringStyle.Web.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ShimmeringStyle.Unknown.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[StickersStyle.values().length];
        try {
            iArr2[StickersStyle.Eats.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[StickersStyle.Grocery.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[StickersStyle.Unknown.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
