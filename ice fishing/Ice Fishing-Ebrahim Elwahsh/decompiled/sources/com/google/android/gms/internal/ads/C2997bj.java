package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2997bj implements InterfaceC3725p8 {

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC3858rh f29552n;

    /* renamed from: u, reason: collision with root package name */
    public final Executor f29553u;

    /* renamed from: v, reason: collision with root package name */
    public final C2844Wi f29554v;

    /* renamed from: w, reason: collision with root package name */
    public final S2.a f29555w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f29556x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f29557y = false;

    /* renamed from: z, reason: collision with root package name */
    public final C2878Yi f29558z = new C2878Yi();

    public C2997bj(Executor executor, C2844Wi c2844Wi, S2.a aVar) {
        this.f29553u = executor;
        this.f29554v = c2844Wi;
        this.f29555w = aVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3725p8
    public final void A(C3671o8 c3671o8) {
        boolean z8 = this.f29557y ? false : c3671o8.f33111j;
        C2878Yi c2878Yi = this.f29558z;
        c2878Yi.f28847a = z8;
        this.f29555w.getClass();
        c2878Yi.f28849c = SystemClock.elapsedRealtime();
        c2878Yi.f28851e = c3671o8;
        if (this.f29556x) {
            a();
        }
    }

    public final void a() {
        try {
            JSONObject l9 = this.f29554v.l(this.f29558z);
            if (this.f29552n != null) {
                this.f29553u.execute(new MD(20, this, l9));
            }
        } catch (JSONException e6) {
            t2.C.l("Failed to call video active view js", e6);
        }
    }
}
