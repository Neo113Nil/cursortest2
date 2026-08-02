package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp25;", "Ljnb;", "<init>", "()V", "playlist-list-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class p25 extends jnb {
    public final zh j;
    public final ybf k;
    public final jyr l;
    public final jyr m;
    public final cvo n;

    public p25() {
        l18 l18Var = l18.b;
        bdt I = hag.I(nwl.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        zh registerForActivityResult = registerForActivityResult(((nwl) qdcVar.C(I)).a, new gi(3, this));
        registerForActivityResult.getClass();
        this.j = registerForActivityResult;
        this.k = new ybf(ern.a(d35.class), new gz4(1, this), new gz4(2, new n25(this, 0)));
        this.l = btf.b(new n25(this, 1));
        this.m = btf.b(new n25(this, 2));
        this.n = new cvo(wjb.CollectionPlaylistsScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Bundle arguments = getArguments();
        Integer valueOf = arguments != null ? Integer.valueOf(arguments.getInt("arg.initial_tab")) : null;
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        composeView.setViewCompositionStrategy(new sml(viewLifecycleOwner.getLifecycle()));
        composeView.setTag(R.id.consume_window_insets_tag, Boolean.FALSE);
        composeView.setContent(new wn5(new o25(this, valueOf, 0), -254612127, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z, reason: from getter */
    public final cvo getN() {
        return this.n;
    }
}
