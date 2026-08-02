package com.squareup.cash.pools.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PoolsListViewEvent {

    public final class GoBack implements PoolsListViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 492670471;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class Refresh implements PoolsListViewEvent {
        public static final Refresh INSTANCE = new Refresh();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Refresh);
        }

        public final int hashCode() {
            return -987014717;
        }

        public final String toString() {
            return "Refresh";
        }
    }

    public final class SelectCategory implements PoolsListViewEvent {
        public final PoolCategory category;

        public SelectCategory(PoolCategory poolCategory) {
            poolCategory.getClass();
            this.category = poolCategory;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectCategory) && this.category == ((SelectCategory) obj).category;
        }

        public final int hashCode() {
            return this.category.hashCode();
        }

        public final String toString() {
            return "SelectCategory(category=" + this.category + ")";
        }
    }

    public final class TapNewPool implements PoolsListViewEvent {
        public static final TapNewPool INSTANCE = new TapNewPool();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapNewPool);
        }

        public final int hashCode() {
            return 98459857;
        }

        public final String toString() {
            return "TapNewPool";
        }
    }

    public final class TapOnPool implements PoolsListViewEvent {
        public final String token;

        public TapOnPool(String str) {
            str.getClass();
            this.token = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TapOnPool) && Intrinsics.areEqual(this.token, ((TapOnPool) obj).token);
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TapOnPool(token=", this.token, ")");
        }
    }
}
