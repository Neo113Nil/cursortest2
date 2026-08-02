package com.fillr.core.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.fillr.core.apiclientv2.ConsumerAPIClientParams;
import com.google.android.gms.appset.zzd;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import net.oneformapp.schema.Element;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class FillrAddressParseComponentList extends ModelBase {
    public static final Parcelable.Creator<FillrAddressParseComponentList> CREATOR;
    public ArrayList mComponentList = new ArrayList();
    public String mDomain;
    public Element mSelectedAddress;

    static {
        new Gson();
        CREATOR = new zzd(2);
    }

    public FillrAddressParseComponentList(JSONObject jSONObject, ConsumerAPIClientParams consumerAPIClientParams) {
        this.mSelectedAddress = null;
        this.mDomain = null;
        JSONObject jSONObject2 = (jSONObject == null || jSONObject.isNull("address")) ? null : jSONObject.getJSONObject("address");
        JSONObject jSONObject3 = (jSONObject2 == null || jSONObject2.isNull("parsed")) ? null : jSONObject2.getJSONObject("parsed");
        if (jSONObject3 != null) {
            Iterator<String> keys = jSONObject3.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String string2 = jSONObject3.getString(next);
                FillrAddressParseComponent fillrAddressParseComponent = new FillrAddressParseComponent();
                fillrAddressParseComponent.mParam = next;
                fillrAddressParseComponent.mValue = string2;
                this.mComponentList.add(fillrAddressParseComponent);
            }
        }
        Bundle bundle = consumerAPIClientParams.mSpecialParams;
        this.mSelectedAddress = (Element) (bundle != null ? (ModelBase) bundle.getParcelable("profile_element") : null);
        Bundle bundle2 = consumerAPIClientParams.mSpecialParams;
        this.mDomain = bundle2 != null ? bundle2.getString("domain") : null;
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
