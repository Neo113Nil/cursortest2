package c4;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: c4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC0552c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5733a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0553d f5734b;

    public /* synthetic */ CallableC0552c(C0553d c0553d, int i) {
        this.f5733a = i;
        this.f5734b = c0553d;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        switch (this.f5733a) {
            case 0:
                C0553d c0553d = this.f5734b;
                synchronized (c0553d) {
                    try {
                        h hVar = (h) c0553d.f5735a.get();
                        ArrayList c9 = hVar.c();
                        hVar.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < c9.size(); i++) {
                            C0550a c0550a = (C0550a) c9.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(com.anythink.core.common.m.b.g.f15311h, c0550a.f5729a);
                            jSONObject.put("dates", new JSONArray((Collection) c0550a.f5730b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put(com.anythink.expressad.foundation.g.a.i, "2");
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
                C0553d c0553d2 = this.f5734b;
                synchronized (c0553d2) {
                    ((h) c0553d2.f5735a.get()).h(((n4.b) c0553d2.f5737c.get()).a(), System.currentTimeMillis());
                }
                return null;
        }
    }
}
