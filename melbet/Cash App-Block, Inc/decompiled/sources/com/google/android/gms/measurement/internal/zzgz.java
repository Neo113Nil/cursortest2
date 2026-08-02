package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.measurement.zzib;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/* loaded from: classes.dex */
public final class zzgz extends zzos {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzgz(zzpg zzpgVar, int i) {
        super(zzpgVar);
        this.$r8$classId = i;
    }

    private final void zzbc$com$google$android$gms$measurement$internal$zzgz() {
    }

    private final void zzbc$com$google$android$gms$measurement$internal$zzlp() {
    }

    public boolean zzb() {
        zzay();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((zzic) this.$$delegate_0).zzd.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final void zzbc() {
        int i = this.$r8$classId;
    }

    public void zzc(String str, zzot zzotVar, zzib zzibVar, zzgw zzgwVar) {
        String str2;
        URL url;
        byte[] zzcd;
        zzhz zzhzVar;
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzg();
        zzay();
        try {
            url = new URI(zzotVar.zza()).toURL();
            this.zzg.zzp();
            zzcd = zzibVar.zzcd();
            zzhzVar = zzicVar.zzj;
            zzic.zzP(zzhzVar);
            str2 = str;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            str2 = str;
        }
        try {
            zzhzVar.zzm(new zzgy(this, str2, url, zzcd, zzotVar.zzb(), zzgwVar));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzd.zzc("Failed to parse URL. Not uploading MeasurementBatch. appId", zzgu.zzl(str2), zzotVar.zza());
        }
    }
}
