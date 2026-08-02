package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.util.Log;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.google.common.collect.RegularImmutableMap;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* loaded from: classes.dex */
public abstract class zzof implements Supplier {
    public volatile int zza = -1;
    public final String zza$1;
    public zzxs zzb;
    public final zzpi zzb$1;

    public zzof(String str, zzpi zzpiVar) {
        this.zza$1 = str;
        this.zzb$1 = zzpiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f0 A[Catch: all -> 0x00a4, TryCatch #2 {all -> 0x00a4, blocks: (B:37:0x008f, B:39:0x0093, B:40:0x00a8, B:42:0x00b4, B:44:0x00c6, B:48:0x00dc, B:50:0x00f0, B:51:0x00f6, B:53:0x0106, B:55:0x010e, B:56:0x011e, B:69:0x0131, B:58:0x0142, B:62:0x014d, B:64:0x0153, B:65:0x0158, B:72:0x0137, B:75:0x00e2, B:77:0x015a), top: B:36:0x008f, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014d A[Catch: all -> 0x00a4, TryCatch #2 {all -> 0x00a4, blocks: (B:37:0x008f, B:39:0x0093, B:40:0x00a8, B:42:0x00b4, B:44:0x00c6, B:48:0x00dc, B:50:0x00f0, B:51:0x00f6, B:53:0x0106, B:55:0x010e, B:56:0x011e, B:69:0x0131, B:58:0x0142, B:62:0x014d, B:64:0x0153, B:65:0x0158, B:72:0x0137, B:75:0x00e2, B:77:0x015a), top: B:36:0x008f, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0153 A[Catch: all -> 0x00a4, TryCatch #2 {all -> 0x00a4, blocks: (B:37:0x008f, B:39:0x0093, B:40:0x00a8, B:42:0x00b4, B:44:0x00c6, B:48:0x00dc, B:50:0x00f0, B:51:0x00f6, B:53:0x0106, B:55:0x010e, B:56:0x011e, B:69:0x0131, B:58:0x0142, B:62:0x014d, B:64:0x0153, B:65:0x0158, B:72:0x0137, B:75:0x00e2, B:77:0x015a), top: B:36:0x008f, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.common.base.Supplier
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        zzpg zzpgVar;
        Object obj;
        String str;
        Object obj2;
        String zza;
        zzlk zzlkVar;
        if (zzky.zze == null) {
            Object obj3 = zzlk.zzb;
            zzky.zze = new zzlr();
        }
        Context context = (Context) zzlk.zzc.get();
        Object obj4 = null;
        if (context == null) {
            synchronized (zzky.zza) {
            }
            a$$ExternalSyntheticBUOutline0.m$1("Must call PhenotypeContext.setContext() first");
            return null;
        }
        zzlk zzlkVar2 = zzlk.zzd;
        if (zzlkVar2 == null) {
            Context applicationContext = context.getApplicationContext();
            try {
                applicationContext.getClass();
                Context applicationContext2 = applicationContext.getApplicationContext();
                applicationContext2.getClass();
                Class<?> cls = applicationContext2.getClass();
                new StringBuilder(String.valueOf(cls).length() + 72);
                cls.toString();
                throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(cls)));
            } catch (IllegalStateException unused) {
                synchronized (zzlk.zzb) {
                    try {
                        if (zzlk.zzd != null) {
                            zzlkVar = zzlk.zzd;
                        } else {
                            zzlkVar = (zzlk) new zzll(applicationContext, 0).get();
                            zzlk.zzd = zzlkVar;
                            zzlf.zzc(Level.CONFIG, zzlkVar.zzg(), null, "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                        }
                        zzlkVar2 = zzlkVar;
                    } finally {
                    }
                }
            }
        }
        int i = this.zza;
        if (i == -1 || i < ((AtomicInteger) this.zzb.zza$1).get()) {
            synchronized (this) {
                try {
                    int i2 = this.zza;
                    if (i2 == -1) {
                        zzlk.zzl();
                        zzlkVar2.getClass();
                        zzpgVar = this.zzb$1.zza(zzlkVar2);
                        this.zzb = zzpgVar.zzj;
                    } else {
                        zzpgVar = null;
                    }
                    int i3 = ((AtomicInteger) this.zzb.zza$1).get();
                    if (i2 < i3) {
                        zzlk.zzl();
                        zzlkVar2.getClass();
                        Optional zza2 = zzlf.zza(zzlkVar2.zzh);
                        if (zza2.isPresent() && (zza = ((zzle) zza2.get()).zza(zzlg.zza(), this.zza$1)) != null) {
                            try {
                                obj = zzc(zza);
                            } catch (IOException | IllegalArgumentException e) {
                                Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.zza$1), e);
                            }
                            if (zzpgVar == null) {
                                zzpgVar = this.zzb$1.zza(zzlkVar2);
                            }
                            str = zzpgVar.zzf;
                            if (!zzlkVar2.zzh.getPackageName().equals("com.android.vending") && !str.startsWith("com.google.android.gms.measurement#")) {
                                zzh.zza(zzlkVar2.zzg().submit(new zzpn(zzlkVar2, str)));
                            }
                            obj2 = ((RegularImmutableMap) zzpgVar.zzq().componentCallbacks).get(this.zza$1);
                            if (obj2 != null) {
                                try {
                                    obj4 = zzd(obj2);
                                } catch (IOException | ClassCastException e2) {
                                    Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.zza$1), e2);
                                }
                            }
                            if (true == zza2.isPresent()) {
                                obj = obj4;
                            }
                            if (obj == null) {
                                obj = zza();
                            }
                            if (obj != null) {
                                zzh(obj);
                                this.zza = i3;
                            }
                        }
                        obj = null;
                        if (zzpgVar == null) {
                        }
                        str = zzpgVar.zzf;
                        if (!zzlkVar2.zzh.getPackageName().equals("com.android.vending")) {
                            zzh.zza(zzlkVar2.zzg().submit(new zzpn(zzlkVar2, str)));
                        }
                        obj2 = ((RegularImmutableMap) zzpgVar.zzq().componentCallbacks).get(this.zza$1);
                        if (obj2 != null) {
                        }
                        if (true == zza2.isPresent()) {
                        }
                        if (obj == null) {
                        }
                        if (obj != null) {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            obj.getClass();
            return obj;
        }
        obj = zze();
        obj.getClass();
        return obj;
    }

    public abstract Object zza();

    public abstract Object zzc(String str);

    public abstract Object zzd(Object obj);

    public abstract Object zze();

    public abstract void zzh(Object obj);
}
