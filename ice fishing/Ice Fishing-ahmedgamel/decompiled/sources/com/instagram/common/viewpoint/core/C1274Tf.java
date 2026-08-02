package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.core.common.s.a.c;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Tf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1274Tf {
    public static byte[] A00;
    public static String[] A01 = {"Y", "xyQF3sxjnp2qUSvJDNu5P0iyyc584Vpd", "idh0g523ELVLwEFfu1u5qrhcL3DPrNZC", "UJ0fDp2QsgF1WBSdDofKnf2EwbpjWzp9", "LsjKEz1u6vy", "QA8fX7ramcT9ifSsWPTVo7ChqvJDDBqT", "HHR99srKdCFKOrgMnrhL9AMY8z42dkOr", "PWBGS5sCKwM35N3BbQj09sXNColJxvDn"};
    public static final Object A02;
    public static final String A03;
    public static final Map<String, Integer> A04;
    public static final Set<String> A05;
    public static final AtomicInteger A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C1276Th A01(String str, T8 t82, Map<String, String> map) {
        C1276Th c1276Th = null;
        try {
            c1276Th = new C1276Th(t82.A09().A01(), t82.A09().A02(), new TR(str, map, true).A02());
            A0C(c1276Th, t82);
            return c1276Th;
        } catch (Exception unused) {
            return c1276Th;
        }
    }

    public static String A02(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 106);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static JSONArray A04(T8 t82, int i) {
        InterfaceC1271Tc A08;
        JSONArray jSONArray = new JSONArray();
        synchronized (A02) {
            FileInputStream fileInputStream = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            try {
                try {
                    if (new File(t82.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 27), t82)).exists()) {
                        fileInputStream = t82.openFileInput(ProcessUtils.getProcessSpecificName(A02(281, 9, 27), t82));
                        inputStreamReader = new InputStreamReader(fileInputStream);
                        bufferedReader = new BufferedReader(inputStreamReader);
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null || i == 0) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(readLine);
                            if (!jSONObject.has(A02(260, 7, 82))) {
                                jSONObject.put(A02(260, 7, 82), String.valueOf(0));
                            }
                            String string = jSONObject.getString(A02(343, 2, 110));
                            if (!A05.contains(string)) {
                                int i4 = jSONObject.getInt(A02(260, 7, 82));
                                if (A04.containsKey(string)) {
                                    jSONObject.put(A02(260, 7, 82), String.valueOf(A04.get(string)));
                                } else {
                                    A0E(string, i4);
                                }
                                jSONArray.put(jSONObject);
                                if (i > 0) {
                                    i--;
                                }
                            }
                        }
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e9) {
                            e = e9;
                            A08 = t82.A08();
                            A08.A4I(e);
                            return jSONArray;
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                } catch (IOException | JSONException e10) {
                    t82.A08().A4I(e10);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e11) {
                            e = e11;
                            A08 = t82.A08();
                            A08.A4I(e);
                            return jSONArray;
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                }
            } finally {
                if (bufferedReader != null) {
                    try {
                    } catch (IOException e12) {
                    }
                }
            }
        }
        return jSONArray;
    }

    public static void A06() {
        A00 = new byte[]{-73, -24, -36, 0, 46, 43, 44, -1, 43, 49, 42, 48, 33, 46, -10, -36, -73, -43, -30, -101, -24, -108, -40, -39, -32, -39, -24, -39, -108, -40, -39, -42, -23, -37, -108, -39, -22, -39, -30, -24, -25, -108, -38, -35, -32, -39, -94, 30, 60, 73, 2, 79, -5, c.f17105c, c.f17104b, 71, c.f17104b, 79, c.f17104b, -5, 65, 68, 71, c.f17104b, -4, 25, 26, 23, 42, 28, 52, 37, 39, 26, 27, -43, 6, -11, -2, 4, -45, -1, 5, -2, 4, 3, -1, -2, 50, 33, 38, 34, 43, 32, 34, 11, 34, 49, 52, 44, 47, 40, -36, 1, -2, -13, -15, -84, -16, -15, -18, 1, -13, -84, -15, 2, -15, -6, 0, -1, -84, -14, -11, -8, -15, -70, -106, -46, -11, -8, -15, -84, -1, -11, 6, -15, -58, -84, 32, 56, 54, 61, 61, 50, 49, -19, 50, 67, 50, 59, 65, c.f17104b, -5, 1, 25, 23, 30, 30, 23, 28, 21, -50, 17, 29, 32, 32, 35, 30, 34, 19, 18, -50, 18, 19, 16, 35, 21, -50, 19, 36, 19, 28, 34, -50, 26, 23, 28, 19, -36, 44, 74, 81, 65, 70, c.f17105c, -8, 76, 71, -8, 77, 72, 60, 57, 76, 61, -8, 77, 70, 74, 61, 59, 71, 74, 60, 61, 60, -8, 60, 61, 58, 77, c.f17105c, 36, 71, c.f17105c, 29, 78, 61, 70, 76, 6, -8, 57, 60, 60, 65, 70, c.f17105c, -8, 76, 71, -8, 39, 70, c.f17105c, 71, 65, 70, c.f17105c, 29, 78, 61, 70, 76, 6, 36, 57, 42, 50, 53, 29, 48, 48, 33, 41, 44, 48, -13, -16, 3, -16, -45, -44, -50, -37, -34, -42, -42, -40, -35, -42, -23, -22, -25, -6, -20, -15, -12, -20, -8, 34, 37, 42, 37, 47, 36, 33, 32, -36, 33, 50, 33, 42, 48, -36, 47, 36, 43, 49, 40, 32, -36, 42, 43, 48, -36, 30, 33, -36, 49, 44, 32, 29, 48, 33, 32, -36, 48, 43, -36, 11, 42, 35, 43, 37, 42, 35, 1, 50, 33, 42, 48, -22, 65, 60, -7, -21, -7, -7, -17, -11, -12, -27, -17, -22, -13, -27, -13, -13, -23, -17, -18, -33, -12, -23, -19, -27, 49, 41, 39, 46, 46, 35, 34, 3, 52, 35, 44, 50, 49, -34, -5, -34, -34, -32, -51, -33, -28, -37, -48, 19, 21, 2, 20, 25, 16, 5, -1, 3, 15, 4, 5, 70, 59, c.f17105c, 55, 74, 79, 70, 59};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0G(T8 t82) {
        JSONArray jSONArray = new JSONArray();
        synchronized (A02) {
            int i = 0;
            FileInputStream fileInputStream = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    if (new File(t82.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 27), t82)).exists()) {
                        fileInputStream = t82.openFileInput(ProcessUtils.getProcessSpecificName(A02(281, 9, 27), t82));
                        inputStreamReader = new InputStreamReader(fileInputStream);
                        bufferedReader = new BufferedReader(inputStreamReader);
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(readLine);
                            String string = jSONObject.getString(A02(343, 2, 110));
                            if (!A05.contains(string)) {
                                if (A04.containsKey(string)) {
                                    Integer num = A04.get(string);
                                    Integer valueOf = Integer.valueOf(num != null ? num.intValue() : 0);
                                    int A022 = AbstractC1312Ur.A02(t82);
                                    if (A022 <= -1 || valueOf.intValue() <= A022 - 1) {
                                        jSONObject.put(A02(260, 7, 82), String.valueOf(valueOf));
                                        jSONArray.put(jSONObject);
                                    } else {
                                        A0D(string);
                                        i++;
                                    }
                                } else {
                                    jSONArray.put(jSONObject);
                                }
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        int length = jSONArray.length();
                        for (int i4 = 0; i4 < length; i4++) {
                            sb.append(jSONArray.getJSONObject(i4).toString()).append('\n');
                        }
                        fileOutputStream = t82.openFileOutput(ProcessUtils.getProcessSpecificName(A02(281, 9, 27), t82), 0);
                        fileOutputStream.write(sb.toString().getBytes());
                    }
                    A09(t82, A00(t82));
                    if (i > 0) {
                        t82.A08().ABC(A02(271, 10, 5), AbstractC1272Td.A2Y, new C1273Te(A02(138, 15, 99), A02(367, 16, 84) + i));
                    }
                    return true;
                } finally {
                    if (0 != 0) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e9) {
                            t82.A08().A4I(e9);
                            A05.clear();
                            A04.clear();
                        }
                    }
                    if (0 != 0) {
                        inputStreamReader.close();
                    }
                    if (0 != 0) {
                        fileInputStream.close();
                    }
                    if (0 != 0) {
                        fileOutputStream.close();
                    }
                    A05.clear();
                    A04.clear();
                }
            } catch (IOException | JSONException e10) {
                t82.A08().A4I(e10);
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e11) {
                        t82.A08().A4I(e11);
                        A05.clear();
                        A04.clear();
                        return false;
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                A05.clear();
                A04.clear();
                return false;
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f2 A[Catch: IOException -> 0x020a, all -> 0x0254, TryCatch #7 {IOException -> 0x020a, blocks: (B:64:0x01ed, B:47:0x01f2, B:49:0x01f7, B:51:0x01fc, B:53:0x0201, B:55:0x0206), top: B:63:0x01ed, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f7 A[Catch: IOException -> 0x020a, all -> 0x0254, TryCatch #7 {IOException -> 0x020a, blocks: (B:64:0x01ed, B:47:0x01f2, B:49:0x01f7, B:51:0x01fc, B:53:0x0201, B:55:0x0206), top: B:63:0x01ed, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01fc A[Catch: IOException -> 0x020a, all -> 0x0254, TryCatch #7 {IOException -> 0x020a, blocks: (B:64:0x01ed, B:47:0x01f2, B:49:0x01f7, B:51:0x01fc, B:53:0x0201, B:55:0x0206), top: B:63:0x01ed, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0201 A[Catch: IOException -> 0x020a, all -> 0x0254, TryCatch #7 {IOException -> 0x020a, blocks: (B:64:0x01ed, B:47:0x01f2, B:49:0x01f7, B:51:0x01fc, B:53:0x0201, B:55:0x0206), top: B:63:0x01ed, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0206 A[Catch: IOException -> 0x020a, all -> 0x0254, TRY_LEAVE, TryCatch #7 {IOException -> 0x020a, blocks: (B:64:0x01ed, B:47:0x01f2, B:49:0x01f7, B:51:0x01fc, B:53:0x0201, B:55:0x0206), top: B:63:0x01ed, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0229 A[Catch: IOException -> 0x0241, all -> 0x0254, TryCatch #8 {IOException -> 0x0241, blocks: (B:84:0x0224, B:69:0x0229, B:71:0x022e, B:73:0x0233, B:75:0x0238, B:77:0x023d), top: B:83:0x0224, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022e A[Catch: IOException -> 0x0241, all -> 0x0254, TryCatch #8 {IOException -> 0x0241, blocks: (B:84:0x0224, B:69:0x0229, B:71:0x022e, B:73:0x0233, B:75:0x0238, B:77:0x023d), top: B:83:0x0224, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0233 A[Catch: IOException -> 0x0241, all -> 0x0254, TryCatch #8 {IOException -> 0x0241, blocks: (B:84:0x0224, B:69:0x0229, B:71:0x022e, B:73:0x0233, B:75:0x0238, B:77:0x023d), top: B:83:0x0224, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0238 A[Catch: IOException -> 0x0241, all -> 0x0254, TryCatch #8 {IOException -> 0x0241, blocks: (B:84:0x0224, B:69:0x0229, B:71:0x022e, B:73:0x0233, B:75:0x0238, B:77:0x023d), top: B:83:0x0224, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023d A[Catch: IOException -> 0x0241, all -> 0x0254, TRY_LEAVE, TryCatch #8 {IOException -> 0x0241, blocks: (B:84:0x0224, B:69:0x0229, B:71:0x022e, B:73:0x0233, B:75:0x0238, B:77:0x023d), top: B:83:0x0224, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0224 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0H(T8 t82) {
        int intValue;
        synchronized (A02) {
            int i = 0;
            FileInputStream fileInputStream = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            FileOutputStream fileOutputStream = null;
            FileInputStream fileInputStream2 = null;
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    String processSpecificName = ProcessUtils.getProcessSpecificName(A02(281, 9, 27), t82);
                    File file = new File(t82.getFilesDir(), processSpecificName);
                    String str = processSpecificName + A02(p.f9259b, 5, 91);
                    A0A(t82, str);
                    if (file.exists()) {
                        fileOutputStream2 = t82.openFileOutput(str, 32768);
                        fileInputStream = t82.openFileInput(processSpecificName);
                        try {
                            inputStreamReader = new InputStreamReader(fileInputStream);
                            try {
                                bufferedReader = new BufferedReader(inputStreamReader);
                                while (true) {
                                    try {
                                        String readLine = bufferedReader.readLine();
                                        if (readLine == null) {
                                            break;
                                        }
                                        try {
                                            JSONObject jSONObject = new JSONObject(readLine);
                                            String string = jSONObject.getString(A02(343, 2, 110));
                                            if (!A05.contains(string)) {
                                                if (A04.containsKey(string)) {
                                                    try {
                                                        Integer num = A04.get(string);
                                                        if (num != null) {
                                                            try {
                                                                intValue = num.intValue();
                                                            } catch (IOException e9) {
                                                                e = e9;
                                                                t82.A08().A4I(e);
                                                                if (bufferedReader != null) {
                                                                }
                                                                if (inputStreamReader != null) {
                                                                }
                                                                if (fileInputStream != null) {
                                                                }
                                                                if (fileOutputStream != null) {
                                                                }
                                                                if (fileInputStream2 != null) {
                                                                }
                                                                if (fileOutputStream2 != null) {
                                                                }
                                                                A05.clear();
                                                                A04.clear();
                                                                return false;
                                                            } catch (JSONException e10) {
                                                                e = e10;
                                                                if (!t82.A05().AAO()) {
                                                                }
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                if (bufferedReader != null) {
                                                                }
                                                                if (inputStreamReader != null) {
                                                                }
                                                                if (fileInputStream != null) {
                                                                }
                                                                if (fileOutputStream != null) {
                                                                }
                                                                if (fileInputStream2 != null) {
                                                                }
                                                                if (fileOutputStream2 != null) {
                                                                }
                                                                A05.clear();
                                                                A04.clear();
                                                                throw th;
                                                            }
                                                        } else {
                                                            intValue = 0;
                                                        }
                                                        Integer valueOf = Integer.valueOf(intValue);
                                                        int A022 = AbstractC1312Ur.A02(t82);
                                                        if (A022 > -1) {
                                                            try {
                                                                if (valueOf.intValue() > A022 - 1) {
                                                                    try {
                                                                        try {
                                                                            A0D(string);
                                                                            i++;
                                                                        } catch (JSONException e11) {
                                                                            e = e11;
                                                                            if (!t82.A05().AAO()) {
                                                                                Log.e(A03, A02(153, 36, 68), e);
                                                                            }
                                                                        }
                                                                    } catch (IOException e12) {
                                                                        e = e12;
                                                                        t82.A08().A4I(e);
                                                                        if (bufferedReader != null) {
                                                                            try {
                                                                                bufferedReader.close();
                                                                            } catch (IOException e13) {
                                                                                t82.A08().A4I(e13);
                                                                                A05.clear();
                                                                                A04.clear();
                                                                                return false;
                                                                            }
                                                                        }
                                                                        if (inputStreamReader != null) {
                                                                            inputStreamReader.close();
                                                                        }
                                                                        if (fileInputStream != null) {
                                                                            fileInputStream.close();
                                                                        }
                                                                        if (fileOutputStream != null) {
                                                                            fileOutputStream.close();
                                                                        }
                                                                        if (fileInputStream2 != null) {
                                                                            fileInputStream2.close();
                                                                        }
                                                                        if (fileOutputStream2 != null) {
                                                                            fileOutputStream2.close();
                                                                        }
                                                                        A05.clear();
                                                                        A04.clear();
                                                                        return false;
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                        if (bufferedReader != null) {
                                                                            try {
                                                                                bufferedReader.close();
                                                                            } catch (IOException e14) {
                                                                                t82.A08().A4I(e14);
                                                                                A05.clear();
                                                                                A04.clear();
                                                                                throw th;
                                                                            }
                                                                        }
                                                                        if (inputStreamReader != null) {
                                                                            inputStreamReader.close();
                                                                        }
                                                                        if (fileInputStream != null) {
                                                                            fileInputStream.close();
                                                                        }
                                                                        if (fileOutputStream != null) {
                                                                            fileOutputStream.close();
                                                                        }
                                                                        if (fileInputStream2 != null) {
                                                                            fileInputStream2.close();
                                                                        }
                                                                        if (fileOutputStream2 != null) {
                                                                            fileOutputStream2.close();
                                                                        }
                                                                        A05.clear();
                                                                        A04.clear();
                                                                        throw th;
                                                                    }
                                                                }
                                                            } catch (IOException e15) {
                                                                e = e15;
                                                                t82.A08().A4I(e);
                                                                if (bufferedReader != null) {
                                                                }
                                                                if (inputStreamReader != null) {
                                                                }
                                                                if (fileInputStream != null) {
                                                                }
                                                                if (fileOutputStream != null) {
                                                                }
                                                                if (fileInputStream2 != null) {
                                                                }
                                                                if (fileOutputStream2 != null) {
                                                                }
                                                                A05.clear();
                                                                A04.clear();
                                                                return false;
                                                            } catch (JSONException e16) {
                                                                e = e16;
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                if (bufferedReader != null) {
                                                                }
                                                                if (inputStreamReader != null) {
                                                                }
                                                                if (fileInputStream != null) {
                                                                }
                                                                if (fileOutputStream != null) {
                                                                }
                                                                if (fileInputStream2 != null) {
                                                                }
                                                                if (fileOutputStream2 != null) {
                                                                }
                                                                A05.clear();
                                                                A04.clear();
                                                                throw th;
                                                            }
                                                        }
                                                        jSONObject.put(A02(260, 7, 82), String.valueOf(valueOf));
                                                        fileOutputStream2.write((jSONObject.toString() + '\n').getBytes());
                                                    } catch (IOException e17) {
                                                        e = e17;
                                                    } catch (JSONException e18) {
                                                        e = e18;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                    }
                                                } else {
                                                    fileOutputStream2.write((jSONObject.toString() + '\n').getBytes());
                                                }
                                            }
                                        } catch (JSONException e19) {
                                            e = e19;
                                        }
                                    } catch (IOException e20) {
                                        e = e20;
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                }
                                fileInputStream2 = t82.openFileInput(str);
                                fileOutputStream = t82.openFileOutput(processSpecificName, 0);
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int read = fileInputStream2.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, read);
                                }
                                fileInputStream2.close();
                                fileOutputStream2.close();
                                A0A(t82, str);
                            } catch (IOException e21) {
                                e = e21;
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        } catch (IOException e22) {
                            e = e22;
                        } catch (Throwable th7) {
                            th = th7;
                        }
                    }
                    A09(t82, A00(t82));
                    if (i > 0) {
                        t82.A08().ABC(A02(271, 10, 5), AbstractC1272Td.A2Y, new C1273Te(A02(138, 15, 99), A02(367, 16, 84) + i));
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e23) {
                            t82.A08().A4I(e23);
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    if (fileInputStream2 != null) {
                        fileInputStream2.close();
                    }
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                    }
                    A05.clear();
                    A04.clear();
                    return true;
                } catch (IOException e24) {
                    e = e24;
                }
            } catch (Throwable th8) {
                th = th8;
            }
        }
    }

    static {
        A06();
        A03 = C1274Tf.class.getName();
        A02 = new Object();
        A05 = Collections.synchronizedSet(new HashSet());
        A04 = Collections.synchronizedMap(new HashMap());
        A06 = new AtomicInteger();
    }

    public static int A00(Context context) {
        return context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 107), context), 0).getInt(A02(75, 10, 38), 0) - A05.size();
    }

    public static JSONArray A03(T8 t82) {
        return A04(t82, -1);
    }

    public static JSONObject A05(C1276Th c1276Th) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(A02(343, 2, 110), UUID.randomUUID().toString());
        jSONObject.put(A02(406, 4, 108), c1276Th.A03());
        jSONObject.put(A02(402, 4, 104), Y1.A03(c1276Th.A01()));
        jSONObject.put(A02(355, 12, 22), Y1.A03(c1276Th.A00()));
        jSONObject.put(A02(345, 10, 28), c1276Th.A02());
        jSONObject.put(A02(267, 4, 37), c1276Th.A04() != null ? new JSONObject(c1276Th.A04()) : new JSONObject());
        jSONObject.put(A02(260, 7, 82), String.valueOf(0));
        return jSONObject;
    }

    public static void A07(Context context) {
        synchronized (A02) {
            File file = new File(context.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 27), context));
            if (file.exists()) {
                file.delete();
            }
            A09(context, 0);
            A05.clear();
            A04.clear();
        }
    }

    public static void A08(Context context) {
        A09(context, context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 107), context), 0).getInt(A02(75, 10, 38), 0) + 1);
    }

    public static void A09(Context context, int i) {
        int i4 = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 107), context), 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (i >= 0) {
            i4 = i;
        }
        if (A01[1].charAt(3) != 'F') {
            throw new RuntimeException();
        }
        A01[0] = "i";
        edit.putInt(A02(75, 10, 38), i4).apply();
    }

    public static void A0A(T8 t82, String str) {
        File file = new File(t82.getFilesDir(), str);
        if (file.exists() && !file.delete()) {
            t82.A08().A4I(new RuntimeException(A02(47, 18, 113)));
        }
    }

    public static void A0B(C1856ge c1856ge, String str) {
        Integer num = A04.get(str);
        if (num == null) {
            if (c1856ge.A05().AAO()) {
                Log.e(A03, A02(189, 66, 110));
            }
            num = 0;
        } else {
            A04.remove(str);
        }
        Map<String, Integer> map = A04;
        Integer attempt = Integer.valueOf(num.intValue() + 1);
        map.put(str, attempt);
    }

    public static void A0C(C1276Th c1276Th, T8 t82) {
        if (c1276Th != null && t82 != null) {
            synchronized (A02) {
                try {
                    String processSpecificName = ProcessUtils.getProcessSpecificName(A02(281, 9, 27), t82);
                    File file = new File(t82.getFilesDir(), processSpecificName);
                    if (file.exists()) {
                        int debugLogFileSizeLimit = AbstractC1312Ur.A07(t82);
                        long length = file.length();
                        if (debugLogFileSizeLimit > 0 && length > debugLogFileSizeLimit) {
                            boolean delete = file.delete();
                            A09(t82, 0);
                            A05.clear();
                            A04.clear();
                            if (delete) {
                                Map<String, String> A5a = t82.A04().A5a();
                                A5a.put(A02(383, 7, 1), A02(271, 10, 5));
                                A5a.put(A02(390, 12, 54), String.valueOf(2401));
                                A01(A02(102, 36, 34) + length + A02(1, 15, 82) + A06.getAndIncrement(), t82, A5a);
                                return;
                            }
                            String processSpecificName2 = A02(85, 17, 83);
                            Log.e(processSpecificName2, A02(16, 31, 10));
                        }
                    }
                    JSONObject A052 = A05(c1276Th);
                    FileOutputStream outputStream = t82.openFileOutput(processSpecificName, 32768);
                    outputStream.write((A052.toString() + A02(0, 1, 67)).getBytes());
                    outputStream.close();
                    A08(t82);
                } catch (Exception e9) {
                    t82.A08().A4I(e9);
                }
            }
        }
    }

    public static void A0D(String str) {
        A04.remove(str);
        A05.add(str);
    }

    public static void A0E(String str, int i) {
        if (!A05.contains(str)) {
            if (A04.containsKey(str)) {
                A04.remove(str);
            }
            A04.put(str, Integer.valueOf(i));
            return;
        }
        throw new RuntimeException(A02(290, 53, 82));
    }

    public static boolean A0F(T8 t82) {
        if (AbstractC1312Ur.A0O(t82)) {
            return A0H(t82);
        }
        return A0G(t82);
    }

    public static boolean A0I(String str) {
        return A05.contains(str) || A04.containsKey(str);
    }
}
