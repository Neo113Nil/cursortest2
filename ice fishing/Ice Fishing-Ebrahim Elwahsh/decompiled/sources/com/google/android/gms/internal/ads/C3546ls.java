package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ls, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3546ls implements Qs {

    /* renamed from: a, reason: collision with root package name */
    public final Context f32606a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f32607b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32608c;

    /* renamed from: d, reason: collision with root package name */
    public final String f32609d;

    /* renamed from: e, reason: collision with root package name */
    public final t2.E f32610e;

    /* renamed from: f, reason: collision with root package name */
    public final String f32611f;

    /* renamed from: g, reason: collision with root package name */
    public final C2862Xj f32612g;

    public C3546ls(Context context, Bundle bundle, String str, String str2, t2.E e6, String str3, C2862Xj c2862Xj) {
        this.f32606a = context;
        this.f32607b = bundle;
        this.f32608c = str;
        this.f32609d = str2;
        this.f32610e = e6;
        this.f32611f = str3;
        this.f32612g = c2862Xj;
    }

    @Override // com.google.android.gms.internal.ads.Qs
    public final void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBundle("quality_signals", this.f32607b);
        bundle.putString("seq_num", this.f32608c);
        if (!this.f32610e.t()) {
            bundle.putString("session_id", this.f32609d);
        }
        bundle.putBoolean("client_purpose_one", !r0.t());
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31415C6)).booleanValue()) {
            try {
                t2.G g9 = p2.j.f39798C.f39803c;
                bundle.putString("_app_id", t2.G.M(this.f32606a));
            } catch (RemoteException | RuntimeException e6) {
                p2.j.f39798C.f39808h.d("AppStatsSignal_AppId", e6);
            }
        }
        String str = this.f32611f;
        if (str != null) {
            Bundle bundle2 = new Bundle();
            C2862Xj c2862Xj = this.f32612g;
            Long l9 = (Long) c2862Xj.f28676d.get(str);
            bundle2.putLong("dload", l9 == null ? -1L : l9.longValue());
            Integer num = (Integer) c2862Xj.f28674b.get(str);
            bundle2.putInt("pcc", num == null ? 0 : num.intValue());
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.gb)).booleanValue()) {
            p2.j jVar = p2.j.f39798C;
            if (jVar.f39808h.f29022l.get() > 0) {
                bundle.putInt("nrwv", jVar.f39808h.f29022l.get());
            }
        }
    }
}
