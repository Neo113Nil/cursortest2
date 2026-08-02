package com.fillr.browsersdk.model;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.passcode.screens.EndAppLock;
import com.fillr.core.model.ModelBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class FillrMappedField extends ModelBase {
    public boolean fieldEmptyValue;
    public final boolean isHiddenPostMutation;
    public String name;
    public String param;
    public ArrayList params;
    public String placeholder;
    public int popId;

    /* renamed from: type, reason: collision with root package name */
    public String f986type;
    public static final HashSet ORABLE_PARAMS = new HashSet(Arrays.asList("Usernames.Username.Username"));
    public static final Parcelable.Creator<FillrMappedField> CREATOR = new EndAppLock.Creator(26);

    public FillrMappedField(JSONObject jSONObject) {
        this.popId = (jSONObject == null || jSONObject.isNull("pop_id")) ? 0 : jSONObject.getInt("pop_id");
        this.name = ModelBase.getFilteredString("name", jSONObject);
        this.placeholder = ModelBase.getFilteredString("placeholder", jSONObject);
        this.param = ModelBase.getFilteredString("param", jSONObject);
        this.f986type = ModelBase.getFilteredString("type", jSONObject);
        this.fieldEmptyValue = (jSONObject == null || jSONObject.isNull("empty")) ? false : jSONObject.getBoolean("empty");
        this.isHiddenPostMutation = (jSONObject == null || jSONObject.isNull("isHiddenPostMutation")) ? false : jSONObject.getBoolean("isHiddenPostMutation");
        JSONArray jSONArray = (jSONObject == null || jSONObject.isNull("params")) ? null : jSONObject.getJSONArray("params");
        if (jSONArray != null) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() > 1 && ORABLE_PARAMS.contains(jSONArray.getString(0))) {
                StringBuilder sb = new StringBuilder(jSONArray.getString(0));
                for (int i = 1; i < jSONArray.length(); i++) {
                    sb.append("|");
                    sb.append(jSONArray.getString(i));
                }
                arrayList.add(sb.toString());
            }
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(jSONArray.getString(i2));
            }
            this.params = new ArrayList(arrayList);
        }
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
        parcel.writeInt(this.popId);
        parcel.writeString(this.name);
        parcel.writeString(this.placeholder);
        parcel.writeString(this.f986type);
        parcel.writeString(this.param);
        parcel.writeStringList(this.params);
    }
}
