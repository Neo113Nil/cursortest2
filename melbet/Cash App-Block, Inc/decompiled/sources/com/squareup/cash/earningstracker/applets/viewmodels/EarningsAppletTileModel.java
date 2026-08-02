package com.squareup.cash.earningstracker.applets.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface EarningsAppletTileModel {

    public final class Failure implements EarningsAppletTileModel {
        public final NullPointerException cause;
        public final String title;

        public Failure(String str, NullPointerException nullPointerException) {
            str.getClass();
            this.title = str;
            this.cause = nullPointerException;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return Intrinsics.areEqual(this.title, failure.title) && this.cause.equals(failure.cause);
        }

        public final int hashCode() {
            return this.cause.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return "Failure(title=" + this.title + ", cause=" + this.cause + ")";
        }
    }

    public interface Installed extends EarningsAppletTileModel {

        public final class Chart implements Installed {
            public final ArrayList chartBars;
            public final String title;
            public final String titleCaption;

            public Chart(String str, String str2, ArrayList arrayList) {
                str.getClass();
                str2.getClass();
                this.title = str;
                this.titleCaption = str2;
                this.chartBars = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Chart)) {
                    return false;
                }
                Chart chart = (Chart) obj;
                return Intrinsics.areEqual(this.title, chart.title) && Intrinsics.areEqual(this.titleCaption, chart.titleCaption) && this.chartBars.equals(chart.chartBars);
            }

            @Override // com.squareup.cash.earningstracker.applets.viewmodels.EarningsAppletTileModel.Installed
            public final String getTitle() {
                return this.title;
            }

            @Override // com.squareup.cash.earningstracker.applets.viewmodels.EarningsAppletTileModel.Installed
            public final String getTitleCaption() {
                return this.titleCaption;
            }

            public final int hashCode() {
                return this.chartBars.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.titleCaption);
            }

            public final String toString() {
                return Recorder$$ExternalSyntheticOutline1.m(")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Chart(title=", this.title, ", titleCaption=", this.titleCaption, ", chartBars="), this.chartBars);
            }
        }

        public final class Default implements Installed {
            public final String title;
            public final String titleCaption;

            public Default(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.title = str;
                this.titleCaption = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Default)) {
                    return false;
                }
                Default r5 = (Default) obj;
                return Intrinsics.areEqual(this.title, r5.title) && Intrinsics.areEqual(this.titleCaption, r5.titleCaption);
            }

            @Override // com.squareup.cash.earningstracker.applets.viewmodels.EarningsAppletTileModel.Installed
            public final String getTitle() {
                return this.title;
            }

            @Override // com.squareup.cash.earningstracker.applets.viewmodels.EarningsAppletTileModel.Installed
            public final String getTitleCaption() {
                return this.titleCaption;
            }

            public final int hashCode() {
                return this.titleCaption.hashCode() + (this.title.hashCode() * 31);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("Default(title=", this.title, ", titleCaption=", this.titleCaption, ")");
            }
        }

        String getTitle();

        String getTitleCaption();
    }

    public final class Uninstalled implements EarningsAppletTileModel {
        public final PromotedAppletTileViewModel promotedModel;
        public final String subtitle;
        public final String title;

        public Uninstalled(String str, String str2, PromotedAppletTileViewModel.Loaded loaded) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.subtitle = str2;
            this.promotedModel = loaded;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Uninstalled)) {
                return false;
            }
            Uninstalled uninstalled = (Uninstalled) obj;
            return Intrinsics.areEqual(this.title, uninstalled.title) && Intrinsics.areEqual(this.subtitle, uninstalled.subtitle) && Intrinsics.areEqual(this.promotedModel, uninstalled.promotedModel);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
            PromotedAppletTileViewModel promotedAppletTileViewModel = this.promotedModel;
            return m + (promotedAppletTileViewModel == null ? 0 : promotedAppletTileViewModel.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Uninstalled(title=", this.title, ", subtitle=", this.subtitle, ", promotedModel=");
            m.append(this.promotedModel);
            m.append(")");
            return m.toString();
        }
    }
}
