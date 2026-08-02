package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lb6p;", "Ljnb;", "<init>", "()V", "", "hintResId", "Lm6p;", "screen", "search-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class b6p extends jnb {
    public final jyr j;
    public final jyr k;
    public final jyr l;
    public x3n m;
    public boolean n;
    public c0p o;
    public n5p p;
    public final xdr q;
    public final ybf r;
    public final ybf s;
    public final ybf t;
    public final cvo u;
    public final jyr v;
    public final jyr w;
    public final ybf x;
    public final cjl y;
    public final suc z;

    public b6p() {
        l18 l18Var = l18.b;
        this.j = l18Var.b(hag.I(i0p.class), true);
        this.k = l18Var.b(hag.I(uln.class), true);
        this.l = l18Var.b(hag.I(q0h.class), true);
        this.q = ydr.a(Boolean.FALSE);
        this.r = new ybf(ern.a(p6p.class), new z5p(this, 0), new lvj(24, new r5p(this, 8)));
        this.s = new ybf(ern.a(j7i.class), new z5p(this, 1), new lvj(25, new r5p(this, 10)));
        this.t = new ybf(ern.a(e3p.class), new z5p(this, 2), new lvj(26, new r5p(this, 11)));
        this.u = new cvo(wjb.SearchScreen, hlb.Fullscreen, (glb) null, new dvo("Search"), (avo) null, 52);
        this.v = btf.b(new r5p(this, 12));
        this.w = btf.b(new r5p(this, 13));
        this.x = new ybf(ern.a(xqq.class), new z5p(this, 3), new lvj(27, new r5p(this, 14)));
        bdt I = hag.I(cjl.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.y = (cjl) qdcVar.C(I);
        this.z = new suc(this, new ruc("SearchScreenFragmentCompose", true));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object G(b6p b6pVar, c0p c0pVar, cg6 cg6Var) {
        x5p x5pVar;
        Object obj;
        int i;
        int i2;
        if (cg6Var instanceof x5p) {
            x5pVar = (x5p) cg6Var;
            int i3 = x5pVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                x5pVar.l = i3 - Integer.MIN_VALUE;
                obj = x5pVar.j;
                nm6 nm6Var = nm6.a;
                i = x5pVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    int ordinal = c0pVar.ordinal();
                    if (ordinal == 0) {
                        i2 = R.string.context_search_hint_kids;
                    } else if (ordinal == 1) {
                        i2 = R.string.context_search_hint_podcast;
                    } else if (ordinal == 2) {
                        i2 = R.string.context_search_hint_my_music;
                    } else if (ordinal == 3) {
                        b6pVar.I().getClass();
                        if (i0p.a()) {
                            frt frtVar = (frt) b6pVar.I().a.getValue();
                            frtVar.getClass();
                            h0m h0mVar = new h0m(frtVar.j(), 16);
                            x5pVar.l = 1;
                            obj = zsd.g0(h0mVar, x5pVar);
                            if (obj == nm6Var) {
                                return nm6Var;
                            }
                        }
                        b6pVar.I().getClass();
                        i2 = i0p.b() ? R.string.context_search_hint_all_with_clips : R.string.context_search_hint_all;
                    } else {
                        if (ordinal != 4) {
                            b6e.s();
                            return null;
                        }
                        i2 = R.string.context_search_hint_concert;
                    }
                    return new Integer(i2);
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                if (((Boolean) obj).booleanValue()) {
                    i2 = R.string.context_search_hint_query_to_vibe;
                    return new Integer(i2);
                }
                b6pVar.I().getClass();
                if (i0p.b()) {
                }
                return new Integer(i2);
            }
        }
        x5pVar = new x5p(b6pVar, cg6Var);
        obj = x5pVar.j;
        nm6 nm6Var2 = nm6.a;
        i = x5pVar.l;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        b6pVar.I().getClass();
        if (i0p.b()) {
        }
        return new Integer(i2);
    }

    public final void A(int i, hq5 hq5Var) {
        kjn kjnVar = gq5.a;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(616436731);
        int i2 = (oq5Var.h(this) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            i0p I = I();
            t requireActivity = requireActivity();
            requireActivity.getClass();
            y childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            kxi d = d();
            I.getClass();
            l13 l13Var = I.i;
            x3n x3nVar = new x3n(requireActivity, childFragmentManager, d, (t3g) l13Var.a.D(hag.I(t3g.class), l13Var, l13Var.b));
            e3p e3pVar = (e3p) this.t.getValue();
            kxi d2 = d();
            qwu qwuVar = I().d;
            k6l k6lVar = I().e;
            uwu uwuVar = I().f;
            fdj fdjVar = I().g;
            i0p I2 = I();
            t requireActivity2 = requireActivity();
            requireActivity2.getClass();
            I2.getClass();
            g8c g8cVar = new g8c(requireActivity2);
            y childFragmentManager2 = getChildFragmentManager();
            childFragmentManager2.getClass();
            q0h q0hVar = (q0h) this.l.getValue();
            l18 l18Var = l18.b;
            bdt I3 = hag.I(x0h.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            s2p s2pVar = new s2p(x3nVar, e3pVar, d2, qwuVar, k6lVar, uwuVar, fdjVar, g8cVar, childFragmentManager2, q0hVar, (x0h) qdcVar.C(I3), this.u, x(), I().b);
            c0p c0pVar = this.o;
            if (c0pVar == null) {
                Intrinsics.j("argSearchContext");
                throw null;
            }
            tmb x = x();
            boolean h = oq5Var.h(this);
            Object K = oq5Var.K();
            if (h || K == kjnVar) {
                K = new r5p(this, 6);
                oq5Var.k0(K);
            }
            Function0 function0 = (Function0) K;
            boolean h2 = oq5Var.h(this);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                K2 = new r5p(this, 7);
                oq5Var.k0(K2);
            }
            a4g.h(c0pVar, s2pVar, x, function0, null, (Function0) K2, oq5Var, RemoteCameraConfig.Mic.BUFFER_SIZE);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s5p(this, i, 4);
        }
    }

    public final void B(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(990735546);
        int i2 = (oq5Var.h(this) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                y childFragmentManager = getChildFragmentManager();
                childFragmentManager.getClass();
                t requireActivity = requireActivity();
                requireActivity.getClass();
                t requireActivity2 = requireActivity();
                requireActivity2.getClass();
                qnq qnqVar = new qnq(childFragmentManager, requireActivity, wyf.F(requireActivity2.getLifecycle()), d(), 48);
                oq5Var.k0(qnqVar);
                K = qnqVar;
            }
            qnq qnqVar2 = (qnq) K;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new r6p(qnqVar2, (xqq) this.x.getValue());
                oq5Var.k0(K2);
            }
            r6p r6pVar = (r6p) K2;
            c3r c3rVar = (c3r) oq5Var.j(es5.p);
            Object K3 = oq5Var.K();
            if (K3 == kjnVar) {
                K3 = new i1r();
                oq5Var.k0(K3);
            }
            i1r i1rVar = (i1r) K3;
            etn.l(ppg.a.a(i1rVar), ild.C(717475834, new pli(this, r6pVar, qnqVar2, c3rVar, i1rVar, 16), oq5Var), oq5Var, 56);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s5p(this, i, 5);
        }
    }

    public final void D(int i, hq5 hq5Var) {
        l6p l6pVar;
        x0q x0qVar;
        h9f h9fVar;
        h9f h9fVar2;
        kjn kjnVar = gq5.a;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1712710745);
        int i2 = (oq5Var.h(this) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            Unit unit = Unit.a;
            boolean h = oq5Var.h(this);
            Object K = oq5Var.K();
            if (h || K == kjnVar) {
                K = new u5p(this, null, 0);
                oq5Var.k0(K);
            }
            gld.w(oq5Var, unit, (Function2) K);
            l6p l6pVar2 = (l6p) gld.M(H().B, oq5Var).getValue();
            x0q x0qVar2 = H().I;
            j7i H = H();
            boolean f = oq5Var.f(H);
            Object K2 = oq5Var.K();
            if (f || K2 == kjnVar) {
                bml bmlVar = new bml(1, H, j7i.class, "onFilterClick", "onFilterClick(Lcom/yandex/music/screen/search/domain/SearchFilter;)V", 0, 23);
                oq5Var.k0(bmlVar);
                K2 = bmlVar;
            }
            h9f h9fVar3 = (h9f) K2;
            j7i H2 = H();
            boolean f2 = oq5Var.f(H2);
            Object K3 = oq5Var.K();
            if (f2 || K3 == kjnVar) {
                bml bmlVar2 = new bml(1, H2, j7i.class, "onMisspellClick", "onMisspellClick(Lcom/yandex/music/screen/search/domain/OnlineSearchResult$Misspell;)V", 0, 24);
                oq5Var.k0(bmlVar2);
                K3 = bmlVar2;
            }
            h9f h9fVar4 = (h9f) K3;
            tmb x = x();
            Object K4 = oq5Var.K();
            if (K4 == kjnVar) {
                i0p I = I();
                t requireActivity = requireActivity();
                requireActivity.getClass();
                I.getClass();
                mt5 mt5Var = new mt5(requireActivity);
                i0p I2 = I();
                t requireActivity2 = requireActivity();
                requireActivity2.getClass();
                I2.getClass();
                atn atnVar = new atn(3, requireActivity2, this);
                i0p I3 = I();
                t requireActivity3 = requireActivity();
                requireActivity3.getClass();
                I3.getClass();
                g8c g8cVar = new g8c(requireActivity3);
                i0p I4 = I();
                t requireActivity4 = requireActivity();
                requireActivity4.getClass();
                y childFragmentManager = getChildFragmentManager();
                childFragmentManager.getClass();
                kxi d = d();
                I4.getClass();
                l6pVar = l6pVar2;
                l13 l13Var = I4.i;
                x0qVar = x0qVar2;
                h9fVar = h9fVar4;
                h9fVar2 = h9fVar3;
                x3n x3nVar = new x3n(requireActivity4, childFragmentManager, d, (t3g) l13Var.a.D(hag.I(t3g.class), l13Var, l13Var.b));
                j7i H3 = H();
                l18 l18Var = l18.b;
                bdt I5 = hag.I(bbb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                n3m n3mVar = new n3m((bbb) qdcVar.C(I5), d(), atnVar, H().o, H().p);
                xdh xdhVar = H().p;
                nnd nndVar = H().o;
                I().getClass();
                bdt I6 = hag.I(byb.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                z0j z0jVar = new z0j(mt5Var, xdhVar, nndVar, ((q36) ((byb) qdcVar2.C(I6)).b(q36.class)).h());
                kxi d2 = d();
                qwu qwuVar = I().d;
                k6l k6lVar = I().e;
                uwu uwuVar = I().f;
                bdt I7 = hag.I(lkm.class);
                qdc qdcVar3 = l18Var.a;
                qdcVar3.getClass();
                lkm lkmVar = (lkm) qdcVar3.C(I7);
                jtc jtcVar = (jtc) H().p.c;
                tf6 e = gld.e(dm6.c);
                x3n x3nVar2 = new x3n();
                x3nVar2.a = lkmVar;
                x3nVar2.b = e;
                x3nVar2.c = jtcVar;
                fdj fdjVar = I().g;
                y childFragmentManager2 = getChildFragmentManager();
                childFragmentManager2.getClass();
                q0h q0hVar = (q0h) this.l.getValue();
                bdt I8 = hag.I(x0h.class);
                qdc qdcVar4 = l18Var.a;
                qdcVar4.getClass();
                j6i j6iVar = new j6i(x3nVar, H3, n3mVar, z0jVar, x3nVar2, d2, qwuVar, k6lVar, uwuVar, fdjVar, g8cVar, childFragmentManager2, q0hVar, (x0h) qdcVar4.C(I8), this.u, x(), I().b);
                oq5Var.k0(j6iVar);
                K4 = j6iVar;
            } else {
                l6pVar = l6pVar2;
                x0qVar = x0qVar2;
                h9fVar = h9fVar4;
                h9fVar2 = h9fVar3;
            }
            j6i j6iVar2 = (j6i) K4;
            I().getClass();
            boolean a = i0p.a();
            Function1 function1 = (Function1) h9fVar2;
            Function1 function12 = (Function1) h9fVar;
            boolean h2 = oq5Var.h(this);
            Object K5 = oq5Var.K();
            if (h2 || K5 == kjnVar) {
                K5 = new r5p(this, 4);
                oq5Var.k0(K5);
            }
            Function0 function0 = (Function0) K5;
            boolean h3 = oq5Var.h(this);
            Object K6 = oq5Var.K();
            if (h3 || K6 == kjnVar) {
                K6 = new r5p(this, 5);
                oq5Var.k0(K6);
            }
            p5p.b(l6pVar, x0qVar, function1, function12, j6iVar2, x, function0, a, null, (Function0) K6, oq5Var, SQLiteDatabase.OPEN_PRIVATECACHE);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s5p(this, i, 3);
        }
    }

    public final void E(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-260210429);
        int i2 = (oq5Var.h(this) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            boolean z = ((m6p) gld.M(K().q, oq5Var).getValue()) == m6p.b;
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, vci.a);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, 1.0f);
            kfh d = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, layoutWeightElement);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            if (z) {
                oq5Var.Z(-847642010);
                D(i2 & 14, oq5Var);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-847545879);
                c0p c0pVar = this.o;
                if (c0pVar == null) {
                    Intrinsics.j("argSearchContext");
                    throw null;
                }
                if (w5p.a[c0pVar.ordinal()] == 1) {
                    oq5Var.Z(-1412811466);
                    B(i2 & 14, oq5Var);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(-847422592);
                    A(i2 & 14, oq5Var);
                    rzf.j(((e3p) this.t.getValue()).n, null, oq5Var, 0, 2);
                    oq5Var.p(false);
                }
                oq5Var.p(false);
            }
            oq5Var.p(true);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s5p(this, i, 1);
        }
    }

    public final void F(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1334556863);
        int i2 = (oq5Var.h(this) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            pd.b(new qzm[0], false, ild.C(-1810595528, new s5p(this, 6), oq5Var), oq5Var, 0, 2);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s5p(this, i, 7);
        }
    }

    public final j7i H() {
        return (j7i) this.s.getValue();
    }

    public final i0p I() {
        return (i0p) this.j.getValue();
    }

    public final p6p K() {
        return (p6p) this.r.getValue();
    }

    public final void L() {
        View view = getView();
        if (view == null) {
            return;
        }
        Object systemService = view.getContext().getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public final void M() {
        cqi cqiVar = K().p.a;
        cqiVar.c.setValue(Boolean.FALSE);
        x3n x3nVar = this.m;
        if (x3nVar == null) {
            Intrinsics.j("recognitionAdapter");
            throw null;
        }
        gs4 gs4Var = (gs4) x3nVar.d;
        t requireActivity = ((b6p) gs4Var.a).requireActivity();
        requireActivity.getClass();
        if (etn.z(requireActivity, "android.permission.RECORD_AUDIO") == 0) {
            ((rln) gs4Var.b).invoke();
        } else {
            ((zh) gs4Var.e).a("android.permission.RECORD_AUDIO");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.jnb, androidx.fragment.app.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        boolean z;
        c0p c0pVar;
        qpj onBackPressedDispatcher;
        super.onCreate(bundle);
        bzf.v(this);
        y supportFragmentManager = requireActivity().getSupportFragmentManager();
        supportFragmentManager.getClass();
        uln ulnVar = (uln) this.k.getValue();
        pu0 t = pd.t(new qzm[0]);
        q5p q5pVar = new q5p(this, 0);
        r9n r9nVar = new r9n(0, this, b6p.class, "clearFocus", "clearFocus()V", 0, 26);
        vtm vtmVar = new vtm(this);
        supportFragmentManager.getClass();
        ulnVar.getClass();
        x3n x3nVar = new x3n();
        x3nVar.a = supportFragmentManager;
        x3nVar.b = ulnVar;
        x3nVar.c = t;
        rln rlnVar = new rln(0, x3nVar, q5pVar);
        b6n b6nVar = new b6n(14, r9nVar);
        gs4 gs4Var = new gs4();
        gs4Var.a = this;
        gs4Var.b = rlnVar;
        gs4Var.c = b6nVar;
        gs4Var.d = vtmVar;
        zh registerForActivityResult = registerForActivityResult(new vh(3), new gi(6, gs4Var));
        registerForActivityResult.getClass();
        gs4Var.e = registerForActivityResult;
        x3nVar.d = gs4Var;
        this.m = x3nVar;
        t l = l();
        if (l != null && (onBackPressedDispatcher = l.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.a(this, new g1e(3, this));
        }
        Bundle requireArguments = requireArguments();
        requireArguments.getClass();
        if (bundle == null) {
            boolean z2 = requireArguments.getBoolean("arg.startRecognition", false);
            requireArguments.remove("arg.startRecognition");
            if (z2) {
                z = true;
                this.n = requireArguments.getBoolean("arg.isNavigationRoot", false);
                c0pVar = (c0p) requireArguments.getSerializable("arg.searchContext");
                if (c0pVar == null) {
                    c0pVar = c0p.d;
                }
                this.o = c0pVar;
                this.p = (n5p) ((Parcelable) vwb.O(requireArguments, n5p.class, "arg.entitySearchType"));
                if (z) {
                    return;
                }
                M();
                return;
            }
        }
        z = false;
        this.n = requireArguments.getBoolean("arg.isNavigationRoot", false);
        c0pVar = (c0p) requireArguments.getSerializable("arg.searchContext");
        if (c0pVar == null) {
        }
        this.o = c0pVar;
        this.p = (n5p) ((Parcelable) vwb.O(requireArguments, n5p.class, "arg.entitySearchType"));
        if (z) {
        }
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(new wn5(new s5p(this, 2), -833858825, true));
        return composeView;
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        this.z.b();
        if (bundle == null) {
            Bundle requireArguments = requireArguments();
            requireArguments.getClass();
            Continuation continuation = null;
            String string = requireArguments.getString("arg.initialQuery", null);
            requireArguments.remove("arg.initialQuery");
            if (string != null && string.length() != 0) {
                j7i H = H();
                x97.y(ot0.F(H), null, null, new zig(H, string, continuation, 19), 3);
                ((grh) H().p.b).j = string;
                K().a(string);
            }
        }
        if (requireContext().getResources().getConfiguration().orientation == 2) {
            cqi cqiVar = K().p.a;
            cqiVar.c.setValue(Boolean.FALSE);
        }
        ox6.B(new p6o(this.y.b, 4), wyf.F(getLifecycle()), new t5p(this, 2));
        ox6.B(this.q, wyf.F(getLifecycle()), new t5p(this, 3));
    }

    @Override // defpackage.jnb
    /* renamed from: z, reason: from getter */
    public final cvo getU() {
        return this.u;
    }
}
