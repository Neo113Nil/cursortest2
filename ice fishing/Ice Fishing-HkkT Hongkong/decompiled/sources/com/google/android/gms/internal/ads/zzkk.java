package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzkk implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzabk, zzpu, zzwv, zztr, zzio, zzik {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzko zza;

    /* synthetic */ zzkk(zzko zzkoVar, zzkj zzkjVar) {
        this.zza = zzkoVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzko.zzP(this.zza, surfaceTexture);
        this.zza.zzaf(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.zza.zzai(null);
        this.zza.zzaf(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.zza.zzaf(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.zza.zzaf(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzaf(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zza(Exception exc) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzv(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzb(String str, long j, long j2) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzw(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzc(String str) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzd(zzir zzirVar) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzy(zzirVar);
        this.zza.zzL = null;
        this.zza.zzR = null;
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zze(zzir zzirVar) {
        zzmp zzmpVar;
        this.zza.zzR = zzirVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzz(zzirVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzf(zzam zzamVar, zzis zzisVar) {
        zzmp zzmpVar;
        this.zza.zzL = zzamVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzA(zzamVar, zzisVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzg(long j) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzB(j);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzh(Exception exc) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzC(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzi(zzpv zzpvVar) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzD(zzpvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzj(zzpv zzpvVar) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzE(zzpvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzk(int i, long j, long j2) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzF(i, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final void zzl(int i, long j) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzG(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final void zzm(Object obj, long j) {
        zzmp zzmpVar;
        Object obj2;
        zzfc zzfcVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzH(obj, j);
        zzko zzkoVar = this.zza;
        obj2 = zzkoVar.zzM;
        if (obj2 == obj) {
            zzfcVar = zzkoVar.zzl;
            zzfcVar.zzd(26, new zzez() { // from class: com.google.android.gms.internal.ads.zzki
                @Override // com.google.android.gms.internal.ads.zzez
                public final void zza(Object obj3) {
                }
            });
            zzfcVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzn(final boolean z) {
        boolean z2;
        zzfc zzfcVar;
        zzko zzkoVar = this.zza;
        z2 = zzkoVar.zzV;
        if (z2 == z) {
            return;
        }
        zzkoVar.zzV = z;
        zzfcVar = this.zza.zzl;
        zzfcVar.zzd(23, new zzez() { // from class: com.google.android.gms.internal.ads.zzkg
            @Override // com.google.android.gms.internal.ads.zzez
            public final void zza(Object obj) {
                int i = zzkk.zzb;
                ((zzcl) obj).zzn(z);
            }
        });
        zzfcVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final void zzo(Exception exc) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzI(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final void zzp(String str, long j, long j2) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzJ(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final void zzq(String str) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzK(str);
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final void zzr(zzir zzirVar) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzL(zzirVar);
        this.zza.zzK = null;
        this.zza.zzQ = null;
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final void zzs(zzir zzirVar) {
        zzmp zzmpVar;
        this.zza.zzQ = zzirVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzM(zzirVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final void zzt(long j, int i) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzN(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final void zzu(zzam zzamVar, zzis zzisVar) {
        zzmp zzmpVar;
        this.zza.zzK = zzamVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzO(zzamVar, zzisVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final void zzv(final zzdp zzdpVar) {
        zzfc zzfcVar;
        this.zza.zzaa = zzdpVar;
        zzfcVar = this.zza.zzl;
        zzfcVar.zzd(25, new zzez() { // from class: com.google.android.gms.internal.ads.zzkh
            @Override // com.google.android.gms.internal.ads.zzez
            public final void zza(Object obj) {
                int i = zzkk.zzb;
                ((zzcl) obj).zzr(zzdp.this);
            }
        });
        zzfcVar.zzc();
    }
}
