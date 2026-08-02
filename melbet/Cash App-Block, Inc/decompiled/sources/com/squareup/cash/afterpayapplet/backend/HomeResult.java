package com.squareup.cash.afterpayapplet.backend;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHome;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface HomeResult {

    public final class Empty implements HomeResult {
        public static final Empty INSTANCE = new Empty();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public final int hashCode() {
            return -751268757;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public final class HomeData implements HomeResult {
        public final AfterpayAppletResponse data;
        public final AfterpayAppletHome.OnDisplayMessage displayMessageToShow;
        public final List transactions;

        public HomeData(AfterpayAppletResponse afterpayAppletResponse, List list, AfterpayAppletHome.OnDisplayMessage onDisplayMessage) {
            afterpayAppletResponse.getClass();
            list.getClass();
            this.data = afterpayAppletResponse;
            this.transactions = list;
            this.displayMessageToShow = onDisplayMessage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HomeData)) {
                return false;
            }
            HomeData homeData = (HomeData) obj;
            return Intrinsics.areEqual(this.data, homeData.data) && Intrinsics.areEqual(this.transactions, homeData.transactions) && Intrinsics.areEqual(this.displayMessageToShow, homeData.displayMessageToShow);
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(this.data.hashCode() * 31, 31, this.transactions);
            AfterpayAppletHome.OnDisplayMessage onDisplayMessage = this.displayMessageToShow;
            return m + (onDisplayMessage == null ? 0 : onDisplayMessage.hashCode());
        }

        public final String toString() {
            return "HomeData(data=" + this.data + ", transactions=" + this.transactions + ", displayMessageToShow=" + this.displayMessageToShow + ")";
        }
    }

    public final class HomeError implements HomeResult {
        public static final HomeError INSTANCE = new HomeError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HomeError);
        }

        public final int hashCode() {
            return 59992199;
        }

        public final String toString() {
            return "HomeError";
        }
    }

    public final class HomeLoading implements HomeResult {
        public static final HomeLoading INSTANCE = new HomeLoading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HomeLoading);
        }

        public final int hashCode() {
            return -661400581;
        }

        public final String toString() {
            return "HomeLoading";
        }
    }
}
