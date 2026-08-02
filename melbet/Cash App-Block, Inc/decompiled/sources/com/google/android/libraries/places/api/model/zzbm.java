package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.text.TextUtils;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.Place;
import com.google.common.collect.Cut;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Range;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzbm {
    public zzfm zzA;
    public Integer zzB;
    public zzfq zzC;
    public String zzD;
    public String zzE;
    public String zzF;
    public Double zzG;
    public Place.BooleanPlaceAttributeValue zzH;
    public List zzI;
    public ArrayList zzJ;
    public Place.BooleanPlaceAttributeValue zzK;
    public Place.BooleanPlaceAttributeValue zzL;
    public Place.BooleanPlaceAttributeValue zzM;
    public Place.BooleanPlaceAttributeValue zzN;
    public Place.BooleanPlaceAttributeValue zzO;
    public Place.BooleanPlaceAttributeValue zzP;
    public Place.BooleanPlaceAttributeValue zzQ;
    public Place.BooleanPlaceAttributeValue zzR;
    public Integer zzS;
    public Integer zzT;
    public LatLngBounds zzU;
    public Uri zzV;
    public Uri zzW;
    public zzcq zzX;
    public zzfa zzY;
    public zzfc zzZ;
    public String zza;
    public zzdw zzaa;
    public Place.BooleanPlaceAttributeValue zzab;
    public Place.BooleanPlaceAttributeValue zzac;
    public Place.BooleanPlaceAttributeValue zzad;
    public Place.BooleanPlaceAttributeValue zzae;
    public Place.BooleanPlaceAttributeValue zzaf;
    public Place.BooleanPlaceAttributeValue zzag;
    public Place.BooleanPlaceAttributeValue zzah;
    public Place.BooleanPlaceAttributeValue zzai;
    public Place.BooleanPlaceAttributeValue zzaj;
    public Place.BooleanPlaceAttributeValue zzak;
    public Place.BooleanPlaceAttributeValue zzal;
    public List zzam;
    public zzee zzan;
    public Place.BooleanPlaceAttributeValue zzao;
    public zzei zzap;
    public zzec zzaq;
    public zzew zzar;
    public zzfw zzas;
    public zzek zzat;
    public ImmutableList zzau;
    public ZoneId zzav;
    public zzcw zzaw;
    public zzfo zzax;
    public String zzb;
    public String zzc;
    public zzcu zzd;
    public List zze;
    public Place.BusinessStatus zzf;
    public zzdo zzg;
    public Place.BooleanPlaceAttributeValue zzh;
    public zzey zzi;
    public Place.BooleanPlaceAttributeValue zzj;
    public Place.BooleanPlaceAttributeValue zzk;
    public String zzl;
    public String zzm;
    public Integer zzn;
    public String zzo;
    public String zzp;
    public LatLng zzq;
    public String zzr;
    public String zzs;
    public String zzt;
    public zzey zzu;
    public String zzv;
    public String zzw;
    public List zzx;
    public List zzy;
    public List zzz;

    public final zzfi build() {
        zzfi zza = zza();
        List list = zza.zze;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Trace.checkArgument("Attributions must not contain null or empty values.", !TextUtils.isEmpty((String) it.next()));
            }
        }
        Integer num = zza.zzB;
        if (num != null) {
            Trace.checkArgument(Range.closed(0, 4).contains(num), "Price Level must not be out-of-range: %s to %s, but was: %s.", 0, 4, num);
        }
        Double d = zza.zzG;
        if (d != null) {
            Double valueOf = Double.valueOf(1.0d);
            Double valueOf2 = Double.valueOf(5.0d);
            Trace.checkArgument(Range.closed(valueOf, valueOf2).contains(d), "Rating must not be out-of-range: %s to %s, but was: %s.", valueOf, valueOf2, d);
        }
        Integer num2 = zza.zzS;
        if (num2 != null) {
            Range range = Range.ALL;
            Trace.checkArgument("User Ratings Total must not be < 0, but was: %s.", num2, new Range(new Cut.AboveAll(0, 2), Cut.AboveAll.INSTANCE).contains(num2));
        }
        if (list != null) {
            this.zze = ImmutableList.copyOf((Collection) list);
        }
        List list2 = zza.zzx;
        if (list2 != null) {
            this.zzx = ImmutableList.copyOf((Collection) list2);
        }
        List list3 = zza.zzz;
        if (list3 != null) {
            this.zzz = ImmutableList.copyOf((Collection) list3);
        }
        List list4 = zza.zzI;
        if (list4 != null) {
            this.zzI = ImmutableList.copyOf((Collection) list4);
        }
        List list5 = zza.zzy;
        if (list5 != null) {
            this.zzy = ImmutableList.copyOf((Collection) list5);
        }
        List list6 = zza.zzau;
        if (list6 != null) {
            this.zzau = ImmutableList.copyOf((Collection) list6);
        }
        return zza();
    }

    public final zzfi zza() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue5;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue6;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue7;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue8;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue9;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue10;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue11;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue12;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue13;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue14;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue15;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue16;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue17;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue18;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue19;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue20;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue21;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue22;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue23;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue24 = this.zzh;
        if (booleanPlaceAttributeValue24 != null && (booleanPlaceAttributeValue = this.zzj) != null && (booleanPlaceAttributeValue2 = this.zzk) != null && (booleanPlaceAttributeValue3 = this.zzH) != null && (booleanPlaceAttributeValue4 = this.zzK) != null && (booleanPlaceAttributeValue5 = this.zzL) != null && (booleanPlaceAttributeValue6 = this.zzM) != null && (booleanPlaceAttributeValue7 = this.zzN) != null && (booleanPlaceAttributeValue8 = this.zzO) != null && (booleanPlaceAttributeValue9 = this.zzP) != null && (booleanPlaceAttributeValue10 = this.zzQ) != null && (booleanPlaceAttributeValue11 = this.zzR) != null && (booleanPlaceAttributeValue12 = this.zzab) != null && (booleanPlaceAttributeValue13 = this.zzac) != null && (booleanPlaceAttributeValue14 = this.zzad) != null && (booleanPlaceAttributeValue15 = this.zzae) != null && (booleanPlaceAttributeValue16 = this.zzaf) != null && (booleanPlaceAttributeValue17 = this.zzag) != null && (booleanPlaceAttributeValue18 = this.zzah) != null && (booleanPlaceAttributeValue19 = this.zzai) != null && (booleanPlaceAttributeValue20 = this.zzaj) != null && (booleanPlaceAttributeValue21 = this.zzak) != null && (booleanPlaceAttributeValue22 = this.zzal) != null && (booleanPlaceAttributeValue23 = this.zzao) != null) {
            return new zzfi(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, booleanPlaceAttributeValue24, this.zzi, booleanPlaceAttributeValue, booleanPlaceAttributeValue2, this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzw, this.zzx, this.zzy, this.zzz, this.zzA, this.zzB, this.zzC, this.zzD, this.zzE, this.zzF, this.zzG, booleanPlaceAttributeValue3, this.zzI, this.zzJ, booleanPlaceAttributeValue4, booleanPlaceAttributeValue5, booleanPlaceAttributeValue6, booleanPlaceAttributeValue7, booleanPlaceAttributeValue8, booleanPlaceAttributeValue9, booleanPlaceAttributeValue10, booleanPlaceAttributeValue11, this.zzS, this.zzT, this.zzU, this.zzV, this.zzW, this.zzX, this.zzY, this.zzZ, this.zzaa, booleanPlaceAttributeValue12, booleanPlaceAttributeValue13, booleanPlaceAttributeValue14, booleanPlaceAttributeValue15, booleanPlaceAttributeValue16, booleanPlaceAttributeValue17, booleanPlaceAttributeValue18, booleanPlaceAttributeValue19, booleanPlaceAttributeValue20, booleanPlaceAttributeValue21, booleanPlaceAttributeValue22, this.zzam, this.zzan, booleanPlaceAttributeValue23, this.zzap, this.zzaq, this.zzar, this.zzas, this.zzat, this.zzau, this.zzav, this.zzaw, this.zzax);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zzh == null) {
            sb.append(" curbsidePickup");
        }
        if (this.zzj == null) {
            sb.append(" delivery");
        }
        if (this.zzk == null) {
            sb.append(" dineIn");
        }
        if (this.zzH == null) {
            sb.append(" reservable");
        }
        if (this.zzK == null) {
            sb.append(" servesBeer");
        }
        if (this.zzL == null) {
            sb.append(" servesBreakfast");
        }
        if (this.zzM == null) {
            sb.append(" servesBrunch");
        }
        if (this.zzN == null) {
            sb.append(" servesDinner");
        }
        if (this.zzO == null) {
            sb.append(" servesLunch");
        }
        if (this.zzP == null) {
            sb.append(" servesVegetarianFood");
        }
        if (this.zzQ == null) {
            sb.append(" servesWine");
        }
        if (this.zzR == null) {
            sb.append(" takeout");
        }
        if (this.zzab == null) {
            sb.append(" outdoorSeating");
        }
        if (this.zzac == null) {
            sb.append(" liveMusic");
        }
        if (this.zzad == null) {
            sb.append(" menuForChildren");
        }
        if (this.zzae == null) {
            sb.append(" servesCocktails");
        }
        if (this.zzaf == null) {
            sb.append(" servesDessert");
        }
        if (this.zzag == null) {
            sb.append(" servesCoffee");
        }
        if (this.zzah == null) {
            sb.append(" goodForChildren");
        }
        if (this.zzai == null) {
            sb.append(" allowsDogs");
        }
        if (this.zzaj == null) {
            sb.append(" restroom");
        }
        if (this.zzak == null) {
            sb.append(" goodForGroups");
        }
        if (this.zzal == null) {
            sb.append(" goodForWatchingSports");
        }
        if (this.zzao == null) {
            sb.append(" pureServiceAreaBusiness");
        }
        a$$ExternalSyntheticBUOutline0.m$1("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
