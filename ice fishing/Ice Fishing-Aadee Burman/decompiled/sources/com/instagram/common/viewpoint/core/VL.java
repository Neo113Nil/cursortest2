package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network/classes2.dex */
public final class VL {
    public static byte[] A00;
    public static final String A01;
    public static final Map<String, Integer> A02;
    public static final AtomicInteger A03;

    public static String A01(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 57);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-82, -96, -50, -27, -9, -96, -10, -31, -20, -11, -27, -70, -96, -111, -88, -124, -87, -77, -80, -95, -76, -93, -88, -87, -82, -89, 96, -84, -81, -93, -95, -84, 96, -93, -81, -75, -82, -76, -91, -78, -77, 122, 96, -4, 33, 22, 37, 24, 32, 24, 33, 39, 28, 33, 26, -45, 22, 34, 40, 33, 39, 24, 37, -19, -45, -7, 28, 16, 14, 25, -16, 28, 34, 27, 33, 18, 31, 32, -99, -96, -96, -91, -80, -91, -85, -86, -99, -88, -101, -91, -86, -94, -85, -35, -16, -16, -31, -23, -20, -16, -84, -86, -66, -80, -79, -67, -88, -82, -63, -84, -82, -71, -67, -78, -72, -73, -17, -5, -7, -70, -14, -19, -17, -15, -18, -5, -5, -9, -70, -19, -16, -1, -70, -40, -37, -49, -51, -40, -21, -49, -37, -31, -38, -32, -47, -34, -33, -87, -90, -71, -90, -95, -78, -95, -86, -80, -81, 24, 27, 15, 13, 24, 11, 15, 27, 33, 26, 32, 17, 30, 31, -47, -62, -38, -51, -48, -62, -59, -10, -9, -28, -26, -18, -9, -11, -28, -26, -24, -48, -46, -65, -47, -42, -51, -62, -47, -45, -64, -46, -41, -50, -61, -67, -63, -51, -62, -61};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A06(T8 t82, InterfaceC1791fv interfaceC1791fv, Map<String, ?> map) throws JSONException {
        HashMap hashMap = new HashMap();
        hashMap.put(A01(93, 7, 67), A01(13, 1, 40));
        A0A(t82, hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(A01(188, 7, 36), A01(157, 14, 115));
        hashMap2.put(A01(195, 12, 37), String.valueOf(3501));
        hashMap2.put(A01(100, 16, 16), A01(14, 1, 62));
        hashMap2.put(A01(178, 10, 74), A01(65, 13, 116));
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        if (t82.A05().AAO()) {
            String str = A01(15, 28, 7) + jSONObject.toString(2);
        }
        hashMap2.put(A01(78, 15, 3), jSONObject.toString());
        A0A(t82, hashMap2);
        U7 A09 = t82.A09();
        JSONObject A05 = C1254Tf.A05(new C1256Th(A09.A01(), A09.A02(), hashMap2));
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(A05);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(A01(147, 4, 12), new JSONObject(hashMap));
        jSONObject2.put(A01(151, 6, 3), jSONArray);
        C1805g9 c1805g9 = new C1805g9();
        c1805g9.put(A01(171, 7, 40), jSONObject2.toString());
        interfaceC1791fv.AGy(t82.A05().A86(), c1805g9.A08(), new WJ(t82));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A0A(T8 t82, Map<String, String> map) {
        map.putAll(t82.A04().A5a());
    }

    static {
        A04();
        A01 = VL.class.getSimpleName();
        A03 = new AtomicInteger(0);
        A02 = new HashMap();
    }

    public static void A05(T8 t82) {
        if (A0C(t82)) {
            return;
        }
        synchronized (VL.class) {
            if (A03.get() != 0) {
                return;
            }
            A03.set(1);
            YG.A06.execute(new WR(t82));
        }
    }

    public static void A08(T8 t82, String str) {
        int value;
        int i;
        if (A0C(t82)) {
            return;
        }
        synchronized (VL.class) {
            if (A03.get() != 2) {
                if (A02.containsKey(str)) {
                    i = A02.get(str).intValue();
                } else {
                    i = 0;
                }
                value = i + 1;
                A02.put(str, Integer.valueOf(value));
            } else {
                SharedPreferences sharedPreferences = t82.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(116, 31, 83), t82), 0);
                value = sharedPreferences.getInt(str, 0) + 1;
                sharedPreferences.edit().putInt(str, value).apply();
            }
            if (t82.A05().AAO()) {
                String str2 = A01(43, 22, 122) + str + A01(0, 13, 71) + value;
            }
        }
    }

    public static void A09(T8 t82, String str) {
        if (A0C(t82)) {
            return;
        }
        YG.A06.execute(new WO(t82, str));
    }

    public static boolean A0B(double d2, int i) {
        return i <= 0 || d2 >= 1.0d / ((double) i);
    }

    public static boolean A0C(T8 t82) {
        if (t82.A05().AAO()) {
            return false;
        }
        if (!AbstractC1292Ur.A0U(t82)) {
            return true;
        }
        return A0B(t82.A09().A00(), AbstractC1292Ur.A0C(t82));
    }
}
