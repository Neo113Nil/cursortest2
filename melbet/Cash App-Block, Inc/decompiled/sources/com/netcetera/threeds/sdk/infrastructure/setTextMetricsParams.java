package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
class setTextMetricsParams {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String ThreeDS2Service;
    private static char ThreeDS2ServiceInitializationCallback = 0;
    private static final String ThreeDS2ServiceInstance;
    private static int cleanup = 0;
    private static int createTransaction = 0;
    private static long get = 0;
    private static int getSDKInfo = 1;
    private static final String getWarnings;
    private final Object initialize;

    static {
        getWarnings();
        Object[] objArr = new Object[1];
        a("咏\uf614ᴱᡴ", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (28434 - TextUtils.indexOf((CharSequence) "", '0')), "\ue545皂緭棣㗥댢", "\udd11ⷪ\u1311ٯ", objArr);
        getWarnings = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("咏\uf614ᴱᡴ", (-1) - ExpandableListView.getPackedPositionChild(0L), (char) (22062 - Color.argb(0, 0, 0, 0)), "\uf520鍞䮾ꨯ굝ᐆ컑鹁❬绡╕㤈鐃桯", "ṡ陙⺤둖", objArr2);
        ThreeDS2Service = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a("咏\uf614ᴱᡴ", 1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 63865), "媼䕌\ue606\u0e71胦㽋ꥻ芹ྪ뛒ᘒᮢ\ue4f6\uedbb", "뒙㽌祊鷹", objArr3);
        ThreeDS2ServiceInstance = ((String) objArr3[0]).intern();
        getSDKInfo = (cleanup + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
    }

    public setTextMetricsParams(Object obj) {
        this.initialize = obj;
    }

    private boolean ThreeDS2Service(String str) {
        try {
            new JSONObject(str);
            int i = getSDKInfo + 31;
            cleanup = i % 128;
            if (i % 2 == 0) {
                return true;
            }
            throw null;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(String str, int i, char c, String str2, String str3, Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        Integer num;
        int i2;
        int i3;
        char[] cArr3;
        Integer num2 = 246986610;
        Integer num3 = -258783473;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        if (str2 != 0) {
            $11 = ($10 + 85) % 128;
            cArr = str2.toCharArray();
        } else {
            cArr = str2;
        }
        char[] cArr4 = cArr;
        int i4 = 2;
        if (str != null) {
            int i5 = $10 + 61;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            cArr2 = str.toCharArray();
        } else {
            cArr2 = str;
        }
        char[] cArr5 = cArr2;
        ConfigParameters configParameters = new ConfigParameters();
        int length = charArray.length;
        char[] cArr6 = new char[length];
        int length2 = cArr5.length;
        char[] cArr7 = new char[length2];
        System.arraycopy(charArray, 0, cArr6, 0, length);
        System.arraycopy(cArr5, 0, cArr7, 0, length2);
        cArr6[0] = (char) (cArr6[0] ^ c);
        cArr7[2] = (char) (cArr7[2] + ((char) i));
        int length3 = cArr4.length;
        char[] cArr8 = new char[length3];
        configParameters.initialize = 0;
        while (configParameters.initialize < length3) {
            try {
                Object[] objArr2 = {configParameters};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(num3);
                int i6 = i4;
                if (obj == null) {
                    obj = ((Class) removeParam.initialize((ViewConfiguration.getDoubleTapTimeout() >> 16) + 58, (char) (Process.myPid() >> 22), ExpandableListView.getPackedPositionChild(0L) + 6415)).getMethod("j", Object.class);
                    map.put(num3, obj);
                }
                int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {configParameters};
                Object obj2 = map.get(num2);
                if (obj2 != null) {
                    num = num3;
                } else {
                    num = num3;
                    obj2 = ((Class) removeParam.initialize((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 62, (char) (11345 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1))), (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 8576)).getMethod("i", Object.class);
                    map.put(num2, obj2);
                }
                int intValue2 = ((Integer) ((Method) obj2).invoke(null, objArr3)).intValue();
                int i7 = cArr6[configParameters.initialize % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i6] = Integer.valueOf(cArr7[intValue]);
                objArr4[1] = Integer.valueOf(i7);
                objArr4[0] = configParameters;
                Object obj3 = map.get(828230935);
                Class cls = Integer.TYPE;
                Integer num4 = num2;
                if (obj3 != null) {
                    i2 = intValue2;
                    i3 = length3;
                    cArr3 = cArr4;
                } else {
                    i2 = intValue2;
                    i3 = length3;
                    cArr3 = cArr4;
                    obj3 = ((Class) removeParam.initialize(ExpandableListView.getPackedPositionGroup(0L) + 74, (char) TextUtils.getOffsetAfter("", 0), TextUtils.indexOf((CharSequence) "", '0') + 9821)).getMethod("o", Object.class, cls, cls);
                    map.put(828230935, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
                int i8 = cArr6[i2] * 32718;
                Object[] objArr5 = new Object[i6];
                objArr5[1] = Integer.valueOf(cArr7[intValue]);
                objArr5[0] = Integer.valueOf(i8);
                Object obj4 = map.get(196637707);
                if (obj4 == null) {
                    obj4 = ((Class) removeParam.initialize(48 - TextUtils.getOffsetAfter("", 0), (char) (63350 - KeyEvent.normalizeMetaState(0)), (Process.myTid() >> 22) + 11536)).getMethod("n", cls, cls);
                    map.put(196637707, obj4);
                }
                cArr7[i2] = ((Character) ((Method) obj4).invoke(null, objArr5)).charValue();
                cArr6[i2] = configParameters.get;
                int i9 = configParameters.initialize;
                cArr8[i9] = (char) ((((int) (createTransaction ^ (-8880716800597159563L))) ^ ((r2 ^ cArr3[i9]) ^ (get ^ (-8880716800597159563L)))) ^ ((char) (ThreeDS2ServiceInitializationCallback ^ (-8880716800597159563L))));
                configParameters.initialize = i9 + 1;
                length3 = i3;
                num3 = num;
                num2 = num4;
                cArr4 = cArr3;
                i4 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr8);
    }

    public static void getWarnings() {
        get = -7154735266345499142L;
        createTransaction = 898634101;
        ThreeDS2ServiceInitializationCallback = (char) 4469;
    }

    public setLocalePreferredLineHeightForMinimumUsed ThreeDS2ServiceInstance(String str) {
        try {
            if (!ThreeDS2Service(str)) {
                getSDKInfo = (cleanup + 65) % 128;
                throw setTextAlignment.dinersSchemeConfiguration.initialize(new Object[0]);
            }
            nq nqVar = (nq) nq.ThreeDS2Service(new Object[]{str}, -639806015, 639806015, (int) System.currentTimeMillis());
            Object[] objArr = new Object[1];
            a("咏\uf614ᴱᡴ", ViewConfiguration.getWindowTouchSlop() >> 8, (char) (63865 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), "媼䕌\ue606\u0e71胦㽋ꥻ芹ྪ뛒ᘒᮢ\ue4f6\uedbb", "뒙㽌祊鷹", objArr);
            String initialize = nqVar.initialize(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            a("咏\uf614ᴱᡴ", Color.rgb(0, 0, 0) + 16777216, (char) (22062 - (ViewConfiguration.getScrollBarSize() >> 8)), "\uf520鍞䮾ꨯ굝ᐆ컑鹁❬绡╕㤈鐃桯", "ṡ陙⺤둖", objArr2);
            String initialize2 = nqVar.initialize(((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            a("咏\uf614ᴱᡴ", View.getDefaultSize(0, 0), (char) (Color.blue(0) + 28435), "\ue545皂緭棣㗥댢", "\udd11ⷪ\u1311ٯ", objArr3);
            String initialize3 = nqVar.initialize(((String) objArr3[0]).intern());
            String lowerCase = initialize3.trim().toLowerCase();
            Object[] objArr4 = new Object[1];
            a("咏\uf614ᴱᡴ", View.MeasureSpec.getMode(0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 50372), "拍퍉葛鄭煼靄", "㙕縩앗\ud9c4", objArr4);
            if (!lowerCase.startsWith(((String) objArr4[0]).intern())) {
                int i = cleanup + 63;
                getSDKInfo = i % 128;
                if (i % 2 == 0) {
                    throw setTextAlignment.getSupportedProtocolVersions.initialize(initialize3);
                }
                throw setTextAlignment.getSupportedProtocolVersions.initialize(initialize3);
            }
            Object obj = this.initialize;
            try {
                Object[] objArr5 = {initialize};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj2 = map.get(-69345827);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(67 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (45769 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 4879 - Color.green(0))).getMethod("ThreeDS2ServiceInstance", String.class);
                    map.put(-69345827, obj2);
                }
                return new setLocalePreferredLineHeightForMinimumUsed(initialize3, initialize2, ((qo) ((Method) obj2).invoke(obj, objArr5)).getWarnings());
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (ro e) {
            throw setTextAlignment.jcbConfiguration.initialize(e);
        }
    }
}
