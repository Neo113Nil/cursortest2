package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.location.LocationRequestCompat;
import androidx.core.text.HtmlCompat;
import androidx.work.WorkRequest;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.Scopes;
import com.google.android.material.internal.ViewUtils;
import com.google.common.base.Ascii;
import com.google.zxing.pdf417.PDF417Common;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.io.encoding.Base64;
import kotlin.text.Typography;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzaah extends zzsz implements zzaan {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private boolean zzA;
    private boolean zzB;
    private int zzC;
    private zzaal zzD;
    private zzabo zzE;
    private final Context zze;
    private final zzabp zzf;
    private final zzabj zzg;
    private final boolean zzh;
    private final zzaao zzi;
    private final zzaam zzj;
    private zzaag zzk;
    private boolean zzl;
    private boolean zzm;
    private Surface zzn;
    private zzaak zzo;
    private boolean zzp;
    private int zzq;
    private long zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private long zzv;
    private int zzw;
    private long zzx;
    private zzdp zzy;
    private zzdp zzz;

    public zzaah(Context context, zzsq zzsqVar, zztb zztbVar, long j, boolean z, Handler handler, zzabk zzabkVar, int i, float f) {
        super(2, zzsqVar, zztbVar, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        this.zzg = new zzabj(handler, zzabkVar);
        zzzs zzzsVar = new zzzs(applicationContext);
        zzzsVar.zzc(new zzaao(applicationContext, this, 0L));
        zzaab zzd2 = zzzsVar.zzd();
        this.zzf = zzd2;
        this.zzi = zzd2.zza();
        this.zzj = new zzaam();
        this.zzh = "NVIDIA".equals(zzfy.zzc);
        this.zzq = 1;
        this.zzy = zzdp.zza;
        this.zzC = 0;
        this.zzz = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x04c3, code lost:
    
        if (r13.equals("deb") != false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x079e, code lost:
    
        if (r0.equals("JSN-L21") == false) goto L514;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static final boolean zzaM(String str) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (zzaah.class) {
            if (!zzc) {
                char c = 28;
                if (zzfy.zza <= 28) {
                    String str2 = zzfy.zzb;
                    switch (str2.hashCode()) {
                        case -1339091551:
                            if (str2.equals("dangal")) {
                                z2 = true;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -1220081023:
                            if (str2.equals("dangalFHD")) {
                                z2 = 3;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -1220066608:
                            if (str2.equals("dangalUHD")) {
                                z2 = 2;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -1012436106:
                            if (str2.equals("oneday")) {
                                z2 = 7;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -760312546:
                            if (str2.equals("aquaman")) {
                                z2 = false;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -64886864:
                            if (str2.equals("magnolia")) {
                                z2 = 4;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 3415681:
                            if (str2.equals("once")) {
                                z2 = 6;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 825323514:
                            if (str2.equals("machuca")) {
                                z2 = 5;
                                break;
                            }
                            z2 = -1;
                            break;
                        default:
                            z2 = -1;
                            break;
                    }
                    switch (z2) {
                        case false:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                            z3 = true;
                            break;
                    }
                    zzd = z3;
                    zzc = true;
                }
                if (zzfy.zza > 27 || !"HWEML".equals(zzfy.zzb)) {
                    String str3 = zzfy.zzd;
                    switch (str3.hashCode()) {
                        case -349662828:
                            if (str3.equals("AFTJMST12")) {
                                z = 6;
                                break;
                            }
                            z = -1;
                            break;
                        case -321033677:
                            if (str3.equals("AFTKMST12")) {
                                z = 7;
                                break;
                            }
                            z = -1;
                            break;
                        case 2006354:
                            if (str3.equals("AFTA")) {
                                z = false;
                                break;
                            }
                            z = -1;
                            break;
                        case 2006367:
                            if (str3.equals("AFTN")) {
                                z = true;
                                break;
                            }
                            z = -1;
                            break;
                        case 2006371:
                            if (str3.equals("AFTR")) {
                                z = 2;
                                break;
                            }
                            z = -1;
                            break;
                        case 1785421873:
                            if (str3.equals("AFTEU011")) {
                                z = 3;
                                break;
                            }
                            z = -1;
                            break;
                        case 1785421876:
                            if (str3.equals("AFTEU014")) {
                                z = 4;
                                break;
                            }
                            z = -1;
                            break;
                        case 1798172390:
                            if (str3.equals("AFTSO001")) {
                                z = 8;
                                break;
                            }
                            z = -1;
                            break;
                        case 2119412532:
                            if (str3.equals("AFTEUFF014")) {
                                z = 5;
                                break;
                            }
                            z = -1;
                            break;
                        default:
                            z = -1;
                            break;
                    }
                    switch (z) {
                        default:
                            if (zzfy.zza <= 26) {
                                String str4 = zzfy.zzb;
                                switch (str4.hashCode()) {
                                    case -2144781245:
                                        if (str4.equals("GIONEE_SWW1609")) {
                                            c = '6';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2144781185:
                                        if (str4.equals("GIONEE_SWW1627")) {
                                            c = '7';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2144781160:
                                        if (str4.equals("GIONEE_SWW1631")) {
                                            c = '8';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2097309513:
                                        if (str4.equals("K50a40")) {
                                            c = 'J';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2022874474:
                                        if (str4.equals("CP8676_I02")) {
                                            c = 22;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1978993182:
                                        if (str4.equals("NX541J")) {
                                            c = 'Y';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1978990237:
                                        if (str4.equals("NX573J")) {
                                            c = 'Z';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1936688988:
                                        if (str4.equals("PGN528")) {
                                            c = 'e';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1936688066:
                                        if (str4.equals("PGN610")) {
                                            c = 'f';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1936688065:
                                        if (str4.equals("PGN611")) {
                                            c = 'g';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1931988508:
                                        if (str4.equals("AquaPowerM")) {
                                            c = '\r';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1885099851:
                                        if (str4.equals("RAIJIN")) {
                                            c = 't';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1696512866:
                                        if (str4.equals("XT1663")) {
                                            c = 137;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1680025915:
                                        if (str4.equals("ComioS1")) {
                                            c = 21;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1615810839:
                                        if (str4.equals("Phantom6")) {
                                            c = 'h';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1600724499:
                                        if (str4.equals("pacificrim")) {
                                            c = '_';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1554255044:
                                        if (str4.equals("vernee_M5")) {
                                            c = 130;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1481772737:
                                        if (str4.equals("panell_dl")) {
                                            c = 'a';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1481772730:
                                        if (str4.equals("panell_ds")) {
                                            c = 'b';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1481772729:
                                        if (str4.equals("panell_dt")) {
                                            c = 'c';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1320080169:
                                        if (str4.equals("GiONEE_GBL7319")) {
                                            c = '4';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1217592143:
                                        if (str4.equals("BRAVIA_ATV2")) {
                                            c = 18;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1180384755:
                                        if (str4.equals("iris60")) {
                                            c = 'F';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1139198265:
                                        if (str4.equals("Slate_Pro")) {
                                            c = 'v';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1052835013:
                                        if (str4.equals("namath")) {
                                            c = 'W';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -993250464:
                                        if (str4.equals("A10-70F")) {
                                            c = 5;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -993250458:
                                        if (str4.equals("A10-70L")) {
                                            c = 6;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -965403638:
                                        if (str4.equals("s905x018")) {
                                            c = 'x';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -958336948:
                                        if (str4.equals("ELUGA_Ray_X")) {
                                            c = Typography.quote;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -879245230:
                                        if (str4.equals("tcl_eu")) {
                                            c = '~';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -842500323:
                                        if (str4.equals("nicklaus_f")) {
                                            c = 'X';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -821392978:
                                        if (str4.equals("A7000-a")) {
                                            c = '\t';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -797483286:
                                        if (str4.equals("SVP-DTV15")) {
                                            c = 'w';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -794946968:
                                        if (str4.equals("watson")) {
                                            c = 131;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -788334647:
                                        if (str4.equals("whyred")) {
                                            c = 132;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -782144577:
                                        if (str4.equals("OnePlus5T")) {
                                            c = '[';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -575125681:
                                        if (str4.equals("GiONEE_CBL7513")) {
                                            c = '3';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -521118391:
                                        if (str4.equals("GIONEE_GBL7360")) {
                                            c = '5';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -430914369:
                                        if (str4.equals("Pixi4-7_3G")) {
                                            c = 'i';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -290434366:
                                        if (str4.equals("taido_row")) {
                                            c = 'y';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -282781963:
                                        if (str4.equals("BLACK-1X")) {
                                            c = 17;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -277133239:
                                        if (str4.equals("Z12_PRO")) {
                                            c = 138;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -173639913:
                                        if (str4.equals("ELUGA_A3_Pro")) {
                                            c = 31;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -56598463:
                                        if (str4.equals("woods_fn")) {
                                            c = 134;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2126:
                                        if (str4.equals("C1")) {
                                            c = 20;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2564:
                                        if (str4.equals("Q5")) {
                                            c = 'q';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2715:
                                        if (str4.equals("V1")) {
                                            c = Ascii.MAX;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2719:
                                        if (str4.equals("V5")) {
                                            c = 129;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3091:
                                        if (str4.equals("b5")) {
                                            c = 16;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3483:
                                        if (str4.equals("mh")) {
                                            c = 'T';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 73405:
                                        if (str4.equals("JGZ")) {
                                            c = 'I';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 75537:
                                        if (str4.equals("M04")) {
                                            c = 'O';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 75739:
                                        if (str4.equals("M5c")) {
                                            c = 'P';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76779:
                                        if (str4.equals("MX6")) {
                                            c = 'V';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 78669:
                                        if (str4.equals("P85")) {
                                            c = '^';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 79305:
                                        if (str4.equals("PLE")) {
                                            c = 'k';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 80618:
                                        if (str4.equals("QX1")) {
                                            c = 's';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 88274:
                                        if (str4.equals("Z80")) {
                                            c = 139;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 98846:
                                        if (str4.equals("cv1")) {
                                            c = 26;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 98848:
                                        if (str4.equals("cv3")) {
                                            c = 27;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 99329:
                                        break;
                                    case 101481:
                                        if (str4.equals("flo")) {
                                            c = '1';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1513190:
                                        if (str4.equals("1601")) {
                                            c = 0;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1514184:
                                        if (str4.equals("1713")) {
                                            c = 1;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1514185:
                                        if (str4.equals("1714")) {
                                            c = 2;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133089:
                                        if (str4.equals("F01H")) {
                                            c = Typography.dollar;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133091:
                                        if (str4.equals("F01J")) {
                                            c = '%';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133120:
                                        if (str4.equals("F02H")) {
                                            c = Typography.amp;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133151:
                                        if (str4.equals("F03H")) {
                                            c = '\'';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133182:
                                        if (str4.equals("F04H")) {
                                            c = '(';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133184:
                                        if (str4.equals("F04J")) {
                                            c = ')';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2436959:
                                        if (str4.equals("P681")) {
                                            c = ']';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2463773:
                                        if (str4.equals("Q350")) {
                                            c = 'm';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2464648:
                                        if (str4.equals("Q427")) {
                                            c = 'o';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2689555:
                                        if (str4.equals("XE2X")) {
                                            c = 136;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3154429:
                                        if (str4.equals("fugu")) {
                                            c = '2';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3284551:
                                        if (str4.equals("kate")) {
                                            c = 'K';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3351335:
                                        if (str4.equals("mido")) {
                                            c = 'U';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3386211:
                                        if (str4.equals("p212")) {
                                            c = '\\';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 41325051:
                                        if (str4.equals("MEIZU_M5")) {
                                            c = 'S';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 51349633:
                                        if (str4.equals("601LV")) {
                                            c = 3;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 51350594:
                                        if (str4.equals("602LV")) {
                                            c = 4;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 55178625:
                                        if (str4.equals("Aura_Note_2")) {
                                            c = 15;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 61542055:
                                        if (str4.equals("A1601")) {
                                            c = 7;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 65355429:
                                        if (str4.equals("E5643")) {
                                            c = 30;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66214468:
                                        if (str4.equals("F3111")) {
                                            c = '*';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66214470:
                                        if (str4.equals("F3113")) {
                                            c = '+';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66214473:
                                        if (str4.equals("F3116")) {
                                            c = ',';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66215429:
                                        if (str4.equals("F3211")) {
                                            c = '-';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66215431:
                                        if (str4.equals("F3213")) {
                                            c = '.';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66215433:
                                        if (str4.equals("F3215")) {
                                            c = '/';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66216390:
                                        if (str4.equals("F3311")) {
                                            c = '0';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76402249:
                                        if (str4.equals("PRO7S")) {
                                            c = 'l';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76404105:
                                        if (str4.equals("Q4260")) {
                                            c = 'n';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76404911:
                                        if (str4.equals("Q4310")) {
                                            c = 'p';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 80963634:
                                        if (str4.equals("V23GB")) {
                                            c = 128;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 82882791:
                                        if (str4.equals("X3_HK")) {
                                            c = 135;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 98715550:
                                        if (str4.equals("i9031")) {
                                            c = 'C';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 101370885:
                                        if (str4.equals("l5460")) {
                                            c = 'L';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 102844228:
                                        if (str4.equals("le_x6")) {
                                            c = 'M';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 165221241:
                                        if (str4.equals("A2016a40")) {
                                            c = '\b';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 182191441:
                                        if (str4.equals("CPY83_I00")) {
                                            c = 25;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 245388979:
                                        if (str4.equals("marino_f")) {
                                            c = 'R';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 287431619:
                                        if (str4.equals("griffin")) {
                                            c = Typography.less;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 307593612:
                                        if (str4.equals("A7010a48")) {
                                            c = 11;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 308517133:
                                        if (str4.equals("A7020a48")) {
                                            c = '\f';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316215098:
                                        if (str4.equals("TB3-730F")) {
                                            c = 'z';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316215116:
                                        if (str4.equals("TB3-730X")) {
                                            c = '{';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316246811:
                                        if (str4.equals("TB3-850F")) {
                                            c = '|';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316246818:
                                        if (str4.equals("TB3-850M")) {
                                            c = '}';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 407160593:
                                        if (str4.equals("Pixi5-10_4G")) {
                                            c = 'j';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 507412548:
                                        if (str4.equals("QM16XE_U")) {
                                            c = 'r';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 793982701:
                                        if (str4.equals("GIONEE_WBL5708")) {
                                            c = '9';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 794038622:
                                        if (str4.equals("GIONEE_WBL7365")) {
                                            c = ':';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 794040393:
                                        if (str4.equals("GIONEE_WBL7519")) {
                                            c = ';';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 835649806:
                                        if (str4.equals("manning")) {
                                            c = 'Q';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 917340916:
                                        if (str4.equals("A7000plus")) {
                                            c = '\n';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 958008161:
                                        if (str4.equals("j2xlteins")) {
                                            c = 'H';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1060579533:
                                        if (str4.equals("panell_d")) {
                                            c = '`';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1150207623:
                                        if (str4.equals("LS-5017")) {
                                            c = 'N';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1176899427:
                                        if (str4.equals("itel_S41")) {
                                            c = 'G';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1280332038:
                                        if (str4.equals("hwALE-H")) {
                                            c = Typography.greater;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1306947716:
                                        if (str4.equals("EverStar_S")) {
                                            c = '#';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1349174697:
                                        if (str4.equals("htc_e56ml_dtul")) {
                                            c = '=';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1522194893:
                                        if (str4.equals("woods_f")) {
                                            c = 133;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1691543273:
                                        if (str4.equals("CPH1609")) {
                                            c = 23;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1691544261:
                                        if (str4.equals("CPH1715")) {
                                            c = 24;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1709443163:
                                        if (str4.equals("iball8735_9806")) {
                                            c = 'D';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1865889110:
                                        if (str4.equals("santoni")) {
                                            c = 'u';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1906253259:
                                        if (str4.equals("PB2-670M")) {
                                            c = 'd';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1977196784:
                                        if (str4.equals("Infinix-X572")) {
                                            c = 'E';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2006372676:
                                        if (str4.equals("BRAVIA_ATV3_4K")) {
                                            c = 19;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2019281702:
                                        if (str4.equals("DM-01K")) {
                                            c = 29;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2029784656:
                                        if (str4.equals("HWBLN-H")) {
                                            c = '?';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2030379515:
                                        if (str4.equals("HWCAM-H")) {
                                            c = '@';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2033393791:
                                        if (str4.equals("ASUS_X00AD_2")) {
                                            c = 14;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2047190025:
                                        if (str4.equals("ELUGA_Note")) {
                                            c = ' ';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2047252157:
                                        if (str4.equals("ELUGA_Prim")) {
                                            c = '!';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2048319463:
                                        if (str4.equals("HWVNS-H")) {
                                            c = 'A';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2048855701:
                                        if (str4.equals("HWWAS-H")) {
                                            c = 'B';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                                switch (c) {
                                    default:
                                        if (str3.hashCode() == -594534941) {
                                            break;
                                        }
                                        break;
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case '\b':
                                    case '\t':
                                    case '\n':
                                    case 11:
                                    case '\f':
                                    case '\r':
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                                    case 30:
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                                    case ' ':
                                    case '!':
                                    case '\"':
                                    case '#':
                                    case '$':
                                    case '%':
                                    case '&':
                                    case '\'':
                                    case '(':
                                    case ')':
                                    case '*':
                                    case '+':
                                    case ',':
                                    case '-':
                                    case '.':
                                    case '/':
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                                    case '2':
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                                    case '8':
                                    case '9':
                                    case ':':
                                    case ';':
                                    case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                    case '>':
                                    case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                                    case '@':
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                                    case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                                    case 'D':
                                    case 'E':
                                    case 'F':
                                    case 'G':
                                    case 'H':
                                    case 'I':
                                    case 'J':
                                    case 'K':
                                    case Base64.mimeLineLength /* 76 */:
                                    case 'M':
                                    case 'N':
                                    case 'O':
                                    case 'P':
                                    case 'Q':
                                    case 'R':
                                    case 'S':
                                    case 'T':
                                    case 'U':
                                    case 'V':
                                    case 'W':
                                    case 'X':
                                    case 'Y':
                                    case PDF417Common.MAX_ROWS_IN_BARCODE /* 90 */:
                                    case '[':
                                    case '\\':
                                    case ']':
                                    case '^':
                                    case '_':
                                    case '`':
                                    case 'a':
                                    case 'b':
                                    case 'c':
                                    case 'd':
                                    case TypedValues.TYPE_TARGET /* 101 */:
                                    case 'f':
                                    case 'g':
                                    case LocationRequestCompat.QUALITY_LOW_POWER /* 104 */:
                                    case 'i':
                                    case 'j':
                                    case 'k':
                                    case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR /* 108 */:
                                    case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
                                    case 'n':
                                    case 'o':
                                    case 'p':
                                    case 'q':
                                    case 'r':
                                    case 's':
                                    case 't':
                                    case 'u':
                                    case 'v':
                                    case 'w':
                                    case 'x':
                                    case 'y':
                                    case 'z':
                                    case '{':
                                    case '|':
                                    case '}':
                                    case '~':
                                    case WorkQueueKt.MASK /* 127 */:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case 137:
                                    case 138:
                                    case 139:
                                        break;
                                }
                            }
                            break;
                        case false:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                            break;
                    }
                    zzd = z3;
                    zzc = true;
                }
                z3 = true;
                zzd = z3;
                zzc = true;
            }
        }
        return zzd;
    }

    private static List zzaN(Context context, zztb zztbVar, zzam zzamVar, boolean z, boolean z2) throws zzth {
        if (zzamVar.zzm == null) {
            return zzgaa.zzl();
        }
        if (zzfy.zza >= 26 && "video/dolby-vision".equals(zzamVar.zzm) && !zzaaf.zza(context)) {
            List zzd2 = zztn.zzd(zztbVar, zzamVar, z, z2);
            if (!zzd2.isEmpty()) {
                return zzd2;
            }
        }
        return zztn.zzf(zztbVar, zzamVar, z, z2);
    }

    private final void zzaO() {
        zzdp zzdpVar = this.zzz;
        if (zzdpVar != null) {
            this.zzg.zzt(zzdpVar);
        }
    }

    private final void zzaP() {
        Surface surface = this.zzn;
        zzaak zzaakVar = this.zzo;
        if (surface == zzaakVar) {
            this.zzn = null;
        }
        if (zzaakVar != null) {
            zzaakVar.release();
            this.zzo = null;
        }
    }

    private final boolean zzaQ(zzsv zzsvVar) {
        if (zzfy.zza < 23 || zzaM(zzsvVar.zza)) {
            return false;
        }
        return !zzsvVar.zzf || zzaak.zzb(this.zze);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0075, code lost:
    
        if (r3.equals("video/av01") != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzac(zzsv zzsvVar, zzam zzamVar) {
        int intValue;
        int i = zzamVar.zzr;
        int i2 = zzamVar.zzs;
        if (i != -1 && i2 != -1) {
            String str = zzamVar.zzm;
            str.getClass();
            char c = 2;
            if ("video/dolby-vision".equals(str)) {
                Pair zza = zztn.zza(zzamVar);
                str = (zza == null || !((intValue = ((Integer) zza.first).intValue()) == 512 || intValue == 1 || intValue == 2)) ? "video/hevc" : "video/avc";
            }
            int i3 = 4;
            switch (str.hashCode()) {
                case -1664118616:
                    if (str.equals("video/3gpp")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1662735862:
                    break;
                case -1662541442:
                    if (str.equals("video/hevc")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1187890754:
                    if (str.equals("video/mp4v-es")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1331836730:
                    if (str.equals("video/avc")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127256:
                    if (str.equals("video/x-vnd.on2.vp8")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127257:
                    if (str.equals("video/x-vnd.on2.vp9")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                    return ((i * i2) * 3) / i3;
                case 4:
                    return Math.max(2097152, ((i * i2) * 3) / 4);
                case 5:
                    if (!"BRAVIA 4K 2015".equals(zzfy.zzd) && (!"Amazon".equals(zzfy.zzc) || (!"KFSOWI".equals(zzfy.zzd) && (!"AFTS".equals(zzfy.zzd) || !zzsvVar.zzf)))) {
                        return ((((i + 15) / 16) * ((i2 + 15) / 16)) * ViewUtils.EDGE_TO_EDGE_FLAGS) / 4;
                    }
                    break;
                case 6:
                    i3 = 8;
                    return ((i * i2) * 3) / i3;
            }
        }
        return -1;
    }

    protected static int zzad(zzsv zzsvVar, zzam zzamVar) {
        if (zzamVar.zzn == -1) {
            return zzac(zzsvVar, zzamVar);
        }
        int size = zzamVar.zzo.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((byte[]) zzamVar.zzo.get(i2)).length;
        }
        return zzamVar.zzn + i;
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final void zzA() {
        if (this.zzf.zzk()) {
            this.zzf.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zziq
    protected final void zzB() {
        try {
            super.zzB();
            this.zzB = false;
            if (this.zzo != null) {
                zzaP();
            }
        } catch (Throwable th) {
            this.zzB = false;
            if (this.zzo != null) {
                zzaP();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final void zzC() {
        this.zzs = 0;
        zzh();
        this.zzr = SystemClock.elapsedRealtime();
        this.zzv = 0L;
        this.zzw = 0;
        this.zzi.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final void zzD() {
        if (this.zzs > 0) {
            zzh();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzg.zzd(this.zzs, elapsedRealtime - this.zzr);
            this.zzs = 0;
            this.zzr = elapsedRealtime;
        }
        int i = this.zzw;
        if (i != 0) {
            this.zzg.zzr(this.zzv, i);
            this.zzv = 0L;
            this.zzw = 0;
        }
        this.zzi.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zziq, com.google.android.gms.internal.ads.zzmf
    public final void zzL(float f, float f2) throws zziz {
        super.zzL(f, f2);
        this.zzi.zzn(f);
        if (this.zzE != null) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmf, com.google.android.gms.internal.ads.zzmh
    public final String zzT() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzmf
    public final void zzU(long j, long j2) throws zziz {
        super.zzU(j, j2);
        if (this.zzE == null) {
            return;
        }
        try {
            throw null;
        } catch (zzabn e) {
            throw zzi(e, e.zza, false, 7001);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzmf
    public final boolean zzV() {
        if (!super.zzV()) {
            return false;
        }
        if (this.zzE == null) {
            return true;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzmf
    public final boolean zzW() {
        boolean z;
        zzaak zzaakVar;
        if (!super.zzW()) {
            z = false;
        } else {
            if (this.zzE != null) {
                throw null;
            }
            z = true;
        }
        if (!z || (((zzaakVar = this.zzo) == null || this.zzn != zzaakVar) && zzau() != null)) {
            return this.zzi.zzo(z);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final float zzY(float f, zzam zzamVar, zzam[] zzamVarArr) {
        float f2 = -1.0f;
        for (zzam zzamVar2 : zzamVarArr) {
            float f3 = zzamVar2.zzt;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final int zzZ(zztb zztbVar, zzam zzamVar) throws zzth {
        boolean z;
        if (!zzcb.zzh(zzamVar.zzm)) {
            return 128;
        }
        int i = 1;
        int i2 = 0;
        boolean z2 = zzamVar.zzp != null;
        List zzaN = zzaN(this.zze, zztbVar, zzamVar, z2, false);
        if (z2 && zzaN.isEmpty()) {
            zzaN = zzaN(this.zze, zztbVar, zzamVar, false, false);
        }
        if (!zzaN.isEmpty()) {
            if (zzaJ(zzamVar)) {
                zzsv zzsvVar = (zzsv) zzaN.get(0);
                boolean zze = zzsvVar.zze(zzamVar);
                if (!zze) {
                    for (int i3 = 1; i3 < zzaN.size(); i3++) {
                        zzsv zzsvVar2 = (zzsv) zzaN.get(i3);
                        if (zzsvVar2.zze(zzamVar)) {
                            zze = true;
                            z = false;
                            zzsvVar = zzsvVar2;
                            break;
                        }
                    }
                }
                z = true;
                int i4 = true != zze ? 3 : 4;
                int i5 = true != zzsvVar.zzf(zzamVar) ? 8 : 16;
                int i6 = true != zzsvVar.zzg ? 0 : 64;
                int i7 = true != z ? 0 : 128;
                if (zzfy.zza >= 26 && "video/dolby-vision".equals(zzamVar.zzm) && !zzaaf.zza(this.zze)) {
                    i7 = 256;
                }
                if (zze) {
                    List zzaN2 = zzaN(this.zze, zztbVar, zzamVar, z2, true);
                    if (!zzaN2.isEmpty()) {
                        zzsv zzsvVar3 = (zzsv) zztn.zzg(zzaN2, zzamVar).get(0);
                        if (zzsvVar3.zze(zzamVar) && zzsvVar3.zzf(zzamVar)) {
                            i2 = 32;
                        }
                    }
                }
                return i4 | i5 | i2 | i6 | i7;
            }
            i = 2;
        }
        return i | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzaan
    public final boolean zza(long j, long j2, boolean z) {
        return j < -30000 && !z;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzaA(zzam zzamVar) throws zziz {
        if (this.zzA && !this.zzB && !this.zzf.zzk()) {
            try {
                this.zzf.zzd(zzamVar);
                this.zzf.zzh(zzas());
                zzaal zzaalVar = this.zzD;
                if (zzaalVar != null) {
                    this.zzf.zzj(zzaalVar);
                }
            } catch (zzabn e) {
                throw zzi(e, zzamVar, false, 7000);
            }
        }
        if (this.zzE != null || !this.zzf.zzk()) {
            this.zzB = true;
        } else {
            this.zzE = this.zzf.zzb();
            zzgfe.zzb();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzaC() {
        super.zzaC();
        this.zzu = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final boolean zzaI(zzsv zzsvVar) {
        return this.zzn != null || zzaQ(zzsvVar);
    }

    protected final void zzaK(int i, int i2) {
        zzir zzirVar = this.zza;
        zzirVar.zzh += i;
        int i3 = i + i2;
        zzirVar.zzg += i3;
        this.zzs += i3;
        int i4 = this.zzt + i3;
        this.zzt = i4;
        zzirVar.zzi = Math.max(i4, zzirVar.zzi);
    }

    protected final void zzaL(long j) {
        zzir zzirVar = this.zza;
        zzirVar.zzk += j;
        zzirVar.zzl++;
        this.zzv += j;
        this.zzw++;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final zzis zzaa(zzsv zzsvVar, zzam zzamVar, zzam zzamVar2) {
        int i;
        int i2;
        zzis zzb2 = zzsvVar.zzb(zzamVar, zzamVar2);
        int i3 = zzb2.zze;
        zzaag zzaagVar = this.zzk;
        zzaagVar.getClass();
        if (zzamVar2.zzr > zzaagVar.zza || zzamVar2.zzs > zzaagVar.zzb) {
            i3 |= 256;
        }
        if (zzad(zzsvVar, zzamVar2) > zzaagVar.zzc) {
            i3 |= 64;
        }
        String str = zzsvVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zzb2.zzd;
            i2 = 0;
        }
        return new zzis(str, zzamVar, zzamVar2, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final zzis zzab(zzlb zzlbVar) throws zziz {
        zzis zzab = super.zzab(zzlbVar);
        zzam zzamVar = zzlbVar.zza;
        zzamVar.getClass();
        this.zzg.zzf(zzamVar, zzab);
        return zzab;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0220  */
    @Override // com.google.android.gms.internal.ads.zzsz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final zzsp zzae(zzsv zzsvVar, zzam zzamVar, MediaCrypto mediaCrypto, float f) {
        String str;
        Point point;
        int i;
        int i2;
        boolean z;
        MediaFormat mediaFormat;
        float f2;
        zzt zztVar;
        Pair zza;
        int zzac;
        zzaak zzaakVar = this.zzo;
        if (zzaakVar != null) {
            if (zzaakVar.zza != zzsvVar.zzf) {
                zzaP();
            }
        }
        String str2 = zzsvVar.zzc;
        zzam[] zzS = zzS();
        int i3 = zzamVar.zzr;
        int i4 = zzamVar.zzs;
        int zzad = zzad(zzsvVar, zzamVar);
        int length = zzS.length;
        if (length != 1) {
            boolean z2 = false;
            for (int i5 = 0; i5 < length; i5++) {
                zzam zzamVar2 = zzS[i5];
                if (zzamVar.zzy != null && zzamVar2.zzy == null) {
                    zzak zzb2 = zzamVar2.zzb();
                    zzb2.zzA(zzamVar.zzy);
                    zzamVar2 = zzb2.zzac();
                }
                if (zzsvVar.zzb(zzamVar, zzamVar2).zzd != 0) {
                    int i6 = zzamVar2.zzr;
                    z2 |= i6 == -1 || zzamVar2.zzs == -1;
                    i3 = Math.max(i3, i6);
                    i4 = Math.max(i4, zzamVar2.zzs);
                    zzad = Math.max(zzad, zzad(zzsvVar, zzamVar2));
                }
            }
            if (z2) {
                zzff.zzf("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i3 + "x" + i4);
                int i7 = zzamVar.zzs;
                int i8 = zzamVar.zzr;
                boolean z3 = i7 > i8;
                int i9 = z3 ? i7 : i8;
                if (true == z3) {
                    i7 = i8;
                }
                int[] iArr = zzb;
                int i10 = 0;
                while (true) {
                    if (i10 >= 9) {
                        str = str2;
                        break;
                    }
                    float f3 = i7;
                    float f4 = i9;
                    str = str2;
                    int i11 = iArr[i10];
                    int[] iArr2 = iArr;
                    float f5 = i11;
                    if (i11 <= i9 || (i = (int) (f5 * (f3 / f4))) <= i7) {
                        break;
                    }
                    int i12 = zzfy.zza;
                    int i13 = true != z3 ? i11 : i;
                    if (true != z3) {
                        i11 = i;
                    }
                    point = zzsvVar.zza(i13, i11);
                    float f6 = zzamVar.zzt;
                    if (point != null) {
                        i2 = i7;
                        if (zzsvVar.zzg(point.x, point.y, f6)) {
                            break;
                        }
                    } else {
                        i2 = i7;
                    }
                    i10++;
                    str2 = str;
                    iArr = iArr2;
                    i7 = i2;
                }
                point = null;
                if (point != null) {
                    i3 = Math.max(i3, point.x);
                    i4 = Math.max(i4, point.y);
                    zzak zzb3 = zzamVar.zzb();
                    zzb3.zzab(i3);
                    zzb3.zzI(i4);
                    zzad = Math.max(zzad, zzac(zzsvVar, zzb3.zzac()));
                    zzff.zzf("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i3 + "x" + i4);
                }
                zzaag zzaagVar = new zzaag(i3, i4, zzad);
                this.zzk = zzaagVar;
                z = this.zzh;
                mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str);
                mediaFormat.setInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, zzamVar.zzr);
                mediaFormat.setInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, zzamVar.zzs);
                zzfi.zzb(mediaFormat, zzamVar.zzo);
                f2 = zzamVar.zzt;
                if (f2 != -1.0f) {
                    mediaFormat.setFloat("frame-rate", f2);
                }
                zzfi.zza(mediaFormat, "rotation-degrees", zzamVar.zzu);
                zztVar = zzamVar.zzy;
                if (zztVar != null) {
                    zzfi.zza(mediaFormat, "color-transfer", zztVar.zzf);
                    zzfi.zza(mediaFormat, "color-standard", zztVar.zzd);
                    zzfi.zza(mediaFormat, "color-range", zztVar.zze);
                    byte[] bArr = zztVar.zzg;
                    if (bArr != null) {
                        mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
                    }
                }
                if ("video/dolby-vision".equals(zzamVar.zzm) && (zza = zztn.zza(zzamVar)) != null) {
                    zzfi.zza(mediaFormat, Scopes.PROFILE, ((Integer) zza.first).intValue());
                }
                mediaFormat.setInteger("max-width", zzaagVar.zza);
                mediaFormat.setInteger("max-height", zzaagVar.zzb);
                zzfi.zza(mediaFormat, "max-input-size", zzaagVar.zzc);
                if (zzfy.zza >= 23) {
                    mediaFormat.setInteger("priority", 0);
                    if (f != -1.0f) {
                        mediaFormat.setFloat("operating-rate", f);
                    }
                }
                if (z) {
                    mediaFormat.setInteger("no-post-process", 1);
                    mediaFormat.setInteger("auto-frc", 0);
                }
                if (this.zzn == null) {
                    if (!zzaQ(zzsvVar)) {
                        throw new IllegalStateException();
                    }
                    if (this.zzo == null) {
                        this.zzo = zzaak.zza(this.zze, zzsvVar.zzf);
                    }
                    this.zzn = this.zzo;
                }
                if (this.zzE != null) {
                    return zzsp.zzb(zzsvVar, mediaFormat, zzamVar, this.zzn, null);
                }
                throw null;
            }
        } else if (zzad != -1 && (zzac = zzac(zzsvVar, zzamVar)) != -1) {
            zzad = Math.min((int) (zzad * 1.5f), zzac);
        }
        str = str2;
        zzaag zzaagVar2 = new zzaag(i3, i4, zzad);
        this.zzk = zzaagVar2;
        z = this.zzh;
        mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, zzamVar.zzr);
        mediaFormat.setInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, zzamVar.zzs);
        zzfi.zzb(mediaFormat, zzamVar.zzo);
        f2 = zzamVar.zzt;
        if (f2 != -1.0f) {
        }
        zzfi.zza(mediaFormat, "rotation-degrees", zzamVar.zzu);
        zztVar = zzamVar.zzy;
        if (zztVar != null) {
        }
        if ("video/dolby-vision".equals(zzamVar.zzm)) {
            zzfi.zza(mediaFormat, Scopes.PROFILE, ((Integer) zza.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzaagVar2.zza);
        mediaFormat.setInteger("max-height", zzaagVar2.zzb);
        zzfi.zza(mediaFormat, "max-input-size", zzaagVar2.zzc);
        if (zzfy.zza >= 23) {
        }
        if (z) {
        }
        if (this.zzn == null) {
        }
        if (this.zzE != null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final List zzaf(zztb zztbVar, zzam zzamVar, boolean z) throws zzth {
        return zztn.zzg(zzaN(this.zze, zztbVar, zzamVar, false, false), zzamVar);
    }

    protected final void zzag(zzsr zzsrVar, int i, long j, long j2) {
        Surface surface;
        int i2 = zzfy.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzsrVar.zzm(i, j2);
        Trace.endSection();
        this.zza.zze++;
        this.zzt = 0;
        if (this.zzE == null) {
            zzdp zzdpVar = this.zzy;
            if (!zzdpVar.equals(zzdp.zza) && !zzdpVar.equals(this.zzz)) {
                this.zzz = zzdpVar;
                this.zzg.zzt(zzdpVar);
            }
            if (!this.zzi.zzp() || (surface = this.zzn) == null) {
                return;
            }
            this.zzg.zzq(surface);
            this.zzp = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzah(zzih zzihVar) throws zziz {
        if (this.zzm) {
            ByteBuffer byteBuffer = zzihVar.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzsr zzau = zzau();
                        zzau.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzau.zzp(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzai(Exception exc) {
        zzff.zzd("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzaj(String str, zzsp zzspVar, long j, long j2) {
        this.zzg.zza(str, j, j2);
        this.zzl = zzaM(str);
        zzsv zzaw = zzaw();
        zzaw.getClass();
        boolean z = false;
        if (zzfy.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzaw.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzh = zzaw.zzh();
            int length = zzh.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (zzh[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.zzm = z;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzak(String str) {
        this.zzg.zzb(str);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzal(zzam zzamVar, MediaFormat mediaFormat) {
        zzsr zzau = zzau();
        if (zzau != null) {
            zzau.zzq(this.zzq);
        }
        mediaFormat.getClass();
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
        float f = zzamVar.zzv;
        int i = zzfy.zza;
        int i2 = zzamVar.zzu;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer2;
            integer2 = integer;
            integer = i3;
        }
        this.zzy = new zzdp(integer, integer2, 0, f);
        this.zzi.zzl(zzamVar.zzt);
        if (this.zzE == null) {
            return;
        }
        zzak zzb2 = zzamVar.zzb();
        zzb2.zzab(integer);
        zzb2.zzI(integer2);
        zzb2.zzV(0);
        zzb2.zzS(f);
        zzb2.zzac();
        throw null;
    }

    protected final void zzam(zzsr zzsrVar, int i, long j) {
        int i2 = zzfy.zza;
        Trace.beginSection("skipVideoBuffer");
        zzsrVar.zzn(i, false);
        Trace.endSection();
        this.zza.zzf++;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzan() {
        this.zzi.zzf();
        int i = zzfy.zza;
        if (this.zzf.zzk()) {
            this.zzf.zzh(zzas());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final int zzar(zzih zzihVar) {
        int i = zzfy.zza;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final zzst zzav(Throwable th, zzsv zzsvVar) {
        return new zzaae(th, zzsvVar, this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzay(long j) {
        super.zzay(j);
        this.zzu--;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzaz(zzih zzihVar) throws zziz {
        this.zzu++;
        int i = zzfy.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaan
    public final boolean zzb(long j, long j2) {
        return j < -30000 && j2 > 100000;
    }

    @Override // com.google.android.gms.internal.ads.zzaan
    public final boolean zzc(long j, long j2, long j3, boolean z, boolean z2) throws zziz {
        int zzd2;
        if (j >= -500000 || z || (zzd2 = zzd(j2)) == 0) {
            return false;
        }
        if (z2) {
            zzir zzirVar = this.zza;
            zzirVar.zzd += zzd2;
            zzirVar.zzf += this.zzu;
        } else {
            this.zza.zzj++;
            zzaK(zzd2, this.zzu);
        }
        zzaE();
        if (this.zzE == null) {
            return true;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zziq, com.google.android.gms.internal.ads.zzmf
    public final void zzs() {
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zziq
    protected final void zzw() {
        this.zzz = null;
        this.zzi.zzd();
        int i = zzfy.zza;
        this.zzp = false;
        try {
            super.zzw();
        } finally {
            this.zzg.zzc(this.zza);
            this.zzg.zzt(zzdp.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zziq
    protected final void zzx(boolean z, boolean z2) throws zziz {
        super.zzx(z, z2);
        zzm();
        this.zzg.zze(this.zza);
        this.zzi.zze(z2);
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final void zzy() {
        zzaao zzaaoVar = this.zzi;
        zzel zzh = zzh();
        zzaaoVar.zzk(zzh);
        this.zzf.zzf(zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zziq
    protected final void zzz(long j, boolean z) throws zziz {
        if (this.zzE != null) {
            throw null;
        }
        super.zzz(j, z);
        if (this.zzf.zzk()) {
            this.zzf.zzh(zzas());
        }
        this.zzi.zzi();
        if (z) {
            this.zzi.zzc();
        }
        int i = zzfy.zza;
        this.zzt = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final boolean zzap(long j, long j2, zzsr zzsrVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzam zzamVar) throws zziz {
        zzsrVar.getClass();
        long zzas = j3 - zzas();
        int zza = this.zzi.zza(j3, j, j2, zzat(), z2, this.zzj);
        if (z && !z2) {
            zzam(zzsrVar, i, zzas);
            return true;
        }
        if (this.zzn == this.zzo) {
            if (this.zzj.zzc() < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                zzam(zzsrVar, i, zzas);
                zzaL(this.zzj.zzc());
                return true;
            }
        } else {
            if (this.zzE != null) {
                try {
                    throw null;
                } catch (zzabn e) {
                    throw zzi(e, e.zza, false, 7001);
                }
            }
            if (zza == 0) {
                zzh();
                long nanoTime = System.nanoTime();
                int i4 = zzfy.zza;
                zzag(zzsrVar, i, zzas, nanoTime);
                zzaL(this.zzj.zzc());
                return true;
            }
            if (zza == 1) {
                zzaam zzaamVar = this.zzj;
                long zzd2 = zzaamVar.zzd();
                long zzc2 = zzaamVar.zzc();
                int i5 = zzfy.zza;
                if (zzd2 == this.zzx) {
                    zzam(zzsrVar, i, zzas);
                } else {
                    zzag(zzsrVar, i, zzas, zzd2);
                }
                zzaL(zzc2);
                this.zzx = zzd2;
                return true;
            }
            if (zza == 2) {
                int i6 = zzfy.zza;
                Trace.beginSection("dropVideoBuffer");
                zzsrVar.zzn(i, false);
                Trace.endSection();
                zzaK(0, 1);
                zzaL(this.zzj.zzc());
                return true;
            }
            if (zza == 3) {
                zzam(zzsrVar, i, zzas);
                zzaL(this.zzj.zzc());
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12, types: [android.view.Surface] */
    @Override // com.google.android.gms.internal.ads.zziq, com.google.android.gms.internal.ads.zzma
    public final void zzt(int i, Object obj) throws zziz {
        Surface surface;
        if (i != 1) {
            if (i == 7) {
                obj.getClass();
                zzaal zzaalVar = (zzaal) obj;
                this.zzD = zzaalVar;
                this.zzf.zzj(zzaalVar);
                return;
            }
            if (i == 10) {
                obj.getClass();
                int intValue = ((Integer) obj).intValue();
                if (this.zzC != intValue) {
                    this.zzC = intValue;
                    return;
                }
                return;
            }
            if (i == 4) {
                obj.getClass();
                int intValue2 = ((Integer) obj).intValue();
                this.zzq = intValue2;
                zzsr zzau = zzau();
                if (zzau != null) {
                    zzau.zzq(intValue2);
                    return;
                }
                return;
            }
            if (i == 5) {
                zzaao zzaaoVar = this.zzi;
                obj.getClass();
                zzaaoVar.zzj(((Integer) obj).intValue());
                return;
            } else if (i == 13) {
                obj.getClass();
                this.zzf.zzi((List) obj);
                this.zzA = true;
                return;
            } else {
                if (i != 14) {
                    return;
                }
                obj.getClass();
                zzfq zzfqVar = (zzfq) obj;
                if (zzfqVar.zzb() == 0 || zzfqVar.zza() == 0 || (surface = this.zzn) == null) {
                    return;
                }
                this.zzf.zzg(surface, zzfqVar);
                return;
            }
        }
        zzaak zzaakVar = obj instanceof Surface ? (Surface) obj : null;
        if (zzaakVar == null) {
            zzaak zzaakVar2 = this.zzo;
            if (zzaakVar2 != null) {
                zzaakVar = zzaakVar2;
            } else {
                zzsv zzaw = zzaw();
                if (zzaw != null && zzaQ(zzaw)) {
                    zzaakVar = zzaak.zza(this.zze, zzaw.zzf);
                    this.zzo = zzaakVar;
                }
            }
        }
        if (this.zzn == zzaakVar) {
            if (zzaakVar == null || zzaakVar == this.zzo) {
                return;
            }
            zzaO();
            Surface surface2 = this.zzn;
            if (surface2 == null || !this.zzp) {
                return;
            }
            this.zzg.zzq(surface2);
            return;
        }
        this.zzn = zzaakVar;
        this.zzi.zzm(zzaakVar);
        this.zzp = false;
        int zzbf = zzbf();
        zzsr zzau2 = zzau();
        zzaak zzaakVar3 = zzaakVar;
        if (zzau2 != null) {
            zzaakVar3 = zzaakVar;
            if (!this.zzf.zzk()) {
                zzaak zzaakVar4 = zzaakVar;
                if (zzfy.zza >= 23) {
                    if (zzaakVar != null) {
                        zzaakVar4 = zzaakVar;
                        if (!this.zzl) {
                            zzau2.zzo(zzaakVar);
                            zzaakVar3 = zzaakVar;
                        }
                    } else {
                        zzaakVar4 = null;
                    }
                }
                zzaB();
                zzax();
                zzaakVar3 = zzaakVar4;
            }
        }
        if (zzaakVar3 == null || zzaakVar3 == this.zzo) {
            this.zzz = null;
            if (this.zzf.zzk()) {
                this.zzf.zzc();
            }
        } else {
            zzaO();
            if (zzbf == 2) {
                this.zzi.zzc();
            }
            if (this.zzf.zzk()) {
                this.zzf.zzg(zzaakVar3, zzfq.zza);
            }
        }
        int i2 = zzfy.zza;
    }
}
