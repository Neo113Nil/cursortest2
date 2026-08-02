package com.squareup.cash.autofillweb.api;

/* loaded from: classes5.dex */
public interface CashFillConfig {

    public final class Disabled implements CashFillConfig {
        public static final Disabled INSTANCE = new Disabled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Disabled);
        }

        public final int hashCode() {
            return -207847072;
        }

        public final String toString() {
            return "Disabled";
        }
    }

    public final class Enabled implements CashFillConfig {
        public static final Enabled INSTANCE = new Enabled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Enabled);
        }

        public final int hashCode() {
            return 453171165;
        }

        public final String toString() {
            return "Enabled";
        }
    }

    public final class Spectator implements CashFillConfig {
        public static final Spectator INSTANCE = new Spectator();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Spectator);
        }

        public final int hashCode() {
            return 652851851;
        }

        public final String toString() {
            return "Spectator";
        }
    }
}
