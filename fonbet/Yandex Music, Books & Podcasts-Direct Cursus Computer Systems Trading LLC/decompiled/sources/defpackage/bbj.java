package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lbbj;", "Ljnb;", "Lq1s;", "<init>", "()V", "nonmusic-landing-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class bbj extends jnb implements q1s {
    public final jyr j = l18.b.b(hag.I(skr.class), true);
    public final jyr k = btf.b(new zaj(this, 0));
    public final ybf l = new ybf(ern.a(xqq.class), new skf(26, this), new skf(27, new zaj(this, 1)));
    public final jyr m = btf.b(new zaj(this, 2));
    public final suc n = new suc(this, new ruc("NonMusicLandingFragment", true));
    public final gfo o = gfo.Tab;
    public final cvo p = new cvo(wjb.NonmusicLandingScreen, hlb.Fullscreen, (glb) null, new dvo("non_music"), (avo) null, 52);

    @Override // defpackage.q1s
    public final void j() {
        ((xqq) this.l.getValue()).U(0);
    }

    @Override // defpackage.jnb, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bzf.v(this);
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("landing.focus.on.tab.id") : null;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("landing.focus.on.block.id") : null;
        Bundle arguments3 = getArguments();
        boolean z = arguments3 != null ? arguments3.getBoolean("non.music.landing.back.nav") : false;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            arguments4.putString("landing.focus.on.tab.id", null);
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            arguments5.putString("landing.focus.on.block.id", null);
        }
        y childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        t requireActivity = requireActivity();
        requireActivity.getClass();
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        qnq qnqVar = new qnq(childFragmentManager, requireActivity, wyf.F(viewLifecycleOwner.getLifecycle()), d(), 48);
        ybf ybfVar = this.l;
        ebj ebjVar = new ebj(qnqVar, (xqq) ybfVar.getValue(), (waj) this.m.getValue(), new oxa(20, this), z);
        njf njfVar = new njf(ebjVar.j, this, 20);
        if (string != null) {
            ((xqq) ybfVar.getValue()).T(string, string2);
        }
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        dzf viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        composeView.setViewCompositionStrategy(new sml(viewLifecycleOwner2.getLifecycle()));
        composeView.setContent(new wn5(new yaj(ebjVar, this, qnqVar, njfVar, 0), -808556514, true));
        return composeView;
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        this.n.b();
    }

    @Override // defpackage.jnb
    /* renamed from: y, reason: from getter */
    public final gfo getJ() {
        return this.o;
    }

    @Override // defpackage.jnb
    /* renamed from: z, reason: from getter */
    public final cvo getJ() {
        return this.p;
    }
}
