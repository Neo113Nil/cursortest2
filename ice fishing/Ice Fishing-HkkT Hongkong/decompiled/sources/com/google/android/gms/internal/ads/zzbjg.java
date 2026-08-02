package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzbjg extends NativeAd.AdChoicesInfo {
    private final zzbjf zza;
    private final List zzb = new ArrayList();
    private String zzc;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        r4.zzb.add(new com.google.android.gms.internal.ads.zzbjn(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbjg(zzbjf zzbjfVar) {
        IBinder iBinder;
        this.zza = zzbjfVar;
        try {
            this.zzc = zzbjfVar.zzg();
        } catch (RemoteException e) {
            zzcec.zzh("", e);
            this.zzc = "";
        }
        try {
            for (Object obj : zzbjfVar.zzh()) {
                zzbjm zzbjmVar = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbjmVar = queryLocalInterface instanceof zzbjm ? (zzbjm) queryLocalInterface : new zzbjk(iBinder);
                }
            }
        } catch (RemoteException e2) {
            zzcec.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzc;
    }
}
