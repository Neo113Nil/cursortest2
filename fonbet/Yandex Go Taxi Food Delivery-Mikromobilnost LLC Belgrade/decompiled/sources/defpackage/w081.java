package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes7.dex */
public final class w081 {
    public final sh81 a;
    public final la81 b;

    public w081() {
        sh81 sh81Var = new sh81();
        la81 la81Var = new la81();
        this.a = sh81Var;
        this.b = la81Var;
    }

    public final cu81 a(JSONObject jSONObject) {
        int i;
        int i2;
        String str;
        y681 y681Var;
        vh71 vh71Var;
        us81 us81Var;
        ArrayList arrayList;
        String str2 = "w";
        int i3 = jSONObject.getInt("w");
        int i4 = jSONObject.getInt("h");
        this.a.getClass();
        String a = sh81.a("url", jSONObject);
        if (jSONObject.has("smartCenterSettings")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("smartCenterSettings");
            this.b.getClass();
            Object opt = jSONObject2.opt("ColorWizButton");
            String str3 = opt instanceof String ? (String) opt : null;
            Object opt2 = jSONObject2.opt("ColorWizButtonText");
            String str4 = opt2 instanceof String ? (String) opt2 : null;
            Object opt3 = jSONObject2.opt("ColorWizBack");
            String str5 = opt3 instanceof String ? (String) opt3 : null;
            Object opt4 = jSONObject2.opt("ColorWizBackRight");
            String str6 = opt4 instanceof String ? (String) opt4 : null;
            JSONObject optJSONObject = jSONObject2.optJSONObject("backgroundColors");
            JSONObject optJSONObject2 = jSONObject2.optJSONObject("smart-center");
            JSONArray optJSONArray = jSONObject2.optJSONArray("smart-centers");
            if (optJSONObject2 != null) {
                i = i3;
                i2 = i4;
                str = a;
                vh71Var = new vh71(optJSONObject2.getInt(RemoteBioParameters.X), optJSONObject2.getInt(RemoteBioParameters.Y), optJSONObject2.getInt("w"), optJSONObject2.getInt("h"));
            } else {
                i = i3;
                i2 = i4;
                str = a;
                vh71Var = null;
            }
            if (optJSONObject != null) {
                Object opt5 = optJSONObject.opt("top");
                String str7 = opt5 instanceof String ? (String) opt5 : null;
                Object opt6 = optJSONObject.opt("right");
                String str8 = opt6 instanceof String ? (String) opt6 : null;
                Object opt7 = optJSONObject.opt("left");
                String str9 = opt7 instanceof String ? (String) opt7 : null;
                Object opt8 = optJSONObject.opt("bottom");
                us81Var = new us81(str7, str8, str9, opt8 instanceof String ? (String) opt8 : null);
            } else {
                us81Var = null;
            }
            if (optJSONArray != null) {
                d6w n = y6i0.n(0, optJSONArray.length());
                ArrayList arrayList2 = new ArrayList(tcc.n(n, 10));
                c6w it = n.iterator();
                while (it.c) {
                    JSONObject optJSONObject3 = optJSONArray.optJSONObject(it.nextInt());
                    arrayList2.add(new vh71(optJSONObject3.getInt(RemoteBioParameters.X), optJSONObject3.getInt(RemoteBioParameters.Y), optJSONObject3.getInt(str2), optJSONObject3.getInt("h")));
                    it = it;
                    str2 = str2;
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            y681Var = new y681(str3, str4, str5, str6, us81Var, vh71Var, arrayList);
        } else {
            i = i3;
            i2 = i4;
            str = a;
            y681Var = null;
        }
        String optString = jSONObject.optString("sizeType");
        String str10 = optString.length() > 0 ? optString : null;
        boolean optBoolean = jSONObject.optBoolean("preload", true);
        String optString2 = jSONObject.optString("preview");
        return new cu81(i, i2, str, str10, y681Var, optBoolean, optString2.length() > 0 ? optString2 : null);
    }
}
