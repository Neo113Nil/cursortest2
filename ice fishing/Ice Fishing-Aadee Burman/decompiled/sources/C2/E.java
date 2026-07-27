package C2;

import android.util.Pair;
import com.anythink.core.api.ATAdConst;
import com.google.android.gms.internal.ads.AbstractC2801Ua;
import com.google.android.gms.internal.ads.C3315ho;
import p2.C4835j;

/* loaded from: classes.dex */
public final class E extends F2.b {

    /* renamed from: b, reason: collision with root package name */
    public final D f263b;

    /* renamed from: c, reason: collision with root package name */
    public final C3315ho f264c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f265d;

    /* renamed from: e, reason: collision with root package name */
    public final int f266e;

    /* renamed from: f, reason: collision with root package name */
    public final long f267f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f268g;

    public E(D d2, boolean z3, int i, Boolean bool, C3315ho c3315ho) {
        this.f263b = d2;
        this.f265d = z3;
        this.f266e = i;
        this.f268g = bool;
        this.f264c = c3315ho;
        C4835j.f39730C.f39742k.getClass();
        this.f267f = System.currentTimeMillis();
    }

    @Override // F2.b
    public final void onFailure(String str) {
        Pair pair = new Pair("sgf_reason", str);
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        C4835j c4835j = C4835j.f39730C;
        c4835j.f39742k.getClass();
        Pair pair6 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f267f));
        int i = this.f266e;
        Pair pair7 = new Pair("sgpc_rn", Integer.toString(i));
        Pair pair8 = new Pair("sgpc_lsu", String.valueOf(this.f268g));
        boolean z3 = this.f265d;
        com.bumptech.glide.d.p(this.f264c, "sgpcf", pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("tpc", true != z3 ? "0" : "1"));
        c4835j.f39742k.getClass();
        this.f263b.b(z3, new F(null, str, ((Long) AbstractC2801Ua.f27932h.r()).longValue() + System.currentTimeMillis(), i));
    }

    @Override // F2.b
    public final void onSuccess(F2.a aVar) {
        Pair pair = new Pair("se", "query_g");
        Pair pair2 = new Pair(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "BANNER");
        Pair pair3 = new Pair("rtype", Integer.toString(6));
        Pair pair4 = new Pair("scar", "true");
        C4835j c4835j = C4835j.f39730C;
        c4835j.f39742k.getClass();
        Pair pair5 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f267f));
        int i = this.f266e;
        Pair pair6 = new Pair("sgpc_rn", Integer.toString(i));
        Pair pair7 = new Pair("sgpc_lsu", String.valueOf(this.f268g));
        boolean z3 = this.f265d;
        com.bumptech.glide.d.p(this.f264c, "sgpcs", pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("tpc", true != z3 ? "0" : "1"));
        c4835j.f39742k.getClass();
        this.f263b.b(z3, new F(aVar, "", ((Long) AbstractC2801Ua.f27932h.r()).longValue() + System.currentTimeMillis(), i));
    }
}
