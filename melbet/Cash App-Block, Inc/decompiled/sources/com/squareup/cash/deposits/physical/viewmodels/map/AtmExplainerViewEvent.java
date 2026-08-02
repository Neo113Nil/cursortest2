package com.squareup.cash.deposits.physical.viewmodels.map;

/* loaded from: classes6.dex */
public abstract class AtmExplainerViewEvent {

    public final class Done extends AtmExplainerViewEvent {
        public static final Done INSTANCE = new Done();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Done);
        }

        public final int hashCode() {
            return -1158364314;
        }

        public final String toString() {
            return "Done";
        }
    }

    public final class LinkClientRoute extends AtmExplainerViewEvent {
        public final String uri;

        public LinkClientRoute(String str) {
            str.getClass();
            this.uri = str;
        }
    }
}
