package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfl1;", "Ljnb;", "<init>", "()V", "artist-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class fl1 extends jnb {
    public final ybf j = new ybf(ern.a(em1.class), new vz(12, this), new vz(13, new dl1(this, 0)));
    public final jyr k = btf.b(new dl1(this, 1));
    public final jyr l = btf.b(new dl1(this, 2));

    public final void A(ml1 ml1Var, lvf lvfVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(384295646);
        int i2 = (oq5Var.f(ml1Var) ? 4 : 2) | i | (oq5Var.h(lvfVar) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            m0f m0fVar = (m0f) lvfVar.d.getValue();
            boolean f = oq5Var.f(m0fVar) | ((i2 & 14) == 4);
            Object K = oq5Var.K();
            if (f || K == gq5.a) {
                K = new hb(28, ml1Var, m0fVar);
                oq5Var.k0(K);
            }
            gld.D((Function0) K, oq5Var);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new sh1(this, ml1Var, lvfVar, i, 5);
        }
    }

    public final u51 B() {
        Parcelable parcelable = requireArguments().getParcelable("arg.artist");
        if (parcelable != null) {
            return (u51) parcelable;
        }
        xq0.x("Required value was null.");
        return null;
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        em1 em1Var = (em1) this.j.getValue();
        t requireActivity = requireActivity();
        requireActivity.getClass();
        hk1 hk1Var = (hk1) this.l.getValue();
        nsh nshVar = new nsh(B().a, d().a);
        kxi d = d();
        l18 l18Var = l18.b;
        bdt I = hag.I(g0l.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        ml1 ml1Var = new ml1(em1Var, requireActivity, hk1Var, nshVar, d, (g0l) qdcVar.C(I), getN(), B());
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        composeView.setViewCompositionStrategy(new sml(viewLifecycleOwner.getLifecycle()));
        composeView.setTag(R.id.consume_window_insets_tag, Boolean.FALSE);
        composeView.setContent(new wn5(new el1(this, ml1Var, 0), -1314909680, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getN() {
        return (cvo) this.k.getValue();
    }
}
