package com.google.android.gms.internal.measurement;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.featuretoggle.UnleashContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzae implements Iterable, zzao, zzak {
    public final TreeMap zza;
    public final TreeMap zzb;

    public zzae(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                zzn(i, (zzao) list.get(i));
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzae)) {
            return false;
        }
        zzae zzaeVar = (zzae) obj;
        if (zzh() != zzaeVar.zzh()) {
            return false;
        }
        TreeMap treeMap = this.zza;
        if (treeMap.isEmpty()) {
            return zzaeVar.zza.isEmpty();
        }
        for (int intValue = ((Integer) treeMap.firstKey()).intValue(); intValue <= ((Integer) treeMap.lastKey()).intValue(); intValue++) {
            if (!zzl(intValue).equals(zzaeVar.zzl(intValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzad(this);
    }

    public final String toString() {
        return zzs(",");
    }

    public final List zzb() {
        ArrayList arrayList = new ArrayList(zzh());
        for (int i = 0; i < zzh(); i++) {
            arrayList.add(zzl(i));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return zzs(",");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02e3, code lost:
    
        if (com.google.android.gms.internal.measurement.zzh.zzc(r7, r2, (com.google.android.gms.internal.measurement.zzan) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).zzh() == r7.zzh()) goto L169;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f9  */
    @Override // com.google.android.gms.internal.measurement.zzao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzao zzcG(String str, UnleashContext unleashContext, ArrayList arrayList) {
        String str2;
        String str3;
        Object obj;
        String str4;
        UnleashContext unleashContext2;
        String str5;
        Object obj2;
        zzae zzaeVar;
        ArrayList arrayList2;
        int hashCode;
        TreeMap treeMap;
        double d;
        String str6;
        zzai zzaiVar;
        String str7 = "toString";
        String str8 = "splice";
        if (!"concat".equals(str) && !"every".equals(str) && !"filter".equals(str) && !"forEach".equals(str) && !"indexOf".equals(str) && !"join".equals(str) && !"lastIndexOf".equals(str) && !"map".equals(str) && !"pop".equals(str) && !"push".equals(str) && !"reduce".equals(str) && !"reduceRight".equals(str) && !"reverse".equals(str) && !"shift".equals(str) && !"slice".equals(str) && !"some".equals(str)) {
            str3 = "filter";
            str4 = "sort";
            if (str4.equals(str)) {
                str2 = "lastIndexOf";
                obj2 = "reduce";
            } else {
                obj2 = "reduce";
                if (str8.equals(str)) {
                    str2 = "lastIndexOf";
                    str8 = str8;
                } else {
                    str8 = str8;
                    if (str7.equals(str)) {
                        str2 = "lastIndexOf";
                        str7 = str7;
                    } else {
                        str7 = str7;
                        if (!"unshift".equals(str)) {
                            return zzak.zzu(this, new zzas(str), unleashContext, arrayList);
                        }
                        str2 = "lastIndexOf";
                        str5 = "forEach";
                        obj = "unshift";
                        zzaeVar = this;
                        unleashContext2 = unleashContext;
                    }
                }
            }
            obj = "unshift";
            unleashContext2 = unleashContext;
            arrayList2 = arrayList;
            str5 = "forEach";
            zzaeVar = this;
            Double valueOf = Double.valueOf(-1.0d);
            hashCode = str.hashCode();
            TreeMap treeMap2 = zzaeVar.zza;
            zzao zzaoVar = zzao.zzf;
            TreeMap treeMap3 = treeMap2;
            double d2 = 0.0d;
            switch (hashCode) {
                case -1776922004:
                    String str9 = str7;
                    if (str.equals(str9)) {
                        zzh.zza(str9, arrayList2, 0);
                        return new zzas(zzaeVar.zzs(","));
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                    return null;
                case -1354795244:
                    if (str.equals("concat")) {
                        zzae zzaeVar2 = (zzae) zzaeVar.zzt();
                        if (!arrayList2.isEmpty()) {
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                zzao zzb = ((zzz) unleashContext2.sessionId).zzb(unleashContext2, (zzao) it.next());
                                if (zzb instanceof zzag) {
                                    a$$ExternalSyntheticBUOutline0.m$1("Failed evaluation of arguments");
                                    return null;
                                }
                                int zzh = zzaeVar2.zzh();
                                if (zzb instanceof zzae) {
                                    zzae zzaeVar3 = (zzae) zzb;
                                    Iterator zzg = zzaeVar3.zzg();
                                    while (zzg.hasNext()) {
                                        Integer num = (Integer) zzg.next();
                                        zzaeVar2.zzn(num.intValue() + zzh, zzaeVar3.zzl(num.intValue()));
                                    }
                                } else {
                                    zzaeVar2.zzn(zzh, zzb);
                                }
                            }
                        }
                        return zzaeVar2;
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                    return null;
                case -1274492040:
                    String str10 = str3;
                    if (str.equals(str10)) {
                        zzh.zza(str10, arrayList2, 1);
                        zzao zzb2 = ((zzz) unleashContext2.sessionId).zzb(unleashContext2, (zzao) arrayList2.get(0));
                        if (!(zzb2 instanceof zzan)) {
                            a$$ExternalSyntheticBUOutline0.m$3("Callback should be a method");
                            return null;
                        }
                        if (treeMap3.size() == 0) {
                            return new zzae();
                        }
                        zzae zzaeVar4 = (zzae) zzaeVar.zzt();
                        zzae zzc = zzh.zzc(zzaeVar, unleashContext2, (zzan) zzb2, null, Boolean.TRUE);
                        zzae zzaeVar5 = new zzae();
                        Iterator zzg2 = zzc.zzg();
                        while (zzg2.hasNext()) {
                            zzaeVar5.zzn(zzaeVar5.zzh(), zzaeVar4.zzl(((Integer) zzg2.next()).intValue()));
                        }
                        return zzaeVar5;
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                    return null;
                case -934873754:
                    if (str.equals(obj2)) {
                        return zzh.zzb(zzaeVar, unleashContext2, arrayList2, true);
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                    return null;
                case -895859076:
                    if (str.equals(str8)) {
                        if (arrayList2.isEmpty()) {
                            return new zzae();
                        }
                        zzao zzaoVar2 = (zzao) arrayList2.get(0);
                        zzz zzzVar = (zzz) unleashContext2.sessionId;
                        zzz zzzVar2 = (zzz) unleashContext2.sessionId;
                        int zzi = (int) zzh.zzi(zzzVar.zzb(unleashContext2, zzaoVar2).zzd().doubleValue());
                        if (zzi < 0) {
                            zzi = Math.max(0, zzaeVar.zzh() + zzi);
                        } else if (zzi > zzaeVar.zzh()) {
                            zzi = zzaeVar.zzh();
                        }
                        int zzh2 = zzaeVar.zzh();
                        zzae zzaeVar6 = new zzae();
                        if (arrayList2.size() > 1) {
                            int max = Math.max(0, (int) zzh.zzi(zzzVar2.zzb(unleashContext2, (zzao) arrayList2.get(1)).zzd().doubleValue()));
                            if (max > 0) {
                                for (int i = zzi; i < Math.min(zzh2, zzi + max); i++) {
                                    zzaeVar6.zzn(zzaeVar6.zzh(), zzaeVar.zzl(zzi));
                                    zzaeVar.zzr(zzi);
                                }
                            }
                            int i2 = 2;
                            if (arrayList2.size() > 2) {
                                while (i2 < arrayList2.size()) {
                                    zzao zzb3 = zzzVar2.zzb(unleashContext2, (zzao) arrayList2.get(i2));
                                    if (zzb3 instanceof zzag) {
                                        a$$ExternalSyntheticBUOutline0.m$3("Failed to parse elements to add");
                                        return null;
                                    }
                                    int i3 = (zzi + i2) - 2;
                                    if (i3 < 0) {
                                        a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(i3, "Invalid value index: ", new StringBuilder(String.valueOf(i3).length() + 21)));
                                        return null;
                                    }
                                    if (i3 >= zzaeVar.zzh()) {
                                        zzaeVar.zzn(i3, zzb3);
                                        treeMap = treeMap3;
                                    } else {
                                        int intValue = ((Integer) treeMap3.lastKey()).intValue();
                                        while (intValue >= i3) {
                                            Integer valueOf2 = Integer.valueOf(intValue);
                                            TreeMap treeMap4 = treeMap3;
                                            zzao zzaoVar3 = (zzao) treeMap4.get(valueOf2);
                                            if (zzaoVar3 != null) {
                                                zzaeVar.zzn(intValue + 1, zzaoVar3);
                                                treeMap4.remove(valueOf2);
                                            }
                                            intValue--;
                                            treeMap3 = treeMap4;
                                        }
                                        treeMap = treeMap3;
                                        zzaeVar.zzn(i3, zzb3);
                                    }
                                    i2++;
                                    treeMap3 = treeMap;
                                }
                            }
                        } else {
                            while (zzi < zzh2) {
                                zzaeVar6.zzn(zzaeVar6.zzh(), zzaeVar.zzl(zzi));
                                zzaeVar.zzn(zzi, null);
                                zzi++;
                            }
                        }
                        return zzaeVar6;
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                    return null;
                case -678635926:
                    String str11 = str5;
                    if (str.equals(str11)) {
                        zzh.zza(str11, arrayList2, 1);
                        zzao zzb4 = ((zzz) unleashContext2.sessionId).zzb(unleashContext2, (zzao) arrayList2.get(0));
                        if (!(zzb4 instanceof zzan)) {
                            a$$ExternalSyntheticBUOutline0.m$3("Callback should be a method");
                            return null;
                        }
                        if (treeMap3.size() != 0) {
                            zzh.zzc(zzaeVar, unleashContext2, (zzan) zzb4, null, null);
                            return zzaoVar;
                        }
                        return zzaoVar;
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                    return null;
                case -467511597:
                    String str12 = str2;
                    if (str.equals(str12)) {
                        zzh.zzc(2, str12, arrayList2);
                        if (!arrayList2.isEmpty()) {
                            zzaoVar = ((zzz) unleashContext2.sessionId).zzb(unleashContext2, (zzao) arrayList2.get(0));
                        }
                        zzao zzaoVar4 = zzaoVar;
                        int zzh3 = zzaeVar.zzh() - 1;
                        if (arrayList2.size() > 1) {
                            zzao zzb5 = ((zzz) unleashContext2.sessionId).zzb(unleashContext2, (zzao) arrayList2.get(1));
                            d = Double.isNaN(zzb5.zzd().doubleValue()) ? zzaeVar.zzh() - 1 : zzh.zzi(zzb5.zzd().doubleValue());
                            if (d < 0.0d) {
                                d += zzaeVar.zzh();
                            }
                        } else {
                            d = zzh3;
                        }
                        if (d < 0.0d) {
                            return new zzah(valueOf);
                        }
                        for (int min = (int) Math.min(zzaeVar.zzh(), d); min >= 0; min--) {
                            if (zzaeVar.zzo(min) && zzh.zzf(zzaeVar.zzl(min), zzaoVar4)) {
                                return new zzah(Double.valueOf(min));
                            }
                        }
                        return new zzah(valueOf);
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                    return null;
                case -277637751:
                    if (str.equals(obj)) {
                        if (!arrayList2.isEmpty()) {
                            zzae zzaeVar7 = new zzae();
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                zzao zzb6 = ((zzz) unleashContext2.sessionId).zzb(unleashContext2, (zzao) it2.next());
                                if (zzb6 instanceof zzag) {
                                    a$$ExternalSyntheticBUOutline0.m$1("Argument evaluation failed");
                                    return null;
                                }
                                zzaeVar7.zzn(zzaeVar7.zzh(), zzb6);
                            }
                            int zzh4 = zzaeVar7.zzh();
                            Iterator zzg3 = zzaeVar.zzg();
                            while (zzg3.hasNext()) {
                                Integer num2 = (Integer) zzg3.next();
                                zzaeVar7.zzn(num2.intValue() + zzh4, zzaeVar.zzl(num2.intValue()));
                            }
                            treeMap3.clear();
                            Iterator zzg4 = zzaeVar7.zzg();
                            while (zzg4.hasNext()) {
                                Integer num3 = (Integer) zzg4.next();
                                zzaeVar.zzn(num3.intValue(), zzaeVar7.zzl(num3.intValue()));
                            }
                        }
                        return new zzah(Double.valueOf(zzaeVar.zzh()));
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                    return null;
                case 107868:
                    if (str.equals("map")) {
                        zzh.zza("map", arrayList2, 1);
                        zzao zzb7 = ((zzz) unleashContext2.sessionId).zzb(unleashContext2, (zzao) arrayList2.get(0));
                        if (zzb7 instanceof zzan) {
                            return zzaeVar.zzh() == 0 ? new zzae() : zzh.zzc(zzaeVar, unleashContext2, (zzan) zzb7, null, null);
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Callback should be a method");
                        return null;
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                    return null;
                case 111185:
                    if (str.equals("pop")) {
                        zzh.zza("pop", arrayList2, 0);
                        int zzh5 = zzaeVar.zzh();
                        if (zzh5 != 0) {
                            int i4 = zzh5 - 1;
                            zzao zzl = zzaeVar.zzl(i4);
                            zzaeVar.zzr(i4);
                            return zzl;
                        }
                        return zzaoVar;
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                    return null;
                case 3267882:
                    if (str.equals("join")) {
                        zzh.zzc(1, "join", arrayList2);
                        if (zzaeVar.zzh() == 0) {
                            return zzao.zzm;
                        }
                        if (arrayList2.isEmpty()) {
                            str6 = ",";
                        } else {
                            zzao zzb8 = ((zzz) unleashContext2.sessionId).zzb(unleashContext2, (zzao) arrayList2.get(0));
                            str6 = ((zzb8 instanceof zzam) || (zzb8 instanceof zzat)) ? "" : zzb8.zzc();
                        }
                        return new zzas(zzaeVar.zzs(str6));
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                    return null;
                case 3452698:
                    if (str.equals("push")) {
                        if (!arrayList2.isEmpty()) {
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                zzaeVar.zzn(zzaeVar.zzh(), ((zzz) unleashContext2.sessionId).zzb(unleashContext2, (zzao) it3.next()));
                            }
                        }
                        return new zzah(Double.valueOf(zzaeVar.zzh()));
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                    return null;
                case 3536116:
                    if (str.equals("some")) {
                        zzh.zza("some", arrayList2, 1);
                        zzao zzb9 = ((zzz) unleashContext2.sessionId).zzb(unleashContext2, (zzao) arrayList2.get(0));
                        if (!(zzb9 instanceof zzai)) {
                            a$$ExternalSyntheticBUOutline0.m$3("Callback should be a method");
                            return null;
                        }
                        if (zzaeVar.zzh() != 0) {
                            zzai zzaiVar2 = (zzai) zzb9;
                            Iterator zzg5 = zzaeVar.zzg();
                            while (zzg5.hasNext()) {
                                int intValue2 = ((Integer) zzg5.next()).intValue();
                                if (zzaeVar.zzo(intValue2) && zzaiVar2.zza(unleashContext2, Arrays.asList(zzaeVar.zzl(intValue2), new zzah(Double.valueOf(intValue2)), zzaeVar)).zze().booleanValue()) {
                                    return zzao.zzk;
                                }
                            }
                        }
                        return zzao.zzl;
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                    return null;
                case 3536286:
                    if (str.equals(str4)) {
                        zzh.zzc(1, str4, arrayList2);
                        if (zzaeVar.zzh() >= 2) {
                            List zzb10 = zzaeVar.zzb();
                            if (arrayList2.isEmpty()) {
                                zzaiVar = null;
                            } else {
                                zzao zzb11 = ((zzz) unleashContext2.sessionId).zzb(unleashContext2, (zzao) arrayList2.get(0));
                                if (!(zzb11 instanceof zzai)) {
                                    a$$ExternalSyntheticBUOutline0.m$3("Comparator should be a method");
                                    return null;
                                }
                                zzaiVar = (zzai) zzb11;
                            }
                            Collections.sort(zzb10, new zzaz(zzaiVar, unleashContext2));
                            treeMap3.clear();
                            Iterator it4 = ((ArrayList) zzb10).iterator();
                            int i5 = 0;
                            while (it4.hasNext()) {
                                zzaeVar.zzn(i5, (zzao) it4.next());
                                i5++;
                            }
                        }
                        return zzaeVar;
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                    return null;
                case 96891675:
                    if (str.equals("every")) {
                        zzh.zza("every", arrayList2, 1);
                        zzao zzb12 = ((zzz) unleashContext2.sessionId).zzb(unleashContext2, (zzao) arrayList2.get(0));
                        if (!(zzb12 instanceof zzan)) {
                            a$$ExternalSyntheticBUOutline0.m$3("Callback should be a method");
                            return null;
                        }
                        if (zzaeVar.zzh() != 0) {
                            break;
                        }
                        return zzao.zzk;
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                    return null;
                case 109407362:
                    if (str.equals("shift")) {
                        zzh.zza("shift", arrayList2, 0);
                        if (zzaeVar.zzh() != 0) {
                            zzao zzl2 = zzaeVar.zzl(0);
                            zzaeVar.zzr(0);
                            return zzl2;
                        }
                        return zzaoVar;
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                    return null;
                case 109526418:
                    if (str.equals("slice")) {
                        zzh.zzc(2, "slice", arrayList2);
                        if (arrayList2.isEmpty()) {
                            return zzaeVar.zzt();
                        }
                        double zzh6 = zzaeVar.zzh();
                        double zzi2 = zzh.zzi(((zzz) unleashContext2.sessionId).zzb(unleashContext2, (zzao) arrayList2.get(0)).zzd().doubleValue());
                        double max2 = zzi2 < 0.0d ? Math.max(zzi2 + zzh6, 0.0d) : Math.min(zzi2, zzh6);
                        if (arrayList2.size() == 2) {
                            double zzi3 = zzh.zzi(((zzz) unleashContext2.sessionId).zzb(unleashContext2, (zzao) arrayList2.get(1)).zzd().doubleValue());
                            zzh6 = zzi3 < 0.0d ? Math.max(zzh6 + zzi3, 0.0d) : Math.min(zzh6, zzi3);
                        }
                        zzae zzaeVar8 = new zzae();
                        for (int i6 = (int) max2; i6 < zzh6; i6++) {
                            zzaeVar8.zzn(zzaeVar8.zzh(), zzaeVar.zzl(i6));
                        }
                        return zzaeVar8;
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                    return null;
                case 965561430:
                    if (str.equals("reduceRight")) {
                        return zzh.zzb(zzaeVar, unleashContext2, arrayList2, false);
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                    return null;
                case 1099846370:
                    if (str.equals("reverse")) {
                        zzh.zza("reverse", arrayList2, 0);
                        int zzh7 = zzaeVar.zzh();
                        if (zzh7 != 0) {
                            for (int i7 = 0; i7 < zzh7 / 2; i7++) {
                                if (zzaeVar.zzo(i7)) {
                                    zzao zzl3 = zzaeVar.zzl(i7);
                                    zzaeVar.zzn(i7, null);
                                    int i8 = (zzh7 - 1) - i7;
                                    if (zzaeVar.zzo(i8)) {
                                        zzaeVar.zzn(i7, zzaeVar.zzl(i8));
                                    }
                                    zzaeVar.zzn(i8, zzl3);
                                }
                            }
                        }
                        return zzaeVar;
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                    return null;
                case 1943291465:
                    if (str.equals("indexOf")) {
                        zzh.zzc(2, "indexOf", arrayList2);
                        if (!arrayList2.isEmpty()) {
                            zzaoVar = ((zzz) unleashContext2.sessionId).zzb(unleashContext2, (zzao) arrayList2.get(0));
                        }
                        zzao zzaoVar5 = zzaoVar;
                        if (arrayList2.size() > 1) {
                            double zzi4 = zzh.zzi(((zzz) unleashContext2.sessionId).zzb(unleashContext2, (zzao) arrayList2.get(1)).zzd().doubleValue());
                            if (zzi4 >= zzaeVar.zzh()) {
                                return new zzah(valueOf);
                            }
                            d2 = zzi4 < 0.0d ? zzaeVar.zzh() + zzi4 : zzi4;
                        }
                        Iterator zzg6 = zzaeVar.zzg();
                        while (zzg6.hasNext()) {
                            int intValue3 = ((Integer) zzg6.next()).intValue();
                            double d3 = intValue3;
                            if (d3 >= d2 && zzh.zzf(zzaeVar.zzl(intValue3), zzaoVar5)) {
                                return new zzah(Double.valueOf(d3));
                            }
                        }
                        return new zzah(valueOf);
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                    return null;
                default:
                    a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                    return null;
            }
        }
        str2 = "lastIndexOf";
        str3 = "filter";
        obj = "unshift";
        str4 = "sort";
        unleashContext2 = unleashContext;
        str5 = "forEach";
        obj2 = "reduce";
        zzaeVar = this;
        arrayList2 = arrayList;
        Double valueOf3 = Double.valueOf(-1.0d);
        hashCode = str.hashCode();
        TreeMap treeMap22 = zzaeVar.zza;
        zzao zzaoVar6 = zzao.zzf;
        TreeMap treeMap32 = treeMap22;
        double d22 = 0.0d;
        switch (hashCode) {
            case -1776922004:
                break;
            case -1354795244:
                break;
            case -1274492040:
                break;
            case -934873754:
                break;
            case -895859076:
                break;
            case -678635926:
                break;
            case -467511597:
                break;
            case -277637751:
                break;
            case 107868:
                break;
            case 111185:
                break;
            case 3267882:
                break;
            case 3452698:
                break;
            case 3536116:
                break;
            case 3536286:
                break;
            case 96891675:
                break;
            case 109407362:
                break;
            case 109526418:
                break;
            case 965561430:
                break;
            case 1099846370:
                break;
            case 1943291465:
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        TreeMap treeMap = this.zza;
        return treeMap.size() == 1 ? zzl(0).zzd() : treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return new zzac(this, this.zza.keySet().iterator(), this.zzb.keySet().iterator());
    }

    public final Iterator zzg() {
        return this.zza.keySet().iterator();
    }

    public final int zzh() {
        TreeMap treeMap = this.zza;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final boolean zzj(String str) {
        return "length".equals(str) || this.zzb.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final zzao zzk(String str) {
        zzao zzaoVar;
        return "length".equals(str) ? new zzah(Double.valueOf(zzh())) : (!zzj(str) || (zzaoVar = (zzao) this.zzb.get(str)) == null) ? zzao.zzf : zzaoVar;
    }

    public final zzao zzl(int i) {
        zzao zzaoVar;
        if (i < zzh()) {
            return (!zzo(i) || (zzaoVar = (zzao) this.zza.get(Integer.valueOf(i))) == null) ? zzao.zzf : zzaoVar;
        }
        Path$$ExternalSyntheticBUOutline0.m("Attempting to get element outside of current array");
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final void zzm(String str, zzao zzaoVar) {
        TreeMap treeMap = this.zzb;
        if (zzaoVar == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, zzaoVar);
        }
    }

    public final void zzn(int i, zzao zzaoVar) {
        if (i > 32468) {
            a$$ExternalSyntheticBUOutline0.m$1("Array too large");
            return;
        }
        if (i < 0) {
            Path$$ExternalSyntheticBUOutline0.m(Boxes$$ExternalSyntheticOutline1.m(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
            return;
        }
        TreeMap treeMap = this.zza;
        if (zzaoVar == null) {
            treeMap.remove(Integer.valueOf(i));
        } else {
            treeMap.put(Integer.valueOf(i), zzaoVar);
        }
    }

    public final boolean zzo(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.zza;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        Path$$ExternalSyntheticBUOutline0.m(Boxes$$ExternalSyntheticOutline1.m(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
        return false;
    }

    public final void zzr(int i) {
        TreeMap treeMap = this.zza;
        int intValue = ((Integer) treeMap.lastKey()).intValue();
        if (i > intValue || i < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i));
        if (i == intValue) {
            int i2 = i - 1;
            Integer valueOf = Integer.valueOf(i2);
            if (treeMap.containsKey(valueOf) || i2 < 0) {
                return;
            }
            treeMap.put(valueOf, zzao.zzf);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer valueOf2 = Integer.valueOf(i);
            zzao zzaoVar = (zzao) treeMap.get(valueOf2);
            if (zzaoVar != null) {
                treeMap.put(Integer.valueOf(i - 1), zzaoVar);
                treeMap.remove(valueOf2);
            }
        }
    }

    public final String zzs(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.zza.isEmpty()) {
            int i = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i >= zzh()) {
                    break;
                }
                zzao zzl = zzl(i);
                sb.append(str2);
                if (!(zzl instanceof zzat) && !(zzl instanceof zzam)) {
                    sb.append(zzl.zzc());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        zzae zzaeVar = new zzae();
        for (Map.Entry entry : this.zza.entrySet()) {
            boolean z = entry.getValue() instanceof zzak;
            TreeMap treeMap = zzaeVar.zza;
            if (z) {
                treeMap.put((Integer) entry.getKey(), (zzao) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((zzao) entry.getValue()).zzt());
            }
        }
        return zzaeVar;
    }

    public zzae() {
        this.zza = new TreeMap();
        this.zzb = new TreeMap();
    }
}
