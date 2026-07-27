package E3;

import android.os.Bundle;
import com.google.android.gms.internal.ads.AbstractC3413jg;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C2570Gf;
import com.google.android.gms.internal.ads.C3052cu;
import com.google.android.gms.internal.ads.C3360ig;
import com.google.android.gms.internal.ads.C3634nl;
import com.google.android.gms.internal.ads.CallableC3139ea;
import com.google.android.gms.internal.ads.CallableC3579mk;
import com.google.android.gms.internal.ads.ED;
import com.google.android.gms.internal.ads.FD;
import com.google.android.gms.internal.ads.InterfaceC3135eN;
import com.google.android.gms.internal.ads.Iu;
import com.google.android.gms.internal.ads.Ju;
import com.google.android.gms.internal.ads.Lu;
import com.google.android.gms.internal.ads.PB;
import com.google.android.gms.internal.ads.RB;
import com.google.android.gms.internal.ads.T8;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public Object f774a = new i();

    /* renamed from: b, reason: collision with root package name */
    public Object f775b = new i();

    /* renamed from: c, reason: collision with root package name */
    public Object f776c = new i();

    /* renamed from: d, reason: collision with root package name */
    public Object f777d = new i();

    /* renamed from: e, reason: collision with root package name */
    public Object f778e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public Object f779f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public Object f780g = new a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public Object f781h = new a(0.0f);
    public Object i = new e();

    /* renamed from: j, reason: collision with root package name */
    public Object f782j = new e();

    /* renamed from: k, reason: collision with root package name */
    public Object f783k = new e();

    /* renamed from: l, reason: collision with root package name */
    public Object f784l = new e();

    public static void b(A8.b bVar) {
        if (bVar instanceof i) {
            ((i) bVar).getClass();
        } else if (bVar instanceof d) {
            ((d) bVar).getClass();
        }
    }

    public k a() {
        k kVar = new k();
        kVar.f785a = (A8.b) this.f774a;
        kVar.f786b = (A8.b) this.f775b;
        kVar.f787c = (A8.b) this.f776c;
        kVar.f788d = (A8.b) this.f777d;
        kVar.f789e = (c) this.f778e;
        kVar.f790f = (c) this.f779f;
        kVar.f791g = (c) this.f780g;
        kVar.f792h = (c) this.f781h;
        kVar.i = (e) this.i;
        kVar.f793j = (e) this.f782j;
        kVar.f794k = (e) this.f783k;
        kVar.f795l = (e) this.f784l;
        return kVar;
    }

    public Iu c(Bundle bundle) {
        ((C3634nl) this.f784l).t();
        Ju ju = Ju.SIGNALS;
        Lu lu = (Lu) this.f774a;
        Objects.requireNonNull(lu);
        return new T8(lu, ju, null, Lu.f26188d, Collections.EMPTY_LIST, ((C2570Gf) this.i).g(new Bundle(), bundle)).s();
    }

    public Iu d() {
        int i = 0;
        Bundle bundle = new Bundle();
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.J2)).booleanValue()) {
            Bundle bundle2 = ((C3052cu) this.f783k).f29638t;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        Iu c9 = c(bundle);
        Ju ju = Ju.REQUEST_PARCEL;
        N3.a[] aVarArr = {c9, (N3.a) ((InterfaceC3135eN) this.f780g).f()};
        Lu lu = (Lu) this.f774a;
        lu.getClass();
        List asList = Arrays.asList(aVarArr);
        CallableC3579mk callableC3579mk = new CallableC3579mk(this, c9, bundle, i);
        PB pb = RB.f27177u;
        asList.getClass();
        RB n9 = RB.n(asList);
        CallableC3139ea callableC3139ea = CallableC3139ea.f29938f;
        C3360ig c3360ig = AbstractC3413jg.f31275h;
        FD fd = new FD(n9, true, false);
        fd.f24757I = new ED(fd, callableC3139ea, c3360ig);
        fd.w();
        FD fd2 = new FD(n9, true, false);
        fd2.f24757I = new ED(fd2, callableC3579mk, lu.f26189a);
        fd2.w();
        return new T8(lu, ju, null, fd, asList, fd2).s();
    }
}
