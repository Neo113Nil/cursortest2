package com.squareup.cash.paymentpad.viewmodels;

import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.tabs.viewmodels.TabToolbarViewModel;
import com.squareup.cash.ui.overlays.viewmodels.AlertBannerViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class HomeViewModel {

    public final class InitialLoading extends HomeViewModel {
        public final boolean hapticsImprovementsEnabled;
        public final MainPaymentPadViewModel mainPaymentPad;
        public final QrButtonPlacement qrButtonPlacement = QrButtonPlacement.NONE;

        public InitialLoading(boolean z, MainPaymentPadViewModel mainPaymentPadViewModel) {
            this.hapticsImprovementsEnabled = z;
            this.mainPaymentPad = mainPaymentPadViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitialLoading)) {
                return false;
            }
            InitialLoading initialLoading = (InitialLoading) obj;
            return this.qrButtonPlacement == initialLoading.qrButtonPlacement && this.hapticsImprovementsEnabled == initialLoading.hapticsImprovementsEnabled && Intrinsics.areEqual(this.mainPaymentPad, initialLoading.mainPaymentPad);
        }

        @Override // com.squareup.cash.paymentpad.viewmodels.HomeViewModel
        public final MainPaymentPadViewModel getMainPaymentPad() {
            return this.mainPaymentPad;
        }

        public final int hashCode() {
            return this.mainPaymentPad.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.qrButtonPlacement.hashCode() * 31, 31, false), 31, this.hapticsImprovementsEnabled);
        }

        public final String toString() {
            return "InitialLoading(qrButtonPlacement=" + this.qrButtonPlacement + ", showNearbyP2pIcon=false, hapticsImprovementsEnabled=" + this.hapticsImprovementsEnabled + ", mainPaymentPad=" + this.mainPaymentPad + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class QrButtonPlacement {
        public static final /* synthetic */ QrButtonPlacement[] $VALUES;
        public static final QrButtonPlacement END;
        public static final QrButtonPlacement NONE;
        public static final QrButtonPlacement START;

        static {
            QrButtonPlacement qrButtonPlacement = new QrButtonPlacement("START", 0);
            START = qrButtonPlacement;
            QrButtonPlacement qrButtonPlacement2 = new QrButtonPlacement("END", 1);
            END = qrButtonPlacement2;
            QrButtonPlacement qrButtonPlacement3 = new QrButtonPlacement("NONE", 2);
            NONE = qrButtonPlacement3;
            $VALUES = new QrButtonPlacement[]{qrButtonPlacement, qrButtonPlacement2, qrButtonPlacement3};
        }

        public static QrButtonPlacement valueOf(String str) {
            return (QrButtonPlacement) Enum.valueOf(QrButtonPlacement.class, str);
        }

        public static QrButtonPlacement[] values() {
            return (QrButtonPlacement[]) $VALUES.clone();
        }
    }

    public final class Ready extends HomeViewModel {
        public final AlertBannerViewModel alertBannerViewModel;
        public final boolean hapticsImprovementsEnabled;
        public final MainPaymentPadViewModel mainPaymentPad;
        public final QrButtonPlacement qrButtonPlacement;
        public final boolean showNearbyP2pIcon;
        public final TabToolbarInternalViewModel toolbarInternalModel;
        public final TabToolbarViewModel toolbarViewModel;

        public Ready(QrButtonPlacement qrButtonPlacement, boolean z, boolean z2, MainPaymentPadViewModel mainPaymentPadViewModel, TabToolbarInternalViewModel tabToolbarInternalViewModel, TabToolbarViewModel tabToolbarViewModel, AlertBannerViewModel alertBannerViewModel) {
            this.qrButtonPlacement = qrButtonPlacement;
            this.showNearbyP2pIcon = z;
            this.hapticsImprovementsEnabled = z2;
            this.mainPaymentPad = mainPaymentPadViewModel;
            this.toolbarInternalModel = tabToolbarInternalViewModel;
            this.toolbarViewModel = tabToolbarViewModel;
            this.alertBannerViewModel = alertBannerViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) obj;
            return this.qrButtonPlacement == ready.qrButtonPlacement && this.showNearbyP2pIcon == ready.showNearbyP2pIcon && this.hapticsImprovementsEnabled == ready.hapticsImprovementsEnabled && this.mainPaymentPad.equals(ready.mainPaymentPad) && this.toolbarInternalModel.equals(ready.toolbarInternalModel) && this.toolbarViewModel.equals(ready.toolbarViewModel) && Intrinsics.areEqual(this.alertBannerViewModel, ready.alertBannerViewModel);
        }

        @Override // com.squareup.cash.paymentpad.viewmodels.HomeViewModel
        public final MainPaymentPadViewModel getMainPaymentPad() {
            return this.mainPaymentPad;
        }

        public final int hashCode() {
            int hashCode = (this.toolbarViewModel.title.hashCode() + ((this.toolbarInternalModel.hashCode() + ((this.mainPaymentPad.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.qrButtonPlacement.hashCode() * 31, 31, this.showNearbyP2pIcon), 31, this.hapticsImprovementsEnabled)) * 31)) * 31)) * 31;
            AlertBannerViewModel alertBannerViewModel = this.alertBannerViewModel;
            return hashCode + (alertBannerViewModel == null ? 0 : alertBannerViewModel.hashCode());
        }

        public final String toString() {
            return "Ready(qrButtonPlacement=" + this.qrButtonPlacement + ", showNearbyP2pIcon=" + this.showNearbyP2pIcon + ", hapticsImprovementsEnabled=" + this.hapticsImprovementsEnabled + ", mainPaymentPad=" + this.mainPaymentPad + ", toolbarInternalModel=" + this.toolbarInternalModel + ", toolbarViewModel=" + this.toolbarViewModel + ", alertBannerViewModel=" + this.alertBannerViewModel + ")";
        }
    }

    public abstract MainPaymentPadViewModel getMainPaymentPad();
}
