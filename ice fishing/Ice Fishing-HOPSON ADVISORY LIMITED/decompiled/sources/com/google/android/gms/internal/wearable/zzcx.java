package com.google.android.gms.internal.wearable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzcx {
    private static final zzcx zzd = new zzcx(true);
    final zzfe zza = new zzfa();
    boolean zzb;
    boolean zzc;

    private zzcx() {
    }

    public static zzcx zza() {
        return zzd;
    }

    public static int zzg(zzcw zzcwVar, Object obj) {
        zzcwVar.zzb();
        int zza = zzcwVar.zza();
        if (!zzcwVar.zzd()) {
            zzcn.zzu(zza << 3);
            zzfv zzfvVar = zzfv.DOUBLE;
            zzfw zzfwVar = zzfw.INT;
            throw null;
        }
        List list = (List) obj;
        int size = list.size();
        if (zzcwVar.zze()) {
            if (!list.isEmpty()) {
                if (size <= 0) {
                    return zzcn.zzu(zza << 3) + zzcn.zzu(0);
                }
                list.get(0);
                zzfv zzfvVar2 = zzfv.DOUBLE;
                zzfw zzfwVar2 = zzfw.INT;
                throw null;
            }
        } else if (size > 0) {
            list.get(0);
            zzcn.zzu(zza << 3);
            zzfv zzfvVar3 = zzfv.DOUBLE;
            zzfw zzfwVar3 = zzfw.INT;
            throw null;
        }
        return 0;
    }

    private static boolean zzh(Map.Entry entry) {
        zzcw zzcwVar = (zzcw) entry.getKey();
        if (zzcwVar.zzc() != zzfw.MESSAGE) {
            return true;
        }
        if (!zzcwVar.zzd()) {
            return zzi(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!zzi(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzi(Object obj) {
        if (obj instanceof zzem) {
            return ((zzem) obj).zzaf();
        }
        if (obj instanceof zzdt) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzj(Map.Entry entry) {
        zzcw zzcwVar = (zzcw) entry.getKey();
        Object value = entry.getValue();
        if (zzcwVar.zzc() != zzfw.MESSAGE || zzcwVar.zzd() || zzcwVar.zze()) {
            return zzg(zzcwVar, value);
        }
        if (value instanceof zzdt) {
            return ((zzdt) value).zzc(((zzcw) entry.getKey()).zza());
        }
        int zza = ((zzcw) entry.getKey()).zza();
        int zzu = zzcn.zzu(8);
        int zzu2 = zzcn.zzu(16) + zzcn.zzu(zza);
        int zzu3 = zzcn.zzu(24);
        int zzT = ((zzel) value).zzT();
        return zzu + zzu + zzu2 + zzu3 + zzcn.zzu(zzT) + zzT;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void zzk(zzcw zzcwVar, Object obj) {
        boolean z;
        zzcwVar.zzb();
        obj.getClass();
        zzfv zzfvVar = zzfv.DOUBLE;
        zzfw zzfwVar = zzfw.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzcwVar.zza()), zzcwVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z = obj instanceof Long;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzcwVar.zza()), zzcwVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z = obj instanceof Float;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzcwVar.zza()), zzcwVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z = obj instanceof Double;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzcwVar.zza()), zzcwVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z = obj instanceof Boolean;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzcwVar.zza()), zzcwVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z = obj instanceof String;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzcwVar.zza()), zzcwVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzcg) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzcwVar.zza()), zzcwVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzdk)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzcwVar.zza()), zzcwVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzel) || (obj instanceof zzdt)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzcwVar.zza()), zzcwVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzcwVar.zza()), zzcwVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzcx zzcxVar = new zzcx();
        zzfe zzfeVar = this.zza;
        int zzc = zzfeVar.zzc();
        for (int i = 0; i < zzc; i++) {
            Map.Entry zzd2 = zzfeVar.zzd(i);
            zzcxVar.zzd((zzcw) ((zzfb) zzd2).zza(), zzd2.getValue());
        }
        for (Map.Entry entry : zzfeVar.zze()) {
            zzcxVar.zzd((zzcw) entry.getKey(), entry.getValue());
        }
        zzcxVar.zzc = this.zzc;
        return zzcxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcx) {
            return this.zza.equals(((zzcx) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        zzfe zzfeVar = this.zza;
        int zzc = zzfeVar.zzc();
        for (int i = 0; i < zzc; i++) {
            Object value = zzfeVar.zzd(i).getValue();
            if (value instanceof zzdg) {
                ((zzdg) value).zzQ();
            }
        }
        Iterator it = zzfeVar.zze().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzdg) {
                ((zzdg) value2).zzQ();
            }
        }
        zzfeVar.zza();
        this.zzb = true;
    }

    public final Iterator zzc() {
        zzfe zzfeVar = this.zza;
        return zzfeVar.isEmpty() ? Collections.emptyIterator() : this.zzc ? new zzds(zzfeVar.entrySet().iterator()) : zzfeVar.entrySet().iterator();
    }

    public final void zzd(zzcw zzcwVar, Object obj) {
        if (!zzcwVar.zzd()) {
            zzk(zzcwVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                zzk(zzcwVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzdt) {
            this.zzc = true;
        }
        this.zza.put(zzcwVar, obj);
    }

    public final boolean zze() {
        zzfe zzfeVar = this.zza;
        int zzc = zzfeVar.zzc();
        for (int i = 0; i < zzc; i++) {
            if (!zzh(zzfeVar.zzd(i))) {
                return false;
            }
        }
        Iterator it = zzfeVar.zze().iterator();
        while (it.hasNext()) {
            if (!zzh((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int zzf() {
        zzfe zzfeVar = this.zza;
        int zzc = zzfeVar.zzc();
        int i = 0;
        for (int i2 = 0; i2 < zzc; i2++) {
            i += zzj(zzfeVar.zzd(i2));
        }
        Iterator it = zzfeVar.zze().iterator();
        while (it.hasNext()) {
            i += zzj((Map.Entry) it.next());
        }
        return i;
    }

    private zzcx(boolean z) {
        zzb();
        zzb();
    }
}
