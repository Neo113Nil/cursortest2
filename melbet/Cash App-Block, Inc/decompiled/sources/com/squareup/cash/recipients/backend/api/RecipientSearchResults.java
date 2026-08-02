package com.squareup.cash.recipients.backend.api;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.db.contacts.Recipient;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class RecipientSearchResults {

    public final class LocalContacts extends RecipientSearchResults {
        public final List recipients;

        public LocalContacts(List list) {
            list.getClass();
            this.recipients = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LocalContacts) && Intrinsics.areEqual(this.recipients, ((LocalContacts) obj).recipients);
        }

        public final int hashCode() {
            return this.recipients.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("LocalContacts(recipients=", ")", this.recipients);
        }
    }

    /* loaded from: classes6.dex */
    public abstract class NewCustomer extends RecipientSearchResults {
    }

    /* loaded from: classes6.dex */
    public final class ServerSuggestion extends RecipientSearchResults {
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
