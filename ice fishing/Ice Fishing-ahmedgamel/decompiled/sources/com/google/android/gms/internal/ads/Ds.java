package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.Base64;
import com.anythink.core.common.e.a;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C4900p;

/* loaded from: classes2.dex */
public final class Ds implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24483a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f24484b;

    public /* synthetic */ Ds(HashMap hashMap, int i) {
        this.f24483a = i;
        this.f24484b = hashMap;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        switch (this.f24483a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                HashMap hashMap = this.f24484b;
                if (!hashMap.isEmpty()) {
                    if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.K8)).booleanValue()) {
                        C3180fE B9 = C3342iE.B();
                        for (Map.Entry entry : hashMap.entrySet()) {
                            ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
                            if (!arrayDeque.isEmpty()) {
                                C3637no c3637no = (C3637no) entry.getKey();
                                int i = c3637no.f32769b;
                                int i6 = 1;
                                if (i != 0) {
                                    if (i != 1) {
                                        i6 = 3;
                                        if (i != 2) {
                                            i6 = i != 3 ? 0 : 4;
                                        }
                                    } else {
                                        i6 = 2;
                                    }
                                }
                                if (i6 != 0) {
                                    C3073dE A9 = C3126eE.A();
                                    A9.h();
                                    ((C3126eE) A9.f27721u).B(c3637no.f32768a);
                                    A9.h();
                                    ((C3126eE) A9.f27721u).C(i6);
                                    C3126eE c3126eE = (C3126eE) A9.j();
                                    C3234gE A10 = C3288hE.A();
                                    A10.h();
                                    ((C3288hE) A10.f27721u).B(c3126eE);
                                    A10.h();
                                    ((C3288hE) A10.f27721u).C(arrayDeque);
                                    B9.h();
                                    ((C3342iE) B9.f27721u).C((C3288hE) A10.j());
                                }
                            }
                        }
                        C3342iE c3342iE = (C3342iE) B9.j();
                        if (c3342iE.A() > 0) {
                            bundle.putString("ods", Base64.encodeToString(c3342iE.b(), 11));
                            break;
                        }
                    } else {
                        JSONArray jSONArray = new JSONArray();
                        for (Map.Entry entry2 : hashMap.entrySet()) {
                            ArrayDeque arrayDeque2 = (ArrayDeque) entry2.getValue();
                            if (!arrayDeque2.isEmpty()) {
                                C3637no c3637no2 = (C3637no) entry2.getKey();
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("id", c3637no2.f32768a);
                                    jSONObject.put(a.C0077a.f12904b, c3637no2.f32769b);
                                    JSONArray jSONArray2 = new JSONArray();
                                    Iterator it = arrayDeque2.iterator();
                                    while (it.hasNext()) {
                                        jSONArray2.put((Long) it.next());
                                    }
                                    jSONObject.put("timestamps", jSONArray2);
                                    jSONArray.put(jSONObject);
                                } catch (JSONException e9) {
                                    u2.z.l("Failed putting the on-device storage record.", e9);
                                }
                            }
                        }
                        if (jSONArray.length() > 0) {
                            bundle.putString("on_device_storage_records", jSONArray.toString());
                            break;
                        }
                    }
                }
                break;
            default:
                try {
                    ((JSONObject) obj).put("video_decoders", C4900p.f40199g.f40200a.l(this.f24484b));
                    break;
                } catch (JSONException e10) {
                    u2.z.k("Could not encode video decoder properties: ".concat(String.valueOf(e10.getMessage())));
                }
        }
    }
}
