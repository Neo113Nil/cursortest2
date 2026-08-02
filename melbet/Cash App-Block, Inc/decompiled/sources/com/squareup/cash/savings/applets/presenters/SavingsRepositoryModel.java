package com.squareup.cash.savings.applets.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.savings.backend.api.model.SavingsApplet;
import com.squareup.cash.savings.backend.api.model.SavingsFolder;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface SavingsRepositoryModel {

    /* loaded from: classes6.dex */
    public final class GoalSet extends Installed {
        public final SavingsApplet applet;
        public final ClientRoute clientRoute;
        public final SavingsFolder.GeneralFolder generalFolder;
        public final String generalSavingsLabel;
        public final List goals;
        public final Money savingsBalance;
        public final boolean shouldIncludeGeneralSavings;

        public GoalSet(SavingsApplet savingsApplet, ArrayList arrayList, SavingsFolder.GeneralFolder generalFolder, Money money, ClientRoute clientRoute) {
            Money money2;
            Long l;
            savingsApplet.getClass();
            arrayList.getClass();
            money.getClass();
            this.applet = savingsApplet;
            this.goals = arrayList;
            this.generalFolder = generalFolder;
            this.savingsBalance = money;
            this.clientRoute = clientRoute;
            this.generalSavingsLabel = generalFolder != null ? generalFolder.label : null;
            int size = arrayList.size();
            boolean z = true;
            if (size == 1 && generalFolder != null && (money2 = generalFolder.balance) != null && (l = money2.amount) != null && l.longValue() == 0) {
                z = false;
            }
            this.shouldIncludeGeneralSavings = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GoalSet)) {
                return false;
            }
            GoalSet goalSet = (GoalSet) obj;
            return Intrinsics.areEqual(this.applet, goalSet.applet) && Intrinsics.areEqual(this.goals, goalSet.goals) && Intrinsics.areEqual(this.generalFolder, goalSet.generalFolder) && Intrinsics.areEqual(this.savingsBalance, goalSet.savingsBalance) && Intrinsics.areEqual(this.clientRoute, goalSet.clientRoute);
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(this.applet.hashCode() * 31, 31, this.goals);
            SavingsFolder.GeneralFolder generalFolder = this.generalFolder;
            int m2 = NavAction$$ExternalSyntheticOutline0.m(this.savingsBalance, (m + (generalFolder == null ? 0 : generalFolder.hashCode())) * 31, 31);
            ClientRoute clientRoute = this.clientRoute;
            return m2 + (clientRoute != null ? clientRoute.hashCode() : 0);
        }

        public final String toString() {
            return "GoalSet(applet=" + this.applet + ", goals=" + this.goals + ", generalFolder=" + this.generalFolder + ", savingsBalance=" + this.savingsBalance + ", clientRoute=" + this.clientRoute + ")";
        }
    }

    /* loaded from: classes6.dex */
    public abstract class Installed implements SavingsRepositoryModel {
    }

    /* loaded from: classes6.dex */
    public final class NoGoalSet extends Installed {
        public final SavingsApplet applet;
        public final ClientRoute clientRoute;
        public final Money savingsBalance;

        public NoGoalSet(SavingsApplet savingsApplet, Money money, ClientRoute clientRoute) {
            savingsApplet.getClass();
            money.getClass();
            this.applet = savingsApplet;
            this.savingsBalance = money;
            this.clientRoute = clientRoute;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoGoalSet)) {
                return false;
            }
            NoGoalSet noGoalSet = (NoGoalSet) obj;
            return Intrinsics.areEqual(this.applet, noGoalSet.applet) && Intrinsics.areEqual(this.savingsBalance, noGoalSet.savingsBalance) && Intrinsics.areEqual(this.clientRoute, noGoalSet.clientRoute);
        }

        public final int hashCode() {
            int m = NavAction$$ExternalSyntheticOutline0.m(this.savingsBalance, this.applet.hashCode() * 31, 31);
            ClientRoute clientRoute = this.clientRoute;
            return m + (clientRoute == null ? 0 : clientRoute.hashCode());
        }

        public final String toString() {
            return "NoGoalSet(applet=" + this.applet + ", savingsBalance=" + this.savingsBalance + ", clientRoute=" + this.clientRoute + ")";
        }
    }

    public final class SavingsBalanceState {
        public final Money balance;
        public final Boolean isAdopted;
        public final boolean isLoading;

        public SavingsBalanceState(Money money, Boolean bool, boolean z) {
            this.balance = money;
            this.isAdopted = bool;
            this.isLoading = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SavingsBalanceState)) {
                return false;
            }
            SavingsBalanceState savingsBalanceState = (SavingsBalanceState) obj;
            return Intrinsics.areEqual(this.balance, savingsBalanceState.balance) && Intrinsics.areEqual(this.isAdopted, savingsBalanceState.isAdopted) && this.isLoading == savingsBalanceState.isLoading;
        }

        public final int hashCode() {
            Money money = this.balance;
            int hashCode = (money == null ? 0 : money.hashCode()) * 31;
            Boolean bool = this.isAdopted;
            return Boolean.hashCode(this.isLoading) + ((hashCode + (bool != null ? bool.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SavingsBalanceState(balance=");
            sb.append(this.balance);
            sb.append(", isAdopted=");
            sb.append(this.isAdopted);
            sb.append(", isLoading=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isLoading, ")");
        }
    }

    public final class SavingsConfigState {
        public final boolean loading;

        public SavingsConfigState(int i) {
            this.loading = (i & 4) == 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SavingsConfigState) && this.loading == ((SavingsConfigState) obj).loading;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.loading);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("SavingsConfigState(noFolderNullState=null, activeState=null, loading=", ")", this.loading);
        }
    }

    public final class Uninstalled implements SavingsRepositoryModel {
        public final SavingsApplet applet;
        public final ClientRoute clientRoute;
        public final boolean isFullWidth;

        public Uninstalled(SavingsApplet savingsApplet, ClientRoute clientRoute, boolean z) {
            savingsApplet.getClass();
            this.applet = savingsApplet;
            this.clientRoute = clientRoute;
            this.isFullWidth = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Uninstalled)) {
                return false;
            }
            Uninstalled uninstalled = (Uninstalled) obj;
            return Intrinsics.areEqual(this.applet, uninstalled.applet) && this.clientRoute.equals(uninstalled.clientRoute) && this.isFullWidth == uninstalled.isFullWidth;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isFullWidth) + ((this.clientRoute.hashCode() + (this.applet.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Uninstalled(applet=");
            sb.append(this.applet);
            sb.append(", clientRoute=");
            sb.append(this.clientRoute);
            sb.append(", isFullWidth=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isFullWidth, ")");
        }
    }
}
