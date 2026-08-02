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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls0i;", "Ljnb;", "<init>", "()V", "metatag-screens"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class s0i extends jnb {
    public final jyr j = btf.b(new r0i(this, 0));
    public final ybf k = new ybf(ern.a(b1i.class), new skf(6, this), new skf(7, new r0i(this, 1)));
    public final jyr l = btf.b(new r0i(this, 2));

    public final b1i A() {
        return (b1i) this.k.getValue();
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        b1i A = A();
        t requireActivity = requireActivity();
        requireActivity.getClass();
        v0i v0iVar = new v0i(A, requireActivity, (w0i) this.l.getValue());
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        composeView.setViewCompositionStrategy(new sml(viewLifecycleOwner.getLifecycle()));
        composeView.setTag(R.id.consume_window_insets_tag, Boolean.FALSE);
        composeView.setContent(new wn5(new q0i(this, v0iVar, 0), -1914696210, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getK() {
        return (cvo) this.j.getValue();
    }
}
