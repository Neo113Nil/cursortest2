package com.squareup.cash.bitcoin.applets.presenters.data;

/* loaded from: classes5.dex */
public interface BitcoinRepositoryModel {

    public final class Uninstalled implements BitcoinRepositoryModel {
        public static final Uninstalled INSTANCE = new Uninstalled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Uninstalled);
        }

        public final int hashCode() {
            return 105418156;
        }

        public final String toString() {
            return "Uninstalled";
        }
    }
}
