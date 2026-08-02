package com.fillr.core.apiclientv2;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import app.cash.passcode.screens.EndAppLock;
import java.util.Objects;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes4.dex */
public final class ConsumerAPIClientParams implements Parcelable {
    public static final Parcelable.Creator<ConsumerAPIClientParams> CREATOR = new EndAppLock.Creator(29);
    public String cacheIdentifier;
    public String endpointData;
    public Bundle endpointDataExtras;
    public String mAccessToken;
    public String mApiHost;
    public APIEndpoint mEndpoint;
    public Bundle mQueryParams;
    public Bundle mSpecialParams;

    public final void appendQueryParams(Uri.Builder builder) {
        Bundle bundle = this.mQueryParams;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object obj = this.mQueryParams.get(str);
                if (obj != null) {
                    builder.appendQueryParameter(str, obj.toString());
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsumerAPIClientParams)) {
            return false;
        }
        ConsumerAPIClientParams consumerAPIClientParams = (ConsumerAPIClientParams) obj;
        return Objects.equals(this.mApiHost, consumerAPIClientParams.mApiHost) && this.mEndpoint == consumerAPIClientParams.mEndpoint && Objects.equals(this.mQueryParams, consumerAPIClientParams.mQueryParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    public final String getEndpointData$1() {
        Bundle bundle;
        if (this.endpointData == null || (bundle = this.endpointDataExtras) == null || bundle.isEmpty()) {
            return this.endpointData;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.endpointData);
            for (String str : this.endpointDataExtras.keySet()) {
                Object string2 = this.endpointDataExtras.getString(str);
                if (string2.matches("^[\\[\\{].*$")) {
                    string2 = new JSONTokener(string2).nextValue();
                }
                jSONObject.put(str, string2);
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return this.endpointData;
        }
    }

    public final int hashCode() {
        return Objects.hash(this.mApiHost, this.mEndpoint, this.mQueryParams);
    }

    public final void putQueryParam(String str, String str2) {
        if (this.mQueryParams == null) {
            this.mQueryParams = new Bundle();
        }
        this.mQueryParams.putString(str, str2);
    }

    public final void setEndpointData(JSONObject jSONObject) {
        this.endpointData = null;
        if (jSONObject != null) {
            this.endpointData = jSONObject.toString();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mApiHost);
        parcel.writeString(this.endpointData);
        APIEndpoint aPIEndpoint = this.mEndpoint;
        parcel.writeInt(aPIEndpoint != null ? aPIEndpoint.mCode : -1);
        parcel.writeBundle(this.mQueryParams);
        parcel.writeBundle(this.mSpecialParams);
        parcel.writeString(this.mAccessToken);
        parcel.writeString(this.cacheIdentifier);
        parcel.writeBundle(this.endpointDataExtras);
    }
}
