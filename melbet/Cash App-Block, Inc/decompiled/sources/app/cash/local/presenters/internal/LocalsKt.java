package app.cash.local.presenters.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.local.primitives.ComputedOrderSummary;
import app.cash.local.primitives.GpsCoordinates;
import app.cash.local.primitives.LocalCurrencyCode;
import app.cash.local.primitives.LocalMoney;
import com.squareup.protos.cash.local.client.app.v1.cashbalance.LocalCashBalance;
import com.squareup.protos.cash.local.client.app.v1.poscheckin.LocalPOSCheckIn;
import com.squareup.protos.cash.local.client.v1.LocalAddress;
import com.squareup.protos.cash.moneymap.app.RetailerType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.text.DecimalFormat;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes3.dex */
public abstract class LocalsKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ComputedOrderSummary.DisplayRow.Visibility.values().length];
            try {
                ComputedOrderSummary.DisplayRow.Visibility visibility = ComputedOrderSummary.DisplayRow.Visibility.VISIBLE;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ComputedOrderSummary.DisplayRow.Visibility visibility2 = ComputedOrderSummary.DisplayRow.Visibility.VISIBLE;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ComputedOrderSummary.DisplayRow.Visibility visibility3 = ComputedOrderSummary.DisplayRow.Visibility.VISIBLE;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LocalPOSCheckIn.State.values().length];
            try {
                RetailerType.Companion companion = LocalPOSCheckIn.State.Companion;
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                RetailerType.Companion companion2 = LocalPOSCheckIn.State.Companion;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                RetailerType.Companion companion3 = LocalPOSCheckIn.State.Companion;
                iArr2[0] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                RetailerType.Companion companion4 = LocalPOSCheckIn.State.Companion;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                RetailerType.Companion companion5 = LocalPOSCheckIn.State.Companion;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final String format(LocalCashBalance localCashBalance) {
        LocalCurrencyCode localCurrencyCode = LocalCurrencyCode.USD;
        localCashBalance.getClass();
        Long l = localCashBalance.amount;
        l.getClass();
        return prettyPrint$default(new LocalMoney(l.longValue(), localCurrencyCode), true, null, 2);
    }

    public static final String formattedFull(LocalAddress localAddress) {
        localAddress.getClass();
        String str = localAddress.address_single_line;
        String str2 = localAddress.locality;
        String str3 = localAddress.state;
        String str4 = localAddress.postal_code;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(",\n");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, " ", str4);
    }

    public static final boolean getCheckedIn(LocalPOSCheckIn localPOSCheckIn) {
        LocalPOSCheckIn.State state = localPOSCheckIn.state;
        int i = state == null ? -1 : WhenMappings.$EnumSwitchMapping$1[state.ordinal()];
        if (i != -1) {
            if (i == 1 || i == 2) {
                return true;
            }
            if (i != 3 && i != 4 && i != 5) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return false;
            }
        }
        return false;
    }

    public static final String injectThreshold(String str, String str2) {
        str.getClass();
        return StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(str, "{{local_cash_balance_amount}}", str2), "{{local_cash_redemption_amount}}", str2), "{{local_cash_earning_amount}}", str2);
    }

    public static String prettyPrint$default(LocalMoney localMoney, boolean z, String str, int i) {
        String str2;
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        boolean z2 = (i & 4) != 0;
        localMoney.getClass();
        long j = localMoney.amount;
        if (z) {
            LocalCurrencyCode localCurrencyCode = localMoney.currencyCode;
            localCurrencyCode.getClass();
            int ordinal = localCurrencyCode.ordinal();
            str2 = "$";
            if (ordinal != 0 && ordinal != 1) {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                str2 = "£";
            }
        } else {
            str2 = "";
        }
        return Recorder$$ExternalSyntheticOutline2.m$1(str, new DecimalFormat(str2.concat("#0".concat((j % 100 == 0 && z2) ? "" : ".00"))).format(j / 100.0d));
    }

    public static final GpsCoordinates toGpsCoordinates(LocalAddress localAddress) {
        localAddress.getClass();
        Double d = localAddress.latitude;
        if (d != null) {
            double doubleValue = d.doubleValue();
            Double d2 = localAddress.longitude;
            if (d2 != null) {
                return new GpsCoordinates(doubleValue, d2.doubleValue());
            }
        }
        return null;
    }
}
