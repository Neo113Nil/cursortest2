package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.Reader;
import okhttp3.OkHttpClient;
import ru.yandex.quasar.glagol.backend.model.Devices;

/* loaded from: classes6.dex */
public final class o6n {
    public final ij2 a;
    public final a4i b;
    public final Gson c = new Gson();

    public o6n(ij2 ij2Var, a4i a4iVar) {
        this.a = ij2Var;
        this.b = a4iVar;
    }

    public final Devices a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        ij2 ij2Var = this.a;
        d0o b = ij2Var.a(str, "/muspult/device_list").b();
        u7e u7eVar = b.a;
        try {
            OkHttpClient okHttpClient = ij2Var.a;
            okHttpClient.getClass();
            l3o execute = new mkn(okHttpClient, b, false).execute();
            int i = execute.d;
            long currentTimeMillis2 = System.currentTimeMillis();
            if (i < 200 || i >= 300) {
                this.b.e("BackendDeviceListFailure", "quasar", currentTimeMillis, currentTimeMillis2, execute);
                throw new IOException("failed to get " + u7eVar + " status code: " + i);
            }
            o3o o3oVar = execute.g;
            if (o3oVar == null) {
                throw new IOException("no response got from " + u7eVar);
            }
            Gson gson = this.c;
            Reader b2 = o3oVar.b();
            gson.getClass();
            Devices devices = (Devices) gson.c(b2, TypeToken.get(Devices.class));
            try {
                this.b.g(currentTimeMillis, currentTimeMillis2, devices);
                return devices;
            } catch (Exception e) {
                e = e;
                currentTimeMillis = currentTimeMillis;
                Exception exc = e;
                a4i a4iVar = this.b;
                a4iVar.getClass();
                a4iVar.a.S("BackendDeviceListError", exc);
                if (0 == 0) {
                    this.b.d("BackendDeviceListError", "quasar", currentTimeMillis, System.currentTimeMillis(), b, exc);
                }
                throw new IOException("Failed to get connected devices", exc);
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
