package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.yw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class AsyncTaskC4238yw extends AbstractAsyncTaskC4130ww {

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f35247c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f35248d;

    /* renamed from: e, reason: collision with root package name */
    public final long f35249e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f35250f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTaskC4238yw(S0.c cVar, HashSet hashSet, JSONObject jSONObject, long j6, int i) {
        super(cVar);
        this.f35250f = i;
        this.f35247c = new HashSet(hashSet);
        this.f35248d = jSONObject;
        this.f35249e = j6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC4130ww
    /* renamed from: a */
    public final void onPostExecute(String str) {
        C3161ew c3161ew;
        switch (this.f35250f) {
            case 0:
                b(str);
                super.onPostExecute(str);
                break;
            default:
                if (!TextUtils.isEmpty(str) && (c3161ew = C3161ew.f30001c) != null) {
                    for (Uv uv : Collections.unmodifiableCollection(c3161ew.f30002a)) {
                        if (this.f35247c.contains(uv.f28042g)) {
                            AbstractC3645nw abstractC3645nw = uv.f28039d;
                            if (this.f35249e >= abstractC3645nw.f32810c) {
                                abstractC3645nw.f32811d = 2;
                                V2.f28077z.z(abstractC3645nw.c(), "setNativeViewHierarchy", str, abstractC3645nw.f32808a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
        }
    }

    public void b(String str) {
        C3161ew c3161ew = C3161ew.f30001c;
        if (c3161ew != null) {
            for (Uv uv : Collections.unmodifiableCollection(c3161ew.f30002a)) {
                if (this.f35247c.contains(uv.f28042g)) {
                    AbstractC3645nw abstractC3645nw = uv.f28039d;
                    if (this.f35249e >= abstractC3645nw.f32810c && abstractC3645nw.f32811d != 3) {
                        abstractC3645nw.f32811d = 3;
                        V2.f28077z.z(abstractC3645nw.c(), "setNativeViewHierarchy", str, abstractC3645nw.f32808a);
                    }
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        switch (this.f35250f) {
            case 0:
                return this.f35248d.toString();
            default:
                S0.c cVar = this.f34905b;
                JSONObject jSONObject = (JSONObject) cVar.f2775u;
                JSONObject jSONObject2 = this.f35248d;
                if (AbstractC3914sw.e(jSONObject2, jSONObject)) {
                    return null;
                }
                cVar.f2775u = jSONObject2;
                return jSONObject2.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC4130ww, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f35250f) {
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
