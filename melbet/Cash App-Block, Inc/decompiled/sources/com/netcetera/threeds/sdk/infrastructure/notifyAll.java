package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.ImageFormat;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class notifyAll implements notify {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ notifyAll[] ThreeDS2Service;
    private static int ThreeDS2ServiceInitializationCallback;
    private static int ThreeDS2ServiceInstance;
    private static long get;
    public static final notifyAll getWarnings;
    private final String initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ThreeDS2ServiceInstance = 0;
        ThreeDS2ServiceInitializationCallback = 1;
        initialize();
        Object[] objArr = new Object[1];
        a("ᴳẞ褦ᵪ\udcd8", KeyEvent.getMaxKeyCode() >> 16, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("ᴳẞ褦ᵪ\udcd8", (-1) - MotionEvent.axisFromString(""), objArr2);
        getWarnings = new notifyAll(intern, 0, ((String) objArr2[0]).intern());
        ThreeDS2Service = ThreeDS2Service();
        ThreeDS2ServiceInitializationCallback = (ThreeDS2ServiceInstance + 75) % 128;
    }

    private notifyAll(String str, int i, String str2) {
        this.initialize = str2;
    }

    private static /* synthetic */ notifyAll[] ThreeDS2Service() {
        int i = ThreeDS2ServiceInitializationCallback;
        notifyAll[] notifyallArr = {getWarnings};
        ThreeDS2ServiceInstance = (i + 49) % 128;
        return notifyallArr;
    }

    private static void a(String str, int i, Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        onCompleted oncompleted = new onCompleted();
        char[] initialize = onCompleted.initialize(get ^ (-2776494906517314268L), charArray, i);
        oncompleted.initialize = 4;
        $11 = ($10 + 121) % 128;
        while (true) {
            int i2 = oncompleted.initialize;
            if (i2 >= initialize.length) {
                objArr[0] = new String(initialize, 4, initialize.length - 4);
                return;
            }
            $11 = ($10 + 111) % 128;
            int i3 = i2 - 4;
            oncompleted.ThreeDS2Service = i3;
            try {
                Object[] objArr2 = {Long.valueOf(initialize[i2] ^ initialize[i2 % 4]), Long.valueOf(i3), Long.valueOf(get)};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1242395160);
                if (obj == null) {
                    Class cls = (Class) removeParam.initialize((TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 48, (char) (ImageFormat.getBitsPerPixel(0) + 27781), 2442 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    Object[] objArr3 = new Object[1];
                    b(0, (short) 0, (byte) 0, objArr3);
                    String str2 = (String) objArr3[0];
                    Class cls2 = Long.TYPE;
                    obj = cls.getMethod(str2, cls2, cls2, cls2);
                    map.put(-1242395160, obj);
                }
                initialize[i2] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {oncompleted, oncompleted};
                Object obj2 = map.get(1526822639);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(((byte) KeyEvent.getModifierMetaStateMask()) + 67, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), View.MeasureSpec.getMode(0) + 14235)).getMethod("s", Object.class, Object.class);
                    map.put(1526822639, obj2);
                }
                ((Method) obj2).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, byte b, Object[] objArr) {
        int i2;
        int i3;
        int i4 = 1 - (b * 3);
        int i5 = 112 - (i * 3);
        byte[] bArr = $$a;
        int i6 = (s * 2) + 4;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            i6++;
            i5 += i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = bArr[i6];
            i6++;
            i5 += i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{17, 23, -47, 5};
        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE;
    }

    public static void initialize() {
        get = 6838896062262764988L;
    }

    public static notifyAll valueOf(String str) {
        int i = ThreeDS2ServiceInitializationCallback + 45;
        ThreeDS2ServiceInstance = i % 128;
        int i2 = i % 2;
        notifyAll notifyall = (notifyAll) Enum.valueOf(notifyAll.class, str);
        if (i2 != 0) {
            int i3 = 72 / 0;
        }
        int i4 = ThreeDS2ServiceInstance + 51;
        ThreeDS2ServiceInitializationCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return notifyall;
        }
        throw null;
    }

    public static notifyAll[] values() {
        ThreeDS2ServiceInstance = (ThreeDS2ServiceInitializationCallback + 57) % 128;
        notifyAll[] notifyallArr = (notifyAll[]) ThreeDS2Service.clone();
        int i = ThreeDS2ServiceInstance + 111;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 68 / 0;
        }
        return notifyallArr;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.notify
    public String getWarnings() {
        int i = ThreeDS2ServiceInitializationCallback;
        String str = this.initialize;
        ThreeDS2ServiceInstance = (i + 5) % 128;
        return str;
    }
}
