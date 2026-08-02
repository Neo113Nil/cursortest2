package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llu4;", "Lbf6;", "<init>", "()V", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class lu4 extends bf6 {
    public final cvo k = new cvo(wjb.CollectionAlbumsScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        t requireActivity = requireActivity();
        requireActivity.getClass();
        tmb x = x();
        y childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        jac jacVar = new jac(requireActivity, x, childFragmentManager, wdp.i0(this));
        ComposeView composeView = new ComposeView(requireActivity, null, 0, 6, null);
        composeView.setContent(new wn5(new yu4(jacVar, 0), -236828219, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z, reason: from getter */
    public final cvo getK() {
        return this.k;
    }
}
