package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import r2.AbstractBinderC4949b;
import r2.InterfaceC4950c;

/* renamed from: com.google.android.gms.internal.ads.hk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3311hk {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC4950c f30927a;

    public final synchronized InterfaceC4950c a(Context context) {
        InterfaceC4950c interfaceC4950c = this.f30927a;
        if (interfaceC4950c != null) {
            return interfaceC4950c;
        }
        InterfaceC4950c asInterface = AbstractBinderC4949b.asInterface((IBinder) context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.ads.internal.client.hsdp.HsdpDeepLinkServiceWrapper").getConstructor(new Class[0]).newInstance(new Object[0]));
        this.f30927a = asInterface;
        return asInterface;
    }
}
