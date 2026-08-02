package com.netcetera.threeds.sdk.infrastructure;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class jz implements jq {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2Service;
    private static int ThreeDS2ServiceInstance;
    private static long initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ThreeDS2ServiceInstance = 0;
        ThreeDS2Service = 1;
        initialize = 8221405222019161148L;
    }

    private static void a(String str, int i, Object[] objArr) {
        int i2 = $11 + 1;
        $10 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        onCompleted oncompleted = new onCompleted();
        char[] initialize2 = onCompleted.initialize(initialize ^ (-2776494906517314268L), charArray, i);
        oncompleted.initialize = 4;
        while (true) {
            int i3 = oncompleted.initialize;
            if (i3 >= initialize2.length) {
                String str2 = new String(initialize2, 4, initialize2.length - 4);
                $10 = ($11 + 97) % 128;
                objArr[0] = str2;
                return;
            }
            int i4 = i3 - 4;
            oncompleted.ThreeDS2Service = i4;
            try {
                Object[] objArr2 = {Long.valueOf(initialize2[i3] ^ initialize2[i3 % 4]), Long.valueOf(i4), Long.valueOf(initialize)};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1242395160);
                if (obj == null) {
                    Class cls = (Class) removeParam.initialize((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 48, (char) (27781 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2440);
                    Object[] objArr3 = new Object[1];
                    b(0, (byte) 0, (byte) 0, objArr3);
                    String str3 = (String) objArr3[0];
                    Class cls2 = Long.TYPE;
                    obj = cls.getMethod(str3, cls2, cls2, cls2);
                    map.put(-1242395160, obj);
                }
                initialize2[i3] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {oncompleted, oncompleted};
                Object obj2 = map.get(1526822639);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 65, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 14235)).getMethod("s", Object.class, Object.class);
                    map.put(1526822639, obj2);
                }
                ((Method) obj2).invoke(null, objArr4);
                $11 = ($10 + 17) % 128;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, byte b2, Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = 112 - (b * 3);
        int i4 = i * 3;
        int i5 = 3 - (b2 * 4);
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i3;
            i2 = 0;
            i3 = i6;
            i3 += i7;
            i5++;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2++;
            i7 = bArr[i5];
            i3 += i7;
            i5++;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            i5++;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{126, 35, -39, 100};
        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jq
    public String ThreeDS2Service() {
        Object obj;
        int i = ThreeDS2Service + 3;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = new Object[1];
            a("桤䌌Ῐ桇멲啬\ued8e빂豢鸒줮", ViewConfiguration.getScrollBarSize() / 99, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a("桤䌌Ῐ桇멲啬\ued8e빂豢鸒줮", ViewConfiguration.getScrollBarSize() >> 8, objArr2);
            obj = objArr2[0];
        }
        String intern = ((String) obj).intern();
        int i2 = ThreeDS2ServiceInstance + 9;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 != 0) {
            return intern;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public int ThreeDS2ServiceInstance() {
        int i = ThreeDS2Service + 43;
        ThreeDS2ServiceInstance = i % 128;
        return i % 2 != 0 ? 80 : 16;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jq
    public int createTransaction() {
        int i = ThreeDS2Service + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        ThreeDS2ServiceInstance = i % 128;
        return i % 2 != 0 ? 5 : 4;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String get() {
        ThreeDS2Service = (ThreeDS2ServiceInstance + 29) % 128;
        Object[] objArr = new Object[1];
        a("桤䌌Ῐ桇멲啬\ued8e빂豢鸒줮", TextUtils.indexOf((CharSequence) "", '0') + 1, objArr);
        String intern = ((String) objArr[0]).intern();
        int i = ThreeDS2Service + 73;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            return intern;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jq
    public int getWarnings() {
        int i = ThreeDS2Service + 125;
        int i2 = i % 128;
        ThreeDS2ServiceInstance = i2;
        int i3 = i % 2 == 0 ? 4 : 2;
        ThreeDS2Service = (i2 + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return i3;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String initialize() {
        ThreeDS2Service = (ThreeDS2ServiceInstance + 87) % 128;
        Object[] objArr = new Object[1];
        a("ꯧ㺗岅ꮔ쟮Ḙ껛\uf523侪\ue39c詰퇂捎Ｉ", Process.myPid() >> 22, objArr);
        String intern = ((String) objArr[0]).intern();
        int i = ThreeDS2Service + 61;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            return intern;
        }
        throw null;
    }
}
