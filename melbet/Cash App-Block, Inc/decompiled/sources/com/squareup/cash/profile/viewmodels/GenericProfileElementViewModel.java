package com.squareup.cash.profile.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.favorites.viewmodels.AddOrRemoveAsFavoriteButtonViewModel;
import com.squareup.cash.favorites.viewmodels.FavoritesListWidgetViewModel;
import com.squareup.cash.history.payments.viewmodels.ProfilePaymentHistoryViewModel;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.AbstractList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class GenericProfileElementViewModel {

    public final class AddOrRemoveAsFavoriteButtonWidget extends GenericProfileElementViewModel {
        public final AddOrRemoveAsFavoriteButtonViewModel viewModel;

        public AddOrRemoveAsFavoriteButtonWidget(AddOrRemoveAsFavoriteButtonViewModel addOrRemoveAsFavoriteButtonViewModel) {
            this.viewModel = addOrRemoveAsFavoriteButtonViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddOrRemoveAsFavoriteButtonWidget) && this.viewModel.equals(((AddOrRemoveAsFavoriteButtonWidget) obj).viewModel);
        }

        public final int hashCode() {
            return this.viewModel.hashCode();
        }

        public final String toString() {
            return "AddOrRemoveAsFavoriteButtonWidget(viewModel=" + this.viewModel + ")";
        }
    }

    public final class BlankDivider extends GenericProfileElementViewModel {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Size {
            public static final /* synthetic */ Size[] $VALUES;
            public static final Size SMALL;

            static {
                Size size = new Size("SMALL", 0);
                SMALL = size;
                $VALUES = new Size[]{size, new Size("LARGE", 1)};
            }

            public static Size valueOf(String str) {
                return (Size) Enum.valueOf(Size.class, str);
            }

            public static Size[] values() {
                return (Size[]) $VALUES.clone();
            }
        }

        public BlankDivider() {
            Size size = Size.SMALL;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BlankDivider)) {
                return false;
            }
            Size size = Size.SMALL;
            return true;
        }

        public final int hashCode() {
            return Size.SMALL.hashCode();
        }

        public final String toString() {
            return "BlankDivider(size=" + Size.SMALL + ")";
        }
    }

    public final class FavoritesListWidget extends GenericProfileElementViewModel {
        public final FavoritesListWidgetViewModel viewModel;

        public FavoritesListWidget(FavoritesListWidgetViewModel favoritesListWidgetViewModel) {
            this.viewModel = favoritesListWidgetViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FavoritesListWidget) && this.viewModel.equals(((FavoritesListWidget) obj).viewModel);
        }

        public final int hashCode() {
            return this.viewModel.favorites.hashCode();
        }

        public final String toString() {
            return "FavoritesListWidget(viewModel=" + this.viewModel + ")";
        }
    }

    public final class GroupedButtonsWidget extends GenericProfileElementViewModel {
        public final List models;

        public GroupedButtonsWidget(List list) {
            list.getClass();
            this.models = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GroupedButtonsWidget) && Intrinsics.areEqual(this.models, ((GroupedButtonsWidget) obj).models);
        }

        public final int hashCode() {
            return this.models.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("GroupedButtonsWidget(models=", ")", this.models);
        }
    }

    public final class IconTextWidget extends GenericProfileElementViewModel {
        public final Image icon;
        public final String title;

        public IconTextWidget(String str, Image image) {
            this.title = str;
            this.icon = image;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconTextWidget)) {
                return false;
            }
            IconTextWidget iconTextWidget = (IconTextWidget) obj;
            return Intrinsics.areEqual(this.title, iconTextWidget.title) && Intrinsics.areEqual(this.icon, iconTextWidget.icon);
        }

        public final int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Image image = this.icon;
            return (hashCode + (image != null ? image.hashCode() : 0)) * 31;
        }

        public final String toString() {
            return "IconTextWidget(title=" + this.title + ", icon=" + this.icon + ", enabled=null)";
        }
    }

    public final class PaymentHistoryWidget extends GenericProfileElementViewModel {
        public final ProfilePaymentHistoryViewModel viewModel;

        public PaymentHistoryWidget(ProfilePaymentHistoryViewModel profilePaymentHistoryViewModel) {
            this.viewModel = profilePaymentHistoryViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentHistoryWidget) && this.viewModel.equals(((PaymentHistoryWidget) obj).viewModel);
        }

        public final int hashCode() {
            return this.viewModel.hashCode();
        }

        public final String toString() {
            return "PaymentHistoryWidget(viewModel=" + this.viewModel + ")";
        }
    }

    public final class TextWidget extends GenericProfileElementViewModel {
        public final String title;

        public TextWidget(String str) {
            str.getClass();
            this.title = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TextWidget) && Intrinsics.areEqual(this.title, ((TextWidget) obj).title);
        }

        public final int hashCode() {
            return this.title.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TextWidget(title=", this.title, ")");
        }
    }

    public final class TrustIndicatorsWidget extends GenericProfileElementViewModel {
        public final List trustIndicators;

        public TrustIndicatorsWidget(AbstractList abstractList) {
            abstractList.getClass();
            this.trustIndicators = abstractList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TrustIndicatorsWidget) && Intrinsics.areEqual(this.trustIndicators, ((TrustIndicatorsWidget) obj).trustIndicators);
        }

        public final int hashCode() {
            return this.trustIndicators.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("TrustIndicatorsWidget(trustIndicators=", ")", this.trustIndicators);
        }
    }

    public final class ButtonWidget extends GenericProfileElementViewModel {
        public final GenericProfileElement.ButtonElement.BlockAction block;
        public final GenericProfileElement.ButtonElement.ReportAction report;
        public final String title;
        public final GenericProfileElement.ButtonElement.TertiaryStyle.TitleStyle titleStyle;

        public /* synthetic */ ButtonWidget(String str, GenericProfileElement.ButtonElement.BlockAction blockAction, GenericProfileElement.ButtonElement.ReportAction reportAction, int i) {
            this(str, GenericProfileElement.ButtonElement.TertiaryStyle.TitleStyle.DESTRUCTIVE, (i & 4) != 0 ? null : blockAction, (i & 8) != 0 ? null : reportAction);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonWidget)) {
                return false;
            }
            ButtonWidget buttonWidget = (ButtonWidget) obj;
            return Intrinsics.areEqual(this.title, buttonWidget.title) && this.titleStyle == buttonWidget.titleStyle && Intrinsics.areEqual(this.block, buttonWidget.block) && Intrinsics.areEqual(this.report, buttonWidget.report);
        }

        public final int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            GenericProfileElement.ButtonElement.TertiaryStyle.TitleStyle titleStyle = this.titleStyle;
            int hashCode2 = (hashCode + (titleStyle == null ? 0 : titleStyle.hashCode())) * 31;
            GenericProfileElement.ButtonElement.BlockAction blockAction = this.block;
            int hashCode3 = (hashCode2 + (blockAction == null ? 0 : blockAction.hashCode())) * 31;
            GenericProfileElement.ButtonElement.ReportAction reportAction = this.report;
            return hashCode3 + (reportAction != null ? reportAction.hashCode() : 0);
        }

        public final String toString() {
            return "ButtonWidget(title=" + this.title + ", titleStyle=" + this.titleStyle + ", block=" + this.block + ", report=" + this.report + ")";
        }

        public ButtonWidget(String str, GenericProfileElement.ButtonElement.TertiaryStyle.TitleStyle titleStyle, GenericProfileElement.ButtonElement.BlockAction blockAction, GenericProfileElement.ButtonElement.ReportAction reportAction) {
            this.title = str;
            this.titleStyle = titleStyle;
            this.block = blockAction;
            this.report = reportAction;
        }
    }
}
