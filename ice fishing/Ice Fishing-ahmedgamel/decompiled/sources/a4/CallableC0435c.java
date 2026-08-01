package a4;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: a4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC0435c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0436d f4341b;

    public /* synthetic */ CallableC0435c(C0436d c0436d, int i) {
        this.f4340a = i;
        this.f4341b = c0436d;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        switch (this.f4340a) {
            case 0:
                C0436d c0436d = this.f4341b;
                synchronized (c0436d) {
                    try {
                        h hVar = (h) c0436d.f4342a.get();
                        ArrayList c9 = hVar.c();
                        hVar.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < c9.size(); i++) {
                            C0433a c0433a = (C0433a) c9.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(com.anythink.core.common.m.b.g.f14525h, c0433a.f4336a);
                            jSONObject.put("dates", new JSONArray((Collection) c0433a.f4337b));
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
                C0436d c0436d2 = this.f4341b;
                synchronized (c0436d2) {
                    ((h) c0436d2.f4342a.get()).h(((l4.b) c0436d2.f4344c.get()).a(), System.currentTimeMillis());
                }
                return null;
        }
    }
}
