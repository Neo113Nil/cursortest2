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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgzl;", "Ljnb;", "<init>", "()V", "playlist-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class gzl extends jnb {
    public final jyr j = btf.b(new ezl(this, 0));
    public final ybf k = new ybf(ern.a(n0m.class), new lvj(8, this), new lvj(9, new ezl(this, 1)));

    public final exl A() {
        Parcelable parcelable = requireArguments().getParcelable("playlistScreen:args");
        if (parcelable != null) {
            return (exl) parcelable;
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
        composeView.setContent(new wn5(new fzl(this, 0), -114540321, true));
        return composeView;
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        x97.y(wyf.F(getViewLifecycleOwner().getLifecycle()), null, null, new g2l(this, null, 9), 3);
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getN() {
        return new cvo(wjb.PlaylistScreen, hlb.Fullscreen, (glb) null, (dvo) null, new avo(pkb.Playlist, A().a.N() ? "414787002:1076" : A().a.getId()), 44);
    }
}
