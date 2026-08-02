package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import t2.AbstractBinderC5033b;
import t2.InterfaceC5034c;

/* renamed from: com.google.android.gms.internal.ads.hk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3334hk {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC5034c f31688a;

    public final synchronized InterfaceC5034c a(Context context) {
        InterfaceC5034c interfaceC5034c = this.f31688a;
        if (interfaceC5034c != null) {
            return interfaceC5034c;
        }
        InterfaceC5034c asInterface = AbstractBinderC5033b.asInterface((IBinder) context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.ads.internal.client.hsdp.HsdpDeepLinkServiceWrapper").getConstructor(new Class[0]).newInstance(new Object[0]));
        this.f31688a = asInterface;
        return asInterface;
    }
}
