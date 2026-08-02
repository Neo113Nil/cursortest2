package ru.CryptoPro.JCSP.support;

import android.content.Context;

/* loaded from: classes4.dex */
public abstract class TrustStoreUpdater extends MainUpdater {
    public TrustStoreUpdater(Context context) {
        super(context, "ca_certs.updates.prefs", "asset_cert_hash");
    }
}
