package defpackage;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class tm7 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ um7 b;

    public /* synthetic */ tm7(um7 um7Var, int i) {
        this.a = i;
        this.b = um7Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        switch (this.a) {
            case 0:
                um7 um7Var = this.b;
                synchronized (um7Var) {
                    try {
                        ke2 ke2Var = (ke2) um7Var.a.get();
                        ArrayList d = ke2Var.d();
                        ke2Var.c();
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < d.size(); i++) {
                            hd2 hd2Var = (hd2) d.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", hd2Var.a);
                            jSONObject.put("dates", new JSONArray((Collection) hd2Var.b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return byteArrayOutputStream;
            default:
                um7 um7Var2 = this.b;
                synchronized (um7Var2) {
                    ((ke2) um7Var2.a.get()).n(System.currentTimeMillis(), ((ht7) um7Var2.c.get()).a());
                }
                return null;
        }
    }
}
