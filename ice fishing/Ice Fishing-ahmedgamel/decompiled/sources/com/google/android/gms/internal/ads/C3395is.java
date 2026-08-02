package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import r2.C4906k;
import w2.C5140B;

/* renamed from: com.google.android.gms.internal.ads.is, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3395is implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31913a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f31914b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31915c;

    /* renamed from: d, reason: collision with root package name */
    public final String f31916d;

    /* renamed from: e, reason: collision with root package name */
    public final C5140B f31917e;

    /* renamed from: f, reason: collision with root package name */
    public final String f31918f;

    /* renamed from: g, reason: collision with root package name */
    public final C2881Xj f31919g;

    public C3395is(Context context, Bundle bundle, String str, String str2, C5140B c5140b, String str3, C2881Xj c2881Xj) {
        this.f31913a = context;
        this.f31914b = bundle;
        this.f31915c = str;
        this.f31916d = str2;
        this.f31917e = c5140b;
        this.f31918f = str3;
        this.f31919g = c2881Xj;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBundle("quality_signals", this.f31914b);
        bundle.putString("seq_num", this.f31915c);
        if (!this.f31917e.t()) {
            bundle.putString("session_id", this.f31916d);
        }
        bundle.putBoolean("client_purpose_one", !r0.t());
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32774C6)).booleanValue()) {
            try {
                w2.D d9 = C4906k.f40186C.f40191c;
                bundle.putString("_app_id", w2.D.M(this.f31913a));
            } catch (RemoteException | RuntimeException e9) {
                C4906k.f40186C.f40196h.d("AppStatsSignal_AppId", e9);
            }
        }
        String str = this.f31918f;
        if (str != null) {
            Bundle bundle2 = new Bundle();
            C2881Xj c2881Xj = this.f31919g;
            Long l9 = (Long) c2881Xj.f29330d.get(str);
            bundle2.putLong("dload", l9 == null ? -1L : l9.longValue());
            Integer num = (Integer) c2881Xj.f29328b.get(str);
            bundle2.putInt("pcc", num == null ? 0 : num.intValue());
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.gb)).booleanValue()) {
            C4906k c4906k = C4906k.f40186C;
            if (c4906k.f40196h.f30312l.get() > 0) {
                bundle.putInt("nrwv", c4906k.f40196h.f30312l.get());
            }
        }
    }
}
