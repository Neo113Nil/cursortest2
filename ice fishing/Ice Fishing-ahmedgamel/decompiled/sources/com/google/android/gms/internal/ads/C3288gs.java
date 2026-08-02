package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.gs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3288gs implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31433a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31434b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31435c;

    public /* synthetic */ C3288gs(String str, int i, int i4) {
        this.f31433a = i4;
        this.f31434b = str;
        this.f31435c = i;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        int i;
        int i4;
        switch (this.f31433a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                String str = this.f31434b;
                if (!TextUtils.isEmpty(str) && (i = this.f31435c) != -1) {
                    Bundle b9 = MA.b("pii", bundle);
                    bundle.putBundle("pii", b9);
                    b9.putString("pvid", str);
                    b9.putInt("pvid_s", i);
                    break;
                }
                break;
            case 1:
                Bundle bundle2 = (Bundle) obj;
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Ob)).booleanValue()) {
                    String str2 = this.f31434b;
                    if (!TextUtils.isEmpty(str2)) {
                        bundle2.putString("topics", str2);
                    }
                    int i6 = this.f31435c;
                    if (i6 != -1) {
                        bundle2.putInt("atps", i6);
                        break;
                    }
                }
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                String str3 = this.f31434b;
                if (!TextUtils.isEmpty(str3) && (i4 = this.f31435c) != -1) {
                    try {
                        JSONObject v9 = d6.c.v("pii", jSONObject);
                        v9.put("pvid", str3);
                        v9.put("pvid_s", i4);
                        break;
                    } catch (JSONException e9) {
                        w2.z.l("Failed putting gms core app set ID info.", e9);
                    }
                }
                break;
        }
    }
}
