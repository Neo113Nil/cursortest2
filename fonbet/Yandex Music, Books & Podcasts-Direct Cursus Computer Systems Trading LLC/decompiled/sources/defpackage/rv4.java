package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrv4;", "Ljnb;", "<init>", "()V", "artists-collection-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class rv4 extends jnb {
    public final jyr j;
    public final cvo k;
    public final zh l;
    public final jyr m;
    public final jyr n;
    public final jyr o;
    public final jyr p;
    public final ybf q;
    public final ybf r;
    public final jyr s;
    public final jyr t;

    public rv4() {
        bdt I = hag.I(nv4.class);
        l18 l18Var = l18.b;
        this.j = l18Var.b(I, true);
        this.k = new cvo(wjb.CollectionArtistsScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
        zh registerForActivityResult = registerForActivityResult(new vh(4), new gi(1, this));
        registerForActivityResult.getClass();
        this.l = registerForActivityResult;
        this.m = btf.b(new ov4(this, 0));
        this.n = l18Var.b(hag.I(mvv.class), true);
        this.o = l18Var.b(hag.I(kuv.class), true);
        this.p = btf.b(new ov4(this, 1));
        this.q = new ybf(ern.a(dvv.class), new qv4(this, 0), new vz(27, new ov4(this, 2)));
        this.r = new ybf(ern.a(xv4.class), new qv4(this, 1), new vz(28, new ym4(9)));
        this.s = btf.b(new ov4(this, 3));
        this.t = btf.b(new ov4(this, 4));
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        composeView.setViewCompositionStrategy(new sml(viewLifecycleOwner.getLifecycle()));
        composeView.setContent(new wn5(new pv4(this, 0), 1448856371, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z, reason: from getter */
    public final cvo getK() {
        return this.k;
    }
}
