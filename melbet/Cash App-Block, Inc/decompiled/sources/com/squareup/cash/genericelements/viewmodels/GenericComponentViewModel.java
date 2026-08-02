package com.squareup.cash.genericelements.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.play.integrity.internal.aj;
import com.google.android.play.integrity.internal.ak;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent;
import com.squareup.protos.cash.genericelements.ui.ArcadeTextElement;
import com.squareup.protos.cash.genericelements.ui.ButtonCtaGroupComponent;
import com.squareup.protos.cash.genericelements.ui.CellDefaultComponent;
import com.squareup.protos.cash.genericelements.ui.ColumnWidth;
import com.squareup.protos.cash.genericelements.ui.ListUnorderedComponent;
import com.squareup.protos.cash.genericelements.ui.VerticalAlignment;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class GenericComponentViewModel {

    public final class BaseCardViewModel extends GenericComponentViewModel {
        public final ColorModel.Accented backgroundColor;
        public final ArrayList elements;
        public final GenericTreeElementsViewEvent event;
        public final boolean showDropShadow;
        public final GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent;

        public BaseCardViewModel(ArrayList arrayList, ColorModel.Accented accented, boolean z, GenericTreeElementsViewEvent genericTreeElementsViewEvent, GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent) {
            this.elements = arrayList;
            this.backgroundColor = accented;
            this.showDropShadow = z;
            this.event = genericTreeElementsViewEvent;
            this.viewAnalyticsEvent = viewAnalyticsEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BaseCardViewModel)) {
                return false;
            }
            BaseCardViewModel baseCardViewModel = (BaseCardViewModel) obj;
            return this.elements.equals(baseCardViewModel.elements) && this.backgroundColor.equals(baseCardViewModel.backgroundColor) && this.showDropShadow == baseCardViewModel.showDropShadow && Intrinsics.areEqual(this.event, baseCardViewModel.event) && Intrinsics.areEqual(this.viewAnalyticsEvent, baseCardViewModel.viewAnalyticsEvent);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(SVG$Unit$EnumUnboxingLocalUtility.m(this.backgroundColor.color, this.elements.hashCode() * 31, 31), 31, this.showDropShadow);
            GenericTreeElementsViewEvent genericTreeElementsViewEvent = this.event;
            int hashCode = (m + (genericTreeElementsViewEvent == null ? 0 : genericTreeElementsViewEvent.hashCode())) * 31;
            GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent = this.viewAnalyticsEvent;
            return hashCode + (viewAnalyticsEvent != null ? viewAnalyticsEvent.analyticsData.hashCode() : 0);
        }

        public final String toString() {
            return "BaseCardViewModel(elements=" + this.elements + ", backgroundColor=" + this.backgroundColor + ", showDropShadow=" + this.showDropShadow + ", event=" + this.event + ", viewAnalyticsEvent=" + this.viewAnalyticsEvent + ")";
        }
    }

    /* loaded from: classes9.dex */
    public final class ButtonCtaGroupViewModel extends GenericComponentViewModel {
        public final ArrayList buttons;
        public final ButtonCtaGroupComponent.Direction direction;
        public final boolean showDivider;
        public final String text;

        public ButtonCtaGroupViewModel(ButtonCtaGroupComponent.Direction direction, String str, ArrayList arrayList, boolean z) {
            this.direction = direction;
            this.text = str;
            this.buttons = arrayList;
            this.showDivider = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonCtaGroupViewModel)) {
                return false;
            }
            ButtonCtaGroupViewModel buttonCtaGroupViewModel = (ButtonCtaGroupViewModel) obj;
            return this.direction == buttonCtaGroupViewModel.direction && Intrinsics.areEqual(this.text, buttonCtaGroupViewModel.text) && this.buttons.equals(buttonCtaGroupViewModel.buttons) && this.showDivider == buttonCtaGroupViewModel.showDivider;
        }

        public final int hashCode() {
            int hashCode = this.direction.hashCode() * 31;
            String str = this.text;
            return Boolean.hashCode(this.showDivider) + CameraState$Type$EnumUnboxingLocalUtility.m(this.buttons, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        }

        public final String toString() {
            return "ButtonCtaGroupViewModel(direction=" + this.direction + ", text=" + this.text + ", buttons=" + this.buttons + ", showDivider=" + this.showDivider + ")";
        }
    }

    public final class CellActivityViewModel extends GenericComponentViewModel {
        public final aj accessory;
        public final GenericBaseViewModel avatar;
        public final String body;
        public final String body2;
        public final boolean centerContentVertically;
        public final GenericTreeElementsViewEvent event;
        public final String label;
        public final GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent;

        public CellActivityViewModel(GenericBaseViewModel genericBaseViewModel, String str, aj ajVar, GenericTreeElementsViewEvent genericTreeElementsViewEvent, String str2, String str3, boolean z, GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent) {
            str.getClass();
            this.avatar = genericBaseViewModel;
            this.label = str;
            this.accessory = ajVar;
            this.event = genericTreeElementsViewEvent;
            this.body = str2;
            this.body2 = str3;
            this.centerContentVertically = z;
            this.viewAnalyticsEvent = viewAnalyticsEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CellActivityViewModel)) {
                return false;
            }
            CellActivityViewModel cellActivityViewModel = (CellActivityViewModel) obj;
            return Intrinsics.areEqual(this.avatar, cellActivityViewModel.avatar) && Intrinsics.areEqual(this.label, cellActivityViewModel.label) && Intrinsics.areEqual(this.accessory, cellActivityViewModel.accessory) && Intrinsics.areEqual(this.event, cellActivityViewModel.event) && Intrinsics.areEqual(this.body, cellActivityViewModel.body) && Intrinsics.areEqual(this.body2, cellActivityViewModel.body2) && this.centerContentVertically == cellActivityViewModel.centerContentVertically && Intrinsics.areEqual(this.viewAnalyticsEvent, cellActivityViewModel.viewAnalyticsEvent);
        }

        public final int hashCode() {
            GenericBaseViewModel genericBaseViewModel = this.avatar;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((genericBaseViewModel == null ? 0 : genericBaseViewModel.hashCode()) * 31, 31, this.label);
            aj ajVar = this.accessory;
            int hashCode = (m + (ajVar == null ? 0 : ajVar.hashCode())) * 31;
            GenericTreeElementsViewEvent genericTreeElementsViewEvent = this.event;
            int hashCode2 = (hashCode + (genericTreeElementsViewEvent == null ? 0 : genericTreeElementsViewEvent.hashCode())) * 31;
            String str = this.body;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.body2;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.centerContentVertically);
            GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent = this.viewAnalyticsEvent;
            return m2 + (viewAnalyticsEvent != null ? viewAnalyticsEvent.analyticsData.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CellActivityViewModel(avatar=");
            sb.append(this.avatar);
            sb.append(", label=");
            sb.append(this.label);
            sb.append(", accessory=");
            sb.append(this.accessory);
            sb.append(", event=");
            sb.append(this.event);
            sb.append(", body=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.body, ", body2=", this.body2, ", centerContentVertically=");
            sb.append(this.centerContentVertically);
            sb.append(", viewAnalyticsEvent=");
            sb.append(this.viewAnalyticsEvent);
            sb.append(")");
            return sb.toString();
        }
    }

    public final class CellDefaultViewModel extends GenericComponentViewModel {
        public final ak accessory;
        public final String body;
        public final ArcadeTextElement.SemanticTextColor bodyColor;
        public final GenericTreeElementsViewEvent event;
        public final GenericBaseViewModel icon;
        public final ColorModel iconBackground;
        public final String iconDescription;
        public final String iconId;
        public final ColorModel iconTint;
        public final String label;

        /* renamed from: type, reason: collision with root package name */
        public final CellDefaultComponent.Type f1137type;

        public CellDefaultViewModel(GenericTreeElementsViewEvent genericTreeElementsViewEvent, GenericBaseViewModel genericBaseViewModel, String str, String str2, ColorModel.Accented accented, ColorModel.Accented accented2, String str3, String str4, ArcadeTextElement.SemanticTextColor semanticTextColor, ak akVar, CellDefaultComponent.Type type2) {
            this.event = genericTreeElementsViewEvent;
            this.icon = genericBaseViewModel;
            this.iconId = str;
            this.iconDescription = str2;
            this.iconTint = accented;
            this.iconBackground = accented2;
            this.label = str3;
            this.body = str4;
            this.bodyColor = semanticTextColor;
            this.accessory = akVar;
            this.f1137type = type2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CellDefaultViewModel)) {
                return false;
            }
            CellDefaultViewModel cellDefaultViewModel = (CellDefaultViewModel) obj;
            return Intrinsics.areEqual(this.event, cellDefaultViewModel.event) && Intrinsics.areEqual(this.icon, cellDefaultViewModel.icon) && Intrinsics.areEqual(this.iconId, cellDefaultViewModel.iconId) && Intrinsics.areEqual(this.iconDescription, cellDefaultViewModel.iconDescription) && Intrinsics.areEqual(this.iconTint, cellDefaultViewModel.iconTint) && Intrinsics.areEqual(this.iconBackground, cellDefaultViewModel.iconBackground) && Intrinsics.areEqual(this.label, cellDefaultViewModel.label) && Intrinsics.areEqual(this.body, cellDefaultViewModel.body) && this.bodyColor == cellDefaultViewModel.bodyColor && Intrinsics.areEqual(this.accessory, cellDefaultViewModel.accessory) && this.f1137type == cellDefaultViewModel.f1137type;
        }

        public final int hashCode() {
            GenericTreeElementsViewEvent genericTreeElementsViewEvent = this.event;
            int hashCode = (genericTreeElementsViewEvent == null ? 0 : genericTreeElementsViewEvent.hashCode()) * 31;
            GenericBaseViewModel genericBaseViewModel = this.icon;
            int hashCode2 = (hashCode + (genericBaseViewModel == null ? 0 : genericBaseViewModel.hashCode())) * 31;
            String str = this.iconId;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.iconDescription;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            ColorModel colorModel = this.iconTint;
            int hashCode5 = (hashCode4 + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
            ColorModel colorModel2 = this.iconBackground;
            int hashCode6 = (hashCode5 + (colorModel2 == null ? 0 : colorModel2.hashCode())) * 31;
            String str3 = this.label;
            int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.body;
            int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            ArcadeTextElement.SemanticTextColor semanticTextColor = this.bodyColor;
            int hashCode9 = (hashCode8 + (semanticTextColor == null ? 0 : semanticTextColor.hashCode())) * 31;
            ak akVar = this.accessory;
            return this.f1137type.hashCode() + ((hashCode9 + (akVar != null ? akVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CellDefaultViewModel(event=");
            sb.append(this.event);
            sb.append(", icon=");
            sb.append(this.icon);
            sb.append(", iconId=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.iconId, ", iconDescription=", this.iconDescription, ", iconTint=");
            sb.append(this.iconTint);
            sb.append(", iconBackground=");
            sb.append(this.iconBackground);
            sb.append(", label=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.label, ", body=", this.body, ", bodyColor=");
            sb.append(this.bodyColor);
            sb.append(", accessory=");
            sb.append(this.accessory);
            sb.append(", type=");
            sb.append(this.f1137type);
            sb.append(")");
            return sb.toString();
        }
    }

    public final class CompactCardViewModel extends GenericComponentViewModel {
        public final ColorModel.Accented backgroundColor;
        public final GenericBaseViewModel.TextViewModel description;
        public final GenericTreeElementsViewEvent event;
        public final TwoColumnViewModel header;
        public final boolean showDropShadow;
        public final GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent;

        public CompactCardViewModel(TwoColumnViewModel twoColumnViewModel, GenericBaseViewModel.TextViewModel textViewModel, ColorModel.Accented accented, boolean z, GenericTreeElementsViewEvent genericTreeElementsViewEvent, GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent) {
            this.header = twoColumnViewModel;
            this.description = textViewModel;
            this.backgroundColor = accented;
            this.showDropShadow = z;
            this.event = genericTreeElementsViewEvent;
            this.viewAnalyticsEvent = viewAnalyticsEvent;
            if (twoColumnViewModel == null && textViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CompactCardViewModel)) {
                return false;
            }
            CompactCardViewModel compactCardViewModel = (CompactCardViewModel) obj;
            return Intrinsics.areEqual(this.header, compactCardViewModel.header) && Intrinsics.areEqual(this.description, compactCardViewModel.description) && this.backgroundColor.equals(compactCardViewModel.backgroundColor) && this.showDropShadow == compactCardViewModel.showDropShadow && Intrinsics.areEqual(this.event, compactCardViewModel.event) && Intrinsics.areEqual(this.viewAnalyticsEvent, compactCardViewModel.viewAnalyticsEvent);
        }

        public final int hashCode() {
            TwoColumnViewModel twoColumnViewModel = this.header;
            int hashCode = (twoColumnViewModel == null ? 0 : twoColumnViewModel.hashCode()) * 31;
            GenericBaseViewModel.TextViewModel textViewModel = this.description;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(SVG$Unit$EnumUnboxingLocalUtility.m(this.backgroundColor.color, (hashCode + (textViewModel == null ? 0 : textViewModel.hashCode())) * 31, 31), 31, this.showDropShadow);
            GenericTreeElementsViewEvent genericTreeElementsViewEvent = this.event;
            int hashCode2 = (m + (genericTreeElementsViewEvent == null ? 0 : genericTreeElementsViewEvent.hashCode())) * 31;
            GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent = this.viewAnalyticsEvent;
            return hashCode2 + (viewAnalyticsEvent != null ? viewAnalyticsEvent.analyticsData.hashCode() : 0);
        }

        public final String toString() {
            return "CompactCardViewModel(header=" + this.header + ", description=" + this.description + ", backgroundColor=" + this.backgroundColor + ", showDropShadow=" + this.showDropShadow + ", event=" + this.event + ", viewAnalyticsEvent=" + this.viewAnalyticsEvent + ")";
        }
    }

    public final class CompactInfoViewModel extends GenericComponentViewModel {
        public final GenericBaseViewModel.TextViewModel description;
        public final TwoColumnViewModel header;
        public final GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent;

        public CompactInfoViewModel(TwoColumnViewModel twoColumnViewModel, GenericBaseViewModel.TextViewModel textViewModel, GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent) {
            this.header = twoColumnViewModel;
            this.description = textViewModel;
            this.viewAnalyticsEvent = viewAnalyticsEvent;
            if (twoColumnViewModel == null && textViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CompactInfoViewModel)) {
                return false;
            }
            CompactInfoViewModel compactInfoViewModel = (CompactInfoViewModel) obj;
            return Intrinsics.areEqual(this.header, compactInfoViewModel.header) && Intrinsics.areEqual(this.description, compactInfoViewModel.description) && Intrinsics.areEqual(this.viewAnalyticsEvent, compactInfoViewModel.viewAnalyticsEvent);
        }

        public final int hashCode() {
            TwoColumnViewModel twoColumnViewModel = this.header;
            int hashCode = (twoColumnViewModel == null ? 0 : twoColumnViewModel.hashCode()) * 31;
            GenericBaseViewModel.TextViewModel textViewModel = this.description;
            int hashCode2 = (hashCode + (textViewModel == null ? 0 : textViewModel.hashCode())) * 31;
            GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent = this.viewAnalyticsEvent;
            return hashCode2 + (viewAnalyticsEvent != null ? viewAnalyticsEvent.analyticsData.hashCode() : 0);
        }

        public final String toString() {
            return "CompactInfoViewModel(header=" + this.header + ", description=" + this.description + ", viewAnalyticsEvent=" + this.viewAnalyticsEvent + ")";
        }
    }

    public final class DetailedCardViewModel extends GenericComponentViewModel {
        public final ColorModel.Accented backgroundColor;
        public final GenericBaseViewModel body;
        public final GenericTreeElementsViewEvent event;
        public final TwoColumnViewModel header;
        public final boolean showDropShadow;
        public final GenericBaseViewModel title;
        public final GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent;

        public DetailedCardViewModel(TwoColumnViewModel twoColumnViewModel, GenericBaseViewModel genericBaseViewModel, GenericBaseViewModel genericBaseViewModel2, ColorModel.Accented accented, boolean z, GenericTreeElementsViewEvent genericTreeElementsViewEvent, GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent) {
            this.header = twoColumnViewModel;
            this.title = genericBaseViewModel;
            this.body = genericBaseViewModel2;
            this.backgroundColor = accented;
            this.showDropShadow = z;
            this.event = genericTreeElementsViewEvent;
            this.viewAnalyticsEvent = viewAnalyticsEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DetailedCardViewModel)) {
                return false;
            }
            DetailedCardViewModel detailedCardViewModel = (DetailedCardViewModel) obj;
            return Intrinsics.areEqual(this.header, detailedCardViewModel.header) && Intrinsics.areEqual(this.title, detailedCardViewModel.title) && Intrinsics.areEqual(this.body, detailedCardViewModel.body) && this.backgroundColor.equals(detailedCardViewModel.backgroundColor) && this.showDropShadow == detailedCardViewModel.showDropShadow && Intrinsics.areEqual(this.event, detailedCardViewModel.event) && Intrinsics.areEqual(this.viewAnalyticsEvent, detailedCardViewModel.viewAnalyticsEvent);
        }

        public final int hashCode() {
            TwoColumnViewModel twoColumnViewModel = this.header;
            int hashCode = (twoColumnViewModel == null ? 0 : twoColumnViewModel.hashCode()) * 31;
            GenericBaseViewModel genericBaseViewModel = this.title;
            int hashCode2 = (hashCode + (genericBaseViewModel == null ? 0 : genericBaseViewModel.hashCode())) * 31;
            GenericBaseViewModel genericBaseViewModel2 = this.body;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(SVG$Unit$EnumUnboxingLocalUtility.m(this.backgroundColor.color, (hashCode2 + (genericBaseViewModel2 == null ? 0 : genericBaseViewModel2.hashCode())) * 31, 31), 31, this.showDropShadow);
            GenericTreeElementsViewEvent genericTreeElementsViewEvent = this.event;
            int hashCode3 = (m + (genericTreeElementsViewEvent == null ? 0 : genericTreeElementsViewEvent.hashCode())) * 31;
            GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent = this.viewAnalyticsEvent;
            return hashCode3 + (viewAnalyticsEvent != null ? viewAnalyticsEvent.analyticsData.hashCode() : 0);
        }

        public final String toString() {
            return "DetailedCardViewModel(header=" + this.header + ", title=" + this.title + ", body=" + this.body + ", backgroundColor=" + this.backgroundColor + ", showDropShadow=" + this.showDropShadow + ", event=" + this.event + ", viewAnalyticsEvent=" + this.viewAnalyticsEvent + ")";
        }
    }

    public final class FullWidthViewModel extends GenericComponentViewModel {
        public final GenericBaseViewModel model;
        public final GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent;

        public FullWidthViewModel(GenericBaseViewModel genericBaseViewModel, GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent) {
            this.model = genericBaseViewModel;
            this.viewAnalyticsEvent = viewAnalyticsEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FullWidthViewModel)) {
                return false;
            }
            FullWidthViewModel fullWidthViewModel = (FullWidthViewModel) obj;
            return this.model.equals(fullWidthViewModel.model) && Intrinsics.areEqual(this.viewAnalyticsEvent, fullWidthViewModel.viewAnalyticsEvent);
        }

        public final int hashCode() {
            int hashCode = this.model.hashCode() * 31;
            GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent = this.viewAnalyticsEvent;
            return hashCode + (viewAnalyticsEvent == null ? 0 : viewAnalyticsEvent.analyticsData.hashCode());
        }

        public final String toString() {
            return "FullWidthViewModel(model=" + this.model + ", viewAnalyticsEvent=" + this.viewAnalyticsEvent + ")";
        }
    }

    /* loaded from: classes9.dex */
    public final class ListUnorderedViewModel extends GenericComponentViewModel {
        public final ArrayList items;
        public final ListUnorderedComponent.Style style;

        /* loaded from: classes6.dex */
        public final class ListUnorderedItem {
            public final String iconId;
            public final String label;
            public final String value;

            public ListUnorderedItem(String str, String str2, String str3) {
                str.getClass();
                this.label = str;
                this.value = str2;
                this.iconId = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ListUnorderedItem)) {
                    return false;
                }
                ListUnorderedItem listUnorderedItem = (ListUnorderedItem) obj;
                return Intrinsics.areEqual(this.label, listUnorderedItem.label) && Intrinsics.areEqual(this.value, listUnorderedItem.value) && Intrinsics.areEqual(this.iconId, listUnorderedItem.iconId);
            }

            public final int hashCode() {
                int hashCode = this.label.hashCode() * 31;
                String str = this.value;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.iconId;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ListUnorderedItem(label=", this.label, ", value=", this.value, ", iconId="), this.iconId, ")");
            }
        }

        public ListUnorderedViewModel(ListUnorderedComponent.Style style, ArrayList arrayList) {
            this.style = style;
            this.items = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListUnorderedViewModel)) {
                return false;
            }
            ListUnorderedViewModel listUnorderedViewModel = (ListUnorderedViewModel) obj;
            return this.style == listUnorderedViewModel.style && this.items.equals(listUnorderedViewModel.items);
        }

        public final int hashCode() {
            return this.items.hashCode() + (this.style.hashCode() * 31);
        }

        public final String toString() {
            return "ListUnorderedViewModel(style=" + this.style + ", items=" + this.items + ")";
        }
    }

    public final class SectionHeaderViewModel extends GenericComponentViewModel {
        public final String actionText;
        public final String body;
        public final GenericTreeElementsViewEvent event;
        public final String title;
        public final GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent;

        public SectionHeaderViewModel(String str, String str2, GenericTreeElementsViewEvent genericTreeElementsViewEvent, String str3, GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent) {
            str.getClass();
            this.title = str;
            this.actionText = str2;
            this.event = genericTreeElementsViewEvent;
            this.body = str3;
            this.viewAnalyticsEvent = viewAnalyticsEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SectionHeaderViewModel)) {
                return false;
            }
            SectionHeaderViewModel sectionHeaderViewModel = (SectionHeaderViewModel) obj;
            return Intrinsics.areEqual(this.title, sectionHeaderViewModel.title) && Intrinsics.areEqual(this.actionText, sectionHeaderViewModel.actionText) && Intrinsics.areEqual(this.event, sectionHeaderViewModel.event) && Intrinsics.areEqual(this.body, sectionHeaderViewModel.body) && Intrinsics.areEqual(this.viewAnalyticsEvent, sectionHeaderViewModel.viewAnalyticsEvent);
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.actionText;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            GenericTreeElementsViewEvent genericTreeElementsViewEvent = this.event;
            int hashCode3 = (hashCode2 + (genericTreeElementsViewEvent == null ? 0 : genericTreeElementsViewEvent.hashCode())) * 31;
            String str2 = this.body;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent = this.viewAnalyticsEvent;
            return hashCode4 + (viewAnalyticsEvent != null ? viewAnalyticsEvent.analyticsData.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SectionHeaderViewModel(title=", this.title, ", actionText=", this.actionText, ", event=");
            m.append(this.event);
            m.append(", body=");
            m.append(this.body);
            m.append(", viewAnalyticsEvent=");
            m.append(this.viewAnalyticsEvent);
            m.append(")");
            return m.toString();
        }
    }

    public final class TwoColumnCardViewModel extends GenericComponentViewModel {
        public final ColorModel backgroundColor;
        public final ColumnWidth columnWidth;
        public final GenericTreeElementsViewEvent event;
        public final TwoColumnViewModel header;
        public final ArrayList left;
        public final ArrayList right;
        public final boolean showDropShadow;
        public final Spacing spacingBetween;
        public final VerticalAlignment verticalAlignment;
        public final GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent;

        /* loaded from: classes9.dex */
        public enum Spacing {
            SMALL(8),
            LARGE(16);

            public final int value;

            Spacing(int i) {
                this.value = i;
            }
        }

        public TwoColumnCardViewModel(TwoColumnViewModel twoColumnViewModel, ArrayList arrayList, ArrayList arrayList2, ColumnWidth columnWidth, ColorModel.Accented accented, boolean z, Spacing spacing, VerticalAlignment verticalAlignment, GenericTreeElementsViewEvent genericTreeElementsViewEvent, GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent) {
            this.header = twoColumnViewModel;
            this.left = arrayList;
            this.right = arrayList2;
            this.columnWidth = columnWidth;
            this.backgroundColor = accented;
            this.showDropShadow = z;
            this.spacingBetween = spacing;
            this.verticalAlignment = verticalAlignment;
            this.event = genericTreeElementsViewEvent;
            this.viewAnalyticsEvent = viewAnalyticsEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TwoColumnCardViewModel)) {
                return false;
            }
            TwoColumnCardViewModel twoColumnCardViewModel = (TwoColumnCardViewModel) obj;
            return Intrinsics.areEqual(this.header, twoColumnCardViewModel.header) && this.left.equals(twoColumnCardViewModel.left) && this.right.equals(twoColumnCardViewModel.right) && this.columnWidth == twoColumnCardViewModel.columnWidth && Intrinsics.areEqual(this.backgroundColor, twoColumnCardViewModel.backgroundColor) && this.showDropShadow == twoColumnCardViewModel.showDropShadow && this.spacingBetween == twoColumnCardViewModel.spacingBetween && this.verticalAlignment == twoColumnCardViewModel.verticalAlignment && Intrinsics.areEqual(this.event, twoColumnCardViewModel.event) && Intrinsics.areEqual(this.viewAnalyticsEvent, twoColumnCardViewModel.viewAnalyticsEvent);
        }

        public final int hashCode() {
            TwoColumnViewModel twoColumnViewModel = this.header;
            int hashCode = (this.columnWidth.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.right, CameraState$Type$EnumUnboxingLocalUtility.m(this.left, (twoColumnViewModel == null ? 0 : twoColumnViewModel.hashCode()) * 31, 31), 31)) * 31;
            ColorModel colorModel = this.backgroundColor;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (colorModel == null ? 0 : colorModel.hashCode())) * 31, 31, this.showDropShadow);
            Spacing spacing = this.spacingBetween;
            int hashCode2 = (this.verticalAlignment.hashCode() + ((m + (spacing == null ? 0 : spacing.hashCode())) * 31)) * 31;
            GenericTreeElementsViewEvent genericTreeElementsViewEvent = this.event;
            int hashCode3 = (hashCode2 + (genericTreeElementsViewEvent == null ? 0 : genericTreeElementsViewEvent.hashCode())) * 31;
            GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent = this.viewAnalyticsEvent;
            return hashCode3 + (viewAnalyticsEvent != null ? viewAnalyticsEvent.analyticsData.hashCode() : 0);
        }

        public final String toString() {
            return "TwoColumnCardViewModel(header=" + this.header + ", left=" + this.left + ", right=" + this.right + ", columnWidth=" + this.columnWidth + ", backgroundColor=" + this.backgroundColor + ", showDropShadow=" + this.showDropShadow + ", spacingBetween=" + this.spacingBetween + ", verticalAlignment=" + this.verticalAlignment + ", event=" + this.event + ", viewAnalyticsEvent=" + this.viewAnalyticsEvent + ")";
        }
    }

    public final class TwoColumnRowViewModel extends GenericComponentViewModel {
        public final ColumnWidth columnWidth;
        public final GenericTreeElementsViewEvent event;
        public final ArrayList left;
        public final ArrayList right;
        public final Spacing spacingBetween;
        public final VerticalAlignment verticalAlignment;
        public final GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent;

        /* loaded from: classes9.dex */
        public enum Spacing {
            SMALL(8),
            LARGE(16);

            public final int value;

            Spacing(int i) {
                this.value = i;
            }
        }

        public TwoColumnRowViewModel(ArrayList arrayList, ArrayList arrayList2, ColumnWidth columnWidth, Spacing spacing, VerticalAlignment verticalAlignment, GenericTreeElementsViewEvent genericTreeElementsViewEvent, GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent) {
            this.left = arrayList;
            this.right = arrayList2;
            this.columnWidth = columnWidth;
            this.spacingBetween = spacing;
            this.verticalAlignment = verticalAlignment;
            this.event = genericTreeElementsViewEvent;
            this.viewAnalyticsEvent = viewAnalyticsEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TwoColumnRowViewModel)) {
                return false;
            }
            TwoColumnRowViewModel twoColumnRowViewModel = (TwoColumnRowViewModel) obj;
            return this.left.equals(twoColumnRowViewModel.left) && this.right.equals(twoColumnRowViewModel.right) && this.columnWidth == twoColumnRowViewModel.columnWidth && this.spacingBetween == twoColumnRowViewModel.spacingBetween && this.verticalAlignment == twoColumnRowViewModel.verticalAlignment && Intrinsics.areEqual(this.event, twoColumnRowViewModel.event) && Intrinsics.areEqual(this.viewAnalyticsEvent, twoColumnRowViewModel.viewAnalyticsEvent);
        }

        public final int hashCode() {
            int hashCode = (this.columnWidth.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.right, this.left.hashCode() * 31, 31)) * 31;
            Spacing spacing = this.spacingBetween;
            int hashCode2 = (this.verticalAlignment.hashCode() + ((hashCode + (spacing == null ? 0 : spacing.hashCode())) * 31)) * 31;
            GenericTreeElementsViewEvent genericTreeElementsViewEvent = this.event;
            int hashCode3 = (hashCode2 + (genericTreeElementsViewEvent == null ? 0 : genericTreeElementsViewEvent.hashCode())) * 31;
            GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent = this.viewAnalyticsEvent;
            return hashCode3 + (viewAnalyticsEvent != null ? viewAnalyticsEvent.analyticsData.hashCode() : 0);
        }

        public final String toString() {
            return "TwoColumnRowViewModel(left=" + this.left + ", right=" + this.right + ", columnWidth=" + this.columnWidth + ", spacingBetween=" + this.spacingBetween + ", verticalAlignment=" + this.verticalAlignment + ", event=" + this.event + ", viewAnalyticsEvent=" + this.viewAnalyticsEvent + ")";
        }
    }

    public final class TwoColumnViewModel extends GenericComponentViewModel {
        public final ColumnWidth columnWidth;
        public final GenericBaseViewModel left;
        public final GenericBaseViewModel right;
        public final Spacing spacingBetween;
        public final GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent;

        /* loaded from: classes9.dex */
        public enum Spacing {
            SMALL(8),
            LARGE(16);

            public final int value;

            Spacing(int i) {
                this.value = i;
            }
        }

        public TwoColumnViewModel(GenericBaseViewModel genericBaseViewModel, GenericBaseViewModel genericBaseViewModel2, ColumnWidth columnWidth, Spacing spacing, GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent) {
            this.left = genericBaseViewModel;
            this.right = genericBaseViewModel2;
            this.columnWidth = columnWidth;
            this.spacingBetween = spacing;
            this.viewAnalyticsEvent = viewAnalyticsEvent;
            if (genericBaseViewModel == null && genericBaseViewModel2 == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TwoColumnViewModel)) {
                return false;
            }
            TwoColumnViewModel twoColumnViewModel = (TwoColumnViewModel) obj;
            return Intrinsics.areEqual(this.left, twoColumnViewModel.left) && Intrinsics.areEqual(this.right, twoColumnViewModel.right) && this.columnWidth == twoColumnViewModel.columnWidth && this.spacingBetween == twoColumnViewModel.spacingBetween && Intrinsics.areEqual(this.viewAnalyticsEvent, twoColumnViewModel.viewAnalyticsEvent);
        }

        public final int hashCode() {
            GenericBaseViewModel genericBaseViewModel = this.left;
            int hashCode = (genericBaseViewModel == null ? 0 : genericBaseViewModel.hashCode()) * 31;
            GenericBaseViewModel genericBaseViewModel2 = this.right;
            int hashCode2 = (this.columnWidth.hashCode() + ((hashCode + (genericBaseViewModel2 == null ? 0 : genericBaseViewModel2.hashCode())) * 31)) * 31;
            Spacing spacing = this.spacingBetween;
            int hashCode3 = (hashCode2 + (spacing == null ? 0 : spacing.hashCode())) * 31;
            GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent = this.viewAnalyticsEvent;
            return hashCode3 + (viewAnalyticsEvent != null ? viewAnalyticsEvent.analyticsData.hashCode() : 0);
        }

        public final String toString() {
            return "TwoColumnViewModel(left=" + this.left + ", right=" + this.right + ", columnWidth=" + this.columnWidth + ", spacingBetween=" + this.spacingBetween + ", viewAnalyticsEvent=" + this.viewAnalyticsEvent + ")";
        }
    }

    public final class ValueUnitViewModel extends GenericComponentViewModel {
        public final GenericBaseViewModel.TextViewModel numericValue;
        public final GenericBaseViewModel.TextViewModel unitDescription;
        public final GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent;

        public ValueUnitViewModel(GenericBaseViewModel.TextViewModel textViewModel, GenericBaseViewModel.TextViewModel textViewModel2, GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent) {
            this.numericValue = textViewModel;
            this.unitDescription = textViewModel2;
            this.viewAnalyticsEvent = viewAnalyticsEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValueUnitViewModel)) {
                return false;
            }
            ValueUnitViewModel valueUnitViewModel = (ValueUnitViewModel) obj;
            return this.numericValue.equals(valueUnitViewModel.numericValue) && this.unitDescription.equals(valueUnitViewModel.unitDescription) && Intrinsics.areEqual(this.viewAnalyticsEvent, valueUnitViewModel.viewAnalyticsEvent);
        }

        public final int hashCode() {
            int hashCode = (this.unitDescription.hashCode() + (this.numericValue.hashCode() * 31)) * 31;
            GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent = this.viewAnalyticsEvent;
            return hashCode + (viewAnalyticsEvent == null ? 0 : viewAnalyticsEvent.analyticsData.hashCode());
        }

        public final String toString() {
            return "ValueUnitViewModel(numericValue=" + this.numericValue + ", unitDescription=" + this.unitDescription + ", viewAnalyticsEvent=" + this.viewAnalyticsEvent + ")";
        }
    }
}
