package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.mr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3599mr implements InterfaceC3436jq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32763a;

    /* renamed from: b, reason: collision with root package name */
    public final SD f32764b;

    /* renamed from: c, reason: collision with root package name */
    public final Ou f32765c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f32766d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f32767e;

    public /* synthetic */ C3599mr(Ou ou, SD sd, Object obj, Object obj2, int i) {
        this.f32763a = i;
        this.f32765c = ou;
        this.f32764b = sd;
        this.f32767e = obj2;
        this.f32766d = obj;
    }

    public static final String c(int i, String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(i).length());
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(i);
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.Gk, com.google.android.gms.internal.ads.f8] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3436jq
    public final J3.a a(C2953au c2953au, Ut ut) {
        C3598mq c3598mq;
        switch (this.f32763a) {
            case 0:
                Iterator it = ut.f28175t.iterator();
                while (true) {
                    if (it.hasNext()) {
                        try {
                            c3598mq = ((InterfaceC3544lq) this.f32766d).a((String) it.next(), ut.f28179v);
                        } catch (C3334hu unused) {
                        }
                    } else {
                        c3598mq = null;
                    }
                }
                if (c3598mq == null) {
                    return C3686oN.l(new C2784Sq(3, "Unable to instantiate mediation adapter class."));
                }
                C3320hg c3320hg = new C3320hg();
                c3598mq.f32762c.C1(new com.bumptech.glide.manager.o(this, c3598mq, c3320hg));
                if (ut.f28126M) {
                    Bundle bundle = ((C3226fu) c2953au.f29348a.f26393u).f30901d.f40013F;
                    Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                        bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
                    }
                    bundle2.putBoolean("render_test_ad_label", true);
                }
                Lu lu = Lu.ADAPTER_LOAD_AD_SYN;
                Ou ou = this.f32765c;
                Objects.requireNonNull(ou);
                Q8 q82 = new Q8(ou, lu, null, Ou.f26776d, Collections.EMPTY_LIST, ((C3157eg) this.f32764b).b(new Vs(3, new C3545lr(this, c2953au, ut, c3598mq))));
                Lu lu2 = Lu.ADAPTER_LOAD_AD_ACK;
                Q8 a9 = ((Ou) q82.f27124y).a(q82.r(), lu2);
                C3945tD y6 = C3686oN.y((J3.a) a9.f27123x, new C3154ed(2, c3320hg), AbstractC3212fg.f30745h);
                Q8 q83 = new Q8((Ou) a9.f27124y, a9.f27121v, (String) a9.f27119n, (J3.a) a9.f27120u, (List) a9.f27122w, y6);
                Lu lu3 = Lu.ADAPTER_WRAP_ADAPTER;
                return ((Ou) q83.f27124y).a(q83.r(), lu3).f(new C3545lr(this, c2953au, ut, c3598mq)).r();
            default:
                C3320hg c3320hg2 = new C3320hg();
                C3868rr c3868rr = new C3868rr();
                r rVar = new r(this, c3320hg2, c2953au, ut, c3868rr);
                synchronized (c3868rr) {
                    c3868rr.f34122n = rVar;
                }
                Yt yt = ut.f28173s;
                BinderC3690oa binderC3690oa = new BinderC3690oa(c3868rr, yt.f28907b, yt.f28906a);
                Lu lu4 = Lu.CUSTOM_RENDER_SYN;
                Ou ou2 = this.f32765c;
                Objects.requireNonNull(ou2);
                C2593Hm c2593Hm = new C2593Hm(13, this, binderC3690oa);
                SD sd = this.f32764b;
                Q8 q84 = new Q8(ou2, lu4, null, Ou.f26776d, Collections.EMPTY_LIST, ((C3157eg) sd).b(new Vs(3, c2593Hm)));
                Lu lu5 = Lu.CUSTOM_RENDER_ACK;
                Q8 a10 = ((Ou) q84.f27124y).a(q84.r(), lu5);
                C3945tD y8 = C3686oN.y((J3.a) a10.f27123x, new C3154ed(2, c3320hg2), AbstractC3212fg.f30745h);
                return new Q8((Ou) a10.f27124y, a10.f27121v, (String) a10.f27119n, (J3.a) a10.f27120u, (List) a10.f27122w, y8).r();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3436jq
    public final boolean b(C2953au c2953au, Ut ut) {
        Yt yt;
        switch (this.f32763a) {
            case 0:
                return !ut.f28175t.isEmpty();
            default:
                return (((C3744pa) this.f32766d) == null || (yt = ut.f28173s) == null || yt.f28906a == null) ? false : true;
        }
    }
}
