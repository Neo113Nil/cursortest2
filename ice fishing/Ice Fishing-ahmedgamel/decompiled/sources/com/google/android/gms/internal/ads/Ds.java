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
import s2.C4949p;

/* loaded from: classes2.dex */
public final class Ds implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25244a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f25245b;

    public /* synthetic */ Ds(HashMap hashMap, int i) {
        this.f25244a = i;
        this.f25245b = hashMap;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        switch (this.f25244a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                HashMap hashMap = this.f25245b;
                if (!hashMap.isEmpty()) {
                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.K8)).booleanValue()) {
                        C3203fE B3 = C3365iE.B();
                        for (Map.Entry entry : hashMap.entrySet()) {
                            ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
                            if (!arrayDeque.isEmpty()) {
                                C3714oo c3714oo = (C3714oo) entry.getKey();
                                int i = c3714oo.f33731b;
                                int i4 = 1;
                                if (i != 0) {
                                    if (i != 1) {
                                        i4 = 3;
                                        if (i != 2) {
                                            i4 = i != 3 ? 0 : 4;
                                        }
                                    } else {
                                        i4 = 2;
                                    }
                                }
                                if (i4 != 0) {
                                    C3096dE A9 = C3149eE.A();
                                    A9.h();
                                    ((C3149eE) A9.f28504u).B(c3714oo.f33730a);
                                    A9.h();
                                    ((C3149eE) A9.f28504u).C(i4);
                                    C3149eE c3149eE = (C3149eE) A9.j();
                                    C3257gE A10 = C3311hE.A();
                                    A10.h();
                                    ((C3311hE) A10.f28504u).B(c3149eE);
                                    A10.h();
                                    ((C3311hE) A10.f28504u).C(arrayDeque);
                                    B3.h();
                                    ((C3365iE) B3.f28504u).C((C3311hE) A10.j());
                                }
                            }
                        }
                        C3365iE c3365iE = (C3365iE) B3.j();
                        if (c3365iE.A() > 0) {
                            bundle.putString("ods", Base64.encodeToString(c3365iE.b(), 11));
                            break;
                        }
                    } else {
                        JSONArray jSONArray = new JSONArray();
                        for (Map.Entry entry2 : hashMap.entrySet()) {
                            ArrayDeque arrayDeque2 = (ArrayDeque) entry2.getValue();
                            if (!arrayDeque2.isEmpty()) {
                                C3714oo c3714oo2 = (C3714oo) entry2.getKey();
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("id", c3714oo2.f33730a);
                                    jSONObject.put(a.C0077a.f13690b, c3714oo2.f33731b);
                                    JSONArray jSONArray2 = new JSONArray();
                                    Iterator it = arrayDeque2.iterator();
                                    while (it.hasNext()) {
                                        jSONArray2.put((Long) it.next());
                                    }
                                    jSONObject.put("timestamps", jSONArray2);
                                    jSONArray.put(jSONObject);
                                } catch (JSONException e9) {
                                    w2.z.l("Failed putting the on-device storage record.", e9);
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
                    ((JSONObject) obj).put("video_decoders", C4949p.f40498g.f40499a.l(this.f25245b));
                    break;
                } catch (JSONException e10) {
                    w2.z.k("Could not encode video decoder properties: ".concat(String.valueOf(e10.getMessage())));
                }
        }
    }
}
