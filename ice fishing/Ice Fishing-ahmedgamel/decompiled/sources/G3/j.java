package G3;

import android.os.Bundle;
import com.google.android.gms.internal.ads.AbstractC3436jg;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C2590Gf;
import com.google.android.gms.internal.ads.C3075cu;
import com.google.android.gms.internal.ads.C3383ig;
import com.google.android.gms.internal.ads.C3657nl;
import com.google.android.gms.internal.ads.CallableC3162ea;
import com.google.android.gms.internal.ads.CallableC3602mk;
import com.google.android.gms.internal.ads.ED;
import com.google.android.gms.internal.ads.FD;
import com.google.android.gms.internal.ads.InterfaceC3158eN;
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
    public Object f1116a = new i();

    /* renamed from: b, reason: collision with root package name */
    public Object f1117b = new i();

    /* renamed from: c, reason: collision with root package name */
    public Object f1118c = new i();

    /* renamed from: d, reason: collision with root package name */
    public Object f1119d = new i();

    /* renamed from: e, reason: collision with root package name */
    public Object f1120e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public Object f1121f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public Object f1122g = new a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public Object f1123h = new a(0.0f);
    public Object i = new e(0);

    /* renamed from: j, reason: collision with root package name */
    public Object f1124j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public Object f1125k = new e(0);

    /* renamed from: l, reason: collision with root package name */
    public Object f1126l = new e(0);

    public static void b(X2.a aVar) {
        if (aVar instanceof i) {
            ((i) aVar).getClass();
        } else if (aVar instanceof d) {
            ((d) aVar).getClass();
        }
    }

    public k a() {
        k kVar = new k();
        kVar.f1127a = (X2.a) this.f1116a;
        kVar.f1128b = (X2.a) this.f1117b;
        kVar.f1129c = (X2.a) this.f1118c;
        kVar.f1130d = (X2.a) this.f1119d;
        kVar.f1131e = (c) this.f1120e;
        kVar.f1132f = (c) this.f1121f;
        kVar.f1133g = (c) this.f1122g;
        kVar.f1134h = (c) this.f1123h;
        kVar.i = (e) this.i;
        kVar.f1135j = (e) this.f1124j;
        kVar.f1136k = (e) this.f1125k;
        kVar.f1137l = (e) this.f1126l;
        return kVar;
    }

    public Iu c(Bundle bundle) {
        ((C3657nl) this.f1126l).t();
        Ju ju = Ju.SIGNALS;
        Lu lu = (Lu) this.f1116a;
        Objects.requireNonNull(lu);
        return new T8(lu, ju, null, Lu.f26979d, Collections.EMPTY_LIST, ((C2590Gf) this.i).g(new Bundle(), bundle)).s();
    }

    public Iu d() {
        int i = 0;
        Bundle bundle = new Bundle();
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32828J2)).booleanValue()) {
            Bundle bundle2 = ((C3075cu) this.f1125k).f30408t;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        Iu c9 = c(bundle);
        Ju ju = Ju.REQUEST_PARCEL;
        P3.a[] aVarArr = {c9, (P3.a) ((InterfaceC3158eN) this.f1122g).f()};
        Lu lu = (Lu) this.f1116a;
        lu.getClass();
        List asList = Arrays.asList(aVarArr);
        CallableC3602mk callableC3602mk = new CallableC3602mk(this, c9, bundle, i);
        PB pb = RB.f27933u;
        asList.getClass();
        RB n9 = RB.n(asList);
        CallableC3162ea callableC3162ea = CallableC3162ea.f30729f;
        C3383ig c3383ig = AbstractC3436jg.f32062h;
        FD fd = new FD(n9, true, false);
        fd.f25513I = new ED(fd, callableC3162ea, c3383ig);
        fd.w();
        FD fd2 = new FD(n9, true, false);
        fd2.f25513I = new ED(fd2, callableC3602mk, lu.f26980a);
        fd2.w();
        return new T8(lu, ju, null, fd, asList, fd2).s();
    }
}
