package com.squareup.cash.buynowpaylater.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class OrderDetailRowModel {

    public final class Divider extends OrderDetailRowModel {
        public static final Divider INSTANCE = new Divider();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Divider);
        }

        public final int hashCode() {
            return 1727477538;
        }

        public final String toString() {
            return "Divider";
        }
    }

    public final class OrderDetailRowHeader extends OrderDetailRowModel {
        public final TextModel detail;
        public final TextModel title;

        public OrderDetailRowHeader(TextModel textModel, TextModel textModel2) {
            this.title = textModel;
            this.detail = textModel2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderDetailRowHeader)) {
                return false;
            }
            OrderDetailRowHeader orderDetailRowHeader = (OrderDetailRowHeader) obj;
            return Intrinsics.areEqual(this.title, orderDetailRowHeader.title) && Intrinsics.areEqual(this.detail, orderDetailRowHeader.detail);
        }

        public final int hashCode() {
            TextModel textModel = this.title;
            int hashCode = (textModel == null ? 0 : textModel.hashCode()) * 31;
            TextModel textModel2 = this.detail;
            return hashCode + (textModel2 != null ? textModel2.hashCode() : 0);
        }

        public final String toString() {
            return "OrderDetailRowHeader(title=" + this.title + ", detail=" + this.detail + ")";
        }
    }

    public final class Spacer extends OrderDetailRowModel {
        public static final Spacer INSTANCE = new Spacer();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Spacer);
        }

        public final int hashCode() {
            return -1864308989;
        }

        public final String toString() {
            return "Spacer";
        }
    }
}
