package com.squareup.cash.savings.applets.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface SavingsAppletTileViewModel {

    /* loaded from: classes6.dex */
    public abstract class Installed implements SavingsAppletTileViewModel {

        public final class GoalSet extends Installed {
            public final ClientRoute clientRoute;
            public final String formattedBalance;
            public final List goalIconIds;
            public final String iconAccessibilityLabel;
            public final long rawBalance;
            public final String subtitle;
            public final String title;

            public GoalSet(String str, String str2, String str3, long j, ClientRoute clientRoute, ListBuilder listBuilder, String str4) {
                str.getClass();
                str3.getClass();
                listBuilder.getClass();
                this.title = str;
                this.subtitle = str2;
                this.formattedBalance = str3;
                this.rawBalance = j;
                this.clientRoute = clientRoute;
                this.goalIconIds = listBuilder;
                this.iconAccessibilityLabel = str4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof GoalSet)) {
                    return false;
                }
                GoalSet goalSet = (GoalSet) obj;
                return Intrinsics.areEqual(this.title, goalSet.title) && this.subtitle.equals(goalSet.subtitle) && Intrinsics.areEqual(this.formattedBalance, goalSet.formattedBalance) && this.rawBalance == goalSet.rawBalance && this.clientRoute.equals(goalSet.clientRoute) && Intrinsics.areEqual(this.goalIconIds, goalSet.goalIconIds) && this.iconAccessibilityLabel.equals(goalSet.iconAccessibilityLabel);
            }

            @Override // com.squareup.cash.savings.applets.viewmodels.SavingsAppletTileViewModel.Installed
            public final ClientRoute getClientRoute() {
                return this.clientRoute;
            }

            @Override // com.squareup.cash.savings.applets.viewmodels.SavingsAppletTileViewModel.Installed
            public final String getFormattedBalance() {
                return this.formattedBalance;
            }

            @Override // com.squareup.cash.savings.applets.viewmodels.SavingsAppletTileViewModel.Installed
            public final long getRawBalance() {
                return this.rawBalance;
            }

            @Override // com.squareup.cash.savings.applets.viewmodels.SavingsAppletTileViewModel.Installed
            public final String getSubtitle() {
                return this.subtitle;
            }

            @Override // com.squareup.cash.savings.applets.viewmodels.SavingsAppletTileViewModel.Installed
            public final String getTitle() {
                return this.title;
            }

            public final int hashCode() {
                return this.iconAccessibilityLabel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(2, Recorder$$ExternalSyntheticOutline2.m((this.clientRoute.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle), 31, this.formattedBalance), 31, this.rawBalance)) * 31, 31, this.goalIconIds), 31);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GoalSet(title=", this.title, ", subtitle=", this.subtitle, ", formattedBalance=");
                m.append(this.formattedBalance);
                m.append(", rawBalance=");
                m.append(this.rawBalance);
                m.append(", clientRoute=");
                m.append(this.clientRoute);
                m.append(", goalIconIds=");
                m.append(this.goalIconIds);
                return Recorder$$ExternalSyntheticOutline2.m(m, ", maxIcons=2, iconAccessibilityLabel=", this.iconAccessibilityLabel, ")");
            }
        }

        public final class NoGoalSet extends Installed {
            public final ClientRoute clientRoute;
            public final String formattedBalance;
            public final long rawBalance;
            public final String subtitle;
            public final String title;

            public NoGoalSet(String str, String str2, ClientRoute clientRoute, String str3, long j) {
                str.getClass();
                str3.getClass();
                this.title = str;
                this.subtitle = str2;
                this.clientRoute = clientRoute;
                this.formattedBalance = str3;
                this.rawBalance = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NoGoalSet)) {
                    return false;
                }
                NoGoalSet noGoalSet = (NoGoalSet) obj;
                return Intrinsics.areEqual(this.title, noGoalSet.title) && this.subtitle.equals(noGoalSet.subtitle) && this.clientRoute.equals(noGoalSet.clientRoute) && Intrinsics.areEqual(this.formattedBalance, noGoalSet.formattedBalance) && this.rawBalance == noGoalSet.rawBalance;
            }

            @Override // com.squareup.cash.savings.applets.viewmodels.SavingsAppletTileViewModel.Installed
            public final ClientRoute getClientRoute() {
                return this.clientRoute;
            }

            @Override // com.squareup.cash.savings.applets.viewmodels.SavingsAppletTileViewModel.Installed
            public final String getFormattedBalance() {
                return this.formattedBalance;
            }

            @Override // com.squareup.cash.savings.applets.viewmodels.SavingsAppletTileViewModel.Installed
            public final long getRawBalance() {
                return this.rawBalance;
            }

            @Override // com.squareup.cash.savings.applets.viewmodels.SavingsAppletTileViewModel.Installed
            public final String getSubtitle() {
                return this.subtitle;
            }

            @Override // com.squareup.cash.savings.applets.viewmodels.SavingsAppletTileViewModel.Installed
            public final String getTitle() {
                return this.title;
            }

            public final int hashCode() {
                return Long.hashCode(this.rawBalance) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.clientRoute.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle)) * 31, 31, this.formattedBalance);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NoGoalSet(title=", this.title, ", subtitle=", this.subtitle, ", clientRoute=");
                m.append(this.clientRoute);
                m.append(", formattedBalance=");
                m.append(this.formattedBalance);
                m.append(", rawBalance=");
                return CameraState$Type$EnumUnboxingLocalUtility.m(this.rawBalance, ")", m);
            }
        }

        public abstract ClientRoute getClientRoute();

        public abstract String getFormattedBalance();

        public abstract long getRawBalance();

        public abstract String getSubtitle();

        public abstract String getTitle();
    }

    public final class Loading implements SavingsAppletTileViewModel {
        public final String title;

        public Loading(String str) {
            str.getClass();
            this.title = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && Intrinsics.areEqual(this.title, ((Loading) obj).title);
        }

        public final int hashCode() {
            return this.title.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loading(title=", this.title, ")");
        }
    }

    public final class Uninstalled implements SavingsAppletTileViewModel {
        public final ClientRoute clientRoute;
        public final boolean isFullWidth;
        public final String managedAccountFirstName;
        public final PromotedAppletTileViewModel.Loaded promotedTileModel;
        public final String subtitle;
        public final String title;

        public Uninstalled(String str, String str2, String str3, boolean z, ClientRoute clientRoute, PromotedAppletTileViewModel.Loaded loaded) {
            zzd zzdVar = Icons.Companion;
            str.getClass();
            this.title = str;
            this.subtitle = str2;
            this.managedAccountFirstName = str3;
            this.isFullWidth = z;
            this.clientRoute = clientRoute;
            this.promotedTileModel = loaded;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Uninstalled)) {
                return false;
            }
            Uninstalled uninstalled = (Uninstalled) obj;
            if (!Intrinsics.areEqual(this.title, uninstalled.title) || !this.subtitle.equals(uninstalled.subtitle) || !Intrinsics.areEqual(this.managedAccountFirstName, uninstalled.managedAccountFirstName)) {
                return false;
            }
            zzd zzdVar = Icons.Companion;
            return this.isFullWidth == uninstalled.isFullWidth && this.clientRoute.equals(uninstalled.clientRoute) && Intrinsics.areEqual(this.promotedTileModel, uninstalled.promotedTileModel);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
            String str = this.managedAccountFirstName;
            int hashCode = (this.clientRoute.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((Icons.Savings24.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.isFullWidth)) * 31;
            PromotedAppletTileViewModel.Loaded loaded = this.promotedTileModel;
            return hashCode + (loaded != null ? loaded.hashCode() : 0);
        }

        public final String toString() {
            Icons icons = Icons.Savings24;
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Uninstalled(title=", this.title, ", subtitle=", this.subtitle, ", managedAccountFirstName=");
            m.append(this.managedAccountFirstName);
            m.append(", icon=");
            m.append(icons);
            m.append(", isFullWidth=");
            m.append(this.isFullWidth);
            m.append(", clientRoute=");
            m.append(this.clientRoute);
            m.append(", promotedTileModel=");
            m.append(this.promotedTileModel);
            m.append(")");
            return m.toString();
        }
    }
}
