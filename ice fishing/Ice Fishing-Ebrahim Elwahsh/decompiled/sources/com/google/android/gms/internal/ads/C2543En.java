package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C4907p;

/* renamed from: com.google.android.gms.internal.ads.En, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2543En implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24820a;

    /* renamed from: b, reason: collision with root package name */
    public final C3700ok f24821b;

    public /* synthetic */ C2543En(C3700ok c3700ok, int i) {
        this.f24820a = i;
        this.f24821b = c3700ok;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L20;
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d() {
        String valueOf;
        switch (this.f24820a) {
            case 0:
                return this.f24821b.a().f30912p.f1421u == 3 ? EnumC2969b9.REWARDED_INTERSTITIAL : EnumC2969b9.REWARD_BASED_VIDEO_AD;
            case 1:
                return this.f24821b.a().f30912p.f1421u == 3 ? "rewarded_interstitial" : "rewarded";
            case 2:
                C3226fu a9 = this.f24821b.a();
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31695i8)).booleanValue()) {
                    q2.d1 d1Var = a9.f30901d;
                    String str = d1Var.f40023Q;
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            valueOf = new JSONObject(str).getString("request_id");
                            break;
                        } catch (JSONException unused) {
                        }
                    }
                    q2.O o9 = d1Var.f40018L;
                    if (o9 != null) {
                        try {
                            valueOf = new JSONObject(o9.f39977n).getString("request_id");
                            break;
                        } catch (JSONException unused2) {
                        }
                    }
                }
                valueOf = String.valueOf(C4907p.f40108g.f40113e.nextInt() & Integer.MAX_VALUE);
                AbstractC3137eE.h(valueOf);
                return valueOf;
            case 3:
                return new Or(2, this.f24821b.a());
            default:
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                return new Ur(c3157eg, this.f24821b.a(), 1);
        }
    }
}
