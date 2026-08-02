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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lldm;", "Ljnb;", "<init>", "()V", "nonmusic-screens"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class ldm extends jnb {
    public final jyr j = btf.b(new kdm(this, 0));
    public final ybf k = new ybf(ern.a(efm.class), new lvj(14, this), new lvj(15, new kdm(this, 1)));
    public final jyr l = btf.b(new kdm(this, 2));
    public final jyr m = btf.b(new kdm(this, 3));

    public final efm A() {
        return (efm) this.k.getValue();
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        efm A = A();
        t requireActivity = requireActivity();
        requireActivity.getClass();
        fem femVar = new fem(A, requireActivity, (ncm) this.m.getValue(), (scm) this.l.getValue());
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        composeView.setViewCompositionStrategy(new sml(viewLifecycleOwner.getLifecycle()));
        composeView.setTag(R.id.consume_window_insets_tag, Boolean.FALSE);
        composeView.setContent(new wn5(new jdm(this, femVar, 0), 976655546, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getL() {
        return (cvo) this.j.getValue();
    }
}
