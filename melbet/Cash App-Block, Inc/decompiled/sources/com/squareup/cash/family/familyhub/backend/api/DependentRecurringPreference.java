package com.squareup.cash.family.familyhub.backend.api;

import com.squareup.protos.franklin.common.SyncRecurringPreference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface DependentRecurringPreference {

    public final class RecurringPreferenceFailedToLoad implements DependentRecurringPreference {
        public static final RecurringPreferenceFailedToLoad INSTANCE = new RecurringPreferenceFailedToLoad();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RecurringPreferenceFailedToLoad);
        }

        public final int hashCode() {
            return 1297426116;
        }

        public final String toString() {
            return "RecurringPreferenceFailedToLoad";
        }
    }

    public final class RecurringPreferenceLoaded implements DependentRecurringPreference {
        public final SyncRecurringPreference syncRecurringPreference;

        public RecurringPreferenceLoaded(SyncRecurringPreference syncRecurringPreference) {
            this.syncRecurringPreference = syncRecurringPreference;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RecurringPreferenceLoaded) && Intrinsics.areEqual(this.syncRecurringPreference, ((RecurringPreferenceLoaded) obj).syncRecurringPreference);
        }

        public final int hashCode() {
            SyncRecurringPreference syncRecurringPreference = this.syncRecurringPreference;
            if (syncRecurringPreference == null) {
                return 0;
            }
            return syncRecurringPreference.hashCode();
        }

        public final String toString() {
            return "RecurringPreferenceLoaded(syncRecurringPreference=" + this.syncRecurringPreference + ")";
        }
    }

    public final class RecurringPreferenceLoading implements DependentRecurringPreference {
        public static final RecurringPreferenceLoading INSTANCE = new RecurringPreferenceLoading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RecurringPreferenceLoading);
        }

        public final int hashCode() {
            return -1899812010;
        }

        public final String toString() {
            return "RecurringPreferenceLoading";
        }
    }
}
