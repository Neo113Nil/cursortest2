package com.google.android.libraries.places.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Response;
import com.google.common.base.Ascii;
import com.google.common.base.Throwables;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public final class zzbtx {
    public static final zzbtx zza;
    public static final zzbtx zzb;
    public static final zzbtx zzc;
    public static final zzbtx zzd;
    public static final zzbtx zze;
    public static final zzbtx zzf;
    public static final zzbtx zzg;
    public static final zzbtx zzh;
    public static final zzbtx zzi;
    public static final zzbsl zzj;
    public static final zzbsl zzk;
    public static final List zzl;
    public final zzbtu zzn;
    public final String zzo;
    public final Throwable zzp;

    static {
        TreeMap treeMap = new TreeMap();
        boolean z = false;
        for (zzbtu zzbtuVar : zzbtu.values()) {
            zzbtx zzbtxVar = (zzbtx) treeMap.put(Integer.valueOf(zzbtuVar.zzr), new zzbtx(zzbtuVar, null, null));
            if (zzbtxVar != null) {
                String name = zzbtxVar.zzn.name();
                String name2 = zzbtuVar.name();
                a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(String.valueOf(name).length() + 34 + String.valueOf(name2).length()), "Code value duplication between ", name, " & ", name2));
                return;
            }
        }
        zzl = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        zza = zzbtu.OK.zzb();
        zzb = zzbtu.CANCELLED.zzb();
        zzc = zzbtu.UNKNOWN.zzb();
        zzbtu.INVALID_ARGUMENT.zzb();
        zzd = zzbtu.DEADLINE_EXCEEDED.zzb();
        zzbtu.NOT_FOUND.zzb();
        zzbtu.ALREADY_EXISTS.zzb();
        zze = zzbtu.PERMISSION_DENIED.zzb();
        zzbtu.UNAUTHENTICATED.zzb();
        zzf = zzbtu.RESOURCE_EXHAUSTED.zzb();
        zzg = zzbtu.FAILED_PRECONDITION.zzb();
        zzbtu.ABORTED.zzb();
        zzbtu.OUT_OF_RANGE.zzb();
        zzbtu.UNIMPLEMENTED.zzb();
        zzh = zzbtu.INTERNAL.zzb();
        zzi = zzbtu.UNAVAILABLE.zzb();
        zzbtu.DATA_LOSS.zzb();
        zzbtv zzbtvVar = new zzbtv();
        BitSet bitSet = zzbsj.zzb;
        zzj = new zzbsl("grpc-status", z, zzbtvVar);
        zzk = new zzbsl("grpc-message", z, new zzbtw());
    }

    public zzbtx(zzbtu zzbtuVar, String str, Throwable th) {
        Trace.checkNotNull(zzbtuVar, "code");
        this.zzn = zzbtuVar;
        this.zzo = str;
        this.zzp = th;
    }

    public static zzbtx zza(int i) {
        if (i >= 0) {
            List list = zzl;
            if (i < list.size()) {
                return (zzbtx) list.get(i);
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 13);
        sb.append("Unknown code ");
        sb.append(i);
        return zzc.zze(sb.toString());
    }

    public static zzbtx zzb(Throwable th) {
        Trace.checkNotNull(th, "t");
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof zzbty) {
                return ((zzbty) th2).zza;
            }
            if (th2 instanceof zzbua) {
                return ((zzbua) th2).zza;
            }
        }
        return zzc.zzd(th);
    }

    public static String zzc(zzbtx zzbtxVar) {
        String str = zzbtxVar.zzo;
        zzbtu zzbtuVar = zzbtxVar.zzn;
        if (str == null) {
            return zzbtuVar.toString();
        }
        String valueOf = String.valueOf(zzbtuVar);
        return Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(valueOf.length() + 2 + str.length()), valueOf, ": ", str);
    }

    public final String toString() {
        Response stringHelper = Ascii.toStringHelper(this);
        stringHelper.add(this.zzn.name(), "code");
        stringHelper.add(this.zzo, "description");
        Throwable th = this.zzp;
        Object obj = th;
        if (th != null) {
            Object obj2 = Throwables.jla;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            obj = stringWriter.toString();
        }
        stringHelper.add(obj, "cause");
        return stringHelper.toString();
    }

    public final zzbtx zzd(Throwable th) {
        return Objects.equals(this.zzp, th) ? this : new zzbtx(this.zzn, this.zzo, th);
    }

    public final zzbtx zze(String str) {
        return Objects.equals(this.zzo, str) ? this : new zzbtx(this.zzn, str, this.zzp);
    }

    public final zzbtx zzf(String str) {
        Throwable th = this.zzp;
        String str2 = this.zzo;
        zzbtu zzbtuVar = this.zzn;
        return str2 == null ? new zzbtx(zzbtuVar, str, th) : new zzbtx(zzbtuVar, Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(str2.length() + 1 + str.length()), str2, "\n", str), th);
    }

    public final boolean zzj() {
        return zzbtu.OK == this.zzn;
    }
}
