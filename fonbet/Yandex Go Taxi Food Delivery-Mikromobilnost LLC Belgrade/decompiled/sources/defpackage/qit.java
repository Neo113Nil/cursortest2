package defpackage;

import com.yandex.go.superapp.api.loading_tracker.GlobalLoadingEvent;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class qit {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GlobalLoadingEvent.values().length];
        try {
            iArr[GlobalLoadingEvent.HANDLE_DEEPLINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GlobalLoadingEvent.ROUTING_PREPARE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GlobalLoadingEvent.ROUTING_START.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[GlobalLoadingEvent.NATIVE_AUTH_START.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[GlobalLoadingEvent.NATIVE_AUTH_FINISH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
