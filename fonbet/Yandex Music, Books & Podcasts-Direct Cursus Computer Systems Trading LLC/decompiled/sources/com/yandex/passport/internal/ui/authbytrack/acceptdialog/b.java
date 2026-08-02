package com.yandex.passport.internal.ui.authbytrack.acceptdialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.passport.R;
import defpackage.bjt;
import defpackage.ern;
import defpackage.gfu;
import defpackage.is6;
import defpackage.jfu;
import defpackage.lm4;
import defpackage.xq0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/passport/internal/ui/authbytrack/acceptdialog/b;", "Lcom/yandex/passport/internal/ui/base/b;", "<init>", "()V", "passport_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class b extends com.yandex.passport.internal.ui.base.b {
    public static final String g;

    static {
        String canonicalName = b.class.getCanonicalName();
        canonicalName.getClass();
        g = canonicalName;
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        t requireActivity = requireActivity();
        requireActivity.getClass();
        jfu viewModelStore = requireActivity.getViewModelStore();
        gfu defaultViewModelProviderFactory = requireActivity.getDefaultViewModelProviderFactory();
        is6 defaultViewModelCreationExtras = requireActivity.getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        bjt bjtVar = new bjt(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        lm4 a = ern.a(c.class);
        String f = a.f();
        if (f == null) {
            xq0.x("Local and anonymous classes can not be ViewModels");
        } else {
            ((c) bjtVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f))).r.m(Boolean.TRUE);
            super.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.passport_dialog_accept_auth, viewGroup, false);
    }

    @Override // com.yandex.passport.internal.ui.base.b, androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        arguments.getClass();
        String string = arguments.getString("display_name");
        Button button = (Button) view.findViewById(R.id.button_accept);
        Button button2 = (Button) view.findViewById(R.id.button_cancel);
        TextView textView = (TextView) view.findViewById(R.id.qr_primary_text);
        final int i = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.authbytrack.acceptdialog.a
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                b bVar = this.b;
                switch (i2) {
                    case 0:
                        String str = b.g;
                        t requireActivity = bVar.requireActivity();
                        requireActivity.getClass();
                        jfu viewModelStore = requireActivity.getViewModelStore();
                        gfu defaultViewModelProviderFactory = requireActivity.getDefaultViewModelProviderFactory();
                        is6 defaultViewModelCreationExtras = requireActivity.getDefaultViewModelCreationExtras();
                        viewModelStore.getClass();
                        defaultViewModelProviderFactory.getClass();
                        defaultViewModelCreationExtras.getClass();
                        bjt bjtVar = new bjt(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
                        lm4 a = ern.a(c.class);
                        String f = a.f();
                        if (f == null) {
                            xq0.x("Local and anonymous classes can not be ViewModels");
                            break;
                        } else {
                            ((c) bjtVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f))).q.m(Boolean.TRUE);
                            bVar.dismiss();
                            break;
                        }
                    default:
                        String str2 = b.g;
                        t requireActivity2 = bVar.requireActivity();
                        requireActivity2.getClass();
                        jfu viewModelStore2 = requireActivity2.getViewModelStore();
                        gfu defaultViewModelProviderFactory2 = requireActivity2.getDefaultViewModelProviderFactory();
                        is6 defaultViewModelCreationExtras2 = requireActivity2.getDefaultViewModelCreationExtras();
                        viewModelStore2.getClass();
                        defaultViewModelProviderFactory2.getClass();
                        defaultViewModelCreationExtras2.getClass();
                        bjt bjtVar2 = new bjt(viewModelStore2, defaultViewModelProviderFactory2, defaultViewModelCreationExtras2);
                        lm4 a2 = ern.a(c.class);
                        String f2 = a2.f();
                        if (f2 == null) {
                            xq0.x("Local and anonymous classes can not be ViewModels");
                            break;
                        } else {
                            ((c) bjtVar2.j(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f2))).r.m(Boolean.TRUE);
                            bVar.dismiss();
                            break;
                        }
                }
            }
        });
        final int i2 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.authbytrack.acceptdialog.a
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i2;
                b bVar = this.b;
                switch (i22) {
                    case 0:
                        String str = b.g;
                        t requireActivity = bVar.requireActivity();
                        requireActivity.getClass();
                        jfu viewModelStore = requireActivity.getViewModelStore();
                        gfu defaultViewModelProviderFactory = requireActivity.getDefaultViewModelProviderFactory();
                        is6 defaultViewModelCreationExtras = requireActivity.getDefaultViewModelCreationExtras();
                        viewModelStore.getClass();
                        defaultViewModelProviderFactory.getClass();
                        defaultViewModelCreationExtras.getClass();
                        bjt bjtVar = new bjt(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
                        lm4 a = ern.a(c.class);
                        String f = a.f();
                        if (f == null) {
                            xq0.x("Local and anonymous classes can not be ViewModels");
                            break;
                        } else {
                            ((c) bjtVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f))).q.m(Boolean.TRUE);
                            bVar.dismiss();
                            break;
                        }
                    default:
                        String str2 = b.g;
                        t requireActivity2 = bVar.requireActivity();
                        requireActivity2.getClass();
                        jfu viewModelStore2 = requireActivity2.getViewModelStore();
                        gfu defaultViewModelProviderFactory2 = requireActivity2.getDefaultViewModelProviderFactory();
                        is6 defaultViewModelCreationExtras2 = requireActivity2.getDefaultViewModelCreationExtras();
                        viewModelStore2.getClass();
                        defaultViewModelProviderFactory2.getClass();
                        defaultViewModelCreationExtras2.getClass();
                        bjt bjtVar2 = new bjt(viewModelStore2, defaultViewModelProviderFactory2, defaultViewModelCreationExtras2);
                        lm4 a2 = ern.a(c.class);
                        String f2 = a2.f();
                        if (f2 == null) {
                            xq0.x("Local and anonymous classes can not be ViewModels");
                            break;
                        } else {
                            ((c) bjtVar2.j(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f2))).r.m(Boolean.TRUE);
                            bVar.dismiss();
                            break;
                        }
                }
            }
        });
        textView.setText(getString(R.string.passport_enter_into_account, string));
    }
}
