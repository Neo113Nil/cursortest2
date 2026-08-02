package defpackage;

import com.yandex.go.flex.common.api.actions.TaxiExpectedDestinationAction;

/* loaded from: classes.dex */
public abstract /* synthetic */ class zux0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TaxiExpectedDestinationAction.Prefetch.values().length];
        try {
            iArr[TaxiExpectedDestinationAction.Prefetch.RouteEta.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TaxiExpectedDestinationAction.Prefetch.None.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
