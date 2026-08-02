package com.fillr.core.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.fillr.core.apiclientv2.ConsumerAPIClientParams;
import com.google.android.gms.appset.zzd;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import java.util.ArrayList;
import net.oneformapp.schema.Element;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class FillrAddressComponentList extends ModelBase {
    public ArrayList mComponentList = new ArrayList();
    public Element mSelectedAddress;
    public static final Gson gson = new Gson();
    public static final Parcelable.Creator<FillrAddressComponentList> CREATOR = new zzd(1);

    public FillrAddressComponentList(JSONObject jSONObject, ConsumerAPIClientParams consumerAPIClientParams) {
        this.mSelectedAddress = null;
        JSONObject jSONObject2 = (jSONObject == null || jSONObject.isNull("result")) ? null : jSONObject.getJSONObject("result");
        JSONArray jSONArray = (jSONObject2 == null || jSONObject2.isNull("address_components")) ? null : jSONObject2.getJSONArray("address_components");
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                this.mComponentList.add((FillrAddressComponent) gson.fromJson(new JsonParser().parse(jSONArray.getJSONObject(i).toString()), FillrAddressComponent.class));
            }
        }
        Bundle bundle = consumerAPIClientParams.mSpecialParams;
        this.mSelectedAddress = (Element) (bundle != null ? (ModelBase) bundle.getParcelable("profile_element") : null);
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
