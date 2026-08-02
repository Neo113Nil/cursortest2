package com.squareup.cash.eligibility.backend.api;

import app.cash.api.ApiResult;
import com.squareup.cash.eligibility.backend.real.InMemoryAccountSettingsCache;

/* loaded from: classes.dex */
public interface SettingsEligibilityManager$AccountSettingsResult {

    public final class SettingsError implements SettingsEligibilityManager$AccountSettingsResult {
        public final ApiResult.Failure failure;

        public SettingsError(ApiResult.Failure failure) {
            this.failure = failure;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SettingsError) && this.failure.equals(((SettingsError) obj).failure);
        }

        public final int hashCode() {
            return this.failure.hashCode();
        }

        public final String toString() {
            return "SettingsError(failure=" + this.failure + ")";
        }
    }

    public final class SettingsLoaded implements SettingsEligibilityManager$AccountSettingsResult {
        public final InMemoryAccountSettingsCache cache;

        public SettingsLoaded(InMemoryAccountSettingsCache inMemoryAccountSettingsCache) {
            this.cache = inMemoryAccountSettingsCache;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SettingsLoaded) && this.cache.equals(((SettingsLoaded) obj).cache);
        }

        public final int hashCode() {
            return this.cache.settingsResponse.hashCode();
        }

        public final String toString() {
            return "SettingsLoaded(cache=" + this.cache + ")";
        }
    }
}
