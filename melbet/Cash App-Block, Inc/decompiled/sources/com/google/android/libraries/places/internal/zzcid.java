package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* loaded from: classes4.dex */
public class zzcid {
    public static final Logger zzb = Logger.getLogger(zzcid.class.getName());
    public static final zzcja zzc = zzcja.zzc;
    public static final zzcid zzd;
    public final zzcja zza;

    static {
        zzcid zzcidVar;
        ClassLoader classLoader = zzcid.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            zzb.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find Conscrypt. Skipping", (Throwable) e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                zzb.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e2);
                zzcidVar = new zzcid(zzc);
            }
        }
        zzcidVar = new zzcic(zzc);
        zzd = zzcidVar;
    }

    public zzcid(zzcja zzcjaVar) {
        Trace.checkNotNull(zzcjaVar, "platform");
        this.zza = zzcjaVar;
    }

    public String zza(SSLSocket sSLSocket, String str, List list) {
        zzcja zzcjaVar = this.zza;
        if (list != null) {
            zzb(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String zzc2 = zzc(sSLSocket);
            if (zzc2 != null) {
                return zzc2;
            }
            String valueOf = String.valueOf(list);
            StringBuilder sb = new StringBuilder(valueOf.length() + 44);
            sb.append("TLS ALPN negotiation failed with protocols: ");
            sb.append(valueOf);
            throw new RuntimeException(sb.toString());
        } finally {
            zzcjaVar.zzd(sSLSocket);
        }
    }

    public void zzb(SSLSocket sSLSocket, String str, List list) {
        this.zza.zza(sSLSocket, str, list);
    }

    public String zzc(SSLSocket sSLSocket) {
        return this.zza.zzb(sSLSocket);
    }
}
