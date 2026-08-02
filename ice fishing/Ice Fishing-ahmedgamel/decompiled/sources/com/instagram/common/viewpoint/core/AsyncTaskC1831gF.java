package com.instagram.common.viewpoint.core;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.expressad.f.a.b;
import com.anythink.expressad.video.module.a.a;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.gF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class AsyncTaskC1831gF extends AsyncTask<String, Void, C1832gG> {
    public static byte[] A05;
    public static String[] A06 = {"naFNcZuGe", "C9JAYYW4", "8H9N3VrVfLlJ9IUdYMoO", "YylQBw7bkupjVtNcwFivzoGwGcTau", "utPcy8I9vNMcCezdgtn", "ehhspVm5", "7sb5kaLRz1R8p", b.dI};
    public static final String A07;
    public static final Set<String> A08;
    public T8 A00;
    public InterfaceC1810fu A01;
    public InterfaceC1830gE A02;
    public Map<String, String> A03;
    public Map<String, String> A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final C1832gG A00(String... strArr) {
        if (WU.A02(this)) {
            return null;
        }
        String[] strArr2 = A06;
        if (strArr2[4].length() == strArr2[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr3 = A06;
        strArr3[3] = "OBWBCzNqNMhSgl0vUrcBODbII9DBW";
        strArr3[2] = "nuEeWi2rsMih0JuNdplL";
        try {
            String str = strArr[0];
            if (!TextUtils.isEmpty(str) && !A08.contains(str)) {
                String A02 = A02(str);
                if (this.A03 != null && !this.A03.isEmpty()) {
                    for (Map.Entry<String, String> entry : this.A03.entrySet()) {
                        A02 = A03(A02, entry.getKey(), entry.getValue());
                    }
                }
                int i = 1;
                while (true) {
                    int i4 = i + 1;
                    if (i > 2) {
                        return null;
                    }
                    if (A06(A02)) {
                        return new C1832gG(this.A01);
                    }
                    i = i4;
                }
            }
            return null;
        } catch (Throwable th) {
            WU.A00(th, this);
            return null;
        }
    }

    public static String A01(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 103);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{75, 62, 43, 105, 56, 15, 15, 18, 15, 93, 18, 13, 24, 19, 20, 19, 26, 93, 8, 15, 17, 71, 93, 15, 0, 15, 2, 1, 9, 54, 45, 52, 52};
    }

    static {
        A04();
        A07 = AsyncTaskC1831gF.class.getSimpleName();
        A08 = new HashSet();
        A08.add(A01(0, 1, 15));
        A08.add(A01(29, 4, 63));
    }

    public AsyncTaskC1831gF(T8 t82) {
        this(t82, null, null);
    }

    public AsyncTaskC1831gF(T8 t82, Map<String, String> extraData) {
        this(t82, extraData, null);
    }

    public AsyncTaskC1831gF(T8 t82, Map<String, String> extraData, Map<String, String> postData) {
        this.A00 = t82;
        this.A03 = extraData != null ? new HashMap(extraData) : null;
        this.A04 = postData != null ? new HashMap(postData) : null;
    }

    private String A02(String str) {
        try {
            return A03(str, A01(23, 6, 9), AbstractC1371Xd.A01(this.A00.A04().A6w()));
        } catch (Exception unused) {
            return str;
        }
    }

    private String A03(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        String A01 = A01(3, 1, 49);
        if (str.contains(A01)) {
            A01 = A01(1, 1, a.f22515R);
        }
        StringBuilder append = new StringBuilder().append(str).append(A01).append(str2);
        String prepend = A01(2, 1, 113);
        StringBuilder append2 = append.append(prepend);
        String prepend2 = URLEncoder.encode(str3);
        return append2.append(prepend2).toString();
    }

    private final void A05(C1832gG response) {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A02 != null) {
                this.A02.AHC(response);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }

    private boolean A06(String str) {
        InterfaceC1810fu AGw;
        InterfaceC1811fv A00 = C1829gD.A00(this.A00);
        try {
            if (this.A04 == null || this.A04.size() == 0) {
                AGw = A00.AGw(str, new C1825g9());
            } else {
                C1825g9 params = new C1825g9();
                params.A05(this.A04);
                AGw = A00.AGx(str, params.A08());
            }
            this.A01 = AGw;
        } catch (Exception e9) {
            Log.e(A07, A01(4, 19, 26) + str, e9);
        }
        return this.A01 != null && this.A01.A9C() == 200;
    }

    public final void A07(InterfaceC1830gE interfaceC1830gE) {
        this.A02 = interfaceC1830gE;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ C1832gG doInBackground(String[] strArr) {
        if (WU.A02(this)) {
            return null;
        }
        try {
            return A00(strArr);
        } catch (Throwable th) {
            WU.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        if (this.A02 != null) {
            this.A02.AHA();
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(C1832gG c1832gG) {
        if (WU.A02(this)) {
            return;
        }
        try {
            A05(c1832gG);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
