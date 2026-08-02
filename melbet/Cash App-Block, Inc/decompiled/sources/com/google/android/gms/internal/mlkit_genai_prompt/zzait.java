package com.google.android.gms.internal.mlkit_genai_prompt;

import android.os.SystemClock;
import com.google.mlkit.genai.prompt.Candidate;
import com.google.mlkit.genai.prompt.GenerateContentRequest;
import com.google.mlkit.genai.prompt.GenerateContentResponse;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.workflow1.internal.SubtreeManager;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzait implements zzhp {
    public final /* synthetic */ zzajh zza;
    public final /* synthetic */ AtomicLong zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ Object zzd;

    public /* synthetic */ zzait(zzajh zzajhVar, AtomicLong atomicLong, long j, Object obj) {
        this.zza = zzajhVar;
        this.zzb = atomicLong;
        this.zzc = j;
        this.zzd = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014e  */
    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(Object obj) {
        Iterator it;
        zzajh zzajhVar = this.zza;
        AtomicLong atomicLong = this.zzb;
        long j = this.zzc;
        Object obj2 = this.zzd;
        SubtreeManager subtreeManager = new SubtreeManager();
        subtreeManager.contextForChildren = zzabz.NO_ERROR;
        zzct zzctVar = zzajhVar.zzd;
        subtreeManager.snapshotCache = Integer.valueOf(zzctVar != null ? zzctVar.zzf : -1);
        subtreeManager.emitActionToParent = Boolean.valueOf(zzajhVar.zzf);
        subtreeManager.children = Long.valueOf(atomicLong.get() & Long.MAX_VALUE);
        subtreeManager.idCounter = Long.valueOf((SystemClock.elapsedRealtime() - j) & Long.MAX_VALUE);
        zzajhVar.zzf = false;
        GenerateContentResponse zzk = zzajhVar.zzk(obj);
        zzlq zzlqVar = zzajhVar.zzc;
        zzlqVar.getClass();
        GenerateContentRequest generateContentRequest = (GenerateContentRequest) obj2;
        generateContentRequest.getClass();
        ArrayList arrayList = new ArrayList();
        zzlq zzlqVar2 = new zzlq(1);
        zzlqVar2.zzc = zzafh.MODALITY_TYPE_TEXT;
        zzlqVar2.zzd = Long.valueOf(zzlqVar.zzg(generateContentRequest));
        int length = generateContentRequest.zzh.zza.length();
        zzfr zzfrVar = new zzfr();
        zzpb zzpbVar = (zzpb) zzlqVar.zzc;
        zzpb zzpbVar2 = zzpb.zza;
        zznl zznlVar = zznl.zza;
        int ordinal = zzpbVar.ordinal();
        Integer num = null;
        if (ordinal != 0) {
            if (ordinal == 1) {
                zzfrVar.zza = 0;
                zzfrVar.zzb = 0;
                zzlqVar2.zze = new zzagx(zzfrVar);
                arrayList.add(new zzafj(zzlqVar2));
                zzajt zzajtVar = (zzajt) zzlqVar.zze;
                JWECryptoParts jWECryptoParts = new JWECryptoParts();
                zzlq zzlqVar3 = new zzlq(2);
                zzlqVar3.zzc = (zzagc) zzlqVar.zzd;
                zzmz zzmzVar = new zzmz();
                zzmzVar.zzc = Float.valueOf(generateContentRequest.zza);
                zzmzVar.zzf = 0;
                zzmzVar.zzh = Integer.valueOf(generateContentRequest.zzc);
                zzmzVar.zzg = Integer.valueOf(generateContentRequest.zzd);
                zzmzVar.zzi = Integer.valueOf(generateContentRequest.zze);
                zzmzVar.zzj = zzil.zzj(arrayList);
                zzlqVar3.zzd = new zzafy(zzmzVar);
                subtreeManager.workflowSession = Integer.valueOf(zzlqVar.zzg(generateContentRequest));
                it = zzk.zza.iterator();
                if (it.hasNext()) {
                    String str = ((Candidate) it.next()).zza;
                    Integer valueOf = Integer.valueOf(str != null ? str.length() : 0);
                    loop0: while (true) {
                        num = valueOf;
                        while (it.hasNext()) {
                            String str2 = ((Candidate) it.next()).zza;
                            valueOf = Integer.valueOf(str2 != null ? str2.length() : 0);
                            if (num.compareTo(valueOf) < 0) {
                                break;
                            }
                        }
                    }
                }
                subtreeManager.interceptor = Integer.valueOf(num != null ? num.intValue() : 0);
                zzlqVar3.zze = new zzagi(subtreeManager);
                jWECryptoParts.iv = new zzafv(zzlqVar3);
                zzajtVar.zzc(new zzfr(jWECryptoParts), zzlq.zzh(zzpbVar, zznl.zzb));
                return zzk;
            }
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        zzfrVar.zza = Integer.valueOf(length);
        zzfrVar.zzb = 0;
        zzlqVar2.zze = new zzagx(zzfrVar);
        arrayList.add(new zzafj(zzlqVar2));
        zzajt zzajtVar2 = (zzajt) zzlqVar.zze;
        JWECryptoParts jWECryptoParts2 = new JWECryptoParts();
        zzlq zzlqVar32 = new zzlq(2);
        zzlqVar32.zzc = (zzagc) zzlqVar.zzd;
        zzmz zzmzVar2 = new zzmz();
        zzmzVar2.zzc = Float.valueOf(generateContentRequest.zza);
        zzmzVar2.zzf = 0;
        zzmzVar2.zzh = Integer.valueOf(generateContentRequest.zzc);
        zzmzVar2.zzg = Integer.valueOf(generateContentRequest.zzd);
        zzmzVar2.zzi = Integer.valueOf(generateContentRequest.zze);
        zzmzVar2.zzj = zzil.zzj(arrayList);
        zzlqVar32.zzd = new zzafy(zzmzVar2);
        subtreeManager.workflowSession = Integer.valueOf(zzlqVar.zzg(generateContentRequest));
        it = zzk.zza.iterator();
        if (it.hasNext()) {
        }
        subtreeManager.interceptor = Integer.valueOf(num != null ? num.intValue() : 0);
        zzlqVar32.zze = new zzagi(subtreeManager);
        jWECryptoParts2.iv = new zzafv(zzlqVar32);
        zzajtVar2.zzc(new zzfr(jWECryptoParts2), zzlq.zzh(zzpbVar, zznl.zzb));
        return zzk;
    }
}
