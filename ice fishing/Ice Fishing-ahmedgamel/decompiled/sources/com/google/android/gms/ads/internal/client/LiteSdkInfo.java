package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.BinderC3464kd;
import com.google.android.gms.internal.ads.InterfaceC3572md;
import q2.AbstractBinderC4875c0;
import q2.M0;

/* loaded from: classes.dex */
public class LiteSdkInfo extends AbstractBinderC4875c0 {
    public LiteSdkInfo(Context context) {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // q2.InterfaceC4877d0
    public InterfaceC3572md getAdapterCreator() {
        return new BinderC3464kd();
    }

    @Override // q2.InterfaceC4877d0
    public M0 getLiteSdkVersion() {
        return new M0(ModuleDescriptor.MODULE_VERSION, ModuleDescriptor.MODULE_VERSION, "25.4.0");
    }
}
