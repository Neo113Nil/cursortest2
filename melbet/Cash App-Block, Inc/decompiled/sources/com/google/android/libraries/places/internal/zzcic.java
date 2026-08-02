package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.net.HostAndPort;
import com.google.common.net.InetAddresses;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes4.dex */
public final class zzcic extends zzcid {
    public static final com.google.android.gms.maps.zzah zzb;
    public static final com.google.android.gms.maps.zzah zzc;
    public static final com.google.android.gms.maps.zzah zzd;
    public static final com.google.android.gms.maps.zzah zze;
    public static final com.google.android.gms.maps.zzah zzf;
    public static final com.google.android.gms.maps.zzah zzg;
    public static final Method zzh;
    public static final Method zzi;
    public static final Method zzj;
    public static final Method zzk;
    public static final Method zzl;
    public static final Method zzm;
    public static final Constructor zzn;

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|2|3|(3:5|6|(4:8|9|10|11))|(2:13|14)|15|16|17|19|20|21|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0119, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0135, code lost:
    
        com.google.android.libraries.places.internal.zzcid.zzb.logp(java.util.logging.Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0117, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0125, code lost:
    
        com.google.android.libraries.places.internal.zzcid.zzb.logp(java.util.logging.Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0121, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0133, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x011f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0123, code lost:
    
        r1 = null;
     */
    static {
        NoSuchMethodException noSuchMethodException;
        Method method;
        Method method2;
        Method method3;
        ClassNotFoundException classNotFoundException;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Class<?> cls;
        Class cls2 = Boolean.TYPE;
        Constructor<?> constructor = null;
        zzb = new com.google.android.gms.maps.zzah(22, null, "setUseSessionTickets", new Class[]{cls2});
        zzc = new com.google.android.gms.maps.zzah(22, null, "setHostname", new Class[]{String.class});
        zzd = new com.google.android.gms.maps.zzah(22, byte[].class, "getAlpnSelectedProtocol", new Class[0]);
        zze = new com.google.android.gms.maps.zzah(22, null, "setAlpnProtocols", new Class[]{byte[].class});
        zzf = new com.google.android.gms.maps.zzah(22, byte[].class, "getNpnSelectedProtocol", new Class[0]);
        zzg = new com.google.android.gms.maps.zzah(22, null, "setNpnProtocols", new Class[]{byte[].class});
        try {
            method2 = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
        } catch (ClassNotFoundException e) {
            classNotFoundException = e;
            method = null;
            method2 = null;
            method3 = null;
        } catch (NoSuchMethodException e2) {
            noSuchMethodException = e2;
            method = null;
            method2 = null;
            method3 = null;
        }
        try {
            method4 = SSLParameters.class.getMethod("getApplicationProtocols", null);
            try {
                method5 = SSLSocket.class.getMethod("getApplicationProtocol", null);
                try {
                    cls = Class.forName("android.net.ssl.SSLSockets");
                    method6 = cls.getMethod("isSupportedSocket", SSLSocket.class);
                } catch (ClassNotFoundException e3) {
                    classNotFoundException = e3;
                    method3 = null;
                    method = method5;
                } catch (NoSuchMethodException e4) {
                    noSuchMethodException = e4;
                    method3 = null;
                    method = method5;
                }
            } catch (ClassNotFoundException e5) {
                classNotFoundException = e5;
                method = null;
                method3 = null;
            } catch (NoSuchMethodException e6) {
                noSuchMethodException = e6;
                method = null;
                method3 = null;
            }
        } catch (ClassNotFoundException e7) {
            classNotFoundException = e7;
            method = null;
            method3 = null;
            method4 = method3;
            zzcid.zzb.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) classNotFoundException);
            method5 = method;
            method6 = method3;
            method7 = null;
            zzj = method2;
            zzk = method4;
            zzl = method5;
            zzh = method6;
            zzi = method7;
            Method method8 = SSLParameters.class.getMethod("setServerNames", List.class);
            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            zzm = method8;
            zzn = constructor;
        } catch (NoSuchMethodException e8) {
            noSuchMethodException = e8;
            method = null;
            method3 = null;
            method4 = method3;
            zzcid.zzb.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) noSuchMethodException);
            method5 = method;
            method6 = method3;
            method7 = null;
            zzj = method2;
            zzk = method4;
            zzl = method5;
            zzh = method6;
            zzi = method7;
            Method method82 = SSLParameters.class.getMethod("setServerNames", List.class);
            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            zzm = method82;
            zzn = constructor;
        }
        try {
            method7 = cls.getMethod("setUseSessionTickets", SSLSocket.class, cls2);
        } catch (ClassNotFoundException e9) {
            classNotFoundException = e9;
            method = method5;
            method3 = method6;
            zzcid.zzb.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) classNotFoundException);
            method5 = method;
            method6 = method3;
            method7 = null;
            zzj = method2;
            zzk = method4;
            zzl = method5;
            zzh = method6;
            zzi = method7;
            Method method822 = SSLParameters.class.getMethod("setServerNames", List.class);
            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            zzm = method822;
            zzn = constructor;
        } catch (NoSuchMethodException e10) {
            noSuchMethodException = e10;
            method = method5;
            method3 = method6;
            zzcid.zzb.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) noSuchMethodException);
            method5 = method;
            method6 = method3;
            method7 = null;
            zzj = method2;
            zzk = method4;
            zzl = method5;
            zzh = method6;
            zzi = method7;
            Method method8222 = SSLParameters.class.getMethod("setServerNames", List.class);
            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            zzm = method8222;
            zzn = constructor;
        }
        zzj = method2;
        zzk = method4;
        zzl = method5;
        zzh = method6;
        zzi = method7;
        Method method82222 = SSLParameters.class.getMethod("setServerNames", List.class);
        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
        zzm = method82222;
        zzn = constructor;
    }

    @Override // com.google.android.libraries.places.internal.zzcid
    public final String zza(SSLSocket sSLSocket, String str, List list) {
        String zzc2 = zzc(sSLSocket);
        return zzc2 == null ? super.zza(sSLSocket, str, list) : zzc2;
    }

    @Override // com.google.android.libraries.places.internal.zzcid
    public final void zzb(SSLSocket sSLSocket, String str, List list) {
        Constructor constructor;
        Method method;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzcjb) it.next()).zze);
        }
        boolean z = false;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (str != null) {
            try {
                try {
                    if (!str.contains("_")) {
                        try {
                            Trace.checkArgument("Userinfo must not be present on authority: '%s'", str, zzbzg.zzb(str).getAuthority().indexOf(64) == -1);
                            Method method2 = zzh;
                            if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                                zzb.zzb(sSLSocket, Boolean.TRUE);
                            } else {
                                zzi.invoke(null, sSLSocket, Boolean.TRUE);
                            }
                            Method method3 = zzm;
                            if (method3 != null && (constructor = zzn) != null && InetAddresses.ipStringToBytes(HostAndPort.fromString(str).host, null) == null) {
                                method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                            }
                            zzc.zzb(sSLSocket, str);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                } catch (InvocationTargetException e) {
                    a$$ExternalSyntheticBUOutline0.m((Throwable) e);
                    return;
                }
            } catch (IllegalAccessException e2) {
                a$$ExternalSyntheticBUOutline0.m((Throwable) e2);
                return;
            } catch (InstantiationException e3) {
                a$$ExternalSyntheticBUOutline0.m((Throwable) e3);
                return;
            }
        }
        Method method4 = zzl;
        if (method4 != null) {
            try {
                method4.invoke(sSLSocket, null);
                zzj.invoke(sSLParameters, strArr);
                z = true;
            } catch (InvocationTargetException e4) {
                if (!(e4.getTargetException() instanceof UnsupportedOperationException)) {
                    throw e4;
                }
                zzcid.zzb.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "configureTlsExtensions", "setApplicationProtocol unsupported, will try old methods");
            }
        }
        sSLSocket.setSSLParameters(sSLParameters);
        if (z && (method = zzk) != null && Arrays.equals(strArr, (String[]) method.invoke(sSLSocket.getSSLParameters(), null))) {
            return;
        }
        Object[] objArr = {zzcja.zzg(list)};
        zzcja zzcjaVar = this.zza;
        if (zzcjaVar.zzc() == 1) {
            zze.zzc(sSLSocket, objArr);
        }
        if (zzcjaVar.zzc() != 3) {
            zzg.zzc(sSLSocket, objArr);
        } else {
            OptionalProvider$$ExternalSyntheticLambda0.m$1("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcid
    public final String zzc(SSLSocket sSLSocket) {
        Method method = zzl;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, null);
            } catch (IllegalAccessException e) {
                a$$ExternalSyntheticBUOutline0.m((Throwable) e);
                return null;
            } catch (InvocationTargetException e2) {
                if (!(e2.getTargetException() instanceof UnsupportedOperationException)) {
                    a$$ExternalSyntheticBUOutline0.m((Throwable) e2);
                    return null;
                }
                zzcid.zzb.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Socket unsupported for getApplicationProtocol, will try old methods");
            }
        }
        zzcja zzcjaVar = this.zza;
        if (zzcjaVar.zzc() == 1) {
            try {
                byte[] bArr = (byte[]) zzd.zzc(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, zzcjd.zzb);
                }
            } catch (Exception e3) {
                zzcid.zzb.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getAlpnSelectedProtocol()", (Throwable) e3);
            }
        }
        if (zzcjaVar.zzc() != 3) {
            try {
                byte[] bArr2 = (byte[]) zzf.zzc(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, zzcjd.zzb);
                }
            } catch (Exception e4) {
                zzcid.zzb.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getNpnSelectedProtocol()", (Throwable) e4);
            }
        }
        return null;
    }
}
