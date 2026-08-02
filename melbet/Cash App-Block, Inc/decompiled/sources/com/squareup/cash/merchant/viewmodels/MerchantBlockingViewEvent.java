package com.squareup.cash.merchant.viewmodels;

import kotlin.jvm.internal.Intrinsics;
import squareup.cash.analytics.CdfEvent;

/* loaded from: classes6.dex */
public interface MerchantBlockingViewEvent {

    public final class CloseClicked implements MerchantBlockingViewEvent {
        public static final CloseClicked INSTANCE = new CloseClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseClicked);
        }

        public final int hashCode() {
            return -1324610832;
        }

        public final String toString() {
            return "CloseClicked";
        }
    }

    public final class RouterClicked implements MerchantBlockingViewEvent {
        public final CdfEvent cdfEvent;
        public final String clientRoute;

        public RouterClicked(String str, CdfEvent cdfEvent) {
            str.getClass();
            this.clientRoute = str;
            this.cdfEvent = cdfEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RouterClicked)) {
                return false;
            }
            RouterClicked routerClicked = (RouterClicked) obj;
            return Intrinsics.areEqual(this.clientRoute, routerClicked.clientRoute) && Intrinsics.areEqual(this.cdfEvent, routerClicked.cdfEvent);
        }

        public final int hashCode() {
            int hashCode = this.clientRoute.hashCode() * 31;
            CdfEvent cdfEvent = this.cdfEvent;
            return hashCode + (cdfEvent == null ? 0 : cdfEvent.hashCode());
        }

        public final String toString() {
            return "RouterClicked(clientRoute=" + this.clientRoute + ", cdfEvent=" + this.cdfEvent + ")";
        }
    }
}
