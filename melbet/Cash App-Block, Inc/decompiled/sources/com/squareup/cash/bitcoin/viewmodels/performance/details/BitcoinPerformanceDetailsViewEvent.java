package com.squareup.cash.bitcoin.viewmodels.performance.details;

import com.squareup.cash.bitcoin.viewmodels.performance.details.BitcoinPerformanceDetailsContentViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BitcoinPerformanceDetailsViewEvent {

    public final class BackClicked implements BitcoinPerformanceDetailsViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return -786901602;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class InfoBottomSheetClosed implements BitcoinPerformanceDetailsViewEvent {
        public static final InfoBottomSheetClosed INSTANCE = new InfoBottomSheetClosed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InfoBottomSheetClosed);
        }

        public final int hashCode() {
            return -2051186608;
        }

        public final String toString() {
            return "InfoBottomSheetClosed";
        }
    }

    public final class InfoItemClicked implements BitcoinPerformanceDetailsViewEvent {
        public final BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem item;

        public InfoItemClicked(BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem bitcoinPerformanceDetailsSectionInfoItem) {
            bitcoinPerformanceDetailsSectionInfoItem.getClass();
            this.item = bitcoinPerformanceDetailsSectionInfoItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InfoItemClicked) && Intrinsics.areEqual(this.item, ((InfoItemClicked) obj).item);
        }

        public final int hashCode() {
            return this.item.hashCode();
        }

        public final String toString() {
            return "InfoItemClicked(item=" + this.item + ")";
        }
    }

    public final class UrlClicked implements BitcoinPerformanceDetailsViewEvent {
        public final String url;

        public UrlClicked(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UrlClicked) && Intrinsics.areEqual(this.url, ((UrlClicked) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UrlClicked(url=", this.url, ")");
        }
    }
}
