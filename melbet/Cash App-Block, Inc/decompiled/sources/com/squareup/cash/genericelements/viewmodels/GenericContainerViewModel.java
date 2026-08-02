package com.squareup.cash.genericelements.viewmodels;

import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.protos.cash.genericelements.ui.SeriesContainer;
import com.squareup.wire.AndroidMessage;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class GenericContainerViewModel {

    /* loaded from: classes4.dex */
    public final class CardContainerViewModel extends GenericContainerViewModel {
        public final ArrayList components;
        public final Pair margins;

        public CardContainerViewModel(ArrayList arrayList, Pair pair) {
            this.components = arrayList;
            this.margins = pair;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardContainerViewModel)) {
                return false;
            }
            CardContainerViewModel cardContainerViewModel = (CardContainerViewModel) obj;
            return this.components.equals(cardContainerViewModel.components) && this.margins.equals(cardContainerViewModel.margins);
        }

        public final int hashCode() {
            return this.margins.hashCode() + (this.components.hashCode() * 31);
        }

        public final String toString() {
            return "CardContainerViewModel(components=" + this.components + ", margins=" + this.margins + ")";
        }
    }

    /* loaded from: classes4.dex */
    public final class ComponentContainerViewModel extends GenericContainerViewModel {
        public final GenericComponentViewModel component;
        public final Pair margins;

        public ComponentContainerViewModel(GenericComponentViewModel genericComponentViewModel, Pair pair) {
            this.component = genericComponentViewModel;
            this.margins = pair;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ComponentContainerViewModel)) {
                return false;
            }
            ComponentContainerViewModel componentContainerViewModel = (ComponentContainerViewModel) obj;
            return this.component.equals(componentContainerViewModel.component) && this.margins.equals(componentContainerViewModel.margins);
        }

        public final int hashCode() {
            return this.margins.hashCode() + (this.component.hashCode() * 31);
        }

        public final String toString() {
            return "ComponentContainerViewModel(component=" + this.component + ", margins=" + this.margins + ")";
        }
    }

    /* loaded from: classes7.dex */
    public enum ContainerMargin {
        NONE(0),
        SMALL(16),
        MEDIUM(24),
        LARGE(32),
        XLARGE(48);

        public final int value;

        ContainerMargin(int i) {
            this.value = i;
        }
    }

    public final class PlaceholderContainerViewModel extends GenericContainerViewModel {
        public final AndroidMessage decodedProtoData;
        public final Pair margins;

        public PlaceholderContainerViewModel(AndroidMessage androidMessage, Pair pair) {
            this.decodedProtoData = androidMessage;
            this.margins = pair;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlaceholderContainerViewModel)) {
                return false;
            }
            PlaceholderContainerViewModel placeholderContainerViewModel = (PlaceholderContainerViewModel) obj;
            return Intrinsics.areEqual(this.decodedProtoData, placeholderContainerViewModel.decodedProtoData) && this.margins.equals(placeholderContainerViewModel.margins);
        }

        public final int hashCode() {
            AndroidMessage androidMessage = this.decodedProtoData;
            return this.margins.hashCode() + ((androidMessage == null ? 0 : androidMessage.hashCode()) * 31);
        }

        public final String toString() {
            return "PlaceholderContainerViewModel(decodedProtoData=" + this.decodedProtoData + ", margins=" + this.margins + ")";
        }
    }

    public final class SeriesContainerViewModel extends GenericContainerViewModel {
        public final ColorModel backgroundColor;
        public final ArrayList components;
        public final Boolean ignoreVerticalSpacing;
        public final Pair margins;
        public final SeriesContainer.Scroll scroll;
        public final boolean showDropShadow;

        public SeriesContainerViewModel(ArrayList arrayList, SeriesContainer.Scroll scroll, Boolean bool, ColorModel.Accented accented, boolean z, Pair pair) {
            scroll.getClass();
            this.components = arrayList;
            this.scroll = scroll;
            this.ignoreVerticalSpacing = bool;
            this.backgroundColor = accented;
            this.showDropShadow = z;
            this.margins = pair;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SeriesContainerViewModel)) {
                return false;
            }
            SeriesContainerViewModel seriesContainerViewModel = (SeriesContainerViewModel) obj;
            return this.components.equals(seriesContainerViewModel.components) && this.scroll == seriesContainerViewModel.scroll && Intrinsics.areEqual(this.ignoreVerticalSpacing, seriesContainerViewModel.ignoreVerticalSpacing) && Intrinsics.areEqual(this.backgroundColor, seriesContainerViewModel.backgroundColor) && this.showDropShadow == seriesContainerViewModel.showDropShadow && this.margins.equals(seriesContainerViewModel.margins);
        }

        public final int hashCode() {
            int hashCode = (this.scroll.hashCode() + (this.components.hashCode() * 31)) * 31;
            Boolean bool = this.ignoreVerticalSpacing;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            ColorModel colorModel = this.backgroundColor;
            return this.margins.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (colorModel != null ? colorModel.hashCode() : 0)) * 31, 31, this.showDropShadow);
        }

        public final String toString() {
            return "SeriesContainerViewModel(components=" + this.components + ", scroll=" + this.scroll + ", ignoreVerticalSpacing=" + this.ignoreVerticalSpacing + ", backgroundColor=" + this.backgroundColor + ", showDropShadow=" + this.showDropShadow + ", margins=" + this.margins + ")";
        }
    }
}
