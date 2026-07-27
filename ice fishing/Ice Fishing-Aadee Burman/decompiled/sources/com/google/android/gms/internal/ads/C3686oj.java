package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;
import p2.C4835j;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.oj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3686oj implements InterfaceC2643Kk {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32927n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f32928u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C5110a f32929v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ St f32930w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C3052cu f32931x;

    public /* synthetic */ C3686oj(Context context, C5110a c5110a, St st, C3052cu c3052cu, int i) {
        this.f32927n = i;
        this.f32928u = context;
        this.f32929v = c5110a;
        this.f32930w = st;
        this.f32931x = c3052cu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2643Kk
    public final void h() {
        switch (this.f32927n) {
            case 0:
                JSONObject jSONObject = this.f32930w.f27578C;
                C4835j.f39730C.f39746o.d(this.f32928u, this.f32929v.f41388n, jSONObject.toString(), this.f32931x.f29626g);
                break;
            default:
                JSONObject jSONObject2 = this.f32930w.f27578C;
                C4835j.f39730C.f39746o.d(this.f32928u, this.f32929v.f41388n, jSONObject2.toString(), this.f32931x.f29626g);
                break;
        }
    }
}
