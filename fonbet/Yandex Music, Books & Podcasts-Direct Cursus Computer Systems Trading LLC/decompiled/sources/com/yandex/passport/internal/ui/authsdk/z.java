package com.yandex.passport.internal.ui.authsdk;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.passport.R;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import defpackage.bjt;
import defpackage.e3o;
import defpackage.ern;
import defpackage.gfu;
import defpackage.is6;
import defpackage.jfu;
import defpackage.l7w;
import defpackage.lm4;
import defpackage.xjj;
import defpackage.xq0;
import defpackage.xy0;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/passport/internal/ui/authsdk/z;", "Lcom/yandex/passport/internal/ui/base/b;", "Lcom/yandex/passport/internal/ui/authsdk/o;", "<init>", "()V", "passport_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class z extends com.yandex.passport.internal.ui.base.b implements o {
    public com.yandex.passport.internal.network.requester.e g;
    public ImageView h;
    public ImageView i;
    public TextView j;
    public TextView k;
    public TextView l;
    public ProgressBar m;
    public View n;
    public View o;
    public View p;
    public View q;
    public Button r;
    public q s;
    public k t;

    @Override // androidx.fragment.app.o
    public final void onActivityResult(int i, int i2, Intent intent) {
        k kVar = this.t;
        if (kVar == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        if (i != 400) {
            com.yandex.passport.legacy.a.d(new IllegalStateException("Unknown request or illegal state"));
            return;
        }
        if (i2 == -1 && intent != null) {
            kVar.v = new s(com.yandex.plus.pay.ui.core.b.K(com.yandex.plus.core.locale.b.j(intent.getExtras()).a));
            kVar.O();
            return;
        }
        b0 b0Var = (b0) kVar.v;
        com.yandex.passport.common.core.f fVar = b0Var.a;
        if (fVar != null && !b0Var.b) {
            kVar.v = new s(fVar);
            kVar.O();
            com.yandex.passport.legacy.a.e(4, "Change account cancelled", null);
        } else {
            kVar.q.l(new h(0));
            o0 o0Var = kVar.w;
            o0Var.getClass();
            xy0 xy0Var = new xy0(0);
            xy0Var.put("step", "1");
            o0Var.a.b(com.yandex.passport.internal.analytics.g.d, xy0Var);
        }
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onCancel(dialogInterface);
        q qVar = this.s;
        if (qVar != null) {
            qVar.m.l(Unit.a);
        } else {
            Intrinsics.j("commonViewModel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        requireArguments.getClass();
        Parcelable parcelable = requireArguments.getParcelable("auth_sdk_properties");
        parcelable.getClass();
        final l lVar = (l) parcelable;
        final PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.g = a.getImageLoadingClient();
        this.t = (k) com.yandex.passport.internal.w.e(this, new Callable() { // from class: com.yandex.passport.internal.ui.authsdk.y
            @Override // java.util.concurrent.Callable
            public final Object call() {
                PassportProcessGlobalComponent passportProcessGlobalComponent = PassportProcessGlobalComponent.this;
                o0 eventReporter = passportProcessGlobalComponent.getEventReporter();
                com.yandex.passport.internal.core.accounts.e accountsRetriever = passportProcessGlobalComponent.getAccountsRetriever();
                com.yandex.passport.internal.core.accounts.i accountsUpdater = passportProcessGlobalComponent.getAccountsUpdater();
                com.yandex.passport.internal.network.client.h clientChooser = passportProcessGlobalComponent.getClientChooser();
                this.requireActivity().getApplication();
                passportProcessGlobalComponent.getPersonProfileHelper();
                return new k(eventReporter, accountsRetriever, accountsUpdater, clientChooser, lVar, passportProcessGlobalComponent.getSuggestedLanguageUseCase(), bundle);
            }
        });
        androidx.fragment.app.t requireActivity = requireActivity();
        requireActivity.getClass();
        jfu viewModelStore = requireActivity.getViewModelStore();
        gfu defaultViewModelProviderFactory = requireActivity.getDefaultViewModelProviderFactory();
        is6 defaultViewModelCreationExtras = requireActivity.getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        bjt bjtVar = new bjt(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        lm4 a2 = ern.a(q.class);
        String f = a2.f();
        if (f != null) {
            this.s = (q) bjtVar.j(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f));
        } else {
            xq0.x("Local and anonymous classes can not be ViewModels");
        }
    }

    @Override // defpackage.af3, defpackage.hr0, androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.getClass();
        onCreateDialog.setOnShowListener(new l7w(1, this));
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.passport_dialog_turboapp_scopes, viewGroup, false);
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        q qVar = this.s;
        if (qVar != null) {
            qVar.m.l(Unit.a);
        } else {
            Intrinsics.j("commonViewModel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        k kVar = this.t;
        if (kVar != null) {
            kVar.J(bundle);
        } else {
            Intrinsics.j("viewModel");
            throw null;
        }
    }

    @Override // com.yandex.passport.internal.ui.base.b, androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.image_app_icon);
        findViewById.getClass();
        ImageView imageView = (ImageView) findViewById;
        this.h = imageView;
        imageView.setClipToOutline(true);
        View findViewById2 = view.findViewById(R.id.image_avatar);
        findViewById2.getClass();
        this.i = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.text_title);
        findViewById3.getClass();
        this.j = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.text_primary_display_name);
        findViewById4.getClass();
        this.k = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.text_scopes);
        findViewById5.getClass();
        this.l = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.progress_with_account);
        findViewById6.getClass();
        this.m = (ProgressBar) findViewById6;
        View findViewById7 = view.findViewById(R.id.layout_content);
        findViewById7.getClass();
        this.n = findViewById7;
        View findViewById8 = view.findViewById(R.id.layout_buttons);
        findViewById8.getClass();
        this.o = findViewById8;
        View findViewById9 = view.findViewById(R.id.layout_app_icon);
        findViewById9.getClass();
        this.p = findViewById9;
        View findViewById10 = view.findViewById(R.id.layout_account);
        findViewById10.getClass();
        this.q = findViewById10;
        View findViewById11 = view.findViewById(R.id.button_retry);
        findViewById11.getClass();
        this.r = (Button) findViewById11;
        Context requireContext = requireContext();
        ProgressBar progressBar = this.m;
        if (progressBar == null) {
            Intrinsics.j("progressWithAccount");
            throw null;
        }
        com.yandex.passport.legacy.f.a(requireContext, progressBar, R.color.passport_progress_bar);
        final int i = 0;
        ((Button) view.findViewById(R.id.button_accept)).setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.authsdk.w
            public final /* synthetic */ z b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        k kVar = this.b.t;
                        if (kVar != null) {
                            kVar.M();
                            return;
                        } else {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                    case 1:
                        k kVar2 = this.b.t;
                        if (kVar2 == null) {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                        kVar2.q.l(new h(1));
                        o0 o0Var = kVar2.w;
                        String str = kVar2.y.a;
                        o0Var.getClass();
                        str.getClass();
                        xy0 xy0Var = new xy0(0);
                        xy0Var.put("reporter", str);
                        o0Var.a.b(com.yandex.passport.internal.analytics.q.d, xy0Var);
                        return;
                    default:
                        k kVar3 = this.b.t;
                        if (kVar3 != null) {
                            kVar3.O();
                            return;
                        } else {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                }
            }
        });
        final int i2 = 1;
        ((Button) view.findViewById(R.id.button_decline)).setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.authsdk.w
            public final /* synthetic */ z b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i2) {
                    case 0:
                        k kVar = this.b.t;
                        if (kVar != null) {
                            kVar.M();
                            return;
                        } else {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                    case 1:
                        k kVar2 = this.b.t;
                        if (kVar2 == null) {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                        kVar2.q.l(new h(1));
                        o0 o0Var = kVar2.w;
                        String str = kVar2.y.a;
                        o0Var.getClass();
                        str.getClass();
                        xy0 xy0Var = new xy0(0);
                        xy0Var.put("reporter", str);
                        o0Var.a.b(com.yandex.passport.internal.analytics.q.d, xy0Var);
                        return;
                    default:
                        k kVar3 = this.b.t;
                        if (kVar3 != null) {
                            kVar3.O();
                            return;
                        } else {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                }
            }
        });
        Button button = this.r;
        if (button == null) {
            Intrinsics.j("buttonRetry");
            throw null;
        }
        final int i3 = 2;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.authsdk.w
            public final /* synthetic */ z b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i3) {
                    case 0:
                        k kVar = this.b.t;
                        if (kVar != null) {
                            kVar.M();
                            return;
                        } else {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                    case 1:
                        k kVar2 = this.b.t;
                        if (kVar2 == null) {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                        kVar2.q.l(new h(1));
                        o0 o0Var = kVar2.w;
                        String str = kVar2.y.a;
                        o0Var.getClass();
                        str.getClass();
                        xy0 xy0Var = new xy0(0);
                        xy0Var.put("reporter", str);
                        o0Var.a.b(com.yandex.passport.internal.analytics.q.d, xy0Var);
                        return;
                    default:
                        k kVar3 = this.b.t;
                        if (kVar3 != null) {
                            kVar3.O();
                            return;
                        } else {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                }
            }
        });
        k kVar = this.t;
        if (kVar == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        final int i4 = 0;
        kVar.r.f(getViewLifecycleOwner(), new xjj(this) { // from class: com.yandex.passport.internal.ui.authsdk.x
            public final /* synthetic */ z b;

            {
                this.b = this;
            }

            @Override // defpackage.xjj
            public final void onChanged(Object obj) {
                switch (i4) {
                    case 0:
                        com.yandex.passport.internal.ui.base.l lVar = (com.yandex.passport.internal.ui.base.l) obj;
                        z zVar = this.b;
                        zVar.startActivityForResult(lVar.a(zVar.requireContext()), lVar.b);
                        return;
                    case 1:
                        ((g) obj).a(this.b);
                        return;
                    default:
                        com.yandex.passport.internal.ui.f fVar = (com.yandex.passport.internal.ui.f) obj;
                        q qVar = this.b.s;
                        if (qVar == null) {
                            Intrinsics.j("commonViewModel");
                            throw null;
                        }
                        fVar.getClass();
                        qVar.n.add(fVar.a);
                        return;
                }
            }
        });
        k kVar2 = this.t;
        if (kVar2 == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        final int i5 = 1;
        kVar2.q.f(getViewLifecycleOwner(), new xjj(this) { // from class: com.yandex.passport.internal.ui.authsdk.x
            public final /* synthetic */ z b;

            {
                this.b = this;
            }

            @Override // defpackage.xjj
            public final void onChanged(Object obj) {
                switch (i5) {
                    case 0:
                        com.yandex.passport.internal.ui.base.l lVar = (com.yandex.passport.internal.ui.base.l) obj;
                        z zVar = this.b;
                        zVar.startActivityForResult(lVar.a(zVar.requireContext()), lVar.b);
                        return;
                    case 1:
                        ((g) obj).a(this.b);
                        return;
                    default:
                        com.yandex.passport.internal.ui.f fVar = (com.yandex.passport.internal.ui.f) obj;
                        q qVar = this.b.s;
                        if (qVar == null) {
                            Intrinsics.j("commonViewModel");
                            throw null;
                        }
                        fVar.getClass();
                        qVar.n.add(fVar.a);
                        return;
                }
            }
        });
        k kVar3 = this.t;
        if (kVar3 == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        final int i6 = 2;
        kVar3.k.f(getViewLifecycleOwner(), new xjj(this) { // from class: com.yandex.passport.internal.ui.authsdk.x
            public final /* synthetic */ z b;

            {
                this.b = this;
            }

            @Override // defpackage.xjj
            public final void onChanged(Object obj) {
                switch (i6) {
                    case 0:
                        com.yandex.passport.internal.ui.base.l lVar = (com.yandex.passport.internal.ui.base.l) obj;
                        z zVar = this.b;
                        zVar.startActivityForResult(lVar.a(zVar.requireContext()), lVar.b);
                        return;
                    case 1:
                        ((g) obj).a(this.b);
                        return;
                    default:
                        com.yandex.passport.internal.ui.f fVar = (com.yandex.passport.internal.ui.f) obj;
                        q qVar = this.b.s;
                        if (qVar == null) {
                            Intrinsics.j("commonViewModel");
                            throw null;
                        }
                        fVar.getClass();
                        qVar.n.add(fVar.a);
                        return;
                }
            }
        });
    }

    public final void z(com.yandex.passport.internal.l lVar) {
        String g;
        View view = this.q;
        if (view == null) {
            Intrinsics.j("layoutAccount");
            throw null;
        }
        view.setVisibility(0);
        TextView textView = this.k;
        if (textView == null) {
            Intrinsics.j("textDisplayName");
            throw null;
        }
        Context requireContext = requireContext();
        String i = lVar.i();
        SpannableString spannableString = new SpannableString(i);
        if (!TextUtils.isEmpty(i)) {
            spannableString.setSpan(new ForegroundColorSpan(requireContext.getColor(R.color.passport_login_first_character)), 0, 1, 33);
        }
        textView.setText(spannableString);
        if (lVar.e.k || (g = lVar.g()) == null) {
            g = null;
        }
        ImageView imageView = this.i;
        if (g == null) {
            if (imageView == null) {
                Intrinsics.j("imageAvatar");
                throw null;
            }
            Resources resources = getResources();
            int i2 = R.drawable.passport_ico_user;
            Resources.Theme theme = requireActivity().getTheme();
            ThreadLocal threadLocal = e3o.a;
            imageView.setImageDrawable(resources.getDrawable(i2, theme));
            return;
        }
        if (imageView == null) {
            Intrinsics.j("imageAvatar");
            throw null;
        }
        if (Intrinsics.d(imageView.getTag(), g)) {
            return;
        }
        ImageView imageView2 = this.i;
        if (imageView2 == null) {
            Intrinsics.j("imageAvatar");
            throw null;
        }
        Resources resources2 = getResources();
        int i3 = R.drawable.passport_ico_user;
        Resources.Theme theme2 = requireActivity().getTheme();
        ThreadLocal threadLocal2 = e3o.a;
        imageView2.setImageDrawable(resources2.getDrawable(i3, theme2));
        ImageView imageView3 = this.i;
        if (imageView3 == null) {
            Intrinsics.j("imageAvatar");
            throw null;
        }
        String g2 = lVar.g();
        if (g2 == null) {
            g2 = null;
        }
        imageView3.setTag(g2);
        k kVar = this.t;
        if (kVar == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        com.yandex.passport.internal.network.requester.e eVar = this.g;
        if (eVar == null) {
            Intrinsics.j("imageLoadingClient");
            throw null;
        }
        String g3 = lVar.g();
        String str = g3 != null ? g3 : null;
        str.getClass();
        kVar.m.a(new com.yandex.passport.legacy.lx.e(eVar.a(str)).h(new com.yandex.passport.internal.ui.l(3, this, lVar), new androidx.core.app.q(16)));
    }
}
