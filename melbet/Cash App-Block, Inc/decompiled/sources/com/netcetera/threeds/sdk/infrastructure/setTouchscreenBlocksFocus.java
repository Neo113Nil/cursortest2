package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver;
import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint;
import java.lang.reflect.Method;
import java.util.Map;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

/* loaded from: classes5.dex */
public class setTouchscreenBlocksFocus implements setScrollCaptureHint {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final setOnCapturedPointerListener ThreeDS2Service;
    private static long ThreeDS2ServiceInstance;
    private static int cleanup;
    private static int getSDKVersion;
    private static char[] getWarnings;
    private final setTooltipText get;
    private final no initialize = (no) nu.initialize(new Object[]{setTouchscreenBlocksFocus.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKVersion = 0;
        cleanup = 1;
        getWarnings();
        ThreeDS2Service = new setLayoutAnimation();
        int i = cleanup + 31;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public setTouchscreenBlocksFocus(setTooltipText settooltiptext) {
        this.get = settooltiptext;
    }

    public static setScrollCaptureHint ThreeDS2ServiceInstance(setJustificationMode setjustificationmode) {
        setTouchscreenBlocksFocus settouchscreenblocksfocus = new setTouchscreenBlocksFocus(new setDescendantFocusability(setjustificationmode, new setLayoutTransition(ThreeDS2Service)));
        int i = cleanup + 55;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            int i2 = 98 / 0;
        }
        return settouchscreenblocksfocus;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) {
        Throwable cause;
        int i3;
        ThreeDS2ServiceInitializationCallback threeDS2ServiceInitializationCallback = new ThreeDS2ServiceInitializationCallback();
        long[] jArr = new long[i];
        threeDS2ServiceInitializationCallback.initialize = 0;
        while (true) {
            int i4 = threeDS2ServiceInitializationCallback.initialize;
            if (i4 >= i) {
                break;
            }
            $11 = ($10 + 49) % 128;
            try {
                Object[] objArr2 = {Integer.valueOf(getWarnings[i2 + i4])};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-54653524);
                Class cls = Integer.TYPE;
                if (obj != null) {
                    i3 = 2;
                } else {
                    i3 = 2;
                    Class cls2 = (Class) removeParam.initialize(Color.green(0) + 48, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 3221 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    Object[] objArr3 = new Object[1];
                    b((byte) 0, 0, (short) 0, objArr3);
                    obj = cls2.getMethod((String) objArr3[0], cls);
                    map.put(-54653524, obj);
                }
                Long l = (Long) ((Method) obj).invoke(null, objArr2);
                l.longValue();
                long j = threeDS2ServiceInitializationCallback.initialize;
                long j2 = ThreeDS2ServiceInstance;
                Object[] objArr4 = new Object[4];
                objArr4[3] = Integer.valueOf(c);
                objArr4[i3] = Long.valueOf(j2);
                objArr4[1] = Long.valueOf(j);
                objArr4[0] = l;
                Object obj2 = map.get(1319531906);
                if (obj2 == null) {
                    Class cls3 = (Class) removeParam.initialize(69 - (ViewConfiguration.getEdgeSlop() >> 16), (char) ((AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 50704), 7788 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    Class cls4 = Long.TYPE;
                    obj2 = cls3.getMethod("b", cls4, cls4, cls4, cls);
                    map.put(1319531906, obj2);
                }
                jArr[i4] = ((Long) ((Method) obj2).invoke(null, objArr4)).longValue();
                Object[] objArr5 = new Object[i3];
                objArr5[1] = threeDS2ServiceInitializationCallback;
                objArr5[0] = threeDS2ServiceInitializationCallback;
                Object obj3 = map.get(1724349229);
                if (obj3 == null) {
                    Class cls5 = (Class) removeParam.initialize(48 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 27781), 2441 - Drawable.resolveOpacity(0, 0));
                    Object[] objArr6 = new Object[1];
                    b((byte) 0, 0, (short) 1, objArr6);
                    obj3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                    map.put(1724349229, obj3);
                }
                ((Method) obj3).invoke(null, objArr5);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i];
        threeDS2ServiceInitializationCallback.initialize = 0;
        $11 = ($10 + 37) % 128;
        while (true) {
            int i5 = threeDS2ServiceInitializationCallback.initialize;
            if (i5 >= i) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i5] = (char) jArr[i5];
            Object[] objArr7 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj4 = map2.get(1724349229);
            if (obj4 == null) {
                Class cls6 = (Class) removeParam.initialize(48 - (ViewConfiguration.getTouchSlop() >> 8), (char) (27780 - Color.blue(0)), Gravity.getAbsoluteGravity(0, 0) + 2441);
                Object[] objArr8 = new Object[1];
                b((byte) 0, 0, (short) 1, objArr8);
                obj4 = cls6.getMethod((String) objArr8[0], Object.class, Object.class);
                map2.put(1724349229, obj4);
            }
            ((Method) obj4).invoke(null, objArr7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, short s, Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = i * 3;
        int i4 = 4 - (b * 3);
        int i5 = 100 - (s * 3);
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            int i7 = i5;
            int i8 = 0;
            i5 = i6;
            i5 += i7;
            i4++;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = bArr[i4];
            i5 += i7;
            i4++;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    private void getWarnings(Runnable runnable, Throwable th) {
        int i = getSDKVersion + 117;
        cleanup = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (runnable != null) {
            try {
                runnable.run();
                cleanup = (getSDKVersion + 105) % 128;
            } catch (setScrollCaptureCallback e) {
                getWarnings(new Object[]{this, th}, 1212395935, -1212395935, System.identityHashCode(this));
                String ThreeDS2ServiceInstance2 = ThreeDS2Service.ThreeDS2ServiceInstance(e);
                no noVar = this.initialize;
                Object[] objArr = new Object[1];
                a(26 - TextUtils.getTrimmedLength(""), (-1) - TextUtils.lastIndexOf("", '0', 0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), objArr);
                noVar.ThreeDS2Service(((String) objArr[0]).intern(), ThreeDS2ServiceInstance2, e.getCause());
                Object[] objArr2 = new Object[1];
                a(TextUtils.indexOf((CharSequence) "", '0') + 23, 26 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr2);
                OptionalProvider$$ExternalSyntheticLambda0.m(((String) objArr2[0]).intern(), e.getCause());
            } catch (RuntimeException e2) {
                getWarnings(new Object[]{this, th}, 1212395935, -1212395935, System.identityHashCode(this));
                no noVar2 = this.initialize;
                Object[] objArr3 = new Object[1];
                a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21, 27 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (MotionEvent.axisFromString("") + 1), objArr3);
                noVar2.ThreeDS2Service(((String) objArr3[0]).intern(), e2);
                throw e2;
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{13, -78, -10, 100};
        $$b = 31;
    }

    public static setScrollCaptureHint initialize() {
        setTouchscreenBlocksFocus settouchscreenblocksfocus = new setTouchscreenBlocksFocus(new setClipToPadding(ThreeDS2Service));
        getSDKVersion = (cleanup + 5) % 128;
        return settouchscreenblocksfocus;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint
    public void ThreeDS2Service(setScrollCaptureHint.ThreeDS2Service threeDS2Service, Runnable runnable) {
        int i = cleanup + 77;
        getSDKVersion = i % 128;
        try {
            try {
                if (i % 2 != 0) {
                    threeDS2Service.getWarnings();
                    throw null;
                }
                threeDS2Service.getWarnings();
                getSDKVersion = (cleanup + 27) % 128;
            } catch (setScrollCaptureCallback e) {
                getWarnings(runnable, e);
                this.get.get(e);
            }
        } catch (Throwable th) {
            getWarnings(runnable, th);
            this.get.get(th);
        }
    }

    public <T> T get(setScrollCaptureHint.ThreeDS2ServiceInstance<T> threeDS2ServiceInstance, Runnable runnable) {
        getSDKVersion = (cleanup + 81) % 128;
        try {
            T initialize = threeDS2ServiceInstance.initialize();
            cleanup = (getSDKVersion + 45) % 128;
            return initialize;
        } catch (setScrollCaptureCallback e) {
            this.getWarnings(runnable, e);
            this.get.get(e);
            return null;
        } catch (Throwable th) {
            this.getWarnings(runnable, th);
            this.get.get(th);
            return null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint
    public <T> T ThreeDS2ServiceInstance(setScrollCaptureHint.ThreeDS2ServiceInstance<T> threeDS2ServiceInstance) {
        cleanup = (getSDKVersion + 91) % 128;
        T t = (T) get(threeDS2ServiceInstance, null);
        int i = getSDKVersion + 19;
        cleanup = i % 128;
        if (i % 2 == 0) {
            int i2 = 89 / 0;
        }
        return t;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint
    public void get(setScrollCaptureHint.ThreeDS2Service threeDS2Service) {
        getSDKVersion = (cleanup + 97) % 128;
        ThreeDS2Service(threeDS2Service, null);
        getSDKVersion = (cleanup + 21) % 128;
    }

    public static setScrollCaptureHint get(ChallengeStatusReceiver challengeStatusReceiver) {
        setTouchscreenBlocksFocus settouchscreenblocksfocus = new setTouchscreenBlocksFocus(new setIsCredential(challengeStatusReceiver, new setLayoutTransition(ThreeDS2Service)));
        int i = getSDKVersion + 109;
        cleanup = i % 128;
        if (i % 2 != 0) {
            return settouchscreenblocksfocus;
        }
        throw null;
    }

    public static /* synthetic */ Object getWarnings(Object[] objArr, int i, int i2, int i3) {
        setTouchscreenBlocksFocus settouchscreenblocksfocus = (setTouchscreenBlocksFocus) objArr[0];
        Throwable th = (Throwable) objArr[1];
        getSDKVersion = (cleanup + 9) % 128;
        if (th instanceof setScrollCaptureCallback) {
            String ThreeDS2ServiceInstance2 = ThreeDS2Service.ThreeDS2ServiceInstance((setScrollCaptureCallback) th);
            no noVar = settouchscreenblocksfocus.initialize;
            Object[] objArr2 = new Object[1];
            a(((byte) KeyEvent.getModifierMetaStateMask()) + 19, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 47, (char) (63732 - KeyEvent.keyCodeFromString("")), objArr2);
            noVar.ThreeDS2ServiceInstance(((String) objArr2[0]).intern(), ThreeDS2ServiceInstance2, th.getCause());
            cleanup = (getSDKVersion + 79) % 128;
            return null;
        }
        no noVar2 = settouchscreenblocksfocus.initialize;
        Object[] objArr3 = new Object[1];
        a(Color.argb(0, 0, 0, 0) + 14, 66 - Drawable.resolveOpacity(0, 0), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr3);
        noVar2.ThreeDS2ServiceInstance(((String) objArr3[0]).intern(), th);
        getSDKVersion = (cleanup + 33) % 128;
        return null;
    }

    public static void getWarnings() {
        getWarnings = new char[]{35181, 24834, 23029, 12732, 10264, 249, 63651, 54016, 52221, 41896, 39504, 29378, 27305, 17672, 15809, 5560, 3160, 58569, 56482, 46966, 44999, 34734, 32300, 22164, 20131, 14705, 35181, 24834, 23029, 12732, 10264, 249, 63651, 54016, 52221, 41896, 39504, 29378, 27305, 17672, 15809, 5560, 3160, 58569, 56482, 46966, 44999, 34734, 29059, 39402, 41229, 51543, 53493, 63494, Matrix.MATRIX_TYPE_RANDOM_UT, 11244, 13132, 23387, 25317, 35365, 37455, 48621, 50552, 60672, 62711, 7205, 35191, 24862, 23033, 12707, 10241, 242, 63649, 54040, 52152, 41903, 39441, 29393, 27323, 17689};
        ThreeDS2ServiceInstance = 4777119631047090540L;
    }
}
