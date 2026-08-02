package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.common.base.Absent;
import com.google.common.base.Present;
import com.google.common.base.Supplier;
import com.squareup.util.Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class zzll implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Context zza;

    public /* synthetic */ zzll(Context context, int i) {
        this.$r8$classId = i;
        this.zza = context;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        int i = this.$r8$classId;
        Context context = this.zza;
        switch (i) {
            case 0:
                Object obj = zzlk.zzb;
                final zzlj zzljVar = new zzlj();
                zzljVar.zza = context;
                context.getClass();
                if (((Supplier) zzljVar.zzb) == null) {
                    zzljVar.zzb = zzlk.zzf;
                }
                final int i2 = 1;
                if (((Supplier) zzljVar.zzc) == null) {
                    zzljVar.zzc = Strings.memoize(new zzll((Context) zzljVar.zza, i2));
                }
                if (((zzlh) zzljVar.zzd) == null) {
                    zzljVar.zzd = new Supplier() { // from class: com.google.android.gms.internal.measurement.zzlh
                        @Override // com.google.common.base.Supplier
                        public final Object get() {
                            int i3 = i2;
                            zzlj zzljVar2 = zzljVar;
                            switch (i3) {
                                case 0:
                                    Context context2 = (Context) zzljVar2.zza;
                                    Object obj2 = zzlk.zzb;
                                    try {
                                        ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                                        applicationInfo.getClass();
                                        return new Present(applicationInfo);
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return Absent.INSTANCE;
                                    }
                                default:
                                    return new Present(new zzqi((Supplier) zzljVar2.zzb));
                            }
                        }
                    };
                }
                final int i3 = 0;
                if (((Supplier) zzljVar.zze) == null) {
                    Context context2 = (Context) zzljVar.zza;
                    ArrayList arrayList = new ArrayList();
                    zzrx zzrxVar = new zzrx(new zzxs(context2));
                    new ConcurrentHashMap();
                    Collections.addAll(arrayList, zzrxVar, new zzsd());
                    zzljVar.zze = Strings.memoize(new zzlm(arrayList, i3));
                }
                if (((zzlh) zzljVar.zzf) == null) {
                    zzljVar.zzf = new Supplier() { // from class: com.google.android.gms.internal.measurement.zzlh
                        @Override // com.google.common.base.Supplier
                        public final Object get() {
                            int i32 = i3;
                            zzlj zzljVar2 = zzljVar;
                            switch (i32) {
                                case 0:
                                    Context context22 = (Context) zzljVar2.zza;
                                    Object obj2 = zzlk.zzb;
                                    try {
                                        ApplicationInfo applicationInfo = context22.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                                        applicationInfo.getClass();
                                        return new Present(applicationInfo);
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return Absent.INSTANCE;
                                    }
                                default:
                                    return new Present(new zzqi((Supplier) zzljVar2.zzb));
                            }
                        }
                    };
                }
                return new zzlk((Context) zzljVar.zza, (Supplier) zzljVar.zzb, (Supplier) zzljVar.zzc, (zzlh) zzljVar.zzd, (Supplier) zzljVar.zze, (zzlh) zzljVar.zzf);
            case 1:
                Object obj2 = zzlk.zzb;
                return new zzmn(new zzkk(this.zza, null, zzjx.zza, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS));
            default:
                Object obj3 = zzlw.zzb;
                return zzlf.zza(context);
        }
    }
}
