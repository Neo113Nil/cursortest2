package com.adjust.sdk;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public class GlobalParameters {
    Map<String, String> callbackParameters;
    Map<String, String> partnerParameters;

    public GlobalParameters deepCopy() {
        GlobalParameters globalParameters = new GlobalParameters();
        if (this.callbackParameters != null) {
            globalParameters.callbackParameters = new HashMap(this.callbackParameters);
        }
        if (this.partnerParameters != null) {
            globalParameters.partnerParameters = new HashMap(this.partnerParameters);
        }
        return globalParameters;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GlobalParameters globalParameters = (GlobalParameters) obj;
        return Util.equalObject(this.callbackParameters, globalParameters.callbackParameters) && Util.equalObject(this.partnerParameters, globalParameters.partnerParameters);
    }

    public int hashCode() {
        return Util.hashObject(this.partnerParameters, Util.hashObject(this.callbackParameters, 17));
    }
}
