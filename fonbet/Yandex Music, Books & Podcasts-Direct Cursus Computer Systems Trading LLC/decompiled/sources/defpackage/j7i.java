package defpackage;

import android.content.Context;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class j7i extends bfu {
    public final x0q A;
    public final xdr B;
    public final xdr C;
    public final xdr D;
    public final qdc E;
    public final r1j F;
    public ve5 G;
    public final x0q H;
    public final x0q I;
    public zrj J;
    public rar K;
    public rar L;
    public long X;
    public final bqi k;
    public final boolean l;
    public final fkn m;
    public final tao n;
    public final nnd o;
    public final xdh p;
    public final jyr q;
    public final jyr r;
    public final jyr s;
    public final jyr t;
    public final mmo u;
    public final long v;
    public final x0q w;
    public af5 x;
    public String y;
    public final xdr z;

    public j7i(n5p n5pVar, String str, fnb fnbVar, cvo cvoVar, tmb tmbVar, bqi bqiVar, boolean z, h0m h0mVar) {
        String str2;
        str.getClass();
        fnbVar.getClass();
        cvoVar.getClass();
        bqiVar.getClass();
        this.k = bqiVar;
        this.l = z;
        Continuation continuation = null;
        this.m = zsd.F0(h0mVar, ot0.F(this), lbq.a, null);
        tao taoVar = new tao();
        taoVar.a = n5pVar;
        int i = 1;
        taoVar.d = l18.b.b(hag.I(z66.class), true);
        taoVar.b = xv.V(n5pVar);
        if (n5pVar instanceof j5p) {
            str2 = ((j5p) n5pVar).b.a;
        } else if (n5pVar instanceof m5p) {
            str2 = ((m5p) n5pVar).b.f();
        } else if (n5pVar instanceof k5p) {
            str2 = ((k5p) n5pVar).b.a;
        } else {
            if (!(n5pVar instanceof l5p)) {
                b6e.s();
                throw null;
            }
            str2 = null;
        }
        taoVar.c = str2 == null ? "" : str2;
        taoVar.e = n5pVar.a;
        this.n = taoVar;
        nnd nndVar = new nnd(29);
        c0p h = taoVar.h();
        h.getClass();
        nndVar.v().i = h;
        this.o = nndVar;
        grh grhVar = new grh(new tao(fnbVar, taoVar.h(), str), tmbVar);
        fnbVar.getClass();
        sfm sfmVar = new sfm();
        sfmVar.a = fnbVar;
        sfmVar.b = qld.m();
        sfmVar.c = new LinkedHashMap();
        new LinkedHashMap();
        jtc jtcVar = new jtc();
        jtcVar.a = sfmVar;
        this.p = new xdh(cvoVar, grhVar, jtcVar, new h0h(fnbVar, wjb.SearchScreen));
        l18 l18Var = l18.b;
        jyr b = l18Var.b(hag.I(z66.class), true);
        this.q = b;
        this.r = l18Var.b(hag.I(zzp.class), true);
        this.s = l18Var.b(hag.I(vzo.class), true);
        this.t = l18Var.b(hag.I(aog.class), true);
        bdt I = hag.I(Context.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        Context context = (Context) qdcVar.C(I);
        bdt I2 = hag.I(u3g.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        u3g u3gVar = (u3g) qdcVar2.C(I2);
        z66 z66Var = (z66) b.getValue();
        bdt I3 = hag.I(fw5.class);
        qdc qdcVar3 = l18Var.a;
        qdcVar3.getClass();
        fu5 b2 = ((fw5) qdcVar3.C(I3)).b();
        bdt I4 = hag.I(ng1.class);
        qdc qdcVar4 = l18Var.a;
        qdcVar4.getClass();
        this.u = new mmo(context, u3gVar, z66Var, b2, (ng1) qdcVar4.C(I4));
        msa msaVar = nsa.b;
        this.v = yd5.M(300, ssa.MILLISECONDS);
        this.w = y0q.b(1, 1, null, 4);
        this.y = "";
        this.z = ydr.a(O((z66) b.getValue()));
        this.A = y0q.b(0, 0, null, 7);
        this.B = ydr.a(new k6p(new Pair("", null), new gcc(c5b.a), null, false, P(), null, false, S(null, false)));
        this.C = ydr.a(null);
        this.D = ydr.a(Boolean.FALSE);
        this.E = new qdc(13);
        r1j r1jVar = new r1j();
        r1jVar.a = null;
        this.F = r1jVar;
        this.H = y0q.b(0, 0, null, 7);
        this.I = y0q.b(0, 0, null, 7);
        x97.y(ot0.F(this), null, null, new m6i(this, continuation, 0), 3);
        x97.y(ot0.F(this), null, null, new k6i(this, continuation, i), 3);
        int i2 = 2;
        x97.y(ot0.F(this), null, null, new k6i(this, continuation, i2), 3);
        x97.y(ot0.F(this), null, null, new m6i(this, continuation, i2), 3);
        grhVar.h = M();
        quk qukVar = (quk) grhVar.g;
        grhVar.c();
        qukVar.getClass();
    }

    public static final Integer G(j7i j7iVar, p0p p0pVar, ue5 ue5Var) {
        if (ue5Var instanceof jpg) {
            Integer valueOf = Integer.valueOf(R.string.search_local_block_title_my_podcasts_collection);
            switch (p0pVar.ordinal()) {
                case 0:
                case 5:
                case 9:
                case 19:
                case 26:
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                    return Integer.valueOf(R.string.search_local_block_title_playlist);
                case 6:
                    return Integer.valueOf(R.string.search_local_block_title_album);
                case 7:
                    return Integer.valueOf(R.string.search_local_block_title_podcast);
                case 8:
                    return Integer.valueOf(R.string.search_local_block_title_audiobook);
                case 10:
                    return Integer.valueOf(R.string.search_local_block_title_my_albums);
                case 11:
                    return Integer.valueOf(R.string.search_local_block_title_artists);
                case 12:
                    return Integer.valueOf(R.string.search_local_block_title_my_playlists);
                case 13:
                case 14:
                case 15:
                case 22:
                    return Integer.valueOf(R.string.search_local_block_title_my_kids_collection);
                case 16:
                    return Integer.valueOf(R.string.search_local_block_title_my_downloaded_tracks);
                case 17:
                case 20:
                case 23:
                    return valueOf;
                case 18:
                case 21:
                case 24:
                    return Integer.valueOf(R.string.search_local_block_title_my_books_collection);
                case 25:
                    return Integer.valueOf(R.string.search_local_block_title_my_video_clips_collection);
                default:
                    b6e.s();
                    return null;
            }
        } else {
            if (!(ue5Var instanceof yqi)) {
                if (ue5Var instanceof yrj) {
                    return Integer.valueOf(R.string.search_local_block_title_artist);
                }
                b6e.s();
                return null;
            }
            if (t6i.a[p0pVar.ordinal()] == 24) {
                return Integer.valueOf(R.string.search_local_block_title_my_collection);
            }
        }
        return null;
    }

    public static final Integer H(j7i j7iVar, c0p c0pVar) {
        int ordinal = c0pVar.ordinal();
        if (ordinal == 0) {
            return Integer.valueOf(R.string.search_online_block_title_kids);
        }
        if (ordinal == 1) {
            return Integer.valueOf(R.string.search_online_block_title_podcasts);
        }
        if (ordinal == 2 || ordinal == 3) {
            return Integer.valueOf(R.string.search_online_block_title_my_music);
        }
        if (ordinal == 4) {
            return null;
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object J(j7i j7iVar, s6i s6iVar, cg6 cg6Var) {
        c7i c7iVar;
        int i;
        asj asjVar;
        if (cg6Var instanceof c7i) {
            c7iVar = (c7i) cg6Var;
            int i2 = c7iVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c7iVar.m = i2 - Integer.MIN_VALUE;
                Object obj = c7iVar.k;
                nm6 nm6Var = nm6.a;
                i = c7iVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    List list = s6iVar.a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof yrj) {
                            arrayList.add(obj2);
                        }
                    }
                    yrj yrjVar = (yrj) CollectionsKt.firstOrNull(arrayList);
                    if (yrjVar == null) {
                        asjVar = null;
                        s6iVar.c.a(asjVar != null ? new ye5(asjVar) : xe5.a);
                        return Unit.a;
                    }
                    vzo vzoVar = (vzo) j7iVar.s.getValue();
                    xdh xdhVar = j7iVar.p;
                    c7iVar.j = s6iVar;
                    c7iVar.m = 1;
                    obj = ldg.G(vzoVar, yrjVar, xdhVar, false, c7iVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    s6iVar = c7iVar.j;
                    qgg.h0(obj);
                }
                asjVar = (asj) obj;
                s6iVar.c.a(asjVar != null ? new ye5(asjVar) : xe5.a);
                return Unit.a;
            }
        }
        c7iVar = new c7i(j7iVar, cg6Var);
        Object obj3 = c7iVar.k;
        nm6 nm6Var2 = nm6.a;
        i = c7iVar.m;
        if (i != 0) {
        }
        asjVar = (asj) obj3;
        s6iVar.c.a(asjVar != null ? new ye5(asjVar) : xe5.a);
        return Unit.a;
    }

    public static List K(List list) {
        return !list.isEmpty() ? CollectionsKt.g0(t75.c(new n1p("top", new nht(), t1p.a)), list) : c5b.a;
    }

    public static b0p O(z66 z66Var) {
        return z66Var.a().b == u0j.a ? b0p.c : !z66Var.a().a ? b0p.b : b0p.a;
    }

    public static final Object a(j7i j7iVar, cg6 cg6Var) {
        return (j7iVar.l && j7iVar.z.getValue() == b0p.a && j7iVar.n.h() == c0p.d) ? zsd.g0(new bca(j7iVar.m, 18), cg6Var) : Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(s6i s6iVar, bf5 bf5Var, cg6 cg6Var) {
        u6i u6iVar;
        int i;
        if (cg6Var instanceof u6i) {
            u6iVar = (u6i) cg6Var;
            int i2 = u6iVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u6iVar.l = i2 - Integer.MIN_VALUE;
                u6i u6iVar2 = u6iVar;
                Object obj = u6iVar2.j;
                nm6 nm6Var = nm6.a;
                i = u6iVar2.l;
                if (i != 0) {
                    qgg.h0(obj);
                    List list = s6iVar.a;
                    a0p a0pVar = s6iVar.b;
                    ve5 ve5Var = s6iVar.c;
                    af5 af5Var = a0pVar.a;
                    if (bf5Var instanceof kpg) {
                        ve5Var.getClass();
                        ve5Var.e = ((kpg) bf5Var).a;
                    } else if (!(bf5Var instanceof asj)) {
                        b6e.s();
                        return;
                    } else {
                        ve5Var.getClass();
                        ve5Var.a(new ye5((asj) bf5Var));
                    }
                    this.y = af5Var.a;
                    b5p b5pVar = new b5p(list, bf5Var, ve5Var, this.p);
                    n7b n7bVar = new n7b(new hyd(20, 52), new dmg(16, b5pVar));
                    nnd nndVar = this.o;
                    nndVar.getClass();
                    ConcurrentHashMap concurrentHashMap = b5pVar.i;
                    concurrentHashMap.getClass();
                    nndVar.c = concurrentHashMap;
                    String str = af5Var.a;
                    str.getClass();
                    nndVar.v().c = str;
                    this.F.getClass();
                    f44 f44Var = new f44(n7bVar, af5Var, list, this, a0pVar, bf5Var, ve5Var, (Continuation) null, 6);
                    u6iVar2.l = 1;
                    if (gld.Q(f44Var, u6iVar2) == nm6Var) {
                        return;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            throw ouj.e(obj);
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    qgg.h0(obj);
                }
                u6iVar2.l = 2;
                y2x.m(u6iVar2);
            }
        }
        u6iVar = new u6i(this, cg6Var);
        u6i u6iVar22 = u6iVar;
        Object obj2 = u6iVar22.j;
        nm6 nm6Var2 = nm6.a;
        i = u6iVar22.l;
        if (i != 0) {
        }
        u6iVar22.l = 2;
        y2x.m(u6iVar22);
    }

    public final Pair M() {
        n1p n1pVar = (n1p) this.C.getValue();
        if (n1pVar == null) {
            n1pVar = new n1p("top", new nht(), t1p.a);
        }
        List list = this.F.a;
        if (list == null) {
            list = c5b.a;
        }
        return new Pair(n1pVar, K(list));
    }

    public final zzp N() {
        return (zzp) this.r.getValue();
    }

    public final boolean P() {
        return this.n.h() != c0p.e && O((z66) this.q.getValue()) == b0p.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x01c2, code lost:
    
        if (r14 == r1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0106, code lost:
    
        if (T(r3, r14, r0) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0122, code lost:
    
        if (T(r3, r14, r0) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x007f, code lost:
    
        if (r15 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00a0, code lost:
    
        if (r15 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object R(s6i s6iVar, cg6 cg6Var) {
        b7i b7iVar;
        int i;
        s6i s6iVar2;
        ue5 ue5Var;
        bf5 bf5Var;
        ze5 ze5Var;
        bf5 bf5Var2;
        Object R;
        if (cg6Var instanceof b7i) {
            b7iVar = (b7i) cg6Var;
            int i2 = b7iVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b7iVar.n = i2 - Integer.MIN_VALUE;
                Object obj = b7iVar.l;
                Object obj2 = nm6.a;
                i = b7iVar.n;
                l6p l6pVar = i6p.a;
                switch (i) {
                    case 0:
                        qgg.h0(obj);
                        ue5 ue5Var2 = (ue5) CollectionsKt.Q(s6iVar.a);
                        boolean z = ue5Var2 instanceof jpg;
                        jyr jyrVar = this.t;
                        if (z) {
                            b7iVar.j = s6iVar;
                            b7iVar.k = null;
                            b7iVar.n = 1;
                            obj = ((aog) jyrVar.getValue()).d((jpg) ue5Var2, b7iVar);
                            break;
                        } else if (ue5Var2 instanceof yqi) {
                            b7iVar.j = s6iVar;
                            b7iVar.k = null;
                            b7iVar.n = 2;
                            obj = ((aog) jyrVar.getValue()).i((yqi) ue5Var2, b7iVar);
                            break;
                        } else {
                            if (!(ue5Var2 instanceof yrj)) {
                                b6e.s();
                                return null;
                            }
                            gm5 gm5Var = s6iVar.c.d;
                            b7iVar.j = s6iVar;
                            b7iVar.k = (yrj) ue5Var2;
                            b7iVar.n = 3;
                            Object s = gm5Var.s(b7iVar);
                            if (s != obj2) {
                                s6iVar2 = s6iVar;
                                ue5Var = ue5Var2;
                                obj = s;
                                ze5Var = (ze5) obj;
                                if (!Intrinsics.d(ze5Var, we5.a)) {
                                    vzo vzoVar = (vzo) this.s.getValue();
                                    yrj yrjVar = (yrj) ue5Var;
                                    boolean z2 = yrjVar.d == null && yrjVar.b == c0p.d;
                                    b7iVar.j = s6iVar2;
                                    b7iVar.k = null;
                                    b7iVar.n = 4;
                                    obj = ldg.G(vzoVar, yrjVar, this.p, z2, b7iVar);
                                    if (obj != obj2) {
                                        s6iVar = s6iVar2;
                                        bf5Var = (asj) obj;
                                        if (bf5Var == null) {
                                            a0p a0pVar = s6iVar.b;
                                            b7iVar.j = null;
                                            b7iVar.k = null;
                                            b7iVar.n = 5;
                                            break;
                                        }
                                        bf5Var2 = bf5Var;
                                        b7iVar.j = null;
                                        b7iVar.k = null;
                                        b7iVar.n = 7;
                                        Boolean bool = Boolean.FALSE;
                                        xdr xdrVar = this.D;
                                        xdrVar.getClass();
                                        xdrVar.m(null, bool);
                                        if (!bf5Var2.isEmpty()) {
                                            L(s6iVar, bf5Var2, b7iVar);
                                            R = obj2;
                                            break;
                                        } else {
                                            a0p a0pVar2 = s6iVar.b;
                                            List L = CollectionsKt.L(s6iVar.a, 1);
                                            if (!L.isEmpty()) {
                                                R = R(new s6i(L, s6iVar.b, s6iVar.c), b7iVar);
                                                if (R != obj2) {
                                                    R = Unit.a;
                                                    break;
                                                }
                                            } else if (a0pVar2.d != b0p.b) {
                                                int i3 = 10;
                                                R = zsd.b0(new qm(new u21(i3, zsd.b0(new kvh(((z66) this.q.getValue()).c(), 5)), this.C, y6i.a), this, bf5Var2, a0pVar2, 4)).collect(new lrf(i3, this, a0pVar2), b7iVar);
                                                if (R != obj2) {
                                                    R = Unit.a;
                                                    break;
                                                }
                                            } else {
                                                R = T(l6pVar, a0pVar2, b7iVar);
                                                if (R != obj2) {
                                                    R = Unit.a;
                                                }
                                                break;
                                            }
                                        }
                                    }
                                } else if (Intrinsics.d(ze5Var, xe5.a)) {
                                    a0p a0pVar3 = s6iVar2.b;
                                    b7iVar.j = null;
                                    b7iVar.k = null;
                                    b7iVar.n = 6;
                                    break;
                                } else {
                                    if (!(ze5Var instanceof ye5)) {
                                        b6e.s();
                                        return null;
                                    }
                                    bf5Var = ((ye5) ze5Var).a;
                                    s6iVar = s6iVar2;
                                    bf5Var2 = bf5Var;
                                    b7iVar.j = null;
                                    b7iVar.k = null;
                                    b7iVar.n = 7;
                                    Boolean bool2 = Boolean.FALSE;
                                    xdr xdrVar2 = this.D;
                                    xdrVar2.getClass();
                                    xdrVar2.m(null, bool2);
                                    if (!bf5Var2.isEmpty()) {
                                    }
                                }
                            }
                        }
                        return obj2;
                    case 1:
                        s6iVar = b7iVar.j;
                        qgg.h0(obj);
                        bf5Var = (bf5) obj;
                        bf5Var2 = bf5Var;
                        b7iVar.j = null;
                        b7iVar.k = null;
                        b7iVar.n = 7;
                        Boolean bool22 = Boolean.FALSE;
                        xdr xdrVar22 = this.D;
                        xdrVar22.getClass();
                        xdrVar22.m(null, bool22);
                        if (!bf5Var2.isEmpty()) {
                        }
                        break;
                    case 2:
                        s6iVar = b7iVar.j;
                        qgg.h0(obj);
                        bf5Var = (bf5) obj;
                        bf5Var2 = bf5Var;
                        b7iVar.j = null;
                        b7iVar.k = null;
                        b7iVar.n = 7;
                        Boolean bool222 = Boolean.FALSE;
                        xdr xdrVar222 = this.D;
                        xdrVar222.getClass();
                        xdrVar222.m(null, bool222);
                        if (!bf5Var2.isEmpty()) {
                        }
                        break;
                    case 3:
                        ue5Var = b7iVar.k;
                        s6iVar2 = b7iVar.j;
                        qgg.h0(obj);
                        ze5Var = (ze5) obj;
                        if (!Intrinsics.d(ze5Var, we5.a)) {
                        }
                        return obj2;
                    case 4:
                        s6iVar = b7iVar.j;
                        qgg.h0(obj);
                        bf5Var = (asj) obj;
                        if (bf5Var == null) {
                        }
                        bf5Var2 = bf5Var;
                        b7iVar.j = null;
                        b7iVar.k = null;
                        b7iVar.n = 7;
                        Boolean bool2222 = Boolean.FALSE;
                        xdr xdrVar2222 = this.D;
                        xdrVar2222.getClass();
                        xdrVar2222.m(null, bool2222);
                        if (!bf5Var2.isEmpty()) {
                        }
                        break;
                    case 5:
                        qgg.h0(obj);
                        return Unit.a;
                    case 6:
                        qgg.h0(obj);
                        return Unit.a;
                    case 7:
                        qgg.h0(obj);
                        return Unit.a;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        b7iVar = new b7i(this, cg6Var);
        Object obj3 = b7iVar.l;
        Object obj22 = nm6.a;
        i = b7iVar.n;
        l6p l6pVar2 = i6p.a;
        switch (i) {
        }
    }

    public final fs S(n1p n1pVar, boolean z) {
        t1p t1pVar;
        Collection c = (z && (n1pVar == null || (t1pVar = n1pVar.c) == t1p.a || t1pVar == t1p.b)) ? t75.c(s7p.b) : c5b.a;
        d51 d51Var = v3k.f;
        fs7 fs7Var = v3k.e;
        int i = 0;
        if ((n1pVar != null && n1pVar.c != t1p.a) || this.z.getValue() != b0p.a || this.n.h() != c0p.d) {
            Collection collection = c;
            ArrayList arrayList = new ArrayList(8);
            while (i < 8) {
                arrayList.add(r7p.b);
                i++;
            }
            ArrayList g0 = CollectionsKt.g0(collection, arrayList);
            return new fs(15, new v3k(new fs(15, new f1k(g0)), fs7Var, d51Var, new ep7(g0, 3)));
        }
        Collection collection2 = c;
        ArrayList arrayList2 = new ArrayList(2);
        for (int i2 = 0; i2 < 2; i2++) {
            arrayList2.add(q7p.b);
        }
        ArrayList h0 = CollectionsKt.h0(CollectionsKt.g0(collection2, arrayList2), new u7p(24, e4p.e));
        ArrayList arrayList3 = new ArrayList(8);
        while (i < 8) {
            arrayList3.add(r7p.b);
            i++;
        }
        ArrayList g02 = CollectionsKt.g0(h0, arrayList3);
        return new fs(15, new v3k(new fs(15, new f1k(g02)), fs7Var, d51Var, new ep7(g02, 3)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object T(l6p l6pVar, a0p a0pVar, Continuation continuation) {
        i7i i7iVar;
        int i;
        if (continuation instanceof i7i) {
            i7iVar = (i7i) continuation;
            int i2 = i7iVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i7iVar.m = i2 - Integer.MIN_VALUE;
                Object obj = i7iVar.k;
                nm6 nm6Var = nm6.a;
                i = i7iVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    ve5 ve5Var = this.G;
                    if (a0pVar != null && ve5Var != null && ((l6pVar instanceof h6p) || (l6pVar instanceof k6p))) {
                        long a = N().a() - ve5Var.a;
                        qdc qdcVar = this.E;
                        qdcVar.getClass();
                        if (!a0pVar.equals((a0p) qdcVar.c)) {
                            qdcVar.c = a0pVar;
                            h6i h6iVar = (h6i) qdcVar.b;
                            af5 af5Var = a0pVar.a;
                            String str = af5Var.a;
                            c0p c0pVar = a0pVar.b;
                            p0p p0pVar = a0pVar.c;
                            String str2 = a0pVar.f;
                            n1p n1pVar = af5Var.b;
                            String name = n1pVar != null ? n1pVar.c.name() : null;
                            str.getClass();
                            c0pVar.getClass();
                            p0pVar.getClass();
                            h6iVar.getClass();
                            JsonObject jsonObject = new JsonObject();
                            jsonObject.u("query", str);
                            jsonObject.u("context", c0pVar.name());
                            jsonObject.u("filterId", name);
                            jsonObject.u("entity", p0pVar.name());
                            jsonObject.u("entityId", str2);
                            jsonObject.s(Long.valueOf(a), "time");
                            h6iVar.e().b(h6i.h(g6i.DataShownElapsed, jsonObject));
                        }
                    }
                    boolean z = l6pVar instanceof h6p;
                    xdh xdhVar = this.p;
                    if (z || (l6pVar instanceof i6p)) {
                        grh grhVar = (grh) xdhVar.b;
                        grhVar.h = new Pair(null, c5b.a);
                        quk qukVar = (quk) grhVar.g;
                        grhVar.c();
                        qukVar.getClass();
                    } else {
                        grh grhVar2 = (grh) xdhVar.b;
                        grhVar2.h = M();
                        quk qukVar2 = (quk) grhVar2.g;
                        grhVar2.c();
                        qukVar2.getClass();
                    }
                    if (this.X > 0 && (z || (l6pVar instanceof i6p))) {
                        long a2 = 2000 - (N().a() - this.X);
                        this.X = 0L;
                        long j = a2 >= 0 ? a2 : 0L;
                        i7iVar.j = l6pVar;
                        i7iVar.m = 1;
                        if (y2x.o(j, i7iVar) == nm6Var) {
                            return nm6Var;
                        }
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l6pVar = i7iVar.j;
                    qgg.h0(obj);
                }
                this.B.l(l6pVar);
                return Unit.a;
            }
        }
        i7iVar = new i7i(this, continuation);
        Object obj2 = i7iVar.k;
        nm6 nm6Var2 = nm6.a;
        i = i7iVar.m;
        if (i != 0) {
        }
        this.B.l(l6pVar);
        return Unit.a;
    }
}
