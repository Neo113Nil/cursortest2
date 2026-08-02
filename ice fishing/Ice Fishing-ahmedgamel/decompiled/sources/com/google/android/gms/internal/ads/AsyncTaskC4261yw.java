package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.yw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class AsyncTaskC4261yw extends AbstractAsyncTaskC4153ww {

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f36031c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f36032d;

    /* renamed from: e, reason: collision with root package name */
    public final long f36033e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f36034f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTaskC4261yw(S0.c cVar, HashSet hashSet, JSONObject jSONObject, long j6, int i) {
        super(cVar);
        this.f36034f = i;
        this.f36031c = new HashSet(hashSet);
        this.f36032d = jSONObject;
        this.f36033e = j6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC4153ww
    /* renamed from: a */
    public final void onPostExecute(String str) {
        C3238fw c3238fw;
        switch (this.f36034f) {
            case 0:
                b(str);
                super.onPostExecute(str);
                break;
            default:
                if (!TextUtils.isEmpty(str) && (c3238fw = C3238fw.f31233c) != null) {
                    for (Uv uv : Collections.unmodifiableCollection(c3238fw.f31234a)) {
                        if (this.f36031c.contains(uv.f28839g)) {
                            AbstractC3722ow abstractC3722ow = uv.f28836d;
                            if (this.f36033e >= abstractC3722ow.f33767c) {
                                abstractC3722ow.f33768d = 2;
                                V2.f28874z.z(abstractC3722ow.c(), "setNativeViewHierarchy", str, abstractC3722ow.f33765a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
        }
    }

    public void b(String str) {
        C3238fw c3238fw = C3238fw.f31233c;
        if (c3238fw != null) {
            for (Uv uv : Collections.unmodifiableCollection(c3238fw.f31234a)) {
                if (this.f36031c.contains(uv.f28839g)) {
                    AbstractC3722ow abstractC3722ow = uv.f28836d;
                    if (this.f36033e >= abstractC3722ow.f33767c && abstractC3722ow.f33768d != 3) {
                        abstractC3722ow.f33768d = 3;
                        V2.f28874z.z(abstractC3722ow.c(), "setNativeViewHierarchy", str, abstractC3722ow.f33765a);
                    }
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        switch (this.f36034f) {
            case 0:
                return this.f36032d.toString();
            default:
                S0.c cVar = this.f35686b;
                JSONObject jSONObject = (JSONObject) cVar.f2902u;
                JSONObject jSONObject2 = this.f36032d;
                if (AbstractC3937sw.e(jSONObject2, jSONObject)) {
                    return null;
                }
                cVar.f2902u = jSONObject2;
                return jSONObject2.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC4153ww, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f36034f) {
            case 0:
                String str = (String) obj;
                b(str);
                super.onPostExecute(str);
                break;
            default:
                onPostExecute((String) obj);
                break;
        }
    }
}
