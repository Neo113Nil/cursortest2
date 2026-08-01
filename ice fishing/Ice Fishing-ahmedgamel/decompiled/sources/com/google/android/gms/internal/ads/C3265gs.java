package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.gs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3265gs implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30664a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30665b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30666c;

    public /* synthetic */ C3265gs(String str, int i, int i6) {
        this.f30664a = i6;
        this.f30665b = str;
        this.f30666c = i;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        int i;
        int i6;
        switch (this.f30664a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                String str = this.f30665b;
                if (!TextUtils.isEmpty(str) && (i = this.f30666c) != -1) {
                    Bundle b9 = MA.b("pii", bundle);
                    bundle.putBundle("pii", b9);
                    b9.putString("pvid", str);
                    b9.putInt("pvid_s", i);
                    break;
                }
                break;
            case 1:
                Bundle bundle2 = (Bundle) obj;
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Ob)).booleanValue()) {
                    String str2 = this.f30665b;
                    if (!TextUtils.isEmpty(str2)) {
                        bundle2.putString("topics", str2);
                    }
                    int i9 = this.f30666c;
                    if (i9 != -1) {
                        bundle2.putInt("atps", i9);
                        break;
                    }
                }
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                String str3 = this.f30665b;
                if (!TextUtils.isEmpty(str3) && (i6 = this.f30666c) != -1) {
                    try {
                        JSONObject N8 = A8.b.N("pii", jSONObject);
                        N8.put("pvid", str3);
                        N8.put("pvid_s", i6);
                        break;
                    } catch (JSONException e9) {
                        u2.z.l("Failed putting gms core app set ID info.", e9);
                    }
                }
                break;
        }
    }
}
