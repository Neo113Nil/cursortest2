package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Xr implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28589a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f28590b;

    public /* synthetic */ Xr(int i, ArrayList arrayList) {
        this.f28589a = i;
        this.f28590b = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        switch (this.f28589a) {
            case 0:
                ((Bundle) obj).putStringArrayList("ad_types", this.f28590b);
                break;
            case 1:
                Bundle bundle = (Bundle) obj;
                ArrayList arrayList = this.f28590b;
                if (arrayList != null) {
                    bundle.putStringArrayList("android_permissions", new ArrayList<>(arrayList));
                    break;
                }
                break;
            default:
                try {
                    ((JSONObject) obj).put("eid", TextUtils.join(",", this.f28590b));
                    break;
                } catch (JSONException unused) {
                    u2.z.k("Failed putting experiment ids.");
                }
        }
    }
}
