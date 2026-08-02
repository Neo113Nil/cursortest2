package com.fillr.browsersdk.model;

import com.caverock.androidsvg.SVG;
import com.fillr.browsersdk.Fillr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class FillrMapping {
    public static final String[] MUTABLE_FLAGS = {"empty", "isReact", "isVisuallyBlurred", "isHiddenPostMutation", "previously_autofilled"};
    public final List fields;
    public final JSONObject formMetaData;
    public HashMap popIdFieldMapping;
    public LinkedHashMap profileData;
    public long startTime;

    public FillrMapping(JSONObject jSONObject, ArrayList arrayList, ArrayList arrayList2) {
        this.formMetaData = jSONObject;
        this.fields = arrayList;
    }

    public final int countVisibleFields() {
        int i = 0;
        try {
            JSONArray jSONArray = new JSONObject(this.formMetaData.toString()).getJSONArray("fields");
            int i2 = 0;
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i3);
                    jSONObject.getString("param").toLowerCase();
                    boolean z = jSONObject.has("isHiddenPostMutation") && jSONObject.getBoolean("isHiddenPostMutation");
                    boolean z2 = jSONObject.has("isVisuallyBlurred") && jSONObject.getBoolean("isVisuallyBlurred");
                    if (!z && !z2) {
                        i2++;
                    }
                } catch (Exception e) {
                    e = e;
                    i = i2;
                    e.printStackTrace();
                    return i;
                }
            }
            return i2;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final String domainWithPath() {
        StringBuilder sb = new StringBuilder();
        JSONObject optJSONObject = this.formMetaData.optJSONObject("location");
        if (optJSONObject != null) {
            try {
                sb.append(optJSONObject.getString("domain"));
                sb.append(optJSONObject.getString("path"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FillrMapping.class != obj.getClass()) {
            return false;
        }
        return this.fields.equals(((FillrMapping) obj).fields);
    }

    public final JSONObject getFormMappings(boolean z) {
        List list;
        JSONObject jSONObject = this.formMetaData;
        if (!z) {
            return jSONObject;
        }
        String profileData = getProfileData();
        HashMap hashMap = new HashMap();
        hashMap.put("Usernames.Username.Username", Integer.valueOf((profileData == null || !profileData.contains("Usernames.Username.Username")) ? 1 : 0));
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
            try {
                JSONArray jSONArray = jSONObject2.getJSONArray("fields");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    if (hashMap.containsKey(jSONObject3.getString("param"))) {
                        int intValue = ((Integer) hashMap.get(jSONObject3.getString("param"))).intValue();
                        JSONArray jSONArray2 = jSONObject3.getJSONArray("params");
                        if (jSONArray2 == null) {
                            list = Collections.EMPTY_LIST;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                                arrayList.add(jSONArray2.get(i2).toString());
                            }
                            list = arrayList;
                        }
                        if (intValue < list.size()) {
                            String str = (String) list.get(intValue);
                            JSONArray jSONArray3 = new JSONArray();
                            jSONArray3.put(str);
                            jSONObject3.put("param", str);
                            jSONObject3.put("params", jSONArray3);
                        }
                    }
                }
                return jSONObject2;
            } catch (Exception unused) {
                return jSONObject2;
            }
        } catch (Exception unused2) {
            return jSONObject;
        }
    }

    public final String getProfileData() {
        if (this.profileData == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : this.profileData.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (JSONException unused) {
                SVG svg = Fillr.getInstance().fillrConfig;
            }
        }
        return jSONObject.toString();
    }

    public final boolean hasFillableFields() {
        try {
            JSONArray jSONArray = new JSONObject(this.formMetaData.toString()).getJSONArray("fields");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                boolean z = jSONObject.has("isHiddenPostMutation") && jSONObject.getBoolean("isHiddenPostMutation");
                boolean z2 = jSONObject.has("isVisuallyBlurred") && jSONObject.getBoolean("isVisuallyBlurred");
                boolean z3 = jSONObject.has("empty") && jSONObject.getBoolean("empty");
                if (!jSONObject.getString("param").equals("ignore") && z3 && !z && !z2) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final int hashCode() {
        List list = this.fields;
        return (list != null ? list.toString().hashCode() : 0) * 31;
    }

    public final void setProfileData(LinkedHashMap linkedHashMap) {
        this.profileData = linkedHashMap;
    }

    public final void updatePopIdFieldMapping() {
        HashMap hashMap = this.popIdFieldMapping;
        if (hashMap == null) {
            this.popIdFieldMapping = new HashMap();
        } else {
            hashMap.clear();
        }
        try {
            JSONArray jSONArray = new JSONObject(this.formMetaData.toString()).getJSONArray("fields");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                this.popIdFieldMapping.put(jSONObject.getString("pop_id"), jSONObject.getString("param"));
            }
        } catch (Exception unused) {
            SVG svg = Fillr.getInstance().fillrConfig;
        }
    }
}
