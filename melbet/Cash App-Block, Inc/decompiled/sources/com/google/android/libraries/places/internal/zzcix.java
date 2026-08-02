package com.google.android.libraries.places.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes4.dex */
public final class zzcix extends zzcja {
    public final Method zzb;
    public final Method zzc;

    public /* synthetic */ zzcix(Provider provider, Method method, Method method2) {
        super(provider);
        this.zzb = method;
        this.zzc = method2;
    }

    @Override // com.google.android.libraries.places.internal.zzcja
    public final void zza(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzcjb zzcjbVar = (zzcjb) it.next();
            if (zzcjbVar != zzcjb.HTTP_1_0) {
                arrayList.add(zzcjbVar.zze);
            }
        }
        try {
            this.zzb.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException e) {
            a$$ExternalSyntheticBUOutline0.m((Throwable) e);
        } catch (InvocationTargetException e2) {
            a$$ExternalSyntheticBUOutline0.m((Throwable) e2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcja
    public final String zzb(SSLSocket sSLSocket) {
        try {
            return (String) this.zzc.invoke(sSLSocket, null);
        } catch (IllegalAccessException e) {
            a$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        } catch (InvocationTargetException e2) {
            a$$ExternalSyntheticBUOutline0.m((Throwable) e2);
            return null;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcja
    public final int zzc() {
        return 1;
    }
}
