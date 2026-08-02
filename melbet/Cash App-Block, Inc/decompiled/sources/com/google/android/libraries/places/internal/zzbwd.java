package com.google.android.libraries.places.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzbwd extends zzbur {
    public static final zzbvx zze = new zzbvx();
    public static final zzbvy zzf = new zzbvy();
    public static final zzbvz zzg = new zzbvz();
    public static final zzbwa zzh = new zzbwa();
    public final ArrayDeque zza;
    public ArrayDeque zzb;
    public int zzc;
    public boolean zzd;

    public zzbwd() {
        this.zza = new ArrayDeque();
    }

    @Override // com.google.android.libraries.places.internal.zzbur, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (true) {
            ArrayDeque arrayDeque = this.zza;
            if (arrayDeque.isEmpty()) {
                break;
            } else {
                ((zzbur) arrayDeque.remove()).close();
            }
        }
        if (this.zzb != null) {
            while (!this.zzb.isEmpty()) {
                ((zzbur) this.zzb.remove()).close();
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbur
    public final boolean zza() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            if (!((zzbur) it.next()).zza()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzbur
    public final void zzb() {
        ArrayDeque arrayDeque = this.zzb;
        ArrayDeque arrayDeque2 = this.zza;
        if (arrayDeque == null) {
            this.zzb = new ArrayDeque(Math.min(arrayDeque2.size(), 16));
        }
        while (!this.zzb.isEmpty()) {
            ((zzbur) this.zzb.remove()).close();
        }
        this.zzd = true;
        zzbur zzburVar = (zzbur) arrayDeque2.peek();
        if (zzburVar != null) {
            zzburVar.zzb();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbur
    public final void zzc() {
        if (!this.zzd) {
            throw new InvalidMarkException();
        }
        ArrayDeque arrayDeque = this.zza;
        zzbur zzburVar = (zzbur) arrayDeque.peek();
        if (zzburVar != null) {
            int zzf2 = zzburVar.zzf();
            zzburVar.zzc();
            this.zzc = (zzburVar.zzf() - zzf2) + this.zzc;
        }
        while (true) {
            zzbur zzburVar2 = (zzbur) this.zzb.pollLast();
            if (zzburVar2 == null) {
                return;
            }
            zzburVar2.zzc();
            arrayDeque.addFirst(zzburVar2);
            this.zzc = zzburVar2.zzf() + this.zzc;
        }
    }

    public final void zze(zzbur zzburVar) {
        boolean z = this.zzd;
        ArrayDeque arrayDeque = this.zza;
        boolean z2 = z && arrayDeque.isEmpty();
        if (zzburVar instanceof zzbwd) {
            zzbwd zzbwdVar = (zzbwd) zzburVar;
            while (true) {
                ArrayDeque arrayDeque2 = zzbwdVar.zza;
                if (arrayDeque2.isEmpty()) {
                    break;
                } else {
                    arrayDeque.add((zzbur) arrayDeque2.remove());
                }
            }
            this.zzc += zzbwdVar.zzc;
            zzbwdVar.zzc = 0;
            zzbwdVar.close();
        } else {
            arrayDeque.add(zzburVar);
            this.zzc = zzburVar.zzf() + this.zzc;
        }
        if (z2) {
            ((zzbur) arrayDeque.peek()).zzb();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbur
    public final int zzf() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzbur
    public final int zzg() {
        return zzm(zze, 1, null, 0);
    }

    @Override // com.google.android.libraries.places.internal.zzbur
    public final void zzh(int i) {
        zzm(zzf, i, null, 0);
    }

    @Override // com.google.android.libraries.places.internal.zzbur
    public final void zzi(int i, int i2, byte[] bArr) {
        zzm(zzg, i2, bArr, i);
    }

    @Override // com.google.android.libraries.places.internal.zzbur
    public final void zzj(OutputStream outputStream, int i) {
        zzl(zzh, i, outputStream, 0);
    }

    @Override // com.google.android.libraries.places.internal.zzbur
    public final zzbur zzk(int i) {
        zzbur zzburVar;
        int i2;
        zzbur zzburVar2;
        if (i <= 0) {
            return zzcdx.zzb;
        }
        zzd(i);
        this.zzc -= i;
        zzbur zzburVar3 = null;
        zzbwd zzbwdVar = null;
        while (true) {
            ArrayDeque arrayDeque = this.zza;
            zzbur zzburVar4 = (zzbur) arrayDeque.peek();
            int zzf2 = zzburVar4.zzf();
            if (zzf2 > i) {
                zzburVar2 = zzburVar4.zzk(i);
                i2 = 0;
            } else {
                if (this.zzd) {
                    zzburVar = zzburVar4.zzk(zzf2);
                    zzo();
                } else {
                    zzburVar = (zzbur) arrayDeque.poll();
                }
                zzbur zzburVar5 = zzburVar;
                i2 = i - zzf2;
                zzburVar2 = zzburVar5;
            }
            if (zzburVar3 == null) {
                zzburVar3 = zzburVar2;
            } else {
                if (zzbwdVar == null) {
                    zzbwdVar = new zzbwd(i2 != 0 ? Math.min(arrayDeque.size() + 2, 16) : 2);
                    zzbwdVar.zze(zzburVar3);
                    zzburVar3 = zzbwdVar;
                }
                zzbwdVar.zze(zzburVar2);
            }
            if (i2 <= 0) {
                return zzburVar3;
            }
            i = i2;
        }
    }

    public final int zzl(zzbwc zzbwcVar, int i, Object obj, int i2) {
        zzd(i);
        ArrayDeque arrayDeque = this.zza;
        if (!arrayDeque.isEmpty() && ((zzbur) arrayDeque.peek()).zzf() == 0) {
            zzo();
        }
        while (i > 0 && !arrayDeque.isEmpty()) {
            zzbur zzburVar = (zzbur) arrayDeque.peek();
            int min = Math.min(i, zzburVar.zzf());
            i2 = zzbwcVar.zza(zzburVar, min, obj, i2);
            i -= min;
            this.zzc -= min;
            if (((zzbur) arrayDeque.peek()).zzf() == 0) {
                zzo();
            }
        }
        if (i <= 0) {
            return i2;
        }
        a$$ExternalSyntheticBUOutline0.m$1((Object) "Failed executing read operation");
        return 0;
    }

    public final int zzm(zzbwb zzbwbVar, int i, Object obj, int i2) {
        try {
            return zzl(zzbwbVar, i, obj, i2);
        } catch (IOException e) {
            a$$ExternalSyntheticBUOutline0.m$1(e);
            return 0;
        }
    }

    public final void zzo() {
        boolean z = this.zzd;
        ArrayDeque arrayDeque = this.zza;
        if (!z) {
            ((zzbur) arrayDeque.remove()).close();
            return;
        }
        this.zzb.add((zzbur) arrayDeque.remove());
        zzbur zzburVar = (zzbur) arrayDeque.peek();
        if (zzburVar != null) {
            zzburVar.zzb();
        }
    }

    public zzbwd(int i) {
        this.zza = new ArrayDeque(i);
    }
}
