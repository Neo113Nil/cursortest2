package com.squareup.cash.bitcoin.applets.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoImage;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BitcoinAppletTileModel {

    public abstract class Installed implements BitcoinAppletTileModel {

        public final class GraphError extends Installed {
            public final String errorMessage;
            public final String formattedBalance;
            public final long rawBalance;
            public final String title;

            public GraphError(String str, String str2, long j, String str3) {
                str.getClass();
                str3.getClass();
                this.title = str;
                this.formattedBalance = str2;
                this.rawBalance = j;
                this.errorMessage = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof GraphError)) {
                    return false;
                }
                GraphError graphError = (GraphError) obj;
                return Intrinsics.areEqual(this.title, graphError.title) && this.formattedBalance.equals(graphError.formattedBalance) && this.rawBalance == graphError.rawBalance && Intrinsics.areEqual(this.errorMessage, graphError.errorMessage);
            }

            @Override // com.squareup.cash.bitcoin.applets.viewmodels.BitcoinAppletTileModel.Installed
            public final String getTitle() {
                throw null;
            }

            public final int hashCode() {
                return this.errorMessage.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.formattedBalance), 31, this.rawBalance);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GraphError(title=", this.title, ", formattedBalance=", this.formattedBalance, ", rawBalance=");
                Fragment$5$$ExternalSyntheticOutline0.m(this.rawBalance, ", errorMessage=", this.errorMessage, m);
                m.append(")");
                return m.toString();
            }
        }

        public abstract class Loaded extends Installed {

            public final class Chart extends Loaded {
                public final InvestingCryptoImage direction;
                public final String formattedBalance;
                public final InvestingGraphContentModel graph;
                public final String movement;
                public final long rawBalance;
                public final String title;
                public final String todayText;

                public Chart(String str, String str2, long j, String str3, String str4, InvestingCryptoImage investingCryptoImage, InvestingGraphContentModel investingGraphContentModel) {
                    str.getClass();
                    str4.getClass();
                    investingGraphContentModel.getClass();
                    this.title = str;
                    this.formattedBalance = str2;
                    this.rawBalance = j;
                    this.movement = str3;
                    this.todayText = str4;
                    this.direction = investingCryptoImage;
                    this.graph = investingGraphContentModel;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Chart)) {
                        return false;
                    }
                    Chart chart = (Chart) obj;
                    return Intrinsics.areEqual(this.title, chart.title) && this.formattedBalance.equals(chart.formattedBalance) && this.rawBalance == chart.rawBalance && this.movement.equals(chart.movement) && Intrinsics.areEqual(this.todayText, chart.todayText) && this.direction == chart.direction && Intrinsics.areEqual(this.graph, chart.graph);
                }

                @Override // com.squareup.cash.bitcoin.applets.viewmodels.BitcoinAppletTileModel.Installed.Loaded
                public final InvestingCryptoImage getDirection() {
                    return this.direction;
                }

                @Override // com.squareup.cash.bitcoin.applets.viewmodels.BitcoinAppletTileModel.Installed.Loaded
                public final String getFormattedBalance() {
                    return this.formattedBalance;
                }

                @Override // com.squareup.cash.bitcoin.applets.viewmodels.BitcoinAppletTileModel.Installed.Loaded
                public final String getMovement() {
                    return this.movement;
                }

                @Override // com.squareup.cash.bitcoin.applets.viewmodels.BitcoinAppletTileModel.Installed.Loaded
                public final long getRawBalance() {
                    return this.rawBalance;
                }

                @Override // com.squareup.cash.bitcoin.applets.viewmodels.BitcoinAppletTileModel.Installed
                public final String getTitle() {
                    return this.title;
                }

                @Override // com.squareup.cash.bitcoin.applets.viewmodels.BitcoinAppletTileModel.Installed.Loaded
                public final String getTodayText() {
                    return this.todayText;
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.formattedBalance), 31, this.rawBalance), 31, this.movement), 31, this.todayText);
                    InvestingCryptoImage investingCryptoImage = this.direction;
                    return this.graph.hashCode() + ((m + (investingCryptoImage == null ? 0 : investingCryptoImage.hashCode())) * 31);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Chart(title=", this.title, ", formattedBalance=", this.formattedBalance, ", rawBalance=");
                    Fragment$5$$ExternalSyntheticOutline0.m(this.rawBalance, ", movement=", this.movement, m);
                    m.append(", todayText=");
                    m.append(this.todayText);
                    m.append(", direction=");
                    m.append(this.direction);
                    m.append(", graph=");
                    m.append(this.graph);
                    m.append(")");
                    return m.toString();
                }
            }

            public final class ZeroBalance extends Loaded {
                public final String formattedBalance;
                public final String movement;
                public final String title;
                public final String todayText;

                public ZeroBalance(String str, String str2, String str3, String str4) {
                    re$$ExternalSyntheticOutline0.m1432m(str, str3, str4);
                    this.title = str;
                    this.formattedBalance = str2;
                    this.movement = str3;
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
                    return Intrinsics.areEqual(this.title, zeroBalance.title) && this.formattedBalance.equals(zeroBalance.formattedBalance) && Intrinsics.areEqual(this.movement, zeroBalance.movement) && Intrinsics.areEqual(this.todayText, zeroBalance.todayText);
                }

                @Override // com.squareup.cash.bitcoin.applets.viewmodels.BitcoinAppletTileModel.Installed.Loaded
                public final InvestingCryptoImage getDirection() {
                    return null;
                }

                @Override // com.squareup.cash.bitcoin.applets.viewmodels.BitcoinAppletTileModel.Installed.Loaded
                public final String getFormattedBalance() {
                    return this.formattedBalance;
                }

                @Override // com.squareup.cash.bitcoin.applets.viewmodels.BitcoinAppletTileModel.Installed.Loaded
                public final String getMovement() {
                    return this.movement;
                }

                @Override // com.squareup.cash.bitcoin.applets.viewmodels.BitcoinAppletTileModel.Installed.Loaded
                public final long getRawBalance() {
                    return 0L;
                }

                @Override // com.squareup.cash.bitcoin.applets.viewmodels.BitcoinAppletTileModel.Installed
                public final String getTitle() {
                    return this.title;
                }

                @Override // com.squareup.cash.bitcoin.applets.viewmodels.BitcoinAppletTileModel.Installed.Loaded
                public final String getTodayText() {
                    return this.todayText;
                }

                public final int hashCode() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.formattedBalance), 31, 0L), 31, this.movement), 31, this.todayText);
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ZeroBalance(title=", this.title, ", formattedBalance=", this.formattedBalance, ", rawBalance=0, movement="), this.movement, ", todayText=", this.todayText, ", direction=null)");
                }
            }

            public abstract InvestingCryptoImage getDirection();

            public abstract String getFormattedBalance();

            public abstract String getMovement();

            public abstract long getRawBalance();

            public abstract String getTodayText();
        }

        public final class LoadingPriceMovement extends Installed {
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

            @Override // com.squareup.cash.bitcoin.applets.viewmodels.BitcoinAppletTileModel.Installed
            public final String getTitle() {
                throw null;
            }

            public final int hashCode() {
                return this.title.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LoadingPriceMovement(title=", this.title, ")");
            }
        }

        public abstract String getTitle();
    }

    public final class Loading implements BitcoinAppletTileModel {
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

    public final class Uninstalled implements BitcoinAppletTileModel {
        public final PromotedAppletTileViewModel.Loaded promotedTileModel;
        public final String subtitle;
        public final String title;

        public Uninstalled(String str, String str2, PromotedAppletTileViewModel.Loaded loaded) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.subtitle = str2;
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
            return Intrinsics.areEqual(this.title, uninstalled.title) && Intrinsics.areEqual(this.subtitle, uninstalled.subtitle) && Intrinsics.areEqual(this.promotedTileModel, uninstalled.promotedTileModel);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
            PromotedAppletTileViewModel.Loaded loaded = this.promotedTileModel;
            return m + (loaded == null ? 0 : loaded.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Uninstalled(title=", this.title, ", subtitle=", this.subtitle, ", promotedTileModel=");
            m.append(this.promotedTileModel);
            m.append(")");
            return m.toString();
        }
    }
}
