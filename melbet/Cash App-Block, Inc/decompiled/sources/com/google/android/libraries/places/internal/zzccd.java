package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.base.Supplier;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class zzccd extends zzbsf {
    public static final Method zzt;
    public final zzfv zzd;
    public final zzfv zze;
    public final zzbtk zzf;
    public final ArrayList zzg;
    public final String zzh;
    public String zzi;
    public final zzbqb zzk;
    public final zzbpn zzl;
    public final long zzm;
    public final zzbqr zzn;
    public final ArrayList zzo;
    public final ArrayList zzu;
    public final zzchi zzv;
    public final zzchi zzw;
    public static final Logger zzp = Logger.getLogger(zzccd.class.getName());
    public static final long zza = 1800000;
    public static final long zzb = 1000;
    public static final zzfv zzq = new zzfv(zzbzg.zzm, 9);
    public static final zzbqb zzr = zzbqb.zzb;
    public static final zzbpn zzs = zzbpn.zzb;
    public static final Pattern zzc = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    static {
        Method method = null;
        try {
            Class cls = Boolean.TYPE;
            method = zzbul.class.getDeclaredMethod("getClientInterceptor", cls, cls, cls, cls);
        } catch (ClassNotFoundException e) {
            zzp.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e);
        } catch (NoSuchMethodException e2) {
            zzp.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e2);
        }
        zzt = method;
    }

    public zzccd(String str, zzchi zzchiVar, zzchi zzchiVar2) {
        zzbtk zzbtkVar;
        List list;
        zzfv zzfvVar = zzq;
        this.zzd = zzfvVar;
        this.zze = zzfvVar;
        this.zzu = new ArrayList();
        Logger logger = zzbtk.zza;
        synchronized (zzbtk.class) {
            try {
                if (zzbtk.zzb == null) {
                    zzbtg.class.getClassLoader();
                    List<zzbtg> zza2 = zzey.zza(zzbtg.class, Collections.singletonList(zzbyj.class.getDeclaredConstructor(null).newInstance(null)).iterator(), new Supplier() { // from class: com.google.android.libraries.places.internal.zzbtj
                        @Override // com.google.common.base.Supplier
                        public final Object get() {
                            Logger logger2 = zzbtk.zza;
                            ArrayList arrayList = new ArrayList();
                            try {
                                boolean z = zzbyj.zza;
                                arrayList.add(zzbyj.class);
                            } catch (ClassNotFoundException e) {
                                zzbtk.zza.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", (Throwable) e);
                            }
                            try {
                                arrayList.add(Class.forName("io.grpc.binder.internal.IntentNameResolverProvider"));
                            } catch (ClassNotFoundException e2) {
                                zzbtk.zza.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find IntentNameResolverProvider", (Throwable) e2);
                            }
                            return Collections.unmodifiableList(arrayList);
                        }
                    }, new zzbti());
                    if (zza2.isEmpty()) {
                        zzbtk.zza.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                    }
                    zzbtk.zzb = new zzbtk();
                    for (zzbtg zzbtgVar : zza2) {
                        zzbtk.zza.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(zzbtgVar)));
                        zzbtk zzbtkVar2 = zzbtk.zzb;
                        synchronized (zzbtkVar2) {
                            zzbtgVar.getClass();
                            zzbtkVar2.zzd.add(zzbtgVar);
                        }
                    }
                    zzbtk.zzb.zzg();
                }
                zzbtkVar = zzbtk.zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.zzf = zzbtkVar;
        this.zzg = new ArrayList();
        this.zzk = zzr;
        this.zzl = zzs;
        this.zzm = zza;
        this.zzn = zzbqr.zzc;
        this.zzo = new ArrayList();
        Trace.checkNotNull(str, "target");
        this.zzh = str;
        this.zzv = zzchiVar;
        this.zzw = zzchiVar2;
        zzbpp zza3 = zzbpp.zza();
        synchronized (zza3) {
            list = zza3.zzb;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                a$$ExternalSyntheticBUOutline0.m$1();
                throw null;
            }
        }
    }
}
