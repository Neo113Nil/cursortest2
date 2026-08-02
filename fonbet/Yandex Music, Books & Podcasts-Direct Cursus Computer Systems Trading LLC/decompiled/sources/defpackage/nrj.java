package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnrj;", "Ljnb;", "<init>", "()V", "onboarding-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class nrj extends jnb {
    public final jyr k;
    public final jyr m;
    public final jyr j = l18.b.b(hag.I(mcb.class), true);
    public final jyr l = btf.b(new s9j(13));

    public nrj() {
        final int i = 0;
        this.k = btf.b(new Function0(this) { // from class: mrj
            public final /* synthetic */ nrj b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        nrj nrjVar = this.b;
                        mcb mcbVar = (mcb) nrjVar.j.getValue();
                        mcbVar.getClass();
                        e00 e00Var = mcbVar.a;
                        e00Var.getClass();
                        t requireActivity = nrjVar.requireActivity();
                        requireActivity.getClass();
                        return new arj(requireActivity, new kme(new vni(nrjVar)), e00Var.b(hag.I(drj.class), true));
                    default:
                        nrj nrjVar2 = this.b;
                        return new brj(nrjVar2.g.m(), nrjVar2.getN());
                }
            }
        });
        final int i2 = 1;
        this.m = btf.b(new Function0(this) { // from class: mrj
            public final /* synthetic */ nrj b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        nrj nrjVar = this.b;
                        mcb mcbVar = (mcb) nrjVar.j.getValue();
                        mcbVar.getClass();
                        e00 e00Var = mcbVar.a;
                        e00Var.getClass();
                        t requireActivity = nrjVar.requireActivity();
                        requireActivity.getClass();
                        return new arj(requireActivity, new kme(new vni(nrjVar)), e00Var.b(hag.I(drj.class), true));
                    default:
                        nrj nrjVar2 = this.b;
                        return new brj(nrjVar2.g.m(), nrjVar2.getN());
                }
            }
        });
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        arj arjVar = (arj) this.k.getValue();
        drj drjVar = (drj) arjVar.c.getValue();
        t tVar = arjVar.a;
        drjVar.getClass();
        tVar.getClass();
        nfj nfjVar = (nfj) drjVar.a.getValue();
        nfjVar.getClass();
        if (!nfjVar.a) {
            if (Build.VERSION.SDK_INT >= 33) {
                oks.a.a(tVar);
            }
            nfjVar.a = true;
        }
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        composeView.setViewCompositionStrategy(new sml(viewLifecycleOwner.getLifecycle()));
        composeView.setContent(new wn5(new lrj(this, 0), 1270480658, true));
        Window window = requireActivity().getWindow();
        knn knnVar = new knn(composeView);
        int i = Build.VERSION.SDK_INT;
        y5g oqvVar = i >= 35 ? new oqv(window, knnVar) : i >= 30 ? new nqv(window, knnVar) : i >= 26 ? new mqv(window, knnVar) : new lqv(window, knnVar);
        oqvVar.k0(false);
        oqvVar.j0(false);
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getN() {
        return (cvo) this.l.getValue();
    }
}
