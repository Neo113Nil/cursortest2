package com.google.android.libraries.places.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzciy extends zzcja {
    public final Method zzb;
    public final Method zzc;
    public final Method zzd;
    public final Class zze;
    public final Class zzf;

    public zzciy(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
        super(provider);
        this.zzb = method;
        this.zzc = method2;
        this.zzd = method3;
        this.zze = cls;
        this.zzf = cls2;
    }

    @Override // com.google.android.libraries.places.internal.zzcja
    public final void zza(SSLSocket sSLSocket, String str, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            zzcjb zzcjbVar = (zzcjb) list.get(i);
            if (zzcjbVar != zzcjb.HTTP_1_0) {
                arrayList.add(zzcjbVar.zze);
            }
        }
        try {
            this.zzb.invoke(null, sSLSocket, Proxy.newProxyInstance(zzcja.class.getClassLoader(), new Class[]{this.zze, this.zzf}, new zzciz(arrayList)));
        } catch (IllegalAccessException e) {
            a$$ExternalSyntheticBUOutline0.m$1(e);
        } catch (InvocationTargetException e2) {
            a$$ExternalSyntheticBUOutline0.m$1(e2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcja
    public final String zzb(SSLSocket sSLSocket) {
        try {
            zzciz zzcizVar = (zzciz) Proxy.getInvocationHandler(this.zzc.invoke(null, sSLSocket));
            boolean z = zzcizVar.zzb;
            if (!z && zzcizVar.zzc == null) {
                zzcja.zza.logp(Level.INFO, "io.grpc.okhttp.internal.Platform$JdkWithJettyBootPlatform", "getSelectedProtocol", "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                return null;
            }
            if (z) {
                return null;
            }
            return zzcizVar.zzc;
        } catch (IllegalAccessException unused) {
            Path$$ExternalSyntheticBUOutline0.m$2();
            return null;
        } catch (InvocationTargetException unused2) {
            Path$$ExternalSyntheticBUOutline0.m$2();
            return null;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcja
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.libraries.places.internal.zzcja
    public final void zzd(SSLSocket sSLSocket) {
        try {
            this.zzd.invoke(null, sSLSocket);
        } catch (IllegalAccessException unused) {
            Path$$ExternalSyntheticBUOutline0.m$2();
        } catch (InvocationTargetException e) {
            zzcja.zza.logp(Level.FINE, "io.grpc.okhttp.internal.Platform$JdkWithJettyBootPlatform", "afterHandshake", "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e);
        }
    }
}
