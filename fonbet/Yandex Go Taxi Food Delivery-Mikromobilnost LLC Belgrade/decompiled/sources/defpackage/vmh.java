package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.trackselection.a;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public class vmh extends yv00 implements hyi0 {
    private static final String AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE = "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.";
    private static final z FORMAT_VALUE_ORDERING = z.b(new y60(8));
    private static final float FRACTION_TO_CONSIDER_FULLSCREEN = 0.98f;
    protected static final int SELECTION_ELIGIBILITY_ADAPTIVE = 2;
    protected static final int SELECTION_ELIGIBILITY_FIXED = 1;
    protected static final int SELECTION_ELIGIBILITY_NO = 0;
    private static final String TAG = "DefaultTrackSelector";
    private ue3 audioAttributes;
    public final Context context;
    private final Object lock;
    private omh parameters;
    private a spatializer;
    private final koo trackSelectionFactory;

    public vmh(r001 r001Var, koo kooVar, Context context) {
        this.lock = new Object();
        this.context = context != null ? context.getApplicationContext() : null;
        this.trackSelectionFactory = kooVar;
        if (r001Var instanceof omh) {
            this.parameters = (omh) r001Var;
        } else {
            omh omhVar = omh.F;
            omhVar.getClass();
            nmh nmhVar = new nmh(omhVar);
            nmhVar.c(r001Var);
            this.parameters = new omh(nmhVar);
        }
        this.audioAttributes = ue3.c;
        if (this.parameters.A && context == null) {
            lk91.j(AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r7.b != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(vmh vmhVar, omh omhVar, androidx.media3.common.a aVar) {
        a aVar2;
        boolean isAvailable;
        boolean isEnabled;
        boolean canBeSpatialized;
        char c;
        if (omhVar.A) {
            int i = aVar.D;
            String str = aVar.n;
            if (i != -1 && i > 2) {
                if (str != null) {
                    switch (str.hashCode()) {
                        case -2123537834:
                            if (str.equals("audio/eac3-joc")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 187078296:
                            if (str.equals("audio/ac3")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 187078297:
                            if (str.equals("audio/ac4")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1504578661:
                            if (str.equals("audio/eac3")) {
                                c = 3;
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
                            if (tw21.a >= 32) {
                                a aVar3 = vmhVar.spatializer;
                                if (aVar3 != null) {
                                    break;
                                }
                            }
                            break;
                        default:
                            if (tw21.a >= 32 && (aVar2 = vmhVar.spatializer) != null && aVar2.b) {
                                Spatializer spatializer = aVar2.a;
                                spatializer.getClass();
                                isAvailable = re3.c(spatializer).isAvailable();
                                if (isAvailable) {
                                    Spatializer spatializer2 = vmhVar.spatializer.a;
                                    spatializer2.getClass();
                                    isEnabled = re3.c(spatializer2).isEnabled();
                                    if (isEnabled) {
                                        a aVar4 = vmhVar.spatializer;
                                        ue3 ue3Var = vmhVar.audioAttributes;
                                        aVar4.getClass();
                                        int i2 = aVar.D;
                                        if (Objects.equals(str, "audio/eac3-joc")) {
                                            if (i2 == 16) {
                                                i2 = 12;
                                            }
                                        } else if (Objects.equals(str, "audio/iamf")) {
                                            if (i2 == -1) {
                                                i2 = 6;
                                            }
                                        } else if (Objects.equals(str, "audio/ac4") && (i2 == 18 || i2 == 21)) {
                                            i2 = 24;
                                        }
                                        int s = tw21.s(i2);
                                        if (s == 0) {
                                            canBeSpatialized = false;
                                        } else {
                                            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(s);
                                            int i3 = aVar.E;
                                            if (i3 != -1) {
                                                channelMask.setSampleRate(i3);
                                            }
                                            Spatializer spatializer3 = aVar4.a;
                                            spatializer3.getClass();
                                            canBeSpatialized = re3.c(spatializer3).canBeSpatialized(ue3Var.a().a, channelMask.build());
                                        }
                                        if (canBeSpatialized) {
                                        }
                                    }
                                }
                            }
                            return false;
                    }
                }
                if (tw21.a >= 32) {
                    Spatializer spatializer4 = aVar2.a;
                    spatializer4.getClass();
                    isAvailable = re3.c(spatializer4).isAvailable();
                    if (isAvailable) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int access$4100(xzz0 xzz0Var, int i, int i2, boolean z) {
        int i3;
        int i4;
        Point point;
        int i5;
        int i6;
        int i7 = Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
            for (int i8 = 0; i8 < xzz0Var.a; i8++) {
                androidx.media3.common.a aVar = xzz0Var.d[i8];
                int i9 = aVar.u;
                int i10 = aVar.v;
                if (i9 > 0 && i10 > 0) {
                    if (z) {
                        if ((i9 > i10) != (i > i2)) {
                            i4 = i;
                            i3 = i2;
                            int i11 = i9 * i4;
                            int i12 = i10 * i3;
                            point = i11 < i12 ? new Point(i3, tw21.f(i12, i9)) : new Point(tw21.f(i11, i10), i4);
                            i5 = aVar.u;
                            i6 = i5 * i10;
                            if (i5 >= ((int) (point.x * FRACTION_TO_CONSIDER_FULLSCREEN)) && i10 >= ((int) (point.y * FRACTION_TO_CONSIDER_FULLSCREEN)) && i6 < i7) {
                                i7 = i6;
                            }
                        }
                    }
                    i3 = i;
                    i4 = i2;
                    int i112 = i9 * i4;
                    int i122 = i10 * i3;
                    if (i112 < i122) {
                    }
                    i5 = aVar.u;
                    i6 = i5 * i10;
                    if (i5 >= ((int) (point.x * FRACTION_TO_CONSIDER_FULLSCREEN))) {
                        i7 = i6;
                    }
                }
            }
        }
        return i7;
    }

    public static int access$4200(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    public static int access$4300(String str) {
        if (str != null) {
            switch (str) {
                case "video/dolby-vision":
                    return 5;
                case "video/av01":
                    return 4;
                case "video/hevc":
                    return 3;
                case "video/avc":
                    return 1;
                case "video/x-vnd.on2.vp9":
                    return 2;
            }
        }
        return 0;
    }

    public static boolean access$4500(androidx.media3.common.a aVar) {
        String str = aVar.n;
        if (str != null) {
            switch (str) {
                case "audio/eac3-joc":
                case "audio/ac4":
                case "audio/iamf":
                    return true;
            }
        }
        return false;
    }

    public static boolean access$4600(omh omhVar, int i, androidx.media3.common.a aVar) {
        if ((i & HProv.ALG_TYPE_GR3410) == 0) {
            return false;
        }
        omhVar.o.getClass();
        omhVar.o.getClass();
        return true;
    }

    public static void b(yzz0 yzz0Var, r001 r001Var, HashMap hashMap) {
        for (int i = 0; i < yzz0Var.a; i++) {
            n001 n001Var = (n001) r001Var.t.get(yzz0Var.a(i));
            if (n001Var != null) {
                xzz0 xzz0Var = n001Var.a;
                n001 n001Var2 = (n001) hashMap.get(Integer.valueOf(xzz0Var.c));
                if (n001Var2 == null || (n001Var2.b.isEmpty() && !n001Var.b.isEmpty())) {
                    hashMap.put(Integer.valueOf(xzz0Var.c), n001Var);
                }
            }
        }
    }

    public static Pair d(int i, xv00 xv00Var, int[][][] iArr, smh smhVar, Comparator comparator) {
        int i2;
        RandomAccess randomAccess;
        xv00 xv00Var2 = xv00Var;
        ArrayList arrayList = new ArrayList();
        int i3 = xv00Var2.a;
        int i4 = 0;
        while (i4 < i3) {
            if (i == xv00Var2.b[i4]) {
                yzz0 yzz0Var = xv00Var2.c[i4];
                for (int i5 = 0; i5 < yzz0Var.a; i5++) {
                    xzz0 a = yzz0Var.a(i5);
                    List d = smhVar.d(i4, a, iArr[i4][i5]);
                    int i6 = a.a;
                    boolean[] zArr = new boolean[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        tmh tmhVar = (tmh) d.get(i7);
                        int a2 = tmhVar.a();
                        if (zArr[i7] || a2 == 0) {
                            i2 = i3;
                        } else {
                            if (a2 == 1) {
                                randomAccess = ImmutableList.r(tmhVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(tmhVar);
                                int i8 = i7 + 1;
                                while (i8 < i6) {
                                    tmh tmhVar2 = (tmh) d.get(i8);
                                    int i9 = i3;
                                    if (tmhVar2.a() == 2 && tmhVar.b(tmhVar2)) {
                                        arrayList2.add(tmhVar2);
                                        zArr[i8] = true;
                                    }
                                    i8++;
                                    i3 = i9;
                                }
                                randomAccess = arrayList2;
                            }
                            i2 = i3;
                            arrayList.add(randomAccess);
                        }
                        i7++;
                        i3 = i2;
                    }
                }
            }
            i4++;
            xv00Var2 = xv00Var;
            i3 = i3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((tmh) list.get(i10)).c;
        }
        tmh tmhVar3 = (tmh) list.get(0);
        return Pair.create(new joo(0, tmhVar3.b, iArr2), Integer.valueOf(tmhVar3.a));
    }

    public static int getFormatLanguageScore(androidx.media3.common.a aVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(aVar.d)) {
            return 4;
        }
        String normalizeUndeterminedLanguageToNull = normalizeUndeterminedLanguageToNull(str);
        String normalizeUndeterminedLanguageToNull2 = normalizeUndeterminedLanguageToNull(aVar.d);
        if (normalizeUndeterminedLanguageToNull2 == null || normalizeUndeterminedLanguageToNull == null) {
            return (z && normalizeUndeterminedLanguageToNull2 == null) ? 1 : 0;
        }
        if (normalizeUndeterminedLanguageToNull2.startsWith(normalizeUndeterminedLanguageToNull) || normalizeUndeterminedLanguageToNull.startsWith(normalizeUndeterminedLanguageToNull2)) {
            return 3;
        }
        int i = tw21.a;
        return normalizeUndeterminedLanguageToNull2.split("-", 2)[0].equals(normalizeUndeterminedLanguageToNull.split("-", 2)[0]) ? 2 : 0;
    }

    @Deprecated
    public static boolean isSupported(int i, boolean z) {
        return iyi0.e(i, z);
    }

    public static String normalizeUndeterminedLanguageToNull(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public nmh buildUponParameters() {
        omh parameters = getParameters();
        parameters.getClass();
        return new nmh(parameters);
    }

    public final void c() {
        boolean z;
        a aVar;
        synchronized (this.lock) {
            try {
                z = this.parameters.A && tw21.a >= 32 && (aVar = this.spatializer) != null && aVar.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            invalidate();
        }
    }

    public final void e(omh omhVar) {
        boolean equals;
        omhVar.getClass();
        synchronized (this.lock) {
            equals = this.parameters.equals(omhVar);
            this.parameters = omhVar;
        }
        if (equals) {
            return;
        }
        if (omhVar.A && this.context == null) {
            lk91.j(AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE);
        }
        invalidate();
    }

    @Override // defpackage.x001
    public omh getParameters() {
        omh omhVar;
        synchronized (this.lock) {
            omhVar = this.parameters;
        }
        return omhVar;
    }

    @Override // defpackage.x001
    public hyi0 getRendererCapabilitiesListener() {
        return this;
    }

    @Override // defpackage.x001
    public boolean isSetParametersSupported() {
        return true;
    }

    @Override // defpackage.hyi0
    public void onRendererCapabilitiesChanged(fyi0 fyi0Var) {
        synchronized (this.lock) {
            this.parameters.getClass();
        }
    }

    @Override // defpackage.x001
    public void release() {
        a aVar;
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
        if (tw21.a >= 32 && (aVar = this.spatializer) != null) {
            Handler handler = aVar.c;
            Spatializer spatializer = aVar.a;
            if (spatializer != null && (spatializer$OnSpatializerStateChangedListener = aVar.d) != null && handler != null) {
                spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
                handler.removeCallbacksAndMessages(null);
            }
        }
        super.release();
    }

    public joo[] selectAllTracks(xv00 xv00Var, int[][][] iArr, int[] iArr2, omh omhVar) throws ExoPlaybackException {
        String str;
        int i = xv00Var.a;
        joo[] jooVarArr = new joo[i];
        Pair<joo, Integer> selectAudioTrack = selectAudioTrack(xv00Var, iArr, iArr2, omhVar);
        if (selectAudioTrack != null) {
            jooVarArr[((Integer) selectAudioTrack.second).intValue()] = (joo) selectAudioTrack.first;
        }
        if (selectAudioTrack == null) {
            str = null;
        } else {
            joo jooVar = (joo) selectAudioTrack.first;
            str = jooVar.a.d[jooVar.b[0]].d;
        }
        Pair<joo, Integer> selectVideoTrack = selectVideoTrack(xv00Var, iArr, iArr2, omhVar, str);
        String str2 = str;
        omhVar.getClass();
        Pair<joo, Integer> selectImageTrack = selectVideoTrack == null ? selectImageTrack(xv00Var, iArr, omhVar) : null;
        if (selectImageTrack != null) {
            jooVarArr[((Integer) selectImageTrack.second).intValue()] = (joo) selectImageTrack.first;
        } else if (selectVideoTrack != null) {
            jooVarArr[((Integer) selectVideoTrack.second).intValue()] = (joo) selectVideoTrack.first;
        }
        Pair selectTextTrack = selectTextTrack(xv00Var, iArr, omhVar, str2);
        if (selectTextTrack != null) {
            jooVarArr[((Integer) selectTextTrack.second).intValue()] = (joo) selectTextTrack.first;
        }
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = xv00Var.b[i2];
            if (i3 != 2 && i3 != 1 && i3 != 3 && i3 != 4) {
                jooVarArr[i2] = selectOtherTrack(i3, xv00Var.c[i2], iArr[i2], omhVar);
            }
        }
        return jooVarArr;
    }

    public Pair<joo, Integer> selectAudioTrack(xv00 xv00Var, int[][][] iArr, int[] iArr2, omh omhVar) throws ExoPlaybackException {
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < xv00Var.a) {
                if (2 == xv00Var.b[i] && xv00Var.c[i].a > 0) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return d(1, xv00Var, iArr, new imh(z, this, omhVar, iArr2), new y60(11));
    }

    public Pair<joo, Integer> selectImageTrack(xv00 xv00Var, int[][][] iArr, omh omhVar) throws ExoPlaybackException {
        omhVar.o.getClass();
        return d(4, xv00Var, iArr, new v8e(12, omhVar), new y60(9));
    }

    public joo selectOtherTrack(int i, yzz0 yzz0Var, int[][] iArr, omh omhVar) throws ExoPlaybackException {
        omhVar.o.getClass();
        xzz0 xzz0Var = null;
        mmh mmhVar = null;
        int i2 = 0;
        for (int i3 = 0; i3 < yzz0Var.a; i3++) {
            xzz0 a = yzz0Var.a(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < a.a; i4++) {
                if (iyi0.e(iArr2[i4], omhVar.B)) {
                    mmh mmhVar2 = new mmh(iArr2[i4], a.d[i4]);
                    if (mmhVar != null) {
                        if (jvc.a.c(mmhVar2.b, mmhVar.b).c(mmhVar2.a, mmhVar.a).e() <= 0) {
                        }
                    }
                    xzz0Var = a;
                    i2 = i4;
                    mmhVar = mmhVar2;
                }
            }
        }
        if (xzz0Var == null) {
            return null;
        }
        return new joo(0, xzz0Var, new int[]{i2});
    }

    public Pair selectTextTrack(xv00 xv00Var, int[][][] iArr, omh omhVar, String str) {
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        omhVar.o.getClass();
        String str2 = null;
        if (omhVar.q && (context = this.context) != null && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled() && (locale = captioningManager.getLocale()) != null) {
            int i = tw21.a;
            str2 = locale.toLanguageTag();
        }
        return d(3, xv00Var, iArr, new t26(6, omhVar, str, str2), new y60(12));
    }

    @Override // defpackage.yv00
    public final Pair<lyi0[], loo[]> selectTracks(xv00 xv00Var, int[][][] iArr, int[] iArr2, sf10 sf10Var, a9z0 a9z0Var) throws ExoPlaybackException {
        omh omhVar;
        joo jooVar;
        synchronized (this.lock) {
            omhVar = this.parameters;
        }
        if (omhVar.A && tw21.a >= 32 && this.spatializer == null) {
            this.spatializer = new a(this.context, this);
        }
        int i = xv00Var.a;
        joo[] selectAllTracks = selectAllTracks(xv00Var, iArr, iArr2, omhVar);
        int i2 = xv00Var.a;
        yzz0[] yzz0VarArr = xv00Var.c;
        HashMap hashMap = new HashMap();
        for (int i3 = 0; i3 < i2; i3++) {
            b(yzz0VarArr[i3], omhVar, hashMap);
        }
        b(xv00Var.f, omhVar, hashMap);
        int i4 = 0;
        while (true) {
            joo jooVar2 = null;
            if (i4 >= i2) {
                break;
            }
            n001 n001Var = (n001) hashMap.get(Integer.valueOf(xv00Var.b[i4]));
            if (n001Var != null) {
                xzz0 xzz0Var = n001Var.a;
                ImmutableList immutableList = n001Var.b;
                if (!immutableList.isEmpty() && yzz0VarArr[i4].b(xzz0Var) != -1) {
                    jooVar2 = new joo(0, xzz0Var, com.google.common.primitives.a.e(immutableList));
                }
                selectAllTracks[i4] = jooVar2;
            }
            i4++;
        }
        int i5 = xv00Var.a;
        for (int i6 = 0; i6 < i5; i6++) {
            yzz0 yzz0Var = xv00Var.c[i6];
            Map map = (Map) omhVar.D.get(i6);
            if (map != null && map.containsKey(yzz0Var)) {
                Map map2 = (Map) omhVar.D.get(i6);
                qmh qmhVar = map2 != null ? (qmh) map2.get(yzz0Var) : null;
                if (qmhVar != null) {
                    int[] iArr3 = qmhVar.b;
                    if (iArr3.length != 0) {
                        jooVar = new joo(0, yzz0Var.a(qmhVar.a), iArr3);
                        selectAllTracks[i6] = jooVar;
                    }
                }
                jooVar = null;
                selectAllTracks[i6] = jooVar;
            }
        }
        for (int i7 = 0; i7 < i; i7++) {
            int i8 = xv00Var.b[i7];
            if (omhVar.E.get(i7) || omhVar.u.contains(Integer.valueOf(i8))) {
                selectAllTracks[i7] = null;
            }
        }
        loo[] createTrackSelections = this.trackSelectionFactory.createTrackSelections(selectAllTracks, getBandwidthMeter(), sf10Var, a9z0Var);
        lyi0[] lyi0VarArr = new lyi0[i];
        for (int i9 = 0; i9 < i; i9++) {
            lyi0VarArr[i9] = (omhVar.E.get(i9) || omhVar.u.contains(Integer.valueOf(xv00Var.b[i9])) || (xv00Var.b[i9] != -2 && createTrackSelections[i9] == null)) ? null : lyi0.c;
        }
        omhVar.o.getClass();
        return Pair.create(lyi0VarArr, createTrackSelections);
    }

    public Pair<joo, Integer> selectVideoTrack(xv00 xv00Var, int[][][] iArr, int[] iArr2, omh omhVar, String str) throws ExoPlaybackException {
        Context context;
        omhVar.o.getClass();
        return d(2, xv00Var, iArr, new f83(omhVar, str, iArr2, (!omhVar.g || (context = this.context) == null) ? null : tw21.z(context), 3), new y60(10));
    }

    @Override // defpackage.x001
    public void setAudioAttributes(ue3 ue3Var) {
        if (this.audioAttributes.equals(ue3Var)) {
            return;
        }
        this.audioAttributes = ue3Var;
        c();
    }

    @Override // defpackage.x001
    public void setParameters(r001 r001Var) {
        if (r001Var instanceof omh) {
            e((omh) r001Var);
        }
        nmh nmhVar = new nmh(getParameters());
        nmhVar.c(r001Var);
        e(new omh(nmhVar));
    }

    @Deprecated
    public void setParameters(pmh pmhVar) {
        nmh nmhVar = pmhVar.v;
        nmhVar.getClass();
        e(new omh(nmhVar));
    }

    public void setParameters(nmh nmhVar) {
        nmhVar.getClass();
        e(new omh(nmhVar));
    }

    public vmh(Context context) {
        this(omh.F, new q80(), context);
    }
}
