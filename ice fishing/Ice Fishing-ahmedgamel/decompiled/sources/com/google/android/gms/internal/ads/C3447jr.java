package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.jr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3447jr implements InterfaceC3340hq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32107a;

    /* renamed from: b, reason: collision with root package name */
    public final RD f32108b;

    /* renamed from: c, reason: collision with root package name */
    public final Lu f32109c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f32110d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f32111e;

    public /* synthetic */ C3447jr(Lu lu, RD rd, Object obj, Object obj2, int i) {
        this.f32107a = i;
        this.f32109c = lu;
        this.f32108b = rd;
        this.f32111e = obj2;
        this.f32110d = obj;
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
    @Override // com.google.android.gms.internal.ads.InterfaceC3340hq
    public final P3.a a(Yt yt, St st) {
        C3500kq c3500kq;
        switch (this.f32107a) {
            case 0:
                Iterator it = st.f28425t.iterator();
                while (true) {
                    if (it.hasNext()) {
                        try {
                            c3500kq = ((InterfaceC3446jq) this.f32110d).a((String) it.next(), st.f28429v);
                        } catch (C3290gu unused) {
                        }
                    } else {
                        c3500kq = null;
                    }
                }
                if (c3500kq == null) {
                    return QC.k(new C2754Pq(3, "Unable to instantiate mediation adapter class."));
                }
                C3490kg c3490kg = new C3490kg();
                c3500kq.f32422c.u1(new com.bumptech.glide.manager.o(this, c3500kq, c3490kg));
                if (st.f28376M) {
                    Bundle bundle = ((C3075cu) yt.f29532a.f32643u).f30393d.f40401F;
                    Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                        bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
                    }
                    bundle2.putBoolean("render_test_ad_label", true);
                }
                Ju ju = Ju.ADAPTER_LOAD_AD_SYN;
                Lu lu = this.f32109c;
                Objects.requireNonNull(lu);
                T8 t82 = new T8(lu, ju, null, Lu.f26979d, Collections.EMPTY_LIST, ((C3383ig) this.f32108b).b(new Ts(3, new C3394ir(this, yt, st, c3500kq))));
                Ju ju2 = Ju.ADAPTER_LOAD_AD_ACK;
                T8 a9 = ((Lu) t82.f28483y).a(t82.s(), ju2);
                C3901sD t6 = QC.t((P3.a) a9.f28482x, new C3327hd(2, c3490kg), AbstractC3436jg.f32062h);
                T8 t83 = new T8((Lu) a9.f28483y, a9.f28480v, (String) a9.f28478n, (P3.a) a9.f28479u, (List) a9.f28481w, t6);
                Ju ju3 = Ju.ADAPTER_WRAP_ADAPTER;
                return ((Lu) t83.f28483y).a(t83.s(), ju3).g(new C3394ir(this, yt, st, c3500kq)).s();
            default:
                C3490kg c3490kg2 = new C3490kg();
                C3825qr c3825qr = new C3825qr();
                C3887s c3887s = new C3887s(this, c3490kg2, yt, st, c3825qr);
                synchronized (c3825qr) {
                    c3825qr.f34195n = c3887s;
                }
                Wt wt = st.f28423s;
                BinderC3861ra binderC3861ra = new BinderC3861ra(c3825qr, wt.f29209b, wt.f29208a);
                Ju ju4 = Ju.CUSTOM_RENDER_SYN;
                Lu lu2 = this.f32109c;
                Objects.requireNonNull(lu2);
                C3067cm c3067cm = new C3067cm(21, this, binderC3861ra);
                RD rd = this.f32108b;
                T8 t84 = new T8(lu2, ju4, null, Lu.f26979d, Collections.EMPTY_LIST, ((C3383ig) rd).b(new Ts(3, c3067cm)));
                Ju ju5 = Ju.CUSTOM_RENDER_ACK;
                T8 a10 = ((Lu) t84.f28483y).a(t84.s(), ju5);
                C3901sD t9 = QC.t((P3.a) a10.f28482x, new C3327hd(2, c3490kg2), AbstractC3436jg.f32062h);
                return new T8((Lu) a10.f28483y, a10.f28480v, (String) a10.f28478n, (P3.a) a10.f28479u, (List) a10.f28481w, t9).s();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3340hq
    public final boolean b(Yt yt, St st) {
        Wt wt;
        switch (this.f32107a) {
            case 0:
                return !st.f28425t.isEmpty();
            default:
                return (((C3915sa) this.f32110d) == null || (wt = st.f28423s) == null || wt.f29208a == null) ? false : true;
        }
    }
}
