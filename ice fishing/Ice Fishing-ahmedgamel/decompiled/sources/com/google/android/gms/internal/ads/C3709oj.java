package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;
import r2.C4906k;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.oj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3709oj implements InterfaceC2663Kk {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33713n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f33714u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C5189a f33715v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ St f33716w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C3075cu f33717x;

    public /* synthetic */ C3709oj(Context context, C5189a c5189a, St st, C3075cu c3075cu, int i) {
        this.f33713n = i;
        this.f33714u = context;
        this.f33715v = c5189a;
        this.f33716w = st;
        this.f33717x = c3075cu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2663Kk
    public final void h() {
        switch (this.f33713n) {
            case 0:
                JSONObject jSONObject = this.f33716w.f28361C;
                C4906k.f40186C.f40202o.d(this.f33714u, this.f33715v.f41845n, jSONObject.toString(), this.f33717x.f30396g);
                break;
            default:
                JSONObject jSONObject2 = this.f33716w.f28361C;
                C4906k.f40186C.f40202o.d(this.f33714u, this.f33715v.f41845n, jSONObject2.toString(), this.f33717x.f30396g);
                break;
        }
    }
}
