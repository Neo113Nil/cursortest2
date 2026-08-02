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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lja3;", "Ljnb;", "<init>", "()V", "nonmusic-screens"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class ja3 extends jnb {
    public final ybf j = new ybf(ern.a(ob3.class), new vz(21, this), new vz(22, new ia3(this, 0)));
    public final jyr k = btf.b(new ia3(this, 1));
    public final jyr l = btf.b(new ia3(this, 2));
    public final jyr m = btf.b(new ia3(this, 3));

    public final rbj A() {
        Parcelable parcelable = requireArguments().getParcelable("audioBookScreen:args");
        if (parcelable != null) {
            return (rbj) parcelable;
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
        composeView.setContent(new wn5(new ha3(this, 0), 1325930218, true));
        return composeView;
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        x97.y(wyf.F(getViewLifecycleOwner().getLifecycle()), null, null, new hl(this, null, 27), 3);
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getN() {
        return (cvo) this.k.getValue();
    }
}
