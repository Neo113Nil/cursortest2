package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.payment.sdk.ui.view.ProgressResultView;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lei6;", "Ledu;", "Lrhk;", "<init>", "()V", "eg6", "ci6", "paymentsdk_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class ei6 extends edu<rhk> {
    public ki6 h;
    public eg6 i;
    public boolean j;

    @Override // androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        eg6 eg6Var = this.i;
        if (eg6Var == null) {
            return;
        }
        Pair pair = eg6Var.b;
        ci6 ci6Var = new ci6((hek) pair.a, (egk) pair.b, eg6Var);
        jfu viewModelStore = getViewModelStore();
        is6 defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelCreationExtras.getClass();
        bjt bjtVar = new bjt(viewModelStore, ci6Var, defaultViewModelCreationExtras);
        lm4 a = ern.a(ki6.class);
        String f = a.f();
        if (f != null) {
            this.h = (ki6) bjtVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f));
        } else {
            xq0.x("Local and anonymous classes can not be ViewModels");
        }
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.paymentsdk_fragment_continue, viewGroup, false);
        ProgressResultView progressResultView = (ProgressResultView) dag.v(R.id.progress_result_view, inflate);
        if (progressResultView == null) {
            jj4.j("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.progress_result_view)));
            return null;
        }
        FrameLayout frameLayout = (FrameLayout) inflate;
        this.g = new rhk(frameLayout, progressResultView);
        frameLayout.getClass();
        return frameLayout;
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        eg6 eg6Var = this.i;
        if (eg6Var == null) {
            return;
        }
        Resources.Theme theme = requireActivity().getTheme();
        theme.getClass();
        int i = 0;
        this.j = ocg.A(theme, R.attr.paymentsdk_showFooterOnSelectOnly, false);
        ki6 ki6Var = this.h;
        if (ki6Var == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        ki6Var.l.f(getViewLifecycleOwner(), new di6(new m40(25, this), i));
        ((rhk) x()).a.setExitButtonCallback(new e65(0, eg6Var, eg6.class, "showConfirmDialog", "showConfirmDialog()V", 0, 29));
        ProgressResultView progressResultView = ((rhk) x()).a;
        t l = l();
        progressResultView.setBrandIconVisible(!qdq.B((l instanceof ddu ? (ddu) l : null) != null ? Boolean.valueOf(r0.m()) : null));
        eg6Var.a.H(false);
    }
}
