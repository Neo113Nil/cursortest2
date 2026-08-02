package com.squareup.cash.profile.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class CategoryListViewEvent {

    /* loaded from: classes6.dex */
    public final class CategoryClicked extends CategoryListViewEvent {
        public final Category category;

        public CategoryClicked(Category category) {
            category.getClass();
            this.category = category;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CategoryClicked) && Intrinsics.areEqual(this.category, ((CategoryClicked) obj).category);
        }

        public final int hashCode() {
            return this.category.hashCode();
        }

        public final String toString() {
            return "CategoryClicked(category=" + this.category + ")";
        }
    }

    public final class DialogDismissed extends CategoryListViewEvent {
        public static final DialogDismissed INSTANCE = new DialogDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DialogDismissed);
        }

        public final int hashCode() {
            return 2035122276;
        }

        public final String toString() {
            return "DialogDismissed";
        }
    }

    public final class GoBack extends CategoryListViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 1353836140;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class OpenNotificationSettingsClick extends CategoryListViewEvent {
        public static final OpenNotificationSettingsClick INSTANCE = new OpenNotificationSettingsClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenNotificationSettingsClick);
        }

        public final int hashCode() {
            return 1707942835;
        }

        public final String toString() {
            return "OpenNotificationSettingsClick";
        }
    }

    /* loaded from: classes6.dex */
    public final class ParentToggleClicked extends CategoryListViewEvent {
        public final boolean toggledValue;

        public ParentToggleClicked(boolean z) {
            this.toggledValue = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ParentToggleClicked) && this.toggledValue == ((ParentToggleClicked) obj).toggledValue;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.toggledValue);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("ParentToggleClicked(toggledValue=", ")", this.toggledValue);
        }
    }
}
