package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import s2.C4949p;

/* renamed from: com.google.android.gms.internal.ads.Dn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2547Dn implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25212a;

    /* renamed from: b, reason: collision with root package name */
    public final C3818qk f25213b;

    public /* synthetic */ C2547Dn(C3818qk c3818qk, int i) {
        this.f25212a = i;
        this.f25213b = c3818qk;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L20;
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f() {
        String valueOf;
        switch (this.f25212a) {
            case 0:
                return this.f25213b.a().f30404p.f2062u == 3 ? EnumC3144e9.REWARDED_INTERSTITIAL : EnumC3144e9.REWARD_BASED_VIDEO_AD;
            case 1:
                return this.f25213b.a().f30404p.f2062u == 3 ? "rewarded_interstitial" : "rewarded";
            case 2:
                C3075cu a9 = this.f25213b.a();
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33055i8)).booleanValue()) {
                    s2.c1 c1Var = a9.f30393d;
                    String str = c1Var.f40411Q;
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            valueOf = new JSONObject(str).getString("request_id");
                            break;
                        } catch (JSONException unused) {
                        }
                    }
                    s2.O o4 = c1Var.f40406L;
                    if (o4 != null) {
                        try {
                            valueOf = new JSONObject(o4.f40369n).getString("request_id");
                            break;
                        } catch (JSONException unused2) {
                        }
                    }
                }
                valueOf = String.valueOf(C4949p.f40498g.f40503e.nextInt() & Integer.MAX_VALUE);
                AbstractC3364iD.j(valueOf);
                return valueOf;
            case 3:
                return new Lr(2, this.f25213b.a());
            default:
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                return new Sr(c3383ig, this.f25213b.a(), 1);
        }
    }
}
