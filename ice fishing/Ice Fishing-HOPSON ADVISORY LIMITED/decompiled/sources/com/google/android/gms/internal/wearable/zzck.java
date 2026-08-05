package com.google.android.gms.internal.wearable;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzck implements zzex {
    private final zzcj zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzck(zzcj zzcjVar) {
        this.zza = zzcjVar;
        zzcjVar.zzc = this;
    }

    private final void zzO(int i) throws IOException {
        if ((this.zzb & 7) != i) {
            throw new zzdu("Protocol message tag had invalid wire type.");
        }
    }

    private final void zzP(Object obj, zzey zzeyVar, zzcs zzcsVar) throws IOException {
        zzcj zzcjVar = this.zza;
        int zzn = zzcjVar.zzn();
        if (zzcjVar.zza >= zzcjVar.zzb) {
            throw new zzdv("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int zzA = zzcjVar.zzA(zzn);
        zzcjVar.zza++;
        zzeyVar.zzg(obj, this, zzcsVar);
        zzcjVar.zzb(0);
        zzcjVar.zza--;
        zzcjVar.zzB(zzA);
    }

    private final void zzQ(Object obj, zzey zzeyVar, zzcs zzcsVar) throws IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzeyVar.zzg(obj, this, zzcsVar);
            if (this.zzb == this.zzc) {
            } else {
                throw new zzdv("Failed to parse the message.");
            }
        } finally {
            this.zzc = i;
        }
    }

    private final void zzR(int i) throws IOException {
        if (this.zza.zzD() != i) {
            throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void zzS(int i) throws IOException {
        if ((i & 3) != 0) {
            throw new zzdv("Failed to parse the message.");
        }
    }

    private static final void zzT(int i) throws IOException {
        if ((i & 7) != 0) {
            throw new zzdv("Failed to parse the message.");
        }
    }

    public static zzck zza(zzcj zzcjVar) {
        Object obj = zzcjVar.zzc;
        return obj != null ? (zzck) obj : new zzck(zzcjVar);
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final void zzA(List list) throws IOException {
        int zza;
        int i;
        if (list instanceof zzdh) {
            zzdh zzdhVar = (zzdh) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzdu("Protocol message tag had invalid wire type.");
                }
                zzcj zzcjVar = this.zza;
                int zzD = zzcjVar.zzD() + zzcjVar.zzn();
                do {
                    zzdhVar.zzf(zzcjVar.zzg());
                } while (zzcjVar.zzD() < zzD);
                zzR(zzD);
                return;
            }
            do {
                zzcj zzcjVar2 = this.zza;
                zzdhVar.zzf(zzcjVar2.zzg());
                if (zzcjVar2.zzC()) {
                    return;
                } else {
                    i = zzcjVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzdu("Protocol message tag had invalid wire type.");
                }
                zzcj zzcjVar3 = this.zza;
                int zzD2 = zzcjVar3.zzD() + zzcjVar3.zzn();
                do {
                    list.add(Integer.valueOf(zzcjVar3.zzg()));
                } while (zzcjVar3.zzD() < zzD2);
                zzR(zzD2);
                return;
            }
            do {
                zzcj zzcjVar4 = this.zza;
                list.add(Integer.valueOf(zzcjVar4.zzg()));
                if (zzcjVar4.zzC()) {
                    return;
                } else {
                    zza = zzcjVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final void zzB(List list) throws IOException {
        int zza;
        int i;
        if (list instanceof zzea) {
            zzea zzeaVar = (zzea) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new zzdu("Protocol message tag had invalid wire type.");
                }
                zzcj zzcjVar = this.zza;
                int zzn = zzcjVar.zzn();
                zzT(zzn);
                int zzD = zzcjVar.zzD() + zzn;
                do {
                    zzeaVar.zzf(zzcjVar.zzh());
                } while (zzcjVar.zzD() < zzD);
                return;
            }
            do {
                zzcj zzcjVar2 = this.zza;
                zzeaVar.zzf(zzcjVar2.zzh());
                if (zzcjVar2.zzC()) {
                    return;
                } else {
                    i = zzcjVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new zzdu("Protocol message tag had invalid wire type.");
                }
                zzcj zzcjVar3 = this.zza;
                int zzn2 = zzcjVar3.zzn();
                zzT(zzn2);
                int zzD2 = zzcjVar3.zzD() + zzn2;
                do {
                    list.add(Long.valueOf(zzcjVar3.zzh()));
                } while (zzcjVar3.zzD() < zzD2);
                return;
            }
            do {
                zzcj zzcjVar4 = this.zza;
                list.add(Long.valueOf(zzcjVar4.zzh()));
                if (zzcjVar4.zzC()) {
                    return;
                } else {
                    zza = zzcjVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final void zzC(List list) throws IOException {
        int zza;
        int i;
        if (list instanceof zzdh) {
            zzdh zzdhVar = (zzdh) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                zzcj zzcjVar = this.zza;
                int zzn = zzcjVar.zzn();
                zzS(zzn);
                int zzD = zzcjVar.zzD() + zzn;
                do {
                    zzdhVar.zzf(zzcjVar.zzi());
                } while (zzcjVar.zzD() < zzD);
                return;
            }
            if (i2 != 5) {
                throw new zzdu("Protocol message tag had invalid wire type.");
            }
            do {
                zzcj zzcjVar2 = this.zza;
                zzdhVar.zzf(zzcjVar2.zzi());
                if (zzcjVar2.zzC()) {
                    return;
                } else {
                    i = zzcjVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                zzcj zzcjVar3 = this.zza;
                int zzn2 = zzcjVar3.zzn();
                zzS(zzn2);
                int zzD2 = zzcjVar3.zzD() + zzn2;
                do {
                    list.add(Integer.valueOf(zzcjVar3.zzi()));
                } while (zzcjVar3.zzD() < zzD2);
                return;
            }
            if (i3 != 5) {
                throw new zzdu("Protocol message tag had invalid wire type.");
            }
            do {
                zzcj zzcjVar4 = this.zza;
                list.add(Integer.valueOf(zzcjVar4.zzi()));
                if (zzcjVar4.zzC()) {
                    return;
                } else {
                    zza = zzcjVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final void zzD(List list) throws IOException {
        int zza;
        int i;
        if (list instanceof zzby) {
            zzby zzbyVar = (zzby) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzdu("Protocol message tag had invalid wire type.");
                }
                zzcj zzcjVar = this.zza;
                int zzD = zzcjVar.zzD() + zzcjVar.zzn();
                do {
                    zzbyVar.zzf(zzcjVar.zzj());
                } while (zzcjVar.zzD() < zzD);
                zzR(zzD);
                return;
            }
            do {
                zzcj zzcjVar2 = this.zza;
                zzbyVar.zzf(zzcjVar2.zzj());
                if (zzcjVar2.zzC()) {
                    return;
                } else {
                    i = zzcjVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzdu("Protocol message tag had invalid wire type.");
                }
                zzcj zzcjVar3 = this.zza;
                int zzD2 = zzcjVar3.zzD() + zzcjVar3.zzn();
                do {
                    list.add(Boolean.valueOf(zzcjVar3.zzj()));
                } while (zzcjVar3.zzD() < zzD2);
                zzR(zzD2);
                return;
            }
            do {
                zzcj zzcjVar4 = this.zza;
                list.add(Boolean.valueOf(zzcjVar4.zzj()));
                if (zzcjVar4.zzC()) {
                    return;
                } else {
                    zza = zzcjVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    public final void zzE(List list, boolean z) throws IOException {
        int zza;
        int i;
        if ((this.zzb & 7) != 2) {
            throw new zzdu("Protocol message tag had invalid wire type.");
        }
        if ((list instanceof zzdx) && !z) {
            zzdx zzdxVar = (zzdx) list;
            do {
                zzp();
                zzdxVar.zzb();
                zzcj zzcjVar = this.zza;
                if (zzcjVar.zzC()) {
                    return;
                } else {
                    i = zzcjVar.zza();
                }
            } while (i == this.zzb);
        } else {
            do {
                list.add(z ? zzm() : zzl());
                zzcj zzcjVar2 = this.zza;
                if (zzcjVar2.zzC()) {
                    return;
                } else {
                    zza = zzcjVar2.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final void zzF(List list, zzey zzeyVar, zzcs zzcsVar) throws IOException {
        int zza;
        int i = this.zzb;
        if ((i & 7) != 2) {
            throw new zzdu("Protocol message tag had invalid wire type.");
        }
        do {
            Object zza2 = zzeyVar.zza();
            zzP(zza2, zzeyVar, zzcsVar);
            zzeyVar.zzk(zza2);
            list.add(zza2);
            zzcj zzcjVar = this.zza;
            if (zzcjVar.zzC() || this.zzd != 0) {
                return;
            } else {
                zza = zzcjVar.zza();
            }
        } while (zza == i);
        this.zzd = zza;
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    @Deprecated
    public final void zzG(List list, zzey zzeyVar, zzcs zzcsVar) throws IOException {
        int zza;
        int i = this.zzb;
        if ((i & 7) != 3) {
            throw new zzdu("Protocol message tag had invalid wire type.");
        }
        do {
            Object zza2 = zzeyVar.zza();
            zzQ(zza2, zzeyVar, zzcsVar);
            zzeyVar.zzk(zza2);
            list.add(zza2);
            zzcj zzcjVar = this.zza;
            if (zzcjVar.zzC() || this.zzd != 0) {
                return;
            } else {
                zza = zzcjVar.zza();
            }
        } while (zza == i);
        this.zzd = zza;
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final void zzI(List list) throws IOException {
        int zza;
        int i;
        if (list instanceof zzdh) {
            zzdh zzdhVar = (zzdh) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzdu("Protocol message tag had invalid wire type.");
                }
                zzcj zzcjVar = this.zza;
                int zzD = zzcjVar.zzD() + zzcjVar.zzn();
                do {
                    zzdhVar.zzf(zzcjVar.zzn());
                } while (zzcjVar.zzD() < zzD);
                zzR(zzD);
                return;
            }
            do {
                zzcj zzcjVar2 = this.zza;
                zzdhVar.zzf(zzcjVar2.zzn());
                if (zzcjVar2.zzC()) {
                    return;
                } else {
                    i = zzcjVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzdu("Protocol message tag had invalid wire type.");
                }
                zzcj zzcjVar3 = this.zza;
                int zzD2 = zzcjVar3.zzD() + zzcjVar3.zzn();
                do {
                    list.add(Integer.valueOf(zzcjVar3.zzn()));
                } while (zzcjVar3.zzD() < zzD2);
                zzR(zzD2);
                return;
            }
            do {
                zzcj zzcjVar4 = this.zza;
                list.add(Integer.valueOf(zzcjVar4.zzn()));
                if (zzcjVar4.zzC()) {
                    return;
                } else {
                    zza = zzcjVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final void zzJ(List list) throws IOException {
        int zza;
        int i;
        if (list instanceof zzdh) {
            zzdh zzdhVar = (zzdh) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzdu("Protocol message tag had invalid wire type.");
                }
                zzcj zzcjVar = this.zza;
                int zzD = zzcjVar.zzD() + zzcjVar.zzn();
                do {
                    zzdhVar.zzf(zzcjVar.zzo());
                } while (zzcjVar.zzD() < zzD);
                zzR(zzD);
                return;
            }
            do {
                zzcj zzcjVar2 = this.zza;
                zzdhVar.zzf(zzcjVar2.zzo());
                if (zzcjVar2.zzC()) {
                    return;
                } else {
                    i = zzcjVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzdu("Protocol message tag had invalid wire type.");
                }
                zzcj zzcjVar3 = this.zza;
                int zzD2 = zzcjVar3.zzD() + zzcjVar3.zzn();
                do {
                    list.add(Integer.valueOf(zzcjVar3.zzo()));
                } while (zzcjVar3.zzD() < zzD2);
                zzR(zzD2);
                return;
            }
            do {
                zzcj zzcjVar4 = this.zza;
                list.add(Integer.valueOf(zzcjVar4.zzo()));
                if (zzcjVar4.zzC()) {
                    return;
                } else {
                    zza = zzcjVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final void zzK(List list) throws IOException {
        int zza;
        int i;
        if (list instanceof zzdh) {
            zzdh zzdhVar = (zzdh) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                zzcj zzcjVar = this.zza;
                int zzn = zzcjVar.zzn();
                zzS(zzn);
                int zzD = zzcjVar.zzD() + zzn;
                do {
                    zzdhVar.zzf(zzcjVar.zzp());
                } while (zzcjVar.zzD() < zzD);
                return;
            }
            if (i2 != 5) {
                throw new zzdu("Protocol message tag had invalid wire type.");
            }
            do {
                zzcj zzcjVar2 = this.zza;
                zzdhVar.zzf(zzcjVar2.zzp());
                if (zzcjVar2.zzC()) {
                    return;
                } else {
                    i = zzcjVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                zzcj zzcjVar3 = this.zza;
                int zzn2 = zzcjVar3.zzn();
                zzS(zzn2);
                int zzD2 = zzcjVar3.zzD() + zzn2;
                do {
                    list.add(Integer.valueOf(zzcjVar3.zzp()));
                } while (zzcjVar3.zzD() < zzD2);
                return;
            }
            if (i3 != 5) {
                throw new zzdu("Protocol message tag had invalid wire type.");
            }
            do {
                zzcj zzcjVar4 = this.zza;
                list.add(Integer.valueOf(zzcjVar4.zzp()));
                if (zzcjVar4.zzC()) {
                    return;
                } else {
                    zza = zzcjVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final void zzL(List list) throws IOException {
        int zza;
        int i;
        if (list instanceof zzea) {
            zzea zzeaVar = (zzea) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new zzdu("Protocol message tag had invalid wire type.");
                }
                zzcj zzcjVar = this.zza;
                int zzn = zzcjVar.zzn();
                zzT(zzn);
                int zzD = zzcjVar.zzD() + zzn;
                do {
                    zzeaVar.zzf(zzcjVar.zzq());
                } while (zzcjVar.zzD() < zzD);
                return;
            }
            do {
                zzcj zzcjVar2 = this.zza;
                zzeaVar.zzf(zzcjVar2.zzq());
                if (zzcjVar2.zzC()) {
                    return;
                } else {
                    i = zzcjVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new zzdu("Protocol message tag had invalid wire type.");
                }
                zzcj zzcjVar3 = this.zza;
                int zzn2 = zzcjVar3.zzn();
                zzT(zzn2);
                int zzD2 = zzcjVar3.zzD() + zzn2;
                do {
                    list.add(Long.valueOf(zzcjVar3.zzq()));
                } while (zzcjVar3.zzD() < zzD2);
                return;
            }
            do {
                zzcj zzcjVar4 = this.zza;
                list.add(Long.valueOf(zzcjVar4.zzq()));
                if (zzcjVar4.zzC()) {
                    return;
                } else {
                    zza = zzcjVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final void zzM(List list) throws IOException {
        int zza;
        int i;
        if (list instanceof zzdh) {
            zzdh zzdhVar = (zzdh) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzdu("Protocol message tag had invalid wire type.");
                }
                zzcj zzcjVar = this.zza;
                int zzD = zzcjVar.zzD() + zzcjVar.zzn();
                do {
                    zzdhVar.zzf(zzcjVar.zzr());
                } while (zzcjVar.zzD() < zzD);
                zzR(zzD);
                return;
            }
            do {
                zzcj zzcjVar2 = this.zza;
                zzdhVar.zzf(zzcjVar2.zzr());
                if (zzcjVar2.zzC()) {
                    return;
                } else {
                    i = zzcjVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzdu("Protocol message tag had invalid wire type.");
                }
                zzcj zzcjVar3 = this.zza;
                int zzD2 = zzcjVar3.zzD() + zzcjVar3.zzn();
                do {
                    list.add(Integer.valueOf(zzcjVar3.zzr()));
                } while (zzcjVar3.zzD() < zzD2);
                zzR(zzD2);
                return;
            }
            do {
                zzcj zzcjVar4 = this.zza;
                list.add(Integer.valueOf(zzcjVar4.zzr()));
                if (zzcjVar4.zzC()) {
                    return;
                } else {
                    zza = zzcjVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final void zzN(List list) throws IOException {
        int zza;
        int i;
        if (list instanceof zzea) {
            zzea zzeaVar = (zzea) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzdu("Protocol message tag had invalid wire type.");
                }
                zzcj zzcjVar = this.zza;
                int zzD = zzcjVar.zzD() + zzcjVar.zzn();
                do {
                    zzeaVar.zzf(zzcjVar.zzs());
                } while (zzcjVar.zzD() < zzD);
                zzR(zzD);
                return;
            }
            do {
                zzcj zzcjVar2 = this.zza;
                zzeaVar.zzf(zzcjVar2.zzs());
                if (zzcjVar2.zzC()) {
                    return;
                } else {
                    i = zzcjVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzdu("Protocol message tag had invalid wire type.");
                }
                zzcj zzcjVar3 = this.zza;
                int zzD2 = zzcjVar3.zzD() + zzcjVar3.zzn();
                do {
                    list.add(Long.valueOf(zzcjVar3.zzs()));
                } while (zzcjVar3.zzD() < zzD2);
                zzR(zzD2);
                return;
            }
            do {
                zzcj zzcjVar4 = this.zza;
                list.add(Long.valueOf(zzcjVar4.zzs()));
                if (zzcjVar4.zzC()) {
                    return;
                } else {
                    zza = zzcjVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final int zzb() throws IOException {
        int i = this.zzd;
        if (i != 0) {
            this.zzb = i;
            this.zzd = 0;
        } else {
            i = this.zza.zza();
            this.zzb = i;
        }
        if (i == 0 || i == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final int zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final double zzd() throws IOException {
        zzO(1);
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final float zze() throws IOException {
        zzO(5);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final long zzf() throws IOException {
        zzO(0);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final long zzg() throws IOException {
        zzO(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final int zzh() throws IOException {
        zzO(0);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final long zzi() throws IOException {
        zzO(1);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final int zzj() throws IOException {
        zzO(5);
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final boolean zzk() throws IOException {
        zzO(0);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final String zzl() throws IOException {
        zzO(2);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final String zzm() throws IOException {
        zzO(2);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final void zzn(Object obj, zzey zzeyVar, zzcs zzcsVar) throws IOException {
        zzO(2);
        zzP(obj, zzeyVar, zzcsVar);
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final void zzo(Object obj, zzey zzeyVar, zzcs zzcsVar) throws IOException {
        zzO(3);
        zzQ(obj, zzeyVar, zzcsVar);
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final zzcg zzp() throws IOException {
        zzO(2);
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final int zzq() throws IOException {
        zzO(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final int zzr() throws IOException {
        zzO(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final int zzs() throws IOException {
        zzO(5);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final long zzt() throws IOException {
        zzO(1);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final int zzu() throws IOException {
        zzO(0);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final long zzv() throws IOException {
        zzO(0);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final void zzw(List list) throws IOException {
        int zza;
        int i;
        if (list instanceof zzcp) {
            zzcp zzcpVar = (zzcp) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new zzdu("Protocol message tag had invalid wire type.");
                }
                zzcj zzcjVar = this.zza;
                int zzn = zzcjVar.zzn();
                zzT(zzn);
                int zzD = zzcjVar.zzD() + zzn;
                do {
                    zzcpVar.zzf(zzcjVar.zzc());
                } while (zzcjVar.zzD() < zzD);
                return;
            }
            do {
                zzcj zzcjVar2 = this.zza;
                zzcpVar.zzf(zzcjVar2.zzc());
                if (zzcjVar2.zzC()) {
                    return;
                } else {
                    i = zzcjVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new zzdu("Protocol message tag had invalid wire type.");
                }
                zzcj zzcjVar3 = this.zza;
                int zzn2 = zzcjVar3.zzn();
                zzT(zzn2);
                int zzD2 = zzcjVar3.zzD() + zzn2;
                do {
                    list.add(Double.valueOf(zzcjVar3.zzc()));
                } while (zzcjVar3.zzD() < zzD2);
                return;
            }
            do {
                zzcj zzcjVar4 = this.zza;
                list.add(Double.valueOf(zzcjVar4.zzc()));
                if (zzcjVar4.zzC()) {
                    return;
                } else {
                    zza = zzcjVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final void zzx(List list) throws IOException {
        int zza;
        int i;
        if (list instanceof zzcz) {
            zzcz zzczVar = (zzcz) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                zzcj zzcjVar = this.zza;
                int zzn = zzcjVar.zzn();
                zzS(zzn);
                int zzD = zzcjVar.zzD() + zzn;
                do {
                    zzczVar.zzh(zzcjVar.zzd());
                } while (zzcjVar.zzD() < zzD);
                return;
            }
            if (i2 != 5) {
                throw new zzdu("Protocol message tag had invalid wire type.");
            }
            do {
                zzcj zzcjVar2 = this.zza;
                zzczVar.zzh(zzcjVar2.zzd());
                if (zzcjVar2.zzC()) {
                    return;
                } else {
                    i = zzcjVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                zzcj zzcjVar3 = this.zza;
                int zzn2 = zzcjVar3.zzn();
                zzS(zzn2);
                int zzD2 = zzcjVar3.zzD() + zzn2;
                do {
                    list.add(Float.valueOf(zzcjVar3.zzd()));
                } while (zzcjVar3.zzD() < zzD2);
                return;
            }
            if (i3 != 5) {
                throw new zzdu("Protocol message tag had invalid wire type.");
            }
            do {
                zzcj zzcjVar4 = this.zza;
                list.add(Float.valueOf(zzcjVar4.zzd()));
                if (zzcjVar4.zzC()) {
                    return;
                } else {
                    zza = zzcjVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final void zzy(List list) throws IOException {
        int zza;
        int i;
        if (list instanceof zzea) {
            zzea zzeaVar = (zzea) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzdu("Protocol message tag had invalid wire type.");
                }
                zzcj zzcjVar = this.zza;
                int zzD = zzcjVar.zzD() + zzcjVar.zzn();
                do {
                    zzeaVar.zzf(zzcjVar.zze());
                } while (zzcjVar.zzD() < zzD);
                zzR(zzD);
                return;
            }
            do {
                zzcj zzcjVar2 = this.zza;
                zzeaVar.zzf(zzcjVar2.zze());
                if (zzcjVar2.zzC()) {
                    return;
                } else {
                    i = zzcjVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzdu("Protocol message tag had invalid wire type.");
                }
                zzcj zzcjVar3 = this.zza;
                int zzD2 = zzcjVar3.zzD() + zzcjVar3.zzn();
                do {
                    list.add(Long.valueOf(zzcjVar3.zze()));
                } while (zzcjVar3.zzD() < zzD2);
                zzR(zzD2);
                return;
            }
            do {
                zzcj zzcjVar4 = this.zza;
                list.add(Long.valueOf(zzcjVar4.zze()));
                if (zzcjVar4.zzC()) {
                    return;
                } else {
                    zza = zzcjVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final void zzz(List list) throws IOException {
        int zza;
        int i;
        if (list instanceof zzea) {
            zzea zzeaVar = (zzea) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzdu("Protocol message tag had invalid wire type.");
                }
                zzcj zzcjVar = this.zza;
                int zzD = zzcjVar.zzD() + zzcjVar.zzn();
                do {
                    zzeaVar.zzf(zzcjVar.zzf());
                } while (zzcjVar.zzD() < zzD);
                zzR(zzD);
                return;
            }
            do {
                zzcj zzcjVar2 = this.zza;
                zzeaVar.zzf(zzcjVar2.zzf());
                if (zzcjVar2.zzC()) {
                    return;
                } else {
                    i = zzcjVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzdu("Protocol message tag had invalid wire type.");
                }
                zzcj zzcjVar3 = this.zza;
                int zzD2 = zzcjVar3.zzD() + zzcjVar3.zzn();
                do {
                    list.add(Long.valueOf(zzcjVar3.zzf()));
                } while (zzcjVar3.zzD() < zzD2);
                zzR(zzD2);
                return;
            }
            do {
                zzcj zzcjVar4 = this.zza;
                list.add(Long.valueOf(zzcjVar4.zzf()));
                if (zzcjVar4.zzC()) {
                    return;
                } else {
                    zza = zzcjVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.wearable.zzex
    public final void zzH(List list) throws IOException {
        int zza;
        if ((this.zzb & 7) != 2) {
            throw new zzdu("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzp());
            zzcj zzcjVar = this.zza;
            if (zzcjVar.zzC()) {
                return;
            } else {
                zza = zzcjVar.zza();
            }
        } while (zza == this.zzb);
        this.zzd = zza;
    }
}
