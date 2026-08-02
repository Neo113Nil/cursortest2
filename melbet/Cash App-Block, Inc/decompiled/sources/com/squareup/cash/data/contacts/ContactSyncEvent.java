package com.squareup.cash.data.contacts;

import com.squareup.cash.data.contacts.ContactSync$SyncReason;
import com.squareup.cash.integration.contacts.ContactBook$ContactAccountDetailsQuery;
import com.squareup.cash.integration.contacts.ContactBook$DetailedContactQuery;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferredImpl;

/* loaded from: classes.dex */
public abstract class ContactSyncEvent {

    /* loaded from: classes6.dex */
    public final class ContactSyncCompleted extends ContactSyncEvent {
        public final CompletableDeferredImpl result;

        public ContactSyncCompleted(CompletableDeferredImpl completableDeferredImpl) {
            this.result = completableDeferredImpl;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContactSyncCompleted) && this.result == ((ContactSyncCompleted) obj).result;
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final String toString() {
            return "ContactSyncCompleted(result=" + this.result + ")";
        }
    }

    /* loaded from: classes6.dex */
    public final class NewContacts extends ContactSyncEvent {
        public final ContactBook$ContactAccountDetailsQuery contactAccount;
        public final ContactBook$DetailedContactQuery detailedContact;

        public NewContacts(ContactBook$DetailedContactQuery contactBook$DetailedContactQuery, ContactBook$ContactAccountDetailsQuery contactBook$ContactAccountDetailsQuery) {
            contactBook$DetailedContactQuery.getClass();
            contactBook$ContactAccountDetailsQuery.getClass();
            this.detailedContact = contactBook$DetailedContactQuery;
            this.contactAccount = contactBook$ContactAccountDetailsQuery;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewContacts)) {
                return false;
            }
            NewContacts newContacts = (NewContacts) obj;
            return Intrinsics.areEqual(this.detailedContact, newContacts.detailedContact) && Intrinsics.areEqual(this.contactAccount, newContacts.contactAccount);
        }

        public final int hashCode() {
            return this.contactAccount.hashCode() + (this.detailedContact.hashCode() * 31);
        }

        public final String toString() {
            return "NewContacts(detailedContact=" + this.detailedContact + ", contactAccount=" + this.contactAccount + ")";
        }
    }

    /* loaded from: classes6.dex */
    public final class RequestSync extends ContactSyncEvent {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestSync)) {
                return false;
            }
            ContactSync$SyncReason.AppLaunch appLaunch = ContactSync$SyncReason.AppLaunch.INSTANCE;
            return appLaunch.equals(appLaunch);
        }

        public final int hashCode() {
            return (Boolean.hashCode(true) * 31) + 1849447425;
        }

        public final String toString() {
            return "RequestSync(ignoreServerBackoff=true, syncReason=" + ContactSync$SyncReason.AppLaunch.INSTANCE + ")";
        }
    }

    /* loaded from: classes6.dex */
    public final class Reset extends ContactSyncEvent {
        public final RealContactSync$reset$2$1 onDone;
        public final ContactSync$ResetReason reason;

        public Reset(ContactSync$ResetReason contactSync$ResetReason, RealContactSync$reset$2$1 realContactSync$reset$2$1) {
            this.reason = contactSync$ResetReason;
            this.onDone = realContactSync$reset$2$1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Reset) {
                Reset reset = (Reset) obj;
                return this.reason.equals(reset.reason) && this.onDone == reset.onDone;
            }
            return false;
        }

        public final Function0 getOnDone() {
            return this.onDone;
        }

        public final ContactSync$ResetReason getReason() {
            return this.reason;
        }

        public final int hashCode() {
            return this.onDone.hashCode() + (this.reason.hashCode() * 31);
        }

        public final String toString() {
            return "Reset(reason=" + this.reason + ", onDone=" + this.onDone + ")";
        }
    }

    public final class SyncRoutines extends ContactSyncEvent {
        public final ContactsSyncRoutine databaseUpdate;
        public final ContactsSyncRoutine detailedContactsUpload;
        public final ContactsSyncRoutine hashAliasUpload;

        public SyncRoutines(ContactsSyncRoutine contactsSyncRoutine, ContactsSyncRoutine contactsSyncRoutine2, ContactsSyncRoutine contactsSyncRoutine3) {
            this.databaseUpdate = contactsSyncRoutine;
            this.hashAliasUpload = contactsSyncRoutine2;
            this.detailedContactsUpload = contactsSyncRoutine3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SyncRoutines)) {
                return false;
            }
            SyncRoutines syncRoutines = (SyncRoutines) obj;
            return Intrinsics.areEqual(this.databaseUpdate, syncRoutines.databaseUpdate) && Intrinsics.areEqual(this.hashAliasUpload, syncRoutines.hashAliasUpload) && Intrinsics.areEqual(this.detailedContactsUpload, syncRoutines.detailedContactsUpload);
        }

        public final int hashCode() {
            ContactsSyncRoutine contactsSyncRoutine = this.databaseUpdate;
            int hashCode = (contactsSyncRoutine == null ? 0 : contactsSyncRoutine.hashCode()) * 31;
            ContactsSyncRoutine contactsSyncRoutine2 = this.hashAliasUpload;
            int hashCode2 = (hashCode + (contactsSyncRoutine2 == null ? 0 : contactsSyncRoutine2.hashCode())) * 31;
            ContactsSyncRoutine contactsSyncRoutine3 = this.detailedContactsUpload;
            return hashCode2 + (contactsSyncRoutine3 != null ? contactsSyncRoutine3.hashCode() : 0);
        }

        public final String toString() {
            return "SyncRoutines(databaseUpdate=" + this.databaseUpdate + ", hashAliasUpload=" + this.hashAliasUpload + ", detailedContactsUpload=" + this.detailedContactsUpload + ")";
        }
    }
}
