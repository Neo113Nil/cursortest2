package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import com.connectsdk.device.ConnectableDevice;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gbr implements v7o {
    public final /* synthetic */ vjp a;
    public final /* synthetic */ Boolean b;
    public final /* synthetic */ tao c;

    public gbr(tao taoVar, vjp vjpVar, Boolean bool) {
        this.c = taoVar;
        this.a = vjpVar;
        this.b = bool;
    }

    @Override // defpackage.v7o
    public final void onError(veb vebVar) {
        ArrayList arrayList = (ArrayList) this.c.e;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((hbr) arrayList.get(i)).a.trim().equals(this.a.a.trim())) {
                ((hbr) arrayList.get(i)).f = Boolean.FALSE;
                return;
            }
        }
    }

    @Override // defpackage.v7o
    public final void onSuccess(Object obj) {
        int i;
        vz7 vz7Var = (vz7) obj;
        tao taoVar = this.c;
        String str = this.a.a;
        ArrayList arrayList = (ArrayList) taoVar.e;
        int i2 = 0;
        while (true) {
            if (i2 >= arrayList.size()) {
                break;
            }
            if (((hbr) arrayList.get(i2)).a.trim().equals(str.trim())) {
                arrayList.remove(i2);
                break;
            }
            i2++;
        }
        try {
            i = Integer.parseInt(vz7Var.b.substring(0, 2));
        } catch (NumberFormatException unused) {
            i = 0;
        }
        if (i >= 16) {
            tao taoVar2 = this.c;
            vjp vjpVar = this.a;
            ((ArrayList) this.c.e).add(new hbr(vjpVar.a, (String) ((n3m) taoVar2.a).b, vz7Var.n, vjpVar.f.toString(), vz7Var.h, this.b));
            tao taoVar3 = this.c;
            synchronized (taoVar3) {
                synchronized (taoVar3) {
                    try {
                        JSONArray jSONArray = new JSONArray();
                        for (int i3 = 0; i3 < ((ArrayList) taoVar3.e).size(); i3++) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(ConnectableDevice.KEY_ID, ((hbr) ((ArrayList) taoVar3.e).get(i3)).a);
                                jSONObject.put("ssid", ((hbr) ((ArrayList) taoVar3.e).get(i3)).b);
                                jSONObject.put("mac", ((hbr) ((ArrayList) taoVar3.e).get(i3)).c);
                                jSONObject.put("uri", ((hbr) ((ArrayList) taoVar3.e).get(i3)).d);
                                jSONObject.put("name", ((hbr) ((ArrayList) taoVar3.e).get(i3)).e);
                                jSONArray.put(jSONObject);
                                SharedPreferences.Editor edit = ((SharedPreferences) taoVar3.b).edit();
                                edit.putString("STANDBYLIST_KEY", jSONArray.toString());
                                edit.apply();
                            } catch (Exception e) {
                                Log.e("StndbyDLHndlr", "close(): Error: " + e.getMessage());
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }
}
