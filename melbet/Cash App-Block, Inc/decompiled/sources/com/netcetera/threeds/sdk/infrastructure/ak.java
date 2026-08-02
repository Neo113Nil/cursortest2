package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class ak extends loadFromXML<EditText> implements View.OnTouchListener, containsValue {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int[] ConfigurationBuilder;
    private static int SchemeConfiguration;
    private static final String ThreeDS2Service;
    private static final String ThreeDS2ServiceInitializationCallback;
    private static final String ThreeDS2ServiceInstance;
    private static int amexConfiguration;
    private static boolean build;
    private static final String cleanup;
    private static final String get;
    private static final String getWarnings;
    private static int mastercardSchemeConfiguration;
    private static char[] removeParam;
    private static boolean visaSchemeConfiguration;
    private final String ConfigParameters;
    private final String addParam;
    private boolean apiKey;
    private boolean configureScheme;
    private final String createTransaction;
    private Drawable getParamValue;
    private final String getSDKInfo;
    private final jq getSDKVersion;
    private Drawable onCompleted;
    private EditText onError;
    private boolean restrictedParameters;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        amexConfiguration = 0;
        mastercardSchemeConfiguration = 1;
        get();
        Object[] objArr = new Object[1];
        a(new int[]{-723461218, -610847415, 1456674554, -1137189846, 202454733, -2029744860, -459022401, 1292878423, -1295559196, -568210418, 1814800087, -1040594337, -167836466, 949558856, -1799292705, -1132027487, 288176082, 1927192558, -2138236725, 1578564852, 1743145715, 958260954, -761940780, 1673212108}, Color.argb(0, 0, 0, 0) + 46, objArr);
        ThreeDS2ServiceInitializationCallback = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(null, null, 127 - ((Process.getThreadPriority(0) + 20) >> 6), "\u0085\u0084\u0096\u008d\u0093\u0095\u0093\u008c\u0082\u008c\u0094\u008f\u008e\u008c\u008b\u0093\u008b\u0085\u0092\u0091\u0085\u0090\u008f\u008e\u008d\u0086\u008c\u008b\u008a\u0093\u0098\u0097\u0097\u0085\u0096\u0087\u0086\u0085\u0084\u0083\u0083\u0082\u0081", objArr2);
        cleanup = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b(null, null, 127 - ExpandableListView.getPackedPositionGroup(0L), "\u0085\u0084\u0096\u008d\u0093\u0095\u0093\u008c\u0082\u008c\u0094\u008f\u008e\u008c\u008b\u0093\u008b\u0085\u0092\u0091\u0085\u0090\u008f\u008e\u008d\u0086\u008c\u008b\u008a\u0089\u0083\u0082\u0088\u0087\u0086\u0085\u0084\u0083\u0083\u0082\u0081", objArr3);
        ThreeDS2Service = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(new int[]{-723461218, -610847415, 1456674554, -1137189846, 202454733, -2029744860, -459022401, 1292878423, -1295559196, -568210418, 1814800087, -1040594337, -167836466, 949558856, -1799292705, -1132027487, 288176082, 1927192558, -2138236725, 1578564852, -767044125, 599099300, -1985992119, 940488795}, 46 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr4);
        ThreeDS2ServiceInstance = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(new int[]{-723461218, -610847415, 1456674554, -1137189846, 202454733, -2029744860, -459022401, 1292878423, -1295559196, -568210418, 1814800087, -1040594337, -167836466, 949558856, -1799292705, -1132027487, 225672227, 1437722618, -1681005854, -758639113, 1566741306, -1876452957}, 43 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr5);
        getWarnings = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(new int[]{-723461218, -610847415, 1456674554, -1137189846, 2087279670, 1497554843, -27284894, 1860055472, -144686497, -542713132, -97644277, -2017765509, 1536877384, 60676939, -170224569, -138971130, -1811536490, -490447066, 1801849213, -243185131, 1391968584, -957343660}, 41 - Color.red(0), objArr6);
        get = ((String) objArr6[0]).intern();
        amexConfiguration = (mastercardSchemeConfiguration + 65) % 128;
    }

    public ak(Context context, jq jqVar, String str, String str2, String str3, String str4) {
        super(context);
        this.configureScheme = false;
        this.apiKey = false;
        this.restrictedParameters = false;
        this.getSDKVersion = jqVar;
        this.createTransaction = str;
        this.getSDKInfo = str2;
        this.addParam = str3;
        this.ConfigParameters = str4;
    }

    private void ThreeDS2Service(boolean z) {
        Drawable drawable;
        int i = mastercardSchemeConfiguration;
        int i2 = i + 55;
        amexConfiguration = i2 % 128;
        if (i2 % 2 != 0) {
            this.apiKey = z;
            throw null;
        }
        this.apiKey = z;
        if (z) {
            drawable = this.onCompleted;
        } else {
            drawable = this.getParamValue;
            amexConfiguration = (i + 71) % 128;
        }
        this.onError.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        this.onError.setCompoundDrawablePadding(es.ThreeDS2Service);
        ThreeDS2ServiceInstance(this.apiKey);
    }

    public static ak ThreeDS2ServiceInstance(Context context, jq jqVar) {
        Object[] objArr = new Object[1];
        a(new int[]{-723461218, -610847415, 1456674554, -1137189846, 2087279670, 1497554843, -27284894, 1860055472, -144686497, -542713132, -97644277, -2017765509, 1536877384, 60676939, -170224569, -138971130, -1811536490, -490447066, 1801849213, -243185131, 1391968584, -957343660}, 40 - MotionEvent.axisFromString(""), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new int[]{-723461218, -610847415, 1456674554, -1137189846, 202454733, -2029744860, -459022401, 1292878423, -1295559196, -568210418, 1814800087, -1040594337, -167836466, 949558856, -1799292705, -1132027487, 225672227, 1437722618, -1681005854, -758639113, 1566741306, -1876452957}, 43 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr2);
        String intern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new int[]{-723461218, -610847415, 1456674554, -1137189846, 202454733, -2029744860, -459022401, 1292878423, -1295559196, -568210418, 1814800087, -1040594337, -167836466, 949558856, -1799292705, -1132027487, 288176082, 1927192558, -2138236725, 1578564852, -767044125, 599099300, -1985992119, 940488795}, TextUtils.lastIndexOf("", '0', 0) + 47, objArr3);
        String intern3 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(new int[]{892928148, -1688835959, -1423100428, -1814962314, 1883345115, 95841368, 1314976189, -312763879, -377812859, -1751098567, -1780515174, -1059857743, 858316291, 889628998, 900224315, 2146054559, -345833550, 1469303237, -1575796985, 475400586, -311934699, -343251806}, 42 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr4);
        ak akVar = new ak(context, jqVar, intern, intern2, intern3, ((String) objArr4[0]).intern());
        int i = mastercardSchemeConfiguration + 41;
        amexConfiguration = i % 128;
        if (i % 2 == 0) {
            return akVar;
        }
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        int i2;
        int length;
        int[] iArr2;
        int[] iArr3;
        int i3;
        int[] iArr4;
        char[] cArr;
        int i4;
        Object method;
        int i5;
        char[] cArr2;
        int[] iArr5;
        int i6;
        Object method2;
        createTransaction createtransaction = new createTransaction();
        char[] cArr3 = new char[4];
        char[] cArr4 = new char[iArr.length * 2];
        int[] iArr6 = ConfigurationBuilder;
        Class cls = Integer.TYPE;
        int i7 = 2;
        if (iArr6 != null) {
            int length2 = iArr6.length;
            int[] iArr7 = new int[length2];
            $10 = ($11 + 31) % 128;
            int i8 = 0;
            while (i8 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr6[i8])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(2095751688);
                    if (obj != null) {
                        i5 = length2;
                        cArr2 = cArr3;
                        iArr5 = iArr6;
                        i6 = i8;
                        method2 = obj;
                    } else {
                        i5 = length2;
                        cArr2 = cArr3;
                        Class cls2 = (Class) removeParam.initialize(63 - TextUtils.lastIndexOf("", '0'), (char) Drawable.resolveOpacity(0, 0), 1196 - ExpandableListView.getPackedPositionChild(0L));
                        Object[] objArr3 = new Object[1];
                        iArr5 = iArr6;
                        i6 = i8;
                        c((short) 0, -1, (short) 5, objArr3);
                        method2 = cls2.getMethod((String) objArr3[0], cls);
                        map.put(2095751688, method2);
                    }
                    iArr7[i6] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                    i8 = i6 + 1;
                    length2 = i5;
                    cArr3 = cArr2;
                    iArr6 = iArr5;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr6 = iArr7;
        }
        char[] cArr5 = cArr3;
        int length3 = iArr6.length;
        int[] iArr8 = new int[length3];
        int[] iArr9 = ConfigurationBuilder;
        if (iArr9 != null) {
            int i9 = $11 + 39;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                length = iArr9.length;
                iArr2 = new int[length];
            } else {
                length = iArr9.length;
                iArr2 = new int[length];
            }
            int i10 = 0;
            while (i10 < length) {
                Object[] objArr4 = {Integer.valueOf(iArr9[i10])};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj2 = map2.get(2095751688);
                if (obj2 != null) {
                    cArr = cArr4;
                    method = obj2;
                    iArr3 = iArr9;
                    i3 = length;
                    iArr4 = iArr2;
                    i4 = i10;
                } else {
                    iArr3 = iArr9;
                    i3 = length;
                    iArr4 = iArr2;
                    Class cls3 = (Class) removeParam.initialize((ViewConfiguration.getPressedStateDuration() >> 16) + 64, (char) ((ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) - 1), (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 1196);
                    Object[] objArr5 = new Object[1];
                    cArr = cArr4;
                    i4 = i10;
                    c((short) 0, -1, (short) 5, objArr5);
                    method = cls3.getMethod((String) objArr5[0], cls);
                    map2.put(2095751688, method);
                }
                iArr4[i4] = ((Integer) ((Method) method).invoke(null, objArr4)).intValue();
                i10 = i4 + 1;
                cArr4 = cArr;
                iArr9 = iArr3;
                length = i3;
                iArr2 = iArr4;
            }
            iArr9 = iArr2;
        }
        char[] cArr6 = cArr4;
        int i11 = 16;
        System.arraycopy(iArr9, 0, iArr8, 0, length3);
        createtransaction.initialize = 0;
        $11 = ($10 + 89) % 128;
        while (true) {
            int i12 = createtransaction.initialize;
            if (i12 >= iArr.length) {
                objArr[0] = new String(cArr6, 0, i);
                return;
            }
            int i13 = iArr[i12];
            char c = (char) (i13 >> 16);
            cArr5[0] = c;
            char c2 = (char) i13;
            cArr5[1] = c2;
            char c3 = (char) (iArr[i12 + 1] >> 16);
            cArr5[i7] = c3;
            char c4 = (char) iArr[i12 + 1];
            cArr5[3] = c4;
            createtransaction.getWarnings = (c << 16) + c2;
            createtransaction.get = (c3 << 16) + c4;
            createTransaction.ThreeDS2ServiceInstance(iArr8);
            int i14 = 0;
            while (true) {
                i2 = createtransaction.getWarnings;
                if (i14 >= i11) {
                    break;
                }
                int i15 = i2 ^ iArr8[i14];
                createtransaction.getWarnings = i15;
                int ThreeDS2Service2 = createTransaction.ThreeDS2Service(i15);
                Object[] objArr6 = new Object[4];
                objArr6[3] = createtransaction;
                objArr6[i7] = createtransaction;
                objArr6[1] = Integer.valueOf(ThreeDS2Service2);
                objArr6[0] = createtransaction;
                Map map3 = removeParam.visaSchemeConfiguration;
                Object obj3 = map3.get(-411264147);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(Color.green(0) + 49, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 13121)).getMethod("y", Object.class, cls, Object.class, Object.class);
                    map3.put(-411264147, obj3);
                }
                int intValue = ((Integer) ((Method) obj3).invoke(null, objArr6)).intValue();
                createtransaction.getWarnings = createtransaction.get;
                createtransaction.get = intValue;
                i14++;
                i11 = 16;
            }
            int i16 = createtransaction.get;
            createtransaction.getWarnings = i16;
            createtransaction.get = i2;
            i11 = 16;
            int i17 = i2 ^ iArr8[16];
            createtransaction.get = i17;
            int i18 = i16 ^ iArr8[17];
            createtransaction.getWarnings = i18;
            cArr5[0] = (char) (i18 >>> 16);
            cArr5[1] = (char) i18;
            cArr5[i7] = (char) (i17 >>> 16);
            cArr5[3] = (char) i17;
            createTransaction.ThreeDS2ServiceInstance(iArr8);
            int i19 = createtransaction.initialize;
            cArr6[i19 * 2] = cArr5[0];
            cArr6[(i19 * 2) + 1] = cArr5[1];
            cArr6[(i19 * 2) + 2] = cArr5[i7];
            cArr6[(i19 * 2) + 3] = cArr5[3];
            int i20 = i7;
            Object[] objArr7 = new Object[i20];
            objArr7[1] = createtransaction;
            objArr7[0] = createtransaction;
            Map map4 = removeParam.visaSchemeConfiguration;
            Object obj4 = map4.get(-1870831722);
            if (obj4 == null) {
                Class cls4 = (Class) removeParam.initialize(100 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) TextUtils.getTrimmedLength(""), TextUtils.indexOf("", "") + 1880);
                Object[] objArr8 = new Object[1];
                c((short) 0, -1, (short) 0, objArr8);
                obj4 = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                map4.put(-1870831722, obj4);
            }
            ((Method) obj4).invoke(null, objArr7);
            i7 = i20;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.netcetera.threeds.sdk.infrastructure.ak] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.netcetera.threeds.sdk.infrastructure.loadFromXML] */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.graphics.drawable.Drawable] */
    private Drawable at_(Context context, String str) {
        Resources resources;
        String intern;
        String packageName;
        int i = mastercardSchemeConfiguration + 73;
        amexConfiguration = i % 128;
        try {
            if (i % 2 != 0) {
                resources = context.getResources();
                Object[] objArr = new Object[1];
                b(null, null, 71 % TextUtils.lastIndexOf("", 'F', 0), "\u0093\u0098\u009b\u0082\u0084\u0082\u0086\u0087", objArr);
                intern = ((String) objArr[0]).intern();
                packageName = context.getPackageName();
            } else {
                resources = context.getResources();
                Object[] objArr2 = new Object[1];
                b(null, null, 126 - TextUtils.lastIndexOf("", '0', 0), "\u0093\u0098\u009b\u0082\u0084\u0082\u0086\u0087", objArr2);
                intern = ((String) objArr2[0]).intern();
                packageName = context.getPackageName();
            }
            this = context.getDrawable(resources.getIdentifier(str, intern, packageName));
            int i2 = amexConfiguration + 67;
            mastercardSchemeConfiguration = i2 % 128;
            if (i2 % 2 != 0) {
                return this;
            }
            throw null;
        } catch (Throwable th) {
            no noVar = this.initialize;
            Object[] objArr3 = new Object[1];
            a(new int[]{1742146756, 1061625036, 1948828902, -822052463, 226971432, -936314109, -1346775348, -1949090878, -1163292579, -418547308, 1774266170, 1549017441, -1782704764, 875293838, 25498329, 1691959837, 1815403152, -550608060}, Color.blue(0) + 36, objArr3);
            noVar.initialize(String.format(((String) objArr3[0]).intern(), str, th.getMessage()));
            return null;
        }
    }

    private static void b(String str, int[] iArr, int i, String str2, Object[] objArr) {
        char[] cArr;
        int i2;
        int i3;
        char[] cArr2;
        char c;
        char[] cArr3;
        Class cls;
        char[] cArr4;
        int i4;
        Object method;
        String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            $10 = ($11 + 35) % 128;
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            $10 = ($11 + 45) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr5 = cArr;
        onError onerror = new onError();
        char[] cArr6 = removeParam;
        Class cls2 = Integer.TYPE;
        if (cArr6 != null) {
            int i5 = ($10 + 119) % 128;
            $11 = i5;
            int length = cArr6.length;
            char[] cArr7 = new char[length];
            $10 = (i5 + 95) % 128;
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr6[i6])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-939298638);
                    if (obj != null) {
                        cArr3 = cArr6;
                        cArr4 = cArr7;
                        i4 = i6;
                        method = obj;
                        cls = cls2;
                    } else {
                        cArr3 = cArr6;
                        cls = cls2;
                        Class cls3 = (Class) removeParam.initialize(72 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (ViewConfiguration.getPressedStateDuration() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1406);
                        Object[] objArr3 = new Object[1];
                        cArr4 = cArr7;
                        i4 = i6;
                        c((short) 0, -1, (short) 10, objArr3);
                        method = cls3.getMethod((String) objArr3[0], cls);
                        map.put(-939298638, method);
                    }
                    cArr4[i4] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i6 = i4 + 1;
                    cls2 = cls;
                    cArr6 = cArr3;
                    cArr7 = cArr4;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr6 = cArr7;
        }
        Class cls4 = cls2;
        Object[] objArr4 = {Integer.valueOf(SchemeConfiguration)};
        Map map2 = removeParam.visaSchemeConfiguration;
        Object obj2 = map2.get(-1598850155);
        if (obj2 == null) {
            Class cls5 = (Class) removeParam.initialize(73 - Drawable.resolveOpacity(0, 0), (char) (View.resolveSizeAndState(0, 0, 0) + 7530), 2489 - (ViewConfiguration.getFadingEdgeLength() >> 16));
            Object[] objArr5 = new Object[1];
            c((short) 0, -1, (short) 9, objArr5);
            obj2 = cls5.getMethod((String) objArr5[0], cls4);
            map2.put(-1598850155, obj2);
        }
        int intValue = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
        char c2 = '0';
        if (build) {
            int length2 = bArr2.length;
            onerror.ThreeDS2ServiceInstance = length2;
            char[] cArr8 = new char[length2];
            onerror.getWarnings = 0;
            while (true) {
                int i7 = onerror.getWarnings;
                int i8 = onerror.ThreeDS2ServiceInstance;
                if (i7 >= i8) {
                    objArr[0] = new String(cArr8);
                    return;
                }
                cArr8[i7] = (char) (cArr6[bArr2[(i8 - 1) - i7] + i] - intValue);
                Object[] objArr6 = {onerror, onerror};
                Map map3 = removeParam.visaSchemeConfiguration;
                Object obj3 = map3.get(73542081);
                if (obj3 != null) {
                    c = c2;
                } else {
                    c = c2;
                    obj3 = ((Class) removeParam.initialize(TextUtils.lastIndexOf("", c2) + 49, (char) (ViewConfiguration.getEdgeSlop() >> 16), 11441 - TextUtils.getOffsetAfter("", 0))).getMethod("k", Object.class, Object.class);
                    map3.put(73542081, obj3);
                }
                ((Method) obj3).invoke(null, objArr6);
                c2 = c;
            }
        } else if (visaSchemeConfiguration) {
            int i9 = $10 + 119;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                int length3 = cArr5.length;
                onerror.ThreeDS2ServiceInstance = length3;
                cArr2 = new char[length3];
                onerror.getWarnings = 1;
            } else {
                int length4 = cArr5.length;
                onerror.ThreeDS2ServiceInstance = length4;
                cArr2 = new char[length4];
                onerror.getWarnings = 0;
            }
            while (true) {
                int i10 = onerror.getWarnings;
                int i11 = onerror.ThreeDS2ServiceInstance;
                if (i10 >= i11) {
                    objArr[0] = new String(cArr2);
                    return;
                }
                cArr2[i10] = (char) (cArr6[cArr5[(i11 - 1) - i10] - i] - intValue);
                Object[] objArr7 = {onerror, onerror};
                Map map4 = removeParam.visaSchemeConfiguration;
                Object obj4 = map4.get(73542081);
                if (obj4 == null) {
                    obj4 = ((Class) removeParam.initialize(48 - KeyEvent.getDeadChar(0, 0), (char) (Process.myTid() >> 22), 11441 - View.MeasureSpec.getSize(0))).getMethod("k", Object.class, Object.class);
                    map4.put(73542081, obj4);
                }
                ((Method) obj4).invoke(null, objArr7);
            }
        } else {
            int i12 = 0;
            int length5 = iArr.length;
            onerror.ThreeDS2ServiceInstance = length5;
            char[] cArr9 = new char[length5];
            while (true) {
                onerror.getWarnings = i12;
                while (true) {
                    i2 = onerror.getWarnings;
                    i3 = onerror.ThreeDS2ServiceInstance;
                    if (i2 >= i3) {
                        objArr[0] = new String(cArr9);
                        return;
                    }
                    int i13 = $11 + 29;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        break;
                    }
                    cArr9[i2] = (char) (cArr6[iArr[(i3 - 1) - i2] - i] - intValue);
                    onerror.getWarnings = i2 + 1;
                }
                cArr9[i2] = (char) (cArr6[iArr[i3 >>> i2] >> i] >> intValue);
                i12 = 0;
            }
        }
    }

    private static void c(short s, int i, short s2, Object[] objArr) {
        int i2 = s * 2;
        int i3 = 118 - s2;
        byte[] bArr = $$a;
        int i4 = i + 4;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = i4 + i2;
            i4 = i4;
            bArr = bArr;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            int i7 = i4 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i2) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte[] bArr3 = bArr;
            i3 = bArr[i7] + i3;
            i4 = i7;
            bArr = bArr3;
            i5 = i6;
        }
    }

    public static void get() {
        ConfigurationBuilder = new int[]{-1732773087, 145599074, 782075588, 1869334742, -712805922, -781673188, 819128941, 1195490682, -136242681, -1383220598, 1014180779, -813733310, 616539960, 1521166562, -938679784, 1999225125, 1751450848, -549816039};
        removeParam = new char[]{15193, 15144, 15166, 15154, 15162, 15167, 15149, 15172, 15142, 15180, 15163, 15165, 15152, 15196, 15136, 15182, 15140, 15161, 15148, 15198, 15174, 15197, 15138, 15141, 15150, 15146, 15151};
        SchemeConfiguration = 993475465;
        visaSchemeConfiguration = true;
        build = true;
    }

    public static void init$0() {
        $$a = new byte[]{78, -119, -4, 27};
        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE;
    }

    public static /* synthetic */ Object initialize(Object[] objArr, int i, int i2, int i3) {
        Context context = (Context) objArr[0];
        jq jqVar = (jq) objArr[1];
        Object[] objArr2 = new Object[1];
        b(null, null, Gravity.getAbsoluteGravity(0, 0) + 127, "\u0085\u0084\u0096\u008d\u0093\u0095\u0093\u008c\u0082\u008c\u0094\u008f\u008e\u008c\u008b\u0093\u008b\u0085\u0092\u0091\u0085\u0090\u008f\u008e\u008d\u0086\u008c\u008b\u008a\u0089\u0083\u0082\u0088\u0087\u0086\u0085\u0084\u0083\u0083\u0082\u0081", objArr2);
        String intern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b(null, null, 126 - Process.getGidForName(""), "\u0085\u0084\u0096\u008d\u0093\u0095\u0093\u008c\u0082\u008c\u0094\u008f\u008e\u008c\u008b\u0093\u008b\u0085\u0092\u0091\u0085\u0090\u008f\u008e\u008d\u0086\u008c\u008b\u008a\u0093\u0098\u0097\u0097\u0085\u0096\u0087\u0086\u0085\u0084\u0083\u0083\u0082\u0081", objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(new int[]{-723461218, -610847415, 1456674554, -1137189846, 202454733, -2029744860, -459022401, 1292878423, -1295559196, -568210418, 1814800087, -1040594337, -167836466, 949558856, -1799292705, -1132027487, 288176082, 1927192558, -2138236725, 1578564852, 1743145715, 958260954, -761940780, 1673212108}, 46 - ExpandableListView.getPackedPositionType(0L), objArr4);
        String intern3 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(new int[]{892928148, -1688835959, -1423100428, -1814962314, 1883345115, 95841368, 1314976189, -312763879, -377812859, -1751098567, -1780515174, -1059857743, 858316291, 889628998, 900224315, 2146054559, -2085062338, 650672012, -1575796985, 475400586, -311934699, -343251806}, 42 - KeyEvent.normalizeMetaState(0), objArr5);
        ak akVar = new ak(context, jqVar, intern, intern2, intern3, ((String) objArr5[0]).intern());
        mastercardSchemeConfiguration = (amexConfiguration + 27) % 128;
        return akVar;
    }

    public EditText as_(Context context) {
        Object[] objArr = new Object[1];
        a(new int[]{876882848, 1264508059, -775444602, -1887576753, 1833893696, -978616880, 1455938587, -1087194693, -906809733, 1094118760, -1270053608, 526480192, 1471922961, -2002180808}, 26 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
        this.getParamValue = at_(context, ((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        b(null, null, TextUtils.indexOf("", "") + 127, "\u0087\u0093\u0089\u0083\u0082\u0091\u009a\u0093\u0098\u0097\u0097\u0085\u008c\u009a\u0087\u0086\u0085\u0084\u0083\u0083\u0082\u0092\u009a\u0099\u008f", objArr2);
        this.onCompleted = at_(context, ((String) objArr2[0]).intern());
        EditText editText = new EditText(context);
        this.onError = editText;
        editText.setLayoutParams((LinearLayout.LayoutParams) eu.ThreeDS2Service(new Object[0], -691514327, 691514327, (int) System.currentTimeMillis()));
        EditText editText2 = this.onError;
        int i = es.getWarnings;
        editText2.setPadding(i, 0, i, 0);
        this.onError.setSingleLine(true);
        this.onError.setFilters(new InputFilter[]{new InputFilter.LengthFilter(45)});
        this.onError.setMinHeight(es.getSDKInfo);
        this.onError.setInputType(524432);
        getWarnings(this.onError, this.ConfigParameters);
        et.getWarnings(new Object[]{this.onError, this.getSDKVersion}, -297979556, 297979556, (int) System.currentTimeMillis());
        EditText editText3 = this.onError;
        int i2 = mastercardSchemeConfiguration + 95;
        amexConfiguration = i2 % 128;
        if (i2 % 2 == 0) {
            return editText3;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    public void getWarnings(er erVar) {
        mastercardSchemeConfiguration = (amexConfiguration + 27) % 128;
        initialize();
        boolean booleanValue = erVar.getWarnings(this.createTransaction, false).booleanValue();
        boolean booleanValue2 = erVar.getWarnings(this.getSDKInfo, false).booleanValue();
        this.restrictedParameters = erVar.getWarnings(this.addParam, false).booleanValue();
        ThreeDS2ServiceInstance(booleanValue);
        if (this.restrictedParameters) {
            ThreeDS2Service(booleanValue2);
            amexConfiguration = (mastercardSchemeConfiguration + 43) % 128;
        }
        amexConfiguration = (mastercardSchemeConfiguration + 95) % 128;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i = mastercardSchemeConfiguration + 67;
        amexConfiguration = i % 128;
        if (i % 2 == 0 ? motionEvent.getAction() == 1 : motionEvent.getAction() == 0) {
            if (this.onError.getCompoundDrawables()[2] != null) {
                if (motionEvent.getRawX() >= this.onError.getRight() - r4.getBounds().width()) {
                    ThreeDS2Service(!this.apiKey);
                    return true;
                }
            }
        }
        int i2 = amexConfiguration + 115;
        mastercardSchemeConfiguration = i2 % 128;
        if (i2 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.writeReplace
    public void ThreeDS2Service(setScroller setscroller) {
        mastercardSchemeConfiguration = (amexConfiguration + 79) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    public void getWarnings(eq eqVar) {
        amexConfiguration = (mastercardSchemeConfiguration + 97) % 128;
        eqVar.get(this.createTransaction, this.configureScheme);
        eqVar.get(this.getSDKInfo, this.apiKey);
        eqVar.get(this.addParam, this.restrictedParameters);
        int i = amexConfiguration + 69;
        mastercardSchemeConfiguration = i % 128;
        if (i % 2 == 0) {
            int i2 = 77 / 0;
        }
    }

    public void getWarnings() {
        int i = amexConfiguration + 99;
        mastercardSchemeConfiguration = i % 128;
        if (i % 2 == 0) {
            this.restrictedParameters = false;
        } else {
            this.restrictedParameters = true;
        }
        ThreeDS2Service(true);
        this.onError.setOnTouchListener(this);
        mastercardSchemeConfiguration = (amexConfiguration + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.loadFromXML
    public /* synthetic */ EditText ThreeDS2ServiceInstance(Context context) {
        amexConfiguration = (mastercardSchemeConfiguration + 83) % 128;
        EditText as_ = as_(context);
        int i = mastercardSchemeConfiguration + 87;
        amexConfiguration = i % 128;
        if (i % 2 == 0) {
            return as_;
        }
        throw null;
    }

    public void ThreeDS2ServiceInstance() {
        mastercardSchemeConfiguration = (amexConfiguration + 45) % 128;
        ThreeDS2ServiceInstance(true);
        amexConfiguration = (mastercardSchemeConfiguration + 33) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        r1 = android.text.method.PasswordTransformationMethod.getInstance();
        com.netcetera.threeds.sdk.infrastructure.ak.mastercardSchemeConfiguration = (com.netcetera.threeds.sdk.infrastructure.ak.amexConfiguration + 63) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r3.configureScheme != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r3.configureScheme != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003a, code lost:
    
        r1 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void ThreeDS2ServiceInstance(boolean z) {
        int selectionEnd;
        EditText editText;
        PasswordTransformationMethod passwordTransformationMethod;
        int i = amexConfiguration + 17;
        mastercardSchemeConfiguration = i % 128;
        if (i % 2 == 0) {
            this.configureScheme = z;
            selectionEnd = this.onError.getSelectionEnd();
            editText = this.onError;
            int i2 = 66 / 0;
        } else {
            this.configureScheme = z;
            selectionEnd = this.onError.getSelectionEnd();
            editText = this.onError;
        }
        editText.setTransformationMethod(passwordTransformationMethod);
        if (selectionEnd >= 0) {
            mastercardSchemeConfiguration = (amexConfiguration + 15) % 128;
            this.onError.setSelection(selectionEnd);
        }
    }
}
