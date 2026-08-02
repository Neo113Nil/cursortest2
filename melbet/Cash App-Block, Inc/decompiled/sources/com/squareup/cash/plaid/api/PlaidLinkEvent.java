package com.squareup.cash.plaid.api;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class PlaidLinkEvent {

    /* loaded from: classes6.dex */
    public final class GenericEvent extends PlaidLinkEvent {
        public final String eventName;
        public final Institution institution;

        public GenericEvent(String str, Institution institution) {
            str.getClass();
            this.eventName = str;
            this.institution = institution;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GenericEvent)) {
                return false;
            }
            GenericEvent genericEvent = (GenericEvent) obj;
            return Intrinsics.areEqual(this.eventName, genericEvent.eventName) && this.institution.equals(genericEvent.institution);
        }

        @Override // com.squareup.cash.plaid.api.PlaidLinkEvent
        public final String getEventName() {
            return this.eventName;
        }

        @Override // com.squareup.cash.plaid.api.PlaidLinkEvent
        public final Institution getInstitution() {
            return this.institution;
        }

        public final int hashCode() {
            return this.institution.hashCode() + (this.eventName.hashCode() * 31);
        }

        public final String toString() {
            return "GenericEvent(eventName=" + this.eventName + ", institution=" + this.institution + ")";
        }
    }

    /* loaded from: classes6.dex */
    public final class SearchEvent extends PlaidLinkEvent {
        public final String eventName;
        public final Institution institution;

        public SearchEvent(String str, Institution institution) {
            str.getClass();
            this.eventName = str;
            this.institution = institution;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchEvent)) {
                return false;
            }
            SearchEvent searchEvent = (SearchEvent) obj;
            return Intrinsics.areEqual(this.eventName, searchEvent.eventName) && this.institution.equals(searchEvent.institution);
        }

        @Override // com.squareup.cash.plaid.api.PlaidLinkEvent
        public final String getEventName() {
            return this.eventName;
        }

        @Override // com.squareup.cash.plaid.api.PlaidLinkEvent
        public final Institution getInstitution() {
            return this.institution;
        }

        public final int hashCode() {
            return this.institution.hashCode() + (this.eventName.hashCode() * 31);
        }

        public final String toString() {
            return "SearchEvent(eventName=" + this.eventName + ", institution=" + this.institution + ")";
        }
    }

    public abstract String getEventName();

    public abstract Institution getInstitution();
}
