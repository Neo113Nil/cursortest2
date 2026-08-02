package com.squareup.cash.borrow.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BorrowLimitHubViewEvent {

    public final class Close implements BorrowLimitHubViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1319450616;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    /* loaded from: classes4.dex */
    public final class OpenUrl implements BorrowLimitHubViewEvent {
        public final String url;

        public OpenUrl(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenUrl) && Intrinsics.areEqual(this.url, ((OpenUrl) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenUrl(url=", this.url, ")");
        }
    }

    public final class TapIncreaseLimitActionRow implements BorrowLimitHubViewEvent {
        public final String actionUrl;
        public final String analyticsId;

        public TapIncreaseLimitActionRow(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.actionUrl = str;
            this.analyticsId = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TapIncreaseLimitActionRow)) {
                return false;
            }
            TapIncreaseLimitActionRow tapIncreaseLimitActionRow = (TapIncreaseLimitActionRow) obj;
            return Intrinsics.areEqual(this.actionUrl, tapIncreaseLimitActionRow.actionUrl) && Intrinsics.areEqual(this.analyticsId, tapIncreaseLimitActionRow.analyticsId);
        }

        public final int hashCode() {
            return this.analyticsId.hashCode() + (this.actionUrl.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("TapIncreaseLimitActionRow(actionUrl=", this.actionUrl, ", analyticsId=", this.analyticsId, ")");
        }
    }
}
