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
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc41;", "Ljnb;", "<init>", "()V", "concerts-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class c41 extends jnb {
    public final jyr j = btf.b(new a41(this, 0));
    public final jab k = new jab(qkb.List, 1, 1, 0);
    public final jyr l;
    public final ybf m;
    public final jyr n;
    public final jyr o;

    public c41() {
        bdt I = hag.I(n41.class);
        l18 l18Var = l18.b;
        this.l = l18Var.b(I, true);
        this.m = new ybf(ern.a(u41.class), new vz(8, this), new vz(9, new a41(this, 1)));
        this.n = l18Var.b(hag.I(m41.class), true);
        this.o = btf.b(new a41(this, 2));
    }

    public final l31 A() {
        Parcelable parcelable = requireArguments().getParcelable("artistConcerts:args");
        if (parcelable != null) {
            return (l31) parcelable;
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
        composeView.setTag(R.id.consume_window_insets_tag, Boolean.FALSE);
        composeView.setContent(new wn5(new b41(this, 0), 1616992365, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getK() {
        return (cvo) this.j.getValue();
    }
}
