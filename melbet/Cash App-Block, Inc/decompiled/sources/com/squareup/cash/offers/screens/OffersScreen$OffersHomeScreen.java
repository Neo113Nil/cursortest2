package com.squareup.cash.offers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.cdf.offers.Origin;
import com.squareup.cash.nearby.viewmodels.ListSection;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class OffersScreen$OffersHomeScreen implements Screen {
    public static final Parcelable.Creator<OffersScreen$OffersHomeScreen> CREATOR = new ListSection.Creator(10);
    public final UUID instanceId;
    public final OriginInfo originInfo;
    public final String searchPlaceholder;

    /* loaded from: classes6.dex */
    public final class OriginInfo implements Parcelable {
        public static final Parcelable.Creator<OriginInfo> CREATOR = new ListSection.Creator(11);
        public final boolean isDeepLink;
        public final Origin origin;
        public final String referrerFlowToken;

        public OriginInfo(Origin origin, String str, boolean z) {
            this.origin = origin;
            this.referrerFlowToken = str;
            this.isDeepLink = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OriginInfo)) {
                return false;
            }
            OriginInfo originInfo = (OriginInfo) obj;
            return this.origin == originInfo.origin && Intrinsics.areEqual(this.referrerFlowToken, originInfo.referrerFlowToken) && this.isDeepLink == originInfo.isDeepLink;
        }

        public final int hashCode() {
            Origin origin = this.origin;
            int hashCode = (origin == null ? 0 : origin.hashCode()) * 31;
            String str = this.referrerFlowToken;
            return Boolean.hashCode(this.isDeepLink) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OriginInfo(origin=");
            sb.append(this.origin);
            sb.append(", referrerFlowToken=");
            sb.append(this.referrerFlowToken);
            sb.append(", isDeepLink=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isDeepLink, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Origin origin = this.origin;
            if (origin == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(origin.name());
            }
            parcel.writeString(this.referrerFlowToken);
            parcel.writeInt(this.isDeepLink ? 1 : 0);
        }
    }

    public OffersScreen$OffersHomeScreen(UUID uuid, OriginInfo originInfo, String str) {
        uuid.getClass();
        str.getClass();
        this.instanceId = uuid;
        this.originInfo = originInfo;
        this.searchPlaceholder = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersScreen$OffersHomeScreen)) {
            return false;
        }
        OffersScreen$OffersHomeScreen offersScreen$OffersHomeScreen = (OffersScreen$OffersHomeScreen) obj;
        return Intrinsics.areEqual(this.instanceId, offersScreen$OffersHomeScreen.instanceId) && Intrinsics.areEqual(this.originInfo, offersScreen$OffersHomeScreen.originInfo) && Intrinsics.areEqual(this.searchPlaceholder, offersScreen$OffersHomeScreen.searchPlaceholder);
    }

    public final int hashCode() {
        int hashCode = this.instanceId.hashCode() * 31;
        OriginInfo originInfo = this.originInfo;
        return this.searchPlaceholder.hashCode() + ((hashCode + (originInfo == null ? 0 : originInfo.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffersHomeScreen(instanceId=");
        sb.append(this.instanceId);
        sb.append(", originInfo=");
        sb.append(this.originInfo);
        sb.append(", searchPlaceholder=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.searchPlaceholder, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.instanceId);
        OriginInfo originInfo = this.originInfo;
        if (originInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            originInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.searchPlaceholder);
    }
}
