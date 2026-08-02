package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.netcetera.threeds.sdk.infrastructure.setProgressBackgroundTintList;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class setBackInvokedCallbackEnabled {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ThreeDS2ServiceInitializationCallback = 0;
    private static int addParam = 1;
    private static long cleanup = -8880716800597159563L;
    private static char createTransaction = 62515;
    private static int getSDKVersion = 898634101;
    private final setSubtitleTextColor ThreeDS2Service;
    private final setContentInsetStartWithNavigation ThreeDS2ServiceInstance;
    private final setMenu get;
    private final setContentInsetEndWithActions getSDKInfo;
    private final setInputType getWarnings;
    private final setMenuCallbacks initialize;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        private static int ThreeDS2Service = 0;
        static final /* synthetic */ int[] ThreeDS2ServiceInstance;
        private static int get = 1;

        static {
            int[] iArr = new int[load.values().length];
            ThreeDS2ServiceInstance = iArr;
            try {
                iArr[load.getWarnings.ordinal()] = 1;
                int i = ThreeDS2Service;
                int i2 = i & 27;
                int i3 = (i | 27) & (~i2);
                int i4 = -(-(i2 << 1));
                get = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ThreeDS2ServiceInstance[load.initialize.ordinal()] = 2;
                get = (ThreeDS2Service + 79) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            int i5 = get;
            ThreeDS2Service = ((i5 ^ 109) + ((i5 & 109) << 1)) % 128;
        }
    }

    public setBackInvokedCallbackEnabled(setMenu setmenu, setContentInsetStartWithNavigation setcontentinsetstartwithnavigation, setInputType setinputtype, setSubtitleTextColor setsubtitletextcolor, setMenuCallbacks setmenucallbacks, setContentInsetEndWithActions setcontentinsetendwithactions) {
        this.get = setmenu;
        this.ThreeDS2ServiceInstance = setcontentinsetstartwithnavigation;
        this.getWarnings = setinputtype;
        this.ThreeDS2Service = setsubtitletextcolor;
        this.initialize = setmenucallbacks;
        this.getSDKInfo = setcontentinsetendwithactions;
    }

    public static setBackInvokedCallbackEnabled ThreeDS2Service(setFontFeatureSettings setfontfeaturesettings, fx fxVar, setLineHeight setlineheight, nh nhVar, jh jhVar, setProgressBackgroundTintList.getWarnings getwarnings) {
        getView ThreeDS2Service = fxVar.ThreeDS2Service(nhVar, setfontfeaturesettings);
        setBackInvokedCallbackEnabled setbackinvokedcallbackenabled = new setBackInvokedCallbackEnabled(new setMenu(ThreeDS2Service, nhVar), new setContentInsetStartWithNavigation(ThreeDS2Service, nhVar), (setInputType) setInputType.ThreeDS2Service(new Object[]{fxVar}, 1106948059, -1106948059, (int) System.currentTimeMillis()), fxVar.getWarnings(jhVar), new setMenuCallbacks(), new setContentInsetEndWithActions(setlineheight, nhVar, getwarnings));
        ThreeDS2ServiceInitializationCallback = (addParam + 29) % 128;
        return setbackinvokedcallbackenabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(String str, int i, char c, String str2, String str3, Object[] objArr) {
        char[] cArr;
        int i2;
        int i3;
        Integer num;
        char[] cArr2;
        int i4;
        char c2;
        Integer num2;
        Integer num3 = 246986610;
        Integer num4 = -258783473;
        if (str3 != null) {
            $10 = ($11 + 65) % 128;
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr3 = cArr;
        char[] charArray = str2 != 0 ? str2.toCharArray() : str2;
        char[] charArray2 = str != null ? str.toCharArray() : str;
        ConfigParameters configParameters = new ConfigParameters();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = charArray2.length;
        char[] cArr5 = new char[length2];
        int i5 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(charArray2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        int i6 = 2;
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = charArray.length;
        char[] cArr6 = new char[length3];
        configParameters.initialize = 0;
        $10 = ($11 + 37) % 128;
        while (configParameters.initialize < length3) {
            $11 = ($10 + 61) % 128;
            try {
                Object[] objArr2 = {configParameters};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(num4);
                if (obj != null) {
                    i2 = i6;
                    i3 = i5;
                } else {
                    i2 = i6;
                    i3 = i5;
                    obj = ((Class) removeParam.initialize(58 - (Process.myPid() >> 22), (char) View.getDefaultSize(i5, i5), ExpandableListView.getPackedPositionChild(0L) + 6415)).getMethod("j", Object.class);
                    map.put(num4, obj);
                }
                int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {configParameters};
                Object obj2 = map.get(num3);
                if (obj2 != null) {
                    num = num4;
                    cArr2 = charArray;
                    i4 = length3;
                } else {
                    num = num4;
                    cArr2 = charArray;
                    i4 = length3;
                    int i7 = i3;
                    obj2 = ((Class) removeParam.initialize(Color.blue(i3) + 63, (char) (11344 - TextUtils.indexOf((CharSequence) "", '0', i7)), 8577 - TextUtils.getOffsetBefore("", i7))).getMethod("i", Object.class);
                    map.put(num3, obj2);
                }
                int intValue2 = ((Integer) ((Method) obj2).invoke(null, objArr3)).intValue();
                int i8 = cArr4[configParameters.initialize % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i2] = Integer.valueOf(cArr5[intValue]);
                objArr4[1] = Integer.valueOf(i8);
                objArr4[0] = configParameters;
                Object obj3 = map.get(828230935);
                Class cls = Integer.TYPE;
                if (obj3 != null) {
                    num2 = num3;
                    c2 = 1;
                } else {
                    c2 = 1;
                    num2 = num3;
                    obj3 = ((Class) removeParam.initialize(74 - Color.alpha(0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), ImageFormat.getBitsPerPixel(0) + 9821)).getMethod("o", Object.class, cls, cls);
                    map.put(828230935, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
                int i9 = cArr4[intValue2] * 32718;
                char c3 = cArr5[intValue];
                int i10 = i2;
                Object[] objArr5 = new Object[i10];
                objArr5[c2] = Integer.valueOf(c3);
                objArr5[0] = Integer.valueOf(i9);
                Object obj4 = map.get(196637707);
                if (obj4 == null) {
                    obj4 = ((Class) removeParam.initialize(TextUtils.getOffsetAfter("", 0) + 48, (char) (View.getDefaultSize(0, 0) + 63350), 11536 - (Process.myPid() >> 22))).getMethod("n", cls, cls);
                    map.put(196637707, obj4);
                }
                cArr5[intValue2] = ((Character) ((Method) obj4).invoke(null, objArr5)).charValue();
                cArr4[intValue2] = configParameters.get;
                int i11 = configParameters.initialize;
                cArr6[i11] = (char) ((((r2 ^ cArr2[i11]) ^ (cleanup ^ (-8880716800597159563L))) ^ ((int) (getSDKVersion ^ (-8880716800597159563L)))) ^ ((char) (createTransaction ^ (-8880716800597159563L))));
                configParameters.initialize = i11 + 1;
                charArray = cArr2;
                i6 = i10;
                num4 = num;
                length3 = i4;
                num3 = num2;
                i5 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    public void initialize(String str, setHighlights sethighlights) {
        ThreeDS2ServiceInitializationCallback = (addParam + 23) % 128;
        try {
            setTitleMarginTop initialize = this.getSDKInfo.initialize(str);
            this.initialize.ThreeDS2Service(this.get.getWarnings(initialize.ThreeDS2ServiceInstance()));
            setTitleTextColor settitletextcolor = this.ThreeDS2Service.get(this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(initialize.ThreeDS2ServiceInstance()));
            int i = AnonymousClass4.ThreeDS2ServiceInstance[settitletextcolor.ThreeDS2ServiceInstance().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    sethighlights.initialize(settitletextcolor);
                }
            } else {
                if (!initialize.ThreeDS2Service()) {
                    setTextAlignment settextalignment = setTextAlignment.getId;
                    Object[] objArr = new Object[1];
                    a("\u0000\u0000\u0000\u0000", TextUtils.getCapsMode("", 0, 0), (char) (ImageFormat.getBitsPerPixel(0) + 27021), "땊墽奕\ued74", "衢Ἳ貱轩", objArr);
                    String intern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    a("\u0000\u0000\u0000\u0000", Color.green(0), (char) (5128 - Color.green(0)), "騲⊨\uf212儔சꝣ\ueff9虋\ue3b9묆质푨曏㻙쏔䨾︶\ud9f2\uf716뽸䗲挝스ᚽ䤸쥴礘⋢", "拿钋ࡽĔ", objArr2);
                    throw new computeValue(settextalignment, intern, ((String) objArr2[0]).intern()).ThreeDS2Service();
                }
                if (settitletextcolor.getSDKVersion() == wait.ThreeDS2Service) {
                    int i2 = addParam + 107;
                    ThreeDS2ServiceInitializationCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        sethighlights.ThreeDS2Service(settitletextcolor);
                        throw null;
                    }
                    sethighlights.ThreeDS2Service(settitletextcolor);
                }
                if (settitletextcolor.getSDKVersion() == wait.initialize) {
                    sethighlights.getWarnings(this.getWarnings.initialize(settitletextcolor));
                }
            }
            addParam = (ThreeDS2ServiceInitializationCallback + 113) % 128;
        } catch (setScrollCaptureCallback e) {
            sethighlights.ThreeDS2Service(e);
        }
    }
}
