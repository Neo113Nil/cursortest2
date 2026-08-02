package com.squareup.cash.benefits.applets.viewmodels;

import com.squareup.cash.benefits.components.viewmodels.GreenStatus;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BankingBenefitsAppletTileModel {

    public final class Failed implements BankingBenefitsAppletTileModel {
        public final IllegalArgumentException cause;
        public final String title;

        public Failed(String str, IllegalArgumentException illegalArgumentException) {
            str.getClass();
            this.title = str;
            this.cause = illegalArgumentException;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) obj;
            return Intrinsics.areEqual(this.title, failed.title) && this.cause.equals(failed.cause);
        }

        @Override // com.squareup.cash.benefits.applets.viewmodels.BankingBenefitsAppletTileModel
        public final boolean getShowInBalanceSection() {
            return false;
        }

        public final int hashCode() {
            return this.cause.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, false);
        }

        public final String toString() {
            return "Failed(title=" + this.title + ", showInBalanceSection=false, cause=" + this.cause + ")";
        }
    }

    public final class Loading implements BankingBenefitsAppletTileModel {
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

        @Override // com.squareup.cash.benefits.applets.viewmodels.BankingBenefitsAppletTileModel
        public final boolean getShowInBalanceSection() {
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loading(title=", this.title, ", showInBalanceSection=false)");
        }
    }

    public final class Uninstalled implements BankingBenefitsAppletTileModel {
        public final GreenStatus greenStatus;
        public final Float previousProgress;
        public final Float progress;
        public final PromotedAppletTileViewModel promotedModel;
        public final Subtitle subtitle;
        public final String title;

        public Uninstalled(String str, PromotedAppletTileViewModel.Loaded loaded, GreenStatus greenStatus, Subtitle subtitle, Float f, Float f2) {
            str.getClass();
            this.title = str;
            this.promotedModel = loaded;
            this.greenStatus = greenStatus;
            this.subtitle = subtitle;
            this.progress = f;
            this.previousProgress = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Uninstalled)) {
                return false;
            }
            Uninstalled uninstalled = (Uninstalled) obj;
            return Intrinsics.areEqual(this.title, uninstalled.title) && Intrinsics.areEqual(this.promotedModel, uninstalled.promotedModel) && this.greenStatus == uninstalled.greenStatus && this.subtitle.equals(uninstalled.subtitle) && Intrinsics.areEqual((Object) this.progress, (Object) uninstalled.progress) && Intrinsics.areEqual((Object) this.previousProgress, (Object) uninstalled.previousProgress);
        }

        @Override // com.squareup.cash.benefits.applets.viewmodels.BankingBenefitsAppletTileModel
        public final boolean getShowInBalanceSection() {
            return false;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, false);
            PromotedAppletTileViewModel promotedAppletTileViewModel = this.promotedModel;
            int hashCode = (this.subtitle.hashCode() + ((this.greenStatus.hashCode() + ((m + (promotedAppletTileViewModel == null ? 0 : promotedAppletTileViewModel.hashCode())) * 31)) * 31)) * 31;
            Float f = this.progress;
            int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
            Float f2 = this.previousProgress;
            return hashCode2 + (f2 != null ? f2.hashCode() : 0);
        }

        public final String toString() {
            return "Uninstalled(title=" + this.title + ", showInBalanceSection=false, promotedModel=" + this.promotedModel + ", greenStatus=" + this.greenStatus + ", subtitle=" + this.subtitle + ", progress=" + this.progress + ", previousProgress=" + this.previousProgress + ")";
        }
    }

    boolean getShowInBalanceSection();
}
