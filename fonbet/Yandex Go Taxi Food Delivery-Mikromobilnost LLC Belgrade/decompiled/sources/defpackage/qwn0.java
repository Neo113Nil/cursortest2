package defpackage;

import com.yandex.go.scooters.live.domain.model.ScootersLiveAction;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class qwn0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersLiveAction.values().length];
        try {
            iArr[ScootersLiveAction.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersLiveAction.CONTINUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersLiveAction.PAUSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ScootersLiveAction.BEEP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ScootersLiveAction.CANCEL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ScootersLiveAction.FINISH.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ScootersLiveAction.ROUTE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
