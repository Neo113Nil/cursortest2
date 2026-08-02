package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lff4;", "Lbf6;", "Lduc;", "<init>", "()V", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class ff4 extends bf6 implements duc {
    public final jyr k = btf.b(new r93(16, this));
    public bw1 l;

    @Override // defpackage.duc
    public final int f() {
        return R.string.charts_catalog_title;
    }

    @Override // defpackage.duc
    public final boolean h() {
        return false;
    }

    @Override // defpackage.bf6, defpackage.jnb, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        og4 og4Var;
        clc clcVar;
        super.onCreate(bundle);
        Context requireContext = requireContext();
        requireContext.getClass();
        bw1 bw1Var = new bw1(requireContext);
        this.l = bw1Var;
        bw1Var.d = new ix6(15, this);
        Bundle arguments = getArguments();
        lg4 lg4Var = lg4.a;
        if (arguments == null || (og4Var = (og4) arguments.getParcelable("chart.type")) == null) {
            og4Var = lg4Var;
        }
        bw1Var.k = og4Var;
        ((rjq) bw1Var.g).g();
        tg4 tg4Var = (tg4) ((jyr) bw1Var.e).getValue();
        int i = 2;
        Continuation continuation = null;
        if (og4Var.equals(lg4Var)) {
            clcVar = new clc(tg4Var.b, new z21(i, 7, continuation));
        } else if (og4Var.equals(ng4.a)) {
            clcVar = new clc(tg4Var.d, new z21(i, 9, continuation));
        } else {
            if (!(og4Var instanceof mg4)) {
                b6e.s();
                return;
            }
            clcVar = new clc(tg4Var.f, new z21(i, 8, continuation));
        }
        ox6.B(clcVar, (um6) bw1Var.h, new i64(2, bw1Var));
        bw1Var.p(false);
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_recycler_toolbar, viewGroup, false);
    }

    @Override // androidx.fragment.app.o
    public final void onDestroy() {
        super.onDestroy();
        bw1 bw1Var = this.l;
        if (bw1Var != null) {
            ((rjq) bw1Var.g).V();
        } else {
            Intrinsics.j("presenter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.o
    public final void onDestroyView() {
        super.onDestroyView();
        bw1 bw1Var = this.l;
        if (bw1Var == null) {
            Intrinsics.j("presenter");
            throw null;
        }
        rg4 rg4Var = (rg4) bw1Var.i;
        if (rg4Var != null) {
            rg4Var.g.setValue(rg4Var, rg4.h[4], null);
        }
        bw1Var.i = null;
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        bw1 bw1Var = this.l;
        if (bw1Var == null) {
            Intrinsics.j("presenter");
            throw null;
        }
        Context requireContext = requireContext();
        requireContext.getClass();
        rg4 rg4Var = new rg4(requireContext, wyf.F(getLifecycle()), view, new v5(18, this));
        bw1Var.i = rg4Var;
        rg4Var.a = new sld(16, bw1Var);
        bw1Var.j();
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getK() {
        return (cvo) this.k.getValue();
    }
}
