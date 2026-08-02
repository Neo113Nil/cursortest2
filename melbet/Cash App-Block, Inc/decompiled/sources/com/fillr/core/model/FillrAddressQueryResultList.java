package com.fillr.core.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.fillr.core.apiclientv2.ConsumerAPIClientParams;
import com.google.android.gms.appset.zzd;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class FillrAddressQueryResultList extends ModelBase implements Serializable {
    public ArrayList mComponentList = new ArrayList();
    public static final Gson gson = new Gson();
    public static final Parcelable.Creator<FillrAddressQueryResultList> CREATOR = new zzd(3);

    public FillrAddressQueryResultList(JSONObject jSONObject, ConsumerAPIClientParams consumerAPIClientParams) {
        JSONArray jSONArray = (jSONObject == null || jSONObject.isNull("predictions")) ? null : jSONObject.getJSONArray("predictions");
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                this.mComponentList.add((FillrAddressQueryResult) gson.fromJson(new JsonParser().parse(jSONArray.getJSONObject(i).toString()), FillrAddressQueryResult.class));
            }
        }
        Bundle bundle = consumerAPIClientParams.mSpecialParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.fillr.core.model.ModelBase
    public final boolean onValidate() {
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.mComponentList);
    }
}
