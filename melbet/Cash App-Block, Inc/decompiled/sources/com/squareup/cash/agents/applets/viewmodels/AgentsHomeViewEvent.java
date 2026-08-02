package com.squareup.cash.agents.applets.viewmodels;

/* loaded from: classes5.dex */
public interface AgentsHomeViewEvent {

    public final class TapBack implements AgentsHomeViewEvent {
        public static final TapBack INSTANCE = new TapBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapBack);
        }

        public final int hashCode() {
            return 717383976;
        }

        public final String toString() {
            return "TapBack";
        }
    }

    public final class TapCreateAgent implements AgentsHomeViewEvent {
        public static final TapCreateAgent INSTANCE = new TapCreateAgent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapCreateAgent);
        }

        public final int hashCode() {
            return -1115197432;
        }

        public final String toString() {
            return "TapCreateAgent";
        }
    }
}
