package com.google.android.libraries.places.api.model;

import android.util.Log;
import androidx.viewpager.widget.ViewPager;
import com.google.android.libraries.places.api.model.Place;
import com.google.common.collect.Cut;
import com.google.common.collect.Maps;
import com.google.common.collect.Range;
import com.google.common.collect.RegularImmutableMap;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes4.dex */
public abstract class zzgu {
    public static final RegularImmutableMap zzb;
    public static final zzes zzc;

    static {
        StatusLine builder = RegularImmutableMap.builder();
        builder.put(java.time.DayOfWeek.SUNDAY, DayOfWeek.SUNDAY);
        builder.put(java.time.DayOfWeek.MONDAY, DayOfWeek.MONDAY);
        builder.put(java.time.DayOfWeek.TUESDAY, DayOfWeek.TUESDAY);
        builder.put(java.time.DayOfWeek.WEDNESDAY, DayOfWeek.WEDNESDAY);
        builder.put(java.time.DayOfWeek.THURSDAY, DayOfWeek.THURSDAY);
        builder.put(java.time.DayOfWeek.FRIDAY, DayOfWeek.FRIDAY);
        builder.put(java.time.DayOfWeek.SATURDAY, DayOfWeek.SATURDAY);
        zzb = builder.build(true);
        zzc = zzes.newInstance(23, 59);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b7, code lost:
    
        if (com.google.common.collect.Range.closed(java.lang.Long.valueOf(java.time.OffsetDateTime.of(java.time.LocalDate.of(r5.zza, r5.zzb, r5.zzc), java.time.LocalTime.of(0, 0), r1).toInstant().toEpochMilli()), java.lang.Long.valueOf(java.time.OffsetDateTime.of(java.time.LocalDate.of(r4.zza, r4.zzb, r4.zzc), java.time.LocalTime.of(23, 59), r1).toInstant().toEpochMilli())).contains(java.lang.Long.valueOf(r12)) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Boolean zza(Place place, long j) {
        ZoneOffset zoneOffset;
        Place.BusinessStatus businessStatus = ((zzfi) place).zzf;
        zzfi zzfiVar = (zzfi) place;
        Integer num = zzfiVar.zzT;
        if (businessStatus != null && businessStatus != Place.BusinessStatus.OPERATIONAL) {
            return Boolean.FALSE;
        }
        if (num != null) {
            try {
                zoneOffset = ZoneOffset.ofTotalSeconds(num.intValue() * 60);
            } catch (DateTimeException unused) {
                Log.w("Places OpeningHoursUtil", String.format("Cannot find timezone that associates with utcOffsetMinutes %d from Place object.", num));
                zoneOffset = null;
            }
            if (zoneOffset != null) {
                zzey zzeyVar = zzfiVar.zzi;
                if (zzeyVar != null) {
                    ArrayList arrayList = new ArrayList(zzeyVar.zzb);
                    if (!arrayList.isEmpty()) {
                        try {
                            Collections.sort(arrayList, ViewPager.AnonymousClass1.zza$1);
                            zzgk zzgkVar = ((zzfe) arrayList.get(0)).zza;
                            zzgkVar.getClass();
                            zzeq zzeqVar = zzgkVar.zza;
                            zzgk zzgkVar2 = ((zzfe) Maps.getLast(arrayList)).zzb;
                            zzgkVar2.getClass();
                            zzeq zzeqVar2 = zzgkVar2.zza;
                            if (zzeqVar != null && zzeqVar2 != null) {
                            }
                        } catch (NullPointerException unused2) {
                        }
                    }
                }
                zzeyVar = zzfiVar.zzu;
                if (zzeyVar != null) {
                    List<zzfe> list = zzeyVar.zzb;
                    if (list.isEmpty()) {
                        return Boolean.FALSE;
                    }
                    if (list.size() == 1) {
                        zzfe zzfeVar = (zzfe) list.get(0);
                        zzgk zzgkVar3 = zzfeVar.zza;
                        if (zzfeVar.zzb == null && zzgkVar3 != null && zzgkVar3.zzb == DayOfWeek.SUNDAY) {
                            zzes zzesVar = zzgkVar3.zzc;
                            if (zzesVar.zza == 0 && zzesVar.zzb == 0) {
                                return Boolean.TRUE;
                            }
                        }
                    }
                    for (zzfe zzfeVar2 : list) {
                        if (zzfeVar2.zza != null && zzfeVar2.zzb != null) {
                        }
                    }
                    OffsetDateTime atOffset = Instant.ofEpochMilli(j).atOffset(zoneOffset);
                    DayOfWeek dayOfWeek = (DayOfWeek) zzb.get(atOffset.getDayOfWeek());
                    zzes newInstance = zzes.newInstance(atOffset.getHour(), atOffset.getMinute());
                    EnumMap enumMap = new EnumMap(DayOfWeek.class);
                    if (!list.isEmpty()) {
                        zzfe zzfeVar3 = (zzfe) list.get(0);
                        int i = 0;
                        while (zzfeVar3 != null) {
                            zzgk zzgkVar4 = zzfeVar3.zzb;
                            zzgk zzgkVar5 = zzfeVar3.zza;
                            if (zzgkVar5 == null || zzgkVar4 == null) {
                                i++;
                                zzfeVar3 = i >= list.size() ? null : (zzfe) list.get(i);
                            } else {
                                DayOfWeek dayOfWeek2 = zzgkVar5.zzb;
                                zzes zzesVar2 = zzgkVar5.zzc;
                                if (dayOfWeek2 != zzgkVar4.zzb) {
                                    List list2 = (List) enumMap.getOrDefault(dayOfWeek2, new ArrayList());
                                    list2.add(Range.closed(zzesVar2, zzc));
                                    enumMap.put((EnumMap) dayOfWeek2, (DayOfWeek) list2);
                                    zzfeVar3 = new zzfe(zzgk.builder(DayOfWeek.values()[(dayOfWeek2.ordinal() + 1) % 7], zzes.newInstance(0, 0)).build(), zzgkVar4);
                                } else {
                                    i++;
                                    zzes zzesVar3 = zzgkVar4.zzc;
                                    List list3 = (List) enumMap.getOrDefault(dayOfWeek2, new ArrayList());
                                    Range range = Range.ALL;
                                    zzesVar2.getClass();
                                    Cut.AboveAll aboveAll = new Cut.AboveAll(zzesVar2, 2);
                                    zzesVar3.getClass();
                                    list3.add(new Range(aboveAll, new Cut.AboveAll(zzesVar3, 2)));
                                    enumMap.put((EnumMap) dayOfWeek2, (DayOfWeek) list3);
                                    if (i < list.size()) {
                                        zzfeVar3 = (zzfe) list.get(i);
                                    }
                                }
                            }
                        }
                    }
                    List list4 = (List) enumMap.get(dayOfWeek);
                    if (list4 == null) {
                        return Boolean.FALSE;
                    }
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        if (((Range) it.next()).contains(newInstance)) {
                            return Boolean.TRUE;
                        }
                    }
                    return Boolean.FALSE;
                }
            }
        }
        return null;
    }
}
