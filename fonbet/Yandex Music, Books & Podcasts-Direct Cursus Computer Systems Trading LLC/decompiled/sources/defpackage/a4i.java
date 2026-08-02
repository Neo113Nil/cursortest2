package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.device.DefaultConnectableDeviceStore;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.Iterator;
import java.util.List;
import ru.yandex.quasar.glagol.backend.model.Device;
import ru.yandex.quasar.glagol.backend.model.Devices;
import ru.yandex.quasar.glagol.backend.model.QuasarInfo;
import ru.yandex.quasar.glagol.backend.model.SmartDevice;
import ru.yandex.quasar.glagol.backend.model.SmarthomeResult;

/* loaded from: classes6.dex */
public final class a4i {
    public final t1f a;
    public final ConnectivityManager b;
    public final WifiManager c;
    public final jyr d;

    public a4i(Context context, p46 p46Var) {
        Context applicationContext;
        Context applicationContext2;
        p46Var.getClass();
        t1f t1fVar = new t1f(context, p46Var.a);
        this.a = t1fVar;
        Object obj = null;
        this.b = (ConnectivityManager) ((context == null || (applicationContext2 = context.getApplicationContext()) == null) ? null : applicationContext2.getSystemService("connectivity"));
        if (context != null && (applicationContext = context.getApplicationContext()) != null) {
            obj = applicationContext.getSystemService("wifi");
        }
        this.c = (WifiManager) obj;
        this.d = btf.b(grb.y0);
        JsonObject jsonObject = new JsonObject();
        jsonObject.u("glagolsdk-android", "4.1.1");
        t1fVar.V(jsonObject, "glagolsdk");
    }

    public static void a(JsonObject jsonObject, v68 v68Var) {
        jsonObject.r("device", c(v68Var));
        jsonObject.u("host", v68Var.getURI().getHost());
        jsonObject.s(Integer.valueOf(v68Var.getURI().getPort()), "port");
    }

    public static void b(JsonObject jsonObject, long j, long j2) {
        jsonObject.s(Long.valueOf(j), "startTime");
        jsonObject.s(Long.valueOf(j2), "endTime");
        jsonObject.s(Long.valueOf(j2 - j), "durationMS");
    }

    public static JsonObject c(v68 v68Var) {
        String deviceId = v68Var.getDeviceId();
        String platform = v68Var.getPlatform();
        JsonObject jsonObject = new JsonObject();
        jsonObject.u(ConnectableDevice.KEY_ID, deviceId);
        jsonObject.u("platform", platform);
        jsonObject.u("host", v68Var.getURI().getHost());
        jsonObject.s(Integer.valueOf(v68Var.getURI().getPort()), "port");
        return jsonObject;
    }

    public final void d(String str, String str2, long j, long j2, d0o d0oVar, Exception exc) {
        JsonObject i = i();
        b(i, j, j2);
        i.u("source", str2);
        i.u("url", d0oVar.a.i);
        i.s(666, "errorCode");
        i.u("errorDomain", exc.toString());
        this.a.T(str, i);
    }

    public final void e(String str, String str2, long j, long j2, l3o l3oVar) {
        JsonObject i = i();
        b(i, j, j2);
        i.u("source", str2);
        i.u("url", l3oVar.a.a.i);
        i.s(Integer.valueOf(l3oVar.d), "errorCode");
        this.a.T(str, i);
    }

    public final void f(String str, long j, long j2, Exception exc) {
        JsonObject i = i();
        b(i, j, j2);
        i.u("serviceName", str);
        i.u("errorDomain", exc.toString());
        t1f t1fVar = this.a;
        t1fVar.T("DiscoveryMdnsSearchFailure", i);
        t1fVar.S("DiscoveryMdnsSearchFailure", exc);
    }

    public final void g(long j, long j2, Devices devices) {
        devices.getClass();
        JsonObject i = i();
        b(i, j, j2);
        i.u("source", "quasar");
        JsonArray jsonArray = new JsonArray(devices.getDevices().size());
        List<Device> devices2 = devices.getDevices();
        devices2.getClass();
        for (Device device : devices2) {
            String id = device.getId();
            String platform = device.getPlatform();
            JsonObject jsonObject = new JsonObject();
            jsonObject.u(ConnectableDevice.KEY_ID, id);
            jsonObject.u("platform", platform);
            jsonArray.r(jsonObject);
        }
        i.r(DefaultConnectableDeviceStore.KEY_DEVICES, jsonArray);
        this.a.T("BackendDeviceListRequested", i);
    }

    public final void h(long j, long j2, SmarthomeResult smarthomeResult) {
        JsonObject i = i();
        b(i, j, j2);
        i.u("source", "iot");
        JsonArray jsonArray = new JsonArray(smarthomeResult.devices.size());
        List<SmartDevice> list = smarthomeResult.devices;
        list.getClass();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            QuasarInfo quasarInfo = ((SmartDevice) it.next()).getQuasarInfo();
            if (quasarInfo != null) {
                String deviceId = quasarInfo.getDeviceId();
                String platform = quasarInfo.getPlatform();
                JsonObject jsonObject = new JsonObject();
                jsonObject.u(ConnectableDevice.KEY_ID, deviceId);
                jsonObject.u("platform", platform);
                jsonArray.r(jsonObject);
            }
        }
        i.r(DefaultConnectableDeviceStore.KEY_DEVICES, jsonArray);
        this.a.T("BackendDeviceListRequested", i);
    }

    public final JsonObject i() {
        NetworkInfo networkInfo;
        JsonObject jsonObject = new JsonObject();
        WifiManager wifiManager = this.c;
        if (wifiManager != null) {
            ConnectivityManager connectivityManager = this.b;
            jsonObject.u("wifiSsid", (connectivityManager == null || (networkInfo = connectivityManager.getNetworkInfo(1)) == null) ? false : networkInfo.isConnected() ? wifiManager.getConnectionInfo().getSSID() : null);
        }
        return jsonObject;
    }
}
