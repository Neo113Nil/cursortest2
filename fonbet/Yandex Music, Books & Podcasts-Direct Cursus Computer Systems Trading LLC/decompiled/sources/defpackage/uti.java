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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luti;", "Ljnb;", "<init>", "()V", "myshelf-screens"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class uti extends jnb {
    public final ybf j = new ybf(ern.a(bui.class), new skf(18, this), new skf(19, new tti(this, 0)));
    public final jyr k = btf.b(new u5i(15));
    public final jyr l = btf.b(new tti(this, 1));

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Parcelable parcelable = requireArguments().getParcelable("myShelfLikesScreen:args");
        if (parcelable == null) {
            xq0.x("Required value was null.");
            return null;
        }
        String str = ((rui) parcelable).a;
        vti vtiVar = new vti((bui) this.j.getValue(), (pui) this.l.getValue(), d());
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        composeView.setViewCompositionStrategy(new sml(viewLifecycleOwner.getLifecycle()));
        composeView.setContent(new wn5(new sti(str, vtiVar, 1, (byte) 0), 1640200613, true));
        return composeView;
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getL() {
        return (cvo) this.k.getValue();
    }
}
