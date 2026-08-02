package defpackage;

import com.yandex.div.core.timer.Ticker$State;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class t0z0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Ticker$State.values().length];
        try {
            iArr[Ticker$State.STOPPED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Ticker$State.WORKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Ticker$State.PAUSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
