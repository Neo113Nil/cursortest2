package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmla;", "Ljnb;", "<init>", "()V", "downloadedmusic-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class mla extends jnb {
    public final cvo j = new cvo(wjb.DownloadedContentScreen, hlb.Fullscreen, (glb) null, new dvo("collection_downloads"), (avo) null, 52);
    public final jyr k = btf.b(new lla(this, 0));
    public final jyr l = btf.b(new lla(this, 1));
    public final jyr m = btf.b(new lla(this, 2));
    public final ybf n = new ybf(ern.a(vla.class), new gz4(28, this), new gz4(29, new lla(this, 3)));

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        y supportFragmentManager = requireActivity().getSupportFragmentManager();
        supportFragmentManager.getClass();
        t requireActivity = requireActivity();
        requireActivity.getClass();
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        qnq qnqVar = new qnq(supportFragmentManager, requireActivity, wyf.F(viewLifecycleOwner.getLifecycle()), d(), 48);
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        dzf viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        composeView.setViewCompositionStrategy(new sml(viewLifecycleOwner2.getLifecycle()));
        composeView.setContent(new wn5(new kla(this, qnqVar, 0), -819693710, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z, reason: from getter */
    public final cvo getJ() {
        return this.j;
    }
}
