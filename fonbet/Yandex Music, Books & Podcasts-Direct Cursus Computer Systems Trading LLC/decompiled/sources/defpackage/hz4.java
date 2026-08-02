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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lhz4;", "Ljnb;", "Lq1s;", "<init>", "()V", "mymusic-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class hz4 extends jnb implements q1s {
    public final gfo j = gfo.Tab;
    public final cvo k = new cvo(wjb.CollectionLandingScreen, hlb.Fullscreen, (glb) null, new dvo("collection"), (avo) null, 52);
    public final zh l;
    public final jyr m;
    public final ybf n;
    public final jyr o;

    public hz4() {
        zh registerForActivityResult = registerForActivityResult(new vh(4), new gi(2, this));
        registerForActivityResult.getClass();
        this.l = registerForActivityResult;
        this.m = btf.b(new fz4(this, 0));
        this.n = new ybf(ern.a(yz4.class), new vz(29, this), new gz4(0, new fz4(this, 1)));
        this.o = btf.b(new fz4(this, 2));
    }

    @Override // defpackage.q1s
    public final void j() {
        yz4 yz4Var = (yz4) this.n.getValue();
        x97.y(ot0.F(yz4Var), null, null, new vz4(yz4Var, null, 7), 3);
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        y supportFragmentManager = requireActivity().getSupportFragmentManager();
        supportFragmentManager.getClass();
        t requireActivity = requireActivity();
        requireActivity.getClass();
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        qnq qnqVar = new qnq(supportFragmentManager, requireActivity, wyf.F(viewLifecycleOwner.getLifecycle()), d(), 16);
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        dzf viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        composeView.setViewCompositionStrategy(new sml(viewLifecycleOwner2.getLifecycle()));
        composeView.setContent(new wn5(new ez4(this, qnqVar, 0), -1854117231, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: y, reason: from getter */
    public final gfo getJ() {
        return this.j;
    }

    @Override // defpackage.jnb
    /* renamed from: z, reason: from getter */
    public final cvo getJ() {
        return this.k;
    }
}
