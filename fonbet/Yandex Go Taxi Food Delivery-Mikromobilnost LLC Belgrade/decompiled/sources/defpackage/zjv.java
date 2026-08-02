package defpackage;

import com.yandex.go.inapp_calls.repository.InAppCallsFeatureWrapper$State;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class zjv {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[InAppCallsFeatureWrapper$State.values().length];
        try {
            iArr[InAppCallsFeatureWrapper$State.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InAppCallsFeatureWrapper$State.UNAVAILABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InAppCallsFeatureWrapper$State.NOT_LOADED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[InAppCallsFeatureWrapper$State.LOADING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[InAppCallsFeatureWrapper$State.READY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
