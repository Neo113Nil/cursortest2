package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh32;", "Ljnb;", "<init>", "()V", "auto-cached"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class h32 extends jnb {
    public final cvo j;
    public final jyr k;
    public final cvo l;
    public final jyr m;
    public final jyr n;
    public final ybf o;
    public final jyr p;

    public h32() {
        wjb wjbVar = wjb.SettingsAutoDownloadScreen;
        hlb hlbVar = hlb.Fullscreen;
        this.j = new cvo(wjbVar, hlbVar, (glb) null, (dvo) null, (avo) null, 60);
        this.k = btf.b(new g32(this, 0));
        this.l = new cvo(wjb.SettingsAutoDownloadConfirmationScreen, hlbVar, (glb) null, (dvo) null, (avo) null, 60);
        this.m = btf.b(new g32(this, 1));
        this.n = l18.b.b(hag.I(b32.class), true);
        this.o = new ybf(ern.a(t32.class), new vz(16, this), new vz(17, new g32(this, 2)));
        this.p = btf.b(new g32(this, 3));
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
        composeView.setContent(new wn5(new f32(this, 0), 1710084276, true));
        return composeView;
    }

    @Override // defpackage.jnb, androidx.fragment.app.o
    public final void onStop() {
        super.onStop();
        t32 t32Var = (t32) this.o.getValue();
        x97.y(t32Var.p, null, null, new s32(t32Var, false, null), 3);
    }

    @Override // defpackage.jnb
    /* renamed from: z, reason: from getter */
    public final cvo getJ() {
        return this.j;
    }
}
