package com.netcetera.threeds.sdk.infrastructure;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.Key;

/* loaded from: classes5.dex */
public class qs extends qx {
    private Boolean ThreeDS2ServiceInstance;
    private byte[] get;
    private String getWarnings;
    private String initialize = "UTF-8";

    public qs() {
        if (Boolean.getBoolean("org.jose4j.jws.default-allow-none")) {
            return;
        }
        get(pe.initialize);
    }

    private String ThreeDS2ServiceInitializationCallback() {
        return rr.ThreeDS2Service(this.get, this.initialize);
    }

    private qu get(boolean z) {
        String paramValue = getParamValue();
        if (paramValue == null) {
            throw new rm("Signature algorithm header (alg) not set.");
        }
        if (z) {
            ConfigurationBuilder().getWarnings(paramValue);
        }
        return pi.ThreeDS2ServiceInstance().initialize().get(paramValue);
    }

    private byte[] getSDKInfo() {
        if (!ThreeDS2Service()) {
            return rr.get(qt.ThreeDS2ServiceInstance(onError(), getSDKVersion()));
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(rr.get(onError()));
            byteArrayOutputStream.write(46);
            byteArrayOutputStream.write(this.get);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new ro("This should never happen from a ByteArrayOutputStream", e);
        }
    }

    public boolean ThreeDS2Service() {
        Object initialize = this.getSDKVersion.initialize("b64");
        return (initialize == null || !(initialize instanceof Boolean) || ((Boolean) initialize).booleanValue()) ? false : true;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.qx
    public void ThreeDS2ServiceInstance(String[] strArr) {
        if (strArr.length != 3) {
            throw new ro("A JWS Compact Serialization must have exactly 3 parts separated by period ('.') characters");
        }
        cleanup(strArr[0]);
        ThreeDS2ServiceInstance(strArr[1]);
        initialize(this.ThreeDS2Service.getWarnings(strArr[2]));
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.qx
    public void a_() {
        this.ThreeDS2ServiceInstance = null;
    }

    public byte[] cleanup() {
        return restrictedParameters();
    }

    public String createTransaction() {
        return ThreeDS2ServiceInitializationCallback();
    }

    public String getSDKVersion() {
        String str = this.getWarnings;
        return str != null ? str : this.ThreeDS2Service.ThreeDS2ServiceInstance(this.get);
    }

    public boolean getWarnings() {
        qu quVar = get();
        Key addParam = addParam();
        if (removeParam()) {
            quVar.getWarnings(addParam);
        }
        if (this.ThreeDS2ServiceInstance == null) {
            configureScheme();
            this.ThreeDS2ServiceInstance = Boolean.valueOf(quVar.get(cleanup(), addParam, getSDKInfo(), apiKey()));
        }
        return this.ThreeDS2ServiceInstance.booleanValue();
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.qx
    public boolean initialize(String str) {
        return "b64".equals(str);
    }

    public void initialize(byte[] bArr) {
        getWarnings(bArr);
    }

    public String ThreeDS2ServiceInstance() {
        if (!Boolean.getBoolean("org.jose4j.jws.getPayload-skip-verify") && !getWarnings()) {
            throw new rk("JWS signature is invalid.");
        }
        return ThreeDS2ServiceInitializationCallback();
    }

    public qu get() {
        return get(true);
    }

    public void ThreeDS2ServiceInstance(String str) {
        this.getWarnings = str;
        this.get = this.ThreeDS2Service.getWarnings(str);
    }
}
