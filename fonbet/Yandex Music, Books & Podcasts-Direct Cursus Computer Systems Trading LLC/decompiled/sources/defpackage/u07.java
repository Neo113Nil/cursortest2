package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.o;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lu07;", "Landroidx/fragment/app/o;", "<init>", "()V", "n07", "divkit_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class u07 extends o {
    public boolean A;
    public b17 g;
    public k17 h;
    public l07 i;
    public lom j;
    public gc8 l;
    public n07 m;
    public xdh n;
    public bf o;
    public dt8 p;
    public g0c q;
    public sdk r;
    public gs4 s;
    public osh t;
    public p13 u;
    public nw3 v;
    public ahu x;
    public final ybf y;
    public boolean z;
    public final jyr k = btf.b(new p07(this, 0));
    public final jyr w = btf.b(new p07(this, 1));

    public u07() {
        p07 p07Var = new p07(this, 5);
        arf a = btf.a(bwf.c, new rs6(6, new p07(this, 4)));
        this.y = new ybf(ern.a(z07.class), new sy6(a, 2), p07Var, new sy6(a, 3));
    }

    public static final void x(u07 u07Var, rx3 rx3Var) {
        ow3 ow3Var;
        boolean z = rx3Var instanceof ox3;
        ((View) u07Var.y().b).setVisibility(z ? 0 : 8);
        if (rx3Var instanceof nx3) {
            gc8 gc8Var = u07Var.l;
            if (gc8Var != null) {
                gc8Var.N("card_input_screen_button_state", "number");
            }
            gc8 gc8Var2 = u07Var.l;
            if (gc8Var2 != null) {
                gc8Var2.N("card_input_screen_anim_div_state", "gone");
                return;
            }
            return;
        }
        if (z) {
            k17 k17Var = u07Var.h;
            if (k17Var != null) {
                k17Var.clearFocus();
            }
            l07 l07Var = u07Var.i;
            if (l07Var != null) {
                l07Var.G();
            }
            b17 b17Var = u07Var.g;
            if (b17Var != null) {
                j6e j6eVar = b17Var.q;
                ((b17) j6eVar.a).setVisibility(0);
                ((View) j6eVar.b).startAnimation(b17Var.r);
            }
            k17 k17Var2 = u07Var.h;
            if (k17Var2 != null) {
                k17Var2.setAlpha(0.5f);
            }
            gc8 gc8Var3 = u07Var.l;
            if (gc8Var3 != null) {
                gc8Var3.N("card_input_screen_button_state", "loading");
            }
            gc8 gc8Var4 = u07Var.l;
            if (gc8Var4 != null) {
                gc8Var4.N("card_input_screen_anim_div_state", "visible");
                return;
            }
            return;
        }
        if (rx3Var instanceof px3) {
            l07 l07Var2 = u07Var.i;
            if (l07Var2 != null) {
                l07Var2.F(((px3) rx3Var).a);
            }
            lom lomVar = u07Var.j;
            if (lomVar != null) {
                lomVar.d();
            }
            lom lomVar2 = u07Var.j;
            if (lomVar2 != null) {
                fg3 fg3Var = ((px3) rx3Var).a;
                fg3Var.getClass();
                PreselectActivity preselectActivity = lomVar2.a;
                if (preselectActivity.s && preselectActivity.t) {
                    lomVar2.l(true, new uds(R.string.paymentsdk_loading_title));
                    hw3 hw3Var = new hw3(fg3Var.a);
                    ix3 ix3Var = ix3.m;
                    dm2 dm2Var = dm2.a;
                    lomVar2.f(new qdp(new ffk(hw3Var, ix3Var, "")));
                    return;
                }
                return;
            }
            return;
        }
        if (!(rx3Var instanceof mx3)) {
            if (rx3Var instanceof qx3) {
                p13 p13Var = u07Var.u;
                if (!qdq.C(p13Var != null ? Boolean.valueOf(p13Var.z()) : null)) {
                    b6e.l(rx3Var, "Illegal model state ");
                    return;
                }
                lom lomVar3 = u07Var.j;
                if (lomVar3 != null) {
                    lomVar3.d();
                }
                l07 l07Var3 = u07Var.i;
                if (l07Var3 != null) {
                    l07Var3.t();
                }
                l07 l07Var4 = u07Var.i;
                if (l07Var4 != null) {
                    l07Var4.L(qdq.D(Integer.valueOf(R.string.paymentsdk_success_title)));
                    return;
                }
                return;
            }
            return;
        }
        bfk bfkVar = ((mx3) rx3Var).a;
        if (bfkVar.f != yek.e) {
            l07 l07Var5 = u07Var.i;
            if (l07Var5 != null) {
                l07Var5.t();
            }
            lom lomVar4 = u07Var.j;
            if (lomVar4 != null) {
                lomVar4.d();
            }
            p13 p13Var2 = u07Var.u;
            boolean B = qdq.B(p13Var2 != null ? Boolean.valueOf(p13Var2.z()) : null);
            l07 l07Var6 = u07Var.i;
            if (B) {
                if (l07Var6 != null) {
                    l07Var6.B(bfkVar);
                    return;
                }
                return;
            } else {
                if (l07Var6 != null) {
                    l07Var6.g(bfkVar);
                    return;
                }
                return;
            }
        }
        String str = bfkVar.e;
        str.getClass();
        g0c z2 = u07Var.z();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Показ нетерминальной ошибки", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        ((x60) z2).a(su4.j(k, "event_name", "non_terminal_error_shown", "non_terminal_error_shown", k));
        b17 b17Var2 = u07Var.g;
        if (b17Var2 != null) {
            ((b17) b17Var2.q.a).setVisibility(8);
            TranslateAnimation translateAnimation = b17Var2.r;
            translateAnimation.cancel();
            translateAnimation.reset();
        }
        k17 k17Var3 = u07Var.h;
        if (k17Var3 != null) {
            k17Var3.setAlpha(1.0f);
        }
        gc8 gc8Var5 = u07Var.l;
        if (gc8Var5 != null) {
            gc8Var5.N("card_input_screen_anim_div_state", "gone");
        }
        gc8 gc8Var6 = u07Var.l;
        if (gc8Var6 != null) {
            gc8Var6.N("card_input_screen_button_state", "continue");
        }
        osh oshVar = u07Var.t;
        if (oshVar != null && (ow3Var = (ow3) oshVar.b) != null) {
            ow3Var.a();
        }
        gc8 gc8Var7 = u07Var.l;
        if (gc8Var7 != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            gc8Var7.N("card_input_screen_error_state", lowerCase);
        }
        k17 k17Var4 = u07Var.h;
        if (k17Var4 != null) {
            k17Var4.requestFocus();
        }
    }

    public final z07 A() {
        return (z07) this.y.getValue();
    }

    public final b6j B() {
        z07 A = A();
        jzi jziVar = new jzi(A);
        b6j b6jVar = A.A;
        if (b6jVar != null) {
            return b6jVar;
        }
        b6j b6jVar2 = new b6j(jziVar);
        A.A = b6jVar2;
        return b6jVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String D(jw3 jw3Var) {
        boolean z;
        int ordinal;
        a17 a17Var = this.i;
        if (a17Var == null) {
            a17Var = this.j;
        }
        boolean z2 = false;
        if (a17Var != null) {
            nw3 nw3Var = this.v;
            int i = nw3Var == null ? -1 : o07.a[nw3Var.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    z = a17Var.m();
                } else {
                    if (i != 2) {
                        b6e.s();
                        return null;
                    }
                    z = a17Var.c();
                }
                if (A().v == ix3.h && z) {
                    z2 = true;
                }
                ordinal = jw3Var.ordinal();
                if (ordinal != 0) {
                    return "number";
                }
                if (ordinal == 1) {
                    return "continue";
                }
                if (ordinal == 2) {
                    return z2 ? PListParser.TAG_DATE : "date_cvv";
                }
                if (ordinal != 3) {
                    b6e.s();
                    return null;
                }
                p13 p13Var = this.u;
                o13 o13Var = p13Var instanceof o13 ? (o13) p13Var : null;
                return qdq.B(o13Var != null ? Boolean.valueOf(o13Var.d) : null) ? "pay" : "continue";
            }
        }
        z = false;
        if (A().v == ix3.h) {
            z2 = true;
        }
        ordinal = jw3Var.ordinal();
        if (ordinal != 0) {
        }
    }

    @Override // androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        requireArguments.getClass();
        p13 p13Var = (p13) requireArguments.getParcelable("ARG_BIND_TYPE");
        this.u = p13Var;
        if (p13Var != null) {
            this.A = p13Var.B();
            p13Var.x();
        }
        p13 p13Var2 = this.u;
        this.v = p13Var2 instanceof n13 ? nw3.a : p13Var2 instanceof m13 ? nw3.b : p13Var2 instanceof o13 ? ((o13) p13Var2).d ? nw3.b : nw3.a : null;
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        a17 a17Var = this.i;
        if (a17Var == null) {
            a17Var = this.j;
        }
        if (a17Var != null) {
            s79 s79Var = (s79) a17Var.b(this, s79.class);
            requireActivity().getClass();
            requireActivity().getApplicationContext().getClass();
            requireActivity().getApplication().getClass();
            e88 j = a17Var.j();
            sdk C = a17Var.C();
            a17Var.M();
            C.getClass();
            s77 s77Var = (s77) s79Var;
            g0c g0cVar = s77Var.g;
            bf a = s77Var.a();
            a4g.s(a);
            this.o = a;
            dt8 c = s77Var.c();
            a4g.s(c);
            this.p = c;
            a4g.s(s77Var.d());
            this.q = g0cVar;
            this.r = C;
            br1 br1Var = new br1(s77Var.b());
            tc1 f = s77Var.f();
            sfg sfgVar = new sfg(new xiu(s77Var.e(), g0cVar), g0cVar);
            dq7 dq7Var = ca8.a;
            mn7 mn7Var = mn7.d;
            mn7Var.getClass();
            gs4 gs4Var = new gs4();
            gs4Var.a = br1Var;
            gs4Var.b = f;
            gs4Var.c = j;
            gs4Var.d = sfgVar;
            gs4Var.e = mn7Var;
            this.s = gs4Var;
            ahu ahuVar = (ahu) s77Var.v.get();
            a4g.s(ahuVar);
            this.x = ahuVar;
        }
        Continuation continuation = null;
        if (this.A) {
            getLifecycle().a(B());
            b6j B = B();
            if (!B.e) {
                B.e = true;
                NfcAdapter nfcAdapter = B.f;
                if (nfcAdapter != null) {
                    nfcAdapter.enableReaderMode(B.d, B.k, 131, cxb.J());
                }
            }
            x97.y(wyf.F(getLifecycle()), ca8.a, null, new r07(this, continuation, 3), 2);
        }
        View inflate = layoutInflater.inflate(R.layout.paymentsdk_dk_bind_card_fragment, viewGroup, false);
        int i = R.id.blockView;
        View v = dag.v(R.id.blockView, inflate);
        if (v != null) {
            i = R.id.contentView;
            FrameLayout frameLayout = (FrameLayout) dag.v(R.id.contentView, inflate);
            if (frameLayout != null) {
                i = R.id.progressbar;
                LinearLayout linearLayout = (LinearLayout) dag.v(R.id.progressbar, inflate);
                if (linearLayout != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    this.n = new xdh(constraintLayout, v, frameLayout, linearLayout);
                    constraintLayout.getClass();
                    return constraintLayout;
                }
            }
        }
        jj4.j("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.o
    public final void onDestroyView() {
        super.onDestroyView();
        osh oshVar = this.t;
        if (oshVar == null) {
            return;
        }
        oshVar.V(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [lom] */
    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        gc8 gc8Var;
        mgk mgkVar;
        ow3 ow3Var;
        view.getClass();
        super.onViewCreated(view, bundle);
        Resources.Theme theme = requireContext().getTheme();
        theme.getClass();
        int i = 1;
        boolean E = bfg.E(theme, R.attr.paymentsdk_is_light_theme, true);
        int i2 = 0;
        ((vb8) this.w.getValue()).b.h().f(new axt("isLightTheme", E));
        l07 l07Var = this.u instanceof o13 ? this.j : this.i;
        ConstraintLayout constraintLayout = (ConstraintLayout) y().a;
        constraintLayout.getClass();
        this.m = new n07(constraintLayout);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) y().a;
        n07 n07Var = this.m;
        if (n07Var == null) {
            Intrinsics.j("layoutChangeListener");
            throw null;
        }
        constraintLayout2.addOnLayoutChangeListener(n07Var);
        int i3 = 2;
        A().x = new p07(this, i3);
        int i4 = 7;
        if (l07Var != null) {
            p13 p13Var = this.u;
            boolean m = p13Var instanceof n13 ? l07Var.m() : p13Var instanceof m13 ? l07Var.c() : false;
            k17 k17Var = new k17(new ContextThemeWrapper(getContext(), l07Var.o()), null, 0, 6, null);
            nw3 nw3Var = this.v;
            if (nw3Var == null) {
                xq0.q("Required value was null.");
                return;
            }
            xx3 I = l07Var.I();
            g0c z = z();
            boolean M = l07Var.M();
            I.getClass();
            k17Var.d = z;
            k17Var.c = nw3Var;
            j17 j17Var = new j17(k17Var.a, zsd.D(I), M, m);
            k17Var.b = j17Var;
            ww3 ww3Var = new ww3(z, nw3Var, 1);
            j17Var.d.setInputEventListener(new i17(ww3Var, 0));
            j17Var.e.setInputEventListener(new i17(ww3Var, 1));
            j17Var.f.setInputEventListener(new i17(ww3Var, 2));
            j17Var.n = ww3Var;
            kl3 kl3Var = kl3.SCANNER_BUTTON;
            ww3Var.invoke(new fne());
            k17Var.setPaymentApi(l07Var.C());
            nw3 nw3Var2 = this.v;
            if (nw3Var2 == null) {
                xq0.q("Required value was null.");
                return;
            }
            osh oshVar = new osh(nw3Var2);
            this.t = oshVar;
            oshVar.V(k17Var);
            osh oshVar2 = this.t;
            if (oshVar2 != null && (ow3Var = (ow3) oshVar2.b) != null) {
                ow3Var.setSaveCardOnPayment(true);
            }
            k17Var.setSaveCardOnPayment(true);
            k17Var.setHelpCallback(new sv4(i4, l07Var, this));
            k17Var.setCardPaymentSystemListener(new s07(this, 9));
            k17Var.setMaskedCardNumberListener(new s07(this, 10));
            k17Var.setOnStateChangeListener(gx3.y0);
            k17Var.setFragmentOnStateChangeListener(new t07(this, k17Var));
            k17Var.setInputErrorListener(new s07(this, 11));
            if (bundle == null) {
                k17Var.j();
            }
            this.h = k17Var;
            ahu ahuVar = this.x;
            if (ahuVar == null) {
                Intrinsics.j("viewReadyObservable");
                throw null;
            }
            ahuVar.a = new t07(k17Var, this);
            z07 A = A();
            p13 p13Var2 = this.u;
            hek N = l07Var.N();
            k17 k17Var2 = this.h;
            if (k17Var2 == null) {
                xq0.q("Required value was null.");
                return;
            }
            mgk u = l07Var.u();
            N.getClass();
            A.q.m(Boolean.TRUE);
            if (p13Var2 instanceof n13) {
                String str = ((n13) p13Var2).a;
                A.F = false;
                if (str == null || StringsKt.U(str)) {
                    A.J(E, false, false, false);
                    A.p = false;
                    z03 G = A.G();
                    xzi xziVar = new xzi(A);
                    G.getClass();
                    G.h = xziVar;
                    z03 G2 = A.G();
                    G2.getClass();
                    G2.a(k17Var2, new efo(10, G2), new sld(12, G2), new ix6(11, G2));
                    N.a = (lw3) A.G().b;
                    if (N.b != null) {
                        N.b = null;
                    }
                } else {
                    A.p = true;
                    N.a = new lw3(i3, A);
                    if (N.b != null) {
                        N.b = null;
                    }
                    A.C.l(ox3.a);
                    A.D.l(kv3.a);
                    ((tdk) A.m).h.e(new hw3(str), new ozw(22, A));
                }
            } else if (p13Var2 instanceof m13) {
                if (u == null) {
                    xq0.q("Required value was null.");
                    return;
                }
                m13 m13Var = (m13) p13Var2;
                boolean z2 = m13Var.c;
                boolean z3 = m13Var.d;
                A.F = true;
                A.H().i = false;
                A.J(E, true, z2, z3);
                A.H().i = true;
                j3j H = A.H();
                qxp qxpVar = new qxp(u);
                H.getClass();
                H.j = qxpVar;
                j3j H2 = A.H();
                H2.getClass();
                H2.a(k17Var2, new awc(H2), new mka(H2), new n7b(H2));
                N.a = (lw3) A.H().b;
                if (N.b != null) {
                    N.b = null;
                }
            } else if (p13Var2 instanceof o13) {
                o13 o13Var = (o13) p13Var2;
                boolean z4 = o13Var.d;
                boolean z5 = o13Var.c;
                A.F = z4;
                A.G = z4;
                A.J(E, z4, z5, z4);
                N.a = new x07(A, k17Var2);
                if (N.b != null) {
                    N.b = null;
                    l07Var.w();
                }
            }
            l07Var.w();
        }
        z07 A2 = A();
        int i5 = 3;
        p07 p07Var = new p07(this, i5);
        s07 s07Var = new s07(this, 7);
        s07 s07Var2 = new s07(this, 8);
        A2.x = p07Var;
        A2.y = s07Var;
        A2.z = s07Var2;
        Continuation continuation = null;
        x97.y(wyf.F(getLifecycle()), null, null, new r07(this, continuation, i3), 3);
        int i6 = 5;
        x97.y(wyf.F(getLifecycle()), null, null, new bv6(this, continuation, i6), 3);
        z07 A3 = A();
        (!A3.F ? A3.p ? A3.C : A3.G().k : A3.H().k).f(getViewLifecycleOwner(), new uy6(1, new s07(this, i2)));
        A().q.f(getViewLifecycleOwner(), new uy6(1, new s07(this, i)));
        z07 A4 = A();
        (!A4.F ? A4.p ? A4.D : A4.G().l : A4.H().l).f(getViewLifecycleOwner(), new uy6(1, new s07(this, i3)));
        z07 A5 = A();
        (!A5.F ? A5.p ? A5.E : A5.G().m : A5.H().m).f(getViewLifecycleOwner(), new uy6(1, new s07(this, i5)));
        A().r.f(getViewLifecycleOwner(), new uy6(1, new s07(this, 4)));
        A().s.f(getViewLifecycleOwner(), new uy6(1, new s07(this, i6)));
        A().t.f(getViewLifecycleOwner(), new uy6(1, new s07(this, 6)));
        lom lomVar = this.j;
        if (lomVar != null) {
            sbp sbpVar = lomVar.a.C;
            wgk f = (sbpVar == null || (mgkVar = sbpVar.i) == null) ? null : mgkVar.f();
            if (f != null && (gc8Var = this.l) != null) {
                Context requireContext = requireContext();
                requireContext.getClass();
                gc8Var.N("card_input_screen_pay_button_text", irf.J(requireContext, f, z()));
            }
        }
        nw3 nw3Var3 = this.v;
        if (nw3Var3 != null) {
            ((x60) z()).a(gut.e0(qgg.I(nw3Var3)));
        }
        if (l07Var != null) {
            l07Var.H(false);
        }
    }

    public final xdh y() {
        xdh xdhVar = this.n;
        if (xdhVar != null) {
            return xdhVar;
        }
        xq0.q("Required value was null.");
        return null;
    }

    public final g0c z() {
        g0c g0cVar = this.q;
        if (g0cVar != null) {
            return g0cVar;
        }
        Intrinsics.j("eventReporter");
        throw null;
    }
}
