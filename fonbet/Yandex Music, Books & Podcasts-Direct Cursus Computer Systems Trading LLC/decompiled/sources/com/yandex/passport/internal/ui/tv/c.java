package com.yandex.passport.internal.ui.tv;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import com.airbnb.lottie.LottieAnimationView;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.passport.R;
import com.yandex.passport.api.w0;
import com.yandex.passport.api.y1;
import com.yandex.passport.internal.analytics.e;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.entities.h;
import com.yandex.passport.internal.ui.i;
import com.yandex.passport.internal.ui.sloth.q;
import com.yandex.passport.internal.ui.util.l;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.passport.internal.ui.webview.webcases.a0;
import com.yandex.passport.internal.util.p;
import com.yandex.passport.legacy.f;
import defpackage.gi;
import defpackage.ot0;
import defpackage.vh;
import defpackage.x97;
import defpackage.xq0;
import defpackage.xy0;
import defpackage.zh;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/passport/internal/ui/tv/c;", "Landroidx/fragment/app/o;", "<init>", "()V", "passport_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class c extends o {
    public static final String m;
    public d g;
    public o0 h;
    public boolean i;
    public View j;
    public h k;
    public final zh l;

    static {
        String canonicalName = c.class.getCanonicalName();
        canonicalName.getClass();
        m = canonicalName;
    }

    public c() {
        zh registerForActivityResult = registerForActivityResult(new vh(4), new gi(19, this));
        registerForActivityResult.getClass();
        this.l = registerForActivityResult;
    }

    @Override // androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        requireArguments.getClass();
        requireArguments.setClassLoader(p.class.getClassLoader());
        this.k = (h) requireArguments.getParcelable("passport-cookie");
        Bundle requireArguments2 = requireArguments();
        requireArguments2.getClass();
        com.yandex.passport.internal.properties.c cVar = (com.yandex.passport.internal.properties.c) requireArguments2.getParcelable("auth_by_qr_properties");
        if (cVar == null) {
            xq0.q("No auth_by_qr_properties in bundle");
            return;
        }
        this.i = cVar.e;
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.g = a.getAuthInWebViewViewModel();
        this.h = a.getEventReporter();
        if (bundle == null) {
            x(cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.passport_fragment_qr_on_tv, viewGroup, false);
        Bundle requireArguments = requireArguments();
        requireArguments.getClass();
        requireArguments.getClass();
        com.yandex.passport.internal.properties.c cVar = (com.yandex.passport.internal.properties.c) requireArguments.getParcelable("auth_by_qr_properties");
        if (cVar == null) {
            xq0.q("No auth_by_qr_properties in bundle");
            return null;
        }
        Integer num = cVar.f;
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.container);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate.findViewById(R.id.lottie);
        lottieAnimationView.setVisibility(8);
        if (num != null) {
            lottieAnimationView.setAnimation(num.intValue());
        }
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.progress);
        progressBar.setVisibility(8);
        Integer num2 = cVar.g;
        if (num2 != null) {
            frameLayout.setBackground(requireContext().getDrawable(num2.intValue()));
        }
        if (num == null) {
            f.a(requireContext(), progressBar, R.color.passport_progress_bar);
            lottieAnimationView = progressBar;
        }
        this.j = lottieAnimationView;
        return inflate;
    }

    @Override // androidx.fragment.app.o
    public final void onDestroyView() {
        this.j = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.o
    public final void onPause() {
        d dVar = this.g;
        if (dVar == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        dVar.t.k(this);
        d dVar2 = this.g;
        if (dVar2 == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        dVar2.k.k(this);
        View view = this.j;
        if (view instanceof LottieAnimationView) {
            ((LottieAnimationView) view).clearAnimation();
            View view2 = this.j;
            view2.getClass();
            ((LottieAnimationView) view2).cancelAnimation();
        }
        View view3 = this.j;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.o
    public final void onResume() {
        super.onResume();
        View view = this.j;
        if (view instanceof LottieAnimationView) {
            view.getClass();
            ((LottieAnimationView) view).playAnimation();
        }
        View view2 = this.j;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        d dVar = this.g;
        if (dVar == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        final int i = 0;
        dVar.t.n(getViewLifecycleOwner(), new l(this) { // from class: com.yandex.passport.internal.ui.tv.a
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.xjj
            public final void onChanged(Object obj) {
                int i2 = i;
                final c cVar = this.b;
                final int i3 = 0;
                switch (i2) {
                    case 0:
                        com.yandex.passport.internal.l lVar = (com.yandex.passport.internal.l) obj;
                        String str = c.m;
                        lVar.getClass();
                        o0 o0Var = cVar.h;
                        if (o0Var == null) {
                            Intrinsics.j("eventReporter");
                            throw null;
                        }
                        o0Var.c(lVar, false);
                        com.yandex.passport.common.core.f fVar = lVar.b;
                        o0 o0Var2 = cVar.h;
                        if (o0Var2 == null) {
                            Intrinsics.j("eventReporter");
                            throw null;
                        }
                        fVar.getClass();
                        o0Var2.a.b(e.d, new xy0(0));
                        t requireActivity = cVar.requireActivity();
                        requireActivity.getClass();
                        com.yandex.passport.internal.ui.a.r(requireActivity, com.yandex.plus.core.network.api.utils.a.F(new com.yandex.passport.api.t(com.yandex.plus.pay.ui.core.b.J(fVar), com.yandex.plus.core.locale.b.B(lVar), w0.k, null, null)));
                        return;
                    default:
                        com.yandex.passport.internal.ui.f fVar2 = (com.yandex.passport.internal.ui.f) obj;
                        String str2 = c.m;
                        fVar2.getClass();
                        String str3 = fVar2.a;
                        if (Intrinsics.d(str3, "fake.user.cancelled")) {
                            t requireActivity2 = cVar.requireActivity();
                            requireActivity2.setResult(0);
                            requireActivity2.finish();
                            return;
                        }
                        if (cVar.i) {
                            d dVar2 = cVar.g;
                            if (dVar2 == null) {
                                Intrinsics.j("viewModel");
                                throw null;
                            }
                            int b = dVar2.s.b(str3);
                            Intent intent = new Intent();
                            String string = cVar.getString(b);
                            string.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("passport-login-error-text", string);
                            intent.putExtras(bundle2);
                            t requireActivity3 = cVar.requireActivity();
                            requireActivity3.setResult(5, intent);
                            requireActivity3.finish();
                            return;
                        }
                        Context requireContext = cVar.requireContext();
                        i iVar = new i(requireContext);
                        d dVar3 = cVar.g;
                        if (dVar3 == null) {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                        iVar.b(dVar3.s.b(str3));
                        iVar.c(R.string.passport_reg_try_again, new DialogInterface.OnClickListener() { // from class: com.yandex.passport.internal.ui.tv.b
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i4) {
                                int i5 = i3;
                                c cVar2 = cVar;
                                switch (i5) {
                                    case 0:
                                        h hVar = cVar2.k;
                                        if (hVar != null) {
                                            d dVar4 = cVar2.g;
                                            if (dVar4 == null) {
                                                Intrinsics.j("viewModel");
                                                throw null;
                                            }
                                            dVar4.l.m(Boolean.TRUE);
                                            x97.y(ot0.F(dVar4), null, null, new q(dVar4, hVar, (Continuation) null, 14), 3);
                                            return;
                                        }
                                        Bundle requireArguments = cVar2.requireArguments();
                                        requireArguments.getClass();
                                        com.yandex.passport.internal.properties.c cVar3 = (com.yandex.passport.internal.properties.c) requireArguments.getParcelable("auth_by_qr_properties");
                                        if (cVar3 != null) {
                                            cVar2.x(cVar3);
                                            return;
                                        } else {
                                            xq0.q("No auth_by_qr_properties in bundle");
                                            return;
                                        }
                                    default:
                                        String str4 = c.m;
                                        t requireActivity4 = cVar2.requireActivity();
                                        requireActivity4.setResult(0);
                                        requireActivity4.finish();
                                        return;
                                }
                            }
                        });
                        int i4 = R.string.passport_reg_cancel;
                        final int i5 = 1;
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.yandex.passport.internal.ui.tv.b
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i42) {
                                int i52 = i5;
                                c cVar2 = cVar;
                                switch (i52) {
                                    case 0:
                                        h hVar = cVar2.k;
                                        if (hVar != null) {
                                            d dVar4 = cVar2.g;
                                            if (dVar4 == null) {
                                                Intrinsics.j("viewModel");
                                                throw null;
                                            }
                                            dVar4.l.m(Boolean.TRUE);
                                            x97.y(ot0.F(dVar4), null, null, new q(dVar4, hVar, (Continuation) null, 14), 3);
                                            return;
                                        }
                                        Bundle requireArguments = cVar2.requireArguments();
                                        requireArguments.getClass();
                                        com.yandex.passport.internal.properties.c cVar3 = (com.yandex.passport.internal.properties.c) requireArguments.getParcelable("auth_by_qr_properties");
                                        if (cVar3 != null) {
                                            cVar2.x(cVar3);
                                            return;
                                        } else {
                                            xq0.q("No auth_by_qr_properties in bundle");
                                            return;
                                        }
                                    default:
                                        String str4 = c.m;
                                        t requireActivity4 = cVar2.requireActivity();
                                        requireActivity4.setResult(0);
                                        requireActivity4.finish();
                                        return;
                                }
                            }
                        };
                        iVar.i = requireContext.getText(i4);
                        iVar.j = onClickListener;
                        iVar.d = new com.yandex.passport.internal.ui.b(4, cVar);
                        iVar.a();
                        return;
                }
            }
        });
        d dVar2 = this.g;
        if (dVar2 == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        final int i2 = 1;
        dVar2.k.n(getViewLifecycleOwner(), new l(this) { // from class: com.yandex.passport.internal.ui.tv.a
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.xjj
            public final void onChanged(Object obj) {
                int i22 = i2;
                final c cVar = this.b;
                final int i3 = 0;
                switch (i22) {
                    case 0:
                        com.yandex.passport.internal.l lVar = (com.yandex.passport.internal.l) obj;
                        String str = c.m;
                        lVar.getClass();
                        o0 o0Var = cVar.h;
                        if (o0Var == null) {
                            Intrinsics.j("eventReporter");
                            throw null;
                        }
                        o0Var.c(lVar, false);
                        com.yandex.passport.common.core.f fVar = lVar.b;
                        o0 o0Var2 = cVar.h;
                        if (o0Var2 == null) {
                            Intrinsics.j("eventReporter");
                            throw null;
                        }
                        fVar.getClass();
                        o0Var2.a.b(e.d, new xy0(0));
                        t requireActivity = cVar.requireActivity();
                        requireActivity.getClass();
                        com.yandex.passport.internal.ui.a.r(requireActivity, com.yandex.plus.core.network.api.utils.a.F(new com.yandex.passport.api.t(com.yandex.plus.pay.ui.core.b.J(fVar), com.yandex.plus.core.locale.b.B(lVar), w0.k, null, null)));
                        return;
                    default:
                        com.yandex.passport.internal.ui.f fVar2 = (com.yandex.passport.internal.ui.f) obj;
                        String str2 = c.m;
                        fVar2.getClass();
                        String str3 = fVar2.a;
                        if (Intrinsics.d(str3, "fake.user.cancelled")) {
                            t requireActivity2 = cVar.requireActivity();
                            requireActivity2.setResult(0);
                            requireActivity2.finish();
                            return;
                        }
                        if (cVar.i) {
                            d dVar22 = cVar.g;
                            if (dVar22 == null) {
                                Intrinsics.j("viewModel");
                                throw null;
                            }
                            int b = dVar22.s.b(str3);
                            Intent intent = new Intent();
                            String string = cVar.getString(b);
                            string.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("passport-login-error-text", string);
                            intent.putExtras(bundle2);
                            t requireActivity3 = cVar.requireActivity();
                            requireActivity3.setResult(5, intent);
                            requireActivity3.finish();
                            return;
                        }
                        Context requireContext = cVar.requireContext();
                        i iVar = new i(requireContext);
                        d dVar3 = cVar.g;
                        if (dVar3 == null) {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                        iVar.b(dVar3.s.b(str3));
                        iVar.c(R.string.passport_reg_try_again, new DialogInterface.OnClickListener() { // from class: com.yandex.passport.internal.ui.tv.b
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i42) {
                                int i52 = i3;
                                c cVar2 = cVar;
                                switch (i52) {
                                    case 0:
                                        h hVar = cVar2.k;
                                        if (hVar != null) {
                                            d dVar4 = cVar2.g;
                                            if (dVar4 == null) {
                                                Intrinsics.j("viewModel");
                                                throw null;
                                            }
                                            dVar4.l.m(Boolean.TRUE);
                                            x97.y(ot0.F(dVar4), null, null, new q(dVar4, hVar, (Continuation) null, 14), 3);
                                            return;
                                        }
                                        Bundle requireArguments = cVar2.requireArguments();
                                        requireArguments.getClass();
                                        com.yandex.passport.internal.properties.c cVar3 = (com.yandex.passport.internal.properties.c) requireArguments.getParcelable("auth_by_qr_properties");
                                        if (cVar3 != null) {
                                            cVar2.x(cVar3);
                                            return;
                                        } else {
                                            xq0.q("No auth_by_qr_properties in bundle");
                                            return;
                                        }
                                    default:
                                        String str4 = c.m;
                                        t requireActivity4 = cVar2.requireActivity();
                                        requireActivity4.setResult(0);
                                        requireActivity4.finish();
                                        return;
                                }
                            }
                        });
                        int i4 = R.string.passport_reg_cancel;
                        final int i5 = 1;
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.yandex.passport.internal.ui.tv.b
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i42) {
                                int i52 = i5;
                                c cVar2 = cVar;
                                switch (i52) {
                                    case 0:
                                        h hVar = cVar2.k;
                                        if (hVar != null) {
                                            d dVar4 = cVar2.g;
                                            if (dVar4 == null) {
                                                Intrinsics.j("viewModel");
                                                throw null;
                                            }
                                            dVar4.l.m(Boolean.TRUE);
                                            x97.y(ot0.F(dVar4), null, null, new q(dVar4, hVar, (Continuation) null, 14), 3);
                                            return;
                                        }
                                        Bundle requireArguments = cVar2.requireArguments();
                                        requireArguments.getClass();
                                        com.yandex.passport.internal.properties.c cVar3 = (com.yandex.passport.internal.properties.c) requireArguments.getParcelable("auth_by_qr_properties");
                                        if (cVar3 != null) {
                                            cVar2.x(cVar3);
                                            return;
                                        } else {
                                            xq0.q("No auth_by_qr_properties in bundle");
                                            return;
                                        }
                                    default:
                                        String str4 = c.m;
                                        t requireActivity4 = cVar2.requireActivity();
                                        requireActivity4.setResult(0);
                                        requireActivity4.finish();
                                        return;
                                }
                            }
                        };
                        iVar.i = requireContext.getText(i4);
                        iVar.j = onClickListener;
                        iVar.d = new com.yandex.passport.internal.ui.b(4, cVar);
                        iVar.a();
                        return;
                }
            }
        });
    }

    public final void x(com.yandex.passport.internal.properties.c cVar) {
        int i = WebViewActivity.h;
        com.yandex.passport.api.impl.b bVar = cVar.b;
        Context requireContext = requireContext();
        requireContext.getClass();
        y1 y1Var = cVar.a;
        a0 a0Var = a0.AUTH_ON_TV;
        boolean z = cVar.c;
        boolean z2 = cVar.d;
        boolean z3 = cVar.e;
        Integer num = cVar.f;
        Integer num2 = cVar.g;
        boolean z4 = cVar.h;
        String str = cVar.i;
        Bundle bundle = new Bundle();
        bundle.putBoolean("show_skip_button", z);
        bundle.putBoolean("show_settings_button", z2);
        bundle.putBoolean("finish_without_dialog_on_error", z3);
        if (num != null) {
            bundle.putInt("lottie_spinner_res_id", num.intValue());
        }
        if (num2 != null) {
            bundle.putInt("background_res_id", num2.intValue());
        }
        bundle.putBoolean("skip_back_button", z4);
        bundle.putString("origin", str);
        this.l.a(com.yandex.passport.data.network.token.i.e(bVar, requireContext, y1Var, a0Var, bundle));
    }
}
