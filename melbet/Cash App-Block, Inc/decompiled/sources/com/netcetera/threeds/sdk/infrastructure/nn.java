package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes5.dex */
public final class nn {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long ThreeDS2ServiceInstance;
    private static int getWarnings;
    private static int initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        initialize = 0;
        getWarnings = 1;
        ThreeDS2ServiceInstance = 4196019673006511055L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0105, code lost:
    
        r0[r4] = (char) r5[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010b, code lost:
    
        r0 = new java.lang.Object[]{r3, r3};
        r2 = com.netcetera.threeds.sdk.infrastructure.removeParam.visaSchemeConfiguration;
        r3 = r2.get(-1840119381);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011a, code lost:
    
        if (r3 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x014d, code lost:
    
        ((java.lang.reflect.Method) r3).invoke(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0152, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011d, code lost:
    
        r3 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(76 - android.text.TextUtils.indexOf("", "", 0), (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 62097), android.graphics.Color.green(0) + 2102);
        r4 = new java.lang.Object[1];
        b((byte) -1, 0, (byte) 0, r4);
        r3 = r3.getMethod((java.lang.String) r4[0], java.lang.Object.class, java.lang.Object.class);
        r2.put(-1840119381, r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(String str, int i, Object[] objArr) {
        Throwable cause;
        int i2;
        byte b;
        Object method;
        $10 = ($11 + 111) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        addParam addparam = new addParam();
        addparam.initialize = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        byte b2 = 0;
        addparam.ThreeDS2Service = 0;
        while (true) {
            int i3 = addparam.ThreeDS2Service;
            if (i3 >= charArray.length) {
                break;
            }
            char c = charArray[i3];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[2] = addparam;
                objArr2[1] = addparam;
                objArr2[b2] = Integer.valueOf(c);
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-983980093);
                if (obj != null) {
                    b = b2;
                    method = obj;
                    i2 = 1;
                } else {
                    i2 = 1;
                    b = b2;
                    method = ((Class) removeParam.initialize(66 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) TextUtils.getOffsetAfter("", b2), Color.rgb((int) b2, (int) b2, (int) b2) + 16789727)).getMethod("e", Integer.TYPE, Object.class, Object.class);
                    map.put(-983980093, method);
                }
                jArr[i3] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (ThreeDS2ServiceInstance ^ 6009743645011411028L);
                Object[] objArr3 = new Object[2];
                objArr3[i2] = addparam;
                objArr3[b] = addparam;
                Object obj2 = map.get(-1840119381);
                if (obj2 == null) {
                    Class cls = (Class) removeParam.initialize(KeyEvent.keyCodeFromString("") + 76, (char) (MotionEvent.axisFromString("") + 62098), 2102 - ExpandableListView.getPackedPositionType(0L));
                    Object[] objArr4 = new Object[i2];
                    byte b3 = b;
                    b((byte) -1, b3, b3, objArr4);
                    obj2 = cls.getMethod((String) objArr4[b3], Object.class, Object.class);
                    map.put(-1840119381, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
                b2 = 0;
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
                String str2 = new String(cArr);
                $10 = ($11 + 71) % 128;
                objArr[0] = str2;
                return;
            }
            int i5 = $11 + 55;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                break;
            }
            cArr[i4] = (char) jArr[i4];
            Object[] objArr5 = {addparam, addparam};
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj3 = map2.get(-1840119381);
            if (obj3 == null) {
                Class cls2 = (Class) removeParam.initialize(76 - Color.blue(0), (char) (62097 - ExpandableListView.getPackedPositionGroup(0L)), 2102 - TextUtils.getTrimmedLength(""));
                Object[] objArr6 = new Object[1];
                b((byte) -1, 0, (byte) 0, objArr6);
                obj3 = cls2.getMethod((String) objArr6[0], Object.class, Object.class);
                map2.put(-1840119381, obj3);
            }
            ((Method) obj3).invoke(null, objArr5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, byte b2, Object[] objArr) {
        int i2;
        int i3 = b + 4;
        int i4 = 99 - (b2 * 4);
        int i5 = i * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            i4 = i5;
            i4 += i6;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2++;
            i6 = bArr[i3];
            i4 += i6;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{96, PnmConstants.PPM_RAW_CODE, 36, PnmConstants.PGM_RAW_CODE};
        $$b = EnumC0170g.SDK_ASSET_ICON_EXTERNAL_VALUE;
    }

    public String get(String str) {
        getWarnings = (initialize + 67) % 128;
        Object[] objArr = new Object[1];
        a("鏳㕾\udecd恘ব", (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 42641, objArr);
        if (oj.ThreeDS2Service((CharSequence) str, (CharSequence) ((String) objArr[0]).intern())) {
            int i = getWarnings + 39;
            initialize = i % 128;
            if (i % 2 != 0) {
                int i2 = 48 / 0;
            }
            return str;
        }
        Object[] objArr2 = new Object[1];
        a("鏳癪壥⍤", 58757 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr2);
        String intern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a("鏳㕾\udecd恘ব", Color.blue(0) + 42641, objArr3);
        String ThreeDS2Service = oj.ThreeDS2Service(str, intern, ((String) objArr3[0]).intern(), 1);
        int i3 = initialize + 17;
        getWarnings = i3 % 128;
        if (i3 % 2 != 0) {
            return ThreeDS2Service;
        }
        throw null;
    }
}
