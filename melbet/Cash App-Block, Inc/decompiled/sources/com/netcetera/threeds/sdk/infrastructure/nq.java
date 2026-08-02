package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class nq {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] ThreeDS2ServiceInstance;
    private static int get;
    private static int getWarnings;
    private static final no initialize;
    private final JSONObject ThreeDS2Service;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        get = 0;
        getWarnings = 1;
        getWarnings();
        initialize = (no) nu.initialize(new Object[]{nq.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
        getWarnings = (get + 83) % 128;
    }

    private nq(JSONObject jSONObject) {
        this.ThreeDS2Service = jSONObject;
    }

    private static void a(boolean z, int[] iArr, String str, Object[] objArr) {
        int i;
        char[] cArr;
        char[] cArr2;
        int i2;
        int i3;
        char[] cArr3;
        int i4;
        char[] cArr4;
        Object method;
        String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            byte[] bytes = str2.getBytes("ISO-8859-1");
            $11 = ($10 + 19) % 128;
            bArr = bytes;
        }
        byte[] bArr2 = bArr;
        cleanup cleanupVar = new cleanup();
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr5 = ThreeDS2ServiceInstance;
        Class cls = Integer.TYPE;
        short s = 0;
        if (cArr5 != null) {
            int length = cArr5.length;
            short s2 = -1;
            char[] cArr6 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    byte[] bArr3 = bArr2;
                    Object[] objArr2 = {Integer.valueOf(cArr5[i9])};
                    int i10 = length;
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-1866317650);
                    if (obj != null) {
                        i3 = i9;
                        cArr3 = cArr6;
                        cArr4 = cArr5;
                        method = obj;
                        i4 = i7;
                    } else {
                        i3 = i9;
                        cArr3 = cArr6;
                        i4 = i7;
                        Class cls2 = (Class) removeParam.initialize(48 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((-1) - ImageFormat.getBitsPerPixel(s)), View.MeasureSpec.getSize(s) + 2295);
                        Object[] objArr3 = new Object[1];
                        cArr4 = cArr5;
                        short s3 = s;
                        b(s3, s2, s3, objArr3);
                        method = cls2.getMethod((String) objArr3[s3], cls);
                        map.put(-1866317650, method);
                    }
                    cArr3[i3] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i9 = i3 + 1;
                    length = i10;
                    bArr2 = bArr3;
                    i7 = i4;
                    cArr6 = cArr3;
                    cArr5 = cArr4;
                    s = 0;
                    s2 = -1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr5 = cArr6;
        }
        byte[] bArr4 = bArr2;
        int i11 = i7;
        char[] cArr7 = new char[i6];
        System.arraycopy(cArr5, i5, cArr7, 0, i6);
        if (bArr4 != null) {
            char[] cArr8 = new char[i6];
            cleanupVar.get = 0;
            char c = 0;
            while (true) {
                int i12 = cleanupVar.get;
                if (i12 >= i6) {
                    break;
                }
                $10 = ($11 + 89) % 128;
                if (bArr4[i12] == 1) {
                    Object[] objArr4 = {Integer.valueOf(cArr7[i12]), Integer.valueOf(c)};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj2 = map2.get(715226994);
                    if (obj2 != null) {
                        cArr = cArr7;
                        cArr2 = cArr8;
                        i2 = i12;
                    } else {
                        cArr = cArr7;
                        Class cls3 = (Class) removeParam.initialize(KeyEvent.keyCodeFromString("") + 85, (char) (25857 - Color.green(0)), 1727 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)));
                        Object[] objArr5 = new Object[1];
                        cArr2 = cArr8;
                        i2 = i12;
                        b(0, (short) -1, (short) 1, objArr5);
                        obj2 = cls3.getMethod((String) objArr5[0], cls, cls);
                        map2.put(715226994, obj2);
                    }
                    cArr2[i2] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                    $10 = ($11 + 105) % 128;
                } else {
                    cArr = cArr7;
                    cArr2 = cArr8;
                    Object[] objArr6 = {Integer.valueOf(cArr[i12]), Integer.valueOf(c)};
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(549300883);
                    if (obj3 == null) {
                        obj3 = ((Class) removeParam.initialize(Gravity.getAbsoluteGravity(0, 0) + 66, (char) ((AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 32825), 447 - (ViewConfiguration.getFadingEdgeLength() >> 16))).getMethod("D", cls, cls);
                        map3.put(549300883, obj3);
                    }
                    cArr2[i12] = ((Character) ((Method) obj3).invoke(null, objArr6)).charValue();
                }
                c = cArr2[cleanupVar.get];
                Object[] objArr7 = {cleanupVar, cleanupVar};
                Map map4 = removeParam.visaSchemeConfiguration;
                Object obj4 = map4.get(102334785);
                if (obj4 == null) {
                    obj4 = ((Class) removeParam.initialize(74 - TextUtils.indexOf("", "", 0, 0), (char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 9820)).getMethod("I", Object.class, Object.class);
                    map4.put(102334785, obj4);
                }
                ((Method) obj4).invoke(null, objArr7);
                cArr8 = cArr2;
                cArr7 = cArr;
            }
            cArr7 = cArr8;
        }
        if (i8 > 0) {
            $10 = ($11 + 87) % 128;
            char[] cArr9 = new char[i6];
            i = 0;
            System.arraycopy(cArr7, 0, cArr9, 0, i6);
            int i13 = i6 - i8;
            System.arraycopy(cArr9, 0, cArr7, i13, i8);
            System.arraycopy(cArr9, i8, cArr7, 0, i13);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr10 = new char[i6];
            cleanupVar.get = i;
            while (true) {
                int i14 = cleanupVar.get;
                if (i14 >= i6) {
                    break;
                }
                cArr10[i14] = cArr7[(i6 - i14) - 1];
                cleanupVar.get = i14 + 1;
            }
            cArr7 = cArr10;
        }
        if (i11 > 0) {
            cleanupVar.get = 0;
            while (true) {
                int i15 = cleanupVar.get;
                if (i15 >= i6) {
                    break;
                }
                $11 = ($10 + 61) % 128;
                cArr7[i15] = (char) (cArr7[i15] - iArr[2]);
                cleanupVar.get = i15 + 1;
            }
        }
        objArr[0] = new String(cArr7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, short s2, Object[] objArr) {
        int i2;
        int i3;
        int i4;
        int i5 = (i * 3) + 1;
        ?? r9 = 122 - (s2 * 57);
        int i6 = s + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            byte b = r9;
            i4 = 0;
            int i7 = i6;
            int i8 = i6 + b;
            int i9 = i7;
            i3 = i8;
            i6 = i9;
            i2 = i4;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i3;
            if (i4 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i10 = i6 + 1;
            b = bArr[i10];
            int i11 = i3;
            i7 = i10;
            i6 = i11;
            int i82 = i6 + b;
            int i92 = i7;
            i3 = i82;
            i6 = i92;
            i2 = i4;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i3;
            if (i4 == i5) {
            }
        } else {
            i2 = 0;
            i3 = r9;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i3;
            if (i4 == i5) {
            }
        }
    }

    public static void getWarnings() {
        ThreeDS2ServiceInstance = new char[]{52945, 52844, 52813, 52809, 52808, 52834, 52838, 52815, 52814, 52814, 52809, 52822, 52821, 52813, 52814, 52832, 52867, 52892, 52843, 52840, 52843, 52884, 52834, 52800, 52812, 52810, 52801, 52838, 52839, 52803, 52811, 52847, 52834, 52814, 52837, 52839, 52800, 52808, 52823, 52815, 52838, 52845, 52810, 52801, 52836, 52891, 52812, 52829, 52814, 52892, 52834, 52859, 52861, 53186, 52763, 52762, 53184, 53201, 53186, 53217, 53228, 53184, 53197, 53191, 53186, 53230, 52793, 53217, 53207, 53195, 53199, 53188, 52763, 53220, 53187, 52765, 52767, 53184, 52942, 52924, 52875, 52883, 52884, 52887, 52876, 52876, 52877, 52900, 52954, 52876, 52891, 52874, 52953, 52903, 52877, 52910, 52908, 52876, 52865, 52887, 52874, 52901, 52900, 52877, 52887, 52910, 52954, 52876, 52891, 52874, 52898, 52976, 52899, 52876, 52891, 52874, 52953, 52903, 52877, 52910, 52901, 52878, 52873, 52885, 52881, 52907, 52931, 52904, 52876, 52865, 52887, 52874, 52918, 52907, 52876, 52891, 52874, 52900, 52948, 52873, 52883, 52883, 52958, 52872, 52865, 52868, 52866, 52956, 52885, 52876, 52899, 52910, 52877, 52867, 52899, 52953, 52874, 52891, 52876, 52871, 52874, 52887, 52865, 52876, 52908, 52901, 52865, 52877, 52865, 52869, 52854, 52822, 52808, 52840, 52915, 52801, 52804, 52861, 52915, 52862, 52814, 52807, 52850, 52813, 52915, 52800, 52850, 52915, 52854, 52822, 52808, 52840, 52915, 52863, 52862, 52815, 52848, 52850, 52801, 52815, 52811, 52894, 52876, 52819, 52831, 52792, 52794, 52792, 52796, 52797, 52795, 52796, 52743, 52831, 52828, 52740, 52791, 52789, 52738, 52740, 52830, 52820, 52794, 52738, 52794, 52786, 52792, 52792, 52820, 52828, 52741, 52792, 52831, 52820, 52798, 52742, 52740, 52781, 52814, 52817, 52793, 52746, 52795, 52809, 52854, 52848, 52818, 52793, 52746, 52795, 52809, 52829, 52793, 52785, 52798, 52830, 52820, 52793, 52742, 52784, 52795, 52772, 52828, 52797, 52799, 52799, 52831, 52829, 52742};
    }

    public static void init$0() {
        $$a = new byte[]{116, 115, -26, -112};
        $$b = 25;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007c, code lost:
    
        if (com.netcetera.threeds.sdk.infrastructure.oj.ThreeDS2Service(r10, r0, ((java.lang.String) r4[0]).intern()) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0049, code lost:
    
        if (com.netcetera.threeds.sdk.infrastructure.oj.ThreeDS2Service(r10, r0) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00af, code lost:
    
        return java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007e, code lost:
    
        r0 = com.netcetera.threeds.sdk.infrastructure.nq.initialize;
        r2 = new java.lang.Object[1];
        a(false, new int[]{111, 27, 0, 1}, "\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000", r2);
        r0.ThreeDS2ServiceInstance(((java.lang.String) r2[0]).intern(), r11, r10);
        com.netcetera.threeds.sdk.infrastructure.nq.getWarnings = (com.netcetera.threeds.sdk.infrastructure.nq.get + 47) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a6, code lost:
    
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Boolean ThreeDS2Service(String str, Boolean bool) {
        String initialize2;
        int i = getWarnings + 47;
        get = i % 128;
        if (i % 2 != 0) {
            initialize2 = initialize(str);
            CharSequence[] charSequenceArr = new CharSequence[3];
            Object[] objArr = new Object[1];
            a(true, new int[]{EnumC0170g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, 4, 1, 0}, "\u0000\u0000\u0001\u0000", objArr);
            charSequenceArr[0] = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(true, new int[]{EnumC0170g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, 5, 0, 4}, "\u0001\u0001\u0001\u0001\u0001", objArr2);
            charSequenceArr[1] = ((String) objArr2[0]).intern();
        } else {
            initialize2 = initialize(str);
            Object[] objArr3 = new Object[1];
            a(true, new int[]{EnumC0170g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, 4, 1, 0}, "\u0000\u0000\u0001\u0000", objArr3);
            String intern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            a(true, new int[]{EnumC0170g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, 5, 0, 4}, "\u0001\u0001\u0001\u0001\u0001", objArr4);
        }
    }

    public ns ThreeDS2ServiceInitializationCallback(String str) {
        int i = getWarnings + 19;
        get = i % 128;
        int i2 = i % 2;
        return ns.get(this.ThreeDS2Service.optJSONArray(str));
    }

    public <V> void ThreeDS2ServiceInstance(String str, Collection<V> collection) {
        get = (getWarnings + 111) % 128;
        if (oj.initialize(str) && og.getWarnings(collection)) {
            try {
                this.ThreeDS2Service.putOpt(str, new JSONArray((Collection) collection));
                get = (getWarnings + 73) % 128;
            } catch (JSONException unused) {
                no noVar = initialize;
                Object[] objArr = new Object[1];
                a(true, new int[]{EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, 67, 113, 36}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001", objArr);
                noVar.ThreeDS2ServiceInstance(((String) objArr[0]).intern(), str, collection);
            }
        }
    }

    public boolean addParam(String str) {
        int i = get + 87;
        getWarnings = i % 128;
        int i2 = i % 2;
        JSONObject jSONObject = this.ThreeDS2Service;
        boolean z = i2 != 0 ? jSONObject.optJSONArray(str) != null : jSONObject.optJSONArray(str) != null;
        get = (getWarnings + 1) % 128;
        return z;
    }

    public boolean cleanup(String str) {
        int i = getWarnings + 85;
        get = i % 128;
        int i2 = i % 2;
        JSONObject jSONObject = this.ThreeDS2Service;
        if (i2 == 0) {
            return jSONObject.has(str);
        }
        jSONObject.has(str);
        throw null;
    }

    public boolean createTransaction(String str) {
        int i = get + 97;
        getWarnings = i % 128;
        int i2 = i % 2;
        JSONObject jSONObject = this.ThreeDS2Service;
        boolean z = i2 != 0 ? jSONObject.optJSONObject(str) != null : jSONObject.optJSONObject(str) != null;
        get = (getWarnings + 75) % 128;
        return z;
    }

    public List<String> get(String str) {
        ArrayList arrayList = new ArrayList();
        ns nsVar = ns.get(this.ThreeDS2Service.optJSONArray(str));
        get = (getWarnings + 23) % 128;
        int i = 0;
        while (i < nsVar.getWarnings()) {
            String warnings = nsVar.getWarnings(i);
            if (oj.initialize(warnings)) {
                int i2 = getWarnings + 87;
                get = i2 % 128;
                if (i2 % 2 != 0) {
                    arrayList.add(warnings);
                    int i3 = 91 / 0;
                } else {
                    arrayList.add(warnings);
                }
            }
            i++;
            getWarnings = (get + 69) % 128;
        }
        return arrayList;
    }

    public Boolean getSDKInfo(String str) {
        int i = getWarnings + 79;
        get = i % 128;
        if (i % 2 != 0) {
            ThreeDS2Service(str, (Boolean) null);
            throw null;
        }
        Boolean ThreeDS2Service = ThreeDS2Service(str, (Boolean) null);
        int i2 = get + 79;
        getWarnings = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 5 / 0;
        }
        return ThreeDS2Service;
    }

    public nq getSDKVersion(String str) {
        int i = get + 111;
        getWarnings = i % 128;
        int i2 = i % 2;
        nq initialize2 = initialize(this.ThreeDS2Service.optJSONObject(str));
        get = (getWarnings + 11) % 128;
        return initialize2;
    }

    public Map<String, Object> initialize() {
        try {
            HashMap hashMap = new HashMap();
            Iterator<String> keys = this.ThreeDS2Service.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = this.ThreeDS2Service.get(next);
                if (obj instanceof JSONArray) {
                    getWarnings = (get + 113) % 128;
                    obj = ns.get((JSONArray) obj).get();
                } else if (obj instanceof JSONObject) {
                    int i = get + 77;
                    getWarnings = i % 128;
                    if (i % 2 == 0) {
                        obj = initialize((JSONObject) obj).initialize();
                        int i2 = 28 / 0;
                    } else {
                        obj = initialize((JSONObject) obj).initialize();
                    }
                } else {
                    continue;
                }
                hashMap.put(next, obj);
            }
            return hashMap;
        } catch (JSONException e) {
            throw setTextAlignment.getParamValue.initialize(e);
        }
    }

    public String toString() {
        int i = getWarnings + 113;
        get = i % 128;
        int i2 = i % 2;
        String jSONObject = this.ThreeDS2Service.toString();
        if (i2 != 0) {
            int i3 = 74 / 0;
        }
        return jSONObject;
    }

    public Integer getWarnings(String str, Integer num) {
        getWarnings = (get + 27) % 128;
        String initialize2 = initialize(str);
        if (!om.getWarnings(initialize2)) {
            no noVar = initialize;
            Object[] objArr = new Object[1];
            a(false, new int[]{111, 27, 0, 1}, "\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000", objArr);
            noVar.ThreeDS2ServiceInstance(((String) objArr[0]).intern(), str, initialize2);
            return num;
        }
        Integer valueOf = Integer.valueOf((int) Double.parseDouble(initialize2));
        int i = get + 9;
        getWarnings = i % 128;
        if (i % 2 == 0) {
            int i2 = 33 / 0;
        }
        return valueOf;
    }

    public void getWarnings(String str, Object obj) {
        if (oj.initialize(str)) {
            getWarnings = (get + 21) % 128;
            if (og.getWarnings(obj)) {
                getWarnings = (get + 47) % 128;
                try {
                    this.ThreeDS2Service.putOpt(str, obj);
                    getWarnings = (get + 83) % 128;
                } catch (JSONException unused) {
                    no noVar = initialize;
                    Object[] objArr = new Object[1];
                    a(true, new int[]{EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, 67, 113, 36}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001", objArr);
                    noVar.ThreeDS2ServiceInstance(((String) objArr[0]).intern(), str, obj);
                }
            }
        }
    }

    public String getWarnings(String str, String str2) {
        get = (getWarnings + 69) % 128;
        if (!cleanup(str)) {
            return str2;
        }
        String str3 = null;
        if (this.ThreeDS2Service.isNull(str)) {
            int i = getWarnings + 73;
            get = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        } else {
            str3 = this.ThreeDS2Service.optString(str, null);
        }
        if (!oj.getWarnings((CharSequence) str3)) {
            return str3;
        }
        getWarnings = (get + 75) % 128;
        no noVar = initialize;
        Object[] objArr = new Object[1];
        a(true, new int[]{52, 26, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE, 2}, "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000", objArr);
        noVar.ThreeDS2ServiceInstance(((String) objArr[0]).intern(), str, str3);
        return str2;
    }

    public static nq getWarnings(String str) {
        return (nq) ThreeDS2Service(new Object[]{str}, -639806015, 639806015, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        try {
            nq initialize2 = initialize(new JSONObject((String) objArr[0]));
            int i = getWarnings + 63;
            get = i % 128;
            if (i % 2 == 0) {
                return initialize2;
            }
            throw null;
        } catch (JSONException unused) {
            return ThreeDS2ServiceInstance();
        }
    }

    public Iterator<String> get() {
        get = (getWarnings + 63) % 128;
        Iterator<String> keys = this.ThreeDS2Service.keys();
        int i = get + 1;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            return keys;
        }
        throw null;
    }

    public static nq ThreeDS2ServiceInstance(String str) {
        try {
            nq initialize2 = initialize(new JSONObject(str));
            get = (getWarnings + 101) % 128;
            return initialize2;
        } catch (JSONException e) {
            throw setTextAlignment.getParamValue.initialize(e);
        }
    }

    public static nq ThreeDS2ServiceInstance(Map map) {
        nq nqVar = new nq(new JSONObject((Map) og.ThreeDS2Service(map, new HashMap())));
        getWarnings = (get + 121) % 128;
        return nqVar;
    }

    public static nq ThreeDS2ServiceInstance() {
        getWarnings = (get + 21) % 128;
        nq initialize2 = initialize((JSONObject) null);
        int i = get + 53;
        getWarnings = i % 128;
        if (i % 2 == 0) {
            int i2 = 75 / 0;
        }
        return initialize2;
    }

    public String initialize(String str) {
        int i = getWarnings + 51;
        get = i % 128;
        if (i % 2 == 0) {
            return getWarnings(str, (String) null);
        }
        getWarnings(str, (String) null);
        throw null;
    }

    public void initialize(String str, nq nqVar) {
        getWarnings = (get + 89) % 128;
        if (oj.initialize(str) && og.getWarnings(nqVar)) {
            try {
                this.ThreeDS2Service.putOpt(str, nqVar.ThreeDS2Service());
                get = (getWarnings + 61) % 128;
            } catch (JSONException unused) {
                no noVar = initialize;
                Object[] objArr = new Object[1];
                a(true, new int[]{EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, 67, 113, 36}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001", objArr);
                noVar.ThreeDS2ServiceInstance(((String) objArr[0]).intern(), str, nqVar);
            }
        }
    }

    public static nq initialize(JSONObject jSONObject) {
        nq nqVar = new nq((JSONObject) og.ThreeDS2Service(jSONObject, new JSONObject()));
        int i = get + 71;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            return nqVar;
        }
        throw null;
    }

    public Integer ThreeDS2Service(String str) {
        int i = getWarnings + 27;
        get = i % 128;
        if (i % 2 != 0) {
            getWarnings(str, (Integer) null);
            throw null;
        }
        Integer warnings = getWarnings(str, (Integer) null);
        int i2 = getWarnings + 101;
        get = i2 % 128;
        if (i2 % 2 == 0) {
            return warnings;
        }
        throw null;
    }

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        return get(objArr);
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Enum<TT;>;:Lcom/netcetera/threeds/sdk/infrastructure/notify;>(Ljava/lang/String;Ljava/lang/Class<TT;>;)TT; */
    public Enum ThreeDS2Service(String str, Class cls) {
        get = (getWarnings + 87) % 128;
        String initialize2 = initialize(str);
        if (initialize2 == null) {
            return null;
        }
        Enum r5 = (Enum) finalize.initialize(new Object[]{cls, initialize2}, -1922987640, 1922987640, (int) System.currentTimeMillis());
        if (r5 == null) {
            no noVar = initialize;
            Object[] objArr = new Object[1];
            a(true, new int[]{147, 22, 0, 12}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001", objArr);
            noVar.ThreeDS2ServiceInstance(((String) objArr[0]).intern(), str);
            get = (getWarnings + 125) % 128;
        }
        return r5;
    }

    public void ThreeDS2Service(String str, String str2) {
        if (oj.ThreeDS2ServiceInstance(str, str2)) {
            int i = getWarnings + 51;
            get = i % 128;
            int i2 = i % 2;
            JSONObject jSONObject = this.ThreeDS2Service;
            try {
                if (i2 != 0) {
                    jSONObject.putOpt(str, str2);
                    throw null;
                }
                jSONObject.putOpt(str, str2);
            } catch (JSONException unused) {
                no noVar = initialize;
                Object[] objArr = new Object[1];
                a(true, new int[]{EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, 67, 113, 36}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001", objArr);
                noVar.ThreeDS2ServiceInstance(((String) objArr[0]).intern(), str, str2);
            }
        }
        get = (getWarnings + 49) % 128;
    }

    public void ThreeDS2Service(String str, ns nsVar) {
        int i = get + 115;
        getWarnings = i % 128;
        if (i % 2 == 0) {
            int i2 = 69 / 0;
            if (!oj.initialize(str)) {
                return;
            }
        } else if (!oj.initialize(str)) {
            return;
        }
        int i3 = get + 17;
        getWarnings = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[0];
            objArr[0] = nsVar;
            if (!og.getWarnings(objArr)) {
                return;
            }
        } else if (!og.getWarnings(nsVar)) {
            return;
        }
        try {
            this.ThreeDS2Service.putOpt(str, nsVar.ThreeDS2ServiceInstance());
            getWarnings = (get + 99) % 128;
        } catch (JSONException unused) {
            no noVar = initialize;
            Object[] objArr2 = new Object[1];
            a(true, new int[]{EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, 67, 113, 36}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001", objArr2);
            noVar.ThreeDS2ServiceInstance(((String) objArr2[0]).intern(), str, nsVar);
        }
    }

    public JSONObject ThreeDS2Service() {
        int i = getWarnings;
        JSONObject jSONObject = this.ThreeDS2Service;
        get = (i + 113) % 128;
        return jSONObject;
    }
}
