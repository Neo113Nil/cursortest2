package com.squareup.cash.cashapppay.settings.backend;

/* loaded from: classes6.dex */
public abstract class BusinessGrantManager$DeleteResult {

    public final class Failed extends BusinessGrantManager$DeleteResult {
        public static final Failed INSTANCE = new Failed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public final int hashCode() {
            return -2058805847;
        }

        public final String toString() {
            return "Failed";
        }
    }

    public final class Success extends BusinessGrantManager$DeleteResult {
        public static final Success INSTANCE = new Success();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return -179051497;
        }

        public final String toString() {
            return "Success";
        }
    }
}
