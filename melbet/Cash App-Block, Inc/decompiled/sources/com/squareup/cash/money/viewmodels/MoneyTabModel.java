package com.squareup.cash.money.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.common.viewmodels.NextAvailableCashTag;
import com.squareup.cash.money.viewmodels.api.ViewModel;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.ui.overlays.viewmodels.AlertBannerViewModel;
import com.squareup.protos.franklin.cards.CardTheme;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class MoneyTabModel {

    public final class Loaded extends MoneyTabModel {
        public final AlertBannerViewModel alertBannerViewModel;
        public final boolean attachScrollLogging;
        public final CardTheme.Identifier cardThemeId;
        public final boolean hasCard;
        public final NextAvailableCashTag nextAvailableCashTag;
        public final int scrollToTopTick;
        public final List sectionViewModels;
        public final boolean showCardPeekAnimation;
        public final String tabTitle;
        public final TabToolbarInternalViewModel tabToolbarModel;
        public final boolean trackVisibleIndexes;

        public Loaded(TabToolbarInternalViewModel tabToolbarInternalViewModel, String str, AlertBannerViewModel alertBannerViewModel, List list, int i, boolean z, boolean z2, CardTheme.Identifier identifier, boolean z3, boolean z4, NextAvailableCashTag nextAvailableCashTag) {
            tabToolbarInternalViewModel.getClass();
            list.getClass();
            this.tabToolbarModel = tabToolbarInternalViewModel;
            this.tabTitle = str;
            this.alertBannerViewModel = alertBannerViewModel;
            this.sectionViewModels = list;
            this.scrollToTopTick = i;
            this.trackVisibleIndexes = z;
            this.showCardPeekAnimation = z2;
            this.cardThemeId = identifier;
            this.hasCard = z3;
            this.attachScrollLogging = z4;
            this.nextAvailableCashTag = nextAvailableCashTag;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.tabToolbarModel, loaded.tabToolbarModel) && Intrinsics.areEqual(this.tabTitle, loaded.tabTitle) && Intrinsics.areEqual(this.alertBannerViewModel, loaded.alertBannerViewModel) && Intrinsics.areEqual(this.sectionViewModels, loaded.sectionViewModels) && this.scrollToTopTick == loaded.scrollToTopTick && this.trackVisibleIndexes == loaded.trackVisibleIndexes && this.showCardPeekAnimation == loaded.showCardPeekAnimation && this.cardThemeId == loaded.cardThemeId && this.hasCard == loaded.hasCard && this.attachScrollLogging == loaded.attachScrollLogging && Intrinsics.areEqual(this.nextAvailableCashTag, loaded.nextAvailableCashTag);
        }

        @Override // com.squareup.cash.money.viewmodels.MoneyTabModel
        public final String getTabTitle() {
            return this.tabTitle;
        }

        @Override // com.squareup.cash.money.viewmodels.MoneyTabModel
        public final TabToolbarInternalViewModel getTabToolbarModel() {
            return this.tabToolbarModel;
        }

        public final int hashCode() {
            int hashCode = this.tabToolbarModel.hashCode() * 31;
            String str = this.tabTitle;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            AlertBannerViewModel alertBannerViewModel = this.alertBannerViewModel;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.scrollToTopTick, Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (alertBannerViewModel == null ? 0 : alertBannerViewModel.hashCode())) * 31, 31, this.sectionViewModels), 31), 31, this.trackVisibleIndexes), 31, this.showCardPeekAnimation);
            CardTheme.Identifier identifier = this.cardThemeId;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (identifier == null ? 0 : identifier.hashCode())) * 31, 31, this.hasCard), 31, this.attachScrollLogging);
            NextAvailableCashTag nextAvailableCashTag = this.nextAvailableCashTag;
            return Boolean.hashCode(false) + ((m2 + (nextAvailableCashTag == null ? 0 : nextAvailableCashTag.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(tabToolbarModel=");
            sb.append(this.tabToolbarModel);
            sb.append(", tabTitle=");
            sb.append(this.tabTitle);
            sb.append(", alertBannerViewModel=");
            sb.append(this.alertBannerViewModel);
            sb.append(", sectionViewModels=");
            sb.append(this.sectionViewModels);
            sb.append(", scrollToTopTick=");
            sb.append(this.scrollToTopTick);
            sb.append(", trackVisibleIndexes=");
            sb.append(this.trackVisibleIndexes);
            sb.append(", showCardPeekAnimation=");
            sb.append(this.showCardPeekAnimation);
            sb.append(", cardThemeId=");
            sb.append(this.cardThemeId);
            sb.append(", hasCard=");
            re$$ExternalSyntheticOutline0.m(sb, this.hasCard, ", attachScrollLogging=", this.attachScrollLogging, ", nextAvailableCashTag=");
            sb.append(this.nextAvailableCashTag);
            sb.append(", shouldAnimateHype=false)");
            return sb.toString();
        }
    }

    public final class Loading extends MoneyTabModel {
        public final ViewModel balanceTileViewModel;
        public final String tabTitle;
        public final TabToolbarInternalViewModel tabToolbarModel;
        public final boolean useRedesignedTiles;

        public Loading(TabToolbarInternalViewModel tabToolbarInternalViewModel, String str, ViewModel.ItemList itemList, boolean z) {
            tabToolbarInternalViewModel.getClass();
            this.tabToolbarModel = tabToolbarInternalViewModel;
            this.tabTitle = str;
            this.balanceTileViewModel = itemList;
            this.useRedesignedTiles = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) obj;
            return Intrinsics.areEqual(this.tabToolbarModel, loading.tabToolbarModel) && Intrinsics.areEqual(this.tabTitle, loading.tabTitle) && Intrinsics.areEqual(this.balanceTileViewModel, loading.balanceTileViewModel) && this.useRedesignedTiles == loading.useRedesignedTiles;
        }

        @Override // com.squareup.cash.money.viewmodels.MoneyTabModel
        public final String getTabTitle() {
            return this.tabTitle;
        }

        @Override // com.squareup.cash.money.viewmodels.MoneyTabModel
        public final TabToolbarInternalViewModel getTabToolbarModel() {
            return this.tabToolbarModel;
        }

        public final int hashCode() {
            int hashCode = this.tabToolbarModel.hashCode() * 31;
            String str = this.tabTitle;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            ViewModel viewModel = this.balanceTileViewModel;
            return Boolean.hashCode(this.useRedesignedTiles) + ((hashCode2 + (viewModel != null ? viewModel.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Loading(tabToolbarModel=" + this.tabToolbarModel + ", tabTitle=" + this.tabTitle + ", balanceTileViewModel=" + this.balanceTileViewModel + ", useRedesignedTiles=" + this.useRedesignedTiles + ")";
        }
    }

    public abstract String getTabTitle();

    public abstract TabToolbarInternalViewModel getTabToolbarModel();
}
