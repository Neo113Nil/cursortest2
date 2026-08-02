package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.Reader;
import okhttp3.OkHttpClient;
import ru.yandex.quasar.glagol.backend.model.DeviceToken;

/* loaded from: classes6.dex */
public final class gj2 {
    public final ij2 a;
    public final a4i b;
    public final Gson c = new Gson();

    public gj2(ij2 ij2Var, a4i a4iVar) {
        this.a = ij2Var;
        this.b = a4iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(i08 i08Var, String str) {
        long j;
        Exception exc;
        a4i a4iVar = this.b;
        String r = hrg.r("/glagol/token?device_id=", i08Var.a, "&platform=", i08Var.b);
        ij2 ij2Var = this.a;
        d0o b = ij2Var.a(str, r).b();
        u7e u7eVar = b.a;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        try {
            OkHttpClient okHttpClient = ij2Var.a;
            okHttpClient.getClass();
            l3o execute = new mkn(okHttpClient, b, false).execute();
            int i = execute.d;
            long currentTimeMillis2 = System.currentTimeMillis();
            if (i < 200 || i >= 300) {
                j = currentTimeMillis;
                try {
                    this.b.e("ConnectBackendConversationTokenFailure", "jwt", j, currentTimeMillis2, execute);
                    z = true;
                    throw new IOException("failed to get " + u7eVar + " status code: " + i);
                } catch (Exception e) {
                    e = e;
                    exc = e;
                    a4iVar.getClass();
                    a4iVar.a.S("ConnectBackendConversationTokenError", exc);
                    if (!z) {
                        throw exc;
                    }
                    this.b.d("ConnectBackendConversationTokenError", "jwt", j, System.currentTimeMillis(), b, exc);
                    throw exc;
                }
            }
            try {
                o3o o3oVar = execute.g;
                if (o3oVar == null) {
                    throw new IOException("no response got from " + u7eVar);
                }
                JsonObject i2 = a4iVar.i();
                a4i.b(i2, currentTimeMillis, currentTimeMillis2);
                a4iVar.a.T("ConnectBackendConversationTokenRequest", i2);
                Gson gson = this.c;
                Reader b2 = o3oVar.b();
                gson.getClass();
                return ((DeviceToken) gson.c(b2, TypeToken.get(DeviceToken.class))).getToken();
            } catch (Exception e2) {
                exc = e2;
                j = currentTimeMillis;
                a4iVar.getClass();
                a4iVar.a.S("ConnectBackendConversationTokenError", exc);
                if (!z) {
                }
            }
        } catch (Exception e3) {
            e = e3;
            j = currentTimeMillis;
        }
    }
}
