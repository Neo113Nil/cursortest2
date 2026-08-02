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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbz1;", "Ljnb;", "<init>", "()V", "nonmusic-collection-screens"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class bz1 extends jnb {
    public final jyr l;
    public final jyr m;
    public final le3 o;
    public final ybf j = new ybf(ern.a(kz1.class), new vz(14, this), new vz(15, new uu1(2)));
    public final jyr k = l18.b.b(hag.I(kaj.class), true);
    public final jyr n = btf.b(new uu1(3));

    public bz1() {
        final int i = 0;
        this.l = btf.b(new Function0(this) { // from class: zy1
            public final /* synthetic */ bz1 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        bz1 bz1Var = this.b;
                        kaj kajVar = (kaj) bz1Var.k.getValue();
                        kxi d = bz1Var.d();
                        kajVar.getClass();
                        return new hw4(d.a);
                    default:
                        bz1 bz1Var2 = this.b;
                        kaj kajVar2 = (kaj) bz1Var2.k.getValue();
                        t requireActivity = bz1Var2.requireActivity();
                        requireActivity.getClass();
                        kxi d2 = bz1Var2.d();
                        kajVar2.getClass();
                        return new gw4(requireActivity, d2);
                }
            }
        });
        final int i2 = 1;
        this.m = btf.b(new Function0(this) { // from class: zy1
            public final /* synthetic */ bz1 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        bz1 bz1Var = this.b;
                        kaj kajVar = (kaj) bz1Var.k.getValue();
                        kxi d = bz1Var.d();
                        kajVar.getClass();
                        return new hw4(d.a);
                    default:
                        bz1 bz1Var2 = this.b;
                        kaj kajVar2 = (kaj) bz1Var2.k.getValue();
                        t requireActivity = bz1Var2.requireActivity();
                        requireActivity.getClass();
                        kxi d2 = bz1Var2.d();
                        kajVar2.getClass();
                        return new gw4(requireActivity, d2);
                }
            }
        });
        le3 le3Var = new le3();
        le3Var.b = this;
        le3Var.a = o15.a;
        this.o = le3Var;
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
        composeView.setContent(new wn5(new az1(this, 0), 1824337455, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getJ() {
        return (cvo) this.n.getValue();
    }
}
