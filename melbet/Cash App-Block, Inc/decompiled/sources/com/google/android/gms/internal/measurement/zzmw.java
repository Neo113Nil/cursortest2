package com.google.android.gms.internal.measurement;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.collect.AbstractIndexedListIterator;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Maps;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.collect.RegularImmutableSortedSet;
import com.google.common.collect.UnmodifiableIterator;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.HashMap;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes4.dex */
public final class zzmw {
    public static final zzmw zza;
    public final ImmutableSortedSet zzb;

    static {
        int i = ImmutableSortedSet.$r8$clinit;
        zza = new zzmw(RegularImmutableSortedSet.NATURAL_EMPTY_SET);
    }

    public zzmw(ImmutableSortedSet immutableSortedSet) {
        this.zzb = immutableSortedSet;
    }

    public static zzmw zza(zzmw zzmwVar, RegularImmutableMap regularImmutableMap) {
        long j;
        if (regularImmutableMap.isEmpty()) {
            return zzmwVar;
        }
        HashMap hashMap = new HashMap(regularImmutableMap);
        ImmutableSortedSet immutableSortedSet = zzmwVar.zzb;
        ImmutableSortedSet.Builder builder = new ImmutableSortedSet.Builder();
        UnmodifiableIterator it = immutableSortedSet.iterator();
        while (true) {
            AbstractIndexedListIterator abstractIndexedListIterator = (AbstractIndexedListIterator) it;
            if (!abstractIndexedListIterator.hasNext()) {
                for (String str : hashMap.keySet()) {
                    Object obj = hashMap.get(str);
                    int length = str.length();
                    if (length <= 19 && length != 0) {
                        boolean z = false;
                        long charAt = str.charAt(0) - '0';
                        if (charAt >= 1 && charAt <= 9) {
                            int i = 1;
                            while (true) {
                                if (i < length) {
                                    int charAt2 = str.charAt(i) - '0';
                                    if ((charAt2 > 9) || (charAt2 < 0 ? true : z)) {
                                        break;
                                    }
                                    charAt = (charAt * 10) + charAt2;
                                    i++;
                                    z = false;
                                } else if (charAt >= 0 && charAt <= 2305843009213693951L) {
                                    j = charAt;
                                }
                            }
                        }
                    }
                    j = 0;
                    String str2 = j == 0 ? str : null;
                    if (obj instanceof String) {
                        builder.m2032add(new zzmv(j, str2, 4, 0L, obj));
                    } else if (obj instanceof byte[]) {
                        builder.m2032add(new zzmv(j, str2, 5, 0L, obj));
                    } else if (obj instanceof Boolean) {
                        builder.m2032add(new zzmv(j, str2, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                    } else if (obj instanceof Long) {
                        builder.m2032add(new zzmv(j, str2, 2, ((Long) obj).longValue(), null));
                    } else {
                        if (!(obj instanceof Double)) {
                            String valueOf = String.valueOf(obj);
                            a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(str.length() + 28 + valueOf.length()), "Cannot serialize override ", str, ": ", valueOf));
                            return null;
                        }
                        builder.m2032add(new zzmv(j, str2, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                    }
                }
                return new zzmw(builder.build());
            }
            zzmv zzmvVar = (zzmv) abstractIndexedListIterator.next();
            Object obj2 = zzmvVar.zzb;
            long j2 = zzmvVar.zza;
            if (obj2 == null) {
                obj2 = Long.toString(j2);
            }
            Object remove = hashMap.remove(obj2);
            if (remove == null) {
                builder.m2032add((Object) zzmvVar);
            } else if (remove instanceof String) {
                builder.m2032add(new zzmv(zzmvVar.zza, zzmvVar.zzb, 4, 0L, remove));
            } else if (remove instanceof byte[]) {
                builder.m2032add(new zzmv(zzmvVar.zza, zzmvVar.zzb, 5, 0L, remove));
            } else if (remove instanceof Boolean) {
                builder.m2032add(new zzmv(zzmvVar.zza, zzmvVar.zzb, ((Boolean) remove).booleanValue() ? 1 : 0, 0L, null));
            } else if (remove instanceof Long) {
                builder.m2032add(new zzmv(zzmvVar.zza, zzmvVar.zzb, 2, ((Long) remove).longValue(), null));
            } else {
                if (!(remove instanceof Double)) {
                    String str3 = zzmvVar.zzb;
                    if (str3 == null) {
                        str3 = Long.toString(j2);
                    }
                    String obj3 = remove.toString();
                    throw new IllegalStateException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(String.valueOf(str3).length() + 46 + obj3.length()), "Cannot serialize override for existing flag ", str3, ": ", obj3));
                }
                builder.m2032add(new zzmv(zzmvVar.zza, zzmvVar.zzb, 3, Double.doubleToRawLongBits(((Double) remove).doubleValue()), null));
            }
        }
    }

    public static zzmw zzb() {
        return zza;
    }

    public static zzmw zzd(zzacv zzacvVar) {
        String str;
        long j;
        zzmv zzmvVar;
        int zzx = zzacvVar.zzx();
        if (zzx < 0) {
            a$$ExternalSyntheticBUOutline0.m$5("Negative number of flags");
            return null;
        }
        int i = ImmutableSortedSet.$r8$clinit;
        ImmutableSortedSet.Builder builder = new ImmutableSortedSet.Builder();
        long j2 = 0;
        for (int i2 = 0; i2 < zzx; i2++) {
            long zzz = zzacvVar.zzz();
            int i3 = (int) zzz;
            long j3 = zzz >>> 3;
            if (j3 == 0) {
                j = 0;
                str = zzacvVar.zzl();
            } else {
                long j4 = j3 + j2;
                if (j4 > 2305843009213693951L) {
                    a$$ExternalSyntheticBUOutline0.m$5("Flag name larger than max size");
                    return null;
                }
                str = null;
                j = j4;
            }
            int i4 = i3 & 7;
            if (i4 == 0 || i4 == 1) {
                zzmvVar = new zzmv(j, str, i4, 0L, null);
            } else if (i4 == 2) {
                zzmvVar = new zzmv(j, str, i4, zzacvVar.zzz(), null);
            } else if (i4 == 3) {
                zzmvVar = new zzmv(j, str, i4, Double.doubleToRawLongBits(zzacvVar.zzd()), null);
            } else if (i4 == 4) {
                zzmvVar = new zzmv(j, str, i4, 0L, zzacvVar.zzl());
            } else {
                if (i4 != 5) {
                    a$$ExternalSyntheticBUOutline0.m$5(Boxes$$ExternalSyntheticOutline1.m(i4, "Unrecognized flag type ", new StringBuilder(String.valueOf(i4).length() + 23)));
                    return null;
                }
                zzmvVar = new zzmv(j, str, i4, 0L, zzacvVar.zzo());
            }
            long j5 = zzmvVar.zza;
            if (j5 != 0) {
                j2 = j5;
            }
            builder.m2032add((Object) zzmvVar);
        }
        return new zzmw(builder.build());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzmw)) {
            return false;
        }
        return this.zzb.equals(((zzmw) obj).zzb);
    }

    public final int hashCode() {
        ImmutableSortedSet immutableSortedSet = this.zzb;
        immutableSortedSet.getClass();
        return Maps.hashCodeImpl(immutableSortedSet);
    }

    public final void zzc(StatusLine statusLine) {
        UnmodifiableIterator it = this.zzb.iterator();
        while (true) {
            AbstractIndexedListIterator abstractIndexedListIterator = (AbstractIndexedListIterator) it;
            if (!abstractIndexedListIterator.hasNext()) {
                return;
            }
            zzmv zzmvVar = (zzmv) abstractIndexedListIterator.next();
            String str = zzmvVar.zzb;
            if (str == null) {
                str = Long.toString(zzmvVar.zza);
            }
            statusLine.put(str, zzmvVar.zzb());
        }
    }

    public final ImmutableSortedSet zze() {
        return this.zzb;
    }

    public final int zzf() {
        return this.zzb.size();
    }
}
