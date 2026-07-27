package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import p2.C4835j;
import u2.C5069B;

/* renamed from: com.google.android.gms.internal.ads.is, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3372is implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31128a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f31129b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31130c;

    /* renamed from: d, reason: collision with root package name */
    public final String f31131d;

    /* renamed from: e, reason: collision with root package name */
    public final C5069B f31132e;

    /* renamed from: f, reason: collision with root package name */
    public final String f31133f;

    /* renamed from: g, reason: collision with root package name */
    public final C2858Xj f31134g;

    public C3372is(Context context, Bundle bundle, String str, String str2, C5069B c5069b, String str3, C2858Xj c2858Xj) {
        this.f31128a = context;
        this.f31129b = bundle;
        this.f31130c = str;
        this.f31131d = str2;
        this.f31132e = c5069b;
        this.f31133f = str3;
        this.f31134g = c2858Xj;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBundle("quality_signals", this.f31129b);
        bundle.putString("seq_num", this.f31130c);
        if (!this.f31132e.t()) {
            bundle.putString("session_id", this.f31131d);
        }
        bundle.putBoolean("client_purpose_one", !r0.t());
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f31994C6)).booleanValue()) {
            try {
                u2.D d2 = C4835j.f39730C.f39735c;
                bundle.putString("_app_id", u2.D.M(this.f31128a));
            } catch (RemoteException | RuntimeException e9) {
                C4835j.f39730C.f39740h.d("AppStatsSignal_AppId", e9);
            }
        }
        String str = this.f31133f;
        if (str != null) {
            Bundle bundle2 = new Bundle();
            C2858Xj c2858Xj = this.f31134g;
            Long l9 = (Long) c2858Xj.f28558d.get(str);
            bundle2.putLong("dload", l9 == null ? -1L : l9.longValue());
            Integer num = (Integer) c2858Xj.f28556b.get(str);
            bundle2.putInt("pcc", num == null ? 0 : num.intValue());
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.gb)).booleanValue()) {
            C4835j c4835j = C4835j.f39730C;
            if (c4835j.f39740h.f29527l.get() > 0) {
                bundle.putInt("nrwv", c4835j.f39740h.f29527l.get());
            }
        }
    }
}
