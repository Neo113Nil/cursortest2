package W3;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3452a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f3453b;

    public /* synthetic */ c(d dVar, int i) {
        this.f3452a = i;
        this.f3453b = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        switch (this.f3452a) {
            case 0:
                d dVar = this.f3453b;
                synchronized (dVar) {
                    try {
                        h hVar = (h) dVar.f3454a.get();
                        ArrayList c4 = hVar.c();
                        hVar.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < c4.size(); i++) {
                            a aVar = (a) c4.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(com.anythink.core.common.m.b.g.f14682h, aVar.f3448a);
                            jSONObject.put("dates", new JSONArray((Collection) aVar.f3449b));
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
                d dVar2 = this.f3453b;
                synchronized (dVar2) {
                    ((h) dVar2.f3454a.get()).h(((h4.b) dVar2.f3456c.get()).a(), System.currentTimeMillis());
                }
                return null;
        }
    }
}
