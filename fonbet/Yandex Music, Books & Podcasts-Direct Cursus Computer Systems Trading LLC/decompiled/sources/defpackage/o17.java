package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.o;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo17;", "Landroidx/fragment/app/o;", "<init>", "()V", "divkit_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class o17 extends o {
    public sbp g;
    public final jyr h = btf.b(new m17(this, 0));
    public gc8 i;
    public h4b j;
    public bf k;
    public g0c l;
    public d27 m;
    public final ybf n;
    public dt8 o;
    public final jyr p;
    public ahu q;

    public o17() {
        m17 m17Var = new m17(this, 3);
        arf a = btf.a(bwf.c, new rs6(7, new m17(this, 2)));
        this.n = new ybf(ern.a(c27.class), new sy6(a, 4), m17Var, new sy6(a, 5));
        this.p = btf.b(new m17(this, 1));
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        sbp sbpVar = this.g;
        if (sbpVar == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        s79 s79Var = (s79) sbpVar.b(this, s79.class);
        requireActivity().getClass();
        requireActivity().getApplicationContext().getClass();
        requireActivity().getApplication().getClass();
        sbp sbpVar2 = this.g;
        if (sbpVar2 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        o6c o6cVar = new o6c(17);
        if (sbpVar2 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        sdk f = sbpVar2.b.f();
        f.getClass();
        s77 s77Var = (s77) s79Var;
        g0c g0cVar = s77Var.g;
        bf a = s77Var.a();
        a4g.s(a);
        this.k = a;
        this.l = g0cVar;
        this.m = new d27(new dn9(new br1(s77Var.b()), s77Var.f(), o6cVar, new sfg(new xiu(s77Var.e(), g0cVar), g0cVar)), g0cVar, o6cVar, f, 0);
        dt8 c = s77Var.c();
        a4g.s(c);
        this.o = c;
        a4g.s(s77Var.d());
        ahu ahuVar = (ahu) s77Var.v.get();
        a4g.s(ahuVar);
        this.q = ahuVar;
        View inflate = layoutInflater.inflate(R.layout.paymentsdk_dk_challenger_fragment, viewGroup, false);
        if (inflate == null) {
            jj4.j("rootView");
            return null;
        }
        LinearLayout linearLayout = (LinearLayout) inflate;
        h4b h4bVar = new h4b();
        h4bVar.a = linearLayout;
        this.j = h4bVar;
        return linearLayout;
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        view.getClass();
        super.onViewCreated(view, bundle);
        Parcelable parcelable = requireArguments().getParcelable("CHALLENGE_INFO_DATA");
        if (parcelable == null) {
            xq0.x("Required value was null.");
            return;
        }
        kpo kpoVar = (kpo) parcelable;
        Parcelable parcelable2 = requireArguments().getParcelable("SBP_TOKEN_DATA");
        if (parcelable2 == null) {
            xq0.x("Required value was null.");
            return;
        }
        mfk mfkVar = (mfk) parcelable2;
        Resources.Theme theme = requireContext().getTheme();
        theme.getClass();
        int i = 1;
        boolean E = bfg.E(theme, R.attr.paymentsdk_is_light_theme, true);
        ((vb8) this.p.getValue()).b.h().f(new axt("isLightTheme", E));
        c27 x = x();
        g0c g0cVar = x.l;
        qne c1 = gut.c1(mfkVar.a, kpoVar.c);
        x60 x60Var = (x60) g0cVar;
        x60Var.getClass();
        x60Var.a(c1);
        x.q = E;
        x.s = kpoVar;
        x.t = mfkVar;
        Continuation continuation = null;
        x97.y(ot0.F(x), null, null, new rc4(x, kpoVar, mfkVar, continuation, 24), 3);
        if (kpoVar.d()) {
            x.H(Long.valueOf(kpoVar.d));
        } else {
            CountDownTimer countDownTimer = x.y;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            x.y = null;
            x.v.m(v17.b);
        }
        if (u17.a[kpoVar.a.ordinal()] == 1) {
            obj = r17.d;
        } else {
            String str = kpoVar.f;
            if (str == null) {
                str = "";
            }
            obj = StringsKt.T(str, ".", 0, false, 6) == 1 ? q17.d : p17.d;
        }
        x97.y(wyf.F(getLifecycle()), null, null, new rc4(this, mfkVar, continuation, 23), 3);
        x97.y(wyf.F(getLifecycle()), null, null, new n17(this, continuation, i), 3);
        xqn xqnVar = new xqn();
        ahu ahuVar = this.q;
        if (ahuVar == null) {
            Intrinsics.j("viewReadyObservable");
            throw null;
        }
        ahuVar.a = new lj0(12, xqnVar, obj, this);
        x().u.f(getViewLifecycleOwner(), new uy6(2, new ne0(xqnVar, i)));
        x().o.f(getViewLifecycleOwner(), new uy6(2, new sv4(8, this, xqnVar)));
        x().v.f(getViewLifecycleOwner(), new uy6(2, new az6(1, this)));
    }

    public final c27 x() {
        return (c27) this.n.getValue();
    }
}
