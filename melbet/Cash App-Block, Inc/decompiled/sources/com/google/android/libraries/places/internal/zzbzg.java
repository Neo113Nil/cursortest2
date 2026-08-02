package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import com.google.common.base.CharMatcher$Whitespace;
import com.google.common.util.concurrent.ThreadFactoryBuilder$1;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Closeable;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzbzg {
    public static final zzbsh zza;
    public static final zzbsh zzb;
    public static final zzbsl zzc;
    public static final zzbsh zzd;
    public static final zzbsl zze;
    public static final zzbsh zzf;
    public static final zzbsh zzg;
    public static final zzbsh zzh;
    public static final zzbsh zzi;
    public static final long zzj;
    public static final zzcdt zzk;
    public static final zzboq zzl;
    public static final zzbza zzm;
    public static final zzbzb zzn;
    public static final zzbzc zzo;
    public static final Logger zzp = Logger.getLogger(zzbzg.class.getName());
    public static final Set zzq = Collections.unmodifiableSet(EnumSet.of(zzbtu.OK, zzbtu.INVALID_ARGUMENT, zzbtu.NOT_FOUND, zzbtu.ALREADY_EXISTS, zzbtu.FAILED_PRECONDITION, zzbtu.ABORTED, zzbtu.OUT_OF_RANGE, zzbtu.DATA_LOSS));
    public static final zzbyz zzr;

    static {
        Charset.forName("US-ASCII");
        zza = new zzbsh("grpc-timeout", new zzbzf());
        zzbsg zzbsgVar = zzbsn.zza;
        zzb = new zzbsh("grpc-encoding", zzbsgVar);
        zzc = zzbrc.zza("grpc-accept-encoding", new zzbzd());
        zzd = new zzbsh("content-encoding", zzbsgVar);
        zze = zzbrc.zza("accept-encoding", new zzbzd());
        zzf = new zzbsh("content-length", zzbsgVar);
        zzg = new zzbsh("content-type", zzbsgVar);
        zzh = new zzbsh("te", zzbsgVar);
        zzi = new zzbsh("user-agent", zzbsgVar);
        CharMatcher$Whitespace.INSTANCE.getClass();
        zzj = 20000000000L;
        zzk = new zzcdt();
        zzl = new zzboq("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", 1);
        zzr = new zzbyz();
        zzm = new zzbza();
        zzn = new zzbzb();
        zzo = new zzbzc();
    }

    private zzbzg() {
    }

    public static zzbtx zza(int i) {
        zzbtu zzbtuVar;
        if (i < 100 || i >= 200) {
            if (i != 400) {
                if (i == 401) {
                    zzbtuVar = zzbtu.UNAUTHENTICATED;
                } else if (i == 403) {
                    zzbtuVar = zzbtu.PERMISSION_DENIED;
                } else if (i != 404) {
                    if (i != 429) {
                        if (i != 431) {
                            switch (i) {
                                case HttpStatusCode.BAD_GATEWAY_502 /* 502 */:
                                case 503:
                                case 504:
                                    break;
                                default:
                                    zzbtuVar = zzbtu.UNKNOWN;
                                    break;
                            }
                        }
                    }
                    zzbtuVar = zzbtu.UNAVAILABLE;
                } else {
                    zzbtuVar = zzbtu.UNIMPLEMENTED;
                }
            }
            zzbtuVar = zzbtu.INTERNAL;
        } else {
            zzbtuVar = zzbtu.INTERNAL;
        }
        zzbtx zzb2 = zzbtuVar.zzb();
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 17);
        sb.append("HTTP status code ");
        sb.append(i);
        return zzb2.zze(sb.toString());
    }

    public static URI zzb(String str) {
        String str2;
        Trace.checkNotNull(str, "authority");
        try {
            str2 = str;
            try {
                return new URI(null, str2, null, null, null);
            } catch (URISyntaxException e) {
                e = e;
                Handlers$$ExternalSyntheticBUOutline0.m("Invalid authority: ".concat(str2), e);
                return null;
            }
        } catch (URISyntaxException e2) {
            e = e2;
            str2 = str;
        }
    }

    public static ThreadFactoryBuilder$1 zzd(String str) {
        Boolean bool = Boolean.TRUE;
        String.format(Locale.ROOT, str, 0);
        return new ThreadFactoryBuilder$1(Executors.defaultThreadFactory(), str, new AtomicLong(0L), bool, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzbvu zze(zzbro zzbroVar, boolean z) {
        zzbzz zzbzzVar;
        zzbrs zzbrsVar = zzbroVar.zzb;
        zzbtx zzbtxVar = zzbroVar.zzd;
        if (zzbrsVar != null) {
            zzcah zzcahVar = (zzcah) zzbrsVar.zze();
            zzbzzVar = zzcahVar.zzv;
            if (zzbzzVar == null) {
                zzbuf zzbufVar = zzcahVar.zzl;
                zzbufVar.zzb(new zzbzp(zzcahVar, 1));
                zzbufVar.zza();
            }
            if (zzbzzVar == null) {
                return zzbzzVar;
            }
            if (!zzbtxVar.zzj()) {
                if (zzbroVar.zze) {
                    return new zzbyn(zzi(zzbtxVar), zzbvs.zzc);
                }
                if (!z) {
                    return new zzbyn(zzi(zzbtxVar), zzbvs.zza);
                }
            }
            return null;
        }
        zzbzzVar = null;
        if (zzbzzVar == null) {
        }
    }

    public static zzbph[] zzf(zzbov zzbovVar, zzbsn zzbsnVar, int i, boolean z, boolean z2) {
        List list = zzbovVar.zze;
        int size = list.size();
        zzbph[] zzbphVarArr = new zzbph[size + 1];
        new zzbpf();
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzbphVarArr[i2] = ((zzbpe) list.get(i2)).zza();
        }
        zzbphVarArr[size] = zzr;
        return zzbphVarArr;
    }

    public static void zzh(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            zzp.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", (Throwable) e);
        }
    }

    public static zzbtx zzi(zzbtx zzbtxVar) {
        Trace.checkArgument(zzbtxVar != null);
        if (!zzq.contains(zzbtxVar.zzn)) {
            return zzbtxVar;
        }
        zzbtx zzbtxVar2 = zzbtx.zzh;
        String valueOf = String.valueOf(zzbtxVar.zzn);
        String str = zzbtxVar.zzo;
        return zzbtxVar2.zze(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(valueOf.length() + 47 + String.valueOf(str).length()), "Inappropriate status code from control plane: ", valueOf, " ", str)).zzd(zzbtxVar.zzp);
    }
}
