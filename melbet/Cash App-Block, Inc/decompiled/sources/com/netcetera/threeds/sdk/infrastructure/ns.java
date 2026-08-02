package com.netcetera.threeds.sdk.infrastructure;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class ns {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] ThreeDS2Service;
    private static int ThreeDS2ServiceInstance;
    private static int getSDKVersion;
    private static char getWarnings;
    private static final no initialize;
    private final JSONArray get;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ThreeDS2ServiceInstance = 0;
        getSDKVersion = 1;
        initialize();
        initialize = (no) nu.initialize(new Object[]{ns.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
        int i = getSDKVersion + 111;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private ns(JSONArray jSONArray) {
        this.get = jSONArray;
    }

    private static void a(byte b, String str, int i, Object[] objArr) {
        char[] cArr;
        char c;
        int i2;
        char c2;
        char c3;
        int i3;
        int i4;
        int i5;
        Object method;
        if (str != null) {
            int i6 = $11 + 111;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        getParamValue getparamvalue = new getParamValue();
        char[] cArr3 = ThreeDS2Service;
        Class cls = Integer.TYPE;
        int i7 = 1;
        int i8 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            c = 2;
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i9])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-78420608);
                    if (obj != null) {
                        i5 = i9;
                        method = obj;
                    } else {
                        Class cls2 = (Class) removeParam.initialize(94 - TextUtils.getOffsetAfter("", i8), (char) View.resolveSize(i8, i8), 1559 - (ExpandableListView.getPackedPositionForGroup(i8) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i8) == 0L ? 0 : -1)));
                        Object[] objArr3 = new Object[1];
                        i5 = i9;
                        b(1, 0, (short) -1, objArr3);
                        method = cls2.getMethod((String) objArr3[0], cls);
                        map.put(-78420608, method);
                    }
                    cArr4[i5] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i9 = i5 + 1;
                    i8 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        } else {
            c = 2;
        }
        Object[] objArr4 = {Integer.valueOf(getWarnings)};
        Map map2 = removeParam.visaSchemeConfiguration;
        Object obj2 = map2.get(-78420608);
        if (obj2 == null) {
            Class cls3 = (Class) removeParam.initialize(94 - ExpandableListView.getPackedPositionGroup(0L), (char) ExpandableListView.getPackedPositionGroup(0L), 1559 - KeyEvent.normalizeMetaState(0));
            Object[] objArr5 = new Object[1];
            b(1, 0, (short) -1, objArr5);
            obj2 = cls3.getMethod((String) objArr5[0], cls);
            map2.put(-78420608, obj2);
        }
        char charValue = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            int i10 = $10 + 23;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                i2 = i + EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                cArr5[i2] = (char) (cArr2[i2] / b);
            } else {
                i2 = i - 1;
                cArr5[i2] = (char) (cArr2[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i11 = $10 + 27;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                getparamvalue.getWarnings = 1;
            } else {
                getparamvalue.getWarnings = 0;
            }
            while (true) {
                int i12 = getparamvalue.getWarnings;
                if (i12 >= i2) {
                    break;
                }
                char c4 = cArr2[i12];
                getparamvalue.get = c4;
                char c5 = cArr2[i12 + 1];
                getparamvalue.initialize = c5;
                if (c4 == c5) {
                    cArr5[i12] = (char) (c4 - b);
                    cArr5[i12 + 1] = (char) (c5 - b);
                    i4 = i7;
                } else {
                    Object[] objArr6 = new Object[13];
                    objArr6[12] = getparamvalue;
                    objArr6[11] = Integer.valueOf(charValue);
                    objArr6[10] = getparamvalue;
                    objArr6[9] = getparamvalue;
                    objArr6[8] = Integer.valueOf(charValue);
                    objArr6[7] = getparamvalue;
                    objArr6[6] = getparamvalue;
                    objArr6[5] = Integer.valueOf(charValue);
                    objArr6[4] = getparamvalue;
                    objArr6[3] = getparamvalue;
                    objArr6[c] = Integer.valueOf(charValue);
                    objArr6[i7] = getparamvalue;
                    objArr6[0] = getparamvalue;
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(-1395483366);
                    if (obj3 != null) {
                        i3 = i7;
                        c2 = '\b';
                        c3 = 6;
                    } else {
                        c2 = '\b';
                        c3 = 6;
                        Class cls4 = (Class) removeParam.initialize(TextUtils.getTrimmedLength("") + 48, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 3221 - (KeyEvent.getMaxKeyCode() >> 16));
                        Object[] objArr7 = new Object[i7];
                        i3 = i7;
                        b(0, 0, (short) -1, objArr7);
                        String str2 = (String) objArr7[0];
                        Class cls5 = Integer.TYPE;
                        obj3 = cls4.getMethod(str2, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                        map3.put(-1395483366, obj3);
                    }
                    int intValue = ((Integer) ((Method) obj3).invoke(null, objArr6)).intValue();
                    int i13 = getparamvalue.cleanup;
                    if (intValue == i13) {
                        $11 = ($10 + 63) % 128;
                        Object[] objArr8 = new Object[11];
                        objArr8[10] = getparamvalue;
                        objArr8[9] = Integer.valueOf(charValue);
                        objArr8[c2] = getparamvalue;
                        objArr8[7] = Integer.valueOf(charValue);
                        objArr8[c3] = Integer.valueOf(charValue);
                        objArr8[5] = getparamvalue;
                        objArr8[4] = getparamvalue;
                        objArr8[3] = Integer.valueOf(charValue);
                        objArr8[c] = Integer.valueOf(charValue);
                        objArr8[i3] = getparamvalue;
                        objArr8[0] = getparamvalue;
                        Object obj4 = map3.get(1507360409);
                        if (obj4 == null) {
                            Class cls6 = (Class) removeParam.initialize(TextUtils.indexOf((CharSequence) "", '0', 0) + 48, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 25644), 11489 - (ViewConfiguration.getTapTimeout() >> 16));
                            Class cls7 = Integer.TYPE;
                            obj4 = cls6.getMethod("x", Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                            map3.put(1507360409, obj4);
                        }
                        int intValue2 = ((Integer) ((Method) obj4).invoke(null, objArr8)).intValue();
                        int i14 = (getparamvalue.ThreeDS2ServiceInstance * charValue) + getparamvalue.cleanup;
                        int i15 = getparamvalue.getWarnings;
                        cArr5[i15] = cArr3[intValue2];
                        cArr5[i15 + 1] = cArr3[i14];
                        i4 = i3;
                    } else {
                        int i16 = getparamvalue.ThreeDS2Service;
                        int i17 = getparamvalue.ThreeDS2ServiceInstance;
                        if (i16 == i17) {
                            $11 = ($10 + 55) % 128;
                            int i18 = i3;
                            int m = Thread$State$EnumUnboxingLocalUtility.m(getparamvalue.ThreeDS2ServiceInitializationCallback, charValue, i18, charValue);
                            getparamvalue.ThreeDS2ServiceInitializationCallback = m;
                            int m2 = Thread$State$EnumUnboxingLocalUtility.m(i13, charValue, i18, charValue);
                            getparamvalue.cleanup = m2;
                            int i19 = (i17 * charValue) + m2;
                            int i20 = getparamvalue.getWarnings;
                            cArr5[i20] = cArr3[(i16 * charValue) + m];
                            cArr5[i20 + i18] = cArr3[i19];
                            i4 = 1;
                        } else {
                            int i21 = (i16 * charValue) + i13;
                            int i22 = (i17 * charValue) + getparamvalue.ThreeDS2ServiceInitializationCallback;
                            int i23 = getparamvalue.getWarnings;
                            cArr5[i23] = cArr3[i21];
                            i4 = 1;
                            cArr5[i23 + 1] = cArr3[i22];
                        }
                    }
                }
                getparamvalue.getWarnings += 2;
                i7 = i4;
            }
        }
        for (int i24 = 0; i24 < i; i24++) {
            cArr5[i24] = (char) (cArr5[i24] ^ 13722);
        }
        objArr[0] = new String(cArr5);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, short s, Object[] objArr) {
        int i3;
        int i4;
        int i5 = (i2 * 3) + 1;
        int i6 = (i * 2) + 117;
        int i7 = s + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i8 = i6;
            i6 = i5;
            i4 = 0;
            i6 += i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7++;
            i8 = bArr[i7];
            i6 += i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{14, -20, -118, 72};
        $$b = 94;
    }

    public static void initialize() {
        ThreeDS2Service = new char[]{37970, 37907, 37928, 37921, 37902, 37959, 37910, 37908, 37897, 37913, 37978, 37906, 37901, 37927, 37915, 37974, 37939, 37972, 37918, 37945, 37919, 37971, 37896, 37903, 37917, 37973, 37909, 37890, 37900, 37895, 37891, 37951, 37889, 37916, 37911, 37898};
        getWarnings = (char) 41446;
    }

    public Object ThreeDS2Service(int i) {
        getSDKVersion = (ThreeDS2ServiceInstance + 11) % 128;
        try {
            Object obj = this.get.get(i);
            Process.myPid();
            Process.myPid();
            obj.toString();
            ThreeDS2ServiceInstance = (getSDKVersion + 31) % 128;
            return obj;
        } catch (JSONException unused) {
            no noVar = initialize;
            Object[] objArr = new Object[1];
            a((byte) (51 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), "\u000e\n\u000b\u0014\u0016\b\u001b\b\u000b\u0015㘛㘛\u0015\u0013\u0006\u0010\b\u0017\b\u000b\u0015\u001a\n\u001c\u000f\b\u0005\u0002\u0006\u0019\t\u0004#\u001a\u000e\u0010\u0010\u001c\u0016\u0002\u0012\u0017\r\u0007\u0006\u0019\u000b\b\u0012\u000b㘩", 51 - TextUtils.getOffsetBefore("", 0), objArr);
            noVar.ThreeDS2ServiceInstance(((String) objArr[0]).intern(), Integer.valueOf(i));
            return null;
        }
    }

    public JSONArray ThreeDS2ServiceInstance() {
        int i = (getSDKVersion + 45) % 128;
        ThreeDS2ServiceInstance = i;
        JSONArray jSONArray = this.get;
        getSDKVersion = (i + 29) % 128;
        return jSONArray;
    }

    public List<Object> get() {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.get.length(); i++) {
                ThreeDS2ServiceInstance = (getSDKVersion + 55) % 128;
                Object obj = this.get.get(i);
                if (obj instanceof JSONArray) {
                    obj = get((JSONArray) obj).get();
                } else if (obj instanceof JSONObject) {
                    int i2 = getSDKVersion + 59;
                    ThreeDS2ServiceInstance = i2 % 128;
                    if (i2 % 2 != 0) {
                        nq.initialize((JSONObject) obj).initialize();
                        throw null;
                    }
                    obj = nq.initialize((JSONObject) obj).initialize();
                    getSDKVersion = (ThreeDS2ServiceInstance + 7) % 128;
                }
                arrayList.add(obj);
            }
            return arrayList;
        } catch (JSONException e) {
            throw setTextAlignment.getParamValue.initialize(e);
        }
    }

    public String getWarnings(int i) {
        String optString;
        ThreeDS2ServiceInstance = (getSDKVersion + 31) % 128;
        if (this.get.isNull(i)) {
            int i2 = ThreeDS2ServiceInstance + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            getSDKVersion = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            optString = null;
        } else {
            optString = this.get.optString(i, null);
        }
        if (!oj.getWarnings((CharSequence) optString)) {
            ViewConfiguration.getPressedStateDuration();
            TextUtils.lastIndexOf("", '0', 0, 0);
            return optString;
        }
        no noVar = initialize;
        Object[] objArr = new Object[1];
        a((byte) (46 - ((Process.getThreadPriority(0) + 20) >> 6)), "\u0002!\u0019\u0011\b\u0010\t\u000b\u0016 \"\u0005\"\u0006\u0004\u0018\f\b\u0012\u0015\u0000\u0004#\u001a\u000f\u0013", 27 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
        noVar.ThreeDS2ServiceInstance(((String) objArr[0]).intern(), Integer.valueOf(i), optString);
        return null;
    }

    public String toString() {
        int i = getSDKVersion + 119;
        ThreeDS2ServiceInstance = i % 128;
        int i2 = i % 2;
        String jSONArray = this.get.toString();
        if (i2 != 0) {
            int i3 = 16 / 0;
        }
        return jSONArray;
    }

    public void initialize(String str) {
        getSDKVersion = (ThreeDS2ServiceInstance + 19) % 128;
        if (oj.initialize(str)) {
            int i = getSDKVersion + 7;
            ThreeDS2ServiceInstance = i % 128;
            int i2 = i % 2;
            JSONArray jSONArray = this.get;
            if (i2 == 0) {
                jSONArray.put(str);
                ThreeDS2ServiceInstance = (getSDKVersion + 1) % 128;
            } else {
                jSONArray.put(str);
                throw null;
            }
        }
    }

    public static <V> ns initialize(Collection<V> collection) {
        ns nsVar = get(new JSONArray((Collection) collection));
        ThreeDS2ServiceInstance = (getSDKVersion + 11) % 128;
        return nsVar;
    }

    public static ns ThreeDS2Service() {
        getSDKVersion = (ThreeDS2ServiceInstance + 19) % 128;
        ns nsVar = get((JSONArray) null);
        getSDKVersion = (ThreeDS2ServiceInstance + 5) % 128;
        return nsVar;
    }

    public void ThreeDS2Service(nq nqVar) {
        if (og.getWarnings(nqVar)) {
            getSDKVersion = (ThreeDS2ServiceInstance + 107) % 128;
            this.get.put(nqVar.ThreeDS2Service());
        }
        int i = getSDKVersion + 7;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static ns getWarnings(String str) {
        try {
            ns nsVar = get(new JSONArray(str));
            getSDKVersion = (ThreeDS2ServiceInstance + 49) % 128;
            return nsVar;
        } catch (JSONException e) {
            throw setTextAlignment.getParamValue.initialize(e);
        }
    }

    public nq get(int i) {
        JSONObject optJSONObject;
        int i2;
        int i3 = getSDKVersion + 11;
        ThreeDS2ServiceInstance = i3 % 128;
        int i4 = i3 % 2;
        JSONArray jSONArray = this.get;
        if (i4 != 0) {
            optJSONObject = jSONArray.optJSONObject(i);
            i2 = 1;
        } else {
            optJSONObject = jSONArray.optJSONObject(i);
            i2 = 0;
        }
        TextUtils.getOffsetAfter("", i2);
        ViewConfiguration.getMaximumFlingVelocity();
        nq initialize2 = nq.initialize(optJSONObject);
        int i5 = getSDKVersion + 55;
        ThreeDS2ServiceInstance = i5 % 128;
        if (i5 % 2 == 0) {
            return initialize2;
        }
        throw null;
    }

    public int getWarnings() {
        ThreeDS2ServiceInstance = (getSDKVersion + 81) % 128;
        int length = this.get.length();
        getSDKVersion = (ThreeDS2ServiceInstance + 35) % 128;
        return length;
    }

    public void getWarnings(int i, nq nqVar) {
        getSDKVersion = (ThreeDS2ServiceInstance + 17) % 128;
        if (og.getWarnings(nqVar)) {
            getSDKVersion = (ThreeDS2ServiceInstance + 105) % 128;
            try {
                this.get.put(i, nqVar.ThreeDS2Service());
                ThreeDS2ServiceInstance = (getSDKVersion + 23) % 128;
            } catch (JSONException unused) {
                no noVar = initialize;
                Object[] objArr = new Object[1];
                a((byte) (111 - TextUtils.indexOf("", "", 0)), "\u0014\u0019\u0012\u000b\u0016\u0006\b\u0019\n\u0010\u0015\u001a\u0015\b\u0016\u0005\u0016\b\u0005\u001d\n\u0010\u001d \u0015\u0017\u0010\u0002\u0002\u0019\b\u000b \u001b\u001c\u0010\u0007\r\u0013\u0015\u001c\u001a\u001a\u0010\u000b\u0012\u0016\b \u0011\u0004\u0013\t\u0004#\u001a\u000e\u0010㘩㘩\u0002!\u0019\u0011㘣", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 64, objArr);
                noVar.ThreeDS2ServiceInstance(((String) objArr[0]).intern(), Integer.valueOf(i), nqVar);
            }
        }
    }

    public static ns get(JSONArray jSONArray) {
        ns nsVar = new ns((JSONArray) og.ThreeDS2Service(jSONArray, new JSONArray()));
        ThreeDS2ServiceInstance = (getSDKVersion + 21) % 128;
        return nsVar;
    }
}
