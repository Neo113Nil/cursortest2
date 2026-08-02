package com.netcetera.threeds.sdk.infrastructure;

import java.security.Key;

/* loaded from: classes5.dex */
public class qr extends pl implements qu {
    public qr() {
        getWarnings("none");
        get(rd.NONE);
    }

    private void initialize(Key key) {
        if (key != null) {
            throw new rn("JWS Plaintext (alg=none) must not use a key.");
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.qu
    public boolean get(byte[] bArr, Key key, byte[] bArr2, or orVar) {
        initialize(key);
        return bArr.length == 0;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.qu
    public void getWarnings(Key key) {
        initialize(key);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.pc
    public boolean initialize() {
        return true;
    }
}
