package com.netcetera.threeds.sdk.infrastructure;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes5.dex */
public abstract class qn extends pl implements qu {
    private final Logger get = LoggerFactory.getLogger(getClass());
    private AlgorithmParameterSpec initialize;

    public qn(String str, String str2, String str3) {
        getWarnings(str);
        initialize(str2);
        get(rd.ASYMMETRIC);
        ThreeDS2Service(str3);
    }

    private void ThreeDS2Service(Key key) {
        if (key == null) {
            throw new rn("Key cannot be null");
        }
    }

    private Signature ThreeDS2ServiceInstance(or orVar) {
        String initialize = orVar.initialize().initialize();
        String str = get();
        try {
            Signature signature = initialize == null ? Signature.getInstance(str) : Signature.getInstance(str, initialize);
            AlgorithmParameterSpec algorithmParameterSpec = this.initialize;
            if (algorithmParameterSpec != null) {
                try {
                    signature.setParameter(algorithmParameterSpec);
                    return signature;
                } catch (UnsupportedOperationException unused) {
                    this.get.isDebugEnabled();
                }
            }
            return signature;
        } catch (InvalidAlgorithmParameterException e) {
            throw new ro("Invalid algorithm parameter (" + this.initialize + ") for: " + str, e);
        } catch (NoSuchAlgorithmException e2) {
            throw new ro(Recorder$$ExternalSyntheticOutline2.m("Unable to get an implementation of algorithm name: ", str), e2);
        } catch (NoSuchProviderException e3) {
            throw new ro(CameraSelector$$ExternalSyntheticOutline0.m("Unable to get an implementation of ", str, " for provider ", initialize), e3);
        }
    }

    private void initialize(Signature signature, Key key) {
        try {
            signature.initVerify((PublicKey) key);
        } catch (InvalidKeyException e) {
            throw new rn(initialize(key) + "for " + get(), e);
        }
    }

    public abstract void ThreeDS2ServiceInstance(PublicKey publicKey);

    public boolean get(byte[] bArr, Key key, byte[] bArr2, or orVar) {
        Signature ThreeDS2ServiceInstance = ThreeDS2ServiceInstance(orVar);
        initialize(ThreeDS2ServiceInstance, key);
        try {
            ThreeDS2ServiceInstance.update(bArr2);
            return ThreeDS2ServiceInstance.verify(bArr);
        } catch (SignatureException unused) {
            this.get.isDebugEnabled();
            return false;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.qu
    public void getWarnings(Key key) {
        ThreeDS2Service(key);
        try {
            ThreeDS2ServiceInstance((PublicKey) key);
        } catch (ClassCastException e) {
            throw new rn(initialize(key) + "(not a public key or is the wrong type of key) for " + get() + "/" + ThreeDS2ServiceInstance() + " " + e);
        }
    }

    private String initialize(Key key) {
        String str;
        if (key == null) {
            str = "key is null";
        } else {
            str = "algorithm=" + key.getAlgorithm();
        }
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("The given key (", str, ") is not valid ");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.pc
    public boolean initialize() {
        try {
            return ThreeDS2ServiceInstance(new or()) != null;
        } catch (Exception e) {
            this.ThreeDS2ServiceInstance();
            this.get();
            ri.ThreeDS2Service(e);
            return false;
        }
    }

    public void ThreeDS2ServiceInstance(AlgorithmParameterSpec algorithmParameterSpec) {
        this.initialize = algorithmParameterSpec;
    }
}
