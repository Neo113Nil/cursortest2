package com.squareup.cash.pools.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;

/* loaded from: classes6.dex */
public interface PoolsListViewModel {

    public final class Error implements PoolsListViewModel {
        public final PoolCategory category;

        public Error(PoolCategory poolCategory) {
            poolCategory.getClass();
            this.category = poolCategory;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && this.category == ((Error) obj).category;
        }

        @Override // com.squareup.cash.pools.viewmodels.PoolsListViewModel
        public final PoolCategory getCategory() {
            return this.category;
        }

        public final int hashCode() {
            return this.category.hashCode();
        }

        public final String toString() {
            return "Error(category=" + this.category + ")";
        }
    }

    public final class Loaded implements PoolsListViewModel {
        public final PoolCategory category;
        public final boolean isRefreshing;
        public final PoolListNuxAssets nuxAssets;
        public final List poolSections;

        public Loaded(List list, boolean z, PoolCategory poolCategory, PoolListNuxAssets poolListNuxAssets) {
            poolCategory.getClass();
            this.poolSections = list;
            this.isRefreshing = z;
            this.category = poolCategory;
            this.nuxAssets = poolListNuxAssets;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.poolSections.equals(loaded.poolSections) && this.isRefreshing == loaded.isRefreshing && this.category == loaded.category && this.nuxAssets.equals(loaded.nuxAssets);
        }

        @Override // com.squareup.cash.pools.viewmodels.PoolsListViewModel
        public final PoolCategory getCategory() {
            return this.category;
        }

        public final int hashCode() {
            return this.nuxAssets.hashCode() + ((this.category.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.poolSections.hashCode() * 31, 31, this.isRefreshing)) * 31);
        }

        public final String toString() {
            return "Loaded(poolSections=" + this.poolSections + ", isRefreshing=" + this.isRefreshing + ", category=" + this.category + ", nuxAssets=" + this.nuxAssets + ")";
        }
    }

    public final class Loading implements PoolsListViewModel {
        public final PoolCategory category;

        public Loading(PoolCategory poolCategory) {
            poolCategory.getClass();
            this.category = poolCategory;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && this.category == ((Loading) obj).category;
        }

        @Override // com.squareup.cash.pools.viewmodels.PoolsListViewModel
        public final PoolCategory getCategory() {
            return this.category;
        }

        public final int hashCode() {
            return this.category.hashCode();
        }

        public final String toString() {
            return "Loading(category=" + this.category + ")";
        }
    }

    PoolCategory getCategory();
}
