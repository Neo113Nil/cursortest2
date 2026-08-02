package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzggj {
    private final List zza = new ArrayList();
    private final zzgrw zzb = zzgrw.zza;
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzggh) it.next()).zza = false;
        }
    }

    public final zzggj zza(zzggh zzgghVar) {
        if (zzgghVar.zzf != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzgghVar.zza) {
            zzd();
        }
        zzgghVar.zzf = this;
        this.zza.add(zzgghVar);
        return this;
    }

    public final zzggm zzb() throws GeneralSecurityException {
        zzggi zzggiVar;
        int i;
        zzggi zzggiVar2;
        zzggi zzggiVar3;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.zzc = true;
        List list = this.zza;
        zzgvd zzd = zzgvg.zzd();
        int i2 = 0;
        while (i2 < list.size() - 1) {
            int i3 = i2 + 1;
            zzggi zzggiVar4 = ((zzggh) list.get(i2)).zze;
            zzggiVar2 = zzggi.zza;
            if (zzggiVar4 == zzggiVar2) {
                zzggi zzggiVar5 = ((zzggh) list.get(i3)).zze;
                zzggiVar3 = zzggi.zza;
                if (zzggiVar5 != zzggiVar3) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
            i2 = i3;
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (zzggh zzgghVar : this.zza) {
            zzgge unused = zzgghVar.zzb;
            if (zzgghVar.zze == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            zzggi zzggiVar6 = zzgghVar.zze;
            zzggiVar = zzggi.zza;
            int i4 = 3;
            if (zzggiVar6 == zzggiVar) {
                i = 0;
                while (true) {
                    if (i != 0 && !hashSet.contains(Integer.valueOf(i))) {
                        break;
                    }
                    SecureRandom secureRandom = new SecureRandom();
                    byte[] bArr = new byte[4];
                    int i5 = 0;
                    while (i5 == 0) {
                        secureRandom.nextBytes(bArr);
                        i5 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    }
                    i = i5;
                }
            } else {
                zzggi unused2 = zzgghVar.zze;
                i = 0;
            }
            Integer valueOf = Integer.valueOf(i);
            if (hashSet.contains(valueOf)) {
                throw new GeneralSecurityException("Id " + i + " is used twice in the keyset");
            }
            hashSet.add(valueOf);
            zzggh.zza(zzgghVar);
            zzggq zzggqVar = zzgghVar.zzd;
            zzgge zzc = zzgghVar.zzc();
            if (!zzgge.zza.equals(zzc)) {
                if (zzgge.zzb.equals(zzc)) {
                    i4 = 4;
                } else {
                    if (!zzgge.zzc.equals(zzc)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    i4 = 5;
                }
            }
            zzgoy zzgoyVar = (zzgoy) (zzggqVar instanceof zzgnp ? ((zzgnp) zzggqVar).zzb() : zzgoe.zzd().zzf(zzggqVar, zzgoy.class));
            zzgut zza = zzghb.zza(zzgoyVar.zzc());
            zzgve zzd2 = zzgvf.zzd();
            zzd2.zzb(i);
            zzd2.zzd(i4);
            zzd2.zza(zza);
            zzd2.zzc(zzgoyVar.zzc().zzf());
            zzd.zza((zzgvf) zzd2.zzal());
            if (zzgghVar.zza) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (zzgghVar.zzb != zzgge.zza) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = valueOf;
            }
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        zzd.zzb(num.intValue());
        return zzggm.zzb((zzgvg) zzd.zzal(), this.zzb);
    }
}
