package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.BinderC3317hd;
import com.google.android.gms.internal.ads.InterfaceC3423jd;
import q2.AbstractBinderC4882c0;
import q2.M0;

/* loaded from: classes.dex */
public class LiteSdkInfo extends AbstractBinderC4882c0 {
    public LiteSdkInfo(Context context) {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // q2.InterfaceC4884d0
    public InterfaceC3423jd getAdapterCreator() {
        return new BinderC3317hd();
    }

    @Override // q2.InterfaceC4884d0
    public M0 getLiteSdkVersion() {
        return new M0(ModuleDescriptor.MODULE_VERSION, 261710000, "25.3.0");
    }
}
