package E2;

import android.util.Pair;
import com.anythink.core.api.ATAdConst;
import com.google.android.gms.internal.ads.AbstractC2823Ua;
import com.google.android.gms.internal.ads.C3391io;
import r2.C4906k;

/* loaded from: classes.dex */
public final class D extends H2.b {

    /* renamed from: b, reason: collision with root package name */
    public final C f723b;

    /* renamed from: c, reason: collision with root package name */
    public final C3391io f724c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f725d;

    /* renamed from: e, reason: collision with root package name */
    public final int f726e;

    /* renamed from: f, reason: collision with root package name */
    public final long f727f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f728g;

    public D(C c9, boolean z6, int i, Boolean bool, C3391io c3391io) {
        this.f723b = c9;
        this.f725d = z6;
        this.f726e = i;
        this.f728g = bool;
        this.f724c = c3391io;
        C4906k.f40186C.f40198k.getClass();
        this.f727f = System.currentTimeMillis();
    }

    @Override // H2.b
    public final void onFailure(String str) {
        Pair pair = new Pair("sgf_reason", str);
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        C4906k c4906k = C4906k.f40186C;
        c4906k.f40198k.getClass();
        Pair pair6 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f727f));
        int i = this.f726e;
        Pair pair7 = new Pair("sgpc_rn", Integer.toString(i));
        Pair pair8 = new Pair("sgpc_lsu", String.valueOf(this.f728g));
        boolean z6 = this.f725d;
        t8.g.z(this.f724c, "sgpcf", pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("tpc", true != z6 ? "0" : "1"));
        c4906k.f40198k.getClass();
        this.f723b.b(z6, new E(null, str, ((Long) AbstractC2823Ua.f28730h.r()).longValue() + System.currentTimeMillis(), i));
    }

    @Override // H2.b
    public final void onSuccess(H2.a aVar) {
        Pair pair = new Pair("se", "query_g");
        Pair pair2 = new Pair(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "BANNER");
        Pair pair3 = new Pair("rtype", Integer.toString(6));
        Pair pair4 = new Pair("scar", "true");
        C4906k c4906k = C4906k.f40186C;
        c4906k.f40198k.getClass();
        Pair pair5 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f727f));
        int i = this.f726e;
        Pair pair6 = new Pair("sgpc_rn", Integer.toString(i));
        Pair pair7 = new Pair("sgpc_lsu", String.valueOf(this.f728g));
        boolean z6 = this.f725d;
        t8.g.z(this.f724c, "sgpcs", pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("tpc", true != z6 ? "0" : "1"));
        c4906k.f40198k.getClass();
        this.f723b.b(z6, new E(aVar, "", ((Long) AbstractC2823Ua.f28730h.r()).longValue() + System.currentTimeMillis(), i));
    }
}
