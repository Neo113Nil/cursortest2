package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.Client;
import com.fillr.e0;
import com.fillr.profile.adapter.ProfileAdapter;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdz;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import com.google.mlkit.vision.common.zzb;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.androidsvg.SVGAndroidRenderer;
import com.squareup.cash.clientroutes.PatternRedaction;
import com.squareup.workflow1.internal.SubtreeManager;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import nl.dionsegijn.konfetti.modules.LocationModule;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes4.dex */
public final class zzxk {
    public static final PatternRedaction zzf = new PatternRedaction("AutoZoom", null);
    public final zzxf zza;
    public final zzbw zzb;
    public ScheduledFuture zzc;
    public String zzd;
    public int zze;
    public final AtomicBoolean zzg;
    public final Object zzh;
    public final ScheduledExecutorService zzi;
    public final zzap zzj;
    public final zzwp zzk;
    public final String zzl;
    public zzee zzm;
    public float zzn;
    public final float zzo;
    public long zzp;
    public long zzq;
    public boolean zzr;
    public zzb zzs;

    public zzxk(Context context, zzxf zzxfVar, String str) {
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(2));
        zzap zzapVar = zzar.zza;
        SharedPrefManager sharedPrefManager = new SharedPrefManager(context);
        byte b = (byte) (((byte) (0 | 1)) | 2);
        if (b != 3) {
            StringBuilder sb = new StringBuilder();
            if ((b & 1) == 0) {
                sb.append(" enableFirelog");
            }
            if ((b & 2) == 0) {
                sb.append(" firelogEventType");
            }
            a$$ExternalSyntheticBUOutline0.m$1("Missing required properties:".concat(sb.toString()));
            throw null;
        }
        zzwp zzwpVar = new zzwp(context, sharedPrefManager, new zzwi(context, new zzwd("scanner-auto-zoom", 1)), "scanner-auto-zoom");
        this.zzh = new Object();
        this.zza = zzxfVar;
        this.zzg = new AtomicBoolean(false);
        this.zzb = new zzbw();
        this.zzi = unconfigurableScheduledExecutorService;
        this.zzj = zzapVar;
        this.zzk = zzwpVar;
        this.zzl = str;
        this.zze = 1;
        this.zzn = 1.0f;
        this.zzo = -1.0f;
        this.zzp = zzapVar.zza();
    }

    public final long zza() {
        long zza;
        synchronized (this.zzh) {
            zza = (this.zzj.zza() - this.zzp) / 1000000;
        }
        return zza;
    }

    public final void zzl(float f, zzrc zzrcVar, zzxg zzxgVar) {
        zzdz.zzd zzdVar;
        synchronized (this.zzh) {
            try {
                if (this.zzm != null && this.zzs != null && this.zze == 2) {
                    if (this.zzg.compareAndSet(false, true)) {
                        float f2 = this.zzn;
                        SVGAndroidRenderer sVGAndroidRenderer = new SVGAndroidRenderer(this, f);
                        zzew zzewVar = new zzew();
                        zzewVar.zzc = new zzev(zzewVar, sVGAndroidRenderer);
                        zzewVar.run();
                        Client.AnonymousClass4 anonymousClass4 = new Client.AnonymousClass4(19, zzewVar, new LocationModule(this, zzrcVar, f2, zzxgVar, f));
                        zzee zzeeVar = zzee.zza;
                        zzdz.zzd zzdVar2 = zzdz.zzd.zza;
                        if (!zzewVar.isDone() && (zzdVar = zzewVar.listeners) != zzdVar2) {
                            zzdz.zzd zzdVar3 = new zzdz.zzd(anonymousClass4);
                            do {
                                zzdVar3.next = zzdVar;
                                if (!zzdz.zzc.zze(zzewVar, zzdVar, zzdVar3)) {
                                    zzdVar = zzewVar.listeners;
                                }
                            } while (zzdVar != zzdVar2);
                        }
                        zzdz.zzw(anonymousClass4, zzeeVar);
                    }
                }
            } finally {
            }
        }
    }

    public final void zzn(boolean z) {
        synchronized (this.zzh) {
            try {
                int i = this.zze;
                if (i != 1 && i != 4) {
                    zzr(true);
                    if (z) {
                        if (!this.zzr) {
                            zzrc zzrcVar = zzrc.SCANNER_AUTO_ZOOM_FIRST_ATTEMPT;
                            float f = this.zzn;
                            zzq(zzrcVar, f, f, null);
                        }
                        zzrc zzrcVar2 = zzrc.SCANNER_AUTO_ZOOM_SCAN_SUCCESS;
                        float f2 = this.zzn;
                        zzq(zzrcVar2, f2, f2, null);
                    } else {
                        zzrc zzrcVar3 = zzrc.SCANNER_AUTO_ZOOM_SCAN_FAILED;
                        float f3 = this.zzn;
                        zzq(zzrcVar3, f3, f3, null);
                    }
                    this.zzr = false;
                    this.zze = 1;
                    this.zzd = null;
                }
            } finally {
            }
        }
    }

    public final void zzq(zzrc zzrcVar, float f, float f2, zzxg zzxgVar) {
        long zza;
        String str = this.zzd;
        if (str != null) {
            e0 e0Var = new e0(17);
            e0Var.a = this.zzl;
            e0Var.b = str;
            e0Var.c = Float.valueOf(f);
            e0Var.i = Float.valueOf(f2);
            synchronized (this.zzh) {
                zza = (this.zzj.zza() - this.zzq) / 1000000;
            }
            e0Var.f = Long.valueOf(zza);
            if (zzxgVar != null) {
                JWECryptoParts jWECryptoParts = new JWECryptoParts();
                jWECryptoParts.header = Float.valueOf(zzxgVar.zza);
                jWECryptoParts.encryptedKey = Float.valueOf(zzxgVar.zzb);
                jWECryptoParts.iv = Float.valueOf(zzxgVar.zzc);
                jWECryptoParts.cipherText = Float.valueOf(zzxgVar.zzd);
                jWECryptoParts.authenticationTag = Float.valueOf(RecyclerView.DECELERATION_RATE);
                e0Var.h = new zzur(jWECryptoParts);
            }
            zzwp zzwpVar = this.zzk;
            SubtreeManager subtreeManager = new SubtreeManager();
            subtreeManager.children = new zzut(e0Var);
            com.google.mlkit.common.sdkinternal.zzh.zza.execute(new ProfileAdapter.AnonymousClass8((Object) zzwpVar, (Object) new HuffmanTreeGroup(subtreeManager, 0), (Enum) zzrcVar, zzwpVar.zzj(), 6));
        }
    }

    public final void zzr(boolean z) {
        ScheduledFuture scheduledFuture;
        synchronized (this.zzh) {
            try {
                this.zzb.zzs();
                this.zzp = this.zzj.zza();
                if (z && (scheduledFuture = this.zzc) != null) {
                    scheduledFuture.cancel(false);
                    this.zzc = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
