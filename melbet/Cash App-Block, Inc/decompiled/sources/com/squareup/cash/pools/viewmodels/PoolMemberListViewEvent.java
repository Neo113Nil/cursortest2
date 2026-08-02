package com.squareup.cash.pools.viewmodels;

import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PoolMemberListViewEvent {

    public final class AddPeople implements PoolMemberListViewEvent {
        public static final AddPeople INSTANCE = new AddPeople();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AddPeople);
        }

        public final int hashCode() {
            return 513513517;
        }

        public final String toString() {
            return "AddPeople";
        }
    }

    public final class AvatarTapped implements PoolMemberListViewEvent {
        public final String personToken;

        public AvatarTapped(String str) {
            str.getClass();
            this.personToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AvatarTapped) && Intrinsics.areEqual(this.personToken, ((AvatarTapped) obj).personToken);
        }

        public final int hashCode() {
            return this.personToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AvatarTapped(personToken=", this.personToken, ")");
        }
    }

    public final class Close implements PoolMemberListViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -1875316203;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class DismissDialog implements PoolMemberListViewEvent {
        public static final DismissDialog INSTANCE = new DismissDialog();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissDialog);
        }

        public final int hashCode() {
            return 1555084175;
        }

        public final String toString() {
            return "DismissDialog";
        }
    }

    public final class OwnerTapped implements PoolMemberListViewEvent {
        public static final OwnerTapped INSTANCE = new OwnerTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OwnerTapped);
        }

        public final int hashCode() {
            return -50511492;
        }

        public final String toString() {
            return "OwnerTapped";
        }
    }

    public final class RemovePerson implements PoolMemberListViewEvent {
        public final String personToken;

        public RemovePerson(String str) {
            str.getClass();
            this.personToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemovePerson) && Intrinsics.areEqual(this.personToken, ((RemovePerson) obj).personToken);
        }

        public final int hashCode() {
            return this.personToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RemovePerson(personToken=", this.personToken, ")");
        }
    }
}
