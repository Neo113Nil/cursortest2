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
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llam;", "Ljnb;", "<init>", "()V", "nonmusic-collection-screens"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class lam extends jnb {
    public final jyr l;
    public final jyr m;
    public final ybf j = new ybf(ern.a(tam.class), new lvj(10, this), new lvj(11, new hvl(16)));
    public final jyr k = l18.b.b(hag.I(laj.class), true);
    public final jyr n = btf.b(new hvl(17));
    public final nnd o = new nnd(this);

    public lam() {
        final int i = 0;
        this.l = btf.b(new Function0(this) { // from class: jam
            public final /* synthetic */ lam b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        lam lamVar = this.b;
                        laj lajVar = (laj) lamVar.k.getValue();
                        kxi d = lamVar.d();
                        lajVar.getClass();
                        return new g35(d.a);
                    default:
                        lam lamVar2 = this.b;
                        laj lajVar2 = (laj) lamVar2.k.getValue();
                        t requireActivity = lamVar2.requireActivity();
                        requireActivity.getClass();
                        kxi d2 = lamVar2.d();
                        lajVar2.getClass();
                        return new f35(requireActivity, d2);
                }
            }
        });
        final int i2 = 1;
        this.m = btf.b(new Function0(this) { // from class: jam
            public final /* synthetic */ lam b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        lam lamVar = this.b;
                        laj lajVar = (laj) lamVar.k.getValue();
                        kxi d = lamVar.d();
                        lajVar.getClass();
                        return new g35(d.a);
                    default:
                        lam lamVar2 = this.b;
                        laj lajVar2 = (laj) lamVar2.k.getValue();
                        t requireActivity = lamVar2.requireActivity();
                        requireActivity.getClass();
                        kxi d2 = lamVar2.d();
                        lajVar2.getClass();
                        return new f35(requireActivity, d2);
                }
            }
        });
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
        composeView.setContent(new wn5(new kam(this, 0), 1776095040, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getK() {
        return (cvo) this.n.getValue();
    }
}
