package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Vh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1328Vh implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ T8 A00;
    public final /* synthetic */ C1331Vk A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-66, -58, -72, -6, -5, 5, 6, 1, 4, 11, 3, -10, 1, 0, 3, 5, -6, -1, -8, -38, -51, -39, -35, -51, -37, -36, -57, -47, -52};
    }

    public RunnableC1328Vh(C1331Vk c1331Vk, String str, T8 t82) {
        this.A01 = c1331Vk;
        this.A02 = str;
        this.A00 = t82;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        List list2;
        ArrayList arrayList;
        List list3;
        int i;
        int i4;
        int i6;
        if (WU.A02(this)) {
            return;
        }
        try {
            C1273Te nvl = new C1273Te(A00(0, 3, 84));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(A00(3, 7, 118), jSONArray);
            jSONObject.put(A00(19, 10, 76), this.A02);
            list = this.A01.A0D;
            synchronized (list) {
                list2 = this.A01.A0D;
                arrayList = new ArrayList(list2);
                list3 = this.A01.A0D;
                list3.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C1330Vj c1330Vj = (C1330Vj) it.next();
                StringBuilder append = new StringBuilder().append(A00(0, 0, 23));
                i = c1330Vj.A00;
                StringBuilder append2 = append.append(i).append(';');
                i4 = c1330Vj.A02;
                StringBuilder append3 = append2.append(i4).append(';');
                i6 = c1330Vj.A01;
                jSONArray.put(append3.append(i6).toString());
            }
            nvl.A07(jSONObject);
            nvl.A05(1);
            this.A00.A08().ABD(A00(10, 9, 117), AbstractC1272Td.A2R, nvl);
        } catch (JSONException unused) {
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
