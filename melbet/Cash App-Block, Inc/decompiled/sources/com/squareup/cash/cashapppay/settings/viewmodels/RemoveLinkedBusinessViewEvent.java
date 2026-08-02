package com.squareup.cash.cashapppay.settings.viewmodels;

/* loaded from: classes6.dex */
public interface RemoveLinkedBusinessViewEvent {

    public final class Cancel implements RemoveLinkedBusinessViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return 407549414;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class Remove implements RemoveLinkedBusinessViewEvent {
        public static final Remove INSTANCE = new Remove();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Remove);
        }

        public final int hashCode() {
            return 840663024;
        }

        public final String toString() {
            return "Remove";
        }
    }
}
