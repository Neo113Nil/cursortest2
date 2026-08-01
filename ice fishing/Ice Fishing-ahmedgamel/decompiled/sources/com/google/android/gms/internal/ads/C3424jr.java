package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.jr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3424jr implements InterfaceC3317hq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31328a;

    /* renamed from: b, reason: collision with root package name */
    public final RD f31329b;

    /* renamed from: c, reason: collision with root package name */
    public final Lu f31330c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f31331d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f31332e;

    public /* synthetic */ C3424jr(Lu lu, RD rd, Object obj, Object obj2, int i) {
        this.f31328a = i;
        this.f31330c = lu;
        this.f31329b = rd;
        this.f31332e = obj2;
        this.f31331d = obj;
    }

    public static final String c(int i, String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(i).length());
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(i);
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.Hk, com.google.android.gms.internal.ads.i8] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3317hq
    public final N3.a a(Yt yt, St st) {
        C3477kq c3477kq;
        switch (this.f31328a) {
            case 0:
                Iterator it = st.f27642t.iterator();
                while (true) {
                    if (it.hasNext()) {
                        try {
                            c3477kq = ((InterfaceC3423jq) this.f31331d).a((String) it.next(), st.f27646v);
                        } catch (C3267gu unused) {
                        }
                    } else {
                        c3477kq = null;
                    }
                }
                if (c3477kq == null) {
                    return QC.k(new C2734Pq(3, "Unable to instantiate mediation adapter class."));
                }
                C3467kg c3467kg = new C3467kg();
                c3477kq.f31640c.B1(new com.bumptech.glide.manager.p(this, c3477kq, c3467kg));
                if (st.f27593M) {
                    Bundle bundle = ((C3052cu) yt.f28753a.f31863u).f29623d.f40102F;
                    Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                        bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
                    }
                    bundle2.putBoolean("render_test_ad_label", true);
                }
                Ju ju = Ju.ADAPTER_LOAD_AD_SYN;
                Lu lu = this.f31330c;
                Objects.requireNonNull(lu);
                T8 t82 = new T8(lu, ju, null, Lu.f26188d, Collections.EMPTY_LIST, ((C3360ig) this.f31329b).b(new Ts(3, new C3371ir(this, yt, st, c3477kq))));
                Ju ju2 = Ju.ADAPTER_LOAD_AD_ACK;
                T8 a9 = ((Lu) t82.f27700y).a(t82.s(), ju2);
                C3878sD t6 = QC.t((N3.a) a9.f27699x, new C3304hd(2, c3467kg), AbstractC3413jg.f31275h);
                T8 t83 = new T8((Lu) a9.f27700y, a9.f27697v, (String) a9.f27695n, (N3.a) a9.f27696u, (List) a9.f27698w, t6);
                Ju ju3 = Ju.ADAPTER_WRAP_ADAPTER;
                return ((Lu) t83.f27700y).a(t83.s(), ju3).g(new C3371ir(this, yt, st, c3477kq)).s();
            default:
                C3467kg c3467kg2 = new C3467kg();
                C3802qr c3802qr = new C3802qr();
                C3864s c3864s = new C3864s(this, c3467kg2, yt, st, c3802qr);
                synchronized (c3802qr) {
                    c3802qr.f33428n = c3864s;
                }
                Wt wt = st.f27640s;
                BinderC3838ra binderC3838ra = new BinderC3838ra(c3802qr, wt.f28427b, wt.f28426a);
                Ju ju4 = Ju.CUSTOM_RENDER_SYN;
                Lu lu2 = this.f31330c;
                Objects.requireNonNull(lu2);
                C2991bm c2991bm = new C2991bm(19, this, binderC3838ra);
                RD rd = this.f31329b;
                T8 t84 = new T8(lu2, ju4, null, Lu.f26188d, Collections.EMPTY_LIST, ((C3360ig) rd).b(new Ts(3, c2991bm)));
                Ju ju5 = Ju.CUSTOM_RENDER_ACK;
                T8 a10 = ((Lu) t84.f27700y).a(t84.s(), ju5);
                C3878sD t9 = QC.t((N3.a) a10.f27699x, new C3304hd(2, c3467kg2), AbstractC3413jg.f31275h);
                return new T8((Lu) a10.f27700y, a10.f27697v, (String) a10.f27695n, (N3.a) a10.f27696u, (List) a10.f27698w, t9).s();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3317hq
    public final boolean b(Yt yt, St st) {
        Wt wt;
        switch (this.f31328a) {
            case 0:
                return !st.f27642t.isEmpty();
            default:
                return (((C3892sa) this.f31331d) == null || (wt = st.f27640s) == null || wt.f28426a == null) ? false : true;
        }
    }
}
