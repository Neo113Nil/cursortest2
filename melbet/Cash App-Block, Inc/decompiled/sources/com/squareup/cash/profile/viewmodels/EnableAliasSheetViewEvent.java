package com.squareup.cash.profile.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class EnableAliasSheetViewEvent {

    /* loaded from: classes6.dex */
    public final class AliasChecked extends EnableAliasSheetViewEvent {
        public final Alias alias;
        public final boolean isPhoneAliasType;

        public AliasChecked(Alias alias, boolean z) {
            alias.getClass();
            this.alias = alias;
            this.isPhoneAliasType = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AliasChecked)) {
                return false;
            }
            AliasChecked aliasChecked = (AliasChecked) obj;
            return Intrinsics.areEqual(this.alias, aliasChecked.alias) && this.isPhoneAliasType == aliasChecked.isPhoneAliasType;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isPhoneAliasType) + (this.alias.hashCode() * 31);
        }

        public final String toString() {
            return "AliasChecked(alias=" + this.alias + ", isPhoneAliasType=" + this.isPhoneAliasType + ")";
        }
    }

    public final class ConfirmClicked extends EnableAliasSheetViewEvent {
        public static final ConfirmClicked INSTANCE = new ConfirmClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfirmClicked);
        }

        public final int hashCode() {
            return 1931537114;
        }

        public final String toString() {
            return "ConfirmClicked";
        }
    }

    public final class Dismiss extends EnableAliasSheetViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return -1559216041;
        }

        public final String toString() {
            return "Dismiss";
        }
    }
}
