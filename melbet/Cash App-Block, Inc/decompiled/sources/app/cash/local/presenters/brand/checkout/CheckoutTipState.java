package app.cash.local.presenters.brand.checkout;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import app.cash.local.presenters.internal.LocalsKt;
import app.cash.local.primitives.LocalCurrencyCode;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.LocalMoneyKt;
import com.squareup.protos.cash.local.client.v1.LocalTippingConfiguration;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class CheckoutTipState {
    public final ParcelableSnapshotMutableState currentTip$delegate;
    public final ParcelableSnapshotMutableState currentTipLocalCashEarningsLabel$delegate;
    public final ParcelableSnapshotMutableState overrideTip$delegate;
    public final LocalTippingConfiguration.Suggestion selectedByDefaultTip;
    public final ParcelableSnapshotMutableState selectedTipIndex$delegate;
    public final List suggestions;
    public final LocalMoney tipAmount;
    public final boolean useEnteredTipAsOverride;

    public CheckoutTipState(LocalMoney localMoney, List list, boolean z) {
        Object obj;
        int i;
        String str;
        String str2;
        com.squareup.protos.cash.local.client.v1.LocalMoney localMoney2;
        com.squareup.protos.cash.local.client.v1.LocalMoney localMoney3;
        Object obj2;
        list.getClass();
        this.tipAmount = localMoney;
        this.suggestions = list;
        this.useEnteredTipAsOverride = z;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            com.squareup.protos.cash.local.client.v1.LocalMoney localMoney4 = ((LocalTippingConfiguration.Suggestion) obj).tip_amount;
            Long l = localMoney4 != null ? localMoney4.amount : null;
            LocalMoney localMoney5 = this.tipAmount;
            if (Intrinsics.areEqual(l, localMoney5 != null ? Long.valueOf(localMoney5.amount) : null)) {
                break;
            }
        }
        LocalTippingConfiguration.Suggestion suggestion = (LocalTippingConfiguration.Suggestion) obj;
        if (suggestion == null) {
            Iterator it2 = this.suggestions.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it2.next();
                    if (Intrinsics.areEqual(((LocalTippingConfiguration.Suggestion) obj2).selected_by_default, Boolean.TRUE)) {
                        break;
                    }
                }
            }
            suggestion = (LocalTippingConfiguration.Suggestion) obj2;
        }
        this.selectedByDefaultTip = suggestion;
        Iterator it3 = this.suggestions.iterator();
        int i2 = 0;
        while (true) {
            i = -1;
            if (!it3.hasNext()) {
                i2 = -1;
                break;
            }
            com.squareup.protos.cash.local.client.v1.LocalMoney localMoney6 = ((LocalTippingConfiguration.Suggestion) it3.next()).tip_amount;
            Long l2 = localMoney6 != null ? localMoney6.amount : null;
            LocalMoney localMoney7 = this.tipAmount;
            if (Intrinsics.areEqual(l2, localMoney7 != null ? Long.valueOf(localMoney7.amount) : null)) {
                break;
            } else {
                i2++;
            }
        }
        Integer valueOf = Integer.valueOf(i2);
        if (i2 < 0 && this.tipAmount == null) {
            valueOf = null;
        }
        if (valueOf == null) {
            Iterator it4 = this.suggestions.iterator();
            int i3 = 0;
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                if (Intrinsics.areEqual(((LocalTippingConfiguration.Suggestion) it4.next()).selected_by_default, Boolean.TRUE)) {
                    i = i3;
                    break;
                }
                i3++;
            }
            valueOf = Integer.valueOf(i);
            if (i < 0) {
                valueOf = null;
            }
        }
        this.selectedTipIndex$delegate = Updater.mutableStateOf$default(valueOf);
        LocalMoney localMoney8 = this.tipAmount;
        if (localMoney8 == null) {
            LocalTippingConfiguration.Suggestion suggestion2 = this.selectedByDefaultTip;
            localMoney8 = (suggestion2 == null || (localMoney3 = suggestion2.tip_amount) == null) ? null : LocalMoneyKt.toMoney(localMoney3);
        }
        if (localMoney8 != null) {
            String prettyPrint$default = LocalsKt.prettyPrint$default(localMoney8, false, null, 7);
            str = StringsKt.substringAfter(prettyPrint$default, "$", prettyPrint$default);
        } else {
            str = null;
        }
        this.overrideTip$delegate = Updater.mutableStateOf$default(str);
        LocalTippingConfiguration.Suggestion suggestion3 = this.selectedByDefaultTip;
        this.currentTipLocalCashEarningsLabel$delegate = Updater.mutableStateOf$default(suggestion3 != null ? suggestion3.local_cash_earnings_label : null);
        LocalMoney localMoney9 = this.tipAmount;
        if (localMoney9 == null) {
            LocalTippingConfiguration.Suggestion suggestion4 = this.selectedByDefaultTip;
            localMoney9 = (suggestion4 == null || (localMoney2 = suggestion4.tip_amount) == null) ? null : LocalMoneyKt.toMoney(localMoney2);
        }
        if (localMoney9 != null) {
            String prettyPrint$default2 = LocalsKt.prettyPrint$default(localMoney9, false, null, 7);
            str2 = StringsKt.substringAfter(prettyPrint$default2, "$", prettyPrint$default2);
        } else {
            str2 = "";
        }
        this.currentTip$delegate = Updater.mutableStateOf$default(str2);
    }

    public final LocalMoney currentTipAsMoney(LocalCurrencyCode localCurrencyCode) {
        localCurrencyCode.getClass();
        String str = (String) this.currentTip$delegate.getValue();
        String substringBefore$default = StringsKt.substringBefore$default(str, '.');
        if (StringsKt.isBlank(substringBefore$default)) {
            substringBefore$default = "0";
        }
        long parseLong = Long.parseLong(substringBefore$default) * 100;
        String substringAfter = StringsKt.substringAfter('.', str, "0");
        return new LocalMoney(Long.parseLong(StringsKt.padEnd(StringsKt.isBlank(substringAfter) ? "0" : substringAfter, 2, '0')) + parseLong, localCurrencyCode);
    }
}
