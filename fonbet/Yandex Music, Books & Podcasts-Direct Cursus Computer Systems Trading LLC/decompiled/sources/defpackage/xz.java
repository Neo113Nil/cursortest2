package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lxz;", "Ljnb;", "", "Ln7w;", "<init>", "()V", "album-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class xz extends jnb {
    public final boolean j;
    public final jyr k;
    public final jyr l;
    public final ybf m;
    public final jyr n;
    public final jyr o;

    public xz() {
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.j = ((ulu) ((byb) qdcVar.C(I)).c(ern.a(ulu.class))).h();
        this.k = btf.b(new tz(this, 0));
        this.l = btf.b(new tz(this, 1));
        this.m = new ybf(ern.a(e10.class), new vz(0, this), new vz(1, new tz(this, 2)));
        this.n = btf.b(new tz(this, 3));
        this.o = btf.b(new tz(this, 4));
    }

    public final hy A() {
        Parcelable parcelable = requireArguments().getParcelable("albumScreen:args");
        if (parcelable != null) {
            return (hy) parcelable;
        }
        xq0.x("Required value was null.");
        return null;
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
        composeView.setContent(new wn5(new uz(this, 0), 1065911456, true));
        return composeView;
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        x97.y(wyf.F(getViewLifecycleOwner().getLifecycle()), null, null, new hl(this, null, 2), 3);
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getJ() {
        return (cvo) this.k.getValue();
    }
}
