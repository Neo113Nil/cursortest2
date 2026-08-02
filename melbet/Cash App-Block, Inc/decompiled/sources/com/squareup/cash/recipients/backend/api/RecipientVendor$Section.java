package com.squareup.cash.recipients.backend.api;

import com.squareup.cash.db.contacts.Recipient;
import com.squareup.protos.franklin.common.RecipientGroup;
import com.squareup.protos.franklin.ui.UiControl;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class RecipientVendor$Section {

    public final class LocalContacts extends RecipientVendor$Section {
        public final boolean isGenerated;
        public final List recipients;

        public LocalContacts(List list, boolean z) {
            list.getClass();
            this.recipients = list;
            this.isGenerated = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocalContacts)) {
                return false;
            }
            LocalContacts localContacts = (LocalContacts) obj;
            return Intrinsics.areEqual(this.recipients, localContacts.recipients) && this.isGenerated == localContacts.isGenerated;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isGenerated) + (this.recipients.hashCode() * 31);
        }

        public final String toString() {
            return "LocalContacts(recipients=" + this.recipients + ", isGenerated=" + this.isGenerated + ")";
        }
    }

    /* loaded from: classes6.dex */
    public final class Recents extends RecipientVendor$Section {
        public final List recipients;

        public Recents(List list) {
            UiControl.Type.Companion companion = RecipientGroup.Companion;
            list.getClass();
            this.recipients = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Recents)) {
                return false;
            }
            UiControl.Type.Companion companion = RecipientGroup.Companion;
            return Intrinsics.areEqual(this.recipients, ((Recents) obj).recipients);
        }

        public final int hashCode() {
            return this.recipients.hashCode() + (RecipientGroup.RECENTS.hashCode() * 31);
        }

        public final String toString() {
            return "Recents(group=" + RecipientGroup.RECENTS + ", recipients=" + this.recipients + ")";
        }
    }

    /* loaded from: classes6.dex */
    public final class ServerSuggestion extends RecipientVendor$Section {
        public final Recipient exactMatch;
        public final List matches;

        public ServerSuggestion(Recipient recipient, List list) {
            list.getClass();
            this.exactMatch = recipient;
            this.matches = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServerSuggestion)) {
                return false;
            }
            ServerSuggestion serverSuggestion = (ServerSuggestion) obj;
            return Intrinsics.areEqual(this.exactMatch, serverSuggestion.exactMatch) && Intrinsics.areEqual(this.matches, serverSuggestion.matches);
        }

        public final int hashCode() {
            Recipient recipient = this.exactMatch;
            return this.matches.hashCode() + ((recipient == null ? 0 : recipient.hashCode()) * 31);
        }

        public final String toString() {
            return "ServerSuggestion(exactMatch=" + this.exactMatch + ", matches=" + this.matches + ")";
        }
    }
}
