package B2;

import android.util.Pair;
import com.anythink.core.api.ATAdConst;
import com.google.android.gms.internal.ads.AbstractC2734Qa;
import com.google.android.gms.internal.ads.C3381io;

/* loaded from: classes.dex */
public final class F extends E2.b {

    /* renamed from: b, reason: collision with root package name */
    public final E f161b;

    /* renamed from: c, reason: collision with root package name */
    public final C3381io f162c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f163d;

    /* renamed from: e, reason: collision with root package name */
    public final int f164e;

    /* renamed from: f, reason: collision with root package name */
    public final long f165f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f166g;

    public F(E e6, boolean z8, int i, Boolean bool, C3381io c3381io) {
        this.f161b = e6;
        this.f163d = z8;
        this.f164e = i;
        this.f166g = bool;
        this.f162c = c3381io;
        p2.j.f39798C.f39810k.getClass();
        this.f165f = System.currentTimeMillis();
    }

    @Override // E2.b
    public final void onFailure(String str) {
        Pair pair = new Pair("sgf_reason", str);
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        p2.j jVar = p2.j.f39798C;
        jVar.f39810k.getClass();
        Pair pair6 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f165f));
        int i = this.f164e;
        Pair pair7 = new Pair("sgpc_rn", Integer.toString(i));
        Pair pair8 = new Pair("sgpc_lsu", String.valueOf(this.f166g));
        boolean z8 = this.f163d;
        K3.b.L(this.f162c, "sgpcf", pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("tpc", true != z8 ? "0" : "1"));
        jVar.f39810k.getClass();
        this.f161b.b(z8, new G(null, str, ((Long) AbstractC2734Qa.f27170h.r()).longValue() + System.currentTimeMillis(), i));
    }

    @Override // E2.b
    public final void onSuccess(E2.a aVar) {
        Pair pair = new Pair("se", "query_g");
        Pair pair2 = new Pair(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "BANNER");
        Pair pair3 = new Pair("rtype", Integer.toString(6));
        Pair pair4 = new Pair("scar", "true");
        p2.j jVar = p2.j.f39798C;
        jVar.f39810k.getClass();
        Pair pair5 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f165f));
        int i = this.f164e;
        Pair pair6 = new Pair("sgpc_rn", Integer.toString(i));
        Pair pair7 = new Pair("sgpc_lsu", String.valueOf(this.f166g));
        boolean z8 = this.f163d;
        K3.b.L(this.f162c, "sgpcs", pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("tpc", true != z8 ? "0" : "1"));
        jVar.f39810k.getClass();
        this.f161b.b(z8, new G(aVar, "", ((Long) AbstractC2734Qa.f27170h.r()).longValue() + System.currentTimeMillis(), i));
    }
}
