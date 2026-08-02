package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzjl {
    public static final zzjl zza = new zzjl(100);
    public final EnumMap zzb;
    public final int zzc;

    public zzjl(int i) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        this.zzb = enumMap;
        zzjk zzjkVar = zzjk.AD_STORAGE;
        zzji zzjiVar = zzji.UNINITIALIZED;
        enumMap.put((EnumMap) zzjkVar, (zzjk) zzjiVar);
        enumMap.put((EnumMap) zzjk.ANALYTICS_STORAGE, (zzjk) zzjiVar);
        this.zzc = i;
    }

    public static String zzd(int i) {
        return i != -30 ? i != -20 ? i != -10 ? i != 0 ? i != 30 ? i != 90 ? i != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static zzjl zze(int i, Bundle bundle) {
        if (bundle == null) {
            return new zzjl(i);
        }
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.STORAGE.zzc) {
            enumMap.put((EnumMap) zzjkVar, (zzjk) zzg(bundle.getString(zzjkVar.zze)));
        }
        return new zzjl(enumMap, i);
    }

    public static zzjl zzf(int i, String str) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        zzjk[] zzjkVarArr = zzjj.STORAGE.zzc;
        for (int i2 = 0; i2 < zzjkVarArr.length; i2++) {
            String str2 = str == null ? "" : str;
            zzjk zzjkVar = zzjkVarArr[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put((EnumMap) zzjkVar, (zzjk) zzj(str2.charAt(i3)));
            } else {
                enumMap.put((EnumMap) zzjkVar, (zzjk) zzji.UNINITIALIZED);
            }
        }
        return new zzjl(enumMap, i);
    }

    public static zzji zzg(String str) {
        zzji zzjiVar = zzji.UNINITIALIZED;
        return str == null ? zzjiVar : str.equals("granted") ? zzji.GRANTED : str.equals("denied") ? zzji.DENIED : zzjiVar;
    }

    public static zzji zzj(char c) {
        return c != '+' ? c != '0' ? c != '1' ? zzji.UNINITIALIZED : zzji.GRANTED : zzji.DENIED : zzji.POLICY;
    }

    public static char zzm(zzji zzjiVar) {
        if (zzjiVar == null) {
            return '-';
        }
        int ordinal = zzjiVar.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal != 2) {
            return ordinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean zzu(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i3 = i;
        } else if (i2 == -20) {
            return true;
        }
        return i3 == i2 || i < i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzjl) {
            zzjl zzjlVar = (zzjl) obj;
            zzjk[] zzjkVarArr = zzjj.STORAGE.zzc;
            int length = zzjkVarArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    zzjk zzjkVar = zzjkVarArr[i];
                    if (this.zzb.get(zzjkVar) != zzjlVar.zzb.get(zzjkVar)) {
                        break;
                    }
                    i++;
                } else if (this.zzc == zzjlVar.zzc) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.zzb.values().iterator();
        int i = this.zzc * 17;
        while (it.hasNext()) {
            i = (i * 31) + ((zzji) it.next()).hashCode();
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zzd(this.zzc));
        for (zzjk zzjkVar : zzjj.STORAGE.zzc) {
            sb.append(",");
            sb.append(zzjkVar.zze);
            sb.append("=");
            zzji zzjiVar = (zzji) this.zzb.get(zzjkVar);
            if (zzjiVar == null) {
                zzjiVar = zzji.UNINITIALIZED;
            }
            sb.append(zzjiVar);
        }
        return sb.toString();
    }

    public final String zzk() {
        int ordinal;
        StringBuilder sb = new StringBuilder("G1");
        for (zzjk zzjkVar : zzjj.STORAGE.zzc) {
            zzji zzjiVar = (zzji) this.zzb.get(zzjkVar);
            char c = '-';
            if (zzjiVar != null && (ordinal = zzjiVar.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c = '0';
                    } else if (ordinal != 3) {
                    }
                }
                c = '1';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public final String zzl() {
        StringBuilder sb = new StringBuilder("G1");
        for (zzjk zzjkVar : zzjj.STORAGE.zzc) {
            sb.append(zzm((zzji) this.zzb.get(zzjkVar)));
        }
        return sb.toString();
    }

    public final boolean zzo(zzjk zzjkVar) {
        return ((zzji) this.zzb.get(zzjkVar)) != zzji.DENIED;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzjl zzs(zzjl zzjlVar) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.STORAGE.zzc) {
            zzji zzjiVar = (zzji) this.zzb.get(zzjkVar);
            zzji zzjiVar2 = (zzji) zzjlVar.zzb.get(zzjkVar);
            if (zzjiVar != null) {
                if (zzjiVar2 != null) {
                    zzji zzjiVar3 = zzji.UNINITIALIZED;
                    if (zzjiVar != zzjiVar3) {
                        if (zzjiVar2 != zzjiVar3) {
                            zzji zzjiVar4 = zzji.POLICY;
                            if (zzjiVar != zzjiVar4) {
                                if (zzjiVar2 != zzjiVar4) {
                                    zzji zzjiVar5 = zzji.DENIED;
                                    zzjiVar = (zzjiVar == zzjiVar5 || zzjiVar2 == zzjiVar5) ? zzjiVar5 : zzji.GRANTED;
                                }
                            }
                        }
                    }
                }
                if (zzjiVar == null) {
                    enumMap.put((EnumMap) zzjkVar, (zzjk) zzjiVar);
                }
            }
            zzjiVar = zzjiVar2;
            if (zzjiVar == null) {
            }
        }
        return new zzjl(enumMap, 100);
    }

    public final zzjl zzt(zzjl zzjlVar) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.STORAGE.zzc) {
            zzji zzjiVar = (zzji) this.zzb.get(zzjkVar);
            if (zzjiVar == zzji.UNINITIALIZED) {
                zzjiVar = (zzji) zzjlVar.zzb.get(zzjkVar);
            }
            if (zzjiVar != null) {
                enumMap.put((EnumMap) zzjkVar, (zzjk) zzjiVar);
            }
        }
        return new zzjl(enumMap, this.zzc);
    }

    public zzjl(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(zzjk.class);
        this.zzb = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzc = i;
    }
}
