package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Xr implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29370a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f29371b;

    public /* synthetic */ Xr(int i, ArrayList arrayList) {
        this.f29370a = i;
        this.f29371b = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        switch (this.f29370a) {
            case 0:
                ((Bundle) obj).putStringArrayList("ad_types", this.f29371b);
                break;
            case 1:
                Bundle bundle = (Bundle) obj;
                ArrayList arrayList = this.f29371b;
                if (arrayList != null) {
                    bundle.putStringArrayList("android_permissions", new ArrayList<>(arrayList));
                    break;
                }
                break;
            default:
                try {
                    ((JSONObject) obj).put("eid", TextUtils.join(",", this.f29371b));
                    break;
                } catch (JSONException unused) {
                    w2.z.k("Failed putting experiment ids.");
                }
        }
    }
}
