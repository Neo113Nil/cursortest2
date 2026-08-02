package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
class setOverflowIcon implements setSubtitle<setPopupTheme, nq> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2ServiceInstance;
    private static long get;
    private static int initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ThreeDS2ServiceInstance = 0;
        initialize = 1;
        get = 8650608702111638143L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r23 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0028, code lost:
    
        r2 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0023, code lost:
    
        r2 = r23.toCharArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0021, code lost:
    
        if (r23 != null) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0214  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(String str, int i, Object[] objArr) {
        char[] charArray;
        Throwable cause;
        short s;
        Object method;
        int i2 = $10 + 71;
        $11 = i2 % 128;
        int i3 = 2;
        short s2 = 0;
        if (i2 % 2 == 0) {
            int i4 = 60 / 0;
        }
        char[] cArr = charArray;
        addParam addparam = new addParam();
        addparam.initialize = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        addparam.ThreeDS2Service = 0;
        while (true) {
            int i5 = addparam.ThreeDS2Service;
            if (i5 >= cArr.length) {
                break;
            }
            int i6 = $10 + 7;
            $11 = i6 % 128;
            int i7 = i6 % i3;
            Class cls = Integer.TYPE;
            if (i7 == 0) {
                char c = cArr[i5];
                try {
                    Object[] objArr2 = new Object[3];
                    objArr2[i3] = addparam;
                    objArr2[1] = addparam;
                    objArr2[s2] = Integer.valueOf(c);
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-983980093);
                    if (obj != null) {
                        method = obj;
                        s = s2;
                    } else {
                        s = s2;
                        method = ((Class) removeParam.initialize(66 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 12511)).getMethod("e", cls, Object.class, Object.class);
                        map.put(-983980093, method);
                    }
                    jArr[i5] = (get % 6009743645011411028L) + ((Long) ((Method) method).invoke(null, objArr2)).longValue();
                    Object[] objArr3 = new Object[2];
                    objArr3[1] = addparam;
                    objArr3[s] = addparam;
                    Object obj2 = map.get(-1840119381);
                    if (obj2 == null) {
                        short s3 = s;
                        Class cls2 = (Class) removeParam.initialize(75 - MotionEvent.axisFromString(""), (char) (62097 - Drawable.resolveOpacity(s3, s3)), 2102 - Color.green((int) s3));
                        Object[] objArr4 = new Object[1];
                        b((short) -1, s3, s3, objArr4);
                        obj2 = cls2.getMethod((String) objArr4[s3], Object.class, Object.class);
                        map.put(-1840119381, obj2);
                    }
                    ((Method) obj2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } else {
                Object[] objArr5 = {Integer.valueOf(cArr[i5]), addparam, addparam};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj3 = map2.get(-983980093);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(66 - (KeyEvent.getMaxKeyCode() >> 16), (char) (ViewConfiguration.getScrollBarSize() >> 8), ExpandableListView.getPackedPositionChild(0L) + 12512)).getMethod("e", cls, Object.class, Object.class);
                    map2.put(-983980093, obj3);
                }
                jArr[i5] = ((Long) ((Method) obj3).invoke(null, objArr5)).longValue() ^ (get ^ 6009743645011411028L);
                Object[] objArr6 = {addparam, addparam};
                Object obj4 = map2.get(-1840119381);
                if (obj4 == null) {
                    Class cls3 = (Class) removeParam.initialize(((byte) KeyEvent.getModifierMetaStateMask()) + 77, (char) (62097 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 2102 - KeyEvent.keyCodeFromString(""));
                    Object[] objArr7 = new Object[1];
                    b((short) -1, (short) 0, (short) 0, objArr7);
                    obj4 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(-1840119381, obj4);
                }
                ((Method) obj4).invoke(null, objArr6);
            }
            i3 = 2;
            s2 = 0;
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        addparam.ThreeDS2Service = 0;
        while (true) {
            int i8 = addparam.ThreeDS2Service;
            if (i8 >= cArr.length) {
                objArr[0] = new String(cArr2);
                return;
            }
            cArr2[i8] = (char) jArr[i8];
            Object[] objArr8 = {addparam, addparam};
            Map map3 = removeParam.visaSchemeConfiguration;
            Object obj5 = map3.get(-1840119381);
            if (obj5 == null) {
                Class cls4 = (Class) removeParam.initialize((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 75, (char) (AndroidCharacter.getMirror('0') + 62049), TextUtils.getCapsMode("", 0, 0) + 2102);
                Object[] objArr9 = new Object[1];
                b((short) -1, (short) 0, (short) 0, objArr9);
                obj5 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                map3.put(-1840119381, obj5);
            }
            ((Method) obj5).invoke(null, objArr8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, short s3, Object[] objArr) {
        int i;
        byte[] bArr = $$a;
        int i2 = s + 4;
        int i3 = 1 - (s3 * 4);
        int i4 = 99 - (s2 * 2);
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i5 = i4;
            i4 = i3;
            i = 0;
            i4 += i5;
            i2++;
            bArr2[i] = (byte) i4;
            i++;
            if (i == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i5 = bArr[i2];
            i4 += i5;
            i2++;
            bArr2[i] = (byte) i4;
            i++;
            if (i == i3) {
            }
        } else {
            i = 0;
            i2++;
            bArr2[i] = (byte) i4;
            i++;
            if (i == i3) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{Byte.MAX_VALUE, -87, -70, 2};
        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSubtitle
    public /* synthetic */ setPopupTheme ThreeDS2ServiceInstance(nq nqVar) {
        ThreeDS2ServiceInstance = (initialize + 113) % 128;
        setPopupTheme initialize2 = initialize(nqVar);
        int i = ThreeDS2ServiceInstance + 23;
        initialize = i % 128;
        if (i % 2 != 0) {
            return initialize2;
        }
        throw null;
    }

    public setPopupTheme initialize(nq nqVar) {
        ThreeDS2ServiceInstance = (initialize + 115) % 128;
        Object[] objArr = new Object[1];
        a("扏끑왳ᐗ⨢磜軥", 53792 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
        String initialize2 = nqVar.initialize(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a("扏㌻삻阓", (ViewConfiguration.getPressedStateDuration() >> 16) + 20849, objArr2);
        String initialize3 = nqVar.initialize(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a("扆⦏\uf5d3脥䵤ᢴ꒛烉㰞졭", (KeyEvent.getMaxKeyCode() >> 16) + 19403, objArr3);
        setPopupTheme setpopuptheme = (setPopupTheme) setLogoDescription.ThreeDS2Service(new Object[]{initialize2, initialize3, nqVar.initialize(((String) objArr3[0]).intern())}, -577701259, 577701259, (int) System.currentTimeMillis());
        int i = initialize + 57;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            return setpopuptheme;
        }
        throw null;
    }
}
