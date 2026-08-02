package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.t;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class uvq extends jnb {
    public final z2m j;
    public final jyr k;
    public final jyr l;
    public final jyr m;
    public final ybf n;

    public uvq(zvq zvqVar, z2m z2mVar) {
        this.j = z2mVar;
        this.k = btf.b(new oxo(29, zvqVar));
        final int i = 0;
        this.l = btf.b(new Function0(this) { // from class: svq
            public final /* synthetic */ uvq b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (rvq) this.b.j.a.getValue();
                    default:
                        uvq uvqVar = this.b;
                        return new tmb(12, uvqVar.g.m(), uvqVar.getK());
                }
            }
        });
        final int i2 = 1;
        this.m = btf.b(new Function0(this) { // from class: svq
            public final /* synthetic */ uvq b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (rvq) this.b.j.a.getValue();
                    default:
                        uvq uvqVar = this.b;
                        return new tmb(12, uvqVar.g.m(), uvqVar.getK());
                }
            }
        });
        this.n = new ybf(ern.a(qwq.class), new xpp(9, this), new xpp(10, new rln(23, this, zvqVar)));
    }

    @Override // defpackage.jnb, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ccg G = ((qwq) this.n.getValue()).G();
        t requireActivity = requireActivity();
        requireActivity.getClass();
        G.l(requireActivity);
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
        composeView.setContent(new wn5(new tvq(this, 0), 1890175416, true));
        return composeView;
    }

    @Override // androidx.fragment.app.o
    public final void onDestroy() {
        super.onDestroy();
        ((qwq) this.n.getValue()).G().a();
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getK() {
        return (cvo) this.k.getValue();
    }
}
