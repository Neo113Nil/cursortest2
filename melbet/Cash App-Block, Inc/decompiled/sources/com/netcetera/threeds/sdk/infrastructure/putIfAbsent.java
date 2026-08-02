package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class putIfAbsent implements notify {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int[] ThreeDS2Service;
    private static final /* synthetic */ putIfAbsent[] ThreeDS2ServiceInstance;
    private static int cleanup;
    private static int createTransaction;
    public static final putIfAbsent getWarnings;
    public static final putIfAbsent initialize;
    private final String get;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        cleanup = 0;
        createTransaction = 1;
        get();
        Object[] objArr = new Object[1];
        a(new int[]{1728116905, -268292093}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new int[]{-1814489420, -441906457}, (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 1, objArr2);
        initialize = new putIfAbsent(intern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(new int[]{-737047887, -221937081}, 2 - Color.argb(0, 0, 0, 0), objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(new int[]{2146821514, -262843166}, 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr4);
        getWarnings = new putIfAbsent(intern2, 1, ((String) objArr4[0]).intern());
        ThreeDS2ServiceInstance = ThreeDS2ServiceInstance();
        int i = createTransaction + 117;
        cleanup = i % 128;
        if (i % 2 != 0) {
            int i2 = 8 / 0;
        }
    }

    private putIfAbsent(String str, int i, String str2) {
        this.get = str2;
    }

    private static /* synthetic */ putIfAbsent[] ThreeDS2ServiceInstance() {
        int i = (createTransaction + 113) % 128;
        cleanup = i;
        putIfAbsent[] putifabsentArr = {initialize, getWarnings};
        int i2 = i + 13;
        createTransaction = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 51 / 0;
        }
        return putifabsentArr;
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        int i2;
        int i3;
        char[] cArr;
        int[] iArr2;
        int i4;
        Object method;
        int i5;
        createTransaction createtransaction = new createTransaction();
        char[] cArr2 = new char[4];
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr3 = ThreeDS2Service;
        Class cls = Integer.TYPE;
        int i6 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            i2 = 2;
            int[] iArr4 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                $10 = ($11 + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(2095751688);
                    if (obj != null) {
                        i5 = i7;
                    } else {
                        i5 = i7;
                        Class cls2 = (Class) removeParam.initialize(View.resolveSizeAndState(i6, i6, i6) + 64, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 1197 - (ViewConfiguration.getEdgeSlop() >> 16));
                        Object[] objArr3 = new Object[1];
                        b(0, (byte) 0, (short) 0, objArr3);
                        Method method2 = cls2.getMethod((String) objArr3[0], cls);
                        map.put(2095751688, method2);
                        obj = method2;
                    }
                    iArr4[i5] = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
                    i7 = i5 + 1;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        } else {
            i2 = 2;
        }
        int i8 = 16;
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = ThreeDS2Service;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr6[i9])};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj2 = map2.get(2095751688);
                if (obj2 != null) {
                    cArr = cArr2;
                    iArr2 = iArr6;
                    method = obj2;
                    i4 = length3;
                } else {
                    cArr = cArr2;
                    iArr2 = iArr6;
                    i4 = length3;
                    Class cls3 = (Class) removeParam.initialize(64 - View.resolveSizeAndState(0, 0, 0), (char) View.resolveSize(0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1196);
                    Object[] objArr5 = new Object[1];
                    b(0, (byte) 0, (short) 0, objArr5);
                    method = cls3.getMethod((String) objArr5[0], cls);
                    map2.put(2095751688, method);
                }
                iArr7[i9] = ((Integer) ((Method) method).invoke(null, objArr4)).intValue();
                i9++;
                length3 = i4;
                cArr2 = cArr;
                iArr6 = iArr2;
            }
            iArr6 = iArr7;
        }
        char[] cArr4 = cArr2;
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        createtransaction.initialize = 0;
        $11 = ($10 + 85) % 128;
        while (true) {
            int i10 = createtransaction.initialize;
            if (i10 >= iArr.length) {
                objArr[0] = new String(cArr3, 0, i);
                return;
            }
            int i11 = iArr[i10];
            char c = (char) (i11 >> 16);
            cArr4[0] = c;
            char c2 = (char) i11;
            cArr4[1] = c2;
            char c3 = (char) (iArr[i10 + 1] >> 16);
            cArr4[i2] = c3;
            char c4 = (char) iArr[i10 + 1];
            cArr4[3] = c4;
            createtransaction.getWarnings = (c << 16) + c2;
            createtransaction.get = (c3 << 16) + c4;
            createTransaction.ThreeDS2ServiceInstance(iArr5);
            int i12 = 0;
            while (true) {
                i3 = createtransaction.getWarnings;
                if (i12 >= i8) {
                    break;
                }
                int i13 = i3 ^ iArr5[i12];
                createtransaction.getWarnings = i13;
                int ThreeDS2Service2 = createTransaction.ThreeDS2Service(i13);
                Object[] objArr6 = new Object[4];
                objArr6[3] = createtransaction;
                objArr6[i2] = createtransaction;
                objArr6[1] = Integer.valueOf(ThreeDS2Service2);
                objArr6[0] = createtransaction;
                Map map3 = removeParam.visaSchemeConfiguration;
                Object obj3 = map3.get(-411264147);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize((ViewConfiguration.getLongPressTimeout() >> 16) + 49, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 13120 - Process.getGidForName(""))).getMethod("y", Object.class, cls, Object.class, Object.class);
                    map3.put(-411264147, obj3);
                }
                int intValue = ((Integer) ((Method) obj3).invoke(null, objArr6)).intValue();
                createtransaction.getWarnings = createtransaction.get;
                createtransaction.get = intValue;
                i12++;
                i8 = 16;
            }
            int i14 = createtransaction.get;
            createtransaction.getWarnings = i14;
            createtransaction.get = i3;
            i8 = 16;
            int i15 = i3 ^ iArr5[16];
            createtransaction.get = i15;
            int i16 = i14 ^ iArr5[17];
            createtransaction.getWarnings = i16;
            cArr4[0] = (char) (i16 >>> 16);
            cArr4[1] = (char) i16;
            cArr4[i2] = (char) (i15 >>> 16);
            cArr4[3] = (char) i15;
            createTransaction.ThreeDS2ServiceInstance(iArr5);
            int i17 = createtransaction.initialize;
            cArr3[i17 * 2] = cArr4[0];
            cArr3[(i17 * 2) + 1] = cArr4[1];
            cArr3[(i17 * 2) + 2] = cArr4[i2];
            cArr3[(i17 * 2) + 3] = cArr4[3];
            int i18 = i2;
            Object[] objArr7 = new Object[i18];
            objArr7[1] = createtransaction;
            objArr7[0] = createtransaction;
            Map map4 = removeParam.visaSchemeConfiguration;
            Object obj4 = map4.get(-1870831722);
            if (obj4 == null) {
                Class cls4 = (Class) removeParam.initialize(KeyEvent.normalizeMetaState(0) + 99, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), ExpandableListView.getPackedPositionType(0L) + 1880);
                Object[] objArr8 = new Object[1];
                b(0, (byte) 0, (short) 1, objArr8);
                obj4 = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                map4.put(-1870831722, obj4);
            }
            ((Method) obj4).invoke(null, objArr7);
            i2 = i18;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, short s, Object[] objArr) {
        int i2;
        int i3;
        int i4 = 1 - (b * 2);
        int i5 = (s * 5) + 113;
        byte[] bArr = $$a;
        int i6 = 3 - (i * 3);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            i5 += -i7;
            i2 = i3;
            i6++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = bArr[i6];
            i5 += -i7;
            i2 = i3;
            i6++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i6++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    public static void get() {
        ThreeDS2Service = new int[]{757875210, 282531355, -1649699346, 348762717, 1113770738, -1103325123, -490964938, 254669488, -1283788128, -52104456, -1605662571, -1058350944, 263954318, 442136496, 321108889, -692830114, -1192342946, 1963661628};
    }

    public static void init$0() {
        $$a = new byte[]{27, 61, 58, 11};
        $$b = 12;
    }

    public static putIfAbsent valueOf(String str) {
        cleanup = (createTransaction + 119) % 128;
        putIfAbsent putifabsent = (putIfAbsent) Enum.valueOf(putIfAbsent.class, str);
        createTransaction = (cleanup + 39) % 128;
        return putifabsent;
    }

    public static putIfAbsent[] values() {
        cleanup = (createTransaction + 73) % 128;
        putIfAbsent[] putifabsentArr = (putIfAbsent[]) ThreeDS2ServiceInstance.clone();
        createTransaction = (cleanup + 95) % 128;
        return putifabsentArr;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.notify
    public String getWarnings() {
        int i = createTransaction;
        int i2 = i + 15;
        cleanup = i2 % 128;
        int i3 = i2 % 2;
        String str = this.get;
        if (i3 != 0) {
            throw null;
        }
        int i4 = i + 93;
        cleanup = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
