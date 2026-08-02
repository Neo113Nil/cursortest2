package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz1i;", "Ljnb;", "<init>", "()V", "metatag-screens"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class z1i extends jnb {
    public final jyr j = btf.b(new x1i(this, 0));
    public final ybf k = new ybf(ern.a(g2i.class), new skf(10, this), new skf(11, new x1i(this, 1)));
    public final jyr l = btf.b(new x1i(this, 2));

    public final g2i A() {
        return (g2i) this.k.getValue();
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        g2i A = A();
        t requireActivity = requireActivity();
        requireActivity.getClass();
        b2i b2iVar = new b2i(A, requireActivity, (c2i) this.l.getValue());
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        composeView.setViewCompositionStrategy(new sml(viewLifecycleOwner.getLifecycle()));
        composeView.setTag(R.id.consume_window_insets_tag, Boolean.FALSE);
        composeView.setContent(new wn5(new y1i(this, b2iVar, 0), 219765533, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getK() {
        return (cvo) this.j.getValue();
    }
}
