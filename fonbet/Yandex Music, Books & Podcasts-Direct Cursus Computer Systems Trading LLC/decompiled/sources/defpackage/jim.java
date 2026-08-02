package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import ru.yandex.music.common.media.context.d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljim;", "Ljnb;", "<init>", "()V", "universal-entities"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class jim extends jnb {
    public final cvo j = new cvo(wjb.EditorialFeedScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
    public final jyr k = btf.b(new hvl(22));
    public final jyr l = btf.b(new iim(this, 0));
    public final jyr m = btf.b(new iim(this, 1));
    public final jyr n = btf.b(new iim(this, 2));
    public final jyr o = btf.b(new iim(this, 3));

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        l18 l18Var = l18.b;
        bdt I = hag.I(wjt.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        Context context = composeView.getContext();
        context.getClass();
        y parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.getClass();
        zit zitVar = new zit(context, d.x("postGrid"), parentFragmentManager);
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        composeView.setViewCompositionStrategy(new sml(viewLifecycleOwner.getLifecycle()));
        composeView.setContent(new wn5(new him(this, zitVar, 0), -1596491332, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z, reason: from getter */
    public final cvo getK() {
        return this.j;
    }
}
