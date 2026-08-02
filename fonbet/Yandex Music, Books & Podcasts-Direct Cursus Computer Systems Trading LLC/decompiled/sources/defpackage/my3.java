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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmy3;", "Ljnb;", "<init>", "()V", "cards-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class my3 extends jnb {
    public final cvo j = new cvo(wjb.YearResultsScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
    public final dy3 k;
    public final jyr l;
    public final ybf m;
    public ny3 n;

    public my3() {
        l18 l18Var = l18.b;
        bdt I = hag.I(dy3.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.k = (dy3) qdcVar.C(I);
        this.l = btf.b(new ky3(this, 0));
        this.m = new ybf(ern.a(az3.class), new vz(24, this), new vz(25, new ky3(this, 1)));
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        t requireActivity = requireActivity();
        requireActivity.getClass();
        az3 az3Var = (az3) this.m.getValue();
        boolean z = bundle != null;
        kxi d = d();
        tmb x = x();
        dy3 dy3Var = this.k;
        dy3Var.getClass();
        cvo cvoVar = this.j;
        cvoVar.getClass();
        gy3 gy3Var = dy3Var.a;
        this.n = new ny3(new fy3(requireActivity), az3Var, requireActivity, (qy7) gy3Var.d.getValue(), (qwu) gy3Var.c.getValue(), (k6l) gy3Var.a.getValue(), (uwu) gy3Var.b.getValue(), d, (nmj) gy3Var.f.getValue(), cvoVar, x, z);
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(new wn5(new ly3(this, 0), 1878466488, true));
        Window window = requireActivity().getWindow();
        knn knnVar = new knn(composeView);
        int i = Build.VERSION.SDK_INT;
        (i >= 35 ? new oqv(window, knnVar) : i >= 30 ? new nqv(window, knnVar) : i >= 26 ? new mqv(window, knnVar) : new lqv(window, knnVar)).k0(false);
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z, reason: from getter */
    public final cvo getJ() {
        return this.j;
    }
}
