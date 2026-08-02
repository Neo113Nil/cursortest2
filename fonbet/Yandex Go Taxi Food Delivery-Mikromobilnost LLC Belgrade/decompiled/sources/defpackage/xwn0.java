package defpackage;

import com.yandex.go.scooters.live.domain.model.ScootersLiveAction;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class xwn0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ScootersLiveAction.BackgroundColor.values().length];
        try {
            iArr[ScootersLiveAction.BackgroundColor.ACCENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersLiveAction.BackgroundColor.PALE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersLiveAction.BackgroundColor.MINOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[ScootersLiveAction.values().length];
        try {
            iArr2[ScootersLiveAction.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ScootersLiveAction.CONTINUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ScootersLiveAction.BEEP.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ScootersLiveAction.PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ScootersLiveAction.CANCEL.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ScootersLiveAction.FINISH.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[ScootersLiveAction.ROUTE.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        b = iArr2;
    }
}
