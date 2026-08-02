package com.google.android.gms.internal.measurement;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.featuretoggle.UnleashContext;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes4.dex */
public final class zzau {
    public final /* synthetic */ int $r8$classId;
    public final ArrayList zza = new ArrayList();

    public zzau(int i) {
        this.$r8$classId = i;
    }

    public static boolean zzc(zzao zzaoVar, zzao zzaoVar2) {
        if (zzaoVar instanceof zzak) {
            zzaoVar = new zzas(zzaoVar.zzc());
        }
        if (zzaoVar2 instanceof zzak) {
            zzaoVar2 = new zzas(zzaoVar2.zzc());
        }
        if ((zzaoVar instanceof zzas) && (zzaoVar2 instanceof zzas)) {
            return ((zzas) zzaoVar).zza.compareTo(((zzas) zzaoVar2).zza) < 0;
        }
        double doubleValue = zzaoVar.zzd().doubleValue();
        double doubleValue2 = zzaoVar2.zzd().doubleValue();
        return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || (doubleValue == 0.0d && doubleValue2 == 0.0d) || ((doubleValue == 0.0d && doubleValue2 == 0.0d) || Double.compare(doubleValue, doubleValue2) >= 0)) ? false : true;
    }

    public static boolean zzd(zzao zzaoVar, zzao zzaoVar2) {
        if (zzaoVar.getClass().equals(zzaoVar2.getClass())) {
            if ((zzaoVar instanceof zzat) || (zzaoVar instanceof zzam)) {
                return true;
            }
            return zzaoVar instanceof zzah ? (Double.isNaN(zzaoVar.zzd().doubleValue()) || Double.isNaN(zzaoVar2.zzd().doubleValue()) || zzaoVar.zzd().doubleValue() != zzaoVar2.zzd().doubleValue()) ? false : true : zzaoVar instanceof zzas ? zzaoVar.zzc().equals(zzaoVar2.zzc()) : zzaoVar instanceof zzaf ? zzaoVar.zze().equals(zzaoVar2.zze()) : zzaoVar == zzaoVar2;
        }
        if (((zzaoVar instanceof zzat) || (zzaoVar instanceof zzam)) && ((zzaoVar2 instanceof zzat) || (zzaoVar2 instanceof zzam))) {
            return true;
        }
        boolean z = zzaoVar instanceof zzah;
        if (z && (zzaoVar2 instanceof zzas)) {
            return zzd(zzaoVar, new zzah(zzaoVar2.zzd()));
        }
        boolean z2 = zzaoVar instanceof zzas;
        if ((!z2 || !(zzaoVar2 instanceof zzah)) && !(zzaoVar instanceof zzaf)) {
            if (zzaoVar2 instanceof zzaf) {
                return zzd(zzaoVar, new zzah(zzaoVar2.zzd()));
            }
            if ((z2 || z) && (zzaoVar2 instanceof zzak)) {
                return zzd(zzaoVar, new zzas(zzaoVar2.zzc()));
            }
            if ((zzaoVar instanceof zzak) && ((zzaoVar2 instanceof zzas) || (zzaoVar2 instanceof zzah))) {
                return zzd(new zzas(zzaoVar.zzc()), zzaoVar2);
            }
            return false;
        }
        return zzd(new zzah(zzaoVar.zzd()), zzaoVar2);
    }

    public static zzao zze(zzbc zzbcVar, Iterator it, zzao zzaoVar) {
        UnleashContext zzc;
        if (it != null) {
            while (it.hasNext()) {
                zzao zzaoVar2 = (zzao) it.next();
                switch (zzbcVar.$r8$classId) {
                    case 0:
                        zzc = zzbcVar.zza.zzc();
                        String str = zzbcVar.zzb;
                        zzc.zzf(str, zzaoVar2);
                        ((HashMap) zzc.remoteAddress).put(str, Boolean.TRUE);
                        break;
                    case 1:
                        zzc = zzbcVar.zza.zzc();
                        zzc.zzf(zzbcVar.zzb, zzaoVar2);
                        break;
                    default:
                        zzc = zzbcVar.zza;
                        zzc.zzf(zzbcVar.zzb, zzaoVar2);
                        break;
                }
                zzao zzb = zzc.zzb((zzae) zzaoVar);
                if (zzb instanceof zzag) {
                    zzag zzagVar = (zzag) zzb;
                    String str2 = zzagVar.zzb;
                    if ("break".equals(str2)) {
                        return zzao.zzf;
                    }
                    if ("return".equals(str2)) {
                        return zzagVar;
                    }
                }
            }
        }
        return zzao.zzf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0bb8  */
    /* JADX WARN: Removed duplicated region for block: B:508:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v100, types: [com.google.android.gms.internal.measurement.zzao] */
    /* JADX WARN: Type inference failed for: r10v103, types: [com.google.android.gms.internal.measurement.zzao] */
    /* JADX WARN: Type inference failed for: r10v315 */
    /* JADX WARN: Type inference failed for: r10v320 */
    /* JADX WARN: Type inference failed for: r10v340, types: [com.google.android.gms.internal.measurement.zzae] */
    /* JADX WARN: Type inference failed for: r10v347, types: [com.google.android.gms.internal.measurement.zzal] */
    /* JADX WARN: Type inference failed for: r10v382 */
    /* JADX WARN: Type inference failed for: r10v383 */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.fillr.featuretoggle.UnleashContext] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzao zza(String str, UnleashContext unleashContext, ArrayList arrayList) {
        boolean zzd;
        boolean zzd2;
        zzat zzatVar;
        zzat zzatVar2;
        zzat zzatVar3;
        zzag zzagVar;
        zzao zzasVar;
        zzao zzaoVar;
        String str2;
        int i = 1;
        int i2 = 2;
        int i3 = 0;
        switch (this.$r8$classId) {
            case 0:
                zzbk zzbkVar = zzbk.ADD;
                switch (zzh.zze(str).ordinal()) {
                    case 4:
                        zzh.zza("BITWISE_AND", arrayList, 2);
                        return new zzah(Double.valueOf(zzh.zzg(((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(0)).zzd().doubleValue()) & zzh.zzg(((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(1)).zzd().doubleValue())));
                    case 5:
                        zzh.zza("BITWISE_LEFT_SHIFT", arrayList, 2);
                        return new zzah(Double.valueOf(zzh.zzg(((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(0)).zzd().doubleValue()) << ((int) (zzh.zzg(((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(1)).zzd().doubleValue()) & 31))));
                    case 6:
                        zzh.zza("BITWISE_NOT", arrayList, 1);
                        return new zzah(Double.valueOf(~zzh.zzg(((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(0)).zzd().doubleValue())));
                    case 7:
                        zzh.zza("BITWISE_OR", arrayList, 2);
                        return new zzah(Double.valueOf(zzh.zzg(((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(0)).zzd().doubleValue()) | zzh.zzg(((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(1)).zzd().doubleValue())));
                    case 8:
                        zzh.zza("BITWISE_RIGHT_SHIFT", arrayList, 2);
                        return new zzah(Double.valueOf(zzh.zzg(((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(0)).zzd().doubleValue()) >> ((int) (zzh.zzg(((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(1)).zzd().doubleValue()) & 31))));
                    case 9:
                        zzh.zza("BITWISE_UNSIGNED_RIGHT_SHIFT", arrayList, 2);
                        return new zzah(Double.valueOf((zzh.zzg(((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(0)).zzd().doubleValue()) & BodyPartID.bodyIdMax) >>> ((int) (zzh.zzg(((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(1)).zzd().doubleValue()) & 31))));
                    case 10:
                        zzh.zza("BITWISE_XOR", arrayList, 2);
                        return new zzah(Double.valueOf(zzh.zzg(((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(0)).zzd().doubleValue()) ^ zzh.zzg(((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(1)).zzd().doubleValue())));
                    default:
                        zzb(str);
                        throw null;
                }
            case 1:
                zzh.zza(zzh.zze(str).name(), arrayList, 2);
                zzao zzb = ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(0));
                zzao zzb2 = ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(1));
                int ordinal = zzh.zze(str).ordinal();
                if (ordinal != 23) {
                    if (ordinal == 48) {
                        zzd2 = zzd(zzb, zzb2);
                    } else if (ordinal == 42) {
                        zzd = zzc(zzb, zzb2);
                    } else if (ordinal != 43) {
                        switch (ordinal) {
                            case 37:
                                zzd = zzc(zzb2, zzb);
                                break;
                            case 38:
                                zzd = zze(zzb2, zzb);
                                break;
                            case 39:
                                zzd = zzh.zzf(zzb, zzb2);
                                break;
                            case 40:
                                zzd2 = zzh.zzf(zzb, zzb2);
                                break;
                            default:
                                zzb(str);
                                throw null;
                        }
                    } else {
                        zzd = zze(zzb, zzb2);
                    }
                    zzd = !zzd2;
                } else {
                    zzd = zzd(zzb, zzb2);
                }
                return zzd ? zzao.zzk : zzao.zzl;
            case 2:
                zzbk zzbkVar2 = zzbk.ADD;
                int ordinal2 = zzh.zze(str).ordinal();
                if (ordinal2 == 2) {
                    zzh.zza("APPLY", arrayList, 3);
                    zzao zzaoVar2 = (zzao) arrayList.get(0);
                    zzz zzzVar = (zzz) unleashContext.sessionId;
                    zzz zzzVar2 = (zzz) unleashContext.sessionId;
                    zzao zzb3 = zzzVar.zzb((UnleashContext) unleashContext, zzaoVar2);
                    String zzc = zzzVar2.zzb((UnleashContext) unleashContext, (zzao) arrayList.get(1)).zzc();
                    zzao zzb4 = zzzVar2.zzb((UnleashContext) unleashContext, (zzao) arrayList.get(2));
                    if (!(zzb4 instanceof zzae)) {
                        a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Function arguments for Apply are not a list found ", zzb4.getClass().getCanonicalName()));
                        return null;
                    }
                    if (!zzc.isEmpty()) {
                        return zzb3.zzcG(zzc, unleashContext, (ArrayList) ((zzae) zzb4).zzb());
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Function name for apply is undefined");
                    return null;
                }
                if (ordinal2 == 15) {
                    zzh.zza("BREAK", arrayList, 0);
                    return zzao.zzh;
                }
                if (ordinal2 == 25) {
                    return zzc((UnleashContext) unleashContext, arrayList);
                }
                if (ordinal2 != 41) {
                    if (ordinal2 == 54) {
                        return new zzae(arrayList);
                    }
                    if (ordinal2 == 57) {
                        if (arrayList.isEmpty()) {
                            return zzao.zzj;
                        }
                        zzh.zza("RETURN", arrayList, 1);
                        return new zzag("return", ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(0)));
                    }
                    if (ordinal2 != 19) {
                        if (ordinal2 == 20) {
                            zzh.zzb("DEFINE_FUNCTION", arrayList, 2);
                            zzan zzc2 = zzc((UnleashContext) unleashContext, arrayList);
                            String str3 = zzc2.zzd;
                            if (str3 == null) {
                                unleashContext.zze("", zzc2);
                                return zzc2;
                            }
                            unleashContext.zze(str3, zzc2);
                            return zzc2;
                        }
                        if (ordinal2 == 60) {
                            zzh.zza("SWITCH", arrayList, 3);
                            zzao zzaoVar3 = (zzao) arrayList.get(0);
                            zzz zzzVar3 = (zzz) unleashContext.sessionId;
                            zzz zzzVar4 = (zzz) unleashContext.sessionId;
                            zzao zzb5 = zzzVar3.zzb((UnleashContext) unleashContext, zzaoVar3);
                            zzao zzb6 = zzzVar4.zzb((UnleashContext) unleashContext, (zzao) arrayList.get(1));
                            zzao zzb7 = zzzVar4.zzb((UnleashContext) unleashContext, (zzao) arrayList.get(2));
                            if (!(zzb6 instanceof zzae)) {
                                a$$ExternalSyntheticBUOutline0.m$3("Malformed SWITCH statement, cases are not a list");
                                return null;
                            }
                            if (!(zzb7 instanceof zzae)) {
                                a$$ExternalSyntheticBUOutline0.m$3("Malformed SWITCH statement, case statements are not a list");
                                return null;
                            }
                            zzae zzaeVar = (zzae) zzb6;
                            zzae zzaeVar2 = (zzae) zzb7;
                            boolean z = false;
                            for (int i4 = 0; i4 < zzaeVar.zzh(); i4++) {
                                if (z || zzb5.equals(zzzVar4.zzb((UnleashContext) unleashContext, zzaeVar.zzl(i4)))) {
                                    zzao zzb8 = zzzVar4.zzb((UnleashContext) unleashContext, zzaeVar2.zzl(i4));
                                    if (zzb8 instanceof zzag) {
                                        return ((zzag) zzb8).zzb.equals("break") ? zzao.zzf : zzb8;
                                    }
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                            if (zzaeVar.zzh() + 1 == zzaeVar2.zzh()) {
                                zzao zzb9 = zzzVar4.zzb((UnleashContext) unleashContext, zzaeVar2.zzl(zzaeVar.zzh()));
                                if (zzb9 instanceof zzag) {
                                    String str4 = ((zzag) zzb9).zzb;
                                    if (str4.equals("return") || str4.equals("continue")) {
                                        return zzb9;
                                    }
                                }
                            }
                            return zzao.zzf;
                        }
                        if (ordinal2 == 61) {
                            zzh.zza("TERNARY", arrayList, 3);
                            zzao zzaoVar4 = (zzao) arrayList.get(0);
                            zzz zzzVar5 = (zzz) unleashContext.sessionId;
                            zzz zzzVar6 = (zzz) unleashContext.sessionId;
                            return zzzVar5.zzb((UnleashContext) unleashContext, zzaoVar4).zze().booleanValue() ? zzzVar6.zzb((UnleashContext) unleashContext, (zzao) arrayList.get(1)) : zzzVar6.zzb((UnleashContext) unleashContext, (zzao) arrayList.get(2));
                        }
                        switch (ordinal2) {
                            case 11:
                                return unleashContext.zzc().zzb(new zzae(arrayList));
                            case 12:
                                zzh.zza("BREAK", arrayList, 0);
                                return zzao.zzi;
                            case 13:
                                break;
                            default:
                                zzb(str);
                                throw null;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return zzao.zzf;
                    }
                    zzao zzb10 = ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(0));
                    return zzb10 instanceof zzae ? unleashContext.zzb((zzae) zzb10) : zzao.zzf;
                }
                zzh.zzb("IF", arrayList, 2);
                zzao zzaoVar5 = (zzao) arrayList.get(0);
                zzz zzzVar7 = (zzz) unleashContext.sessionId;
                zzz zzzVar8 = (zzz) unleashContext.sessionId;
                zzao zzb11 = zzzVar7.zzb((UnleashContext) unleashContext, zzaoVar5);
                zzao zzb12 = zzzVar8.zzb((UnleashContext) unleashContext, (zzao) arrayList.get(1));
                zzao zzb13 = arrayList.size() > 2 ? zzzVar8.zzb((UnleashContext) unleashContext, (zzao) arrayList.get(2)) : null;
                zzat zzatVar4 = zzao.zzf;
                if (zzb11.zze().booleanValue()) {
                    zzatVar2 = unleashContext.zzb((zzae) zzb12);
                } else {
                    if (zzb13 == null) {
                        zzatVar = zzatVar4;
                        return true == (zzatVar instanceof zzag) ? zzatVar4 : zzatVar;
                    }
                    zzatVar2 = unleashContext.zzb((zzae) zzb13);
                }
                zzatVar = zzatVar2;
                if (true == (zzatVar instanceof zzag)) {
                }
                break;
            case 3:
                zzbk zzbkVar3 = zzbk.ADD;
                int ordinal3 = zzh.zze(str).ordinal();
                if (ordinal3 == 1) {
                    zzh.zza("AND", arrayList, 2);
                    zzao zzb14 = ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(0));
                    if (zzb14.zze().booleanValue()) {
                        return ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(1));
                    }
                    return zzb14;
                }
                if (ordinal3 == 47) {
                    zzh.zza("NOT", arrayList, 1);
                    return new zzaf(Boolean.valueOf(!((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(0)).zze().booleanValue()));
                }
                if (ordinal3 != 50) {
                    zzb(str);
                    throw null;
                }
                zzh.zza("OR", arrayList, 2);
                zzao zzb15 = ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(0));
                if (zzb15.zze().booleanValue()) {
                    return zzb15;
                }
                return ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(1));
            case 4:
                zzbk zzbkVar4 = zzbk.ADD;
                int ordinal4 = zzh.zze(str).ordinal();
                if (ordinal4 == 65) {
                    zzh.zza("WHILE", arrayList, 4);
                    zzao zzaoVar6 = (zzao) arrayList.get(0);
                    zzao zzaoVar7 = (zzao) arrayList.get(1);
                    zzao zzaoVar8 = (zzao) arrayList.get(2);
                    zzao zzaoVar9 = (zzao) arrayList.get(3);
                    zzz zzzVar9 = (zzz) unleashContext.sessionId;
                    zzz zzzVar10 = (zzz) unleashContext.sessionId;
                    zzao zzb16 = zzzVar9.zzb((UnleashContext) unleashContext, zzaoVar9);
                    if (zzzVar10.zzb((UnleashContext) unleashContext, zzaoVar8).zze().booleanValue()) {
                        zzao zzb17 = unleashContext.zzb((zzae) zzb16);
                        if (zzb17 instanceof zzag) {
                            zzag zzagVar2 = (zzag) zzb17;
                            String str5 = zzagVar2.zzb;
                            if ("break".equals(str5)) {
                                return zzao.zzf;
                            }
                            if ("return".equals(str5)) {
                                return zzagVar2;
                            }
                        }
                    }
                    while (zzzVar10.zzb((UnleashContext) unleashContext, zzaoVar6).zze().booleanValue()) {
                        zzao zzb18 = unleashContext.zzb((zzae) zzb16);
                        if (zzb18 instanceof zzag) {
                            zzag zzagVar3 = (zzag) zzb18;
                            String str6 = zzagVar3.zzb;
                            if ("break".equals(str6)) {
                                return zzao.zzf;
                            }
                            if ("return".equals(str6)) {
                                return zzagVar3;
                            }
                        }
                        unleashContext.zza(zzaoVar7);
                    }
                    return zzao.zzf;
                }
                switch (ordinal4) {
                    case 26:
                        zzh.zza("FOR_IN", arrayList, 3);
                        if (!(arrayList.get(0) instanceof zzas)) {
                            a$$ExternalSyntheticBUOutline0.m$3("Variable name in FOR_IN must be a string");
                            return null;
                        }
                        String zzc3 = ((zzao) arrayList.get(0)).zzc();
                        zzao zzb19 = ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(1));
                        zzao zzb20 = ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(2));
                        Iterator zzf = zzb19.zzf();
                        if (zzf != null) {
                            while (zzf.hasNext()) {
                                unleashContext.zzf(zzc3, (zzao) zzf.next());
                                zzao zzb21 = unleashContext.zzb((zzae) zzb20);
                                if (zzb21 instanceof zzag) {
                                    zzagVar = (zzag) zzb21;
                                    String str7 = zzagVar.zzb;
                                    if ("break".equals(str7)) {
                                        zzatVar3 = zzao.zzf;
                                        return zzatVar3;
                                    }
                                    if ("return".equals(str7)) {
                                        return zzagVar;
                                    }
                                }
                            }
                        }
                        zzatVar3 = zzao.zzf;
                        return zzatVar3;
                    case 27:
                        zzh.zza("FOR_IN_CONST", arrayList, 3);
                        if (arrayList.get(0) instanceof zzas) {
                            return zze(new zzbc(unleashContext, ((zzao) arrayList.get(0)).zzc(), i3), ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(1)).zzf(), ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(2)));
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Variable name in FOR_IN_CONST must be a string");
                        return null;
                    case 28:
                        zzh.zza("FOR_IN_LET", arrayList, 3);
                        if (!(arrayList.get(0) instanceof zzas)) {
                            a$$ExternalSyntheticBUOutline0.m$3("Variable name in FOR_IN_LET must be a string");
                            return null;
                        }
                        String zzc4 = ((zzao) arrayList.get(0)).zzc();
                        zzao zzb22 = ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(1));
                        zzao zzb23 = ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(2));
                        Iterator zzf2 = zzb22.zzf();
                        if (zzf2 != null) {
                            while (zzf2.hasNext()) {
                                zzao zzaoVar10 = (zzao) zzf2.next();
                                UnleashContext zzc5 = unleashContext.zzc();
                                zzc5.zzf(zzc4, zzaoVar10);
                                zzao zzb24 = zzc5.zzb((zzae) zzb23);
                                if (zzb24 instanceof zzag) {
                                    zzagVar = (zzag) zzb24;
                                    String str8 = zzagVar.zzb;
                                    if ("break".equals(str8)) {
                                        zzatVar3 = zzao.zzf;
                                        return zzatVar3;
                                    }
                                    if ("return".equals(str8)) {
                                        return zzagVar;
                                    }
                                }
                            }
                        }
                        zzatVar3 = zzao.zzf;
                        return zzatVar3;
                    case 29:
                        zzh.zza("FOR_LET", arrayList, 4);
                        zzao zzaoVar11 = (zzao) arrayList.get(0);
                        zzz zzzVar11 = (zzz) unleashContext.sessionId;
                        zzz zzzVar12 = (zzz) unleashContext.sessionId;
                        zzao zzb25 = zzzVar11.zzb((UnleashContext) unleashContext, zzaoVar11);
                        if (!(zzb25 instanceof zzae)) {
                            a$$ExternalSyntheticBUOutline0.m$3("Initializer variables in FOR_LET must be an ArrayList");
                            return null;
                        }
                        zzae zzaeVar3 = (zzae) zzb25;
                        zzao zzaoVar12 = (zzao) arrayList.get(1);
                        zzao zzaoVar13 = (zzao) arrayList.get(2);
                        zzao zzb26 = zzzVar12.zzb((UnleashContext) unleashContext, (zzao) arrayList.get(3));
                        UnleashContext zzc6 = unleashContext.zzc();
                        for (int i5 = 0; i5 < zzaeVar3.zzh(); i5++) {
                            String zzc7 = zzaeVar3.zzl(i5).zzc();
                            zzc6.zze(zzc7, unleashContext.zzh(zzc7));
                        }
                        while (zzzVar12.zzb((UnleashContext) unleashContext, zzaoVar12).zze().booleanValue()) {
                            zzao zzb27 = unleashContext.zzb((zzae) zzb26);
                            if (zzb27 instanceof zzag) {
                                zzag zzagVar4 = (zzag) zzb27;
                                String str9 = zzagVar4.zzb;
                                if ("break".equals(str9)) {
                                    return zzao.zzf;
                                }
                                if ("return".equals(str9)) {
                                    return zzagVar4;
                                }
                            }
                            UnleashContext zzc8 = unleashContext.zzc();
                            for (int i6 = 0; i6 < zzaeVar3.zzh(); i6++) {
                                String zzc9 = zzaeVar3.zzl(i6).zzc();
                                zzc8.zze(zzc9, zzc6.zzh(zzc9));
                            }
                            zzc8.zza(zzaoVar13);
                            zzc6 = zzc8;
                        }
                        return zzao.zzf;
                    case 30:
                        zzh.zza("FOR_OF", arrayList, 3);
                        if (arrayList.get(0) instanceof zzas) {
                            return zzd(new zzbc(unleashContext, ((zzao) arrayList.get(0)).zzc(), i2), ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(1)), ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(2)));
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Variable name in FOR_OF must be a string");
                        return null;
                    case 31:
                        zzh.zza("FOR_OF_CONST", arrayList, 3);
                        if (arrayList.get(0) instanceof zzas) {
                            return zzd(new zzbc(unleashContext, ((zzao) arrayList.get(0)).zzc(), i3), ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(1)), ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(2)));
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Variable name in FOR_OF_CONST must be a string");
                        return null;
                    case 32:
                        zzh.zza("FOR_OF_LET", arrayList, 3);
                        if (arrayList.get(0) instanceof zzas) {
                            return zzd(new zzbc(unleashContext, ((zzao) arrayList.get(0)).zzc(), i), ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(1)), ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(2)));
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Variable name in FOR_OF_LET must be a string");
                        return null;
                    default:
                        zzb(str);
                        throw null;
                }
            case 5:
                zzbk zzbkVar5 = zzbk.ADD;
                int ordinal5 = zzh.zze(str).ordinal();
                if (ordinal5 == 0) {
                    zzh.zza("ADD", arrayList, 2);
                    zzao zzb28 = ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(0));
                    zzao zzb29 = ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(1));
                    zzasVar = ((zzb28 instanceof zzak) || (zzb28 instanceof zzas) || (zzb29 instanceof zzak) || (zzb29 instanceof zzas)) ? new zzas(String.valueOf(zzb28.zzc()).concat(String.valueOf(zzb29.zzc()))) : new zzah(Double.valueOf(zzb29.zzd().doubleValue() + zzb28.zzd().doubleValue()));
                } else if (ordinal5 == 21) {
                    zzh.zza("DIVIDE", arrayList, 2);
                    zzasVar = new zzah(Double.valueOf(((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(0)).zzd().doubleValue() / ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(1)).zzd().doubleValue()));
                } else {
                    if (ordinal5 == 59) {
                        zzh.zza("SUBTRACT", arrayList, 2);
                        return new zzah(Double.valueOf(((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(0)).zzd().doubleValue() + (-((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(1)).zzd().doubleValue())));
                    }
                    if (ordinal5 == 52 || ordinal5 == 53) {
                        zzh.zza(str, arrayList, 2);
                        zzao zzb30 = ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(0));
                        unleashContext.zza((zzao) arrayList.get(1));
                        return zzb30;
                    }
                    if (ordinal5 == 55 || ordinal5 == 56) {
                        zzh.zza(str, arrayList, 1);
                        return ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(0));
                    }
                    switch (ordinal5) {
                        case 44:
                            zzh.zza("MODULUS", arrayList, 2);
                            zzasVar = new zzah(Double.valueOf(((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(0)).zzd().doubleValue() % ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(1)).zzd().doubleValue()));
                            break;
                        case 45:
                            zzh.zza("MULTIPLY", arrayList, 2);
                            return new zzah(Double.valueOf(((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(1)).zzd().doubleValue() * ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(0)).zzd().doubleValue()));
                        case 46:
                            zzh.zza("NEGATE", arrayList, 1);
                            return new zzah(Double.valueOf(-((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(0)).zzd().doubleValue()));
                        default:
                            zzb(str);
                            throw null;
                    }
                }
                return zzasVar;
            case 6:
                if (str == null || str.isEmpty() || !unleashContext.zzd(str)) {
                    a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Command not found: ", str));
                    return null;
                }
                zzao zzh = unleashContext.zzh(str);
                if (zzh instanceof zzai) {
                    return ((zzai) zzh).zza(unleashContext, arrayList);
                }
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Function ", str, " is not defined"));
                return null;
            default:
                zzbk zzbkVar6 = zzbk.ADD;
                int ordinal6 = zzh.zze(str).ordinal();
                if (ordinal6 == 3) {
                    zzh.zza("ASSIGN", arrayList, 2);
                    zzao zzb31 = ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(0));
                    if (!(zzb31 instanceof zzas)) {
                        a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Expected string for assign var. got ", zzb31.getClass().getCanonicalName()));
                        return null;
                    }
                    String str10 = ((zzas) zzb31).zza;
                    if (!unleashContext.zzd(str10)) {
                        a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Attempting to assign undefined value ", str10));
                        return null;
                    }
                    zzao zzb32 = ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(1));
                    unleashContext.zze(str10, zzb32);
                    return zzb32;
                }
                if (ordinal6 == 14) {
                    zzh.zzb("CONST", arrayList, 2);
                    if (arrayList.size() % 2 != 0) {
                        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(arrayList.size(), "CONST requires an even number of arguments, found "));
                        return null;
                    }
                    while (i3 < arrayList.size() - 1) {
                        zzao zzb33 = ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(i3));
                        if (!(zzb33 instanceof zzas)) {
                            a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Expected string for const name. got ", zzb33.getClass().getCanonicalName()));
                            return null;
                        }
                        String str11 = ((zzas) zzb33).zza;
                        unleashContext.zzf(str11, ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(i3 + 1)));
                        ((HashMap) unleashContext.remoteAddress).put(str11, Boolean.TRUE);
                        i3 += 2;
                    }
                    return zzao.zzf;
                }
                if (ordinal6 == 24) {
                    zzh.zzb("EXPRESSION_LIST", arrayList, 1);
                    zzaoVar = zzao.zzf;
                    while (i3 < arrayList.size()) {
                        zzao zzb34 = ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(i3));
                        if (zzb34 instanceof zzag) {
                            a$$ExternalSyntheticBUOutline0.m$1("ControlValue cannot be in an expression list");
                            return null;
                        }
                        i3++;
                        zzaoVar = zzb34;
                    }
                } else {
                    if (ordinal6 == 33) {
                        zzh.zza("GET", arrayList, 1);
                        zzao zzb35 = ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(0));
                        if (zzb35 instanceof zzas) {
                            return unleashContext.zzh(((zzas) zzb35).zza);
                        }
                        a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Expected string for get var. got ", zzb35.getClass().getCanonicalName()));
                        return null;
                    }
                    if (ordinal6 == 49) {
                        zzh.zza("NULL", arrayList, 0);
                        return zzao.zzg;
                    }
                    if (ordinal6 == 58) {
                        zzh.zza("SET_PROPERTY", arrayList, 3);
                        zzao zzaoVar14 = (zzao) arrayList.get(0);
                        zzz zzzVar13 = (zzz) unleashContext.sessionId;
                        zzz zzzVar14 = (zzz) unleashContext.sessionId;
                        zzao zzb36 = zzzVar13.zzb((UnleashContext) unleashContext, zzaoVar14);
                        zzao zzb37 = zzzVar14.zzb((UnleashContext) unleashContext, (zzao) arrayList.get(1));
                        zzao zzb38 = zzzVar14.zzb((UnleashContext) unleashContext, (zzao) arrayList.get(2));
                        if (zzb36 == zzao.zzf || zzb36 == zzao.zzg) {
                            a$$ExternalSyntheticBUOutline0.m$1(CameraSelector$$ExternalSyntheticOutline0.m("Can't set property ", zzb37.zzc(), " of ", zzb36.zzc()));
                            return null;
                        }
                        if ((zzb36 instanceof zzae) && (zzb37 instanceof zzah)) {
                            ((zzae) zzb36).zzn(((zzah) zzb37).zza.intValue(), zzb38);
                        } else if (zzb36 instanceof zzak) {
                            ((zzak) zzb36).zzm(zzb37.zzc(), zzb38);
                        }
                        return zzb38;
                    }
                    if (ordinal6 != 17) {
                        if (ordinal6 != 18) {
                            if (ordinal6 == 35 || ordinal6 == 36) {
                                zzh.zza("GET_PROPERTY", arrayList, 2);
                                zzao zzb39 = ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(0));
                                zzao zzb40 = ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(1));
                                if ((zzb39 instanceof zzae) && zzh.zzd(zzb40)) {
                                    return ((zzae) zzb39).zzl(zzb40.zzd().intValue());
                                }
                                if (zzb39 instanceof zzak) {
                                    return ((zzak) zzb39).zzk(zzb40.zzc());
                                }
                                if (zzb39 instanceof zzas) {
                                    if ("length".equals(zzb40.zzc())) {
                                        return new zzah(Double.valueOf(((zzas) zzb39).zza.length()));
                                    }
                                    if (zzh.zzd(zzb40)) {
                                        double doubleValue = zzb40.zzd().doubleValue();
                                        String str12 = ((zzas) zzb39).zza;
                                        if (doubleValue < str12.length()) {
                                            return new zzas(String.valueOf(str12.charAt(zzb40.zzd().intValue())));
                                        }
                                    }
                                }
                                return zzao.zzf;
                            }
                            switch (ordinal6) {
                                case 62:
                                    zzh.zza("TYPEOF", arrayList, 1);
                                    zzao zzb41 = ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(0));
                                    if (zzb41 instanceof zzat) {
                                        str2 = "undefined";
                                    } else if (zzb41 instanceof zzaf) {
                                        str2 = InquiryField.BooleanField.TYPE;
                                    } else if (zzb41 instanceof zzah) {
                                        str2 = InquiryField.FloatField.TYPE2;
                                    } else if (zzb41 instanceof zzas) {
                                        str2 = InquiryField.StringField.TYPE;
                                    } else if (zzb41 instanceof zzan) {
                                        str2 = "function";
                                    } else {
                                        if ((zzb41 instanceof zzap) || (zzb41 instanceof zzag)) {
                                            JWK$$ExternalSyntheticBUOutline0.m("Unsupported value type %s in typeof", new Object[]{zzb41});
                                            return null;
                                        }
                                        str2 = "object";
                                    }
                                    return new zzas(str2);
                                case 63:
                                    zzh.zza("UNDEFINED", arrayList, 0);
                                    return zzao.zzf;
                                case 64:
                                    zzh.zzb("VAR", arrayList, 1);
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        zzao zzb42 = ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) it.next());
                                        if (!(zzb42 instanceof zzas)) {
                                            a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Expected string for var name. got ", zzb42.getClass().getCanonicalName()));
                                            return null;
                                        }
                                        unleashContext.zzf(((zzas) zzb42).zza, zzao.zzf);
                                    }
                                    return zzao.zzf;
                                default:
                                    zzb(str);
                                    throw null;
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return new zzal();
                        }
                        if (arrayList.size() % 2 != 0) {
                            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(arrayList.size(), "CREATE_OBJECT requires an even number of arguments, found "));
                            return null;
                        }
                        zzaoVar = new zzal();
                        while (i3 < arrayList.size() - 1) {
                            zzao zzb43 = ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(i3));
                            zzao zzb44 = ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) arrayList.get(i3 + 1));
                            if ((zzb43 instanceof zzag) || (zzb44 instanceof zzag)) {
                                a$$ExternalSyntheticBUOutline0.m$1("Failed to evaluate map entry");
                                return null;
                            }
                            zzaoVar.zzm(zzb43.zzc(), zzb44);
                            i3 += 2;
                        }
                    } else {
                        if (arrayList.isEmpty()) {
                            return new zzae();
                        }
                        zzaoVar = new zzae();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            zzao zzb45 = ((zzz) unleashContext.sessionId).zzb((UnleashContext) unleashContext, (zzao) it2.next());
                            if (zzb45 instanceof zzag) {
                                a$$ExternalSyntheticBUOutline0.m$1("Failed to evaluate array element");
                                return null;
                            }
                            zzaoVar.zzn(i3, zzb45);
                            i3++;
                        }
                    }
                }
                return zzaoVar;
        }
    }

    public final void zzb(String str) {
        if (!this.zza.contains(zzh.zze(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }

    public static boolean zze(zzao zzaoVar, zzao zzaoVar2) {
        if (zzaoVar instanceof zzak) {
            zzaoVar = new zzas(zzaoVar.zzc());
        }
        if (zzaoVar2 instanceof zzak) {
            zzaoVar2 = new zzas(zzaoVar2.zzc());
        }
        return (((zzaoVar instanceof zzas) && (zzaoVar2 instanceof zzas)) || !(Double.isNaN(zzaoVar.zzd().doubleValue()) || Double.isNaN(zzaoVar2.zzd().doubleValue()))) && !zzc(zzaoVar2, zzaoVar);
    }

    public static zzan zzc(UnleashContext unleashContext, List list) {
        zzbk zzbkVar = zzbk.ADD;
        zzh.zzb("FN", list, 2);
        zzao zzb = ((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) list.get(0));
        zzao zzb2 = ((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) list.get(1));
        if (zzb2 instanceof zzae) {
            List zzb3 = ((zzae) zzb2).zzb();
            List arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new zzan(zzb.zzc(), (ArrayList) zzb3, arrayList, unleashContext);
        }
        a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("FN requires an ArrayValue of parameter names found ", zzb2.getClass().getCanonicalName()));
        return null;
    }

    public static zzao zzd(zzbc zzbcVar, zzao zzaoVar, zzao zzaoVar2) {
        if (zzaoVar instanceof Iterable) {
            return zze(zzbcVar, ((Iterable) zzaoVar).iterator(), zzaoVar2);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Non-iterable type in for...of loop.");
        return null;
    }
}
