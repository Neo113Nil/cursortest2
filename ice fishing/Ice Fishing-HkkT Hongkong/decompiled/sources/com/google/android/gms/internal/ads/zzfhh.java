package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzfhh {
    public final com.google.android.gms.ads.internal.client.zzfk zza;
    public final zzbpp zzb;
    public final zzeqe zzc;
    public final com.google.android.gms.ads.internal.client.zzl zzd;
    public final com.google.android.gms.ads.internal.client.zzq zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbjb zzi;
    public final com.google.android.gms.ads.internal.client.zzw zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final com.google.android.gms.ads.internal.client.zzcb zzn;
    public final zzfgu zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final com.google.android.gms.ads.internal.client.zzcf zzr;

    /* synthetic */ zzfhh(zzfhf zzfhfVar, zzfhg zzfhgVar) {
        com.google.android.gms.ads.internal.client.zzq zzqVar;
        String str;
        com.google.android.gms.ads.internal.client.zzcf zzcfVar;
        com.google.android.gms.ads.internal.client.zzl zzlVar;
        com.google.android.gms.ads.internal.client.zzl zzlVar2;
        com.google.android.gms.ads.internal.client.zzl zzlVar3;
        com.google.android.gms.ads.internal.client.zzl zzlVar4;
        com.google.android.gms.ads.internal.client.zzl zzlVar5;
        com.google.android.gms.ads.internal.client.zzl zzlVar6;
        com.google.android.gms.ads.internal.client.zzl zzlVar7;
        com.google.android.gms.ads.internal.client.zzl zzlVar8;
        com.google.android.gms.ads.internal.client.zzl zzlVar9;
        com.google.android.gms.ads.internal.client.zzl zzlVar10;
        com.google.android.gms.ads.internal.client.zzl zzlVar11;
        com.google.android.gms.ads.internal.client.zzl zzlVar12;
        com.google.android.gms.ads.internal.client.zzl zzlVar13;
        com.google.android.gms.ads.internal.client.zzl zzlVar14;
        com.google.android.gms.ads.internal.client.zzl zzlVar15;
        com.google.android.gms.ads.internal.client.zzl zzlVar16;
        com.google.android.gms.ads.internal.client.zzl zzlVar17;
        com.google.android.gms.ads.internal.client.zzl zzlVar18;
        com.google.android.gms.ads.internal.client.zzl zzlVar19;
        com.google.android.gms.ads.internal.client.zzl zzlVar20;
        com.google.android.gms.ads.internal.client.zzl zzlVar21;
        com.google.android.gms.ads.internal.client.zzl zzlVar22;
        com.google.android.gms.ads.internal.client.zzl zzlVar23;
        com.google.android.gms.ads.internal.client.zzl zzlVar24;
        com.google.android.gms.ads.internal.client.zzl zzlVar25;
        com.google.android.gms.ads.internal.client.zzfk zzfkVar;
        zzbjb zzbjbVar;
        com.google.android.gms.ads.internal.client.zzfk zzfkVar2;
        zzbjb zzbjbVar2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        zzbjb zzbjbVar3;
        zzbjb zzbjbVar4;
        com.google.android.gms.ads.internal.client.zzw zzwVar;
        int i;
        AdManagerAdViewOptions adManagerAdViewOptions;
        PublisherAdViewOptions publisherAdViewOptions;
        com.google.android.gms.ads.internal.client.zzcb zzcbVar;
        zzbpp zzbppVar;
        zzfgs zzfgsVar;
        boolean z;
        zzeqe zzeqeVar;
        boolean z2;
        boolean z3;
        zzqVar = zzfhfVar.zzb;
        this.zze = zzqVar;
        str = zzfhfVar.zzc;
        this.zzf = str;
        zzcfVar = zzfhfVar.zzs;
        this.zzr = zzcfVar;
        zzlVar = zzfhfVar.zza;
        int i2 = zzlVar.zza;
        zzlVar2 = zzfhfVar.zza;
        long j = zzlVar2.zzb;
        zzlVar3 = zzfhfVar.zza;
        Bundle bundle = zzlVar3.zzc;
        zzlVar4 = zzfhfVar.zza;
        int i3 = zzlVar4.zzd;
        zzlVar5 = zzfhfVar.zza;
        List list = zzlVar5.zze;
        zzlVar6 = zzfhfVar.zza;
        boolean z4 = zzlVar6.zzf;
        zzlVar7 = zzfhfVar.zza;
        int i4 = zzlVar7.zzg;
        zzlVar8 = zzfhfVar.zza;
        boolean z5 = true;
        if (!zzlVar8.zzh) {
            z3 = zzfhfVar.zze;
            if (!z3) {
                z5 = false;
            }
        }
        zzlVar9 = zzfhfVar.zza;
        String str2 = zzlVar9.zzi;
        zzlVar10 = zzfhfVar.zza;
        com.google.android.gms.ads.internal.client.zzfh zzfhVar = zzlVar10.zzj;
        zzlVar11 = zzfhfVar.zza;
        Location location = zzlVar11.zzk;
        zzlVar12 = zzfhfVar.zza;
        String str3 = zzlVar12.zzl;
        zzlVar13 = zzfhfVar.zza;
        Bundle bundle2 = zzlVar13.zzm;
        zzlVar14 = zzfhfVar.zza;
        Bundle bundle3 = zzlVar14.zzn;
        zzlVar15 = zzfhfVar.zza;
        List list2 = zzlVar15.zzo;
        zzlVar16 = zzfhfVar.zza;
        String str4 = zzlVar16.zzp;
        zzlVar17 = zzfhfVar.zza;
        String str5 = zzlVar17.zzq;
        zzlVar18 = zzfhfVar.zza;
        boolean z6 = zzlVar18.zzr;
        zzlVar19 = zzfhfVar.zza;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzlVar19.zzs;
        zzlVar20 = zzfhfVar.zza;
        int i5 = zzlVar20.zzt;
        zzlVar21 = zzfhfVar.zza;
        String str6 = zzlVar21.zzu;
        zzlVar22 = zzfhfVar.zza;
        List list3 = zzlVar22.zzv;
        zzlVar23 = zzfhfVar.zza;
        int zza = com.google.android.gms.ads.internal.util.zzt.zza(zzlVar23.zzw);
        zzlVar24 = zzfhfVar.zza;
        String str7 = zzlVar24.zzx;
        zzlVar25 = zzfhfVar.zza;
        this.zzd = new com.google.android.gms.ads.internal.client.zzl(i2, j, bundle, i3, list, z4, i4, z5, str2, zzfhVar, location, str3, bundle2, bundle3, list2, str4, str5, z6, zzcVar, i5, str6, list3, zza, str7, zzlVar25.zzy);
        zzfkVar = zzfhfVar.zzd;
        if (zzfkVar != null) {
            zzfkVar2 = zzfhfVar.zzd;
        } else {
            zzbjbVar = zzfhfVar.zzh;
            if (zzbjbVar != null) {
                zzbjbVar2 = zzfhfVar.zzh;
                zzfkVar2 = zzbjbVar2.zzf;
            } else {
                zzfkVar2 = null;
            }
        }
        this.zza = zzfkVar2;
        arrayList = zzfhfVar.zzf;
        this.zzg = arrayList;
        arrayList2 = zzfhfVar.zzg;
        this.zzh = arrayList2;
        arrayList3 = zzfhfVar.zzf;
        if (arrayList3 == null) {
            zzbjbVar4 = null;
        } else {
            zzbjbVar3 = zzfhfVar.zzh;
            zzbjbVar4 = zzbjbVar3 == null ? new zzbjb(new NativeAdOptions.Builder().build()) : zzfhfVar.zzh;
        }
        this.zzi = zzbjbVar4;
        zzwVar = zzfhfVar.zzi;
        this.zzj = zzwVar;
        i = zzfhfVar.zzm;
        this.zzk = i;
        adManagerAdViewOptions = zzfhfVar.zzj;
        this.zzl = adManagerAdViewOptions;
        publisherAdViewOptions = zzfhfVar.zzk;
        this.zzm = publisherAdViewOptions;
        zzcbVar = zzfhfVar.zzl;
        this.zzn = zzcbVar;
        zzbppVar = zzfhfVar.zzn;
        this.zzb = zzbppVar;
        zzfgsVar = zzfhfVar.zzo;
        this.zzo = new zzfgu(zzfgsVar, null);
        z = zzfhfVar.zzp;
        this.zzp = z;
        zzeqeVar = zzfhfVar.zzq;
        this.zzc = zzeqeVar;
        z2 = zzfhfVar.zzr;
        this.zzq = z2;
    }

    public final zzbld zza() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        return publisherAdViewOptions != null ? publisherAdViewOptions.zzb() : this.zzl.zza();
    }

    public final boolean zzb() {
        return this.zzf.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzcW));
    }
}
