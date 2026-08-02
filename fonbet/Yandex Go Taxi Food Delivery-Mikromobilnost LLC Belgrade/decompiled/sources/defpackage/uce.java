package defpackage;

import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.plus.pay.ui.core.mobile.view.toolbar.PlusPayToolbarView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment;
import com.yandex.plus.webview.api.WebViewContainer;

/* loaded from: classes2.dex */
public final class uce implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsFragment b;
    public final /* synthetic */ int c;

    public /* synthetic */ uce(ContactsFragment contactsFragment, int i, int i2) {
        this.a = i2;
        this.b = contactsFragment;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        ContactsFragment contactsFragment = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    View findViewById = contactsFragment.requireView().findViewById(i2);
                    if (findViewById != null) {
                        return (Button) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
                } catch (ClassCastException e) {
                    dy31.f(kgxVar, e);
                    return null;
                }
            case 1:
                kgx kgxVar2 = (kgx) obj;
                try {
                    View findViewById2 = contactsFragment.requireView().findViewById(i2);
                    if (findViewById2 != null) {
                        return (ConstraintLayout) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                } catch (ClassCastException e2) {
                    dy31.f(kgxVar2, e2);
                    return null;
                }
            case 2:
                kgx kgxVar3 = (kgx) obj;
                try {
                    View findViewById3 = contactsFragment.requireView().findViewById(i2);
                    if (findViewById3 != null) {
                        return (PlusPayToolbarView) findViewById3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.core.mobile.view.toolbar.PlusPayToolbarView");
                } catch (ClassCastException e3) {
                    dy31.f(kgxVar3, e3);
                    return null;
                }
            case 3:
                kgx kgxVar4 = (kgx) obj;
                try {
                    View findViewById4 = contactsFragment.requireView().findViewById(i2);
                    if (findViewById4 != null) {
                        return findViewById4;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                } catch (ClassCastException e4) {
                    dy31.f(kgxVar4, e4);
                    return null;
                }
            default:
                kgx kgxVar5 = (kgx) obj;
                try {
                    View findViewById5 = contactsFragment.requireView().findViewById(i2);
                    if (findViewById5 != null) {
                        return (WebViewContainer) findViewById5;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.webview.api.WebViewContainer");
                } catch (ClassCastException e5) {
                    dy31.f(kgxVar5, e5);
                    return null;
                }
        }
    }
}
