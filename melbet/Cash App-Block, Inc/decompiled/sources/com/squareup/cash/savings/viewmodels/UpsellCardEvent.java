package com.squareup.cash.savings.viewmodels;

import com.knotapi.knot.utilities.Constants;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.analytics.CdfEvent;

/* loaded from: classes7.dex */
public abstract class UpsellCardEvent {

    public final class Close extends UpsellCardEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 2042599343;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class RouterClicked extends UpsellCardEvent {
        public final CdfEvent analyticsEvent;
        public final String clientRoute;

        public RouterClicked(String str, CdfEvent cdfEvent) {
            this.clientRoute = str;
            this.analyticsEvent = cdfEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RouterClicked)) {
                return false;
            }
            RouterClicked routerClicked = (RouterClicked) obj;
            return Intrinsics.areEqual(this.clientRoute, routerClicked.clientRoute) && Intrinsics.areEqual(this.analyticsEvent, routerClicked.analyticsEvent);
        }

        public final int hashCode() {
            String str = this.clientRoute;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            CdfEvent cdfEvent = this.analyticsEvent;
            return hashCode + (cdfEvent != null ? cdfEvent.hashCode() : 0);
        }

        public final String toString() {
            return "RouterClicked(clientRoute=" + this.clientRoute + ", analyticsEvent=" + this.analyticsEvent + ")";
        }
    }
}
