package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.BinderC3487kd;
import com.google.android.gms.internal.ads.InterfaceC3595md;
import s2.AbstractBinderC4924c0;
import s2.M0;

/* loaded from: classes.dex */
public class LiteSdkInfo extends AbstractBinderC4924c0 {
    public LiteSdkInfo(Context context) {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // s2.InterfaceC4926d0
    public InterfaceC3595md getAdapterCreator() {
        return new BinderC3487kd();
    }

    @Override // s2.InterfaceC4926d0
    public M0 getLiteSdkVersion() {
        return new M0(ModuleDescriptor.MODULE_VERSION, ModuleDescriptor.MODULE_VERSION, "25.4.0");
    }
}
