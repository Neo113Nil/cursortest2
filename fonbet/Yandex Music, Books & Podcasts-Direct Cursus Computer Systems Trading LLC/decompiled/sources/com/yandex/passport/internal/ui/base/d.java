package com.yandex.passport.internal.ui.base;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.fragment.app.o;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.ui.base.h;
import com.yandex.passport.internal.w;
import defpackage.dzf;
import defpackage.tn3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class d<V extends h> extends o {
    public h g;
    public PassportProcessGlobalComponent h;
    public final ArrayList i = new ArrayList();

    public static void B(View view, TextView textView) {
        Context context = view.getContext();
        if (context == null) {
            return;
        }
        com.yandex.passport.legacy.d dVar = new com.yandex.passport.legacy.d(new Handler(Looper.getMainLooper()), textView, view);
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        view.requestFocus();
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 0, dVar);
        }
    }

    public abstract void A(boolean z);

    @Override // androidx.fragment.app.o
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.h == null) {
            this.h = com.yandex.passport.internal.di.a.a();
        }
        this.g = w.e(this, new tn3(9, this));
    }

    @Override // androidx.fragment.app.o
    public void onDestroyView() {
        super.onDestroyView();
        ArrayList arrayList = this.i;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Dialog dialog = (Dialog) ((WeakReference) it.next()).get();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
        arrayList.clear();
    }

    @Override // androidx.fragment.app.o
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.g.J(bundle);
    }

    @Override // androidx.fragment.app.o
    public void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        if (kotlin.text.c.o(Build.MANUFACTURER, "meizu", true) && Build.VERSION.SDK_INT < 28) {
            com.yandex.passport.internal.util.l.c(view);
        }
        super.onViewCreated(view, bundle);
        final int i = 0;
        this.g.k.n(getViewLifecycleOwner(), new com.yandex.passport.internal.ui.util.l(this) { // from class: com.yandex.passport.internal.ui.base.c
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.xjj
            public final void onChanged(Object obj) {
                switch (i) {
                    case 0:
                        this.b.z((com.yandex.passport.internal.ui.f) obj);
                        break;
                    default:
                        this.b.A(((Boolean) obj).booleanValue());
                        break;
                }
            }
        });
        com.yandex.passport.internal.ui.util.k kVar = this.g.l;
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        final int i2 = 1;
        com.yandex.passport.internal.ui.util.l lVar = new com.yandex.passport.internal.ui.util.l(this) { // from class: com.yandex.passport.internal.ui.base.c
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.xjj
            public final void onChanged(Object obj) {
                switch (i2) {
                    case 0:
                        this.b.z((com.yandex.passport.internal.ui.f) obj);
                        break;
                    default:
                        this.b.A(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        kVar.getClass();
        viewLifecycleOwner.getClass();
        kVar.f(viewLifecycleOwner, new com.yandex.passport.internal.ui.autologin.b(3, lVar));
    }

    @Override // androidx.fragment.app.o
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        this.g.H(bundle);
    }

    public abstract h x(PassportProcessGlobalComponent passportProcessGlobalComponent);

    public boolean y() {
        return false;
    }

    public abstract void z(com.yandex.passport.internal.ui.f fVar);
}
