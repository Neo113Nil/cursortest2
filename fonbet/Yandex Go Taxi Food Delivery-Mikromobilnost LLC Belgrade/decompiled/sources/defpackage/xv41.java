package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.OutMessage$UpdateTargetsState$Target;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class xv41 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OutMessage$UpdateTargetsState$Target.values().length];
        try {
            iArr[OutMessage$UpdateTargetsState$Target.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OutMessage$UpdateTargetsState$Target.PLUS_POINTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OutMessage$UpdateTargetsState$Target.PAYMENT_CONFIGURATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[OutMessage$UpdateTargetsState$Target.TREASURY_STATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[OutMessage$UpdateTargetsState$Target.FAMILY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[OutMessage$UpdateTargetsState$Target.PLAQUE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[OutMessage$UpdateTargetsState$Target.DAILY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[OutMessage$UpdateTargetsState$Target.APPWIDGET_DAILY.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        a = iArr;
    }
}
