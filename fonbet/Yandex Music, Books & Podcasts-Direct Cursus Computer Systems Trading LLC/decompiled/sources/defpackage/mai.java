package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.a;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lmai;", "Lhnb;", "<init>", "()V", "e3s", "shared-design"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class mai extends hnb {
    public sai k;
    public wn5 l;
    public Function0 m;
    public boolean n;
    public bzr o;

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        a28.b(this);
    }

    @Override // defpackage.hnb, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.k == null || this.l == null) {
            dismissAllowingStateLoss();
        } else {
            setStyle(2, R.style.ModalBottomSheet_Theme);
            setCancelable(true);
        }
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // defpackage.hnb, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onDetach() {
        super.onDetach();
        a28.c(this);
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        Function0 function0 = this.m;
        if (function0 != null) {
            function0.invoke();
        }
        this.m = null;
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        view.getClass();
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.getAttributes().windowAnimations = 0;
            q5g.I(window, false);
            window.setBackgroundDrawable(window.getContext().getDrawable(android.R.color.transparent));
            window.setLayout(-1, -1);
            sai saiVar = this.k;
            if (saiVar != null && saiVar.b) {
                Configuration configuration = getResources().getConfiguration();
                configuration.getClass();
                if (asq.I(configuration)) {
                    knn knnVar = new knn(window.getDecorView());
                    int i = Build.VERSION.SDK_INT;
                    (i >= 35 ? new oqv(window, knnVar) : i >= 30 ? new nqv(window, knnVar) : i >= 26 ? new mqv(window, knnVar) : new lqv(window, knnVar)).b0(519);
                }
            }
        }
        if (bundle != null) {
            dismissAllowingStateLoss();
            return;
        }
        View view2 = getView();
        ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
        if (viewGroup == null) {
            su4.s(2, null, "rootView can't be null", null);
        }
        if (viewGroup == null) {
            return;
        }
        sai saiVar2 = this.k;
        if (saiVar2 == null) {
            Intrinsics.j("state");
            throw null;
        }
        wn5 wn5Var = this.l;
        if (wn5Var == null) {
            Intrinsics.j("bottomSheetSlot");
            throw null;
        }
        lai laiVar = new lai(this, 0);
        lai laiVar2 = new lai(this, 1);
        Context context = viewGroup.getContext();
        context.getClass();
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        saiVar2.e = viewGroup;
        saiVar2.f = composeView;
        fnb m = this.i.m();
        cvo cvoVar = this.g;
        if (cvoVar == null) {
            Intrinsics.j("screenInfo");
            throw null;
        }
        composeView.setContent(new wn5(new bj(saiVar2, laiVar, laiVar2, new hai(m, cvoVar, d(), (tmb) this.j.getValue()), wn5Var, 29), 1044572382, true));
        viewGroup.addView(composeView);
    }

    @Override // defpackage.hnb, androidx.fragment.app.i
    public final void show(y yVar, String str) {
        yVar.getClass();
        yVar.getClass();
        a aVar = new a(yVar);
        aVar.d(0, this, str, 1);
        aVar.k(true, true);
    }

    public final void y(boolean z) {
        Dialog dialog;
        Window window;
        if (!this.n || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null) {
            return;
        }
        t requireActivity = requireActivity();
        requireActivity.getClass();
        boolean H = asq.H(requireActivity);
        if (!z) {
            bzr bzrVar = this.o;
            if (bzrVar != null) {
                c9g.u(window, vyr.StatusBar, bzrVar.a);
                if (!H) {
                    c9g.u(window, vyr.NavigationBar, bzrVar.b);
                }
            }
            this.o = null;
            return;
        }
        vyr vyrVar = vyr.StatusBar;
        boolean q = c9g.q(window, vyrVar);
        vyr vyrVar2 = vyr.NavigationBar;
        this.o = new bzr(q, c9g.q(window, vyrVar2));
        c9g.u(window, vyrVar, false);
        if (H) {
            return;
        }
        c9g.u(window, vyrVar2, false);
    }

    public final void z(boolean z) {
        Dialog dialog;
        Window window;
        if (Build.VERSION.SDK_INT < 29 || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null) {
            return;
        }
        if (!z) {
            if (z) {
                b6e.s();
                return;
            } else {
                window.setNavigationBarContrastEnforced(false);
                return;
            }
        }
        zne g = kqv.h(window.getDecorView(), window.getDecorView().getRootWindowInsets()).a.g(2);
        g.getClass();
        if (g.d > 0) {
            window.setNavigationBarContrastEnforced(!this.n);
        }
    }
}
