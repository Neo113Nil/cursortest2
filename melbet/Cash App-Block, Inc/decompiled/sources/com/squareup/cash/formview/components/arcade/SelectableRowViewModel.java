package com.squareup.cash.formview.components.arcade;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SelectableRowViewModel {
    public final Action action;
    public final Body body;
    public final boolean isEnabled;
    public final LeadingIcon leadingIcon;
    public final String title;
    public final TrailingIcon trailingIcon;

    public interface Action {

        public final class ButtonAccessory implements Action {
            public final FormViewEvent.BlockerActionViewEvent.SelectableRowClicked event;
            public final String label;

            public ButtonAccessory(String str, FormViewEvent.BlockerActionViewEvent.SelectableRowClicked selectableRowClicked) {
                this.label = str;
                this.event = selectableRowClicked;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ButtonAccessory)) {
                    return false;
                }
                ButtonAccessory buttonAccessory = (ButtonAccessory) obj;
                return this.label.equals(buttonAccessory.label) && this.event.equals(buttonAccessory.event);
            }

            @Override // com.squareup.cash.formview.components.arcade.SelectableRowViewModel.Action
            public final FormViewEvent getEvent() {
                return this.event;
            }

            public final int hashCode() {
                return this.event.action.hashCode() + (this.label.hashCode() * 31);
            }

            public final String toString() {
                return "ButtonAccessory(label=" + this.label + ", event=" + this.event + ")";
            }
        }

        public final class ClickableRow implements Action {
            public final FormViewEvent.BlockerActionViewEvent.SelectableRowClicked event;

            public ClickableRow(FormViewEvent.BlockerActionViewEvent.SelectableRowClicked selectableRowClicked) {
                this.event = selectableRowClicked;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ClickableRow) && this.event.equals(((ClickableRow) obj).event);
            }

            @Override // com.squareup.cash.formview.components.arcade.SelectableRowViewModel.Action
            public final FormViewEvent getEvent() {
                return this.event;
            }

            public final int hashCode() {
                return this.event.action.hashCode();
            }

            public final String toString() {
                return "ClickableRow(event=" + this.event + ")";
            }
        }

        FormViewEvent getEvent();
    }

    public final class Body {
        public final String detailText;
        public final FormBlocker.Element.SelectableRowElement.DetailTextStyle detailTextStyle;
        public final String subtitle;
        public final FormBlocker.Element.SelectableRowElement.DetailTextStyle subtitleTextStyle;

        public Body(String str, FormBlocker.Element.SelectableRowElement.DetailTextStyle detailTextStyle, String str2, FormBlocker.Element.SelectableRowElement.DetailTextStyle detailTextStyle2) {
            detailTextStyle.getClass();
            detailTextStyle2.getClass();
            this.subtitle = str;
            this.subtitleTextStyle = detailTextStyle;
            this.detailText = str2;
            this.detailTextStyle = detailTextStyle2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Body)) {
                return false;
            }
            Body body = (Body) obj;
            return Intrinsics.areEqual(this.subtitle, body.subtitle) && this.subtitleTextStyle == body.subtitleTextStyle && Intrinsics.areEqual(this.detailText, body.detailText) && this.detailTextStyle == body.detailTextStyle;
        }

        public final int hashCode() {
            String str = this.subtitle;
            int hashCode = (this.subtitleTextStyle.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
            String str2 = this.detailText;
            return this.detailTextStyle.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Body(subtitle=" + this.subtitle + ", subtitleTextStyle=" + this.subtitleTextStyle + ", detailText=" + this.detailText + ", detailTextStyle=" + this.detailTextStyle + ")";
        }
    }

    public interface LeadingIcon {

        public final class Avatar implements LeadingIcon {
            public final UiAvatar avatar;

            public Avatar(UiAvatar uiAvatar) {
                uiAvatar.getClass();
                this.avatar = uiAvatar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Avatar) && Intrinsics.areEqual(this.avatar, ((Avatar) obj).avatar);
            }

            public final int hashCode() {
                return this.avatar.hashCode();
            }

            public final String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(this.avatar, "Avatar(avatar=", ")");
            }
        }

        public interface Small extends LeadingIcon {

            public final class ImageUrl implements Small {
                public final Image image;
                public final LocalResource placeholder;

                public ImageUrl(Image image, LocalResource localResource) {
                    image.getClass();
                    this.image = image;
                    this.placeholder = localResource;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ImageUrl)) {
                        return false;
                    }
                    ImageUrl imageUrl = (ImageUrl) obj;
                    return Intrinsics.areEqual(this.image, imageUrl.image) && Intrinsics.areEqual(this.placeholder, imageUrl.placeholder);
                }

                public final int hashCode() {
                    int hashCode = this.image.hashCode() * 31;
                    LocalResource localResource = this.placeholder;
                    return hashCode + (localResource == null ? 0 : Integer.hashCode(localResource.drawableRes));
                }

                public final String toString() {
                    return "ImageUrl(image=" + this.image + ", placeholder=" + this.placeholder + ")";
                }
            }

            public final class LocalResource implements Small {
                public final int drawableRes;

                public LocalResource(int i) {
                    this.drawableRes = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof LocalResource) && this.drawableRes == ((LocalResource) obj).drawableRes;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.drawableRes);
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.drawableRes, "LocalResource(drawableRes=", ")");
                }
            }

            public final class Number implements Small {

                /* renamed from: string, reason: collision with root package name */
                public final String f1134string;

                public Number(String str) {
                    this.f1134string = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Number) && this.f1134string.equals(((Number) obj).f1134string);
                }

                public final int hashCode() {
                    return this.f1134string.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Number(string=", this.f1134string, ")");
                }
            }
        }
    }

    public final class TrailingIcon {
        public final Icons icon;
        public final Color tintColor;

        public TrailingIcon(Icons icons, Color color) {
            this.icon = icons;
            this.tintColor = color;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrailingIcon)) {
                return false;
            }
            TrailingIcon trailingIcon = (TrailingIcon) obj;
            return this.icon == trailingIcon.icon && Intrinsics.areEqual(this.tintColor, trailingIcon.tintColor);
        }

        public final int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            Color color = this.tintColor;
            return hashCode + (color == null ? 0 : color.hashCode());
        }

        public final String toString() {
            return "TrailingIcon(icon=" + this.icon + ", tintColor=" + this.tintColor + ")";
        }
    }

    public SelectableRowViewModel(LeadingIcon leadingIcon, TrailingIcon trailingIcon, String str, Body body, Action action, boolean z) {
        str.getClass();
        this.leadingIcon = leadingIcon;
        this.trailingIcon = trailingIcon;
        this.title = str;
        this.body = body;
        this.action = action;
        this.isEnabled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableRowViewModel)) {
            return false;
        }
        SelectableRowViewModel selectableRowViewModel = (SelectableRowViewModel) obj;
        return Intrinsics.areEqual(this.leadingIcon, selectableRowViewModel.leadingIcon) && Intrinsics.areEqual(this.trailingIcon, selectableRowViewModel.trailingIcon) && Intrinsics.areEqual(this.title, selectableRowViewModel.title) && Intrinsics.areEqual(this.body, selectableRowViewModel.body) && Intrinsics.areEqual(this.action, selectableRowViewModel.action) && this.isEnabled == selectableRowViewModel.isEnabled;
    }

    public final int hashCode() {
        LeadingIcon leadingIcon = this.leadingIcon;
        int hashCode = (leadingIcon == null ? 0 : leadingIcon.hashCode()) * 31;
        TrailingIcon trailingIcon = this.trailingIcon;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (trailingIcon == null ? 0 : trailingIcon.hashCode())) * 31, 31, this.title);
        Body body = this.body;
        int hashCode2 = (m + (body == null ? 0 : body.hashCode())) * 31;
        Action action = this.action;
        return Boolean.hashCode(this.isEnabled) + ((hashCode2 + (action != null ? action.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SelectableRowViewModel(leadingIcon=" + this.leadingIcon + ", trailingIcon=" + this.trailingIcon + ", title=" + this.title + ", body=" + this.body + ", action=" + this.action + ", isEnabled=" + this.isEnabled + ")";
    }
}
