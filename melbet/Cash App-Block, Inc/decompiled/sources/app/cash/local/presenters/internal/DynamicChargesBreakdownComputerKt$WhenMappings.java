package app.cash.local.presenters.internal;

import app.cash.local.presenters.internal.OrderRow;
import com.squareup.protos.cash.local.client.v1.DynamicChargesBreakdown;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class DynamicChargesBreakdownComputerKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;

    static {
        int[] iArr = new int[OrderRow.Orientation.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            OrderRow.Orientation orientation = OrderRow.Orientation.DEBIT;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[DynamicChargesBreakdown.RowCalculation.Visibility.values().length];
        try {
            iArr2[DynamicChargesBreakdown.RowCalculation.Visibility.VISIBILITY_UNSPECIFIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[DynamicChargesBreakdown.RowCalculation.Visibility.VISIBILITY_ALWAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[DynamicChargesBreakdown.RowCalculation.Visibility.VISIBILITY_HIDE_IF_ZERO.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[DynamicChargesBreakdown.RowCalculation.Visibility.VISIBILITY_HIDDEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[DynamicChargesBreakdown.RowCalculation.Orientation.values().length];
        try {
            iArr3[DynamicChargesBreakdown.RowCalculation.Orientation.ORIENTATION_UNSPECIFIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[DynamicChargesBreakdown.RowCalculation.Orientation.ORIENTATION_CHARGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[DynamicChargesBreakdown.RowCalculation.Orientation.ORIENTATION_CREDIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        $EnumSwitchMapping$2 = iArr3;
    }
}
