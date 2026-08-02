package com.google.android.libraries.places.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes4.dex */
public class zzcja {
    public static final Logger zza = Logger.getLogger(zzcja.class.getName());
    public static final String[] zzb = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
    public static final zzcja zzc;
    public final Provider zzd;

    static {
        Object obj;
        Provider provider;
        Provider provider2;
        zzcja zzcjaVar;
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i = 0;
        loop0: while (true) {
            obj = null;
            if (i >= length) {
                provider = null;
                break;
            }
            Provider provider3 = providers[i];
            String[] strArr = zzb;
            int length2 = strArr.length;
            for (int i2 = 0; i2 < 5; i2++) {
                String str = strArr[i2];
                if (str.equals(provider3.getClass().getName())) {
                    zza.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "getAndroidSecurityProvider", "Found registered provider {0}", str);
                    provider = provider3;
                    break loop0;
                }
            }
            i++;
        }
        if (provider != null) {
            int i3 = 22;
            com.google.android.gms.maps.zzah zzahVar = new com.google.android.gms.maps.zzah(i3, obj, "setUseSessionTickets", new Class[]{Boolean.TYPE});
            com.google.android.gms.maps.zzah zzahVar2 = new com.google.android.gms.maps.zzah(i3, obj, "setHostname", new Class[]{String.class});
            com.google.android.gms.maps.zzah zzahVar3 = new com.google.android.gms.maps.zzah(i3, byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            com.google.android.gms.maps.zzah zzahVar4 = new com.google.android.gms.maps.zzah(i3, obj, "setAlpnProtocols", new Class[]{byte[].class});
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                cls.getMethod("tagSocket", Socket.class);
                cls.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
            int i4 = 1;
            if (!provider.getName().equals("GmsCore_OpenSSL") && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
                try {
                    zzcja.class.getClassLoader().loadClass("android.net.Network");
                } catch (ClassNotFoundException e) {
                    zza.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid5", "Can't find class", (Throwable) e);
                    try {
                        zzcja.class.getClassLoader().loadClass("android.app.ActivityOptions");
                        i4 = 2;
                    } catch (ClassNotFoundException e2) {
                        zza.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid41", "Can't find class", (Throwable) e2);
                        i4 = 3;
                    }
                }
            }
            zzcjaVar = new zzciw(zzahVar, zzahVar2, zzahVar3, zzahVar4, provider, i4);
        } else {
            try {
                Provider provider4 = SSLContext.getDefault().getProvider();
                try {
                    try {
                        SSLContext sSLContext = SSLContext.getInstance("TLS", provider4);
                        sSLContext.init(null, null, null);
                        SSLEngine.class.getMethod("getApplicationProtocol", null).invoke(sSLContext.createSSLEngine(), null);
                        zzcjaVar = new zzcix(provider4, SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", null));
                    } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                        provider2 = provider4;
                        zzcjaVar = new zzcja(provider2);
                        zzc = zzcjaVar;
                    }
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException unused3) {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    StringBuilder sb = new StringBuilder(36);
                    sb.append("org.eclipse.jetty.alpn.ALPN");
                    sb.append("$Provider");
                    Class<?> cls3 = Class.forName(sb.toString());
                    StringBuilder sb2 = new StringBuilder(42);
                    sb2.append("org.eclipse.jetty.alpn.ALPN");
                    sb2.append("$ClientProvider");
                    Class<?> cls4 = Class.forName(sb2.toString());
                    StringBuilder sb3 = new StringBuilder(42);
                    sb3.append("org.eclipse.jetty.alpn.ALPN");
                    sb3.append("$ServerProvider");
                    try {
                        zzcjaVar = new zzciy(cls2.getMethod("put", SSLSocket.class, cls3), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), cls4, Class.forName(sb3.toString()), provider4);
                    } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                        provider2 = provider4;
                        zzcjaVar = new zzcja(provider2);
                        zzc = zzcjaVar;
                    }
                }
            } catch (NoSuchAlgorithmException e3) {
                a$$ExternalSyntheticBUOutline0.m((Throwable) e3);
                return;
            }
        }
        zzc = zzcjaVar;
    }

    public zzcja(Provider provider) {
        this.zzd = provider;
    }

    public static byte[] zzg(List list) {
        zzclo zzcloVar = new zzclo();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            zzcjb zzcjbVar = (zzcjb) list.get(i);
            if (zzcjbVar != zzcjb.HTTP_1_0) {
                zzcloVar.zzA(zzcjbVar.zze.length());
                String str = zzcjbVar.zze;
                zzcloVar.zzw(str.length(), str);
            }
        }
        return zzcloVar.zzr(zzcloVar.zzb);
    }

    public void zza(SSLSocket sSLSocket, String str, List list) {
    }

    public String zzb(SSLSocket sSLSocket) {
        return null;
    }

    public int zzc() {
        return 3;
    }

    public void zzd(SSLSocket sSLSocket) {
    }
}
