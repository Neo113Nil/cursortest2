package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.netcetera.threeds.sdk.infrastructure.setProgressBackgroundTintList;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class setContentInsetEndWithActions {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ConfigParameters;
    private static int ThreeDS2ServiceInitializationCallback;
    private static final List<String> ThreeDS2ServiceInstance;
    private static int addParam;
    private static char cleanup;
    private static long createTransaction;
    private static char[] getSDKInfo;
    private static char getSDKVersion;
    private final setProgressBackgroundTintList.getWarnings ThreeDS2Service;
    private final setLineHeight get;
    private final no getWarnings = (no) nu.initialize(new Object[]{setContentInsetEndWithActions.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private final nh initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        addParam = 0;
        ConfigParameters = 1;
        initialize();
        ArrayList arrayList = new ArrayList();
        Object[] objArr = new Object[1];
        a((byte) (27 - View.MeasureSpec.getSize(0)), "㖫", Color.blue(0) + 1, objArr);
        arrayList.add(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27662), "\uf5f3", "\u0000\u0000\u0000\u0000", "䳩\uea0c൪筬", TextUtils.indexOf("", "", 0) + 1793723468, objArr2);
        arrayList.add(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a((byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 110), "㘤", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, objArr3);
        arrayList.add(((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        a((byte) (10 - TextUtils.getOffsetAfter("", 0)), "㖻", 1 - TextUtils.getOffsetAfter("", 0), objArr4);
        arrayList.add(((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        b((char) (TextUtils.getCapsMode("", 0, 0) + 10325), "盾", "\u0000\u0000\u0000\u0000", "炕빜嗑ᴨ", ImageFormat.getBitsPerPixel(0) - 776053647, objArr5);
        arrayList.add(((String) objArr5[0]).intern());
        ThreeDS2ServiceInstance = Collections.unmodifiableList(arrayList);
        int i = ConfigParameters + 57;
        addParam = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public setContentInsetEndWithActions(setLineHeight setlineheight, nh nhVar, setProgressBackgroundTintList.getWarnings getwarnings) {
        this.get = setlineheight;
        this.initialize = nhVar;
        this.ThreeDS2Service = getwarnings;
    }

    private boolean ThreeDS2Service(String str) {
        Iterator<String> it = ThreeDS2ServiceInstance.iterator();
        while (it.hasNext()) {
            if (oj.ThreeDS2ServiceInstance(str, it.next())) {
                addParam = (ConfigParameters + 99) % 128;
                return true;
            }
            ConfigParameters = (addParam + 119) % 128;
        }
        return false;
    }

    private static void a(byte b, String str, int i, Object[] objArr) {
        char[] cArr;
        long j;
        int i2;
        char c;
        char c2;
        char c3;
        char c4;
        Object method;
        int length;
        char[] cArr2;
        int i3;
        char[] cArr3;
        Object method2;
        if (str != null) {
            $11 = ($10 + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr4 = cArr;
        getParamValue getparamvalue = new getParamValue();
        char[] cArr5 = getSDKInfo;
        Class cls = Integer.TYPE;
        char c5 = 2;
        if (cArr5 != null) {
            int i4 = $11 + 15;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr5.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr5.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            j = 0;
            while (i3 < length) {
                int i5 = $11 + 111;
                char c6 = c5;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr5[i3])};
                        Map map = removeParam.visaSchemeConfiguration;
                        Object obj = map.get(-78420608);
                        if (obj != null) {
                            cArr3 = cArr4;
                            method2 = obj;
                        } else {
                            Class cls2 = (Class) removeParam.initialize(94 - KeyEvent.keyCodeFromString(""), (char) ExpandableListView.getPackedPositionType(0L), View.MeasureSpec.getSize(0) + 1559);
                            Object[] objArr3 = new Object[1];
                            cArr3 = cArr4;
                            c((short) 0, (byte) 0, (short) 1, objArr3);
                            method2 = cls2.getMethod((String) objArr3[0], cls);
                            map.put(-78420608, method2);
                        }
                        cArr2[i3] = ((Character) ((Method) method2).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    cArr3 = cArr4;
                    Object[] objArr4 = {Integer.valueOf(cArr5[i3])};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj2 = map2.get(-78420608);
                    if (obj2 == null) {
                        Class cls3 = (Class) removeParam.initialize(View.combineMeasuredStates(0, 0) + 94, (char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1559);
                        Object[] objArr5 = new Object[1];
                        c((short) 0, (byte) 0, (short) 1, objArr5);
                        obj2 = cls3.getMethod((String) objArr5[0], cls);
                        map2.put(-78420608, obj2);
                    }
                    cArr2[i3] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                    i3++;
                }
                c5 = c6;
                cArr4 = cArr3;
            }
            cArr5 = cArr2;
        } else {
            j = 0;
        }
        char[] cArr6 = cArr4;
        char c7 = c5;
        Object[] objArr6 = {Integer.valueOf(cleanup)};
        Map map3 = removeParam.visaSchemeConfiguration;
        Object obj3 = map3.get(-78420608);
        char c8 = 6;
        if (obj3 == null) {
            Class cls4 = (Class) removeParam.initialize(94 - KeyEvent.normalizeMetaState(0), (char) TextUtils.getCapsMode("", 0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 1559);
            Object[] objArr7 = new Object[1];
            c((short) 0, (byte) 0, (short) 1, objArr7);
            obj3 = cls4.getMethod((String) objArr7[0], cls);
            map3.put(-78420608, obj3);
        }
        char charValue = ((Character) ((Method) obj3).invoke(null, objArr6)).charValue();
        char[] cArr7 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr7[i2] = (char) (cArr6[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            getparamvalue.getWarnings = 0;
            while (true) {
                int i6 = getparamvalue.getWarnings;
                if (i6 >= i2) {
                    break;
                }
                char c9 = cArr6[i6];
                getparamvalue.get = c9;
                char c10 = cArr6[i6 + 1];
                getparamvalue.initialize = c10;
                if (c9 == c10) {
                    int i7 = $10 + 97;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        cArr7[i6] = (char) (c9 << b);
                        cArr7[i6 % 1] = (char) (c10 >> b);
                    } else {
                        cArr7[i6] = (char) (c9 - b);
                        cArr7[i6 + 1] = (char) (c10 - b);
                    }
                    c = c8;
                } else {
                    Object[] objArr8 = new Object[13];
                    objArr8[12] = getparamvalue;
                    objArr8[11] = Integer.valueOf(charValue);
                    objArr8[10] = getparamvalue;
                    objArr8[9] = getparamvalue;
                    objArr8[8] = Integer.valueOf(charValue);
                    objArr8[7] = getparamvalue;
                    objArr8[c8] = getparamvalue;
                    objArr8[5] = Integer.valueOf(charValue);
                    objArr8[4] = getparamvalue;
                    objArr8[3] = getparamvalue;
                    objArr8[c7] = Integer.valueOf(charValue);
                    objArr8[1] = getparamvalue;
                    objArr8[0] = getparamvalue;
                    Map map4 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map4.get(-1395483366);
                    c = c8;
                    if (obj4 != null) {
                        c2 = '\t';
                        c4 = '\b';
                        method = obj4;
                        c3 = 7;
                    } else {
                        c2 = '\t';
                        c3 = 7;
                        c4 = '\b';
                        Class cls5 = (Class) removeParam.initialize((ViewConfiguration.getPressedStateDuration() >> 16) + 48, (char) (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3221);
                        Object[] objArr9 = new Object[1];
                        c((short) 0, (byte) 0, (short) 0, objArr9);
                        String str2 = (String) objArr9[0];
                        Class cls6 = Integer.TYPE;
                        method = cls5.getMethod(str2, Object.class, Object.class, cls6, Object.class, Object.class, cls6, Object.class, Object.class, cls6, Object.class, Object.class, cls6, Object.class);
                        map4.put(-1395483366, method);
                    }
                    int intValue = ((Integer) ((Method) method).invoke(null, objArr8)).intValue();
                    int i8 = getparamvalue.cleanup;
                    if (intValue == i8) {
                        $11 = ($10 + 3) % 128;
                        Object[] objArr10 = new Object[11];
                        objArr10[10] = getparamvalue;
                        objArr10[c2] = Integer.valueOf(charValue);
                        objArr10[c4] = getparamvalue;
                        objArr10[c3] = Integer.valueOf(charValue);
                        objArr10[c] = Integer.valueOf(charValue);
                        objArr10[5] = getparamvalue;
                        objArr10[4] = getparamvalue;
                        objArr10[3] = Integer.valueOf(charValue);
                        objArr10[c7] = Integer.valueOf(charValue);
                        objArr10[1] = getparamvalue;
                        objArr10[0] = getparamvalue;
                        Object obj5 = map4.get(1507360409);
                        if (obj5 == null) {
                            Class cls7 = (Class) removeParam.initialize(46 - TextUtils.indexOf((CharSequence) "", '0'), (char) (25644 - TextUtils.getOffsetAfter("", 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 11489);
                            Class cls8 = Integer.TYPE;
                            obj5 = cls7.getMethod("x", Object.class, Object.class, cls8, cls8, Object.class, Object.class, cls8, cls8, Object.class, cls8, Object.class);
                            map4.put(1507360409, obj5);
                        }
                        int intValue2 = ((Integer) ((Method) obj5).invoke(null, objArr10)).intValue();
                        int i9 = (getparamvalue.ThreeDS2ServiceInstance * charValue) + getparamvalue.cleanup;
                        int i10 = getparamvalue.getWarnings;
                        cArr7[i10] = cArr5[intValue2];
                        cArr7[i10 + 1] = cArr5[i9];
                    } else {
                        int i11 = getparamvalue.ThreeDS2Service;
                        int i12 = getparamvalue.ThreeDS2ServiceInstance;
                        if (i11 == i12) {
                            $10 = ($11 + 69) % 128;
                            int m = Thread$State$EnumUnboxingLocalUtility.m(getparamvalue.ThreeDS2ServiceInitializationCallback, charValue, 1, charValue);
                            getparamvalue.ThreeDS2ServiceInitializationCallback = m;
                            int m2 = Thread$State$EnumUnboxingLocalUtility.m(i8, charValue, 1, charValue);
                            getparamvalue.cleanup = m2;
                            int i13 = (i11 * charValue) + m;
                            int i14 = getparamvalue.getWarnings;
                            cArr7[i14] = cArr5[i13];
                            cArr7[i14 + 1] = cArr5[(i12 * charValue) + m2];
                        } else {
                            int i15 = (i12 * charValue) + getparamvalue.ThreeDS2ServiceInitializationCallback;
                            int i16 = getparamvalue.getWarnings;
                            cArr7[i16] = cArr5[(i11 * charValue) + i8];
                            cArr7[i16 + 1] = cArr5[i15];
                            $11 = ($10 + 81) % 128;
                            getparamvalue.getWarnings += 2;
                            c8 = c;
                        }
                    }
                }
                getparamvalue.getWarnings += 2;
                c8 = c;
            }
        }
        $11 = ($10 + 45) % 128;
        for (int i17 = 0; i17 < i; i17++) {
            cArr7[i17] = (char) (cArr7[i17] ^ 13722);
        }
        objArr[0] = new String(cArr7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void b(char c, String str, String str2, String str3, int i, Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char[] cArr3;
        int i2;
        int i3;
        Object method;
        String str4;
        Integer num;
        char c2;
        int i4;
        String str5 = "";
        Integer num2 = -258783473;
        if (str3 != null) {
            cArr = str3.toCharArray();
            $11 = ($10 + 117) % 128;
        } else {
            cArr = str3;
        }
        char[] cArr4 = cArr;
        int i5 = 2;
        if (str2 != null) {
            int i6 = $11 + 53;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                str2.toCharArray();
                throw null;
            }
            cArr2 = str2.toCharArray();
        } else {
            cArr2 = str2;
        }
        char[] cArr5 = cArr2;
        if (str != 0) {
            $10 = ($11 + 87) % 128;
            cArr3 = str.toCharArray();
        } else {
            cArr3 = str;
        }
        ConfigParameters configParameters = new ConfigParameters();
        int length = cArr4.length;
        char[] cArr6 = new char[length];
        int length2 = cArr5.length;
        char[] cArr7 = new char[length2];
        int i7 = 0;
        System.arraycopy(cArr4, 0, cArr6, 0, length);
        System.arraycopy(cArr5, 0, cArr7, 0, length2);
        cArr6[0] = (char) (cArr6[0] ^ c);
        cArr7[2] = (char) (cArr7[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr8 = new char[length3];
        configParameters.initialize = 0;
        while (configParameters.initialize < length3) {
            $11 = ($10 + 61) % 128;
            try {
                Object[] objArr2 = {configParameters};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(num2);
                int i8 = i5;
                if (obj != null) {
                    i3 = length3;
                    i2 = i7;
                    method = obj;
                } else {
                    i2 = i7;
                    i3 = length3;
                    method = ((Class) removeParam.initialize((KeyEvent.getMaxKeyCode() >> 16) + 58, (char) ExpandableListView.getPackedPositionGroup(0L), Color.blue(i2) + 6414)).getMethod("j", Object.class);
                    map.put(num2, method);
                }
                int intValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {configParameters};
                Object obj2 = map.get(246986610);
                if (obj2 != null) {
                    str4 = str5;
                    num = num2;
                } else {
                    int modifierMetaStateMask = 62 - ((byte) KeyEvent.getModifierMetaStateMask());
                    char indexOf = (char) (TextUtils.indexOf(str5, str5) + 11345);
                    str4 = str5;
                    num = num2;
                    int i9 = i2;
                    obj2 = ((Class) removeParam.initialize(modifierMetaStateMask, indexOf, 8577 - View.getDefaultSize(i9, i9))).getMethod("i", Object.class);
                    map.put(246986610, obj2);
                }
                int intValue2 = ((Integer) ((Method) obj2).invoke(null, objArr3)).intValue();
                int i10 = cArr6[configParameters.initialize % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i8] = Integer.valueOf(cArr7[intValue]);
                objArr4[1] = Integer.valueOf(i10);
                objArr4[0] = configParameters;
                Object obj3 = map.get(828230935);
                Class cls = Integer.TYPE;
                if (obj3 != null) {
                    i4 = intValue2;
                    c2 = 1;
                } else {
                    c2 = 1;
                    i4 = intValue2;
                    obj3 = ((Class) removeParam.initialize(75 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (AndroidCharacter.getMirror('0') - '0'), 9820 - View.MeasureSpec.getSize(0))).getMethod("o", Object.class, cls, cls);
                    map.put(828230935, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
                int i11 = cArr6[i4] * 32718;
                Object[] objArr5 = new Object[i8];
                objArr5[c2] = Integer.valueOf(cArr7[intValue]);
                objArr5[0] = Integer.valueOf(i11);
                Object obj4 = map.get(196637707);
                if (obj4 == null) {
                    obj4 = ((Class) removeParam.initialize(48 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (63350 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), ((Process.getThreadPriority(0) + 20) >> 6) + 11536)).getMethod("n", cls, cls);
                    map.put(196637707, obj4);
                }
                cArr7[i4] = ((Character) ((Method) obj4).invoke(null, objArr5)).charValue();
                cArr6[i4] = configParameters.get;
                int i12 = configParameters.initialize;
                char[] cArr9 = cArr8;
                cArr9[i12] = (char) ((((r2 ^ r9[i12]) ^ (createTransaction ^ (-8880716800597159563L))) ^ ((int) (ThreeDS2ServiceInitializationCallback ^ (-8880716800597159563L)))) ^ ((char) (getSDKVersion ^ (-8880716800597159563L))));
                configParameters.initialize = i12 + 1;
                length3 = i3;
                cArr8 = cArr9;
                str5 = str4;
                num2 = num;
                i5 = 2;
                i7 = 0;
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, byte b, short s2, Object[] objArr) {
        int i;
        int i2 = (b * 4) + 4;
        int i3 = s * 2;
        byte[] bArr = $$a;
        int i4 = (s2 * 2) + 117;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i6 = 0;
            int i7 = i4;
            int i8 = i2;
            int i9 = i8 + 1;
            i4 = i2 + i7;
            i2 = i9;
            bArr = bArr3;
            i = i6;
            bArr2[i] = (byte) i4;
            if (i == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i10 = i4;
            i8 = i2;
            i2 = bArr[i2];
            i6 = i + 1;
            bArr3 = bArr;
            i7 = i10;
            int i92 = i8 + 1;
            i4 = i2 + i7;
            i2 = i92;
            bArr = bArr3;
            i = i6;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        }
    }

    private boolean get(String str) {
        addParam = (ConfigParameters + 25) % 128;
        Object[] objArr = new Object[1];
        b((char) ((TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 5460), "ⳮ츂", "\u0000\u0000\u0000\u0000", "\u0a29蒞咗愕", 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
        String[] split = str.split(((String) objArr[0]).intern());
        if (split.length != 5) {
            addParam = (ConfigParameters + 113) % 128;
            return false;
        }
        for (String str2 : split) {
            try {
                Base64.decode(str2, 8);
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    private void getWarnings(JSONObject jSONObject) {
        Object[] objArr = new Object[1];
        b((char) Color.red(0), "렁\uf08eﻥ夯鸾ӯ铫\u20ca⏊\ua87f쎿", "\u0000\u0000\u0000\u0000", "鵴䡯뾽浢", (-1119326307) - Color.argb(0, 0, 0, 0), objArr);
        String optString = jSONObject.optString(((String) objArr[0]).intern(), "");
        Object[] objArr2 = new Object[1];
        b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\ueb1e瞇ਂ攢颺㑉茜♭䬝䱰ꄾ턆觓ਏ谌⠬ⅴ긂뇦⚻澔ꠧ", "\u0000\u0000\u0000\u0000", "팙뷓់쵘", ImageFormat.getBitsPerPixel(0) + 1, objArr2);
        String optString2 = jSONObject.optString(((String) objArr2[0]).intern(), "");
        if (oj.get(load.getWarnings.getWarnings(), optString) && oj.get(wait.initialize.getWarnings(), optString2)) {
            ConfigParameters = (addParam + 87) % 128;
            setProgressBackgroundTintList.getWarnings getwarnings = this.ThreeDS2Service;
            Object[] objArr3 = new Object[1];
            b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), "Ờ듛喜愧蟗푷⍲㶑\u181d", "\u0000\u0000\u0000\u0000", "蟈鎜퉿\uf876", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2140380295, objArr3);
            String intern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            b((char) (((Process.getThreadPriority(0) + 20) >> 6) + 61915), "弅ꆸ돭", "\u0000\u0000\u0000\u0000", "㨳鶈\udb76등", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1990035515, objArr4);
            getwarnings.initialize(jSONObject.optString(intern, ((String) objArr4[0]).intern()));
        }
        ConfigParameters = (addParam + 49) % 128;
    }

    public static void init$0() {
        $$a = new byte[]{13, -78, -10, 100};
        $$b = 192;
    }

    public setTitleMarginTop initialize(String str) {
        boolean z;
        if (oj.getWarnings((CharSequence) str)) {
            setTextAlignment settextalignment = setTextAlignment.getId;
            Object[] objArr = new Object[1];
            a((byte) ((Process.myTid() >> 22) + 80), "\u0005\u0007\u0007\b", 4 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b((char) (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), "㑽癀⛾\uf0f6쒩쓴셑燲ᕂ혀害\uee34䴯遁툷ↇ숼\uf583嗔䫊", "\u0000\u0000\u0000\u0000", "쓏濏ཾꔫ", View.combineMeasuredStates(0, 0), objArr2);
            throw new computeValue(settextalignment, intern, ((String) objArr2[0]).intern()).ThreeDS2Service();
        }
        this.getWarnings.getWarnings(str, this.initialize);
        if (!this.initialize.ThreeDS2ServiceInstance() && get(str) && ThreeDS2Service(str)) {
            setTextAlignment settextalignment2 = setTextAlignment.useBridgingExtension;
            Object[] objArr3 = new Object[1];
            a((byte) (80 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), "\u0005\u0007\u0007\b", 5 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr3);
            String intern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            b((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), "䯺ꇝﶡ\udcbb籋⊌遝減╪苫఼\uf2ed콛뎢꿮ऱ\uf79b㗀\uec30춾㗒䱁♿\ue5aaᬶ㙸촊ꅥꄋkㆊ䫆⹙뛤悬♓㎑솯\uf2f3\uf5f6\uefaaϼ榣\u2009ﶫ芍믑", "\u0000\u0000\u0000\u0000", "ꁞ봐목\ue65c", (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) - 1447227233, objArr4);
            throw new computeValue(settextalignment2, intern2, ((String) objArr4[0]).intern()).ThreeDS2Service();
        }
        try {
            if (get(str)) {
                int i = addParam + 107;
                ConfigParameters = i % 128;
                int i2 = i % 2;
                str = this.get.get(str);
                z = true;
            } else {
                z = false;
            }
            ConfigParameters = (addParam + 121) % 128;
            try {
                this.getWarnings.getWarnings(str, this.initialize);
                JSONObject jSONObject = new JSONObject(str);
                getWarnings(jSONObject);
                return new setTitleMarginTop(nq.initialize(jSONObject), z);
            } catch (JSONException e) {
                setTextAlignment settextalignment3 = setTextAlignment.getId;
                Object[] objArr5 = new Object[1];
                a((byte) (79 - TextUtils.indexOf((CharSequence) "", '0')), "\u0005\u0007\u0007\b", KeyEvent.keyCodeFromString("") + 4, objArr5);
                String intern3 = ((String) objArr5[0]).intern();
                Object[] objArr6 = new Object[1];
                b((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "魗쪖ﯔ죹䁭昦듙爓┐ᥓ重蕵憈\udad9ꔄ뜵攢\ue629⇇\ude61釸炃\uefc4\udab4즭쏍ဵ籔鴁\uf0f6暸෬內\ud867鴒옗\udc76渱ᚳ\uf4ef靪֨ྻ⺘ꭅ埵⺾댊", "\u0000\u0000\u0000\u0000", "䏦善弚だ", KeyEvent.keyCodeFromString(""), objArr6);
                throw new computeValue(settextalignment3, intern3, ((String) objArr6[0]).intern()).initialize(e);
            }
        } catch (setScrollCaptureCallback e2) {
            setTextAlignment settextalignment4 = setTextAlignment.useBridgingExtension;
            Object[] objArr7 = new Object[1];
            a((byte) (80 - View.MeasureSpec.getMode(0)), "\u0005\u0007\u0007\b", 4 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr7);
            String intern4 = ((String) objArr7[0]).intern();
            Object[] objArr8 = new Object[1];
            b((char) (MotionEvent.axisFromString("") + 1), "㝭ᗞ௴鈭홑쪰㎸嫎繥뗚ﻧ暁\udf38Ⱪ橣냔巴푣荅鬤蹵州\uf289냭︾䕀尪䩑锕⁂㭹籃鰠⺄쏘挍ꌑ읿\uf333没趿홺ᓎ桋䖶\uf348ꢨ\ud9c2磀叟材彭짱⑆酛꾑曙\ue489땲\uddf7ો㠴☠攼맠韚⥾☓⏏\uaacd\ue396밀⮗퍽\uf6f5䳼", "\u0000\u0000\u0000\u0000", "抇ᚱ䊤枆", ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr8);
            throw new computeValue(settextalignment4, intern4, ((String) objArr8[0]).intern()).initialize(e2);
        }
    }

    public static void initialize() {
        getSDKInfo = new char[]{37969, 37973, 37971, 37970, 37945, 38000, 37919, 37897, 37928};
        cleanup = (char) 41443;
        createTransaction = -8880716800597159563L;
        ThreeDS2ServiceInitializationCallback = -1328589687;
        getSDKVersion = (char) 4469;
    }
}
