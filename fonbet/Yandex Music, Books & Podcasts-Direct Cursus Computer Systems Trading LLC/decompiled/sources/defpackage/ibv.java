package defpackage;

import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ibv implements lod {
    public final /* synthetic */ jbv a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ CountDownLatch d;

    public ibv(jbv jbvVar, String[] strArr, int i, CountDownLatch countDownLatch) {
        this.a = jbvVar;
        this.b = strArr;
        this.c = i;
        this.d = countDownLatch;
    }

    @Override // defpackage.lod
    public final void a(rod rodVar) {
        g3c g3cVar;
        String str;
        int i = this.c;
        rodVar.getClass();
        try {
            g3cVar = rodVar.d;
            str = "Error staging photo.";
        } catch (Exception e) {
            this.a.a[i] = e;
        }
        if (g3cVar != null) {
            String d = g3cVar.d();
            if (d != null) {
                str = d;
            }
            throw new d3c(rodVar, str);
        }
        JSONObject jSONObject = rodVar.c;
        if (jSONObject == null) {
            throw new c3c("Error staging photo.");
        }
        String optString = jSONObject.optString("uri");
        if (optString == null) {
            throw new c3c("Error staging photo.");
        }
        this.b[i] = optString;
        this.d.countDown();
    }
}
