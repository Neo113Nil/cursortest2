package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class getInfo implements notify {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ getInfo[] ThreeDS2Service;
    private static int ThreeDS2ServiceInitializationCallback = 0;
    private static char ThreeDS2ServiceInstance = 0;
    private static char cleanup = 0;
    private static int createTransaction = 1;
    private static char getSDKVersion;
    public static final getInfo getWarnings;
    private static char initialize;
    private final String get;

    static {
        ThreeDS2Service();
        Object[] objArr = new Object[1];
        a("$劰", (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("$劰", (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr2);
        getWarnings = new getInfo(intern, 0, ((String) objArr2[0]).intern());
        ThreeDS2Service = initialize();
        int i = createTransaction + 93;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 74 / 0;
        }
    }

    private getInfo(String str, int i, String str2) {
        this.get = str2;
    }

    public static void ThreeDS2Service() {
        initialize = (char) 47057;
        ThreeDS2ServiceInstance = (char) 62211;
        cleanup = (char) 34629;
        getSDKVersion = (char) 63343;
    }

    private static void a(String str, int i, Object[] objArr) {
        boolean z;
        Object obj;
        char[] cArr;
        Object obj2;
        Object obj3;
        $11 = ($10 + 21) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        char[] cArr2 = new char[charArray.length];
        int i2 = 0;
        configurationBuilder.ThreeDS2ServiceInstance = 0;
        int i3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i4 = configurationBuilder.ThreeDS2ServiceInstance;
            if (i4 >= charArray.length) {
                String str2 = new String(cArr2, 0, i);
                $11 = ($10 + 81) % 128;
                objArr[0] = str2;
                return;
            }
            cArr3[i2] = charArray[i4];
            boolean z2 = true;
            cArr3[1] = charArray[i4 + 1];
            int i5 = 58224;
            int i6 = i2;
            while (true) {
                z = z2;
                if (i6 >= 16) {
                    break;
                }
                $11 = ($10 + 67) % 128;
                char c = cArr3[z ? 1 : 0];
                char c2 = cArr3[i2];
                int i7 = i3;
                int i8 = i2;
                int i9 = (c2 + i5) ^ ((c2 << 4) + ((char) (cleanup ^ (-1730380012335540218L))));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getSDKVersion);
                    objArr2[i7] = Integer.valueOf(i10);
                    objArr2[z ? 1 : 0] = Integer.valueOf(i9);
                    objArr2[i8] = Integer.valueOf(c);
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj4 = map.get(936379577);
                    Class cls = Integer.TYPE;
                    if (obj4 != null) {
                        cArr = charArray;
                        obj2 = obj4;
                    } else {
                        cArr = charArray;
                        Method method = ((Class) removeParam.initialize(TextUtils.lastIndexOf("", '0') + 68, (char) (ExpandableListView.getPackedPositionChild(0L) + 62397), View.MeasureSpec.getMode(i8) + 5352)).getMethod("C", cls, cls, cls, cls);
                        map.put(936379577, method);
                        obj2 = method;
                    }
                    char charValue = ((Character) ((Method) obj2).invoke(null, objArr2)).charValue();
                    cArr3[z ? 1 : 0] = charValue;
                    char c3 = cArr3[i8];
                    char[] cArr4 = cArr3;
                    int i11 = (charValue + i5) ^ ((charValue << 4) + ((char) (initialize ^ (-1730380012335540218L))));
                    int i12 = charValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(ThreeDS2ServiceInstance);
                    objArr3[i7] = Integer.valueOf(i12);
                    objArr3[z ? 1 : 0] = Integer.valueOf(i11);
                    objArr3[i8] = Integer.valueOf(c3);
                    Object obj5 = map.get(936379577);
                    if (obj5 != null) {
                        obj3 = obj5;
                    } else {
                        Method method2 = ((Class) removeParam.initialize(TextUtils.lastIndexOf("", '0', i8, i8) + 68, (char) (62396 - (Process.myPid() >> 22)), 5353 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))).getMethod("C", cls, cls, cls, cls);
                        map.put(936379577, method2);
                        obj3 = method2;
                    }
                    cArr4[0] = ((Character) ((Method) obj3).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    z2 = z ? 1 : 0;
                    i3 = i7;
                    charArray = cArr;
                    cArr3 = cArr4;
                    i2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = charArray;
            int i13 = i3;
            char[] cArr6 = cArr3;
            int i14 = configurationBuilder.ThreeDS2ServiceInstance;
            cArr2[i14] = cArr6[0];
            cArr2[i14 + 1] = cArr6[z ? 1 : 0];
            Object[] objArr4 = new Object[i13];
            objArr4[z ? 1 : 0] = configurationBuilder;
            objArr4[0] = configurationBuilder;
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj6 = map2.get(108358357);
            if (obj6 != null) {
                obj = obj6;
            } else {
                Method method3 = ((Class) removeParam.initialize(53 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) ((-16737306) - Color.rgb(0, 0, 0)), 7060 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).getMethod("B", Object.class, Object.class);
                map2.put(108358357, method3);
                obj = method3;
            }
            ((Method) obj).invoke(null, objArr4);
            i3 = i13;
            charArray = cArr5;
            cArr3 = cArr6;
            i2 = 0;
        }
    }

    private static /* synthetic */ getInfo[] initialize() {
        int i = createTransaction;
        getInfo[] getinfoArr = {getWarnings};
        int i2 = i + 3;
        ThreeDS2ServiceInitializationCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 68 / 0;
        }
        return getinfoArr;
    }

    public static getInfo valueOf(String str) {
        int i = createTransaction + 5;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 != 0) {
            Enum.valueOf(getInfo.class, str);
            throw null;
        }
        getInfo getinfo = (getInfo) Enum.valueOf(getInfo.class, str);
        int i2 = ThreeDS2ServiceInitializationCallback + 7;
        createTransaction = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 7 / 0;
        }
        return getinfo;
    }

    public static getInfo[] values() {
        int i = createTransaction + 37;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 == 0) {
            return (getInfo[]) ThreeDS2Service.clone();
        }
        ThreeDS2Service.clone();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.notify
    public String getWarnings() {
        int i = createTransaction;
        int i2 = i + 37;
        ThreeDS2ServiceInitializationCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.get;
        if (i3 != 0) {
            throw null;
        }
        ThreeDS2ServiceInitializationCallback = (i + 91) % 128;
        return str;
    }
}
