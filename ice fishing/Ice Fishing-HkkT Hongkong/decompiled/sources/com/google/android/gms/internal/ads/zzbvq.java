package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzbvq extends zzbvw {
    static final Set zza = CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    private String zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private final Object zzj;
    private final zzcjk zzk;
    private final Activity zzl;
    private zzcla zzm;
    private ImageView zzn;
    private LinearLayout zzo;
    private final zzbvx zzp;
    private PopupWindow zzq;
    private RelativeLayout zzr;
    private ViewGroup zzs;

    public zzbvq(zzcjk zzcjkVar, zzbvx zzbvxVar) {
        super(zzcjkVar, "resize");
        this.zzb = "top-right";
        this.zzc = true;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = -1;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = -1;
        this.zzj = new Object();
        this.zzk = zzcjkVar;
        this.zzl = zzcjkVar.zzi();
        this.zzp = zzbvxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzc(boolean z) {
        this.zzq.dismiss();
        this.zzr.removeView((View) this.zzk);
        ViewGroup viewGroup = this.zzs;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzn);
            this.zzs.addView((View) this.zzk);
            this.zzk.zzah(this.zzm);
        }
        if (z) {
            zzl("default");
            zzbvx zzbvxVar = this.zzp;
            if (zzbvxVar != null) {
                zzbvxVar.zzb();
            }
        }
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzo = null;
    }

    public final void zza(final boolean z) {
        synchronized (this.zzj) {
            if (this.zzq != null) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzkp)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    zzc(z);
                } else {
                    zzcep.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbvo
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzbvq.this.zzc(z);
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0262, code lost:
    
        zzh("Resize location out of screen or close button is not visible.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0268, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0289 A[Catch: all -> 0x047e, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:10:0x0014, B:12:0x001c, B:13:0x0021, B:15:0x0023, B:17:0x002f, B:18:0x0034, B:20:0x0036, B:22:0x003e, B:23:0x0043, B:25:0x0045, B:27:0x0053, B:28:0x0064, B:30:0x0072, B:31:0x0083, B:33:0x0091, B:34:0x00a2, B:36:0x00b0, B:37:0x00c1, B:39:0x00cf, B:40:0x00dd, B:42:0x00eb, B:43:0x00ed, B:45:0x00f1, B:47:0x00f5, B:49:0x00fd, B:52:0x0105, B:56:0x012d, B:62:0x0139, B:64:0x0262, B:65:0x0267, B:67:0x0269, B:69:0x0289, B:71:0x028d, B:73:0x029a, B:74:0x02d7, B:89:0x0392, B:90:0x03c1, B:92:0x03d9, B:93:0x03fa, B:95:0x0402, B:96:0x0409, B:97:0x042f, B:101:0x0432, B:103:0x0452, B:104:0x0467, B:106:0x0399, B:107:0x03a0, B:108:0x03a7, B:109:0x03ae, B:110:0x03b4, B:111:0x03bb, B:128:0x02d4, B:129:0x0469, B:130:0x046e, B:132:0x0140, B:134:0x0144, B:145:0x0197, B:146:0x01e7, B:147:0x01f2, B:149:0x01f5, B:151:0x01f8, B:153:0x01fd, B:156:0x0203, B:157:0x01a2, B:158:0x01b8, B:159:0x01c3, B:160:0x01ad, B:161:0x01bb, B:162:0x01c8, B:163:0x01dc, B:164:0x01ea, B:181:0x0212, B:185:0x0240, B:188:0x0250, B:189:0x0246, B:191:0x024e, B:192:0x0236, B:194:0x023c, B:196:0x0255, B:197:0x025b, B:198:0x0470, B:199:0x0475, B:201:0x0477, B:202:0x047c), top: B:3:0x0009, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzb(Map map) {
        ViewParent parent;
        char c;
        int i;
        char c2;
        int i2;
        int i3;
        int i4;
        int i5;
        synchronized (this.zzj) {
            if (this.zzl == null) {
                zzh("Not an activity context. Cannot resize.");
                return;
            }
            if (this.zzk.zzO() == null) {
                zzh("Webview is not yet available, size is not set.");
                return;
            }
            if (this.zzk.zzO().zzi()) {
                zzh("Is interstitial. Cannot resize an interstitial.");
                return;
            }
            if (this.zzk.zzaC()) {
                zzh("Cannot resize an expanded banner.");
                return;
            }
            if (!TextUtils.isEmpty((CharSequence) map.get(ViewHierarchyConstants.DIMENSION_WIDTH_KEY))) {
                com.google.android.gms.ads.internal.zzt.zzp();
                this.zzi = com.google.android.gms.ads.internal.util.zzt.zzN((String) map.get(ViewHierarchyConstants.DIMENSION_WIDTH_KEY));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY))) {
                com.google.android.gms.ads.internal.zzt.zzp();
                this.zzf = com.google.android.gms.ads.internal.util.zzt.zzN((String) map.get(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                com.google.android.gms.ads.internal.zzt.zzp();
                this.zzg = com.google.android.gms.ads.internal.util.zzt.zzN((String) map.get("offsetX"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                com.google.android.gms.ads.internal.zzt.zzp();
                this.zzh = com.google.android.gms.ads.internal.util.zzt.zzN((String) map.get("offsetY"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                this.zzc = Boolean.parseBoolean((String) map.get("allowOffscreen"));
            }
            String str = (String) map.get("customClosePosition");
            if (!TextUtils.isEmpty(str)) {
                this.zzb = str;
            }
            if (this.zzi < 0 || this.zzf < 0) {
                zzh("Invalid width and height options. Cannot resize.");
                return;
            }
            Window window = this.zzl.getWindow();
            if (window != null && window.getDecorView() != null) {
                com.google.android.gms.ads.internal.zzt.zzp();
                int[] zzU = com.google.android.gms.ads.internal.util.zzt.zzU(this.zzl);
                com.google.android.gms.ads.internal.zzt.zzp();
                int[] zzQ = com.google.android.gms.ads.internal.util.zzt.zzQ(this.zzl);
                int i6 = zzU[0];
                int i7 = zzU[1];
                int i8 = this.zzi;
                int[] iArr = null;
                if (i8 >= 50 && i8 <= i6) {
                    int i9 = this.zzf;
                    if (i9 >= 50 && i9 <= i7) {
                        if (i9 == i7 && i8 == i6) {
                            zzcec.zzj("Cannot resize to a full-screen ad.");
                        } else if (this.zzc) {
                            String str2 = this.zzb;
                            switch (str2.hashCode()) {
                                case -1364013995:
                                    if (str2.equals("center")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1012429441:
                                    if (str2.equals("top-left")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -655373719:
                                    if (str2.equals("bottom-left")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1163912186:
                                    if (str2.equals("bottom-right")) {
                                        c2 = 5;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1288627767:
                                    if (str2.equals("bottom-center")) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1755462605:
                                    if (str2.equals("top-center")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            if (c2 == 0) {
                                i2 = this.zzd + this.zzg;
                                i3 = this.zze;
                            } else if (c2 != 1) {
                                if (c2 != 2) {
                                    if (c2 == 3) {
                                        i2 = this.zzd + this.zzg;
                                        i5 = this.zze;
                                    } else if (c2 == 4) {
                                        i2 = ((this.zzd + this.zzg) + (i8 >> 1)) - 25;
                                        i5 = this.zze;
                                    } else if (c2 != 5) {
                                        i2 = ((this.zzd + this.zzg) + i8) - 50;
                                        i3 = this.zze;
                                    } else {
                                        i2 = ((this.zzd + this.zzg) + i8) - 50;
                                        i5 = this.zze;
                                    }
                                    i4 = ((i5 + this.zzh) + i9) - 50;
                                } else {
                                    i2 = ((this.zzd + this.zzg) + (i8 >> 1)) - 25;
                                    i4 = ((this.zze + this.zzh) + (i9 >> 1)) - 25;
                                }
                                if (i2 >= 0 && i2 + 50 <= i6 && i4 >= zzQ[0] && i4 + 50 <= zzQ[1]) {
                                    iArr = new int[]{this.zzd + this.zzg, this.zze + this.zzh};
                                }
                            } else {
                                i2 = ((this.zzd + this.zzg) + (i8 >> 1)) - 25;
                                i3 = this.zze;
                            }
                            i4 = i3 + this.zzh;
                            if (i2 >= 0) {
                                iArr = new int[]{this.zzd + this.zzg, this.zze + this.zzh};
                            }
                        } else {
                            com.google.android.gms.ads.internal.zzt.zzp();
                            int[] zzU2 = com.google.android.gms.ads.internal.util.zzt.zzU(this.zzl);
                            com.google.android.gms.ads.internal.zzt.zzp();
                            int[] zzQ2 = com.google.android.gms.ads.internal.util.zzt.zzQ(this.zzl);
                            int i10 = zzU2[0];
                            int i11 = this.zzd + this.zzg;
                            int i12 = this.zze + this.zzh;
                            if (i11 < 0) {
                                i = 0;
                            } else {
                                int i13 = this.zzi;
                                i = i11 + i13 > i10 ? i10 - i13 : i11;
                            }
                            int i14 = zzQ2[0];
                            if (i12 < i14) {
                                i12 = i14;
                            } else {
                                int i15 = this.zzf;
                                int i16 = i12 + i15;
                                int i17 = zzQ2[1];
                                if (i16 > i17) {
                                    i12 = i17 - i15;
                                }
                            }
                            iArr = new int[]{i, i12};
                        }
                        com.google.android.gms.ads.internal.client.zzay.zzb();
                        int zzx = zzcdv.zzx(this.zzl, this.zzi);
                        com.google.android.gms.ads.internal.client.zzay.zzb();
                        int zzx2 = zzcdv.zzx(this.zzl, this.zzf);
                        parent = ((View) this.zzk).getParent();
                        if (parent != null || !(parent instanceof ViewGroup)) {
                            zzh("Webview is detached, probably in the middle of a resize or expand.");
                            return;
                        }
                        ViewGroup viewGroup = (ViewGroup) parent;
                        viewGroup.removeView((View) this.zzk);
                        PopupWindow popupWindow = this.zzq;
                        if (popupWindow == null) {
                            this.zzs = viewGroup;
                            com.google.android.gms.ads.internal.zzt.zzp();
                            Object obj = this.zzk;
                            ((View) obj).setDrawingCacheEnabled(true);
                            Bitmap createBitmap = Bitmap.createBitmap(((View) obj).getDrawingCache());
                            ((View) obj).setDrawingCacheEnabled(false);
                            ImageView imageView = new ImageView(this.zzl);
                            this.zzn = imageView;
                            imageView.setImageBitmap(createBitmap);
                            this.zzm = this.zzk.zzO();
                            this.zzs.addView(this.zzn);
                        } else {
                            popupWindow.dismiss();
                        }
                        RelativeLayout relativeLayout = new RelativeLayout(this.zzl);
                        this.zzr = relativeLayout;
                        relativeLayout.setBackgroundColor(0);
                        this.zzr.setLayoutParams(new ViewGroup.LayoutParams(zzx, zzx2));
                        com.google.android.gms.ads.internal.zzt.zzp();
                        PopupWindow popupWindow2 = new PopupWindow((View) this.zzr, zzx, zzx2, false);
                        this.zzq = popupWindow2;
                        popupWindow2.setOutsideTouchable(false);
                        this.zzq.setTouchable(true);
                        this.zzq.setClippingEnabled(!this.zzc);
                        this.zzr.addView((View) this.zzk, -1, -1);
                        this.zzo = new LinearLayout(this.zzl);
                        com.google.android.gms.ads.internal.client.zzay.zzb();
                        int zzx3 = zzcdv.zzx(this.zzl, 50);
                        com.google.android.gms.ads.internal.client.zzay.zzb();
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(zzx3, zzcdv.zzx(this.zzl, 50));
                        String str3 = this.zzb;
                        switch (str3.hashCode()) {
                            case -1364013995:
                                if (str3.equals("center")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1012429441:
                                if (str3.equals("top-left")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -655373719:
                                if (str3.equals("bottom-left")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1163912186:
                                if (str3.equals("bottom-right")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1288627767:
                                if (str3.equals("bottom-center")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1755462605:
                                if (str3.equals("top-center")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        if (c == 0) {
                            layoutParams.addRule(10);
                            layoutParams.addRule(9);
                        } else if (c == 1) {
                            layoutParams.addRule(10);
                            layoutParams.addRule(14);
                        } else if (c == 2) {
                            layoutParams.addRule(13);
                        } else if (c == 3) {
                            layoutParams.addRule(12);
                            layoutParams.addRule(9);
                        } else if (c == 4) {
                            layoutParams.addRule(12);
                            layoutParams.addRule(14);
                        } else if (c != 5) {
                            layoutParams.addRule(10);
                            layoutParams.addRule(11);
                        } else {
                            layoutParams.addRule(12);
                            layoutParams.addRule(11);
                        }
                        this.zzo.setOnClickListener(new zzbvp(this));
                        this.zzo.setContentDescription("Close button");
                        this.zzr.addView(this.zzo, layoutParams);
                        try {
                            PopupWindow popupWindow3 = this.zzq;
                            View decorView = window.getDecorView();
                            com.google.android.gms.ads.internal.client.zzay.zzb();
                            int zzx4 = zzcdv.zzx(this.zzl, iArr[0]);
                            com.google.android.gms.ads.internal.client.zzay.zzb();
                            popupWindow3.showAtLocation(decorView, 0, zzx4, zzcdv.zzx(this.zzl, iArr[1]));
                            int i18 = iArr[0];
                            int i19 = iArr[1];
                            zzbvx zzbvxVar = this.zzp;
                            if (zzbvxVar != null) {
                                zzbvxVar.zza(i18, i19, this.zzi, this.zzf);
                            }
                            this.zzk.zzah(zzcla.zzb(zzx, zzx2));
                            int i20 = iArr[0];
                            int i21 = iArr[1];
                            com.google.android.gms.ads.internal.zzt.zzp();
                            zzk(i20, i21 - com.google.android.gms.ads.internal.util.zzt.zzQ(this.zzl)[0], this.zzi, this.zzf);
                            zzl("resized");
                            return;
                        } catch (RuntimeException e) {
                            zzh("Cannot show popup window: " + e.getMessage());
                            this.zzr.removeView((View) this.zzk);
                            ViewGroup viewGroup2 = this.zzs;
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(this.zzn);
                                this.zzs.addView((View) this.zzk);
                                this.zzk.zzah(this.zzm);
                            }
                            return;
                        }
                    }
                    zzcec.zzj("Height is too small or too large.");
                    com.google.android.gms.ads.internal.client.zzay.zzb();
                    int zzx5 = zzcdv.zzx(this.zzl, this.zzi);
                    com.google.android.gms.ads.internal.client.zzay.zzb();
                    int zzx22 = zzcdv.zzx(this.zzl, this.zzf);
                    parent = ((View) this.zzk).getParent();
                    if (parent != null) {
                    }
                    zzh("Webview is detached, probably in the middle of a resize or expand.");
                    return;
                }
                zzcec.zzj("Width is too small or too large.");
                com.google.android.gms.ads.internal.client.zzay.zzb();
                int zzx52 = zzcdv.zzx(this.zzl, this.zzi);
                com.google.android.gms.ads.internal.client.zzay.zzb();
                int zzx222 = zzcdv.zzx(this.zzl, this.zzf);
                parent = ((View) this.zzk).getParent();
                if (parent != null) {
                }
                zzh("Webview is detached, probably in the middle of a resize or expand.");
                return;
            }
            zzh("Activity context is not ready, cannot get window or decor view.");
        }
    }

    public final void zzd(int i, int i2, boolean z) {
        synchronized (this.zzj) {
            this.zzd = i;
            this.zze = i2;
        }
    }

    public final void zze(int i, int i2) {
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean zzf() {
        boolean z;
        synchronized (this.zzj) {
            z = this.zzq != null;
        }
        return z;
    }
}
