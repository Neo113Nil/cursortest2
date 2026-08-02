package defpackage;

import android.content.Context;
import android.content.Intent;
import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.catalog.album.screen.AlbumScreenActivity;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes3.dex */
public final class e10 extends bfu {
    public final fkn A;
    public final xdr A0;
    public final xdr B;
    public final LinkedHashMap B0;
    public final xdr C;
    public final j0q C0;
    public rar D;
    public final j0q D0;
    public final xdr E;
    public rar F;
    public final xdr G;
    public rar H;
    public final xdr I;
    public rar J;
    public final jyr K;
    public final xdr L;
    public final j0q X;
    public final j0q Y;
    public final fkn Z;
    public final kxi k;
    public final tmb l;
    public final boolean m;
    public final String n;
    public final oz o;
    public final gs4 p;
    public final gx q;
    public final vxr r;
    public final yzk s;
    public final z3g t;
    public final a68 u;
    public final m v;
    public final x0q v0;
    public final z66 w;
    public final vdr w0;
    public final xdr x;
    public final by7 x0;
    public final vdr y;
    public final j0q y0;
    public final xdr z;
    public final xdr z0;

    public e10(kxi kxiVar, hy hyVar, Intent intent, tmb tmbVar, boolean z) {
        intent.getClass();
        tmbVar.getClass();
        this.k = kxiVar;
        this.l = tmbVar;
        this.m = z;
        this.n = hyVar.a;
        l18 l18Var = l18.b;
        bdt I = hag.I(oz.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        oz ozVar = (oz) qdcVar.C(I);
        this.o = ozVar;
        this.p = new gs4(3);
        l13 l13Var = ozVar.a;
        this.q = (gx) l13Var.a.D(hag.I(gx.class), l13Var, l13Var.b);
        this.r = new vxr((Context) l13Var.a.D(hag.I(Context.class), l13Var, l13Var.b), (z66) l13Var.a.D(hag.I(z66.class), l13Var, l13Var.b));
        cq4 F = ot0.F(this);
        int i = AlbumScreenActivity.v0;
        PlaybackScope b = d.b(hyVar.a, hyVar.b);
        int i2 = np2.u;
        yzk yzkVar = new yzk(F, sj2.w(intent, b), kxiVar);
        this.s = yzkVar;
        this.t = (z3g) l13Var.a.D(hag.I(z3g.class), l13Var, l13Var.b);
        this.u = (a68) l13Var.a.D(hag.I(a68.class), l13Var, l13Var.b);
        bdt I2 = hag.I(vka.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        m a = ((vka) qdcVar2.C(I2)).a(ot0.F(this));
        this.v = a;
        bdt I3 = hag.I(z66.class);
        qdc qdcVar3 = l18Var.a;
        qdcVar3.getClass();
        z66 z66Var = (z66) qdcVar3.C(I3);
        this.w = z66Var;
        xdr a2 = ydr.a(l00.a);
        this.x = a2;
        this.y = sk3.a0(ot0.F(this), jf0.z(a2, new u4(27)));
        xdr a3 = ydr.a(hyVar.c);
        this.z = a3;
        this.A = new fkn(a3);
        this.B = ydr.a(hyVar.f);
        fy fyVar = fy.a;
        this.C = ydr.a(fyVar);
        this.E = ydr.a(fyVar);
        this.G = ydr.a(rz.a);
        this.I = ydr.a(c5b.a);
        this.K = btf.b(new z3(13, this));
        Boolean bool = Boolean.FALSE;
        this.L = ydr.a(bool);
        this.X = new j0q();
        this.Y = new j0q();
        this.Z = zsd.F0(yzkVar.d(), ot0.F(this), lbq.a, bool);
        Continuation continuation = null;
        this.v0 = y0q.b(0, 0, null, 7);
        this.w0 = sk3.a0(ot0.F(this), new ez((fkn) a.j, 1));
        this.x0 = asq.K(z66Var.e(), new u4(28));
        this.y0 = (j0q) a.k;
        this.z0 = ydr.a(bool);
        this.A0 = ydr.a(0);
        this.B0 = new LinkedHashMap();
        this.C0 = new j0q();
        this.D0 = new j0q();
        x97.y(ot0.F(this), null, null, new v00(this, continuation, 0), 3);
        x97.y(ot0.F(this), null, null, new qi(this, continuation, 5), 3);
        x97.y(ot0.F(this), null, null, new l5(hyVar, this, continuation, 11), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object G(e10 e10Var, String str, cg6 cg6Var) {
        z00 z00Var;
        int i;
        List list;
        e10Var.getClass();
        if (cg6Var instanceof z00) {
            z00Var = (z00) cg6Var;
            int i2 = z00Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z00Var.l = i2 - Integer.MIN_VALUE;
                Object obj = z00Var.j;
                nm6 nm6Var = nm6.a;
                i = z00Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    gs4 gs4Var = e10Var.p;
                    z00Var.l = 1;
                    obj = gs4Var.E(str, z00Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                list = (List) obj;
                ouj.B("donations loaded: ", list, 3, "AlbumScreenViewModel", null);
                if (list != null) {
                    xdr xdrVar = e10Var.G;
                    qz qzVar = new qz(list);
                    xdrVar.getClass();
                    xdrVar.m(null, qzVar);
                }
                return Unit.a;
            }
        }
        z00Var = new z00(e10Var, cg6Var);
        Object obj2 = z00Var.j;
        nm6 nm6Var2 = nm6.a;
        i = z00Var.l;
        if (i != 0) {
        }
        list = (List) obj2;
        ouj.B("donations loaded: ", list, 3, "AlbumScreenViewModel", null);
        if (list != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f A[LOOP:1: B:22:0x0099->B:24:0x009f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object H(e10 e10Var, mt mtVar, cg6 cg6Var) {
        a10 a10Var;
        int i;
        c01 c01Var;
        ArrayList arrayList;
        Iterator it;
        xdr xdrVar = e10Var.C;
        if (cg6Var instanceof a10) {
            a10Var = (a10) cg6Var;
            int i2 = a10Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a10Var.n = i2 - Integer.MIN_VALUE;
                Object obj = a10Var.l;
                nm6 nm6Var = nm6.a;
                i = a10Var.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (mtVar.b.size() == 1) {
                        c01 c01Var2 = (c01) mtVar.b.get(0);
                        c01Var2.getClass();
                        if (xv7.C(c01Var2.a)) {
                            gs4 gs4Var = e10Var.p;
                            a10Var.j = mtVar;
                            a10Var.k = c01Var2;
                            a10Var.n = 1;
                            Object I = gs4Var.I(c01Var2, a10Var);
                            if (I == nm6Var) {
                                return nm6Var;
                            }
                            obj = I;
                            c01Var = c01Var2;
                        }
                    }
                    xdrVar.getClass();
                    xdrVar.m(null, fy.a);
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c01Var = a10Var.k;
                mtVar = a10Var.j;
                qgg.h0(obj);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    if (!Intrinsics.d((oq) obj2, mtVar.a)) {
                        arrayList2.add(obj2);
                    }
                }
                arrayList = new ArrayList(v75.o(arrayList2, 10));
                it = arrayList2.iterator();
                while (it.hasNext()) {
                    oq oqVar = (oq) it.next();
                    oqVar.getClass();
                    arrayList.add(new rt(saf.H(oqVar, true), oqVar));
                }
                ssg.a(3, "AlbumScreenViewModel", "moreAlbums loaded: " + arrayList, null);
                if (!arrayList.isEmpty()) {
                    ey eyVar = new ey(c01Var.b, arrayList);
                    xdrVar.getClass();
                    xdrVar.m(null, eyVar);
                    return Unit.a;
                }
                xdrVar.getClass();
                xdrVar.m(null, fy.a);
                return Unit.a;
            }
        }
        a10Var = new a10(e10Var, cg6Var);
        Object obj3 = a10Var.l;
        nm6 nm6Var2 = nm6.a;
        i = a10Var.n;
        if (i != 0) {
        }
        ArrayList arrayList22 = new ArrayList();
        while (r10.hasNext()) {
        }
        arrayList = new ArrayList(v75.o(arrayList22, 10));
        it = arrayList22.iterator();
        while (it.hasNext()) {
        }
        ssg.a(3, "AlbumScreenViewModel", "moreAlbums loaded: " + arrayList, null);
        if (!arrayList.isEmpty()) {
        }
        xdrVar.getClass();
        xdrVar.m(null, fy.a);
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object J(e10 e10Var, oq oqVar, cg6 cg6Var) {
        b10 b10Var;
        int i;
        Pair pair;
        xdr xdrVar = e10Var.E;
        if (cg6Var instanceof b10) {
            b10Var = (b10) cg6Var;
            int i2 = b10Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b10Var.m = i2 - Integer.MIN_VALUE;
                Object obj = b10Var.k;
                Object obj2 = nm6.a;
                i = b10Var.m;
                fy fyVar = fy.a;
                if (i != 0) {
                    qgg.h0(obj);
                    String str = oqVar.m;
                    if (str == null) {
                        xdrVar.getClass();
                        xdrVar.m(null, fyVar);
                        return Unit.a;
                    }
                    gs4 gs4Var = e10Var.p;
                    b10Var.j = oqVar;
                    b10Var.m = 1;
                    obj = gs4Var.J(str, b10Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oqVar = b10Var.j;
                    qgg.h0(obj);
                }
                pair = (Pair) obj;
                ouj.B("newAlbums loaded: ", pair == null ? (List) pair.b : null, 3, "AlbumScreenViewModel", null);
                if (pair != null) {
                    xdrVar.getClass();
                    xdrVar.m(null, fyVar);
                    return Unit.a;
                }
                Iterable iterable = (Iterable) pair.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : iterable) {
                    if (!Intrinsics.d(((oq) obj3).a, oqVar.a)) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    oq oqVar2 = (oq) it.next();
                    oqVar2.getClass();
                    arrayList2.add(new rt(saf.H(oqVar2, true), oqVar2));
                }
                ey eyVar = new ey((String) pair.a, arrayList2);
                xdrVar.getClass();
                xdrVar.m(null, eyVar);
                return Unit.a;
            }
        }
        b10Var = new b10(e10Var, cg6Var);
        Object obj4 = b10Var.k;
        Object obj22 = nm6.a;
        i = b10Var.m;
        fy fyVar2 = fy.a;
        if (i != 0) {
        }
        pair = (Pair) obj4;
        ouj.B("newAlbums loaded: ", pair == null ? (List) pair.b : null, 3, "AlbumScreenViewModel", null);
        if (pair != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object K(e10 e10Var, String str, cg6 cg6Var) {
        c10 c10Var;
        int i;
        e10Var.getClass();
        if (cg6Var instanceof c10) {
            c10Var = (c10) cg6Var;
            int i2 = c10Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c10Var.l = i2 - Integer.MIN_VALUE;
                Object obj = c10Var.j;
                nm6 nm6Var = nm6.a;
                i = c10Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    gs4 gs4Var = e10Var.p;
                    c10Var.l = 1;
                    obj = gs4Var.K(str, c10Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                List<yit> list = (List) obj;
                v3w.k("similar entities loaded: ", list.size(), 3, "AlbumScreenViewModel", null);
                ArrayList arrayList = new ArrayList();
                for (yit yitVar : list) {
                    ((s14) e10Var.K.getValue()).getClass();
                    c24 a = s14.a(yitVar);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                xdr xdrVar = e10Var.I;
                xdrVar.getClass();
                xdrVar.m(null, arrayList);
                return Unit.a;
            }
        }
        c10Var = new c10(e10Var, cg6Var);
        Object obj2 = c10Var.j;
        nm6 nm6Var2 = nm6.a;
        i = c10Var.l;
        if (i != 0) {
        }
        List<yit> list2 = (List) obj2;
        v3w.k("similar entities loaded: ", list2.size(), 3, "AlbumScreenViewModel", null);
        ArrayList arrayList2 = new ArrayList();
        while (r6.hasNext()) {
        }
        xdr xdrVar2 = e10Var.I;
        xdrVar2.getClass();
        xdrVar2.m(null, arrayList2);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0056, code lost:
    
        if (r13 == r6) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x006a, code lost:
    
        if (r13 == r6) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e10 e10Var, cg6 cg6Var) {
        x00 x00Var;
        int i;
        mt mtVar;
        xdr xdrVar = e10Var.x;
        vdr vdrVar = e10Var.y;
        String str = e10Var.n;
        gs4 gs4Var = e10Var.p;
        xdr xdrVar2 = e10Var.B;
        if (cg6Var instanceof x00) {
            x00Var = (x00) cg6Var;
            int i2 = x00Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x00Var.l = i2 - Integer.MIN_VALUE;
                Object obj = x00Var.j;
                nm6 nm6Var = nm6.a;
                i = x00Var.l;
                jy jyVar = jy.a;
                int i3 = 2;
                int i4 = 1;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    ky kyVar = (ky) xdrVar2.getValue();
                    if (Intrinsics.d(kyVar, jyVar)) {
                        x00Var.l = 1;
                        obj = gs4Var.D(str, x00Var);
                    } else {
                        if (!Intrinsics.d(kyVar, iy.a)) {
                            b6e.s();
                            return null;
                        }
                        x00Var.l = 2;
                        obj = gs4Var.v(str, x00Var);
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    mtVar = (mt) obj;
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    mtVar = (mt) obj;
                }
                if (mtVar != null) {
                    if ((vdrVar.getValue() instanceof o00) || (vdrVar.getValue() instanceof p00)) {
                        e10Var.M();
                    } else {
                        xdrVar.getClass();
                        xdrVar.m(null, k00.a);
                    }
                    return Unit.a;
                }
                oq oqVar = mtVar.a;
                yzk yzkVar = e10Var.s;
                yzkVar.getClass();
                oqVar.getClass();
                xdr xdrVar3 = yzkVar.e;
                LinkedList linkedList = oqVar.F;
                PlaybackScope playbackScope = yzkVar.b;
                playbackScope.getClass();
                int i5 = 3;
                zyk zykVar = new zyk(oqVar, linkedList, s3q.b[playbackScope.k().ordinal()] == 3 ? i3q.b : i3q.a);
                xdrVar3.getClass();
                xdrVar3.m(null, zykVar);
                e10Var.t.b(oqVar);
                m mVar = e10Var.v;
                eca ecaVar = eca.d;
                eca o = d51.o(oqVar);
                xdr xdrVar4 = (xdr) mVar.h;
                xdrVar4.getClass();
                xdrVar4.m(null, o);
                ssg.a(3, "AlbumScreenViewModel", "Loading extra blocks based on screenMode: " + xdrVar2.getValue(), null);
                if (Intrinsics.d(xdrVar2.getValue(), jyVar)) {
                    rar rarVar = e10Var.H;
                    if (rarVar != null) {
                        rarVar.g(null);
                    }
                    e10Var.H = x97.y(ot0.F(e10Var), null, null, new v00(e10Var, continuation, i4), 3);
                    rar rarVar2 = e10Var.D;
                    if (rarVar2 != null) {
                        rarVar2.g(null);
                    }
                    e10Var.D = x97.y(ot0.F(e10Var), null, null, new y00(e10Var, mtVar, continuation, 0), 3);
                    rar rarVar3 = e10Var.F;
                    if (rarVar3 != null) {
                        rarVar3.g(null);
                    }
                    e10Var.F = x97.y(ot0.F(e10Var), null, null, new y00(e10Var, mtVar, continuation, i4), 3);
                    if (!u2x.I(oqVar) && e10Var.m) {
                        rar rarVar4 = e10Var.J;
                        if (rarVar4 != null) {
                            rarVar4.g(null);
                        }
                        e10Var.J = x97.y(ot0.F(e10Var), null, null, new v00(e10Var, continuation, i3), 3);
                    }
                }
                r00 N = e10Var.N(mtVar);
                xdrVar.getClass();
                xdrVar.m(null, N);
                xdr xdrVar5 = e10Var.z;
                aud audVar = new aud(ouj.t(oqVar.o));
                xdrVar5.getClass();
                xdrVar5.m(null, audVar);
                x97.y(ot0.F(e10Var), null, null, new v00(e10Var, continuation, i5), 3);
                return Unit.a;
            }
        }
        x00Var = new x00(e10Var, cg6Var);
        Object obj2 = x00Var.j;
        nm6 nm6Var2 = nm6.a;
        i = x00Var.l;
        jy jyVar2 = jy.a;
        int i32 = 2;
        int i42 = 1;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        if (mtVar != null) {
        }
    }

    public final void L(boolean z, boolean z2) {
        xdr xdrVar = this.x;
        r00 r00Var = (r00) xdrVar.getValue();
        Continuation continuation = null;
        if (!z || !(r00Var instanceof n00)) {
            x97.y(ot0.F(this), null, null, new v00(this, continuation, 4), 3);
            return;
        }
        mt mtVar = ((n00) r00Var).b;
        oq oqVar = mtVar.a;
        if (!z2) {
            this.u.a(oqVar);
        }
        r00 N = N(mtVar);
        xdrVar.getClass();
        xdrVar.m(null, N);
    }

    public final void M() {
        x97.y(ot0.F(this), null, null, new v00(this, null, 8), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [c5b] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    public final r00 N(mt mtVar) {
        String str;
        r00 r00Var;
        o1u o1uVar;
        ?? r3;
        u00 t00Var;
        String str2;
        oq oqVar = mtVar.a;
        List list = mtVar.b;
        if (this.u.b(oqVar)) {
            return new n00(oqVar.d, mtVar);
        }
        jyr jyrVar = tt.a;
        r1u r1uVar = mtVar.d;
        String str3 = oqVar.C;
        LinkedList linkedList = oqVar.F;
        CoverPath coverPath = oqVar.o;
        String str4 = oqVar.b;
        if (str3 != null) {
            str4 = k5r.m(str4, " (", str3, ")");
        }
        String str5 = str4;
        String str6 = oqVar.f;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = str6;
        String t = ouj.t(coverPath);
        String t2 = ouj.t(oqVar.s);
        ztd L = jf0.L(mtVar);
        te u = jf0.u(mtVar);
        String str8 = oqVar.t;
        if (r1uVar == null || (str2 = r1uVar.a) == null) {
            str = str8;
            r00Var = null;
            o1uVar = null;
        } else {
            r00Var = null;
            String str9 = r1uVar.b;
            if (str9 == null) {
                str = str8;
                str9 = ((skr) tt.a.getValue()).c(R.string.dialog_action_radio_album);
            } else {
                str = str8;
            }
            String str10 = str9;
            String str11 = r1uVar.c;
            if (str11 == null) {
                str11 = coverPath.getUri();
            }
            o1uVar = jf0.f0(str2, str10, qo6.b, str11, r1uVar.d, r1uVar.e, null);
        }
        iab iabVar = new iab(str5, str7, t, t2, L, u, o1uVar, str, oqVar.B);
        if (!oqVar.d) {
            return new q00(str5, jf0.L(mtVar), list);
        }
        List A = avf.A(linkedList);
        ArrayList arrayList = new ArrayList(v75.o(A, 10));
        Iterator it = A.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                ky kyVar = (ky) this.B.getValue();
                if (!(kyVar instanceof jy)) {
                    if (kyVar instanceof iy) {
                        return new p00(iabVar, mtVar, arrayList);
                    }
                    b6e.s();
                    return r00Var;
                }
                List list2 = oqVar.h;
                if (list2 != null) {
                    List<oq> list3 = list2;
                    r3 = new ArrayList(v75.o(list3, 10));
                    for (oq oqVar2 : list3) {
                        oqVar2.getClass();
                        r3.add(new rt(saf.H(oqVar2, true), oqVar2));
                    }
                } else {
                    r3 = c5b.a;
                }
                return new o00(iabVar, mtVar, arrayList, r3);
            }
            ezs ezsVar = (ezs) it.next();
            if (ezsVar instanceof fzs) {
                fzs fzsVar = (fzs) ezsVar;
                mqs mqsVar = fzsVar.a;
                d20 d20Var = e20.a;
                int i = fzsVar.b;
                mqsVar.getClass();
                d20 d20Var2 = e20.a;
                d20Var2.getClass();
                List list4 = oqVar.n;
                List list5 = list;
                if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                    Iterator it2 = list5.iterator();
                    while (it2.hasNext()) {
                        if (((c01) it2.next()).c) {
                            break;
                        }
                    }
                }
                z = false;
                t00Var = new s00(d20Var2.a(mqsVar, i, list4, z), mqsVar, linkedList.indexOf(mqsVar));
            } else {
                if (!(ezsVar instanceof gzs)) {
                    b6e.s();
                    return r00Var;
                }
                t00Var = new t00(((gzs) ezsVar).a);
            }
            arrayList.add(t00Var);
        }
    }
}
