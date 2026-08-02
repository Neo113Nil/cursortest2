package com.google.android.libraries.places.internal;

import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.Exif;
import androidx.media3.extractor.mkv.Sniffer;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.RequestQueue;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.DayOfWeek;
import com.google.android.libraries.places.api.model.EVConnectorType;
import com.google.android.libraries.places.api.model.FuelPrice$FuelType;
import com.google.android.libraries.places.api.model.OpeningHours$HoursType;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.zzbm;
import com.google.android.libraries.places.api.model.zzcm;
import com.google.android.libraries.places.api.model.zzda;
import com.google.android.libraries.places.api.model.zzdm;
import com.google.android.libraries.places.api.model.zzds;
import com.google.android.libraries.places.api.model.zzdu;
import com.google.android.libraries.places.api.model.zzdw;
import com.google.android.libraries.places.api.model.zzec;
import com.google.android.libraries.places.api.model.zzee;
import com.google.android.libraries.places.api.model.zzeg;
import com.google.android.libraries.places.api.model.zzei;
import com.google.android.libraries.places.api.model.zzek;
import com.google.android.libraries.places.api.model.zzeq;
import com.google.android.libraries.places.api.model.zzes;
import com.google.android.libraries.places.api.model.zzfc;
import com.google.android.libraries.places.api.model.zzfe;
import com.google.android.libraries.places.api.model.zzfq;
import com.google.android.libraries.places.api.model.zzfw;
import com.google.android.libraries.places.api.model.zzgi;
import com.google.android.libraries.places.api.model.zzgk;
import com.google.common.base.Splitter;
import com.google.common.collect.CollectCollectors;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableList;
import com.google.common.collect.RegularImmutableMap;
import com.plaid.internal.EnumC0170g;
import com.squareup.workflow1.internal.SubtreeManager;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import okhttp3.internal.http.StatusLine;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes4.dex */
public final class zzjm {
    public final RegularImmutableMap zza;
    public final RegularImmutableMap zzb;
    public final RegularImmutableMap zzc;
    public final RegularImmutableMap zzd;

    public zzjm() {
        StatusLine builder = RegularImmutableMap.builder();
        builder.put(zzbez.OPERATIONAL, Place.BusinessStatus.OPERATIONAL);
        builder.put(zzbez.CLOSED_TEMPORARILY, Place.BusinessStatus.CLOSED_TEMPORARILY);
        builder.put(zzbez.CLOSED_PERMANENTLY, Place.BusinessStatus.CLOSED_PERMANENTLY);
        this.zza = builder.build(true);
        StatusLine builder2 = RegularImmutableMap.builder();
        builder2.put(zzbfv.ACCESS, OpeningHours$HoursType.ACCESS);
        builder2.put(zzbfv.BREAKFAST, OpeningHours$HoursType.BREAKFAST);
        builder2.put(zzbfv.BRUNCH, OpeningHours$HoursType.BRUNCH);
        builder2.put(zzbfv.DELIVERY, OpeningHours$HoursType.DELIVERY);
        builder2.put(zzbfv.DINNER, OpeningHours$HoursType.DINNER);
        builder2.put(zzbfv.DRIVE_THROUGH, OpeningHours$HoursType.DRIVE_THROUGH);
        builder2.put(zzbfv.HAPPY_HOUR, OpeningHours$HoursType.HAPPY_HOUR);
        builder2.put(zzbfv.KITCHEN, OpeningHours$HoursType.KITCHEN);
        builder2.put(zzbfv.LUNCH, OpeningHours$HoursType.LUNCH);
        builder2.put(zzbfv.ONLINE_SERVICE_HOURS, OpeningHours$HoursType.ONLINE_SERVICE_HOURS);
        builder2.put(zzbfv.PICKUP, OpeningHours$HoursType.PICKUP);
        builder2.put(zzbfv.SENIOR_HOURS, OpeningHours$HoursType.SENIOR_HOURS);
        builder2.put(zzbfv.TAKEOUT, OpeningHours$HoursType.TAKEOUT);
        this.zzb = builder2.build(true);
        StatusLine builder3 = RegularImmutableMap.builder();
        builder3.put(zzbdy.EV_CONNECTOR_TYPE_UNSPECIFIED, EVConnectorType.EV_CONNECTOR_TYPE_UNSPECIFIED);
        builder3.put(zzbdy.EV_CONNECTOR_TYPE_OTHER, EVConnectorType.EV_CONNECTOR_TYPE_OTHER);
        builder3.put(zzbdy.EV_CONNECTOR_TYPE_J1772, EVConnectorType.EV_CONNECTOR_TYPE_J1772);
        builder3.put(zzbdy.EV_CONNECTOR_TYPE_TYPE_2, EVConnectorType.EV_CONNECTOR_TYPE_TYPE_2);
        builder3.put(zzbdy.EV_CONNECTOR_TYPE_CHADEMO, EVConnectorType.EV_CONNECTOR_TYPE_CHADEMO);
        builder3.put(zzbdy.EV_CONNECTOR_TYPE_CCS_COMBO_1, EVConnectorType.EV_CONNECTOR_TYPE_CCS_COMBO_1);
        builder3.put(zzbdy.EV_CONNECTOR_TYPE_CCS_COMBO_2, EVConnectorType.EV_CONNECTOR_TYPE_CCS_COMBO_2);
        builder3.put(zzbdy.EV_CONNECTOR_TYPE_TESLA, EVConnectorType.EV_CONNECTOR_TYPE_TESLA);
        builder3.put(zzbdy.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T, EVConnectorType.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T);
        builder3.put(zzbdy.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET, EVConnectorType.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET);
        builder3.put(zzbdy.EV_CONNECTOR_TYPE_NACS, EVConnectorType.EV_CONNECTOR_TYPE_NACS);
        this.zzc = builder3.build(true);
        StatusLine builder4 = RegularImmutableMap.builder();
        builder4.put(zzbeb.FUEL_TYPE_UNSPECIFIED, FuelPrice$FuelType.FUEL_TYPE_UNSPECIFIED);
        builder4.put(zzbeb.DIESEL, FuelPrice$FuelType.DIESEL);
        builder4.put(zzbeb.REGULAR_UNLEADED, FuelPrice$FuelType.REGULAR_UNLEADED);
        builder4.put(zzbeb.MIDGRADE, FuelPrice$FuelType.MIDGRADE);
        builder4.put(zzbeb.PREMIUM, FuelPrice$FuelType.PREMIUM);
        builder4.put(zzbeb.SP91, FuelPrice$FuelType.SP91);
        builder4.put(zzbeb.SP91_E10, FuelPrice$FuelType.SP91_E10);
        builder4.put(zzbeb.SP92, FuelPrice$FuelType.SP92);
        builder4.put(zzbeb.SP95, FuelPrice$FuelType.SP95);
        builder4.put(zzbeb.SP95_E10, FuelPrice$FuelType.SP95_E10);
        builder4.put(zzbeb.SP98, FuelPrice$FuelType.SP98);
        builder4.put(zzbeb.SP99, FuelPrice$FuelType.SP99);
        builder4.put(zzbeb.SP100, FuelPrice$FuelType.SP100);
        builder4.put(zzbeb.LPG, FuelPrice$FuelType.LPG);
        builder4.put(zzbeb.E80, FuelPrice$FuelType.E80);
        builder4.put(zzbeb.E85, FuelPrice$FuelType.E85);
        builder4.put(zzbeb.METHANE, FuelPrice$FuelType.METHANE);
        builder4.put(zzbeb.BIO_DIESEL, FuelPrice$FuelType.BIO_DIESEL);
        builder4.put(zzbeb.TRUCK_DIESEL, FuelPrice$FuelType.TRUCK_DIESEL);
        this.zzd = builder4.build(true);
    }

    public static final ApiException zzj(String str) {
        return new ApiException(new Status(8, "Unexpected server error: ".concat(str), null, null));
    }

    public static final String zzk(String str) {
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public static final Place.BooleanPlaceAttributeValue zzm(boolean z, boolean z2) {
        return !z ? Place.BooleanPlaceAttributeValue.UNKNOWN : z2 ? Place.BooleanPlaceAttributeValue.TRUE : Place.BooleanPlaceAttributeValue.FALSE;
    }

    public static final com.google.android.libraries.places.api.model.zzeu zzr(zzboa zzboaVar) {
        String zzc = zzboaVar.zzc();
        long zze = zzboaVar.zze();
        Long valueOf = Long.valueOf(zze);
        int zzf = zzboaVar.zzf();
        Integer valueOf2 = Integer.valueOf(zzf);
        if (zzc == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null currencyCode");
            return null;
        }
        if (zze > 0) {
            Trace.checkArgument("Unit is positive and nano must be positive or zero, but was: %s.", valueOf2, zzf >= 0);
        } else if (zze < 0) {
            Trace.checkArgument("Unit is negative and nano must be negative or zero, but was: %s.", valueOf2, zzf <= 0);
        }
        return new com.google.android.libraries.places.api.model.zzeu(valueOf2, valueOf, zzc);
    }

    public static final Uri zzt(String str) {
        if (str.isEmpty()) {
            return null;
        }
        return Uri.parse(str);
    }

    public static final zzda zzu(zzbcb zzbcbVar) {
        String zza = zzbcbVar.zza();
        if (zza.isEmpty()) {
            throw zzj("Author name not provided for an AuthorAttribution result.");
        }
        String zzk = zzk(zzbcbVar.zzc());
        String zzk2 = zzk(zzbcbVar.zzd());
        Trace.checkArgument("Name must not be empty.", !zza.isEmpty());
        return new zzda(zza, zzk, zzk2);
    }

    public static final zzdu zzv(zzbdb zzbdbVar) {
        String zzk = zzk(zzbdbVar.zza().zzc());
        String zzk2 = zzk(zzbdbVar.zza().zze());
        ImmutableList immutableList = null;
        List zzc = zzbdbVar.zzc().isEmpty() ? null : zzbdbVar.zzc();
        if (!zzbdbVar.zzc().isEmpty()) {
            Stream map = zzbdbVar.zzc().stream().map(zzjf.zza);
            ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
            immutableList = (ImmutableList) map.collect(CollectCollectors.TO_IMMUTABLE_LIST);
        }
        if (zzc != null) {
            zzc = ImmutableList.copyOf((Collection) zzc);
        }
        if (immutableList != null) {
            immutableList = ImmutableList.copyOf((Collection) immutableList);
        }
        return new zzdu(zzk, zzk2, zzc, immutableList);
    }

    public static final zzgk zzw(zzbft zzbftVar) {
        zzeq zzeqVar;
        DayOfWeek dayOfWeek;
        int zza = zzbftVar.zza();
        zzes newInstance = zzes.newInstance(zzbftVar.zzc(), zzbftVar.zzd());
        if (zzbftVar.zze()) {
            zzbnu zzf = zzbftVar.zzf();
            zzeqVar = zzeq.newInstance(zzf.zzc(), zzf.zze(), zzf.zzf());
        } else {
            zzeqVar = null;
        }
        switch (zza) {
            case 0:
                dayOfWeek = DayOfWeek.SUNDAY;
                break;
            case 1:
                dayOfWeek = DayOfWeek.MONDAY;
                break;
            case 2:
                dayOfWeek = DayOfWeek.TUESDAY;
                break;
            case 3:
                dayOfWeek = DayOfWeek.WEDNESDAY;
                break;
            case 4:
                dayOfWeek = DayOfWeek.THURSDAY;
                break;
            case 5:
                dayOfWeek = DayOfWeek.FRIDAY;
                break;
            case 6:
                dayOfWeek = DayOfWeek.SATURDAY;
                break;
            default:
                throw zzj("Day of week must an integer between 0 and 6");
        }
        zzcm builder = zzgk.builder(dayOfWeek, newInstance);
        builder.zza = zzeqVar;
        builder.zzd = zzbftVar.zzg();
        builder.zze = (byte) 1;
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0887  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0936  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x096b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x09c3  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0c92  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0ce2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0cf9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0d0c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0d1f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0d4b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0d15  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0d02  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0cef  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0c95  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x09c9  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x09b5  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0903  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04c6  */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v5, types: [com.google.android.libraries.places.api.model.zzdc] */
    /* JADX WARN: Type inference failed for: r23v3, types: [int] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v8, types: [com.google.android.libraries.places.api.model.zzfi] */
    /* JADX WARN: Type inference failed for: r24v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.libraries.places.api.model.zzfi zza(zzbgj zzbgjVar) {
        com.google.android.libraries.places.api.model.zzcu zzcuVar;
        com.google.android.libraries.places.api.model.zzcw zzcwVar;
        String zza;
        List list;
        com.google.android.libraries.places.api.model.zzdo zzdoVar;
        RegularImmutableList build;
        zzec zzecVar;
        zzdw zzdwVar;
        zzee zzeeVar;
        zzei zzeiVar;
        zzek zzekVar;
        Integer valueOf;
        LatLng latLng;
        com.google.android.libraries.places.api.model.zzew zzewVar;
        zzbkb<zzben> zzG;
        ArrayList arrayList;
        ?? r24;
        Object next;
        boolean z;
        com.google.android.libraries.places.api.model.zzfi zzfiVar;
        ?? zzdcVar;
        com.google.android.libraries.places.api.model.zzfm zzfmVar;
        com.google.android.libraries.places.api.model.zzfo zzfoVar;
        zzfw zzfwVar;
        zzbkb zzz;
        ArrayList arrayList2;
        double d;
        String str;
        Iterator it;
        String str2;
        zzeq zzeqVar;
        zzbkb<zzbgi> zzaR;
        ArrayList arrayList3;
        zzgi zzgiVar;
        LatLngBounds latLngBounds;
        com.google.android.libraries.places.api.model.zzdq zzdqVar;
        List list2;
        List list3;
        zzbm builder = Place.builder();
        zzber zzaS = zzbgjVar.zzaS();
        builder.zzX = new com.google.android.libraries.places.api.model.zzcq(zzm(zzaS.zza(), zzaS.zzc()), zzm(zzaS.zzd(), zzaS.zze()), zzm(zzaS.zzf(), zzaS.zzg()), zzm(zzaS.zzh(), zzaS.zzi()));
        zzbkb<zzbet> zzp = zzbgjVar.zzp();
        String str3 = "Null name";
        String str4 = ".";
        boolean z2 = false;
        z2 = false;
        com.google.android.libraries.places.api.model.zzfi zzfiVar2 = null;
        if (zzp.isEmpty()) {
            zzcuVar = null;
        } else {
            ArrayList arrayList4 = new ArrayList();
            for (zzbet zzbetVar : zzp) {
                try {
                    String zza2 = zzbetVar.zza();
                    zzbkb zzd = zzbetVar.zzd();
                    com.google.android.gms.maps.zzah zzahVar = new com.google.android.gms.maps.zzah(17, z2);
                    if (zza2 == null) {
                        throw new NullPointerException("Null name");
                    }
                    zzahVar.f68zza = zza2;
                    if (zzd == null) {
                        throw new NullPointerException("Null types");
                    }
                    zzahVar.zzc = zzd;
                    zzahVar.zzb = zzk(zzbetVar.zzc());
                    arrayList4.add(zzahVar.build());
                } catch (IllegalArgumentException e) {
                    throw zzj("AddressComponent is not properly defined: " + e.getMessage() + ".");
                }
            }
            zzcuVar = new com.google.android.libraries.places.api.model.zzcu(arrayList4);
        }
        builder.zzd = zzcuVar;
        int i = 4;
        if (zzbgjVar.zzbc()) {
            zzbbz zzbd = zzbgjVar.zzbd();
            if (zzbd.zza().isEmpty()) {
                list2 = null;
            } else {
                Stream map = zzbd.zza().stream().map(new zzjf(i));
                ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
                list2 = (List) map.collect(CollectCollectors.TO_IMMUTABLE_LIST);
            }
            if (zzbd.zzc().isEmpty()) {
                list3 = null;
            } else {
                Stream map2 = zzbd.zzc().stream().map(new zzjf(false ? 1 : 0));
                ImmutableList.Itr itr2 = ImmutableList.EMPTY_ITR;
                list3 = (List) map2.collect(CollectCollectors.TO_IMMUTABLE_LIST);
            }
            if (list2 != null) {
                list2 = ImmutableList.copyOf((Collection) list2);
            }
            if (list3 != null) {
                list3 = ImmutableList.copyOf((Collection) list3);
            }
            zzcwVar = new com.google.android.libraries.places.api.model.zzcw(list2, list3);
        } else {
            zzcwVar = null;
        }
        builder.zzaw = zzcwVar;
        String zzH = zzbgjVar.zzH();
        if (zzH.isEmpty()) {
            zza = null;
        } else {
            Sniffer sniffer = zzabb.zzb;
            zza = zzabb.zza(zzwr.zzb(zzH));
        }
        builder.zzc = zza;
        builder.zzai = zzm(zzbgjVar.zzaH(), zzbgjVar.zzaI());
        zzbkb zzK = zzbgjVar.zzK();
        int i2 = 3;
        if (zzK.isEmpty()) {
            list = null;
        } else {
            Stream map3 = zzK.stream().map(new zzjf(i2));
            ImmutableList.Itr itr3 = ImmutableList.EMPTY_ITR;
            list = (List) map3.collect(CollectCollectors.TO_IMMUTABLE_LIST);
        }
        builder.zze = list;
        Object obj = this.zza.get(zzbgjVar.zzI());
        if (obj == null) {
            obj = null;
        }
        builder.zzf = (Place.BusinessStatus) obj;
        if (zzbgjVar.zzbn()) {
            zzbff zzbo = zzbgjVar.zzbo();
            String zzk = zzk(zzbo.zza());
            if (zzbo.zzc()) {
                zzbfe zzd2 = zzbo.zzd();
                zzdqVar = new com.google.android.libraries.places.api.model.zzdq(zzt(zzd2.zzd().zzc()), zzk(zzd2.zza()), zzk(zzd2.zzc()), zzk(zzd2.zzd().zza()));
            } else {
                zzdqVar = null;
            }
            zzdoVar = new com.google.android.libraries.places.api.model.zzdo(zzk, zzdqVar, zzk(zzbo.zze()));
        } else {
            zzdoVar = null;
        }
        builder.zzg = zzdoVar;
        zzbkb<zzbfh> zzaZ = zzbgjVar.zzaZ();
        if (zzaZ.isEmpty()) {
            build = null;
        } else {
            ImmutableList.Builder builder2 = ImmutableList.builder();
            for (zzbfh zzbfhVar : zzaZ) {
                String zzk2 = zzk(zzbfhVar.zza());
                String zzk3 = zzk(zzbfhVar.zzc());
                zzds zzdsVar = (zzk2 == null || zzk3 == null) ? null : new zzds(zzk2, zzk3);
                if (zzdsVar != null) {
                    builder2.m2032add((Object) zzdsVar);
                }
            }
            build = builder2.build();
        }
        builder.zzau = build;
        builder.zzh = zzm(zzbgjVar.zzV(), zzbgjVar.zzW());
        builder.zzi = zzbgjVar.zzan() ? zzi(zzbgjVar.zzao()) : null;
        builder.zzJ = zzh(zzbgjVar.zzap());
        builder.zzj = zzm(zzbgjVar.zzR(), zzbgjVar.zzS());
        builder.zzk = zzm(zzbgjVar.zzT(), zzbgjVar.zzU());
        builder.zzr = zzbgjVar.zzd() ? zzk(zzbgjVar.zze().zzc()) : null;
        builder.zzs = zzbgjVar.zzd() ? zzk(zzbgjVar.zze().zze()) : null;
        builder.zzl = zzbgjVar.zzar() ? zzk(zzbgjVar.zzas().zzc()) : null;
        builder.zzm = zzbgjVar.zzar() ? zzk(zzbgjVar.zzas().zze()) : null;
        if (zzbgjVar.zzbj()) {
            zzbfj zzbk = zzbgjVar.zzbk();
            zzecVar = new zzec(zzv(zzbk.zza()), zzbk.zzc() ? zzv(zzbk.zzd()) : null, zzbk.zze() ? zzv(zzbk.zzf()) : null, zzbk.zzg() ? zzv(zzbk.zzh()) : null, zzt(zzbk.zzi()), zzk(zzbk.zzj().zzc()), zzk(zzbk.zzj().zze()));
        } else {
            zzecVar = null;
        }
        builder.zzaq = zzecVar;
        final int i3 = 1;
        if (zzbgjVar.zzaV()) {
            zzbdx zzaW = zzbgjVar.zzaW();
            Integer valueOf2 = Integer.valueOf(zzaW.zza());
            Stream map4 = zzaW.zzc().stream().map(new Function(this) { // from class: com.google.android.libraries.places.internal.zzjj
                public final /* synthetic */ zzjm zza;

                {
                    this.zza = this;
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    int i4 = i3;
                    Instant instant = null;
                    zzjm zzjmVar = this.zza;
                    switch (i4) {
                        case 0:
                            zzbec zzbecVar = (zzbec) obj2;
                            Object obj3 = zzjmVar.zzd.get(zzbecVar.zza());
                            if (obj3 == null) {
                                obj3 = FuelPrice$FuelType.FUEL_TYPE_UNSPECIFIED;
                            }
                            FuelPrice$FuelType fuelPrice$FuelType = (FuelPrice$FuelType) obj3;
                            com.google.android.libraries.places.api.model.zzeu zzr = zzjm.zzr(zzbecVar.zzc());
                            Instant ofEpochSecond = Instant.ofEpochSecond(zzbecVar.zzd().zzc(), r10.zze());
                            if (ofEpochSecond != null) {
                                return new zzeg(fuelPrice$FuelType, zzr, ofEpochSecond);
                            }
                            a$$ExternalSyntheticBUOutline0.m$2("Null updateTime");
                            return null;
                        default:
                            zzbdu zzbduVar = (zzbdu) obj2;
                            Object obj4 = zzjmVar.zzc.get(zzbduVar.zza());
                            if (obj4 == null) {
                                obj4 = EVConnectorType.EV_CONNECTOR_TYPE_UNSPECIFIED;
                            }
                            EVConnectorType eVConnectorType = (EVConnectorType) obj4;
                            Double valueOf3 = Double.valueOf(zzbduVar.zzc());
                            Integer valueOf4 = Integer.valueOf(zzbduVar.zzd());
                            Integer valueOf5 = zzbduVar.zze() ? Integer.valueOf(zzbduVar.zzf()) : null;
                            Integer valueOf6 = zzbduVar.zzg() ? Integer.valueOf(zzbduVar.zzh()) : null;
                            if (zzbduVar.zzi()) {
                                instant = Instant.ofEpochSecond(zzbduVar.zzj().zzc(), r9.zze());
                            }
                            return new zzdm(eVConnectorType, valueOf3, valueOf4, valueOf5, valueOf6, instant);
                    }
                }
            });
            ImmutableList.Itr itr4 = ImmutableList.EMPTY_ITR;
            ImmutableList immutableList = (ImmutableList) map4.collect(CollectCollectors.TO_IMMUTABLE_LIST);
            if (immutableList == null) {
                a$$ExternalSyntheticBUOutline0.m$2("Null connectorAggregations");
                return null;
            }
            zzdwVar = new zzdw(immutableList, valueOf2);
        } else {
            zzdwVar = null;
        }
        builder.zzaa = zzdwVar;
        builder.zza = zzk(zzbgjVar.zzl());
        if (zzbgjVar.zzaT()) {
            Stream stream = zzbgjVar.zzaU().zza().stream();
            final int i4 = false ? 1 : 0;
            Stream map5 = stream.map(new Function(this) { // from class: com.google.android.libraries.places.internal.zzjj
                public final /* synthetic */ zzjm zza;

                {
                    this.zza = this;
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    int i42 = i4;
                    Instant instant = null;
                    zzjm zzjmVar = this.zza;
                    switch (i42) {
                        case 0:
                            zzbec zzbecVar = (zzbec) obj2;
                            Object obj3 = zzjmVar.zzd.get(zzbecVar.zza());
                            if (obj3 == null) {
                                obj3 = FuelPrice$FuelType.FUEL_TYPE_UNSPECIFIED;
                            }
                            FuelPrice$FuelType fuelPrice$FuelType = (FuelPrice$FuelType) obj3;
                            com.google.android.libraries.places.api.model.zzeu zzr = zzjm.zzr(zzbecVar.zzc());
                            Instant ofEpochSecond = Instant.ofEpochSecond(zzbecVar.zzd().zzc(), r10.zze());
                            if (ofEpochSecond != null) {
                                return new zzeg(fuelPrice$FuelType, zzr, ofEpochSecond);
                            }
                            a$$ExternalSyntheticBUOutline0.m$2("Null updateTime");
                            return null;
                        default:
                            zzbdu zzbduVar = (zzbdu) obj2;
                            Object obj4 = zzjmVar.zzc.get(zzbduVar.zza());
                            if (obj4 == null) {
                                obj4 = EVConnectorType.EV_CONNECTOR_TYPE_UNSPECIFIED;
                            }
                            EVConnectorType eVConnectorType = (EVConnectorType) obj4;
                            Double valueOf3 = Double.valueOf(zzbduVar.zzc());
                            Integer valueOf4 = Integer.valueOf(zzbduVar.zzd());
                            Integer valueOf5 = zzbduVar.zze() ? Integer.valueOf(zzbduVar.zzf()) : null;
                            Integer valueOf6 = zzbduVar.zzg() ? Integer.valueOf(zzbduVar.zzh()) : null;
                            if (zzbduVar.zzi()) {
                                instant = Instant.ofEpochSecond(zzbduVar.zzj().zzc(), r9.zze());
                            }
                            return new zzdm(eVConnectorType, valueOf3, valueOf4, valueOf5, valueOf6, instant);
                    }
                }
            });
            ImmutableList.Itr itr5 = ImmutableList.EMPTY_ITR;
            ImmutableList immutableList2 = (ImmutableList) map5.collect(CollectCollectors.TO_IMMUTABLE_LIST);
            if (immutableList2 == null) {
                a$$ExternalSyntheticBUOutline0.m$2("Null fuelPrices");
                return null;
            }
            ImmutableList copyOf = ImmutableList.copyOf((Collection) immutableList2);
            if (copyOf == null) {
                a$$ExternalSyntheticBUOutline0.m$2("Null fuelPrices");
                return null;
            }
            zzeeVar = new zzee(copyOf);
        } else {
            zzeeVar = null;
        }
        builder.zzan = zzeeVar;
        if (zzbgjVar.zzaX()) {
            zzbfl zzaY = zzbgjVar.zzaY();
            zzeiVar = new zzei(zzaY.zza() ? zzk(zzaY.zzc().zzc()) : null, zzaY.zza() ? zzk(zzaY.zzc().zze()) : null, zzt(zzaY.zzd()), zzaY.zze() ? zzk(zzaY.zzf().zzc()) : null, zzaY.zze() ? zzk(zzaY.zzf().zze()) : null);
        } else {
            zzeiVar = null;
        }
        builder.zzap = zzeiVar;
        builder.zzah = zzm(zzbgjVar.zzaF(), zzbgjVar.zzaG());
        builder.zzak = zzm(zzbgjVar.zzaL(), zzbgjVar.zzaM());
        builder.zzal = zzm(zzbgjVar.zzaN(), zzbgjVar.zzaO());
        if (zzbgjVar.zzbe()) {
            zzbfn zzbf = zzbgjVar.zzbf();
            zzekVar = new zzek(zzt(zzbf.zza()), zzt(zzbf.zzc()), zzt(zzbf.zzd()), zzt(zzbf.zze()), zzt(zzbf.zzf()));
        } else {
            zzekVar = null;
        }
        builder.zzat = zzekVar;
        builder.zzW = zzt(zzbgjVar.zzx());
        String zzO = zzbgjVar.zzO();
        if (!zzO.isEmpty()) {
            try {
                valueOf = Integer.valueOf(Color.parseColor(zzO));
            } catch (IllegalArgumentException unused) {
            }
            builder.zzn = valueOf;
            String zzN = zzbgjVar.zzN();
            builder.zzo = zzN.isEmpty() ? zzN.concat(".png") : null;
            builder.zzp = zzk(zzbgjVar.zzc());
            builder.zzv = zzk(zzbgjVar.zzk());
            builder.zzac = zzm(zzbgjVar.zzav(), zzbgjVar.zzaw());
            if (zzbgjVar.zzs()) {
                latLng = null;
            } else {
                zzbnw zzt = zzbgjVar.zzt();
                latLng = new LatLng(zzt.zzc(), zzt.zze());
            }
            builder.zzq = latLng;
            builder.zzad = zzm(zzbgjVar.zzax(), zzbgjVar.zzay());
            builder.zzw = zzk(zzbgjVar.zzj());
            if (zzbgjVar.zzbl()) {
                zzewVar = null;
            } else {
                zzbfp zzbm = zzbgjVar.zzbm();
                zzewVar = new com.google.android.libraries.places.api.model.zzew(zzbm.zza() ? zzv(zzbm.zzc()) : null, zzbm.zzd() ? zzv(zzbm.zze()) : null, zzt(zzbm.zzf()), zzk(zzbm.zzg().zzc()), zzk(zzbm.zzg().zze()));
            }
            builder.zzar = zzewVar;
            builder.zzu = !zzbgjVar.zzA() ? zzi(zzbgjVar.zzB()) : null;
            builder.zzab = zzm(zzbgjVar.zzat(), zzbgjVar.zzau());
            zzbga zzaQ = zzbgjVar.zzaQ();
            builder.zzY = new com.google.android.libraries.places.api.model.zzfa(zzm(zzaQ.zza(), zzaQ.zzc()), zzm(zzaQ.zzd(), zzaQ.zze()), zzm(zzaQ.zzf(), zzaQ.zzg()), zzm(zzaQ.zzh(), zzaQ.zzi()), zzm(zzaQ.zzj(), zzaQ.zzk()), zzm(zzaQ.zzl(), zzaQ.zzm()), zzm(zzaQ.zzn(), zzaQ.zzo()));
            zzbgc zzaP = zzbgjVar.zzaP();
            builder.zzZ = new zzfc(zzm(zzaP.zza(), zzaP.zzc()), zzm(zzaP.zzd(), zzaP.zze()), zzm(zzaP.zzf(), zzaP.zzg()), zzm(zzaP.zzh(), zzaP.zzi()));
            zzG = zzbgjVar.zzG();
            int i5 = 2;
            if (zzG.isEmpty()) {
                arrayList = new ArrayList();
                for (zzben zzbenVar : zzG) {
                    String zza3 = zzbenVar.zza();
                    if (zza3.isEmpty() || zza3.split("/").length != 4) {
                        throw zzj("Photo reference not provided for a PhotoMetadata result.");
                    }
                    Iterable anonymousClass5 = new Splitter.AnonymousClass5(Splitter.on('/'), zza3);
                    if (anonymousClass5 instanceof List) {
                        next = ((List) anonymousClass5).get(3);
                    } else {
                        Iterator it2 = anonymousClass5.iterator();
                        it2.getClass();
                        Trace.checkArgument("numberToAdvance must be nonnegative", true);
                        int i6 = z2 ? 1 : 0;
                        while (i6 < 3 && it2.hasNext()) {
                            it2.next();
                            i6++;
                        }
                        Splitter.AnonymousClass1 anonymousClass1 = (Splitter.AnonymousClass1) it2;
                        if (!anonymousClass1.hasNext()) {
                            com.google.android.libraries.places.api.model.zzfi zzfiVar3 = zzfiVar2;
                            Path$$ExternalSyntheticBUOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i6, "position (3) must be less than the number of elements that remained (", ")"));
                            return zzfiVar3;
                        }
                        next = anonymousClass1.next();
                    }
                    String str5 = (String) next;
                    if (str5 == null) {
                        com.google.android.libraries.places.api.model.zzfi zzfiVar4 = zzfiVar2;
                        a$$ExternalSyntheticBUOutline0.m$2("Null photoReference");
                        return zzfiVar4;
                    }
                    byte b = (byte) (((byte) (0 | 2)) | 1);
                    String zza4 = zzbenVar.zza();
                    String str6 = (String) zzbenVar.zze().stream().map(new zzjf(i5)).collect(Collectors.joining(", "));
                    if (str6 == null) {
                        com.google.android.libraries.places.api.model.zzfi zzfiVar5 = zzfiVar2;
                        a$$ExternalSyntheticBUOutline0.m$2("Null attributions");
                        return zzfiVar5;
                    }
                    int zzd3 = zzbenVar.zzd();
                    int zzc = zzbenVar.zzc();
                    byte b2 = (byte) (((byte) (b | 1)) | 2);
                    zzbkb zze = zzbenVar.zze();
                    if (zze.isEmpty()) {
                        z = z2 ? 1 : 0;
                        com.google.android.libraries.places.api.model.zzfi zzfiVar6 = zzfiVar2;
                        zzfiVar = zzfiVar6;
                        zzdcVar = zzfiVar6;
                    } else {
                        z = z2 ? 1 : 0;
                        ImmutableList.Builder builder3 = ImmutableList.builder();
                        Iterator it3 = zze.iterator();
                        while (it3.hasNext()) {
                            builder3.m2032add((Object) zzu((zzbcb) it3.next()));
                            zzfiVar2 = zzfiVar2;
                        }
                        zzfiVar = zzfiVar2;
                        zzdcVar = new com.google.android.libraries.places.api.model.zzdc(ImmutableList.copyOf((Collection) builder3.build()));
                    }
                    Uri zzt2 = zzt(zzbenVar.zzf());
                    Uri zzt3 = zzt(zzbenVar.zzg());
                    if (b2 != 3) {
                        StringBuilder sb = new StringBuilder();
                        if ((b2 & 1) == 0) {
                            sb.append(" height");
                        }
                        if ((b2 & 2) == 0) {
                            sb.append(" width");
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("Missing required properties:".concat(sb.toString()));
                        return zzfiVar;
                    }
                    com.google.android.libraries.places.api.model.zzfg zzfgVar = new com.google.android.libraries.places.api.model.zzfg(str6, zzd3, zzc, str5, zza4, zzdcVar, zzt2, zzt3);
                    Trace.checkArgument("Width must not be < 0, but was: %s.", zzc, zzc >= 0 ? true : z);
                    Trace.checkArgument("Height must not be < 0, but was: %s.", zzd3, zzd3 >= 0 ? true : z);
                    Trace.checkArgument("PhotoReference must not be empty.", !str5.isEmpty());
                    arrayList.add(zzfgVar);
                    z2 = z;
                    zzfiVar2 = zzfiVar;
                }
                r24 = zzfiVar2;
            } else {
                arrayList = null;
                r24 = 0;
            }
            ?? r23 = z2;
            builder.zzx = arrayList;
            builder.zzz = !zzbgjVar.zzf().isEmpty() ? r24 : zzbgjVar.zzf();
            if (zzbgjVar.zzq()) {
                zzfmVar = r24;
            } else {
                zzbge zzr = zzbgjVar.zzr();
                zzfmVar = new com.google.android.libraries.places.api.model.zzfm(zzk(zzr.zzc()), zzk(zzr.zza()));
            }
            builder.zzA = zzfmVar;
            if (zzbgjVar.zzn()) {
                zzboc zzo = zzbgjVar.zzo();
                String zzk4 = zzk(zzo.zzc());
                if (zzk4 != null) {
                    String zzk5 = zzk(zzo.zze());
                    String zzk6 = zzk(zzo.zzf());
                    String zzk7 = zzk(zzo.zzg());
                    String zzk8 = zzk(zzo.zzh());
                    String zzk9 = zzk(zzo.zzi());
                    String zzk10 = zzk(zzo.zzj());
                    List zzk11 = zzo.zzk().isEmpty() ? r24 : zzo.zzk();
                    List zzl = zzo.zzl().isEmpty() ? r24 : zzo.zzl();
                    String zzk12 = zzk(zzo.zzm());
                    if (zzk11 != null) {
                        zzk11 = ImmutableList.copyOf((Collection) zzk11);
                    }
                    List list4 = zzk11;
                    if (zzl != null) {
                        zzl = ImmutableList.copyOf((Collection) zzl);
                    }
                    zzfoVar = new com.google.android.libraries.places.api.model.zzfo(zzk4, zzk5, zzk6, zzk7, zzk8, zzk9, zzk10, list4, zzl, zzk12);
                    builder.zzax = zzfoVar;
                    int ordinal = zzbgjVar.zzJ().ordinal();
                    builder.zzB = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? r24 : 4 : 3 : 2 : 1 : Integer.valueOf((int) r23);
                    builder.zzC = zzbgjVar.zzbg().zza() ? new zzfq(zzr(zzbgjVar.zzbg().zzc()), zzbgjVar.zzbg().zzd() ? zzr(zzbgjVar.zzbg().zze()) : r24) : r24;
                    builder.zzD = zzk(zzbgjVar.zzg());
                    builder.zzE = zzbgjVar.zzh() ? zzk(zzbgjVar.zzi().zzc()) : r24;
                    builder.zzF = zzbgjVar.zzh() ? zzk(zzbgjVar.zzi().zze()) : r24;
                    builder.zzao = zzm(zzbgjVar.zzba(), zzbgjVar.zzbb());
                    double zzw = zzbgjVar.zzw();
                    double d2 = 1.0d;
                    builder.zzG = zzw < 1.0d ? r24 : Double.valueOf(zzw);
                    builder.zzH = zzm(zzbgjVar.zzX(), zzbgjVar.zzY());
                    builder.zzt = zzk(zzbgjVar.zza());
                    builder.zzaj = zzm(zzbgjVar.zzaJ(), zzbgjVar.zzaK());
                    if (zzbgjVar.zzbh()) {
                        zzbgg zzbi = zzbgjVar.zzbi();
                        zzfwVar = new zzfw(zzk(zzbi.zza().zzc()), zzk(zzbi.zza().zze()), zzt(zzbi.zzc()), zzk(zzbi.zzd().zzc()), zzk(zzbi.zzd().zze()), zzt(zzbi.zze()));
                    } else {
                        zzfwVar = r24;
                    }
                    builder.zzas = zzfwVar;
                    zzz = zzbgjVar.zzz();
                    if (zzz.isEmpty()) {
                        arrayList2 = r24;
                    } else {
                        arrayList2 = new ArrayList();
                        Iterator it4 = zzz.iterator();
                        while (it4.hasNext()) {
                            zzbgv zzbgvVar = (zzbgv) it4.next();
                            double zzg = zzbgvVar.zzg();
                            if (zzg == 0.0d) {
                                throw zzj("Review rating not provided for a Review result.");
                            }
                            if (!zzbgvVar.zzh()) {
                                throw zzj("Author attribution not provided for a Review result.");
                            }
                            if (zzbgvVar.zzj()) {
                                zzblx zzk13 = zzbgvVar.zzk();
                                Exif.AnonymousClass1 anonymousClass12 = zzbmt.zzb;
                                long zzc2 = zzk13.zzc();
                                d = d2;
                                int zze2 = zzk13.zze();
                                if (zzc2 < -62135596800L || zzc2 > 253402300799L || zze2 < 0 || zze2 >= 1000000000) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(zze2).length() + String.valueOf(zzc2).length() + EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE + 37);
                                    Boxes$$ExternalSyntheticOutline1.m1151m(zzc2, "Timestamp is not valid. See proto definition for valid values. Seconds (", ") must be in range [-62,135,596,800, +253,402,300,799]. Nanos (", sb2);
                                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(zze2, ") must be in range [0, +999,999,999].", sb2));
                                    return r24;
                                }
                                long zzc3 = zzk13.zzc();
                                int zze3 = zzk13.zze();
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(((SimpleDateFormat) zzbmt.zzb.get()).format(new Date(zzc3 * 1000)));
                                if (zze3 != 0) {
                                    sb3.append(str4);
                                    sb3.append(zze3 % 1000000 == 0 ? String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(zze3 / 1000000)) : zze3 % IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO == 0 ? String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(zze3 / IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO)) : String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(zze3)));
                                }
                                sb3.append("Z");
                                str = sb3.toString();
                            } else {
                                d = d2;
                                str = r24;
                            }
                            String zzk14 = zzbgvVar.zzc() ? zzk(zzbgvVar.zzd().zzc()) : r24;
                            String zzk15 = zzbgvVar.zzc() ? zzk(zzbgvVar.zzd().zze()) : r24;
                            String zzk16 = zzbgvVar.zze() ? zzk(zzbgvVar.zzf().zzc()) : r24;
                            String zzk17 = zzbgvVar.zze() ? zzk(zzbgvVar.zzf().zze()) : r24;
                            String zzk18 = zzk(zzbgvVar.zza());
                            if (zzbgvVar.zzm()) {
                                it = it4;
                                str2 = str3;
                                zzeqVar = zzeq.newInstance(zzbgvVar.zzn().zzc(), zzbgvVar.zzn().zze(), 1);
                            } else {
                                it = it4;
                                str2 = str3;
                                zzeqVar = r24;
                            }
                            Double valueOf3 = Double.valueOf(zzg);
                            zzda zzu = zzu(zzbgvVar.zzi());
                            String str7 = zzu.zzb;
                            if (str7 == null) {
                                str7 = "";
                            }
                            if (str7.startsWith("//")) {
                                str7 = "https:".concat(str7);
                            }
                            zzabe zzabeVar = new zzabe();
                            ImmutableSet immutableSet = zzabh.zzb;
                            String str8 = str4;
                            zzabeVar.zza(zzabh.zza(str7, zzabg.zza));
                            zzabeVar.zzb(zzu.zza);
                            zzabd zzc4 = zzabeVar.zzc();
                            RequestQueue requestQueue = new RequestQueue();
                            requestQueue.mNetwork = valueOf3;
                            requestQueue.mDelivery = zzu;
                            requestQueue.mDispatchers = zzc4.zza;
                            requestQueue.mCacheDispatcher = str;
                            requestQueue.mCurrentRequests = zzk14;
                            requestQueue.mCacheQueue = zzk15;
                            requestQueue.mNetworkQueue = zzk16;
                            requestQueue.mCache = zzk17;
                            requestQueue.mSequenceGenerator = zzk18;
                            requestQueue.mFinishedListeners = zzt(zzbgvVar.zzl());
                            requestQueue.mEventListeners = zzeqVar;
                            Double d3 = requestQueue.zzd().zzf;
                            Trace.checkArgument("Rating must between 1.0 and 5.0 (inclusive), but was: %s.", d3, (d3.doubleValue() < d || d3.doubleValue() > 5.0d) ? r23 : true);
                            arrayList2.add(requestQueue.zzd());
                            d2 = d;
                            str3 = str2;
                            it4 = it;
                            str4 = str8;
                            i3 = 1;
                        }
                    }
                    String str9 = str3;
                    builder.zzy = arrayList2;
                    builder.zzI = zzh(zzbgjVar.zzaq());
                    builder.zzK = zzm(zzbgjVar.zzaf(), zzbgjVar.zzag());
                    builder.zzL = zzm(zzbgjVar.zzZ(), zzbgjVar.zzaa());
                    builder.zzM = zzm(zzbgjVar.zzaj(), zzbgjVar.zzak());
                    builder.zzae = zzm(zzbgjVar.zzaz(), zzbgjVar.zzaA());
                    builder.zzag = zzm(zzbgjVar.zzaD(), zzbgjVar.zzaE());
                    builder.zzaf = zzm(zzbgjVar.zzaB(), zzbgjVar.zzaC());
                    builder.zzN = zzm(zzbgjVar.zzad(), zzbgjVar.zzae());
                    builder.zzO = zzm(zzbgjVar.zzab(), zzbgjVar.zzac());
                    builder.zzP = zzm(zzbgjVar.zzal(), zzbgjVar.zzam());
                    builder.zzQ = zzm(zzbgjVar.zzah(), zzbgjVar.zzai());
                    builder.zzb = zzk(zzbgjVar.zzm());
                    zzaR = zzbgjVar.zzaR();
                    if (zzaR.isEmpty()) {
                        arrayList3 = r24;
                    } else {
                        arrayList3 = new ArrayList();
                        for (zzbgi zzbgiVar : zzaR) {
                            String zzc5 = zzbgiVar.zzc();
                            String zza5 = zzbgiVar.zza();
                            if (zzc5 == null) {
                                a$$ExternalSyntheticBUOutline0.m$2("Null id");
                            } else if (zza5 != null) {
                                zzgiVar = new zzgi(zzc5, zza5);
                                arrayList3.add(zzgiVar);
                            } else {
                                a$$ExternalSyntheticBUOutline0.m$2(str9);
                            }
                            zzgiVar = r24;
                            arrayList3.add(zzgiVar);
                        }
                    }
                    builder.zzam = arrayList3;
                    builder.zzR = zzm(zzbgjVar.zzP(), zzbgjVar.zzQ());
                    builder.zzav = zzbgjVar.zzE() ? ZoneId.of(zzbgjVar.zzF().zzc()) : r24;
                    builder.zzS = zzbgjVar.zzL() ? Integer.valueOf(zzbgjVar.zzM()) : r24;
                    builder.zzT = zzbgjVar.zzC() ? Integer.valueOf(zzbgjVar.zzD()) : r24;
                    if (zzbgjVar.zzu()) {
                        zzazv zzv = zzbgjVar.zzv();
                        zzbnw zza6 = zzv.zza();
                        LatLng latLng2 = new LatLng(zza6.zzc(), zza6.zze());
                        zzbnw zzc6 = zzv.zzc();
                        latLngBounds = new LatLngBounds(latLng2, new LatLng(zzc6.zzc(), zzc6.zze()));
                    } else {
                        latLngBounds = r24;
                    }
                    builder.zzU = latLngBounds;
                    builder.zzV = zzt(zzbgjVar.zzy());
                    return builder.build();
                }
            }
            zzfoVar = r24;
            builder.zzax = zzfoVar;
            int ordinal2 = zzbgjVar.zzJ().ordinal();
            builder.zzB = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? ordinal2 != 4 ? ordinal2 != 5 ? r24 : 4 : 3 : 2 : 1 : Integer.valueOf((int) r23);
            if (zzbgjVar.zzbg().zza()) {
            }
            builder.zzC = zzbgjVar.zzbg().zza() ? new zzfq(zzr(zzbgjVar.zzbg().zzc()), zzbgjVar.zzbg().zzd() ? zzr(zzbgjVar.zzbg().zze()) : r24) : r24;
            builder.zzD = zzk(zzbgjVar.zzg());
            builder.zzE = zzbgjVar.zzh() ? zzk(zzbgjVar.zzi().zzc()) : r24;
            builder.zzF = zzbgjVar.zzh() ? zzk(zzbgjVar.zzi().zze()) : r24;
            builder.zzao = zzm(zzbgjVar.zzba(), zzbgjVar.zzbb());
            double zzw2 = zzbgjVar.zzw();
            double d22 = 1.0d;
            builder.zzG = zzw2 < 1.0d ? r24 : Double.valueOf(zzw2);
            builder.zzH = zzm(zzbgjVar.zzX(), zzbgjVar.zzY());
            builder.zzt = zzk(zzbgjVar.zza());
            builder.zzaj = zzm(zzbgjVar.zzaJ(), zzbgjVar.zzaK());
            if (zzbgjVar.zzbh()) {
            }
            builder.zzas = zzfwVar;
            zzz = zzbgjVar.zzz();
            if (zzz.isEmpty()) {
            }
            String str92 = str3;
            builder.zzy = arrayList2;
            builder.zzI = zzh(zzbgjVar.zzaq());
            builder.zzK = zzm(zzbgjVar.zzaf(), zzbgjVar.zzag());
            builder.zzL = zzm(zzbgjVar.zzZ(), zzbgjVar.zzaa());
            builder.zzM = zzm(zzbgjVar.zzaj(), zzbgjVar.zzak());
            builder.zzae = zzm(zzbgjVar.zzaz(), zzbgjVar.zzaA());
            builder.zzag = zzm(zzbgjVar.zzaD(), zzbgjVar.zzaE());
            builder.zzaf = zzm(zzbgjVar.zzaB(), zzbgjVar.zzaC());
            builder.zzN = zzm(zzbgjVar.zzad(), zzbgjVar.zzae());
            builder.zzO = zzm(zzbgjVar.zzab(), zzbgjVar.zzac());
            builder.zzP = zzm(zzbgjVar.zzal(), zzbgjVar.zzam());
            builder.zzQ = zzm(zzbgjVar.zzah(), zzbgjVar.zzai());
            builder.zzb = zzk(zzbgjVar.zzm());
            zzaR = zzbgjVar.zzaR();
            if (zzaR.isEmpty()) {
            }
            builder.zzam = arrayList3;
            builder.zzR = zzm(zzbgjVar.zzP(), zzbgjVar.zzQ());
            builder.zzav = zzbgjVar.zzE() ? ZoneId.of(zzbgjVar.zzF().zzc()) : r24;
            builder.zzS = zzbgjVar.zzL() ? Integer.valueOf(zzbgjVar.zzM()) : r24;
            builder.zzT = zzbgjVar.zzC() ? Integer.valueOf(zzbgjVar.zzD()) : r24;
            if (zzbgjVar.zzu()) {
            }
            builder.zzU = latLngBounds;
            builder.zzV = zzt(zzbgjVar.zzy());
            return builder.build();
        }
        valueOf = null;
        builder.zzn = valueOf;
        String zzN2 = zzbgjVar.zzN();
        builder.zzo = zzN2.isEmpty() ? zzN2.concat(".png") : null;
        builder.zzp = zzk(zzbgjVar.zzc());
        builder.zzv = zzk(zzbgjVar.zzk());
        builder.zzac = zzm(zzbgjVar.zzav(), zzbgjVar.zzaw());
        if (zzbgjVar.zzs()) {
        }
        builder.zzq = latLng;
        builder.zzad = zzm(zzbgjVar.zzax(), zzbgjVar.zzay());
        builder.zzw = zzk(zzbgjVar.zzj());
        if (zzbgjVar.zzbl()) {
        }
        builder.zzar = zzewVar;
        builder.zzu = !zzbgjVar.zzA() ? zzi(zzbgjVar.zzB()) : null;
        builder.zzab = zzm(zzbgjVar.zzat(), zzbgjVar.zzau());
        zzbga zzaQ2 = zzbgjVar.zzaQ();
        builder.zzY = new com.google.android.libraries.places.api.model.zzfa(zzm(zzaQ2.zza(), zzaQ2.zzc()), zzm(zzaQ2.zzd(), zzaQ2.zze()), zzm(zzaQ2.zzf(), zzaQ2.zzg()), zzm(zzaQ2.zzh(), zzaQ2.zzi()), zzm(zzaQ2.zzj(), zzaQ2.zzk()), zzm(zzaQ2.zzl(), zzaQ2.zzm()), zzm(zzaQ2.zzn(), zzaQ2.zzo()));
        zzbgc zzaP2 = zzbgjVar.zzaP();
        builder.zzZ = new zzfc(zzm(zzaP2.zza(), zzaP2.zzc()), zzm(zzaP2.zzd(), zzaP2.zze()), zzm(zzaP2.zzf(), zzaP2.zzg()), zzm(zzaP2.zzh(), zzaP2.zzi()));
        zzG = zzbgjVar.zzG();
        int i52 = 2;
        if (zzG.isEmpty()) {
        }
        ?? r232 = z2;
        builder.zzx = arrayList;
        builder.zzz = !zzbgjVar.zzf().isEmpty() ? r24 : zzbgjVar.zzf();
        if (zzbgjVar.zzq()) {
        }
        builder.zzA = zzfmVar;
        if (zzbgjVar.zzn()) {
        }
        zzfoVar = r24;
        builder.zzax = zzfoVar;
        int ordinal22 = zzbgjVar.zzJ().ordinal();
        builder.zzB = ordinal22 != 1 ? ordinal22 != 2 ? ordinal22 != 3 ? ordinal22 != 4 ? ordinal22 != 5 ? r24 : 4 : 3 : 2 : 1 : Integer.valueOf((int) r232);
        if (zzbgjVar.zzbg().zza()) {
        }
        builder.zzC = zzbgjVar.zzbg().zza() ? new zzfq(zzr(zzbgjVar.zzbg().zzc()), zzbgjVar.zzbg().zzd() ? zzr(zzbgjVar.zzbg().zze()) : r24) : r24;
        builder.zzD = zzk(zzbgjVar.zzg());
        builder.zzE = zzbgjVar.zzh() ? zzk(zzbgjVar.zzi().zzc()) : r24;
        builder.zzF = zzbgjVar.zzh() ? zzk(zzbgjVar.zzi().zze()) : r24;
        builder.zzao = zzm(zzbgjVar.zzba(), zzbgjVar.zzbb());
        double zzw22 = zzbgjVar.zzw();
        double d222 = 1.0d;
        builder.zzG = zzw22 < 1.0d ? r24 : Double.valueOf(zzw22);
        builder.zzH = zzm(zzbgjVar.zzX(), zzbgjVar.zzY());
        builder.zzt = zzk(zzbgjVar.zza());
        builder.zzaj = zzm(zzbgjVar.zzaJ(), zzbgjVar.zzaK());
        if (zzbgjVar.zzbh()) {
        }
        builder.zzas = zzfwVar;
        zzz = zzbgjVar.zzz();
        if (zzz.isEmpty()) {
        }
        String str922 = str3;
        builder.zzy = arrayList2;
        builder.zzI = zzh(zzbgjVar.zzaq());
        builder.zzK = zzm(zzbgjVar.zzaf(), zzbgjVar.zzag());
        builder.zzL = zzm(zzbgjVar.zzZ(), zzbgjVar.zzaa());
        builder.zzM = zzm(zzbgjVar.zzaj(), zzbgjVar.zzak());
        builder.zzae = zzm(zzbgjVar.zzaz(), zzbgjVar.zzaA());
        builder.zzag = zzm(zzbgjVar.zzaD(), zzbgjVar.zzaE());
        builder.zzaf = zzm(zzbgjVar.zzaB(), zzbgjVar.zzaC());
        builder.zzN = zzm(zzbgjVar.zzad(), zzbgjVar.zzae());
        builder.zzO = zzm(zzbgjVar.zzab(), zzbgjVar.zzac());
        builder.zzP = zzm(zzbgjVar.zzal(), zzbgjVar.zzam());
        builder.zzQ = zzm(zzbgjVar.zzah(), zzbgjVar.zzai());
        builder.zzb = zzk(zzbgjVar.zzm());
        zzaR = zzbgjVar.zzaR();
        if (zzaR.isEmpty()) {
        }
        builder.zzam = arrayList3;
        builder.zzR = zzm(zzbgjVar.zzP(), zzbgjVar.zzQ());
        builder.zzav = zzbgjVar.zzE() ? ZoneId.of(zzbgjVar.zzF().zzc()) : r24;
        builder.zzS = zzbgjVar.zzL() ? Integer.valueOf(zzbgjVar.zzM()) : r24;
        builder.zzT = zzbgjVar.zzC() ? Integer.valueOf(zzbgjVar.zzD()) : r24;
        if (zzbgjVar.zzu()) {
        }
        builder.zzU = latLngBounds;
        builder.zzV = zzt(zzbgjVar.zzy());
        return builder.build();
    }

    public final ArrayList zzh(zzbkb zzbkbVar) {
        if (zzbkbVar.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = zzbkbVar.iterator();
        while (it.hasNext()) {
            arrayList.add(zzi((zzbfy) it.next()));
        }
        return arrayList;
    }

    public final com.google.android.libraries.places.api.model.zzey zzi(zzbfy zzbfyVar) {
        Instant instant;
        Instant instant2;
        SubtreeManager subtreeManager = new SubtreeManager();
        subtreeManager.contextForChildren = new ArrayList();
        subtreeManager.emitActionToParent = new ArrayList();
        subtreeManager.workflowSession = new ArrayList();
        zzbkb zzd = zzbfyVar.zzd();
        ArrayList arrayList = new ArrayList();
        Iterator it = zzd.iterator();
        while (true) {
            zzgk zzgkVar = null;
            if (!it.hasNext()) {
                break;
            }
            zzbfu zzbfuVar = (zzbfu) it.next();
            zzgk zzw = zzbfuVar.zza() ? zzw(zzbfuVar.zzc()) : null;
            if (zzbfuVar.zzd()) {
                zzgkVar = zzw(zzbfuVar.zze());
            }
            arrayList.add(new zzfe(zzw, zzgkVar));
        }
        subtreeManager.contextForChildren = arrayList;
        zzbkb zze = zzbfyVar.zze();
        if (zze == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null weekdayText");
            return null;
        }
        subtreeManager.workflowSession = zze;
        Object obj = this.zzb.get(zzbfyVar.zzf());
        if (obj == null) {
            obj = null;
        }
        subtreeManager.snapshotCache = (OpeningHours$HoursType) obj;
        zzbkb zzg = zzbfyVar.zzg();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = zzg.iterator();
        while (it2.hasNext()) {
            try {
                zzbnu zza = ((zzbfx) it2.next()).zza();
                arrayList2.add(new com.google.android.libraries.places.api.model.zzgg(zzeq.newInstance(zza.zzc(), zza.zze(), zza.zzf()), true));
            } catch (IllegalArgumentException e) {
                throw zzj("Special day is not properly defined: " + e.getMessage());
            }
        }
        subtreeManager.emitActionToParent = arrayList2;
        subtreeManager.interceptor = zzbfyVar.zza() ? Boolean.valueOf(zzbfyVar.zzc()) : null;
        if (zzbfyVar.zzh()) {
            instant = Instant.ofEpochSecond(zzbfyVar.zzi().zzc(), r10.zze());
        } else {
            instant = null;
        }
        subtreeManager.idCounter = instant;
        if (zzbfyVar.zzj()) {
            instant2 = Instant.ofEpochSecond(zzbfyVar.zzk().zzc(), r10.zze());
        } else {
            instant2 = null;
        }
        subtreeManager.children = instant2;
        com.google.android.libraries.places.api.model.zzey zzd2 = subtreeManager.zzd();
        List list = zzd2.zzd;
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Trace.checkArgument("WeekdayText must not contain null or empty values.", !TextUtils.isEmpty((String) it3.next()));
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) zzd2.zzb);
        if (copyOf == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null periods");
            return null;
        }
        subtreeManager.contextForChildren = copyOf;
        ImmutableList copyOf2 = ImmutableList.copyOf((Collection) list);
        if (copyOf2 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null weekdayText");
            return null;
        }
        subtreeManager.workflowSession = copyOf2;
        ImmutableList copyOf3 = ImmutableList.copyOf((Collection) zzd2.zzc);
        if (copyOf3 != null) {
            subtreeManager.emitActionToParent = copyOf3;
            return subtreeManager.zzd();
        }
        a$$ExternalSyntheticBUOutline0.m$2("Null specialDays");
        return null;
    }
}
