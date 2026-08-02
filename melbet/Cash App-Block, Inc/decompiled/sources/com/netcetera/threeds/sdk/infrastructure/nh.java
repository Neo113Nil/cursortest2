package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class nh {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ThreeDS2ServiceInitializationCallback = 0;
    private static char cleanup = 0;
    private static int createTransaction = 0;
    private static long get = 0;
    private static int getSDKVersion = 1;
    private static final String getWarnings;
    private static final String initialize;
    private final boolean ThreeDS2Service;
    private final boolean ThreeDS2ServiceInstance;

    static {
        initialize();
        Object[] objArr = new Object[1];
        a("չ毹➼שּ", (-1653805271) - View.MeasureSpec.getMode(0), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), "٫헻酳࿔핮쩙쬡禮\uea51轂襪⒟뺫䪠촎翀∦⥈挵䫃꾹힙♕", "⧄泯沝슼", objArr);
        getWarnings = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("չ毹➼שּ", ViewConfiguration.getTouchSlop() >> 8, (char) ((-16714074) - Color.rgb(0, 0, 0)), "밖䀮뉯䑠\uf5a3擻念䩘⪔ṷ塴䬔\ud919\u0df6盒᪉矞ฟ", "➼ዅꙻ쳶", objArr2);
        initialize = ((String) objArr2[0]).intern();
        getSDKVersion = (createTransaction + 55) % 128;
    }

    public nh(boolean z, boolean z2) {
        this.ThreeDS2ServiceInstance = z;
        this.ThreeDS2Service = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(String str, int i, char c, String str2, String str3, Object[] objArr) {
        char[] cArr;
        int i2;
        Integer num;
        Integer num2;
        int i3;
        Integer num3 = 246986610;
        Integer num4 = -258783473;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        char[] charArray2 = str2 != 0 ? str2.toCharArray() : str2;
        int i4 = 2;
        if (str != null) {
            int i5 = $10 + 115;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        ConfigParameters configParameters = new ConfigParameters();
        int length = charArray.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        int i6 = 0;
        System.arraycopy(charArray, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = charArray2.length;
        char[] cArr5 = new char[length3];
        configParameters.initialize = 0;
        while (configParameters.initialize < length3) {
            try {
                Object[] objArr2 = {configParameters};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(num4);
                int i7 = i4;
                if (obj != null) {
                    i2 = i6;
                } else {
                    i2 = i6;
                    obj = ((Class) removeParam.initialize(59 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 6415 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).getMethod("j", Object.class);
                    map.put(num4, obj);
                }
                int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {configParameters};
                Object obj2 = map.get(num3);
                if (obj2 != null) {
                    num = num4;
                } else {
                    num = num4;
                    obj2 = ((Class) removeParam.initialize(63 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (Color.red(i2) + 11345), 8576 - ExpandableListView.getPackedPositionChild(0L))).getMethod("i", Object.class);
                    map.put(num3, obj2);
                }
                int intValue2 = ((Integer) ((Method) obj2).invoke(null, objArr3)).intValue();
                int i8 = cArr3[configParameters.initialize % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i7] = Integer.valueOf(cArr4[intValue]);
                objArr4[1] = Integer.valueOf(i8);
                objArr4[i2] = configParameters;
                Object obj3 = map.get(828230935);
                Class cls = Integer.TYPE;
                if (obj3 != null) {
                    num2 = num3;
                    i3 = intValue2;
                } else {
                    num2 = num3;
                    int i9 = i2;
                    i3 = intValue2;
                    obj3 = ((Class) removeParam.initialize(73 - ExpandableListView.getPackedPositionChild(0L), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(i9, i9) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i9, i9) == 0L ? 0 : -1))), 9820 - View.MeasureSpec.getMode(i9))).getMethod("o", Object.class, cls, cls);
                    map.put(828230935, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
                int i10 = cArr3[i3] * 32718;
                char c2 = cArr4[intValue];
                i4 = i7;
                Object[] objArr5 = new Object[i4];
                objArr5[1] = Integer.valueOf(c2);
                objArr5[0] = Integer.valueOf(i10);
                Object obj4 = map.get(196637707);
                if (obj4 == null) {
                    obj4 = ((Class) removeParam.initialize(48 - (ViewConfiguration.getTouchSlop() >> 8), (char) (63350 - Drawable.resolveOpacity(0, 0)), 11536 - TextUtils.getOffsetAfter("", 0))).getMethod("n", cls, cls);
                    map.put(196637707, obj4);
                }
                cArr4[i3] = ((Character) ((Method) obj4).invoke(null, objArr5)).charValue();
                cArr3[i3] = configParameters.get;
                int i11 = configParameters.initialize;
                cArr5[i11] = (char) ((((int) (ThreeDS2ServiceInitializationCallback ^ (-8880716800597159563L))) ^ ((r2 ^ charArray2[i11]) ^ (get ^ (-8880716800597159563L)))) ^ ((char) (cleanup ^ (-8880716800597159563L))));
                configParameters.initialize = i11 + 1;
                $10 = ($11 + 41) % 128;
                length3 = length3;
                num4 = num;
                num3 = num2;
                i6 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr5);
    }

    public static nh get(com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters) {
        Object[] objArr = new Object[1];
        a("չ毹➼שּ", TextUtils.getOffsetAfter("", 0), (char) (63143 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "밖䀮뉯䑠\uf5a3擻念䩘⪔ṷ塴䬔\ud919\u0df6盒᪉矞ฟ", "➼ዅꙻ쳶", objArr);
        String str = (String) oj.getWarnings(configParameters.getParamValue(null, ((String) objArr[0]).intern()), String.valueOf(Boolean.TRUE));
        Object[] objArr2 = new Object[1];
        a("չ毹➼שּ", (-1653805271) - TextUtils.indexOf("", ""), (char) View.combineMeasuredStates(0, 0), "٫헻酳࿔핮쩙쬡禮\uea51轂襪⒟뺫䪠촎翀∦⥈挵䫃꾹힙♕", "⧄泯沝슼", objArr2);
        nh nhVar = new nh(Boolean.parseBoolean(str), Boolean.parseBoolean((String) oj.getWarnings(configParameters.getParamValue(null, ((String) objArr2[0]).intern()), String.valueOf(Boolean.FALSE))));
        int i = getSDKVersion + 73;
        createTransaction = i % 128;
        if (i % 2 != 0) {
            int i2 = 27 / 0;
        }
        return nhVar;
    }

    public static void initialize() {
        get = 9189732080754955276L;
        ThreeDS2ServiceInitializationCallback = 898634101;
        cleanup = (char) 4469;
    }

    public boolean ThreeDS2ServiceInstance() {
        int i = (createTransaction + 107) % 128;
        getSDKVersion = i;
        boolean z = this.ThreeDS2ServiceInstance;
        createTransaction = (i + 27) % 128;
        return z;
    }

    public boolean getWarnings() {
        int i = createTransaction + 47;
        getSDKVersion = i % 128;
        int i2 = i % 2;
        boolean z = this.ThreeDS2Service;
        if (i2 == 0) {
            int i3 = 11 / 0;
        }
        return z;
    }
}
