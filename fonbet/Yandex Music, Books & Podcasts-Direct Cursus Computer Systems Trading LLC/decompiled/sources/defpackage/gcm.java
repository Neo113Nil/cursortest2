package defpackage;

import android.content.Intent;
import com.yandex.passport.sloth.ui.dependencies.m;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.data.audio.WarningContent;

/* loaded from: classes3.dex */
public final class gcm extends bfu implements icj {
    public oq A;
    public final xdr B;
    public final vdr C;
    public final j0q D;
    public final j0q E;
    public final xdr F;
    public rar G;
    public final xdr H;
    public final fkn I;
    public final LinkedHashMap J;
    public boolean K;
    public final rbj k;
    public final tmb l;
    public final ie5 m;
    public final jyr n;
    public final jyr o;
    public final z66 p;
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

    public gcm(rbj rbjVar, tmb tmbVar, kxi kxiVar, Intent intent) {
        tmbVar.getClass();
        intent.getClass();
        this.k = rbjVar;
        this.l = tmbVar;
        cq4 F = ot0.F(this);
        ie5 ie5Var = new ie5(F, rbjVar, intent, kxiVar);
        this.m = ie5Var;
        l18 l18Var = l18.b;
        this.n = l18Var.b(hag.I(cej.class), true);
        this.o = l18Var.b(hag.I(k68.class), true);
        bdt I = hag.I(z66.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        z66 z66Var = (z66) qdcVar.C(I);
        this.p = z66Var;
        this.q = (jtc) ie5Var.m;
        this.r = (fkn) ie5Var.r;
        this.s = (xdr) ie5Var.b;
        this.t = (xdr) ie5Var.c;
        this.u = (vdr) ie5Var.s;
        this.v = (j0q) ie5Var.f;
        this.w = (j0q) ie5Var.g;
        this.x = (j0q) ie5Var.j;
        this.y = (j0q) ie5Var.h;
        this.z = asq.K(z66Var.e(), new fam(2));
        this.A = oq.J;
        xdr a = ydr.a(tbm.a);
        this.B = a;
        this.C = sk3.a0(ot0.F(this), jf0.z(a, new fam(3)));
        this.D = (j0q) ie5Var.e;
        this.E = (j0q) ie5Var.i;
        this.F = ydr.a(dcj.a);
        Boolean bool = Boolean.FALSE;
        xdr a2 = ydr.a(bool);
        this.H = a2;
        Continuation continuation = null;
        int i = 10;
        this.I = zsd.F0(new u21(i, (xdr) ie5Var.d, a2, new ib3(3, 10, continuation)), ot0.F(this), lbq.a, bool);
        this.J = new LinkedHashMap();
        J();
        String str = rbjVar.e;
        if (str != null) {
            x97.y(F, null, null, new ge5(ie5Var, str, continuation, 0), 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b9, code lost:
    
        if (r10 == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d9, code lost:
    
        if (r10 == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0068, code lost:
    
        if (r10 == r1) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object G(gcm gcmVar, cg6 cg6Var) {
        bcm bcmVar;
        int i;
        mt mtVar;
        hs5 n;
        String str;
        String str2;
        String str3;
        if (cg6Var instanceof bcm) {
            bcmVar = (bcm) cg6Var;
            int i2 = bcmVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bcmVar.m = i2 - Integer.MIN_VALUE;
                Object obj = bcmVar.k;
                Object obj2 = nm6.a;
                i = bcmVar.m;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    ie5 ie5Var = gcmVar.m;
                    String str4 = gcmVar.k.b;
                    bcmVar.m = 1;
                    jtc jtcVar = (jtc) ie5Var.m;
                    jtcVar.getClass();
                    obj = x97.V(dm6.b, new zbj(jtcVar, str4, continuation, 1), bcmVar);
                } else if (i == 1) {
                    qgg.h0(obj);
                } else if (i == 2) {
                    mtVar = bcmVar.j;
                    qgg.h0(obj);
                    a58 a58Var = (a58) obj;
                    if (a58Var != null && (str = a58Var.d) != null) {
                        str2 = (String) avf.Q(str);
                        bcmVar.j = null;
                        bcmVar.m = 4;
                        if (((a68) gcmVar.m.q).b(mtVar.a)) {
                        }
                        if (r9 == obj2) {
                        }
                    }
                    str2 = null;
                    bcmVar.j = null;
                    bcmVar.m = 4;
                    if (((a68) gcmVar.m.q).b(mtVar.a)) {
                    }
                    if (r9 == obj2) {
                    }
                } else {
                    if (i != 3) {
                        if (i == 4) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mtVar = bcmVar.j;
                    qgg.h0(obj);
                    a58 a58Var2 = (a58) obj;
                    if (a58Var2 != null && (str3 = a58Var2.d) != null) {
                        str2 = (String) avf.Q(str3);
                        bcmVar.j = null;
                        bcmVar.m = 4;
                        Object vbmVar = ((a68) gcmVar.m.q).b(mtVar.a) ? new vbm(mtVar.a.d, mtVar, str2) : gcmVar.M(mtVar, str2, bcmVar);
                        return vbmVar == obj2 ? obj2 : vbmVar;
                    }
                    str2 = null;
                    bcmVar.j = null;
                    bcmVar.m = 4;
                    if (((a68) gcmVar.m.q).b(mtVar.a)) {
                    }
                    if (vbmVar == obj2) {
                    }
                }
                mtVar = (mt) obj;
                if (mtVar != null) {
                    return sbm.a;
                }
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                if (((i4j) ((byb) qdcVar.C(I)).b(i4j.class)).h() && (n = lxe.n(mtVar.a.h())) != null) {
                    boolean g = gcmVar.p.g();
                    jyr jyrVar = gcmVar.o;
                    if (g) {
                        k68 k68Var = (k68) jyrVar.getValue();
                        bcmVar.j = mtVar;
                        bcmVar.m = 2;
                        obj = k68Var.b(n, bcmVar);
                    } else {
                        k68 k68Var2 = (k68) jyrVar.getValue();
                        bcmVar.j = mtVar;
                        bcmVar.m = 3;
                        obj = k68Var2.a(n, bcmVar);
                    }
                }
                str2 = null;
                bcmVar.j = null;
                bcmVar.m = 4;
                if (((a68) gcmVar.m.q).b(mtVar.a)) {
                }
                if (vbmVar == obj2) {
                }
            }
        }
        bcmVar = new bcm(gcmVar, cg6Var);
        Object obj3 = bcmVar.k;
        Object obj22 = nm6.a;
        i = bcmVar.m;
        Continuation continuation2 = null;
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
    public static final Object H(gcm gcmVar, oq oqVar, cg6 cg6Var) {
        dcm dcmVar;
        int i;
        xdr xdrVar;
        if (cg6Var instanceof dcm) {
            dcmVar = (dcm) cg6Var;
            int i2 = dcmVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dcmVar.m = i2 - Integer.MIN_VALUE;
                Object obj = dcmVar.k;
                nm6 nm6Var = nm6.a;
                i = dcmVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    xdr xdrVar2 = gcmVar.F;
                    ie5 ie5Var = gcmVar.m;
                    String str = oqVar.a;
                    dcmVar.j = xdrVar2;
                    dcmVar.m = 1;
                    Object b = ie5Var.b(str, dcmVar);
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
                    xdrVar = dcmVar.j;
                    qgg.h0(obj);
                }
                xdrVar.l(obj);
                return Unit.a;
            }
        }
        dcmVar = new dcm(gcmVar, cg6Var);
        Object obj2 = dcmVar.k;
        nm6 nm6Var2 = nm6.a;
        i = dcmVar.m;
        if (i != 0) {
        }
        xdrVar.l(obj2);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a6, code lost:
    
        if (r9 == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x005d, code lost:
    
        if (r9 == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(gcm gcmVar, cg6 cg6Var) {
        acm acmVar;
        int i;
        mt mtVar;
        hs5 n;
        String str;
        String str2;
        if (cg6Var instanceof acm) {
            acmVar = (acm) cg6Var;
            int i2 = acmVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                acmVar.m = i2 - Integer.MIN_VALUE;
                Object obj = acmVar.k;
                Object obj2 = nm6.a;
                i = acmVar.m;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    ie5 ie5Var = gcmVar.m;
                    String str3 = gcmVar.k.b;
                    acmVar.m = 1;
                    jtc jtcVar = (jtc) ie5Var.m;
                    jtcVar.getClass();
                    obj = x97.V(dm6.b, new zbj(jtcVar, str3, continuation, 0), acmVar);
                } else if (i == 1) {
                    qgg.h0(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mtVar = acmVar.j;
                    qgg.h0(obj);
                    a58 a58Var = (a58) obj;
                    if (a58Var != null && (str2 = a58Var.d) != null) {
                        str = (String) avf.Q(str2);
                        acmVar.j = null;
                        acmVar.m = 3;
                        Object vbmVar = ((a68) gcmVar.m.q).b(mtVar.a) ? new vbm(mtVar.a.d, mtVar, str) : gcmVar.M(mtVar, str, acmVar);
                        return vbmVar == obj2 ? obj2 : vbmVar;
                    }
                    str = null;
                    acmVar.j = null;
                    acmVar.m = 3;
                    if (((a68) gcmVar.m.q).b(mtVar.a)) {
                    }
                    if (vbmVar == obj2) {
                    }
                }
                mtVar = (mt) obj;
                if (mtVar != null) {
                    return sbm.a;
                }
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                if (((i4j) ((byb) qdcVar.C(I)).b(i4j.class)).h() && (n = lxe.n(mtVar.a.h())) != null) {
                    k68 k68Var = (k68) gcmVar.o.getValue();
                    acmVar.j = mtVar;
                    acmVar.m = 2;
                    obj = k68Var.a(n, acmVar);
                }
                str = null;
                acmVar.j = null;
                acmVar.m = 3;
                if (((a68) gcmVar.m.q).b(mtVar.a)) {
                }
                if (vbmVar == obj2) {
                }
            }
        }
        acmVar = new acm(gcmVar, cg6Var);
        Object obj3 = acmVar.k;
        Object obj22 = nm6.a;
        i = acmVar.m;
        Continuation continuation2 = null;
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
        xdr xdrVar = this.B;
        xdrVar.getClass();
        xdrVar.m(null, tbm.a);
        x97.y(ot0.F(this), null, null, new b5l(this, null, 22), 3);
    }

    public final void K(boolean z) {
        ybm ybmVar = (ybm) this.B.getValue();
        Continuation continuation = null;
        if (!z || !(ybmVar instanceof vbm)) {
            x97.y(ot0.F(this), null, null, new ecm(this, continuation, 0), 3);
            return;
        }
        vbm vbmVar = (vbm) ybmVar;
        mt mtVar = vbmVar.b;
        ((a68) this.m.q).a(mtVar.a);
        x97.y(ot0.F(this), null, null, new rfg(this, mtVar, vbmVar, continuation, 21), 3);
    }

    public final void L(nab nabVar, u0s u0sVar) {
        LinkedHashMap linkedHashMap = this.J;
        Boolean bool = (Boolean) linkedHashMap.get(nabVar);
        if (bool != null ? bool.booleanValue() : false) {
            return;
        }
        linkedHashMap.put(nabVar, Boolean.TRUE);
        rmb.h(this.l.a(nabVar, u0sVar), 0, 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object M(mt mtVar, String str, cg6 cg6Var) {
        fcm fcmVar;
        int i;
        mt mtVar2;
        oq oqVar;
        String str2;
        Iterator it;
        Object obj;
        String str3;
        LocalDate d;
        Object obj2;
        iqs iqsVar;
        if (cg6Var instanceof fcm) {
            fcmVar = (fcm) cg6Var;
            int i2 = fcmVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fcmVar.o = i2 - Integer.MIN_VALUE;
                Object obj3 = fcmVar.m;
                nm6 nm6Var = nm6.a;
                i = fcmVar.o;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj3);
                    oq oqVar2 = mtVar.a;
                    this.A = oqVar2;
                    rar rarVar = this.G;
                    if (rarVar != null) {
                        rarVar.g(null);
                    }
                    this.G = x97.y(ot0.F(this), null, null, new b5l(this, oqVar2, continuation, 24), 3);
                    if (!oqVar2.d) {
                        return new xbm(oqVar2, oqVar2.b);
                    }
                    jtc jtcVar = this.q;
                    fcmVar.j = mtVar;
                    fcmVar.k = str;
                    fcmVar.l = oqVar2;
                    fcmVar.o = 1;
                    Enum b = ((ms) jtcVar.a).a.b(oqVar2, fcmVar);
                    if (b == nm6Var) {
                        return nm6Var;
                    }
                    mtVar2 = mtVar;
                    oqVar = oqVar2;
                    obj3 = b;
                    str2 = str;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oqVar = fcmVar.l;
                    String str4 = fcmVar.k;
                    mt mtVar3 = fcmVar.j;
                    qgg.h0(obj3);
                    mtVar2 = mtVar3;
                    str2 = str4;
                }
                mq mqVar = (mq) obj3;
                mxs mxsVar = new mxs(mqVar, c3x.v(mqVar), oqVar);
                LinkedList linkedList = oqVar.F;
                List list = oqVar.v;
                ie5 ie5Var = this.m;
                yzk yzkVar = (yzk) ie5Var.l;
                yzkVar.getClass();
                xdr xdrVar = yzkVar.e;
                LinkedList linkedList2 = oqVar.F;
                PlaybackScope playbackScope = yzkVar.b;
                playbackScope.getClass();
                zyk zykVar = new zyk(oqVar, linkedList2, s3q.b[playbackScope.k().ordinal()] != 3 ? i3q.b : i3q.a);
                xdrVar.getClass();
                xdrVar.m(null, zykVar);
                m mVar = (m) ie5Var.n;
                eca ecaVar = eca.d;
                eca o = d51.o(oqVar);
                xdr xdrVar2 = (xdr) mVar.h;
                xdrVar2.getClass();
                xdrVar2.m(null, o);
                ((z3g) ie5Var.o).b(oqVar);
                String str5 = oqVar.f;
                String str6 = (str5 != null || StringsKt.U(str5)) ? null : str5;
                List list2 = list.isEmpty() ? list : null;
                String X = list2 == null ? CollectionsKt.X(list2, null, null, null, new fam(4), 31) : null;
                l18 l18Var = l18.b;
                bdt I = hag.I(skr.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                String a = ((skr) qdcVar.C(I)).a(R.plurals.non_music_screen_author, list.size());
                boolean z = oqVar.g != WarningContent.EXPLICIT;
                it = linkedList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    mqs mqsVar = (mqs) obj;
                    mqsVar.getClass();
                    itk itkVar = iqs.b;
                    String str7 = mqsVar.r;
                    itkVar.getClass();
                    if (str7 == null) {
                        iqsVar = iqs.c;
                    } else {
                        Iterator it2 = iqs.f.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it2.next();
                            if (((iqs) obj2).a.equals(str7)) {
                                break;
                            }
                        }
                        iqsVar = (iqs) obj2;
                        if (iqsVar == null) {
                            iqsVar = iqs.c;
                        }
                    }
                    if (iqsVar == iqs.d) {
                        break;
                    }
                }
                mqs mqsVar2 = (mqs) obj;
                ham hamVar = new ham(str6, X, a, z, mqsVar2 == null ? new saj(((cej) this.n.getValue()).a(mqsVar2, false), mqsVar2) : null, str2);
                List<mqs> q0 = CollectionsKt.q0(linkedList, 6);
                ArrayList arrayList = new ArrayList(v75.o(q0, 10));
                for (mqs mqsVar3 : q0) {
                    mqsVar3.getClass();
                    String j = mqsVar3.j();
                    boolean z2 = mqsVar3.d.g;
                    boolean z3 = mqsVar3.m == WarningContent.EXPLICIT;
                    jzb i3 = mqsVar3.i();
                    boolean o2 = mqsVar3.o();
                    Date date = mqsVar3.x;
                    arrayList.add(new fcj(new dej(j, z2, z3, i3, o2, (date == null || (d = gkg.d(date)) == null) ? null : new g0t(gkg.a(d), gkg.c(d)), true), mqsVar3));
                }
                mtVar2.getClass();
                oq oqVar3 = mtVar2.a;
                String str8 = oqVar3.b;
                str3 = oqVar3.e;
                if (str3 == null) {
                    str3 = "";
                }
                iab iabVar = new iab(str8, str3, ouj.t(oqVar3.o), ouj.t(oqVar3.s), null, jf0.u(mtVar2), oqVar3.t);
                L(new jab(qkb.Header, 1, 1, 1), null);
                return new wbm(mtVar2, iabVar, !this.k.f ? j0s.b : j0s.a, hamVar, new ghm(CollectionsKt.q0(arrayList, 5), arrayList.size() > 5), mxsVar);
            }
        }
        fcmVar = new fcm(this, cg6Var);
        Object obj32 = fcmVar.m;
        nm6 nm6Var2 = nm6.a;
        i = fcmVar.o;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        mq mqVar2 = (mq) obj32;
        mxs mxsVar2 = new mxs(mqVar2, c3x.v(mqVar2), oqVar);
        LinkedList linkedList3 = oqVar.F;
        List list3 = oqVar.v;
        ie5 ie5Var2 = this.m;
        yzk yzkVar2 = (yzk) ie5Var2.l;
        yzkVar2.getClass();
        xdr xdrVar3 = yzkVar2.e;
        LinkedList linkedList22 = oqVar.F;
        PlaybackScope playbackScope2 = yzkVar2.b;
        playbackScope2.getClass();
        zyk zykVar2 = new zyk(oqVar, linkedList22, s3q.b[playbackScope2.k().ordinal()] != 3 ? i3q.b : i3q.a);
        xdrVar3.getClass();
        xdrVar3.m(null, zykVar2);
        m mVar2 = (m) ie5Var2.n;
        eca ecaVar2 = eca.d;
        eca o3 = d51.o(oqVar);
        xdr xdrVar22 = (xdr) mVar2.h;
        xdrVar22.getClass();
        xdrVar22.m(null, o3);
        ((z3g) ie5Var2.o).b(oqVar);
        String str52 = oqVar.f;
        if (str52 != null) {
        }
        if (list3.isEmpty()) {
        }
        if (list2 == null) {
        }
        l18 l18Var2 = l18.b;
        bdt I2 = hag.I(skr.class);
        qdc qdcVar2 = l18Var2.a;
        qdcVar2.getClass();
        String a2 = ((skr) qdcVar2.C(I2)).a(R.plurals.non_music_screen_author, list3.size());
        if (oqVar.g != WarningContent.EXPLICIT) {
        }
        it = linkedList3.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        mqs mqsVar22 = (mqs) obj;
        ham hamVar2 = new ham(str6, X, a2, z, mqsVar22 == null ? new saj(((cej) this.n.getValue()).a(mqsVar22, false), mqsVar22) : null, str2);
        List<mqs> q02 = CollectionsKt.q0(linkedList3, 6);
        ArrayList arrayList2 = new ArrayList(v75.o(q02, 10));
        while (r1.hasNext()) {
        }
        mtVar2.getClass();
        oq oqVar32 = mtVar2.a;
        String str82 = oqVar32.b;
        str3 = oqVar32.e;
        if (str3 == null) {
        }
        iab iabVar2 = new iab(str82, str3, ouj.t(oqVar32.o), ouj.t(oqVar32.s), null, jf0.u(mtVar2), oqVar32.t);
        L(new jab(qkb.Header, 1, 1, 1), null);
        return new wbm(mtVar2, iabVar2, !this.k.f ? j0s.b : j0s.a, hamVar2, new ghm(CollectionsKt.q0(arrayList2, 5), arrayList2.size() > 5), mxsVar2);
    }

    @Override // defpackage.icj
    public final xdr c() {
        return this.s;
    }

    @Override // defpackage.icj
    public final void d() {
        ((z3g) this.m.o).c();
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
