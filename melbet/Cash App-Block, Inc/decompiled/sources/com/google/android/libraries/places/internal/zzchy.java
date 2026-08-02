package com.google.android.libraries.places.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.tracing.Trace;
import com.android.volley.Response;
import com.google.android.gms.cloudmessaging.zzv;
import com.google.common.base.Ascii;
import com.google.mlkit.common.sdkinternal.zzb;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.URI;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import kotlin.text.Charsets;
import net.oneformapp.schema.Schema;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzchy implements zzbwf, zzbvu {
    public static final boolean zza;
    public static final Map zze;
    public static final Logger zzf;
    public int zzA;
    public com.google.android.gms.cloudmessaging.zzh zzB;
    public zzbor zzC;
    public zzbtx zzD;
    public boolean zzE;
    public boolean zzG;
    public boolean zzH;
    public final SocketFactory zzI;
    public final SSLSocketFactory zzJ;
    public final zzciu zzK;
    public Socket zzL;
    public int zzM;
    public final LinkedList zzN;
    public final zzciq zzO;
    public final zzmu zzQ;
    public final int zzR;
    public final zzcgr zzS;
    public final zzchx zzT;
    public final zzbzo zzU;
    public final zzbqm zzb;
    public final int zzc;
    public Socket zzg;
    public SSLSession zzh;
    public final InetSocketAddress zzi;
    public final String zzj;
    public final String zzk;
    public final int zzn;
    public final zzcjq zzo;
    public zzcaf zzp;
    public zzche zzq;
    public zzv zzr;
    public final Object zzs;
    public final zzbra zzt;
    public int zzu;
    public final HashMap zzv;
    public final Executor zzw;
    public final zzcfw zzx;
    public final ScheduledExecutorService zzy;
    public final int zzz;

    static {
        EnumMap enumMap = new EnumMap(zzcje.class);
        zzbtx zzbtxVar = zzbtx.zzh;
        enumMap.put((EnumMap) zzcje.NO_ERROR, (zzcje) zzbtxVar.zze("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) zzcje.PROTOCOL_ERROR, (zzcje) zzbtxVar.zze("Protocol error"));
        enumMap.put((EnumMap) zzcje.INTERNAL_ERROR, (zzcje) zzbtxVar.zze("Internal error"));
        enumMap.put((EnumMap) zzcje.FLOW_CONTROL_ERROR, (zzcje) zzbtxVar.zze("Flow control error"));
        enumMap.put((EnumMap) zzcje.STREAM_CLOSED, (zzcje) zzbtxVar.zze("Stream closed"));
        enumMap.put((EnumMap) zzcje.FRAME_TOO_LARGE, (zzcje) zzbtxVar.zze("Frame too large"));
        enumMap.put((EnumMap) zzcje.REFUSED_STREAM, (zzcje) zzbtx.zzi.zze("Refused stream"));
        enumMap.put((EnumMap) zzcje.CANCEL, (zzcje) zzbtx.zzb.zze("Cancelled"));
        enumMap.put((EnumMap) zzcje.COMPRESSION_ERROR, (zzcje) zzbtxVar.zze("Compression error"));
        enumMap.put((EnumMap) zzcje.CONNECT_ERROR, (zzcje) zzbtxVar.zze("Connect error"));
        enumMap.put((EnumMap) zzcje.ENHANCE_YOUR_CALM, (zzcje) zzbtx.zzf.zze("Enhance your calm"));
        enumMap.put((EnumMap) zzcje.INADEQUATE_SECURITY, (zzcje) zzbtx.zze.zze("Inadequate security"));
        zze = Collections.unmodifiableMap(enumMap);
        zzf = Logger.getLogger(zzchy.class.getName());
        Logger logger = zzbzg.zzp;
        zza = zzbqe.zzb("GRPC_ENABLE_PER_RPC_AUTHORITY_CHECK", false);
        try {
            Class.forName("javax.net.ssl.X509ExtendedTrustManager").getMethod("checkServerTrusted", X509Certificate[].class, String.class, Socket.class);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
        }
    }

    public zzchy(zzchl zzchlVar, InetSocketAddress inetSocketAddress, String str, String str2, zzbor zzborVar, zzbqm zzbqmVar, zzmu zzmuVar) {
        zzbzc zzbzcVar = zzbzg.zzo;
        zzcjq zzcjqVar = new zzcjq();
        new Random();
        Object obj = new Object();
        this.zzs = obj;
        this.zzv = new HashMap();
        this.zzM = 0;
        this.zzN = new LinkedList();
        this.zzT = new zzchx();
        this.zzU = new zzbzo(this, 2);
        this.zzc = 30000;
        Trace.checkNotNull(inetSocketAddress, "address");
        this.zzi = inetSocketAddress;
        this.zzj = str;
        this.zzz = 4194304;
        this.zzn = 65535;
        Executor executor = zzchlVar.zza;
        Trace.checkNotNull(executor, "executor");
        this.zzw = executor;
        this.zzx = new zzcfw(zzchlVar.zza);
        ScheduledExecutorService scheduledExecutorService = zzchlVar.zzb;
        Trace.checkNotNull(scheduledExecutorService, "scheduledExecutorService");
        this.zzy = scheduledExecutorService;
        this.zzu = 3;
        this.zzI = SocketFactory.getDefault();
        this.zzJ = zzchlVar.zzd;
        this.zzK = zzciu.zza;
        zzciq zzciqVar = zzchlVar.zze;
        Trace.checkNotNull(zzciqVar, "connectionSpec");
        this.zzO = zzciqVar;
        Trace.checkNotNull(zzbzcVar, "stopwatchFactory");
        this.zzo = zzcjqVar;
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-okhttp/1.81.0-SNAPSHOT");
        this.zzk = sb.toString();
        this.zzb = zzbqmVar;
        this.zzQ = zzmuVar;
        this.zzR = Integer.MAX_VALUE;
        zzcar zzcarVar = zzchlVar.zzc;
        zzcarVar.getClass();
        this.zzS = new zzcgr(zzcarVar.zza);
        this.zzt = zzbra.zza(zzchy.class, inetSocketAddress.toString());
        zzbor zzborVar2 = zzbor.zza;
        zzboq zzboqVar = zzjn.zzb;
        IdentityHashMap identityHashMap = new IdentityHashMap(zzborVar2.zzb.size() + 1);
        identityHashMap.putAll(zzborVar2.zzb);
        identityHashMap.put(zzboqVar, zzborVar);
        this.zzC = new zzbor(identityHashMap, 0);
        synchronized (obj) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String zzaf(zzclm zzclmVar) {
        long j;
        long j2;
        zzclz zzclzVar;
        long j3;
        long j4;
        String str;
        int i;
        long j5;
        zzclo zzcloVar = new zzclo();
        do {
            long zza2 = zzclmVar.zza(zzcloVar, 1L);
            j = -1;
            j2 = zzcloVar.zzb;
            if (zza2 == -1) {
                Path$$ExternalSyntheticBUOutline0.m$1("\\n not found: ".concat(String.valueOf(zzcloVar.zzn(j2).zzg())));
                return null;
            }
        } while (zzcloVar.zzk(j2 - 1) != 10);
        long j6 = zzcloVar.zzb;
        long j7 = j6 < Long.MAX_VALUE ? j6 : Long.MAX_VALUE;
        long j8 = 0;
        if (j7 != 0 && (zzclzVar = zzcloVar.zza) != null) {
            if (j6 < 0) {
                while (j6 > 0) {
                    zzclzVar = zzclzVar.zzg;
                    zzclzVar.getClass();
                    j6 -= zzclzVar.zzc - zzclzVar.zzb;
                    j = j;
                }
                j3 = j;
                str = null;
                long j9 = 0;
                loop4: while (j6 < j7) {
                    byte[] bArr = zzclzVar.zza;
                    j4 = j8;
                    int min = (int) Math.min(zzclzVar.zzc, (zzclzVar.zzb + j7) - j6);
                    i = (int) ((zzclzVar.zzb + j9) - j6);
                    while (i < min) {
                        if (bArr[i] == 10) {
                            j5 = (i - zzclzVar.zzb) + j6;
                            break loop4;
                        }
                        i++;
                    }
                    j9 = (zzclzVar.zzc - zzclzVar.zzb) + j6;
                    zzclzVar = zzclzVar.zzf;
                    zzclzVar.getClass();
                    j6 = j9;
                    j8 = j4;
                }
                j4 = j8;
            } else {
                j3 = -1;
                j4 = 0;
                str = null;
                j6 = 0;
                while (true) {
                    long j10 = (zzclzVar.zzc - zzclzVar.zzb) + j6;
                    if (j10 > 0) {
                        break;
                    }
                    zzclzVar = zzclzVar.zzf;
                    zzclzVar.getClass();
                    j6 = j10;
                }
                long j11 = 0;
                loop7: while (j6 < j7) {
                    byte[] bArr2 = zzclzVar.zza;
                    int min2 = (int) Math.min(zzclzVar.zzc, (zzclzVar.zzb + j7) - j6);
                    i = (int) ((zzclzVar.zzb + j11) - j6);
                    while (i < min2) {
                        if (bArr2[i] == 10) {
                            j5 = (i - zzclzVar.zzb) + j6;
                            break loop4;
                        }
                        i++;
                    }
                    j11 = (zzclzVar.zzc - zzclzVar.zzb) + j6;
                    zzclzVar = zzclzVar.zzf;
                    zzclzVar.getClass();
                    j6 = j11;
                }
            }
            if (j5 == j3) {
                byte[] bArr3 = zzcmi.zzb;
                if (j5 > j4) {
                    long j12 = j5 + j3;
                    if (zzcloVar.zzk(j12) == 13) {
                        String zzp = zzcloVar.zzp(j12, Charsets.UTF_8);
                        zzcloVar.zzt(2L);
                        return zzp;
                    }
                }
                String zzp2 = zzcloVar.zzp(j5, Charsets.UTF_8);
                zzcloVar.zzt(1L);
                return zzp2;
            }
            zzclo zzcloVar2 = new zzclo();
            long min3 = Math.min(32L, zzcloVar.zzb);
            zzkf.zza(zzcloVar.zzb, 0L, min3);
            if (min3 != j4) {
                zzcloVar2.zzb += min3;
                zzclz zzclzVar2 = zzcloVar.zza;
                long j13 = j4;
                while (true) {
                    zzclzVar2.getClass();
                    long j14 = zzclzVar2.zzc - zzclzVar2.zzb;
                    if (j13 < j14) {
                        break;
                    }
                    zzclzVar2 = zzclzVar2.zzf;
                    j13 -= j14;
                }
                while (min3 > j4) {
                    zzclzVar2.getClass();
                    zzclz zza3 = zzclzVar2.zza();
                    int i2 = zza3.zzb + ((int) j13);
                    zza3.zzb = i2;
                    zza3.zzc = Math.min(i2 + ((int) min3), zza3.zzc);
                    zzclz zzclzVar3 = zzcloVar2.zza;
                    if (zzclzVar3 == null) {
                        zza3.zzg = zza3;
                        zza3.zzf = zza3;
                        zzcloVar2.zza = zza3;
                    } else {
                        zzclz zzclzVar4 = zzclzVar3.zzg;
                        zzclzVar4.getClass();
                        zzclzVar4.zzc(zza3);
                    }
                    min3 -= zza3.zzc - zza3.zzb;
                    zzclzVar2 = zzclzVar2.zzf;
                    j13 = j4;
                }
            }
            long min4 = Math.min(zzcloVar.zzb, Long.MAX_VALUE);
            String zzg = zzcloVar2.zzn(zzcloVar2.zzb).zzg();
            StringBuilder sb = new StringBuilder(Boxes$$ExternalSyntheticOutline1.m(String.valueOf(min4).length() + 29, 1, String.valueOf(zzg)));
            sb.append("\\n not found: limit=");
            sb.append(min4);
            sb.append(" content=");
            Path$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, zzg, "…"));
            return str;
        }
        j3 = -1;
        j4 = 0;
        str = null;
        j5 = j3;
        if (j5 == j3) {
        }
    }

    public static zzbtx zzr(zzcje zzcjeVar) {
        zzbtx zzbtxVar = (zzbtx) zze.get(zzcjeVar);
        if (zzbtxVar != null) {
            return zzbtxVar;
        }
        zzbtx zzbtxVar2 = zzbtx.zzc;
        int i = zzcjeVar.zzs;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("Unknown http2 error code: ");
        sb.append(i);
        return zzbtxVar2.zze(sb.toString());
    }

    public final String toString() {
        Response stringHelper = Ascii.toStringHelper(this);
        stringHelper.add(this.zzt.zzd, "logId");
        stringHelper.add(this.zzi, "address");
        return stringHelper.toString();
    }

    public final void zzad(zzchp zzchpVar) {
        Trace.checkState("StreamId already assigned", zzchpVar.zzg.zzq == -1);
        this.zzv.put(Integer.valueOf(this.zzu), zzchpVar);
        if (!this.zzH) {
            this.zzH = true;
        }
        if (((zzbuq) zzchpVar).zze) {
            this.zzU.zza(zzchpVar, true);
        }
        zzcho zzchoVar = zzchpVar.zzg;
        int i = this.zzu;
        Trace.checkState("the stream has been started with id %s", i, zzchoVar.zzq == -1);
        zzchoVar.zzq = i;
        zzv zzvVar = zzchoVar.zzl;
        zzchoVar.zzp = new zzcij(zzvVar, i, zzvVar.zze, zzchoVar);
        zzchp zzchpVar2 = zzchoVar.zza;
        zzcho zzchoVar2 = zzchpVar2.zzg;
        Trace.checkState(zzchoVar2.zzc$2 != null);
        synchronized (zzchoVar2.zzs) {
            Trace.checkState("Already allocated", !zzchoVar2.zzw);
            zzchoVar2.zzw = true;
        }
        zzchoVar2.zzc();
        zzcgr zzcgrVar = zzchoVar2.zzt;
        zzcgrVar.getClass();
        zzcgrVar.zzb.zza();
        if (zzchoVar.zzn) {
            zzche zzcheVar = zzchoVar.zzk;
            int i2 = zzchoVar.zzq;
            ArrayList arrayList = zzchoVar.zzd;
            zzcheVar.getClass();
            try {
                zzcheVar.zzc.zzf(i2, arrayList);
            } catch (IOException e) {
                zzcheVar.zzb.zzg(e);
            }
            zzcgh zzcghVar = zzchpVar2.zze;
            int i3 = 0;
            while (true) {
                zzbub[] zzbubVarArr = zzcghVar.zza;
                if (i3 >= zzbubVarArr.length) {
                    break;
                }
                i3++;
            }
            zzchoVar.zzd = null;
            zzclo zzcloVar = zzchoVar.zze;
            if (zzcloVar.zzb > 0) {
                zzvVar.zzc(zzchoVar.zzf, zzchoVar.zzp, zzcloVar, zzchoVar.zzg);
            }
            zzchoVar.zzn = false;
        }
        zzbsq zzbsqVar = (zzbsq) zzchpVar.zzc.mappedElements;
        if (zzbsqVar != zzbsq.zza && zzbsqVar != zzbsq.zzc) {
            this.zzq.zze();
        }
        int i4 = this.zzu;
        if (i4 < 2147483645) {
            this.zzu = i4 + 2;
        } else {
            this.zzu = Integer.MAX_VALUE;
            zzag(Integer.MAX_VALUE, zzcje.NO_ERROR, zzbtx.zzi.zze("Stream ids exhausted"));
        }
    }

    public final boolean zzae() {
        boolean z = false;
        while (true) {
            LinkedList linkedList = this.zzN;
            if (linkedList.isEmpty() || this.zzv.size() >= this.zzM) {
                break;
            }
            zzad((zzchp) linkedList.poll());
            z = true;
        }
        return z;
    }

    public final void zzag(int i, zzcje zzcjeVar, zzbtx zzbtxVar) {
        zzbze zzbzeVar;
        synchronized (this.zzs) {
            try {
                if (this.zzD == null) {
                    this.zzD = zzbtxVar;
                    if (zzcjeVar == null) {
                        zzbzeVar = zzbze.zza;
                    } else {
                        long j = zzcjeVar.zzs;
                        zzbze[] zzbzeVarArr = zzbze.zzo;
                        if (j < zzbzeVarArr.length && j >= 0) {
                            zzbzeVar = zzbzeVarArr[(int) j];
                        }
                        zzbzeVar = null;
                    }
                    this.zzp.zzd(zzbtxVar, new zzbyx(zzbzeVar));
                }
                if (zzcjeVar != null && !this.zzE) {
                    this.zzE = true;
                    this.zzq.zzj(zzcjeVar, new byte[0]);
                }
                Iterator it = this.zzv.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Integer) entry.getKey()).intValue() > i) {
                        it.remove();
                        ((zzchp) entry.getValue()).zzg.zzg(zzbtxVar, zzbvs.zzb, false, new zzbsn());
                        zzai((zzchp) entry.getValue());
                    }
                }
                LinkedList<zzchp> linkedList = this.zzN;
                for (zzchp zzchpVar : linkedList) {
                    zzchpVar.zzg.zzg(zzbtxVar, zzbvs.zzd, true, new zzbsn());
                    zzai(zzchpVar);
                }
                linkedList.clear();
                zzah();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzah() {
        if (this.zzD == null || !this.zzv.isEmpty() || !this.zzN.isEmpty() || this.zzG) {
            return;
        }
        this.zzG = true;
        if (!this.zzE) {
            this.zzE = true;
            this.zzq.zzj(zzcje.NO_ERROR, new byte[0]);
        }
        this.zzq.close();
    }

    public final void zzai(zzchp zzchpVar) {
        if (this.zzH && this.zzN.isEmpty() && this.zzv.isEmpty()) {
            this.zzH = false;
        }
        if (((zzbuq) zzchpVar).zze) {
            this.zzU.zza(zzchpVar, false);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcck
    public final void zzaq(zzccj zzccjVar) {
        this.zzp = (zzcaf) zzccjVar;
        zzchc zzchcVar = new zzchc(this.zzx, this);
        zzclx zzclxVar = new zzclx(zzchcVar);
        this.zzo.getClass();
        zzcha zzchaVar = new zzcha(zzchcVar, new zzcjp(zzclxVar));
        synchronized (this.zzs) {
            zzche zzcheVar = new zzche(this, zzchaVar);
            this.zzq = zzcheVar;
            this.zzr = new zzv(this, zzcheVar);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        CountDownLatch countDownLatch2 = new CountDownLatch(1);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        this.zzx.execute(new com.google.mlkit.common.sdkinternal.zzn(6, this, countDownLatch, cyclicBarrier, zzchcVar, countDownLatch2, false));
        this.zzw.execute(new zzb(this, cyclicBarrier, countDownLatch2));
        try {
            synchronized (this.zzs) {
                zzche zzcheVar2 = this.zzq;
                zzcheVar2.getClass();
                try {
                    zzcheVar2.zzc.zzd();
                } catch (IOException e) {
                    zzcheVar2.zzb.zzg(e);
                }
                zzcjt zzcjtVar = new zzcjt();
                int i = this.zzn;
                zzcjtVar.zza |= 128;
                zzcjtVar.zzb[7] = i;
                zzche zzcheVar3 = this.zzq;
                zzcheVar3.zzd.zze(2, zzcjtVar);
                try {
                    zzcheVar3.zzc.zzi(zzcjtVar);
                } catch (IOException e2) {
                    zzcheVar3.zzb.zzg(e2);
                }
            }
            countDownLatch.countDown();
            this.zzx.execute(new zzmu(this, 18));
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbvu
    public final zzbvr zzb(Schema schema, zzbsn zzbsnVar, zzbov zzbovVar, zzbph[] zzbphVarArr) {
        zzchp zzchpVar;
        Trace.checkNotNull(schema, "method");
        Trace.checkNotNull(zzbsnVar, "headers");
        zzcgh zzcghVar = new zzcgh(zzbphVarArr);
        for (zzbph zzbphVar : zzbphVarArr) {
        }
        Object obj = this.zzs;
        synchronized (obj) {
            zzchpVar = new zzchp(schema, zzbsnVar, this.zzq, this, this.zzr, obj, this.zzz, this.zzn, this.zzj, this.zzk, zzcghVar, this.zzS, zzbovVar);
        }
        return zzchpVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbqz
    public final zzbra zzc() {
        return this.zzt;
    }

    @Override // com.google.android.libraries.places.internal.zzcck
    public final void zzd(zzbtx zzbtxVar) {
        synchronized (this.zzs) {
            try {
                if (this.zzD != null) {
                    return;
                }
                this.zzD = zzbtxVar;
                this.zzp.zzd(zzbtxVar, zzcgg.SUBCHANNEL_SHUTDOWN);
                zzah();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcck
    public final void zze(zzbtx zzbtxVar) {
        zzd(zzbtxVar);
        synchronized (this.zzs) {
            try {
                Iterator it = this.zzv.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    it.remove();
                    ((zzchp) entry.getValue()).zzg.zzg(zzbtxVar, zzbvs.zza, false, new zzbsn());
                    zzai((zzchp) entry.getValue());
                }
                LinkedList<zzchp> linkedList = this.zzN;
                for (zzchp zzchpVar : linkedList) {
                    zzchpVar.zzg.zzg(zzbtxVar, zzbvs.zzd, true, new zzbsn());
                    zzai(zzchpVar);
                }
                linkedList.clear();
                zzah();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwf
    public final zzbor zzf() {
        return this.zzC;
    }

    public final void zzg(Exception exc) {
        zzag(0, zzcje.INTERNAL_ERROR, zzbtx.zzi.zzd(exc));
    }

    public final int zzl() {
        URI zzb = zzbzg.zzb(this.zzj);
        return zzb.getPort() != -1 ? zzb.getPort() : this.zzi.getPort();
    }

    public final zzcij[] zzn() {
        zzcij[] zzcijVarArr;
        zzcij zzcijVar;
        synchronized (this.zzs) {
            HashMap hashMap = this.zzv;
            zzcijVarArr = new zzcij[hashMap.size()];
            Iterator it = hashMap.values().iterator();
            int i = 0;
            while (it.hasNext()) {
                int i2 = i + 1;
                zzcho zzchoVar = ((zzchp) it.next()).zzg;
                synchronized (zzchoVar.zzc) {
                    zzcijVar = zzchoVar.zzp;
                }
                zzcijVarArr[i] = zzcijVar;
                i = i2;
            }
        }
        return zzcijVarArr;
    }

    public final void zzo(int i, zzbtx zzbtxVar, zzbvs zzbvsVar, boolean z, zzcje zzcjeVar, zzbsn zzbsnVar) {
        synchronized (this.zzs) {
            try {
                zzchp zzchpVar = (zzchp) this.zzv.remove(Integer.valueOf(i));
                if (zzchpVar != null) {
                    if (zzcjeVar != null) {
                        this.zzq.zzb(i, zzcje.CANCEL);
                    }
                    if (zzbtxVar != null) {
                        zzcho zzchoVar = zzchpVar.zzg;
                        if (zzbsnVar == null) {
                            zzbsnVar = new zzbsn();
                        }
                        zzchoVar.zzg(zzbtxVar, zzbvsVar, z, zzbsnVar);
                    }
                    if (!zzae()) {
                        zzah();
                    }
                    zzai(zzchpVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzp(int i) {
        boolean z;
        synchronized (this.zzs) {
            z = false;
            if (i < this.zzu && (i & 1) == 1) {
                z = true;
            }
        }
        return z;
    }

    public final Socket zzt(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) {
        Socket socket;
        int i;
        String str3;
        String str4;
        int i2;
        String str5;
        try {
            InetAddress address = inetSocketAddress2.getAddress();
            SocketFactory socketFactory = this.zzI;
            Socket createSocket = address != null ? socketFactory.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : socketFactory.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            try {
                createSocket.setTcpNoDelay(true);
                createSocket.setSoTimeout(this.zzc);
                int i3 = zzclv.$r8$clinit;
                zzcmd zzcmdVar = new zzcmd();
                InputStream inputStream = createSocket.getInputStream();
                inputStream.getClass();
                zzclm zzclmVar = new zzclm(new zzclt(inputStream, zzcmdVar));
                zzcmd zzcmdVar2 = new zzcmd();
                OutputStream outputStream = createSocket.getOutputStream();
                outputStream.getClass();
                zzclx zzclxVar = new zzclx(new zzcll(new zzclw(outputStream, zzcmdVar2)));
                zzcjv zzcjvVar = new zzcjv();
                zzcjvVar.zza = "https";
                zzcjvVar.zzb(inetSocketAddress.getHostName());
                int port = inetSocketAddress.getPort();
                if (port <= 0 || port > 65535) {
                    StringBuilder sb = new StringBuilder(String.valueOf(port).length() + 17);
                    sb.append("unexpected port: ");
                    sb.append(port);
                    throw new IllegalArgumentException(sb.toString());
                }
                zzcjvVar.zzc = port;
                if (zzcjvVar.zza == null) {
                    throw new IllegalStateException("scheme == null");
                }
                if (zzcjvVar.zzb == null) {
                    throw new IllegalStateException("host == null");
                }
                zzcjw zzcjwVar = new zzcjw(zzcjvVar);
                zzcjx zzcjxVar = new zzcjx();
                zzcjxVar.zza = zzcjwVar;
                String str6 = zzcjwVar.zza;
                int i4 = zzcjwVar.zzb;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str6).length() + 1 + String.valueOf(i4).length());
                sb2.append(str6);
                sb2.append(":");
                sb2.append(i4);
                zzcjxVar.zzb("Host", sb2.toString());
                zzcjxVar.zzb("User-Agent", this.zzk);
                if (str != null && str2 != null) {
                    try {
                        StringBuilder sb3 = new StringBuilder(str.length() + 1 + str2.length());
                        sb3.append(str);
                        sb3.append(":");
                        sb3.append(str2);
                        byte[] bytes = sb3.toString().getBytes("ISO-8859-1");
                        zzcls zzclsVar = zzcls.zza;
                        String zzf2 = zzey.zzb(bytes).zzf();
                        StringBuilder sb4 = new StringBuilder(zzf2.length() + 6);
                        sb4.append("Basic ");
                        sb4.append(zzf2);
                        zzcjxVar.zzb("Proxy-Authorization", sb4.toString());
                    } catch (UnsupportedEncodingException unused) {
                        throw new AssertionError();
                    }
                }
                zzcjw zzcjwVar2 = zzcjxVar.zza;
                if (zzcjwVar2 == null) {
                    throw new IllegalStateException("url == null");
                }
                zzcis zzcisVar = zzcjxVar.zzb;
                zzcisVar.getClass();
                ArrayList arrayList = zzcisVar.zza;
                String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                Locale locale = Locale.US;
                zzclxVar.zzH("CONNECT " + zzcjwVar2.zza + ":" + zzcjwVar2.zzb + " HTTP/1.1");
                zzclxVar.zzH("\r\n");
                int length = strArr.length >> 1;
                for (int i5 = 0; i5 < length; i5++) {
                    int i6 = i5 + i5;
                    if (i6 >= 0 && i6 < strArr.length) {
                        str4 = strArr[i6];
                        zzclxVar.zzH(str4);
                        zzclxVar.zzH(": ");
                        i2 = i6 + 1;
                        if (i2 >= 0 && i2 < strArr.length) {
                            str5 = strArr[i2];
                            zzclxVar.zzH(str5);
                            zzclxVar.zzH("\r\n");
                        }
                        str5 = null;
                        zzclxVar.zzH(str5);
                        zzclxVar.zzH("\r\n");
                    }
                    str4 = null;
                    zzclxVar.zzH(str4);
                    zzclxVar.zzH(": ");
                    i2 = i6 + 1;
                    if (i2 >= 0) {
                        str5 = strArr[i2];
                        zzclxVar.zzH(str5);
                        zzclxVar.zzH("\r\n");
                    }
                    str5 = null;
                    zzclxVar.zzH(str5);
                    zzclxVar.zzH("\r\n");
                }
                zzclxVar.zzH("\r\n");
                zzclxVar.flush();
                String zzaf = zzaf(zzclmVar);
                if (zzaf.startsWith("HTTP/1.")) {
                    i = 9;
                    if (zzaf.length() < 9 || zzaf.charAt(8) != ' ') {
                        throw new ProtocolException("Unexpected status line: ".concat(zzaf));
                    }
                    int charAt = zzaf.charAt(7) - '0';
                    if (charAt != 0 && charAt != 1) {
                        throw new ProtocolException("Unexpected status line: ".concat(zzaf));
                    }
                } else {
                    if (!zzaf.startsWith("ICY ")) {
                        throw new ProtocolException("Unexpected status line: ".concat(zzaf));
                    }
                    i = 4;
                }
                int i7 = i + 3;
                if (zzaf.length() < i7) {
                    throw new ProtocolException("Unexpected status line: ".concat(zzaf));
                }
                try {
                    int parseInt = Integer.parseInt(zzaf.substring(i, i7));
                    if (zzaf.length() <= i7) {
                        str3 = "";
                    } else {
                        if (zzaf.charAt(i7) != ' ') {
                            throw new ProtocolException("Unexpected status line: ".concat(zzaf));
                        }
                        str3 = zzaf.substring(i + 4);
                    }
                    while (!zzaf(zzclmVar).equals("")) {
                    }
                    if (parseInt >= 200 && parseInt < 300) {
                        createSocket.setSoTimeout(0);
                        return createSocket;
                    }
                    zzclo zzcloVar = new zzclo();
                    try {
                        createSocket.shutdownOutput();
                        zzclmVar.zza(zzcloVar, 1024L);
                    } catch (IOException e) {
                        String obj = e.toString();
                        StringBuilder sb5 = new StringBuilder(String.valueOf(obj).length() + 21);
                        sb5.append("Unable to read body: ");
                        sb5.append(obj);
                        String sb6 = sb5.toString();
                        zzcloVar.zzw(sb6.length(), sb6);
                    }
                    try {
                        createSocket.close();
                    } catch (IOException unused2) {
                    }
                    Locale locale2 = Locale.US;
                    throw new zzbty(zzbtx.zzi.zze("Response returned from proxy was not successful (expected 2xx, got " + parseInt + " " + str3 + "). Response body:\n" + zzcloVar.zzp(zzcloVar.zzb, Charsets.UTF_8)));
                } catch (NumberFormatException unused3) {
                    throw new ProtocolException("Unexpected status line: ".concat(zzaf));
                }
            } catch (IOException e2) {
                e = e2;
                socket = createSocket;
                if (socket != null) {
                    zzbzg.zzh(socket);
                }
                throw new zzbty(zzbtx.zzi.zze("Failed trying to connect with proxy").zzd(e));
            }
        } catch (IOException e3) {
            e = e3;
            socket = null;
        }
    }
}
