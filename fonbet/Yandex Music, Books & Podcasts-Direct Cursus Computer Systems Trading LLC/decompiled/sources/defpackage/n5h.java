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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln5h;", "Ljnb;", "<init>", "()V", "kids-collection-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class n5h extends jnb {
    public final cvo j = new cvo(wjb.CollectionKidsScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
    public final ybf k = new ybf(ern.a(t5h.class), new skf(4, this), new skf(5, new opg(19)));
    public final jyr l = l18.b.b(hag.I(qy4.class), true);
    public final jyr m;
    public final jyr n;

    public n5h() {
        final int i = 0;
        this.m = btf.b(new Function0(this) { // from class: m5h
            public final /* synthetic */ n5h b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        n5h n5hVar = this.b;
                        qy4 qy4Var = (qy4) n5hVar.l.getValue();
                        t requireActivity = n5hVar.requireActivity();
                        requireActivity.getClass();
                        kxi d = n5hVar.d();
                        qy4Var.getClass();
                        return new uy4(requireActivity, d);
                    default:
                        ((qy4) this.b.l.getValue()).getClass();
                        return new mef();
                }
            }
        });
        final int i2 = 1;
        this.n = btf.b(new Function0(this) { // from class: m5h
            public final /* synthetic */ n5h b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        n5h n5hVar = this.b;
                        qy4 qy4Var = (qy4) n5hVar.l.getValue();
                        t requireActivity = n5hVar.requireActivity();
                        requireActivity.getClass();
                        kxi d = n5hVar.d();
                        qy4Var.getClass();
                        return new uy4(requireActivity, d);
                    default:
                        ((qy4) this.b.l.getValue()).getClass();
                        return new mef();
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
        composeView.setContent(new wn5(new l5h(this, ix6Var, 0), -423192672, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z, reason: from getter */
    public final cvo getJ() {
        return this.j;
    }
}
