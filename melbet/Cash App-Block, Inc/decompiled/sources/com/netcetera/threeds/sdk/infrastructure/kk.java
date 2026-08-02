package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class kk implements jt {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2Service;
    private static long get;
    private static int getWarnings;
    private static final String initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ThreeDS2Service = 0;
        getWarnings = 1;
        ThreeDS2Service();
        Object[] objArr = new Object[1];
        a("끅⾳车漙컌깿า", (ViewConfiguration.getLongPressTimeout() >> 16) + 40883, objArr);
        initialize = ((String) objArr[0]).intern();
        getWarnings = (ThreeDS2Service + 71) % 128;
    }

    public static void ThreeDS2Service() {
        get = -8623585415262457806L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fe, code lost:
    
        r0[r4] = (char) r5[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0104, code lost:
    
        r0 = new java.lang.Object[]{r3, r3};
        r2 = com.netcetera.threeds.sdk.infrastructure.removeParam.visaSchemeConfiguration;
        r3 = r2.get(-1840119381);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0111, code lost:
    
        if (r3 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0146, code lost:
    
        ((java.lang.reflect.Method) r3).invoke(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x014b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0114, code lost:
    
        r3 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(android.view.KeyEvent.normalizeMetaState(0) + 76, (char) (62096 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0)), 2102 - android.text.TextUtils.indexOf("", ""));
        r4 = new java.lang.Object[1];
        b((byte) 0, 0, 0, r4);
        r3 = r3.getMethod((java.lang.String) r4[0], java.lang.Object.class, java.lang.Object.class);
        r2.put(-1840119381, r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(String str, int i, Object[] objArr) {
        Throwable cause;
        int i2;
        $11 = ($10 + 79) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        addParam addparam = new addParam();
        addparam.initialize = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        addparam.ThreeDS2Service = 0;
        while (true) {
            int i3 = addparam.ThreeDS2Service;
            if (i3 >= charArray.length) {
                break;
            }
            try {
                Object[] objArr2 = {Integer.valueOf(charArray[i3]), addparam, addparam};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-983980093);
                if (obj != null) {
                    i2 = 1;
                } else {
                    i2 = 1;
                    obj = ((Class) removeParam.initialize(66 - TextUtils.indexOf("", "", 0), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 12511 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).getMethod("e", Integer.TYPE, Object.class, Object.class);
                    map.put(-983980093, obj);
                }
                jArr[i3] = ((Long) ((Method) obj).invoke(null, objArr2)).longValue() ^ (get ^ 6009743645011411028L);
                Object[] objArr3 = new Object[2];
                objArr3[i2] = addparam;
                objArr3[0] = addparam;
                Object obj2 = map.get(-1840119381);
                if (obj2 == null) {
                    Class cls = (Class) removeParam.initialize(77 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 62097), 2102 - Gravity.getAbsoluteGravity(0, 0));
                    Object[] objArr4 = new Object[i2];
                    b((byte) 0, 0, (short) 0, objArr4);
                    obj2 = cls.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(-1840119381, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
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
        char[] cArr = new char[length];
        addparam.ThreeDS2Service = 0;
        while (true) {
            int i4 = addparam.ThreeDS2Service;
            if (i4 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            int i5 = $10 + 115;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                break;
            }
            cArr[i4] = (char) jArr[i4];
            Object[] objArr5 = {addparam, addparam};
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj3 = map2.get(-1840119381);
            if (obj3 == null) {
                Class cls2 = (Class) removeParam.initialize(76 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (62097 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 2103 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                Object[] objArr6 = new Object[1];
                b((byte) 0, 0, (short) 0, objArr6);
                obj3 = cls2.getMethod((String) objArr6[0], Object.class, Object.class);
                map2.put(-1840119381, obj3);
            }
            ((Method) obj3).invoke(null, objArr5);
            $10 = ($11 + 77) % 128;
        }
    }

    private static void b(byte b, int i, short s, Object[] objArr) {
        int i2 = b * 2;
        int i3 = 99 - (i * 4);
        int i4 = 3 - (s * 4);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = i2 + i4;
            i4 = i4;
            bArr = bArr;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            int i7 = i4 + 1;
            if (i6 == i2) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte[] bArr3 = bArr;
            i3 += bArr[i7];
            i4 = i7;
            bArr = bArr3;
            i5 = i6;
        }
    }

    public static void init$0() {
        $$a = new byte[]{123, -15, -124, -126};
        $$b = 224;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jt
    public String get() {
        ThreeDS2Service = (getWarnings + 17) % 128;
        Object[] objArr = new Object[1];
        a("끅⾳车漙컌깿า", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 40883, objArr);
        String intern = ((String) objArr[0]).intern();
        ThreeDS2Service = (getWarnings + 65) % 128;
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jt
    public String getWarnings() {
        Object obj;
        int i = ThreeDS2Service + 97;
        getWarnings = i % 128;
        if (i % 2 == 0) {
            Object[] objArr = new Object[1];
            a("끅⾳车漙컌깿า", 40883 << Color.blue(0), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a("끅⾳车漙컌깿า", Color.blue(0) + 40883, objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }
}
