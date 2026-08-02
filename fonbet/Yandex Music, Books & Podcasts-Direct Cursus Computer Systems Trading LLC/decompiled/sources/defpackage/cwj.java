package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class cwj extends bfu {
    public static final long H;
    public final j0q A;
    public rar B;
    public rar C;
    public rar D;
    public final fkn E;
    public final fkn F;
    public final j0q G;
    public final String k;
    public final ad6 l;
    public final gvj m;
    public final qvj n;
    public final String o;
    public final lik p;
    public final skr q;
    public final oy2 r;
    public final z66 s;
    public final wrt t;
    public final jyr u;
    public final jyr v;
    public final xdr w;
    public final xdr x;
    public final xdr y;
    public final xdr z;

    static {
        msa msaVar = nsa.b;
        H = yd5.M(5, ssa.SECONDS);
    }

    public cwj(String str, ad6 ad6Var, gvj gvjVar, qvj qvjVar, String str2, lik likVar) {
        gvjVar.getClass();
        this.k = str;
        this.l = ad6Var;
        this.m = gvjVar;
        this.n = qvjVar;
        this.o = str2;
        this.p = likVar;
        l18 l18Var = l18.b;
        bdt I = hag.I(skr.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.q = (skr) qdcVar.C(I);
        bdt I2 = hag.I(oy2.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        this.r = (oy2) qdcVar2.C(I2);
        bdt I3 = hag.I(z66.class);
        qdc qdcVar3 = l18Var.a;
        qdcVar3.getClass();
        z66 z66Var = (z66) qdcVar3.C(I3);
        this.s = z66Var;
        bdt I4 = hag.I(wrt.class);
        qdc qdcVar4 = l18Var.a;
        qdcVar4.getClass();
        this.t = (wrt) qdcVar4.C(I4);
        this.u = l18Var.b(hag.I(hvj.class), true);
        this.v = l18Var.b(hag.I(sv8.class), true);
        xdr a = ydr.a(null);
        this.w = a;
        xdr a2 = ydr.a(null);
        this.x = a2;
        xdr a3 = ydr.a(null);
        this.y = a3;
        xdr a4 = ydr.a(Boolean.FALSE);
        this.z = a4;
        j0q j0qVar = new j0q();
        this.A = j0qVar;
        int i = 4;
        this.E = lg3.u0(new u21(10, a, a2, new w83(3, this, cwj.class, "createContentState", "createContentState(Lcom/yandex/music/shared/utils/SealedResult;Ljava/lang/String;)Lcom/yandex/music/payment/paywalls/option/screen/model/ContentState;", i, 7)), ot0.F(this), qd6.a);
        fkn u0 = lg3.u0(zsd.Q(a3, z66Var.c(), a4, new b60(4, this, cwj.class, "createOptionState", "createOptionState(Lcom/yandex/music/shared/plus/acquisition/api/offers/data/OfferRequestResult;Lcom/yandex/music/shared/utils/network/connectivity/ConnectivityInfo;Z)Lcom/yandex/music/payment/paywalls/option/screen/model/OptionState;", i, 2)), ot0.F(this), gwj.a);
        this.F = u0;
        this.G = j0qVar;
        x97.y(ot0.F(this), null, null, new yvj(this, null, 1), 3);
        ox6.B(u0, ot0.F(this), new wvj(this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(cwj cwjVar, bve bveVar, boolean z, cg6 cg6Var) {
        zvj zvjVar;
        int i;
        evj evjVar;
        sgk sgkVar;
        cwjVar.getClass();
        if (cg6Var instanceof zvj) {
            zvjVar = (zvj) cg6Var;
            int i2 = zvjVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zvjVar.m = i2 - Integer.MIN_VALUE;
                Object obj = zvjVar.k;
                nm6 nm6Var = nm6.a;
                i = zvjVar.m;
                boolean z2 = true;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(4, "OptionPaywallViewModel", "start purchase, isOneClickAvailable=" + z, null);
                    hvj hvjVar = (hvj) cwjVar.u.getValue();
                    lik likVar = cwjVar.p;
                    hvjVar.getClass();
                    bveVar.getClass();
                    likVar.getClass();
                    evj evjVar2 = new evj(bveVar, likVar, z);
                    ((qdk) ((jyr) evjVar2.b).getValue()).c();
                    ((lkj) ((kkj) ((jyr) evjVar2.f).getValue())).a(bveVar);
                    qvj qvjVar = cwjVar.n;
                    zvjVar.j = evjVar2;
                    zvjVar.m = 1;
                    Object a = ((k5m) qvjVar.a.getValue()).c().a(new zfk(bveVar, z), zvjVar);
                    if (a == nm6Var) {
                        return nm6Var;
                    }
                    obj = a;
                    evjVar = evjVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    evjVar = zvjVar.j;
                    qgg.h0(obj);
                }
                sgkVar = (sgk) obj;
                if (!(sgkVar instanceof rgk)) {
                    ssg.a(4, "OptionPaywallViewModel", "purchase success", null);
                    rar rarVar = cwjVar.D;
                    if (rarVar != null) {
                        rarVar.g(null);
                    }
                    cwjVar.D = x97.y(ot0.F(cwjVar), null, null, new bwj(cwjVar, z2, continuation, 1), 3);
                    ((qdk) ((jyr) evjVar.b).getValue()).d();
                    ((udk) ((jyr) evjVar.e).getValue()).a();
                } else if (sgkVar instanceof qgk) {
                    lgb lgbVar = ((qgk) sgkVar).a;
                    ssg.a(4, "OptionPaywallViewModel", "purchase error: " + lgbVar, null);
                    evjVar.getClass();
                    ((qdk) ((jyr) evjVar.b).getValue()).b(lg3.v0(lgbVar), lgbVar.b);
                } else {
                    if (!Intrinsics.d(sgkVar, pgk.a)) {
                        b6e.s();
                        return null;
                    }
                    ssg.a(4, "OptionPaywallViewModel", "purchase cancel", null);
                    ((qdk) ((jyr) evjVar.b).getValue()).a();
                }
                return Unit.a;
            }
        }
        zvjVar = new zvj(cwjVar, cg6Var);
        Object obj2 = zvjVar.k;
        nm6 nm6Var2 = nm6.a;
        i = zvjVar.m;
        boolean z22 = true;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        sgkVar = (sgk) obj2;
        if (!(sgkVar instanceof rgk)) {
        }
        return Unit.a;
    }

    public final void G() {
        rar rarVar = this.B;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.B = ox6.B(this.s.c(), ot0.F(this), new wvj(this, 1));
    }
}
