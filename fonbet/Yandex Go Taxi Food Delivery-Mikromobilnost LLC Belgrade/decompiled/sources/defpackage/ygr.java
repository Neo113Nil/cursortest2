package defpackage;

import com.yandex.go.flex.common.api.actions.SummaryRedirectAction;
import com.yandex.go.flex.common.api.actions.TaxiRouteInputAction;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class ygr {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[TaxiRouteInputAction.AdditionalActionType.values().length];
        try {
            iArr[TaxiRouteInputAction.AdditionalActionType.PREORDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TaxiRouteInputAction.AdditionalActionType.ORDER_TO_ANOTHER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TaxiRouteInputAction.AdditionalActionType.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[SummaryRedirectAction.State.values().length];
        try {
            iArr2[SummaryRedirectAction.State.Collapsed.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SummaryRedirectAction.State.Expanded.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[SummaryRedirectAction.State.Anchored.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
