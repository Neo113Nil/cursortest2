package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.Place;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzfi extends Place {
    public static final Parcelable.Creator<zzfi> CREATOR = new zzdp(20);
    public final zzfm zzA;
    public final Integer zzB;
    public final zzfq zzC;
    public final String zzD;
    public final String zzE;
    public final String zzF;
    public final Double zzG;
    public final Place.BooleanPlaceAttributeValue zzH;
    public final List zzI;
    public final List zzJ;
    public final Place.BooleanPlaceAttributeValue zzK;
    public final Place.BooleanPlaceAttributeValue zzL;
    public final Place.BooleanPlaceAttributeValue zzM;
    public final Place.BooleanPlaceAttributeValue zzN;
    public final Place.BooleanPlaceAttributeValue zzO;
    public final Place.BooleanPlaceAttributeValue zzP;
    public final Place.BooleanPlaceAttributeValue zzQ;
    public final Place.BooleanPlaceAttributeValue zzR;
    public final Integer zzS;
    public final Integer zzT;
    public final LatLngBounds zzU;
    public final Uri zzV;
    public final Uri zzW;
    public final zzcq zzX;
    public final zzfa zzY;
    public final zzfc zzZ;
    public final String zza;
    public final zzdw zzaa;
    public final Place.BooleanPlaceAttributeValue zzab;
    public final Place.BooleanPlaceAttributeValue zzac;
    public final Place.BooleanPlaceAttributeValue zzad;
    public final Place.BooleanPlaceAttributeValue zzae;
    public final Place.BooleanPlaceAttributeValue zzaf;
    public final Place.BooleanPlaceAttributeValue zzag;
    public final Place.BooleanPlaceAttributeValue zzah;
    public final Place.BooleanPlaceAttributeValue zzai;
    public final Place.BooleanPlaceAttributeValue zzaj;
    public final Place.BooleanPlaceAttributeValue zzak;
    public final Place.BooleanPlaceAttributeValue zzal;
    public final List zzam;
    public final zzee zzan;
    public final Place.BooleanPlaceAttributeValue zzao;
    public final zzei zzap;
    public final zzec zzaq;
    public final zzew zzar;
    public final zzfw zzas;
    public final zzek zzat;
    public final List zzau;
    public final ZoneId zzav;
    public final zzcw zzaw;
    public final zzfo zzax;
    public final String zzb;
    public final String zzc;
    public final zzcu zzd;
    public final List zze;
    public final Place.BusinessStatus zzf;
    public final zzdo zzg;
    public final Place.BooleanPlaceAttributeValue zzh;
    public final zzey zzi;
    public final Place.BooleanPlaceAttributeValue zzj;
    public final Place.BooleanPlaceAttributeValue zzk;
    public final String zzl;
    public final String zzm;
    public final Integer zzn;
    public final String zzo;
    public final String zzp;
    public final LatLng zzq;
    public final String zzr;
    public final String zzs;
    public final String zzt;
    public final zzey zzu;
    public final String zzv;
    public final String zzw;
    public final List zzx;
    public final List zzy;
    public final List zzz;

    public zzfi(String str, String str2, String str3, zzcu zzcuVar, List list, Place.BusinessStatus businessStatus, zzdo zzdoVar, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, zzey zzeyVar, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, String str4, String str5, Integer num, String str6, String str7, LatLng latLng, String str8, String str9, String str10, zzey zzeyVar2, String str11, String str12, List list2, List list3, List list4, zzfm zzfmVar, Integer num2, zzfq zzfqVar, String str13, String str14, String str15, Double d, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4, List list5, ArrayList arrayList, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue5, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue6, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue7, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue8, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue9, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue10, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue11, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue12, Integer num3, Integer num4, LatLngBounds latLngBounds, Uri uri, Uri uri2, zzcq zzcqVar, zzfa zzfaVar, zzfc zzfcVar, zzdw zzdwVar, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue13, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue14, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue15, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue16, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue17, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue18, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue19, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue20, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue21, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue22, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue23, List list6, zzee zzeeVar, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue24, zzei zzeiVar, zzec zzecVar, zzew zzewVar, zzfw zzfwVar, zzek zzekVar, List list7, ZoneId zoneId, zzcw zzcwVar, zzfo zzfoVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzcuVar;
        this.zze = list;
        this.zzf = businessStatus;
        this.zzg = zzdoVar;
        if (booleanPlaceAttributeValue == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null curbsidePickup");
            throw null;
        }
        this.zzh = booleanPlaceAttributeValue;
        this.zzi = zzeyVar;
        if (booleanPlaceAttributeValue2 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null delivery");
            throw null;
        }
        this.zzj = booleanPlaceAttributeValue2;
        if (booleanPlaceAttributeValue3 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null dineIn");
            throw null;
        }
        this.zzk = booleanPlaceAttributeValue3;
        this.zzl = str4;
        this.zzm = str5;
        this.zzn = num;
        this.zzo = str6;
        this.zzp = str7;
        this.zzq = latLng;
        this.zzr = str8;
        this.zzs = str9;
        this.zzt = str10;
        this.zzu = zzeyVar2;
        this.zzv = str11;
        this.zzw = str12;
        this.zzx = list2;
        this.zzy = list3;
        this.zzz = list4;
        this.zzA = zzfmVar;
        this.zzB = num2;
        this.zzC = zzfqVar;
        this.zzD = str13;
        this.zzE = str14;
        this.zzF = str15;
        this.zzG = d;
        if (booleanPlaceAttributeValue4 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null reservable");
            throw null;
        }
        this.zzH = booleanPlaceAttributeValue4;
        this.zzI = list5;
        this.zzJ = arrayList;
        if (booleanPlaceAttributeValue5 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null servesBeer");
            throw null;
        }
        this.zzK = booleanPlaceAttributeValue5;
        if (booleanPlaceAttributeValue6 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null servesBreakfast");
            throw null;
        }
        this.zzL = booleanPlaceAttributeValue6;
        if (booleanPlaceAttributeValue7 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null servesBrunch");
            throw null;
        }
        this.zzM = booleanPlaceAttributeValue7;
        if (booleanPlaceAttributeValue8 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null servesDinner");
            throw null;
        }
        this.zzN = booleanPlaceAttributeValue8;
        if (booleanPlaceAttributeValue9 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null servesLunch");
            throw null;
        }
        this.zzO = booleanPlaceAttributeValue9;
        if (booleanPlaceAttributeValue10 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null servesVegetarianFood");
            throw null;
        }
        this.zzP = booleanPlaceAttributeValue10;
        if (booleanPlaceAttributeValue11 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null servesWine");
            throw null;
        }
        this.zzQ = booleanPlaceAttributeValue11;
        if (booleanPlaceAttributeValue12 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null takeout");
            throw null;
        }
        this.zzR = booleanPlaceAttributeValue12;
        this.zzS = num3;
        this.zzT = num4;
        this.zzU = latLngBounds;
        this.zzV = uri;
        this.zzW = uri2;
        this.zzX = zzcqVar;
        this.zzY = zzfaVar;
        this.zzZ = zzfcVar;
        this.zzaa = zzdwVar;
        if (booleanPlaceAttributeValue13 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null outdoorSeating");
            throw null;
        }
        this.zzab = booleanPlaceAttributeValue13;
        if (booleanPlaceAttributeValue14 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null liveMusic");
            throw null;
        }
        this.zzac = booleanPlaceAttributeValue14;
        if (booleanPlaceAttributeValue15 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null menuForChildren");
            throw null;
        }
        this.zzad = booleanPlaceAttributeValue15;
        if (booleanPlaceAttributeValue16 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null servesCocktails");
            throw null;
        }
        this.zzae = booleanPlaceAttributeValue16;
        if (booleanPlaceAttributeValue17 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null servesDessert");
            throw null;
        }
        this.zzaf = booleanPlaceAttributeValue17;
        if (booleanPlaceAttributeValue18 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null servesCoffee");
            throw null;
        }
        this.zzag = booleanPlaceAttributeValue18;
        if (booleanPlaceAttributeValue19 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null goodForChildren");
            throw null;
        }
        this.zzah = booleanPlaceAttributeValue19;
        if (booleanPlaceAttributeValue20 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null allowsDogs");
            throw null;
        }
        this.zzai = booleanPlaceAttributeValue20;
        if (booleanPlaceAttributeValue21 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null restroom");
            throw null;
        }
        this.zzaj = booleanPlaceAttributeValue21;
        if (booleanPlaceAttributeValue22 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null goodForGroups");
            throw null;
        }
        this.zzak = booleanPlaceAttributeValue22;
        if (booleanPlaceAttributeValue23 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null goodForWatchingSports");
            throw null;
        }
        this.zzal = booleanPlaceAttributeValue23;
        this.zzam = list6;
        this.zzan = zzeeVar;
        if (booleanPlaceAttributeValue24 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null pureServiceAreaBusiness");
            throw null;
        }
        this.zzao = booleanPlaceAttributeValue24;
        this.zzap = zzeiVar;
        this.zzaq = zzecVar;
        this.zzar = zzewVar;
        this.zzas = zzfwVar;
        this.zzat = zzekVar;
        this.zzau = list7;
        this.zzav = zoneId;
        this.zzaw = zzcwVar;
        this.zzax = zzfoVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Place) {
            Place place = (Place) obj;
            String str = this.zza;
            if (str != null ? str.equals(((zzfi) place).zza) : ((zzfi) place).zza == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(((zzfi) place).zzb) : ((zzfi) place).zzb == null) {
                    String str3 = this.zzc;
                    if (str3 != null ? str3.equals(((zzfi) place).zzc) : ((zzfi) place).zzc == null) {
                        zzcu zzcuVar = this.zzd;
                        if (zzcuVar != null ? zzcuVar.equals(((zzfi) place).zzd) : ((zzfi) place).zzd == null) {
                            List list = this.zze;
                            if (list != null ? list.equals(((zzfi) place).zze) : ((zzfi) place).zze == null) {
                                Place.BusinessStatus businessStatus = this.zzf;
                                if (businessStatus != null ? businessStatus.equals(((zzfi) place).zzf) : ((zzfi) place).zzf == null) {
                                    zzdo zzdoVar = this.zzg;
                                    if (zzdoVar != null ? zzdoVar.equals(((zzfi) place).zzg) : ((zzfi) place).zzg == null) {
                                        zzfi zzfiVar = (zzfi) place;
                                        if (this.zzh.equals(zzfiVar.zzh)) {
                                            zzey zzeyVar = zzfiVar.zzi;
                                            zzey zzeyVar2 = this.zzi;
                                            if (zzeyVar2 != null ? zzeyVar2.equals(zzeyVar) : zzeyVar == null) {
                                                if (this.zzj.equals(zzfiVar.zzj) && this.zzk.equals(zzfiVar.zzk)) {
                                                    String str4 = zzfiVar.zzl;
                                                    String str5 = this.zzl;
                                                    if (str5 != null ? str5.equals(str4) : str4 == null) {
                                                        String str6 = zzfiVar.zzm;
                                                        String str7 = this.zzm;
                                                        if (str7 != null ? str7.equals(str6) : str6 == null) {
                                                            Integer num = zzfiVar.zzn;
                                                            Integer num2 = this.zzn;
                                                            if (num2 != null ? num2.equals(num) : num == null) {
                                                                String str8 = zzfiVar.zzo;
                                                                String str9 = this.zzo;
                                                                if (str9 != null ? str9.equals(str8) : str8 == null) {
                                                                    String str10 = zzfiVar.zzp;
                                                                    String str11 = this.zzp;
                                                                    if (str11 != null ? str11.equals(str10) : str10 == null) {
                                                                        LatLng latLng = zzfiVar.zzq;
                                                                        LatLng latLng2 = this.zzq;
                                                                        if (latLng2 != null ? latLng2.equals(latLng) : latLng == null) {
                                                                            String str12 = zzfiVar.zzr;
                                                                            String str13 = this.zzr;
                                                                            if (str13 != null ? str13.equals(str12) : str12 == null) {
                                                                                String str14 = zzfiVar.zzs;
                                                                                String str15 = this.zzs;
                                                                                if (str15 != null ? str15.equals(str14) : str14 == null) {
                                                                                    String str16 = zzfiVar.zzt;
                                                                                    String str17 = this.zzt;
                                                                                    if (str17 != null ? str17.equals(str16) : str16 == null) {
                                                                                        zzey zzeyVar3 = zzfiVar.zzu;
                                                                                        zzey zzeyVar4 = this.zzu;
                                                                                        if (zzeyVar4 != null ? zzeyVar4.equals(zzeyVar3) : zzeyVar3 == null) {
                                                                                            String str18 = zzfiVar.zzv;
                                                                                            String str19 = this.zzv;
                                                                                            if (str19 != null ? str19.equals(str18) : str18 == null) {
                                                                                                String str20 = zzfiVar.zzw;
                                                                                                String str21 = this.zzw;
                                                                                                if (str21 != null ? str21.equals(str20) : str20 == null) {
                                                                                                    List list2 = zzfiVar.zzx;
                                                                                                    List list3 = this.zzx;
                                                                                                    if (list3 != null ? list3.equals(list2) : list2 == null) {
                                                                                                        List list4 = zzfiVar.zzy;
                                                                                                        List list5 = this.zzy;
                                                                                                        if (list5 != null ? list5.equals(list4) : list4 == null) {
                                                                                                            List list6 = zzfiVar.zzz;
                                                                                                            List list7 = this.zzz;
                                                                                                            if (list7 != null ? list7.equals(list6) : list6 == null) {
                                                                                                                zzfm zzfmVar = zzfiVar.zzA;
                                                                                                                zzfm zzfmVar2 = this.zzA;
                                                                                                                if (zzfmVar2 != null ? zzfmVar2.equals(zzfmVar) : zzfmVar == null) {
                                                                                                                    Integer num3 = zzfiVar.zzB;
                                                                                                                    Integer num4 = this.zzB;
                                                                                                                    if (num4 != null ? num4.equals(num3) : num3 == null) {
                                                                                                                        zzfq zzfqVar = zzfiVar.zzC;
                                                                                                                        zzfq zzfqVar2 = this.zzC;
                                                                                                                        if (zzfqVar2 != null ? zzfqVar2.equals(zzfqVar) : zzfqVar == null) {
                                                                                                                            String str22 = zzfiVar.zzD;
                                                                                                                            String str23 = this.zzD;
                                                                                                                            if (str23 != null ? str23.equals(str22) : str22 == null) {
                                                                                                                                String str24 = zzfiVar.zzE;
                                                                                                                                String str25 = this.zzE;
                                                                                                                                if (str25 != null ? str25.equals(str24) : str24 == null) {
                                                                                                                                    String str26 = zzfiVar.zzF;
                                                                                                                                    String str27 = this.zzF;
                                                                                                                                    if (str27 != null ? str27.equals(str26) : str26 == null) {
                                                                                                                                        Double d = zzfiVar.zzG;
                                                                                                                                        Double d2 = this.zzG;
                                                                                                                                        if (d2 != null ? d2.equals(d) : d == null) {
                                                                                                                                            if (this.zzH.equals(zzfiVar.zzH)) {
                                                                                                                                                List list8 = zzfiVar.zzI;
                                                                                                                                                List list9 = this.zzI;
                                                                                                                                                if (list9 != null ? list9.equals(list8) : list8 == null) {
                                                                                                                                                    List list10 = zzfiVar.zzJ;
                                                                                                                                                    List list11 = this.zzJ;
                                                                                                                                                    if (list11 != null ? list11.equals(list10) : list10 == null) {
                                                                                                                                                        if (this.zzK.equals(zzfiVar.zzK) && this.zzL.equals(zzfiVar.zzL) && this.zzM.equals(zzfiVar.zzM) && this.zzN.equals(zzfiVar.zzN) && this.zzO.equals(zzfiVar.zzO) && this.zzP.equals(zzfiVar.zzP) && this.zzQ.equals(zzfiVar.zzQ) && this.zzR.equals(zzfiVar.zzR)) {
                                                                                                                                                            Integer num5 = zzfiVar.zzS;
                                                                                                                                                            Integer num6 = this.zzS;
                                                                                                                                                            if (num6 != null ? num6.equals(num5) : num5 == null) {
                                                                                                                                                                Integer num7 = zzfiVar.zzT;
                                                                                                                                                                Integer num8 = this.zzT;
                                                                                                                                                                if (num8 != null ? num8.equals(num7) : num7 == null) {
                                                                                                                                                                    LatLngBounds latLngBounds = zzfiVar.zzU;
                                                                                                                                                                    LatLngBounds latLngBounds2 = this.zzU;
                                                                                                                                                                    if (latLngBounds2 != null ? latLngBounds2.equals(latLngBounds) : latLngBounds == null) {
                                                                                                                                                                        Uri uri = zzfiVar.zzV;
                                                                                                                                                                        Uri uri2 = this.zzV;
                                                                                                                                                                        if (uri2 != null ? uri2.equals(uri) : uri == null) {
                                                                                                                                                                            Uri uri3 = zzfiVar.zzW;
                                                                                                                                                                            Uri uri4 = this.zzW;
                                                                                                                                                                            if (uri4 != null ? uri4.equals(uri3) : uri3 == null) {
                                                                                                                                                                                zzcq zzcqVar = zzfiVar.zzX;
                                                                                                                                                                                zzcq zzcqVar2 = this.zzX;
                                                                                                                                                                                if (zzcqVar2 != null ? zzcqVar2.equals(zzcqVar) : zzcqVar == null) {
                                                                                                                                                                                    zzfa zzfaVar = zzfiVar.zzY;
                                                                                                                                                                                    zzfa zzfaVar2 = this.zzY;
                                                                                                                                                                                    if (zzfaVar2 != null ? zzfaVar2.equals(zzfaVar) : zzfaVar == null) {
                                                                                                                                                                                        zzfc zzfcVar = zzfiVar.zzZ;
                                                                                                                                                                                        zzfc zzfcVar2 = this.zzZ;
                                                                                                                                                                                        if (zzfcVar2 != null ? zzfcVar2.equals(zzfcVar) : zzfcVar == null) {
                                                                                                                                                                                            zzdw zzdwVar = zzfiVar.zzaa;
                                                                                                                                                                                            zzdw zzdwVar2 = this.zzaa;
                                                                                                                                                                                            if (zzdwVar2 != null ? zzdwVar2.equals(zzdwVar) : zzdwVar == null) {
                                                                                                                                                                                                if (this.zzab.equals(zzfiVar.zzab) && this.zzac.equals(zzfiVar.zzac) && this.zzad.equals(zzfiVar.zzad) && this.zzae.equals(zzfiVar.zzae) && this.zzaf.equals(zzfiVar.zzaf) && this.zzag.equals(zzfiVar.zzag) && this.zzah.equals(zzfiVar.zzah) && this.zzai.equals(zzfiVar.zzai) && this.zzaj.equals(zzfiVar.zzaj) && this.zzak.equals(zzfiVar.zzak) && this.zzal.equals(zzfiVar.zzal)) {
                                                                                                                                                                                                    List list12 = zzfiVar.zzam;
                                                                                                                                                                                                    List list13 = this.zzam;
                                                                                                                                                                                                    if (list13 != null ? list13.equals(list12) : list12 == null) {
                                                                                                                                                                                                        zzee zzeeVar = zzfiVar.zzan;
                                                                                                                                                                                                        zzee zzeeVar2 = this.zzan;
                                                                                                                                                                                                        if (zzeeVar2 != null ? zzeeVar2.equals(zzeeVar) : zzeeVar == null) {
                                                                                                                                                                                                            if (this.zzao.equals(zzfiVar.zzao)) {
                                                                                                                                                                                                                zzei zzeiVar = zzfiVar.zzap;
                                                                                                                                                                                                                zzei zzeiVar2 = this.zzap;
                                                                                                                                                                                                                if (zzeiVar2 != null ? zzeiVar2.equals(zzeiVar) : zzeiVar == null) {
                                                                                                                                                                                                                    zzec zzecVar = zzfiVar.zzaq;
                                                                                                                                                                                                                    zzec zzecVar2 = this.zzaq;
                                                                                                                                                                                                                    if (zzecVar2 != null ? zzecVar2.equals(zzecVar) : zzecVar == null) {
                                                                                                                                                                                                                        zzew zzewVar = zzfiVar.zzar;
                                                                                                                                                                                                                        zzew zzewVar2 = this.zzar;
                                                                                                                                                                                                                        if (zzewVar2 != null ? zzewVar2.equals(zzewVar) : zzewVar == null) {
                                                                                                                                                                                                                            zzfw zzfwVar = zzfiVar.zzas;
                                                                                                                                                                                                                            zzfw zzfwVar2 = this.zzas;
                                                                                                                                                                                                                            if (zzfwVar2 != null ? zzfwVar2.equals(zzfwVar) : zzfwVar == null) {
                                                                                                                                                                                                                                zzek zzekVar = zzfiVar.zzat;
                                                                                                                                                                                                                                zzek zzekVar2 = this.zzat;
                                                                                                                                                                                                                                if (zzekVar2 != null ? zzekVar2.equals(zzekVar) : zzekVar == null) {
                                                                                                                                                                                                                                    List list14 = zzfiVar.zzau;
                                                                                                                                                                                                                                    List list15 = this.zzau;
                                                                                                                                                                                                                                    if (list15 != null ? list15.equals(list14) : list14 == null) {
                                                                                                                                                                                                                                        ZoneId zoneId = zzfiVar.zzav;
                                                                                                                                                                                                                                        ZoneId zoneId2 = this.zzav;
                                                                                                                                                                                                                                        if (zoneId2 != null ? zoneId2.equals(zoneId) : zoneId == null) {
                                                                                                                                                                                                                                            zzcw zzcwVar = zzfiVar.zzaw;
                                                                                                                                                                                                                                            zzcw zzcwVar2 = this.zzaw;
                                                                                                                                                                                                                                            if (zzcwVar2 != null ? zzcwVar2.equals(zzcwVar) : zzcwVar == null) {
                                                                                                                                                                                                                                                zzfo zzfoVar = zzfiVar.zzax;
                                                                                                                                                                                                                                                zzfo zzfoVar2 = this.zzax;
                                                                                                                                                                                                                                                if (zzfoVar2 != null ? zzfoVar2.equals(zzfoVar) : zzfoVar == null) {
                                                                                                                                                                                                                                                    return true;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = hashCode ^ 1000003;
        String str3 = this.zzc;
        int hashCode3 = ((((i * 1000003) ^ hashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        zzcu zzcuVar = this.zzd;
        int hashCode4 = (hashCode3 ^ (zzcuVar == null ? 0 : zzcuVar.hashCode())) * 1000003;
        List list = this.zze;
        int hashCode5 = (hashCode4 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        Place.BusinessStatus businessStatus = this.zzf;
        int hashCode6 = (hashCode5 ^ (businessStatus == null ? 0 : businessStatus.hashCode())) * 1000003;
        zzdo zzdoVar = this.zzg;
        int hashCode7 = (((hashCode6 ^ (zzdoVar == null ? 0 : zzdoVar.hashCode())) * 1000003) ^ this.zzh.hashCode()) * 1000003;
        zzey zzeyVar = this.zzi;
        int hashCode8 = (((((hashCode7 ^ (zzeyVar == null ? 0 : zzeyVar.hashCode())) * 1000003) ^ this.zzj.hashCode()) * 1000003) ^ this.zzk.hashCode()) * 1000003;
        String str4 = this.zzl;
        int hashCode9 = (hashCode8 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.zzm;
        int hashCode10 = (hashCode9 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        Integer num = this.zzn;
        int hashCode11 = (hashCode10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str6 = this.zzo;
        int hashCode12 = (hashCode11 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.zzp;
        int hashCode13 = (hashCode12 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        LatLng latLng = this.zzq;
        int hashCode14 = (hashCode13 ^ (latLng == null ? 0 : latLng.hashCode())) * 1000003;
        String str8 = this.zzr;
        int hashCode15 = (hashCode14 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.zzs;
        int hashCode16 = (hashCode15 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.zzt;
        int hashCode17 = (hashCode16 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        zzey zzeyVar2 = this.zzu;
        int hashCode18 = (hashCode17 ^ (zzeyVar2 == null ? 0 : zzeyVar2.hashCode())) * 1000003;
        String str11 = this.zzv;
        int hashCode19 = (hashCode18 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
        String str12 = this.zzw;
        int hashCode20 = (hashCode19 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
        List list2 = this.zzx;
        int hashCode21 = (hashCode20 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        List list3 = this.zzy;
        int hashCode22 = (hashCode21 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
        List list4 = this.zzz;
        int hashCode23 = (hashCode22 ^ (list4 == null ? 0 : list4.hashCode())) * 1000003;
        zzfm zzfmVar = this.zzA;
        int hashCode24 = (hashCode23 ^ (zzfmVar == null ? 0 : zzfmVar.hashCode())) * 1000003;
        Integer num2 = this.zzB;
        int hashCode25 = (hashCode24 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        zzfq zzfqVar = this.zzC;
        int hashCode26 = (hashCode25 ^ (zzfqVar == null ? 0 : zzfqVar.hashCode())) * 1000003;
        String str13 = this.zzD;
        int hashCode27 = (hashCode26 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
        String str14 = this.zzE;
        int hashCode28 = (hashCode27 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
        String str15 = this.zzF;
        int hashCode29 = (hashCode28 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
        Double d = this.zzG;
        int hashCode30 = (((hashCode29 ^ (d == null ? 0 : d.hashCode())) * 1000003) ^ this.zzH.hashCode()) * 1000003;
        List list5 = this.zzI;
        int hashCode31 = (hashCode30 ^ (list5 == null ? 0 : list5.hashCode())) * 1000003;
        List list6 = this.zzJ;
        int hashCode32 = (((((((((((((((((hashCode31 ^ (list6 == null ? 0 : list6.hashCode())) * 1000003) ^ this.zzK.hashCode()) * 1000003) ^ this.zzL.hashCode()) * 1000003) ^ this.zzM.hashCode()) * 1000003) ^ this.zzN.hashCode()) * 1000003) ^ this.zzO.hashCode()) * 1000003) ^ this.zzP.hashCode()) * 1000003) ^ this.zzQ.hashCode()) * 1000003) ^ this.zzR.hashCode()) * 1000003;
        Integer num3 = this.zzS;
        int hashCode33 = (hashCode32 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        Integer num4 = this.zzT;
        int hashCode34 = (hashCode33 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
        LatLngBounds latLngBounds = this.zzU;
        int hashCode35 = (hashCode34 ^ (latLngBounds == null ? 0 : latLngBounds.hashCode())) * 1000003;
        Uri uri = this.zzV;
        int hashCode36 = (hashCode35 ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        Uri uri2 = this.zzW;
        int hashCode37 = (hashCode36 ^ (uri2 == null ? 0 : uri2.hashCode())) * 1000003;
        zzcq zzcqVar = this.zzX;
        int hashCode38 = (hashCode37 ^ (zzcqVar == null ? 0 : zzcqVar.hashCode())) * 1000003;
        zzfa zzfaVar = this.zzY;
        int hashCode39 = (hashCode38 ^ (zzfaVar == null ? 0 : zzfaVar.hashCode())) * 1000003;
        zzfc zzfcVar = this.zzZ;
        int hashCode40 = (hashCode39 ^ (zzfcVar == null ? 0 : zzfcVar.hashCode())) * 1000003;
        zzdw zzdwVar = this.zzaa;
        int hashCode41 = (((((((((((((((((((((((hashCode40 ^ (zzdwVar == null ? 0 : zzdwVar.hashCode())) * 1000003) ^ this.zzab.hashCode()) * 1000003) ^ this.zzac.hashCode()) * 1000003) ^ this.zzad.hashCode()) * 1000003) ^ this.zzae.hashCode()) * 1000003) ^ this.zzaf.hashCode()) * 1000003) ^ this.zzag.hashCode()) * 1000003) ^ this.zzah.hashCode()) * 1000003) ^ this.zzai.hashCode()) * 1000003) ^ this.zzaj.hashCode()) * 1000003) ^ this.zzak.hashCode()) * 1000003) ^ this.zzal.hashCode()) * 1000003;
        List list7 = this.zzam;
        int hashCode42 = (hashCode41 ^ (list7 == null ? 0 : list7.hashCode())) * 1000003;
        zzee zzeeVar = this.zzan;
        int hashCode43 = (((hashCode42 ^ (zzeeVar == null ? 0 : zzeeVar.hashCode())) * 1000003) ^ this.zzao.hashCode()) * 1000003;
        zzei zzeiVar = this.zzap;
        int hashCode44 = (hashCode43 ^ (zzeiVar == null ? 0 : zzeiVar.hashCode())) * 1000003;
        zzec zzecVar = this.zzaq;
        int hashCode45 = (hashCode44 ^ (zzecVar == null ? 0 : zzecVar.hashCode())) * 1000003;
        zzew zzewVar = this.zzar;
        int hashCode46 = (hashCode45 ^ (zzewVar == null ? 0 : zzewVar.hashCode())) * 1000003;
        zzfw zzfwVar = this.zzas;
        int hashCode47 = (hashCode46 ^ (zzfwVar == null ? 0 : zzfwVar.hashCode())) * 1000003;
        zzek zzekVar = this.zzat;
        int hashCode48 = (hashCode47 ^ (zzekVar == null ? 0 : zzekVar.hashCode())) * 1000003;
        List list8 = this.zzau;
        int hashCode49 = (hashCode48 ^ (list8 == null ? 0 : list8.hashCode())) * 1000003;
        ZoneId zoneId = this.zzav;
        int hashCode50 = (hashCode49 ^ (zoneId == null ? 0 : zoneId.hashCode())) * 1000003;
        zzcw zzcwVar = this.zzaw;
        int hashCode51 = (hashCode50 ^ (zzcwVar == null ? 0 : zzcwVar.hashCode())) * 1000003;
        zzfo zzfoVar = this.zzax;
        return hashCode51 ^ (zzfoVar != null ? zzfoVar.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        String valueOf2 = String.valueOf(this.zze);
        String valueOf3 = String.valueOf(this.zzf);
        String valueOf4 = String.valueOf(this.zzg);
        String obj = this.zzh.toString();
        String valueOf5 = String.valueOf(this.zzi);
        String obj2 = this.zzj.toString();
        String obj3 = this.zzk.toString();
        String valueOf6 = String.valueOf(this.zzq);
        String valueOf7 = String.valueOf(this.zzu);
        String valueOf8 = String.valueOf(this.zzx);
        String valueOf9 = String.valueOf(this.zzy);
        String valueOf10 = String.valueOf(this.zzz);
        String valueOf11 = String.valueOf(this.zzA);
        String valueOf12 = String.valueOf(this.zzC);
        String obj4 = this.zzH.toString();
        String valueOf13 = String.valueOf(this.zzI);
        String valueOf14 = String.valueOf(this.zzJ);
        String obj5 = this.zzK.toString();
        String obj6 = this.zzL.toString();
        String obj7 = this.zzM.toString();
        String obj8 = this.zzN.toString();
        String obj9 = this.zzO.toString();
        String obj10 = this.zzP.toString();
        String obj11 = this.zzQ.toString();
        String obj12 = this.zzR.toString();
        String valueOf15 = String.valueOf(this.zzU);
        String valueOf16 = String.valueOf(this.zzV);
        String valueOf17 = String.valueOf(this.zzW);
        String valueOf18 = String.valueOf(this.zzX);
        String valueOf19 = String.valueOf(this.zzY);
        String valueOf20 = String.valueOf(this.zzZ);
        String valueOf21 = String.valueOf(this.zzaa);
        String obj13 = this.zzab.toString();
        String obj14 = this.zzac.toString();
        String obj15 = this.zzad.toString();
        String obj16 = this.zzae.toString();
        String obj17 = this.zzaf.toString();
        String obj18 = this.zzag.toString();
        String obj19 = this.zzah.toString();
        String obj20 = this.zzai.toString();
        String obj21 = this.zzaj.toString();
        String obj22 = this.zzak.toString();
        String obj23 = this.zzal.toString();
        String valueOf22 = String.valueOf(this.zzam);
        String valueOf23 = String.valueOf(this.zzan);
        String obj24 = this.zzao.toString();
        String valueOf24 = String.valueOf(this.zzap);
        String valueOf25 = String.valueOf(this.zzaq);
        String valueOf26 = String.valueOf(this.zzar);
        String valueOf27 = String.valueOf(this.zzas);
        String valueOf28 = String.valueOf(this.zzat);
        String valueOf29 = String.valueOf(this.zzau);
        String valueOf30 = String.valueOf(this.zzav);
        String valueOf31 = String.valueOf(this.zzaw);
        String valueOf32 = String.valueOf(this.zzax);
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzc;
        int m = Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(length2 + length + 47 + 19, 20, String.valueOf(str3)), 15, valueOf), 17, valueOf2), 16, valueOf3), 17, valueOf4), 22, obj), 11, valueOf5), 9, obj2);
        int length3 = obj3.length();
        String str4 = this.zzl;
        int length4 = String.valueOf(str4).length() + m + length3 + 19;
        String str5 = this.zzm;
        int length5 = String.valueOf(str5).length();
        Integer num = this.zzn;
        int m$1 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(length4 + 31, length5, 22, String.valueOf(num).length());
        String str6 = this.zzo;
        int length6 = String.valueOf(str6).length();
        String str7 = this.zzp;
        int m2 = Boxes$$ExternalSyntheticOutline1.m(m$1 + 14 + length6 + 5, 11, String.valueOf(str7));
        int length7 = valueOf6.length();
        String str8 = this.zzr;
        int i = m2 + length7 + 14;
        int length8 = String.valueOf(str8).length();
        String str9 = this.zzs;
        int m3 = Boxes$$ExternalSyntheticOutline1.m(i + length8 + 26, 15, String.valueOf(str9));
        String str10 = this.zzt;
        int length9 = String.valueOf(str10).length() + m3 + 15;
        int length10 = valueOf7.length();
        String str11 = this.zzv;
        int m4 = Boxes$$ExternalSyntheticOutline1.m(length9 + length10 + 27, 22, String.valueOf(str11));
        String str12 = this.zzw;
        int m5 = Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(String.valueOf(str12).length() + m4 + 17, 10, valueOf8), 13, valueOf9), 11, valueOf10);
        int length11 = valueOf11.length();
        Integer num2 = this.zzB;
        int m6 = Boxes$$ExternalSyntheticOutline1.m(m5 + length11 + 13, 13, String.valueOf(num2));
        int length12 = valueOf12.length();
        String str13 = this.zzD;
        int i2 = m6 + length12 + 14;
        int length13 = String.valueOf(str13).length();
        String str14 = this.zzE;
        int i3 = i2 + length13 + 25;
        int length14 = String.valueOf(str14).length();
        String str15 = this.zzF;
        int m7 = Boxes$$ExternalSyntheticOutline1.m(i3 + length14 + 37, 9, String.valueOf(str15));
        Double d = this.zzG;
        int m8 = Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(String.valueOf(d).length() + m7 + 13, 24, obj4), 31, valueOf13), 13, valueOf14), 18, obj5), 15, obj6), 15, obj7) + obj8.length() + 14 + obj9.length() + 23, 13, obj10), 10, obj11), 18, obj12);
        Integer num3 = this.zzS;
        int length15 = String.valueOf(num3).length() + m8 + 19;
        Integer num4 = this.zzT;
        StringBuilder sb = new StringBuilder(valueOf32.length() + Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(Boxes$$ExternalSyntheticOutline1.m(String.valueOf(num4).length() + length15 + 11, 13, valueOf15), 16, valueOf16), 23, valueOf17), 17, valueOf18), 17, valueOf19), 18, valueOf20), 17, valueOf21), 12, obj13), 18, obj14), 18, obj15), 16, obj16), 15, obj17), 18, obj18), 13, obj19), 11, obj20), 16, obj21), 24, obj22), 18, obj23), 14, valueOf22), 26, valueOf23), 20, obj24), 25, valueOf24), 22, valueOf25), 16, valueOf26), 18, valueOf27), 19, valueOf28), 11, valueOf29), 20, valueOf30), 16, valueOf31) + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "Place{formattedAddress=", str, ", shortFormattedAddress=", str2);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", adrFormatAddress=", str3, ", addressComponents=", valueOf);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", attributions=", valueOf2, ", businessStatus=", valueOf3);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", consumerAlert=", valueOf4, ", curbsidePickup=", obj);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", currentOpeningHours=", valueOf5, ", delivery=", obj2);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", dineIn=", obj3, ", editorialSummary=", str4);
        sb.append(", editorialSummaryLanguageCode=");
        sb.append(str5);
        sb.append(", iconBackgroundColor=");
        sb.append(num);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", iconMaskUrl=", str6, ", id=", str7);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", location=", valueOf6, ", displayName=", str8);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", displayNameLanguageCode=", str9, ", resourceName=", str10);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", openingHours=", valueOf7, ", internationalPhoneNumber=", str11);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", nationalPhoneNumber=", str12, ", photoMetadatas=", valueOf8);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", reviews=", valueOf9, ", placeTypes=", valueOf10);
        sb.append(", plusCode=");
        sb.append(valueOf11);
        sb.append(", priceLevel=");
        sb.append(num2);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", priceRange=", valueOf12, ", primaryType=", str13);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", primaryTypeDisplayName=", str14, ", primaryTypeDisplayNameLanguageCode=", str15);
        sb.append(", rating=");
        sb.append(d);
        sb.append(", reservable=");
        sb.append(obj4);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", secondaryOpeningHours=", valueOf13, ", currentSecondaryOpeningHours=", valueOf14);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", servesBeer=", obj5, ", servesBreakfast=", obj6);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", servesBrunch=", obj7, ", servesDinner=", obj8);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", servesLunch=", obj9, ", servesVegetarianFood=", obj10);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", servesWine=", obj11, ", takeout=", obj12);
        sb.append(", userRatingCount=");
        sb.append(num3);
        sb.append(", utcOffsetMinutes=");
        sb.append(num4);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", viewport=", valueOf15, ", websiteUri=", valueOf16);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", googleMapsUri=", valueOf17, ", accessibilityOptions=", valueOf18);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", parkingOptions=", valueOf19, ", paymentOptions=", valueOf20);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", evChargeOptions=", valueOf21, ", outdoorSeating=", obj13);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", liveMusic=", obj14, ", menuForChildren=", obj15);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", servesCocktails=", obj16, ", servesDessert=", obj17);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", servesCoffee=", obj18, ", goodForChildren=", obj19);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", allowsDogs=", obj20, ", restroom=", obj21);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", goodForGroups=", obj22, ", goodForWatchingSports=", obj23);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", subDestinations=", valueOf22, ", fuelOptions=", valueOf23);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", pureServiceAreaBusiness=", obj24, ", generativeSummary=", valueOf24);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", evChargeAmenitySummary=", valueOf25, ", neighborhoodSummary=", valueOf26);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", reviewSummary=", valueOf27, ", googleMapsLinks=", valueOf28);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", containingPlaces=", valueOf29, ", timeZone=", valueOf30);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", addressDescriptor=", valueOf31, ", postalAddress=", valueOf32);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        if (str == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str);
        }
        String str2 = this.zzb;
        if (str2 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str2);
        }
        String str3 = this.zzc;
        if (str3 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str3);
        }
        parcel.writeParcelable(this.zzd, i);
        parcel.writeList(this.zze);
        parcel.writeParcelable(this.zzf, i);
        parcel.writeParcelable(this.zzg, i);
        parcel.writeParcelable(this.zzh, i);
        parcel.writeParcelable(this.zzi, i);
        parcel.writeParcelable(this.zzj, i);
        parcel.writeParcelable(this.zzk, i);
        String str4 = this.zzl;
        if (str4 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str4);
        }
        String str5 = this.zzm;
        if (str5 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str5);
        }
        Integer num = this.zzn;
        if (num == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(num.intValue());
        }
        String str6 = this.zzo;
        if (str6 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str6);
        }
        String str7 = this.zzp;
        if (str7 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str7);
        }
        parcel.writeParcelable(this.zzq, i);
        String str8 = this.zzr;
        if (str8 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str8);
        }
        String str9 = this.zzs;
        if (str9 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str9);
        }
        String str10 = this.zzt;
        if (str10 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str10);
        }
        parcel.writeParcelable(this.zzu, i);
        String str11 = this.zzv;
        if (str11 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str11);
        }
        String str12 = this.zzw;
        if (str12 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str12);
        }
        parcel.writeList(this.zzx);
        parcel.writeList(this.zzy);
        parcel.writeList(this.zzz);
        parcel.writeParcelable(this.zzA, i);
        Integer num2 = this.zzB;
        if (num2 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeParcelable(this.zzC, i);
        String str13 = this.zzD;
        if (str13 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str13);
        }
        String str14 = this.zzE;
        if (str14 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str14);
        }
        String str15 = this.zzF;
        if (str15 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str15);
        }
        Double d = this.zzG;
        if (d == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeParcelable(this.zzH, i);
        parcel.writeList(this.zzI);
        parcel.writeList(this.zzJ);
        parcel.writeParcelable(this.zzK, i);
        parcel.writeParcelable(this.zzL, i);
        parcel.writeParcelable(this.zzM, i);
        parcel.writeParcelable(this.zzN, i);
        parcel.writeParcelable(this.zzO, i);
        parcel.writeParcelable(this.zzP, i);
        parcel.writeParcelable(this.zzQ, i);
        parcel.writeParcelable(this.zzR, i);
        Integer num3 = this.zzS;
        if (num3 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.zzT;
        if (num4 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeParcelable(this.zzU, i);
        parcel.writeParcelable(this.zzV, i);
        parcel.writeParcelable(this.zzW, i);
        parcel.writeParcelable(this.zzX, i);
        parcel.writeParcelable(this.zzY, i);
        parcel.writeParcelable(this.zzZ, i);
        parcel.writeParcelable(this.zzaa, i);
        parcel.writeParcelable(this.zzab, i);
        parcel.writeParcelable(this.zzac, i);
        parcel.writeParcelable(this.zzad, i);
        parcel.writeParcelable(this.zzae, i);
        parcel.writeParcelable(this.zzaf, i);
        parcel.writeParcelable(this.zzag, i);
        parcel.writeParcelable(this.zzah, i);
        parcel.writeParcelable(this.zzai, i);
        parcel.writeParcelable(this.zzaj, i);
        parcel.writeParcelable(this.zzak, i);
        parcel.writeParcelable(this.zzal, i);
        parcel.writeList(this.zzam);
        parcel.writeParcelable(this.zzan, i);
        parcel.writeParcelable(this.zzao, i);
        parcel.writeParcelable(this.zzap, i);
        parcel.writeParcelable(this.zzaq, i);
        parcel.writeParcelable(this.zzar, i);
        parcel.writeParcelable(this.zzas, i);
        parcel.writeParcelable(this.zzat, i);
        parcel.writeList(this.zzau);
        ZoneId zoneId = this.zzav;
        if (zoneId == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(zoneId);
        }
        parcel.writeParcelable(this.zzaw, i);
        parcel.writeParcelable(this.zzax, i);
    }
}
