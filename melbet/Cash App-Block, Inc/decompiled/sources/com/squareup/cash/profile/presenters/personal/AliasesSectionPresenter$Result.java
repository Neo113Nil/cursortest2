package com.squareup.cash.profile.presenters.personal;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.db.profile.ProfileAlias;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class AliasesSectionPresenter$Result {

    public final class PopulatedList extends AliasesSectionPresenter$Result {
        public final List aliases;

        public PopulatedList(List list) {
            list.getClass();
            this.aliases = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PopulatedList) && Intrinsics.areEqual(this.aliases, ((PopulatedList) obj).aliases);
        }

        public final int hashCode() {
            return this.aliases.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("PopulatedList(aliases=", ")", this.aliases);
        }
    }

    public final class UnregisterFailed extends AliasesSectionPresenter$Result {
        public final ProfileAlias alias;
        public final String failureMessage;

        public UnregisterFailed(ProfileAlias profileAlias, String str) {
            profileAlias.getClass();
            str.getClass();
            this.alias = profileAlias;
            this.failureMessage = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnregisterFailed)) {
                return false;
            }
            UnregisterFailed unregisterFailed = (UnregisterFailed) obj;
            return Intrinsics.areEqual(this.alias, unregisterFailed.alias) && Intrinsics.areEqual(this.failureMessage, unregisterFailed.failureMessage);
        }

        public final int hashCode() {
            return this.failureMessage.hashCode() + (this.alias.hashCode() * 31);
        }

        public final String toString() {
            return "UnregisterFailed(alias=" + this.alias + ", failureMessage=" + this.failureMessage + ")";
        }
    }

    public final class UnregisterOngoing extends AliasesSectionPresenter$Result {
        public final ProfileAlias alias;

        public UnregisterOngoing(ProfileAlias profileAlias) {
            profileAlias.getClass();
            this.alias = profileAlias;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnregisterOngoing) && Intrinsics.areEqual(this.alias, ((UnregisterOngoing) obj).alias);
        }

        public final int hashCode() {
            return this.alias.hashCode();
        }

        public final String toString() {
            return "UnregisterOngoing(alias=" + this.alias + ")";
        }
    }

    public final class UnregisterSuccess extends AliasesSectionPresenter$Result {
        public final ProfileAlias alias;

        public UnregisterSuccess(ProfileAlias profileAlias) {
            profileAlias.getClass();
            this.alias = profileAlias;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnregisterSuccess) && Intrinsics.areEqual(this.alias, ((UnregisterSuccess) obj).alias);
        }

        public final int hashCode() {
            return this.alias.hashCode();
        }

        public final String toString() {
            return "UnregisterSuccess(alias=" + this.alias + ")";
        }
    }
}
