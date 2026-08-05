package com.google.android.gms.internal.wearable;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzez {
    public static final /* synthetic */ int zza = 0;
    private static final zzfi zzb;

    static {
        int i = zzbv.zza;
        zzb = new zzfk();
    }

    public static zzfi zzA() {
        return zzb;
    }

    static boolean zzB(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static void zzC(zzct zzctVar, Object obj, Object obj2) {
        if (((zzdd) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzD(zzfi zzfiVar, Object obj, Object obj2) {
        zzdg zzdgVar = (zzdg) obj;
        zzfj zzfjVar = zzdgVar.zzc;
        zzfj zzfjVar2 = ((zzdg) obj2).zzc;
        if (!zzfj.zza().equals(zzfjVar2)) {
            if (zzfj.zza().equals(zzfjVar)) {
                zzfjVar = zzfj.zzc(zzfjVar, zzfjVar2);
            } else {
                zzfjVar.zzl(zzfjVar2);
            }
        }
        zzdgVar.zzc = zzfjVar;
    }

    static Object zzE(Object obj, int i, List list, zzdl zzdlVar, Object obj2, zzfi zzfiVar) {
        if (zzdlVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (zzdlVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj2 = zzF(obj, i, intValue, obj2, zzfiVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzdlVar.zza(intValue2)) {
                    obj2 = zzF(obj, i, intValue2, obj2, zzfiVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    static Object zzF(Object obj, int i, int i2, Object obj2, zzfi zzfiVar) {
        if (obj2 == null) {
            obj2 = zzfiVar.zzh(obj);
        }
        zzfiVar.zza(obj2, i, i2);
        return obj2;
    }

    public static void zza(int i, List list, zzfx zzfxVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzC(i, list, z);
    }

    public static void zzb(int i, List list, zzfx zzfxVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzB(i, list, z);
    }

    public static void zzc(int i, List list, zzfx zzfxVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzy(i, list, z);
    }

    public static void zzd(int i, List list, zzfx zzfxVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzz(i, list, z);
    }

    public static void zze(int i, List list, zzfx zzfxVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzL(i, list, z);
    }

    public static void zzf(int i, List list, zzfx zzfxVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzA(i, list, z);
    }

    public static void zzg(int i, List list, zzfx zzfxVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzJ(i, list, z);
    }

    public static void zzh(int i, List list, zzfx zzfxVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzw(i, list, z);
    }

    public static void zzi(int i, List list, zzfx zzfxVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzH(i, list, z);
    }

    public static void zzj(int i, List list, zzfx zzfxVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzK(i, list, z);
    }

    public static void zzk(int i, List list, zzfx zzfxVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzx(i, list, z);
    }

    public static void zzl(int i, List list, zzfx zzfxVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzI(i, list, z);
    }

    public static void zzm(int i, List list, zzfx zzfxVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzD(i, list, z);
    }

    public static void zzn(int i, List list, zzfx zzfxVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzE(i, list, z);
    }

    static int zzo(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzea) {
            zzea zzeaVar = (zzea) list;
            i = 0;
            while (i2 < size) {
                i += zzcn.zzv(zzeaVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzcn.zzv(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzp(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzea) {
            zzea zzeaVar = (zzea) list;
            i = 0;
            while (i2 < size) {
                i += zzcn.zzv(zzeaVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzcn.zzv(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzq(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzea) {
            zzea zzeaVar = (zzea) list;
            i = 0;
            while (i2 < size) {
                long zze = zzeaVar.zze(i2);
                i += zzcn.zzv((zze >> 63) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += zzcn.zzv((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    static int zzr(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdh) {
            zzdh zzdhVar = (zzdh) list;
            i = 0;
            while (i2 < size) {
                i += zzcn.zzv(zzdhVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzcn.zzv(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzs(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdh) {
            zzdh zzdhVar = (zzdh) list;
            i = 0;
            while (i2 < size) {
                i += zzcn.zzv(zzdhVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzcn.zzv(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzt(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdh) {
            zzdh zzdhVar = (zzdh) list;
            i = 0;
            while (i2 < size) {
                i += zzcn.zzu(zzdhVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzcn.zzu(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzu(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdh) {
            zzdh zzdhVar = (zzdh) list;
            i = 0;
            while (i2 < size) {
                int zze = zzdhVar.zze(i2);
                i += zzcn.zzu((zze >> 31) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += zzcn.zzu((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    static int zzv(List list) {
        return list.size() * 4;
    }

    static int zzw(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzcn.zzu(i << 3) + 4);
    }

    static int zzx(List list) {
        return list.size() * 8;
    }

    static int zzy(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzcn.zzu(i << 3) + 8);
    }

    @Deprecated
    static int zzz(int i, zzel zzelVar, zzey zzeyVar) {
        int zzu = zzcn.zzu(i << 3);
        return zzu + zzu + ((zzbr) zzelVar).zzJ(zzeyVar);
    }
}
