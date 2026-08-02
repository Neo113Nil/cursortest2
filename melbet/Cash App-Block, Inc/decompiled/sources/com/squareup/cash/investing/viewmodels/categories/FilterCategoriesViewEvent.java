package com.squareup.cash.investing.viewmodels.categories;

import com.squareup.cash.investing.primitives.CategoryToken;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class FilterCategoriesViewEvent {

    public final class ResetClick extends FilterCategoriesViewEvent {
        public static final ResetClick INSTANCE = new ResetClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ResetClick);
        }

        public final int hashCode() {
            return 2134835788;
        }

        public final String toString() {
            return "ResetClick";
        }
    }

    public final class RowClick extends FilterCategoriesViewEvent {
        public final CategoryToken token;

        public RowClick(CategoryToken categoryToken) {
            categoryToken.getClass();
            this.token = categoryToken;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RowClick) && Intrinsics.areEqual(this.token, ((RowClick) obj).token);
        }

        public final int hashCode() {
            return this.token.value.hashCode();
        }

        public final String toString() {
            return "RowClick(token=" + this.token + ")";
        }
    }

    public final class SubmitClick extends FilterCategoriesViewEvent {
        public static final SubmitClick INSTANCE = new SubmitClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SubmitClick);
        }

        public final int hashCode() {
            return -1273778723;
        }

        public final String toString() {
            return "SubmitClick";
        }
    }
}
