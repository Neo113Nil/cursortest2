package io.appmetrica.analytics.networktasks.internal;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ResponseDataHolder {

    /* renamed from: a, reason: collision with root package name */
    private int f7513a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f7514b;

    /* renamed from: c, reason: collision with root package name */
    private Map f7515c;

    /* renamed from: d, reason: collision with root package name */
    private final ResponseValidityChecker f7516d;

    public ResponseDataHolder(ResponseValidityChecker responseValidityChecker) {
        this.f7516d = responseValidityChecker;
    }

    public int getResponseCode() {
        return this.f7513a;
    }

    public byte[] getResponseData() {
        return this.f7514b;
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this.f7515c;
    }

    public boolean isValidResponse() {
        return this.f7516d.isResponseValid(this.f7513a);
    }

    public void setResponseCode(int i2) {
        this.f7513a = i2;
    }

    public void setResponseData(byte[] bArr) {
        this.f7514b = bArr;
    }

    public void setResponseHeaders(Map<String, List<String>> map) {
        this.f7515c = map;
    }
}
