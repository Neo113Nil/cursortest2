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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqha;", "Ljnb;", "<init>", "()V", "downloadedmusic-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class qha extends jnb {
    public final cvo j = new cvo(wjb.DownloadedPodcastLandingScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
    public final ybf k = new ybf(ern.a(zha.class), new gz4(26, this), new gz4(27, new bv7(24)));
    public final jyr l = l18.b.b(hag.I(zx4.class), true);
    public final jyr m;
    public final jyr n;

    public qha() {
        final int i = 0;
        this.m = btf.b(new Function0(this) { // from class: oha
            public final /* synthetic */ qha b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        qha qhaVar = this.b;
                        zx4 zx4Var = (zx4) qhaVar.l.getValue();
                        t requireActivity = qhaVar.requireActivity();
                        requireActivity.getClass();
                        kxi d = qhaVar.d();
                        zx4Var.getClass();
                        return new mha(requireActivity, d);
                    default:
                        ((zx4) this.b.l.getValue()).getClass();
                        return new cga();
                }
            }
        });
        final int i2 = 1;
        this.n = btf.b(new Function0(this) { // from class: oha
            public final /* synthetic */ qha b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        qha qhaVar = this.b;
                        zx4 zx4Var = (zx4) qhaVar.l.getValue();
                        t requireActivity = qhaVar.requireActivity();
                        requireActivity.getClass();
                        kxi d = qhaVar.d();
                        zx4Var.getClass();
                        return new mha(requireActivity, d);
                    default:
                        ((zx4) this.b.l.getValue()).getClass();
                        return new cga();
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
        composeView.setContent(new wn5(new pha(this, rp7Var, 0), -411001927, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z, reason: from getter */
    public final cvo getJ() {
        return this.j;
    }
}
