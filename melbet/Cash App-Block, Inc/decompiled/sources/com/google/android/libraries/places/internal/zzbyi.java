package com.google.android.libraries.places.internal;

import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.base.Ascii;
import com.google.common.base.Stopwatch;
import com.google.common.base.VerifyException;
import com.google.mlkit.common.sdkinternal.zzb;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.oneformapp.schema.Schema;

/* loaded from: classes4.dex */
public final class zzbyi extends zzbtf {
    public static final boolean zzb;
    public static final boolean zzc;
    public static final boolean zzd;
    public static final Logger zzh = Logger.getLogger(zzbyi.class.getName());
    public static final Set zzi = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
    public static String zzn;
    public boolean zzA;
    public zzbtb zzB;
    public final zzcdt zze;
    public boolean zzg;
    public final Random zzo = new Random();
    public final AtomicReference zzp = new AtomicReference();
    public final String zzq;
    public final String zzr;
    public final int zzs;
    public final zzfv zzt;
    public final long zzu;
    public final zzbuf zzv;
    public final zzcfr zzw;
    public final Stopwatch zzx;
    public boolean zzy;
    public Executor zzz;

    static {
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        zzb = Boolean.parseBoolean(property);
        zzc = Boolean.parseBoolean(property2);
        zzd = Boolean.parseBoolean(property3);
        try {
            try {
                try {
                    if (Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, zzbyi.class.getClassLoader()).asSubclass(zzbyh.class).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (Exception e) {
                    zzh.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e);
                }
            } catch (Exception e2) {
                zzh.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e2);
            }
        } catch (ClassCastException e3) {
            zzh.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e3);
        } catch (ClassNotFoundException e4) {
            zzh.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e4);
        }
    }

    public zzbyi(String str, zzbsy zzbsyVar, zzcgd zzcgdVar, Stopwatch stopwatch, boolean z) {
        long j;
        Trace.checkNotNull(zzbsyVar, "args");
        Trace.checkNotNull(str, "name");
        URI create = URI.create("//".concat(str));
        Trace.checkArgument("Invalid DNS name: %s", str, create.getHost() != null);
        String authority = create.getAuthority();
        Trace.checkNotNull("nameUri (%s) doesn't have an authority", authority, create);
        this.zzq = authority;
        this.zzr = create.getHost();
        if (create.getPort() == -1) {
            this.zzs = zzbsyVar.zza;
        } else {
            this.zzs = create.getPort();
        }
        zzcdt zzcdtVar = (zzcdt) zzbsyVar.zzb;
        Trace.checkNotNull(zzcdtVar, "proxyDetector");
        this.zze = zzcdtVar;
        Executor executor = (Executor) zzbsyVar.zzg;
        if (executor != null) {
            this.zzt = new zzfv(executor);
        } else {
            this.zzt = new zzfv(zzcgdVar, 9);
        }
        if (z) {
            j = 30000000000L;
        } else {
            String property = System.getProperty("networkaddress.cache.ttl");
            j = 30;
            if (property != null) {
                try {
                    j = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    zzh.logp(Level.WARNING, "io.grpc.internal.DnsNameResolver", "getNetworkAddressCacheTtlNanos", "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            if (j > 0) {
                j = TimeUnit.SECONDS.toNanos(j);
            }
        }
        this.zzu = j;
        this.zzx = stopwatch;
        zzbuf zzbufVar = (zzbuf) zzbsyVar.zzc;
        Trace.checkNotNull(zzbufVar, "syncContext");
        this.zzv = zzbufVar;
        zzcfr zzcfrVar = (zzcfr) zzbsyVar.zzd;
        Trace.checkNotNull(zzcfrVar, "serviceConfigParser");
        this.zzw = zzcfrVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbtf
    public final String zza() {
        return this.zzq;
    }

    @Override // com.google.android.libraries.places.internal.zzbtf
    public final void zzb(zzbtb zzbtbVar) {
        Trace.checkState("already started", this.zzB == null);
        this.zzz = (Executor) this.zzt.zza();
        this.zzB = zzbtbVar;
        zzm();
    }

    @Override // com.google.android.libraries.places.internal.zzbtf
    public final void zzc() {
        if (this.zzy) {
            return;
        }
        this.zzy = true;
        Executor executor = this.zzz;
        if (executor != null) {
            this.zzt.zzb(executor);
            this.zzz = null;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbtf
    public final void zzd() {
        Trace.checkState("not started", this.zzB != null);
        zzm();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a2, code lost:
    
        if (com.google.android.libraries.places.internal.zzbyi.zzc == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d6, code lost:
    
        if (r19.zzp.get() != null) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x03cd, code lost:
    
        bo.app.a$$ExternalSyntheticBUOutline0.m$1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x03d2, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
    
        if (r9 != false) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02dd A[Catch: all -> 0x02b3, RuntimeException -> 0x02b6, TryCatch #6 {RuntimeException -> 0x02b6, all -> 0x02b3, blocks: (B:103:0x0253, B:106:0x026c, B:109:0x0274, B:112:0x027d, B:115:0x029a, B:118:0x02a6, B:119:0x02b9, B:122:0x02ce, B:126:0x02dd, B:127:0x0388, B:129:0x02e5, B:130:0x02ea, B:132:0x02f0, B:136:0x030a, B:143:0x0310, B:144:0x0314, B:146:0x031a, B:148:0x0337, B:151:0x0346, B:155:0x0351, B:157:0x0357, B:159:0x0366, B:163:0x0305, B:165:0x0383, B:166:0x02d8, B:167:0x02c7, B:171:0x025d, B:173:0x0261, B:174:0x0269), top: B:102:0x0253 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02e5 A[Catch: all -> 0x02b3, RuntimeException -> 0x02b6, TryCatch #6 {RuntimeException -> 0x02b6, all -> 0x02b3, blocks: (B:103:0x0253, B:106:0x026c, B:109:0x0274, B:112:0x027d, B:115:0x029a, B:118:0x02a6, B:119:0x02b9, B:122:0x02ce, B:126:0x02dd, B:127:0x0388, B:129:0x02e5, B:130:0x02ea, B:132:0x02f0, B:136:0x030a, B:143:0x0310, B:144:0x0314, B:146:0x031a, B:148:0x0337, B:151:0x0346, B:155:0x0351, B:157:0x0357, B:159:0x0366, B:163:0x0305, B:165:0x0383, B:166:0x02d8, B:167:0x02c7, B:171:0x025d, B:173:0x0261, B:174:0x0269), top: B:102:0x0253 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02d8 A[Catch: all -> 0x02b3, RuntimeException -> 0x02b6, TryCatch #6 {RuntimeException -> 0x02b6, all -> 0x02b3, blocks: (B:103:0x0253, B:106:0x026c, B:109:0x0274, B:112:0x027d, B:115:0x029a, B:118:0x02a6, B:119:0x02b9, B:122:0x02ce, B:126:0x02dd, B:127:0x0388, B:129:0x02e5, B:130:0x02ea, B:132:0x02f0, B:136:0x030a, B:143:0x0310, B:144:0x0314, B:146:0x031a, B:148:0x0337, B:151:0x0346, B:155:0x0351, B:157:0x0357, B:159:0x0366, B:163:0x0305, B:165:0x0383, B:166:0x02d8, B:167:0x02c7, B:171:0x025d, B:173:0x0261, B:174:0x0269), top: B:102:0x0253 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02c7 A[Catch: all -> 0x02b3, RuntimeException -> 0x02b6, TryCatch #6 {RuntimeException -> 0x02b6, all -> 0x02b3, blocks: (B:103:0x0253, B:106:0x026c, B:109:0x0274, B:112:0x027d, B:115:0x029a, B:118:0x02a6, B:119:0x02b9, B:122:0x02ce, B:126:0x02dd, B:127:0x0388, B:129:0x02e5, B:130:0x02ea, B:132:0x02f0, B:136:0x030a, B:143:0x0310, B:144:0x0314, B:146:0x031a, B:148:0x0337, B:151:0x0346, B:155:0x0351, B:157:0x0357, B:159:0x0366, B:163:0x0305, B:165:0x0383, B:166:0x02d8, B:167:0x02c7, B:171:0x025d, B:173:0x0261, B:174:0x0269), top: B:102:0x0253 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[LOOP:3: B:67:0x0155->B:184:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzbtd zze() {
        zzbsz zzbszVar;
        zzbsz zzbszVar2;
        Object obj;
        zzbsz zzbszVar3;
        zzcfk zzcfkVar;
        List<Map> zza;
        zzcci zzcciVar;
        ?? r3;
        Map zzd2;
        String str = this.zzr;
        zzbtc zzbtcVar = new zzbtc();
        boolean z = true;
        zzbsz zzbszVar4 = null;
        try {
            List unmodifiableList = Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
            ArrayList arrayList = new ArrayList(unmodifiableList.size());
            Iterator it = unmodifiableList.iterator();
            while (it.hasNext()) {
                arrayList.add(new zzbqd(Collections.singletonList(new InetSocketAddress((InetAddress) it.next(), this.zzs)), zzbor.zza));
            }
            zzbtcVar.zza = new zzbtz(null, Collections.unmodifiableList(arrayList));
        } catch (Exception e) {
            zzh.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "doResolve", "Address resolution failure", (Throwable) e);
            zzbtx zzd3 = zzbtx.zzi.zze("Unable to resolve host ".concat(String.valueOf(str))).zzd(e);
            zzbtz zzbtzVar = new zzbtz(zzd3, null);
            Trace.checkArgument("cannot use OK status: %s", zzd3, !zzd3.zzj());
            zzbtcVar.zza = zzbtzVar;
        }
        if (zzd) {
            List<String> list = Collections.EMPTY_LIST;
            if (zzb) {
                if (!"localhost".equalsIgnoreCase(str)) {
                    if (!str.contains(":")) {
                        boolean z2 = true;
                        for (int i = 0; i < str.length(); i++) {
                            char charAt = str.charAt(i);
                            if (charAt != '.') {
                                z2 &= charAt >= '0' && charAt <= '9';
                            }
                        }
                    }
                }
            }
            if (list.isEmpty()) {
                zzh.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveServiceConfig", "No TXT records found for {0}", new Object[]{str});
            } else {
                Random random = this.zzo;
                if (zzn == null) {
                    try {
                        zzn = InetAddress.getLocalHost().getHostName();
                    } catch (UnknownHostException e2) {
                        a$$ExternalSyntheticBUOutline0.m((Throwable) e2);
                        return null;
                    }
                }
                String str2 = zzn;
                try {
                    ArrayList arrayList2 = new ArrayList();
                    for (String str3 : list) {
                        if (str3.startsWith("grpc_config=")) {
                            Object zza2 = zzcaj.zza(str3.substring(12));
                            if (!(zza2 instanceof List)) {
                                throw new ClassCastException("wrong type ".concat(String.valueOf(zza2)));
                            }
                            List list2 = (List) zza2;
                            zzwr.zzj(list2);
                            arrayList2.addAll(list2);
                        } else {
                            zzh.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "parseTxtResults", "Ignoring non service config {0}", new Object[]{str3});
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    Map map = null;
                    while (it2.hasNext()) {
                        Map map2 = (Map) it2.next();
                        try {
                            for (Map.Entry entry : map2.entrySet()) {
                                Ascii.verify("Bad key: %s", entry, zzi.contains(entry.getKey()));
                            }
                            List zzc2 = zzwr.zzc("clientLanguage", map2);
                            if (zzc2 != null && !zzc2.isEmpty()) {
                                Iterator it3 = zzc2.iterator();
                                while (it3.hasNext()) {
                                    if ("java".equalsIgnoreCase((String) it3.next())) {
                                    }
                                }
                                map = null;
                                if (map == null) {
                                    break;
                                }
                            }
                            Double zze = zzwr.zze("percentage", map2);
                            if (zze != null) {
                                int intValue = zze.intValue();
                                Ascii.verify("Bad percentage: %s", zze, intValue >= 0 && intValue <= 100);
                                if (random.nextInt(100) >= intValue) {
                                    map = null;
                                    if (map == null) {
                                    }
                                }
                            }
                            List zzc3 = zzwr.zzc("clientHostname", map2);
                            if (zzc3 != null && !zzc3.isEmpty()) {
                                Iterator it4 = zzc3.iterator();
                                while (it4.hasNext()) {
                                    if (((String) it4.next()).equals(str2)) {
                                    }
                                }
                                map = null;
                                if (map == null) {
                                }
                            }
                            Map zzd4 = zzwr.zzd("serviceConfig", map2);
                            if (zzd4 == null) {
                                throw new VerifyException(String.format("key '%s' missing in '%s'", map2, "serviceConfig"));
                            }
                            map = zzd4;
                            if (map == null) {
                            }
                        } catch (RuntimeException e3) {
                            zzbszVar = new zzbsz(zzbtx.zzc.zze("failed to pick service config choice").zzd(e3));
                        }
                    }
                    zzbszVar = map == null ? null : new zzbsz(map);
                } catch (IOException | RuntimeException e4) {
                    zzbszVar = new zzbsz(zzbtx.zzc.zze("failed to parse TXT records").zzd(e4));
                }
                if (zzbszVar != null) {
                    zzbtx zzbtxVar = zzbszVar.zza;
                    if (zzbtxVar != null) {
                        zzbszVar4 = new zzbsz(zzbtxVar);
                    } else {
                        Map map3 = (Map) zzbszVar.zzb;
                        zzcfr zzcfrVar = this.zzw;
                        zzcfrVar.getClass();
                        try {
                            zzbsz zze2 = zzcfrVar.zzb.zze(map3);
                            if (zze2 == null) {
                                obj = null;
                            } else {
                                zzbtx zzbtxVar2 = zze2.zza;
                                if (zzbtxVar2 != null) {
                                    zzbszVar3 = new zzbsz(zzbtxVar2);
                                    zzbszVar4 = zzbszVar3;
                                } else {
                                    obj = zze2.zzb;
                                }
                            }
                            boolean z3 = zzcfrVar.zza;
                            if (z3 && map3 != null && (zzd2 = zzwr.zzd("retryThrottling", map3)) != null) {
                                float floatValue = zzwr.zze("maxTokens", zzd2).floatValue();
                                float floatValue2 = zzwr.zze("tokenRatio", zzd2).floatValue();
                                Trace.checkState("maxToken should be greater than zero", floatValue > RecyclerView.DECELERATION_RATE);
                                Trace.checkState("tokenRatio should be greater than zero", floatValue2 > RecyclerView.DECELERATION_RATE);
                                zzcfkVar = new zzcfk(floatValue, floatValue2);
                                HashMap hashMap = new HashMap();
                                HashMap hashMap2 = new HashMap();
                                Map zzd5 = map3 != null ? null : zzwr.zzd("healthCheckConfig", map3);
                                zza = zzwr.zza("methodConfig", map3);
                                if (zza != null) {
                                    zza = null;
                                } else {
                                    zzwr.zzj(zza);
                                }
                                if (zza != null) {
                                    zzcciVar = new zzcci(null, hashMap, hashMap2, zzcfkVar, obj, zzd5);
                                } else {
                                    zzccg zzccgVar = null;
                                    for (Map map4 : zza) {
                                        zzccg zzccgVar2 = new zzccg(map4, z3);
                                        List zza3 = zzwr.zza("name", map4);
                                        if (zza3 == null) {
                                            r3 = zzbszVar4;
                                        } else {
                                            zzwr.zzj(zza3);
                                            r3 = zza3;
                                        }
                                        if (r3 == 0 || r3.isEmpty()) {
                                            z = z;
                                            zzbszVar4 = zzbszVar4;
                                        } else {
                                            for (Map map5 : r3) {
                                                boolean z4 = z;
                                                String zzg = zzwr.zzg("service", map5);
                                                zzbsz zzbszVar5 = zzbszVar4;
                                                String zzg2 = zzwr.zzg("method", map5);
                                                if (TransactorKt.stringIsNullOrEmpty(zzg)) {
                                                    Trace.checkArgument("missing service name for method %s", zzg2, TransactorKt.stringIsNullOrEmpty(zzg2));
                                                    Trace.checkArgument("Duplicate default method config in service config %s", map3, zzccgVar == null ? z4 : false);
                                                    zzccgVar = zzccgVar2;
                                                } else if (TransactorKt.stringIsNullOrEmpty(zzg2)) {
                                                    Trace.checkArgument("Duplicate service %s", zzg, !hashMap2.containsKey(zzg));
                                                    hashMap2.put(zzg, zzccgVar2);
                                                } else {
                                                    String zzh2 = Schema.zzh(zzg, zzg2);
                                                    Trace.checkArgument("Duplicate method name %s", zzh2, !hashMap.containsKey(zzh2));
                                                    hashMap.put(zzh2, zzccgVar2);
                                                }
                                                z = z4;
                                                zzbszVar4 = zzbszVar5;
                                            }
                                        }
                                    }
                                    zzcciVar = new zzcci(zzccgVar, hashMap, hashMap2, zzcfkVar, obj, zzd5);
                                }
                                zzbszVar3 = new zzbsz(zzcciVar);
                                zzbszVar4 = zzbszVar3;
                            }
                            zzcfkVar = null;
                            HashMap hashMap3 = new HashMap();
                            HashMap hashMap22 = new HashMap();
                            if (map3 != null) {
                            }
                            zza = zzwr.zza("methodConfig", map3);
                            if (zza != null) {
                            }
                            if (zza != null) {
                            }
                            zzbszVar3 = new zzbsz(zzcciVar);
                            zzbszVar4 = zzbszVar3;
                        } catch (RuntimeException e5) {
                            zzbszVar2 = new zzbsz(zzbtx.zzc.zze("failed to parse service config").zzd(e5));
                            zzbszVar4 = zzbszVar2;
                            zzbtcVar.zzc = zzbszVar4;
                            return new zzbtd(zzbtcVar.zza, zzbtcVar.zzb, zzbtcVar.zzc);
                        } catch (Throwable th) {
                            zzbszVar2 = new zzbsz(zzbtx.zzh.zze("Unexpected error parsing service config").zzd(th));
                            zzbszVar4 = zzbszVar2;
                            zzbtcVar.zzc = zzbszVar4;
                            return new zzbtd(zzbtcVar.zza, zzbtcVar.zzb, zzbtcVar.zzc);
                        }
                    }
                }
            }
            zzbtcVar.zzc = zzbszVar4;
        }
        return new zzbtd(zzbtcVar.zza, zzbtcVar.zzb, zzbtcVar.zzc);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0117 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzbqd zzf() {
        URI uri;
        ProxySelector proxySelector;
        URL url;
        zzbqm zzbqmVar;
        InetSocketAddress createUnresolved = InetSocketAddress.createUnresolved(this.zzr, this.zzs);
        zzcdt zzcdtVar = this.zze;
        zzcdtVar.getClass();
        if (createUnresolved != null) {
            Logger logger = zzcdt.zzb;
            try {
                uri = new URI("https", null, createUnresolved.getHostString(), createUnresolved.getPort(), null, null, null);
                zzcdtVar.zzd.getClass();
                proxySelector = ProxySelector.getDefault();
            } catch (URISyntaxException e) {
                zzcdt.zzb.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e);
            }
            if (proxySelector == null) {
                logger.logp(Level.FINE, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "proxy selector is null, so continuing without proxy lookup");
            } else {
                List<Proxy> select = proxySelector.select(uri);
                if (select.size() > 1) {
                    logger.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = select.get(0);
                if (proxy.type() != Proxy.Type.DIRECT) {
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy.address();
                    String hostString = inetSocketAddress.getHostString();
                    InetAddress address = inetSocketAddress.getAddress();
                    int port = inetSocketAddress.getPort();
                    try {
                        url = new URL("https", hostString, port, "");
                    } catch (MalformedURLException unused) {
                        zzcdt.zzb.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl$1", "requestPasswordAuthentication", "failed to create URL for Authenticator: {0} {1}", new Object[]{"https", hostString});
                        url = null;
                    }
                    PasswordAuthentication requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostString, address, port, "https", "", null, url, Authenticator.RequestorType.PROXY);
                    if (inetSocketAddress.isUnresolved()) {
                        inetSocketAddress = new InetSocketAddress(InetAddress.getByName(inetSocketAddress.getHostName()), inetSocketAddress.getPort());
                    }
                    int i = zzbqm.$r8$clinit;
                    zzbql zzbqlVar = new zzbql(0);
                    zzbqlVar.zzb = createUnresolved;
                    zzbqlVar.zza = inetSocketAddress;
                    if (requestPasswordAuthentication == null) {
                        zzbqmVar = new zzbqm(zzbqlVar.zza, zzbqlVar.zzb, zzbqlVar.zzc, zzbqlVar.zzd, zzbqlVar.zze);
                    } else {
                        zzbqlVar.zzd = requestPasswordAuthentication.getUserName();
                        zzbqlVar.zze = requestPasswordAuthentication.getPassword() == null ? null : new String(requestPasswordAuthentication.getPassword());
                        zzbqmVar = new zzbqm(zzbqlVar.zza, zzbqlVar.zzb, zzbqlVar.zzc, zzbqlVar.zzd, zzbqlVar.zze);
                    }
                    if (zzbqmVar == null) {
                        return new zzbqd(Collections.singletonList(zzbqmVar), zzbor.zza);
                    }
                    return null;
                }
            }
        }
        zzbqmVar = null;
        if (zzbqmVar == null) {
        }
    }

    public final void zzm() {
        if (this.zzA || this.zzy) {
            return;
        }
        if (this.zzg) {
            long j = this.zzu;
            long j2 = 0;
            if (j != 0) {
                if (j <= 0) {
                    return;
                }
                Stopwatch stopwatch = this.zzx;
                if (stopwatch.isRunning) {
                    stopwatch.ticker.getClass();
                    j2 = System.nanoTime() - stopwatch.startTick;
                }
                if (j2 <= j) {
                    return;
                }
            }
        }
        this.zzA = true;
        this.zzz.execute(new zzb(this, this.zzB));
    }
}
