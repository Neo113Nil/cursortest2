package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C4900p;

/* renamed from: com.google.android.gms.internal.ads.Cn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2510Cn implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24226a;

    /* renamed from: b, reason: collision with root package name */
    public final C3795qk f24227b;

    public /* synthetic */ C2510Cn(C3795qk c3795qk, int i) {
        this.f24226a = i;
        this.f24227b = c3795qk;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L20;
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f() {
        String valueOf;
        switch (this.f24226a) {
            case 0:
                return this.f24227b.a().f29634p.f1974u == 3 ? EnumC3121e9.REWARDED_INTERSTITIAL : EnumC3121e9.REWARD_BASED_VIDEO_AD;
            case 1:
                return this.f24227b.a().f29634p.f1974u == 3 ? "rewarded_interstitial" : "rewarded";
            case 2:
                C3052cu a9 = this.f24227b.a();
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32276i8)).booleanValue()) {
                    q2.c1 c1Var = a9.f29623d;
                    String str = c1Var.f40109Q;
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            valueOf = new JSONObject(str).getString("request_id");
                            break;
                        } catch (JSONException unused) {
                        }
                    }
                    q2.O o6 = c1Var.f40104L;
                    if (o6 != null) {
                        try {
                            valueOf = new JSONObject(o6.f40067n).getString("request_id");
                            break;
                        } catch (JSONException unused2) {
                        }
                    }
                }
                valueOf = String.valueOf(C4900p.f40196g.f40201e.nextInt() & Integer.MAX_VALUE);
                AbstractC3341iD.j(valueOf);
                return valueOf;
            case 3:
                return new Lr(2, this.f24227b.a());
            default:
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                return new Sr(c3360ig, this.f24227b.a(), 1);
        }
    }
}
