package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwgf;", "Ljnb;", "<init>", "()V", "kids-collection-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class wgf extends jnb {
    public final cvo j = new cvo(wjb.KidsTrackListScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
    public final ybf k = new ybf(ern.a(ghf.class), new pva(25, this), new pva(27, new bff(3)));
    public final jyr l = l18.b.b(hag.I(qy4.class), true);
    public final jyr m;
    public final jyr n;
    public final jyr o;

    public wgf() {
        final int i = 0;
        this.m = btf.b(new Function0(this) { // from class: tgf
            public final /* synthetic */ wgf b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        wgf wgfVar = this.b;
                        qy4 qy4Var = (qy4) wgfVar.l.getValue();
                        t requireActivity = wgfVar.requireActivity();
                        requireActivity.getClass();
                        kxi d = wgfVar.d();
                        qy4Var.getClass();
                        return new wy4(requireActivity, d);
                    case 1:
                        ((qy4) this.b.l.getValue()).getClass();
                        return new mef();
                    default:
                        wgf wgfVar2 = this.b;
                        l18 l18Var = l18.b;
                        bdt I = hag.I(ibc.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        t requireActivity2 = wgfVar2.requireActivity();
                        requireActivity2.getClass();
                        return ibc.a(requireActivity2);
                }
            }
        });
        final int i2 = 1;
        this.n = btf.b(new Function0(this) { // from class: tgf
            public final /* synthetic */ wgf b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        wgf wgfVar = this.b;
                        qy4 qy4Var = (qy4) wgfVar.l.getValue();
                        t requireActivity = wgfVar.requireActivity();
                        requireActivity.getClass();
                        kxi d = wgfVar.d();
                        qy4Var.getClass();
                        return new wy4(requireActivity, d);
                    case 1:
                        ((qy4) this.b.l.getValue()).getClass();
                        return new mef();
                    default:
                        wgf wgfVar2 = this.b;
                        l18 l18Var = l18.b;
                        bdt I = hag.I(ibc.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        t requireActivity2 = wgfVar2.requireActivity();
                        requireActivity2.getClass();
                        return ibc.a(requireActivity2);
                }
            }
        });
        final int i3 = 2;
        this.o = btf.b(new Function0(this) { // from class: tgf
            public final /* synthetic */ wgf b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        wgf wgfVar = this.b;
                        qy4 qy4Var = (qy4) wgfVar.l.getValue();
                        t requireActivity = wgfVar.requireActivity();
                        requireActivity.getClass();
                        kxi d = wgfVar.d();
                        qy4Var.getClass();
                        return new wy4(requireActivity, d);
                    case 1:
                        ((qy4) this.b.l.getValue()).getClass();
                        return new mef();
                    default:
                        wgf wgfVar2 = this.b;
                        l18 l18Var = l18.b;
                        bdt I = hag.I(ibc.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        t requireActivity2 = wgfVar2.requireActivity();
                        requireActivity2.getClass();
                        return ibc.a(requireActivity2);
                }
            }
        });
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ix6 ix6Var = new ix6((mef) this.n.getValue(), this);
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        composeView.setViewCompositionStrategy(new sml(viewLifecycleOwner.getLifecycle()));
        composeView.setContent(new wn5(new rgf(this, ix6Var, 0), -1155953261, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z, reason: from getter */
    public final cvo getJ() {
        return this.j;
    }
}
