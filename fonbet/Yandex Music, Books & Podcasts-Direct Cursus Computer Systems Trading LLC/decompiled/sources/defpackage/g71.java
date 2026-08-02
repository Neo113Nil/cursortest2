package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg71;", "Ljnb;", "<init>", "()V", "artist-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class g71 extends jnb {
    public final znk j = new znk(3, this);
    public final jyr k;
    public final jyr l;

    public g71() {
        final int i = 0;
        this.k = btf.b(new Function0(this) { // from class: f71
            public final /* synthetic */ g71 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        g71 g71Var = this.b;
                        return new cvo(wjb.ArtistFamiliarToYouScreen, hlb.Fullscreen, (glb) null, (dvo) null, new avo(pkb.Artist, g71Var.A().b.a), 44);
                    default:
                        g71 g71Var2 = this.b;
                        l18 l18Var = l18.b;
                        bdt I = hag.I(ei1.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        t requireActivity = g71Var2.requireActivity();
                        requireActivity.getClass();
                        y childFragmentManager = g71Var2.getChildFragmentManager();
                        childFragmentManager.getClass();
                        u51 u51Var = g71Var2.A().b;
                        kxi d = g71Var2.d();
                        u51Var.getClass();
                        return new w61(requireActivity, childFragmentManager, u51Var, d);
                }
            }
        });
        final int i2 = 1;
        this.l = btf.b(new Function0(this) { // from class: f71
            public final /* synthetic */ g71 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        g71 g71Var = this.b;
                        return new cvo(wjb.ArtistFamiliarToYouScreen, hlb.Fullscreen, (glb) null, (dvo) null, new avo(pkb.Artist, g71Var.A().b.a), 44);
                    default:
                        g71 g71Var2 = this.b;
                        l18 l18Var = l18.b;
                        bdt I = hag.I(ei1.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        t requireActivity = g71Var2.requireActivity();
                        requireActivity.getClass();
                        y childFragmentManager = g71Var2.getChildFragmentManager();
                        childFragmentManager.getClass();
                        u51 u51Var = g71Var2.A().b;
                        kxi d = g71Var2.d();
                        u51Var.getClass();
                        return new w61(requireActivity, childFragmentManager, u51Var, d);
                }
            }
        });
    }

    public final j71 A() {
        Parcelable parcelable = requireArguments().getParcelable("artistFamiliar:args");
        if (parcelable != null) {
            return (j71) parcelable;
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
        composeView.setTag(R.id.consume_window_insets_tag, Boolean.FALSE);
        composeView.setContent(new wn5(new e71(this, 0), -130767239, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getL() {
        return (cvo) this.k.getValue();
    }
}
