package com.squareup.cash.activity.backend;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface ActivityUpdatesNotifier$UpdateScope {

    public final class Feed implements ActivityUpdatesNotifier$UpdateScope {
        public static final Feed INSTANCE = new Feed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Feed);
        }

        public final int hashCode() {
            return -1714925387;
        }

        public final String toString() {
            return "Feed";
        }
    }

    public final class Item implements ActivityUpdatesNotifier$UpdateScope {
        public final String itemId;

        public Item(String str) {
            str.getClass();
            this.itemId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Item) && Intrinsics.areEqual(this.itemId, ((Item) obj).itemId);
        }

        public final int hashCode() {
            return this.itemId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Item(itemId=", this.itemId, ")");
        }
    }
}
