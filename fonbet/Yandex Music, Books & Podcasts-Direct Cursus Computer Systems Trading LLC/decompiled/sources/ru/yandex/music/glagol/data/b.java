package ru.yandex.music.glagol.data;

import com.yandex.music.shared.network.api.retrofit.MusicBackendHttpException;
import com.yandex.music.shared.network.api.retrofit.MusicCommonHttpException;
import defpackage.aid;
import defpackage.b5d;
import defpackage.b6e;
import defpackage.bdt;
import defpackage.bid;
import defpackage.bkd;
import defpackage.byb;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.cid;
import defpackage.d57;
import defpackage.dgr;
import defpackage.did;
import defpackage.dm6;
import defpackage.g4d;
import defpackage.g68;
import defpackage.hag;
import defpackage.hgp;
import defpackage.hld;
import defpackage.htb;
import defpackage.ita;
import defpackage.jyr;
import defpackage.k1q;
import defpackage.k21;
import defpackage.kab;
import defpackage.l0t;
import defpackage.l18;
import defpackage.l8j;
import defpackage.mab;
import defpackage.mfn;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.o3f;
import defpackage.ou7;
import defpackage.pj6;
import defpackage.pm6;
import defpackage.psd;
import defpackage.qdc;
import defpackage.qgg;
import defpackage.qhd;
import defpackage.qj6;
import defpackage.qqi;
import defpackage.rhd;
import defpackage.rj6;
import defpackage.rqi;
import defpackage.skr;
import defpackage.t1q;
import defpackage.t75;
import defpackage.thd;
import defpackage.u1q;
import defpackage.u75;
import defpackage.unl;
import defpackage.vqi;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xp3;
import defpackage.xq0;
import defpackage.xz0;
import defpackage.ydr;
import defpackage.yhd;
import defpackage.yj6;
import defpackage.yr;
import defpackage.z66;
import defpackage.zhd;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.data.wave.recommendations.Icon;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes5.dex */
public final class b {
    public final mm6 a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public final jyr g;
    public final qqi h;
    public yhd i;
    public final hgp j;
    public final xdr k;

    public b(vqi vqiVar) {
        vqiVar.getClass();
        this.a = hld.r(vqiVar, dm6.b);
        bdt I = hag.I(mfn.class);
        l18 l18Var = l18.b;
        this.b = l18Var.b(I, true);
        this.c = l18Var.b(hag.I(b5d.class), false);
        this.d = l18Var.b(hag.I(z66.class), true);
        this.e = l18Var.b(hag.I(l0t.class), true);
        this.f = l18Var.b(hag.I(k21.class), false);
        this.g = l18Var.b(hag.I(yr.class), false);
        this.h = rqi.a();
        hgp hgpVar = new hgp();
        hgpVar.b = rqi.a();
        hgpVar.c = new k1q();
        hgpVar.d = new HashMap();
        hgpVar.e = new HashMap();
        hgpVar.f = new HashMap();
        hgpVar.a = new ArrayList();
        hgpVar.g = new ArrayList();
        hgpVar.h = new ArrayList();
        hgpVar.i = new LinkedHashMap();
        this.j = hgpVar;
        this.k = ydr.a(t1q.h);
        vqiVar.D(new ita(27, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ef, code lost:
    
        if (r0.u(r11, r1) == r2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0111, code lost:
    
        if (r0.v(r11, r1) == r2) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, Iterable iterable, cg6 cg6Var) {
        aid aidVar;
        Object obj;
        int i;
        Iterable iterable2;
        o3f o3fVar;
        o3f o3fVar2;
        rj6 rj6Var;
        hgp hgpVar = bVar.j;
        if (cg6Var instanceof aid) {
            aidVar = (aid) cg6Var;
            int i2 = aidVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aidVar.n = i2 - Integer.MIN_VALUE;
                obj = aidVar.l;
                nm6 nm6Var = nm6.a;
                i = aidVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    o3f o3fVar3 = new o3f(iterable);
                    aidVar.j = iterable;
                    aidVar.k = o3fVar3;
                    aidVar.n = 1;
                    Object m = hgpVar.m(o3fVar3, aidVar);
                    if (m != nm6Var) {
                        iterable2 = iterable;
                        o3fVar = o3fVar3;
                        obj = m;
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    o3fVar = aidVar.k;
                    iterable2 = aidVar.j;
                    qgg.h0(obj);
                } else {
                    if (i != 2) {
                        if (i == 3 || i == 4) {
                            qgg.h0(obj);
                            return c5b.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o3fVar2 = aidVar.k;
                    qgg.h0(obj);
                    rj6Var = (rj6) obj;
                    if (!(rj6Var instanceof qj6)) {
                        return (List) ((qj6) rj6Var).a;
                    }
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    IOException a = ((pj6) rj6Var).a();
                    a.getClass();
                    Integer valueOf = a instanceof MusicCommonHttpException ? Integer.valueOf(((MusicCommonHttpException) a).a) : a instanceof MusicBackendHttpException ? Integer.valueOf(((MusicBackendHttpException) a).a) : null;
                    IntRange intRange = new IntRange(400, 499, 1);
                    if (valueOf == null || !intRange.q(valueOf.intValue())) {
                        IntRange intRange2 = new IntRange(500, 599, 1);
                        if (valueOf != null && intRange2.q(valueOf.intValue())) {
                            aidVar.j = null;
                            aidVar.k = null;
                            aidVar.n = 4;
                        }
                        return c5b.a;
                    }
                    aidVar.j = null;
                    aidVar.k = null;
                    aidVar.n = 3;
                }
                if (!((Boolean) obj).booleanValue()) {
                    return c5b.a;
                }
                l0t l0tVar = (l0t) bVar.e.getValue();
                psd psdVar = new psd(2);
                psdVar.b = "Glagol";
                psdVar.a("Loading tracks by id");
                aidVar.j = null;
                aidVar.k = o3fVar;
                aidVar.n = 2;
                obj = l0tVar.d(iterable2, false, psdVar, aidVar);
                if (obj != nm6Var) {
                    o3fVar2 = o3fVar;
                    rj6Var = (rj6) obj;
                    if (!(rj6Var instanceof qj6)) {
                    }
                }
                return nm6Var;
            }
        }
        aidVar = new aid(bVar, cg6Var);
        obj = aidVar.l;
        nm6 nm6Var2 = nm6.a;
        i = aidVar.n;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        if (r11 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007f, code lost:
    
        if (r11 == r2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b3, code lost:
    
        if (r11 == r2) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b bVar, StationId stationId, qhd qhdVar, cg6 cg6Var) {
        bid bidVar;
        int i;
        qhd qhdVar2;
        rj6 rj6Var;
        l18 l18Var = l18.b;
        if (cg6Var instanceof bid) {
            bidVar = (bid) cg6Var;
            int i2 = bidVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bidVar.n = i2 - Integer.MIN_VALUE;
                Object obj = bidVar.l;
                nm6 nm6Var = nm6.a;
                i = bidVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    bdt I = hag.I(byb.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    if (((thd) ((byb) qdcVar.C(I)).b(thd.class)).h()) {
                        String str = qhdVar.e;
                        if (str != null) {
                            mfn mfnVar = (mfn) bVar.b.getValue();
                            bidVar.j = stationId;
                            bidVar.k = qhdVar;
                            bidVar.n = 1;
                            obj = mfnVar.b(str, bidVar);
                        }
                        mfn mfnVar2 = (mfn) bVar.b.getValue();
                        bidVar.j = null;
                        bidVar.k = qhdVar;
                        bidVar.n = 2;
                        obj = mfnVar2.c(stationId, bidVar);
                        if (obj != nm6Var) {
                            qhdVar2 = qhdVar;
                            rj6Var = (rj6) obj;
                            qhdVar = qhdVar2;
                        }
                    } else {
                        mfn mfnVar3 = (mfn) bVar.b.getValue();
                        bidVar.j = null;
                        bidVar.k = qhdVar;
                        bidVar.n = 3;
                        obj = mfnVar3.c(stationId, bidVar);
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    qhdVar = bidVar.k;
                    stationId = bidVar.j;
                    qgg.h0(obj);
                    rj6Var = (rj6) obj;
                } else if (i == 2) {
                    qhdVar2 = bidVar.k;
                    qgg.h0(obj);
                    rj6Var = (rj6) obj;
                    qhdVar = qhdVar2;
                } else {
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qhdVar = bidVar.k;
                    qgg.h0(obj);
                    rj6Var = (rj6) obj;
                }
                if (rj6Var instanceof qj6) {
                    if (rj6Var instanceof pj6) {
                        throw ((pj6) rj6Var).a();
                    }
                    b6e.s();
                    return null;
                }
                Object obj2 = ((qj6) rj6Var).a;
                dgr dgrVar = (dgr) (Intrinsics.d(((dgr) obj2).a, StationId.a) ? null : obj2);
                if (dgrVar == null) {
                    StationId f = StationId.f("user:onyourwave");
                    List c = t75.c("user:onyourwave");
                    bdt I2 = hag.I(skr.class);
                    qdc qdcVar2 = l18Var.a;
                    qdcVar2.getClass();
                    String c2 = ((skr) qdcVar2.C(I2)).c(R.string.rup_block_title);
                    Icon icon = Icon.a;
                    dgrVar = new dgr(f, c, c2, "user-onyourwave");
                }
                return new u1q(dgrVar, qhdVar);
            }
        }
        bidVar = new bid(bVar, cg6Var);
        Object obj3 = bidVar.l;
        nm6 nm6Var2 = nm6.a;
        i = bidVar.n;
        if (i != 0) {
        }
        if (rj6Var instanceof qj6) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00cb, code lost:
    
        if ((r13.length() != 16) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x009c, code lost:
    
        if ((r11.length() != 16) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00aa, code lost:
    
        if (kotlin.text.StringsKt.U(r12) == false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(unl unlVar, cg6 cg6Var) {
        cid cidVar;
        Object obj;
        Enum r4;
        int i;
        String str;
        List w;
        mab entityInfo;
        kab next;
        mab entityInfo2;
        kab prev;
        String str2;
        String description;
        qhd qhdVar;
        t1q t1qVar;
        int ordinal;
        int i2;
        t1q t1qVar2;
        int i3;
        t1q t1qVar3;
        unl unlVar2 = unlVar;
        if (cg6Var instanceof cid) {
            cidVar = (cid) cg6Var;
            int i4 = cidVar.o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cidVar.o = i4 - Integer.MIN_VALUE;
                obj = cidVar.m;
                r4 = nm6.a;
                i = cidVar.o;
                xdr xdrVar = this.k;
                if (i != 0) {
                    qgg.h0(obj);
                    t1q t1qVar4 = (t1q) xdrVar.getValue();
                    rhd Q = unlVar2 != null ? xp3.Q(unlVar2) : null;
                    if ((Q == null ? -1 : yj6.a[Q.ordinal()]) == 1) {
                        String P = xp3.P(unlVar2);
                        if (StringsKt.U(P)) {
                            P = null;
                        }
                        w = u75.i(P);
                    } else {
                        if (unlVar2 != null && (entityInfo2 = unlVar2.getEntityInfo()) != null && (prev = entityInfo2.getPrev()) != null && (r11 = prev.getId()) != null) {
                        }
                        String str3 = null;
                        if (unlVar2 != null) {
                            str = xp3.P(unlVar2);
                        }
                        str = null;
                        if (unlVar2 != null && (entityInfo = unlVar2.getEntityInfo()) != null && (next = entityInfo.getNext()) != null && (r13 = next.getId()) != null) {
                        }
                        String str4 = null;
                        w = xz0.w(new String[]{str3, str, str4});
                    }
                    if (unlVar2 == null) {
                        qhdVar = qhd.f;
                    } else {
                        mab entityInfo3 = unlVar2.getEntityInfo();
                        String id = entityInfo3 != null ? entityInfo3.getId() : null;
                        rhd Q2 = xp3.Q(unlVar2);
                        mab entityInfo4 = unlVar2.getEntityInfo();
                        String type = entityInfo4 != null ? entityInfo4.getType() : null;
                        if (xp3.U(unlVar2) == bkd.f) {
                            description = xp3.T(unlVar2).d;
                        } else {
                            mab entityInfo5 = unlVar2.getEntityInfo();
                            if (entityInfo5 != null) {
                                description = entityInfo5.getDescription();
                            } else {
                                str2 = null;
                                Map extra = unlVar2.getExtra();
                                qhdVar = new qhd(id, Q2, type, str2, extra == null ? (String) extra.get("radioSessionID") : null);
                            }
                        }
                        str2 = description;
                        Map extra2 = unlVar2.getExtra();
                        qhdVar = new qhd(id, Q2, type, str2, extra2 == null ? (String) extra2.get("radioSessionID") : null);
                    }
                    cidVar.j = unlVar2;
                    cidVar.k = t1qVar4;
                    cidVar.o = 1;
                    Enum d = d(w, qhdVar, cidVar);
                    if (d != r4) {
                        t1qVar = t1qVar4;
                        obj = d;
                    }
                    return r4;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = cidVar.l;
                    t1qVar2 = cidVar.k;
                    qgg.h0(obj);
                    t1qVar3 = (t1q) obj;
                    if (i3 == 0 || !Intrinsics.d(t1qVar2, t1qVar3)) {
                        xdrVar.l(t1qVar3);
                    }
                    return Unit.a;
                }
                t1q t1qVar5 = cidVar.k;
                unl unlVar3 = cidVar.j;
                qgg.h0(obj);
                t1qVar = t1qVar5;
                unlVar2 = unlVar3;
                ordinal = ((zhd) obj).ordinal();
                if (ordinal != 0) {
                    i2 = 1;
                } else {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return Unit.a;
                        }
                        if (ordinal == 3) {
                            return Unit.a;
                        }
                        b6e.s();
                        return null;
                    }
                    i2 = 0;
                }
                g4d g4dVar = new g4d(18);
                htb htbVar = new htb(24);
                cidVar.j = null;
                cidVar.k = t1qVar;
                cidVar.l = i2;
                cidVar.o = 2;
                obj = xp3.j0(unlVar2, this.j, g4dVar, htbVar, cidVar);
                if (obj != r4) {
                    t1qVar2 = t1qVar;
                    i3 = i2;
                    t1qVar3 = (t1q) obj;
                    if (i3 == 0) {
                    }
                    xdrVar.l(t1qVar3);
                    return Unit.a;
                }
                return r4;
            }
        }
        cidVar = new cid(this, cg6Var);
        obj = cidVar.m;
        r4 = nm6.a;
        i = cidVar.o;
        xdr xdrVar2 = this.k;
        if (i != 0) {
        }
        ordinal = ((zhd) obj).ordinal();
        if (ordinal != 0) {
        }
        g4d g4dVar2 = new g4d(18);
        htb htbVar2 = new htb(24);
        cidVar.j = null;
        cidVar.k = t1qVar;
        cidVar.l = i2;
        cidVar.o = 2;
        obj = xp3.j0(unlVar2, this.j, g4dVar2, htbVar2, cidVar);
        if (obj != r4) {
        }
        return r4;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(13:(2:3|(17:5|6|7|8|(1:(1:(1:(2:20|21)(1:(2:15|16)(2:18|19)))(5:22|23|24|25|(1:28)(1:27)))(1:30))(3:52|(1:54)|28)|31|32|(2:34|(3:38|39|40))|41|(1:43)|44|45|46|(2:48|28)|24|25|(0)(0)))|31|32|(0)|41|(0)|44|45|46|(0)|24|25|(0)(0))|65|6|7|8|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0115, code lost:
    
        r0 = defpackage.zhd.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0117, code lost:
    
        r1 = defpackage.l8j.c;
        r3 = new defpackage.g68(r16, r4, 28);
        r6.j = null;
        r6.k = null;
        r6.l = null;
        r6.m = r0;
        r6.p = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012e, code lost:
    
        if (defpackage.x97.V(r1, r3, r6) == r7) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0131, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x006b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0132, code lost:
    
        r0 = defpackage.l8j.c;
        r3 = new defpackage.g68(r16, r4, 28);
        r6.j = null;
        r6.k = null;
        r6.l = null;
        r6.m = r0;
        r6.p = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0149, code lost:
    
        if (defpackage.x97.V(r0, r3, r6) == r7) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1 A[Catch: all -> 0x00bd, TryCatch #2 {all -> 0x00bd, blocks: (B:32:0x009d, B:34:0x00a1, B:36:0x00af, B:38:0x00b7, B:41:0x00c0, B:43:0x00c4, B:44:0x00d0), top: B:31:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4 A[Catch: all -> 0x00bd, TryCatch #2 {all -> 0x00bd, blocks: (B:32:0x009d, B:34:0x00a1, B:36:0x00af, B:38:0x00b7, B:41:0x00c0, B:43:0x00c4, B:44:0x00d0), top: B:31:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum d(List list, qhd qhdVar, cg6 cg6Var) {
        did didVar;
        did didVar2;
        Object obj;
        nm6 nm6Var;
        int i;
        List list2;
        qqi qqiVar;
        qhd qhdVar2;
        yhd yhdVar;
        yhd yhdVar2;
        try {
            if (cg6Var instanceof did) {
                didVar = (did) cg6Var;
                int i2 = didVar.p;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    didVar.p = i2 - Integer.MIN_VALUE;
                    didVar2 = didVar;
                    obj = didVar2.n;
                    nm6Var = nm6.a;
                    i = didVar2.p;
                    Continuation continuation = null;
                    if (i != 0) {
                        qgg.h0(obj);
                        didVar2.j = list;
                        didVar2.k = qhdVar;
                        qqi qqiVar2 = this.h;
                        didVar2.l = qqiVar2;
                        didVar2.p = 1;
                        if (qqiVar2.a(didVar2) != nm6Var) {
                            list2 = list;
                            qqiVar = qqiVar2;
                            qhdVar2 = qhdVar;
                        }
                    }
                    if (i != 1) {
                        if (i == 2) {
                            List list3 = didVar2.j;
                            qgg.h0(obj);
                            zhd zhdVar = (zhd) obj;
                            l8j l8jVar = l8j.c;
                            g68 g68Var = new g68(this, continuation, 28);
                            didVar2.j = null;
                            didVar2.k = null;
                            didVar2.l = null;
                            didVar2.m = zhdVar;
                            didVar2.p = 3;
                            return x97.V(l8jVar, g68Var, didVar2) == nm6Var ? nm6Var : zhdVar;
                        }
                        if (i == 3 || i == 4) {
                            zhd zhdVar2 = (zhd) didVar2.m;
                            List list4 = didVar2.j;
                            qgg.h0(obj);
                            return zhdVar2;
                        }
                        if (i != 5) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th = (Throwable) didVar2.m;
                        List list5 = didVar2.j;
                        qgg.h0(obj);
                        throw th;
                    }
                    qqi qqiVar3 = didVar2.l;
                    qhd qhdVar3 = didVar2.k;
                    List list6 = didVar2.j;
                    qgg.h0(obj);
                    qqiVar = qqiVar3;
                    qhdVar2 = qhdVar3;
                    list2 = list6;
                    yhdVar = this.i;
                    if (yhdVar != null) {
                        list2.getClass();
                        qhdVar2.getClass();
                        if (Intrinsics.d(yhdVar.a, list2) && qhdVar2.a(yhdVar.b)) {
                            return zhd.c;
                        }
                    }
                    yhdVar2 = this.i;
                    if (yhdVar2 != null) {
                        yhdVar2.c.u(new GlagolQueueTracksInfoAppender$RefreshJobCancellationException("replaced"));
                    }
                    ou7 p = x97.p(this.a, null, pm6.b, new d57(qhdVar2, this, list2, continuation, 19), 1);
                    this.i = new yhd(list2, qhdVar2, p);
                    didVar2.j = null;
                    didVar2.k = null;
                    didVar2.l = null;
                    didVar2.p = 2;
                    obj = p.s(didVar2);
                    if (obj == nm6Var) {
                    }
                    zhd zhdVar3 = (zhd) obj;
                    l8j l8jVar2 = l8j.c;
                    g68 g68Var2 = new g68(this, continuation, 28);
                    didVar2.j = null;
                    didVar2.k = null;
                    didVar2.l = null;
                    didVar2.m = zhdVar3;
                    didVar2.p = 3;
                    if (x97.V(l8jVar2, g68Var2, didVar2) == nm6Var) {
                    }
                }
            }
            yhdVar = this.i;
            if (yhdVar != null) {
            }
            yhdVar2 = this.i;
            if (yhdVar2 != null) {
            }
            ou7 p2 = x97.p(this.a, null, pm6.b, new d57(qhdVar2, this, list2, continuation, 19), 1);
            this.i = new yhd(list2, qhdVar2, p2);
            didVar2.j = null;
            didVar2.k = null;
            didVar2.l = null;
            didVar2.p = 2;
            obj = p2.s(didVar2);
            if (obj == nm6Var) {
            }
            zhd zhdVar32 = (zhd) obj;
            l8j l8jVar22 = l8j.c;
            g68 g68Var22 = new g68(this, continuation, 28);
            didVar2.j = null;
            didVar2.k = null;
            didVar2.l = null;
            didVar2.m = zhdVar32;
            didVar2.p = 3;
            if (x97.V(l8jVar22, g68Var22, didVar2) == nm6Var) {
            }
        } finally {
            qqiVar.b(null);
        }
        didVar = new did(this, cg6Var);
        didVar2 = didVar;
        obj = didVar2.n;
        nm6Var = nm6.a;
        i = didVar2.p;
        Continuation continuation2 = null;
        if (i != 0) {
        }
    }
}
