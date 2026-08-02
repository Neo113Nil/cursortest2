package com.squareup.cash.offers.backend.api;

import app.cash.api.ApiResult;
import com.squareup.protos.cash.cashsuggest.api.OffersTabHomeResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface HomeResult {

    public final class HomeData implements HomeResult {
        public final OffersTabHomeResponse data;
        public final boolean hasValidCache;

        public HomeData(OffersTabHomeResponse offersTabHomeResponse, boolean z) {
            offersTabHomeResponse.getClass();
            this.data = offersTabHomeResponse;
            this.hasValidCache = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HomeData)) {
                return false;
            }
            HomeData homeData = (HomeData) obj;
            return Intrinsics.areEqual(this.data, homeData.data) && this.hasValidCache == homeData.hasValidCache;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.hasValidCache) + (this.data.hashCode() * 31);
        }

        public final String toString() {
            return "HomeData(data=" + this.data + ", hasValidCache=" + this.hasValidCache + ")";
        }
    }

    public final class HomeError implements HomeResult {
        public final ApiResult.Failure result;

        public HomeError(ApiResult.Failure failure) {
            this.result = failure;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HomeError) && this.result.equals(((HomeError) obj).result);
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final String toString() {
            return "HomeError(result=" + this.result + ")";
        }
    }

    public final class HomeLoading implements HomeResult {
        public static final HomeLoading INSTANCE = new HomeLoading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HomeLoading);
        }

        public final int hashCode() {
            return -734910018;
        }

        public final String toString() {
            return "HomeLoading";
        }
    }
}
