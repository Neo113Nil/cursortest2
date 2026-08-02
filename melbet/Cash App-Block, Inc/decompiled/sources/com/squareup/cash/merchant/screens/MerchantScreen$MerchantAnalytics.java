package com.squareup.cash.merchant.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.limits.screens.LimitsScreen;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MerchantScreen$MerchantAnalytics implements Parcelable {
    public static final Parcelable.Creator<MerchantScreen$MerchantAnalytics> CREATOR = new LimitsScreen.Creator(8);
    public final Map genericCDFEventParameters;
    public final String queryToken;

    public MerchantScreen$MerchantAnalytics(String str, Map map) {
        this.queryToken = str;
        this.genericCDFEventParameters = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MerchantScreen$MerchantAnalytics)) {
            return false;
        }
        MerchantScreen$MerchantAnalytics merchantScreen$MerchantAnalytics = (MerchantScreen$MerchantAnalytics) obj;
        return Intrinsics.areEqual(this.queryToken, merchantScreen$MerchantAnalytics.queryToken) && Intrinsics.areEqual(this.genericCDFEventParameters, merchantScreen$MerchantAnalytics.genericCDFEventParameters);
    }

    public final int hashCode() {
        String str = this.queryToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map map = this.genericCDFEventParameters;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "MerchantAnalytics(queryToken=" + this.queryToken + ", genericCDFEventParameters=" + this.genericCDFEventParameters + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.queryToken);
        Map map = this.genericCDFEventParameters;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator m = Matcher$$ExternalSyntheticOutline0.m(parcel, 1, map);
        while (m.hasNext()) {
            Map.Entry entry = (Map.Entry) m.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
