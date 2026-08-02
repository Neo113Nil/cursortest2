package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import androidx.biometric.BiometricPrompt;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import java.util.Iterator;
import java.util.Set;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes4.dex */
public abstract class zbm {
    public static final HuffmanTreeGroup zba = new HuffmanTreeGroup("GoogleSignInCommon", new String[0]);

    public static void zbh(Context context) {
        BiometricPrompt.zbc(context).zbd();
        Set set = GoogleApiClient.zaa;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((GoogleApiClient) it.next()).maybeSignOut();
        }
        GoogleApiManager.reportSignOut();
    }
}
