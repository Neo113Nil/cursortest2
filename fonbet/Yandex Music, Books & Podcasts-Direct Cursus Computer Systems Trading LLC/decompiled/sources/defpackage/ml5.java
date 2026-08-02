package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lml5;", "Ljnb;", "<init>", "()V", "complaint-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class ml5 extends jnb {
    public wl5 j;
    public final rjq k;
    public final um6 l;

    public ml5() {
        rjq rjqVar = new rjq(false);
        this.k = rjqVar;
        this.l = hld.s(rjqVar, dm6.b());
    }

    @Override // defpackage.jnb, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.k.g();
        String string = requireArguments().getString("key_track_id");
        Continuation continuation = null;
        if (string == null) {
            Assertions.throwOrSkip$default(new FailedAssertionException("No track id received"), null, 2, null);
            getParentFragmentManager().e0(new Bundle(), "send_complaint");
            return;
        }
        nl5 nl5Var = new nl5(string);
        wl5 wl5Var = (wl5) ((xiu) wdp.i0(this).e).x(nl5Var, nl5Var.toString(), ern.a(nl5.class), ern.a(wl5.class));
        this.j = wl5Var;
        x97.y(this.l, null, null, new vv4(wl5Var, this, continuation, 6), 3);
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        wl5 wl5Var = this.j;
        if (wl5Var == null) {
            return null;
        }
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        composeView.setViewCompositionStrategy(new sml(viewLifecycleOwner.getLifecycle()));
        composeView.setContent(new wn5(new ll5(wl5Var, 0, (byte) 0), 1138514662, true));
        return composeView;
    }

    @Override // androidx.fragment.app.o
    public final void onDestroy() {
        super.onDestroy();
        this.k.V();
    }
}
