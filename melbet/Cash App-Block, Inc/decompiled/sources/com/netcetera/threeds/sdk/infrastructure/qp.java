package com.netcetera.threeds.sdk.infrastructure;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.security.Key;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public class qp extends pl implements qu {
    private int initialize;

    public static class ThreeDS2Service extends qp {
        public ThreeDS2Service() {
            super("HS256", "HmacSHA256", 256);
        }
    }

    public static class get extends qp {
        public get() {
            super("HS384", "HmacSHA384", MLKEMEngine.KyberPolyBytes);
        }
    }

    public static class initialize extends qp {
        public initialize() {
            super("HS512", "HmacSHA512", 512);
        }
    }

    public qp(String str, String str2, int i) {
        getWarnings(str);
        initialize(str2);
        get(rd.SYMMETRIC);
        ThreeDS2Service("oct");
        this.initialize = i;
    }

    private Mac ThreeDS2Service(Key key, or orVar) {
        return rq.ThreeDS2Service(get(), key, orVar.initialize().get());
    }

    public void ThreeDS2ServiceInstance(Key key) {
        int ThreeDS2ServiceInstance;
        if (key == null) {
            throw new rn("key is null");
        }
        if (key.getEncoded() == null || (ThreeDS2ServiceInstance = rf.ThreeDS2ServiceInstance(key.getEncoded())) >= this.initialize) {
            return;
        }
        StringBuilder sb = new StringBuilder("A key of the same size as the hash output (i.e. ");
        sb.append(this.initialize);
        sb.append(" bits for ");
        sb.append(ThreeDS2ServiceInstance());
        sb.append(") or larger MUST be used with the HMAC SHA algorithms but this key is only ");
        throw new rn(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(ThreeDS2ServiceInstance, " bits", sb));
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.qu
    public boolean get(byte[] bArr, Key key, byte[] bArr2, or orVar) {
        if (key instanceof SecretKey) {
            return rf.getWarnings(bArr, ThreeDS2Service(key, orVar).doFinal(bArr2));
        }
        throw new rn(SVG$Unit$EnumUnboxingLocalUtility.m(key, new StringBuilder(), " cannot be used for HMAC verification."));
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.qu
    public void getWarnings(Key key) {
        ThreeDS2ServiceInstance(key);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.pc
    public boolean initialize() {
        return pg.ThreeDS2Service("Mac", get());
    }
}
