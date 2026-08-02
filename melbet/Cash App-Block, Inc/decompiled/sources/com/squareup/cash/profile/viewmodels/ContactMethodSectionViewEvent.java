package com.squareup.cash.profile.viewmodels;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ContactMethodSectionViewEvent {

    public final class AddAliasClicked implements ContactMethodSectionViewEvent {
        public final AliasItem aliasType;

        public AddAliasClicked(AliasItem aliasItem) {
            aliasItem.getClass();
            this.aliasType = aliasItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddAliasClicked) && this.aliasType == ((AddAliasClicked) obj).aliasType;
        }

        public final int hashCode() {
            return this.aliasType.hashCode();
        }

        public final String toString() {
            return "AddAliasClicked(aliasType=" + this.aliasType + ")";
        }
    }

    public final class ContactMethodClicked implements ContactMethodSectionViewEvent {
        public final ContactMethodType contactMethod;

        public ContactMethodClicked(ContactMethodType contactMethodType) {
            this.contactMethod = contactMethodType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContactMethodClicked) && this.contactMethod.equals(((ContactMethodClicked) obj).contactMethod);
        }

        public final int hashCode() {
            return this.contactMethod.hashCode();
        }

        public final String toString() {
            return "ContactMethodClicked(contactMethod=" + this.contactMethod + ")";
        }
    }

    /* loaded from: classes6.dex */
    public final class ReviewAliasesClicked implements ContactMethodSectionViewEvent {
        public final AliasItem aliasType;
        public final List aliases;

        public ReviewAliasesClicked(List list, AliasItem aliasItem) {
            list.getClass();
            aliasItem.getClass();
            this.aliases = list;
            this.aliasType = aliasItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReviewAliasesClicked)) {
                return false;
            }
            ReviewAliasesClicked reviewAliasesClicked = (ReviewAliasesClicked) obj;
            return Intrinsics.areEqual(this.aliases, reviewAliasesClicked.aliases) && this.aliasType == reviewAliasesClicked.aliasType;
        }

        public final int hashCode() {
            return this.aliasType.hashCode() + (this.aliases.hashCode() * 31);
        }

        public final String toString() {
            return "ReviewAliasesClicked(aliases=" + this.aliases + ", aliasType=" + this.aliasType + ")";
        }
    }
}
