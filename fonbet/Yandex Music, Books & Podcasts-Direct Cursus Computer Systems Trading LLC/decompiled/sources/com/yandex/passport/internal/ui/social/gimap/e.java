package com.yandex.passport.internal.ui.social.gimap;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.passport.R;
import com.yandex.passport.internal.ui.base.h;
import defpackage.b1r;
import defpackage.bjt;
import defpackage.ern;
import defpackage.gfu;
import defpackage.gr0;
import defpackage.is6;
import defpackage.jfu;
import defpackage.lm4;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public abstract class e<V extends com.yandex.passport.internal.ui.base.h> extends com.yandex.passport.internal.ui.base.d<V> {
    public static final Pattern l = Pattern.compile(".+@.+", 2);
    public gr0 j;
    public final d k = new d(this);

    public static boolean D(String str) {
        return !TextUtils.isEmpty(str) && l.matcher(str).find();
    }

    @Override // com.yandex.passport.internal.ui.base.d
    public final void A(boolean z) {
        gr0 gr0Var = this.j;
        if (z) {
            gr0Var.show();
        } else {
            gr0Var.dismiss();
        }
    }

    public abstract void E(p pVar);

    public final q F() {
        androidx.fragment.app.t requireActivity = requireActivity();
        requireActivity.getClass();
        jfu viewModelStore = requireActivity.getViewModelStore();
        gfu defaultViewModelProviderFactory = requireActivity.getDefaultViewModelProviderFactory();
        is6 defaultViewModelCreationExtras = requireActivity.getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        bjt bjtVar = new bjt(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        lm4 a = ern.a(q.class);
        String f = a.f();
        if (f != null) {
            return (q) bjtVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f));
        }
        xq0.x("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public abstract p G(p pVar);

    public abstract void H(f fVar);

    public abstract void I(Bundle bundle);

    public final void K(String str) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
        valueOf.setSpan(new RelativeSizeSpan(1.2f), 0, valueOf.length(), 0);
        b1r.g(requireActivity().findViewById(R.id.container), valueOf, 0).i();
    }

    @Override // androidx.fragment.app.o
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.j = com.yandex.passport.internal.ui.g.a(requireContext());
        ((ArrayList) ((com.yandex.passport.internal.ui.base.a) requireActivity()).d.c).add(this.k);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.yandex.passport.internal.ui.base.d, androidx.fragment.app.o
    public final void onViewStateRestored(Bundle bundle) {
        p pVar;
        super.onViewStateRestored(bundle);
        if (getView() == null) {
            return;
        }
        if (bundle == null) {
            q F = F();
            synchronized (F) {
                pVar = F.u;
            }
            E(pVar);
        }
        Bundle arguments = getArguments();
        arguments.getClass();
        I(arguments);
    }

    @Override // com.yandex.passport.internal.ui.base.d
    public final void z(com.yandex.passport.internal.ui.f fVar) {
        f fVar2;
        String str = fVar.a;
        f[] values = f.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                fVar2 = null;
                break;
            }
            fVar2 = values[i];
            if (fVar2.a.equals(str)) {
                break;
            } else {
                i++;
            }
        }
        if (fVar2 == null) {
            com.yandex.passport.internal.di.a.a().getEventReporter().k(fVar.b);
            if (fVar.a.equals("network error")) {
                K(getString(R.string.passport_error_network_fail));
            } else {
                K(getString(R.string.passport_error_unknown));
                return;
            }
        }
        switch (fVar2.ordinal()) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
                K(getString(fVar2.b));
                break;
            case 12:
            default:
                H(fVar2);
                break;
        }
    }
}
