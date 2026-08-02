package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class initCause implements notify {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ initCause[] ThreeDS2Service;
    private static char ThreeDS2ServiceInitializationCallback = 0;
    private static char ThreeDS2ServiceInstance = 0;
    private static char cleanup = 0;
    public static final initCause get;
    private static int getSDKInfo = 0;
    private static int getSDKVersion = 1;
    private static char initialize;
    private final String getWarnings;

    static {
        get();
        Object[] objArr = new Object[1];
        a("㧷왗흺줊", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("薢䑱", -TextUtils.lastIndexOf("", '0', 0), objArr2);
        get = new initCause(intern, 0, ((String) objArr2[0]).intern());
        ThreeDS2Service = initialize();
        int i = getSDKInfo + 25;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            int i2 = 37 / 0;
        }
    }

    private initCause(String str, int i, String str2) {
        this.getWarnings = str2;
    }

    private static void a(String str, int i, Object[] objArr) {
        char[] cArr;
        int i2;
        char[] cArr2;
        char c = 3;
        int i3 = 2;
        if (str != null) {
            int i4 = $11 + 67;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            cArr = str.toCharArray();
            $11 = ($10 + 3) % 128;
        } else {
            cArr = str;
        }
        char[] cArr3 = cArr;
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        char[] cArr4 = new char[cArr3.length];
        int i5 = 0;
        configurationBuilder.ThreeDS2ServiceInstance = 0;
        char[] cArr5 = new char[2];
        while (true) {
            int i6 = configurationBuilder.ThreeDS2ServiceInstance;
            if (i6 >= cArr3.length) {
                objArr[0] = new String(cArr4, 0, i);
                return;
            }
            int i7 = $10 + 47;
            $11 = i7 % 128;
            char c2 = 1;
            if (i7 % i3 == 0) {
                cArr5[i5] = cArr3[i6];
                cArr5[i5] = cArr3[i6];
                i2 = 1;
            } else {
                cArr5[i5] = cArr3[i6];
                cArr5[1] = cArr3[i6 + 1];
                i2 = i5;
            }
            int i8 = 58224;
            while (i2 < 16) {
                $11 = ($10 + 41) % 128;
                char c3 = cArr5[c2];
                char c4 = cArr5[i5];
                char c5 = c;
                char c6 = c2;
                int i9 = (c4 + i8) ^ ((c4 << 4) + ((char) (ThreeDS2ServiceInitializationCallback ^ (-1730380012335540218L))));
                int i10 = c4 >>> 5;
                int i11 = i3;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[c5] = Integer.valueOf(cleanup);
                    objArr2[i11] = Integer.valueOf(i10);
                    objArr2[c6] = Integer.valueOf(i9);
                    objArr2[i5] = Integer.valueOf(c3);
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(936379577);
                    Class cls = Integer.TYPE;
                    if (obj != null) {
                        cArr2 = cArr3;
                    } else {
                        cArr2 = cArr3;
                        obj = ((Class) removeParam.initialize(67 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (Color.argb(i5, i5, i5, i5) + 62396), 5352 - Drawable.resolveOpacity(i5, i5))).getMethod("C", cls, cls, cls, cls);
                        map.put(936379577, obj);
                    }
                    char charValue = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    cArr5[c6] = charValue;
                    char c7 = cArr5[i5];
                    int i12 = i5;
                    int i13 = (charValue + i8) ^ ((charValue << 4) + ((char) (ThreeDS2ServiceInstance ^ (-1730380012335540218L))));
                    int i14 = charValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[c5] = Integer.valueOf(initialize);
                    objArr3[i11] = Integer.valueOf(i14);
                    objArr3[c6] = Integer.valueOf(i13);
                    objArr3[i12] = Integer.valueOf(c7);
                    Object obj2 = map.get(936379577);
                    if (obj2 == null) {
                        obj2 = ((Class) removeParam.initialize(Process.getGidForName("") + 68, (char) (62396 - KeyEvent.getDeadChar(i12, i12)), 5352 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)))).getMethod("C", cls, cls, cls, cls);
                        map.put(936379577, obj2);
                    }
                    cArr5[0] = ((Character) ((Method) obj2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i2++;
                    c2 = c6;
                    i3 = i11;
                    c = c5;
                    cArr3 = cArr2;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char c8 = c;
            int i15 = i3;
            char[] cArr6 = cArr3;
            char c9 = c2;
            int i16 = configurationBuilder.ThreeDS2ServiceInstance;
            cArr4[i16] = cArr5[0];
            cArr4[i16 + 1] = cArr5[c9];
            Object[] objArr4 = new Object[i15];
            objArr4[c9] = configurationBuilder;
            objArr4[0] = configurationBuilder;
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj3 = map2.get(108358357);
            if (obj3 == null) {
                obj3 = ((Class) removeParam.initialize(54 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (39958 - AndroidCharacter.getMirror('0')), Color.blue(0) + 7059)).getMethod("B", Object.class, Object.class);
                map2.put(108358357, obj3);
            }
            ((Method) obj3).invoke(null, objArr4);
            cArr3 = cArr6;
            i5 = 0;
            i3 = i15;
            c = c8;
        }
    }

    public static void get() {
        ThreeDS2ServiceInstance = (char) 56253;
        initialize = (char) 15844;
        ThreeDS2ServiceInitializationCallback = (char) 48806;
        cleanup = (char) 50292;
    }

    private static /* synthetic */ initCause[] initialize() {
        int i = getSDKInfo;
        initCause[] initcauseArr = {get};
        getSDKVersion = (i + 1) % 128;
        return initcauseArr;
    }

    public static initCause valueOf(String str) {
        int i = getSDKInfo + 49;
        getSDKVersion = i % 128;
        int i2 = i % 2;
        initCause initcause = (initCause) Enum.valueOf(initCause.class, str);
        if (i2 == 0) {
            int i3 = 22 / 0;
        }
        return initcause;
    }

    public static initCause[] values() {
        int i = getSDKVersion + 91;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            return (initCause[]) ThreeDS2Service.clone();
        }
        ThreeDS2Service.clone();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.notify
    public String getWarnings() {
        int i = getSDKVersion;
        String str = this.getWarnings;
        getSDKInfo = (i + 19) % 128;
        return str;
    }
}
