package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Looper;
import android.util.Range;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.pulse.metrics.o;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.annotation.Annotation;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.video.m3.ab.validation.AbValidationType;
import ru.yandex.video.m3.playback.features.AudioCodecInfo;
import ru.yandex.video.m3.playback.features.VideoCodecInfo;

/* loaded from: classes6.dex */
public final class e1 extends uif implements Function0 {
    public static final e1 A;
    public static final e1 A0;
    public static final e1 B;
    public static final e1 B0;
    public static final e1 C;
    public static final e1 D;
    public static final e1 E;
    public static final e1 F;
    public static final e1 G;
    public static final e1 H;
    public static final e1 I;
    public static final e1 J;
    public static final e1 K;
    public static final e1 L;
    public static final e1 X;
    public static final e1 Y;
    public static final e1 Z;
    public static final e1 s;
    public static final e1 t;
    public static final e1 u;
    public static final e1 v;
    public static final e1 v0;
    public static final e1 w;
    public static final e1 w0;
    public static final e1 x;
    public static final e1 x0;
    public static final e1 y;
    public static final e1 y0;
    public static final e1 z;
    public static final e1 z0;
    public final /* synthetic */ int r;

    static {
        int i = 0;
        s = new e1(i, 0);
        t = new e1(i, 1);
        u = new e1(i, 2);
        v = new e1(i, 3);
        w = new e1(i, 4);
        x = new e1(i, 5);
        y = new e1(i, 6);
        z = new e1(i, 7);
        A = new e1(i, 8);
        B = new e1(i, 9);
        C = new e1(i, 10);
        D = new e1(i, 11);
        E = new e1(i, 12);
        F = new e1(i, 13);
        G = new e1(i, 14);
        H = new e1(i, 15);
        I = new e1(i, 16);
        J = new e1(i, 17);
        K = new e1(i, 18);
        L = new e1(i, 19);
        X = new e1(i, 20);
        Y = new e1(i, 21);
        Z = new e1(i, 22);
        v0 = new e1(i, 23);
        w0 = new e1(i, 24);
        x0 = new e1(i, 25);
        y0 = new e1(i, 26);
        z0 = new e1(i, 27);
        A0 = new e1(i, 28);
        B0 = new e1(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(int i, int i2) {
        super(i);
        this.r = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Choreographer choreographer;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Integer upper;
        int i = 2;
        int i2 = 1;
        switch (this.r) {
            case 0:
                return Long.valueOf(System.currentTimeMillis());
            case 1:
                return new tyo("ru.yandex.video.m3.ab.validation.AbValidationResult", ern.a(m2.class), new f9f[]{ern.a(z1.class), ern.a(c2.class), ern.a(f2.class), ern.a(i2.class), ern.a(l2.class)}, new t9f[]{x1.a, a2.a, d2.a, g2.a, j2.a}, new Annotation[0]);
            case 2:
                return up6.q("AbValidationType", AbValidationType.values(), new String[]{"Experiment", "FeatureToggle"}, new Annotation[][]{null, null});
            case 3:
                phn.a.getClass();
                return Integer.valueOf(phn.b.d(2147418112) + SQLiteDatabase.OPEN_FULLMUTEX);
            case 4:
                return UUID.randomUUID().toString();
            case 5:
                AndroidCompositionLocals_androidKt.b("LocalConfiguration");
                throw null;
            case 6:
                AndroidCompositionLocals_androidKt.b("LocalContext");
                throw null;
            case 7:
                AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
                throw null;
            case 8:
                AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
                throw null;
            case 9:
                AndroidCompositionLocals_androidKt.b("LocalSavedStateRegistryOwner");
                throw null;
            case 10:
                AndroidCompositionLocals_androidKt.b("LocalView");
                throw null;
            case 11:
                return UUID.randomUUID();
            case 12:
                return "DEFAULT_TEST_TAG";
            case 13:
                return UUID.randomUUID();
            case 14:
                Continuation continuation = null;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    dq7 dq7Var = ca8.a;
                    choreographer = (Choreographer) x97.D(j5h.a, new db(i, i2, continuation));
                }
                bj0 bj0Var = new bj0(choreographer, ild.t(Looper.getMainLooper()));
                return bj0Var.plus(bj0Var.m);
            case 15:
                return Unit.a;
            case 16:
                return Unit.a;
            case 17:
                return Unit.a;
            case 18:
                return new d85(c3x.f(1308617531));
            case 19:
                return null;
            case 20:
                return Unit.a;
            case 21:
                return Unit.a;
            case 22:
                NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
                numberFormat.setMinimumFractionDigits(2);
                numberFormat.setMaximumFractionDigits(2);
                numberFormat.setGroupingUsed(false);
                return numberFormat;
            case 23:
                return "  group [";
            case 24:
                return "  ]";
            case 25:
                return "]";
            case 26:
                jyr jyrVar = jr4.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ArrayList<MediaCodecInfo> a = jr4.a();
                if (a != null) {
                    for (MediaCodecInfo mediaCodecInfo : a) {
                        String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                        supportedTypes.getClass();
                        for (String str : supportedTypes) {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                            if (capabilitiesForType != null && capabilitiesForType.getAudioCapabilities() != null) {
                                List list = (List) linkedHashMap.get(str);
                                if (list == null) {
                                    list = new ArrayList();
                                }
                                String name = mediaCodecInfo.getName();
                                jyr jyrVar2 = jr4.a;
                                boolean isFeatureSupported = capabilitiesForType.isFeatureSupported("secure-playback");
                                boolean isFeatureSupported2 = capabilitiesForType.isFeatureSupported("tunneled-playback");
                                boolean b = jr4.b(mediaCodecInfo);
                                int maxSupportedInstances = capabilitiesForType.getMaxSupportedInstances();
                                name.getClass();
                                list.add(new AudioCodecInfo(name, isFeatureSupported, isFeatureSupported2, b, maxSupportedInstances, null));
                                str.getClass();
                                linkedHashMap.put(str, list);
                            }
                        }
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    return null;
                }
                return linkedHashMap;
            case 27:
                jyr jyrVar3 = jr4.a;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                ArrayList<MediaCodecInfo> a2 = jr4.a();
                if (a2 != null) {
                    for (MediaCodecInfo mediaCodecInfo2 : a2) {
                        String[] supportedTypes2 = mediaCodecInfo2.getSupportedTypes();
                        supportedTypes2.getClass();
                        for (String str2 : supportedTypes2) {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType2 = mediaCodecInfo2.getCapabilitiesForType(str2);
                            if (capabilitiesForType2 != null && (videoCapabilities = capabilitiesForType2.getVideoCapabilities()) != null) {
                                List list2 = (List) linkedHashMap2.get(str2);
                                if (list2 == null) {
                                    list2 = new ArrayList();
                                }
                                String name2 = mediaCodecInfo2.getName();
                                jyr jyrVar4 = jr4.a;
                                Integer upper2 = videoCapabilities.getSupportedWidths().getUpper();
                                upper2.getClass();
                                int intValue = upper2.intValue();
                                Integer upper3 = videoCapabilities.getSupportedWidths().getUpper();
                                upper3.getClass();
                                Range<Integer> supportedHeightsFor = videoCapabilities.getSupportedHeightsFor(upper3.intValue());
                                if (supportedHeightsFor == null || (upper = supportedHeightsFor.getUpper()) == null) {
                                    upper = videoCapabilities.getSupportedHeights().getUpper();
                                }
                                upper.getClass();
                                Point point = new Point(intValue, upper.intValue());
                                boolean isFeatureSupported3 = capabilitiesForType2.isFeatureSupported("secure-playback");
                                boolean isFeatureSupported4 = capabilitiesForType2.isFeatureSupported("tunneled-playback");
                                boolean b2 = jr4.b(mediaCodecInfo2);
                                int maxSupportedInstances2 = capabilitiesForType2.getMaxSupportedInstances();
                                name2.getClass();
                                list2.add(new VideoCodecInfo(name2, point, isFeatureSupported3, isFeatureSupported4, b2, maxSupportedInstances2, null));
                                str2.getClass();
                                linkedHashMap2.put(str2, list2);
                            }
                        }
                    }
                }
                if (linkedHashMap2.isEmpty()) {
                    return null;
                }
                return linkedHashMap2;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return j95.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15);
            default:
                return Boolean.TRUE;
        }
    }
}
