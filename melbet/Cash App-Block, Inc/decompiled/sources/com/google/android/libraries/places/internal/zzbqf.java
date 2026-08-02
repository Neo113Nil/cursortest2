package com.google.android.libraries.places.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.android.volley.Response;
import com.google.android.filament.Box;
import com.google.common.base.Ascii;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.logging.Level;
import javax.net.ssl.SSLContext;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class zzbqf extends zzbsf {
    public final String toString() {
        Response stringHelper = Ascii.toStringHelper(this);
        stringHelper.add(zza(), "delegate");
        return stringHelper.toString();
    }

    public abstract zzccd zza();

    /* JADX WARN: Can't wrap try/catch for region: R(15:45|(2:48|46)|49|50|208|53|(9:78|79|(1:57)|58|59|60|(1:62)|63|64)|55|(0)|58|59|60|(0)|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0263, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0291, code lost:
    
        com.google.android.libraries.places.internal.zzccd.zzp.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x025b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0275, code lost:
    
        com.google.android.libraries.places.internal.zzccd.zzp.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x025f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0283, code lost:
    
        com.google.android.libraries.places.internal.zzccd.zzp.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0257, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0267, code lost:
    
        com.google.android.libraries.places.internal.zzccd.zzp.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzbsd zzd() {
        URI uri;
        Box box;
        String str;
        zzayi zzayiVar;
        zzbuj zzbujVar;
        String str2;
        zzccd zza = zza();
        zzchm zzchmVar = zza.zzv.zza;
        long j = zzchmVar.zzk;
        zzciq zzciqVar = zzchmVar.zzj;
        zzcar zzcarVar = zzchmVar.zze;
        int i = zzchmVar.zzl;
        int i2 = i - 1;
        zzayi zzayiVar2 = null;
        if (i == 0) {
            throw null;
        }
        if (i2 != 0) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1("Unknown negotiation type: TLS");
            return null;
        }
        try {
            if (zzchmVar.zzi == null) {
                zzchmVar.zzi = SSLContext.getInstance("Default", zzcja.zzc.zzd).getSocketFactory();
            }
            zzchl zzchlVar = new zzchl(zzchmVar.zzg, zzchmVar.zzh, zzchmVar.zzi, zzciqVar, zzcarVar);
            boolean z = zzbqe.zza;
            String str3 = zza.zzh;
            zzbtk zzbtkVar = zza.zzf;
            int i3 = 24;
            int i4 = 0;
            if (z) {
                String str4 = "";
                StringBuilder sb = new StringBuilder();
                try {
                    try {
                        zzbujVar = zzbuj.zza(str3);
                    } catch (IllegalArgumentException e) {
                        throw new URISyntaxException(str3, e.getMessage());
                    }
                } catch (URISyntaxException e2) {
                    sb.append(e2.getMessage());
                    zzbujVar = null;
                }
                zzbtg zzb = zzbujVar != null ? zzbtkVar.zzb(zzbujVar.zzl) : null;
                if (zzb == null && !zzccd.zzc.matcher(str3).matches()) {
                    BitSet bitSet = zzbuj.zza;
                    zzbui zzbuiVar = new zzbui(i4);
                    synchronized (zzbtkVar) {
                        str2 = zzbtkVar.zzc;
                    }
                    Locale locale = Locale.ROOT;
                    zzbuiVar.zzb(str2.toLowerCase(locale));
                    zzbuiVar.zzf = zzbuj.zzg("".toLowerCase(locale), zzbuj.zze);
                    zzbuiVar.zzb = zzbuj.zzg("/".concat(String.valueOf(str3)), zzbuj.zzh);
                    zzbujVar = zzbuiVar.zzk();
                    zzb = zzbtkVar.zzb(zzbujVar.zzl);
                }
                if (zzb == null) {
                    if (sb.length() > 0) {
                        String obj = sb.toString();
                        str4 = Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(obj.length() + 3), " (", obj, ")");
                    }
                    throw new IllegalArgumentException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Could not find a NameResolverProvider for ", str3, str4));
                }
                box = new Box(i3, new zzcgs(zzbujVar), zzb);
            } else {
                String str5 = "";
                StringBuilder sb2 = new StringBuilder();
                try {
                    uri = new URI(str3);
                } catch (URISyntaxException e3) {
                    sb2.append(e3.getMessage());
                    uri = null;
                }
                zzbtg zzb2 = uri != null ? zzbtkVar.zzb(uri.getScheme()) : null;
                if (zzb2 == null && !zzccd.zzc.matcher(str3).matches()) {
                    try {
                        synchronized (zzbtkVar) {
                            str = zzbtkVar.zzc;
                        }
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 1);
                        sb3.append("/");
                        sb3.append(str3);
                        uri = new URI(str, "", sb3.toString(), null);
                        zzb2 = zzbtkVar.zzb(uri.getScheme());
                    } catch (URISyntaxException e4) {
                        Path$$ExternalSyntheticBUOutline0.m((Throwable) e4);
                        return null;
                    }
                }
                if (zzb2 == null) {
                    if (sb2.length() > 0) {
                        String obj2 = sb2.toString();
                        str5 = Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(obj2.length() + 3), " (", obj2, ")");
                    }
                    throw new IllegalArgumentException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Could not find a NameResolverProvider for ", str3, str5));
                }
                box = new Box(i3, new zzcgt(uri), zzb2);
            }
            zzciq zzciqVar2 = zzchm.zza;
            Set singleton = Collections.singleton(InetSocketAddress.class);
            if (singleton != null && !singleton.containsAll(((zzbtg) box.mHalfExtent).zzf())) {
                ((zzbtg) box.mHalfExtent).getClass();
                JWK$$ExternalSyntheticBUOutline0.m("Address types of NameResolver '%s' for '%s' not supported by transport", new Object[]{"dns", (zzcgu) box.mCenter});
                return null;
            }
            zzcgu zzcguVar = (zzcgu) box.mCenter;
            zzbtg zzbtgVar = (zzbtg) box.mHalfExtent;
            zzbyk zzbykVar = new zzbyk();
            zzfv zzfvVar = new zzfv(zzbzg.zzm, 9);
            zzbzc zzbzcVar = zzbzg.zzo;
            zzcguVar.toString();
            ArrayList arrayList = zza.zzu;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((zzayi) it.next());
            }
            synchronized (zzbpp.zza()) {
            }
            Method method = zzccd.zzt;
            if (method != null) {
                try {
                    Boolean bool = Boolean.TRUE;
                    zzayiVar = (zzayi) method.invoke(null, bool, bool, Boolean.FALSE, bool);
                } catch (IllegalAccessException e5) {
                    zzccd.zzp.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e5);
                } catch (InvocationTargetException e6) {
                    zzccd.zzp.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e6);
                }
                if (zzayiVar != null) {
                    arrayList2.add(0, zzayiVar);
                }
                zzayiVar2 = (zzayi) zzbum.class.getDeclaredMethod("getClientInterceptor", null).invoke(null, null);
                if (zzayiVar2 != null) {
                    arrayList2.add(0, zzayiVar2);
                }
                return new zzccf(new zzcby(zza, zzchlVar, zzcguVar, zzbtgVar, zzbykVar, zzfvVar, zzbzcVar, arrayList2, zzcgm.zza));
            }
            zzayiVar = null;
            if (zzayiVar != null) {
            }
            zzayiVar2 = (zzayi) zzbum.class.getDeclaredMethod("getClientInterceptor", null).invoke(null, null);
            if (zzayiVar2 != null) {
            }
            return new zzccf(new zzcby(zza, zzchlVar, zzcguVar, zzbtgVar, zzbykVar, zzfvVar, zzbzcVar, arrayList2, zzcgm.zza));
        } catch (GeneralSecurityException e7) {
            OptionalProvider$$ExternalSyntheticLambda0.m("TLS Provider failure", (Throwable) e7);
            return null;
        }
    }
}
