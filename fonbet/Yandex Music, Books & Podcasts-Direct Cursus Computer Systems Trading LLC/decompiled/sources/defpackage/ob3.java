package defpackage;

import android.content.Intent;
import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.data.audio.WarningContent;

/* loaded from: classes3.dex */
public final class ob3 extends bfu implements icj {
    public final LinkedHashMap A;
    public boolean B;
    public final xdr C;
    public final vdr D;
    public final j0q E;
    public final j0q F;
    public final xdr G;
    public rar H;
    public final xdr I;
    public final fkn J;
    public final dn9 K;
    public final fkn L;
    public Boolean X;
    public final rbj k;
    public final tmb l;
    public final ie5 m;
    public final jyr n;
    public final jyr o;
    public final jyr p;
    public final jtc q;
    public final fkn r;
    public final xdr s;
    public final xdr t;
    public final vdr u;
    public final j0q v;
    public final j0q w;
    public final j0q x;
    public final j0q y;
    public final by7 z;

    public ob3(rbj rbjVar, tmb tmbVar, kxi kxiVar, Intent intent) {
        tmbVar.getClass();
        intent.getClass();
        this.k = rbjVar;
        this.l = tmbVar;
        cq4 F = ot0.F(this);
        ie5 ie5Var = new ie5(F, rbjVar, intent, kxiVar);
        this.m = ie5Var;
        l18 l18Var = l18.b;
        jyr b = l18Var.b(hag.I(k8w.class), true);
        this.n = b;
        this.o = l18Var.b(hag.I(cej.class), true);
        jyr b2 = l18Var.b(hag.I(z66.class), true);
        this.p = b2;
        this.q = (jtc) ie5Var.m;
        this.r = (fkn) ie5Var.r;
        this.s = (xdr) ie5Var.b;
        this.t = (xdr) ie5Var.c;
        this.u = (vdr) ie5Var.s;
        this.v = (j0q) ie5Var.f;
        this.w = (j0q) ie5Var.g;
        this.x = (j0q) ie5Var.j;
        this.y = (j0q) ie5Var.h;
        this.z = asq.K(((z66) b2.getValue()).e(), new mz2(7));
        this.A = new LinkedHashMap();
        Continuation continuation = null;
        xdr a = ydr.a(K(null));
        this.C = a;
        this.D = sk3.a0(ot0.F(this), jf0.z(a, new mz2(8)));
        this.E = (j0q) ie5Var.e;
        this.F = (j0q) ie5Var.i;
        this.G = ydr.a(dcj.a);
        Boolean bool = Boolean.FALSE;
        xdr a2 = ydr.a(bool);
        this.I = a2;
        int i = 10;
        u21 u21Var = new u21(i, (xdr) ie5Var.d, a2, new ib3(3, 0, continuation));
        cq4 F2 = ot0.F(this);
        t7l t7lVar = lbq.a;
        this.J = zsd.F0(u21Var, F2, t7lVar, bool);
        bdt I = hag.I(xbj.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        xbj xbjVar = (xbj) qdcVar.C(I);
        yzk yzkVar = (yzk) ie5Var.l;
        yzkVar.getClass();
        l13 l13Var = xbjVar.a;
        dn9 dn9Var = new dn9(yzkVar, (skr) l13Var.a.D(hag.I(skr.class), l13Var, l13Var.b), (oq7) l13Var.a.D(hag.I(oq7.class), l13Var, l13Var.b), (r1l) l13Var.a.D(hag.I(r1l.class), l13Var, l13Var.b));
        this.K = dn9Var;
        this.L = zsd.F0(zsd.M0((xdr) dn9Var.f, new na3(continuation, dn9Var, 1)), ot0.F(this), t7lVar, qb3.a);
        J();
        String str = rbjVar.e;
        if (str != null) {
            x97.y(F, null, null, new ge5(ie5Var, str, continuation, 0), 3);
        }
        ox6.B(zsd.b0(new z50(zsd.d0(v3g.D(((m8w) ((k8w) b.getValue())).a), 1), 10)), ot0.F(this), new ri(25, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (r9 == r2) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object G(ob3 ob3Var, cg6 cg6Var) {
        jb3 jb3Var;
        int i;
        mt mtVar;
        ie5 ie5Var = ob3Var.m;
        if (cg6Var instanceof jb3) {
            jb3Var = (jb3) cg6Var;
            int i2 = jb3Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jb3Var.l = i2 - Integer.MIN_VALUE;
                Object obj = jb3Var.j;
                Object obj2 = nm6.a;
                i = jb3Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    String str = ob3Var.k.b;
                    jb3Var.l = 1;
                    jtc jtcVar = (jtc) ie5Var.m;
                    jtcVar.getClass();
                    obj = x97.V(dm6.b, new zbj(jtcVar, str, null, 1), jb3Var);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                mtVar = (mt) obj;
                if (mtVar != null) {
                    return wa3.a;
                }
                oq oqVar = mtVar.a;
                if (((a68) ie5Var.q).b(oqVar)) {
                    xa3 K = ob3Var.K(oqVar);
                    return new za3(K.a, K.b, mtVar);
                }
                jb3Var.l = 2;
                Object O = ob3Var.O(mtVar, jb3Var);
                return O == obj2 ? obj2 : O;
            }
        }
        jb3Var = new jb3(ob3Var, cg6Var);
        Object obj3 = jb3Var.j;
        Object obj22 = nm6.a;
        i = jb3Var.l;
        if (i != 0) {
        }
        mtVar = (mt) obj3;
        if (mtVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object H(ob3 ob3Var, oq oqVar, cg6 cg6Var) {
        lb3 lb3Var;
        int i;
        xdr xdrVar;
        if (cg6Var instanceof lb3) {
            lb3Var = (lb3) cg6Var;
            int i2 = lb3Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lb3Var.m = i2 - Integer.MIN_VALUE;
                Object obj = lb3Var.k;
                nm6 nm6Var = nm6.a;
                i = lb3Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    xdr xdrVar2 = ob3Var.G;
                    ie5 ie5Var = ob3Var.m;
                    String str = oqVar.a;
                    lb3Var.j = xdrVar2;
                    lb3Var.m = 1;
                    Object b = ie5Var.b(str, lb3Var);
                    if (b == nm6Var) {
                        return nm6Var;
                    }
                    obj = b;
                    xdrVar = xdrVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xdrVar = lb3Var.j;
                    qgg.h0(obj);
                }
                xdrVar.l(obj);
                return Unit.a;
            }
        }
        lb3Var = new lb3(ob3Var, cg6Var);
        Object obj2 = lb3Var.k;
        nm6 nm6Var2 = nm6.a;
        i = lb3Var.m;
        if (i != 0) {
        }
        xdrVar.l(obj2);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if (r9 == r2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ob3 ob3Var, cg6 cg6Var) {
        hb3 hb3Var;
        int i;
        mt mtVar;
        Object O;
        ie5 ie5Var = ob3Var.m;
        if (cg6Var instanceof hb3) {
            hb3Var = (hb3) cg6Var;
            int i2 = hb3Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hb3Var.l = i2 - Integer.MIN_VALUE;
                Object obj = hb3Var.j;
                Object obj2 = nm6.a;
                i = hb3Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    String str = ob3Var.k.b;
                    hb3Var.l = 1;
                    jtc jtcVar = (jtc) ie5Var.m;
                    jtcVar.getClass();
                    obj = x97.V(dm6.b, new zbj(jtcVar, str, null, 0), hb3Var);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                mtVar = (mt) obj;
                if (mtVar != null) {
                    return wa3.a;
                }
                hb3Var.l = 2;
                oq oqVar = mtVar.a;
                if (((a68) ie5Var.q).b(oqVar)) {
                    xa3 K = ob3Var.K(oqVar);
                    O = new za3(K.a, K.b, mtVar);
                } else {
                    O = ob3Var.O(mtVar, hb3Var);
                }
                return O == obj2 ? obj2 : O;
            }
        }
        hb3Var = new hb3(ob3Var, cg6Var);
        Object obj3 = hb3Var.j;
        Object obj22 = nm6.a;
        i = hb3Var.l;
        if (i != 0) {
        }
        mtVar = (mt) obj3;
        if (mtVar != null) {
        }
    }

    @Override // defpackage.icj
    public final void B(Function0 function0) {
        ((m) this.m.n).F((r25) function0);
    }

    @Override // defpackage.icj
    public final void F() {
        ((m) this.m.n).E();
    }

    public final void J() {
        xa3 K = K(null);
        xdr xdrVar = this.C;
        xdrVar.getClass();
        xdrVar.m(null, K);
        x97.y(ot0.F(this), null, null, new cs1(this, (Continuation) null, 12), 3);
    }

    public final xa3 K(oq oqVar) {
        boolean z = true;
        if (oqVar == null) {
            return new xa3(true, false);
        }
        boolean z2 = oqVar.d;
        jyr jyrVar = this.n;
        if (!z2 && !((m8w) ((k8w) jyrVar.getValue())).a(oqVar)) {
            z = false;
        }
        return new xa3(z, ((m8w) ((k8w) jyrVar.getValue())).c(oqVar));
    }

    public final void L(boolean z) {
        cb3 cb3Var = (cb3) this.C.getValue();
        Continuation continuation = null;
        if (!z || !(cb3Var instanceof za3)) {
            x97.y(ot0.F(this), null, null, new mb3(this, continuation, 0), 3);
            return;
        }
        mt mtVar = ((za3) cb3Var).c;
        ((a68) this.m.q).a(mtVar.a);
        x97.y(ot0.F(this), null, null, new k3(this, mtVar, continuation, 21), 3);
    }

    public final void M(nab nabVar, u0s u0sVar) {
        LinkedHashMap linkedHashMap = this.A;
        Boolean bool = (Boolean) linkedHashMap.get(nabVar);
        if (bool != null ? bool.booleanValue() : false) {
            return;
        }
        linkedHashMap.put(nabVar, Boolean.TRUE);
        rmb.h(this.l.a(nabVar, u0sVar), 0, 3);
    }

    public final void N() {
        x97.y(ot0.F(this), null, null, new mb3(this, null, 1), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(mt mtVar, cg6 cg6Var) {
        nb3 nb3Var;
        int i;
        oq oqVar;
        boolean a;
        Object obj;
        Object b;
        h93 h93Var;
        mt mtVar2 = mtVar;
        if (cg6Var instanceof nb3) {
            nb3Var = (nb3) cg6Var;
            int i2 = nb3Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nb3Var.p = i2 - Integer.MIN_VALUE;
                Object obj2 = nb3Var.n;
                nm6 nm6Var = nm6.a;
                i = nb3Var.p;
                jyr jyrVar = this.n;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj2);
                    oqVar = mtVar2.a;
                    dn9 dn9Var = this.K;
                    dn9Var.getClass();
                    oqVar.getClass();
                    xdr xdrVar = (xdr) dn9Var.f;
                    xdrVar.getClass();
                    xdrVar.m(null, oqVar);
                    rar rarVar = this.H;
                    if (rarVar != null) {
                        rarVar.g(null);
                    }
                    this.H = x97.y(ot0.F(this), null, null, new cs1(this, oqVar, continuation, 13), 3);
                    a = ((m8w) ((k8w) jyrVar.getValue())).a(oqVar);
                    if (!oqVar.d && !a) {
                        return new bb3(oqVar, oqVar.b);
                    }
                    String str = oqVar.f;
                    String str2 = (str == null || StringsKt.U(str)) ? null : str;
                    List list = oqVar.n;
                    c5b c5bVar = c5b.a;
                    list.getClass();
                    c5bVar.getClass();
                    ArrayList J = xp3.J(list, c5bVar);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = J.iterator();
                    while (it.hasNext()) {
                        zp2 zp2Var = (zp2) it.next();
                        zp2Var.getClass();
                        String str3 = zp2Var.b;
                        if (str3 != null) {
                            arrayList.add(str3);
                        }
                    }
                    String w = q7g.w(oqVar);
                    boolean z = oqVar.g == WarningContent.EXPLICIT;
                    Iterator it2 = oqVar.F.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (((mqs) obj).I() == lqs.f) {
                            break;
                        }
                    }
                    mqs mqsVar = (mqs) obj;
                    h93 h93Var2 = new h93(str2, arrayList, w, z, mqsVar != null ? new saj(((cej) this.o.getValue()).a(mqsVar, false), mqsVar) : null);
                    nb3Var.j = mtVar2;
                    nb3Var.k = oqVar;
                    nb3Var.l = h93Var2;
                    nb3Var.m = a;
                    nb3Var.p = 1;
                    b = ((ms) this.q.a).a.b(oqVar, nb3Var);
                    if (b == nm6Var) {
                        return nm6Var;
                    }
                    h93Var = h93Var2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z2 = nb3Var.m;
                    h93 h93Var3 = nb3Var.l;
                    oqVar = nb3Var.k;
                    mt mtVar3 = nb3Var.j;
                    qgg.h0(obj2);
                    a = z2;
                    mtVar2 = mtVar3;
                    b = obj2;
                    h93Var = h93Var3;
                }
                mq mqVar = (mq) b;
                o8w o8wVar = new o8w(!a, ((m8w) ((k8w) jyrVar.getValue())).c(oqVar));
                ie5 ie5Var = this.m;
                yzk yzkVar = (yzk) ie5Var.l;
                yzkVar.getClass();
                xdr xdrVar2 = yzkVar.e;
                LinkedList linkedList = oqVar.F;
                PlaybackScope playbackScope = yzkVar.b;
                playbackScope.getClass();
                zyk zykVar = new zyk(oqVar, linkedList, s3q.b[playbackScope.k().ordinal()] != 3 ? i3q.b : i3q.a);
                xdrVar2.getClass();
                xdrVar2.m(null, zykVar);
                m mVar = (m) ie5Var.n;
                eca ecaVar = eca.d;
                eca o = d51.o(oqVar);
                xdr xdrVar3 = (xdr) mVar.h;
                xdrVar3.getClass();
                xdrVar3.m(null, o);
                ((z3g) ie5Var.o).b(oqVar);
                mtVar2.getClass();
                oq oqVar2 = mtVar2.a;
                iab iabVar = new iab(oqVar2.b, "", ouj.t(oqVar2.o), ouj.t(oqVar2.s), null, jf0.u(mtVar2), oqVar2.t);
                M(new jab(qkb.Header, 1, 1, 1), null);
                return new ab3(mtVar2, iabVar, h93Var, o8g.Z(oqVar2, mqVar), o8wVar);
            }
        }
        nb3Var = new nb3(this, cg6Var);
        Object obj22 = nb3Var.n;
        nm6 nm6Var2 = nm6.a;
        i = nb3Var.p;
        jyr jyrVar2 = this.n;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        mq mqVar2 = (mq) b;
        o8w o8wVar2 = new o8w(!a, ((m8w) ((k8w) jyrVar2.getValue())).c(oqVar));
        ie5 ie5Var2 = this.m;
        yzk yzkVar2 = (yzk) ie5Var2.l;
        yzkVar2.getClass();
        xdr xdrVar22 = yzkVar2.e;
        LinkedList linkedList2 = oqVar.F;
        PlaybackScope playbackScope2 = yzkVar2.b;
        playbackScope2.getClass();
        zyk zykVar2 = new zyk(oqVar, linkedList2, s3q.b[playbackScope2.k().ordinal()] != 3 ? i3q.b : i3q.a);
        xdrVar22.getClass();
        xdrVar22.m(null, zykVar2);
        m mVar2 = (m) ie5Var2.n;
        eca ecaVar2 = eca.d;
        eca o2 = d51.o(oqVar);
        xdr xdrVar32 = (xdr) mVar2.h;
        xdrVar32.getClass();
        xdrVar32.m(null, o2);
        ((z3g) ie5Var2.o).b(oqVar);
        mtVar2.getClass();
        oq oqVar22 = mtVar2.a;
        iab iabVar2 = new iab(oqVar22.b, "", ouj.t(oqVar22.o), ouj.t(oqVar22.s), null, jf0.u(mtVar2), oqVar22.t);
        M(new jab(qkb.Header, 1, 1, 1), null);
        return new ab3(mtVar2, iabVar2, h93Var, o8g.Z(oqVar22, mqVar2), o8wVar2);
    }

    @Override // defpackage.icj
    public final xdr c() {
        return this.s;
    }

    @Override // defpackage.icj
    public final void d() {
        ie5 ie5Var = this.m;
        if (!((Boolean) this.s.getValue()).booleanValue()) {
            ie5Var.getClass();
            l18 l18Var = l18.b;
            bdt I = hag.I(skr.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            x97.y((cq4) ie5Var.a, null, null, new ge5(ie5Var, ((skr) qdcVar.C(I)).c(R.string.my_shelf_like_book_toast_message), null, 1), 3);
        }
        ((z3g) ie5Var.o).c();
    }

    @Override // defpackage.icj
    public final vdr e() {
        return this.r;
    }

    @Override // defpackage.icj
    public final dib h() {
        return this.w;
    }

    @Override // defpackage.icj
    public final j0q m() {
        return this.x;
    }

    @Override // defpackage.icj
    public final j0q n() {
        return this.v;
    }

    @Override // defpackage.icj
    public final vdr o() {
        return this.u;
    }

    @Override // defpackage.icj
    public final xdr t() {
        return this.t;
    }

    @Override // defpackage.icj
    public final boolean v() {
        return ((iau) ((xbj) this.m.k).a.a(hag.I(iau.class))).a();
    }

    @Override // defpackage.icj
    public final void y(Function2 function2) {
        this.m.d((kv4) function2);
    }
}
