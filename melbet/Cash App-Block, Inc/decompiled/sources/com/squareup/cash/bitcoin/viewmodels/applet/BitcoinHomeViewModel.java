package com.squareup.cash.bitcoin.viewmodels.applet;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.bitcoin.viewmodels.applet.toolbar.BitcoinHomeToolbarViewModel;
import java.util.List;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class BitcoinHomeViewModel {

    public final class Loading extends BitcoinHomeViewModel {
        public final BitcoinHomeToolbarViewModel toolbarViewModel;

        public Loading(BitcoinHomeToolbarViewModel bitcoinHomeToolbarViewModel) {
            this.toolbarViewModel = bitcoinHomeToolbarViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && this.toolbarViewModel.equals(((Loading) obj).toolbarViewModel);
        }

        @Override // com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewModel
        public final BitcoinHomeToolbarViewModel getToolbarViewModel() {
            return this.toolbarViewModel;
        }

        public final int hashCode() {
            return this.toolbarViewModel.hashCode();
        }

        public final String toString() {
            return "Loading(toolbarViewModel=" + this.toolbarViewModel + ")";
        }
    }

    public abstract class Ready extends BitcoinHomeViewModel {

        public final class ActiveState extends Ready {
            public final BitcoinHomeToolbarViewModel toolbarViewModel;
            public final Map widgetViewModels;
            public final List widgets;

            public ActiveState(BitcoinHomeToolbarViewModel bitcoinHomeToolbarViewModel, Map map, List list) {
                list.getClass();
                this.toolbarViewModel = bitcoinHomeToolbarViewModel;
                this.widgetViewModels = map;
                this.widgets = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActiveState)) {
                    return false;
                }
                ActiveState activeState = (ActiveState) obj;
                return this.toolbarViewModel.equals(activeState.toolbarViewModel) && this.widgetViewModels.equals(activeState.widgetViewModels) && Intrinsics.areEqual(this.widgets, activeState.widgets);
            }

            @Override // com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewModel
            public final BitcoinHomeToolbarViewModel getToolbarViewModel() {
                return this.toolbarViewModel;
            }

            @Override // com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewModel.Ready
            public final Map getWidgetViewModels() {
                return this.widgetViewModels;
            }

            @Override // com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewModel.Ready
            public final List getWidgets() {
                return this.widgets;
            }

            public final int hashCode() {
                return this.widgets.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.toolbarViewModel.hashCode() * 31, this.widgetViewModels, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ActiveState(toolbarViewModel=");
                sb.append(this.toolbarViewModel);
                sb.append(", widgetViewModels=");
                sb.append(this.widgetViewModels);
                sb.append(", widgets=");
                return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.widgets, ")");
            }
        }

        public final class FamiliesActiveState extends Ready {
            public final BitcoinHomeToolbarViewModel toolbarViewModel;
            public final MapBuilder widgetViewModels;
            public final List widgets;

            public FamiliesActiveState(BitcoinHomeToolbarViewModel bitcoinHomeToolbarViewModel, MapBuilder mapBuilder, List list) {
                list.getClass();
                this.toolbarViewModel = bitcoinHomeToolbarViewModel;
                this.widgetViewModels = mapBuilder;
                this.widgets = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FamiliesActiveState)) {
                    return false;
                }
                FamiliesActiveState familiesActiveState = (FamiliesActiveState) obj;
                return this.toolbarViewModel.equals(familiesActiveState.toolbarViewModel) && this.widgetViewModels.equals(familiesActiveState.widgetViewModels) && Intrinsics.areEqual(this.widgets, familiesActiveState.widgets);
            }

            @Override // com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewModel
            public final BitcoinHomeToolbarViewModel getToolbarViewModel() {
                return this.toolbarViewModel;
            }

            @Override // com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewModel.Ready
            public final Map getWidgetViewModels() {
                return this.widgetViewModels;
            }

            @Override // com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewModel.Ready
            public final List getWidgets() {
                return this.widgets;
            }

            public final int hashCode() {
                return this.widgets.hashCode() + ((this.widgetViewModels.hashCode() + (this.toolbarViewModel.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("FamiliesActiveState(toolbarViewModel=");
                sb.append(this.toolbarViewModel);
                sb.append(", widgetViewModels=");
                sb.append(this.widgetViewModels);
                sb.append(", widgets=");
                return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.widgets, ")");
            }
        }

        public final class FamiliesDisabledState extends Ready {
            public final BitcoinHomeToolbarViewModel toolbarViewModel;
            public final MapBuilder widgetViewModels;
            public final List widgets;

            public FamiliesDisabledState(BitcoinHomeToolbarViewModel bitcoinHomeToolbarViewModel, MapBuilder mapBuilder, List list) {
                list.getClass();
                this.toolbarViewModel = bitcoinHomeToolbarViewModel;
                this.widgetViewModels = mapBuilder;
                this.widgets = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FamiliesDisabledState)) {
                    return false;
                }
                FamiliesDisabledState familiesDisabledState = (FamiliesDisabledState) obj;
                return this.toolbarViewModel.equals(familiesDisabledState.toolbarViewModel) && this.widgetViewModels.equals(familiesDisabledState.widgetViewModels) && Intrinsics.areEqual(this.widgets, familiesDisabledState.widgets);
            }

            @Override // com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewModel
            public final BitcoinHomeToolbarViewModel getToolbarViewModel() {
                return this.toolbarViewModel;
            }

            @Override // com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewModel.Ready
            public final Map getWidgetViewModels() {
                return this.widgetViewModels;
            }

            @Override // com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewModel.Ready
            public final List getWidgets() {
                return this.widgets;
            }

            public final int hashCode() {
                return this.widgets.hashCode() + ((this.widgetViewModels.hashCode() + (this.toolbarViewModel.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("FamiliesDisabledState(toolbarViewModel=");
                sb.append(this.toolbarViewModel);
                sb.append(", widgetViewModels=");
                sb.append(this.widgetViewModels);
                sb.append(", widgets=");
                return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.widgets, ")");
            }
        }

        public final class NullState extends Ready {
            public final BitcoinHomeToolbarViewModel toolbarViewModel;
            public final Map widgetViewModels;
            public final List widgets;

            public NullState(BitcoinHomeToolbarViewModel bitcoinHomeToolbarViewModel, Map map, List list) {
                list.getClass();
                this.toolbarViewModel = bitcoinHomeToolbarViewModel;
                this.widgetViewModels = map;
                this.widgets = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NullState)) {
                    return false;
                }
                NullState nullState = (NullState) obj;
                return Intrinsics.areEqual(this.toolbarViewModel, nullState.toolbarViewModel) && Intrinsics.areEqual(this.widgetViewModels, nullState.widgetViewModels) && Intrinsics.areEqual(this.widgets, nullState.widgets);
            }

            @Override // com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewModel
            public final BitcoinHomeToolbarViewModel getToolbarViewModel() {
                return this.toolbarViewModel;
            }

            @Override // com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewModel.Ready
            public final Map getWidgetViewModels() {
                return this.widgetViewModels;
            }

            @Override // com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewModel.Ready
            public final List getWidgets() {
                return this.widgets;
            }

            public final int hashCode() {
                return this.widgets.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.toolbarViewModel.hashCode() * 31, this.widgetViewModels, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("NullState(toolbarViewModel=");
                sb.append(this.toolbarViewModel);
                sb.append(", widgetViewModels=");
                sb.append(this.widgetViewModels);
                sb.append(", widgets=");
                return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.widgets, ")");
            }
        }

        public abstract Map getWidgetViewModels();

        public abstract List getWidgets();
    }

    public abstract BitcoinHomeToolbarViewModel getToolbarViewModel();
}
