package com.squareup.cash.clientrouting.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.clientrouting.data.RoutingParams;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class FeatureContext implements Parcelable {

    public final class MoneybotChatContext extends FeatureContext {
        public static final Parcelable.Creator<MoneybotChatContext> CREATOR = new RoutingParams.Creator(13);
        public final String sessionId;
        public final String toolRequestId;

        public MoneybotChatContext(String str, String str2) {
            str.getClass();
            this.sessionId = str;
            this.toolRequestId = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MoneybotChatContext)) {
                return false;
            }
            MoneybotChatContext moneybotChatContext = (MoneybotChatContext) obj;
            return Intrinsics.areEqual(this.sessionId, moneybotChatContext.sessionId) && Intrinsics.areEqual(this.toolRequestId, moneybotChatContext.toolRequestId);
        }

        public final int hashCode() {
            int hashCode = this.sessionId.hashCode() * 31;
            String str = this.toolRequestId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("MoneybotChatContext(sessionId=", this.sessionId, ", toolRequestId=", this.toolRequestId, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.sessionId);
            parcel.writeString(this.toolRequestId);
        }
    }

    public final class MoneybotHomeContext extends FeatureContext {
        public static final Parcelable.Creator<MoneybotHomeContext> CREATOR = new RoutingParams.Creator(14);
        public final String homeItemId;
        public final String homeItemType;
        public final String homeSessionId;

        public MoneybotHomeContext(String str, String str2, String str3) {
            str.getClass();
            this.homeSessionId = str;
            this.homeItemType = str2;
            this.homeItemId = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MoneybotHomeContext)) {
                return false;
            }
            MoneybotHomeContext moneybotHomeContext = (MoneybotHomeContext) obj;
            return Intrinsics.areEqual(this.homeSessionId, moneybotHomeContext.homeSessionId) && Intrinsics.areEqual(this.homeItemType, moneybotHomeContext.homeItemType) && Intrinsics.areEqual(this.homeItemId, moneybotHomeContext.homeItemId);
        }

        public final int hashCode() {
            int hashCode = this.homeSessionId.hashCode() * 31;
            String str = this.homeItemType;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.homeItemId;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MoneybotHomeContext(homeSessionId=", this.homeSessionId, ", homeItemType=", this.homeItemType, ", homeItemId="), this.homeItemId, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.homeSessionId);
            parcel.writeString(this.homeItemType);
            parcel.writeString(this.homeItemId);
        }
    }
}
