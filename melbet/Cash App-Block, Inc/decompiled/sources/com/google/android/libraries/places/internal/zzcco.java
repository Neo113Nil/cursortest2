package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import java.io.Closeable;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class zzcco implements Closeable {
    public zzcho zza;
    public int zzb;
    public final zzcgh zzc;
    public final zzcgr zzd;
    public zzbpl zze;
    public boolean zzg;
    public zzbwd zzh;
    public long zzj;
    public int zzp = 1;
    public int zzf = 5;
    public zzbwd zzi = new zzbwd();
    public boolean zzk = false;
    public boolean zzn = false;

    public zzcco(zzcho zzchoVar, zzbpl zzbplVar, int i, zzcgh zzcghVar, zzcgr zzcgrVar) {
        this.zza = zzchoVar;
        Trace.checkNotNull(zzbplVar, "decompressor");
        this.zze = zzbplVar;
        this.zzb = i;
        this.zzc = zzcghVar;
        Trace.checkNotNull(zzcgrVar, "transportTracer");
        this.zzd = zzcgrVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        zzbwd zzbwdVar = this.zzi;
        if (zzbwdVar == null) {
            return;
        }
        zzbwd zzbwdVar2 = this.zzh;
        boolean z = false;
        if (zzbwdVar2 != null && zzbwdVar2.zzc > 0) {
            z = true;
        }
        if (zzbwdVar != null) {
            try {
                zzbwdVar.close();
            } catch (Throwable th) {
                this.zzi = null;
                this.zzh = null;
                throw th;
            }
        }
        zzbwd zzbwdVar3 = this.zzh;
        if (zzbwdVar3 != null) {
            zzbwdVar3.close();
        }
        this.zzi = null;
        this.zzh = null;
        zzcho zzchoVar = this.zza;
        zzbvs zzbvsVar = zzbvs.zza;
        boolean z2 = zzchoVar.zzg$1;
        zzchy zzchyVar = zzchoVar.zzm;
        int i = zzchoVar.zzq;
        if (z2) {
            zzchyVar.zzo(i, null, zzbvsVar, false, null, null);
        } else {
            zzchyVar.zzo(i, null, zzbvsVar, false, zzcje.CANCEL, null);
        }
        Trace.checkState("status should have been reported on deframer closed", zzchoVar.zzh$1);
        zzchoVar.zze$2 = true;
        if (zzchoVar.zzi$1 && z) {
            zzchoVar.zzg(zzbtx.zzh.zze("Encountered end-of-stream mid-frame"), zzbvsVar, true, new zzbsn());
        }
        zzbuo zzbuoVar = zzchoVar.zzf$2;
        if (zzbuoVar != null) {
            zzbuoVar.run();
            zzchoVar.zzf$2 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00f8, code lost:
    
        throw new com.google.android.libraries.places.internal.zzbua(com.google.android.libraries.places.internal.zzbtx.zzh.zze("Can't decode compressed gRPC message as compression not configured"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00f9, code lost:
    
        r4 = r9.zzh.zzc;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00fe, code lost:
    
        r5 = r0.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0101, code lost:
    
        if (r4 >= r5.length) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0103, code lost:
    
        r5 = r5[r4];
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0108, code lost:
    
        r4 = r9.zzh;
        r5 = com.google.android.libraries.places.internal.zzcdx.zzb;
        r5 = new com.google.android.libraries.places.internal.zzcdv(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x009a, code lost:
    
        if (r5 == 1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x009c, code lost:
    
        r2 = "BODY";
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00a1, code lost:
    
        r5 = new java.lang.StringBuilder(r2.length() + 15);
        r5.append("Invalid state: ");
        r5.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00b9, code lost:
    
        throw new java.lang.AssertionError(r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x009f, code lost:
    
        r2 = "HEADER";
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01bc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0051, code lost:
    
        if (r9.zzn == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        if (r9.zzi.zzc != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005b, code lost:
    
        if (r2 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005d, code lost:
    
        close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005a, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0060, code lost:
    
        r9.zzk = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0062, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0077, code lost:
    
        if (r5 <= 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0079, code lost:
    
        r9.zza.zzD(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0080, code lost:
    
        if (r9.zzp != 2) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0082, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0083, code lost:
    
        r6 = r0.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0086, code lost:
    
        if (r5 >= r6.length) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0088, code lost:
    
        r6 = r6[r5];
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008d, code lost:
    
        r5 = r9.zzp;
        r6 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0092, code lost:
    
        if (r5 == 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0094, code lost:
    
        if (r6 == 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0130, code lost:
    
        r5 = r9.zzh.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0138, code lost:
    
        if ((r5 & com.plaid.internal.EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE) != 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013c, code lost:
    
        if (1 == (r5 & 1)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013e, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0141, code lost:
    
        r9.zzg = r5;
        r5 = r9.zzh;
        r5.zzd(4);
        r5 = r5.zzg() | (((r5.zzg() << 24) | (r5.zzg() << 16)) | (r5.zzg() << 8));
        r9.zzf = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0164, code lost:
    
        if (r5 < 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0168, code lost:
    
        if (r5 > r9.zzb) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016a, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016b, code lost:
    
        r6 = r0.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016e, code lost:
    
        if (r5 >= r6.length) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0170, code lost:
    
        r6 = r6[r5];
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0175, code lost:
    
        r5 = r9.zzd;
        r5.zzg.zza();
        r5.zzb.zza();
        r9.zzp = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0140, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01bb, code lost:
    
        throw new com.google.android.libraries.places.internal.zzbua(com.google.android.libraries.places.internal.zzbtx.zzh.zze("gRPC frame header malformed: reserved bits not zero"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0096, code lost:
    
        if (r6 == 1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00ba, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00bb, code lost:
    
        r5 = r0.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00be, code lost:
    
        if (r4 >= r5.length) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00c0, code lost:
    
        r5 = r5[r4];
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00c7, code lost:
    
        if (r9.zzg == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00c9, code lost:
    
        r4 = r9.zze;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00cd, code lost:
    
        if (r4 == com.google.android.libraries.places.internal.zzbpk.zza) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00cf, code lost:
    
        r5 = r9.zzh;
        r6 = com.google.android.libraries.places.internal.zzcdx.zzb;
        r5 = new com.google.android.libraries.places.internal.zzccn(r4.zzc(new com.google.android.libraries.places.internal.zzcdv(r5)), r9.zzb, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0111, code lost:
    
        r9.zzh = null;
        r4 = r9.zza;
        r6 = new com.google.android.libraries.places.internal.zzfv(7);
        r6.zza = r5;
        r4.zzc$2.zzb(r6);
        r9.zzp = 1;
        r9.zzf = 5;
        r9.zzj--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00e4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00ea, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi() {
        int i;
        int zzg;
        zzcgh zzcghVar = this.zzc;
        if (this.zzk) {
            return;
        }
        boolean z = true;
        this.zzk = true;
        while (true) {
            try {
                if (this.zzj <= 0) {
                    break;
                }
                try {
                    if (this.zzh == null) {
                        this.zzh = new zzbwd();
                    }
                    i = 0;
                    while (true) {
                        try {
                            int i2 = this.zzf - this.zzh.zzc;
                            if (i2 <= 0) {
                                break;
                            }
                            int i3 = this.zzi.zzc;
                            if (i3 != 0) {
                                int min = Math.min(i2, i3);
                                i += min;
                                this.zzh.zze(this.zzi.zzk(min));
                            } else if (i > 0) {
                                this.zza.zzD(i);
                                if (this.zzp == 2) {
                                    int i4 = 0;
                                    while (true) {
                                        zzbub[] zzbubVarArr = zzcghVar.zza;
                                        if (i4 >= zzbubVarArr.length) {
                                            break;
                                        }
                                        zzbub zzbubVar = zzbubVarArr[i4];
                                        i4++;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (i > 0) {
                                this.zza.zzD(i);
                                if (this.zzp == 2) {
                                    int i5 = 0;
                                    while (true) {
                                        zzbub[] zzbubVarArr2 = zzcghVar.zza;
                                        if (i5 >= zzbubVarArr2.length) {
                                            break;
                                        }
                                        zzbub zzbubVar2 = zzbubVarArr2[i5];
                                        i5++;
                                    }
                                }
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i = 0;
                }
            } catch (Throwable th3) {
                this.zzk = false;
                throw th3;
            }
        }
        zzbtx zzbtxVar = zzbtx.zzf;
        Locale locale = Locale.US;
        throw new zzbua(zzbtxVar.zze("gRPC message exceeds maximum size " + this.zzb + ": " + zzg));
    }
}
