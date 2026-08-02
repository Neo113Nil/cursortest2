package com.netcetera.threeds.sdk.infrastructure;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.security.Key;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class qx {
    private static final or cleanup = new or();
    private Key ThreeDS2ServiceInstance;
    private byte[] get;
    protected String getSDKInfo;
    protected oq ThreeDS2Service = new oq();
    protected qz getSDKVersion = new qz();
    protected boolean ThreeDS2ServiceInitializationCallback = true;
    private pe initialize = pe.ThreeDS2ServiceInstance;
    private Set<String> getWarnings = Collections.EMPTY_SET;
    private or createTransaction = cleanup;

    public qz ConfigParameters() {
        return this.getSDKVersion;
    }

    public pe ConfigurationBuilder() {
        return this.initialize;
    }

    public void ThreeDS2Service(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new ro(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("The ", str2, " cannot be empty."));
        }
    }

    public String ThreeDS2ServiceInitializationCallback(String str) {
        return this.getSDKVersion.ThreeDS2ServiceInstance(str);
    }

    public void ThreeDS2ServiceInstance(Key key) {
        Key key2 = this.ThreeDS2ServiceInstance;
        if (key != null ? key2 == null || !key.equals(key2) : key2 != null) {
            a_();
        }
        this.ThreeDS2ServiceInstance = key;
    }

    public abstract void ThreeDS2ServiceInstance(String[] strArr);

    public void a_() {
    }

    public Key addParam() {
        return this.ThreeDS2ServiceInstance;
    }

    public or apiKey() {
        return this.createTransaction;
    }

    public void cleanup(String str) {
        ThreeDS2Service(str, "Encoded Header");
        this.getSDKVersion.getWarnings(str);
    }

    public void configureScheme() {
        Object initialize = this.getSDKVersion.initialize("crit");
        if (initialize != null) {
            try {
                for (String str : (List) initialize) {
                    if (!this.getWarnings.contains(str) && !initialize(str)) {
                        throw new ro("Unrecognized header '" + str + "' marked as critical.");
                    }
                }
            } catch (ClassCastException unused) {
                throw new ro("crit header value not an array.");
            }
        }
    }

    public void createTransaction(String str) {
        initialize("alg", str);
    }

    public void get(String str) {
        ThreeDS2ServiceInstance(qt.get(str));
        this.getSDKInfo = str;
    }

    public String getParamValue() {
        return ThreeDS2ServiceInitializationCallback("alg");
    }

    public void getSDKInfo(String str) {
        initialize("kid", str);
    }

    public void getWarnings(byte[] bArr) {
        this.get = bArr;
    }

    public void initialize(String str, String str2) {
        this.getSDKVersion.ThreeDS2Service(str, str2);
    }

    public List<X509Certificate> onCompleted() {
        Object initialize = this.getSDKVersion.initialize("x5c");
        if (!(initialize instanceof List)) {
            return null;
        }
        List list = (List) initialize;
        ArrayList arrayList = new ArrayList(list.size());
        rj rjVar = new rj();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(rjVar.initialize((String) it.next()));
        }
        return arrayList;
    }

    public String onError() {
        return this.getSDKVersion.getWarnings();
    }

    public boolean removeParam() {
        return this.ThreeDS2ServiceInitializationCallback;
    }

    public byte[] restrictedParameters() {
        return this.get;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(ConfigParameters().initialize());
        if (this.getSDKInfo != null) {
            sb.append("->");
            sb.append(this.getSDKInfo);
        }
        return sb.toString();
    }

    public boolean initialize(String str) {
        return false;
    }

    public void get(pe peVar) {
        this.initialize = peVar;
    }

    public void get(or orVar) {
        this.createTransaction = orVar;
    }
}
