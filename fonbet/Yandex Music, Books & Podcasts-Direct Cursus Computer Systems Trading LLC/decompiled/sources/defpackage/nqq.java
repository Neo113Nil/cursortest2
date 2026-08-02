package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnqq;", "Ljnb;", "<init>", "()V", "skeleton-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class nqq extends jnb {
    public final jyr j;
    public final jyr k;
    public final jyr l;
    public final ybf m;
    public final jyr n;
    public final jyr o;

    public nqq() {
        bdt I = hag.I(skr.class);
        l18 l18Var = l18.b;
        this.j = l18Var.b(I, true);
        this.k = btf.b(new lqq(this, 0));
        this.l = btf.b(new lqq(this, 1));
        this.m = new ybf(ern.a(xqq.class), new xpp(7, this), new xpp(8, new lqq(this, 2)));
        this.n = l18Var.b(hag.I(jqq.class), true);
        this.o = btf.b(new lqq(this, 3));
    }

    public final dqq A() {
        Parcelable parcelable = requireArguments().getParcelable("skeletonScreen:args");
        if (parcelable != null) {
            return (dqq) parcelable;
        }
        xq0.x("Required value was null.");
        return null;
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        y childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        t requireActivity = requireActivity();
        requireActivity.getClass();
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        qnq qnqVar = new qnq(childFragmentManager, requireActivity, wyf.F(viewLifecycleOwner.getLifecycle()), d(), 48);
        qqq qqqVar = new qqq(qnqVar, (xqq) this.m.getValue(), (iqq) this.o.getValue(), A().d);
        mpq mpqVar = new mpq(1, qqqVar.h, this);
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        dzf viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        composeView.setViewCompositionStrategy(new sml(viewLifecycleOwner2.getLifecycle()));
        composeView.setContent(new wn5(new kqq(qqqVar, this, qnqVar, mpqVar, 0), -398311416, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getN() {
        return (cvo) this.l.getValue();
    }
}
