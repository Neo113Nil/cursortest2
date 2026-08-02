package com.netcetera.threeds.sdk.api.configparameters;

import com.netcetera.threeds.sdk.api.exceptions.InvalidInputException;
import com.netcetera.threeds.sdk.infrastructure.ng;
import com.netcetera.threeds.sdk.infrastructure.oj;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class ConfigParameters {
    private static int ThreeDS2Service = 0;
    private static int get = 1;
    private HashMap<String, HashMap<String, String>> initialize = new HashMap<>();

    public void addParam(String str, String str2, String str3) {
        get = (ThreeDS2Service + 43) % 128;
        ng.ThreeDS2Service(str2, "paramName");
        ng.ThreeDS2Service(str3, "paramValue");
        String warnings = oj.getWarnings(str);
        String warnings2 = oj.getWarnings(str2);
        if (!this.initialize.containsKey(warnings)) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put(warnings2, str3);
            this.initialize.put(warnings, hashMap);
        } else {
            ThreeDS2Service = (get + 19) % 128;
            HashMap<String, String> hashMap2 = this.initialize.get(warnings);
            if (hashMap2.containsKey(warnings2)) {
                throw new InvalidInputException("There is already parameter with that name in the specified group");
            }
            hashMap2.put(warnings2, str3);
            ThreeDS2Service = (get + 103) % 128;
        }
    }

    public String getParamValue(String str, String str2) {
        ThreeDS2Service = (get + 41) % 128;
        ng.ThreeDS2Service(str2, "paramName");
        String warnings = oj.getWarnings(str);
        String str3 = this.initialize.containsKey(warnings) ? this.initialize.get(warnings).get(oj.getWarnings(str2)) : null;
        int i = ThreeDS2Service + 113;
        get = i % 128;
        if (i % 2 != 0) {
            return str3;
        }
        throw null;
    }

    public String removeParam(String str, String str2) {
        String str3;
        ng.ThreeDS2Service(str2, "paramName");
        String warnings = oj.getWarnings(str);
        String warnings2 = oj.getWarnings(str2);
        if (this.initialize.containsKey(warnings)) {
            get = (ThreeDS2Service + 69) % 128;
            str3 = this.initialize.get(warnings).remove(warnings2);
        } else {
            str3 = null;
        }
        get = (ThreeDS2Service + 21) % 128;
        return str3;
    }
}
