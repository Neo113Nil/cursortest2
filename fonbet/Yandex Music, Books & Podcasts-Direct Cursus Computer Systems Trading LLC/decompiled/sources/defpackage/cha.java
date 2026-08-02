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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcha;", "Ljnb;", "<init>", "()V", "downloadedmusic-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class cha extends jnb {
    public final cvo j = new cvo(wjb.DownloadedPlaylistListScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
    public final ybf k = new ybf(ern.a(gha.class), new gz4(24, this), new gz4(25, new bv7(22)));
    public final jyr l = l18.b.b(hag.I(zx4.class), true);
    public final jyr m;
    public final jyr n;
    public final jyr o;

    public cha() {
        final int i = 0;
        this.m = btf.b(new Function0(this) { // from class: bha
            public final /* synthetic */ cha b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        cha chaVar = this.b;
                        zx4 zx4Var = (zx4) chaVar.l.getValue();
                        t requireActivity = chaVar.requireActivity();
                        requireActivity.getClass();
                        zx4Var.getClass();
                        return new wga(requireActivity);
                    case 1:
                        ((zx4) this.b.l.getValue()).getClass();
                        return new cga();
                    default:
                        cha chaVar2 = this.b;
                        l18 l18Var = l18.b;
                        bdt I = hag.I(ibc.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        t requireActivity2 = chaVar2.requireActivity();
                        requireActivity2.getClass();
                        return ibc.a(requireActivity2);
                }
            }
        });
        final int i2 = 1;
        this.n = btf.b(new Function0(this) { // from class: bha
            public final /* synthetic */ cha b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        cha chaVar = this.b;
                        zx4 zx4Var = (zx4) chaVar.l.getValue();
                        t requireActivity = chaVar.requireActivity();
                        requireActivity.getClass();
                        zx4Var.getClass();
                        return new wga(requireActivity);
                    case 1:
                        ((zx4) this.b.l.getValue()).getClass();
                        return new cga();
                    default:
                        cha chaVar2 = this.b;
                        l18 l18Var = l18.b;
                        bdt I = hag.I(ibc.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        t requireActivity2 = chaVar2.requireActivity();
                        requireActivity2.getClass();
                        return ibc.a(requireActivity2);
                }
            }
        });
        final int i3 = 2;
        this.o = btf.b(new Function0(this) { // from class: bha
            public final /* synthetic */ cha b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        cha chaVar = this.b;
                        zx4 zx4Var = (zx4) chaVar.l.getValue();
                        t requireActivity = chaVar.requireActivity();
                        requireActivity.getClass();
                        zx4Var.getClass();
                        return new wga(requireActivity);
                    case 1:
                        ((zx4) this.b.l.getValue()).getClass();
                        return new cga();
                    default:
                        cha chaVar2 = this.b;
                        l18 l18Var = l18.b;
                        bdt I = hag.I(ibc.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        t requireActivity2 = chaVar2.requireActivity();
                        requireActivity2.getClass();
                        return ibc.a(requireActivity2);
                }
            }
        });
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        rp7 rp7Var = new rp7((cga) this.n.getValue(), this);
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        composeView.setViewCompositionStrategy(new sml(viewLifecycleOwner.getLifecycle()));
        composeView.setContent(new wn5(new aha(this, rp7Var, 0), -302180569, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z, reason: from getter */
    public final cvo getJ() {
        return this.j;
    }
}
