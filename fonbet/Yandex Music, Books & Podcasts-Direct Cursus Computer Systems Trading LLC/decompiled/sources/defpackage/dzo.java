package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.connectsdk.device.ConnectableDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.kinopoisk.sdk.easylogin.internal.K8;

/* loaded from: classes3.dex */
public final class dzo {
    public static dzo m;
    public final Context a;
    public int d;
    public int e;
    public tao f;
    public volatile K8.c j;
    public volatile azo k;
    public volatile bzo l;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final pwe g = new pwe(this);
    public boolean h = false;
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();

    public dzo(Context context) {
        this.a = context;
    }

    public final void a() {
        JSONArray jSONArray;
        ArrayList arrayList = this.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((e5p) it.next()).a) {
                return;
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        Context context = this.a;
        pwe pweVar = this.g;
        if (isEmpty) {
            Log.w("Search", "No search providers specified. Adding default providers...");
            arrayList.add(new i4h(context, pweVar));
            arrayList.add(new m4h(context, pweVar));
        }
        this.i.clear();
        int size = arrayList.size();
        this.e = size;
        this.d = size;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            jjo.a(new zyo(this, (e5p) it2.next(), 0));
        }
        Log.d("Search", "start() called & Discovery started.");
        if (tao.f == null) {
            tao taoVar = new tao();
            taoVar.b = context.getSharedPreferences("com.samsung.smartviewSDK.standbydevices", 0);
            taoVar.d = Boolean.FALSE;
            taoVar.e = new ArrayList();
            String string = ((SharedPreferences) taoVar.b).getString("STANDBYLIST_KEY", null);
            if (string == null || string.equals("[]")) {
                jSONArray = new JSONArray();
            } else {
                try {
                    jSONArray = new JSONArray(string);
                } catch (Exception e) {
                    Log.e("StndbyDLHndlr", "StandbyDeviceListHandler: Error: " + e.getMessage());
                }
            }
            try {
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                        ((ArrayList) taoVar.e).add(new hbr(jSONObject.getString(ConnectableDevice.KEY_ID), jSONObject.getString("ssid"), jSONObject.getString("mac"), jSONObject.getString("uri"), jSONObject.getString("name"), Boolean.FALSE));
                    }
                }
                taoVar.a = new n3m(taoVar, context, pweVar);
            } catch (Exception e2) {
                Log.e("StndbyDLHndlr", "StandbyDeviceListHandler: Error: " + e2.getMessage());
            }
            tao.f = taoVar;
        }
        tao taoVar2 = tao.f;
        this.f = taoVar2;
        taoVar2.getClass();
        new Timer("showStandbyTVTimer", true).schedule(new fbr(0, taoVar2), 7000L);
    }
}
