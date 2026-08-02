package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.PointerIconCompat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public abstract class zzavf implements zzave {
    protected static volatile zzawj zza;
    protected MotionEvent zzb;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected DisplayMetrics zzq;
    protected zzawb zzr;
    private double zzs;
    private double zzt;
    protected final LinkedList zzc = new LinkedList();
    protected long zzd = 0;
    protected long zze = 0;
    protected long zzf = 0;
    protected long zzg = 0;
    protected long zzh = 0;
    protected long zzi = 0;
    protected long zzj = 0;
    private boolean zzu = false;
    protected boolean zzp = false;

    protected zzavf(Context context) {
        try {
            zzatx.zzd();
            this.zzq = context.getResources().getDisplayMetrics();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzcz)).booleanValue()) {
                this.zzr = new zzawb();
            }
        } catch (Throwable unused) {
        }
    }

    private final void zzj() {
        this.zzh = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        if (this.zzc.isEmpty()) {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.zzc.clear();
        }
        this.zzb = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String zzm(Context context, String str, int i, View view, Activity activity, byte[] bArr) {
        zzavd zzavdVar;
        String str2;
        int i2;
        int i3;
        Exception exc;
        int i4;
        int i5;
        String zza2;
        zzasg zzc;
        int i6;
        int i7;
        int i8 = i;
        long currentTimeMillis = System.currentTimeMillis();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzcr)).booleanValue();
        zzasg zzasgVar = null;
        if (booleanValue) {
            zzavdVar = zza != null ? zza.zzd() : null;
            str2 = "be";
        } else {
            zzavdVar = null;
            str2 = null;
        }
        try {
            if (i8 == 3) {
                zzasgVar = zzb(context, view, activity);
                try {
                    this.zzu = true;
                    i7 = 1002;
                } catch (Exception e) {
                    exc = e;
                    i2 = 3;
                    i3 = 1;
                    if (booleanValue) {
                        if (i8 != i2) {
                        }
                        zzavdVar.zzc(i5, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (zzasgVar != null) {
                        }
                        zza2 = Integer.toString(5);
                        return zza2;
                    }
                    i4 = 2;
                    long currentTimeMillis22 = System.currentTimeMillis();
                    if (zzasgVar != null) {
                    }
                    zza2 = Integer.toString(5);
                    return zza2;
                }
            } else {
                if (i8 == 2) {
                    zzc = zzd(context, view, activity);
                    i6 = PointerIconCompat.TYPE_TEXT;
                } else {
                    zzc = zzc(context, null);
                    i6 = 1000;
                }
                zzasgVar = zzc;
                i7 = i6;
            }
            if (!booleanValue || zzavdVar == null) {
                i2 = 3;
            } else {
                i2 = 3;
                i3 = 1;
                try {
                    zzavdVar.zzc(i7, -1, System.currentTimeMillis() - currentTimeMillis, str2, null);
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    if (booleanValue && zzavdVar != null) {
                        if (i8 != i2) {
                            i5 = 1003;
                            i4 = 2;
                        } else {
                            i4 = 2;
                            if (i8 == 2) {
                                i5 = 1009;
                            } else {
                                i5 = 1001;
                                i8 = i3;
                            }
                        }
                        zzavdVar.zzc(i5, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        long currentTimeMillis222 = System.currentTimeMillis();
                        if (zzasgVar != null) {
                        }
                        zza2 = Integer.toString(5);
                        return zza2;
                    }
                    i4 = 2;
                    long currentTimeMillis2222 = System.currentTimeMillis();
                    if (zzasgVar != null) {
                    }
                    zza2 = Integer.toString(5);
                    return zza2;
                }
            }
        } catch (Exception e3) {
            e = e3;
            i2 = 3;
            i3 = 1;
        }
        i4 = 2;
        long currentTimeMillis22222 = System.currentTimeMillis();
        if (zzasgVar != null) {
            try {
            } catch (Exception e4) {
                zza2 = Integer.toString(7);
                if (booleanValue && zzavdVar != null) {
                    zzavdVar.zzc(i8 == i2 ? PointerIconCompat.TYPE_CROSSHAIR : i8 == i4 ? PointerIconCompat.TYPE_COPY : 1005, -1, System.currentTimeMillis() - currentTimeMillis22222, str2, e4);
                }
            }
            if (((zzatd) zzasgVar.zzal()).zzaz() != 0) {
                zzatd zzatdVar = (zzatd) zzasgVar.zzal();
                int i9 = zzatx.zzc;
                zza2 = zzatx.zza(zzatdVar.zzax(), str);
                if (booleanValue && zzavdVar != null) {
                    zzavdVar.zzc(i8 == i2 ? PointerIconCompat.TYPE_CELL : i8 == i4 ? PointerIconCompat.TYPE_ALIAS : PointerIconCompat.TYPE_WAIT, -1, System.currentTimeMillis() - currentTimeMillis22222, str2, null);
                }
                return zza2;
            }
        }
        zza2 = Integer.toString(5);
        return zza2;
    }

    protected abstract long zza(StackTraceElement[] stackTraceElementArr) throws zzavz;

    protected abstract zzasg zzb(Context context, View view, Activity activity);

    protected abstract zzasg zzc(Context context, zzarz zzarzVar);

    protected abstract zzasg zzd(Context context, View view, Activity activity);

    @Override // com.google.android.gms.internal.ads.zzave
    public final String zze(Context context, String str, View view) {
        return zzm(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public final String zzf(Context context, String str, View view, Activity activity) {
        return zzm(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public final String zzg(Context context) {
        if (zzawm.zzc()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return zzm(context, null, 1, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public final String zzh(Context context, View view, Activity activity) {
        return zzm(context, null, 2, view, activity, null);
    }

    protected abstract zzawl zzi(MotionEvent motionEvent) throws zzavz;

    @Override // com.google.android.gms.internal.ads.zzave
    public final synchronized void zzk(MotionEvent motionEvent) {
        Long l;
        if (this.zzu) {
            zzj();
            this.zzu = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zzk = 0.0d;
            this.zzs = motionEvent.getRawX();
            this.zzt = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d = rawX - this.zzs;
            double d2 = rawY - this.zzt;
            this.zzk += Math.sqrt((d * d) + (d2 * d2));
            this.zzs = rawX;
            this.zzt = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    this.zzb = obtain;
                    this.zzc.add(obtain);
                    if (this.zzc.size() > 6) {
                        ((MotionEvent) this.zzc.remove()).recycle();
                    }
                    this.zzf++;
                    this.zzh = zza(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.zze += motionEvent.getHistorySize() + 1;
                    zzawl zzi = zzi(motionEvent);
                    Long l2 = zzi.zzd;
                    if (l2 != null && zzi.zzg != null) {
                        this.zzi += l2.longValue() + zzi.zzg.longValue();
                    }
                    if (this.zzq != null && (l = zzi.zze) != null && zzi.zzh != null) {
                        this.zzj += l.longValue() + zzi.zzh.longValue();
                    }
                } else if (action2 == 3) {
                    this.zzg++;
                }
            } catch (zzavz unused) {
            }
        } else {
            this.zzl = motionEvent.getX();
            this.zzm = motionEvent.getY();
            this.zzn = motionEvent.getRawX();
            this.zzo = motionEvent.getRawY();
            this.zzd++;
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public final synchronized void zzl(int i, int i2, int i3) {
        if (this.zzb != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzcp)).booleanValue()) {
                zzj();
            } else {
                this.zzb.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.zzq;
        if (displayMetrics != null) {
            this.zzb = MotionEvent.obtain(0L, i3, 1, i * displayMetrics.density, i2 * this.zzq.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.zzb = null;
        }
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzawb zzawbVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzcz)).booleanValue() || (zzawbVar = this.zzr) == null) {
            return;
        }
        zzawbVar.zzb(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public void zzo(View view) {
    }
}
