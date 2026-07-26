package com.adjust.sdk;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class AdjustSigner {
    private static volatile Object signerInstance;

    private AdjustSigner() {
    }

    private static void getSignerInstance() {
        if (signerInstance == null) {
            synchronized (AdjustSigner.class) {
                try {
                    if (signerInstance == null) {
                        signerInstance = Reflection.createDefaultInstance("com.adjust.sdk.sig.Signer");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static boolean isPresent() {
        getSignerInstance();
        return signerInstance != null;
    }

    public static void onResume(ILogger iLogger) {
        getSignerInstance();
        if (signerInstance == null) {
            return;
        }
        try {
            Reflection.invokeInstanceMethod(signerInstance, "onResume", null, new Object[0]);
        } catch (Exception e) {
            iLogger.warn("Invoking Signer onResume() received an error [%s]", e.getMessage());
        }
    }

    public static Map<String, String> sign(Map<String, String> map, Map<String, String> map2, Context context, ILogger iLogger) {
        getSignerInstance();
        HashMap hashMap = new HashMap();
        if (signerInstance != null) {
            try {
                iLogger.debug("Signing all the parameters", new Object[0]);
                Reflection.invokeInstanceMethod(signerInstance, "sign", new Class[]{Context.class, Map.class, Map.class, Map.class}, context, map, map2, hashMap);
                return hashMap;
            } catch (Exception e) {
                iLogger.warn("Invoking Signer sign() received an error [%s]", e.getMessage());
            }
        }
        return hashMap;
    }
}
