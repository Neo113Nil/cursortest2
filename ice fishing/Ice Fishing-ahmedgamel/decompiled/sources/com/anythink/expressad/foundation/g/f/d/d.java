package com.anythink.expressad.foundation.g.f.d;

import com.anythink.expressad.foundation.g.f.l;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d extends e<JSONObject> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f19295c = "d";

    public d(int i, String str, String str2, com.anythink.expressad.foundation.g.f.e<JSONObject> eVar) {
        super(i, str, str2, eVar);
    }

    @Override // com.anythink.expressad.foundation.g.f.j
    public final l<JSONObject> a(com.anythink.expressad.foundation.g.f.f.c cVar) {
        try {
            return cVar.f19319a == 204 ? l.a(new JSONObject(), cVar) : l.a(new JSONObject(new String(cVar.f19320b, com.anythink.expressad.foundation.g.f.g.d.a(cVar.f19322d))), cVar);
        } catch (UnsupportedEncodingException e9) {
            e9.getMessage();
            return l.a(new com.anythink.expressad.foundation.g.f.a.a(8, cVar));
        } catch (JSONException e10) {
            e10.getMessage();
            return l.a(new com.anythink.expressad.foundation.g.f.a.a(8, cVar));
        }
    }

    private d(int i, String str, String str2, com.anythink.expressad.foundation.g.f.e<JSONObject> eVar, boolean z3) {
        super(i, str, str2, eVar, z3);
    }
}
