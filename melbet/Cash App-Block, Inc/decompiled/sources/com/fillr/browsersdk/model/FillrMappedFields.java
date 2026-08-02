package com.fillr.browsersdk.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import app.cash.passcode.screens.EndAppLock;
import com.caverock.androidsvg.SVG;
import com.fillr.browsersdk.Fillr;
import com.fillr.core.apiclientv2.ConsumerAPIClientParams;
import com.fillr.core.model.ModelBase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class FillrMappedFields extends ModelBase {
    public static final Parcelable.Creator<FillrMappedFields> CREATOR = new EndAppLock.Creator(27);
    public HashMap basicFieldPopIdMapping;
    public String domain;
    public final boolean expandIndices;
    public final ArrayList formFields;
    public JSONObject location;
    public String mFillId;
    public ArrayList mappingErrors;
    public final int mappingFlow;
    public int mappingsFlow;
    public ConsumerAPIClientParams params;
    public String path;
    public JSONObject rawResponse = null;

    public FillrMappedFields(JSONObject jSONObject, Context context, ConsumerAPIClientParams consumerAPIClientParams) {
        boolean z;
        ArrayList arrayList;
        setRawResponse(jSONObject);
        this.mFillId = (String) jSONObject.opt("fill_id");
        this.mappingsFlow = getMappingsFlowFromResponse(jSONObject);
        try {
            z = jSONObject.getBoolean("expandArrayIndexes");
        } catch (JSONException unused) {
            SVG svg = Fillr.getInstance().fillrConfig;
            z = false;
        }
        this.expandIndices = z;
        this.mappingFlow = getMappingsFlowFromResponse(jSONObject);
        ArrayList arrayList2 = new ArrayList();
        if (jSONObject.has("fields")) {
            JSONArray jSONArray = jSONObject.getJSONArray("fields");
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    arrayList2.add(new FillrMappedField(jSONArray.getJSONObject(i)));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        this.formFields = arrayList2;
        this.basicFieldPopIdMapping = FillrMappingsHelper.getMappings(context, arrayList2, this.expandIndices, this.mappingFlow, false);
        if (jSONObject.has("errors")) {
            ArrayList arrayList3 = new ArrayList();
            JSONArray jSONArray2 = jSONObject.getJSONArray("errors");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList3.add(jSONArray2.getString(i2));
            }
            arrayList = arrayList3;
        } else {
            arrayList = new ArrayList();
        }
        this.mappingErrors = arrayList;
        JSONObject optJSONObject = jSONObject.optJSONObject("location");
        this.location = optJSONObject;
        if (optJSONObject != null) {
            this.domain = optJSONObject.getString("domain");
            this.path = optJSONObject.getString("path");
        }
        String lowerCase = jSONObject.optJSONObject("locale") != null ? ((String) jSONObject.opt("locale")).toLowerCase() : "en-us";
        String str = lowerCase.split("-")[0];
        String str2 = lowerCase.split("-")[1];
        this.params = consumerAPIClientParams;
    }

    public static int getMappingsFlowFromResponse(JSONObject jSONObject) {
        String optString = jSONObject.optString("flow", null);
        if (optString == null || !optString.equalsIgnoreCase("capture")) {
            return (optString == null || !optString.equalsIgnoreCase("headless")) ? 1 : 3;
        }
        return 2;
    }

    public static void migrateFieldParams(JSONArray jSONArray, int i, HashMap hashMap) {
        JSONObject jSONObject = jSONArray.getJSONObject(i);
        if (!jSONObject.has("param") || jSONObject.getString("param").startsWith("AddressDetails")) {
            if (jSONObject.has("addressAutocompleteField") && jSONObject.getBoolean("addressAutocompleteField")) {
                return;
            }
            JSONArray jSONArray2 = new JSONArray();
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            JSONArray jSONArray3 = (jSONObject2.has("params") && (jSONObject2.get("params") instanceof JSONArray)) ? jSONObject2.getJSONArray("params") : new JSONArray();
            for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                String string2 = jSONArray3.getString(i2);
                if (jSONArray3.length() <= ((Integer) hashMap.get(string2)).intValue()) {
                    jSONArray2.put(string2);
                }
            }
            jSONObject.put("params", jSONArray2);
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

    public final void setRawResponse(JSONObject jSONObject) {
        this.rawResponse = jSONObject;
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("fields");
            HashMap hashMap = new HashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                JSONArray jSONArray2 = (jSONObject2.has("params") && (jSONObject2.get("params") instanceof JSONArray)) ? jSONObject2.getJSONArray("params") : new JSONArray();
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    String string2 = jSONArray2.getString(i2);
                    if (!hashMap.containsKey(string2) || jSONArray2.length() < ((Integer) hashMap.get(string2)).intValue()) {
                        hashMap.put(string2, Integer.valueOf(jSONArray2.length()));
                    }
                }
            }
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                migrateFieldParams(jSONArray, i3, hashMap);
            }
        } catch (Exception e) {
            Log.e(FillrMappedFields.class.getName(), "could not access fields " + e.getMessage());
        }
    }

    public final void updateRequestParamsForCache(ConsumerAPIClientParams consumerAPIClientParams) {
        if (consumerAPIClientParams.endpointData == null) {
            return;
        }
        this.params = consumerAPIClientParams;
        try {
            JSONObject jSONObject = new JSONObject(consumerAPIClientParams.endpointData);
            JSONArray jSONArray = this.rawResponse.getJSONArray("fields");
            if (jSONArray != null && jSONObject.has("fields")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("fields");
                for (int i = 0; i < jSONArray2.length(); i++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                    int parseInt = Integer.parseInt(jSONObject2.getString("pop_id"));
                    if (jSONObject2.has("empty")) {
                        boolean z = jSONObject2.getBoolean("empty");
                        Iterator it = this.basicFieldPopIdMapping.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            FillrMappedField fillrMappedField = (FillrMappedField) it.next();
                            if (fillrMappedField.popId == parseInt) {
                                fillrMappedField.fieldEmptyValue = z;
                                break;
                            }
                        }
                        Iterator it2 = this.formFields.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            FillrMappedField fillrMappedField2 = (FillrMappedField) it2.next();
                            if (fillrMappedField2.popId == parseInt) {
                                fillrMappedField2.fieldEmptyValue = z;
                                break;
                            }
                        }
                    }
                    int i2 = 0;
                    while (true) {
                        if (i2 < jSONArray.length()) {
                            JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                            if (Integer.parseInt(jSONObject3.getString("pop_id")) == parseInt) {
                                String[] strArr = FillrMapping.MUTABLE_FLAGS;
                                for (int i3 = 0; i3 < 5; i3++) {
                                    String str = strArr[i3];
                                    if (jSONObject2.has(str)) {
                                        jSONObject3.put(str, jSONObject2.get(str));
                                    }
                                }
                            } else {
                                i2++;
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        HashMap hashMap = this.basicFieldPopIdMapping;
        JSONObject jSONObject = this.rawResponse;
        parcel.writeString(jSONObject != null ? jSONObject.toString() : "");
        parcel.writeString(this.mFillId);
        parcel.writeInt(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeValue(entry.getValue());
        }
        parcel.writeStringList(this.mappingErrors);
        parcel.writeString(this.domain);
        parcel.writeString(this.path);
        JSONObject jSONObject2 = this.location;
        parcel.writeString(jSONObject2 != null ? jSONObject2.toString() : "");
        int i2 = this.mappingsFlow;
        parcel.writeInt(i2 == 0 ? -1 : CameraSelector$$ExternalSyntheticOutline0.ordinal(i2));
    }
}
