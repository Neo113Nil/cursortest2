package com.squareup.cash.investing.applets.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface StocksAppletTileModel {

    public interface Installed extends StocksAppletTileModel {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class ChangeDirection {
            public static final /* synthetic */ ChangeDirection[] $VALUES;
            public static final ChangeDirection DOWN;
            public static final ChangeDirection UP;
            public static final ChangeDirection ZERO;

            static {
                ChangeDirection changeDirection = new ChangeDirection("UP", 0);
                UP = changeDirection;
                ChangeDirection changeDirection2 = new ChangeDirection("DOWN", 1);
                DOWN = changeDirection2;
                ChangeDirection changeDirection3 = new ChangeDirection("ZERO", 2);
                ZERO = changeDirection3;
                $VALUES = new ChangeDirection[]{changeDirection, changeDirection2, changeDirection3};
            }

            public static ChangeDirection valueOf(String str) {
                return (ChangeDirection) Enum.valueOf(ChangeDirection.class, str);
            }

            public static ChangeDirection[] values() {
                return (ChangeDirection[]) $VALUES.clone();
            }
        }

        public final class GraphError implements Installed {
            public final String formattedBalance;
            public final long rawBalance;
            public final String subtitle;
            public final String title;

            public GraphError(String str, long j, String str2, String str3) {
                re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
                this.title = str;
                this.subtitle = str2;
                this.formattedBalance = str3;
                this.rawBalance = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof GraphError)) {
                    return false;
                }
                GraphError graphError = (GraphError) obj;
                return Intrinsics.areEqual(this.title, graphError.title) && Intrinsics.areEqual(this.subtitle, graphError.subtitle) && Intrinsics.areEqual(this.formattedBalance, graphError.formattedBalance) && this.rawBalance == graphError.rawBalance;
            }

            public final int hashCode() {
                return Long.hashCode(this.rawBalance) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle), 31, this.formattedBalance);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GraphError(title=", this.title, ", subtitle=", this.subtitle, ", formattedBalance=");
                m.append(this.formattedBalance);
                m.append(", rawBalance=");
                m.append(this.rawBalance);
                m.append(")");
                return m.toString();
            }
        }

        public interface LoadedPriceMovement extends Installed {

            public final class WithPriceMovement implements LoadedPriceMovement {
                public final ChangeDirection changeDirection;
                public final String formattedBalance;
                public final InvestingGraphContentModel graph;
                public final String percentText;
                public final long rawBalance;
                public final String title;
                public final String todayText;

                public WithPriceMovement(String str, String str2, long j, String str3, String str4, ChangeDirection changeDirection, InvestingGraphContentModel investingGraphContentModel) {
                    Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
                    this.title = str;
                    this.formattedBalance = str2;
                    this.rawBalance = j;
                    this.percentText = str3;
                    this.todayText = str4;
                    this.changeDirection = changeDirection;
                    this.graph = investingGraphContentModel;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof WithPriceMovement)) {
                        return false;
                    }
                    WithPriceMovement withPriceMovement = (WithPriceMovement) obj;
                    return Intrinsics.areEqual(this.title, withPriceMovement.title) && Intrinsics.areEqual(this.formattedBalance, withPriceMovement.formattedBalance) && this.rawBalance == withPriceMovement.rawBalance && Intrinsics.areEqual(this.percentText, withPriceMovement.percentText) && Intrinsics.areEqual(this.todayText, withPriceMovement.todayText) && this.changeDirection == withPriceMovement.changeDirection && this.graph.equals(withPriceMovement.graph);
                }

                @Override // com.squareup.cash.investing.applets.viewmodels.StocksAppletTileModel.Installed.LoadedPriceMovement
                public final ChangeDirection getChangeDirection() {
                    return this.changeDirection;
                }

                @Override // com.squareup.cash.investing.applets.viewmodels.StocksAppletTileModel.Installed.LoadedPriceMovement
                public final String getFormattedBalance() {
                    return this.formattedBalance;
                }

                @Override // com.squareup.cash.investing.applets.viewmodels.StocksAppletTileModel.Installed.LoadedPriceMovement
                public final String getPercentText() {
                    return this.percentText;
                }

                @Override // com.squareup.cash.investing.applets.viewmodels.StocksAppletTileModel.Installed.LoadedPriceMovement
                public final long getRawBalance() {
                    return this.rawBalance;
                }

                @Override // com.squareup.cash.investing.applets.viewmodels.StocksAppletTileModel.Installed.LoadedPriceMovement
                public final String getTitle() {
                    return this.title;
                }

                @Override // com.squareup.cash.investing.applets.viewmodels.StocksAppletTileModel.Installed.LoadedPriceMovement
                public final String getTodayText() {
                    return this.todayText;
                }

                public final int hashCode() {
                    return this.graph.hashCode() + ((this.changeDirection.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.formattedBalance), 31, this.rawBalance), 31, this.percentText), 31, this.todayText)) * 31);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WithPriceMovement(title=", this.title, ", formattedBalance=", this.formattedBalance, ", rawBalance=");
                    Fragment$5$$ExternalSyntheticOutline0.m(this.rawBalance, ", percentText=", this.percentText, m);
                    m.append(", todayText=");
                    m.append(this.todayText);
                    m.append(", changeDirection=");
                    m.append(this.changeDirection);
                    m.append(", graph=");
                    m.append(this.graph);
                    m.append(")");
                    return m.toString();
                }
            }

            public final class ZeroBalance implements LoadedPriceMovement {
                public final String formattedBalance;
                public final String percentText;
                public final long rawBalance;
                public final String title;
                public final String todayText;

                public ZeroBalance(String str, String str2, String str3, String str4, long j) {
                    ChangeDirection changeDirection = ChangeDirection.UP;
                    zzd zzdVar = Icons.Companion;
                    Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
                    this.title = str;
                    this.formattedBalance = str2;
                    this.rawBalance = j;
                    this.percentText = str3;
                    this.todayText = str4;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ZeroBalance)) {
                        return false;
                    }
                    ZeroBalance zeroBalance = (ZeroBalance) obj;
                    if (!Intrinsics.areEqual(this.title, zeroBalance.title) || !Intrinsics.areEqual(this.formattedBalance, zeroBalance.formattedBalance) || this.rawBalance != zeroBalance.rawBalance || !Intrinsics.areEqual(this.percentText, zeroBalance.percentText) || !Intrinsics.areEqual(this.todayText, zeroBalance.todayText)) {
                        return false;
                    }
                    ChangeDirection changeDirection = ChangeDirection.UP;
                    zzd zzdVar = Icons.Companion;
                    return true;
                }

                @Override // com.squareup.cash.investing.applets.viewmodels.StocksAppletTileModel.Installed.LoadedPriceMovement
                public final ChangeDirection getChangeDirection() {
                    return ChangeDirection.ZERO;
                }

                @Override // com.squareup.cash.investing.applets.viewmodels.StocksAppletTileModel.Installed.LoadedPriceMovement
                public final String getFormattedBalance() {
                    return this.formattedBalance;
                }

                @Override // com.squareup.cash.investing.applets.viewmodels.StocksAppletTileModel.Installed.LoadedPriceMovement
                public final String getPercentText() {
                    return this.percentText;
                }

                @Override // com.squareup.cash.investing.applets.viewmodels.StocksAppletTileModel.Installed.LoadedPriceMovement
                public final long getRawBalance() {
                    return this.rawBalance;
                }

                @Override // com.squareup.cash.investing.applets.viewmodels.StocksAppletTileModel.Installed.LoadedPriceMovement
                public final String getTitle() {
                    return this.title;
                }

                @Override // com.squareup.cash.investing.applets.viewmodels.StocksAppletTileModel.Installed.LoadedPriceMovement
                public final String getTodayText() {
                    return this.todayText;
                }

                public final int hashCode() {
                    return Icons.Investing24.hashCode() + ((ChangeDirection.ZERO.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.formattedBalance), 31, this.rawBalance), 31, this.percentText), 31, this.todayText)) * 31);
                }

                public final String toString() {
                    ChangeDirection changeDirection = ChangeDirection.ZERO;
                    Icons icons = Icons.Investing24;
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ZeroBalance(title=", this.title, ", formattedBalance=", this.formattedBalance, ", rawBalance=");
                    Fragment$5$$ExternalSyntheticOutline0.m(this.rawBalance, ", percentText=", this.percentText, m);
                    m.append(", todayText=");
                    m.append(this.todayText);
                    m.append(", changeDirection=");
                    m.append(changeDirection);
                    m.append(", icon=");
                    m.append(icons);
                    m.append(")");
                    return m.toString();
                }
            }

            ChangeDirection getChangeDirection();

            String getFormattedBalance();

            String getPercentText();

            long getRawBalance();

            String getTitle();

            String getTodayText();
        }

        public final class LoadingPriceMovement implements Installed {
            public final String title;

            public LoadingPriceMovement(String str) {
                str.getClass();
                this.title = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoadingPriceMovement) && Intrinsics.areEqual(this.title, ((LoadingPriceMovement) obj).title);
            }

            public final int hashCode() {
                return this.title.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LoadingPriceMovement(title=", this.title, ")");
            }
        }
    }

    public final class Uninstalled implements StocksAppletTileModel {
        public final PromotedAppletTileViewModel promotedTileViewModel;
        public final String subtitle;
        public final String title;

        public Uninstalled(String str, String str2, PromotedAppletTileViewModel promotedAppletTileViewModel) {
            zzd zzdVar = Icons.Companion;
            str.getClass();
            str2.getClass();
            this.title = str;
            this.subtitle = str2;
            this.promotedTileViewModel = promotedAppletTileViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Uninstalled)) {
                return false;
            }
            Uninstalled uninstalled = (Uninstalled) obj;
            if (!Intrinsics.areEqual(this.title, uninstalled.title) || !Intrinsics.areEqual(this.subtitle, uninstalled.subtitle)) {
                return false;
            }
            zzd zzdVar = Icons.Companion;
            return Intrinsics.areEqual(this.promotedTileViewModel, uninstalled.promotedTileViewModel);
        }

        public final int hashCode() {
            int hashCode = (Icons.Investing24.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle)) * 31;
            PromotedAppletTileViewModel promotedAppletTileViewModel = this.promotedTileViewModel;
            return hashCode + (promotedAppletTileViewModel == null ? 0 : promotedAppletTileViewModel.hashCode());
        }

        public final String toString() {
            Icons icons = Icons.Investing24;
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Uninstalled(title=", this.title, ", subtitle=", this.subtitle, ", icon=");
            m.append(icons);
            m.append(", promotedTileViewModel=");
            m.append(this.promotedTileViewModel);
            m.append(")");
            return m.toString();
        }
    }
}
