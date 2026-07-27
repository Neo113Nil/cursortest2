package com.instagram.common.viewpoint.core;

import android.os.Handler;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.h0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1858h0 extends AbstractRunnableC1327Wc {
    public static byte[] A01;
    public static String[] A02 = {"QJHZKkwEEt2XAA8qb811yZkloXTxKqNm", "0Eo8hyAH95ZWxpQDtz3kXr2Dg2BAnbpt", "yx1IzqDtrK1i7eGrpZodHZ", "KUuZPkausU2VOaHnsIAk0Hn07pOf06lA", "ddvRVBlQrtqHFM3JEeiDXs23nPXnVLtA", "0N8fJtCAvq63STI6q3YZ9dLrj33X3xUc", "d0kigy9sFkFC2aZLzfYLsKXCuWX9Z7p3", "u6xVOdZhMjB663K3VBvQukbaw71N5v3b"};
    public final /* synthetic */ SN A00;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            int i11 = (copyOfRange[i10] ^ i9) ^ 122;
            if (A02[2].length() != 22) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[3] = "wsWgA7V3OPhtM2agFx6R9FkGRpDQ8hFC";
            strArr[5] = "5QDbKue07C6BH4ozhF9MSdyiVJUT25MO";
            copyOfRange[i10] = (byte) i11;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{43, 57, 57, 47, 62, 57};
    }

    static {
        A01();
    }

    public C1858h0(SN sn) {
        this.A00 = sn;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1327Wc
    public final void A07() {
        Handler handler;
        JSONObject jSONObject;
        C1246Sx c1246Sx;
        String str;
        String str2;
        try {
            jSONObject = this.A00.A05;
            JSONArray jSONArray = jSONObject.getJSONArray(A00(0, 6, 48));
            for (int i = 0; i < jSONArray.length(); i++) {
                SL assetData = SL.A00(jSONArray.getJSONObject(i));
                this.A00.A09(assetData.A04, assetData);
            }
            c1246Sx = this.A00.A02;
            C1860h2 c1860h2 = new C1860h2(this);
            str = this.A00.A04;
            str2 = this.A00.A03;
            c1246Sx.A0X(c1860h2, new C1239Sq(str, str2));
        } catch (JSONException unused) {
            handler = this.A00.A00;
            handler.post(new C1859h1(this));
        }
    }
}
