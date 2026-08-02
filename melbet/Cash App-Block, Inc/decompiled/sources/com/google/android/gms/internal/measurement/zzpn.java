package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import com.google.common.collect.RegularImmutableMap;
import com.plaid.internal.EnumC0170g;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzpn implements Runnable {
    public final /* synthetic */ int $r8$classId = 1;
    public Object zza;
    public Object zzb;

    public /* synthetic */ zzpn(zzlk zzlkVar, String str) {
        this.zza = zzlkVar;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                Context context = ((zzlk) this.zza).zzh;
                RegularImmutableMap regularImmutableMap = zzpp.zzb;
                if (regularImmutableMap == null) {
                    synchronized (zzpp.zza) {
                        regularImmutableMap = zzpp.zzb;
                        if (regularImmutableMap == null) {
                            StatusLine builder = RegularImmutableMap.builder();
                            try {
                                String[] list = context.getAssets().list("phenotype");
                                if (list != null) {
                                    for (String str : list) {
                                        if (str.endsWith("_package_metadata.binarypb")) {
                                            try {
                                                AssetManager assets = context.getAssets();
                                                StringBuilder sb = new StringBuilder(str.length() + 10);
                                                sb.append("phenotype/");
                                                sb.append(str);
                                                InputStream open = assets.open(sb.toString());
                                                try {
                                                    zzadf zzadfVar = zzadf.zzd;
                                                    int i = zzacf.$r8$clinit;
                                                    zzpp zzppVar = new zzpp(context, zzpr.zzh(open, zzadf.zza));
                                                    builder.put(zzppVar.zzc, zzppVar);
                                                    if (open != null) {
                                                        open.close();
                                                    }
                                                } catch (Throwable th) {
                                                    if (open != null) {
                                                        try {
                                                            open.close();
                                                        } catch (Throwable th2) {
                                                            th.addSuppressed(th2);
                                                        }
                                                    }
                                                    throw th;
                                                    break;
                                                }
                                            } catch (zzaeh e) {
                                                StringBuilder sb2 = new StringBuilder(str.length() + 45);
                                                sb2.append("Unable to read Phenotype PackageMetadata for ");
                                                sb2.append(str);
                                                Log.e("PackageInfo", sb2.toString(), e);
                                            }
                                        }
                                    }
                                }
                            } catch (IOException e2) {
                                Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e2);
                            }
                            RegularImmutableMap build = builder.build(true);
                            zzpp.zzb = build;
                            regularImmutableMap = build;
                        }
                    }
                }
                String str2 = (String) this.zzb;
                if (regularImmutableMap.containsKey(str2)) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(str2.length() + EnumC0170g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE);
                sb3.append("Config package ");
                sb3.append(str2);
                sb3.append(" cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags.");
                Log.e("FilePhenotypeFlags", sb3.toString());
                return;
            default:
                this.zza = null;
                this.zzb = null;
                return;
        }
    }

    public /* synthetic */ zzpn() {
    }
}
