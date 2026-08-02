package defpackage;

import com.yandex.go.tariffcard.experiment.GradientTypeDto;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class wiv0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GradientTypeDto.values().length];
        try {
            iArr[GradientTypeDto.CUSTOM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GradientTypeDto.CLEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
