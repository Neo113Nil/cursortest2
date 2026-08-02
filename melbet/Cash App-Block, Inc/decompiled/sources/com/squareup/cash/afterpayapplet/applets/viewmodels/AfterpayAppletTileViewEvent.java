package com.squareup.cash.afterpayapplet.applets.viewmodels;

import com.squareup.cash.money.core.ids.ItemId;

/* loaded from: classes5.dex */
public interface AfterpayAppletTileViewEvent {

    public final class AfterpayAppletOnClickTile implements AfterpayAppletTileViewEvent {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AfterpayAppletOnClickTile)) {
                return false;
            }
            ItemId.AFTERPAY afterpay = ItemId.AFTERPAY.INSTANCE;
            return afterpay.equals(afterpay);
        }

        public final int hashCode() {
            return 1621318905;
        }

        public final String toString() {
            return "AfterpayAppletOnClickTile(itemId=" + ItemId.AFTERPAY.INSTANCE + ", tapElement=null)";
        }
    }

    public final class ItemViewed implements AfterpayAppletTileViewEvent {
        public static final ItemViewed INSTANCE = new ItemViewed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ItemViewed);
        }

        public final int hashCode() {
            return 957727192;
        }

        public final String toString() {
            return "ItemViewed";
        }
    }
}
