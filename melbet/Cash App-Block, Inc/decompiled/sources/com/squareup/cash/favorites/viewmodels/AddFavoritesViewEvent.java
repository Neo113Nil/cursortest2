package com.squareup.cash.favorites.viewmodels;

import app.cash.broadway.screen.Screen;
import app.cash.inputfieldtext.composeui.TextFieldStateInputFieldText;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.favorites.viewmodels.SectionViewModel;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class AddFavoritesViewEvent {

    public final class CloseClicked extends AddFavoritesViewEvent {
        public static final CloseClicked INSTANCE = new CloseClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseClicked);
        }

        public final int hashCode() {
            return -2078116108;
        }

        public final String toString() {
            return "CloseClicked";
        }
    }

    public final class FavoriteClicked extends AddFavoritesViewEvent {
        public final Color accentColor;
        public final String customerId;
        public final Character monogram;
        public final String name;
        public final Image photo;
        public final SectionViewModel.Type section;

        public FavoriteClicked(String str, String str2, Color color, Image image, Character ch, SectionViewModel.Type type2) {
            this.customerId = str;
            this.name = str2;
            this.accentColor = color;
            this.photo = image;
            this.monogram = ch;
            this.section = type2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FavoriteClicked)) {
                return false;
            }
            FavoriteClicked favoriteClicked = (FavoriteClicked) obj;
            return this.customerId.equals(favoriteClicked.customerId) && this.name.equals(favoriteClicked.name) && this.accentColor.equals(favoriteClicked.accentColor) && Intrinsics.areEqual(this.photo, favoriteClicked.photo) && Intrinsics.areEqual(this.monogram, favoriteClicked.monogram) && this.section == favoriteClicked.section;
        }

        public final int hashCode() {
            int m = SVG$Unit$EnumUnboxingLocalUtility.m(this.accentColor, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.customerId.hashCode() * 31, 31, this.name), 31);
            Image image = this.photo;
            int hashCode = (m + (image == null ? 0 : image.hashCode())) * 31;
            Character ch = this.monogram;
            return this.section.hashCode() + ((hashCode + (ch != null ? ch.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FavoriteClicked(customerId=", this.customerId, ", name=", this.name, ", accentColor=");
            m.append(this.accentColor);
            m.append(", photo=");
            m.append(this.photo);
            m.append(", monogram=");
            m.append(this.monogram);
            m.append(", section=");
            m.append(this.section);
            m.append(")");
            return m.toString();
        }
    }

    public final class GrantContactsPermissionClicked extends AddFavoritesViewEvent {
        public static final GrantContactsPermissionClicked INSTANCE = new GrantContactsPermissionClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GrantContactsPermissionClicked);
        }

        public final int hashCode() {
            return 1330452014;
        }

        public final String toString() {
            return "GrantContactsPermissionClicked";
        }
    }

    public final class ListRowClicked extends AddFavoritesViewEvent {
        public final FavoriteViewModel favorite;

        public ListRowClicked(FavoriteViewModel favoriteViewModel) {
            this.favorite = favoriteViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ListRowClicked) && this.favorite.equals(((ListRowClicked) obj).favorite);
        }

        public final int hashCode() {
            return this.favorite.hashCode();
        }

        public final String toString() {
            return "ListRowClicked(favorite=" + this.favorite + ")";
        }
    }

    public final class OnDialogResult extends AddFavoritesViewEvent {
        public final Object result;
        public final Screen screenArgs;

        public OnDialogResult(Screen screen, Object obj) {
            screen.getClass();
            this.screenArgs = screen;
            this.result = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnDialogResult)) {
                return false;
            }
            OnDialogResult onDialogResult = (OnDialogResult) obj;
            return Intrinsics.areEqual(this.screenArgs, onDialogResult.screenArgs) && Intrinsics.areEqual(this.result, onDialogResult.result);
        }

        public final int hashCode() {
            int hashCode = this.screenArgs.hashCode() * 31;
            Object obj = this.result;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public final String toString() {
            return "OnDialogResult(screenArgs=" + this.screenArgs + ", result=" + this.result + ")";
        }
    }

    public final class SearchQueryChanged extends AddFavoritesViewEvent {
        public final TextFieldStateInputFieldText query;

        public SearchQueryChanged(TextFieldStateInputFieldText textFieldStateInputFieldText) {
            this.query = textFieldStateInputFieldText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchQueryChanged) && this.query.equals(((SearchQueryChanged) obj).query);
        }

        public final int hashCode() {
            return this.query.textFieldState.hashCode();
        }

        public final String toString() {
            return "SearchQueryChanged(query=" + this.query + ")";
        }
    }
}
