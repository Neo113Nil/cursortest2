package com.squareup.cash.activity.viewmodels;

import com.squareup.cash.activity.viewmodels.ContactHeaderViewEvent;

/* loaded from: classes5.dex */
public final class ContactHeaderEvent implements ActivityTabViewEvent {
    public final ContactHeaderViewEvent.ContactClickById contactHeaderEvent;

    public ContactHeaderEvent(ContactHeaderViewEvent.ContactClickById contactClickById) {
        this.contactHeaderEvent = contactClickById;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContactHeaderEvent) && this.contactHeaderEvent.equals(((ContactHeaderEvent) obj).contactHeaderEvent);
    }

    public final int hashCode() {
        return this.contactHeaderEvent.customerId.hashCode();
    }

    public final String toString() {
        return "ContactHeaderEvent(contactHeaderEvent=" + this.contactHeaderEvent + ")";
    }
}
