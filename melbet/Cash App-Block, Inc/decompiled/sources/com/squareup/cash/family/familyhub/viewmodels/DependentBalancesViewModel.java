package com.squareup.cash.family.familyhub.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.family.familyhub.viewmodels.DependentDetailViewEvent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DependentBalancesViewModel {
    public final List balances;

    public final class BalanceStatModel {
        public final String balance;
        public final String balanceName;
        public final String body;
        public final String label;
        public final DependentDetailViewEvent onClick;
        public final boolean showLoadingIndicator;

        public BalanceStatModel(String str, String str2, String str3, String str4, DependentDetailViewEvent dependentDetailViewEvent, boolean z) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
            this.balanceName = str;
            this.balance = str2;
            this.label = str3;
            this.body = str4;
            this.onClick = dependentDetailViewEvent;
            this.showLoadingIndicator = z;
        }

        public static BalanceStatModel copy$default(BalanceStatModel balanceStatModel, DependentDetailViewEvent.BalanceTapped balanceTapped, int i) {
            String str = balanceStatModel.balanceName;
            String str2 = balanceStatModel.label;
            String str3 = (i & 8) != 0 ? balanceStatModel.body : null;
            str.getClass();
            str2.getClass();
            return new BalanceStatModel(str, "", str2, str3, balanceTapped, true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BalanceStatModel)) {
                return false;
            }
            BalanceStatModel balanceStatModel = (BalanceStatModel) obj;
            return Intrinsics.areEqual(this.balanceName, balanceStatModel.balanceName) && Intrinsics.areEqual(this.balance, balanceStatModel.balance) && Intrinsics.areEqual(this.label, balanceStatModel.label) && Intrinsics.areEqual(this.body, balanceStatModel.body) && Intrinsics.areEqual(this.onClick, balanceStatModel.onClick) && this.showLoadingIndicator == balanceStatModel.showLoadingIndicator;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.balanceName.hashCode() * 31, 31, this.balance), 31, this.label);
            String str = this.body;
            return Boolean.hashCode(this.showLoadingIndicator) + ((this.onClick.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BalanceStatModel(balanceName=", this.balanceName, ", balance=", this.balance, ", label=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.label, ", body=", this.body, ", onClick=");
            m.append(this.onClick);
            m.append(", showLoadingIndicator=");
            m.append(this.showLoadingIndicator);
            m.append(")");
            return m.toString();
        }
    }

    public DependentBalancesViewModel(List list) {
        list.getClass();
        this.balances = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DependentBalancesViewModel) && Intrinsics.areEqual(this.balances, ((DependentBalancesViewModel) obj).balances);
    }

    public final BalanceStatModel getCashBalance() {
        Object obj;
        Iterator it = this.balances.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((BalanceStatModel) obj).balanceName, "Cash")) {
                break;
            }
        }
        BalanceStatModel balanceStatModel = (BalanceStatModel) obj;
        if (balanceStatModel != null) {
            return balanceStatModel;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Balances should always contain a cash balance");
        return null;
    }

    public final int hashCode() {
        return this.balances.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("DependentBalancesViewModel(balances=", ")", this.balances);
    }
}
